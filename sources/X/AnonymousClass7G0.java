package X;

import com.instagram.service.session.UserSession;
import kotlin.jvm.internal.KtLambdaShape97S0100000_I2_77;

/* renamed from: X.7G0  reason: invalid class name */
public final class AnonymousClass7G0 {
    public static final AW8 A00(UserSession userSession) {
        C04220Ms.A0B(userSession, 0);
        return (AW8) userSession.A01(AW8.class, new KtLambdaShape97S0100000_I2_77(userSession, 41));
    }

    public static final boolean A01(UserSession userSession) {
        C04220Ms.A0B(userSession, 0);
        if (!C19573AyZ.A03(userSession) || !C63803iN.A0E(AnonymousClass0TJ.A05, userSession, 36324698790830718L)) {
            return false;
        }
        return true;
    }

    public static final boolean A02(UserSession userSession) {
        C04220Ms.A0B(userSession, 0);
        if (!C19573AyZ.A03(userSession) || !C63803iN.A0E(AnonymousClass0TJ.A05, userSession, 36325274316448795L)) {
            return false;
        }
        return true;
    }

    public static final boolean A03(UserSession userSession, boolean z) {
        boolean A0E;
        C04220Ms.A0B(userSession, 0);
        AnonymousClass0TJ r3 = AnonymousClass0TJ.A06;
        if (C63803iN.A0E(r3, userSession, 36316190460808191L) || C63803iN.A0E(r3, userSession, 36316190461266950L)) {
            return false;
        }
        if (z) {
            A0E = C63803iN.A0E(AnonymousClass0TJ.A05, userSession, 36320627162028128L);
        } else {
            A0E = C63803iN.A0E(r3, userSession, 36320627162028128L);
        }
        if (!C18210wN.A1W(A0E)) {
            return false;
        }
        if (C63803iN.A0E(r3, userSession, 36320627161831517L) || C63803iN.A0E(r3, userSession, 36320627161897054L)) {
            return true;
        }
        return false;
    }
}
