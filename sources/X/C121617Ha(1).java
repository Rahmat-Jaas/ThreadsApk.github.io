package X;

import android.content.Context;
import android.os.Build;
import android.widget.EdgeEffect;
import com.facebook.react.uimanager.BaseViewManager;

/* renamed from: X.7Ha  reason: invalid class name and case insensitive filesystem */
public final class C121617Ha {
    public static final float A00(EdgeEffect edgeEffect) {
        C04220Ms.A0B(edgeEffect, 0);
        if (Build.VERSION.SDK_INT >= 31) {
            return C120397Ab.A00(edgeEffect);
        }
        return BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
    }

    public static final float A01(EdgeEffect edgeEffect, float f, float f2) {
        if (Build.VERSION.SDK_INT >= 31) {
            return C120397Ab.A01(edgeEffect, f, f2);
        }
        edgeEffect.onPull(f, f2);
        return f;
    }

    public static final EdgeEffect A02(Context context) {
        if (Build.VERSION.SDK_INT >= 31) {
            return C120397Ab.A02(context);
        }
        return new AnonymousClass517(context);
    }

    public static final void A03(EdgeEffect edgeEffect, float f) {
        if (edgeEffect instanceof AnonymousClass517) {
            AnonymousClass517 r2 = (AnonymousClass517) edgeEffect;
            float f2 = r2.A00 + f;
            r2.A00 = f2;
            if (Math.abs(f2) > r2.A01) {
                r2.onRelease();
                return;
            }
            return;
        }
        edgeEffect.onRelease();
    }

    public static final void A04(EdgeEffect edgeEffect, int i) {
        if (Build.VERSION.SDK_INT >= 31 || edgeEffect.isFinished()) {
            edgeEffect.onAbsorb(i);
        }
    }
}
