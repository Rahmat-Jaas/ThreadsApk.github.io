package X;

import com.instagram.service.session.UserSession;
import java.util.List;

/* renamed from: X.48o  reason: invalid class name and case insensitive filesystem */
public final class C694448o implements AnonymousClass0i4 {
    public List A00 = AnonymousClass0wJ.A0v();
    public final UserSession A01;

    public C694448o(UserSession userSession) {
        C04220Ms.A0B(userSession, 1);
        this.A01 = userSession;
    }

    public final void onSessionWillEnd() {
        this.A00 = AnonymousClass0wJ.A0v();
        this.A01.A03(C694448o.class);
    }
}
