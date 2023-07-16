package X;

import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.service.session.UserSession;

/* renamed from: X.3VR  reason: invalid class name */
public final class AnonymousClass3VR {
    public final C21839C2o A00;
    public final UserSession A01;

    public AnonymousClass3VR(C21839C2o c2o, UserSession userSession) {
        C04220Ms.A0B(userSession, 1);
        this.A01 = userSession;
        this.A00 = c2o;
    }

    public static C13330nS A00(AnonymousClass3VR r3) {
        UserSession userSession = r3.A01;
        C21839C2o c2o = r3.A00;
        C04220Ms.A0C(c2o, "null cannot be cast to non-null type com.instagram.common.analytics.intf.AnalyticsModule");
        return C13330nS.A01(c2o, userSession);
    }

    public final void A01(String str, String str2, String str3) {
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(A00(this), "change_notification_setting"), 148);
        A0I.A0T("ui_type", str3);
        A0I.A0T("setting_value", str2);
        A0I.A0T(TraceFieldType.ContentType, str);
        A0I.Bb4();
    }

    public final void A02(String str, String str2, String str3, boolean z) {
        AnonymousClass0wJ.A1N(str, str2);
        C04220Ms.A0B(str3, 2);
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(A00(this), "change_notifications_setting_request"), 149);
        A0I.A0T(TraceFieldType.ContentType, str);
        A0I.A0Q("success", C18190wL.A0Z(A0I, "setting_value", str2, z));
        A0I.A0T("ui_type", str3);
        A0I.Bb4();
    }

    public final void A03(boolean z) {
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(A00(this), "fetch_notifications_setting"), 647);
        A0I.A0Q("success", Boolean.valueOf(z));
        A0I.Bb4();
    }
}
