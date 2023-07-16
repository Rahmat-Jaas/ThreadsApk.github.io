package X;

import android.text.TextUtils;
import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.service.session.UserSession;

/* renamed from: X.1hi  reason: invalid class name and case insensitive filesystem */
public final class C24231hi extends C63873iU {
    public UserSession A00;

    public C24231hi(UserSession userSession) {
        this.A00 = userSession;
    }

    public final void onFail(AnonymousClass3XX r9) {
        int A03 = C14030oh.A03(1181639943);
        UserSession userSession = this.A00;
        double A002 = C18200wM.A00();
        double A003 = AnonymousClass269.A00();
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A02(userSession), "additional_phone_number_request_fail"), 12);
        AnonymousClass0wJ.A1B(A0I, A002, A003);
        C18210wN.A17(A0I);
        AnonymousClass269.A06(A0I, A003);
        C63683i7.A0A(A0I, userSession);
        C14030oh.A0A(1687219417, A03);
    }

    public final void onStart() {
        int A03 = C14030oh.A03(1402138897);
        UserSession userSession = this.A00;
        double A002 = C18200wM.A00();
        double A003 = AnonymousClass269.A00();
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A02(userSession), "try_fetch_additional_phone_number"), 2771);
        if (AnonymousClass0wJ.A1U(A0I)) {
            AnonymousClass0wJ.A1B(A0I, A002, A003);
            C18180wK.A19(A0I);
            AnonymousClass269.A06(A0I, A003);
            C63683i7.A0A(A0I, userSession);
        }
        C14030oh.A0A(996581839, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C14030oh.A03(1936163459);
        AnonymousClass1TS r15 = (AnonymousClass1TS) obj;
        int A032 = C14030oh.A03(-1605783303);
        UserSession userSession = this.A00;
        double A002 = C18200wM.A00();
        double A003 = AnonymousClass269.A00();
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A02(userSession), "additional_phone_number_request_success"), 13);
        A0I.A0R("current_time", Double.valueOf(A002));
        A0I.A0R("elapsed_time", Double.valueOf(A002 - A003));
        A0I.A0R(TraceFieldType.StartTime, Double.valueOf(A003));
        A0I.A0T("waterfall_id", AnonymousClass269.A04());
        C63683i7.A07(A0I);
        C63683i7.A08(A0I);
        C63683i7.A09(A0I, userSession);
        C18210wN.A1C(A0I, "waterfall_log_in");
        String str = r15.A02;
        String str2 = r15.A01;
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str)) {
            userSession.A04(C566838d.class, new C566838d(str2, str));
            double A004 = C18200wM.A00();
            double A005 = AnonymousClass269.A00();
            USLEBaseShape0S0000000 A0I2 = C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A02(userSession), "additional_phone_number_present"), 11);
            A0I2.A0R("current_time", Double.valueOf(A004));
            A0I2.A0R("elapsed_time", Double.valueOf(A004 - A005));
            C18240wQ.A15(A0I2, "waterfall_log_in");
            A0I2.A0R(TraceFieldType.StartTime, Double.valueOf(A005));
            A0I2.A0T("waterfall_id", AnonymousClass269.A04());
            C63683i7.A0A(A0I2, userSession);
        }
        C14030oh.A0A(1225971668, A032);
        C14030oh.A0A(45051949, A03);
    }
}
