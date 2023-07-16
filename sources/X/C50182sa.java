package X;

import com.instagram.common.api.base.IDxACallbackShape111S0100000_1_I2;
import com.instagram.service.session.UserSession;
import java.io.IOException;
import java.io.StringWriter;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.2sa  reason: invalid class name and case insensitive filesystem */
public final class C50182sa {
    public static void A00(UserSession userSession, Integer num, String str, String str2, String str3, List list) {
        if (list == null) {
            list = AnonymousClass0wJ.A0v();
        }
        String A00 = C50192sb.A00(num);
        long A07 = C18190wL.A07();
        String A0e = C18180wK.A0e();
        C04220Ms.A06(A0e);
        try {
            StringWriter A0d = C18230wP.A0d();
            MMp A0K = C18180wK.A0K(A0d);
            A0K.A0U("input");
            A0K.A0J();
            if (str != null) {
                A0K.A0d("integration_point_id", str);
            }
            if (str2 != null) {
                A0K.A0d("survey_id", str2);
            }
            if (A00 != null) {
                A0K.A0d("impression_event", A00);
            }
            if (str3 != null) {
                A0K.A0d("session_blob", str3);
            }
            Iterator A0t = C18190wL.A0t(A0K, "context", list);
            while (A0t.hasNext()) {
                AnonymousClass3SU r7 = (AnonymousClass3SU) A0t.next();
                if (r7 != null) {
                    A0K.A0J();
                    String str4 = r7.A00;
                    if (str4 != null) {
                        A0K.A0d("context_key", str4);
                    }
                    String str5 = r7.A01;
                    if (str5 != null) {
                        A0K.A0d("context_value", str5);
                    }
                    A0K.A0G();
                }
            }
            A0K.A0F();
            A0K.A0c("device_time", A07);
            A0K.A0d("client_mutation_id", A0e);
            A0K.A0d("actor_id", "0");
            A0K.A0G();
            A0K.A0G();
            A0K.close();
            C26321qP r1 = new C26321qP(A0d.toString());
            IDxACallbackShape111S0100000_1_I2 A06 = C63873iU.A06(num, 171);
            C32165H8c A0U = C18200wM.A0U(userSession, r1);
            A0U.A00 = A06;
            C31155GhB.A05(A0U, 224, 4, false, false);
        } catch (IOException e) {
            AnonymousClass0LU.A0F("RapidFeedbackAnalyticsUtil", I17.A00(160), e);
        }
    }
}
