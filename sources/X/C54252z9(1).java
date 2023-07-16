package X;

import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import java.util.Locale;

/* renamed from: X.2z9  reason: invalid class name and case insensitive filesystem */
public final class C54252z9 {
    public static final USLEBaseShape0S0000000 A00(C10300i6 r6, Integer num, String str, String str2, String str3, String str4) {
        String str5;
        String A00;
        AnonymousClass0wJ.A1N(r6, str);
        AnonymousClass0wJ.A1Q(str2, str3);
        double A002 = C18200wM.A00();
        double A003 = AnonymousClass269.A00();
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A02(r6), "register_account_created"), 2615);
        AnonymousClass269.A07(A0I, A002, A003);
        C18200wM.A1K(A0I, A003);
        C18190wL.A1I(A0I, "done");
        C63683i7.A08(A0I);
        A0I.A0T("instagram_id", str3);
        C18210wN.A19(A0I, str);
        A0I.A0T("reg_type", str2);
        A0I.A0T("actor_id", str4);
        if (num == null || (A00 = AnonymousClass2TT.A00(num)) == null) {
            str5 = null;
        } else {
            Locale locale = Locale.US;
            C04220Ms.A08(locale);
            str5 = C18190wL.A0r(locale, A00);
        }
        A0I.A0T("chosen_signup_type", str5);
        C63683i7.A09(A0I, r6);
        return A0I;
    }
}
