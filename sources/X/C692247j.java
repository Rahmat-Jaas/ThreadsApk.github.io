package X;

import android.content.Context;
import android.content.SharedPreferences;
import com.instagram.service.session.UserSession;

/* renamed from: X.47j  reason: invalid class name and case insensitive filesystem */
public final class C692247j implements C10390iG {
    public final long A00;
    public final Context A01;
    public final SharedPreferences A02;
    public final C13330nS A03;
    public final AnonymousClass0gL A04 = new AnonymousClass0gL(1892066561, 3, false, false);
    public final UserSession A05;

    public C692247j(UserSession userSession, Context context) {
        AnonymousClass0wJ.A1O(userSession, context);
        this.A05 = userSession;
        this.A01 = context;
        C10680ik r0 = new C10680ik(userSession);
        r0.A02 = "on_device_app_history";
        this.A03 = r0.A00();
        this.A02 = C08340dC.A00(context, "on_device_app_history");
        this.A00 = C63803iN.A03(AnonymousClass0TJ.A05, userSession, 36604812262904141L);
    }

    public final void onAppBackgrounded() {
        C14030oh.A0A(-1217936466, C14030oh.A03(-143302656));
    }

    public final void onAppForegrounded() {
        int A032 = C14030oh.A03(-1604240232);
        this.A04.execute(new C72674Pg(this));
        C14030oh.A0A(491255936, A032);
    }
}
