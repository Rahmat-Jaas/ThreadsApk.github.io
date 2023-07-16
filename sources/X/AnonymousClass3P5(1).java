package X;

import android.os.Bundle;
import com.instagram.service.session.UserSession;

/* renamed from: X.3P5  reason: invalid class name */
public final class AnonymousClass3P5 {
    public static final String A01(Bundle bundle, UserSession userSession) {
        C04220Ms.A0B(userSession, 0);
        if (bundle != null) {
            return bundle.getString("shopping_session_id");
        }
        return null;
    }

    public static final String A00(Bundle bundle, C11630kW r2, UserSession userSession) {
        String string;
        AnonymousClass0wJ.A1N(userSession, r2);
        if (bundle != null && (string = bundle.getString("shopping_session_id")) != null) {
            return string;
        }
        String A0e = C18180wK.A0e();
        C04220Ms.A06(A0e);
        return A0e;
    }
}
