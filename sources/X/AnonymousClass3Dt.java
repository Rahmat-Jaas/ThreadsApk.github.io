package X;

import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;
import java.util.Iterator;

/* renamed from: X.3Dt  reason: invalid class name */
public final class AnonymousClass3Dt {
    public final void A00(UserSession userSession) {
        C25550Dnj.A03 = (int) C07960cV.A00(C08960ea.A00(18579242543547374L));
        if (userSession != null) {
            Iterator it = userSession.multipleAccountHelper.A00.A04((User) null).iterator();
            while (it.hasNext()) {
                AnonymousClass6VR.A00(userSession).A01(C18220wO.A0c(it), false);
            }
        }
    }
}
