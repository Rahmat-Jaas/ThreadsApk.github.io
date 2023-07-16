package X;

import android.os.Bundle;
import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.instagram.service.session.UserSession;

/* renamed from: X.7w6  reason: invalid class name */
public final class AnonymousClass7w6 implements C21342Bsn {
    public final String A00;
    public final boolean A01;
    public final boolean A02;
    public final boolean A03;
    public final C11630kW A04;
    public final UserSession A05;
    public final String A06;
    public final String A07;

    public AnonymousClass7w6(C11630kW r2, UserSession userSession, String str, String str2, String str3, boolean z, boolean z2, boolean z3) {
        C04220Ms.A0B(userSession, 1);
        C18190wL.A1S(str, 3, str3);
        this.A05 = userSession;
        this.A04 = r2;
        this.A00 = str;
        this.A06 = str2;
        this.A07 = str3;
        this.A03 = z;
        this.A02 = z2;
        this.A01 = z3;
    }

    public static final USLEBaseShape0S0000000 A00(AnonymousClass7w6 r4, String str, String str2, String str3) {
        UserSession userSession = r4.A05;
        USLEBaseShape0S0000000 A0L = C86104wH.A0L(AnonymousClass0wJ.A0M(C13330nS.A01(r4.A04, userSession), "ig_lead_gen_ads_consumer"), str, str2, str3, 1254);
        A0L.A0S("lead_form_id", AnonymousClass0wJ.A0d(A01(A0L, r4, C86104wH.A0D(A0L, userSession, r4.A07))));
        A0L.A0T(AnonymousClass000.A00(283), r4.A06);
        return A0L;
    }

    public static String A01(AnonymousClass0A3 r2, AnonymousClass7w6 r3, long j) {
        r2.A0S("consumer_ig_user_fbidv2", Long.valueOf(j));
        r2.A0Q("has_qualifying_question", Boolean.valueOf(r3.A03));
        r2.A0Q("has_gated_content", Boolean.valueOf(r3.A02));
        r2.A0Q("has_creatives", Boolean.valueOf(r3.A01));
        return r3.A00;
    }

    public final void BbA(Bundle bundle, String str, String str2, String str3, String str4) {
        AnonymousClass0wJ.A1N(str, str2);
        AnonymousClass0wJ.A1Q(str3, str4);
        UserSession userSession = this.A05;
        USLEBaseShape0S0000000 A0L = C86104wH.A0L(AnonymousClass0wJ.A0M(C13330nS.A01(this.A04, userSession), "ig_lead_gen_ads_consumer"), str2, str3, str4, 1254);
        A0L.A0S("lead_form_id", AnonymousClass0wJ.A0d(A01(A0L, this, C86104wH.A0D(A0L, userSession, str))));
        A0L.A0T(AnonymousClass000.A00(283), this.A06);
        if (bundle != null) {
            String string = bundle.getString("question_type");
            if (string != null) {
                A0L.A0T("question_type", string);
            }
            String string2 = bundle.getString("tracking_token");
            if (string2 != null) {
                A0L.A0T(I17.A00(89), string2);
            }
            String string3 = bundle.getString("ad_id");
            if (string3 != null) {
                A0L.A0l(AnonymousClass0wJ.A0d(string3));
            }
        }
        A0L.Bb4();
    }
}
