package com.facebook.redex;

import X.AnonymousClass76O;
import X.AnonymousClass7Kx;
import X.AnonymousClass7Kz;
import X.C104996ci;
import X.C120977Dl;
import X.C121157Ek;
import X.C145358kN;
import X.C92955kJ;
import X.M5J;

public class IDxAObserverShape4S2200000_2_I2 implements C145358kN {
    public Object A00;
    public Object A01;
    public String A02;
    public String A03;
    public final int A04;

    public IDxAObserverShape4S2200000_2_I2(C145358kN r1, C120977Dl r2, String str, String str2, int i) {
        this.A04 = i;
        this.A02 = str;
        this.A01 = r2;
        if (i != 0) {
            this.A03 = str2;
            this.A00 = r1;
        } else {
            this.A00 = r1;
            this.A03 = str2;
        }
    }

    public final void CDo(String str) {
        M5J A032;
        int i;
        if (this.A04 != 0) {
            String str2 = this.A02;
            A032 = AnonymousClass7Kz.A07().A05.A03((C120977Dl) this.A01, str2);
            i = 1;
        } else {
            C121157Ek r2 = AnonymousClass7Kz.A07().A05;
            String str3 = this.A02;
            C120977Dl r7 = (C120977Dl) this.A01;
            C104996ci r6 = r2.A01;
            IDxFunctionShape17S1200000_2_I2 iDxFunctionShape17S1200000_2_I2 = new IDxFunctionShape17S1200000_2_I2(r2, r7, str3, 7);
            AnonymousClass76O r4 = r2.A00;
            A032 = new C92955kJ(iDxFunctionShape17S1200000_2_I2, r4, r4, r6, r7, r7).A03();
            C121157Ek.A01(A032, r4);
            i = 0;
        }
        AnonymousClass7Kx.A0H(A032, new IDxObserverShape40S1100000_2_I2(this, str, i));
    }

    public final void CDn(Boolean bool, Integer num, Throwable th) {
    }
}
