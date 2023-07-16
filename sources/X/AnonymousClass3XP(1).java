package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

/* renamed from: X.3XP  reason: invalid class name */
public final class AnonymousClass3XP {
    public static final AnonymousClass3XP A00 = new AnonymousClass3XP();
    public static final String A01 = AnonymousClass00U.A0L("RapidFeedbackSettings", "_ENABLE_COOL_DOWN");
    public static final String A02 = AnonymousClass00U.A0L("RapidFeedbackSettings", "_LAST_REQUEST");
    public static final String A03 = AnonymousClass00U.A0L("RapidFeedbackSettings", "_LAST_SEEN");

    public static final synchronized SharedPreferences A00(Context context, AnonymousClass3XP r1) {
        SharedPreferences defaultSharedPreferences;
        synchronized (r1) {
            defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
            C04220Ms.A06(defaultSharedPreferences);
        }
        return defaultSharedPreferences;
    }
}
