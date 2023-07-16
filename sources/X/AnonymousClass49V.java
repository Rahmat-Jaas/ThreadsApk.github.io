package X;

import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.facebook.common.callercontext.CallerContext;
import com.instagram.service.session.UserSession;
import java.util.List;
import java.util.Map;

/* renamed from: X.49V  reason: invalid class name */
public final class AnonymousClass49V implements AnonymousClass0i4 {
    public final C13330nS A00;
    public final UserSession A01;

    public AnonymousClass49V(UserSession userSession) {
        C04220Ms.A0B(userSession, 1);
        this.A01 = userSession;
        this.A00 = C13330nS.A02(userSession);
    }

    public final void A01(String str, String str2) {
        C04220Ms.A0B(str, 0);
        A04("access_control_failure", str, (List) null, C63203gz.A03("caller_class", str2));
    }

    public final void A02(String str, String str2) {
        C04220Ms.A0B(str, 0);
        A04("cache_access", str, (List) null, C63203gz.A03("caller_class", str2));
    }

    public final void A04(String str, String str2, List list, Map map) {
        C04220Ms.A0B(str2, 1);
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(this.A00, "fx_master_account_client_cache"), 688);
        if (AnonymousClass0wJ.A1U(A0I)) {
            C18230wP.A1G(A0I, str);
            A0I.A0T("use_case", str2);
            A0I.A0U("services", list);
            A0I.A0V("debug_data", map);
            A0I.Bb4();
        }
    }

    public final void A03(String str, String str2, List list) {
        A04("service_cache_access", str, list, C63203gz.A03("caller_class", str2));
    }

    public final void onSessionWillEnd() {
        this.A01.A03(AnonymousClass49V.class);
    }

    public static void A00(CallerContext callerContext, AnonymousClass49R r1, String str, List list) {
        r1.A06(list);
        AnonymousClass49V r12 = r1.A04;
        String str2 = callerContext.A02;
        C04220Ms.A06(str2);
        r12.A03(str, str2, list);
    }

    public AnonymousClass49V() {
    }
}
