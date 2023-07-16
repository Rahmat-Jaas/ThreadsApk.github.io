package X;

import com.instagram.payout.repository.PayoutOnboardingRepository;
import com.instagram.service.session.UserSession;

/* renamed from: X.7bH  reason: invalid class name and case insensitive filesystem */
public final class C124497bH implements C147138nS {
    public final PayoutOnboardingRepository A00;
    public final UserSession A01;

    public C124497bH(PayoutOnboardingRepository payoutOnboardingRepository, UserSession userSession) {
        AnonymousClass0wJ.A1O(userSession, payoutOnboardingRepository);
        this.A01 = userSession;
        this.A00 = payoutOnboardingRepository;
    }

    public final /* synthetic */ C62793ak create(Class cls, C111686o9 r3) {
        return C147138nS.A00(this, cls);
    }

    public final C62793ak create(Class cls) {
        C04220Ms.A0B(cls, 0);
        if (cls.isAssignableFrom(I6I.class)) {
            return new I6I(this.A00, this.A01);
        }
        throw C18190wL.A0a(AnonymousClass0wJ.A0t("Unknown ViewModel class: ", cls));
    }
}
