package X;

import android.content.Context;
import com.instagram.realtimeclient.RealtimeSubscription;
import com.instagram.service.session.UserSession;
import java.util.List;

/* renamed from: X.3Zn  reason: invalid class name and case insensitive filesystem */
public final class C62403Zn {
    public static C32165H8c A00(Context context, C07530bf r5, String str, String str2, String str3, String str4, List list, boolean z) {
        String str5;
        H1T A0O = AnonymousClass0wJ.A0O(r5);
        A0O.A0J("accounts/two_factor_login/");
        C18240wQ.A1A(A0O, C26641qy.class, AnonymousClass3WN.class);
        A0O.A0O(C63383hO.A00(), str);
        A0O.A0P("verification_method", str4);
        C63383hO.A03(A0O, C18220wO.A0g(context, A0O, C63383hO.A01(62, 21, 95), str2));
        C18180wK.A0t(context, A0O, "phone_id", C18190wL.A0l(r5));
        A0O.A0P(C63383hO.A01(91, 17, 41), str3);
        if (z) {
            str5 = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
        } else {
            str5 = "0";
        }
        AnonymousClass269.A0A(A0O, "trust_this_device", str5);
        if (list != null && !list.isEmpty()) {
            A0O.A0O("trusted_notification_polling_nonces", C18220wO.A0p(list));
        }
        return C18190wL.A0Q(A0O);
    }

    public static C32165H8c A01(Context context, UserSession userSession) {
        H1T A0N = AnonymousClass0wJ.A0N(userSession);
        A0N.A0J("accounts/account_security_info/");
        A0N.A0B(AnonymousClass1U1.class, C59863Ms.class);
        C63383hO.A03(A0N, C09140ev.A00(context));
        return C18190wL.A0Q(A0N);
    }

    public static C32165H8c A02(Context context, UserSession userSession, String str) {
        H1T A0N = AnonymousClass0wJ.A0N(userSession);
        A0N.A0J("accounts/send_two_factor_enable_sms/");
        A0N.A0B(C26631qx.class, AnonymousClass3N6.class);
        C18180wK.A0t(context, A0N, C63383hO.A01(11, 9, 12), C18220wO.A0g(context, A0N, C63383hO.A01(28, 12, 80), str));
        return C18190wL.A0Q(A0N);
    }

    public static C32165H8c A03(Context context, UserSession userSession, String str, String str2) {
        H1T A0N = AnonymousClass0wJ.A0N(userSession);
        A0N.A0J("accounts/enable_sms_two_factor/");
        A0N.A0B(C26661r0.class, AnonymousClass3NB.class);
        C18180wK.A0t(context, A0N, C63383hO.A01(11, 9, 12), C18220wO.A0g(context, A0N, C63383hO.A01(28, 12, 80), str));
        A0N.A0O(C63383hO.A01(91, 17, 41), str2);
        return C18190wL.A0Q(A0N);
    }
}
