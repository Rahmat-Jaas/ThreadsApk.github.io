package X;

import com.instagram.monetization.onboarding.repository.OnboardingRepository;
import com.instagram.monetization.repository.MonetizationRepository;
import com.instagram.service.session.UserSession;
import kotlin.jvm.internal.KtLambdaShape31S0200000_I2_15;

/* renamed from: X.7bK  reason: invalid class name and case insensitive filesystem */
public final class C124527bK implements C147138nS {
    public final C122027Jo A00;
    public final UserSession A01;
    public final String A02;

    public C124527bK(C122027Jo r1, UserSession userSession, String str) {
        AnonymousClass0wJ.A1O(userSession, r1);
        this.A01 = userSession;
        this.A00 = r1;
        this.A02 = str;
    }

    public final /* synthetic */ C62793ak create(Class cls, C111686o9 r3) {
        return C147138nS.A00(this, cls);
    }

    public final C62793ak create(Class cls) {
        UserSession userSession = this.A01;
        C111006md r3 = new C111006md(new C112456pc(AnonymousClass3WK.A01(userSession), userSession, this.A02));
        MonetizationRepository A002 = AnonymousClass2RN.A00(userSession);
        Class<OnboardingRepository> cls2 = OnboardingRepository.class;
        AnonymousClass6LN r2 = new AnonymousClass6LN();
        return new AnonymousClass58H(this.A00, r2, r3, AnonymousClass2FT.A00().A02(), (OnboardingRepository) userSession.A01(cls2, new KtLambdaShape31S0200000_I2_15(15, AnonymousClass0wJ.A0y(), userSession)), A002, userSession);
    }
}
