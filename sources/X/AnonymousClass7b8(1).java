package X;

import android.app.Application;
import com.instagram.service.session.UserSession;

/* renamed from: X.7b8  reason: invalid class name */
public final class AnonymousClass7b8 implements C147138nS {
    public final Application A00;
    public final UserSession A01;

    public AnonymousClass7b8(Application application, UserSession userSession) {
        AnonymousClass0wJ.A1O(application, userSession);
        this.A00 = application;
        this.A01 = userSession;
    }

    public final /* synthetic */ C62793ak create(Class cls, C111686o9 r3) {
        return C147138nS.A00(this, cls);
    }

    public final C62793ak create(Class cls) {
        return new AnonymousClass56Q(this.A00, this.A01);
    }
}
