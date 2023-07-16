package X;

import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.instagram.service.session.UserSession;

/* renamed from: X.4FE  reason: invalid class name */
public final class AnonymousClass4FE implements C83694rp {
    public final /* synthetic */ C11630kW A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ String A02;

    public AnonymousClass4FE(C11630kW r1, UserSession userSession, String str) {
        this.A01 = userSession;
        this.A00 = r1;
        this.A02 = str;
    }

    public final void CCZ() {
        UserSession userSession = this.A01;
        C11630kW r0 = this.A00;
        String str = this.A02;
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A01(r0, userSession), "ci_settings_modal_settings_tapped"), 158);
        C18210wN.A1B(A0I, str);
        A0I.Bb4();
    }

    public final void onCancel() {
        UserSession userSession = this.A01;
        C11630kW r0 = this.A00;
        String str = this.A02;
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A01(r0, userSession), "ci_settings_modal_cancelled"), 156);
        C18210wN.A1B(A0I, str);
        A0I.Bb4();
    }
}
