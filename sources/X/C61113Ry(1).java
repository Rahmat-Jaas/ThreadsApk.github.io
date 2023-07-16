package X;

import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;

/* renamed from: X.3Ry  reason: invalid class name and case insensitive filesystem */
public final class C61113Ry {
    public final C13330nS A00;

    public static void A00(C61113Ry r8, AnonymousClass265 r9, String str, String str2, String str3, boolean z) {
        AnonymousClass1o2 A01 = AnonymousClass1o2.A01("log_in");
        String A0g = C18200wM.A0g();
        long currentTimeMillis = System.currentTimeMillis();
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(r8.A00, "reactivate_account_attempt"), 2555);
        C18250wR.A0y(A0I, A01.A04());
        A0I.A0T("app_device_id", A0g);
        AnonymousClass0wJ.A1A(A0I, (double) currentTimeMillis, (double) A01.A02());
        C18180wK.A1A(A0I, (double) A01.A02());
        A0I.A0Q("is_successful", Boolean.valueOf(z));
        A0I.A0T("reactivation_source", str);
        C18190wL.A1I(A0I, r9.A01);
        C18190wL.A1K(A0I);
        A0I.A0T("user_id", str2);
        A0I.A0T(C62983bG.A01(), str3);
        A0I.Bb4();
    }

    public C61113Ry(C11630kW r2, C10300i6 r3) {
        this.A00 = C13330nS.A01(r2, r3);
    }
}
