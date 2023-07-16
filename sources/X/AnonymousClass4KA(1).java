package X;

import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.4KA  reason: invalid class name */
public final class AnonymousClass4KA implements C05020Qk {
    public final /* synthetic */ C07530bf A00;
    public final /* synthetic */ User A01;
    public final /* synthetic */ boolean A02;

    public AnonymousClass4KA(C07530bf r1, User user, boolean z) {
        this.A02 = z;
        this.A00 = r1;
        this.A01 = user;
    }

    public final void ChM(UserSession userSession) {
        if (!this.A02) {
            C07530bf r5 = this.A00;
            String str = C61793Vp.A00(r5).A04;
            if (!AnonymousClass7CU.A00(str)) {
                C61793Vp.A00(userSession).A05(str);
            }
            C04220Ms.A0B(r5, 0);
            AnonymousClass3G1 A002 = C48992qf.A00(r5);
            AnonymousClass3G1 A003 = C48992qf.A00(userSession);
            String str2 = A002.A00;
            if (str2.length() > 0 && !str2.equals(A003.A00)) {
                A003.A00 = str2;
                C18180wK.A0v(A003.A05.edit(), "IG-U-IG-DIRECT-REGION-HINT", A003.A00);
            }
            String str3 = A002.A03;
            if (str3.length() > 0 && !str3.equals(A003.A03)) {
                A003.A03 = str3;
                C18180wK.A0v(A003.A05.edit(), "IG-U-SHBID", A003.A03);
            }
            String str4 = A002.A04;
            if (str4.length() > 0 && !str4.equals(A003.A04)) {
                A003.A04 = str4;
                C18180wK.A0v(A003.A05.edit(), "IG-U-SHBTS", A003.A04);
            }
            String str5 = A002.A01;
            if (str5.length() > 0 && !str5.equals(A003.A01)) {
                A003.A01 = str5;
                C18180wK.A0v(A003.A05.edit(), "IG-U-DS-USER-ID", A003.A01);
            }
            String str6 = A002.A02;
            if (str6.length() > 0 && !str6.equals(A003.A02)) {
                A003.A02 = str6;
            }
            A002.A00();
            String str7 = C685044b.A00(r5).A00;
            if (!AnonymousClass7CU.A00(str7)) {
                C685044b.A00(userSession).A01(str7);
            }
        }
        AnonymousClass6VR.A00(userSession).A01(this.A01, false);
        AnonymousClass01V.A0p.markerEnd(2293785, 2);
    }
}
