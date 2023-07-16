package X;

import android.content.Context;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import com.facebook.react.uimanager.BaseViewManager;

/* renamed from: X.5A1  reason: invalid class name */
public final class AnonymousClass5A1 extends LBP {
    public float A00 = -1.0f;
    public int A01 = 0;

    public final int A09() {
        return -1;
    }

    public final int A0C(int i, int i2, int i3, int i4, int i5) {
        return (i3 - i) + this.A01;
    }

    public final float A07(DisplayMetrics displayMetrics) {
        float f;
        float applyDimension;
        float f2 = this.A00;
        if (f2 <= BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
            applyDimension = (float) displayMetrics.densityDpi;
            f = 25.0f;
        } else {
            f = 1.0f;
            applyDimension = TypedValue.applyDimension(1, f2, displayMetrics);
        }
        return f / applyDimension;
    }

    public AnonymousClass5A1(Context context) {
        super(context);
    }
}
