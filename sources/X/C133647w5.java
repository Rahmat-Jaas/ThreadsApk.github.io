package X;

import android.os.Bundle;
import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.instagram.service.session.UserSession;

/* renamed from: X.7w5  reason: invalid class name and case insensitive filesystem */
public final class C133647w5 implements C21342Bsn {
    public final C11630kW A00;
    public final UserSession A01;
    public final long A02;

    public static final USLEBaseShape0S0000000 A00(C133647w5 r4, Long l, String str, String str2, String str3, String str4) {
        UserSession userSession = r4.A01;
        USLEBaseShape0S0000000 A0L = C86104wH.A0L(AnonymousClass0wJ.A0M(C13330nS.A01(r4.A00, userSession), "ig_lead_gen_organic_business"), str, str2, str3, 1255);
        C86124wJ.A1J(A0L, userSession, str4);
        A0L.A0Q("is_from_organic", C18180wK.A0Y());
        A0L.A0S("business_ig_user_fbidv2", Long.valueOf(C86134wK.A0C(l)));
        return A0L;
    }

    public static final String A01(String str, boolean z, boolean z2) {
        StringBuilder A0r;
        String str2;
        if (z) {
            A0r = C18200wM.A0r();
            if (z2) {
                str2 = "update_cta_and_form_selection_dialog_";
            } else {
                str2 = "update_form_selection_dialog_";
            }
        } else if (!z2) {
            return AnonymousClass000.A00(491);
        } else {
            A0r = C18200wM.A0r();
            str2 = "update_cta_selection_dialog_";
        }
        A0r.append(str2);
        return C18180wK.A0i(str, A0r);
    }

    public C133647w5(C11630kW r3, UserSession userSession) {
        AnonymousClass0wJ.A1O(userSession, r3);
        this.A01 = userSession;
        this.A00 = r3;
        this.A02 = C86144wL.A0D(C04620Ok.A00(userSession).A00.A14());
    }

    public final void BbA(Bundle bundle, String str, String str2, String str3, String str4) {
        String str5;
        boolean A1Z = AnonymousClass0wJ.A1Z(str, str2);
        AnonymousClass0wJ.A1Q(str3, str4);
        if (bundle != null) {
            str5 = bundle.getString("form_id");
        } else {
            str5 = null;
        }
        UserSession userSession = this.A01;
        USLEBaseShape0S0000000 A0L = C86104wH.A0L(AnonymousClass0wJ.A0M(C13330nS.A01(this.A00, userSession), "ig_lead_gen_organic_business"), str2, str3, str4, 1255);
        C86124wJ.A1J(A0L, userSession, str);
        A0L.A0Q("is_from_organic", Boolean.valueOf(A1Z));
        A0L.A0S("business_ig_user_fbidv2", Long.valueOf(this.A02));
        if (str5 != null) {
            A0L.A0S("lead_form_id", AnonymousClass0wJ.A0d(str5));
        }
        A0L.Bb4();
    }
}
