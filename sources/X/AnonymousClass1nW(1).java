package X;

import android.os.SystemClock;
import com.instagram.service.session.UserSession;
import org.webrtc.RtcCertificatePem;

/* renamed from: X.1nW  reason: invalid class name */
public final class AnonymousClass1nW extends C12140lP {
    public final /* synthetic */ C697249u A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass1nW(C697249u r7, int i) {
        super("prefetchFXSwitcher", 1343961870, i, true, true);
        this.A00 = r7;
    }

    public final void loggedRun() {
        C697249u r4 = this.A00;
        C697249u.A03(r4);
        UserSession userSession = r4.A06;
        if (!C63793iM.A02()) {
            if (!C63793iM.A03() && !C63793iM.A0A(userSession)) {
                AnonymousClass0TJ r2 = AnonymousClass0TJ.A06;
                if (!C63173fJ.A05(r2, 18306074033526780L) && !C63173fJ.A05(r2, 18306074033788928L) && !C63793iM.A04() && !C63793iM.A05()) {
                    return;
                }
            }
            AnonymousClass3D7 A002 = C67313zL.A00(r4.A05, userSession);
            A002.A02 = "com.bloks.www.fx.company-identity-switcher.v1";
            C67313zL.A03(A002, userSession);
            if (C63173fJ.A05(AnonymousClass0TJ.A05, 18309003201224492L) && C39033Kkw.A01 != null) {
                String A01 = C32062H3c.A01(AnonymousClass00U.A0L(AnonymousClass2G0.A00(AnonymousClass0wJ.A0y(), "com.bloks.www.fx.company-identity-switcher.v1", "com.bloks.www.fx.company-identity-switcher.v1"), "loaded_screen_query"));
                C34819Ifn ifn = C34819Ifn.A05;
                C37043JjO jjO = new C37043JjO(A01);
                L5C l5c = ifn.A00;
                l5c.CeA(jjO.A0A);
                l5c.CeA(jjO.A0C);
            }
            if (C63793iM.A06()) {
                AnonymousClass142 r22 = new AnonymousClass142();
                r22.A01 = RtcCertificatePem.DEFAULT_EXPIRY;
                r22.A00();
                AnonymousClass4WJ.A0E(r22.A02);
                C04220Ms.A0B(userSession, 0);
                throw AnonymousClass0wJ.A0Z(userSession);
            }
            boolean A07 = C63793iM.A07();
            C04220Ms.A0B(userSession, 1);
            C210718u r6 = new C210718u(userSession, false, true, A07);
            M4x.A03(A002.A03, r6, "com.bloks.www.fx.company-identity-switcher.v1", A002.A02, C32282Bc.A00(A002.A06), A002.A01);
            AnonymousClass2BC.A01 = true;
            AnonymousClass2BC.A00 = SystemClock.elapsedRealtime();
        }
    }
}
