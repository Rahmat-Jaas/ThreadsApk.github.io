package X;

import android.content.Context;
import com.instagram.service.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.3X5  reason: invalid class name */
public final class AnonymousClass3X5 {
    public static final ArrayList A00 = AnonymousClass0wJ.A0v();

    public static void A00(Context context, C15730rn r3, UserSession userSession) {
        Iterator it = C18200wM.A0s(A00).iterator();
        while (it.hasNext()) {
            ((C84344sz) it.next()).Bj5(context, r3, userSession);
        }
    }

    public static boolean A01(Context context, UserSession userSession) {
        Iterator it = C18200wM.A0s(A00).iterator();
        while (it.hasNext()) {
            if (!((C84344sz) it.next()).BR1(context, userSession)) {
                return false;
            }
        }
        return true;
    }
}
