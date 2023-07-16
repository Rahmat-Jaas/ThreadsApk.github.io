package com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass;

import X.AnonymousClass0Sf;
import X.AnonymousClass0wJ;
import X.C04220Ms;
import X.C18180wK;
import X.C18190wL;
import X.C18200wM;

public class KtCSuperShape0S5010000_I2 extends AnonymousClass0Sf {
    public String A00;
    public String A01;
    public String A02;
    public String A03;
    public String A04;
    public boolean A05;
    public final int A06 = 0;

    public KtCSuperShape0S5010000_I2(String str, String str2, String str3, String str4, String str5, boolean z) {
        this.A01 = str;
        this.A02 = str2;
        this.A03 = str3;
        this.A04 = str4;
        this.A00 = str5;
        this.A05 = z;
    }

    public final boolean A00() {
        if (!C04220Ms.A0I(this.A03, this.A01) || !C04220Ms.A0I(this.A02, this.A00)) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (1 - this.A06 != 0) {
            return super.equals(obj);
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KtCSuperShape0S5010000_I2)) {
            return false;
        }
        KtCSuperShape0S5010000_I2 ktCSuperShape0S5010000_I2 = (KtCSuperShape0S5010000_I2) obj;
        if (ktCSuperShape0S5010000_I2.A06 != 1 || !C04220Ms.A0I(this.A04, ktCSuperShape0S5010000_I2.A04) || this.A05 != ktCSuperShape0S5010000_I2.A05 || !C04220Ms.A0I(this.A03, ktCSuperShape0S5010000_I2.A03) || !C04220Ms.A0I(this.A02, ktCSuperShape0S5010000_I2.A02) || !C04220Ms.A0I(this.A01, ktCSuperShape0S5010000_I2.A01) || !C04220Ms.A0I(this.A00, ktCSuperShape0S5010000_I2.A00)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        if (1 - this.A06 != 0) {
            return super.hashCode();
        }
        int A032 = C18180wK.A03(this.A04);
        boolean z = this.A05;
        if (z) {
            z = true;
        }
        return ((AnonymousClass0wJ.A07(this.A02, AnonymousClass0wJ.A07(this.A03, (A032 + (z ? 1 : 0)) * 31)) + AnonymousClass0wJ.A06(this.A01)) * 31) + C18200wM.A09(this.A00);
    }

    public final String toString() {
        if (1 - this.A06 != 0) {
            return super.toString();
        }
        StringBuilder A0s = C18190wL.A0s("QeConfig(universe=");
        A0s.append(this.A04);
        A0s.append(", isMutating=");
        A0s.append(this.A05);
        A0s.append(", expectedExperiment=");
        A0s.append(this.A03);
        A0s.append(", expectedCondition=");
        A0s.append(this.A02);
        A0s.append(", currentExperiment=");
        A0s.append(this.A01);
        A0s.append(", currentCondition=");
        A0s.append(this.A00);
        return AnonymousClass0wJ.A0u(A0s);
    }

    public KtCSuperShape0S5010000_I2(String str, String str2, String str3) {
        this((String) null, (String) null, str, str2, str3, false);
    }

    public KtCSuperShape0S5010000_I2(String str, String str2, String str3, String str4, String str5, int i, boolean z) {
        C04220Ms.A0B(str, 1);
        AnonymousClass0wJ.A1R(str2, str3);
        this.A04 = str;
        this.A05 = z;
        this.A03 = str2;
        this.A02 = str3;
        this.A01 = str4;
        this.A00 = str5;
    }
}
