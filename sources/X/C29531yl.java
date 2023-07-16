package X;

import com.instagram.barcelona.R;
import com.instagram.service.session.UserSession;
import com.instagram.user.follow.FollowButton;
import com.instagram.user.model.User;

/* renamed from: X.1yl  reason: invalid class name and case insensitive filesystem */
public final class C29531yl extends C72114Mi {
    public final /* synthetic */ C21839C2o A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ FollowButton A02;

    public final void BpS(User user) {
        C04220Ms.A0B(user, 0);
        FollowButton followButton = this.A02;
        C23894D0g d0g = user.A03;
        C23894D0g d0g2 = C23894D0g.FollowStatusNotFollowing;
        int i = R.color.igds_primary_text;
        if (d0g == d0g2) {
            i = R.color.igds_primary_button;
        }
        followButton.setCustomForegroundColor(i);
        followButton.A03.A02(this.A00, this.A01, user);
    }

    public C29531yl(C21839C2o c2o, UserSession userSession, FollowButton followButton) {
        this.A02 = followButton;
        this.A01 = userSession;
        this.A00 = c2o;
    }
}
