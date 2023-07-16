package X;

import com.instagram.appreciation.analytics.creator.CreatorLoggingData;
import com.instagram.service.session.UserSession;

/* renamed from: X.7bU  reason: invalid class name and case insensitive filesystem */
public final class C124627bU implements C147138nS {
    public final C122027Jo A00;
    public final CreatorLoggingData A01;
    public final UserSession A02;
    public final String A03;

    public C124627bU(C122027Jo r2, CreatorLoggingData creatorLoggingData, UserSession userSession, String str) {
        AnonymousClass0wJ.A1O(userSession, r2);
        C04220Ms.A0B(creatorLoggingData, 4);
        this.A02 = userSession;
        this.A00 = r2;
        this.A03 = str;
        this.A01 = creatorLoggingData;
    }

    public final /* synthetic */ C62793ak create(Class cls, C111686o9 r3) {
        return C147138nS.A00(this, cls);
    }

    public final C62793ak create(Class cls) {
        UserSession userSession = this.A02;
        return new AnonymousClass57S(this.A00, this.A01, new C111856oX(userSession), new C111006md(new C112456pc(AnonymousClass3WK.A01(userSession), userSession, this.A03)), AnonymousClass2FT.A00().A02(), userSession);
    }
}
