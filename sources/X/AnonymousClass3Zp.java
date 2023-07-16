package X;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.FragmentActivity;
import ch.boye.httpclientandroidlib.impl.auth.NTLMEngineImpl;
import com.facebook.AccessToken;
import com.instagram.barcelona.R;
import com.instagram.nux.cal.activity.CalActivity;
import com.instagram.nux.cal.model.ConnectContent;
import com.instagram.nux.cal.model.NuxConnectResponse;
import com.instagram.registration.model.RegFlowExtras;
import com.instagram.service.session.UserSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Locale;

/* renamed from: X.3Zp  reason: invalid class name */
public final class AnonymousClass3Zp {
    public static final void A01(Intent intent, C36512Rp r11, int i, int i2) {
        C27291sH r112;
        String stringExtra;
        C32165H8c A0Q;
        C63873iU r0;
        C569038z r02;
        String str;
        if (i2 == -1 && intent != null && i == intent.getIntExtra("argument_requested_code", -1)) {
            boolean booleanExtra = intent.getBooleanExtra("result_action_positive", false);
            String stringExtra2 = intent.getStringExtra("argument_access_token");
            stringExtra2.getClass();
            Bundle bundleExtra = intent.getBundleExtra("argument_client_extras_bundle");
            bundleExtra.getClass();
            boolean z = r11 instanceof C27321sK;
            if (booleanExtra) {
                if (z) {
                    C27321sK r113 = (C27321sK) r11;
                    Parcelable parcelable = bundleExtra.getParcelable("extra_cal_nux_content");
                    if (parcelable != null) {
                        String str2 = ((ConnectContent) parcelable).A04;
                        if (str2 != null) {
                            AnonymousClass1cQ r3 = r113.A01;
                            C10300i6 A0U = AnonymousClass0wJ.A0U(r3.A06);
                            Intent intent2 = r113.A00;
                            String str3 = null;
                            if (intent2 != null) {
                                str = intent2.getStringExtra("argument_selected_age_account_id");
                                str3 = intent2.getStringExtra("argument_selected_age_account_type");
                            } else {
                                str = null;
                            }
                            H1T A0N = AnonymousClass0wJ.A0N(A0U);
                            A0N.A0J("fb/nux_fb_connect/");
                            A0N.A0O("access_token", stringExtra2);
                            A0N.A0O("ap", str2);
                            A0N.A0O("selected_age_account_id", str);
                            A0N.A0O("selected_age_account_type", str3);
                            A0N.A0P("linking_entry_point", (String) null);
                            C18240wQ.A1A(A0N, NuxConnectResponse.class, C60003Ng.class);
                            A0Q = C18190wL.A0Q(A0N);
                            r0 = new AnonymousClass1hD(r3);
                        } else {
                            return;
                        }
                    } else {
                        throw AnonymousClass0wJ.A0b();
                    }
                } else if (r11 instanceof C27301sI) {
                    C23211cm r4 = ((C27301sI) r11).A00.A00;
                    RegFlowExtras regFlowExtras = r4.A04;
                    regFlowExtras.A0x = true;
                    FragmentActivity activity = r4.getActivity();
                    if (activity != null) {
                        regFlowExtras.A0V = AnonymousClass2TT.A00(AnonymousClass006.A0j);
                        C25786Drz A0Q2 = C18180wK.A0Q(activity, r4.A08);
                        RegFlowExtras regFlowExtras2 = r4.A04;
                        Bundle A06 = C18180wK.A06();
                        A06.putParcelable("RegFlowExtras.EXTRA_KEY", regFlowExtras2);
                        C18180wK.A0x(A06, new AnonymousClass1dA(), A0Q2);
                        return;
                    }
                    return;
                } else if (r11 instanceof C27291sH) {
                    r112 = (C27291sH) r11;
                    if (!(bundleExtra.getString("extra_cal_fb_user_id") == null || bundleExtra.getStringArrayList("extra_cal_usernames") == null || bundleExtra.getStringArray("extra_cal_usernames_with_metadata") == null)) {
                        if (!C63173fJ.A05(AnonymousClass0TJ.A05, 18310802792522733L)) {
                            C67363zQ.A0A(new AccessToken(stringExtra2, C18190wL.A0j(bundleExtra, "extra_cal_fb_user_id")), r112.A00.A08, true);
                        }
                        C24751jz r7 = r112.A00;
                        ArrayList<String> stringArrayList = bundleExtra.getStringArrayList("extra_cal_usernames");
                        stringArrayList.getClass();
                        String[] stringArray = bundleExtra.getStringArray("extra_cal_usernames_with_metadata");
                        stringArray.getClass();
                        ArrayList A0k = C18240wQ.A0k(r2);
                        for (String A0L : stringArray) {
                            try {
                                r02 = AnonymousClass2TX.parseFromJson(C18180wK.A0L(A0L));
                            } catch (IOException unused) {
                                r02 = null;
                            }
                            A0k.add(r02);
                        }
                        C24751jz.A07(r7, bundleExtra.getString("extra_cal_tos_version"), stringExtra2, stringArrayList, A0k, true, bundleExtra.getBoolean("extra_cal_force_signup_with_fb_after_cp_claiming"));
                        return;
                    }
                } else {
                    C27311sJ r114 = (C27311sJ) r11;
                    String str4 = ((ConnectContent) C18240wQ.A0D(bundleExtra, "extra_cal_nux_content")).A04;
                    if (str4 != null) {
                        AnonymousClass1cR r42 = r114.A01.A00;
                        UserSession userSession = r42.A06;
                        Intent intent3 = r114.A00;
                        String str5 = null;
                        if (intent3 == null) {
                            stringExtra = null;
                        } else {
                            stringExtra = intent3.getStringExtra("argument_selected_age_account_id");
                            str5 = intent3.getStringExtra("argument_selected_age_account_type");
                        }
                        String upperCase = AnonymousClass264.A0S.A00().toUpperCase(Locale.US);
                        H1T A0N2 = AnonymousClass0wJ.A0N(userSession);
                        A0N2.A0J("fb/nux_fb_connect/");
                        A0N2.A0O("access_token", stringExtra2);
                        A0N2.A0O("ap", str4);
                        A0N2.A0O("selected_age_account_id", stringExtra);
                        A0N2.A0O("selected_age_account_type", str5);
                        A0N2.A0P("linking_entry_point", upperCase);
                        C18240wQ.A1A(A0N2, NuxConnectResponse.class, C60003Ng.class);
                        A0Q = C18190wL.A0Q(A0N2);
                        r0 = new AnonymousClass1i2(r42);
                    } else {
                        return;
                    }
                }
                A0Q.A00 = r0;
                C31155GhB.A03(A0Q);
                return;
            } else if (z) {
                AnonymousClass1cQ.A01(((C27321sK) r11).A01);
                return;
            } else if (r11 instanceof C27301sI) {
                C23211cm.A02(((C27301sI) r11).A00.A00);
                return;
            } else if (r11 instanceof C27291sH) {
                r112 = (C27291sH) r11;
            } else {
                return;
            }
            C24751jz.A03(r112.A00);
        }
    }

    public static final void A00(Activity activity, C10300i6 r4, C82774qF r5, C306222g r6, ConnectContent connectContent, String str, int i) {
        Intent A04 = C18250wR.A04(activity, CalActivity.class);
        A04.putExtra("argument_flow", "NUX_FLOW".toLowerCase());
        A04.putExtra("argument_requested_code", i);
        A04.putExtra("argument_access_token", str);
        A04.putExtra("argument_content", connectContent);
        A04.putExtra("argument_entry_point", r6);
        A04.putExtra("IgSessionManager.SESSION_TOKEN_KEY", r4.getToken());
        Bundle A06 = C18180wK.A06();
        r5.CwK(A06);
        A04.putExtra("argument_client_extras_bundle", A06);
        A04.setFlags(NTLMEngineImpl.FLAG_NEGOTIATE_128);
        C10650ih.A08(activity, A04, i);
        activity.overridePendingTransition(R.anim.signup_content_slide_in, R.anim.signup_content_fade_out);
    }

    public static final void A02(UserSession userSession, boolean z) {
        H1T A0N = AnonymousClass0wJ.A0N(userSession);
        A0N.A0J("fb/fb_reg_flag/");
        C18250wR.A17(A0N, userSession.getUserId());
        A0N.A0R("enabled", z);
        C18240wQ.A1A(A0N, C85814vo.class, AnonymousClass3Za.class);
        C32165H8c A0Q = C18190wL.A0Q(A0N);
        A0Q.A00 = new AnonymousClass1h6();
        C31155GhB.A03(A0Q);
    }
}
