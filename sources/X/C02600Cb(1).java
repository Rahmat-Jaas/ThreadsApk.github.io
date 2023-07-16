package X;

import android.app.AlarmManager;
import android.content.Context;
import android.os.Build;

/* renamed from: X.0Cb  reason: invalid class name and case insensitive filesystem */
public final class C02600Cb {
    public static boolean A00(AlarmManager alarmManager, Context context) {
        boolean z = false;
        if (context.getApplicationInfo().targetSdkVersion > 30) {
            z = true;
        }
        boolean z2 = false;
        if (Build.VERSION.SDK_INT > 30) {
            z2 = true;
        }
        if (!z || !z2) {
            return true;
        }
        try {
            return alarmManager.canScheduleExactAlarms();
        } catch (RuntimeException e) {
            AnonymousClass0LU.A0F("AndroidCompat", "failed to check canScheduleExactAlarms. Reverting to false", e);
            return false;
        }
    }
}
