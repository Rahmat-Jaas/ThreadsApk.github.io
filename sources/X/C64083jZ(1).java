package X;

import android.app.Activity;
import android.content.DialogInterface;
import com.instagram.common.api.base.IDxACallbackShape5S0400000_1_I2;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;
import kotlin.jvm.internal.KtLambdaShape3S1400000_I2;

/* renamed from: X.3jZ  reason: invalid class name and case insensitive filesystem */
public final class C64083jZ implements DialogInterface.OnClickListener {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ AnonymousClass06E A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ User A03;
    public final /* synthetic */ User A04;
    public final /* synthetic */ EHB A05;
    public final /* synthetic */ String A06;

    public C64083jZ(Activity activity, AnonymousClass06E r2, UserSession userSession, User user, User user2, EHB ehb, String str) {
        this.A00 = activity;
        this.A02 = userSession;
        this.A01 = r2;
        this.A04 = user;
        this.A03 = user2;
        this.A06 = str;
        this.A05 = ehb;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        Activity activity = this.A00;
        UserSession userSession = this.A02;
        AnonymousClass06E r2 = this.A01;
        User user = this.A04;
        User user2 = this.A03;
        String str = this.A06;
        EHB ehb = this.A05;
        H1T A0O = AnonymousClass0wJ.A0O(userSession);
        A0O.A0T("groups/%s/send_admin_request/%s/", C18220wO.A1Y(user, user2));
        C32165H8c A0T = AnonymousClass0wJ.A0T(A0O, AnonymousClass1R8.class, AnonymousClass3KQ.class);
        A0T.A00 = new IDxACallbackShape5S0400000_1_I2(9, activity, ehb, user2, new KtLambdaShape3S1400000_I2(user, user2, userSession, activity, str, 8));
        C31155GhB.A01(activity, r2, A0T);
    }
}
