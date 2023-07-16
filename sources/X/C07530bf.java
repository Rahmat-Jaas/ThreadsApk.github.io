package X;

/* renamed from: X.0bf  reason: invalid class name and case insensitive filesystem */
public final class C07530bf extends C10300i6 {
    public final AnonymousClass0BO A00;
    public final C07350bN A01;
    public volatile boolean A02;

    public C07530bf(AnonymousClass0BO r1, C07350bN r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public final void A05() {
        for (Object next : A02()) {
            if (next instanceof AnonymousClass0i4) {
                ((AnonymousClass0i4) next).onSessionWillEnd();
            }
        }
        this.A02 = true;
    }

    public final String getToken() {
        return "IgSessionManager.LOGGED_OUT_TOKEN";
    }

    public final boolean hasEnded() {
        return this.A02;
    }

    public final boolean isLoggedIn() {
        return false;
    }
}
