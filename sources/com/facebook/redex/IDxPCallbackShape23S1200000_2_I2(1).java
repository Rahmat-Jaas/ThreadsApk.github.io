package com.facebook.redex;

import X.C04220Ms;
import X.C10650ih;
import X.C131567sP;
import X.C144608im;
import X.C170689vP;
import X.C18170wI;
import X.C18250wR;
import X.C37412JrW;
import X.C86164wN;
import X.C971568d;
import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.FragmentActivity;
import java.util.Map;

public class IDxPCallbackShape23S1200000_2_I2 implements C144608im {
    public Object A00;
    public Object A01;
    public String A02;
    public final int A03;

    public IDxPCallbackShape23S1200000_2_I2(Object obj, Object obj2, String str, int i) {
        this.A03 = i;
        this.A00 = obj;
        this.A02 = str;
        this.A01 = obj2;
    }

    public final void CAi(Map map) {
        String A002;
        int i = this.A03;
        C04220Ms.A0B(map, 0);
        Object obj = map.get("android.permission.CALL_PHONE");
        C971568d r0 = C971568d.GRANTED;
        Object obj2 = this.A00;
        if (i != 0) {
            FragmentActivity fragmentActivity = (FragmentActivity) obj2;
            String str = this.A02;
            C131567sP r1 = (C131567sP) this.A01;
            if (obj == r0) {
                C131567sP.A01(fragmentActivity, r1, str);
                return;
            }
            C131567sP.A02(r1, "ctc_call_initiated_indirectly");
            C37412JrW.A04(fragmentActivity, C170689vP.AD_DESTINATION_PHONE, str);
            return;
        }
        Context context = (Context) obj2;
        String str2 = this.A02;
        C131567sP r12 = (C131567sP) this.A01;
        if (obj == r0) {
            C131567sP.A02(r12, "ctc_call_initiated_directly");
            A002 = "android.intent.action.CALL";
        } else {
            C131567sP.A02(r12, "ctc_call_initiated_indirectly");
            A002 = C18170wI.A00(131);
        }
        Intent A0B = C86164wN.A0B(C18250wR.A05(A002), str2);
        C04220Ms.A06(A0B);
        C10650ih.A01(context, A0B);
    }
}
