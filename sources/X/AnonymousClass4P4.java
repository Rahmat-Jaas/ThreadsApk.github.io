package X;

import android.content.SharedPreferences;
import com.instagram.service.session.UserSession;

/* renamed from: X.4P4  reason: invalid class name */
public final /* synthetic */ class AnonymousClass4P4 implements Runnable {
    public final /* synthetic */ UserSession A00;

    public /* synthetic */ AnonymousClass4P4(UserSession userSession) {
        this.A00 = userSession;
    }

    public final void run() {
        UserSession userSession = this.A00;
        SharedPreferences A01 = AnonymousClass3Zs.A03(userSession).A01(D2R.A15);
        C18180wK.A0v(A01.edit(), "switcher_aggregate_seen_badge_count", C18220wO.A0p(new C208016e(C550931s.A01.A01(userSession, false), System.currentTimeMillis())));
        AnonymousClass3NS.A01(userSession).A03(AnonymousClass2AP.A0Q);
    }
}
