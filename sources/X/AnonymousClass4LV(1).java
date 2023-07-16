package X;

import android.app.Activity;
import com.instagram.service.session.UserSession;
import java.util.Map;

/* renamed from: X.4LV  reason: invalid class name */
public final /* synthetic */ class AnonymousClass4LV implements C83024qf {
    public final /* synthetic */ E79 A00;
    public final /* synthetic */ C24669DVc A01;
    public final /* synthetic */ C83004qd A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;

    public /* synthetic */ AnonymousClass4LV(E79 e79, C24669DVc dVc, C83004qd r3, String str, String str2) {
        this.A00 = e79;
        this.A02 = r3;
        this.A01 = dVc;
        this.A03 = str;
        this.A04 = str2;
    }

    public final void CGx(Integer num) {
        Activity activity;
        E79 e79 = this.A00;
        C83004qd r9 = this.A02;
        C24669DVc dVc = this.A01;
        String str = this.A03;
        String str2 = this.A04;
        if (num == AnonymousClass006.A00) {
            C31157GhF ghF = e79.A01;
            Activity activity2 = ghF.A0Y;
            UserSession userSession = ghF.A1z;
            AnonymousClass2AC r7 = AnonymousClass2AC.IG_STORY_COMPOSER_YOUR_STORY_BUTTON;
            C04220Ms.A0B(activity2, 0);
            AnonymousClass0wJ.A1M(userSession, 1, r7);
            if (C60423Oz.A01(activity2, activity2, r7, userSession, r9, 64, true)) {
                return;
            }
        } else if (num != AnonymousClass006.A01) {
            return;
        }
        E79.A0C(e79, dVc, str, str2);
        C31157GhF ghF2 = e79.A01;
        C32238HBy hBy = ghF2.A0q;
        boolean A0e = hBy.A0e();
        UserSession userSession2 = ghF2.A1z;
        boolean A002 = C61453Tm.A00(userSession2);
        boolean z = hBy.A1O.A03;
        if (A0e && A002 && !z && (activity = ghF2.A0Y) != null && C63803iN.A0E(AnonymousClass0TJ.A05, userSession2, 36325343035925564L)) {
            AnonymousClass3PC.A01(activity, userSession2, C18180wK.A0X(), "157575570429332", (Map) null);
        }
    }
}
