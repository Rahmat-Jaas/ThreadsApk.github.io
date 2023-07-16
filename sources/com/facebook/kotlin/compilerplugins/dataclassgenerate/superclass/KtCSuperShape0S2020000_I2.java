package com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass;

import X.AnonymousClass0Sf;
import X.AnonymousClass0wJ;
import X.C04220Ms;
import X.C18180wK;

public class KtCSuperShape0S2020000_I2 extends AnonymousClass0Sf {
    public String A00;
    public String A01;
    public boolean A02;
    public boolean A03;
    public final int A04 = 0;

    public KtCSuperShape0S2020000_I2(String str, String str2, int i, boolean z, boolean z2) {
        AnonymousClass0wJ.A1P(str, str2);
        this.A01 = str;
        this.A02 = z;
        this.A00 = str2;
        this.A03 = z2;
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (this.A04 != 0) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof KtCSuperShape0S2020000_I2)) {
                return false;
            }
            KtCSuperShape0S2020000_I2 ktCSuperShape0S2020000_I2 = (KtCSuperShape0S2020000_I2) obj;
            if (ktCSuperShape0S2020000_I2.A04 != 1 || !C04220Ms.A0I(this.A00, ktCSuperShape0S2020000_I2.A00) || !C04220Ms.A0I(this.A01, ktCSuperShape0S2020000_I2.A01) || this.A03 != ktCSuperShape0S2020000_I2.A03) {
                return false;
            }
            z = this.A02;
            z2 = ktCSuperShape0S2020000_I2.A02;
        } else if (this == obj) {
            return true;
        } else {
            if (!(obj instanceof KtCSuperShape0S2020000_I2)) {
                return false;
            }
            KtCSuperShape0S2020000_I2 ktCSuperShape0S2020000_I22 = (KtCSuperShape0S2020000_I2) obj;
            if (ktCSuperShape0S2020000_I22.A04 != 0 || !C04220Ms.A0I(this.A01, ktCSuperShape0S2020000_I22.A01) || this.A02 != ktCSuperShape0S2020000_I22.A02 || !C04220Ms.A0I(this.A00, ktCSuperShape0S2020000_I22.A00)) {
                return false;
            }
            z = this.A03;
            z2 = ktCSuperShape0S2020000_I22.A03;
        }
        if (z != z2) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int A07;
        boolean z;
        if (this.A04 != 0) {
            int A072 = AnonymousClass0wJ.A07(this.A01, C18180wK.A03(this.A00));
            boolean z2 = this.A03;
            i = 1;
            if (z2) {
                z2 = true;
            }
            A07 = (A072 + (z2 ? 1 : 0)) * 31;
            z = this.A02;
        } else {
            int A032 = C18180wK.A03(this.A01);
            boolean z3 = this.A02;
            i = 1;
            if (z3) {
                z3 = true;
            }
            A07 = AnonymousClass0wJ.A07(this.A00, (A032 + (z3 ? 1 : 0)) * 31);
            z = this.A03;
        }
        if (!z) {
            i = 0;
        }
        return A07 + i;
    }

    public KtCSuperShape0S2020000_I2(String str, String str2, boolean z, boolean z2) {
        AnonymousClass0wJ.A1M(str, 1, str2);
        this.A00 = str;
        this.A01 = str2;
        this.A03 = z;
        this.A02 = z2;
    }
}
