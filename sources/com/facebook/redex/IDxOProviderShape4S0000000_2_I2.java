package com.facebook.redex;

import X.AnonymousClass0wJ;
import X.AnonymousClass50g;
import X.C04220Ms;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.facebook.react.uimanager.BaseViewManager;

public class IDxOProviderShape4S0000000_2_I2 extends ViewOutlineProvider {
    public final int A00;

    public IDxOProviderShape4S0000000_2_I2(int i) {
        this.A00 = i;
    }

    public final void getOutline(View view, Outline outline) {
        switch (this.A00) {
            case 0:
                AnonymousClass0wJ.A1N(view, outline);
                Outline A01 = ((AnonymousClass50g) view).A08.A01();
                C04220Ms.A0A(A01);
                outline.set(A01);
                return;
            case 3:
                boolean A1Y = AnonymousClass0wJ.A1Y(view, outline);
                outline.setOval(A1Y ? 1 : 0, A1Y, view.getWidth(), view.getHeight());
                return;
            default:
                boolean A1Y2 = AnonymousClass0wJ.A1Y(view, outline);
                outline.setRect(A1Y2 ? 1 : 0, A1Y2, view.getWidth(), view.getHeight());
                outline.setAlpha(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
                return;
        }
    }
}
