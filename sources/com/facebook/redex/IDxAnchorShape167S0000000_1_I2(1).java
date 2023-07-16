package com.facebook.redex;

import X.C41706Ma1;
import android.view.View;

public class IDxAnchorShape167S0000000_1_I2 implements C41706Ma1 {
    public final int A00;

    public IDxAnchorShape167S0000000_1_I2(int i) {
        this.A00 = i;
    }

    public final int B2E(View view, int i) {
        View view2;
        if (this.A00 == 0) {
            return 0;
        }
        if (view.getParent() instanceof View) {
            view2 = (View) view.getParent();
        } else {
            view2 = view;
        }
        return Math.min(view.getMeasuredHeight(), i - ((int) (((float) Math.min(view2.getWidth(), view2.getHeight())) / 1.7777778f)));
    }
}
