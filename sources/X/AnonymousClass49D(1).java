package X;

import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.instagram.service.session.UserSession;

/* renamed from: X.49D  reason: invalid class name */
public final class AnonymousClass49D implements AnonymousClass0i4 {
    public final C13330nS A00;
    public final UserSession A01;
    public final String A02;

    public static /* synthetic */ void A00(AnonymousClass2A3 r3, AnonymousClass2AB r4, C40326Lcg lcg, C319729r r6, AnonymousClass49D r7, String str, String str2) {
        Long l;
        USLEBaseShape0S0000000 A0D = USLEBaseShape0S0000000.A0D(r7.A00);
        if (AnonymousClass0wJ.A1U(A0D)) {
            String userId = r7.A01.getUserId();
            C04220Ms.A0B(userId, 0);
            A0D.A0S("actor_id", Long.valueOf(AnonymousClass4n2.A00(userId)));
            C18220wO.A1D(r4, A0D);
            C18220wO.A1E(r3, A0D);
            C18230wP.A1D(lcg, A0D);
            AnonymousClass2AH.A01(r6, A0D);
            C62443a0.A01(A0D, r7.A02);
            A0D.A0T("ig_thread_id", str);
            if (str2 != null) {
                l = AnonymousClass4n2.A02(str2);
            } else {
                l = null;
            }
            A0D.A0S("consistent_thread_fbid", l);
            A0D.Bb4();
        }
    }

    public final void onSessionWillEnd() {
        this.A01.A03(AnonymousClass49D.class);
    }

    public AnonymousClass49D(UserSession userSession) {
        this.A01 = userSession;
        this.A00 = new C10680ik(userSession).A00();
        String A0e = C18180wK.A0e();
        C04220Ms.A06(A0e);
        this.A02 = A0e;
    }
}
