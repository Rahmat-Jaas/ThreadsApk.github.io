package X;

import com.instagram.service.session.UserSession;

/* renamed from: X.3F4  reason: invalid class name */
public final class AnonymousClass3F4 {
    public final UserSession A00;
    public final AnonymousClass0ZU A01;

    public final int A00() {
        int i = 1;
        if (AnonymousClass0wJ.A1X(this.A01.invoke())) {
            i = 3;
        }
        UserSession userSession = this.A00;
        AnonymousClass0TJ r2 = AnonymousClass0TJ.A05;
        if (C63803iN.A0E(r2, userSession, 36324402438087144L)) {
            i |= 4;
        }
        if (C63803iN.A0E(r2, userSession, 36328478362053039L)) {
            return i | 32;
        }
        return i;
    }

    public AnonymousClass3F4(UserSession userSession, AnonymousClass0ZU r2) {
        this.A00 = userSession;
        this.A01 = r2;
    }
}
