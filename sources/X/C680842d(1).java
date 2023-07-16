package X;

import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.service.session.UserSession;

/* renamed from: X.42d  reason: invalid class name and case insensitive filesystem */
public final class C680842d implements C39669Kxo {
    public final /* synthetic */ BaseFragmentActivity A00;
    public final /* synthetic */ C35394Iu2 A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ String A03;

    public C680842d(BaseFragmentActivity baseFragmentActivity, C35394Iu2 iu2, UserSession userSession, String str) {
        this.A02 = userSession;
        this.A03 = str;
        this.A01 = iu2;
        this.A00 = baseFragmentActivity;
    }

    public final void Bxq() {
        C35394Iu2 iu2 = this.A01;
        String str = this.A03;
        UserSession userSession = this.A02;
        C04220Ms.A0B(iu2, 0);
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A02(userSession), I17.A00(818)), 2523);
        if (AnonymousClass0wJ.A1U(A0I)) {
            String A04 = AnonymousClass1o2.A01("ads_manager").A04();
            C04220Ms.A06(A04);
            C18250wR.A0y(A0I, A04);
            C18210wN.A1A(A0I, "user_login");
            C18190wL.A1I(A0I, iu2.toString());
            C18210wN.A1B(A0I, str);
            A0I.Bb4();
        }
        AnonymousClass3X0.A00(iu2, userSession, str);
    }

    public final void CNL(String str) {
        UserSession userSession = this.A02;
        C37741K2b A012 = C37741K2b.A01(userSession);
        String str2 = this.A03;
        C37741K2b.A0B(A012, str2, this.A01.toString(), (String) null);
        AnonymousClass3LB.A01(this.A00, userSession, str2);
    }
}
