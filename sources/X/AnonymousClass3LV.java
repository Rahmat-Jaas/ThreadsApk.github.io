package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.SpannableString;
import android.text.style.ImageSpan;
import com.instagram.barcelona.R;

/* renamed from: X.3LV  reason: invalid class name */
public final class AnonymousClass3LV {
    public static final CharSequence A01(Context context, int i, boolean z) {
        SpannableString spannableString = new SpannableString(AnonymousClass0wJ.A0l(context, AnonymousClass00U.A0J("❏ ", i + 1), 2131824195));
        int A0G = AnonymousClass8bP.A0G(spannableString, 10063, 0, 6);
        if (A0G != -1) {
            spannableString.setSpan(A00(context, true, z), A0G, A0G + 1, 33);
        }
        return spannableString;
    }

    public static final ImageSpan A00(Context context, boolean z, boolean z2) {
        Drawable drawable = context.getDrawable(R.drawable.instagram_carousel_pano_outline_24);
        if (drawable == null) {
            return null;
        }
        Resources resources = context.getResources();
        int i = R.dimen.abc_text_size_menu_header_material;
        if (z2) {
            i = R.dimen.backup_codes_text_size;
        }
        int dimension = (int) resources.getDimension(i);
        int i2 = 2;
        drawable.setBounds(0, 2, dimension, dimension + 2);
        Drawable mutate = drawable.mutate();
        int i3 = R.attr.textColorSecondary;
        if (z) {
            i3 = R.attr.textColorPrimary;
        }
        mutate.setTint(C121907Is.A00(context, i3));
        if (Build.VERSION.SDK_INT < 29) {
            i2 = 1;
        }
        return new ImageSpan(drawable, i2);
    }
}
