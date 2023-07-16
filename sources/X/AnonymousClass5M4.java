package X;

/* renamed from: X.5M4  reason: invalid class name */
public final class AnonymousClass5M4 extends AnonymousClass0Sf implements C21206Bqa {
    public final AnonymousClass5M5 A00;
    public final String A01;

    public final AnonymousClass5M4 D3C() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass5M4) {
                AnonymousClass5M4 r5 = (AnonymousClass5M4) obj;
                if (!C04220Ms.A0I(this.A01, r5.A01) || !C04220Ms.A0I(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (AnonymousClass0wJ.A06(this.A01) * 31) + C18200wM.A07(this.A00);
    }

    public AnonymousClass5M4(AnonymousClass5M5 r1, String str) {
        this.A01 = str;
        this.A00 = r1;
    }
}
