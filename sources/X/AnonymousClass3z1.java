package X;

import android.app.job.JobParameters;
import android.content.Context;
import com.facebook.common.callercontext.CallerContextable;
import com.instagram.common.api.base.IDxACallbackShape7S0400000_4_I2;
import com.instagram.service.session.UserSession;

/* renamed from: X.3z1  reason: invalid class name */
public final class AnonymousClass3z1 implements CallerContextable {
    public static final C83224qz A00 = C84874u0.A00(C18250wR.A0J((AnonymousClass0gW) null, 3), 728039861, 3);
    public static final String __redex_internal_original_name = "LocalNotificationApi";

    public static final void A01(UserSession userSession, Long l, String str) {
        C04220Ms.A0B(userSession, 0);
        H1T A0O = AnonymousClass0wJ.A0O(userSession);
        A0O.A0B(IZ2.class, C36509JYx.class);
        A0O.A0J("notifications/bump_local_notifs_caps/");
        A0O.A0O("notif_type", str);
        String valueOf = String.valueOf(l);
        if (valueOf == null) {
            valueOf = "";
        }
        C31155GhB.A03(C18200wM.A0T(A0O, "actor_id", valueOf));
    }

    public static final void A00(JobParameters jobParameters, Context context, C27903EvE evE, UserSession userSession, boolean z) {
        long A08;
        AnonymousClass0wJ.A1N(userSession, evE);
        IDxACallbackShape7S0400000_4_I2 iDxACallbackShape7S0400000_4_I2 = new IDxACallbackShape7S0400000_4_I2(0, jobParameters, context, evE, userSession);
        if (z) {
            A08 = 1463140413;
        } else {
            A08 = C18190wL.A08(C18220wO.A0f(AnonymousClass3WS.A01(userSession).A09));
        }
        H1T A0P = AnonymousClass0wJ.A0P(userSession);
        A0P.A0B(FNU.class, AnonymousClass3NT.class);
        A0P.A0J("notifications/get_local_notifs/");
        A0P.A0L("last_received_time", A08);
        C32165H8c A02 = A0P.A02();
        A02.A00 = iDxACallbackShape7S0400000_4_I2;
        C31155GhB.A03(A02);
    }
}
