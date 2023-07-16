package X;

import android.app.Activity;
import android.view.View;
import com.facebook.redex.IDxCListenerShape3S0700000_1_I2;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.3rb  reason: invalid class name and case insensitive filesystem */
public final class C64733rb implements View.OnClickListener {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ AnonymousClass06E A01;
    public final /* synthetic */ C84664te A02;
    public final /* synthetic */ UserSession A03;
    public final /* synthetic */ User A04;
    public final /* synthetic */ User A05;
    public final /* synthetic */ EHC A06;

    public C64733rb(Activity activity, AnonymousClass06E r2, C84664te r3, UserSession userSession, User user, User user2, EHC ehc) {
        this.A00 = activity;
        this.A04 = user;
        this.A05 = user2;
        this.A03 = userSession;
        this.A01 = r2;
        this.A02 = r3;
        this.A06 = ehc;
    }

    public final void onClick(View view) {
        int A052 = C14030oh.A05(-684532568);
        Activity activity = this.A00;
        C25828Dsm A0W = C18190wL.A0W(activity);
        A0W.A0L(2131828108);
        User user = this.A04;
        String BK7 = user.BK7();
        User user2 = this.A05;
        boolean A1W = C18200wM.A1W(activity, A0W, user2, BK7, 2131828107);
        AnonymousClass25l.A00(new IDxCListenerShape3S0700000_1_I2(activity, this.A01, this.A02, this.A03, user2, user, this.A06, 0), A0W, 2131834607);
        C18240wQ.A0s(C64233ju.A00, A0W, 2131823054, A1W);
        AnonymousClass0wJ.A1K(A0W);
        C14030oh.A0C(134227000, A052);
    }
}
