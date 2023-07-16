package X;

import com.instagram.service.session.UserSession;

/* renamed from: X.4QM  reason: invalid class name */
public final /* synthetic */ class AnonymousClass4QM implements Runnable {
    public final /* synthetic */ CUV A00;

    public /* synthetic */ AnonymousClass4QM(CUV cuv) {
        this.A00 = cuv;
    }

    public final void run() {
        CUV cuv = this.A00;
        UserSession userSession = cuv.A09;
        BKU bku = cuv.A05;
        bku.getClass();
        if (AnonymousClass3PV.A00(bku, userSession) != AnonymousClass006.A0N) {
            UserSession userSession2 = cuv.A09;
            C04220Ms.A0B(userSession2, 0);
            AnonymousClass3ZL A03 = AnonymousClass3Zu.A03(userSession2);
            if (A03.A04.getBoolean("PREFERENCE_REELS_RECOMMEND_ON_FACEBOOK_SHOULD_SHOW_CONSUMPTION_UPSELL", A03.A03.getBoolean(A03.A07, false))) {
                return;
            }
        }
        CWS cws = cuv.A0B;
        cws.A07 = null;
        cws.A05 = null;
        cws.A04 = null;
        cws.A00();
    }
}
