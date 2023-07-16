package X;

import android.content.Context;
import com.instagram.service.session.UserSession;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.322  reason: invalid class name */
public final class AnonymousClass322 {
    public static String A00;
    public static String A01;
    public static String A02;
    public static String A03;

    public static void A00(Context context, C63873iU r6, C10300i6 r7, Integer num, String str, Map map) {
        MIS mis;
        String str2 = A01;
        if (str2 != null) {
            str = AnonymousClass00U.A0M(str, str2, '/');
        }
        String str3 = A00;
        if (str3 != null) {
            str = AnonymousClass00U.A0M(str, str3, '/');
        }
        if (r7 instanceof UserSession) {
            mis = new C04710Ou(C05030Qo.A02(r7));
        } else {
            mis = C04740Ox.A00;
        }
        H1T h1t = new H1T(r7);
        h1t.A0J(str);
        h1t.A0P("challenge_node_id", A03);
        h1t.A0F(num);
        h1t.A08(mis, C26611qv.class, AnonymousClass3OF.class);
        if (map != null) {
            Iterator A0z = AnonymousClass0wJ.A0z(map);
            while (A0z.hasNext()) {
                Map.Entry A0o = C18180wK.A0o(A0z);
                h1t.A0O(C18200wM.A0p(A0o), C18230wP.A0u(A0o));
            }
        }
        String str4 = A02;
        if (str4 != null) {
            h1t.A0O("challenge_context", str4);
        }
        C18180wK.A0t(context, h1t, AnonymousClass3QB.A00(0, 9, 122), C09140ev.A00(context));
        if (num == AnonymousClass006.A01) {
            h1t.A06();
        }
        C32165H8c A022 = h1t.A02();
        A022.A00 = r6;
        C31155GhB.A03(A022);
    }
}
