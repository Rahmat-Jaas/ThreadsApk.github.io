package X;

/* renamed from: X.6uq  reason: invalid class name and case insensitive filesystem */
public final class C115306uq {
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final boolean A04;
    public final boolean A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C115306uq) {
                C115306uq r5 = (C115306uq) obj;
                if (!C04220Ms.A0I(this.A02, r5.A02) || !C04220Ms.A0I(this.A03, r5.A03) || !C04220Ms.A0I(this.A01, r5.A01) || this.A04 != r5.A04 || this.A05 != r5.A05 || !C04220Ms.A0I(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A06 = ((((AnonymousClass0wJ.A06(this.A02) * 31) + AnonymousClass0wJ.A06(this.A03)) * 31) + AnonymousClass0wJ.A06(this.A01)) * 31;
        boolean z = this.A04;
        int i = 1;
        if (z) {
            z = true;
        }
        int i2 = (A06 + (z ? 1 : 0)) * 31 * 31;
        if (!this.A05) {
            i = 0;
        }
        return ((i2 + i) * 31) + C18200wM.A09(this.A00);
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("PhoneNumber(id=");
        A0s.append(this.A02);
        A0s.append(", normalizedPhoneNumber=");
        A0s.append(this.A03);
        A0s.append(", formattedPhoneNumberWithPlus=");
        A0s.append(this.A01);
        A0s.append(", isDefault=");
        A0s.append(this.A04);
        C86134wK.A1U(A0s, ", isOneTime=");
        A0s.append(", isEditable=");
        A0s.append(this.A05);
        A0s.append(", externalSourceLabel=");
        A0s.append(this.A00);
        return AnonymousClass0wJ.A0u(A0s);
    }

    public /* synthetic */ C115306uq(String str, String str2, String str3, String str4, boolean z, boolean z2) {
        this.A02 = str;
        this.A03 = str2;
        this.A01 = str3;
        this.A04 = z;
        this.A05 = z2;
        this.A00 = str4;
    }
}
