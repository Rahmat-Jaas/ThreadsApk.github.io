package com.facebook.redex;

import X.AnonymousClass756;
import X.AnonymousClass7HU;
import X.AnonymousClass7o4;
import X.C04220Ms;
import X.C112616pu;
import X.C114936uA;
import X.C143878hS;
import X.C146958n9;
import X.COU;
import X.COV;
import X.MJO;

public class IDxCListenerShape673S0100000_2_I2 implements C143878hS {
    public Object A00;
    public final int A01;

    public IDxCListenerShape673S0100000_2_I2(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void BrG(AnonymousClass7HU r6) {
        boolean z;
        Object cov;
        C112616pu r4;
        boolean A06;
        switch (this.A01) {
            case 0:
                C04220Ms.A0B(r6, 0);
                if (r6.A05) {
                    r4 = (C112616pu) this.A00;
                    r4.A03 = true;
                    AnonymousClass7o4 r0 = r4.A00;
                    if (r0 != null) {
                        A06 = r0.A01.cancel(true);
                    } else {
                        return;
                    }
                } else if (r6.A0C()) {
                    r4 = (C112616pu) this.A00;
                    Object A04 = r6.A04();
                    r4.A03 = true;
                    AnonymousClass7o4 r02 = r4.A00;
                    if (r02 != null) {
                        A06 = r02.A01.A06(A04);
                    } else {
                        return;
                    }
                } else {
                    Exception A03 = r6.A03();
                    if (A03 != null) {
                        r4 = (C112616pu) this.A00;
                        r4.A03 = true;
                        AnonymousClass7o4 r03 = r4.A00;
                        if (r03 != null) {
                            MJO mjo = r03.A01;
                            if (MJO.A01.A02(mjo, new AnonymousClass756(A03))) {
                                MJO.A03(mjo);
                                r4.A02 = null;
                                r4.A00 = null;
                                r4.A01 = null;
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    throw new IllegalStateException();
                }
                if (!A06) {
                    return;
                }
                r4.A02 = null;
                r4.A00 = null;
                r4.A01 = null;
                return;
            case 1:
                C04220Ms.A0B(r6, 0);
                boolean A0C = r6.A0C();
                C114936uA r2 = (C114936uA) this.A00;
                if (A0C) {
                    cov = COU.A00;
                } else {
                    cov = new COV(r6.A03());
                }
                r2.A02(cov);
                return;
            case 2:
                C04220Ms.A0B(r6, 0);
                boolean A0C2 = r6.A0C();
                C114936uA r1 = (C114936uA) this.A00;
                if (A0C2) {
                    z = r6.A04();
                } else {
                    z = false;
                }
                r1.A02(z);
                return;
            default:
                C04220Ms.A0B(r6, 0);
                ((C146958n9) this.A00).resumeWith(r6);
                return;
        }
    }
}
