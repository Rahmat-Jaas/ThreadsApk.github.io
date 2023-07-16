package com.instagram.realtimeclient.bugreport;

import X.C04560Oe;
import com.instagram.realtimeclient.RealtimeClientManager;
import com.instagram.service.session.UserSession;

public final class RealtimeLogsProvider$Companion$create$1 implements C04560Oe {
    public final /* synthetic */ UserSession $userSession;

    public RealtimeLogsProvider$Companion$create$1(UserSession userSession) {
        this.$userSession = userSession;
    }

    public final RealtimeClientManager get() {
        return RealtimeClientManager.getInstance(this.$userSession);
    }
}
