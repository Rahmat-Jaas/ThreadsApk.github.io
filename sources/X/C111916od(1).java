package X;

import com.instagram.service.session.UserSession;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.6od  reason: invalid class name and case insensitive filesystem */
public final class C111916od {
    public final UserSession A00;

    public C111916od(UserSession userSession) {
        this.A00 = userSession;
    }

    public final void A00(String str, String str2, Map map) {
        C15730rn A01 = C15730rn.A01(str, str2);
        Iterator A0z = AnonymousClass0wJ.A0z(map);
        while (A0z.hasNext()) {
            Map.Entry A0o = C18180wK.A0o(A0z);
            A01.A0D(C18200wM.A0p(A0o), C18230wP.A0u(A0o));
        }
        C18180wK.A1K(A01, this.A00);
    }
}
