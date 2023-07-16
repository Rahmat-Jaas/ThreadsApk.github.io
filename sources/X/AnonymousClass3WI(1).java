package X;

import com.facebook.redex.IDxConsumerShape376S0100000_1_I2;
import com.instagram.service.session.UserSession;
import kotlin.jvm.internal.KtLambdaShape65S0100000_I2_45;

/* renamed from: X.3WI  reason: invalid class name */
public final class AnonymousClass3WI {
    public static final C32155H7n A00(UserSession userSession) {
        C04220Ms.A0B(userSession, 0);
        return (C32155H7n) userSession.A01(C32155H7n.class, new KtLambdaShape65S0100000_I2_45(userSession, 41));
    }

    public static void A01(C37010Jil jil, UserSession userSession, Object obj, boolean z) {
        if (A00(userSession).A01() && C35402Nh.A00(userSession).booleanValue()) {
            AnonymousClass3A4 A00 = AnonymousClass2NO.A00(userSession);
            jil.A02(new IDxConsumerShape376S0100000_1_I2(obj, 2), A00.A00.A0F(new AnonymousClass48Y(A00, 2, 2, z)));
        }
    }

    public static boolean A02(UserSession userSession) {
        return A00(userSession).A01();
    }
}
