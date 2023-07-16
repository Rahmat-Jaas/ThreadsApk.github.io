package X;

import com.instagram.brandedcontent.ads.repository.BrandedContentAdsApi;
import com.instagram.brandedcontent.disclosure.BrandedContentDisclosureMenuViewModel;
import com.instagram.service.session.UserSession;

/* renamed from: X.7ar  reason: invalid class name and case insensitive filesystem */
public final class C124317ar implements C147138nS {
    public final UserSession A00;

    public C124317ar(UserSession userSession) {
        C04220Ms.A0B(userSession, 1);
        this.A00 = userSession;
    }

    public final /* synthetic */ C62793ak create(Class cls, C111686o9 r3) {
        return C147138nS.A00(this, cls);
    }

    public final C62793ak create(Class cls) {
        UserSession userSession = this.A00;
        return new BrandedContentDisclosureMenuViewModel(new BrandedContentAdsApi(userSession), userSession);
    }
}
