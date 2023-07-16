package X;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;

/* renamed from: X.0tW  reason: invalid class name and case insensitive filesystem */
public abstract class C16660tW {
    public static boolean A01(Context context) {
        if (context instanceof Activity) {
            return true;
        }
        if (context instanceof ContextWrapper) {
            return A01(((ContextWrapper) context).getBaseContext());
        }
        return false;
    }

    public static final boolean A02(Context context, Intent intent) {
        if ((intent.getFlags() & 268435456) != 0 || A01(context)) {
            return false;
        }
        intent.addFlags(268435456);
        return true;
    }
}
