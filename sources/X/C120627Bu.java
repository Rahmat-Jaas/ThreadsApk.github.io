package X;

import android.content.Context;
import com.instagram.service.session.UserSession;

/* renamed from: X.7Bu  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C120627Bu {
    public static String A01(C144928jW r2, UserSession userSession) {
        C04220Ms.A0B(userSession, 1);
        return AnonymousClass00U.A0N(r2.dbFilenamePrefix(), userSession.getUserId(), '_');
    }

    public static boolean A02(C144928jW r2, UserSession userSession) {
        C04220Ms.A0B(userSession, 1);
        return C10600ic.A00.deleteDatabase(A01(r2, userSession));
    }

    public static C41012LuB A00(C144928jW r2, UserSession userSession, Class cls) {
        Context context = C10600ic.A00;
        C04220Ms.A06(context);
        return C98506Fu.A00(context, cls, A01(r2, userSession));
    }
}
