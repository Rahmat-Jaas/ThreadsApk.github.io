package X;

import com.google.common.collect.ImmutableMap;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;
import java.util.Iterator;

/* renamed from: X.2Rc  reason: invalid class name and case insensitive filesystem */
public final class C36382Rc {
    public static User A00(UserSession userSession) {
        AnonymousClass0BO r0 = userSession.multipleAccountHelper;
        Iterator it = r0.A00.A04(AnonymousClass0wJ.A0Y(userSession)).iterator();
        User user = null;
        int i = 0;
        while (it.hasNext()) {
            User A0c = C18220wO.A0c(it);
            int A01 = A0c.A01();
            if (A01 != 0) {
                if (A0c.A07() != null && !A0c.A07().isEmpty()) {
                    ImmutableMap A07 = A0c.A07();
                    C312024q r1 = C312024q.DIRECTS;
                    if (A07.get(r1) != null && AnonymousClass0wJ.A04(A0c.A07().get(r1)) > 0) {
                        A01 -= AnonymousClass0wJ.A04(A0c.A07().get(r1));
                    }
                }
                if (A01 > i) {
                    user = A0c;
                    i = A01;
                }
            }
        }
        return user;
    }
}
