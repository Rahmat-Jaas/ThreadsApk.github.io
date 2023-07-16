package X;

/* renamed from: X.5iJ  reason: invalid class name and case insensitive filesystem */
public final class C92405iJ extends C128387jU {
    public final C92355iD A00;

    public C92405iJ(C92355iD r1) {
        super(r1);
        this.A00 = r1;
    }

    public final boolean A05(C128387jU r6) {
        boolean A05 = super.A05(r6);
        if (!(r6 instanceof C92405iJ) || !A05) {
            return false;
        }
        C92355iD r3 = this.A00;
        C146998nD r1 = r3.A00;
        C92355iD r2 = ((C92405iJ) r6).A00;
        if (C04220Ms.A0I(r1, r2.A00)) {
            return C86134wK.A1a(r3.A01, r2.A01, false);
        }
        return false;
    }
}
