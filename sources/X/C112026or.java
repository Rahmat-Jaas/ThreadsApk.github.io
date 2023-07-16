package X;

import com.facebook.react.uimanager.BaseViewManager;

/* renamed from: X.6or  reason: invalid class name and case insensitive filesystem */
public final class C112026or {
    public final Float[] A00;
    public final int A01;

    public final float A00(C112026or r6) {
        C04220Ms.A0B(r6, 0);
        int i = this.A01;
        float f = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
        for (int i2 = 0; i2 < i; i2++) {
            f += this.A00[i2].floatValue() * r6.A00[i2].floatValue();
        }
        return f;
    }

    public C112026or(int i) {
        this.A01 = i;
        Float[] fArr = new Float[i];
        for (int i2 = 0; i2 < i; i2++) {
            fArr[i2] = C86124wJ.A0g();
        }
        this.A00 = fArr;
    }
}
