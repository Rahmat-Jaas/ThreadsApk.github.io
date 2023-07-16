package com.facebook.redex;

import X.AnonymousClass0wJ;
import X.AnonymousClass7Kx;
import X.C04220Ms;
import X.C111186mv;
import X.C112146p4;
import X.C113806sA;
import X.C113996sW;
import X.C1200978m;
import X.C121207Et;
import X.C1364282r;
import X.C142618fJ;
import X.M5J;
import com.facebook.graphql.impls.CreatePayContainerMutationResponseImpl;
import com.facebook.pando.TreeJNI;
import java.util.ArrayList;

public class IDxFunctionShape122S0300000_2_I2 implements C142618fJ {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public IDxFunctionShape122S0300000_2_I2(int i, Object obj, Object obj2, Object obj3) {
        this.A03 = i;
        this.A00 = obj;
        this.A01 = obj2;
        this.A02 = obj3;
    }

    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        TreeJNI treeJNI;
        M5J m5j;
        TreeJNI treeValue;
        switch (this.A03) {
            case 0:
                C113996sW r4 = (C113996sW) this.A02;
                AnonymousClass7Kx.A0J(r4.A02, (Object) null);
                return Boolean.valueOf(AnonymousClass0wJ.A0F().postDelayed(new C1364282r((C111186mv) obj, r4, (ArrayList) this.A01, (ArrayList) this.A00), 3000));
            case 1:
                C113806sA r6 = (C113806sA) obj;
                C04220Ms.A0B(r6, 0);
                return ((C1200978m) this.A02).A01.A00(r6, (C112146p4) this.A00, (C121207Et) this.A01);
            default:
                TreeJNI treeJNI2 = (TreeJNI) obj;
                if (treeJNI2 == null || (treeValue = treeJNI2.getTreeValue("request_payment_container(input:$input)", CreatePayContainerMutationResponseImpl.RequestPaymentContainer.class)) == null) {
                    treeJNI = null;
                } else {
                    treeJNI = treeValue.getTreeValue("non_auth_step_up_error", CreatePayContainerMutationResponseImpl.RequestPaymentContainer.NonAuthStepUpError.class);
                }
                C142618fJ r0 = (C142618fJ) this.A00;
                if (treeJNI == null || (m5j = (M5J) r0.apply(treeJNI)) == null) {
                    return null;
                }
                Object obj2 = this.A02;
                Object obj3 = this.A01;
                AnonymousClass7Kx.A0H(m5j, new IDxObserverShape55S0300000_2_I2(16, obj2, obj3, (Object) treeJNI2));
                return obj3;
        }
    }
}
