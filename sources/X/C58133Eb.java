package X;

import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.instagram.service.session.UserSession;

/* renamed from: X.3Eb  reason: invalid class name and case insensitive filesystem */
public final class C58133Eb {
    public final C13330nS A00;

    public C58133Eb(C11630kW r2, UserSession userSession) {
        C04220Ms.A0B(userSession, 1);
        this.A00 = C18230wP.A0U(r2, userSession);
    }

    public final void A00(String str, String str2, String str3, long j, long j2) {
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(this.A00, "ig_birthday_opt_in_clicked"), 812);
        if (AnonymousClass0wJ.A1U(A0I)) {
            A0I.A0S("celebrant_id", Long.valueOf(j));
            A0I.A0S("viewer_id", Long.valueOf(j2));
            A0I.A0T("surface", str);
            A0I.A0T("feature", str2);
            A0I.A0T("option", str3);
            A0I.A0T("device_os", "android");
            A0I.Bb4();
        }
    }
}
