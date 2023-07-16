package X;

import com.instagram.fanclub.api.FanClubApi;
import com.instagram.fanclub.promovideo.FanClubPromoAndWelcomeVideoApi;
import com.instagram.pendingmedia.store.PendingMediaStore;
import com.instagram.service.session.UserSession;

/* renamed from: X.3xs  reason: invalid class name and case insensitive filesystem */
public final class C66603xs implements C147138nS {
    public final UserSession A00;
    public final boolean A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;

    public C66603xs(UserSession userSession, boolean z, boolean z2, boolean z3, boolean z4) {
        C04220Ms.A0B(userSession, 1);
        this.A00 = userSession;
        this.A02 = z;
        this.A03 = z2;
        this.A01 = z3;
        this.A04 = z4;
    }

    public final C62793ak create(Class cls) {
        AnonymousClass23Z r1;
        C04220Ms.A0B(cls, 0);
        boolean z = this.A02;
        boolean z2 = this.A03;
        if (!z) {
            r1 = AnonymousClass23Z.WELCOME;
        } else if (!z2) {
            r1 = AnonymousClass23Z.PROMOTIONAL;
        } else {
            throw C18190wL.A0a(AnonymousClass000.A00(259));
        }
        UserSession userSession = this.A00;
        boolean z3 = this.A01;
        boolean z4 = this.A04;
        PendingMediaStore A012 = PendingMediaStore.A01(userSession);
        C04220Ms.A06(A012);
        AnonymousClass23Z r10 = r1;
        return new C195310c(r1, AnonymousClass3LY.A00(userSession), AnonymousClass3WJ.A00(), new FanClubPromoAndWelcomeVideoApi(r10, AnonymousClass2O7.A00(userSession), new FanClubApi(userSession), userSession, C04620Ok.A00(userSession)), A012, userSession, z3, z4);
    }

    public final /* synthetic */ C62793ak create(Class cls, C111686o9 r3) {
        return C98376Fg.A00(this, cls);
    }
}
