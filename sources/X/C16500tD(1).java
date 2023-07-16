package X;

import android.os.SystemClock;

/* renamed from: X.0tD  reason: invalid class name and case insensitive filesystem */
public final class C16500tD {
    public static final C16500tD A02 = new C16500tD();
    public long A00 = -1;
    public C16510tE A01 = new C16510tE();

    public final synchronized void A00(int i, boolean z) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = this.A00;
        long j2 = elapsedRealtime - j;
        C16510tE r11 = this.A01;
        r11.A00++;
        long j3 = 14000;
        if (j < 0 || j2 > 14000) {
            r11.A03++;
        }
        if (z) {
            r11.A02 += i;
        } else {
            r11.A01 += i;
        }
        long j4 = r11.A04;
        if (j >= 0) {
            j3 = Math.min(14000, j2);
        }
        r11.A04 = j4 + j3;
        this.A00 = elapsedRealtime;
    }
}
