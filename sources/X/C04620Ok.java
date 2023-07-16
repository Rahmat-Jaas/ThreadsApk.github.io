package X;

import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;
import kotlin.jvm.internal.IDxLambdaShape880S0100000_I2;

/* renamed from: X.0Ok  reason: invalid class name and case insensitive filesystem */
public final class C04620Ok {
    public static final C06810aP A00(UserSession userSession) {
        C04220Ms.A0B(userSession, 0);
        return (C06810aP) userSession.A01(C06810aP.class, new IDxLambdaShape880S0100000_I2(userSession, 7));
    }

    public final User A01(UserSession userSession) {
        C04220Ms.A0B(userSession, 0);
        return A00(userSession).A00();
    }
}
