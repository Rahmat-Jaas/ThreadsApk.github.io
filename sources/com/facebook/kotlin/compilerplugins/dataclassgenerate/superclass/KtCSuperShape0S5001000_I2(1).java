package com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass;

import X.AnonymousClass0Sf;
import X.AnonymousClass0wJ;
import X.C04220Ms;
import X.C18180wK;
import X.C18190wL;

public class KtCSuperShape0S5001000_I2 extends AnonymousClass0Sf {
    public int A00;
    public String A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public final int A06 = 0;

    public KtCSuperShape0S5001000_I2(String str, String str2, String str3, String str4, String str5, int i) {
        AnonymousClass0wJ.A1Q(str2, str3);
        C04220Ms.A0B(str5, 5);
        this.A04 = str;
        this.A01 = str2;
        this.A03 = str3;
        this.A05 = str4;
        this.A02 = str5;
        this.A00 = i;
    }

    public final boolean equals(Object obj) {
        if (this.A06 != 0) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof KtCSuperShape0S5001000_I2)) {
                return false;
            }
            KtCSuperShape0S5001000_I2 ktCSuperShape0S5001000_I2 = (KtCSuperShape0S5001000_I2) obj;
            if (ktCSuperShape0S5001000_I2.A06 != 1 || !C04220Ms.A0I(this.A01, ktCSuperShape0S5001000_I2.A01) || this.A00 != ktCSuperShape0S5001000_I2.A00 || !C04220Ms.A0I(this.A02, ktCSuperShape0S5001000_I2.A02) || !C04220Ms.A0I(this.A03, ktCSuperShape0S5001000_I2.A03) || !C04220Ms.A0I(this.A04, ktCSuperShape0S5001000_I2.A04) || !C04220Ms.A0I(this.A05, ktCSuperShape0S5001000_I2.A05)) {
                return false;
            }
            return true;
        } else if (this == obj) {
            return true;
        } else {
            if (!(obj instanceof KtCSuperShape0S5001000_I2)) {
                return false;
            }
            KtCSuperShape0S5001000_I2 ktCSuperShape0S5001000_I22 = (KtCSuperShape0S5001000_I2) obj;
            if (ktCSuperShape0S5001000_I22.A06 != 0 || !C04220Ms.A0I(this.A04, ktCSuperShape0S5001000_I22.A04) || !C04220Ms.A0I(this.A01, ktCSuperShape0S5001000_I22.A01) || !C04220Ms.A0I(this.A03, ktCSuperShape0S5001000_I22.A03) || !C04220Ms.A0I(this.A05, ktCSuperShape0S5001000_I22.A05) || !C04220Ms.A0I(this.A02, ktCSuperShape0S5001000_I22.A02) || this.A00 != ktCSuperShape0S5001000_I22.A00) {
                return false;
            }
            return true;
        }
    }

    public final int hashCode() {
        int A07;
        int i;
        if (this.A06 != 0) {
            A07 = AnonymousClass0wJ.A07(this.A04, AnonymousClass0wJ.A07(this.A03, (((C18180wK.A03(this.A01) + this.A00) * 31) + AnonymousClass0wJ.A06(this.A02)) * 31));
            i = this.A05.hashCode();
        } else {
            A07 = AnonymousClass0wJ.A07(this.A02, AnonymousClass0wJ.A07(this.A05, AnonymousClass0wJ.A07(this.A03, AnonymousClass0wJ.A07(this.A01, C18180wK.A03(this.A04)))));
            i = this.A00;
        }
        return A07 + i;
    }

    public KtCSuperShape0S5001000_I2(String str, String str2, String str3, String str4, String str5, int i, int i2) {
        C04220Ms.A0B(str, 1);
        C18190wL.A1S(str3, 4, str4);
        C04220Ms.A0B(str5, 6);
        this.A01 = str;
        this.A00 = i;
        this.A02 = str2;
        this.A03 = str3;
        this.A04 = str4;
        this.A05 = str5;
    }
}
