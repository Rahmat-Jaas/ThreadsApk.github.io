package X;

import android.app.Application;
import com.google.android.gms.common.GoogleApiAvailability;
import com.instagram.service.session.UserSession;

/* renamed from: X.58a  reason: invalid class name */
public final class AnonymousClass58a extends C884358b {
    public final Application A00;
    public final UserSession A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass58a(Application application, UserSession userSession) {
        super(application);
        C04220Ms.A0B(userSession, 2);
        this.A00 = application;
        this.A01 = userSession;
    }

    public final C62793ak create(Class cls) {
        Application application = this.A00;
        UserSession userSession = this.A01;
        return new C8A(application, new C111786oO(GoogleApiAvailability.A00), AnonymousClass6RJ.A00(application, userSession), userSession);
    }
}
