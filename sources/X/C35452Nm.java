package X;

import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.instagram.service.session.UserSession;

/* renamed from: X.2Nm  reason: invalid class name and case insensitive filesystem */
public final class C35452Nm {
    public static final void A00(UserSession userSession, Integer num) {
        String str;
        C04220Ms.A0B(userSession, 0);
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A02(userSession), "direct_hidden_words_adoption_click"), 526);
        if (AnonymousClass0wJ.A1U(A0I)) {
            IVw iVw = new IVw(K9R.A00);
            iVw.A04("upsell_type", "bottomsheet");
            if (1 - num.intValue() != 0) {
                str = "dismiss";
            } else {
                str = "turn_on";
            }
            C18210wN.A1A(A0I, str);
            A0I.A0T("reason", (String) null);
            A0I.A0T("source", (String) null);
            A0I.A0T("extra_client_data", iVw.toString());
            A0I.Bb4();
        }
    }
}
