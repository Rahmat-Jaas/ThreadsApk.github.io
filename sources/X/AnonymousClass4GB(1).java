package X;

import com.instagram.service.session.UserSession;

/* renamed from: X.4GB  reason: invalid class name */
public final class AnonymousClass4GB implements C82884qQ {
    public final AnonymousClass3X2 A00 = AnonymousClass3X2.A00;
    public final UserSession A01;

    public final boolean CW4(C58743Gz r5) {
        UserSession userSession = this.A01;
        if (new AnonymousClass3A7(userSession).A01.A00(1) || !AnonymousClass3X2.A00(userSession, true)) {
            return false;
        }
        return true;
    }

    public AnonymousClass4GB(UserSession userSession) {
        this.A01 = userSession;
    }
}
