package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.barcelona.R;

/* renamed from: X.3hQ  reason: invalid class name and case insensitive filesystem */
public final class C63403hQ {
    public static final TypedValue A00 = new TypedValue();

    public static Drawable A00(Context context, int i) {
        if (i == 0) {
            return null;
        }
        Drawable drawable = context.getDrawable(i);
        Resources.Theme theme = context.getTheme();
        TypedValue typedValue = A00;
        theme.resolveAttribute(R.attr.glyphColorPrimary, typedValue, true);
        C63393hP.A05(drawable, typedValue.data);
        return drawable;
    }

    public static Drawable A01(Context context, int i, int i2) {
        int color = context.getColor(i2);
        try {
            Drawable drawable = context.getDrawable(i);
            if (drawable == null) {
                return null;
            }
            Drawable mutate = drawable.mutate();
            C63393hP.A05(mutate, color);
            return mutate;
        } catch (Resources.NotFoundException unused) {
            return null;
        }
    }

    public static void A02(Context context, Drawable drawable, int i) {
        Resources.Theme theme = context.getTheme();
        TypedValue typedValue = A00;
        theme.resolveAttribute(i, typedValue, true);
        C63393hP.A05(drawable, typedValue.data);
    }

    public static void A03(Context context, ImageView imageView, int i) {
        C63393hP.A04(context, imageView, i);
    }

    public static void A04(TextView textView) {
        int currentTextColor = textView.getCurrentTextColor();
        for (Drawable drawable : textView.getCompoundDrawables()) {
            if (drawable != null) {
                drawable.setColorFilter(new PorterDuffColorFilter(currentTextColor, PorterDuff.Mode.SRC_IN));
            }
        }
    }
}
