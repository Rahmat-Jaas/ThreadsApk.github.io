package com.facebook.redex;

import X.AnonymousClass0wJ;
import X.C09830gl;
import X.C108226i1;
import X.C18250wR;
import X.C63813iO;
import X.McB;
import android.app.Activity;
import android.content.Context;
import com.facebook.pando.TreeJNI;
import com.instagram.fbpay.auth.graphql.IgPaymentsPINDeleteMutationResponseImpl;

public class IDxFunctionShape361S0100000_1_I2 implements McB {
    public Object A00;
    public final int A01;

    public IDxFunctionShape361S0100000_1_I2(C108226i1 r2) {
        this.A01 = 0;
        this.A00 = r2;
    }

    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        switch (this.A01) {
            case 0:
                TreeJNI treeJNI = (TreeJNI) obj;
                if (treeJNI != null) {
                    return Boolean.valueOf(AnonymousClass0wJ.A1W(treeJNI.getTreeValue("payment_pin_delete(data:$input)", IgPaymentsPINDeleteMutationResponseImpl.PaymentPinDelete.class)));
                }
                throw C18250wR.A0V("Failed to verify password");
            case 3:
                Context context = (Context) this.A00;
                C09830gl.A01(context, (String) obj, (String) null);
                C63813iO.A03(context, (String) null, 2131829646, 0);
                return null;
            default:
                Context context2 = (Context) this.A00;
                C09830gl.A01(context2, (String) obj, (String) null);
                C63813iO.A00(context2, 2131829646);
                return null;
        }
    }

    public IDxFunctionShape361S0100000_1_I2(Activity activity, int i) {
        this.A01 = i;
        this.A00 = activity;
    }
}
