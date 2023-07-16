package X;

import android.app.Application;
import com.instagram.service.session.UserSession;

/* renamed from: X.3xC  reason: invalid class name and case insensitive filesystem */
public final class C66183xC implements C147138nS {
    public final Application A00;
    public final UserSession A01;

    public final /* synthetic */ C62793ak create(Class cls, C111686o9 r3) {
        return C98376Fg.A00(this, cls);
    }

    public final C62793ak create(Class cls) {
        return new C19270za(this.A00, this.A01);
    }

    public C66183xC(Application application, UserSession userSession) {
        this.A00 = application;
        this.A01 = userSession;
    }
}
