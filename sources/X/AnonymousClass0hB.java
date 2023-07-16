package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import java.util.Locale;

/* renamed from: X.0hB  reason: invalid class name */
public final class AnonymousClass0hB {
    public static Boolean A00;

    public static boolean A01() {
        byte directionality;
        Boolean bool = A00;
        if (bool == null) {
            boolean z = false;
            if (!TextUtils.isEmpty(Locale.getDefault().getDisplayName()) && ((directionality = Character.getDirectionality(Locale.getDefault().getDisplayName().charAt(0))) == 1 || directionality == 2)) {
                z = true;
            }
            bool = Boolean.valueOf(z);
            A00 = bool;
        }
        return bool.booleanValue();
    }

    public static Drawable A00(Context context, int i) {
        if (!A02(context)) {
            return context.getDrawable(i);
        }
        Bitmap decodeResource = BitmapFactory.decodeResource(context.getResources(), i);
        return new AnonymousClass0hC(context.getResources(), decodeResource, decodeResource);
    }

    public static boolean A02(Context context) {
        if ((context.getApplicationInfo().flags & 4194304) == 0 || context.getResources().getConfiguration().getLayoutDirection() != 1) {
            return false;
        }
        return true;
    }
}
