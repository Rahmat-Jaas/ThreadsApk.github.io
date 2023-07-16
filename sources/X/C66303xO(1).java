package X;

import android.app.Application;
import com.instagram.events.data.EventsRepository;
import com.instagram.service.session.UserSession;

/* renamed from: X.3xO  reason: invalid class name and case insensitive filesystem */
public final class C66303xO implements C147138nS {
    public final Application A00;
    public final UserSession A01;

    public C66303xO(Application application, UserSession userSession) {
        C04220Ms.A0B(userSession, 1);
        this.A01 = userSession;
        this.A00 = application;
    }

    public final /* synthetic */ C62793ak create(Class cls, C111686o9 r3) {
        return C98376Fg.A00(this, cls);
    }

    public final C62793ak create(Class cls) {
        return new AnonymousClass10I(new EventsRepository(this.A00, this.A01));
    }
}
