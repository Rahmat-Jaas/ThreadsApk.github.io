package X;

import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S5200000_I2;
import com.instagram.service.session.UserSession;
import kotlin.jvm.internal.KtLambdaShape60S0100000_I2_40;

/* renamed from: X.3bQ  reason: invalid class name and case insensitive filesystem */
public final class C63073bQ {
    public static final C696249i A00(UserSession userSession) {
        C04220Ms.A0B(userSession, 0);
        return (C696249i) userSession.A01(C696249i.class, new KtLambdaShape60S0100000_I2_40(userSession, 38));
    }

    public final boolean A04(KtCSuperShape0S5200000_I2 ktCSuperShape0S5200000_I2, C209416t r5, UserSession userSession) {
        C04220Ms.A0B(userSession, 0);
        if (ktCSuperShape0S5200000_I2 == null || !A03(userSession) || r5.A00 || !r5.A05 || !C63803iN.A0E(AnonymousClass0TJ.A05, userSession, 36318771735958266L)) {
            return false;
        }
        return true;
    }

    public static final boolean A02(C209416t r2) {
        AnonymousClass21z r22 = r2.A01;
        if (r22 == AnonymousClass21z.MATCHED || r22 == AnonymousClass21z.SHRINKING) {
            return true;
        }
        return false;
    }

    public static C209416t A01(UserSession userSession) {
        return A00(userSession).A04();
    }

    public static final boolean A03(UserSession userSession) {
        if (C35692Ol.A00(userSession).A05(C696249i.A06, "ig_to_fb_audience_setting")) {
            C04620Ok r2 = C06810aP.A01;
            if ((C18200wM.A0b(userSession, r2) == AnonymousClass266.A06 || C18200wM.A0b(userSession, r2) == AnonymousClass266.A05) && !C67373zR.A0D(userSession)) {
                return true;
            }
        }
        return false;
    }
}
