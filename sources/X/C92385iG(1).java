package X;

/* renamed from: X.5iG  reason: invalid class name and case insensitive filesystem */
public final class C92385iG extends C128387jU {
    public final AnonymousClass5iB A00;

    public C92385iG(AnonymousClass5iB r1) {
        super(r1);
        this.A00 = r1;
    }

    public final boolean A05(C128387jU r6) {
        boolean A05 = super.A05(r6);
        if (!(r6 instanceof C92385iG) || !A05) {
            return false;
        }
        AnonymousClass5iB r3 = this.A00;
        C121777Ib r1 = r3.A01;
        AnonymousClass5iB r2 = ((C92385iG) r6).A00;
        if (C04220Ms.A0I(r1, r2.A01)) {
            return C86134wK.A1a(r3.A00, r2.A00, false);
        }
        return false;
    }
}
