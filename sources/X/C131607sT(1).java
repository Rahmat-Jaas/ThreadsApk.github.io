package X;

/* renamed from: X.7sT  reason: invalid class name and case insensitive filesystem */
public final class C131607sT implements C10390iG, AnonymousClass0i4 {
    public final C126197ek A00 = new C126197ek();

    public static synchronized C131607sT A00(C10300i6 r2) {
        C131607sT r0;
        Class<C131607sT> cls = C131607sT.class;
        synchronized (cls) {
            r0 = (C131607sT) C86134wK.A0f(r2, cls, 8);
        }
        return r0;
    }

    public final void onAppBackgrounded() {
        int A03 = C14030oh.A03(1933656652);
        synchronized (this.A00) {
        }
        C14030oh.A0A(2051085073, A03);
    }

    public final void onAppForegrounded() {
        C14030oh.A0A(1452932522, C14030oh.A03(-1127691335));
    }

    public final void onSessionWillEnd() {
        C691847d.A03(this);
    }
}
