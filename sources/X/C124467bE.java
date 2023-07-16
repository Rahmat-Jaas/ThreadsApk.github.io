package X;

import com.instagram.brandedcontent.repository.BrandedContentSettingsRepository;
import com.instagram.mediakit.analytics.MediaKitEntryPoint;
import com.instagram.monetization.repository.MonetizationRepository;
import com.instagram.service.session.UserSession;
import kotlin.jvm.internal.KtLambdaShape39S0100000_I2_19;

/* renamed from: X.7bE  reason: invalid class name and case insensitive filesystem */
public final class C124467bE implements C147138nS {
    public final C11630kW A00;
    public final UserSession A01;

    public C124467bE(C11630kW r2, UserSession userSession) {
        C04220Ms.A0B(userSession, 1);
        this.A01 = userSession;
        this.A00 = r2;
    }

    public final /* synthetic */ C62793ak create(Class cls, C111686o9 r3) {
        return C147138nS.A00(this, cls);
    }

    public final C62793ak create(Class cls) {
        UserSession userSession = this.A01;
        C11630kW r3 = this.A00;
        Class<BrandedContentSettingsRepository> cls2 = BrandedContentSettingsRepository.class;
        MonetizationRepository A002 = AnonymousClass2RN.A00(userSession);
        C24854Db8 A003 = DC1.A00(userSession);
        A003.A00(MediaKitEntryPoint.BRANDED_CONTENT_SETTINGS);
        return new AnonymousClass58F((BrandedContentSettingsRepository) userSession.A01(cls2, new KtLambdaShape39S0100000_I2_19(userSession, 29)), r3, AnonymousClass6TB.A00(A003, userSession), A002, AnonymousClass3Zs.A03(userSession), userSession);
    }
}
