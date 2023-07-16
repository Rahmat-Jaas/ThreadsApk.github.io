package X;

import com.instagram.service.session.UserSession;

/* renamed from: X.1nK  reason: invalid class name */
public final class AnonymousClass1nK extends C12140lP {
    public final /* synthetic */ C697249u A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass1nK(C697249u r7) {
        super("fetchFacebookAccountCrosspostingDestination", 686, 5, false, false);
        this.A00 = r7;
    }

    public final void loggedRun() {
        UserSession userSession = this.A00.A06;
        Integer num = AnonymousClass006.A00;
        C04220Ms.A0B(userSession, 0);
        C67303zK.A05(userSession, (AnonymousClass3D3) null, num);
        AnonymousClass0wJ.A12(C696949q.A00(AnonymousClass3Zs.A03(userSession), D2R.A2d), AnonymousClass00U.A0L(userSession.getUserId(), "_pref_prefix_xposting_last_fetched_time_ms"), System.currentTimeMillis());
    }
}
