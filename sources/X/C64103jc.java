package X;

import android.app.Activity;
import android.content.DialogInterface;
import com.instagram.search.common.analytics.SearchContext;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;
import org.json.JSONObject;

/* renamed from: X.3jc  reason: invalid class name and case insensitive filesystem */
public final class C64103jc implements DialogInterface.OnClickListener {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ C27950Ew0 A02;
    public final /* synthetic */ User A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ JSONObject A06;
    public final /* synthetic */ boolean A07;

    public C64103jc(Activity activity, UserSession userSession, C27950Ew0 ew0, User user, String str, String str2, JSONObject jSONObject, boolean z) {
        this.A00 = activity;
        this.A01 = userSession;
        this.A03 = user;
        this.A02 = ew0;
        this.A04 = str;
        this.A05 = str2;
        this.A06 = jSONObject;
        this.A07 = z;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        Activity activity = this.A00;
        UserSession userSession = this.A01;
        User user = this.A03;
        C27950Ew0 ew0 = this.A02;
        String str = this.A04;
        String str2 = this.A05;
        JSONObject jSONObject = this.A06;
        AnonymousClass0wJ.A1N(activity, userSession);
        C04220Ms.A0B(user, 2);
        C25791Ds4.A04(activity, (C15680ri) null, (C63873iU) null, (BKU) null, (C20066BMj) null, (SearchContext) null, userSession, ew0, user, (Integer) null, str, str2, (String) null, jSONObject);
        int i2 = 2131837225;
        if (user.Aj4() == C23894D0g.FollowStatusFollowing) {
            i2 = 2131827591;
        }
        C63813iO.A01(activity, activity.getString(i2));
        if (!this.A07) {
            C63373hN.A01(activity);
        }
    }
}
