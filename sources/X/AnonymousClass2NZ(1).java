package X;

import com.instagram.service.session.UserSession;

/* renamed from: X.2NZ  reason: invalid class name */
public final class AnonymousClass2NZ {
    public static void A00(C83534rZ r3, UserSession userSession, String str) {
        Integer num;
        HEL A01 = H8D.A01(C60883Qx.A00(userSession), str);
        if (A01 != null) {
            synchronized (A01) {
                num = A01.A11;
            }
            if (num == AnonymousClass006.A0N) {
                r3.CN7(A01);
                return;
            }
        }
        H1T A0O = C18180wK.A0O(userSession);
        A0O.A0T("direct_v2/threads/%s/", str);
        A0O.A0B(C28464FNa.class, AnonymousClass3MK.class);
        A0O.A76("visual_message_return_type", "unseen");
        C32165H8c A02 = A0O.A02();
        A02.A00 = new AnonymousClass1UP(r3, userSession, str);
        C31155GhB.A03(A02);
    }
}
