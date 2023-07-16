package X;

import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.46g  reason: invalid class name and case insensitive filesystem */
public final class C689846g implements L5D {
    public final /* synthetic */ AnonymousClass47I A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ C19818BBs A02;

    public C689846g(AnonymousClass47I r1, UserSession userSession, C19818BBs bBs) {
        this.A00 = r1;
        this.A01 = userSession;
        this.A02 = bBs;
    }

    public final /* bridge */ /* synthetic */ boolean A4z(Object obj) {
        AnonymousClass46P r3 = (AnonymousClass46P) obj;
        C04220Ms.A0B(r3, 0);
        return C04220Ms.A0I(r3.A00.getId(), this.A00.A05);
    }

    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        C23894D0g d0g;
        int A03 = C14030oh.A03(-125578897);
        AnonymousClass46P r7 = (AnonymousClass46P) obj;
        int A002 = AnonymousClass0wJ.A00(773586541, r7);
        AnonymousClass47I r5 = this.A00;
        User user = r7.A00;
        r5.A04 = user;
        r5.A06 = user.BK7();
        r5.A05 = user.getId();
        User user2 = r5.A04;
        if (user2 != null) {
            d0g = user2.Aj4();
        } else {
            d0g = null;
        }
        if (d0g == C23894D0g.FollowStatusUnknown) {
            C37088JkK.A00(this.A01).A0C(user);
        }
        UserSession userSession = this.A01;
        r5.A02(userSession, this.A02);
        AnonymousClass3LY.A00(userSession).A02(this, AnonymousClass46P.class);
        C14030oh.A0A(-722594906, A002);
        C14030oh.A0A(1267726499, A03);
    }
}
