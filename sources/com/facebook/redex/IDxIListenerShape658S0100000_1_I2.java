package com.facebook.redex;

import X.AnonymousClass0wJ;
import X.AnonymousClass1x2;
import X.C19560AyM;
import X.C26218E4i;
import X.C28291u0;
import X.C32165H8c;
import X.C34640IcN;
import X.C36622Sa;
import X.C61833Vz;
import X.C73404Sg;
import X.C81644o8;
import X.C82894qR;
import X.C84844tx;
import android.content.Context;
import com.instagram.common.api.base.IDxACallbackShape5S0400000_1_I2;
import com.instagram.quickpromotion.intf.Trigger;
import java.util.EnumSet;

public class IDxIListenerShape658S0100000_1_I2 implements C82894qR {
    public Object A00;
    public final int A01;

    public IDxIListenerShape658S0100000_1_I2(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void C3B(Context context, C81644o8 r6, C84844tx r7, String str) {
        switch (this.A01) {
            case 0:
                if (EnumSet.copyOf(((C28291u0) r6).A0F).contains(Trigger.A10)) {
                    C26218E4i e4i = (C26218E4i) this.A00;
                    C34640IcN icN = e4i.A0F;
                    C32165H8c A012 = C19560AyM.A01(e4i.A0O);
                    A012.A00 = new IDxACallbackShape5S0400000_1_I2(8, this, context, r6, r7);
                    icN.schedule(A012);
                    return;
                }
                return;
            case 1:
                C61833Vz A002 = C36622Sa.A00();
                C34640IcN icN2 = (C34640IcN) this.A00;
                A002.A09(icN2.requireContext(), icN2, r6, r7);
                return;
            default:
                AnonymousClass0wJ.A0F().postDelayed(new C73404Sg(context, r6, (AnonymousClass1x2) this.A00), 1000);
                return;
        }
    }
}
