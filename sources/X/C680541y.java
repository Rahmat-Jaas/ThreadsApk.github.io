package X;

import com.instagram.service.session.UserSession;

/* renamed from: X.41y  reason: invalid class name and case insensitive filesystem */
public final class C680541y implements C39665Kxk {
    public final int A00;
    public final UserSession A01;

    public final boolean Csp(int i) {
        return C37269Jng.A01() || i % this.A00 == 0;
    }

    public final boolean isEnabled() {
        if (((C58433Fp) C18180wK.A0c(this.A01, C58433Fp.class, 4)).A02 || C37269Jng.A01()) {
            return true;
        }
        return false;
    }

    public C680541y(UserSession userSession) {
        this.A01 = userSession;
        this.A00 = C63803iN.A01(AnonymousClass0TJ.A05, userSession, 36596961062750599L);
    }
}
