package X;

import com.instagram.service.session.UserSession;

/* renamed from: X.3Ap  reason: invalid class name and case insensitive filesystem */
public final class C57323Ap {
    public final C13330nS A00;
    public final C11630kW A01;
    public final UserSession A02;

    public C57323Ap(UserSession userSession) {
        this.A02 = userSession;
        C15720rm r0 = new C15720rm("BusinessLinkingLogger");
        this.A01 = r0;
        this.A00 = C13330nS.A01(r0, userSession);
    }
}
