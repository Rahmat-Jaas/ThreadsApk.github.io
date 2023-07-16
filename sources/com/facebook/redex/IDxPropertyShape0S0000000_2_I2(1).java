package com.facebook.redex;

import X.C18240wQ;
import android.util.Property;
import android.view.View;
import com.facebook.react.uimanager.BaseViewManager;

public class IDxPropertyShape0S0000000_2_I2 extends Property {
    public final int A00;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public IDxPropertyShape0S0000000_2_I2(java.lang.Class r2, int r3) {
        /*
            r1 = this;
            r1.A00 = r3
            if (r3 == 0) goto L_0x000a
            java.lang.String r0 = "alpha"
        L_0x0006:
            r1.<init>(r2, r0)
            return
        L_0x000a:
            java.lang.String r0 = "translationXPercent"
            goto L_0x0006
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.IDxPropertyShape0S0000000_2_I2.<init>(java.lang.Class, int):void");
    }

    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        float f;
        View view = (View) obj;
        if (this.A00 != 0) {
            f = view.getAlpha();
        } else {
            float width = (float) view.getWidth();
            f = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
            if (width > BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
                f = view.getTranslationX() / width;
            }
        }
        return Float.valueOf(f);
    }

    public final /* bridge */ /* synthetic */ void set(Object obj, Object obj2) {
        View view = (View) obj;
        if (this.A00 != 0) {
            view.setAlpha(C18240wQ.A00(obj2));
        } else {
            view.setTranslationX(((float) view.getWidth()) * ((Number) obj2).floatValue());
        }
    }
}
