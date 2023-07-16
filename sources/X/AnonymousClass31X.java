package X;

import android.content.Context;
import com.instagram.service.session.UserSession;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;

/* renamed from: X.31X  reason: invalid class name */
public final class AnonymousClass31X {
    public static List A00;

    public static void A00(Context context, UserSession userSession, List list) {
        A00 = list;
        Context applicationContext = context.getApplicationContext();
        List list2 = A00;
        String A02 = C63573hp.A02(applicationContext);
        String A0l = C18190wL.A0l(userSession);
        String A0i = C18230wP.A0i(applicationContext);
        JSONArray A0i2 = C18250wR.A0i();
        if (list2 != null) {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                C18210wN.A1R(it, A0i2);
            }
        }
        H1T A0N = AnonymousClass0wJ.A0N(userSession);
        A0N.A0J("accounts/process_contact_point_signals/");
        A0N.A0O(AnonymousClass3Q8.A00(0, 9, 104), A0i);
        C18230wP.A1I(A0N, A0i2);
        A0N.A0P("phone_id", A0l);
        A0N.A0P("sim_phone_number", A02);
        if (userSession.multipleAccountHelper.A0L()) {
            A0N.A04.A0I = true;
        }
        C63873iU.A0D(AnonymousClass0wJ.A0S(A0N), userSession, 177);
    }
}
