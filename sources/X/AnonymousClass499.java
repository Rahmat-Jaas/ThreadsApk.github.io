package X;

import com.instagram.service.session.UserSession;
import java.util.HashMap;

/* renamed from: X.499  reason: invalid class name */
public final class AnonymousClass499 implements AnonymousClass0i4 {
    public static final HashMap A01 = AnonymousClass0wJ.A0y();
    public final UserSession A00;

    public AnonymousClass499(UserSession userSession) {
        C04220Ms.A0B(userSession, 1);
        this.A00 = userSession;
    }

    public final void onSessionWillEnd() {
        AnonymousClass01V.A0p.endAllInstancesOfMarker(1011615852, 4);
        A01.clear();
    }
}
