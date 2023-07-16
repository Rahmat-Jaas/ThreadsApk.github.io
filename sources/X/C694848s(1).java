package X;

import com.instagram.service.session.UserSession;
import java.util.Map;

/* renamed from: X.48s  reason: invalid class name and case insensitive filesystem */
public final class C694848s implements AnonymousClass0i4 {
    public final H8D A00;
    public final Map A01 = C18220wO.A0y();
    public final UserSession A02;

    public C694848s(H8D h8d, UserSession userSession) {
        C04220Ms.A0B(userSession, 1);
        this.A02 = userSession;
        this.A00 = h8d;
    }

    public final void onSessionWillEnd() {
        this.A01.clear();
        this.A02.A03(C694848s.class);
    }
}
