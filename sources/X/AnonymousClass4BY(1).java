package X;

import android.os.Bundle;
import com.instagram.service.session.UserSession;

/* renamed from: X.4BY  reason: invalid class name */
public final class AnonymousClass4BY implements C82484pm {
    public final Bundle A00;
    public final UserSession A01;

    public final boolean BVr() {
        UserSession userSession = this.A01;
        if (AnonymousClass2MS.A00(userSession) && !AnonymousClass3MD.A01(AnonymousClass20y.Broadcast, userSession)) {
            AnonymousClass0TJ r4 = AnonymousClass0TJ.A05;
            if ((C63803iN.A0E(r4, userSession, 36320008692307579L) || C63803iN.A01(r4, userSession, 36601483667967688L) == 0) && !C63803iN.A0E(r4, userSession, 36320008692307579L)) {
                return true;
            }
        }
        return false;
    }

    public AnonymousClass4BY(Bundle bundle, UserSession userSession) {
        this.A01 = userSession;
        this.A00 = bundle;
    }
}
