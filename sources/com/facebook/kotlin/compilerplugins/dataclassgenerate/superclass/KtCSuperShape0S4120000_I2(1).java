package com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass;

import X.AnonymousClass0Sf;
import X.AnonymousClass0wJ;
import X.C04220Ms;
import X.C18180wK;
import X.C18200wM;
import X.C18220wO;
import com.instagram.common.typedurl.ImageUrl;

public class KtCSuperShape0S4120000_I2 extends AnonymousClass0Sf {
    public Object A00;
    public String A01;
    public String A02;
    public String A03;
    public String A04;
    public boolean A05;
    public boolean A06;
    public final int A07 = 1;

    public KtCSuperShape0S4120000_I2(KtCSuperShape0S0400000_I2 ktCSuperShape0S0400000_I2, String str, String str2, String str3, String str4, boolean z, boolean z2) {
        AnonymousClass0wJ.A1Q(str2, str3);
        this.A04 = str;
        this.A03 = str2;
        this.A02 = str3;
        this.A05 = z;
        this.A01 = str4;
        this.A06 = z2;
        this.A00 = ktCSuperShape0S0400000_I2;
    }

    public final boolean equals(Object obj) {
        if (this.A07 != 0) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof KtCSuperShape0S4120000_I2)) {
                return false;
            }
            KtCSuperShape0S4120000_I2 ktCSuperShape0S4120000_I2 = (KtCSuperShape0S4120000_I2) obj;
            if (ktCSuperShape0S4120000_I2.A07 != 1 || !C04220Ms.A0I(this.A04, ktCSuperShape0S4120000_I2.A04) || !C04220Ms.A0I(this.A03, ktCSuperShape0S4120000_I2.A03) || !C04220Ms.A0I(this.A02, ktCSuperShape0S4120000_I2.A02) || this.A05 != ktCSuperShape0S4120000_I2.A05 || !C04220Ms.A0I(this.A01, ktCSuperShape0S4120000_I2.A01) || this.A06 != ktCSuperShape0S4120000_I2.A06 || !C04220Ms.A0I(this.A00, ktCSuperShape0S4120000_I2.A00)) {
                return false;
            }
            return true;
        } else if (this == obj) {
            return true;
        } else {
            if (!(obj instanceof KtCSuperShape0S4120000_I2)) {
                return false;
            }
            KtCSuperShape0S4120000_I2 ktCSuperShape0S4120000_I22 = (KtCSuperShape0S4120000_I2) obj;
            if (ktCSuperShape0S4120000_I22.A07 != 0 || !C04220Ms.A0I(this.A03, ktCSuperShape0S4120000_I22.A03) || !C04220Ms.A0I(this.A04, ktCSuperShape0S4120000_I22.A04) || !C04220Ms.A0I(this.A00, ktCSuperShape0S4120000_I22.A00) || this.A06 != ktCSuperShape0S4120000_I22.A06 || !C04220Ms.A0I(this.A01, ktCSuperShape0S4120000_I22.A01) || !C04220Ms.A0I(this.A02, ktCSuperShape0S4120000_I22.A02) || this.A05 != ktCSuperShape0S4120000_I22.A05) {
                return false;
            }
            return true;
        }
    }

    public final int hashCode() {
        if (this.A07 != 0) {
            int A072 = AnonymousClass0wJ.A07(this.A02, AnonymousClass0wJ.A07(this.A03, C18180wK.A03(this.A04)));
            boolean z = this.A05;
            int i = 1;
            if (z) {
                z = true;
            }
            int A073 = AnonymousClass0wJ.A07(this.A01, (A072 + (z ? 1 : 0)) * 31);
            if (!this.A06) {
                i = 0;
            }
            return C18220wO.A06(this.A00, (A073 + i) * 31);
        }
        int A074 = (AnonymousClass0wJ.A07(this.A04, C18180wK.A03(this.A03)) + AnonymousClass0wJ.A03(this.A00)) * 31;
        boolean z2 = this.A06;
        int i2 = 1;
        if (z2) {
            z2 = true;
        }
        int A062 = (((((A074 + (z2 ? 1 : 0)) * 31) + AnonymousClass0wJ.A06(this.A01)) * 31) + C18200wM.A09(this.A02)) * 31;
        if (!this.A05) {
            i2 = 0;
        }
        return A062 + i2;
    }

    public KtCSuperShape0S4120000_I2(ImageUrl imageUrl, String str, String str2, String str3, String str4, boolean z, boolean z2) {
        AnonymousClass0wJ.A1O(str, str2);
        this.A03 = str;
        this.A04 = str2;
        this.A00 = imageUrl;
        this.A06 = z;
        this.A01 = str3;
        this.A02 = str4;
        this.A05 = z2;
    }
}
