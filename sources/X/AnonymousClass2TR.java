package X;

import android.content.Context;
import com.instagram.registration.model.RegFlowExtras;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.2TR  reason: invalid class name */
public final class AnonymousClass2TR {
    public static C32165H8c A00(Context context, RegFlowExtras regFlowExtras, C07530bf r7, Integer num, String str, String str2) {
        String str3;
        if (num == AnonymousClass006.A00) {
            str3 = "accounts/create/";
        } else if (num == AnonymousClass006.A01) {
            str3 = "accounts/create_validated/";
        } else {
            str3 = "";
        }
        boolean z = true;
        boolean A1X = C18180wK.A1X(r7.A00.A0B());
        H1T A0O = AnonymousClass0wJ.A0O(r7);
        A0O.A0J(str3);
        AnonymousClass269.A09(A0O);
        String A0h = C18200wM.A0h(C18200wM.A0C(), "google_ad_id");
        if (A0h == null) {
            A0h = "";
        }
        C18180wK.A1J(A0O, r7, "adid", A0h);
        A0O.A0O("_uuid", C18230wP.A0i(context));
        A0O.A0R("is_secondary_account_creation", A1X);
        if (C313625r.SAC == regFlowExtras.A01()) {
            z = false;
        }
        A0O.A0R("do_not_auto_login_if_credentials_match", z);
        A0O.A0P("logged_in_user_id", str);
        A0O.A0P("logged_in_user_authorization_token", str2);
        A0O.A0P("supervised_user_consent_token", regFlowExtras.A0d);
        A0O.A0O("jazoest", AnonymousClass3E4.A00.A00(C18190wL.A0l(r7)));
        C18240wQ.A1A(A0O, C22241Ty.class, AnonymousClass3OC.class);
        RegFlowExtras.A00(context, A0O, r7, regFlowExtras, true);
        C18190wL.A1M(A0O, regFlowExtras);
        if (!(regFlowExtras.A0T == null || regFlowExtras.A0U == null)) {
            JSONObject A0y = C18230wP.A0y();
            try {
                A0y.put("intent", regFlowExtras.A0T);
                A0y.put("surface", regFlowExtras.A0U);
                A0O.A0O("secondary_account_intent", A0y.toString());
            } catch (JSONException e) {
                C10450iM.A03("CreateAccountApi", C18230wP.A0t("Error adding secondary account creation intent JSON object: ", e));
            }
        }
        return A0O.A02();
    }
}
