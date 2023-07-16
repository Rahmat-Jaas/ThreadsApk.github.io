package X;

import android.content.res.Resources;
import android.text.TextUtils;
import com.instagram.barcelona.R;
import java.text.NumberFormat;
import java.util.Locale;

/* renamed from: X.7I1  reason: invalid class name */
public final class AnonymousClass7I1 {
    public static String A01(Resources resources, Integer num) {
        int intValue;
        if (num != null && (intValue = num.intValue()) >= 0) {
            return C18230wP.A0j(resources, C120737Cg.A01(resources, num, false), R.plurals.number_of_views, intValue);
        }
        throw C86134wK.A0s("Cannot format null view count");
    }

    public static String A02(Resources resources, Integer num) {
        int intValue;
        if (num == null || (intValue = num.intValue()) < 0) {
            throw C86134wK.A0s("Cannot format null view count");
        } else if (intValue == 0) {
            return resources.getString(2131831765);
        } else {
            return C18230wP.A0j(resources, NumberFormat.getInstance().format(num), R.plurals.number_of_plays, intValue);
        }
    }

    public static String A03(Resources resources, Integer num, int i) {
        int intValue;
        if (num == null || (intValue = num.intValue()) < 0) {
            throw C86134wK.A0s("Cannot format null view count");
        } else if (intValue == 0) {
            return resources.getString(i);
        } else {
            return C18230wP.A0j(resources, NumberFormat.getInstance().format(num), R.plurals.number_of_views, intValue);
        }
    }

    public static String A00(Resources resources, int i) {
        return C18230wP.A0j(resources, NumberFormat.getInstance(Locale.getDefault()).format((long) i), R.plurals.number_of_likes, i);
    }

    public static boolean A04(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}
