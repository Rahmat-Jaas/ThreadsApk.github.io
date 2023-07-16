package X;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.instagram.service.session.UserSession;
import java.util.Set;

/* renamed from: X.5yW  reason: invalid class name */
public final class AnonymousClass5yW extends C10660ii {
    public static final Set A00 = ImmutableSet.A04(new Object[]{"wellbeing_timeinapp_perf", "wellbeing_timeinapp_intervals"}, 2);

    public final void logEvent(String str, String str2, String str3, boolean z, double d) {
        if (A00.contains(str)) {
            super.logEvent(str, str2, str3, z, d);
        }
    }

    public AnonymousClass5yW(UserSession userSession) {
        super(ImmutableMap.of("timeinapp_session_id", userSession.getUserId()), userSession, "TimeInAppXAnalytics");
    }
}
