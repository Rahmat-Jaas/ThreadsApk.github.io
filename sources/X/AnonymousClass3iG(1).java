package X;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import ch.boye.httpclientandroidlib.client.utils.URLEncodedUtils;
import ch.boye.httpclientandroidlib.protocol.HTTP;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.model.hashtag.Hashtag;
import com.instagram.request.IDxDCallbackShape1S1500000_1_I2;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;
import com.instagram.util.share.ShareUtil$ChosenComponentReceiver;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Locale;

/* renamed from: X.3iG  reason: invalid class name */
public final class AnonymousClass3iG {
    public static void A01(Activity activity, Bundle bundle, C11630kW r8, BKU bku, UserSession userSession, String str) {
        HashMap A0y = AnonymousClass0wJ.A0y();
        A0y.put("url", str);
        A0y.put("media_id", bku.A0f.A4Y);
        A0y.put("media_owner_id", bku.A2Z(userSession).getId());
        A0y.put("option", bku.Aup().name());
        A03(activity, bundle, r8, userSession, "share_to_system_sheet", A0y);
    }

    public static void A02(Activity activity, Bundle bundle, C11630kW r8, UserSession userSession, User user, String str, String str2) {
        HashMap A0y = AnonymousClass0wJ.A0y();
        A0y.put("url", str);
        A0y.put(TraceFieldType.BroadcastId, str2);
        A0y.put("reel_id", str2);
        A0C(user, "item_id", str2, A0y);
        A03(activity, bundle, r8, userSession, "share_to_system_sheet", A0y);
    }

    public static void A03(Activity activity, Bundle bundle, C11630kW r7, UserSession userSession, String str, HashMap hashMap) {
        Intent A05 = C18250wR.A05("android.intent.action.SEND");
        A05.setType(HTTP.PLAIN_TEXT_TYPE);
        if (!bundle.isEmpty()) {
            A05.putExtras(bundle);
        }
        String moduleName = r7.getModuleName();
        Intent A04 = C18250wR.A04(activity, ShareUtil$ChosenComponentReceiver.class);
        A04.putExtra("log_event_name", "share_to_system_sheet_success");
        A04.putExtra("log_event_extras", hashMap);
        A04.putExtra("log_event_module_name", moduleName);
        C18230wP.A12(A04, userSession);
        if (C10650ih.A0B(activity, Intent.createChooser(A05, (CharSequence) null, C18210wN.A0I(activity, A04).A02(activity, 0, 1342177280).getIntentSender()))) {
            C15730rn A0T = C18230wP.A0T(str);
            A0T.A0D("type", "link");
            C18180wK.A1K(A0T, userSession);
            return;
        }
        C10450iM.A03(str, "Can't find intent handler for content");
    }

    public static void A04(Activity activity, C12560m7 r14, AnonymousClass06E r15, McB mcB, C11630kW r17, Hashtag hashtag, UserSession userSession, Integer num, String str) {
        Hashtag hashtag2 = hashtag;
        C11630kW r8 = r17;
        UserSession userSession2 = userSession;
        String str2 = str;
        C63673i6.A04(r8, userSession2, hashtag2.A0B, "hashtag_page_overflow_menu", str2);
        IDxDCallbackShape1S1500000_1_I2 iDxDCallbackShape1S1500000_1_I2 = new IDxDCallbackShape1S1500000_1_I2(r14, activity, mcB, r8, hashtag2, userSession2, str2, 0);
        String str3 = hashtag2.A0C;
        String moduleName = r8.getModuleName();
        C04220Ms.A0B(userSession2, 0);
        H1T A0P = AnonymousClass0wJ.A0P(userSession2);
        String A0j = C18180wK.A0j("third_party_sharing/%s/get_hashtag_to_share_url/", new Object[]{Uri.encode(str3)});
        C04220Ms.A06(A0j);
        AnonymousClass3OR.A01(A0P, userSession2, num, A0j, moduleName);
        C32165H8c A0T = AnonymousClass0wJ.A0T(A0P, AnonymousClass1SX.class, AnonymousClass3OH.class);
        A0T.A00 = iDxDCallbackShape1S1500000_1_I2;
        C31155GhB.A01(activity, r15, A0T);
    }

    public static void A05(Activity activity, C12560m7 r16, AnonymousClass06E r17, McB mcB, C11630kW r19, UserSession userSession, User user, String str) {
        C32165H8c A00;
        User user2 = user;
        C11630kW r7 = r19;
        UserSession userSession2 = userSession;
        String str2 = str;
        C63673i6.A04(r7, userSession2, user2.getId(), "profile_action_sheet", str2);
        IDxDCallbackShape1S1500000_1_I2 iDxDCallbackShape1S1500000_1_I2 = new IDxDCallbackShape1S1500000_1_I2(r16, activity, mcB, r7, user2, userSession2, str2, 2);
        if (userSession == null || (A00 = C36942Tg.A00(userSession2, AnonymousClass006.A00, user2.BK7(), r7.getModuleName())) == null) {
            Throwable th = new Throwable(AnonymousClass00U.A0L("username contains space: ", user2.BK7()));
            C09830gl.A01(activity, String.format((Locale) null, "https://www.instagram.com/%s/", new Object[]{user2.BK7()}), (String) null);
            C63813iO.A00(activity, 2131829646);
            C63673i6.A09(r7, userSession2, user2.getId(), "profile_action_sheet", str2, th);
            return;
        }
        A00.A00 = iDxDCallbackShape1S1500000_1_I2;
        C31155GhB.A01(activity, r17, A00);
    }

    public static void A06(Activity activity, C12560m7 r14, AnonymousClass06E r15, C21839C2o c2o, BKH bkh, UserSession userSession, String str) {
        BKH bkh2 = bkh;
        User user = bkh2.A0S;
        BKU bku = bkh2.A0M;
        if (user != null && bku != null) {
            C21839C2o c2o2 = c2o;
            UserSession userSession2 = userSession;
            IDxDCallbackShape1S1500000_1_I2 iDxDCallbackShape1S1500000_1_I2 = new IDxDCallbackShape1S1500000_1_I2(r14, activity, bkh2, userSession2, user, c2o2, str, 1);
            C32165H8c A03 = C63413hR.A03(userSession2, AnonymousClass006.A0Y, user.BK7(), bku.A0f.A4Y, c2o2.getModuleName());
            A03.A00 = iDxDCallbackShape1S1500000_1_I2;
            C31155GhB.A01(activity, r15, A03);
        }
    }

    public static void A07(Activity activity, C12560m7 r20, AnonymousClass06E r21, C21839C2o c2o, UserSession userSession, User user, String str, String str2, String str3) {
        User user2 = user;
        String id = user2.getId();
        Integer num = AnonymousClass006.A0Y;
        Activity activity2 = activity;
        C21839C2o c2o2 = c2o;
        UserSession userSession2 = userSession;
        String str4 = str;
        String str5 = str2;
        C12560m7 r4 = r20;
        C24361hy r2 = new C24361hy(activity2, r4, new AnonymousClass41G(activity2, c2o2, userSession2, user2, str4, str5), c2o2, userSession2, str5, str3, "system_share_sheet", id, str4);
        C61873Wd.A02(r4);
        C32165H8c A01 = C63413hR.A01(userSession2, num, str4, str5, c2o2.getModuleName());
        A01.A00 = r2;
        C31155GhB.A01(activity2, r21, A01);
    }

    public static void A08(Bundle bundle, Fragment fragment, C11630kW r12, UserSession userSession, User user, String str) {
        FragmentActivity activity = fragment.getActivity();
        HashMap A0y = AnonymousClass0wJ.A0y();
        A0C(user, "url", str, A0y);
        A03(activity, bundle, r12, userSession, "share_to_system_sheet", A0y);
        C11630kW r6 = r12;
        UserSession userSession2 = userSession;
        C63673i6.A0A(r6, userSession2, user.getId(), "map_share_sheet", "system_share_sheet", str);
    }

    public static void A09(Fragment fragment, C11630kW r9, UserSession userSession, User user, Throwable th) {
        C63673i6.A09(r9, userSession, user.getId(), "map_share_sheet", "system_share_sheet", th);
        A08(C18180wK.A06(), fragment, r9, userSession, user, C18180wK.A0j("https://www.instagram.com/%s/", new Object[]{user.BK7()}));
    }

    public static void A0A(C11630kW r4, UserSession userSession, String str, String str2, String str3) {
        C15730rn A00 = C15730rn.A00(r4, "external_share_option_tapped");
        A00.A0D("media_id", str);
        A00.A0D("share_location", "live_action_sheet");
        A00.A0D("share_option", "system_share_sheet");
        if (str2 != null) {
            A00.A0D("media_owner_id", str2);
        }
        if (str3 != null) {
            A00.A0D("url", str3);
        }
        C18180wK.A1K(A00, userSession);
    }

    public static void A0B(C21839C2o c2o, UserSession userSession, String str, String str2, String str3, String str4, String str5) {
        String str6;
        if (str5 != null) {
            str6 = str5.substring(str5.indexOf("igshid=") + 7);
            if (str6.contains(URLEncodedUtils.PARAMETER_SEPARATOR)) {
                str6 = str6.substring(0, str6.indexOf(38));
            }
        } else {
            str6 = null;
        }
        C15730rn A00 = C15730rn.A00(c2o, "external_share_option_tapped");
        A00.A0D("media_id", str);
        A00.A0D("share_location", str2);
        A00.A0D("share_option", str3);
        A00.A0D("share_id", str6);
        if (str4 != null) {
            A00.A0D("media_owner_id", str4);
        }
        if (str5 != null) {
            A00.A0D("url", str5);
        }
        C18180wK.A1K(A00, userSession);
    }

    public static String A00(BKU bku, UserSession userSession, String str) {
        BZI A26;
        if (!C19573AyZ.A00(bku, userSession) || (A26 = bku.A26()) == null) {
            return str;
        }
        String str2 = A26.A0h;
        if (!TextUtils.isEmpty(str2)) {
            return AnonymousClass00U.A0V(str2, "\n", str);
        }
        return str;
    }

    public static void A0C(User user, Object obj, Object obj2, AbstractMap abstractMap) {
        abstractMap.put(obj, obj2);
        abstractMap.put("user_id", user.getId());
        abstractMap.put(AnonymousClass3Q8.A00(19, 8, 85), user.BK7());
    }
}
