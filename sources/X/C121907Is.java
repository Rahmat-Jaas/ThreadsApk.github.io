package X;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import com.instagram.barcelona.R;

/* renamed from: X.7Is  reason: invalid class name and case insensitive filesystem */
public final class C121907Is {
    public static int A00(Context context, int i) {
        Resources.Theme theme = context.getTheme();
        TypedValue typedValue = new TypedValue();
        theme.resolveAttribute(i, typedValue, true);
        return typedValue.data;
    }

    public static int A01(Context context, int i) {
        return (int) C86104wH.A0G(context, i).getDimension(C18230wP.A0E(context));
    }

    public static int A02(Context context, int i) {
        return C86104wH.A0G(context, i).resourceId;
    }

    public static ContextThemeWrapper A03(Context context, int i) {
        return new ContextThemeWrapper(context, C86104wH.A0G(context, i).resourceId);
    }

    public static String A04(Context context) {
        return C86104wH.A0G(context, R.attr.appName).string.toString();
    }

    public static boolean A05(Context context, int i, boolean z) {
        TypedValue A0G = C86104wH.A0G(context, i);
        if (A0G.type == 18) {
            return C18180wK.A1V(A0G.data);
        }
        return z;
    }
}
