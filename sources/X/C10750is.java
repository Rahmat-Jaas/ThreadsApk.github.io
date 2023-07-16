package X;

import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.service.session.UserSession;
import java.util.Map;

/* renamed from: X.0is  reason: invalid class name and case insensitive filesystem */
public final class C10750is {
    public static final void A00(UserSession userSession, String str, String str2) {
        C04220Ms.A0B(userSession, 0);
        C04220Ms.A0B(str2, 2);
        A01(userSession, str, str2, (Throwable) null);
    }

    public static final void A01(UserSession userSession, String str, String str2, Throwable th) {
        C04220Ms.A0B(userSession, 0);
        C04220Ms.A0B(str2, 2);
        A04(userSession, str, th, AnonymousClass4WK.A0O(C54682zq.A00(DialogModule.KEY_MESSAGE, str2)));
    }

    public static final void A02(UserSession userSession, String str, Throwable th) {
        C04220Ms.A0B(userSession, 0);
        A04(userSession, str, th, AnonymousClass4WJ.A0A());
    }

    public static final void A04(UserSession userSession, String str, Throwable th, Map map) {
        C04220Ms.A0B(userSession, 0);
        C04220Ms.A0B(str, 1);
        C14100oo ABJ = C10770iu.A00().ABJ(str, 817903358);
        if (th != null) {
            ABJ.Ciu(th);
        }
        for (Map.Entry entry : map.entrySet()) {
            ABJ.A8U((String) entry.getKey(), (String) entry.getValue());
        }
        ABJ.report();
    }
}
