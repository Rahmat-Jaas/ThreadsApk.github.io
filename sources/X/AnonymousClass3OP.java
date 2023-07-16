package X;

import com.facebook.proxygen.TraceFieldType;
import com.instagram.service.session.UserSession;

/* renamed from: X.3OP  reason: invalid class name */
public final class AnonymousClass3OP {
    public static C32165H8c A00(UserSession userSession, String str) {
        H1T A0O = C18180wK.A0O(userSession);
        A0O.A0J("notifications/get_notification_settings/");
        A0O.A0O(TraceFieldType.ContentType, str);
        return AnonymousClass0wJ.A0T(A0O, C22231Tx.class, AnonymousClass3OM.class);
    }

    public static C32165H8c A01(UserSession userSession, String str, String str2) {
        H1T A0N = AnonymousClass0wJ.A0N(userSession);
        A0N.A0J("notifications/change_notification_settings/");
        A0N.A0O(TraceFieldType.ContentType, str);
        A0N.A0O("setting_value", str2);
        return AnonymousClass0wJ.A0S(A0N);
    }
}
