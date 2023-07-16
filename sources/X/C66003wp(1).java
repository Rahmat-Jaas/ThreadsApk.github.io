package X;

import com.instagram.creatortools.api.CreatorToolsMonetizationApi;
import com.instagram.service.session.UserSession;
import kotlin.jvm.internal.KtLambdaShape60S0100000_I2_40;

/* renamed from: X.3wp  reason: invalid class name and case insensitive filesystem */
public final class C66003wp implements C147138nS {
    public final UserSession A00;

    public C66003wp(UserSession userSession) {
        C04220Ms.A0B(userSession, 1);
        this.A00 = userSession;
    }

    public final /* synthetic */ C62793ak create(Class cls, C111686o9 r3) {
        return C98376Fg.A00(this, cls);
    }

    public final C62793ak create(Class cls) {
        UserSession userSession = this.A00;
        return new AnonymousClass10W((CreatorToolsMonetizationApi) userSession.A01(CreatorToolsMonetizationApi.class, new KtLambdaShape60S0100000_I2_40(userSession, 28)), userSession);
    }
}
