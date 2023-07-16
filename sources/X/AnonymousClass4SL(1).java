package X;

import android.app.Activity;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.bloks.foa.cds.bottomsheet.config.CdsOpenScreenDismissCallback;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.login.callback.LoginCallbacks$2;
import com.instagram.service.session.UserSession;
import com.instagram.ui.widget.progressbutton.ProgressButton;
import com.instagram.user.model.User;
import java.util.Collections;
import java.util.HashMap;
import java.util.Set;

/* renamed from: X.4SL  reason: invalid class name */
public final class AnonymousClass4SL implements Runnable {
    public final /* synthetic */ AnonymousClass1mV A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ User A02;

    public AnonymousClass4SL(AnonymousClass1mV r1, UserSession userSession, User user) {
        this.A00 = r1;
        this.A01 = userSession;
        this.A02 = user;
    }

    public final void run() {
        UserSession userSession;
        Bundle bundle;
        Fragment fragment;
        String str;
        AnonymousClass3GT r1;
        String str2;
        String str3;
        AnonymousClass1mV r12 = this.A00;
        C24431ij r0 = r12.A01;
        C26641qy r13 = r12.A00;
        String str4 = r13.A05;
        Integer num = r13.A01;
        String str5 = "";
        if (str4 != null) {
            if (str4.equals("autoconf_register_flow") && num != null && (str = r0.A0B) != null && (r1 = r0.A06) != null && (str2 = r0.A0C) != null) {
                C62323Yh r122 = C62323Yh.A00;
                userSession = this.A01;
                AnonymousClass265 r5 = r0.A08;
                if (r5 == null) {
                    str3 = str5;
                } else {
                    str3 = r5.A01;
                }
                UserSession userSession2 = userSession;
                String str6 = "ar_code_sms";
                r122.A03(userSession2, str3, "client_reg_valid_login_response", "valid login response for reg flow", "registration_flow", str6);
                int intValue = num.intValue();
                if (intValue == 2 || intValue == 3 || intValue == 4) {
                    C63463hW.A03();
                    bundle = AnonymousClass0wJ.A0E(userSession);
                    bundle.putString("REGISTER_START_MESSAGE", str);
                    bundle.putString("NONCE", str2);
                    bundle.putString("SMS_FLOW_TYPE", "ar_code_sms");
                    bundle.putInt("CONSENT_MODE", num.intValue());
                    fragment = new AnonymousClass1ZO();
                } else if (num.equals(C18220wO.A0d())) {
                    if (r5 != null) {
                        str5 = r5.A01;
                    }
                    r122.A03(userSession, str5, "client_reg_not_show_user_consent", "reg with consent screen skipped, user already consented", "registration_flow", "ar_code_sms");
                    if (r1 instanceof C26891rQ) {
                        C26891rQ r14 = (C26891rQ) r1;
                        AnonymousClass1ci r6 = r14.A00;
                        AnonymousClass3Xi r8 = new AnonymousClass3Xi(r6.requireContext());
                        String str7 = r6.BDt().A01;
                        FragmentActivity requireActivity = r6.requireActivity();
                        String str8 = r6.A0C;
                        str8.getClass();
                        String str9 = r14.A01;
                        C24311hs r132 = new C24311hs(r6.requireActivity(), r6, userSession, (ProgressButton) null, r6.BDt());
                        AnonymousClass32R r52 = new AnonymousClass32R();
                        r52.A00.putByteArray("requestMessage", AnonymousClass3Xi.A07.A03(str8));
                        r52.A00.putBoolean("useDebugKey", false);
                        C31155GhB.A03(new C25061lh(requireActivity, r52, r6, r132, r8, userSession, str7, "ar_code_sms", str9));
                        return;
                    }
                    return;
                } else {
                    if (r5 != null) {
                        str5 = r5.A01;
                    }
                    r122.A03(userSession2, str5, "client_reg_not_show_user_consent", "consent screen not shown and abort reg", "registration_flow", str6);
                    r0.A03(userSession, this.A02);
                }
            } else if (str4.equals("autoconf_authenticate_flow")) {
                C62323Yh r82 = C62323Yh.A00;
                userSession = this.A01;
                AnonymousClass265 r15 = r0.A08;
                if (r15 != null) {
                    str5 = r15.A01;
                }
                r82.A03(userSession, str5, "client_auth_finished_success", (String) null, "optimistic_authentication_flow", "ar_code_sms");
                C63463hW.A03();
                bundle = AnonymousClass0wJ.A0E(userSession);
                fragment = new AnonymousClass1ZF();
            }
            fragment.setArguments(bundle);
            C18220wO.A1A(fragment, C18180wK.A0Q((FragmentActivity) r0.A01, userSession));
            return;
        }
        if (!C63173fJ.A05(AnonymousClass0TJ.A05, 18302964477201981L) && AnonymousClass006.A0j.equals(r0.A09)) {
            UserSession userSession3 = this.A01;
            C63533hk A022 = C63533hk.A02(userSession3);
            String userId = userSession3.getUserId();
            if (!A022.A0I(userId) && A022.A0H() && !((Set) C18220wO.A0f(C09120et.A02().A06)).contains(userId)) {
                Activity activity = r0.A01;
                if (new AnonymousClass3Y9(activity, userSession3).A02(AnonymousClass006.A01)) {
                    ((Set) C18220wO.A0f(C09120et.A02().A06)).add(userSession3.getUserId());
                    AnonymousClass3LL.A00(userSession3, "login_password_saving_eligible", "login_spi", "spi", "home_page", (String) null, (HashMap) null);
                    User user = this.A02;
                    Integer num2 = C66883yU.A0F;
                    Integer num3 = AnonymousClass006.A00;
                    C66883yU r83 = new C66883yU((C81804oQ) null, (CdsOpenScreenDismissCallback) null, (AnonymousClass3HX) null, (AnonymousClass601) null, (C127397h3) null, (C109326jp) null, AnonymousClass006.A0C, AnonymousClass006.A0N, num2, num3, (Integer) null, (Integer) null, false, false, false);
                    IgBloksScreenConfig A0N = C18190wL.A0N(userSession3);
                    A0N.A0P = "com.bloks.www.caa.login.save-credentials";
                    A0N.A04 = new LoginCallbacks$2(r0, userSession3, user);
                    A0N.A01 = r83;
                    HashMap A0y = AnonymousClass0wJ.A0y();
                    A0y.put("family_device_id", C18190wL.A0l(userSession3));
                    A0y.put("offline_experiment_group", AnonymousClass3Y9.A00(new AnonymousClass3Y9(activity, r0.A07)));
                    try {
                        AnonymousClass3LL.A00(userSession3, "login_password_saving_open_spi_attempt", "login_spi", "spi", "home_page", (String) null, (HashMap) null);
                        C63743iE.A04("com.bloks.www.caa.login.save-credentials", A0y, Collections.emptyMap()).A0E(activity, A0N);
                        return;
                    } catch (Exception e) {
                        AnonymousClass3LL.A00(userSession3, "login_password_saving_opening_failed", "login_spi", "spi", "home_page", e.getMessage(), (HashMap) null);
                        r0.A03(userSession3, user);
                        return;
                    }
                }
            }
        }
        userSession = this.A01;
        r0.A03(userSession, this.A02);
    }
}
