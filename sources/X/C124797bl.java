package X;

import com.instagram.service.session.UserSession;
import com.instagram.wellbeing.upsells.fragment.remixsettings.RemixSettingsRepository;

/* renamed from: X.7bl  reason: invalid class name and case insensitive filesystem */
public final class C124797bl implements C147138nS {
    public final C11630kW A00;
    public final UserSession A01;
    public final C170759vW A02;
    public final AnonymousClass79D A03;
    public final AnonymousClass76U A04;
    public final String A05;

    public C124797bl(C11630kW r2, UserSession userSession, C170759vW r4, AnonymousClass79D r5, AnonymousClass76U r6, String str) {
        C04220Ms.A0B(userSession, 1);
        this.A01 = userSession;
        this.A05 = str;
        this.A02 = r4;
        this.A03 = r5;
        this.A04 = r6;
        this.A00 = r2;
    }

    public final /* synthetic */ C62793ak create(Class cls, C111686o9 r3) {
        return C147138nS.A00(this, cls);
    }

    public final C62793ak create(Class cls) {
        UserSession userSession = this.A01;
        String str = this.A05;
        C170759vW r4 = this.A02;
        AnonymousClass79D r6 = this.A03;
        return new AnonymousClass57W(new RemixSettingsRepository(this.A00, userSession, r4, new C112766q9(r4, r6, C972868t.REMIX_SETTINGS, str), r6, this.A04, str));
    }
}
