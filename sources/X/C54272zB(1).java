package X;

import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import java.util.Locale;

/* renamed from: X.2zB  reason: invalid class name and case insensitive filesystem */
public final class C54272zB {
    public static final void A00(C10300i6 r6, C313625r r7, Integer num, Integer num2, String str) {
        String str2;
        String A00;
        AnonymousClass0wJ.A1M(r6, 0, r7);
        double A002 = C18200wM.A00();
        double A003 = AnonymousClass269.A00();
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A02(r6), "register_account_request_submitted"), 2618);
        AnonymousClass0wJ.A1A(A0I, A002, A003);
        C18180wK.A19(A0I);
        AnonymousClass269.A05(A0I);
        C18200wM.A1K(A0I, A003);
        C18190wL.A1I(A0I, "done");
        C18210wN.A19(A0I, r7.A00);
        C18180wK.A1B(A0I, A002);
        C63683i7.A08(A0I);
        Long l = null;
        if (num == null || (A00 = AnonymousClass2TT.A00(num)) == null) {
            str2 = null;
        } else {
            Locale locale = Locale.US;
            C04220Ms.A08(locale);
            str2 = C18190wL.A0r(locale, A00);
        }
        A0I.A0T("chosen_signup_type", str2);
        if (num2 != null) {
            l = C18230wP.A0f(num2.intValue());
        }
        A0I.A0S("attempt_count", l);
        A0I.A0T("retry_strategy", str);
        C63683i7.A09(A0I, r6);
        A0I.Bb4();
    }
}
