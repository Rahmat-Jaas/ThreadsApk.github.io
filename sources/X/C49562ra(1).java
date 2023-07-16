package X;

import android.content.Context;
import com.instagram.barcelona.R;

/* renamed from: X.2ra  reason: invalid class name and case insensitive filesystem */
public final class C49562ra {
    public static final String A00(Context context, Integer num) {
        String string;
        int intValue;
        C04220Ms.A0B(context, 0);
        if (num == null || (intValue = num.intValue()) == 0) {
            string = context.getResources().getString(2131835821);
        } else {
            string = C18230wP.A0j(context.getResources(), num, R.plurals.shopping_cart_count_content_description, intValue);
        }
        C04220Ms.A06(string);
        return string;
    }
}
