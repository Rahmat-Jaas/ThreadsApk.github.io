package X;

import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.instagram.service.session.UserSession;

/* renamed from: X.4NU  reason: invalid class name */
public final class AnonymousClass4NU implements C83954sG {
    public final /* synthetic */ C83804s1 A00;
    public final /* synthetic */ C695649c A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;

    public AnonymousClass4NU(C83804s1 r1, C695649c r2, String str, String str2) {
        this.A01 = r2;
        this.A02 = str;
        this.A00 = r1;
        this.A03 = str2;
    }

    public final void onFailure() {
        Object value;
        C695649c r5 = this.A01;
        UserSession userSession = r5.A02;
        USLEBaseShape0S0000000 A0P = C18200wM.A0P(userSession);
        C18190wL.A1H(A0P, userSession, "server_fetch_failure");
        String str = this.A02;
        C18210wN.A1B(A0P, str);
        A0P.A0Q("user_interaction", C18180wK.A0X());
        A0P.Bb4();
        C62173Xp.A00(userSession).A01(str);
        C83804s1 r0 = this.A00;
        if (r0 != null) {
            r0.Byp();
        }
        String str2 = this.A03;
        if (str2 == null || str2.equals("REELS")) {
            C86074wE r2 = r5.A03;
            do {
                value = r2.getValue();
                ((Number) value).longValue();
            } while (!r2.ADi(value, C18210wN.A0V()));
        }
    }

    public final void onSuccess() {
        String str;
        Object value;
        C695649c r2 = this.A01;
        String str2 = this.A02;
        AnonymousClass3VW A022 = r2.A02();
        UserSession userSession = r2.A02;
        USLEBaseShape0S0000000 A0P = C18200wM.A0P(userSession);
        C18190wL.A1H(A0P, userSession, "server_fetch_success");
        C18210wN.A1B(A0P, str2);
        boolean z = false;
        A0P.A0Q("user_interaction", false);
        if (A022 != null) {
            str = A022.A01;
        } else {
            str = null;
        }
        A0P.A0T("target_destination_type", str);
        A0P.Bb4();
        if (A022 == null || AnonymousClass8bQ.A0n(A022.A02)) {
            z = true;
        }
        AnonymousClass3WS.A01(userSession).A0L(userSession, !z);
        C60333Op.A00(userSession).A00 = z;
        C62173Xp.A00(userSession).A01(str2);
        C83804s1 r0 = this.A00;
        if (r0 != null) {
            r0.Byq();
        }
        String str3 = this.A03;
        if (str3 == null || str3.equals("REELS")) {
            C86074wE r22 = r2.A03;
            do {
                value = r22.getValue();
                ((Number) value).longValue();
            } while (!r22.ADi(value, C18200wM.A0c()));
        }
    }
}
