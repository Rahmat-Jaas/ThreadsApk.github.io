package X;

/* renamed from: X.5iL  reason: invalid class name */
public final class AnonymousClass5iL extends C128387jU {
    public final C92375iF A00;

    public static C92465iX A00(AnonymousClass5iR r2, C92375iF r3) {
        r2.A05 = new AnonymousClass5iL(r3);
        r2.A02 = 1;
        return new C92465iX(r2);
    }

    public static void A01(AnonymousClass5iR r1, C92375iF r2, int i) {
        r1.A05 = new AnonymousClass5iL(r2);
        r1.A02 = i;
    }

    public AnonymousClass5iL(C92375iF r1) {
        super(r1);
        this.A00 = r1;
    }

    public final boolean A05(C128387jU r6) {
        boolean A05 = super.A05(r6);
        if (!(r6 instanceof AnonymousClass5iL) || !A05) {
            return false;
        }
        C92375iF r4 = this.A00;
        C121777Ib r1 = r4.A04;
        C92375iF r3 = ((AnonymousClass5iL) r6).A00;
        if (!C04220Ms.A0I(r1, r3.A04) || !C04220Ms.A0I(r4.A02, r3.A02) || !C04220Ms.A0I(r4.A03, r3.A03) || !C04220Ms.A0I(r4.A01, r3.A01) || !C04220Ms.A0I(r4.A06, r3.A06) || !C04220Ms.A0I(r4.A00, r3.A00)) {
            return false;
        }
        return C86134wK.A1a(r4.A05, r3.A05, false);
    }
}
