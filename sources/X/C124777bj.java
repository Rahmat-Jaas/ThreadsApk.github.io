package X;

import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S4000000_I2;
import com.instagram.appreciation.giftfeed.repository.AppreciationGiftFeedRepository;
import com.instagram.service.session.UserSession;

/* renamed from: X.7bj  reason: invalid class name and case insensitive filesystem */
public final class C124777bj implements C147138nS {
    public final C11630kW A00;
    public final UserSession A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;

    public C124777bj(C11630kW r2, UserSession userSession, String str, String str2, String str3, String str4) {
        AnonymousClass0wJ.A1O(userSession, str);
        C04220Ms.A0B(str4, 5);
        this.A01 = userSession;
        this.A05 = str;
        this.A04 = str2;
        this.A02 = str3;
        this.A03 = str4;
        this.A00 = r2;
    }

    public final /* synthetic */ C62793ak create(Class cls, C111686o9 r3) {
        return C147138nS.A00(this, cls);
    }

    public final C62793ak create(Class cls) {
        UserSession userSession = this.A01;
        String str = this.A05;
        AppreciationGiftFeedRepository appreciationGiftFeedRepository = new AppreciationGiftFeedRepository(userSession, str);
        return new AnonymousClass58E(new AnonymousClass7JF(new KtCSuperShape0S4000000_I2(str, this.A04, this.A02, this.A03, 5), this.A00, userSession), new AnonymousClass6LS(), appreciationGiftFeedRepository);
    }
}
