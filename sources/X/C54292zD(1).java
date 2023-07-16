package X;

import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;

/* renamed from: X.2zD  reason: invalid class name and case insensitive filesystem */
public final class C54292zD {
    public static final void A00(C10300i6 r6, C313625r r7, AnonymousClass265 r8, String str) {
        String str2;
        C04220Ms.A0B(r6, 0);
        AnonymousClass0wJ.A1Q(r8, str);
        double A00 = C18200wM.A00();
        double A002 = AnonymousClass269.A00();
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A02(r6), "suggestion_prefilled"), 2753);
        AnonymousClass0wJ.A1A(A0I, A00, A002);
        if (r7 == null || (str2 = r7.A00) == null) {
            str2 = "null";
        }
        C18210wN.A19(A0I, str2);
        C18190wL.A1I(A0I, r8.A01);
        A0I.A0T("username_suggestion_string", str);
        AnonymousClass269.A05(A0I);
        AnonymousClass0wJ.A1D(A0I, A002, A00);
        C63683i7.A07(A0I);
        C63683i7.A08(A0I);
        C63683i7.A09(A0I, r6);
        A0I.A0T("app_device_id", C63683i7.A00());
        A0I.Bb4();
    }
}
