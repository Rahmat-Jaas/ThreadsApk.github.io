package X;

import com.instagram.realtimeclient.RealtimeClientManager;
import com.instagram.service.session.UserSession;

/* renamed from: X.4Jc  reason: invalid class name and case insensitive filesystem */
public final class C71514Jc implements RealtimeClientManager.PresenceMsysAppStateChangeObserverProvider {
    public static final C71514Jc A00 = new C71514Jc();

    public final RealtimeClientManager.PresenceMsysAppStateChangeObserver get(UserSession userSession) {
        return new C71504Jb(userSession);
    }
}
