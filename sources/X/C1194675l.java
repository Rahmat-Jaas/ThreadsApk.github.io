package X;

import com.instagram.service.session.UserSession;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.75l  reason: invalid class name and case insensitive filesystem */
public final class C1194675l {
    public final UserSession A00;
    public final String A01;

    public static void A00(C15680ri r2, Object obj, String str) {
        if (obj instanceof String) {
            r2.A0D(str, (String) obj);
        } else if (obj instanceof Integer) {
            r2.A09((Integer) obj, str);
        } else if (obj instanceof Long) {
            r2.A0C(str, (Long) obj);
        } else if (obj instanceof Boolean) {
            r2.A0A(str, (Boolean) obj);
        } else if (obj instanceof Double) {
            r2.A0B(str, (Double) obj);
        } else if (obj instanceof Map) {
            C15680ri r22 = new C15680ri();
            Iterator A0z = AnonymousClass0wJ.A0z((Map) obj);
            while (A0z.hasNext()) {
                A00(r22, C18180wK.A0o(A0z).getValue(), str);
            }
        }
    }

    public C1194675l(UserSession userSession, String str) {
        this.A01 = str;
        this.A00 = userSession;
    }
}
