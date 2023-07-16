package X;

/* renamed from: X.5Ms  reason: invalid class name and case insensitive filesystem */
public final class C90615Ms extends AnonymousClass0Sf implements C21757Bzi {
    public final String A00;
    public final String A01;
    public final String A02;

    public final C90615Ms D5U() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C90615Ms) {
                C90615Ms r5 = (C90615Ms) obj;
                if (!C04220Ms.A0I(this.A00, r5.A00) || !C04220Ms.A0I(this.A01, r5.A01) || !C04220Ms.A0I(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String BFt() {
        return this.A00;
    }

    public final String BH2() {
        return this.A01;
    }

    public final String getUrl() {
        return this.A02;
    }

    public final int hashCode() {
        return (((AnonymousClass0wJ.A06(this.A00) * 31) + AnonymousClass0wJ.A06(this.A01)) * 31) + C18200wM.A09(this.A02);
    }

    public C90615Ms(String str, String str2, String str3) {
        this.A00 = str;
        this.A01 = str2;
        this.A02 = str3;
    }
}
