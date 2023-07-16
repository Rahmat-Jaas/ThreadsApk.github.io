package X;

import android.text.TextUtils;
import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.instagram.debug.devoptions.FXPFAccessLibraryDebugFragment;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import com.instagram.service.session.UserSession;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.3hk  reason: invalid class name and case insensitive filesystem */
public final class C63533hk {
    public static C63533hk A01;
    public Map A00 = AnonymousClass0wJ.A0y();

    public static void A05(AnonymousClass0A3 r3, AnonymousClass0V3 r4, String str) {
        r4.A0A("event_request_id", (String) null);
        r3.A0P(r4, "core");
        AnonymousClass14C r1 = new AnonymousClass14C();
        r1.A0A("reg_instance", "");
        r1.A0A(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATE, str);
        r3.A0P(r1, "acquisition_client_params");
        r3.Bb4();
    }

    public static C63533hk A01() {
        C63533hk r0 = A01;
        if (r0 != null) {
            return r0;
        }
        C63533hk r02 = new C63533hk();
        A01 = r02;
        return r02;
    }

    public static C63533hk A02(C10300i6 r1) {
        if (A01 == null) {
            C63533hk r0 = new C63533hk();
            A01 = r0;
            r0.A0D(r1);
        }
        return A01;
    }

    public static C62733ac A03(C63533hk r1, String str) {
        if (r1.A00.containsKey(str)) {
            return (C62733ac) r1.A00.get(str);
        }
        C62733ac r0 = new C62733ac();
        r0.A05 = str;
        return r0;
    }

    public final void A0A(C11630kW r3, C10300i6 r4, Integer num, String str, String str2) {
        this.A00.remove(str);
        new AnonymousClass3YQ().A03(r4, AnonymousClass224.A03, str, str2);
        C62423Zt.A02(r4);
        C49012qh.A00(r3, r4, num, str, false);
        A0C((C11630kW) null, (C10300i6) null, (Iterable) null, false);
    }

    public final void A0C(C11630kW r18, C10300i6 r19, Iterable iterable, boolean z) {
        HashMap hashMap;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        C10300i6 r10 = r19;
        try {
            ArrayList A0s = C18200wM.A0s(this.A00.values());
            HashSet A0u = C18200wM.A0u();
            A0u.addAll(C09120et.A02().A0E());
            Iterator it = A0s.iterator();
            while (it.hasNext()) {
                C62733ac A0Q = C18250wR.A0Q(it);
                A0u.remove(A0Q.A05);
                A0u.remove(A0Q.A06);
            }
            C09120et.A02().A0G(A0u);
            StringWriter A0d = C18230wP.A0d();
            MMp A0K = C18180wK.A0K(A0d);
            Iterator A0t = C18190wL.A0t(A0K, "user_info_list", A0s);
            while (A0t.hasNext()) {
                C62733ac A0Q2 = C18250wR.A0Q(A0t);
                if (A0Q2 != null) {
                    A0K.A0J();
                    A0K.A0e("upsell_seen_before", A0Q2.A0A);
                    A0K.A0e("allow_non_fb_sso", A0Q2.A07);
                    A0K.A0e("rejected_sso_upsell", A0Q2.A09);
                    String str9 = A0Q2.A05;
                    if (str9 != null) {
                        A0K.A0d("user_id", str9);
                    }
                    String str10 = A0Q2.A03;
                    if (str10 != null) {
                        A0K.A0d("login_nonce", str10);
                    }
                    String str11 = A0Q2.A04;
                    if (str11 != null) {
                        A0K.A0d("login_token", str11);
                    }
                    String str12 = A0Q2.A06;
                    if (str12 != null) {
                        A0K.A0d(C61943Wl.A00(), str12);
                    }
                    if (A0Q2.A02 != null) {
                        A0K.A0U("profile_pic_url");
                        C59533Le.A01(A0K, A0Q2.A02);
                    }
                    A0K.A0c("last_logout_timestamp", A0Q2.A00);
                    A0K.A0c("login_token_update_timestamp", A0Q2.A01);
                    A0K.A0e("is_fx_sso", A0Q2.A08);
                    A0K.A0G();
                }
            }
            A0K.A0F();
            C18180wK.A0v(C18200wM.A0C().edit(), "one_tap_login_user_map", C18180wK.A0h(A0K, A0d));
            if (z && r19 != null && r18 != null) {
                HashMap A0y = AnonymousClass0wJ.A0y();
                if (iterable != null) {
                    A0y.put(FXPFAccessLibraryDebugFragment.UID, iterable.toString());
                }
                String moduleName = r18.getModuleName();
                switch (moduleName.hashCode()) {
                    case 200821380:
                        if (moduleName.equals("caa_registration_save_credentials")) {
                            USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A02(r10), "caa_acquisition_client_ig_event"), 118);
                            if (AnonymousClass0wJ.A1U(A0I)) {
                                C09120et A0X = C18190wL.A0X();
                                AnonymousClass14D r2 = new AnonymousClass14D();
                                C18220wO.A1H(r2, "registration_flow_state", "ntf", "password_saving", "registration_funnel");
                                r2.A09("exception_code", (Long) null);
                                r2.A0A("exception_message", (String) null);
                                r2.A0A("logged_in_identifier", (String) null);
                                r2.A0A("logged_out_identifier", (String) null);
                                r2.A0C("extra_client_data", (Map) null);
                                r2.A0A("waterfall_id", A0X.A0D());
                                A05(A0I, r2, "password_saving_success");
                                return;
                            }
                            return;
                        }
                        return;
                    case 293415587:
                        if (moduleName.equals("caa_login_one_tap_log_out_fragment")) {
                            AnonymousClass3LL.A00(r10, "logout_password_saving_multiaccount_opt_in_successful", "logout_spi", "spi", "logout_interaction", (String) null, A0y);
                            return;
                        }
                        return;
                    case 1985400354:
                        if (moduleName.equals("caa_logout_save_credentials_single_account")) {
                            str8 = "logout_password_saving_opt_in_successful";
                            str7 = "logout_spi";
                            str6 = "spi";
                            str5 = "logout_interaction";
                            break;
                        } else {
                            return;
                        }
                    case 2122863948:
                        if (moduleName.equals("caa_login_save_credentials")) {
                            str8 = "login_password_saving_opt_in_successful";
                            str7 = "login_spi";
                            str6 = "spi";
                            str5 = "home_page";
                            break;
                        } else {
                            return;
                        }
                    default:
                        return;
                }
                AnonymousClass3LL.A00(r10, str8, str7, str6, str5, (String) null, (HashMap) null);
            }
        } catch (IOException unused) {
            if (z && r19 != null && r18 != null) {
                HashMap A0y2 = AnonymousClass0wJ.A0y();
                if (iterable != null) {
                    A0y2.put(FXPFAccessLibraryDebugFragment.UID, iterable.toString());
                }
                String moduleName2 = r18.getModuleName();
                switch (moduleName2.hashCode()) {
                    case 200821380:
                        if (moduleName2.equals("caa_registration_save_credentials")) {
                            USLEBaseShape0S0000000 A0I2 = C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A02(r10), "caa_acquisition_client_ig_event"), 118);
                            if (AnonymousClass0wJ.A1U(A0I2)) {
                                C09120et A0X2 = C18190wL.A0X();
                                AnonymousClass14D r22 = new AnonymousClass14D();
                                C18220wO.A1H(r22, "registration_flow_state", "ntf", "password_saving", "registration_funnel");
                                r22.A09("exception_code", (Long) null);
                                r22.A0A("exception_message", "Couldn't write to disk");
                                r22.A0A("logged_in_identifier", (String) null);
                                r22.A0A("logged_out_identifier", (String) null);
                                r22.A0C("extra_client_data", (Map) null);
                                r22.A0A("waterfall_id", A0X2.A0D());
                                A05(A0I2, r22, "password_saving_failure");
                                return;
                            }
                            return;
                        }
                        return;
                    case 293415587:
                        if (moduleName2.equals("caa_login_one_tap_log_out_fragment")) {
                            str4 = "logout_password_saving_multiaccount_opt_in_failed";
                            str3 = "logout_spi";
                            str2 = "spi";
                            str = "logout_interaction";
                            hashMap = A0y2;
                            break;
                        } else {
                            return;
                        }
                    case 1985400354:
                        if (moduleName2.equals("caa_logout_save_credentials_single_account")) {
                            str4 = "logout_password_saving_opt_in_failed";
                            str3 = "logout_spi";
                            str2 = "spi";
                            str = "logout_interaction";
                            break;
                        } else {
                            return;
                        }
                    case 2122863948:
                        if (moduleName2.equals("caa_login_save_credentials")) {
                            str4 = "login_password_saving_opt_in_failed";
                            str3 = "login_spi";
                            str2 = "spi";
                            str = "home_page";
                            break;
                        } else {
                            return;
                        }
                    default:
                        return;
                }
                hashMap = null;
                AnonymousClass3LL.A00(r10, str4, str3, str2, str, "Couldn't write to disk", hashMap);
            }
        }
    }

    public final void A0E(C10300i6 r5, String str) {
        if (this.A00.containsKey(str)) {
            C62733ac r3 = (C62733ac) this.A00.get(str);
            r3.A03 = null;
            r3.A04 = null;
            r3.A01 = -1;
            A0C((C11630kW) null, (C10300i6) null, (Iterable) null, false);
        }
        new AnonymousClass3YQ().A03(r5, AnonymousClass224.A03, str, "OneTapLoginUserHelper");
    }

    public final void A0F(C62733ac r3) {
        this.A00.put(r3.A05, r3);
        A0C((C11630kW) null, (C10300i6) null, (Iterable) null, false);
    }

    public final boolean A0H() {
        Iterator A0z = AnonymousClass0wJ.A0z(this.A00);
        int i = 0;
        while (A0z.hasNext()) {
            if (((C62733ac) C18180wK.A0o(A0z).getValue()).A07) {
                i++;
            }
        }
        return C18230wP.A1W(i, 5);
    }

    public final boolean A0I(String str) {
        if (!this.A00.containsKey(str) || !((C62733ac) this.A00.get(str)).A07) {
            return false;
        }
        return true;
    }

    public final boolean A0J(String str) {
        if (!this.A00.containsKey(str) || !((C62733ac) this.A00.get(str)).A0A) {
            return false;
        }
        return true;
    }

    public final boolean A0K(String str) {
        if (!this.A00.containsKey(str) || !((C62733ac) this.A00.get(str)).A09) {
            return false;
        }
        return true;
    }

    public static int A00(C10300i6 r0) {
        return A02(r0).A07().size();
    }

    public static Iterator A04(C10300i6 r0) {
        return A02(r0).A07().iterator();
    }

    public static boolean A06(UserSession userSession) {
        return A02(userSession).A0I(userSession.getUserId());
    }

    public final List A07() {
        ArrayList A0v = AnonymousClass0wJ.A0v();
        Iterator A0z = AnonymousClass0wJ.A0z(this.A00);
        while (A0z.hasNext()) {
            Map.Entry A0o = C18180wK.A0o(A0z);
            if (((C62733ac) A0o.getValue()).A07) {
                A0v.add(A0o.getValue());
            }
        }
        return A0v;
    }

    public final List A08(C10300i6 r5) {
        List A07 = A07();
        Iterator it = A07.iterator();
        while (it.hasNext()) {
            if (C05030Qo.A01(r5).A0O(C18250wR.A0Q(it).A05)) {
                it.remove();
            }
        }
        return A07;
    }

    public final void A09(C11630kW r5, C10300i6 r6, Integer num, Iterable iterable, boolean z) {
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            String A0k = C18180wK.A0k(it);
            C62733ac A03 = A03(this, A0k);
            if (A03.A07 != z) {
                C49012qh.A00(r5, r6, num, A0k, z);
            }
            A03.A07 = z;
            this.A00.put(A0k, A03);
        }
        C62423Zt.A02(r6);
        if (r5 != null) {
            String moduleName = r5.getModuleName();
            if (moduleName.equals("caa_login_save_credentials") || moduleName.equals("caa_login_one_tap_log_out_fragment") || moduleName.equals("caa_logout_save_credentials_single_account") || moduleName.equals("caa_registration_save_credentials")) {
                A0C(r5, r6, iterable, z);
                return;
            }
        }
        A0C((C11630kW) null, (C10300i6) null, (Iterable) null, false);
    }

    public final void A0B(C11630kW r1, C10300i6 r2, Integer num, String str, boolean z) {
        A09(r1, r2, num, Collections.singleton(str), z);
    }

    public final void A0D(C10300i6 r7) {
        List A0v = AnonymousClass0wJ.A0v();
        String A0h = C18200wM.A0h(C18200wM.A0C(), "one_tap_login_user_map");
        if (!TextUtils.isEmpty(A0h)) {
            try {
                A0v = C50502t6.parseFromJson(C18180wK.A0L(A0h)).A00;
            } catch (IOException unused) {
            }
        }
        HashMap A0y = AnonymousClass0wJ.A0y();
        if (A0v != null) {
            ArrayList A0v2 = AnonymousClass0wJ.A0v();
            Iterator it = A0v.iterator();
            while (it.hasNext()) {
                C62733ac A0Q = C18250wR.A0Q(it);
                if (A0Q == null || (!A0Q.A09 && A0Q.A07 && !C05030Qo.A01(r7).A0O(A0Q.A05) && (TextUtils.isEmpty(A0Q.A03) || TextUtils.isEmpty(A0Q.A06) || TextUtils.isEmpty(A0Q.A05)))) {
                    A0v2.add(A0Q);
                } else {
                    A0y.put(A0Q.A05, A0Q);
                }
            }
        }
        if (!A0y.isEmpty()) {
            this.A00 = A0y;
        }
    }

    public final void A0G(String str) {
        C62733ac A03 = A03(this, str);
        A03.A0A = true;
        this.A00.put(str, A03);
        A0C((C11630kW) null, (C10300i6) null, (Iterable) null, false);
    }
}
