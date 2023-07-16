package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import com.instagram.barcelona.R;

/* renamed from: X.4xb  reason: invalid class name and case insensitive filesystem */
public final class C86394xb extends Drawable {
    public final int A00;
    public final int A01;
    public final int A02;
    public final Drawable A03;
    public final GradientDrawable A04;

    public C86394xb(Context context, Integer num, int i, int i2, int i3) {
        Drawable drawable;
        this.A02 = i2;
        this.A01 = i3;
        if (num == null) {
            drawable = context.getDrawable(i);
            if (drawable == null) {
                throw AnonymousClass0wJ.A0b();
            }
        } else {
            drawable = C19587Ayn.A01(context, i, context.getColor(num.intValue()));
        }
        this.A03 = drawable;
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TL_BR, C29929Fwf.A06);
        gradientDrawable.setShape(1);
        gradientDrawable.setCornerRadius(C86134wK.A01(i2));
        this.A04 = gradientDrawable;
        this.A00 = i2 + i3;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.abc_action_bar_stacked_max_height);
        drawable.setBounds(0, 0, Math.min(dimensionPixelSize, drawable.getIntrinsicWidth()), Math.min(dimensionPixelSize, drawable.getIntrinsicHeight()));
    }

    public final void draw(Canvas canvas) {
        C04220Ms.A0B(canvas, 0);
        Drawable drawable = this.A03;
        float A0A = (float) C86124wJ.A0A(drawable);
        float A08 = (float) C86134wK.A08(drawable);
        GradientDrawable gradientDrawable = this.A04;
        int i = this.A01;
        int i2 = i >> 1;
        int i3 = this.A02;
        gradientDrawable.setBounds(i2, i2, i2 + i3, i3 + (i / 2));
        gradientDrawable.draw(canvas);
        float f = (float) this.A00;
        float f2 = (float) 2;
        float f3 = (f - A0A) / f2;
        float f4 = (f - A08) / f2;
        drawable.setBounds((int) f3, (int) f4, (int) (f3 + A0A), (int) (f4 + A08));
        drawable.draw(canvas);
    }

    public final int getOpacity() {
        return -3;
    }

    public final int getIntrinsicHeight() {
        return this.A00;
    }

    public final int getIntrinsicWidth() {
        return this.A00;
    }

    public final void setAlpha(int i) {
        this.A03.setAlpha(i);
        this.A04.setAlpha(i);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.A03.setColorFilter(colorFilter);
        this.A04.setColorFilter(colorFilter);
    }
}
