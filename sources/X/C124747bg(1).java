package X;

import android.app.Application;
import android.content.Context;
import com.instagram.barcelona.feed.data.BarcelonaFeedRepository;
import com.instagram.service.session.UserSession;

/* renamed from: X.7bg  reason: invalid class name and case insensitive filesystem */
public final class C124747bg implements C147138nS {
    public final Application A00;
    public final Context A01;
    public final C24805DaJ A02;
    public final C21839C2o A03;
    public final UserSession A04;

    public C124747bg(Application application, Context context, C24805DaJ daJ, C21839C2o c2o, UserSession userSession) {
        AnonymousClass0wJ.A1O(userSession, c2o);
        C04220Ms.A0B(application, 3);
        this.A04 = userSession;
        this.A03 = c2o;
        this.A00 = application;
        this.A01 = context;
        this.A02 = daJ;
    }

    public final /* synthetic */ C62793ak create(Class cls, C111686o9 r3) {
        return C147138nS.A00(this, cls);
    }

    public final C62793ak create(Class cls) {
        UserSession userSession = this.A04;
        C21839C2o c2o = this.A03;
        return new AnonymousClass56T(this.A00, new BarcelonaFeedRepository(this.A01, c2o, new JSG(userSession), userSession), this.A02, c2o, userSession);
    }
}
