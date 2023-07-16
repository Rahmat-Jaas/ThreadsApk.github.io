package X;

import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;

/* renamed from: X.2z2  reason: invalid class name and case insensitive filesystem */
public final class C54182z2 {
    public static final void A00(C10300i6 r6, AnonymousClass3V1 r7, String str, String str2, String str3, String str4, String str5) {
        Boolean bool;
        String str6;
        Long l = null;
        AnonymousClass0wJ.A1N(r6, str);
        double A00 = C18200wM.A00();
        double A002 = AnonymousClass269.A00();
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A02(r6), "log_in"), 2378);
        C18210wN.A17(A0I);
        A0I.A0T("tracking_enabled", (String) null);
        A0I.A0T("advertising_id", (String) null);
        AnonymousClass0wJ.A1A(A0I, A00, A002);
        AnonymousClass269.A05(A0I);
        A0I.A0T("instagram_id", str2);
        AnonymousClass0wJ.A1D(A0I, A002, A00);
        if (r7 != null) {
            bool = C18210wN.A0Q(r7.A00, C18240wQ.A0g("WAS_FROM_RECOVERY_FLOW"));
        } else {
            bool = null;
        }
        A0I.A0Q("was_from_recovery_flow", bool);
        if (r7 != null) {
            str6 = r7.A00.getString(C18240wQ.A0g("RECOVERY_TYPE"));
        } else {
            str6 = null;
        }
        A0I.A0T("recovery_type", str6);
        C18210wN.A19(A0I, str3);
        A0I.A0T("reg_type", str4);
        if (str5 != null) {
            l = AnonymousClass4n2.A02(str5);
        }
        A0I.A0S("actor_id", l);
        C63683i7.A08(A0I);
        C63683i7.A07(A0I);
        C18190wL.A1I(A0I, str);
        A0I.Bb4();
    }
}
