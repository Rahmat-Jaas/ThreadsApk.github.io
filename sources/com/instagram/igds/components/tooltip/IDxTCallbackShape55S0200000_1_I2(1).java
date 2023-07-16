package com.instagram.igds.components.tooltip;

import X.AnonymousClass0wJ;
import X.AnonymousClass1f6;
import X.AnonymousClass3WS;
import X.AnonymousClass4DQ;
import X.C25918DvM;
import X.C28161tl;
import X.C83624ri;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0110000_I2;
import com.instagram.service.session.UserSession;

public class IDxTCallbackShape55S0200000_1_I2 extends AnonymousClass4DQ {
    public Object A00;
    public Object A01;
    public final int A02;

    public IDxTCallbackShape55S0200000_1_I2(int i, Object obj, Object obj2) {
        this.A02 = i;
        this.A01 = obj;
        this.A00 = obj2;
    }

    public static final void A00(IDxTCallbackShape55S0200000_1_I2 iDxTCallbackShape55S0200000_1_I2) {
        ((AnonymousClass1f6) iDxTCallbackShape55S0200000_1_I2.A01).A03.invoke(iDxTCallbackShape55S0200000_1_I2.A00);
    }

    public final void CPO(C25918DvM dvM) {
        if (1 - this.A02 == 0) {
            ((C83624ri) this.A00).C2v((KtCSuperShape0S0110000_I2) null);
        }
    }

    public final void CPS(C25918DvM dvM) {
        if (this.A02 != 0) {
            AnonymousClass0wJ.A13(C28161tl.A02(AnonymousClass3WS.A01((UserSession) this.A01)), "should_show_add_interests_tooltip", false);
        } else {
            A00(this);
        }
    }
}
