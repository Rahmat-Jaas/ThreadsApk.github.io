package X;

import com.instagram.service.session.UserSession;

/* renamed from: X.48u  reason: invalid class name and case insensitive filesystem */
public final class C695048u implements AnonymousClass0i4 {
    public String A00;
    public final long A01;
    public final C13330nS A02;
    public final UserSession A03;

    public final void onSessionWillEnd() {
        this.A03.A03(C695048u.class);
    }

    public C695048u(UserSession userSession) {
        this.A03 = userSession;
        this.A01 = AnonymousClass4n2.A00(C18230wP.A0q(userSession));
        C10680ik r1 = new C10680ik(userSession);
        r1.A02 = "instagram_ibc_pinned_channel_settings_actions";
        this.A02 = r1.A00();
    }
}
