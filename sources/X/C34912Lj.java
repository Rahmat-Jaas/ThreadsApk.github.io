package X;

import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.instagram.service.session.UserSession;
import java.util.Map;

/* renamed from: X.2Lj  reason: invalid class name and case insensitive filesystem */
public final class C34912Lj {
    public static /* synthetic */ void A00(C11630kW r4, UserSession userSession, Long l, String str, String str2, String str3, String str4, Map map, int i) {
        String str5;
        if ((i & 32) != 0) {
            str4 = null;
        }
        if ((i & 64) != 0) {
            map = null;
        }
        if ((i & 256) != 0) {
            l = null;
        }
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A01(r4, userSession), "instagram_remix_reactions"), 1970);
        if (AnonymousClass0wJ.A1U(A0I) && (str5 = C103066Xr.A00.A02.A00) != null) {
            A0I.A0T("event_type", str);
            C18210wN.A1A(A0I, str2);
            A0I.A0T("surface", str3);
            A0I.A0T("ref_surface", (String) null);
            A0I.A0T("story_id", str4);
            A0I.A1U(str5);
            A0I.A0S("duration_seconds", l);
            A0I.A0T("audio_mode", (String) null);
            A0I.A0V("extra_data_map", map);
            A0I.Bb4();
        }
    }
}
