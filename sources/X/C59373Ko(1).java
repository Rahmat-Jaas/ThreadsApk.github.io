package X;

import com.instagram.service.session.UserSession;
import java.io.IOException;
import java.io.StringWriter;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.3Ko  reason: invalid class name and case insensitive filesystem */
public final class C59373Ko {
    public static final C32165H8c A00(UserSession userSession, Boolean bool, List list, Map map) {
        boolean A1Y = AnonymousClass0wJ.A1Y(userSession, list);
        String str = null;
        H1T A0P = AnonymousClass0wJ.A0P(userSession);
        A0P.A0J("banyan/banyan/");
        A0P.A0O("views", C18200wM.A0o(list));
        A0P.A0R("is_real_time", A1Y);
        A0P.A0B(AnonymousClass1TJ.class, C59383Kp.class);
        if (bool != null) {
            A0P.A0R("is_private_share", bool.booleanValue());
        }
        if (map != null) {
            try {
                StringWriter A0d = C18230wP.A0d();
                MMp A0K = C18180wK.A0K(A0d);
                Iterator A0z = AnonymousClass0wJ.A0z(map);
                while (A0z.hasNext()) {
                    Map.Entry A0o = C18180wK.A0o(A0z);
                    String A0p = C18200wM.A0p(A0o);
                    Integer valueOf = Integer.valueOf(AnonymousClass0wJ.A04(A0o.getValue()));
                    A0K.A0U(A0p);
                    A0K.A0T(valueOf);
                }
                A0K.A0G();
                A0K.close();
                str = A0d.toString();
            } catch (IOException e) {
                C10450iM.A06(C18210wN.A0l(C59373Ko.class).toString(), "Failed to convert collection to json", e);
            }
            A0P.A0O("IBCShareSheetParams", str);
        }
        return A0P.A02();
    }
}
