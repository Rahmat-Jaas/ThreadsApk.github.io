package X;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.uimanager.BaseViewManager;

/* renamed from: X.05i  reason: invalid class name and case insensitive filesystem */
public final class C011505i {
    public static Integer A00(int i) {
        if (i == 0) {
            return AnonymousClass006.A01;
        }
        if (i == 4) {
            return AnonymousClass006.A0N;
        }
        if (i == 8) {
            return AnonymousClass006.A0C;
        }
        throw new IllegalArgumentException(AnonymousClass00U.A0J("Unknown visibility ", i));
    }

    public static Integer A01(View view) {
        if (view.getAlpha() == BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER && view.getVisibility() == 0) {
            return AnonymousClass006.A0N;
        }
        return A00(view.getVisibility());
    }

    public static final void A02(View view, Integer num) {
        int i;
        int intValue = num.intValue();
        if (intValue != 0) {
            if (intValue == 1) {
                C12560m7.A0E(2);
                i = 0;
            } else if (intValue != 2) {
                i = 4;
                C12560m7.A0E(2);
            } else {
                C12560m7.A0E(2);
                i = 8;
            }
            view.setVisibility(i);
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            C12560m7.A0E(2);
            viewGroup.removeView(view);
        }
    }
}
