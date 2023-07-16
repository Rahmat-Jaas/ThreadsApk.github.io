package X;

import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.7G1  reason: invalid class name */
public final class AnonymousClass7G1 {
    public static final void A01(C11630kW r4, UserSession userSession, Integer num) {
        C146558mR A0B;
        String str;
        Long l;
        String str2;
        C04220Ms.A0B(userSession, 0);
        User A0Y = AnonymousClass0wJ.A0Y(userSession);
        if (num == AnonymousClass006.A01) {
            A0B = A0Y.A09();
        } else {
            A0B = A0Y.A0B();
        }
        USLEBaseShape0S0000000 A0I = USLEBaseShape0S0000000.A0I(C13330nS.A01(r4, userSession));
        A0I.A0S("igid", AnonymousClass0wJ.A0d(userSession.getUserId()));
        C18190wL.A1I(A0I, C28174Ezk.A00(785));
        C86104wH.A1J(A0I, "view");
        A0I.A0Q("is_support_partner_enabled", Boolean.valueOf(AnonymousClass0wJ.A1W(A0B)));
        if (A0B != null) {
            str = A0B.B08();
        } else {
            str = null;
        }
        A0I.A0T("partner_name", str);
        if (A0B != null) {
            l = AnonymousClass0wJ.A0d(A0B.AQz());
        } else {
            l = null;
        }
        A0I.A0S("partner_id", l);
        if (A0B != null) {
            str2 = A0B.getUrl();
        } else {
            str2 = null;
        }
        A0I.A0T("url", str2);
        A0I.A0T("service_type", AnonymousClass6UP.A00(num));
        A0I.Bb4();
    }

    public static final void A00(C11630kW r2, UserSession userSession) {
        USLEBaseShape0S0000000 A0I = USLEBaseShape0S0000000.A0I(C18220wO.A0V(r2, userSession));
        A0I.A0S("igid", AnonymousClass0wJ.A0d(userSession.getUserId()));
        C18190wL.A1I(A0I, C28174Ezk.A00(270));
        C86104wH.A1J(A0I, "dismiss");
        A0I.A0Q("is_support_partner_enabled", Boolean.valueOf(A03(userSession)));
        A0I.Bb4();
    }

    public static final void A02(C11630kW r2, UserSession userSession, Integer num, String str, String str2, String str3, String str4, String str5) {
        String str6;
        USLEBaseShape0S0000000 A0H = USLEBaseShape0S0000000.A0H(C18220wO.A0V(r2, userSession));
        A0H.A0S("igid", AnonymousClass0wJ.A0d(userSession.getUserId()));
        C18190wL.A1I(A0H, "open_deeplink");
        C86104wH.A1J(A0H, "open");
        boolean z = true;
        if (str3 == null || !C19573AyZ.A07(userSession, str3)) {
            z = false;
        }
        A0H.A0Q("is_profile_owner", Boolean.valueOf(z));
        A0H.A0S("profile_owner_id", Long.valueOf(C86144wL.A0D(str3)));
        C86114wI.A1F(A0H, str4, str5);
        if (num != null) {
            str6 = AnonymousClass6UP.A00(num);
        } else {
            str6 = null;
        }
        A0H.A0T("service_type", str6);
        A0H.A0T("sticker_id", str2);
        A0H.A0T(AnonymousClass000.A00(1332), str);
        A0H.Bb4();
    }

    public static final boolean A03(UserSession userSession) {
        C146558mR A0B;
        for (Integer num : C18240wQ.A1Z()) {
            User A0Y = AnonymousClass0wJ.A0Y(userSession);
            if (num == AnonymousClass006.A01) {
                A0B = A0Y.A09();
            } else {
                A0B = A0Y.A0B();
            }
            if (A0B != null) {
                return true;
            }
        }
        return false;
    }
}
