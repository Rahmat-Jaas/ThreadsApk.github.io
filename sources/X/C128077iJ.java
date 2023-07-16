package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import com.instagram.barcelona.R;

/* renamed from: X.7iJ  reason: invalid class name and case insensitive filesystem */
public final class C128077iJ implements C146998nD {
    public final Integer A00;
    public final Integer A01;
    public final Integer A02;
    public final Integer A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C128077iJ) {
                C128077iJ r5 = (C128077iJ) obj;
                if (!C04220Ms.A0I(this.A01, r5.A01) || !C04220Ms.A0I(this.A00, r5.A00) || !C04220Ms.A0I(this.A02, r5.A02) || !C04220Ms.A0I(this.A03, r5.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    private final Drawable A00(Context context) {
        Integer num;
        Drawable drawable;
        Integer num2 = this.A01;
        if (num2 == null || (num = this.A00) == null || this.A02 == null || this.A03 == null) {
            return null;
        }
        C111566nt A0D = AnonymousClass7Kz.A0D();
        int intValue = num2.intValue();
        int intValue2 = num.intValue();
        if (intValue == 0) {
            drawable = context.getDrawable(R.drawable.instagram_circle_check_filled_16);
            if (drawable == null) {
                throw C18180wK.A0a("Required value was null.");
            }
        } else if (intValue == 1) {
            drawable = context.getDrawable(R.drawable.instagram_error_filled_24);
            if (drawable == null) {
                throw C18180wK.A0a("Required value was null.");
            }
        } else if (intValue == 2) {
            drawable = context.getDrawable(R.drawable.instagram_x_outline_16);
            if (drawable == null) {
                throw C18180wK.A0a("Required value was null.");
            }
        } else if (intValue == 4) {
            drawable = context.getDrawable(R.drawable.instagram_chevron_right_pano_outline_16);
            if (drawable == null) {
                throw C18180wK.A0a("Required value was null.");
            }
        } else {
            throw C18190wL.A0a(AnonymousClass00U.A0J("Invalid icon type: ", intValue));
        }
        drawable.setTint(A0D.A00(context, intValue2));
        return drawable;
    }

    public final int hashCode() {
        return (((((AnonymousClass0wJ.A03(this.A01) * 31) + AnonymousClass0wJ.A03(this.A00)) * 31) + AnonymousClass0wJ.A03(this.A02)) * 31) + C18200wM.A07(this.A03);
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("ThemedImageResource(iconName=");
        A0s.append(this.A01);
        A0s.append(", colorType=");
        A0s.append(this.A00);
        A0s.append(", iconSize=");
        A0s.append(this.A02);
        A0s.append(", iconVariant=");
        return C86104wH.A0y(this.A03, A0s);
    }

    public C128077iJ(Integer num, Integer num2, Integer num3, Integer num4) {
        this.A01 = num;
        this.A00 = num2;
        this.A02 = num3;
        this.A03 = num4;
    }

    public final void Bao(ImageView imageView) {
        Drawable A002 = A00(C18190wL.A0A(imageView));
        if (A002 != null) {
            imageView.setImageDrawable(A002);
        }
    }

    public final void Chv(View view) {
        Drawable A002 = A00(C18190wL.A0A(view));
        if (A002 != null) {
            view.setBackground(A002);
        }
    }
}
