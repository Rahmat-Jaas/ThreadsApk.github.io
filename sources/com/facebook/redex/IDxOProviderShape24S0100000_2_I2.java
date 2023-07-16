package com.facebook.redex;

import X.C127397h3;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.facebook.react.uimanager.BaseViewManager;

public class IDxOProviderShape24S0100000_2_I2 extends ViewOutlineProvider {
    public Object A00;
    public final int A01;

    public IDxOProviderShape24S0100000_2_I2(C127397h3 r1, int i) {
        this.A01 = i;
        this.A00 = r1;
    }

    public final void getOutline(View view, Outline outline) {
        float A0G;
        int i = this.A01;
        Drawable background = view.getBackground();
        if (i != 0) {
            if (background == null) {
                outline.setRect(0, 0, view.getWidth(), view.getHeight());
                A0G = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
            }
            background.getOutline(outline);
            A0G = ((C127397h3) this.A00).A0G(65, 1.0f);
        } else {
            if (background == null) {
                return;
            }
            background.getOutline(outline);
            A0G = ((C127397h3) this.A00).A0G(65, 1.0f);
        }
        outline.setAlpha(A0G);
    }
}
