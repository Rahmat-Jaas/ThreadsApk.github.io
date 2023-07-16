package X;

import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.facebook.proxygen.TraceFieldType;

/* renamed from: X.3Yh  reason: invalid class name and case insensitive filesystem */
public final class C62323Yh {
    public static final C62323Yh A00 = new C62323Yh();

    public final void A01(C10300i6 r13, String str, String str2) {
        A00(r13, Boolean.valueOf(AnonymousClass0wJ.A1Y(r13, str)), str, str2, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null);
    }

    public final void A02(C10300i6 r13, String str, String str2, String str3) {
        A00(r13, Boolean.valueOf(AnonymousClass0wJ.A1Y(r13, str)), str, str2, str3, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null);
    }

    public final void A03(C10300i6 r13, String str, String str2, String str3, String str4, String str5) {
        A00(r13, Boolean.valueOf(AnonymousClass0wJ.A1Y(r13, str)), str, str2, str3, str4, str5, (String) null, (String) null, (String) null, (String) null);
    }

    public static final void A00(C10300i6 r5, Boolean bool, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        AnonymousClass0wJ.A1N(r5, str);
        double A002 = C18200wM.A00();
        double A003 = AnonymousClass269.A00();
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A02(r5), "ig_autoconf_account_recovery"), 803);
        AnonymousClass269.A05(A0I);
        AnonymousClass0wJ.A1A(A0I, A002, A003);
        C18180wK.A1A(A0I, A003);
        C18190wL.A1I(A0I, str);
        C18230wP.A1G(A0I, str2);
        A0I.A0T("event_info", str3);
        A0I.A0T("exception_message", str6);
        A0I.A0T("exception_trace", str7);
        A0I.A0T(TraceFieldType.FailureReason, str8);
        A0I.A0T("flow_type", str4);
        C18210wN.A19(A0I, str5);
        A0I.A0T("user_id", str9);
        A0I.A0Q("is_caa", bool);
        A0I.Bb4();
    }
}
