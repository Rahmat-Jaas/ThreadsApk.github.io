package com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass;

import X.AnonymousClass0Sf;
import X.AnonymousClass0wJ;
import X.C04220Ms;
import X.C170479v3;
import X.C18180wK;
import X.C18200wM;
import java.util.List;

public class KtCSuperShape0S6100000_I2 extends AnonymousClass0Sf {
    public Object A00;
    public String A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public final int A07 = 0;

    public KtCSuperShape0S6100000_I2(C170479v3 r2, String str, String str2, String str3, String str4, String str5, String str6) {
        AnonymousClass0wJ.A1O(str, str2);
        this.A03 = str;
        this.A02 = str2;
        this.A04 = str3;
        this.A01 = str4;
        this.A06 = str5;
        this.A05 = str6;
        this.A00 = r2;
    }

    public final boolean equals(Object obj) {
        if (this.A07 != 0) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof KtCSuperShape0S6100000_I2)) {
                return false;
            }
            KtCSuperShape0S6100000_I2 ktCSuperShape0S6100000_I2 = (KtCSuperShape0S6100000_I2) obj;
            if (ktCSuperShape0S6100000_I2.A07 != 1 || !C04220Ms.A0I(this.A01, ktCSuperShape0S6100000_I2.A01) || !C04220Ms.A0I(this.A02, ktCSuperShape0S6100000_I2.A02) || !C04220Ms.A0I(this.A00, ktCSuperShape0S6100000_I2.A00) || !C04220Ms.A0I(this.A03, ktCSuperShape0S6100000_I2.A03) || !C04220Ms.A0I(this.A04, ktCSuperShape0S6100000_I2.A04) || !C04220Ms.A0I(this.A05, ktCSuperShape0S6100000_I2.A05) || !C04220Ms.A0I(this.A06, ktCSuperShape0S6100000_I2.A06)) {
                return false;
            }
            return true;
        } else if (this == obj) {
            return true;
        } else {
            if (!(obj instanceof KtCSuperShape0S6100000_I2)) {
                return false;
            }
            KtCSuperShape0S6100000_I2 ktCSuperShape0S6100000_I22 = (KtCSuperShape0S6100000_I2) obj;
            if (ktCSuperShape0S6100000_I22.A07 != 0 || !C04220Ms.A0I(this.A03, ktCSuperShape0S6100000_I22.A03) || !C04220Ms.A0I(this.A02, ktCSuperShape0S6100000_I22.A02) || !C04220Ms.A0I(this.A04, ktCSuperShape0S6100000_I22.A04) || !C04220Ms.A0I(this.A01, ktCSuperShape0S6100000_I22.A01) || !C04220Ms.A0I(this.A06, ktCSuperShape0S6100000_I22.A06) || !C04220Ms.A0I(this.A05, ktCSuperShape0S6100000_I22.A05) || this.A00 != ktCSuperShape0S6100000_I22.A00) {
                return false;
            }
            return true;
        }
    }

    public final int hashCode() {
        int A072;
        int A073;
        if (this.A07 != 0) {
            A072 = (((((AnonymousClass0wJ.A05(this.A00, ((AnonymousClass0wJ.A06(this.A01) * 31) + AnonymousClass0wJ.A06(this.A02)) * 31) + AnonymousClass0wJ.A06(this.A03)) * 31) + AnonymousClass0wJ.A06(this.A04)) * 31) + AnonymousClass0wJ.A06(this.A05)) * 31;
            A073 = C18200wM.A09(this.A06);
        } else {
            A072 = (((((((AnonymousClass0wJ.A07(this.A02, C18180wK.A03(this.A03)) + AnonymousClass0wJ.A06(this.A04)) * 31) + AnonymousClass0wJ.A06(this.A01)) * 31) + AnonymousClass0wJ.A06(this.A06)) * 31) + AnonymousClass0wJ.A06(this.A05)) * 31;
            A073 = C18200wM.A07(this.A00);
        }
        return A072 + A073;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public KtCSuperShape0S6100000_I2(C170479v3 r3, String str, String str2, String str3, String str4, String str5, String str6, int i) {
        this((i & 64) != 0 ? null : r3, str, str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6);
    }

    public KtCSuperShape0S6100000_I2(String str, String str2, String str3, String str4, String str5, String str6, List list) {
        C04220Ms.A0B(list, 3);
        this.A01 = str;
        this.A02 = str2;
        this.A00 = list;
        this.A03 = str3;
        this.A04 = str4;
        this.A05 = str5;
        this.A06 = str6;
    }
}
