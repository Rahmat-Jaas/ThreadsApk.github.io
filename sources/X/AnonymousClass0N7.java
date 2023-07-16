package X;

import android.content.Context;
import android.provider.Settings;

/* renamed from: X.0N7  reason: invalid class name */
public final class AnonymousClass0N7 {
    public static String A00(Context context) {
        try {
            String string = Settings.Secure.getString(context.getContentResolver(), "android_id");
            return string != null ? string : "0";
        } catch (Exception e) {
            C04790Pd.A00();
            AnonymousClass0LU.A0E("lacrima", "Failed to fetch the constant field ANDROID_ID", e);
        }
    }
}
