package X;

import android.content.Context;
import android.content.SharedPreferences;
import com.instagram.service.session.UserSession;
import kotlin.jvm.internal.KtLambdaShape94S0100000_I2_74;

/* renamed from: X.3Zs  reason: invalid class name */
public final class AnonymousClass3Zs {
    public static SharedPreferences.Editor A00(UserSession userSession) {
        C04220Ms.A0B(userSession, 0);
        return A03(userSession).A01(D2R.A0v).edit();
    }

    public static SharedPreferences A02(String str) {
        C04220Ms.A0B(str, 0);
        return A01(D2R.A0v, str);
    }

    public static final C696949q A03(UserSession userSession) {
        C04220Ms.A0B(userSession, 0);
        return (C696949q) userSession.A01(C696949q.class, new KtLambdaShape94S0100000_I2_74(userSession, 14));
    }

    public static final SharedPreferences A01(D2R d2r, String str) {
        boolean A1V = C18210wN.A1V(d2r);
        Context context = C10600ic.A00;
        C04220Ms.A06(context);
        return new C08400dJ(context.getSharedPreferences(AnonymousClass00U.A0N(str, d2r.A00, '_'), A1V ? 1 : 0));
    }
}
