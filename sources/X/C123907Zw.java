package X;

import android.os.Handler;

/* renamed from: X.7Zw  reason: invalid class name and case insensitive filesystem */
public final class C123907Zw implements AnonymousClass066 {
    public static final C123907Zw A08 = new C123907Zw();
    public int A00;
    public int A01;
    public Handler A02;
    public boolean A03 = true;
    public boolean A04 = true;
    public final C14340pE A05 = new C14340pE(this);
    public final AnonymousClass8dN A06 = new C124057aR(this);
    public final Runnable A07 = new C135117yu(this);

    public static final AnonymousClass066 A00() {
        return A08;
    }

    public final void A01() {
        int i = this.A00 + 1;
        this.A00 = i;
        if (i != 1) {
            return;
        }
        if (this.A03) {
            this.A05.A09(AnonymousClass060.ON_RESUME);
            this.A03 = false;
            return;
        }
        Handler handler = this.A02;
        C04220Ms.A0A(handler);
        handler.removeCallbacks(this.A07);
    }

    public final AnonymousClass062 getLifecycle() {
        return this.A05;
    }
}
