package X;

import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import java.util.Locale;

/* renamed from: X.3aZ  reason: invalid class name and case insensitive filesystem */
public final class C62713aZ {
    public static final C62713aZ A00 = new C62713aZ();

    public static void A01(C10300i6 r3, String str) {
        USLEBaseShape0S0000000 A002 = A00(r3, str);
        A002.A0T("cp_type_given", (String) null);
        A002.Bb4();
    }

    public final void A02(C10300i6 r6, C313625r r7, Boolean bool, Boolean bool2, Integer num, String str, String str2) {
        String str3;
        String A002;
        C04220Ms.A0B(r6, 0);
        AnonymousClass0BO A01 = C05030Qo.A01(r6);
        USLEBaseShape0S0000000 A003 = A00(r6, str);
        String str4 = null;
        if (r7 != null) {
            str3 = r7.A00;
        } else {
            str3 = null;
        }
        C18210wN.A19(A003, str3);
        if (!(num == null || (A002 = AnonymousClass2TT.A00(num)) == null)) {
            Locale locale = Locale.US;
            C04220Ms.A08(locale);
            str4 = C18190wL.A0r(locale, A002);
        }
        A003.A0T("cp_type_given", str4);
        A003.A0Q("keyboard", bool);
        A003.A0Q("is_private", bool2);
        A003.A0T("instagram_id", str2);
        A003.A0U("logged_in_accounts", C18200wM.A0s(C18210wN.A0i(A01)));
        C63683i7.A09(A003, r6);
        A003.Bb4();
    }

    public final void A03(C10300i6 r9, String str) {
        C04220Ms.A0B(r9, 0);
        A02(r9, (C313625r) null, (Boolean) null, (Boolean) null, (Integer) null, str, (String) null);
    }

    public static final USLEBaseShape0S0000000 A00(C10300i6 r5, String str) {
        double A002 = C18200wM.A00();
        double A003 = AnonymousClass269.A00();
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A02(r5), "next_button_tapped"), 2436);
        AnonymousClass269.A07(A0I, A002, A003);
        C63683i7.A0B(A0I, str, A003);
        return A0I;
    }
}
