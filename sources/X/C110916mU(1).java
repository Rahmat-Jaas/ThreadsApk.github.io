package X;

import android.app.Activity;
import com.instagram.service.session.UserSession;

/* renamed from: X.6mU  reason: invalid class name and case insensitive filesystem */
public final class C110916mU {
    public final Activity A00;
    public final AnonymousClass74F A01;
    public final C37010Jil A02;
    public final C31580Grx A03;
    public final E1T A04;
    public final UserSession A05;
    public final String A06;

    public /* synthetic */ C110916mU(UserSession userSession, Activity activity, String str) {
        C111636o4 r0 = C111636o4.A00;
        if (r0 == null) {
            C04220Ms.A0E("plugin");
            throw null;
        }
        E1T A002 = r0.A00(userSession);
        C37010Jil A003 = C37010Jil.A00();
        C31580Grx A012 = AnonymousClass3WK.A01(userSession);
        AnonymousClass74F r1 = AnonymousClass74F.A01;
        C18230wP.A1R(A002, 4, A012);
        this.A05 = userSession;
        this.A00 = activity;
        this.A06 = str;
        this.A04 = A002;
        this.A02 = A003;
        this.A03 = A012;
        this.A01 = r1;
    }
}
