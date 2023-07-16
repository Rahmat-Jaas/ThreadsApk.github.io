package com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass;

import X.AnonymousClass0Sf;
import X.AnonymousClass0wJ;
import X.C04220Ms;
import X.C18190wL;
import X.C18200wM;
import X.C18210wN;

public class KtCSuperShape0S5100000_I2 extends AnonymousClass0Sf {
    public Object A00;
    public String A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public final int A06;

    public KtCSuperShape0S5100000_I2(Boolean bool, String str, String str2, String str3, String str4, String str5, int i) {
        this.A06 = i;
        if (i != 0) {
            C18190wL.A1S(str, 2, str4);
            C04220Ms.A0B(str5, 6);
        }
        this.A00 = bool;
        this.A01 = str;
        this.A02 = str2;
        this.A03 = str3;
        this.A04 = str4;
        this.A05 = str5;
    }

    public final boolean equals(Object obj) {
        int i;
        if (this.A06 != 0) {
            i = 1;
            if (this == obj) {
                return true;
            }
        } else if (this == obj) {
            return true;
        } else {
            i = 0;
        }
        if (!(obj instanceof KtCSuperShape0S5100000_I2)) {
            return false;
        }
        KtCSuperShape0S5100000_I2 ktCSuperShape0S5100000_I2 = (KtCSuperShape0S5100000_I2) obj;
        if (ktCSuperShape0S5100000_I2.A06 != i || !C04220Ms.A0I(this.A00, ktCSuperShape0S5100000_I2.A00) || !C04220Ms.A0I(this.A01, ktCSuperShape0S5100000_I2.A01) || !C04220Ms.A0I(this.A02, ktCSuperShape0S5100000_I2.A02) || !C04220Ms.A0I(this.A03, ktCSuperShape0S5100000_I2.A03) || !C04220Ms.A0I(this.A04, ktCSuperShape0S5100000_I2.A04) || !C04220Ms.A0I(this.A05, ktCSuperShape0S5100000_I2.A05)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = this.A06;
        int A032 = AnonymousClass0wJ.A03(this.A00);
        if (i == 0) {
            return (((((((((A032 * 31) + AnonymousClass0wJ.A06(this.A01)) * 31) + AnonymousClass0wJ.A06(this.A02)) * 31) + AnonymousClass0wJ.A06(this.A03)) * 31) + AnonymousClass0wJ.A06(this.A04)) * 31) + C18200wM.A09(this.A05);
        }
        int i2 = A032 * 31;
        return C18210wN.A05(this.A05, AnonymousClass0wJ.A07(this.A04, (((AnonymousClass0wJ.A07(this.A01, i2) + AnonymousClass0wJ.A06(this.A02)) * 31) + C18200wM.A09(this.A03)) * 31));
    }
}
