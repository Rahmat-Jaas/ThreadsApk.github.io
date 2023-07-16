package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.EdgeEffect;
import com.facebook.react.uimanager.BaseViewManager;

/* renamed from: X.7Ab  reason: invalid class name and case insensitive filesystem */
public final class C120397Ab {
    public static final EdgeEffect A02(Context context) {
        try {
            return new EdgeEffect(context, (AttributeSet) null);
        } catch (Throwable unused) {
            return new EdgeEffect(context);
        }
    }

    public static final float A00(EdgeEffect edgeEffect) {
        try {
            return edgeEffect.getDistance();
        } catch (Throwable unused) {
            return BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
        }
    }

    public static final float A01(EdgeEffect edgeEffect, float f, float f2) {
        try {
            return edgeEffect.onPullDistance(f, f2);
        } catch (Throwable unused) {
            edgeEffect.onPull(f, f2);
            return BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
        }
    }
}
