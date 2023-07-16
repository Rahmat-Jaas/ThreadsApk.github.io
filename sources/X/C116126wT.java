package X;

import android.content.ComponentName;
import android.content.Context;

/* renamed from: X.6wT  reason: invalid class name and case insensitive filesystem */
public final class C116126wT {
    static {
        M2O.A01("PackageManagerHelper");
    }

    public static void A00(Context context, Class cls, boolean z) {
        try {
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, cls.getName()), C86164wN.A04(z ? 1 : 0), 1);
            M2O.A00();
        } catch (Exception unused) {
            M2O.A00();
        }
    }
}
