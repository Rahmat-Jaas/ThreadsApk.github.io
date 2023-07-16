package com.facebook.redex;

import X.C18220wO;
import X.C31164GhX;
import X.C39797L0o;
import android.app.Activity;
import com.instagram.barcelona.R;

public class IDxCListenerShape280S0200000_1_I2 implements C39797L0o {
    public Object A00;
    public Object A01;
    public final int A02;

    public IDxCListenerShape280S0200000_1_I2(int i, Object obj, Object obj2) {
        this.A02 = i;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public final void BuL() {
    }

    public final void C0C() {
        if (this.A02 == 0) {
            Activity activity = (Activity) this.A01;
            C31164GhX.A02(activity, C18220wO.A02(activity, R.attr.statusBarBackgroundColor));
            C31164GhX.A05(activity, true);
        }
    }

    public final void CBe(int i, int i2) {
        if (this.A02 == 0) {
            Activity activity = (Activity) this.A01;
            C31164GhX.A02(activity, 0);
            C31164GhX.A05(activity, false);
        }
    }

    public final void BkO(float f) {
    }
}
