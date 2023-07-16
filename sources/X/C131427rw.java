package X;

import com.instagram.service.session.UserSession;
import com.instagram.user.follow.FollowButton;
import com.instagram.user.model.User;

/* renamed from: X.7rw  reason: invalid class name and case insensitive filesystem */
public final class C131427rw implements L5D {
    public final AnonymousClass3HX A00;
    public final C127397h3 A01;
    public final UserSession A02;
    public final FollowButton A03;
    public final User A04;

    public C131427rw(AnonymousClass3HX r2, C127397h3 r3, UserSession userSession, FollowButton followButton, User user) {
        C04220Ms.A0B(userSession, 5);
        this.A03 = followButton;
        this.A01 = r3;
        this.A00 = r2;
        this.A04 = user;
        this.A02 = userSession;
    }

    public final /* bridge */ /* synthetic */ boolean A4z(Object obj) {
        BBZ bbz = (BBZ) obj;
        C04220Ms.A0B(bbz, 0);
        return C04220Ms.A0I(this.A04.getId(), bbz.A00.getId());
    }

    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int A032 = C14030oh.A03(1672621563);
        int A033 = C14030oh.A03(2049552199);
        FollowButton followButton = this.A03;
        C127397h3 r3 = this.A01;
        AnonymousClass7GR.A00(this.A00, r3, this.A02, followButton, this.A04);
        C14030oh.A0A(986741150, A033);
        C14030oh.A0A(-1890568048, A032);
    }
}
