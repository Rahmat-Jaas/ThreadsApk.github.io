package X;

import com.instagram.api.schemas.IGCreatorIncentiveProgram;

/* renamed from: X.173  reason: invalid class name */
public final class AnonymousClass173 extends AnonymousClass0Sf {
    public final IGCreatorIncentiveProgram A00;
    public final Integer A01;
    public final Integer A02;
    public final Integer A03;
    public final Integer A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final boolean A0E;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass173) {
                AnonymousClass173 r5 = (AnonymousClass173) obj;
                if (!C04220Ms.A0I(this.A05, r5.A05) || !C04220Ms.A0I(this.A01, r5.A01) || !C04220Ms.A0I(this.A02, r5.A02) || !C04220Ms.A0I(this.A03, r5.A03) || !C04220Ms.A0I(this.A06, r5.A06) || !C04220Ms.A0I(this.A07, r5.A07) || !C04220Ms.A0I(this.A08, r5.A08) || !C04220Ms.A0I(this.A09, r5.A09) || !C04220Ms.A0I(this.A0A, r5.A0A) || !C04220Ms.A0I(this.A0B, r5.A0B) || this.A00 != r5.A00 || this.A0E != r5.A0E || !C04220Ms.A0I(this.A04, r5.A04) || !C04220Ms.A0I(this.A0C, r5.A0C) || !C04220Ms.A0I(this.A0D, r5.A0D)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A072 = AnonymousClass0wJ.A07(this.A08, AnonymousClass0wJ.A07(this.A07, ((((((((AnonymousClass0wJ.A06(this.A05) * 31) + AnonymousClass0wJ.A03(this.A01)) * 31) + AnonymousClass0wJ.A03(this.A02)) * 31) + AnonymousClass0wJ.A03(this.A03)) * 31) + AnonymousClass0wJ.A06(this.A06)) * 31));
        int A052 = AnonymousClass0wJ.A05(this.A00, AnonymousClass0wJ.A07(this.A0B, (AnonymousClass0wJ.A07(this.A09, A072) + AnonymousClass0wJ.A06(this.A0A)) * 31));
        boolean z = this.A0E;
        if (z) {
            z = true;
        }
        return C18210wN.A05(this.A0D, (((((A052 + (z ? 1 : 0)) * 31) + AnonymousClass0wJ.A03(this.A04)) * 31) + C18200wM.A09(this.A0C)) * 31);
    }

    public AnonymousClass173(IGCreatorIncentiveProgram iGCreatorIncentiveProgram, Integer num, Integer num2, Integer num3, Integer num4, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, boolean z) {
        C18180wK.A1S(str3, str4, str5);
        C04220Ms.A0B(str7, 10);
        C04220Ms.A0B(iGCreatorIncentiveProgram, 11);
        C04220Ms.A0B(str9, 15);
        this.A05 = str;
        this.A01 = num;
        this.A02 = num2;
        this.A03 = num3;
        this.A06 = str2;
        this.A07 = str3;
        this.A08 = str4;
        this.A09 = str5;
        this.A0A = str6;
        this.A0B = str7;
        this.A00 = iGCreatorIncentiveProgram;
        this.A0E = z;
        this.A04 = num4;
        this.A0C = str8;
        this.A0D = str9;
    }
}
