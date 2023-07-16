package X;

import android.app.Application;
import com.instagram.pendingmedia.store.PendingMediaStore;
import com.instagram.service.session.UserSession;

/* renamed from: X.10j  reason: invalid class name and case insensitive filesystem */
public final class C195710j extends C884358b {
    public final Application A00;
    public final UserSession A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C195710j(Application application, UserSession userSession) {
        super(application);
        C04220Ms.A0B(userSession, 2);
        this.A00 = application;
        this.A01 = userSession;
    }

    public final C62793ak create(Class cls) {
        Application application = this.A00;
        UserSession userSession = this.A01;
        PendingMediaStore A012 = PendingMediaStore.A01(userSession);
        C04220Ms.A06(A012);
        return new C19260zZ(application, (C695148w) userSession.A01(C695148w.class, C18250wR.A0g(userSession, 18)), A012, userSession);
    }
}
