package com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass;

import X.AnonymousClass0Sf;
import X.AnonymousClass0wJ;
import X.C04220Ms;
import X.C18200wM;
import X.C18210wN;
import com.instagram.creatortools.api.schemas.CreatorToolsComponent;

public class KtCSuperShape0S0501000_I2 extends AnonymousClass0Sf {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public final int A06 = 1;

    public KtCSuperShape0S0501000_I2(KtCSuperShape0S2000000_I2 ktCSuperShape0S2000000_I2, KtCSuperShape0S2101000_I2 ktCSuperShape0S2101000_I2, KtCSuperShape0S2101000_I2 ktCSuperShape0S2101000_I22, KtCSuperShape0S2101000_I2 ktCSuperShape0S2101000_I23, CreatorToolsComponent creatorToolsComponent, int i) {
        C04220Ms.A0B(creatorToolsComponent, 1);
        this.A01 = creatorToolsComponent;
        this.A02 = ktCSuperShape0S2101000_I2;
        this.A03 = ktCSuperShape0S2101000_I22;
        this.A04 = ktCSuperShape0S2101000_I23;
        this.A00 = i;
        this.A05 = ktCSuperShape0S2000000_I2;
    }

    public final boolean equals(Object obj) {
        int i;
        if (this.A06 != 0) {
            i = 1;
            if (this == obj) {
                return true;
            }
        } else if (this == obj) {
            return true;
        } else {
            i = 0;
        }
        if (!(obj instanceof KtCSuperShape0S0501000_I2)) {
            return false;
        }
        KtCSuperShape0S0501000_I2 ktCSuperShape0S0501000_I2 = (KtCSuperShape0S0501000_I2) obj;
        if (ktCSuperShape0S0501000_I2.A06 != i || this.A01 != ktCSuperShape0S0501000_I2.A01 || !C04220Ms.A0I(this.A02, ktCSuperShape0S0501000_I2.A02) || !C04220Ms.A0I(this.A03, ktCSuperShape0S0501000_I2.A03) || !C04220Ms.A0I(this.A04, ktCSuperShape0S0501000_I2.A04) || this.A00 != ktCSuperShape0S0501000_I2.A00 || !C04220Ms.A0I(this.A05, ktCSuperShape0S0501000_I2.A05)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A042;
        int A07;
        int i = this.A06;
        Object obj = this.A01;
        if (i != 0) {
            A042 = (((((((C18210wN.A04(obj) + AnonymousClass0wJ.A03(this.A02)) * 31) + AnonymousClass0wJ.A03(this.A03)) * 31) + AnonymousClass0wJ.A03(this.A04)) * 31) + this.A00) * 31;
            A07 = C18200wM.A07(this.A05);
        } else {
            A042 = (((((((C18210wN.A04(obj) + AnonymousClass0wJ.A03(this.A02)) * 31) + AnonymousClass0wJ.A03(this.A03)) * 31) + AnonymousClass0wJ.A03(this.A04)) * 31) + this.A00) * 31;
            A07 = C18200wM.A07(this.A05);
        }
        return A042 + A07;
    }

    public KtCSuperShape0S0501000_I2(KtCSuperShape0S0300000_I2 ktCSuperShape0S0300000_I2, KtCSuperShape0S1100000_I2 ktCSuperShape0S1100000_I2, KtCSuperShape0S2100000_I2 ktCSuperShape0S2100000_I2, KtCSuperShape0S2100000_I2 ktCSuperShape0S2100000_I22, CreatorToolsComponent creatorToolsComponent, int i) {
        C04220Ms.A0B(creatorToolsComponent, 1);
        this.A01 = creatorToolsComponent;
        this.A02 = ktCSuperShape0S2100000_I2;
        this.A03 = ktCSuperShape0S2100000_I22;
        this.A04 = ktCSuperShape0S1100000_I2;
        this.A00 = i;
        this.A05 = ktCSuperShape0S0300000_I2;
    }
}
