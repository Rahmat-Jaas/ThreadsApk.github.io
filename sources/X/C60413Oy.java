package X;

import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.instagram.service.session.UserSession;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

/* renamed from: X.3Oy  reason: invalid class name and case insensitive filesystem */
public final class C60413Oy {
    public static final boolean A01(UserSession userSession, long j) {
        C04220Ms.A0B(userSession, 1);
        if (j <= TimeUnit.HOURS.toMillis(C63803iN.A03(AnonymousClass0TJ.A06, userSession, 36597759926668003L)) || !C63803iN.A0E(AnonymousClass0TJ.A05, userSession, 36316284949892161L)) {
            return false;
        }
        return true;
    }

    public static final void A00(UserSession userSession, String str, long j) {
        boolean A1V = C18210wN.A1V(userSession);
        HashMap A0y = AnonymousClass0wJ.A0y();
        A0y.put("stale_destination_duration_in_ms", String.valueOf(j));
        USLEBaseShape0S0000000 A0P = C18200wM.A0P(userSession);
        C18190wL.A1H(A0P, userSession, str);
        A0P.A0Q("user_interaction", C18190wL.A0Z(A0P, "entry_point", "", A1V));
        C18220wO.A1G(A0P, A0y);
    }
}
