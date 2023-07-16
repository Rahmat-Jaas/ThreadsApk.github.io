package X;

import android.app.Application;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0110000_I2;
import com.facebook.redex.IDxFlowShape94S0200000_2_I2;
import com.instagram.barcelona.feed.data.BarcelonaFeedRepository;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.56T  reason: invalid class name */
public final class AnonymousClass56T extends AnonymousClass10X {
    public final BarcelonaFeedRepository A00;
    public final JUP A01;
    public final C24805DaJ A02;
    public final C1198477g A03;
    public final C19508AxV A04;
    public final C19462Awj A05;
    public final C21839C2o A06;
    public final UserSession A07;
    public final User A08;
    public final C86074wE A09;
    public final C86094wG A0A;
    public final C86094wG A0B;
    public final C86094wG A0C;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AnonymousClass56T(Application application, BarcelonaFeedRepository barcelonaFeedRepository, C24805DaJ daJ, C21839C2o c2o, UserSession userSession) {
        super(application);
        Object value;
        C1198477g A002 = AnonymousClass6NK.A00(userSession);
        C19462Awj A012 = C19462Awj.A01(userSession);
        C04220Ms.A06(A012);
        C04220Ms.A0B(A002, 6);
        this.A07 = userSession;
        this.A06 = c2o;
        this.A02 = daJ;
        this.A00 = barcelonaFeedRepository;
        this.A03 = A002;
        this.A05 = A012;
        this.A08 = AnonymousClass0wJ.A0Y(userSession);
        this.A04 = new C19508AxV(userSession, (C145018jf) null);
        this.A01 = new JUP(c2o, userSession, barcelonaFeedRepository.A06);
        IDxFlowShape94S0200000_2_I2 iDxFlowShape94S0200000_2_I2 = new IDxFlowShape94S0200000_2_I2(18, (Object) barcelonaFeedRepository.A07, (Object) this);
        this.A0B = C25753DrP.A04(new KtCSuperShape0S0110000_I2((AnonymousClass8s2) AnonymousClass8bW.A01, true), AnonymousClass3J5.A00(this), iDxFlowShape94S0200000_2_I2, AnonymousClass74I.A01);
        this.A0A = barcelonaFeedRepository.A0A;
        C27457Enn A0z = C18190wL.A0z(new KtCSuperShape0S0110000_I2());
        this.A09 = A0z;
        this.A0C = A0z;
        if (C117806zH.A01(C18230wP.A09(A08()))) {
            do {
                value = A0z.getValue();
            } while (!A0z.ADi(value, new KtCSuperShape0S0110000_I2(7, ((KtCSuperShape0S0110000_I2) value).A00, true)));
        }
    }
}
