package X;

import android.content.Context;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.facebook.react.uimanager.BaseViewManager;
import com.instagram.barcelona.R;

/* renamed from: X.3W1  reason: invalid class name */
public final class AnonymousClass3W1 {
    public static final float A00(Context context, float f) {
        C04220Ms.A0B(context, 0);
        return TypedValue.applyDimension(1, f, C18230wP.A0E(context));
    }

    public static LinearLayout A02(Context context, View view) {
        view.setAlpha(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
        AnonymousClass03B A03 = C006702y.A03(view);
        A03.A05(3000);
        A03.A02(1.0f);
        A03.A04(200);
        A03.A06(new LinearInterpolator());
        A03.A01();
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setGravity(80);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins((int) A00(context, 20.0f), 0, (int) A00(context, 20.0f), (int) A00(context, 20.0f));
        layoutParams.weight = 1.0f;
        linearLayout.addView(view, layoutParams);
        return linearLayout;
    }

    public static View A01(Context context, View view, ViewGroup viewGroup) {
        viewGroup.addView(view);
        F12 f12 = new F12(context, 4.0f, -16751392, (int) A00(context, 64.0f));
        F5i f5i = new F5i(context);
        f5i.A01(f12);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        viewGroup.addView(f5i, layoutParams);
        f5i.A00();
        return viewGroup.findViewById(R.id.shops_lite_cancel_button_ig);
    }
}
