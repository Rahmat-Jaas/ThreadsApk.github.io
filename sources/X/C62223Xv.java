package X;

import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import java.util.Locale;

/* renamed from: X.3Xv  reason: invalid class name and case insensitive filesystem */
public final class C62223Xv {
    public static final C62223Xv A00 = new C62223Xv();

    public static final void A00(C10300i6 r6, C313625r r7, Boolean bool, Integer num, String str) {
        String str2;
        String A002;
        AnonymousClass0wJ.A1N(r6, str);
        double A003 = C18200wM.A00();
        double A004 = AnonymousClass269.A00();
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A02(r6), "back_button_tapped"), 72);
        C18180wK.A19(A0I);
        AnonymousClass269.A05(A0I);
        C18190wL.A1I(A0I, str);
        AnonymousClass0wJ.A1A(A0I, A003, A004);
        AnonymousClass0wJ.A1D(A0I, A004, A003);
        C63683i7.A08(A0I);
        C63683i7.A09(A0I, r6);
        String str3 = null;
        if (r7 != null) {
            str2 = r7.A00;
        } else {
            str2 = null;
        }
        C18210wN.A19(A0I, str2);
        if (!(num == null || (A002 = AnonymousClass2TT.A00(num)) == null)) {
            Locale locale = Locale.US;
            C04220Ms.A08(locale);
            str3 = C18190wL.A0r(locale, A002);
        }
        A0I.A0T("chosen_signup_type", str3);
        A0I.A0Q("is_standalone", bool);
        A0I.Bb4();
    }

    public final void A01(C10300i6 r2, String str) {
        AnonymousClass0wJ.A1N(r2, str);
        A00(r2, (C313625r) null, (Boolean) null, (Integer) null, str);
    }
}
