package X;

import com.instagram.service.session.UserSession;
import java.io.IOException;
import java.io.StringWriter;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.2NR  reason: invalid class name */
public final class AnonymousClass2NR {
    public static final C32165H8c A00(UserSession userSession, String str, List list, Map map) {
        String str2;
        C04220Ms.A0B(userSession, 0);
        AnonymousClass0wJ.A1O(str, list);
        C04220Ms.A0B(map, 3);
        String str3 = null;
        H1T A0P = AnonymousClass0wJ.A0P(userSession);
        A0P.A0J("direct_v2/search_secondary/");
        A0P.A0O("query", str);
        try {
            StringWriter A0d = C18230wP.A0d();
            MMp A04 = C18987Aon.A00.A04(A0d);
            A04.A0I();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                A04.A0Y(C18180wK.A0k(it));
            }
            A04.A0F();
            A04.close();
            str3 = A0d.toString();
        } catch (IOException e) {
            C10450iM.A06("DirectSearchSecondaryApi", "Failed to convert collection to json", e);
        }
        A0P.A0O("result_types", str3);
        try {
            StringWriter A0d2 = C18230wP.A0d();
            MMp A0K = C18180wK.A0K(A0d2);
            Iterator A0z = AnonymousClass0wJ.A0z(map);
            while (A0z.hasNext()) {
                Map.Entry A0o = C18180wK.A0o(A0z);
                String A0p = C18200wM.A0p(A0o);
                Object value = A0o.getValue();
                A0K.A0U(A0p);
                A0K.A0T(value);
            }
            str2 = C18180wK.A0h(A0K, A0d2);
        } catch (IOException e2) {
            C10450iM.A06("DirectSearchSecondaryApi", "Failed to convert collection to json", e2);
            str2 = null;
        }
        A0P.A0O("offsets", str2);
        return AnonymousClass0wJ.A0T(A0P, AnonymousClass5uM.class, AnonymousClass3MJ.class);
    }
}
