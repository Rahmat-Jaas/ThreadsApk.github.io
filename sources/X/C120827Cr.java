package X;

import android.view.View;
import com.facebook.flexlayout.layoutoutput.LayoutOutput;
import com.facebook.react.uimanager.BaseViewManager;

/* renamed from: X.7Cr  reason: invalid class name and case insensitive filesystem */
public final class C120827Cr {
    public static final C41822MeD A00;
    public static final LayoutOutput A01;

    static {
        LayoutOutput layoutOutput = new LayoutOutput(0);
        A01 = layoutOutput;
        A00 = new C127347gy(layoutOutput, (M5L) null, 0, 0);
    }

    public static float[] A00(float f, float f2, float f3, float f4, float f5) {
        float[] fArr;
        boolean isNaN = Float.isNaN(f);
        float f6 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
        if (!isNaN) {
            if (!Float.isNaN(f4)) {
                f6 = f4;
            }
            float f7 = f5;
            if (Float.isNaN(f5)) {
                f7 = Float.POSITIVE_INFINITY;
            }
            if (f >= f6 && f <= f7) {
                return new float[]{f, f};
            }
            fArr = new float[2];
            fArr[0] = f4;
        } else if (!Float.isNaN(f2)) {
            if (Float.isNaN(f4)) {
                f4 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
            }
            fArr = new float[2];
            fArr[0] = Math.max(f2, f4);
        } else {
            if (!Float.isNaN(f3)) {
                return new float[]{f4, f3};
            }
            fArr = new float[2];
            fArr[0] = f4;
        }
        fArr[1] = f5;
        return fArr;
    }

    public static float[] A01(int i) {
        float[] fArr;
        float size = (float) View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        if (mode == 1073741824) {
            fArr = new float[2];
            fArr[0] = size;
        } else {
            fArr = new float[]{Float.NaN, Float.NaN};
            if (mode == Integer.MIN_VALUE) {
                fArr[0] = 0.0f;
            } else {
                return fArr;
            }
        }
        fArr[1] = size;
        return fArr;
    }
}
