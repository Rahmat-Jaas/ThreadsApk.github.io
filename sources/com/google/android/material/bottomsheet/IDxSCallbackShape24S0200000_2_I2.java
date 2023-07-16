package com.google.android.material.bottomsheet;

import X.AnonymousClass0ZU;
import X.AnonymousClass5jA;
import X.AnonymousClass5jB;
import X.C36433JUv;
import android.view.View;
import com.facebook.react.uimanager.BaseViewManager;

public class IDxSCallbackShape24S0200000_2_I2 extends C36433JUv {
    public Object A00;
    public Object A01;
    public final int A02;

    public IDxSCallbackShape24S0200000_2_I2(int i, Object obj, Object obj2) {
        this.A02 = i;
        this.A01 = obj;
        this.A00 = obj2;
    }

    public final void A01(View view, float f) {
        AnonymousClass0ZU r0;
        int i = this.A02;
        Object obj = this.A01;
        if (i != 0) {
            AnonymousClass5jB r3 = (AnonymousClass5jB) obj;
            if (AnonymousClass5jB.A02(r3) && f == BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER && !r3.A02) {
                int i2 = ((BottomSheetBehavior) this.A00).A0I;
                if (i2 == 4 || i2 == 1) {
                    r0 = r3.A0A;
                } else {
                    return;
                }
            } else {
                return;
            }
        } else {
            AnonymousClass5jA r32 = (AnonymousClass5jA) obj;
            if (AnonymousClass5jA.A00(r32) && f == BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER && !r32.A02) {
                int i3 = ((BottomSheetBehavior) this.A00).A0I;
                if (i3 == 4 || i3 == 1) {
                    r0 = r32.A04;
                } else {
                    return;
                }
            } else {
                return;
            }
        }
        r0.invoke();
    }

    public final void A02(View view, int i) {
    }
}
