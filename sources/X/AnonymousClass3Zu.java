package X;

import android.content.SharedPreferences;
import com.instagram.service.session.UserSession;
import kotlin.jvm.internal.KtLambdaShape116S0100000_I2_96;

/* renamed from: X.3Zu  reason: invalid class name */
public final class AnonymousClass3Zu {
    public static final AnonymousClass3ZL A03(UserSession userSession) {
        C04220Ms.A0B(userSession, 0);
        return (AnonymousClass3ZL) userSession.A01(AnonymousClass3ZL.class, new KtLambdaShape116S0100000_I2_96(userSession, 29));
    }

    public static SharedPreferences.Editor A00(SharedPreferences.Editor editor, UserSession userSession, String str) {
        editor.remove(str).apply();
        return A03(userSession).A04.edit();
    }

    public static SharedPreferences.Editor A01(UserSession userSession) {
        return A03(userSession).A04.edit();
    }

    public static SharedPreferences A02(UserSession userSession) {
        return A03(userSession).A04;
    }
}
