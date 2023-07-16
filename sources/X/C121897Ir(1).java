package X;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.7Ir  reason: invalid class name and case insensitive filesystem */
public final class C121897Ir {
    public static C971568d A00(Map map) {
        String str;
        if (Build.VERSION.SDK_INT >= 33) {
            str = I17.A00(46);
        } else {
            str = "android.permission.READ_EXTERNAL_STORAGE";
        }
        return (C971568d) map.get(str);
    }

    public static boolean A04(Context context) {
        String[] strArr;
        int i = Build.VERSION.SDK_INT;
        String A00 = AnonymousClass000.A00(25);
        if (i >= 29) {
            strArr = new String[]{A00, "android.permission.ACCESS_MEDIA_LOCATION"};
        } else {
            strArr = new String[]{A00};
        }
        return AnonymousClass7K8.A06(context, strArr);
    }

    public static String[] A05(Context context) {
        if (Build.VERSION.SDK_INT >= 33 && context.getApplicationInfo().targetSdkVersion >= 33) {
            return new String[]{I17.A00(46), I17.A00(486), "android.permission.ACCESS_MEDIA_LOCATION"};
        }
        if (Build.VERSION.SDK_INT >= 29) {
            return new String[]{"android.permission.READ_EXTERNAL_STORAGE", "android.permission.ACCESS_MEDIA_LOCATION"};
        }
        return new String[]{"android.permission.READ_EXTERNAL_STORAGE"};
    }

    public static Map A01(Activity activity) {
        C971568d r0;
        String[] A05 = A05(activity);
        HashMap A0y = AnonymousClass0wJ.A0y();
        for (String str : A05) {
            if (C18180wK.A1W(activity.checkSelfPermission(str))) {
                r0 = C971568d.GRANTED;
            } else if (AnonymousClass7K8.A03(activity, str)) {
                r0 = C971568d.DENIED;
            } else {
                r0 = C971568d.DENIED_DONT_ASK_AGAIN;
            }
            A0y.put(str, r0);
        }
        return A0y;
    }

    public static void A02(Activity activity, C144608im r2) {
        AnonymousClass7K8.A02(activity, r2, A05(activity));
    }

    public static boolean A03(Context context) {
        return AnonymousClass7K8.A06(context, A05(context));
    }
}
