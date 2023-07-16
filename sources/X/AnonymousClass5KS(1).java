package X;

/* renamed from: X.5KS  reason: invalid class name */
public final class AnonymousClass5KS extends AnonymousClass0Sf implements C144058hl {
    public final String A00;
    public final String A01;
    public final String A02;

    public final AnonymousClass5KS Cxx() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass5KS) {
                AnonymousClass5KS r5 = (AnonymousClass5KS) obj;
                if (!C04220Ms.A0I(this.A00, r5.A00) || !C04220Ms.A0I(this.A01, r5.A01) || !C04220Ms.A0I(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C18210wN.A05(this.A02, AnonymousClass0wJ.A07(this.A01, AnonymousClass0wJ.A06(this.A00) * 31));
    }

    public AnonymousClass5KS(String str, String str2, String str3) {
        AnonymousClass0wJ.A1Q(str2, str3);
        this.A00 = str;
        this.A01 = str2;
        this.A02 = str3;
    }
}
