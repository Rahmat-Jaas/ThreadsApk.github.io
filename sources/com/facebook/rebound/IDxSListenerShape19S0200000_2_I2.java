package com.facebook.rebound;

import X.BXM;
import X.C127237gm;
import X.C25812DsR;
import X.DON;
import android.view.View;
import com.facebook.react.uimanager.BaseViewManager;

public class IDxSListenerShape19S0200000_2_I2 extends C127237gm {
    public Object A00;
    public Object A01;
    public final int A02;

    public IDxSListenerShape19S0200000_2_I2(int i, Object obj, Object obj2) {
        this.A02 = i;
        this.A01 = obj2;
        this.A00 = obj;
    }

    public final void CLg(C25812DsR dsR) {
        if (this.A02 == 0) {
            ((BXM) this.A01).A04.getSupportFragmentManager().A0d();
        }
    }

    public final void CLi(C25812DsR dsR) {
        float f;
        if (this.A02 != 0) {
            View view = (View) this.A01;
            DON don = dsR.A09;
            view.setScaleX((float) don.A00);
            view.setScaleY((float) don.A00);
            return;
        }
        if (dsR != null) {
            f = (float) dsR.A09.A00;
        } else {
            f = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
        }
        ((View) this.A00).setTranslationY(f);
    }
}
