package com.facebook.redex;

import X.AnonymousClass7Ic;
import X.AnonymousClass7Kx;
import X.C107266gT;
import X.C108876j6;
import X.C142618fJ;
import X.C145348kM;
import X.C880756q;
import X.M5J;

public class IDxACallbackShape4S1500000_2_I2 implements C145348kM {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public String A05;
    public final int A06;

    public IDxACallbackShape4S1500000_2_I2(C142618fJ r1, C880756q r2, C107266gT r3, AnonymousClass7Ic r4, Object obj, String str, int i) {
        this.A06 = i;
        this.A00 = r4;
        this.A05 = str;
        if (i != 0) {
            this.A02 = r1;
            this.A03 = obj;
            this.A04 = r2;
            this.A01 = r3;
        } else {
            this.A01 = r1;
            this.A03 = obj;
            this.A04 = r2;
            this.A02 = r3;
        }
    }

    public final void Bln(Throwable th) {
        ((M5J) this.A04).A0G(AnonymousClass7Kx.A0C(th));
    }

    public final void Blo(C108876j6 r8) {
        C142618fJ r0;
        Object obj;
        C880756q r1;
        Object obj2;
        int i = this.A06;
        AnonymousClass7Ic r4 = (AnonymousClass7Ic) this.A00;
        String str = this.A05;
        if (i != 0) {
            r0 = (C142618fJ) this.A02;
            obj = this.A03;
            r1 = (C880756q) this.A04;
            obj2 = this.A01;
        } else {
            r0 = (C142618fJ) this.A01;
            obj = this.A03;
            r1 = (C880756q) this.A04;
            obj2 = this.A02;
        }
        AnonymousClass7Ic.A00(r0, r1, (C107266gT) obj2, r8, r4, obj, str);
    }
}
