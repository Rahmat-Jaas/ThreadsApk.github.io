package X;

import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.instagram.service.session.UserSession;
import java.util.HashMap;

/* renamed from: X.2Ot  reason: invalid class name and case insensitive filesystem */
public final class C35772Ot {
    public static final void A00(C10300i6 r2, String str, String str2, HashMap hashMap, boolean z) {
        if (r2 instanceof UserSession) {
            USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A02(C05030Qo.A02(r2)), "ig_facebook_connect"), 1182);
            if (str == null) {
                str = "null";
            }
            A0I.A0Q("is_cal", C18190wL.A0Z(A0I, "event_name", str, z));
            A0I.A0T("location", str2);
            A0I.A0V("event_info", hashMap);
            A0I.Bb4();
        }
    }
}
