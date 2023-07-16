package X;

import com.instagram.service.session.UserSession;

/* renamed from: X.6pH  reason: invalid class name and case insensitive filesystem */
public final class C112266pH {
    public boolean A00;
    public final UserSession A01;

    public C112266pH(UserSession userSession) {
        C04220Ms.A0B(userSession, 1);
        this.A01 = userSession;
        this.A00 = C18190wL.A1X(C28161tl.A04(userSession), "hide_likes_and_view_counts_in_consumption");
    }

    public final void A00(boolean z) {
        if (this.A00 != z) {
            this.A00 = z;
            AnonymousClass0gN.A00().AKp(new AnonymousClass61C(this, z));
        }
    }
}
