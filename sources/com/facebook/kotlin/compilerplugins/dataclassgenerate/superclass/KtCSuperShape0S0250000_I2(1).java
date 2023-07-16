package com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass;

import X.AnonymousClass0Sf;
import X.AnonymousClass0wJ;
import X.C04220Ms;
import X.C18200wM;
import X.C18210wN;
import java.util.List;

public class KtCSuperShape0S0250000_I2 extends AnonymousClass0Sf {
    public Object A00;
    public Object A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public final int A07;

    public KtCSuperShape0S0250000_I2(List list, List list2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.A07 = 0;
        this.A01 = list;
        this.A00 = list2;
        this.A03 = z;
        this.A06 = z2;
        this.A05 = z3;
        this.A04 = z4;
        this.A02 = z5;
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (this.A07 != 0) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof KtCSuperShape0S0250000_I2)) {
                return false;
            }
            KtCSuperShape0S0250000_I2 ktCSuperShape0S0250000_I2 = (KtCSuperShape0S0250000_I2) obj;
            if (ktCSuperShape0S0250000_I2.A07 != 1 || this.A02 != ktCSuperShape0S0250000_I2.A02 || this.A04 != ktCSuperShape0S0250000_I2.A04 || this.A03 != ktCSuperShape0S0250000_I2.A03 || this.A05 != ktCSuperShape0S0250000_I2.A05 || !C04220Ms.A0I(this.A00, ktCSuperShape0S0250000_I2.A00) || !C04220Ms.A0I(this.A01, ktCSuperShape0S0250000_I2.A01)) {
                return false;
            }
            z = this.A06;
            z2 = ktCSuperShape0S0250000_I2.A06;
        } else if (this == obj) {
            return true;
        } else {
            if (!(obj instanceof KtCSuperShape0S0250000_I2)) {
                return false;
            }
            KtCSuperShape0S0250000_I2 ktCSuperShape0S0250000_I22 = (KtCSuperShape0S0250000_I2) obj;
            if (ktCSuperShape0S0250000_I22.A07 != 0 || !C04220Ms.A0I(this.A01, ktCSuperShape0S0250000_I22.A01) || !C04220Ms.A0I(this.A00, ktCSuperShape0S0250000_I22.A00) || this.A03 != ktCSuperShape0S0250000_I22.A03 || this.A06 != ktCSuperShape0S0250000_I22.A06 || this.A05 != ktCSuperShape0S0250000_I22.A05 || this.A04 != ktCSuperShape0S0250000_I22.A04) {
                return false;
            }
            z = this.A02;
            z2 = ktCSuperShape0S0250000_I22.A02;
        }
        if (z != z2) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int i2;
        boolean z;
        if (this.A07 != 0) {
            boolean z2 = this.A02;
            i = 1;
            if (z2) {
                z2 = true;
            }
            int i3 = (z2 ? 1 : 0) * true;
            boolean z3 = this.A04;
            if (z3) {
                z3 = true;
            }
            int i4 = (i3 + (z3 ? 1 : 0)) * 31;
            boolean z4 = this.A03;
            if (z4) {
                z4 = true;
            }
            int i5 = (i4 + (z4 ? 1 : 0)) * 31;
            boolean z5 = this.A05;
            if (z5) {
                z5 = true;
            }
            i2 = (((((i5 + (z5 ? 1 : 0)) * 31) + AnonymousClass0wJ.A03(this.A00)) * 31) + C18200wM.A07(this.A01)) * 31;
            z = this.A06;
        } else {
            int A052 = AnonymousClass0wJ.A05(this.A00, C18210wN.A04(this.A01));
            boolean z6 = this.A03;
            i = 1;
            if (z6) {
                z6 = true;
            }
            int i6 = (A052 + (z6 ? 1 : 0)) * 31;
            boolean z7 = this.A06;
            if (z7) {
                z7 = true;
            }
            int i7 = (i6 + (z7 ? 1 : 0)) * 31;
            boolean z8 = this.A05;
            if (z8) {
                z8 = true;
            }
            int i8 = (i7 + (z8 ? 1 : 0)) * 31;
            boolean z9 = this.A04;
            if (z9) {
                z9 = true;
            }
            i2 = (i8 + (z9 ? 1 : 0)) * 31;
            z = this.A02;
        }
        if (!z) {
            i = 0;
        }
        return i2 + i;
    }

    public KtCSuperShape0S0250000_I2() {
        this.A07 = 1;
        this.A07 = 1;
        this.A02 = false;
        this.A04 = true;
        this.A03 = false;
        this.A05 = true;
        this.A00 = null;
        this.A01 = null;
        this.A06 = true;
    }
}
