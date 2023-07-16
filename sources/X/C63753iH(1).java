package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.facebook.redex.IDxCListenerShape222S0200000_1_I2;
import com.instagram.business.promote.model.PromoteLaunchOrigin;
import com.instagram.direct.stella.StellaIpcDirectMessagingServiceClient;
import com.instagram.service.session.UserSession;
import com.instagram.settings.common.PaymentOptionsFragment;
import com.instagram.user.model.User;
import com.instagram.util.fragment.IgFragmentFactoryImpl;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.3iH  reason: invalid class name and case insensitive filesystem */
public final class C63753iH {
    public static final C16240si A00 = new C36890Jge("IgSecureUriParser").A01;

    public static void A09(Bundle bundle, FragmentActivity fragmentActivity, C10300i6 r8) {
        Uri A002;
        if (!(!bundle.containsKey("original_url") || bundle.getString("original_url") == null || (A002 = C15430rJ.A00(A00, bundle.getString("original_url"), true)) == null)) {
            A002.getQueryParameter("utm_source");
            C50382su.A00(A002);
        }
        if (r8 == null || !(r8 instanceof UserSession)) {
            AnonymousClass3YR.A00(fragmentActivity, bundle, r8);
            return;
        }
        UserSession A02 = C05030Qo.A02(r8);
        if (bundle.containsKey("InstagramUrlLaunchConstants.EXTRA_AUTO_LAUNCH_REEL_PARAMS")) {
            bundle.getParcelable("InstagramUrlLaunchConstants.EXTRA_AUTO_LAUNCH_REEL_PARAMS");
        }
        bundle.getString("InstagramUrlLaunchConstants.EXTRA_STARTING_TAB");
        bundle.getBoolean("InstagramUrlLaunchConstants.EXTRA_USER_OPEN_GROUP_REQUESTS", false);
        bundle.getBoolean("InstagramUrlLaunchConstants.EXTRA_USER_OPEN_GROUP_PROFILE_INVITE", false);
        bundle.getBoolean("InstagramUrlLaunchConstants.EXTRA_USER_OPEN_CREATION_SHEET", false);
        if (bundle.containsKey("InstagramUrlLaunchConstants.EXTRA_USER_NAME")) {
            C25586DoM.A01(A02, bundle.getString("InstagramUrlLaunchConstants.EXTRA_USER_NAME"), "deep_link", "deep_link_util");
        } else if (bundle.containsKey("InstagramUrlLaunchConstants.EXTRA_USER_ID")) {
            C25586DoM.A02(A02, bundle.getString("InstagramUrlLaunchConstants.EXTRA_USER_ID"), "deep_link", "deep_link_util");
        } else {
            C25586DoM.A00(A02, "deep_link", "deep_link_util");
            C60113Ns.A00();
            throw null;
        }
        Intent intent = (Intent) bundle.getParcelable("extra_source_intent");
        if (C32362Bn.A00(fragmentActivity, intent) && C63803iN.A0E(AnonymousClass0TJ.A05, A02, 36327954376042732L)) {
            C32362Bn.A00(fragmentActivity, intent);
            if (intent != null) {
                C40294Lbx lbx = C40294Lbx.A01;
                C15740ro r1 = new C15740ro();
                r1.A01 = lbx.A00();
                if (r1.A00().A01(fragmentActivity, intent, (C16240si) null) && intent.hasExtra("CrossAppFollowUtils.EXTRA_AUTO_FOLLOW_ATTRIBUTION_POST_ID")) {
                    intent.getStringExtra("CrossAppFollowUtils.EXTRA_AUTO_FOLLOW_ATTRIBUTION_POST_ID");
                }
            }
        }
        C60113Ns.A00();
        throw null;
    }

    public static Uri A00(Bundle bundle) {
        if (!bundle.containsKey("destination_id") || !bundle.containsKey("encoded_query")) {
            return null;
        }
        Uri.Builder encodedQuery = C18220wO.A0E(AnonymousClass00U.A0L("ig://", bundle.getString("destination_id"))).encodedQuery(bundle.getString("encoded_query"));
        encodedQuery.appendQueryParameter("dummy_param_random_uuid", C18180wK.A0e());
        return encodedQuery.build();
    }

    public static Map A01() {
        K9R k9r = K9R.A00;
        IVw iVw = new IVw(k9r);
        iVw.A04("entrypoint", "ad_topics_settings_phase_1");
        iVw.A04("node_identifier", "ad_topics");
        return new AnonymousClass4W0(C18180wK.A0M(k9r, iVw));
    }

    public static void A03(Activity activity, C10300i6 r2, C171209wF r3, String str, String str2) {
        if (r2 instanceof UserSession) {
            C37350Jpy A0Y = C18230wP.A0Y(activity, C05030Qo.A02(r2), r3, str);
            A0Y.A07(str2);
            A0Y.A04();
        }
    }

    public static void A05(Uri uri, C10300i6 r4, String str) {
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A01(new C683643m(str), r4), "handling_media_url_with_username"), 709);
        A0I.A0T("url", uri.toString());
        A0I.Bb4();
    }

    public static void A06(Bundle bundle, FragmentActivity fragmentActivity, C10300i6 r13) {
        String str;
        String string = bundle.getString("entry_point");
        String string2 = bundle.getString("dummy_param_random_uuid");
        boolean z = bundle.getBoolean("should_show_promotion_content");
        String string3 = bundle.getString("media_id");
        if (TextUtils.isEmpty(string)) {
            string = "deep_link";
        }
        C18190wL.A13(C62883b4.A02().A08(string, string3, z).requireArguments(), C05030Qo.A02(r13).token);
        if (string2 == null) {
            Uri.Builder appendQueryParameter = C18220wO.A0D().authority("pro_inspiration").appendQueryParameter("entry_point", string);
            if (z) {
                str = "true";
            } else {
                str = "false";
            }
            Uri.Builder appendQueryParameter2 = appendQueryParameter.appendQueryParameter("should_show_promotion_content", str);
            if (string3 != null) {
                appendQueryParameter2.appendQueryParameter("media_id", string3);
            }
            appendQueryParameter2.appendQueryParameter("dummy_param_random_uuid", C18180wK.A0e());
            C10650ih.A02(fragmentActivity, C62333Yi.A00(fragmentActivity).setData(appendQueryParameter2.build()));
        }
        fragmentActivity.finish();
    }

    public static void A07(Bundle bundle, FragmentActivity fragmentActivity, C10300i6 r5) {
        if (r5 instanceof UserSession) {
            IgFragmentFactoryImpl.A00();
            C156909Pv r2 = new C156909Pv();
            C18180wK.A0w(bundle, r5);
            r2.setArguments(bundle);
            boolean z = bundle.getBoolean("InstagramUrlLaunchConstants.EXTRA_SHOULD_INCLUDE_BACK_STACK");
            C25786Drz A0Q = C18180wK.A0Q(fragmentActivity, r5);
            A0Q.A03 = r2;
            if (!z) {
                A0Q.A0C = false;
            }
            A0Q.A05();
            return;
        }
        AnonymousClass3YR.A00(fragmentActivity, bundle, r5);
    }

    public static void A08(Bundle bundle, FragmentActivity fragmentActivity, C10300i6 r17) {
        int i;
        String string = bundle.getString("media_id");
        boolean z = bundle.getBoolean("is_client_spec_override");
        UserSession A02 = C05030Qo.A02(r17);
        FragmentActivity fragmentActivity2 = fragmentActivity;
        if (z) {
            if (string != null) {
                String string2 = bundle.getString("objective");
                String string3 = bundle.getString("duration");
                String string4 = bundle.getString("budget");
                String string5 = bundle.getString("entry_point");
                if (TextUtils.isEmpty(string5)) {
                    string5 = "DEEP_LINK";
                }
                int i2 = 0;
                if (string4 != null) {
                    i = Integer.parseInt(string4);
                } else {
                    i = 0;
                }
                if (string3 != null) {
                    i2 = Integer.parseInt(string3);
                }
                C37047JjS A002 = AnonymousClass2K0.A00();
                C36947Jhb A003 = AnonymousClass2K1.A00().A00(fragmentActivity2, A02, string, string5);
                PromoteLaunchOrigin promoteLaunchOrigin = PromoteLaunchOrigin.CLIENT_SPEC_OVERRIDE;
                C04220Ms.A0B(promoteLaunchOrigin, 0);
                A003.A04 = promoteLaunchOrigin;
                A003.A0F = string2;
                A003.A00 = i;
                A003.A01 = i2;
                A002.A05(A003);
                return;
            }
        } else if (string != null) {
            String string6 = bundle.getString("coupon_offer_id");
            String string7 = bundle.getString("objective");
            boolean z2 = bundle.getBoolean("is_cta_ctwa_aymt");
            boolean z3 = bundle.getBoolean("is_ctwa_coupon_aymt");
            bundle.getBoolean("is_cta_lead_ads_aymt");
            String string8 = bundle.getString("aymt_channel");
            String string9 = bundle.getString("entry_point");
            if (TextUtils.isEmpty(string9)) {
                string9 = "DEEP_LINK";
            }
            Uri.Builder authority = C18220wO.A0D().authority("promote");
            authority.appendQueryParameter("entry_point", string9);
            authority.appendQueryParameter("media_id", string);
            if (string6 != null) {
                authority.appendQueryParameter("coupon_offer_id", string6);
            }
            if (string7 != null) {
                authority.appendQueryParameter("objective", string7);
            }
            String str = "true";
            String str2 = "false";
            if (z2) {
                str2 = str;
            }
            authority.appendQueryParameter("is_cta_ctwa_aymt", str2);
            if (!z3) {
                str = "false";
            }
            authority.appendQueryParameter("is_ctwa_coupon_aymt", str);
            if (string8 != null) {
                authority.appendQueryParameter("aymt_channel", string8);
            }
            authority.appendQueryParameter("dummy_param_random_uuid", C18180wK.A0e());
            C10650ih.A02(fragmentActivity2, C62333Yi.A00(fragmentActivity2).setData(authority.build()));
            return;
        }
        String string10 = bundle.getString("coupon_offer_id");
        boolean z4 = bundle.getBoolean(I17.A00(273), false);
        bundle.getBoolean("is_ctwa_coupon_aymt", false);
        String string11 = bundle.getString("entry_point");
        if (TextUtils.isEmpty(string11)) {
            string11 = "DEEP_LINK";
        }
        if (!bundle.getBoolean("has_relaunched_from_main_activity", false)) {
            AnonymousClass2K0.A00().A04(fragmentActivity2, A02, string11, string10, z4);
        } else {
            fragmentActivity2.finish();
        }
    }

    public static void A0A(Bundle bundle, FragmentActivity fragmentActivity, C10300i6 r5, boolean z, boolean z2) {
        Fragment A002;
        C115516vI A003 = C111986om.A01.A00();
        if (z2) {
            A002 = new PaymentOptionsFragment();
            A002.setArguments(bundle);
        } else {
            if (bundle.getString("referrer") == null) {
                bundle.putString("referrer", "deeplink");
            }
            A002 = A003.A00(bundle);
        }
        C25786Drz A0Q = C18180wK.A0Q(fragmentActivity, r5);
        A0Q.A03 = A002;
        if (z) {
            A0Q.A0C = false;
        }
        A0Q.A05();
    }

    public static void A02(Activity activity, Bundle bundle) {
        Intent A002 = C62333Yi.A00(activity);
        Uri A003 = A00(bundle);
        if (A003 != null) {
            A002.setData(A003);
        }
        C10650ih.A02(activity, A002);
        activity.finish();
    }

    public static void A04(Context context, String str) {
        Intent A04 = C62333Yi.A01().A04(context, C15430rJ.A01(str));
        A04.putExtra("com.instagram.url.extra.SHOULD_RETURN_TO_SENDING_ACTIVITY", true);
        C10650ih.A02(context, A04);
    }

    public static void A0B(FragmentActivity fragmentActivity, C10300i6 r5, HashMap hashMap) {
        User A0Y = AnonymousClass0wJ.A0Y(C05030Qo.A02(r5));
        if (C59623Lo.A00(A0Y) || C59623Lo.A01(A0Y)) {
            C04220Ms.A0B(r5, 0);
            AnonymousClass01V.A0p.markerStart(962537714);
            AnonymousClass0wJ.A0F().postDelayed(new AnonymousClass4OO(r5), StellaIpcDirectMessagingServiceClient.KEEP_CONNECTION_ALIVE_MS);
            C130667qT A0T = C18220wO.A0T(fragmentActivity, new AnonymousClass43E(), r5);
            AnonymousClass4A9 A002 = C63263h8.A00(r5, "com.instagram.pro_home.action", hashMap);
            A002.A00 = new AnonymousClass1eI(A0T, "ProfessionalDashboard");
            C31155GhB.A03(A002);
            C12560m7 supportFragmentManager = fragmentActivity.getSupportFragmentManager();
            supportFragmentManager.A0v(new IDxCListenerShape222S0200000_1_I2(fragmentActivity, supportFragmentManager, 2));
            return;
        }
        fragmentActivity.finish();
    }
}
