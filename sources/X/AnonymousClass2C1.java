package X;

import android.content.Context;
import android.os.Build;
import android.provider.Telephony;
import android.telephony.TelephonyManager;

/* renamed from: X.2C1  reason: invalid class name */
public final class AnonymousClass2C1 {
    public static boolean A00(Context context) {
        if (AnonymousClass01R.A00(context, "android.permission.READ_PHONE_NUMBERS") == 0 || (((Build.VERSION.SDK_INT < 30 || context.getApplicationContext().getApplicationInfo().targetSdkVersion < 30) && AnonymousClass01R.A00(context, "android.permission.READ_PHONE_STATE") == 0) || AnonymousClass01R.A00(context, "android.permission.READ_SMS") == 0 || context.getPackageName().equals(Telephony.Sms.getDefaultSmsPackage(context)))) {
            return true;
        }
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        return telephonyManager != null && telephonyManager.hasCarrierPrivileges();
    }
}
