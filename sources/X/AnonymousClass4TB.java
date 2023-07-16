package X;

import android.content.Context;
import ch.boye.httpclientandroidlib.cookie.ClientCookie;
import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.4TB  reason: invalid class name */
public final class AnonymousClass4TB implements Runnable {
    public final /* synthetic */ AnonymousClass3B6 A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ User A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;

    public AnonymousClass4TB(AnonymousClass3B6 r1, UserSession userSession, User user, String str, String str2, String str3, String str4) {
        this.A01 = userSession;
        this.A02 = user;
        this.A00 = r1;
        this.A05 = str;
        this.A04 = str2;
        this.A06 = str3;
        this.A03 = str4;
    }

    public final void run() {
        UserSession userSession = this.A01;
        AnonymousClass0BO r4 = userSession.multipleAccountHelper;
        if (r4.A0L()) {
            User A0D = r4.A0D(this.A02);
            if (A0D != null) {
                Context context = this.A00.A02;
                if (r4.A02) {
                    AnonymousClass0BO.A05(context, r4, userSession, A0D);
                } else {
                    User A0Y = AnonymousClass0wJ.A0Y(userSession);
                    r4.A01.A00(context, userSession);
                    AnonymousClass0BO.A04(context, r4, userSession, A0D);
                    AnonymousClass0BO.A09(A0Y, A0D);
                }
                USLEBaseShape0S0000000 A002 = C32372Bo.A00(C13330nS.A01((C11630kW) null, userSession));
                C18210wN.A1B(A002, "force_logout");
                A002.A0T("to_pk", A0D.getId());
                A002.A0T("from_pk", userSession.getUserId());
                A002.Bb4();
            }
        } else {
            Context context2 = this.A00.A02;
            String str = this.A05;
            String str2 = this.A04;
            userSession.endSessionManager.A00(context2, userSession);
            C38040KHr.A01.CWx(new AnonymousClass0PA(str, str2));
        }
        AnonymousClass3B6 r1 = this.A00;
        synchronized (r1) {
            r1.A01 = false;
        }
        Context context3 = r1.A02;
        String str3 = this.A06;
        String str4 = this.A03;
        H1T A0N = AnonymousClass0wJ.A0N(userSession);
        A0N.A0J("accounts/perform_post_force_logout_actions/");
        C18180wK.A0t(context3, A0N, C63833iQ.A00(), C18220wO.A0g(context3, A0N, "user_id", userSession.getUserId()));
        if (str3 == null) {
            str3 = "";
        }
        A0N.A0O("logout_reason", str3);
        if (str4 == null) {
            str4 = "";
        }
        A0N.A0O(ClientCookie.PATH_ATTR, str4);
        C31155GhB.A05(AnonymousClass0wJ.A0S(A0N), 152, 3, false, true);
    }
}
