package com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass;

import X.AnonymousClass0Sf;
import X.AnonymousClass0wJ;
import X.C04220Ms;
import X.C18190wL;
import X.C18200wM;
import java.util.List;

public class KtCSuperShape0S2300100_I2 extends AnonymousClass0Sf {
    public long A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public String A04;
    public String A05;

    public KtCSuperShape0S2300100_I2(KtCSuperShape0S0400000_I2 ktCSuperShape0S0400000_I2, String str, String str2, List list, List list2, long j) {
        C04220Ms.A0B(list, 4);
        this.A01 = ktCSuperShape0S0400000_I2;
        this.A04 = str;
        this.A00 = j;
        this.A02 = list;
        this.A03 = list2;
        this.A05 = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KtCSuperShape0S2300100_I2)) {
            return false;
        }
        KtCSuperShape0S2300100_I2 ktCSuperShape0S2300100_I2 = (KtCSuperShape0S2300100_I2) obj;
        if (!C04220Ms.A0I(this.A01, ktCSuperShape0S2300100_I2.A01) || !C04220Ms.A0I(this.A04, ktCSuperShape0S2300100_I2.A04) || this.A00 != ktCSuperShape0S2300100_I2.A00 || !C04220Ms.A0I(this.A02, ktCSuperShape0S2300100_I2.A02) || !C04220Ms.A0I(this.A03, ktCSuperShape0S2300100_I2.A03) || !C04220Ms.A0I(this.A05, ktCSuperShape0S2300100_I2.A05)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((AnonymousClass0wJ.A05(this.A02, ((((AnonymousClass0wJ.A03(this.A01) * 31) + AnonymousClass0wJ.A06(this.A04)) * 31) + C18190wL.A02(this.A00)) * 31) + AnonymousClass0wJ.A03(this.A03)) * 31) + C18200wM.A09(this.A05);
    }
}
