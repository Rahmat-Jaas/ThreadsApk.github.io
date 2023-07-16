package X;

import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2000000_I2;
import com.facebook.redex.IDxFlowShape250S0100000_1_I2;
import com.instagram.fanclub.api.FanClubApi;
import com.instagram.service.session.UserSession;
import java.util.Collection;
import kotlin.Unit;

/* renamed from: X.4Jy  reason: invalid class name and case insensitive filesystem */
public final class C71724Jy implements C28152EzN {
    public Boolean A00;
    public String A01 = "";
    public final C28526FPx A02;
    public final C84714tk A03;
    public final C86074wE A04;
    public final C28172Ezi A05;
    public final C86094wG A06;
    public final FanClubApi A07;
    public final C33858Hvr A08;
    public final UserSession A09;
    public final C86084wF A0A;
    public final C86074wE A0B;

    public final /* synthetic */ C32165H8c AGK(KtCSuperShape0S2000000_I2 ktCSuperShape0S2000000_I2, String str) {
        return C24238DEg.A00(ktCSuperShape0S2000000_I2, this, str);
    }

    public final C32165H8c AGL(String str, String str2) {
        C04220Ms.A0B(str, 0);
        H1T A0P = AnonymousClass0wJ.A0P(this.A09);
        A0P.A0J("fan_club/members/");
        A0P.A0B(AnonymousClass1UL.class, AnonymousClass3MU.class);
        if (str2 != null) {
            A0P.A0O("max_id", str2);
        }
        C32165H8c A0T = C18200wM.A0T(A0P, "query", str);
        C04220Ms.A0C(A0T, "null cannot be cast to non-null type com.instagram.common.api.base.HttpRequestTask<com.instagram.api.response.IgApiResponse<com.instagram.api.schemas.FanClubMembersResponse>>");
        C04220Ms.A0C(A0T, "null cannot be cast to non-null type com.instagram.common.api.base.HttpRequestTask<com.instagram.fanclub.api.FanClubMembersResponse>");
        return A0T;
    }

    public final void CGE(String str) {
    }

    public final /* synthetic */ void CGG(KtCSuperShape0S2000000_I2 ktCSuperShape0S2000000_I2, AnonymousClass3XX r2) {
        C25750DrM.A01(ktCSuperShape0S2000000_I2, r2, this);
    }

    public final /* synthetic */ void CGd(KtCSuperShape0S2000000_I2 ktCSuperShape0S2000000_I2, C85814vo r2) {
        C25750DrM.A00(ktCSuperShape0S2000000_I2, r2, this);
    }

    public final void CGL(AnonymousClass3XX r3, String str) {
        this.A0A.D7t(Unit.A00);
    }

    public final void CGQ(String str) {
        C86074wE r1 = this.A0B;
        r1.CrC(Integer.valueOf(AnonymousClass0wJ.A04(r1.getValue()) - 1));
    }

    public final void CGa(String str) {
        C86074wE r1 = this.A0B;
        r1.CrC(Integer.valueOf(AnonymousClass0wJ.A04(r1.getValue()) + 1));
    }

    public final /* bridge */ /* synthetic */ void CGj(C85814vo r5, String str) {
        AnonymousClass1UL r52 = (AnonymousClass1UL) r5;
        C04220Ms.A0B(r52, 1);
        Iterable iterable = r52.A03;
        if (iterable == null) {
            iterable = AnonymousClass0ZV.A00;
        }
        C86074wE r2 = this.A04;
        r2.CrC(AnonymousClass00J.A0V(AnonymousClass00J.A0S(iterable, AnonymousClass00J.A0c((Iterable) r2.getValue())), (Collection) r2.getValue()));
        this.A00 = r52.A00;
    }

    public C71724Jy(UserSession userSession) {
        this.A09 = userSession;
        C27457Enn A0z = C18190wL.A0z(AnonymousClass0ZV.A00);
        this.A04 = A0z;
        Integer num = AnonymousClass006.A00;
        C27456Enm enm = new C27456Enm(num, 0, 0);
        this.A0A = enm;
        C27457Enn A0z2 = C18190wL.A0z(0);
        this.A0B = A0z2;
        this.A06 = C18230wP.A0x((C148838sG) null, A0z);
        this.A05 = new C27198Efl((C148838sG) null, enm);
        this.A03 = new IDxFlowShape250S0100000_1_I2(A0z2, 12);
        HJF hjf = new HJF();
        this.A08 = hjf;
        C24903Dbw dbw = new C24903Dbw();
        dbw.A07 = true;
        dbw.A06 = true;
        dbw.A04 = hjf;
        dbw.A02 = this;
        dbw.A05 = num;
        this.A02 = dbw.A00();
        this.A07 = new FanClubApi(userSession);
    }

    public final C145538kf B8v() {
        return C31155GhB.A00();
    }
}
