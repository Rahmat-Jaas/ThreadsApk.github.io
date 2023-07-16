package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import com.facebook.react.uimanager.BaseViewManager;
import com.instagram.barcelona.R;
import java.util.List;

/* renamed from: X.02o  reason: invalid class name and case insensitive filesystem */
public final class C005702o extends AnonymousClass03N {
    public static final Interpolator A00 = new DecelerateInterpolator();
    public static final Interpolator A01 = new I69();
    public static final Interpolator A02 = new PathInterpolator(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 1.1f, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 1.0f);

    public C005702o(int i, Interpolator interpolator, long j) {
        super(i, interpolator, j);
    }

    public static AnonymousClass03I A00(View view) {
        Object tag = view.getTag(R.id.tag_window_insets_animation_callback);
        if (tag instanceof AnonymousClass03L) {
            return ((AnonymousClass03L) tag).A01;
        }
        return null;
    }

    public static void A01(View view, WindowInsets windowInsets, AnonymousClass03O r4, boolean z) {
        AnonymousClass03I A002 = A00(view);
        if (A002 != null) {
            A002.A00 = windowInsets;
            if (!z) {
                A002.A04(r4);
                z = false;
                if (A002.A01 == 0) {
                    z = true;
                }
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                A01(viewGroup.getChildAt(i), windowInsets, r4, z);
            }
        }
    }

    public static void A02(View view, AnonymousClass03H r3, AnonymousClass03O r4) {
        AnonymousClass03I A002 = A00(view);
        if (A002 != null) {
            A002.A01(r3, r4);
            if (A002.A01 == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                A02(viewGroup.getChildAt(i), r3, r4);
            }
        }
    }

    public static void A03(View view, AnonymousClass03O r3) {
        AnonymousClass03I A002 = A00(view);
        if (A002 != null) {
            A002.A03(r3);
            if (A002.A01 == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                A03(viewGroup.getChildAt(i), r3);
            }
        }
    }

    public static void A04(View view, AnonymousClass03Y r3, List list) {
        AnonymousClass03I A002 = A00(view);
        if (A002 != null) {
            r3 = A002.A02(r3, list);
            if (A002.A01 == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                A04(viewGroup.getChildAt(i), r3, list);
            }
        }
    }
}
