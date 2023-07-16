package com.facebook.redex;

import X.AnonymousClass0ND;
import X.AnonymousClass0OA;
import X.AnonymousClass0OB;
import X.AnonymousClass0OK;
import X.AnonymousClass0PC;
import X.C04050Mb;
import X.C04090Mf;
import X.C04100Mg;

public class IDxListenerShape44S0400000_I2 implements C04090Mf {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public final int A04;

    public IDxListenerShape44S0400000_I2(C04100Mg r1, AnonymousClass0OA r2, AnonymousClass0OB r3, AnonymousClass0OK r4, int i) {
        this.A04 = i;
        this.A00 = r2;
        this.A02 = r3;
        this.A03 = r4;
        this.A01 = r1;
    }

    public final void C9M(AnonymousClass0ND r5, AnonymousClass0PC r6) {
        C04100Mg r1;
        AnonymousClass0ND r0;
        int i = this.A04;
        C04050Mb r2 = (C04050Mb) ((AnonymousClass0OB) this.A02).AFC((AnonymousClass0OK) this.A03);
        if (i != 0) {
            if (r2 != null) {
                r1 = (C04100Mg) this.A01;
                r0 = AnonymousClass0ND.LARGE_REPORT;
            } else {
                return;
            }
        } else if (r2 != null) {
            r1 = (C04100Mg) this.A01;
            r0 = AnonymousClass0ND.CRITICAL_REPORT;
        } else {
            return;
        }
        r1.A05(r2, r0, r6);
    }
}
