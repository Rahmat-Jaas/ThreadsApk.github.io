package X;

import com.facebook.quicklog.reliability.UserFlowLogger;
import com.instagram.service.session.UserSession;

/* renamed from: X.3Uj  reason: invalid class name and case insensitive filesystem */
public final class C61593Uj {
    public static C61593Uj A03;
    public static final C57923Da A04 = new C57923Da();
    public long A00;
    public UserFlowLogger A01;
    public final UserSession A02;

    public final void A00(String str) {
        C04220Ms.A0B(str, 0);
        long j = this.A00;
        if (j != 0) {
            this.A01.flowEndFail(j, str, (String) null);
            this.A00 = 0;
        }
    }

    public C61593Uj(UserSession userSession) {
        this.A02 = userSession;
        this.A01 = AnonymousClass6JQ.A00(userSession);
    }
}
