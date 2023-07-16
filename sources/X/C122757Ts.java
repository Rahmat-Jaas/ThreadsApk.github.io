package X;

import com.facebook.react.uimanager.BaseViewManager;

/* renamed from: X.7Ts  reason: invalid class name and case insensitive filesystem */
public final class C122757Ts implements C142658fN {
    public final float A00;
    public final float A01;

    public C122757Ts(float f, float f2) {
        this.A00 = f;
        this.A01 = f2;
        if (Float.isNaN(f) || Float.isNaN(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) || Float.isNaN(f2) || Float.isNaN(1.0f)) {
            StringBuilder A0s = C18190wL.A0s("Parameters to CubicBezierEasing cannot be NaN. Actual parameters are: ");
            A0s.append(f);
            A0s.append(", ");
            A0s.append(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
            A0s.append(", ");
            A0s.append(f2);
            A0s.append(", ");
            A0s.append(1.0f);
            throw C18190wL.A0a(C86114wI.A0q(A0s, '.'));
        }
    }

    public final float D7X(float f) {
        float f2 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
        if (f <= BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
            return f;
        }
        float f3 = 1.0f;
        if (f >= 1.0f) {
            return f;
        }
        while (true) {
            float f4 = (f2 + f3) / ((float) 2);
            float f5 = (float) 3;
            float f6 = ((float) 1) - f4;
            float f7 = f4 * f4 * f4;
            float f8 = (this.A00 * f5 * f6 * f6 * f4) + (f5 * this.A01 * f6 * f4 * f4) + f7;
            if (C86124wJ.A01(f, f8) < 0.001f) {
                return (BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER * f5 * f6 * f6 * f4) + (f5 * 1.0f * f6 * f4 * f4) + f7;
            }
            if (f8 < f) {
                f2 = f4;
            } else {
                f3 = f4;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C122757Ts)) {
            return false;
        }
        C122757Ts r4 = (C122757Ts) obj;
        if (this.A00 == r4.A00 && this.A01 == r4.A01) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return C86144wL.A03(C86104wH.A05(C86104wH.A05(C86134wK.A03(this.A00), BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER), this.A01), 1.0f);
    }
}
