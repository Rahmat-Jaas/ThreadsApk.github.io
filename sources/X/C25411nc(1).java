package X;

import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.instagram.service.session.UserSession;

/* renamed from: X.1nc  reason: invalid class name and case insensitive filesystem */
public final class C25411nc extends C12140lP {
    public final /* synthetic */ C697249u A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C25411nc(C697249u r7) {
        super("initProfileInstaller", 609119367, 3, false, false);
        this.A00 = r7;
    }

    public final void loggedRun() {
        C697249u r4 = this.A00;
        if (C18210wN.A1S(36320975054182848L)) {
            UserSession userSession = r4.A06;
            C04220Ms.A0B(userSession, 0);
            USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A02(userSession), "ig_android_profile_installer"), 779);
            C18190wL.A1I(A0I, "profile_write_start");
            A0I.Bb4();
            C013706j.A00(r4.A05, new C66683y0(r4), new AnonymousClass0gP(609119367), false);
        }
    }
}
