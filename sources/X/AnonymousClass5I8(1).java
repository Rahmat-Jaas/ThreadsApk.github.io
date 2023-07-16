package X;

/* renamed from: X.5I8  reason: invalid class name */
public final class AnonymousClass5I8 extends AnonymousClass0Sf {
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final boolean A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass5I8) {
                AnonymousClass5I8 r5 = (AnonymousClass5I8) obj;
                if (!C04220Ms.A0I(this.A02, r5.A02) || !C04220Ms.A0I(this.A01, r5.A01) || !C04220Ms.A0I(this.A00, r5.A00) || !C04220Ms.A0I(this.A03, r5.A03) || this.A04 != r5.A04) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A07 = AnonymousClass0wJ.A07(this.A03, AnonymousClass0wJ.A07(this.A00, AnonymousClass0wJ.A07(this.A01, C18180wK.A03(this.A02))));
        boolean z = this.A04;
        if (z) {
            z = true;
        }
        return A07 + (z ? 1 : 0);
    }

    public AnonymousClass5I8(String str, String str2, String str3, String str4, boolean z) {
        AnonymousClass0wJ.A1O(str, str2);
        AnonymousClass0wJ.A1R(str3, str4);
        this.A02 = str;
        this.A01 = str2;
        this.A00 = str3;
        this.A03 = str4;
        this.A04 = z;
    }

    public AnonymousClass5I8() {
        this("", "", "", "", false);
    }
}
