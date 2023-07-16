package X;

import android.content.SharedPreferences;
import com.instagram.service.session.UserSession;
import java.io.IOException;

/* renamed from: X.49T  reason: invalid class name */
public final class AnonymousClass49T implements AnonymousClass0i4 {
    public final SharedPreferences A00;
    public final UserSession A01;

    public static AnonymousClass1UI A00(UserSession userSession) {
        String string = ((AnonymousClass49T) C18180wK.A0c(userSession, AnonymousClass49T.class, 26)).A00.getString("qp_cooldown_response_json", (String) null);
        if (string != null) {
            try {
                return C60133Nv.parseFromJson(C18180wK.A0L(string));
            } catch (IOException e) {
                C10450iM.A06("IG-QP", "failed to parse stored QP cooldown response.", e);
            }
        }
        return null;
    }

    public static void A01(UserSession userSession) {
        SharedPreferences sharedPreferences = ((AnonymousClass49T) C18180wK.A0c(userSession, AnonymousClass49T.class, 26)).A00;
        C18180wK.A0u(sharedPreferences.edit(), "qp_cooldown_response_json");
        C18180wK.A0u(sharedPreferences.edit(), "qp_cooldown_response_expiration_time");
    }

    public final void onSessionWillEnd() {
        this.A01.A03(AnonymousClass49T.class);
    }

    public AnonymousClass49T(UserSession userSession) {
        this.A01 = userSession;
        SharedPreferences A012 = AnonymousClass3Zs.A03(userSession).A01(D2R.A1r);
        this.A00 = A012;
        int i = A012.getInt("app_version_number", -1);
        int A002 = C10380iF.A00();
        if (i != A002) {
            C18190wL.A11(A012);
            AnonymousClass0wJ.A11(A012.edit(), "app_version_number", A002);
        }
    }
}
