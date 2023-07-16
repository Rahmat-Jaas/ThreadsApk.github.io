package X;

import com.instagram.common.api.base.IDxACallbackShape44S0000000_1_I2;
import com.instagram.service.session.UserSession;

/* renamed from: X.1mz  reason: invalid class name and case insensitive filesystem */
public final class C25381mz extends C12140lP {
    public final /* synthetic */ C697249u A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C25381mz(C697249u r3) {
        super("refreshCloseFriendsCount", 368);
        this.A00 = r3;
    }

    public final void loggedRun() {
        UserSession userSession = this.A00.A06;
        if (!AnonymousClass433.A02) {
            IDxACallbackShape44S0000000_1_I2 iDxACallbackShape44S0000000_1_I2 = new IDxACallbackShape44S0000000_1_I2(0);
            if (userSession != null) {
                String A0j = C18180wK.A0j("users/%s/info/", new Object[]{userSession.getUserId()});
                H1T A0P = AnonymousClass0wJ.A0P(userSession);
                A0P.A0J(A0j);
                C32165H8c A0T = AnonymousClass0wJ.A0T(A0P, CP8.class, C25056Dep.class);
                A0T.A00 = iDxACallbackShape44S0000000_1_I2;
                C31155GhB.A03(A0T);
            }
        }
    }
}
