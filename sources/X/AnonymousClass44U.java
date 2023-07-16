package X;

import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.instagram.service.session.UserSession;

/* renamed from: X.44U  reason: invalid class name */
public final class AnonymousClass44U implements C11630kW {
    public static final String __redex_internal_original_name = "IgPresenceLogger";
    public final C13330nS A00;
    public final UserSession A01;

    public final void A02(Integer num, boolean z, boolean z2) {
        Long A012;
        C17040uC A002 = C17040uC.A00();
        if (z) {
            A012 = A002.A02(false);
        } else {
            A012 = A002.A01(false);
        }
        if (num.intValue() != 0) {
            String valueOf = String.valueOf(A012);
            Boolean valueOf2 = Boolean.valueOf(z);
            USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(this.A00, "msgr_presence_update"), 2421);
            if (AnonymousClass0wJ.A1U(A0I)) {
                if (C63803iN.A0E(AnonymousClass0TJ.A05, this.A01, 36313196868404574L)) {
                    A0I.A0T("event_type", "setting_update");
                    A0I.A0Q("is_co_presence_enabled", valueOf2);
                    A0I.A0T(I17.A00(96), valueOf);
                    A0I.Bb4();
                    return;
                }
                return;
            }
            return;
        }
        A01(this, (Boolean) null, Boolean.valueOf(z), Boolean.valueOf(z2), "setting_update", String.valueOf(A012));
    }

    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    public static AnonymousClass44U A00(UserSession userSession) {
        return (AnonymousClass44U) C18180wK.A0c(userSession, AnonymousClass44U.class, 25);
    }

    public static void A01(AnonymousClass44U r4, Boolean bool, Boolean bool2, Boolean bool3, String str, String str2) {
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(r4.A00, "msgr_presence_update"), 2421);
        if (AnonymousClass0wJ.A1U(A0I)) {
            if (C63803iN.A0E(AnonymousClass0TJ.A05, r4.A01, 36313196868404574L)) {
                A0I.A0T("event_type", str);
                A0I.A0T(I17.A00(96), str2);
                A0I.A0Q("is_foregrounded", bool);
                A0I.A0Q(C28174Ezk.A00(34), bool2);
                A0I.A0Q("is_new_ls_presence_reporting", bool3);
                A0I.Bb4();
            }
        }
    }

    public AnonymousClass44U(UserSession userSession) {
        this.A01 = userSession;
        this.A00 = C13330nS.A01(this, userSession);
    }
}
