package com.facebook.redex;

import X.AnonymousClass58F;
import X.C04220Ms;
import X.C04530Oa;
import X.C133727wF;
import X.C18200wM;
import X.C22941be;
import X.C27061rs;
import X.C28291u0;
import X.C28321u4;
import X.C81644o8;
import X.C82904qS;
import X.CDB;
import java.util.ArrayList;

public class IDxMListenerShape500S0100000_1_I2 implements C82904qS {
    public Object A00;
    public final int A01;

    public IDxMListenerShape500S0100000_1_I2(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void C6x(C81644o8 r6) {
        if (this.A01 != 0) {
            C27061rs r4 = (C27061rs) this.A00;
            C04220Ms.A07(r6);
            C28321u4 r1 = r4.A00;
            if (r1 != null) {
                r4.A00 = new C133727wF(r1, (C28291u0) r6);
                C04530Oa r3 = r4.A0B;
                ArrayList A0s = C18200wM.A0s(((CDB) r3.getValue()).A01);
                C133727wF r0 = r4.A00;
                if (r0 != null) {
                    A0s.add(0, r0);
                }
                ((CDB) r3.getValue()).A00(A0s);
                return;
            }
        } else {
            C22941be r12 = (C22941be) this.A00;
            AnonymousClass58F r2 = (AnonymousClass58F) r12.A04.getValue();
            C04220Ms.A07(r6);
            C28321u4 r02 = r12.A00;
            if (r02 != null) {
                r2.A0E.CrC(new C133727wF(r02, (C28291u0) r6));
                return;
            }
        }
        C04220Ms.A0E("quickPromotionDelegate");
        throw null;
    }
}
