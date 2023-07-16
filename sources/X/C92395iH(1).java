package X;

/* renamed from: X.5iH  reason: invalid class name and case insensitive filesystem */
public final class C92395iH extends C128387jU {
    public final AnonymousClass5iC A00;

    public C92395iH(AnonymousClass5iC r1) {
        super(r1);
        this.A00 = r1;
    }

    public final boolean A05(C128387jU r6) {
        boolean A05 = super.A05(r6);
        if (!(r6 instanceof C92395iH) || !A05) {
            return false;
        }
        AnonymousClass5iC r3 = this.A00;
        C146998nD r1 = r3.A01;
        AnonymousClass5iC r2 = ((C92395iH) r6).A00;
        if (C04220Ms.A0I(r1, r2.A01)) {
            return C86134wK.A1a(r3.A00, r2.A00, false);
        }
        return false;
    }
}
