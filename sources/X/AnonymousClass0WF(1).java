package X;

import java.util.concurrent.TimeUnit;

/* renamed from: X.0WF  reason: invalid class name */
public final class AnonymousClass0WF {
    public int A00;
    public int[] A01 = new int[5];
    public long[] A02 = new long[5];
    public AnonymousClass0WQ[] A03 = new AnonymousClass0WQ[5];
    public AnonymousClass0Jz[] A04 = new AnonymousClass0Jz[5];
    public String[] A05 = new String[5];

    public final void A00(AnonymousClass0WE r12) {
        for (int i = 0; i < this.A00; i++) {
            long millis = TimeUnit.NANOSECONDS.toMillis(this.A02[i]);
            long j = this.A02[i];
            int i2 = this.A01[i];
            AnonymousClass0WE r2 = r12;
            r2.DAa(this.A03[i], this.A04[i], this.A05[i], i2, millis, j);
        }
    }
}
