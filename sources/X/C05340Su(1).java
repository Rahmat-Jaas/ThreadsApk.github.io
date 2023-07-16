package X;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: X.0Su  reason: invalid class name and case insensitive filesystem */
public final class C05340Su {
    public static SharedPreferences A00(Context context, Integer num) {
        int i;
        String A0L = AnonymousClass00U.A0L("rti.mqtt.", AnonymousClass0XT.A00(num));
        switch (num.intValue()) {
            case 1:
            case 2:
            case 4:
            case 5:
                i = 4;
                break;
            default:
                i = 0;
                break;
        }
        return context.getSharedPreferences(A0L, i);
    }
}
