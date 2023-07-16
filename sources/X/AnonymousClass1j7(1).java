package X;

import android.content.SharedPreferences;
import com.instagram.service.session.UserSession;

/* renamed from: X.1j7  reason: invalid class name */
public final class AnonymousClass1j7 extends JY2 {
    public final UserSession A00;

    public final void onResponseStarted(GXK gxk, JWQ jwq, GJN gjn) {
        AnonymousClass3Ud A002 = gjn.A00("Zero-Provisioned-Time");
        if (A002 != null) {
            UserSession userSession = this.A00;
            C28161tl A01 = AnonymousClass3WS.A01(userSession);
            long parseLong = Long.parseLong(A002.A01);
            SharedPreferences sharedPreferences = A01.A00;
            if (parseLong != C18180wK.A05(sharedPreferences, "zero_rating_provisioned_time")) {
                C34463IUv.A00(userSession).ANT("provisioning_time_mismatch", false);
                AnonymousClass0wJ.A12(sharedPreferences.edit(), "zero_rating_provisioned_time", parseLong);
            }
        }
    }

    public AnonymousClass1j7(UserSession userSession) {
        this.A00 = userSession;
    }
}
