package X;

import android.content.Context;
import com.instagram.service.session.UserSession;
import java.util.List;

/* renamed from: X.2zI  reason: invalid class name and case insensitive filesystem */
public final class C54342zI {
    public static final void A00(Context context, UserSession userSession, List list, AnonymousClass0ZU r6) {
        C04220Ms.A0B(userSession, 1);
        int i = 0;
        if (list != null) {
            for (Object A1J : list) {
                if (!C18250wR.A1J(userSession, A1J)) {
                    i++;
                }
            }
            if (i > 0) {
                C54332zH.A00(context, C18220wO.A0O(r6, 182), userSession);
                return;
            }
        }
        if (r6 != null) {
            r6.invoke();
        }
    }
}
