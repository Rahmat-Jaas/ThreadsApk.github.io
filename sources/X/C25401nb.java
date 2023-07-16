package X;

import com.instagram.service.session.UserSession;

/* renamed from: X.1nb  reason: invalid class name and case insensitive filesystem */
public final class C25401nb extends C12140lP {
    public final /* synthetic */ C697249u A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C25401nb(C697249u r7, int i) {
        super("fetchAvatarStatus", 723534057, i, true, false);
        this.A00 = r7;
    }

    public final void loggedRun() {
        UserSession userSession = this.A00.A06;
        C100026Lr.A00(userSession).A01(userSession, C73814Uh.A00);
    }
}
