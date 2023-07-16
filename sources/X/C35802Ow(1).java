package X;

import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.instagram.service.session.UserSession;

/* renamed from: X.2Ow  reason: invalid class name and case insensitive filesystem */
public final class C35802Ow {
    public static final void A00(C10300i6 r2, String str, String str2, String str3) {
        if (r2 instanceof UserSession) {
            USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A02(C05030Qo.A02(r2)), "fx_legacy_fb_token_on_ig_access_control"), 687);
            if (str == null) {
                str = "null";
            }
            A0I.A0T("event_type", str);
            if (str2 == null) {
                str2 = "null";
            }
            A0I.A0T("caller_name", str2);
            if (str3 == null) {
                str3 = "null";
            }
            A0I.A0T("caller_class", str3);
            A0I.Bb4();
        }
    }
}
