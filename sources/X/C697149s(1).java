package X;

import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import java.util.Map;

/* renamed from: X.49s  reason: invalid class name and case insensitive filesystem */
public final class C697149s implements AnonymousClass0i1 {
    public final C10300i6 A00;

    public C697149s(C10300i6 r2) {
        C04220Ms.A0B(r2, 1);
        this.A00 = r2;
    }

    public static final void A00(AnonymousClass29X r3, C697149s r4, String str, String str2, Map map) {
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A02(r4.A00), "fx_unified_launcher_logging"), 691);
        if (AnonymousClass0wJ.A1U(A0I)) {
            A0I.A0O(r3, "fx_unified_launcher_logger_event");
            A0I.A0T("unified_launcher_error_message", str);
            A0I.A0T("unified_launcher_product_flow", str2);
            A0I.A0T("unified_launcher_app_id", "com.bloks.www.fxcal.link.async");
            C18220wO.A1G(A0I, map);
        }
    }

    public final void onUserSessionWillEnd(boolean z) {
        this.A00.A03(C697149s.class);
    }

    public C697149s() {
    }
}
