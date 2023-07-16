package com.facebook.redex;

import X.AnonymousClass0wJ;
import X.AnonymousClass3DI;
import X.C313625r;
import X.C84784tr;
import com.instagram.registration.model.RegFlowExtras;
import java.util.List;

public class IDxRStepShape144S0000000_1_I2 implements C84784tr {
    public final int A00;

    public IDxRStepShape144S0000000_1_I2(int i) {
        this.A00 = i;
    }

    public final /* bridge */ /* synthetic */ boolean Boc(AnonymousClass3DI r3, Object obj) {
        switch (this.A00) {
            case 0:
                RegFlowExtras regFlowExtras = (RegFlowExtras) obj;
                regFlowExtras.getClass();
                return regFlowExtras.A0w;
            case 1:
                RegFlowExtras regFlowExtras2 = (RegFlowExtras) obj;
                regFlowExtras2.getClass();
                return regFlowExtras2.A0m;
            case 2:
                RegFlowExtras regFlowExtras3 = (RegFlowExtras) obj;
                regFlowExtras3.getClass();
                if (regFlowExtras3.A01() == C313625r.PHONE && regFlowExtras3.A05 == null && regFlowExtras3.A0R != null) {
                    return true;
                }
                return false;
            case 3:
                RegFlowExtras regFlowExtras4 = (RegFlowExtras) obj;
                regFlowExtras4.getClass();
                List list = regFlowExtras4.A0e;
                if (list != null && !list.isEmpty()) {
                    return false;
                }
                List list2 = regFlowExtras4.A0f;
                if (list2 == null) {
                    list2 = AnonymousClass0wJ.A0v();
                    regFlowExtras4.A0f = list2;
                }
                if (list2.isEmpty()) {
                    return true;
                }
                return false;
            case 4:
                RegFlowExtras regFlowExtras5 = (RegFlowExtras) obj;
                regFlowExtras5.getClass();
                List list3 = regFlowExtras5.A0e;
                if (list3 != null && !list3.isEmpty()) {
                    return true;
                }
                List list4 = regFlowExtras5.A0f;
                if (list4 == null) {
                    list4 = AnonymousClass0wJ.A0v();
                    regFlowExtras5.A0f = list4;
                }
                if (list4.isEmpty()) {
                    return false;
                }
                return true;
            default:
                return true;
        }
    }
}
