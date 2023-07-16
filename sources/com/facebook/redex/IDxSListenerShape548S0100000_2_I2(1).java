package com.facebook.redex;

import X.C112756q8;
import X.C25812DsR;
import X.C27927Evd;
import android.view.View;

public class IDxSListenerShape548S0100000_2_I2 implements C27927Evd {
    public Object A00;
    public final int A01;

    public IDxSListenerShape548S0100000_2_I2(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void A00(C25812DsR dsR) {
        View view = (View) this.A00;
        view.setAlpha((float) dsR.A09.A00);
        view.invalidate();
    }

    public final void CLf(C25812DsR dsR) {
        if (this.A01 != 0) {
            A00(dsR);
        }
    }

    public final void CLg(C25812DsR dsR) {
        if (this.A01 != 0) {
            A00(dsR);
        } else if (dsR != null) {
            dsR.A09(0.0d);
            View view = ((C112756q8) this.A00).A00;
            view.setScaleX(view.getScaleX() * ((float) -1));
        }
    }

    public final void CLh(C25812DsR dsR) {
        if (this.A01 != 0) {
            A00(dsR);
        }
    }

    public final void CLi(C25812DsR dsR) {
        if (this.A01 != 0) {
            A00(dsR);
        } else if (dsR != null) {
            ((C112756q8) this.A00).A00.setRotationY(((float) dsR.A09.A00) * 180.0f);
        }
    }
}
