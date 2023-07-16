package X;

import com.instagram.brandedcontent.disclosure.BrandedContentDisclosureArgs;
import com.instagram.brandedcontent.repository.BrandedContentApi;
import com.instagram.service.session.UserSession;

/* renamed from: X.7bR  reason: invalid class name and case insensitive filesystem */
public final class C124597bR implements C147138nS {
    public final BrandedContentDisclosureArgs A00;
    public final C11630kW A01;
    public final UserSession A02;

    public C124597bR(BrandedContentDisclosureArgs brandedContentDisclosureArgs, C11630kW r3, UserSession userSession) {
        C18180wK.A1P(userSession, 1, brandedContentDisclosureArgs);
        this.A02 = userSession;
        this.A01 = r3;
        this.A00 = brandedContentDisclosureArgs;
    }

    public final /* synthetic */ C62793ak create(Class cls, C111686o9 r3) {
        return C147138nS.A00(this, cls);
    }

    public final C62793ak create(Class cls) {
        UserSession userSession = this.A02;
        C11630kW r4 = this.A01;
        return new CBO(this.A00, C34312Jb.A00(userSession), new BrandedContentApi(userSession), r4, userSession);
    }
}
