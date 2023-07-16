package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.widget.TextView;
import com.instagram.barcelona.R;

/* renamed from: X.3Lp  reason: invalid class name and case insensitive filesystem */
public final class C59633Lp {
    public static final Drawable A00(Context context, boolean z) {
        int i = R.drawable.instagram_icons_exceptions_crown_badge_purple_filled_12;
        if (z) {
            i = R.drawable.instagram_icons_exceptions_crown_badge_purple_filled_16;
        }
        Drawable drawable = context.getDrawable(i);
        if (drawable == null) {
            return null;
        }
        Drawable mutate = drawable.mutate();
        if (mutate != null) {
            mutate.setBounds(0, 0, mutate.getIntrinsicWidth(), mutate.getIntrinsicHeight());
        }
        return mutate;
    }

    public static final SpannableStringBuilder A01(TextView textView, String str, boolean z) {
        AnonymousClass0wJ.A1N(textView, str);
        Context A0A = C18190wL.A0A(textView);
        Drawable A00 = A00(A0A, z);
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(str);
        valueOf.append(" ");
        F32 f32 = new F32(A00);
        f32.A00 = C18240wQ.A01(A0A, 4);
        valueOf.setSpan(f32, valueOf.length() - 1, valueOf.length(), 33);
        return valueOf;
    }
}
