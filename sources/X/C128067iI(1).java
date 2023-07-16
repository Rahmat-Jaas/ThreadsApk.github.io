package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.ImageView;

/* renamed from: X.7iI  reason: invalid class name and case insensitive filesystem */
public final class C128067iI implements C146998nD {
    public final int A00;
    public final int A01;
    public final Integer A02;
    public final Integer A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C128067iI) {
                C128067iI r5 = (C128067iI) obj;
                if (this.A00 != r5.A00 || !C04220Ms.A0I(this.A02, r5.A02) || !C04220Ms.A0I(this.A03, r5.A03) || this.A01 != r5.A01) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    private final Drawable A00(Context context) {
        Integer num;
        Integer num2;
        Drawable drawable = context.getDrawable(this.A00);
        if (!(drawable == null || (num2 = this.A02) == null)) {
            drawable.setTint(AnonymousClass7Kz.A0D().A00(context, num2.intValue()));
        }
        if ((drawable instanceof GradientDrawable) && (num = this.A03) != null) {
            ((GradientDrawable) drawable).setStroke((int) context.getResources().getDimension(this.A01), AnonymousClass7Kz.A0D().A00(context, num.intValue()));
        }
        return drawable;
    }

    public final void Bao(ImageView imageView) {
        Drawable drawable;
        if (this.A00 != 0) {
            drawable = A00(C18190wL.A0A(imageView));
        } else {
            drawable = null;
        }
        imageView.setImageDrawable(drawable);
    }

    public final void Chv(View view) {
        Drawable drawable;
        if (this.A00 != 0) {
            drawable = A00(C18190wL.A0A(view));
        } else {
            drawable = null;
        }
        view.setBackground(drawable);
    }

    public final int hashCode() {
        return (((((this.A00 * 31) + AnonymousClass0wJ.A03(this.A02)) * 31) + C18200wM.A07(this.A03)) * 31) + this.A01;
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("DrawableResImageResource(drawableRes=");
        A0s.append(this.A00);
        A0s.append(", colorType=");
        A0s.append(this.A02);
        A0s.append(", strokeColorType=");
        A0s.append(this.A03);
        A0s.append(", strokeWidthRes=");
        A0s.append(this.A01);
        return AnonymousClass0wJ.A0u(A0s);
    }

    public C128067iI(Integer num, Integer num2, int i, int i2) {
        this.A00 = i;
        this.A02 = num;
        this.A03 = num2;
        this.A01 = i2;
    }
}
