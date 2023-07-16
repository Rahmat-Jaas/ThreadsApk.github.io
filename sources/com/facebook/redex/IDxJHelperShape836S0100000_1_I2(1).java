package com.facebook.redex;

import X.AnonymousClass2T5;
import X.AnonymousClass2TU;
import X.AnonymousClass3V3;
import X.AnonymousClass3WU;
import X.AnonymousClass3Y6;
import X.C18180wK;
import X.C18230wP;
import X.C39678Kxx;
import X.C569038z;
import X.C58603Gk;
import X.C62303Ye;
import X.C63383hO;
import X.MMp;
import com.instagram.debug.devoptions.FXPFAccessLibraryDebugFragment;
import com.instagram.phonenumber.model.CountryCodeData;
import com.instagram.registration.model.RegFlowExtras;
import com.instagram.registration.model.UserBirthDate;
import java.io.StringWriter;
import java.util.Iterator;

public class IDxJHelperShape836S0100000_1_I2 implements C39678Kxx {
    public Object A00;
    public final int A01;

    public IDxJHelperShape836S0100000_1_I2(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final /* bridge */ /* synthetic */ Object CW1(String str) {
        if (this.A01 != 0) {
            return AnonymousClass2TU.parseFromJson(C18180wK.A0L(str));
        }
        return AnonymousClass2T5.parseFromJson(C18180wK.A0L(str));
    }

    public final /* bridge */ /* synthetic */ String ChJ(Object obj) {
        if (this.A01 != 0) {
            RegFlowExtras regFlowExtras = (RegFlowExtras) obj;
            StringWriter A0d = C18230wP.A0d();
            MMp A0K = C18180wK.A0K(A0d);
            String str = regFlowExtras.A07;
            if (str != null) {
                A0K.A0d("device_verification_result", str);
            }
            String str2 = regFlowExtras.A06;
            if (str2 != null) {
                A0K.A0d("device_verification_nonce", str2);
            }
            if (regFlowExtras.A01 != null) {
                A0K.A0U("country_code_data");
                CountryCodeData countryCodeData = regFlowExtras.A01;
                A0K.A0J();
                String str3 = countryCodeData.A01;
                if (str3 != null) {
                    A0K.A0d("country_code", str3);
                }
                String str4 = countryCodeData.A02;
                if (str4 != null) {
                    A0K.A0d("display_string", str4);
                }
                String str5 = countryCodeData.A00;
                if (str5 != null) {
                    A0K.A0d("country", str5);
                }
                A0K.A0G();
            }
            String str6 = regFlowExtras.A0R;
            if (str6 != null) {
                A0K.A0d("phone_number_without_country_code", str6);
            }
            String str7 = regFlowExtras.A0Q;
            if (str7 != null) {
                A0K.A0d("phone_number_with_country_code", str7);
            }
            String str8 = regFlowExtras.A08;
            if (str8 != null) {
                A0K.A0d("email", str8);
            }
            String str9 = regFlowExtras.A0O;
            if (str9 != null) {
                A0K.A0d(FXPFAccessLibraryDebugFragment.NAME, str9);
            }
            String str10 = regFlowExtras.A0Z;
            if (str10 != null) {
                A0K.A0d(C63383hO.A00(), str10);
            }
            String str11 = regFlowExtras.A0W;
            if (str11 != null) {
                A0K.A0d("suggested_username", str11);
            }
            String str12 = regFlowExtras.A0P;
            if (str12 != null) {
                A0K.A0d("password", str12);
            }
            A0K.A0e("skip_password", regFlowExtras.A10);
            String str13 = regFlowExtras.A05;
            if (str13 != null) {
                A0K.A0d("confirmation_code", str13);
            }
            String str14 = regFlowExtras.A0B;
            if (str14 != null) {
                A0K.A0d("force_sign_up_code", str14);
            }
            String str15 = regFlowExtras.A0D;
            if (str15 != null) {
                A0K.A0d("google_id_token", str15);
            }
            if (regFlowExtras.A0e != null) {
                A0K.A0U("username_suggestions");
                A0K.A0I();
                Iterator it = regFlowExtras.A0e.iterator();
                while (it.hasNext()) {
                    String A0k = C18180wK.A0k(it);
                    if (A0k != null) {
                        A0K.A0Y(A0k);
                    }
                }
                A0K.A0F();
            }
            if (regFlowExtras.A0f != null) {
                A0K.A0U("username_suggestions_with_metadata");
                A0K.A0I();
                for (C569038z r4 : regFlowExtras.A0f) {
                    if (r4 != null) {
                        A0K.A0J();
                        String str16 = r4.A01;
                        if (str16 != null) {
                            A0K.A0d(C63383hO.A00(), str16);
                        }
                        String str17 = r4.A00;
                        if (str17 != null) {
                            A0K.A0d("prototype", str17);
                        }
                        A0K.A0G();
                    }
                }
                A0K.A0F();
            }
            if (regFlowExtras.A02 != null) {
                A0K.A0U("solution");
                C58603Gk r1 = regFlowExtras.A02;
                A0K.A0J();
                if (r1.A00 != null) {
                    A0K.A0U("solutions");
                    A0K.A0I();
                    for (AnonymousClass3V3 r12 : r1.A00) {
                        if (r12 != null) {
                            A0K.A0J();
                            if (r12.A00 != null) {
                                A0K.A0U("sublist");
                                A0K.A0I();
                                for (Number number : r12.A00) {
                                    if (number != null) {
                                        A0K.A0N(number.intValue());
                                    }
                                }
                                A0K.A0F();
                            }
                            A0K.A0G();
                        }
                    }
                    A0K.A0F();
                }
                A0K.A0G();
            }
            String str18 = regFlowExtras.A0S;
            if (str18 != null) {
                A0K.A0d("registration_flow", str18);
            }
            String str19 = regFlowExtras.A0N;
            if (str19 != null) {
                A0K.A0d("last_registration_step", str19);
            }
            String str20 = regFlowExtras.A0V;
            if (str20 != null) {
                A0K.A0d("signup_type", str20);
            }
            String str21 = regFlowExtras.A04;
            if (str21 != null) {
                A0K.A0d("actor_id", str21);
            }
            String str22 = regFlowExtras.A0T;
            if (str22 != null) {
                A0K.A0d("sac_intent", str22);
            }
            String str23 = regFlowExtras.A0U;
            if (str23 != null) {
                A0K.A0d("sac_upsell_surface", str23);
            }
            A0K.A0e("skip_email", regFlowExtras.A0z);
            A0K.A0e("allow_contact_sync", regFlowExtras.A0h);
            A0K.A0e("has_sms_consent", regFlowExtras.A0p);
            A0K.A0e("gdpr_required", regFlowExtras.A0m);
            String str24 = regFlowExtras.A0C;
            if (str24 != null) {
                A0K.A0d("gdpr_s", str24);
            }
            String str25 = regFlowExtras.A0X;
            if (str25 != null) {
                A0K.A0d("tos_version", str25);
            }
            A0K.A0e("tos_acceptance_not_required", regFlowExtras.A11);
            A0K.A0c("cache_time", regFlowExtras.A00);
            A0K.A0e("force_create_account", regFlowExtras.A0k);
            A0K.A0e("requested_username_change", regFlowExtras.A0w);
            String str26 = regFlowExtras.A0Y;
            if (str26 != null) {
                A0K.A0d("user_id", str26);
            }
            A0K.A0e("one_tap_opt_in", regFlowExtras.A0v);
            A0K.A0e("age_required", regFlowExtras.A0g);
            A0K.A0e("is_eligible_to_register", regFlowExtras.A0r);
            A0K.A0e("is_supervised_user", regFlowExtras.A0u);
            if (regFlowExtras.A03 != null) {
                A0K.A0U("user_birth_date");
                UserBirthDate userBirthDate = regFlowExtras.A03;
                A0K.A0J();
                A0K.A0b("birth_year", userBirthDate.A02);
                A0K.A0b("birth_month", userBirthDate.A01);
                A0K.A0b("birth_day", userBirthDate.A00);
                A0K.A0G();
            }
            A0K.A0e("existing_account_dialog_shown", regFlowExtras.A0j);
            A0K.A0e("is_simple_sac_enabled", regFlowExtras.A0t);
            String str27 = regFlowExtras.A0J;
            if (str27 != null) {
                A0K.A0d("last_logged_in_user_id", str27);
            }
            String str28 = regFlowExtras.A0M;
            if (str28 != null) {
                A0K.A0d("last_logged_in_username", str28);
            }
            String str29 = regFlowExtras.A09;
            if (str29 != null) {
                A0K.A0d("fb_access_token", str29);
            }
            A0K.A0e("is_cal_flow", regFlowExtras.A0q);
            A0K.A0e("force_signup_with_fb_after_cp_claiming", regFlowExtras.A0l);
            String str30 = regFlowExtras.A0b;
            if (str30 != null) {
                A0K.A0d("vpc_link", str30);
            }
            String str31 = regFlowExtras.A0d;
            if (str31 != null) {
                A0K.A0d("vpc_token", str31);
            }
            String str32 = regFlowExtras.A0c;
            if (str32 != null) {
                A0K.A0d("vpc_status", str32);
            }
            String str33 = regFlowExtras.A0a;
            if (str33 != null) {
                A0K.A0d("vpc_invite_id", str33);
            }
            String str34 = regFlowExtras.A0H;
            if (str34 != null) {
                A0K.A0d("last_logged_in_user_auth_header", str34);
            }
            String str35 = regFlowExtras.A0G;
            if (str35 != null) {
                A0K.A0d("last_logged_in_user_access_token", str35);
            }
            A0K.A0e("sac_cal_flow", regFlowExtras.A0s);
            A0K.A0e("sac_cal_user_consent_accepted", regFlowExtras.A0x);
            String str36 = regFlowExtras.A0K;
            if (str36 != null) {
                A0K.A0d("last_logged_in_user_phone_number_with_country_code", str36);
            }
            String str37 = regFlowExtras.A0L;
            if (str37 != null) {
                A0K.A0d("last_logged_in_user_phone_number_without_country_code", str37);
            }
            String str38 = regFlowExtras.A0I;
            if (str38 != null) {
                A0K.A0d("last_logged_in_user_email", str38);
            }
            A0K.A0e("should_link_to_main", regFlowExtras.A0y);
            A0K.A0e("convert_to_group", regFlowExtras.A0i);
            String str39 = regFlowExtras.A0E;
            if (str39 != null) {
                A0K.A0d("group_biography", str39);
            }
            String str40 = regFlowExtras.A0F;
            if (str40 != null) {
                A0K.A0d("group_external_url", str40);
            }
            A0K.A0e("group_should_be_private", regFlowExtras.A0n);
            A0K.A0e("group_post_approvals_enabled", regFlowExtras.A0o);
            return C18180wK.A0h(A0K, A0d);
        }
        AnonymousClass3Y6 r7 = (AnonymousClass3Y6) obj;
        StringWriter A0d2 = C18230wP.A0d();
        MMp A0K2 = C18180wK.A0K(A0d2);
        if (r7.A00 != null) {
            A0K2.A0U("states");
            A0K2.A0I();
            for (C62303Ye r0 : r7.A00) {
                if (r0 != null) {
                    AnonymousClass3WU.A00(A0K2, r0);
                }
            }
            A0K2.A0F();
        }
        return C18180wK.A0h(A0K2, A0d2);
    }
}
