package X;

import com.instagram.service.session.UserSession;

/* renamed from: X.4CO  reason: invalid class name */
public final class AnonymousClass4CO implements C21754Bzf {
    public UserSession A00;

    public final boolean Cu6() {
        return false;
    }

    public final boolean Cu7() {
        return false;
    }

    public final void CPR() {
        UserSession userSession = this.A00;
        AnonymousClass0wJ.A11(C28161tl.A03(userSession), "carousel_bumping_nux_count", C18190wL.A04(C28161tl.A04(userSession), "carousel_bumping_nux_count") + 1);
    }

    public final boolean Ct8() {
        return C18230wP.A1W(C18190wL.A04(C28161tl.A04(this.A00), "carousel_bumping_nux_count"), 2);
    }

    public AnonymousClass4CO(UserSession userSession) {
        this.A00 = userSession;
    }
}
