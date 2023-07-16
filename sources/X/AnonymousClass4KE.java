package X;

import android.content.Context;
import com.instagram.service.session.UserSession;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.4KE  reason: invalid class name */
public final class AnonymousClass4KE implements C04860Pl {
    public final /* bridge */ /* synthetic */ void AKs(UserSession userSession, C04850Pk r11, AnonymousClass0PT r12) {
        AnonymousClass4KQ r122 = (AnonymousClass4KQ) r12;
        AnonymousClass0PF r6 = new AnonymousClass0PF(r122.A02, r11);
        try {
            Context context = r122.A00;
            AnonymousClass06E r4 = r122.A01;
            List list = r122.A03;
            JSONArray A0i = C18250wR.A0i();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String A0k = C18180wK.A0k(it);
                JSONObject A0y = C18230wP.A0y();
                A0y.put("user_id", Long.parseLong(A0k));
                A0i.put(A0y);
            }
            H1T A0N = AnonymousClass0wJ.A0N(userSession);
            C18200wM.A1N(A0N, "multiple_accounts/set_child_accounts/");
            A0N.A0O("child_account_ids", A0i.toString());
            A0N.A04.A0I = true;
            C32165H8c A02 = A0N.A02();
            A02.A00 = r6;
            C31155GhB.A01(context, r4, A02);
        } catch (JSONException unused) {
            r11.ADn((AnonymousClass0PT) null);
        }
    }
}
