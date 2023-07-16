package X;

import com.facebook.redex.IDxDListenerShape441S0100000_1_I2;
import com.instagram.service.session.UserSession;

/* renamed from: X.1nL  reason: invalid class name */
public final class AnonymousClass1nL extends C12140lP {
    public final /* synthetic */ C697249u A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass1nL(C697249u r7) {
        super("fetchSessionSurveyEligibility", 708, 5, false, false);
        this.A00 = r7;
    }

    public final void loggedRun() {
        C697249u r4 = this.A00;
        UserSession userSession = r4.A06;
        if (C63803iN.A0E(AnonymousClass0TJ.A05, userSession, 36312105946710871L)) {
            AnonymousClass49G A002 = AID.A00(r4.A05, userSession);
            if (C18190wL.A04(C28161tl.A04(A002.A08), "notification_settings") == 1 && AnonymousClass49G.A00(A002)) {
                A002.A00 = System.currentTimeMillis();
                IDxDListenerShape441S0100000_1_I2 iDxDListenerShape441S0100000_1_I2 = new IDxDListenerShape441S0100000_1_I2(A002, 1);
                A002.A01 = iDxDListenerShape441S0100000_1_I2;
                C691847d.A02(iDxDListenerShape441S0100000_1_I2);
            }
        }
    }
}
