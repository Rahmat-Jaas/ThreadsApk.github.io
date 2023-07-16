package com.facebook.redex;

import X.AnonymousClass0wJ;
import X.AnonymousClass1c8;
import X.AnonymousClass3CP;
import X.AnonymousClass4Rm;
import X.C09860go;
import X.C121907Is;
import X.C144658ir;
import X.C18190wL;
import com.instagram.barcelona.R;

public class IDxCListenerShape461S0100000_1_I2 implements C144658ir {
    public Object A00;
    public final int A01;

    public IDxCListenerShape461S0100000_1_I2(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void C46(int i, boolean z) {
        if (this.A01 != 0) {
            AnonymousClass3CP r1 = (AnonymousClass3CP) this.A00;
            if (r1.A01) {
                r1.A03.postDelayed(new AnonymousClass4Rm(this, i), 250);
                return;
            }
            return;
        }
        AnonymousClass1c8 r3 = (AnonymousClass1c8) this.A00;
        if (r3.mView != null && C18190wL.A0F(r3) != null) {
            boolean A1T = AnonymousClass0wJ.A1T(C18190wL.A0F(r3).getAttributes().softInputMode & 240, 16);
            if (!AnonymousClass1c8.A05(r3) && A1T && C09860go.A0m(r3.getRootActivity())) {
                if (r3.A0A.A0h) {
                    i -= C121907Is.A01(r3.getRootActivity(), R.attr.tabBarHeight);
                }
                C09860go.A0Q(r3.mView, Math.max(i, 0));
            }
        }
    }
}
