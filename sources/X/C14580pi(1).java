package X;

import android.os.SystemClock;

/* renamed from: X.0pi  reason: invalid class name and case insensitive filesystem */
public final class C14580pi {
    public final /* synthetic */ C17630vH A00;

    public C14580pi(C17630vH r1) {
        this.A00 = r1;
    }

    public final void A00() {
        C17630vH r1 = this.A00;
        synchronized (r1) {
            r1.notifyAll();
        }
    }

    public final void A01(String str, String str2) {
        C17630vH r4 = this.A00;
        r4.A0T = SystemClock.elapsedRealtime();
        r4.A0A.A02(String.format("O %s%s", new Object[]{str, str2}));
        r4.A0R = r4.A0T;
        r4.A0B.A06(str, str2, r4.A0a, false);
        r4.A08.A00();
    }

    public final void A02(Throwable th) {
        C13080my r2 = this.A00.A0X;
        if (r2 != null) {
            r2.A01.A05.post(new C020209k(r2, th));
        }
    }
}
