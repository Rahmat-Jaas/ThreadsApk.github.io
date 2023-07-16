package X;

import com.instagram.common.api.base.IDxACallbackShape112S0100000_2_I2;
import com.instagram.service.session.UserSession;

/* renamed from: X.6a1  reason: invalid class name */
public final class AnonymousClass6a1 {
    public static String A00;
    public static String A01;

    public static void A00(C34640IcN icN, UserSession userSession) {
        String str = A01;
        if (str != null) {
            C32165H8c A03 = C19482Ax5.A03(userSession, str);
            A03.A00 = new IDxACallbackShape112S0100000_2_I2(userSession, 25);
            icN.schedule(A03);
            A01 = null;
        }
        String str2 = A00;
        if (str2 != null) {
            H1T A0O = C18180wK.A0O(userSession);
            A0O.A0T("fundraiser/%s/shared_to_feed_media/", str2);
            A0O.A0O("fundraiser_id", str2);
            C32165H8c A0T = AnonymousClass0wJ.A0T(A0O, C94095tk.class, C1187071y.class);
            A0T.A00 = new IDxACallbackShape112S0100000_2_I2(userSession, 26);
            icN.schedule(A0T);
            A00 = null;
        }
    }
}
