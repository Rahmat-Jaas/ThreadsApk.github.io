package X;

import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.2Ng  reason: invalid class name and case insensitive filesystem */
public final class C35392Ng {
    public static final boolean A00(UserSession userSession) {
        Boolean A0i;
        Boolean A0j;
        User A0Y = AnonymousClass0wJ.A0Y(userSession);
        if (A0Y.A3W() || (((A0i = A0Y.A0i()) != null && A0i.booleanValue()) || ((A0j = A0Y.A0j()) != null && A0j.booleanValue()))) {
            return true;
        }
        return false;
    }
}
