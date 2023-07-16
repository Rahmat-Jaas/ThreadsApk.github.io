package com.instagram.ui.bottomsheet.intf;

import X.C130667qT;
import X.C33492Fx;
import X.C61323St;
import X.C72044Lv;
import android.app.Activity;

public class IDxCListenerShape60S0200000_1_I2 extends C72044Lv {
    public Object A00;
    public Object A01;
    public final int A02;

    public IDxCListenerShape60S0200000_1_I2(int i, Object obj, Object obj2) {
        this.A02 = i;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public final void BuL() {
        int i = this.A02;
        Object obj = this.A01;
        if (i != 0) {
            C33492Fx.A00((C130667qT) this.A00, (C61323St) obj);
            return;
        }
        Activity activity = (Activity) obj;
        activity.setResult(-1);
        activity.finish();
    }
}
