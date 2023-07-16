package com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass;

import X.AnonymousClass0Sf;
import X.AnonymousClass0wJ;
import X.C04220Ms;
import X.C18180wK;
import X.C18190wL;
import X.C18200wM;

public class KtCSuperShape0S3100100_I2 extends AnonymousClass0Sf {
    public long A00;
    public Object A01;
    public String A02;
    public String A03;
    public String A04;
    public final int A05;

    public KtCSuperShape0S3100100_I2() {
        this.A05 = 1;
        this.A05 = 1;
        this.A05 = 1;
        this.A02 = "";
        this.A00 = 0;
        this.A04 = null;
        this.A03 = null;
        this.A01 = null;
    }

    public final boolean equals(Object obj) {
        Object obj2;
        Object obj3;
        if (this.A05 != 0) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof KtCSuperShape0S3100100_I2)) {
                return false;
            }
            KtCSuperShape0S3100100_I2 ktCSuperShape0S3100100_I2 = (KtCSuperShape0S3100100_I2) obj;
            if (ktCSuperShape0S3100100_I2.A05 != 1 || !C04220Ms.A0I(this.A02, ktCSuperShape0S3100100_I2.A02) || this.A00 != ktCSuperShape0S3100100_I2.A00 || !C04220Ms.A0I(this.A04, ktCSuperShape0S3100100_I2.A04) || !C04220Ms.A0I(this.A03, ktCSuperShape0S3100100_I2.A03)) {
                return false;
            }
            obj2 = this.A01;
            obj3 = ktCSuperShape0S3100100_I2.A01;
        } else if (this == obj) {
            return true;
        } else {
            if (!(obj instanceof KtCSuperShape0S3100100_I2)) {
                return false;
            }
            KtCSuperShape0S3100100_I2 ktCSuperShape0S3100100_I22 = (KtCSuperShape0S3100100_I2) obj;
            if (ktCSuperShape0S3100100_I22.A05 != 0 || !C04220Ms.A0I(this.A02, ktCSuperShape0S3100100_I22.A02) || !C04220Ms.A0I(this.A01, ktCSuperShape0S3100100_I22.A01) || this.A00 != ktCSuperShape0S3100100_I22.A00 || !C04220Ms.A0I(this.A03, ktCSuperShape0S3100100_I22.A03)) {
                return false;
            }
            obj2 = this.A04;
            obj3 = ktCSuperShape0S3100100_I22.A04;
        }
        if (!C04220Ms.A0I(obj2, obj3)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A06;
        int A09;
        if (this.A05 != 0) {
            A06 = (((((C18180wK.A03(this.A02) + C18190wL.A02(this.A00)) * 31) + AnonymousClass0wJ.A06(this.A04)) * 31) + AnonymousClass0wJ.A06(this.A03)) * 31;
            A09 = C18200wM.A07(this.A01);
        } else {
            A06 = ((((((AnonymousClass0wJ.A06(this.A02) * 31) + AnonymousClass0wJ.A03(this.A01)) * 31) + C18190wL.A02(this.A00)) * 31) + AnonymousClass0wJ.A06(this.A03)) * 31;
            A09 = C18200wM.A09(this.A04);
        }
        return A06 + A09;
    }

    public KtCSuperShape0S3100100_I2(Integer num, String str, String str2, String str3, long j) {
        this.A05 = 0;
        this.A02 = str;
        this.A01 = num;
        this.A00 = j;
        this.A03 = str2;
        this.A04 = str3;
    }
}
