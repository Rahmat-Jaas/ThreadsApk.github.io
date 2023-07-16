package X;

/* renamed from: X.6uv  reason: invalid class name and case insensitive filesystem */
public final class C115356uv {
    public final String A00;
    public final String A01;
    public final String A02;
    public final boolean A03;
    public final boolean A04;
    public final String A05;
    public final boolean A06;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C115356uv) {
                C115356uv r5 = (C115356uv) obj;
                if (!C04220Ms.A0I(this.A01, r5.A01) || !C04220Ms.A0I(this.A05, r5.A05) || !C04220Ms.A0I(this.A02, r5.A02) || this.A03 != r5.A03 || this.A06 != r5.A06 || this.A04 != r5.A04 || !C04220Ms.A0I(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A062 = ((((AnonymousClass0wJ.A06(this.A01) * 31) + AnonymousClass0wJ.A06(this.A05)) * 31) + AnonymousClass0wJ.A06(this.A02)) * 31;
        boolean z = this.A03;
        int i = 1;
        if (z) {
            z = true;
        }
        int i2 = (A062 + (z ? 1 : 0)) * 31;
        boolean z2 = this.A06;
        if (z2) {
            z2 = true;
        }
        int i3 = (i2 + (z2 ? 1 : 0)) * 31;
        if (!this.A04) {
            i = 0;
        }
        return ((i3 + i) * 31) + C18200wM.A09(this.A00);
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("Email(id=");
        A0s.append(this.A01);
        A0s.append(", userInputEmailAddress=");
        A0s.append(this.A05);
        A0s.append(", normalizedEmailAddress=");
        A0s.append(this.A02);
        A0s.append(", isDefault=");
        A0s.append(this.A03);
        A0s.append(", isOneTime=");
        A0s.append(this.A06);
        A0s.append(", isEditable=");
        A0s.append(this.A04);
        A0s.append(", externalSourceLabel=");
        A0s.append(this.A00);
        return AnonymousClass0wJ.A0u(A0s);
    }

    public C115356uv(String str, String str2, String str3, String str4, boolean z, boolean z2, boolean z3) {
        this.A01 = str;
        this.A05 = str2;
        this.A02 = str3;
        this.A03 = z;
        this.A06 = z2;
        this.A04 = z3;
        this.A00 = str4;
    }
}
