package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.instagram.search.common.analytics.SearchContext;
import com.instagram.service.session.UserSession;
import com.instagram.user.follow.FollowButton;
import com.instagram.user.model.User;

/* renamed from: X.3ro  reason: invalid class name and case insensitive filesystem */
public final class C64783ro implements View.OnClickListener {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ C11630kW A02;
    public final /* synthetic */ UserSession A03;
    public final /* synthetic */ FollowButton A04;
    public final /* synthetic */ C27950Ew0 A05;
    public final /* synthetic */ C25917DvL A06;
    public final /* synthetic */ User A07;
    public final /* synthetic */ Boolean A08;

    public C64783ro(Activity activity, Context context, C11630kW r3, UserSession userSession, FollowButton followButton, C27950Ew0 ew0, C25917DvL dvL, User user, Boolean bool) {
        this.A07 = user;
        this.A04 = followButton;
        this.A03 = userSession;
        this.A02 = r3;
        this.A05 = ew0;
        this.A06 = dvL;
        this.A08 = bool;
        this.A01 = context;
        this.A00 = activity;
    }

    public final void onClick(View view) {
        int A052 = C14030oh.A05(1817813055);
        User user = this.A07;
        if (user.BRq()) {
            FollowButton followButton = this.A04;
            C25791Ds4.A06(this.A03, followButton, this.A05, user, this.A02.getModuleName());
        } else {
            C25917DvL dvL = this.A06;
            UserSession userSession = this.A03;
            if (C25917DvL.A00(userSession, user) != C23894D0g.FollowStatusFollowing) {
                C27950Ew0 ew0 = this.A05;
                C04220Ms.A0B(userSession, 0);
                dvL.A03((C15680ri) null, (BKU) null, (C20066BMj) null, (SearchContext) null, userSession, ew0, user, (C145018jf) null, (String) null);
            } else if (this.A08.booleanValue()) {
                if (C25745DrH.A00.A02(this.A01) != null) {
                    throw C18200wM.A0d();
                }
            } else if (this.A00 != null) {
                C18240wQ.A0o();
                throw null;
            }
        }
        C14030oh.A0C(-323655922, A052);
    }
}
