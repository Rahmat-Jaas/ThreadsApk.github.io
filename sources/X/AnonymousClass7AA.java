package X;

import android.os.Handler;

/* renamed from: X.7AA  reason: invalid class name */
public final class AnonymousClass7AA {
    public AnonymousClass827 A00;
    public final Handler A01 = new Handler();
    public final C14340pE A02;

    private final void A00(AnonymousClass060 r3) {
        AnonymousClass827 r0 = this.A00;
        if (r0 != null) {
            r0.run();
        }
        AnonymousClass827 r1 = new AnonymousClass827(r3, this.A02);
        this.A00 = r1;
        this.A01.postAtFrontOfQueue(r1);
    }

    public final AnonymousClass062 A01() {
        return this.A02;
    }

    public final void A02() {
        A00(AnonymousClass060.ON_START);
    }

    public final void A03() {
        A00(AnonymousClass060.ON_CREATE);
    }

    public final void A04() {
        A00(AnonymousClass060.ON_STOP);
        A00(AnonymousClass060.ON_DESTROY);
    }

    public final void A05() {
        A00(AnonymousClass060.ON_START);
    }

    public AnonymousClass7AA(AnonymousClass066 r2) {
        this.A02 = new C14340pE(r2);
    }
}
