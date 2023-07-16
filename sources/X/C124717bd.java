package X;

import android.app.Application;
import com.instagram.service.session.UserSession;

/* renamed from: X.7bd  reason: invalid class name and case insensitive filesystem */
public final class C124717bd implements C147138nS {
    public final Application A00;
    public final C11630kW A01;
    public final UserSession A02;
    public final String A03;

    public C124717bd(Application application, C11630kW r3, UserSession userSession, String str) {
        C18180wK.A1Q(userSession, 2, application);
        this.A03 = str;
        this.A02 = userSession;
        this.A01 = r3;
        this.A00 = application;
    }

    public final /* synthetic */ C62793ak create(Class cls, C111686o9 r3) {
        return C147138nS.A00(this, cls);
    }

    public final C62793ak create(Class cls) {
        String str = this.A03;
        UserSession userSession = this.A02;
        return new C879956a(this.A00, this.A01, userSession, str);
    }
}
