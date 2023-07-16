package X;

import com.instagram.service.session.UserSession;
import java.util.Map;

/* renamed from: X.7tA  reason: invalid class name and case insensitive filesystem */
public final class C132007tA implements AnonymousClass0i4 {
    public final Map A00 = C18220wO.A0y();
    public final UserSession A01;

    public final void onSessionWillEnd() {
        this.A00.clear();
        this.A01.A03(C132007tA.class);
    }

    public C132007tA(UserSession userSession) {
        this.A01 = userSession;
    }
}
