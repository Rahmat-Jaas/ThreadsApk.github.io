package X;

import com.instagram.service.session.UserSession;

/* renamed from: X.35f  reason: invalid class name and case insensitive filesystem */
public final class C559535f {
    public final UserSession A00;

    public C559535f(UserSession userSession) {
        C04220Ms.A0B(userSession, 1);
        this.A00 = userSession;
        C28161tl.A04(userSession).getBoolean("has_seen_profile_pinned_highlights_nux", false);
    }
}
