package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.barcelona.R;

/* renamed from: X.7Dv  reason: invalid class name and case insensitive filesystem */
public final class C121047Dv {
    public static final void A00(Context context, View view, int i, boolean z) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        float f = 0.5f;
        if (z) {
            f = 1.0f;
        }
        int applyDimension = (int) TypedValue.applyDimension(1, f, C18230wP.A0E(context));
        if (applyDimension < 1) {
            applyDimension = 1;
        }
        layoutParams.height = applyDimension;
        view.setLayoutParams(layoutParams);
        AnonymousClass7Fe.A02(view, i);
        if (z) {
            view.setVisibility(0);
        }
    }

    public final void A02(Context context, View view, int i) {
        AnonymousClass0wJ.A1N(context, view);
        A01(context, view, AnonymousClass006.A00, (Integer) null, (Integer) null, 24);
        AnonymousClass7Kz.A0T(view, i);
    }

    public static /* synthetic */ void A01(Context context, View view, Integer num, Integer num2, Integer num3, int i) {
        int i2;
        Drawable background;
        if ((i & 8) != 0) {
            num2 = 59;
        }
        if ((i & 16) != 0) {
            num3 = 60;
        }
        C04220Ms.A0B(view, 1);
        int intValue = num.intValue();
        String A00 = C28174Ezk.A00(0);
        if (intValue == 0) {
            i2 = R.drawable.fbpay_accordion_background;
            view.setBackgroundResource(i2);
            background = view.getBackground();
        } else if (intValue != 1) {
            String A002 = AnonymousClass000.A00(7);
            int i3 = R.drawable.fbpay_accordion_background_without_top_bottom_flat;
            if (intValue != 2) {
                i3 = R.drawable.fbpay_accordion_background_without_top;
            }
            view.setBackgroundResource(i3);
            Drawable background2 = view.getBackground();
            C04220Ms.A0C(background2, A002);
            background = ((LayerDrawable) background2).getDrawable(0);
        } else {
            i2 = R.drawable.fbpay_accordion_background_bottom_flat;
            view.setBackgroundResource(i2);
            background = view.getBackground();
        }
        C04220Ms.A0C(background, A00);
        GradientDrawable gradientDrawable = (GradientDrawable) background;
        if (num2 != null) {
            gradientDrawable.setColor(AnonymousClass7Kz.A00(context, num2.intValue()));
        }
        if (num3 != null) {
            int intValue2 = num3.intValue();
            C04220Ms.A0B(gradientDrawable, 1);
            int A003 = AnonymousClass7IS.A00(context, R.attr.fbpay_ui_accordion_border_stroke);
            gradientDrawable.mutate();
            gradientDrawable.setStroke(A003, AnonymousClass7Kz.A00(context, intValue2));
        }
    }
}
