package X;

import com.instagram.barcelona.profile.ui.ProfileViewModel;
import com.instagram.service.session.UserSession;

/* renamed from: X.7bn  reason: invalid class name and case insensitive filesystem */
public final class C124817bn implements C147138nS {
    public final C24805DaJ A00;
    public final AnonymousClass7p1 A01;
    public final C11630kW A02;
    public final C21839C2o A03;
    public final UserSession A04;
    public final String A05;
    public final String A06;

    public C124817bn(C24805DaJ daJ, AnonymousClass7p1 r3, C11630kW r4, C21839C2o c2o, UserSession userSession, String str, String str2) {
        AnonymousClass0wJ.A1O(userSession, c2o);
        C86104wH.A1P(r3, 5, r4);
        this.A04 = userSession;
        this.A03 = c2o;
        this.A05 = str;
        this.A06 = str2;
        this.A01 = r3;
        this.A00 = daJ;
        this.A02 = r4;
    }

    public final /* synthetic */ C62793ak create(Class cls, C111686o9 r3) {
        return C147138nS.A00(this, cls);
    }

    public final C62793ak create(Class cls) {
        C04220Ms.A0B(cls, 0);
        UserSession userSession = this.A04;
        C21839C2o c2o = this.A03;
        String str = this.A05;
        String str2 = this.A06;
        AnonymousClass7p1 r4 = this.A01;
        return new ProfileViewModel(this.A00, new C58213En(this.A02, userSession), new C134637y5(c2o, userSession, str), r4, c2o, userSession, str, str2);
    }
}
