package X;

/* renamed from: X.5y2  reason: invalid class name */
public final class AnonymousClass5y2 extends C105796e0 {
    public final C25515Dn3 A00;
    public final String A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5y2(C25515Dn3 dn3, String str) {
        super(dn3);
        C04220Ms.A0B(dn3, 2);
        this.A01 = str;
        this.A00 = dn3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass5y2) {
                AnonymousClass5y2 r5 = (AnonymousClass5y2) obj;
                if (!C04220Ms.A0I(this.A01, r5.A01) || !C04220Ms.A0I(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C18220wO.A06(this.A00, AnonymousClass0wJ.A06(this.A01) * 31);
    }
}
