package X;

import android.app.Activity;
import com.instagram.model.hashtag.Hashtag;
import com.instagram.service.session.UserSession;
import java.util.Locale;

/* renamed from: X.41D  reason: invalid class name */
public final /* synthetic */ class AnonymousClass41D implements McB {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ C11630kW A01;
    public final /* synthetic */ Hashtag A02;
    public final /* synthetic */ UserSession A03;

    public /* synthetic */ AnonymousClass41D(Activity activity, C11630kW r2, Hashtag hashtag, UserSession userSession) {
        this.A00 = activity;
        this.A03 = userSession;
        this.A01 = r2;
        this.A02 = hashtag;
    }

    public final Object apply(Object obj) {
        Activity activity = this.A00;
        UserSession userSession = this.A03;
        C11630kW r5 = this.A01;
        Hashtag hashtag = this.A02;
        new C61693Ux(activity, r5, userSession, (String) obj, hashtag.A0B, activity.getResources().getString(2131833855), AnonymousClass00U.A0L("#", hashtag.A0C.toUpperCase(Locale.ROOT)), (String) null).A01();
        return null;
    }
}
