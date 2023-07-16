package com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass;

import X.AnonymousClass0Sf;
import X.AnonymousClass0wJ;
import X.C04220Ms;
import X.C18180wK;

public class KtCSuperShape0S2050000_I2 extends AnonymousClass0Sf {
    public String A00;
    public String A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public final int A07;

    public KtCSuperShape0S2050000_I2(String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.A07 = 0;
        C04220Ms.A0B(str, 1);
        this.A01 = str;
        this.A06 = z;
        this.A05 = z2;
        this.A00 = str2;
        this.A04 = z3;
        this.A03 = z4;
        this.A02 = z5;
    }

    public final boolean equals(Object obj) {
        KtCSuperShape0S2050000_I2 ktCSuperShape0S2050000_I2;
        boolean z;
        boolean z2;
        if (this.A07 != 0) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof KtCSuperShape0S2050000_I2)) {
                return false;
            }
            ktCSuperShape0S2050000_I2 = (KtCSuperShape0S2050000_I2) obj;
            if (ktCSuperShape0S2050000_I2.A07 != 1 || !C04220Ms.A0I(this.A00, ktCSuperShape0S2050000_I2.A00) || this.A05 != ktCSuperShape0S2050000_I2.A05 || !C04220Ms.A0I(this.A01, ktCSuperShape0S2050000_I2.A01) || this.A04 != ktCSuperShape0S2050000_I2.A04) {
                return false;
            }
            z = this.A06;
            z2 = ktCSuperShape0S2050000_I2.A06;
        } else if (this == obj) {
            return true;
        } else {
            if (!(obj instanceof KtCSuperShape0S2050000_I2)) {
                return false;
            }
            ktCSuperShape0S2050000_I2 = (KtCSuperShape0S2050000_I2) obj;
            if (ktCSuperShape0S2050000_I2.A07 != 0 || !C04220Ms.A0I(this.A01, ktCSuperShape0S2050000_I2.A01) || this.A06 != ktCSuperShape0S2050000_I2.A06 || this.A05 != ktCSuperShape0S2050000_I2.A05 || !C04220Ms.A0I(this.A00, ktCSuperShape0S2050000_I2.A00)) {
                return false;
            }
            z = this.A04;
            z2 = ktCSuperShape0S2050000_I2.A04;
        }
        if (z == z2 && this.A03 == ktCSuperShape0S2050000_I2.A03 && this.A02 == ktCSuperShape0S2050000_I2.A02) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int A062;
        boolean z;
        if (this.A07 != 0) {
            int A032 = C18180wK.A03(this.A00);
            boolean z2 = this.A05;
            i = 1;
            if (z2) {
                z2 = true;
            }
            int A072 = AnonymousClass0wJ.A07(this.A01, (A032 + (z2 ? 1 : 0)) * 31);
            boolean z3 = this.A04;
            if (z3) {
                z3 = true;
            }
            A062 = (A072 + (z3 ? 1 : 0)) * 31;
            z = this.A06;
        } else {
            int A033 = C18180wK.A03(this.A01);
            boolean z4 = this.A06;
            i = 1;
            if (z4) {
                z4 = true;
            }
            int i2 = (A033 + (z4 ? 1 : 0)) * 31;
            boolean z5 = this.A05;
            if (z5) {
                z5 = true;
            }
            A062 = (((i2 + (z5 ? 1 : 0)) * 31) + AnonymousClass0wJ.A06(this.A00)) * 31;
            z = this.A04;
        }
        if (z) {
            z = true;
        }
        int i3 = (A062 + (z ? 1 : 0)) * 31;
        boolean z6 = this.A03;
        if (z6) {
            z6 = true;
        }
        int i4 = (i3 + (z6 ? 1 : 0)) * 31;
        if (!this.A02) {
            i = 0;
        }
        return i4 + i;
    }

    public KtCSuperShape0S2050000_I2() {
        this.A07 = 1;
        this.A07 = 1;
        this.A00 = "not_eligible";
        this.A05 = false;
        this.A01 = "$0.00";
        this.A04 = false;
        this.A06 = false;
        this.A03 = false;
        this.A02 = false;
    }
}
