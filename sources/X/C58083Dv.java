package X;

import android.content.Context;
import com.instagram.service.session.UserSession;

/* renamed from: X.3Dv  reason: invalid class name and case insensitive filesystem */
public final class C58083Dv {
    public final synchronized C26288E7s A00(Context context, UserSession userSession) {
        C26288E7s e7s;
        synchronized (this) {
            C04220Ms.A0B(context, 0);
            Class<C26288E7s> cls = C26288E7s.class;
            C26288E7s e7s2 = (C26288E7s) userSession.A00(cls);
            if (e7s2 != null) {
                C691847d.A03(e7s2);
            }
            userSession.A03(cls);
            e7s = new C26288E7s(context, userSession);
            C691847d.A02(e7s);
            userSession.A04(cls, e7s);
        }
        return e7s;
    }
}
