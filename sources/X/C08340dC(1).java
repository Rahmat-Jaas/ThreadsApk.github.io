package X;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: X.0dC  reason: invalid class name and case insensitive filesystem */
public final class C08340dC {
    public static final SharedPreferences A00(Context context, String str) {
        C04220Ms.A0B(context, 0);
        C04220Ms.A0B(str, 1);
        return new C08400dJ(context.getSharedPreferences(str, 0));
    }

    public static final SharedPreferences A01(String str) {
        C04220Ms.A0B(str, 0);
        Context context = C10600ic.A00;
        C04220Ms.A06(context);
        return A00(context, str);
    }
}
