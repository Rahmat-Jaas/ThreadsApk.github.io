package X;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.instagram.registration.model.RegFlowExtras;
import com.instagram.service.session.UserSession;

/* renamed from: X.3Vf  reason: invalid class name and case insensitive filesystem */
public final class C61753Vf {
    public static Fragment A00(Bundle bundle, RegFlowExtras regFlowExtras, String str, String str2, String str3, String str4, String str5, boolean z, boolean z2) {
        boolean z3;
        boolean z4 = false;
        if (regFlowExtras != null || (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2))) {
            z3 = true;
        } else {
            z3 = false;
        }
        AnonymousClass7Ko.A0B(z3);
        Bundle A06 = C18180wK.A06();
        if (regFlowExtras != null) {
            A06.putParcelable("RegFlowExtras.EXTRA_KEY", regFlowExtras);
        }
        if (!(str == null || str2 == null)) {
            A06.putString("phone_number_key", str);
            A06.putString("query_key", str2);
        }
        if (str3 != null) {
            A06.putString("client_message", str3);
        }
        if (str4 != null) {
            A06.putString("register_start_message", str4);
        }
        A06.putBoolean("should_enable_auto_conf", z);
        if (regFlowExtras != null) {
            z4 = true;
        }
        A06.putBoolean("arg_is_reg_flow", z4);
        C18190wL.A13(A06, str5);
        if (z2) {
            A06.putBoolean("arg_is_multiple_account_recovery", z2);
        }
        A06.putAll(bundle);
        AnonymousClass1ci r0 = new AnonymousClass1ci();
        r0.setArguments(A06);
        return r0;
    }

    public final Fragment A03(UserSession userSession) {
        C23231co r1 = new C23231co();
        if (userSession != null) {
            r1.setArguments(AnonymousClass0wJ.A0E(userSession));
        }
        return r1;
    }

    public final Fragment A01(Bundle bundle, String str) {
        C18190wL.A13(bundle, str);
        C23201cg r0 = new C23201cg();
        r0.setArguments(bundle);
        return r0;
    }

    public final Fragment A04(UserSession userSession, String str) {
        Bundle A06 = C18180wK.A06();
        if (str != null) {
            A06.putString("change_password_entrypoint", str);
        }
        C18190wL.A13(A06, userSession.token);
        AnonymousClass1aw r0 = new AnonymousClass1aw();
        r0.setArguments(A06);
        return r0;
    }

    public final Fragment A02(Bundle bundle, String str, String str2, String str3, String str4, String str5, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9) {
        C310624b r0;
        C22641Yw r1 = new C22641Yw();
        bundle.putString("argument_two_fac_identifier", str);
        bundle.putString("argument_username", str2);
        bundle.putString("argument_pk", str3);
        bundle.putString("argument_abfuscated_phone_number", str4);
        bundle.putBoolean("argument_is_from_one_click_flow", z6);
        bundle.putBoolean("argument_show_trusted_device_option", z);
        bundle.putBoolean("argument_sms_two_factor_on", z2);
        bundle.putBoolean("argument_whatsapp_two_factor_on", z4);
        bundle.putBoolean("argument_totp_two_factor_on", z3);
        bundle.putBoolean("argument_is_trusted_device", z9);
        bundle.putBoolean("argument_should_opt_in_trusted_device_option", z5);
        if (z7) {
            r0 = C310624b.TRUSTED_NOTIFICATION;
        } else if (z4) {
            r0 = C310624b.WHATSAPP;
        } else if (z3) {
            r0 = C310624b.AUTHENTICATOR_APP;
        } else if (!z2 || str5 != null) {
            r0 = C310624b.BACKUP_CODE;
        } else {
            r0 = C310624b.SMS;
        }
        bundle.putInt("argument_two_fac_clear_method", r0.A00);
        C18190wL.A13(bundle, "IgSessionManager.LOGGED_OUT_TOKEN");
        bundle.putBoolean("ARGUMENT_SHOULD_REMEMBER_PASSWORD", false);
        bundle.putString("argument_sms_not_allowed_reason", str5);
        bundle.putBoolean("eligible_for_multiple_totp", z8);
        r1.setArguments(bundle);
        return r1;
    }
}
