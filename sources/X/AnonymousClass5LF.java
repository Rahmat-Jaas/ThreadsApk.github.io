package X;

/* renamed from: X.5LF  reason: invalid class name */
public final class AnonymousClass5LF extends AnonymousClass0Sf implements C144418iL {
    public final Boolean A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public final AnonymousClass5LF D2h() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass5LF) {
                AnonymousClass5LF r5 = (AnonymousClass5LF) obj;
                if (!C04220Ms.A0I(this.A01, r5.A01) || !C04220Ms.A0I(this.A02, r5.A02) || !C04220Ms.A0I(this.A00, r5.A00) || !C04220Ms.A0I(this.A03, r5.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((AnonymousClass0wJ.A06(this.A01) * 31) + AnonymousClass0wJ.A06(this.A02)) * 31) + AnonymousClass0wJ.A03(this.A00)) * 31) + C18200wM.A09(this.A03);
    }

    public AnonymousClass5LF(Boolean bool, String str, String str2, String str3) {
        this.A01 = str;
        this.A02 = str2;
        this.A00 = bool;
        this.A03 = str3;
    }
}
