package X;

import android.os.SystemClock;
import android.util.SparseArray;

/* renamed from: X.0BC  reason: invalid class name */
public final class AnonymousClass0BC extends AnonymousClass0DX {
    public final SparseArray A00 = new SparseArray();
    public final AnonymousClass0DP A01 = new AnonymousClass0DP();
    public final AnonymousClass0DP A02 = new AnonymousClass0DP();

    public final /* bridge */ /* synthetic */ AnonymousClass0DW A03() {
        return new AnonymousClass0BJ();
    }

    public final /* bridge */ /* synthetic */ boolean A04(AnonymousClass0DW r9) {
        long j;
        long j2;
        AnonymousClass0BJ r92 = (AnonymousClass0BJ) r9;
        synchronized (this) {
            AnonymousClass0DZ.A00(r92);
            AnonymousClass0DP r1 = this.A01;
            r92.A01 = r1.A00;
            AnonymousClass0DP r6 = this.A02;
            r92.A00 = r6.A00;
            long j3 = r1.A02;
            if (r1.A01 > 0) {
                j = SystemClock.uptimeMillis() - r1.A03;
            } else {
                j = 0;
            }
            r92.A03 = j3 + j;
            long j4 = r6.A02;
            if (r6.A01 > 0) {
                j2 = SystemClock.uptimeMillis() - r6.A03;
            } else {
                j2 = 0;
            }
            r92.A02 = j4 + j2;
        }
        return true;
    }
}
