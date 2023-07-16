package X;

import com.instagram.user.model.User;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.2tV  reason: invalid class name and case insensitive filesystem */
public final class C50752tV {
    public static final String A00(User user, Set set) {
        StringBuilder A0r = C18200wM.A0r();
        if (user != null) {
            A0r.append(user.BK7());
        }
        if (set != null) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                User A0c = C18220wO.A0c(it);
                if (A0r.length() > 0) {
                    A0r.append(", ");
                }
                A0r.append(A0c.BK7());
            }
        }
        return C18190wL.A0n(A0r);
    }
}
