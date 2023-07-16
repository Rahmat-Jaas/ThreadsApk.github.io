package X;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.1rE  reason: invalid class name and case insensitive filesystem */
public final class C26801rE extends C24431ij {
    public final Activity A00;
    public final C11630kW A01;
    public final C07530bf A02;
    public final C18330wh A03;

    public C26801rE(Activity activity, C11630kW r13, C07530bf r14) {
        super(activity, (Uri) null, r13, (C84634tZ) null, r14, AnonymousClass265.A0l, AnonymousClass006.A01, (String) null);
        this.A02 = r14;
        C18330wh r1 = new C18330wh(activity);
        this.A03 = r1;
        C18330wh.A02(activity, r1, 2131830126);
        this.A00 = activity;
        this.A01 = r13;
    }

    private void A00(C07530bf r5, UserSession userSession, String str, String str2, boolean z) {
        int i;
        if (!z || userSession == null) {
            i = -1;
        } else {
            A01(AnonymousClass0wJ.A0Y(userSession), AnonymousClass269.LogInSso);
            i = userSession.multipleAccountHelper.A0B();
        }
        C63313hF A0B = AnonymousClass269.A0L.A0B(this.A02);
        AnonymousClass265 r0 = AnonymousClass265.A0l;
        C15730rn A05 = A0B.A05();
        C18250wR.A19(A05, r0.A01);
        A05.A09("successful", Boolean.valueOf(z));
        A05.A08(Integer.valueOf(i), "accounts_count");
        A05.A0D("current_activity", str);
        if (str2 != null) {
            A05.A0D("error", str2);
        }
        C18180wK.A1K(A05, r5);
    }

    public final void A02(C26641qy r23) {
        int A032 = C14030oh.A03(-333812134);
        C26641qy r2 = r23;
        User user = r2.A00;
        user.A2E(r2.A07);
        C18210wN.A1K(user);
        C07530bf r14 = this.A02;
        Activity activity = this.A00;
        String str = r2.A06;
        C11630kW r6 = this.A01;
        UserSession A033 = C67323zM.A03(activity, r6, r14, user, str, false);
        AnonymousClass0BO r3 = A033.multipleAccountHelper;
        if (r3.A0B() == 1) {
            C67323zM.A07(activity, (Uri) null, r6, A033, C18200wM.A00(), false, true, false, false);
        } else if (r3.A0N(activity, A033, user)) {
            r3.A0H(activity, (Intent) null, A033, user, "feed_force_logout_login");
        }
        A00(r14, A033, activity.toString(), (String) null, true);
        C14030oh.A0A(-302824895, A032);
    }

    public final void onFail(AnonymousClass3XX r9) {
        String str;
        int A032 = C14030oh.A03(1511106299);
        super.onFail(r9);
        C07530bf r3 = this.A02;
        String obj = this.A00.toString();
        Throwable th = r9.A01;
        if (th != null) {
            str = th.getMessage();
        } else {
            str = "unknown";
        }
        A00(r3, (UserSession) null, obj, str, false);
        C14030oh.A0A(2060147098, A032);
    }

    public final void onFinish() {
        int A032 = C14030oh.A03(782163787);
        super.onFinish();
        this.A03.hide();
        C14030oh.A0A(-845612712, A032);
    }

    public final void onStart() {
        int A032 = C14030oh.A03(-1860293603);
        super.onStart();
        C13950oZ.A00(this.A03);
        C14030oh.A0A(1207077447, A032);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        C14030oh.A0A(915540589, C63873iU.A04(this, obj, 833879310));
    }
}
