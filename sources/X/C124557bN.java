package X;

import com.instagram.barcelona.onboarding.data.OnboardingSuggestedFollowingRepository;
import com.instagram.service.session.UserSession;

/* renamed from: X.7bN  reason: invalid class name and case insensitive filesystem */
public final class C124557bN implements C147138nS {
    public final C11630kW A00;
    public final UserSession A01;
    public final boolean A02;

    public C124557bN(C11630kW r1, UserSession userSession, boolean z) {
        AnonymousClass0wJ.A1Q(userSession, r1);
        this.A02 = z;
        this.A01 = userSession;
        this.A00 = r1;
    }

    public final /* synthetic */ C62793ak create(Class cls, C111686o9 r3) {
        return C147138nS.A00(this, cls);
    }

    public final C62793ak create(Class cls) {
        boolean z = this.A02;
        UserSession userSession = this.A01;
        return new AnonymousClass582(new OnboardingSuggestedFollowingRepository(userSession, z), this.A00, userSession, z);
    }
}
