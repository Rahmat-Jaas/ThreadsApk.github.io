package X;

import com.instagram.realtimeclient.RealtimeClientManager;
import com.instagram.service.session.UserSession;

/* renamed from: X.4Jb  reason: invalid class name and case insensitive filesystem */
public final class C71504Jb implements RealtimeClientManager.PresenceMsysAppStateChangeObserver {
    public final /* synthetic */ UserSession A00;

    public C71504Jb(UserSession userSession) {
        this.A00 = userSession;
    }

    public final void onAppBackgrounded() {
        GJS gjs;
        UserSession userSession = this.A00;
        C04220Ms.A05(userSession);
        if (C63803iN.A0E(AnonymousClass0TJ.A05, userSession, 36315700834339537L) && (gjs = AnonymousClass2NN.A00(userSession).A00) != null) {
            gjs.A00(false);
        }
    }

    public final void onAppForegrounded() {
        GJS gjs;
        UserSession userSession = this.A00;
        C04220Ms.A05(userSession);
        if (C63803iN.A0E(AnonymousClass0TJ.A05, userSession, 36315700834405074L) && (gjs = AnonymousClass2NN.A00(userSession).A00) != null) {
            gjs.A00(true);
        }
    }
}
