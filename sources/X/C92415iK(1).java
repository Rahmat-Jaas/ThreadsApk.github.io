package X;

/* renamed from: X.5iK  reason: invalid class name and case insensitive filesystem */
public final class C92415iK extends C128387jU {
    public final C92365iE A00;

    public C92415iK(C92365iE r1) {
        super(r1);
        this.A00 = r1;
    }

    public final boolean A05(C128387jU r6) {
        boolean A05 = super.A05(r6);
        if (!(r6 instanceof C92415iK) || !A05) {
            return false;
        }
        C92365iE r3 = this.A00;
        C146998nD r1 = r3.A00;
        C92365iE r2 = ((C92415iK) r6).A00;
        if (!C04220Ms.A0I(r1, r2.A00) || r3.A02 != r2.A02) {
            return false;
        }
        return true;
    }
}
