package X;

import android.os.Handler;
import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.1mn  reason: invalid class name and case insensitive filesystem */
public final class C25261mn extends AnonymousClass0gG {
    public final /* synthetic */ AnonymousClass3B6 A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ User A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C25261mn(AnonymousClass3B6 r4, UserSession userSession, User user, String str, String str2, String str3, String str4) {
        super(151, 4, true, true);
        this.A01 = userSession;
        this.A06 = str;
        this.A03 = str2;
        this.A00 = r4;
        this.A02 = user;
        this.A05 = str3;
        this.A04 = str4;
    }

    public final void run() {
        long j;
        UserSession userSession = this.A01;
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A02(userSession), "igauthhelper_forced_logout"), 1535);
        A0I.A0T("reason", "login_required_response_from_server");
        String str = this.A06;
        if (str != null) {
            j = Long.parseLong(str);
        } else {
            j = 0;
        }
        A0I.A0S("reason_code", Long.valueOf(j));
        String str2 = this.A03;
        A0I.A0T("request", str2);
        A0I.Bb4();
        AnonymousClass3B6 r4 = this.A00;
        Handler handler = r4.A00;
        if (handler != null) {
            handler.postDelayed(new AnonymousClass4TB(r4, userSession, this.A02, this.A05, this.A04, str, str2), 1000);
        }
    }
}
