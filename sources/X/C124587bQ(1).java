package X;

import android.app.Application;
import com.instagram.barcelona.search.SearchScreenViewModel;
import com.instagram.service.session.UserSession;

/* renamed from: X.7bQ  reason: invalid class name and case insensitive filesystem */
public final class C124587bQ implements C147138nS {
    public final Application A00;
    public final C11630kW A01;
    public final UserSession A02;

    public C124587bQ(Application application, C11630kW r3, UserSession userSession) {
        AnonymousClass0wJ.A1O(userSession, r3);
        C04220Ms.A0B(application, 3);
        this.A02 = userSession;
        this.A01 = r3;
        this.A00 = application;
    }

    public final /* synthetic */ C62793ak create(Class cls, C111686o9 r3) {
        return C147138nS.A00(this, cls);
    }

    public final C62793ak create(Class cls) {
        UserSession userSession = this.A02;
        return new SearchScreenViewModel(this.A00, this.A01, userSession);
    }
}
