package X;

import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.instagram.service.session.UserSession;

/* renamed from: X.3Ul  reason: invalid class name and case insensitive filesystem */
public final class C61603Ul {
    public final C13330nS A00;
    public final String A01;
    public final C11630kW A02;
    public final UserSession A03;

    public C61603Ul(UserSession userSession) {
        this.A03 = userSession;
        this.A01 = "invite";
        AnonymousClass43V r0 = new AnonymousClass43V(this);
        this.A02 = r0;
        this.A00 = C13330nS.A01(r0, userSession);
    }

    public final void A00(String str, Integer num) {
        String str2;
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(this.A00, "contacts_import_permissions_popup"), 461);
        switch (num.intValue()) {
            case 0:
                str2 = "step_view_loaded";
                break;
            case 1:
                str2 = "access_granted";
                break;
            case 2:
                str2 = "access_denied";
                break;
            default:
                str2 = "access_denied_dont_ask";
                break;
        }
        A0I.A0T("request_result", str2);
        C18210wN.A1B(A0I, str);
        C18240wQ.A15(A0I, this.A01);
        A0I.Bb4();
    }

    public C61603Ul(C11630kW r2, UserSession userSession) {
        this.A02 = r2;
        this.A03 = userSession;
        this.A01 = C18230wP.A0n(r2);
        this.A00 = C13330nS.A01(r2, userSession);
    }
}
