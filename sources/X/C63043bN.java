package X;

import android.content.SharedPreferences;
import com.google.gson.Gson;
import com.instagram.api.schemas.ScreenTimeScreenType;
import com.instagram.service.session.UserSession;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.3bN  reason: invalid class name and case insensitive filesystem */
public final class C63043bN {
    public static final C62803am A01 = new C62803am();
    public static final List A02 = C18200wM.A0s(C18180wK.A0n(ScreenTimeScreenType.GUARDIAN_DAILY_LIMIT_BLOCKING_SCREEN));
    public final SharedPreferences A00;

    public static final boolean A02(UserSession userSession) {
        Integer B94;
        int intValue;
        C04220Ms.A0B(userSession, 0);
        C84674tf A0Z = AnonymousClass0wJ.A0Y(userSession).A0Z();
        if (A0Z == null || (B94 = A0Z.B94()) == null || (intValue = B94.intValue()) < 0 || ((long) intValue) <= 0) {
            return false;
        }
        return true;
    }

    public static final long A00(UserSession userSession) {
        C62803am r5 = A01;
        long j = 0;
        if (C63803iN.A0E(C18180wK.A0J(userSession), userSession, 36322370918554945L)) {
            for (ScreenTimeScreenType screenTimeScreenType : A02) {
                String obj = screenTimeScreenType.toString();
                C04220Ms.A0B(obj, 1);
                j = j + C18180wK.A05(r5.A06(userSession), AnonymousClass00U.A0L("AGGREGATED_SCREEN_TIME_BY_SCREEN_", obj)) + r5.A03(screenTimeScreenType, userSession);
            }
        }
        return j;
    }

    public static final List A01(UserSession userSession) {
        C62803am r1 = A01;
        C04220Ms.A0B(userSession, 0);
        ArrayList A0v = AnonymousClass0wJ.A0v();
        String A0W = C18250wR.A0W(r1.A06(userSession), "AGGREGATED_TIME_SPENT_PER_DAY");
        if (A0W != null && !C18180wK.A1W(A0W.length())) {
            try {
                List list = (List) new Gson().A06(A0W, A0v.getClass());
                if (list != null) {
                    return list;
                }
            } catch (LWW | IllegalStateException unused) {
                C10450iM.A03("TimeSpentPreferences", "Corrupted Aggregated Time Spent Data");
            }
        }
        return A0v;
    }

    public C63043bN(UserSession userSession) {
        this.A00 = AnonymousClass3Zs.A03(userSession).A02(D2R.A2V, getClass());
    }
}
