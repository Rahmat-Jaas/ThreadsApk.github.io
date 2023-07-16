package X;

import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;

/* renamed from: X.1ic  reason: invalid class name and case insensitive filesystem */
public final class C24391ic extends C63873iU {
    public final C10300i6 A00;
    public final String A01;
    public final String A02;

    private final void A00(boolean z, String str) {
        C10300i6 r6 = this.A00;
        C13330nS A022 = C13330nS.A02(r6);
        long currentTimeMillis = System.currentTimeMillis();
        String A0m = C18190wL.A0m(r6);
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(A022, "phone_id_response_received"), 2491);
        C18230wP.A1F(A0I, currentTimeMillis);
        C18190wL.A1G(A0I, currentTimeMillis, AnonymousClass269.A01());
        A0I.A0Q("prefill_available", Boolean.valueOf(z));
        AnonymousClass269.A05(A0I);
        C18180wK.A1A(A0I, AnonymousClass269.A00());
        C18180wK.A1G(A0I);
        C63683i7.A06(A0I, r6);
        C18190wL.A1I(A0I, this.A02);
        A0I.A0T("prefill_type", str);
        C18240wQ.A15(A0I, this.A01);
        A0I.A0T("source", A0m);
        A0I.Bb4();
    }

    public C24391ic(C10300i6 r1, String str, String str2) {
        this.A00 = r1;
        this.A02 = str;
        this.A01 = str2;
    }

    public final void onFail(AnonymousClass3XX r4) {
        int A03 = C14030oh.A03(-1452839005);
        C04220Ms.A0B(r4, 0);
        super.onFail(r4);
        A00(false, (String) null);
        C14030oh.A0A(848670528, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        String str;
        String str2;
        int A03 = C14030oh.A03(1421642919);
        AnonymousClass1TS r7 = (AnonymousClass1TS) obj;
        int A002 = AnonymousClass0wJ.A00(-84819245, r7);
        String str3 = r7.A00;
        boolean z = false;
        if (str3 == null || str3.length() == 0 || (str2 = r7.A01) == null || str2.length() == 0) {
            String str4 = r7.A01;
            if (str4 != null && str4.length() != 0) {
                AnonymousClass2BE.A01 = str4;
                str = "phone";
            } else if (str3 == null || str3.length() == 0) {
                str = null;
                A00(z, str);
                C14030oh.A0A(1708604872, A002);
                C14030oh.A0A(1821568030, A03);
            } else {
                AnonymousClass2BE.A00 = str3;
                str = "email";
            }
        } else {
            AnonymousClass2BE.A01 = str2;
            AnonymousClass2BE.A00 = r7.A00;
            str = "both";
        }
        z = true;
        A00(z, str);
        C14030oh.A0A(1708604872, A002);
        C14030oh.A0A(1821568030, A03);
    }
}
