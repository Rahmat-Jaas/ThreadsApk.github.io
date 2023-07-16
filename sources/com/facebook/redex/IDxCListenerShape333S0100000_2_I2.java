package com.facebook.redex;

import X.AnonymousClass0ZU;
import X.C127287gs;
import X.C873151x;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.View;

public class IDxCListenerShape333S0100000_2_I2 implements View.OnLayoutChangeListener {
    public Object A00;
    public final int A01;

    public IDxCListenerShape333S0100000_2_I2(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        Resources resources;
        Configuration configuration;
        int i9;
        if (this.A01 != 0) {
            C127287gs.A00((C127287gs) this.A00);
            return;
        }
        C873151x r2 = (C873151x) this.A00;
        View view2 = r2.A01;
        if (view2 != null && (resources = view2.getResources()) != null && (configuration = resources.getConfiguration()) != null && (i9 = configuration.orientation) != r2.A00) {
            r2.A00 = i9;
            AnonymousClass0ZU r0 = r2.A03;
            if (r0 != null) {
                r0.invoke();
            }
        }
    }
}
