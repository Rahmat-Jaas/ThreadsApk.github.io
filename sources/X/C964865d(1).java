package X;

import com.instagram.common.bloks.mutations.IDxUOperationShape121S0100000_2_I2;
import com.instagram.service.session.UserSession;
import com.instagram.user.follow.FollowButton;
import com.instagram.user.model.User;

/* renamed from: X.65d  reason: invalid class name and case insensitive filesystem */
public final class C964865d extends C72114Mi {
    public final /* synthetic */ C11630kW A00;
    public final /* synthetic */ AnonymousClass3HX A01;
    public final /* synthetic */ C127397h3 A02;
    public final /* synthetic */ UserSession A03;
    public final /* synthetic */ FollowButton A04;

    public final void BpS(User user) {
        C04220Ms.A0B(user, 0);
        C25917DvL dvL = this.A04.A03;
        dvL.A06 = this;
        dvL.A02(this.A00, this.A03, user);
        User user2 = new User(user.getId(), user.BK7());
        user2.A21(user);
        C1193774x r8 = new C1193774x(user2);
        AnonymousClass3HX r5 = this.A01;
        AnonymousClass7HV A012 = AnonymousClass7K7.A01(r5);
        C127397h3 r4 = this.A02;
        AnonymousClass7r4.A00(A012, new IDxUOperationShape121S0100000_2_I2(r8, 1), (long) r4.A02);
        C109326jp A0L = r4.A0L(43);
        C23894D0g d0g = user.A03;
        if (A0L != null) {
            String A032 = C19527Axo.A03(d0g);
            AnonymousClass3VO A002 = AnonymousClass3VO.A00();
            A002.A02(r4, 0);
            A002.A02(A032, 1);
            C122047Jt.A07(r5, r4, A002, A0L);
        }
        C109326jp A08 = C127397h3.A08(r4);
        if (A08 != null && d0g == C23894D0g.FollowStatusFollowing) {
            C122047Jt.A03(r5, r4, C86104wH.A0W(r4), A08);
        }
        C109326jp A0V = C18230wP.A0V(r4);
        if (A0V != null && d0g == C23894D0g.FollowStatusNotFollowing) {
            C122047Jt.A03(r5, r4, C86104wH.A0W(r4), A0V);
        }
    }

    public final void Bzl(User user) {
        C04220Ms.A0B(user, 0);
        C127397h3 r3 = this.A02;
        C109326jp A0V = C18230wP.A0V(r3);
        if (A0V != null && user.A03 == C23894D0g.FollowStatusNotFollowing) {
            C122047Jt.A03(this.A01, r3, C86104wH.A0W(r3), A0V);
        }
    }

    public C964865d(C11630kW r1, AnonymousClass3HX r2, C127397h3 r3, UserSession userSession, FollowButton followButton) {
        this.A04 = followButton;
        this.A03 = userSession;
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
    }
}
