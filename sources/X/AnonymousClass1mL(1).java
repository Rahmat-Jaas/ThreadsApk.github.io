package X;

/* renamed from: X.1mL  reason: invalid class name */
public final class AnonymousClass1mL extends AnonymousClass0gG {
    public final /* synthetic */ C696949q A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass1mL(C696949q r4) {
        super(174, 5, false, false);
        this.A00 = r4;
    }

    public final void run() {
        for (D2R d2r : D2R.values()) {
            if (d2r.A01) {
                C696949q r1 = this.A00;
                if (d2r.A01) {
                    C18190wL.A11(r1.A01(d2r));
                    C10600ic.A00.deleteSharedPreferences(AnonymousClass00U.A0N(r1.A00.getUserId(), d2r.A00, '_'));
                } else {
                    throw C18180wK.A0a("Check failed.");
                }
            }
        }
    }
}
