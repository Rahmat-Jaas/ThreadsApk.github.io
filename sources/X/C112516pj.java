package X;

import com.instagram.service.session.UserSession;
import java.util.concurrent.TimeUnit;

/* renamed from: X.6pj  reason: invalid class name and case insensitive filesystem */
public final class C112516pj {
    public final UserSession A00;
    public final long A01;
    public final C04530Oa A02 = C86104wH.A16(this, 4);

    public C112516pj(UserSession userSession) {
        C04220Ms.A0B(userSession, 1);
        this.A00 = userSession;
        TimeUnit timeUnit = TimeUnit.HOURS;
        AnonymousClass0TJ r2 = AnonymousClass0TJ.A05;
        this.A01 = timeUnit.toSeconds(C63803iN.A03(r2, userSession, 36602372721479512L));
        C63803iN.A0E(r2, userSession, 36322065975942302L);
    }

    public final long A00(UserSession userSession) {
        AnonymousClass0TJ r3 = AnonymousClass0TJ.A05;
        if (C63803iN.A0E(r3, userSession, 36316289244990531L)) {
            return TimeUnit.HOURS.toSeconds(C63803iN.A03(r3, userSession, 36597764221635300L));
        }
        return this.A01;
    }
}
