package com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass;

import X.AnonymousClass0Sf;
import X.AnonymousClass0wJ;
import X.C18190wL;

public class KtCSuperShape0S0060000_I2 extends AnonymousClass0Sf {
    public boolean A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public final int A06;

    public KtCSuperShape0S0060000_I2(int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.A06 = i;
        if (i != 0) {
            this.A02 = z;
            this.A01 = z2;
            this.A05 = z3;
            this.A00 = z4;
            this.A03 = z5;
            this.A04 = z6;
            return;
        }
        this.A01 = z;
        this.A00 = z2;
        this.A03 = z3;
        this.A04 = z4;
        this.A05 = z5;
        this.A02 = z6;
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (this.A06 != 0) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof KtCSuperShape0S0060000_I2)) {
                return false;
            }
            KtCSuperShape0S0060000_I2 ktCSuperShape0S0060000_I2 = (KtCSuperShape0S0060000_I2) obj;
            if (ktCSuperShape0S0060000_I2.A06 != 1 || this.A02 != ktCSuperShape0S0060000_I2.A02 || this.A01 != ktCSuperShape0S0060000_I2.A01 || this.A05 != ktCSuperShape0S0060000_I2.A05 || this.A00 != ktCSuperShape0S0060000_I2.A00 || this.A03 != ktCSuperShape0S0060000_I2.A03) {
                return false;
            }
            z = this.A04;
            z2 = ktCSuperShape0S0060000_I2.A04;
        } else if (this == obj) {
            return true;
        } else {
            if (!(obj instanceof KtCSuperShape0S0060000_I2)) {
                return false;
            }
            KtCSuperShape0S0060000_I2 ktCSuperShape0S0060000_I22 = (KtCSuperShape0S0060000_I2) obj;
            if (ktCSuperShape0S0060000_I22.A06 != 0 || this.A01 != ktCSuperShape0S0060000_I22.A01 || this.A00 != ktCSuperShape0S0060000_I22.A00 || this.A03 != ktCSuperShape0S0060000_I22.A03 || this.A04 != ktCSuperShape0S0060000_I22.A04 || this.A05 != ktCSuperShape0S0060000_I22.A05) {
                return false;
            }
            z = this.A02;
            z2 = ktCSuperShape0S0060000_I22.A02;
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
        if (this.A06 != 0) {
            boolean z2 = this.A02;
            i = 1;
            if (z2) {
                z2 = true;
            }
            int i3 = (z2 ? 1 : 0) * true;
            boolean z3 = this.A01;
            if (z3) {
                z3 = true;
            }
            int i4 = (i3 + (z3 ? 1 : 0)) * 31;
            boolean z4 = this.A05;
            if (z4) {
                z4 = true;
            }
            int i5 = (i4 + (z4 ? 1 : 0)) * 31;
            boolean z5 = this.A00;
            if (z5) {
                z5 = true;
            }
            int i6 = (i5 + (z5 ? 1 : 0)) * 31;
            boolean z6 = this.A03;
            if (z6) {
                z6 = true;
            }
            i2 = (i6 + (z6 ? 1 : 0)) * 31;
            z = this.A04;
        } else {
            boolean z7 = this.A01;
            i = 1;
            if (z7) {
                z7 = true;
            }
            int i7 = (z7 ? 1 : 0) * true;
            boolean z8 = this.A00;
            if (z8) {
                z8 = true;
            }
            int i8 = (i7 + (z8 ? 1 : 0)) * 31;
            boolean z9 = this.A03;
            if (z9) {
                z9 = true;
            }
            int i9 = (i8 + (z9 ? 1 : 0)) * 31;
            boolean z10 = this.A04;
            if (z10) {
                z10 = true;
            }
            int i10 = (i9 + (z10 ? 1 : 0)) * 31;
            boolean z11 = this.A05;
            if (z11) {
                z11 = true;
            }
            i2 = (i10 + (z11 ? 1 : 0)) * 31;
            z = this.A02;
        }
        if (!z) {
            i = 0;
        }
        return i2 + i;
    }

    public final String toString() {
        if (1 - this.A06 != 0) {
            return super.toString();
        }
        StringBuilder A0s = C18190wL.A0s("CLNoticeEligibilityCacheStateKey(isUserPublic=");
        A0s.append(this.A02);
        A0s.append(", hasLinkedFb=");
        A0s.append(this.A01);
        A0s.append(", storyAutoXpostEnabled=");
        A0s.append(this.A05);
        A0s.append(", feedAutoXpostEnabled=");
        A0s.append(this.A00);
        A0s.append(", reelsCcpAutoXpostEnabled=");
        A0s.append(this.A03);
        A0s.append(", reelsXarAutoXpostEnabled=");
        A0s.append(this.A04);
        return AnonymousClass0wJ.A0u(A0s);
    }
}
