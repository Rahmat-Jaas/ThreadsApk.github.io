package com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass;

import X.AnonymousClass0Sf;
import X.AnonymousClass0wJ;
import X.C04220Ms;
import X.C18180wK;
import X.C18190wL;

public class KtCSuperShape0S4000100_I2 extends AnonymousClass0Sf {
    public long A00;
    public String A01;
    public String A02;
    public String A03;
    public String A04;
    public final int A05;

    public KtCSuperShape0S4000100_I2(String str, String str2, String str3, String str4, int i, long j) {
        this.A05 = i;
        AnonymousClass0wJ.A1O(str, str2);
        C04220Ms.A0B(str3, 3);
        this.A03 = str;
        this.A02 = str2;
        this.A04 = str3;
        this.A01 = str4;
        this.A00 = j;
    }

    public final boolean equals(Object obj) {
        int i;
        if (this.A05 != 0) {
            i = 1;
            if (this == obj) {
                return true;
            }
        } else if (this == obj) {
            return true;
        } else {
            i = 0;
        }
        if (!(obj instanceof KtCSuperShape0S4000100_I2)) {
            return false;
        }
        KtCSuperShape0S4000100_I2 ktCSuperShape0S4000100_I2 = (KtCSuperShape0S4000100_I2) obj;
        if (ktCSuperShape0S4000100_I2.A05 != i || !C04220Ms.A0I(this.A03, ktCSuperShape0S4000100_I2.A03) || !C04220Ms.A0I(this.A02, ktCSuperShape0S4000100_I2.A02) || !C04220Ms.A0I(this.A04, ktCSuperShape0S4000100_I2.A04) || !C04220Ms.A0I(this.A01, ktCSuperShape0S4000100_I2.A01) || this.A00 != ktCSuperShape0S4000100_I2.A00) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass0wJ.A07(this.A01, AnonymousClass0wJ.A07(this.A04, AnonymousClass0wJ.A07(this.A02, C18180wK.A03(this.A03)))) + C18190wL.A02(this.A00);
    }
}
