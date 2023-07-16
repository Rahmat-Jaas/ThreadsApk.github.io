package X;

import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;
import java.util.HashMap;
import kotlin.jvm.internal.KtLambdaShape116S0100000_I2_96;

/* renamed from: X.3Op  reason: invalid class name and case insensitive filesystem */
public final class C60333Op {
    public static final C695849e A00(UserSession userSession) {
        C04220Ms.A0B(userSession, 0);
        return (C695849e) userSession.A01(C695849e.class, new KtLambdaShape116S0100000_I2_96(userSession, 24));
    }

    public static final HashMap A01(UserSession userSession) {
        User A00;
        String str;
        HashMap A0y = AnonymousClass0wJ.A0y();
        if (!C60343Oq.A01(userSession) && (A00 = C04660Oo.A00(userSession)) != null) {
            C84024sQ A002 = C67303zK.A00(userSession, A00);
            if (A002 != null) {
                str = C59123Jp.A00(A002);
            } else {
                str = null;
            }
            C04220Ms.A0B(userSession, 0);
            A0y.put("page_token_id", C62953bC.A02(userSession, "page_id"));
            A0y.put("server_page_id", str);
        }
        return A0y;
    }
}
