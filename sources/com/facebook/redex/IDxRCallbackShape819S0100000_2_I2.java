package com.facebook.redex;

import X.AnonymousClass03G;
import X.L1Q;
import android.app.Activity;
import androidx.fragment.app.Fragment;

public class IDxRCallbackShape819S0100000_2_I2 implements L1Q {
    public Object A00;
    public final int A01;

    public IDxRCallbackShape819S0100000_2_I2(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void Bmc() {
    }

    public final void BrW() {
        if (this.A01 == 0) {
            AnonymousClass03G.A00(((Activity) this.A00).getWindow(), false);
        }
    }

    public final void Bxq() {
    }

    public final void CNe() {
    }

    public final void onCancel() {
        if (this.A01 == 0) {
            AnonymousClass03G.A00(((Activity) this.A00).getWindow(), false);
        }
    }

    public final void onSuccess() {
        if (this.A01 != 0) {
            ((Fragment) this.A00).getParentFragmentManager().A0d();
        }
    }
}
