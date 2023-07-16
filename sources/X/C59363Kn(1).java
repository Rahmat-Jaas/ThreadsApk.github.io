package X;

import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;
import java.util.Iterator;

/* renamed from: X.3Kn  reason: invalid class name and case insensitive filesystem */
public final class C59363Kn {
    public static int A00(UserSession userSession) {
        AnonymousClass0BO r0 = userSession.multipleAccountHelper;
        Iterator it = r0.A00.A04(AnonymousClass0wJ.A0Y(userSession)).iterator();
        int i = 0;
        while (it.hasNext()) {
            i += C18220wO.A0c(it).A01();
        }
        return i;
    }

    public static boolean A01(UserSession userSession) {
        AnonymousClass0BO r0 = userSession.multipleAccountHelper;
        Iterator it = r0.A00.A04(AnonymousClass0wJ.A0Y(userSession)).iterator();
        while (it.hasNext()) {
            User A0c = C18220wO.A0c(it);
            if (A0c.A01() > 0) {
                return true;
            }
            if (A0c.A07() != null && !A0c.A07().isEmpty()) {
                return true;
            }
        }
        return false;
    }
}
