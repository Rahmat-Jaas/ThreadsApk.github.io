package com.instagram.debug.devoptions.igns;

import X.C04220Ms;
import X.C111686o9;
import X.C147138nS;
import X.C27952Ew2;
import X.C29110FiC;
import X.C62793ak;
import X.C696549m;
import X.C76284dm;
import X.C98376Fg;
import X.M5J;
import com.instagram.service.session.UserSession;

public final class InternalIgNotificationListViewModel extends C62793ak {
    public final M5J notifications;

    public final class Factory implements C147138nS {
        public final UserSession userSession;

        public Factory(UserSession userSession2) {
            C04220Ms.A0B(userSession2, 1);
            this.userSession = userSession2;
        }

        public /* synthetic */ C62793ak create(Class cls, C111686o9 r3) {
            return C98376Fg.A00(this, cls);
        }

        public C62793ak create(Class cls) {
            UserSession userSession2 = this.userSession;
            C04220Ms.A0B(userSession2, 0);
            return new InternalIgNotificationListViewModel((C696549m) userSession2.A01(C696549m.class, C76284dm.A00));
        }
    }

    public InternalIgNotificationListViewModel(C696549m r4) {
        C04220Ms.A0B(r4, 1);
        this.notifications = C29110FiC.A00((C27952Ew2) null, r4.A01, 3);
    }

    public final M5J getNotifications() {
        return this.notifications;
    }
}
