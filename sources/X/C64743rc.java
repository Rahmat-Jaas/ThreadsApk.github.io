package X;

import android.app.Activity;
import android.view.View;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.3rc  reason: invalid class name and case insensitive filesystem */
public final class C64743rc implements View.OnClickListener {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ AnonymousClass06E A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ User A03;
    public final /* synthetic */ User A04;
    public final /* synthetic */ EHB A05;
    public final /* synthetic */ String A06;

    public C64743rc(Activity activity, AnonymousClass06E r2, UserSession userSession, User user, User user2, EHB ehb, String str) {
        this.A00 = activity;
        this.A03 = user;
        this.A04 = user2;
        this.A02 = userSession;
        this.A01 = r2;
        this.A06 = str;
        this.A05 = ehb;
    }

    public final void onClick(View view) {
        int A052 = C14030oh.A05(-1268639957);
        Activity activity = this.A00;
        C25828Dsm A0W = C18190wL.A0W(activity);
        A0W.A0L(2131828105);
        User user = this.A03;
        String BK7 = user.BK7();
        User user2 = this.A04;
        boolean A1W = C18200wM.A1W(activity, A0W, user2, BK7, 2131828104);
        UserSession userSession = this.A02;
        A0W.A0P(new C64083jZ(activity, this.A01, userSession, user2, user, this.A05, this.A06), 2131821015);
        C18240wQ.A0s(C64273jy.A00, A0W, 2131823054, A1W);
        AnonymousClass0wJ.A1K(A0W);
        C14030oh.A0C(-1867242542, A052);
    }
}
