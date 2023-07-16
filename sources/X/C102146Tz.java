package X;

import com.instagram.payout.api.PayoutApi;
import com.instagram.payout.repository.PayoutOnboardingRepository;
import com.instagram.service.session.UserSession;
import kotlin.jvm.internal.KtLambdaShape32S0200000_I2_16;

/* renamed from: X.6Tz  reason: invalid class name and case insensitive filesystem */
public final class C102146Tz {
    public static final PayoutOnboardingRepository A00(PayoutApi payoutApi, UserSession userSession) {
        C04220Ms.A0B(userSession, 0);
        return (PayoutOnboardingRepository) userSession.A01(PayoutOnboardingRepository.class, new KtLambdaShape32S0200000_I2_16(11, payoutApi, userSession));
    }
}
