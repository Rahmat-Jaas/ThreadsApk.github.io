package X;

import android.content.Context;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.0an  reason: invalid class name and case insensitive filesystem */
public abstract class C07040an extends AnonymousClass0RK {
    public abstract void A03(Context context);

    public void A00(Context context, C07580bk r4, UserSession userSession) {
        userSession.getUserId();
        A02(context, userSession);
        C29620FrP.A00().A06();
        C61793Vp.A00(userSession).A03();
        C48992qf.A00(userSession).A00();
        AnonymousClass0RG.A00().A05(userSession);
        C64543mW.A00(userSession).A02();
        AnonymousClass01V.A0p.A0l((String) null);
        C34819Ifn.A00();
        C37041JjM A00 = C37041JjM.A00();
        C04220Ms.A06(A00);
        A00.A04((String) null);
        ITJ.A00(A00).A04();
    }

    public void A01(Context context, C07530bf r2, UserSession userSession, User user) {
        userSession.getUserId();
        user.getId();
    }

    public final void A02(Context context, UserSession userSession) {
        userSession.getUserId();
        C67363zQ.A0G(userSession.getUserId());
        A03(context);
    }
}
