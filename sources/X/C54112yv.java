package X;

import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;

/* renamed from: X.2yv  reason: invalid class name and case insensitive filesystem */
public final class C54112yv {
    public static final void A00(C10300i6 r6, Boolean bool, String str, String str2, String str3, boolean z, boolean z2) {
        Long l;
        long j;
        boolean A1Z = AnonymousClass0wJ.A1Z(r6, str);
        double A00 = C18200wM.A00();
        double A002 = AnonymousClass269.A00();
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A02(r6), "facebook_sso_error"), 608);
        AnonymousClass269.A07(A0I, A00, A002);
        AnonymousClass0wJ.A1D(A0I, A002, A00);
        C18190wL.A1I(A0I, str);
        C63683i7.A08(A0I);
        A0I.A0T("error", str3);
        if (str2 != null) {
            l = AnonymousClass0wJ.A0d(str2);
        } else {
            l = null;
        }
        A0I.A0S("fbid", l);
        A0I.A0Q("found_unlinked_account", C18210wN.A0R(A0I, Boolean.valueOf(z), "has_response", z2));
        if (bool.equals(C18210wN.A0R(A0I, Boolean.valueOf(AnonymousClass0wJ.A1W(C63443hU.A00())), "fb4a_installed", A1Z))) {
            j = 1;
        } else {
            j = 0;
        }
        A0I.A0S("token_source", Long.valueOf(j));
        A0I.Bb4();
    }
}
