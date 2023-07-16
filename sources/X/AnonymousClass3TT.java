package X;

import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import java.util.Map;

/* renamed from: X.3TT  reason: invalid class name */
public final class AnonymousClass3TT {
    public static final void A00(C021209x r3, C317228s r4, C34295ICl iCl, AnonymousClass4Nr r6, String str) {
        if (r6.A02) {
            USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M((C13330nS) r3, "media_playback_compound_debug"), 2404);
            if (AnonymousClass0wJ.A1U(A0I)) {
                C04220Ms.A0A(iCl);
                A0I.A0P(iCl, "required_metadata");
                C04220Ms.A0A(str);
                A0I.A0T("log_category", str);
                A0I.A0O(r4, "error_type");
                A0I.A1J("");
                A0I.Bb4();
            }
        }
    }

    public final C317228s A01(C34295ICl iCl, long j) {
        if (iCl == null) {
            return C317228s.CLIENT_METADATA_PROVIDER_MISSING;
        }
        Number A0V = C18210wN.A0V();
        Map map = iCl.A00;
        if ((!map.containsKey("media_id") || (A0V = (Number) map.get("media_id")) != null) && j == A0V.longValue()) {
            return null;
        }
        return C317228s.CLIENT_MEDIA_ID_MISMATCH;
    }
}
