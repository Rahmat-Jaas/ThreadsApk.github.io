package X;

import com.instagram.service.session.UserSession;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.3UO  reason: invalid class name */
public final class AnonymousClass3UO {
    public static final AnonymousClass3S1 A01 = AnonymousClass32A.A0L;
    public final C81194nK A00;

    public final void A00(Map map) {
        C81194nK r2 = this.A00;
        Iterator A0z = AnonymousClass0wJ.A0z(map);
        while (A0z.hasNext()) {
            Map.Entry A0o = C18180wK.A0o(A0z);
            A0o.getKey();
            A0o.getValue();
        }
        synchronized (r2) {
        }
    }

    public AnonymousClass3UO(UserSession userSession) {
        this.A00 = C18250wR.A0C(userSession);
    }
}
