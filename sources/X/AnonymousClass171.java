package X;

import com.instagram.api.schemas.IGCreatorIncentiveProgram;

/* renamed from: X.171  reason: invalid class name */
public final class AnonymousClass171 extends AnonymousClass0Sf {
    public final int A00;
    public final int A01;
    public final int A02;
    public final IGCreatorIncentiveProgram A03;
    public final C208216g A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final boolean A0A;
    public final boolean A0B;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass171) {
                AnonymousClass171 r5 = (AnonymousClass171) obj;
                if (this.A00 != r5.A00 || this.A01 != r5.A01 || !C04220Ms.A0I(this.A05, r5.A05) || !C04220Ms.A0I(this.A06, r5.A06) || !C04220Ms.A0I(this.A07, r5.A07) || !C04220Ms.A0I(this.A08, r5.A08) || this.A03 != r5.A03 || !C04220Ms.A0I(this.A09, r5.A09) || this.A0A != r5.A0A || this.A0B != r5.A0B || !C04220Ms.A0I(this.A04, r5.A04) || this.A02 != r5.A02) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A072 = AnonymousClass0wJ.A07(this.A09, AnonymousClass0wJ.A05(this.A03, AnonymousClass0wJ.A07(this.A08, AnonymousClass0wJ.A07(this.A07, AnonymousClass0wJ.A07(this.A06, AnonymousClass0wJ.A07(this.A05, ((this.A00 * 31) + this.A01) * 31))))));
        boolean z = this.A0A;
        int i = 1;
        if (z) {
            z = true;
        }
        int i2 = (A072 + (z ? 1 : 0)) * 31;
        if (!this.A0B) {
            i = 0;
        }
        return ((((i2 + i) * 31) + AnonymousClass0wJ.A03(this.A04)) * 31) + this.A02;
    }

    public AnonymousClass171(IGCreatorIncentiveProgram iGCreatorIncentiveProgram, C208216g r3, String str, String str2, String str3, String str4, String str5, int i, int i2, int i3, boolean z, boolean z2) {
        AnonymousClass0wJ.A1R(str, str2);
        C04220Ms.A0B(str3, 5);
        C18180wK.A1S(str4, iGCreatorIncentiveProgram, str5);
        this.A00 = i;
        this.A01 = i2;
        this.A05 = str;
        this.A06 = str2;
        this.A07 = str3;
        this.A08 = str4;
        this.A03 = iGCreatorIncentiveProgram;
        this.A09 = str5;
        this.A0A = z;
        this.A0B = z2;
        this.A04 = r3;
        this.A02 = i3;
    }
}
