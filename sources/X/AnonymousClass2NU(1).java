package X;

import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.instagram.service.session.UserSession;
import java.util.HashMap;

/* renamed from: X.2NU  reason: invalid class name */
public final class AnonymousClass2NU {
    public static final void A00(AnonymousClass3XX r7, UserSession userSession, String str, String str2, int i) {
        USLEBaseShape0S0000000 A00;
        Long l;
        String str3;
        String str4;
        String str5 = null;
        if (r7 != null) {
            C85814vo r0 = (C85814vo) r7.A00;
            AnonymousClass49Y A01 = AnonymousClass3Zh.A01(userSession);
            if (r0 != null) {
                str3 = r0.getErrorType();
                str4 = r0.getErrorTitle();
                str5 = r0.getErrorBody();
            } else {
                str3 = null;
                str4 = null;
            }
            A00 = AnonymousClass49Y.A00(A01);
            if (AnonymousClass0wJ.A1U(A00)) {
                HashMap A0y = AnonymousClass0wJ.A0y();
                A0y.put("error_type", str3);
                A0y.put("error_title", str4);
                A0y.put("error_body", str5);
                AnonymousClass49Y.A03(A00, A01);
                C18220wO.A1D(AnonymousClass2AE.A0d, A00);
                C18220wO.A1E(AnonymousClass2A4.VIEW, A00);
                C18230wP.A1D(C40328Lci.A0H, A00);
                AnonymousClass3Zh.A02(AnonymousClass2AA.A03, A00, i);
                A00.A0T("ig_thread_id", (String) null);
                A00.A0S("consistent_thread_fbid", (Long) null);
                A00.A0V("extra", A0y);
            } else {
                return;
            }
        } else {
            AnonymousClass49Y A012 = AnonymousClass3Zh.A01(userSession);
            A00 = AnonymousClass49Y.A00(A012);
            if (AnonymousClass0wJ.A1U(A00)) {
                AnonymousClass49Y.A03(A00, A012);
                C18220wO.A1D(AnonymousClass2AE.A0e, A00);
                C18220wO.A1E(AnonymousClass2A4.VIEW, A00);
                C18230wP.A1D(C40328Lci.A0H, A00);
                AnonymousClass3Zh.A02(AnonymousClass2AA.A0H, A00, i);
                A00.A0T("ig_thread_id", str);
                if (str2 != null) {
                    l = AnonymousClass4n2.A02(str2);
                } else {
                    l = null;
                }
                A00.A0S("consistent_thread_fbid", l);
            } else {
                return;
            }
        }
        A00.Bb4();
    }
}
