package X;

import com.instagram.service.session.UserSession;
import com.instagram.user.follow.FollowButton;
import com.instagram.user.model.User;

/* renamed from: X.7xZ  reason: invalid class name and case insensitive filesystem */
public final class C134377xZ implements C83884s9 {
    public final /* synthetic */ C110716m9 A00;
    public final /* synthetic */ AnonymousClass3HX A01;
    public final /* synthetic */ C127397h3 A02;
    public final /* synthetic */ UserSession A03;
    public final /* synthetic */ FollowButton A04;

    public final void Bxr(AnonymousClass3XX r1) {
    }

    public final void CNG(User user) {
        C04220Ms.A0B(user, 0);
        this.A00.A01 = user;
        FollowButton followButton = this.A04;
        AnonymousClass7GR.A00(this.A01, this.A02, this.A03, followButton, user);
    }

    public C134377xZ(C110716m9 r1, AnonymousClass3HX r2, C127397h3 r3, UserSession userSession, FollowButton followButton) {
        this.A00 = r1;
        this.A04 = followButton;
        this.A02 = r3;
        this.A01 = r2;
        this.A03 = userSession;
    }
}
