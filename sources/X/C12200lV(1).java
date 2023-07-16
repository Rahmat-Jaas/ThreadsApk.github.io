package X;

import java.io.ObjectOutputStream;

/* renamed from: X.0lV  reason: invalid class name and case insensitive filesystem */
public final class C12200lV extends C17960vq {
    public final long A00;
    public final AnonymousClass0K1 A01;
    public final AnonymousClass0K1 A02;

    public static void A00(AnonymousClass0K1 r5, ObjectOutputStream objectOutputStream) {
        if (r5 == null) {
            objectOutputStream.writeInt(0);
            return;
        }
        int size = r5.size();
        objectOutputStream.writeInt(size);
        for (int i = 0; i < size; i++) {
            int keyAt = r5.keyAt(i);
            long valueAt = r5.valueAt(i);
            objectOutputStream.writeInt(keyAt);
            objectOutputStream.writeLong(valueAt);
        }
    }

    public final void A03(ObjectOutputStream objectOutputStream) {
        objectOutputStream.writeByte(2);
        objectOutputStream.writeLong(this.A00);
        A00(this.A02, objectOutputStream);
        A00(this.A01, objectOutputStream);
    }

    public final int A01() {
        AnonymousClass0K1 r0 = this.A02;
        int i = 0;
        if (r0 != null) {
            i = 0 + r0.size();
        }
        AnonymousClass0K1 r02 = this.A01;
        if (r02 != null) {
            return i + r02.size();
        }
        return i;
    }

    public final long A02(int i) {
        int indexOfKey;
        AnonymousClass0K1 r1 = this.A01;
        if ((r1 == null || (indexOfKey = r1.indexOfKey(i)) < 0) && ((r1 = this.A02) == null || (indexOfKey = r1.indexOfKey((short) (i >> 16))) < 0)) {
            return this.A00;
        }
        return r1.valueAt(indexOfKey);
    }

    public C12200lV(AnonymousClass0K1 r1, AnonymousClass0K1 r2, long j) {
        this.A00 = j;
        this.A02 = r1;
        this.A01 = r2;
    }
}
