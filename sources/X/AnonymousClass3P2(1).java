package X;

import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0060000_I2;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0600000_I2;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.service.session.UserSession;

/* renamed from: X.3P2  reason: invalid class name */
public final class AnonymousClass3P2 {
    public static final KtCSuperShape0S0060000_I2 A00(UserSession userSession) {
        C04220Ms.A0B(userSession, 0);
        AnonymousClass3ZL A03 = AnonymousClass3Zu.A03(userSession);
        return new KtCSuperShape0S0060000_I2(1, C18180wK.A1Z(AnonymousClass0wJ.A0Y(userSession).A0e(), C169839tz.PrivacyStatusPublic), C67343zO.A03(userSession), C61453Tm.A00(userSession), C62183Xq.A00(userSession), C18190wL.A1X(A03.A04, "PREFERENCE_REELS_IS_AUTO_CROSS_POST_TO_FACEBOOK_ENABLED"), A03.A08());
    }

    public static final boolean A01(AnonymousClass2AC r10, KtCSuperShape0S0600000_I2 ktCSuperShape0S0600000_I2, UserSession userSession, AnonymousClass3VY r13, C61813Vs r14, String str) {
        long j;
        AnonymousClass2AC r6 = r10;
        AnonymousClass0wJ.A1M(str, 1, r6);
        if (r14.A05(r6, ktCSuperShape0S0600000_I2, userSession, r13, str)) {
            if (!(r14 instanceof C28881vi) && !(r14 instanceof C28871vh) && !(r14 instanceof C28861vg) && !(r14 instanceof C28851vf) && !(r14 instanceof C28841ve) && !(r14 instanceof C28831vd) && !(r14 instanceof C28821vc) && !(r14 instanceof C28811vb) && !(r14 instanceof C28801va)) {
                boolean z = r14 instanceof AnonymousClass1vZ;
                AnonymousClass0TJ A0J = C18180wK.A0J(userSession);
                if (z) {
                    j = 36327172692060055L;
                } else {
                    j = 36327172691994518L;
                }
                if (C63803iN.A0E(A0J, userSession, j) || C63803iN.A0E(A0J, userSession, 36327683793168499L)) {
                    AnonymousClass0LU.A0B("CLNoticeManager", "Failed Eligibility Rule: Launcher value mismatch");
                    if (r13 != null) {
                        r13.A02(TraceFieldType.FailureReason, "launcher_mismatch");
                    }
                }
            }
            return true;
        }
        return false;
    }
}
