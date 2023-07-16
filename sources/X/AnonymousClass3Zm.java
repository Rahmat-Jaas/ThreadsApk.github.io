package X;

import android.content.SharedPreferences;
import com.facebook.graphql.calls.GQLCallInputCInputShape0S0000000;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.instagram.common.api.base.IDxACallbackShape35S0200000_1_I2;
import com.instagram.service.session.UserSession;

/* renamed from: X.3Zm  reason: invalid class name */
public final class AnonymousClass3Zm {
    public static void A02(C83614rh r8, UserSession userSession) {
        UserSession userSession2 = userSession;
        C28161tl A01 = AnonymousClass3WS.A01(userSession);
        SharedPreferences sharedPreferences = A01.A00;
        if (sharedPreferences.getBoolean("browser_autofill_contact_synced", false)) {
            A00(new IDxACallbackShape35S0200000_1_I2(22, r8, A01), userSession);
            return;
        }
        A01(new IDxACallbackShape35S0200000_1_I2(23, r8, A01), userSession2, Integer.valueOf(sharedPreferences.getInt("browser_consecutive_decline_autofill", 0)), (Integer) null, "CONTACT_AUTOFILL", "SYNC");
    }

    public static void A03(C83614rh r10, UserSession userSession, String str, boolean z, boolean z2) {
        String str2;
        boolean z3 = z;
        boolean z4 = z2;
        if (!z2) {
            str2 = "DISABLE";
        } else if (z) {
            str2 = "RESET_AND_GRANT_CONSENT";
        } else {
            str2 = "RESET";
        }
        A01(new AnonymousClass1hV(r10, userSession, str, z3, z4), userSession, (Integer) null, (Integer) null, str, str2);
    }

    public static void A00(C63873iU r4, UserSession userSession) {
        C32165H8c A0R = C18180wK.A0R(C67473zc.A00(C67463zb.A00(), AnonymousClass166.class, "IGIABAutofillSettings"), userSession);
        A0R.A00 = r4;
        C31155GhB.A05(A0R, 517, 2, false, false);
    }

    public static void A01(C63873iU r4, UserSession userSession, Integer num, Integer num2, String str, String str2) {
        GQLCallInputCInputShape0S0000000 A00 = GraphQlCallInput.A00();
        GraphQlCallInput.A05(A00, str, "autofill_type");
        GraphQlCallInput.A05(A00, str2, "update_settings_operator");
        if (num != null) {
            GraphQlCallInput.A05(A00, num, "consecutive_neg_interaction");
        }
        if (num2 != null) {
            GraphQlCallInput.A05(A00, num2, "connect_neg_interaction_count");
        }
        C67463zb A002 = C67463zb.A00();
        A002.A02(A00, "request");
        AnonymousClass7Ko.A0B(true);
        C32165H8c A0R = C18180wK.A0R(C67473zc.A00(A002, AnonymousClass168.class, "IGIABAutofillUpdateSettingsMutation"), userSession);
        A0R.A00 = r4;
        C31155GhB.A05(A0R, 517, 2, false, false);
    }
}
