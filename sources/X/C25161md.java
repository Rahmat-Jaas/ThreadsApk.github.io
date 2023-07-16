package X;

import com.instagram.service.session.UserSession;

/* renamed from: X.1md  reason: invalid class name and case insensitive filesystem */
public final class C25161md extends AnonymousClass0gG {
    public final /* synthetic */ C28181to A00;
    public final /* synthetic */ UserSession A01;

    public final void run() {
        C61823Vx r0;
        UserSession userSession = this.A01;
        AnonymousClass0TJ r5 = AnonymousClass0TJ.A05;
        C63173fJ.A01(r5, 18300361727019152L);
        C07810cE A002 = C63173fJ.A00(19144786657280063L);
        if (A002 != null) {
            A002.Adv(r5, 19144786657280063L);
        }
        C63173fJ.A02(r5, 18581836703795428L);
        C63173fJ.A04(r5, 18863311680635020L);
        if (C63803iN.A0E(r5, userSession, 36314755941533838L)) {
            C18250wR.A13(C10770iu.A00(), "Fake failure to simulate F&S canary failures, push_event_test_ig_user_session_canary_test.bool1", 817892914);
        }
        C63803iN.A0E(r5, userSession, 36314755941599375L);
        C63803iN.A00(r5, userSession, 37159180871860286L);
        C63803iN.A03(r5, userSession, 36596230918375651L);
        C63803iN.A0C(r5, userSession, 36877705895215243L);
        if (C63803iN.A0E(r5, userSession, 36319785348240787L) && C28181to.A04.nextInt(50000) == 0 && (r0 = C61823Vx.A01) != null) {
            C67603zp r7 = r0.A04(userSession).A01.A00;
            AnonymousClass0TJ A0Q = C18200wM.A0Q();
            A0Q.A02 = true;
            String valueOf = String.valueOf(r7.AtA(A0Q, 36601217375407737L));
            boolean z = false;
            boolean z2 = false;
            if (A0Q.A00.A00.A00 > 1) {
                z2 = true;
            }
            C28181to.A00(userSession, valueOf, 36601217375407737L, z2);
            String valueOf2 = String.valueOf(r7.AtA(A0Q, 36601221670375034L));
            boolean z3 = false;
            if (A0Q.A00.A00.A00 > 1) {
                z3 = true;
            }
            C28181to.A00(userSession, valueOf2, 36601221670375034L, z3);
            String valueOf3 = String.valueOf(r7.AtA(A0Q, 36601225965342331L));
            boolean z4 = false;
            if (A0Q.A00.A00.A00 > 1) {
                z4 = true;
            }
            C28181to.A00(userSession, valueOf3, 36601225965342331L, z4);
            String valueOf4 = String.valueOf(r7.AtA(A0Q, 36601230260309628L));
            if (A0Q.A00.A00.A00 > 1) {
                z = true;
            }
            C28181to.A00(userSession, valueOf4, 36601230260309628L, z);
        }
        if (C63803iN.A0E(r5, userSession, 36325875611870518L)) {
            H1T A0O = C18180wK.A0O(userSession);
            A0O.A0J("fast_and_safe/server_configs_test/");
            C63873iU.A0D(AnonymousClass0wJ.A0T(A0O, C21461Qx.class, AnonymousClass3K5.class), userSession, 120);
        }
        C28181to r1 = this.A00;
        r1.A03().A03();
        AnonymousClass3Ie A04 = r1.A04(userSession);
        if (A04 != null) {
            A04.A03();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C25161md(C28181to r2, UserSession userSession) {
        super(1297312377);
        this.A00 = r2;
        this.A01 = userSession;
    }
}
