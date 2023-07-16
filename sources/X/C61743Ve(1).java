package X;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import ch.boye.httpclientandroidlib.cookie.ClientCookie;
import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.facebook.redex.IDxCSpanShape5S0200000_1_I2;
import com.google.common.collect.ImmutableList;
import com.instagram.barcelona.R;
import com.instagram.service.session.UserSession;
import com.instagram.ui.primer.ColorTint;
import com.instagram.ui.primer.IconConfig;
import com.instagram.ui.primer.InfoItem;
import com.instagram.ui.primer.PrimerBottomSheetConfig;
import com.instagram.ui.primer.TitleIcon;
import java.util.Locale;
import kotlin.Pair;

/* renamed from: X.3Ve  reason: invalid class name and case insensitive filesystem */
public final class C61743Ve {
    public static final void A00(FragmentActivity fragmentActivity, C11630kW r9, C61743Ve r10, UserSession userSession, AnonymousClass3TG r12, String str, String str2, int i) {
        AnonymousClass29W r0;
        C171799zz r02;
        boolean A1T = AnonymousClass0wJ.A1T(i, 1);
        boolean z = !C04220Ms.A0I(str2, "QP");
        C04220Ms.A0B(r12, 3);
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A01(r9, userSession), "ig_camera_clips_share_to_facebook_primer_selection"), 893);
        String str3 = C25567Do3.A02(userSession).A0K;
        if (str3 == null) {
            str3 = "";
        }
        if (AnonymousClass0wJ.A1U(A0I)) {
            if (z) {
                r02 = C171799zz.A1x;
            } else {
                r02 = C171799zz.A2v;
            }
            C18230wP.A1C(r02, A0I);
            C18240wQ.A13(D3Q.NO_CAMERA_SESSION, A0I);
            A0I.A0O(D36.NONE, "media_type");
            A0I.A0O(C23949D2u.OTHER, "media_source");
            A0I.A0O(D3K.NORMAL, "capture_type");
            A0I.A0T("camera_session_id", str3);
            C18180wK.A1C(A0I, r9);
            A0I.A0Q("is_crosspost", C18210wN.A0R(A0I, Boolean.valueOf(A1T), "allow_selection", false));
            C18190wL.A1L(A0I);
            A0I.A0T(ClientCookie.VERSION_ATTR, "1337");
            A0I.Bb4();
        }
        if (A1T) {
            r0 = AnonymousClass29W.ACCEPT;
        } else {
            r0 = AnonymousClass29W.DECLINE;
        }
        C63783iL.A0A(r0, userSession, r12);
        if (C04220Ms.A0I(str2, "PRO_HOME")) {
            fragmentActivity.finish();
        } else {
            C18180wK.A0Q(fragmentActivity, userSession).A0D(str2, 1);
        }
        if (A1T) {
            C63783iL.A08(fragmentActivity, r9, userSession, A1T);
            C25786Drz A0Q = AnonymousClass0wJ.A0Q(fragmentActivity, userSession);
            A0Q.A07 = str2;
            A0Q.A03 = r10.A03(userSession, str2, str);
            A0Q.A05();
        } else if (C04220Ms.A0I(str2, "PRO_HOME")) {
            H1T A0O = AnonymousClass0wJ.A0O(userSession);
            A0O.A0J("clips/user/set_default_share_to_fb_enabled/");
            A0O.A0R("default_share_to_fb_enabled", false);
            A0O.A0R("bonus_xar_upsell_declined_via_comms", true);
            A0O.A0O("container_module", r9.getModuleName());
            C31155GhB.A03(AnonymousClass0wJ.A0S(A0O));
        }
    }

    public final Fragment A01(FragmentActivity fragmentActivity, C11630kW r27, UserSession userSession, String str, String str2) {
        AnonymousClass2AC r18;
        C171799zz r12;
        FragmentActivity fragmentActivity2 = fragmentActivity;
        UserSession userSession2 = userSession;
        boolean A1Z = AnonymousClass0wJ.A1Z(fragmentActivity2, userSession2);
        C11630kW r1 = r27;
        C04220Ms.A0B(r1, 2);
        C23949D2u d2u = C23949D2u.OTHER;
        String str3 = str2;
        if (!C04220Ms.A0I(str3, "QP")) {
            r18 = AnonymousClass2AC.A0D;
        } else {
            r18 = AnonymousClass2AC.A0F;
        }
        AnonymousClass3TG r17 = new AnonymousClass3TG(r18, AnonymousClass2AD.A0S, d2u, (String) null, r1.getModuleName(), "1337", 0);
        boolean z = !C04220Ms.A0I(str3, "QP");
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A01(r1, userSession2), "ig_camera_clips_share_to_facebook_primer_impression"), 892);
        String str4 = C25567Do3.A02(userSession2).A0K;
        if (str4 == null) {
            str4 = "";
        }
        boolean A03 = C67343zO.A03(userSession2);
        C04620Ok r11 = C06810aP.A01;
        Long A0e = C18220wO.A0e(r11.A01(userSession2).A0n());
        if (AnonymousClass0wJ.A1U(A0I)) {
            if (z) {
                r12 = C171799zz.A1x;
            } else {
                r12 = C171799zz.A2v;
            }
            C18230wP.A1C(r12, A0I);
            C18240wQ.A13(D3Q.NO_CAMERA_SESSION, A0I);
            A0I.A0O(D36.NONE, "media_type");
            A0I.A0O(d2u, "media_source");
            A0I.A0O(D3K.NORMAL, "capture_type");
            A0I.A0T("camera_session_id", str4);
            C18180wK.A1C(A0I, r1);
            A0I.A0Q("is_crosspost", false);
            C18190wL.A1L(A0I);
            A0I.A0Q("do_not_use_is_fb_connected", Boolean.valueOf(A03));
            A0I.A0S("follower_count", A0e);
            A0I.A0T(ClientCookie.VERSION_ATTR, "1337");
            A0I.Bb4();
        }
        C63783iL.A0A(AnonymousClass29W.VIEW, userSession2, r17);
        String A0k = AnonymousClass0wJ.A0k(fragmentActivity2, 2131823667);
        IconConfig.SimpleIconConfig simpleIconConfig = new IconConfig.SimpleIconConfig(R.drawable.instagram_money_pano_outline_24);
        Integer A0e2 = C18230wP.A0e();
        InfoItem infoItem = new InfoItem(simpleIconConfig, A0e2, A0k, (String) null);
        String A0l = AnonymousClass0wJ.A0l(fragmentActivity2, C18200wM.A0k(userSession2, r11), 2131823668);
        C04220Ms.A06(A0l);
        ImmutableList of = ImmutableList.of(infoItem, C18190wL.A0Y(A0e2, A0l, R.drawable.instagram_facebook_circle_pano_outline_24), C18190wL.A0Y(A0e2, AnonymousClass0wJ.A0k(fragmentActivity2, 2131823669), R.drawable.instagram_circle_play_pano_outline_24));
        TitleIcon titleIcon = new TitleIcon((ColorTint) null, R.drawable.ig_illustrations_illo_reels_distribution);
        C04220Ms.A06(of);
        PrimerBottomSheetConfig primerBottomSheetConfig = new PrimerBottomSheetConfig(titleIcon, "recommend_on_facebook_primer", AnonymousClass0wJ.A0k(fragmentActivity2, 2131823665), AnonymousClass0wJ.A0k(fragmentActivity2, 2131823670), of, 2131823671, false, A1Z, A1Z);
        String A0k2 = AnonymousClass0wJ.A0k(fragmentActivity2, 2131823695);
        String A0l2 = AnonymousClass0wJ.A0l(fragmentActivity2, A0k2, 2131823666);
        C04220Ms.A06(A0l2);
        SpannableStringBuilder A0E = C18200wM.A0E(A0l2);
        AnonymousClass3Zw.A01(A0E, new IDxCSpanShape5S0200000_1_I2(0, userSession2, fragmentActivity2), A0k2);
        AnonymousClass3Z9 r9 = new AnonymousClass3Z9(userSession2, primerBottomSheetConfig, A0E, 476, false, false, false);
        FragmentActivity fragmentActivity3 = fragmentActivity2;
        C11630kW r92 = r1;
        UserSession userSession3 = userSession2;
        AnonymousClass3TG r122 = r17;
        r9.A01 = new C64753rd(fragmentActivity3, r92, this, userSession3, r122, str, str3);
        r9.A02 = new C64693rU(fragmentActivity3, r92, this, userSession3, r122, str3);
        return AnonymousClass3Z9.A00(r9);
    }

    public final Fragment A02(UserSession userSession, String str, String str2) {
        String str3;
        C04220Ms.A0B(userSession, 0);
        Pair A0p = C18180wK.A0p("deal_template_id", str);
        if (str2 != null) {
            Locale locale = Locale.US;
            C04220Ms.A08(locale);
            str3 = C18190wL.A0r(locale, str2);
        } else {
            str3 = null;
        }
        return C62853b1.A03(userSession, "com.instagram.incentive_platform.screens.deal_information_unit", AnonymousClass4WJ.A08(A0p, C18180wK.A0p("entry_point", str3)));
    }

    public final Fragment A03(UserSession userSession, String str, String str2) {
        String str3;
        C04220Ms.A0B(userSession, 0);
        if (str != null) {
            Locale locale = Locale.US;
            C04220Ms.A08(locale);
            str3 = C18190wL.A0r(locale, str);
        } else {
            str3 = null;
        }
        return C62853b1.A03(userSession, "com.bloks.www.ig.bonus.bonus-progress-tracking", AnonymousClass4WJ.A08(C18180wK.A0p("origin", str3), C18180wK.A0p("fbid_of_incentive", str2)));
    }

    public final Fragment A04(UserSession userSession, String str, String str2, String str3) {
        Fragment r0;
        C04220Ms.A0B(userSession, 0);
        Bundle A06 = C18180wK.A06();
        if (str != null) {
            A06.putString("ARGUMENT_ENTRY_POINT", str);
            A06.putString("ARGUMENT_ENTRY_EXTRA", str2);
        }
        if (str3 != null) {
            A06.putString("ARGUMENT_PROGRAM_TYPE", str3);
        }
        if (C63803iN.A0E(AnonymousClass0TJ.A05, userSession, 36321584939539382L)) {
            r0 = new C27051rr();
        } else {
            r0 = new C27031rp();
        }
        r0.setArguments(A06);
        return r0;
    }
}
