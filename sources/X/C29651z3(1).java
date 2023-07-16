package X;

import android.os.Bundle;
import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.instagram.service.session.UserSession;

/* renamed from: X.1z3  reason: invalid class name and case insensitive filesystem */
public final class C29651z3 extends AnonymousClass4NE {
    public final /* synthetic */ C11630kW A00;
    public final /* synthetic */ AnonymousClass753 A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;

    public C29651z3(C11630kW r1, AnonymousClass753 r2, UserSession userSession, String str, String str2) {
        this.A01 = r2;
        this.A02 = userSession;
        this.A00 = r1;
        this.A04 = str;
        this.A03 = str2;
    }

    public final void CMu(String str) {
        String str2;
        Bundle bundle = this.A01.A00;
        String string = bundle.getString(I17.A00(86));
        UserSession userSession = this.A02;
        BKU A05 = C19462Awj.A01(userSession).A05(string);
        if (A05 != null) {
            str2 = A05.BI1();
        } else {
            str2 = null;
        }
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A01(this.A00, userSession), "iab_report_submit"), 752);
        A0I.A0T("iab_session_id", bundle.getString(I17.A00(455)));
        A0I.A0T("target_url", this.A04);
        A0I.A0T(I17.A00(106), this.A03);
        A0I.A0T("report_reason", str);
        A0I.A1e(str2);
        A0I.A0T(I17.A00(548), bundle.getString(I17.A00(84)));
        A0I.A0R("event_ts", Double.valueOf(C18200wM.A00()));
        A0I.Bb4();
    }
}
