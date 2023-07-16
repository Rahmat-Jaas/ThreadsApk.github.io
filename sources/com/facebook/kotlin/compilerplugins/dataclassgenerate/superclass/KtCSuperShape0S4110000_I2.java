package com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass;

import X.AnonymousClass0Sf;
import X.AnonymousClass0wJ;
import X.AnonymousClass24X;
import X.C04220Ms;
import X.C18180wK;
import X.C18190wL;
import X.C18200wM;
import X.C18210wN;
import X.C57943Dd;
import com.instagram.api.schemas.UserMonetizationProductType;

public class KtCSuperShape0S4110000_I2 extends AnonymousClass0Sf {
    public Object A00;
    public String A01;
    public String A02;
    public String A03;
    public String A04;
    public boolean A05;
    public final int A06;

    public KtCSuperShape0S4110000_I2(AnonymousClass24X r3, String str, String str2, String str3, String str4, boolean z) {
        this.A06 = 2;
        C04220Ms.A0B(str, 1);
        C04220Ms.A0B(r3, 2);
        C18190wL.A1S(str2, 4, str3);
        this.A01 = str;
        this.A00 = r3;
        this.A05 = z;
        this.A02 = str2;
        this.A03 = str3;
        this.A04 = str4;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        switch (this.A06) {
            case 0:
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof KtCSuperShape0S4110000_I2)) {
                    return false;
                }
                KtCSuperShape0S4110000_I2 ktCSuperShape0S4110000_I2 = (KtCSuperShape0S4110000_I2) obj;
                if (ktCSuperShape0S4110000_I2.A06 != 0 || !C04220Ms.A0I(this.A03, ktCSuperShape0S4110000_I2.A03) || !C04220Ms.A0I(this.A02, ktCSuperShape0S4110000_I2.A02) || !C04220Ms.A0I(this.A04, ktCSuperShape0S4110000_I2.A04) || !C04220Ms.A0I(this.A01, ktCSuperShape0S4110000_I2.A01) || !C04220Ms.A0I(this.A00, ktCSuperShape0S4110000_I2.A00) || this.A05 != ktCSuperShape0S4110000_I2.A05) {
                    return false;
                }
                return true;
            case 1:
                if (this == obj) {
                    return true;
                }
                if (obj instanceof KtCSuperShape0S4110000_I2) {
                    KtCSuperShape0S4110000_I2 ktCSuperShape0S4110000_I22 = (KtCSuperShape0S4110000_I2) obj;
                    if (ktCSuperShape0S4110000_I22.A06 == 1 && this.A00 == ktCSuperShape0S4110000_I22.A00 && C04220Ms.A0I(this.A02, ktCSuperShape0S4110000_I22.A02) && C04220Ms.A0I(this.A01, ktCSuperShape0S4110000_I22.A01) && C04220Ms.A0I(this.A04, ktCSuperShape0S4110000_I22.A04) && this.A05 == ktCSuperShape0S4110000_I22.A05) {
                        str = this.A03;
                        str2 = ktCSuperShape0S4110000_I22.A03;
                        break;
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
            default:
                if (this == obj) {
                    return true;
                }
                if (obj instanceof KtCSuperShape0S4110000_I2) {
                    KtCSuperShape0S4110000_I2 ktCSuperShape0S4110000_I23 = (KtCSuperShape0S4110000_I2) obj;
                    if (ktCSuperShape0S4110000_I23.A06 == 2 && C04220Ms.A0I(this.A01, ktCSuperShape0S4110000_I23.A01) && this.A00 == ktCSuperShape0S4110000_I23.A00 && this.A05 == ktCSuperShape0S4110000_I23.A05 && C04220Ms.A0I(this.A02, ktCSuperShape0S4110000_I23.A02) && C04220Ms.A0I(this.A03, ktCSuperShape0S4110000_I23.A03)) {
                        str = this.A04;
                        str2 = ktCSuperShape0S4110000_I23.A04;
                        break;
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
                break;
        }
        if (!C04220Ms.A0I(str, str2)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A052;
        int i;
        switch (this.A06) {
            case 0:
                A052 = AnonymousClass0wJ.A05(this.A00, AnonymousClass0wJ.A07(this.A01, AnonymousClass0wJ.A07(this.A04, AnonymousClass0wJ.A07(this.A02, C18180wK.A03(this.A03)))));
                i = this.A05;
                if (i != 0) {
                    i = 1;
                    break;
                }
                break;
            case 1:
                int A07 = (((AnonymousClass0wJ.A07(this.A02, C18210wN.A04(this.A00)) + AnonymousClass0wJ.A06(this.A01)) * 31) + AnonymousClass0wJ.A06(this.A04)) * 31;
                boolean z = this.A05;
                if (z) {
                    z = true;
                }
                i = (A07 + (z ? 1 : 0)) * 31;
                A052 = C18200wM.A09(this.A03);
                break;
            default:
                int A053 = AnonymousClass0wJ.A05(this.A00, C18180wK.A03(this.A01));
                boolean z2 = this.A05;
                if (z2) {
                    z2 = true;
                }
                A052 = AnonymousClass0wJ.A07(this.A03, AnonymousClass0wJ.A07(this.A02, (A053 + (z2 ? 1 : 0)) * 31));
                i = AnonymousClass0wJ.A06(this.A04);
                break;
        }
        return A052 + i;
    }

    public KtCSuperShape0S4110000_I2(C57943Dd r2, String str, String str2, String str3, String str4, boolean z) {
        this.A06 = 0;
        C04220Ms.A0B(r2, 5);
        this.A03 = str;
        this.A02 = str2;
        this.A04 = str3;
        this.A01 = str4;
        this.A00 = r2;
        this.A05 = z;
    }

    public KtCSuperShape0S4110000_I2(UserMonetizationProductType userMonetizationProductType, String str, String str2, String str3) {
        this.A06 = 1;
        this.A06 = 1;
        this.A00 = userMonetizationProductType;
        this.A02 = str;
        this.A01 = str2;
        this.A04 = str3;
        this.A05 = false;
        this.A03 = null;
    }
}
