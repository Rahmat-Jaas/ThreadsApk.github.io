package X;

import android.app.Application;
import com.instagram.service.session.UserSession;
import com.instagram.settings.language.ContentLanguageSettingsApi;
import com.instagram.settings.language.ContentLanguageSettingsRepository;

/* renamed from: X.3xW  reason: invalid class name and case insensitive filesystem */
public final class C66383xW implements C147138nS {
    public final Application A00;
    public final UserSession A01;

    public C66383xW(Application application, UserSession userSession) {
        C04220Ms.A0B(userSession, 2);
        this.A00 = application;
        this.A01 = userSession;
    }

    public final /* synthetic */ C62793ak create(Class cls, C111686o9 r3) {
        return C98376Fg.A00(this, cls);
    }

    public final C62793ak create(Class cls) {
        Application application = this.A00;
        UserSession userSession = this.A01;
        return new C19220zV(application, new ContentLanguageSettingsRepository(application, userSession, new ContentLanguageSettingsApi(userSession)), C31103Gfm.A03());
    }
}
