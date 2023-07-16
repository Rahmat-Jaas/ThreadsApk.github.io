package X;

import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;

/* renamed from: X.3XD  reason: invalid class name */
public final class AnonymousClass3XD {
    public static final AnonymousClass3XD A00 = new AnonymousClass3XD();

    public static /* synthetic */ void A00(C10300i6 r7, Boolean bool, String str, int i) {
        if ((i & 4) != 0) {
            bool = null;
        }
        double A002 = C18200wM.A00();
        double A003 = AnonymousClass269.A00();
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A02(r7), "try_facebook_auth"), 2769);
        AnonymousClass0wJ.A1A(A0I, A002, A003);
        AnonymousClass269.A05(A0I);
        C18180wK.A19(A0I);
        AnonymousClass0wJ.A1D(A0I, A003, A002);
        C18190wL.A1I(A0I, str);
        C63683i7.A08(A0I);
        C63683i7.A09(A0I, r7);
        A0I.A0Q("is_standalone", bool);
        A0I.A0T("view", (String) null);
        C18210wN.A19(A0I, (String) null);
        A0I.Bb4();
    }
}
