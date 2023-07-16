package X;

import android.app.Activity;
import com.instagram.service.session.UserSession;

/* renamed from: X.3TM  reason: invalid class name */
public final class AnonymousClass3TM {
    public C67233zC A00;
    public CharSequence A01;
    public String A02;
    public String A03;
    public final Activity A04;
    public final AnonymousClass2AD A05;
    public final C82464pf A06;
    public final UserSession A07;
    public final boolean A08;
    public final AnonymousClass2AC A09;

    public static final void A00(AnonymousClass29W r7, AnonymousClass3TM r8) {
        UserSession userSession = r8.A07;
        AnonymousClass2AC r5 = r8.A09;
        AnonymousClass2AD r4 = r8.A05;
        AnonymousClass14U A002 = AnonymousClass14U.A00();
        A002.A0A("ig_media_id", "");
        C04220Ms.A0B(userSession, 0);
        C18210wN.A1D(A002, (long) C28161tl.A04(userSession).getInt("dialog_after_sharing_story_show_times", 0));
        C49322rC.A00(r5, r7, r4, A002, userSession);
    }

    public AnonymousClass3TM(Activity activity, AnonymousClass2AC r7, AnonymousClass2AD r8, C82464pf r9, UserSession userSession) {
        CharSequence A0g;
        AnonymousClass0wJ.A1Q(userSession, r8);
        C04220Ms.A0B(r7, 4);
        this.A04 = activity;
        this.A07 = userSession;
        this.A05 = r8;
        this.A09 = r7;
        this.A06 = r9;
        AnonymousClass0TJ r2 = AnonymousClass0TJ.A05;
        C63803iN.A0E(r2, userSession, 36322581372083635L);
        this.A08 = C63803iN.A0E(r2, userSession, 36322581371952561L);
        boolean A0E = C63803iN.A0E(r2, userSession, 36322581372149172L);
        this.A03 = C18190wL.A0g(activity.getResources(), A0E ? 2131825682 : 2131825681);
        AnonymousClass2AI r0 = AnonymousClass2AI.A04;
        UserSession userSession2 = this.A07;
        String A012 = r0.A01(userSession2);
        if (A012 == null || !this.A08) {
            A0g = C18190wL.A0g(this.A04.getResources(), 2131825678);
        } else {
            A0g = C18210wN.A0C(this.A04.getResources(), A012, C67373zR.A0D(userSession2) ? 2131825679 : 2131825680);
            C04220Ms.A09(A0g);
        }
        this.A01 = A0g;
        this.A02 = C18190wL.A0g(activity.getResources(), A0E ? 2131825685 : 2131825648);
    }
}
