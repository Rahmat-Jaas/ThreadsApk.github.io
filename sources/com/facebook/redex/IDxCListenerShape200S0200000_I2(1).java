package com.facebook.redex;

import X.AnonymousClass05H;
import X.C011605j;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;

public class IDxCListenerShape200S0200000_I2 implements View.OnAttachStateChangeListener {
    public Object A00;
    public Object A01;
    public final int A02;

    public IDxCListenerShape200S0200000_I2(int i, Object obj, Object obj2) {
        this.A02 = i;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public final void onViewAttachedToWindow(View view) {
        if (this.A02 != 0) {
            View view2 = (View) this.A01;
            view2.removeOnAttachStateChangeListener(this);
            view2.requestApplyInsets();
            return;
        }
        AnonymousClass05H r1 = (AnonymousClass05H) this.A01;
        Fragment fragment = r1.A02;
        r1.A05();
        C011605j.A03((ViewGroup) fragment.mView.getParent()).A08();
    }

    public final void onViewDetachedFromWindow(View view) {
    }
}
