package X;

/* renamed from: X.5Kf  reason: invalid class name and case insensitive filesystem */
public final class C90045Kf extends AnonymousClass0Sf implements C144168hw {
    public final String A00;
    public final String A01;
    public final String A02;
    public final boolean A03;

    public C90045Kf(String str, String str2, String str3, boolean z) {
        C04220Ms.A0B(str2, 3);
        this.A00 = str;
        this.A03 = z;
        this.A01 = str2;
        this.A02 = str3;
    }

    public final C90045Kf CyK() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C90045Kf) {
                C90045Kf r5 = (C90045Kf) obj;
                if (!C04220Ms.A0I(this.A00, r5.A00) || this.A03 != r5.A03 || !C04220Ms.A0I(this.A01, r5.A01) || !C04220Ms.A0I(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass0wJ.A07(this.A01, ((AnonymousClass0wJ.A06(this.A00) * 31) + (C86164wN.A1S(this.A03) ? 1 : 0)) * 31) + C18200wM.A09(this.A02);
    }
}
