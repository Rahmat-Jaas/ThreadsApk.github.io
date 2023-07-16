package X;

import java.nio.ByteBuffer;
import java.security.NoSuchAlgorithmException;

/* renamed from: X.0Ty  reason: invalid class name and case insensitive filesystem */
public final class C05490Ty {
    public long A00 = 0;
    public long A01 = 0;
    public long A02 = 0;
    public long A03 = 0;
    public AnonymousClass0AN A04;
    public final C02330As A05;

    public C05490Ty() {
        AnonymousClass0VZ r2 = new AnonymousClass0VZ();
        this.A05 = r2;
        try {
            this.A04 = new AnonymousClass0UR();
        } catch (NoSuchAlgorithmException unused) {
            this.A04 = new C05640Uo();
        }
    }

    public final void A00(long j, long j2) {
        long j3 = j;
        long j4 = this.A00 + ((3 + j) & -4);
        this.A00 = j4;
        long j5 = j2;
        long j6 = this.A03 + j2;
        this.A03 = j6;
        long j7 = this.A01;
        long j8 = j3;
        int i = 0;
        do {
            i++;
            j8 >>= 7;
        } while (j8 != 0);
        long j9 = j5;
        int i2 = 0;
        do {
            i2++;
            j9 >>= 7;
        } while (j9 != 0);
        long j10 = j7 + ((long) (i + i2));
        this.A01 = j10;
        long j11 = this.A02 + 1;
        this.A02 = j11;
        if (j4 >= 0 && j6 >= 0) {
            int i3 = 0;
            do {
                i3++;
                j11 >>= 7;
            } while (j11 != 0);
            long j12 = (((long) (i3 + 1)) + j10 + 4 + 3) & -4;
            if (j12 <= 17179869184L && j4 + 12 + j12 + 12 >= 0) {
                ByteBuffer allocate = ByteBuffer.allocate(16);
                allocate.putLong(j3);
                allocate.putLong(j5);
                AnonymousClass0AN r3 = this.A04;
                byte[] array = allocate.array();
                r3.A00(array, 0, array.length);
                return;
            }
        }
        throw this.A05;
    }
}
