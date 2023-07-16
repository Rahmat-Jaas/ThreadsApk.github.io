package X;

import android.content.Context;
import ch.boye.httpclientandroidlib.HttpStatus;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.facebook.video.heroplayer.setting.HeroPlayerSetting;
import com.instagram.realtimeclient.RealtimeSubscription;
import com.instagram.service.session.UserSession;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.3if  reason: invalid class name and case insensitive filesystem */
public final class C63923if {
    public static volatile HeroPlayerSetting A00;

    public static C72374Nu A04(int i) {
        C58953Ir r1 = new C58953Ir();
        r1.A07(true);
        r1.A01(i);
        r1.A02(i);
        r1.A06(i);
        r1.A05(i);
        r1.A04(i);
        r1.A03(i);
        return r1.A00();
    }

    public static C72374Nu A06(UserSession userSession) {
        C58953Ir r1 = new C58953Ir();
        r1.A07(C50942to.A00(userSession).booleanValue());
        r1.A01(C50882ti.A00(userSession).intValue());
        A0R(r1, C50892tj.A00(userSession));
        A0U(r1, C50932tn.A00(userSession));
        A0S(r1, C50922tm.A00(userSession));
        A0T(r1, C50912tl.A00(userSession));
        return A05(r1, C50902tk.A00(userSession));
    }

    public static C72374Nu A07(UserSession userSession) {
        C58953Ir r1 = new C58953Ir();
        r1.A07(true);
        r1.A01(C52452wF.A00(userSession).intValue());
        A0R(r1, C52462wG.A00(userSession));
        A0U(r1, C52472wH.A00(userSession));
        A0S(r1, C52482wI.A00(userSession));
        A0T(r1, C52492wJ.A00(userSession));
        return A05(r1, C52552wP.A00(userSession));
    }

    public static C72374Nu A08(UserSession userSession) {
        C58953Ir r1 = new C58953Ir();
        r1.A07(true);
        r1.A01(C52502wK.A00(userSession).intValue());
        A0R(r1, C52512wL.A00(userSession));
        A0U(r1, C52522wM.A00(userSession));
        A0S(r1, C52532wN.A00(userSession));
        A0T(r1, C52542wO.A00(userSession));
        return A05(r1, C52552wP.A00(userSession));
    }

    public static C72374Nu A0D(UserSession userSession) {
        C58953Ir r1 = new C58953Ir();
        A0R(r1, C51512uj.A00(userSession));
        A0U(r1, C51542um.A00(userSession));
        A0S(r1, C51532ul.A00(userSession));
        A0T(r1, C51522uk.A00(userSession));
        return r1.A00();
    }

    public static C72374Nu A0E(UserSession userSession) {
        C58953Ir r1 = new C58953Ir();
        r1.A07(C51032tx.A00(userSession).booleanValue());
        r1.A01(C50972tr.A00(userSession).intValue());
        A0R(r1, C50982ts.A00(userSession));
        A0U(r1, C51022tw.A00(userSession));
        A0S(r1, C51012tv.A00(userSession));
        A0T(r1, C51002tu.A00(userSession));
        return A05(r1, C50992tt.A00(userSession));
    }

    public static C72354Ns A0G() {
        AnonymousClass3GZ r0 = new AnonymousClass3GZ();
        r0.A01();
        return r0.A00();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x01da, code lost:
        if (X.C54012yl.A00(r9).booleanValue() != false) goto L_0x01dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0263, code lost:
        if (X.C51092u3.A00(r9).booleanValue() == false) goto L_0x0265;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x02c1, code lost:
        if (X.C51842vG.A00(r9).booleanValue() != false) goto L_0x02c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x053b, code lost:
        if (X.C52912wz.A00(r9).booleanValue() != false) goto L_0x053d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x005a, code lost:
        if (X.C52902wy.A00(r9).booleanValue() != false) goto L_0x005c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.facebook.video.heroplayer.setting.HeroPlayerSetting A0I(android.content.Context r8, com.instagram.service.session.UserSession r9) {
        /*
            com.facebook.video.heroplayer.setting.HeroPlayerSetting r0 = A00
            if (r0 != 0) goto L_0x09fe
            X.3J2 r1 = new X.3J2
            r1.<init>()
            java.lang.Boolean r0 = X.C51382uW.A00(r9)
            boolean r0 = r0.booleanValue()
            r1.A1w(r0)
            r5 = 1
            r1.A0P()
            r1.A0Z()
            java.lang.Boolean r0 = X.C51322uQ.A00(r9)
            boolean r0 = r0.booleanValue()
            r1.A2h(r0)
            java.lang.Boolean r0 = X.C51312uP.A00(r9)
            boolean r0 = r0.booleanValue()
            r1.A2u(r0)
            java.lang.Boolean r0 = X.C53072xF.A00(r9)
            boolean r0 = r0.booleanValue()
            r1.A1o(r0)
            java.lang.Boolean r0 = X.C51732v5.A00(r9)
            boolean r0 = r0.booleanValue()
            r1.A2Y(r0)
            java.lang.Boolean r0 = X.C53492xv.A00(r9)
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x005c
            java.lang.Boolean r0 = X.C52902wy.A00(r9)
            boolean r2 = r0.booleanValue()
            r0 = 0
            if (r2 == 0) goto L_0x005d
        L_0x005c:
            r0 = 1
        L_0x005d:
            r1.A32(r0)
            r1.A0C()
            r1.A0m()
            java.lang.Boolean r0 = X.C51412uZ.A00(r9)
            boolean r0 = r0.booleanValue()
            r0 = r0 ^ 1
            r1.A2I(r0)
            java.lang.Boolean r0 = X.C51472uf.A00(r9)
            boolean r0 = r0.booleanValue()
            r1.A2F(r0)
            X.Jo8 r0 = X.C37292Jo8.A00()
            java.lang.String r0 = r0.A03()
            r1.A1e(r0)
            java.lang.Boolean r0 = X.C51452ud.A00(r9)
            boolean r0 = r0.booleanValue()
            r1.A20(r0)
            r1.A0b()
            r1.A01()
            r1.A0j()
            X.KYV r0 = A0H(r8, r9)
            r1.A1Z(r0)
            r1.A09()
            X.4Ns r0 = A0G()
            r1.A1Y(r0)
            r1.A0F()
            java.lang.Boolean r0 = X.C51922vO.A00(r9)
            boolean r0 = r0.booleanValue()
            r1.A2T(r0)
            r1.A0h()
            java.lang.Boolean r0 = X.C51392uX.A00(r9)
            boolean r0 = r0.booleanValue()
            r0 = r0 ^ 1
            r1.A2k(r0)
            r1.A0I()
            java.lang.Boolean r0 = X.C53932yd.A00(r9)
            boolean r0 = r0.booleanValue()
            r1.A2s(r0)
            r1.A05()
            r1.A06()
            r1.A0K()
            r1.A0J()
            java.lang.Boolean r0 = X.C50802ta.A00(r9)
            boolean r0 = r0.booleanValue()
            r1.A1x(r0)
            java.lang.Long r0 = X.C52722wg.A00(r9)
            long r2 = r0.longValue()
            r1.A1M(r2)
            java.lang.Long r0 = X.C53372xj.A00(r9)
            long r2 = r0.longValue()
            r1.A1K(r2)
            java.lang.Boolean r0 = X.C53082xG.A00(r9)
            boolean r0 = r0.booleanValue()
            r1.A2l(r0)
            r1.A0d()
            java.lang.Boolean r0 = X.C52262vw.A00(r9)
            boolean r0 = r0.booleanValue()
            r1.A2C(r0)
            java.lang.Long r0 = X.C52272vx.A00(r9)
            int r0 = r0.intValue()
            r1.A12(r0)
            java.lang.Boolean r0 = X.C53502xw.A00(r9)
            boolean r0 = r0.booleanValue()
            r1.A2r(r0)
            X.4Nu r0 = A08(r9)
            r1.A1P(r0)
            X.4Nu r0 = A07(r9)
            r1.A1O(r0)
            java.lang.Boolean r0 = X.C53032xB.A00(r9)
            boolean r0 = r0.booleanValue()
            r1.A2b(r0)
            java.util.Set r0 = A0P(r9)
            r1.A1h(r0)
            java.lang.Boolean r0 = X.C51622uu.A00(r9)
            boolean r0 = r0.booleanValue()
            r1.A2c(r0)
            java.lang.Boolean r0 = X.C51612ut.A00(r9)
            boolean r0 = r0.booleanValue()
            r1.A1t(r0)
            java.lang.Long r0 = X.C51632uv.A00(r9)
            int r0 = r0.intValue()
            r1.A17(r0)
            java.lang.Long r0 = X.C51642uw.A00(r9)
            int r0 = r0.intValue()
            r1.A16(r0)
            java.lang.Boolean r0 = X.C51432ub.A00(r9)
            boolean r0 = r0.booleanValue()
            r1.A1v(r0)
            java.lang.Boolean r0 = X.C51422ua.A00(r9)
            boolean r0 = r0.booleanValue()
            r1.A1u(r0)
            java.lang.Boolean r0 = X.C51462ue.A00(r9)
            boolean r0 = r0.booleanValue()
            r1.A28(r0)
            java.lang.Boolean r0 = X.C51442uc.A00(r9)
            boolean r0 = r0.booleanValue()
            r1.A1z(r0)
            java.lang.Long r0 = X.C51402uY.A00(r9)
            int r0 = r0.intValue()
            r1.A0p(r0)
            r1.A0f()
            r1.A02()
            r1.A0a()
            boolean r0 = A0b()
            if (r0 != 0) goto L_0x01cb
            X.C54012yl.A00(r9)
        L_0x01cb:
            boolean r0 = A0b()
            if (r0 != 0) goto L_0x01dc
            java.lang.Boolean r0 = X.C54012yl.A00(r9)
            boolean r2 = r0.booleanValue()
            r0 = 0
            if (r2 == 0) goto L_0x01dd
        L_0x01dc:
            r0 = 1
        L_0x01dd:
            r1.A2t(r0)
            java.lang.Boolean r0 = X.C54032yn.A00(r9)
            boolean r0 = r0.booleanValue()
            r1.A3H(r0)
            r1.A0k()
            r1.A0l()
            java.lang.Boolean r0 = X.C53062xE.A00(r9)
            boolean r0 = r0.booleanValue()
            r1.A2j(r0)
            java.lang.Boolean r0 = X.C53052xD.A00(r9)
            boolean r0 = r0.booleanValue()
            r1.A2d(r0)
            java.lang.Boolean r0 = X.C51192uD.A00(r9)
            boolean r0 = r0.booleanValue()
            r1.A3I(r0)
            java.lang.Long r0 = X.C51172uB.A00(r9)
            int r0 = r0.intValue()
            r1.A0t(r0)
            java.lang.Long r0 = X.C51162uA.A00(r9)
            int r0 = r0.intValue()
            r1.A0s(r0)
            java.lang.Boolean r0 = X.C51182uC.A00(r9)
            boolean r0 = r0.booleanValue()
            r1.A2q(r0)
            java.lang.String r0 = X.C51102u4.A00(r9)
            r1.A1d(r0)
            java.lang.Boolean r0 = X.C51082u2.A00(r9)
            boolean r0 = r0.booleanValue()
            r1.A1k(r0)
            java.lang.Boolean r0 = X.C51072u1.A00(r9)
            boolean r0 = r0.booleanValue()
            r1.A1m(r0)
            java.lang.Boolean r0 = X.C51362uU.A00(r9)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0265
            java.lang.Boolean r0 = X.C51092u3.A00(r9)
            boolean r2 = r0.booleanValue()
            r0 = 1
            if (r2 != 0) goto L_0x0266
        L_0x0265:
            r0 = 0
        L_0x0266:
            r1.A1l(r0)
            r1.A04()
            java.lang.Boolean r0 = X.C51152u9.A00(r9)
            boolean r0 = r0.booleanValue()
            r1.A2S(r0)
            java.lang.Boolean r0 = X.C51122u6.A00(r9)
            boolean r0 = r0.booleanValue()
            r1.A25(r0)
            java.lang.Boolean r0 = X.C51112u5.A00(r9)
            boolean r0 = r0.booleanValue()
            r1.A24(r0)
            java.lang.Boolean r0 = X.C51132u7.A00(r9)
            boolean r0 = r0.booleanValue()
            r1.A26(r0)
            java.lang.Boolean r0 = X.C51142u8.A00(r9)
            boolean r0 = r0.booleanValue()
            r1.A2Q(r0)
            java.lang.Boolean r0 = X.C51202uE.A00(r9)
            boolean r0 = r0.booleanValue()
            r1.A38(r0)
            java.lang.Boolean r0 = X.C52962x4.A00(r9)
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x02c3
            java.lang.Boolean r0 = X.C51842vG.A00(r9)
            boolean r2 = r0.booleanValue()
            r0 = 0
            if (r2 == 0) goto L_0x02c4
        L_0x02c3:
            r0 = 1
        L_0x02c4:
            r1.A2x(r0)
            X.0et r0 = X.C09120et.A02()
            boolean r0 = r0.A0T()
            r1.A2w(r0)
            r1.A0T()
            r1.A0U()
            java.lang.Boolean r0 = X.C53142xM.A00(r9)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0a13
            java.lang.Long r0 = X.C60473Pe.A01(r9)
        L_0x02e6:
            int r0 = r0.intValue()
            r1.A0z(r0)
            X.3DV r0 = new X.3DV
            r0.<init>()
            X.4Nw r0 = r0.A00()
            r1.A1W(r0)
            java.lang.Boolean r0 = X.C53382xk.A00(r9)
            boolean r0 = r0.booleanValue()
            r1.A1j(r0)
            java.lang.Boolean r0 = X.C53422xo.A00(r9)
            boolean r0 = r0.booleanValue()
            r1.A2i(r0)
            java.lang.Long r0 = X.C53472xt.A00(r9)
            int r0 = r0.intValue()
            r1.A1C(r0)
            java.lang.Long r0 = X.C53452xr.A00(r9)
            int r0 = r0.intValue()
            r1.A19(r0)
            java.lang.Long r0 = X.C53442xq.A00(r9)
            int r0 = r0.intValue()
            r1.A15(r0)
            java.lang.Long r0 = X.C53432xp.A00(r9)
            int r0 = r0.intValue()
            r1.A14(r0)
            java.lang.Boolean r0 = X.C53142xM.A00(r9)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0a0d
            java.lang.Boolean r0 = X.C60463Pd.A01(r9)
        L_0x0349:
            boolean r0 = r0.booleanValue()
            r1.A2H(r0)
            java.lang.Boolean r0 = X.C53142xM.A00(r9)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0a07
            java.lang.Boolean r0 = X.C60453Pc.A01(r9)
        L_0x035e:
            boolean r0 = r0.booleanValue()
            r1.A2G(r0)
            java.util.Map r0 = A0O(r9)
            r1.A1g(r0)
            java.lang.Boolean r0 = X.C53142xM.A00(r9)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0a01
            java.lang.Long r0 = X.AnonymousClass3Pg.A01(r9)
        L_0x037a:
            int r0 = r0.intValue()
            r1.A1J(r0)
            java.lang.Long r0 = X.C53392xl.A00(r9)
            r0.intValue()
            java.lang.Boolean r0 = X.C53482xu.A00(r9)
            boolean r2 = r0.booleanValue()
            X.4Nj r0 = new X.4Nj
            r0.<init>(r2)
            r1.A1c(r0)
            java.lang.Boolean r0 = X.C53402xm.A00(r9)
            boolean r0 = r0.booleanValue()
            r1.A1r(r0)
            java.lang.Long r0 = X.C53462xs.A00(r9)
            int r0 = r0.intValue()
            r1.A1D(r0)
            r1.A0R()
            boolean r0 = A0e(r9)
            r1.A2N(r0)
            boolean r0 = A0d(r9)
            r1.A2M(r0)
            A0j(r9)
            A0j(r9)
            int r0 = A00(r9)
            r1.A10(r0)
            boolean r0 = A0m(r9)
            r1.A3C(r0)
            int r0 = A01(r9)
            r1.A11(r0)
            java.lang.String r0 = A0M(r9)
            r1.A1f(r0)
            boolean r0 = A0f(r9)
            r1.A2O(r0)
            boolean r0 = A0g(r9)
            r1.A2P(r0)
            boolean r0 = A0c(r9)
            r1.A21(r0)
            r1.A0Q()
            r1.A07()
            boolean r0 = A0n(r9)
            r1.A3F(r0)
            boolean r0 = A0k(r9)
            r1.A37(r0)
            boolean r0 = A0l(r9)
            r1.A3A(r0)
            boolean r0 = A0h(r9)
            r1.A1i(r0)
            java.lang.Boolean r0 = X.C52562wQ.A00(r9)
            boolean r0 = r0.booleanValue()
            r1.A2K(r0)
            java.lang.Long r0 = X.C52362w6.A00(r9)
            int r0 = r0.intValue()
            r1.A0v(r0)
            java.lang.Long r0 = X.C52352w5.A00(r9)
            int r0 = r0.intValue()
            r1.A0u(r0)
            java.lang.Boolean r0 = X.C52572wR.A00(r9)
            boolean r0 = r0.booleanValue()
            r1.A1s(r0)
            java.lang.Boolean r0 = X.C53992yj.A00(r9)
            boolean r0 = r0.booleanValue()
            r1.A3J(r0)
            java.lang.Boolean r0 = X.C53982yi.A00(r9)
            boolean r0 = r0.booleanValue()
            r1.A3L(r0)
            java.lang.Boolean r0 = X.C53972yh.A00(r9)
            boolean r0 = r0.booleanValue()
            r1.A2n(r0)
            r1.A0N()
            java.lang.Boolean r0 = X.C54002yk.A00(r9)
            boolean r0 = r0.booleanValue()
            r1.A2z(r0)
            r1.A0e()
            r1.A0L()
            boolean r0 = A0i(r9)
            r1.A2f(r0)
            r1.A0M()
            java.lang.Boolean r0 = X.C52702we.A00(r9)
            boolean r0 = r0.booleanValue()
            r1.A2e(r0)
            java.lang.Long r0 = X.C52712wf.A00(r9)
            int r0 = r0.intValue()
            r1.A18(r0)
            r1.A0H()
            java.lang.Boolean r0 = X.C51352uT.A00(r9)
            boolean r0 = r0.booleanValue()
            r1.A35(r0)
            java.lang.Boolean r0 = X.C51372uV.A00(r9)
            boolean r0 = r0.booleanValue()
            r1.A30(r0)
            java.lang.Boolean r0 = X.C53962yg.A00(r9)
            boolean r0 = r0.booleanValue()
            r1.A23(r0)
            java.lang.Long r0 = X.C53952yf.A00(r9)
            int r0 = r0.intValue()
            r1.A0r(r0)
            r1.A0B()
            r1.A0D()
            r1.A0E()
            r1.A0O()
            r1.A03()
            java.lang.Boolean r0 = X.C52792wn.A00(r9)
            boolean r0 = r0.booleanValue()
            r1.A22(r0)
            java.lang.Long r0 = X.C52782wm.A00(r9)
            int r0 = r0.intValue()
            r1.A0q(r0)
            r1.A0J()
            X.0et r0 = X.C09120et.A02()
            boolean r0 = r0.A0K()
            r1.A27(r0)
            java.lang.Boolean r0 = X.C51602us.A00(r9)
            boolean r0 = r0.booleanValue()
            r1.A2U(r0)
            r1.A0X()
            r1.A0Y()
            r1.A0W()
            r1.A0V()
            java.lang.Boolean r0 = X.C54022ym.A00(r9)
            boolean r0 = r0.booleanValue()
            r1.A2p(r0)
            java.lang.Boolean r0 = X.C52742wi.A00(r9)
            boolean r0 = r0.booleanValue()
            r1.A2o(r0)
            java.lang.Boolean r0 = X.C53522xy.A00(r9)
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x053d
            java.lang.Boolean r0 = X.C52912wz.A00(r9)
            boolean r2 = r0.booleanValue()
            r0 = 0
            if (r2 == 0) goto L_0x053e
        L_0x053d:
            r0 = 1
        L_0x053e:
            r1.A2J(r0)
            java.lang.Boolean r0 = X.C52762wk.A00(r9)
            boolean r0 = r0.booleanValue()
            r1.A2v(r0)
            java.lang.Boolean r0 = X.C52752wj.A00(r9)
            boolean r0 = r0.booleanValue()
            r1.A2g(r0)
            java.lang.Boolean r0 = X.C52772wl.A00(r9)
            boolean r0 = r0.booleanValue()
            r1.A3E(r0)
            java.lang.Boolean r0 = X.C51652ux.A00(r9)
            boolean r0 = r0.booleanValue()
            r1.A31(r0)
            java.lang.Long r0 = X.C51782vA.A00(r9)
            int r0 = r0.intValue()
            r1.A1G(r0)
            java.lang.Long r0 = X.C51772v9.A00(r9)
            int r0 = r0.intValue()
            r1.A1F(r0)
            java.lang.Boolean r0 = X.C51982vU.A00(r9)
            boolean r0 = r0.booleanValue()
            r1.A2X(r0)
            int r0 = A02(r9)
            r1.A1E(r0)
            java.lang.Boolean r0 = X.C51562uo.A00(r9)
            boolean r0 = r0.booleanValue()
            r1.A3D(r0)
            X.4Nu r0 = A0C(r9)
            r1.A1T(r0)
            java.lang.Boolean r0 = X.C51742v6.A00(r9)
            boolean r0 = r0.booleanValue()
            r1.A2A(r0)
            java.lang.Boolean r0 = X.C51752v7.A00(r9)
            boolean r0 = r0.booleanValue()
            r1.A2B(r0)
            java.lang.Long r0 = X.C51762v8.A00(r9)
            long r2 = r0.longValue()
            r1.A1L(r2)
            java.lang.Boolean r0 = X.C51552un.A00(r9)
            boolean r0 = r0.booleanValue()
            r1.A3K(r0)
            X.4Nu r0 = A0B(r9)
            r1.A1S(r0)
            java.lang.Boolean r0 = X.C52982x6.A00(r9)
            boolean r0 = r0.booleanValue()
            r1.A34(r0)
            java.lang.Long r0 = X.C52992x7.A00(r9)
            int r0 = r0.intValue()
            r1.A1H(r0)
            r1.A0S()
            r1.A0G()
            r1.A08()
            X.4Nr r0 = A0K(r9)
            r1.A1b(r0)
            java.lang.Boolean r0 = X.C51802vC.A00(r9)
            boolean r0 = r0.booleanValue()
            r1.A2W(r0)
            java.lang.Long r0 = X.C51822vE.A00(r9)
            int r0 = r0.intValue()
            r1.A1A(r0)
            java.lang.Long r0 = X.C51822vE.A00(r9)
            int r0 = r0.intValue()
            r1.A1B(r0)
            java.lang.Long r0 = X.C51832vF.A00(r9)
            r0.intValue()
            java.lang.Boolean r0 = X.C51792vB.A00(r9)
            boolean r0 = r0.booleanValue()
            r1.A1y(r0)
            java.lang.Boolean r0 = X.C51812vD.A00(r9)
            boolean r0 = r0.booleanValue()
            r1.A3B(r0)
            java.lang.Boolean r0 = X.C51592ur.A00(r9)
            boolean r0 = r0.booleanValue()
            r1.A2E(r0)
            java.lang.Boolean r0 = X.C53022xA.A00(r9)
            boolean r0 = r0.booleanValue()
            r1.A2Z(r0)
            java.lang.Boolean r0 = X.C51332uR.A00(r9)
            boolean r0 = r0.booleanValue()
            r1.A2y(r0)
            java.lang.Double r0 = X.C53882yY.A00(r9)
            double r6 = r0.doubleValue()
            java.lang.Double r0 = X.C53892yZ.A00(r9)
            double r2 = r0.doubleValue()
            X.3J1 r4 = new X.3J1
            r4.<init>()
            r0 = 2000000(0x1e8480, float:2.802597E-39)
            r4.A0d(r0)
            java.lang.Boolean r0 = X.C53682yE.A00(r9)
            boolean r0 = r0.booleanValue()
            r4.A0q(r0)
            float r0 = (float) r6
            r4.A0I(r0)
            float r0 = (float) r2
            r4.A0O(r0)
            r4.A02()
            r4.A01()
            java.lang.Boolean r0 = X.C53652yB.A00(r9)
            boolean r0 = r0.booleanValue()
            r4.A0p(r0)
            java.lang.Boolean r0 = X.C53942ye.A00(r9)
            boolean r0 = r0.booleanValue()
            r4.A0r(r0)
            java.lang.Boolean r0 = X.C53412xn.A00(r9)
            boolean r0 = r0.booleanValue()
            r4.A0o(r0)
            java.lang.Boolean r0 = X.C52942x2.A00(r9)
            boolean r0 = r0.booleanValue()
            r4.A0s(r0)
            java.lang.Boolean r0 = X.C52952x3.A00(r9)
            boolean r0 = r0.booleanValue()
            r4.A0t(r0)
            java.lang.Double r0 = X.C52932x1.A00(r9)
            float r0 = r0.floatValue()
            r4.A0L(r0)
            java.lang.Double r0 = X.C53902ya.A00(r9)
            double r6 = r0.doubleValue()
            java.lang.Double r0 = X.C53922yc.A00(r9)
            double r2 = r0.doubleValue()
            java.lang.Long r0 = X.C53862yW.A00(r9)
            int r0 = r0.intValue()
            r4.A0g(r0)
            java.lang.Long r0 = X.C53872yX.A00(r9)
            int r0 = r0.intValue()
            r4.A0h(r0)
            java.lang.Long r0 = X.C53852yV.A00(r9)
            int r0 = r0.intValue()
            r4.A0f(r0)
            java.lang.Long r0 = X.C53842yU.A00(r9)
            int r0 = r0.intValue()
            r4.A0e(r0)
            java.lang.Long r0 = X.C53832yT.A00(r9)
            int r0 = r0.intValue()
            r4.A0d(r0)
            float r0 = (float) r6
            r4.A0M(r0)
            float r0 = (float) r2
            r4.A0N(r0)
            java.lang.Long r0 = X.C53732yJ.A00(r9)
            int r0 = r0.intValue()
            r4.A0S(r0)
            java.lang.Boolean r0 = X.C53662yC.A00(r9)
            boolean r0 = r0.booleanValue()
            r4.A0m(r0)
            java.lang.Long r0 = X.C53822yS.A00(r9)
            int r0 = r0.intValue()
            r4.A0c(r0)
            java.lang.Long r0 = X.C53672yD.A00(r9)
            int r0 = r0.intValue()
            r4.A0P(r0)
            r4.A09()
            r4.A0A()
            r4.A03()
            r4.A04()
            r4.A06()
            r4.A0C()
            r4.A05()
            r4.A0B()
            android.util.DisplayMetrics r0 = X.C18230wP.A0E(r8)
            int r0 = r0.widthPixels
            A0V(r4, r9, r0)
            r4.A0D()
            r4.A07()
            r4.A08()
            java.lang.Boolean r0 = X.C53632y9.A00(r9)
            boolean r0 = r0.booleanValue()
            r4.A0l(r0)
            java.lang.Boolean r0 = X.C53612y7.A00(r9)
            boolean r0 = r0.booleanValue()
            r4.A0j(r0)
            java.lang.Boolean r0 = X.C53622y8.A00(r9)
            boolean r0 = r0.booleanValue()
            r4.A0k(r0)
            java.lang.Boolean r0 = X.C53602y6.A00(r9)
            boolean r0 = r0.booleanValue()
            r4.A0i(r0)
            X.4Nk r4 = r4.A00()
            java.lang.Boolean r0 = X.C53642yA.A00(r9)
            boolean r0 = r0.booleanValue()
            r1.A2V(r0)
            java.lang.Boolean r0 = X.C52972x5.A00(r9)
            boolean r0 = r0.booleanValue()
            r4.A0O = r0
            java.lang.Boolean r0 = X.C53542y0.A00(r9)
            boolean r0 = r0.booleanValue()
            r4.A0P = r0
            java.lang.Boolean r0 = X.C53552y1.A00(r9)
            boolean r0 = r0.booleanValue()
            r4.A0Q = r0
            java.lang.Boolean r0 = X.C53562y2.A00(r9)
            boolean r0 = r0.booleanValue()
            r4.A0R = r0
            java.lang.Double r0 = X.C53572y3.A00(r9)
            double r2 = r0.doubleValue()
            r4.A07 = r2
            java.lang.Double r0 = X.C53582y4.A00(r9)
            double r2 = r0.doubleValue()
            r4.A08 = r2
            java.lang.Double r0 = X.C53532xz.A00(r9)
            double r2 = r0.doubleValue()
            r4.A06 = r2
            java.lang.Long r0 = X.C53592y5.A00(r9)
            int r0 = r0.intValue()
            r4.A0M = r0
            r4.A0S = r5
            java.lang.Long r0 = X.C51042ty.A00(r9)
            int r0 = r0.intValue()
            r4.A0D = r0
            java.lang.Long r0 = X.C51052tz.A00(r9)
            int r0 = r0.intValue()
            r4.A0E = r0
            java.lang.Long r0 = X.C51062u0.A00(r9)
            int r0 = r0.intValue()
            r4.A0F = r0
            java.lang.Long r0 = X.C51572up.A00(r9)
            int r0 = r0.intValue()
            r4.A0G = r0
            java.lang.Long r0 = X.C51212uF.A00(r9)
            long r6 = r0.longValue()
            double r2 = (double) r6
            r4.A0A = r2
            java.lang.Long r0 = X.C51222uG.A00(r9)
            long r6 = r0.longValue()
            double r2 = (double) r6
            r4.A0B = r2
            java.lang.Long r0 = X.C51582uq.A00(r9)
            int r0 = r0.intValue()
            r4.A0H = r0
            java.lang.Boolean r0 = X.C50832td.A00(r9)
            boolean r0 = r0.booleanValue()
            r4.A0N = r0
            java.lang.Long r0 = X.C50822tc.A00(r9)
            int r0 = r0.intValue()
            r4.A0J = r0
            java.lang.Double r0 = X.C50842te.A00(r9)
            double r2 = r0.doubleValue()
            r4.A01 = r2
            java.lang.Double r0 = X.C50852tf.A00(r9)
            double r2 = r0.doubleValue()
            r4.A02 = r2
            java.lang.Long r0 = X.C50862tg.A00(r9)
            int r0 = r0.intValue()
            r4.A0K = r0
            java.lang.Double r0 = X.C50872th.A00(r9)
            double r2 = r0.doubleValue()
            r4.A03 = r2
            java.lang.Double r0 = X.C50812tb.A00(r9)
            double r2 = r0.doubleValue()
            r4.A00 = r2
            r4.A0U = r5
            r4.A0T = r5
            java.lang.Boolean r0 = X.C51722v4.A00(r9)
            boolean r0 = r0.booleanValue()
            r4.A0V = r0
            java.lang.Double r0 = X.C51672uz.A00(r9)
            double r2 = r0.doubleValue()
            r4.A04 = r2
            java.lang.Double r0 = X.C51692v1.A00(r9)
            double r2 = r0.doubleValue()
            r4.A05 = r2
            java.lang.Long r0 = X.C51682v0.A00(r9)
            int r0 = r0.intValue()
            r4.A0L = r0
            java.lang.Long r0 = X.C51662uy.A00(r9)
            int r0 = r0.intValue()
            r4.A0I = r0
            java.lang.Double r0 = X.C51702v2.A00(r9)
            double r2 = r0.doubleValue()
            r4.A09 = r2
            java.lang.Double r0 = X.C51712v3.A00(r9)
            double r2 = r0.doubleValue()
            r4.A0C = r2
            java.lang.Boolean r0 = X.C51722v4.A00(r9)
            boolean r0 = r0.booleanValue()
            r4.A0W = r0
            r1.A1X(r4)
            java.lang.Boolean r0 = X.C53002x8.A00(r9)
            boolean r0 = r0.booleanValue()
            r1.A1n(r0)
            java.lang.Boolean r0 = X.C53012x9.A00(r9)
            boolean r0 = r0.booleanValue()
            r1.A33(r0)
            X.KYX r0 = A0J()
            r1.A1a(r0)
            r1.A0c()
            r1.A0i()
            r1.A0g()
            X.4Nu r0 = A0D(r9)
            r1.A1U(r0)
            X.4Nu r0 = A09(r9)
            r1.A1Q(r0)
            X.4Nu r0 = A0A(r9)
            r1.A1R(r0)
            boolean r0 = A0o(r9)
            r1.A36(r0)
            boolean r0 = A0p(r9)
            r1.A3G(r0)
            X.4Nu r0 = A0E(r9)
            r1.A1V(r0)
            X.4Nu r0 = A06(r9)
            r1.A1N(r0)
            java.lang.Boolean r0 = X.C52372w7.A00(r9)
            boolean r0 = r0.booleanValue()
            r1.A29(r0)
            java.lang.Long r0 = X.C52412wB.A00(r9)
            int r0 = r0.intValue()
            r1.A0x(r0)
            java.lang.Long r0 = X.C52402wA.A00(r9)
            int r0 = r0.intValue()
            r1.A1I(r0)
            java.lang.Long r0 = X.C52382w8.A00(r9)
            int r0 = r0.intValue()
            r1.A0w(r0)
            java.lang.Long r0 = X.C52392w9.A00(r9)
            int r0 = r0.intValue()
            r1.A0n(r0)
            java.lang.Boolean r0 = X.C52922x0.A00(r9)
            boolean r0 = r0.booleanValue()
            r0 = r0 ^ 1
            r1.A2m(r0)
            r1.A0A()
            java.lang.Boolean r0 = X.C51342uS.A00(r9)
            boolean r0 = r0.booleanValue()
            r1.A2L(r0)
            java.lang.Boolean r0 = X.C52732wh.A00(r9)
            boolean r0 = r0.booleanValue()
            r1.A2R(r0)
            java.lang.Boolean r0 = X.C52912wz.A00(r9)
            boolean r0 = r0.booleanValue()
            r1.A2a(r0)
            java.lang.Boolean r0 = X.C52042va.A00(r9)
            boolean r0 = r0.booleanValue()
            r1.A1q(r0)
            java.lang.Long r0 = X.C52032vZ.A00(r9)
            int r0 = r0.intValue()
            r1.A0o(r0)
            java.lang.Boolean r0 = X.C52052vb.A00(r9)
            boolean r0 = r0.booleanValue()
            r1.A2D(r0)
            java.lang.Long r0 = X.C52062vc.A00(r9)
            int r0 = r0.intValue()
            r1.A13(r0)
            java.lang.Boolean r0 = X.C52442wE.A00(r9)
            boolean r0 = r0.booleanValue()
            r1.A39(r0)
            java.lang.Long r0 = X.C52432wD.A00(r9)
            int r0 = r0.intValue()
            r1.A0y(r0)
            java.lang.Boolean r0 = X.C53512xx.A00(r9)
            boolean r0 = r0.booleanValue()
            r1.A1p(r0)
            com.facebook.video.heroplayer.setting.HeroPlayerSetting r0 = r1.A00()
            A00 = r0
        L_0x09fe:
            com.facebook.video.heroplayer.setting.HeroPlayerSetting r0 = A00
            return r0
        L_0x0a01:
            java.lang.Long r0 = X.AnonymousClass3Pg.A00(r9)
            goto L_0x037a
        L_0x0a07:
            java.lang.Boolean r0 = X.C60453Pc.A00(r9)
            goto L_0x035e
        L_0x0a0d:
            java.lang.Boolean r0 = X.C60463Pd.A00(r9)
            goto L_0x0349
        L_0x0a13:
            java.lang.Long r0 = X.C60473Pe.A00(r9)
            goto L_0x02e6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63923if.A0I(android.content.Context, com.instagram.service.session.UserSession):com.facebook.video.heroplayer.setting.HeroPlayerSetting");
    }

    public static KYX A0J() {
        AnonymousClass3Is r0 = new AnonymousClass3Is();
        r0.A08();
        r0.A07();
        r0.A06();
        r0.A05();
        r0.A04();
        r0.A03();
        r0.A02();
        r0.A01();
        return r0.A00();
    }

    public static String A0L(Context context, long j) {
        C312824z r7 = C312824z.VIDEO;
        Context context2 = context;
        long j2 = j;
        C58693Gt A002 = C60813Qp.A00(context2, r7, "", 0.1f, j2, true);
        if (A002.A00() <= 0) {
            A002 = C60813Qp.A00(context2, r7, "", 0.1f, j2, false);
        }
        if (A002.A00() <= 0) {
            C10450iM.A03("IgExoVideoCache", "Couldn't create exo video cache");
        }
        return A002.A01().getAbsolutePath();
    }

    public static Set A0Q(String str) {
        String[] split = str.split(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1);
        HashSet A0u = C18200wM.A0u();
        for (String str2 : split) {
            if (!str2.isEmpty()) {
                A0u.add(str2);
            }
        }
        return A0u;
    }

    public static void A0V(AnonymousClass3J1 r9, UserSession userSession, int i) {
        r9.A0Z(Math.min(396, i));
        r9.A0a(Math.min(HttpStatus.SC_GATEWAY_TIMEOUT, i));
        int min = Math.min(i, HttpStatus.SC_GATEWAY_TIMEOUT);
        r9.A0U(min);
        r9.A0V(min);
        int min2 = Math.min(i, 396);
        r9.A0R(min);
        r9.A0Q(min2);
        double doubleValue = C53812yR.A00(userSession).doubleValue();
        double doubleValue2 = C53802yQ.A00(userSession).doubleValue();
        double doubleValue3 = C53792yP.A00(userSession).doubleValue();
        double doubleValue4 = C53782yO.A00(userSession).doubleValue();
        r9.A0V(C53852yV.A00(userSession).intValue());
        r9.A0U(C53762yM.A00(userSession).intValue());
        r9.A0Z(C53872yX.A00(userSession).intValue());
        r9.A0a(C53772yN.A00(userSession).intValue());
        r9.A0K((float) doubleValue);
        r9.A0J((float) doubleValue2);
        r9.A0W(C53912yb.A00(userSession).intValue());
        r9.A0F((float) doubleValue3);
        r9.A0E((float) doubleValue4);
        r9.A0T(C53752yL.A00(userSession).intValue());
        double doubleValue5 = C53712yH.A00(userSession).doubleValue();
        double doubleValue6 = C53722yI.A00(userSession).doubleValue();
        int intValue = C53702yG.A00(userSession).intValue();
        int intValue2 = C53742yK.A00(userSession).intValue();
        r9.A0G((float) doubleValue5);
        r9.A0H((float) doubleValue6);
        r9.A0X(intValue);
        r9.A0Y(intValue2);
        r9.A0b(intValue2);
        r9.A0n(C53692yF.A00(userSession).booleanValue());
    }

    public static void A0W(UserSession userSession, HashMap hashMap) {
        Long A002;
        if (C53142xM.A00(userSession).booleanValue()) {
            A002 = AnonymousClass3Pf.A01(userSession);
        } else {
            A002 = AnonymousClass3Pf.A00(userSession);
        }
        A0Y("dash.live_num_segments_prefetch", hashMap, A002.intValue());
        A0Y(I17.A00(591), hashMap, 8);
    }

    public static void A0X(UserSession userSession, HashMap hashMap) {
        A0Y("prefetch.prefetch_max_cache_file_size", hashMap, C51302uO.A00(userSession).intValue());
        A0Y("prefetch.block_on_same_cache_key_timeout_ms", hashMap, 5000);
    }

    public static void A0a(HashMap hashMap) {
        hashMap.put("progressive.enable_throttling_data_source", RealtimeSubscription.GRAPHQL_MQTT_VERSION);
    }

    public static boolean A0q(JSONObject jSONObject) {
        return jSONObject.optBoolean("use_network_quality", false);
    }

    public static int A00(UserSession userSession) {
        Long A002;
        if (C52012vX.A00(userSession).booleanValue()) {
            A002 = C52022vY.A00(userSession);
        } else {
            A002 = C52642wY.A00(userSession);
        }
        return A002.intValue();
    }

    public static int A01(UserSession userSession) {
        return C52652wZ.A00(userSession).intValue();
    }

    public static int A02(UserSession userSession) {
        return C51502ui.A00(userSession).intValue();
    }

    public static int A03(String str, JSONObject jSONObject, int i) {
        return jSONObject.optInt(str, i);
    }

    public static C72374Nu A05(C58953Ir r1, Number number) {
        r1.A03(number.intValue());
        return r1.A00();
    }

    public static C72374Nu A09(UserSession userSession) {
        Long A002;
        boolean booleanValue = C52072vd.A00(userSession).booleanValue();
        C58953Ir r1 = new C58953Ir();
        r1.A07(true);
        if (booleanValue) {
            r1.A01(C52082ve.A00(userSession).intValue());
            A0R(r1, C52092vf.A00(userSession));
            A0U(r1, C52132vj.A00(userSession));
            A0S(r1, C52122vi.A00(userSession));
            A0T(r1, C52112vh.A00(userSession));
            A002 = C52102vg.A00(userSession);
        } else {
            r1.A01(C52142vk.A00(userSession).intValue());
            A0R(r1, C52152vl.A00(userSession));
            A0U(r1, C52192vp.A00(userSession));
            A0S(r1, C52182vo.A00(userSession));
            A0T(r1, C52172vn.A00(userSession));
            A002 = C52162vm.A00(userSession);
        }
        return A05(r1, A002);
    }

    public static C72374Nu A0A(UserSession userSession) {
        Long A002;
        boolean booleanValue = C52832wr.A00(userSession).booleanValue();
        C58953Ir r1 = new C58953Ir();
        r1.A07(true);
        if (booleanValue) {
            r1.A01(C52842ws.A00(userSession).intValue());
            A0R(r1, C52852wt.A00(userSession));
            A0U(r1, C52892wx.A00(userSession));
            A0S(r1, C52882ww.A00(userSession));
            A0T(r1, C52872wv.A00(userSession));
            A002 = C52862wu.A00(userSession);
        } else {
            r1.A01(C52202vq.A00(userSession).intValue());
            A0R(r1, C52212vr.A00(userSession));
            A0U(r1, C52252vv.A00(userSession));
            A0S(r1, C52242vu.A00(userSession));
            A0T(r1, C52232vt.A00(userSession));
            A002 = C52222vs.A00(userSession);
        }
        return A05(r1, A002);
    }

    public static C72374Nu A0B(UserSession userSession) {
        String A002 = C51482ug.A00(userSession);
        if (A002.isEmpty()) {
            return A04(1);
        }
        return A0F(A002, 1);
    }

    public static C72374Nu A0C(UserSession userSession) {
        String A002 = C51492uh.A00(userSession);
        if (A002.isEmpty()) {
            return A04(A02(userSession));
        }
        return A0F(A002, A02(userSession));
    }

    public static C72374Nu A0F(String str, int i) {
        try {
            JSONObject A0j = C18250wR.A0j(str);
            C58953Ir r1 = new C58953Ir();
            r1.A07(A0q(A0j));
            r1.A01(A03("default_value", A0j, i));
            r1.A02(A03("degraded_value", A0j, i));
            r1.A06(A03("poor_value", A0j, i));
            r1.A05(A03("moderate_value", A0j, i));
            r1.A04(A03("good_value", A0j, i));
            r1.A03(A03("excellent_value", A0j, i));
            return r1.A00();
        } catch (ExceptionInInitializerError | RuntimeException | JSONException unused) {
            return A04(i);
        }
    }

    public static KYV A0H(Context context, UserSession userSession) {
        int i;
        if (!C03690Kh.A01().A07() || !C52002vW.A00(userSession).booleanValue()) {
            i = 104857600;
        } else {
            i = (C51992vV.A00(userSession).intValue() << 10) << 10;
        }
        long j = (long) i;
        C58693Gt A002 = C60813Qp.A00(context, C312824z.VIDEO, "", 1.0f, j, false);
        C58983Iz r2 = new C58983Iz();
        r2.A0E((int) A002.A00());
        r2.A0M(A0N(context.getCacheDir()));
        r2.A0N(A0L(context, j));
        r2.A01();
        r2.A0L(TimeUnit.HOURS.toMillis(168));
        r2.A0K(TimeUnit.MINUTES.toMillis(1));
        r2.A0J(TimeUnit.HOURS.toMillis(1));
        r2.A04();
        r2.A0O(C51272uL.A00(userSession).booleanValue());
        r2.A0A(C51242uI.A00(userSession).intValue());
        r2.A0C(C51282uM.A00(userSession).intValue());
        r2.A0B(C51252uJ.A00(userSession).intValue());
        r2.A0S(C52822wq.A00(userSession).booleanValue());
        r2.A0H(C52812wp.A00(userSession).intValue());
        r2.A09(C52802wo.A00(userSession).doubleValue());
        r2.A0P(C51262uK.A00(userSession).booleanValue());
        r2.A0D(C51232uH.A00(userSession).intValue());
        r2.A02();
        r2.A06();
        r2.A07();
        r2.A03();
        r2.A0R(C52322w2.A00(userSession).booleanValue());
        r2.A0G(C52342w4.A00(userSession).intValue());
        r2.A08(C52332w3.A00(userSession).doubleValue());
        r2.A0U(C52312w1.A00(userSession).booleanValue());
        r2.A05();
        r2.A0T(C52302w0.A00(userSession).booleanValue());
        r2.A0Q(C52282vy.A00(userSession).booleanValue());
        r2.A0F(C52292vz.A00(userSession).intValue());
        r2.A0I(C51292uN.A00(userSession).longValue());
        return r2.A00();
    }

    public static AnonymousClass4Nr A0K(UserSession userSession) {
        boolean booleanValue = C51872vJ.A00(userSession).booleanValue();
        boolean booleanValue2 = C51972vT.A00(userSession).booleanValue();
        String A002 = C51852vH.A00(userSession);
        boolean booleanValue3 = C51892vL.A00(userSession).booleanValue();
        boolean booleanValue4 = C51932vP.A00(userSession).booleanValue();
        C51862vI.A00(userSession);
        boolean booleanValue5 = C51902vM.A00(userSession).booleanValue();
        boolean booleanValue6 = C51912vN.A00(userSession).booleanValue();
        long longValue = C51962vS.A00(userSession).longValue();
        boolean booleanValue7 = C51882vK.A00(userSession).booleanValue();
        boolean booleanValue8 = C51942vQ.A00(userSession).booleanValue();
        boolean booleanValue9 = C51952vR.A00(userSession).booleanValue();
        AnonymousClass4Nr r0 = new AnonymousClass4Nr();
        r0.A02(booleanValue);
        r0.A0A(booleanValue2);
        r0.A01(A002);
        r0.A04(booleanValue3);
        r0.A06(booleanValue4);
        r0.A08(booleanValue5);
        r0.A05(booleanValue6);
        r0.A00(longValue);
        r0.A03(booleanValue7);
        r0.A07(booleanValue8);
        r0.A09(booleanValue9);
        return r0;
    }

    public static String A0M(UserSession userSession) {
        return C52672wb.A00(userSession);
    }

    public static String A0N(File file) {
        try {
            return file.getCanonicalPath();
        } catch (IOException unused) {
            return file.toString();
        }
    }

    public static Map A0O(UserSession userSession) {
        Boolean A002;
        C72384Ny A01;
        HashMap A0y = AnonymousClass0wJ.A0y();
        if (C53142xM.A00(userSession).booleanValue()) {
            A002 = C60483Ph.A01(userSession);
        } else {
            A002 = C60483Ph.A00(userSession);
        }
        if (A002.booleanValue()) {
            A01 = C72384Ny.A01(C53222xU.A00(userSession));
        } else {
            AnonymousClass3W0 r2 = new AnonymousClass3W0();
            r2.A0K(C53092xH.A00(userSession));
            r2.A09(C53102xI.A00(userSession).intValue());
            r2.A0I(C53262xY.A00(userSession).intValue());
            r2.A0F(C53232xV.A00(userSession).intValue());
            r2.A02(C53282xa.A00(userSession).doubleValue());
            r2.A0J(C53272xZ.A00(userSession).intValue());
            r2.A03(C53292xb.A00(userSession).doubleValue());
            r2.A04((double) C53302xc.A00(userSession).longValue());
            r2.A07(C53332xf.A00(userSession).doubleValue());
            r2.A08(C53342xg.A00(userSession).doubleValue());
            r2.A0Q(C53362xi.A00(userSession).booleanValue());
            r2.A0N(C53112xJ.A00(userSession).booleanValue());
            r2.A0O(C53122xK.A00(userSession).booleanValue());
            r2.A0D(C53202xS.A00(userSession).intValue());
            r2.A0C(C53192xR.A00(userSession).intValue());
            r2.A0E(C53212xT.A00(userSession).intValue());
            r2.A05(C53312xd.A00(userSession).doubleValue());
            r2.A06(C53322xe.A00(userSession).doubleValue());
            r2.A0L(C53152xN.A00(userSession));
            r2.A0P(C53162xO.A00(userSession).booleanValue());
            r2.A0A(C53172xP.A00(userSession).intValue());
            r2.A0G(C53242xW.A00(userSession).intValue());
            r2.A0M(C53352xh.A00(userSession));
            r2.A0H(C53252xX.A00(userSession).intValue());
            r2.A0B(C53182xQ.A00(userSession).intValue());
            A01 = r2.A01();
        }
        if (C53132xL.A00(userSession).booleanValue()) {
            A0y.put(AnonymousClass22Z.LOW_LATENCY, A01);
        }
        return A0y;
    }

    public static Set A0P(UserSession userSession) {
        return A0Q(C53042xC.A00(userSession));
    }

    public static void A0R(C58953Ir r1, Number number) {
        r1.A02(number.intValue());
    }

    public static void A0S(C58953Ir r1, Number number) {
        r1.A05(number.intValue());
    }

    public static void A0T(C58953Ir r1, Number number) {
        r1.A04(number.intValue());
    }

    public static void A0U(C58953Ir r1, Number number) {
        r1.A06(number.intValue());
    }

    public static void A0Y(String str, HashMap hashMap, int i) {
        hashMap.put(str, String.valueOf(i));
    }

    public static void A0Z(HashMap hashMap) {
        A0a(hashMap);
        A0Y("progressive.throttling_buffer_low", hashMap, 131100);
        A0Y("progressive.throttling_buffer_high", hashMap, 524300);
    }

    public static boolean A0b() {
        return C37269Jng.A01();
    }

    public static boolean A0c(UserSession userSession) {
        return C52582wS.A00(userSession).booleanValue();
    }

    public static boolean A0d(UserSession userSession) {
        boolean booleanValue = C52592wT.A00(userSession).booleanValue();
        if (A0j(userSession) || booleanValue) {
            return true;
        }
        return false;
    }

    public static boolean A0e(UserSession userSession) {
        boolean booleanValue = C52602wU.A00(userSession).booleanValue();
        if (A0j(userSession) || booleanValue) {
            return true;
        }
        return false;
    }

    public static boolean A0f(UserSession userSession) {
        return C52612wV.A00(userSession).booleanValue();
    }

    public static boolean A0g(UserSession userSession) {
        return C52622wW.A00(userSession).booleanValue();
    }

    public static boolean A0h(UserSession userSession) {
        boolean A02 = C61903Wg.A02(userSession);
        boolean A002 = C61903Wg.A00(userSession);
        boolean booleanValue = C52912wz.A00(userSession).booleanValue();
        boolean A01 = C37269Jng.A01();
        boolean A012 = C61903Wg.A01(userSession);
        if (A02 || A002 || booleanValue || A01 || A012) {
            return true;
        }
        return false;
    }

    public static boolean A0i(UserSession userSession) {
        boolean booleanValue = C52632wX.A00(userSession).booleanValue();
        if (A0j(userSession) || booleanValue) {
            return true;
        }
        return false;
    }

    public static boolean A0j(UserSession userSession) {
        return C52012vX.A00(userSession).booleanValue();
    }

    public static boolean A0k(UserSession userSession) {
        return C52682wc.A00(userSession).booleanValue();
    }

    public static boolean A0l(UserSession userSession) {
        return C52422wC.A00(userSession).booleanValue();
    }

    public static boolean A0m(UserSession userSession) {
        return C52662wa.A00(userSession).booleanValue();
    }

    public static boolean A0n(UserSession userSession) {
        return C52692wd.A00(userSession).booleanValue();
    }

    public static boolean A0o(UserSession userSession) {
        return C50952tp.A00(userSession).booleanValue();
    }

    public static boolean A0p(UserSession userSession) {
        return C50962tq.A00(userSession).booleanValue();
    }
}
