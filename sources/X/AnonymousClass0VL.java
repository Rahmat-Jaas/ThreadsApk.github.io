package X;

import android.os.SystemClock;

/* renamed from: X.0VL  reason: invalid class name */
public final class AnonymousClass0VL implements C04050Mb {
    public long A00;
    public Integer A01;

    public AnonymousClass0VL(long j, Integer num) {
        this.A01 = num;
        this.A00 = j;
    }

    public final Integer Awy() {
        return AnonymousClass006.A0d;
    }

    public final void CWp(C04170Mn r7, AnonymousClass0ND r8) {
        AnonymousClass0OO r1;
        long currentTimeMillis = System.currentTimeMillis();
        long uptimeMillis = SystemClock.uptimeMillis() - this.A00;
        Integer num = this.A01;
        if (num == AnonymousClass006.A00) {
            r7.A02(AnonymousClass0MU.A2l, Long.valueOf(currentTimeMillis));
            r1 = AnonymousClass0MU.A2n;
        } else if (num == AnonymousClass006.A01) {
            r7.A02(AnonymousClass0MU.A1t, Long.valueOf(currentTimeMillis));
            r1 = AnonymousClass0MU.A1u;
        } else {
            return;
        }
        r7.A02(r1, Long.valueOf(uptimeMillis));
    }

    public final /* synthetic */ boolean BNv(Integer num) {
        return false;
    }
}
