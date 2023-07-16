package X;

import android.content.Context;
import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.instagram.service.session.UserSession;

/* renamed from: X.2Nl  reason: invalid class name and case insensitive filesystem */
public final class C35442Nl {
    public static final void A00(Context context, UserSession userSession) {
        C63733iD A01 = C63733iD.A01();
        A01.A0C();
        C63733iD.A07(context, A01, 2131828307);
        A01.A0F = context.getString(2131828306);
        C63733iD.A0A(A01);
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A02(userSession), "direct_hidden_words_adoption_impression"), 527);
        if (AnonymousClass0wJ.A1U(A0I)) {
            A0I.A0T("type", "ack_toast");
            A0I.A0T("reason", (String) null);
            A0I.A0T("source", (String) null);
            A0I.A0T("extra_client_data", (String) null);
            A0I.Bb4();
        }
    }
}
