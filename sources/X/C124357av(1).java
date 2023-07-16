package X;

import com.instagram.monetization.onboarding.repository.OnboardingRepository;
import com.instagram.service.session.UserSession;
import kotlin.jvm.internal.KtLambdaShape31S0200000_I2_15;

/* renamed from: X.7av  reason: invalid class name and case insensitive filesystem */
public final class C124357av implements C147138nS {
    public final UserSession A00;

    public C124357av(UserSession userSession) {
        C04220Ms.A0B(userSession, 1);
        this.A00 = userSession;
    }

    public final /* synthetic */ C62793ak create(Class cls, C111686o9 r3) {
        return C147138nS.A00(this, cls);
    }

    public final C62793ak create(Class cls) {
        UserSession userSession = this.A00;
        return new CB4((OnboardingRepository) userSession.A01(OnboardingRepository.class, new KtLambdaShape31S0200000_I2_15(15, AnonymousClass0wJ.A0y(), userSession)), AnonymousClass2RN.A00(userSession), userSession);
    }
}
