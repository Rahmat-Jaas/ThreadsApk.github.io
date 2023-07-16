package X;

import android.content.ComponentName;
import android.content.Context;

/* renamed from: X.6GX  reason: invalid class name */
public final class AnonymousClass6GX {
    public static void A00(ComponentName componentName, Context context, IllegalArgumentException illegalArgumentException) {
        int componentEnabledSetting = context.getPackageManager().getComponentEnabledSetting(componentName);
        if (componentEnabledSetting == 1 || componentEnabledSetting == 0) {
            throw illegalArgumentException;
        }
    }
}
