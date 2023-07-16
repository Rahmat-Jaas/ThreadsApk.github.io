package com.facebook.redex;

import X.AnonymousClass5j8;
import X.C04220Ms;
import android.view.ViewTreeObserver;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.core.widget.NestedScrollView;

public class IDxCListenerShape608S0100000_2_I2 implements ViewTreeObserver.OnScrollChangedListener {
    public Object A00;
    public final int A01;

    public IDxCListenerShape608S0100000_2_I2(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void onScrollChanged() {
        if (this.A01 != 0) {
            AnonymousClass5j8 r2 = (AnonymousClass5j8) this.A00;
            NestedScrollView nestedScrollView = r2.A0F;
            if (nestedScrollView == null) {
                C04220Ms.A0E("nestedScrollView");
                throw null;
            } else if (!nestedScrollView.canScrollVertically(1)) {
                AnonymousClass5j8.A08(r2);
            }
        } else {
            AndroidComposeView.A09((AndroidComposeView) this.A00);
        }
    }
}
