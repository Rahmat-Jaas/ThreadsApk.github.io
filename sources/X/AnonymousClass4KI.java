package X;

import android.content.Context;
import com.instagram.registration.model.RegFlowExtras;
import com.instagram.registration.model.UserBirthDate;
import com.instagram.service.session.UserSession;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.4KI  reason: invalid class name */
public final class AnonymousClass4KI implements C04860Pl {
    public final /* bridge */ /* synthetic */ void AKs(UserSession userSession, C04850Pk r13, AnonymousClass0PT r14) {
        AnonymousClass4KS r142 = (AnonymousClass4KS) r14;
        String str = C61793Vp.A00(userSession).A04;
        AnonymousClass0PF r3 = new AnonymousClass0PF(r142.A01, r13);
        C34640IcN icN = r142.A00;
        C07530bf r7 = r142.A03;
        Context context = icN.getContext();
        RegFlowExtras regFlowExtras = r142.A02;
        boolean z = false;
        H1T A0O = AnonymousClass0wJ.A0O(r7);
        A0O.A0J("multiple_accounts/create_secondary_account/");
        A0O.A0O("phone_id", C18190wL.A0l(r7));
        A0O.A0O("main_user_id", regFlowExtras.A0J);
        A0O.A0O("main_user_authorization_token", str);
        A0O.A0R("should_copy_consent_and_birthday_from_main", true);
        A0O.A0R("should_link_to_main", regFlowExtras.A0y);
        AnonymousClass269.A09(A0O);
        String A0h = C18200wM.A0h(C18200wM.A0C(), "google_ad_id");
        if (A0h == null) {
            A0h = "";
        }
        C04220Ms.A06(A0h);
        A0O.A0O("adid", A0h);
        if (regFlowExtras.A0s && regFlowExtras.A0x) {
            z = true;
        }
        A0O.A0R("should_cal_link_to_main", z);
        C18240wQ.A1A(A0O, C22241Ty.class, AnonymousClass3OC.class);
        RegFlowExtras.A00(context, A0O, r7, regFlowExtras, false);
        UserBirthDate userBirthDate = regFlowExtras.A03;
        if (userBirthDate != null) {
            A0O.A0O("year", String.valueOf(userBirthDate.A02));
            A0O.A0O("month", String.valueOf(userBirthDate.A01));
            A0O.A0O("day", String.valueOf(userBirthDate.A00));
        }
        if (!(regFlowExtras.A0T == null || regFlowExtras.A0U == null)) {
            JSONObject A0y = C18230wP.A0y();
            try {
                A0y.put("intent", regFlowExtras.A0T);
                A0y.put("surface", regFlowExtras.A0U);
                A0O.A0O("secondary_account_intent", A0y.toString());
            } catch (JSONException e) {
                C10450iM.A03("SecondaryAccountApi", C18230wP.A0t("Error adding secondary account creation intent JSON object: ", e));
            }
        }
        C32165H8c A02 = A0O.A02();
        A02.A00 = r3;
        icN.schedule(A02);
    }
}
