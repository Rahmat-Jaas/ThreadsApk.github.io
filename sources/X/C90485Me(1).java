package X;

/* renamed from: X.5Me  reason: invalid class name and case insensitive filesystem */
public final class C90485Me extends AnonymousClass0Sf implements C21700Byl {
    public final AnonymousClass5KX A00;
    public final String A01;
    public final String A02;

    public final C90485Me D3l(C112176p7 r1) {
        return this;
    }

    public final C90485Me D3m(C144028hi r1) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C90485Me) {
                C90485Me r5 = (C90485Me) obj;
                if (!C04220Ms.A0I(this.A01, r5.A01) || !C04220Ms.A0I(this.A02, r5.A02) || !C04220Ms.A0I(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String ARf() {
        return this.A02;
    }

    public final int hashCode() {
        return C18220wO.A06(this.A00, AnonymousClass0wJ.A07(this.A02, C18180wK.A03(this.A01)));
    }

    public C90485Me(AnonymousClass5KX r2, String str, String str2) {
        AnonymousClass0wJ.A1O(str, str2);
        C04220Ms.A0B(r2, 3);
        this.A01 = str;
        this.A02 = str2;
        this.A00 = r2;
    }
}
