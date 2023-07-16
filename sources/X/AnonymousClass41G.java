package X;

import android.app.Activity;
import android.os.Bundle;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;
import java.util.HashMap;

/* renamed from: X.41G  reason: invalid class name */
public final /* synthetic */ class AnonymousClass41G implements McB {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ C21839C2o A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ User A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;

    public /* synthetic */ AnonymousClass41G(Activity activity, C21839C2o c2o, UserSession userSession, User user, String str, String str2) {
        this.A00 = activity;
        this.A04 = str;
        this.A05 = str2;
        this.A03 = user;
        this.A01 = c2o;
        this.A02 = userSession;
    }

    public final Object apply(Object obj) {
        Activity activity = this.A00;
        String str = this.A04;
        String str2 = this.A05;
        User user = this.A03;
        C21839C2o c2o = this.A01;
        UserSession userSession = this.A02;
        String str3 = (String) obj;
        if (str3 == null) {
            return null;
        }
        Bundle A06 = C18180wK.A06();
        A06.putString("android.intent.extra.TEXT", str3);
        HashMap A0y = AnonymousClass0wJ.A0y();
        A0y.put("url", str3);
        A0y.put("reel_id", str);
        AnonymousClass3iG.A0C(user, "item_id", str2, A0y);
        AnonymousClass3iG.A03(activity, A06, c2o, userSession, "share_to_system_sheet", A0y);
        return null;
    }
}
