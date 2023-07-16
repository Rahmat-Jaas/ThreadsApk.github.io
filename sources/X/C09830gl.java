package X;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;

/* renamed from: X.0gl  reason: invalid class name and case insensitive filesystem */
public final class C09830gl {
    public static void A00(Context context, String str) {
        A01(context, str, (String) null);
    }

    public static void A01(Context context, String str, String str2) {
        Object string;
        if (TextUtils.isEmpty(str2)) {
            PackageManager packageManager = context.getPackageManager();
            ApplicationInfo applicationInfo = null;
            if (packageManager != null) {
                try {
                    applicationInfo = packageManager.getApplicationInfo(context.getApplicationInfo().packageName, 0);
                } catch (PackageManager.NameNotFoundException unused) {
                }
                if (applicationInfo != null) {
                    string = packageManager.getApplicationLabel(applicationInfo);
                    str2 = String.valueOf(string);
                }
            }
            string = context.getString(17039375);
            str2 = String.valueOf(string);
        }
        ((ClipboardManager) context.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText(str2, str));
    }
}
