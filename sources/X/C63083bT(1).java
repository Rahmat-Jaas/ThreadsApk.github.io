package X;

import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.instagram.service.session.UserSession;
import com.instagram.settings.privacy.messages.DirectMessageInteropReachabilityOptions;
import com.instagram.settings.privacy.messages.DirectMessagesInteropOptionsViewModel;
import java.util.Map;
import kotlin.Pair;

/* renamed from: X.3bT  reason: invalid class name and case insensitive filesystem */
public final class C63083bT {
    public final C13330nS A00;
    public final String A01;
    public final C11630kW A02;
    public final UserSession A03;

    public final void A04(DirectMessagesInteropOptionsViewModel directMessagesInteropOptionsViewModel, DirectMessagesInteropOptionsViewModel directMessagesInteropOptionsViewModel2, AnonymousClass266 r6, String str, boolean z, boolean z2, boolean z3) {
        C04220Ms.A0B(str, 0);
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(this.A00, "ig_interop_reachability_setting_client_interaction"), 1250);
        if (AnonymousClass0wJ.A1U(A0I)) {
            A0I.A0O(A00(str), "setting_name");
            A0I.A0O(C316628m.SETTING_CHANGED, "interaction_type");
            A0I.A0O(A01(directMessagesInteropOptionsViewModel.A00(str)), "setting_from_value");
            A0I.A0O(A01(directMessagesInteropOptionsViewModel2.A00(str)), "setting_to_value");
            A0I.A0Q("setting_change_succeeded", Boolean.valueOf(z3));
            A0I.A0V("extra_data_map", A02(directMessagesInteropOptionsViewModel2, r6, z, z2));
            C18210wN.A1B(A0I, this.A01);
            A0I.Bb4();
        }
    }

    public static final C318929j A01(DirectMessageInteropReachabilityOptions directMessageInteropReachabilityOptions) {
        if (directMessageInteropReachabilityOptions == null) {
            return null;
        }
        switch (directMessageInteropReachabilityOptions.ordinal()) {
            case 0:
                return C318929j.INBOX;
            case 1:
                return C318929j.REQUESTS;
            case 2:
                return C318929j.DO_NOT_DELIVER;
            case 3:
                return C318929j.PRIMARY;
            case 4:
                return C318929j.GENERAL;
            case 5:
                return C318929j.PEOPLE_YOU_FOLLOW_ON_INSTAGRAM;
            case 6:
                return C318929j.EVERYONE_ON_INSTAGRAM;
            default:
                return null;
        }
    }

    public static final Map A02(DirectMessagesInteropOptionsViewModel directMessagesInteropOptionsViewModel, AnonymousClass266 r8, boolean z, boolean z2) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        DirectMessageInteropReachabilityOptions directMessageInteropReachabilityOptions = directMessagesInteropOptionsViewModel.A05;
        String str10 = null;
        if (directMessageInteropReachabilityOptions != null) {
            str = directMessageInteropReachabilityOptions.A03;
        } else {
            str = null;
        }
        Pair A0p = C18180wK.A0p("ig_followers", str);
        DirectMessageInteropReachabilityOptions directMessageInteropReachabilityOptions2 = directMessagesInteropOptionsViewModel.A08;
        if (directMessageInteropReachabilityOptions2 != null) {
            str2 = directMessageInteropReachabilityOptions2.A03;
        } else {
            str2 = null;
        }
        Pair A0p2 = C18180wK.A0p("others_on_ig", str2);
        DirectMessageInteropReachabilityOptions directMessageInteropReachabilityOptions3 = directMessagesInteropOptionsViewModel.A07;
        if (directMessageInteropReachabilityOptions3 != null) {
            str3 = directMessageInteropReachabilityOptions3.A03;
        } else {
            str3 = null;
        }
        Pair A0p3 = C18180wK.A0p("others_on_fb", str3);
        DirectMessageInteropReachabilityOptions directMessageInteropReachabilityOptions4 = directMessagesInteropOptionsViewModel.A04;
        if (directMessageInteropReachabilityOptions4 != null) {
            str4 = directMessageInteropReachabilityOptions4.A03;
        } else {
            str4 = null;
        }
        Pair A0p4 = C18180wK.A0p("group_message_setting", str4);
        if (r8 != null) {
            str5 = r8.A01;
        } else {
            str5 = null;
        }
        Map A0I = AnonymousClass4WJ.A0I(A0p, A0p2, A0p3, A0p4, C18180wK.A0p("account_type", str5));
        AnonymousClass266 r0 = AnonymousClass266.A04;
        if (r8 == r0 || !z) {
            if (r8 == r0 && z2) {
                DirectMessageInteropReachabilityOptions directMessageInteropReachabilityOptions5 = directMessagesInteropOptionsViewModel.A03;
                if (directMessageInteropReachabilityOptions5 != null) {
                    str6 = directMessageInteropReachabilityOptions5.A03;
                } else {
                    str6 = null;
                }
                A0I.put("fb_messaged_your_page", str6);
                DirectMessageInteropReachabilityOptions directMessageInteropReachabilityOptions6 = directMessagesInteropOptionsViewModel.A02;
                if (directMessageInteropReachabilityOptions6 != null) {
                    str10 = directMessageInteropReachabilityOptions6.A03;
                }
                str7 = "fb_liked_or_followed_your_page";
            }
            return A0I;
        }
        DirectMessageInteropReachabilityOptions directMessageInteropReachabilityOptions7 = directMessagesInteropOptionsViewModel.A00;
        if (directMessageInteropReachabilityOptions7 != null) {
            str8 = directMessageInteropReachabilityOptions7.A03;
        } else {
            str8 = null;
        }
        A0I.put("fb_friends", str8);
        DirectMessageInteropReachabilityOptions directMessageInteropReachabilityOptions8 = directMessagesInteropOptionsViewModel.A01;
        if (directMessageInteropReachabilityOptions8 != null) {
            str9 = directMessageInteropReachabilityOptions8.A03;
        } else {
            str9 = null;
        }
        A0I.put("fb_friends_of_friends", str9);
        DirectMessageInteropReachabilityOptions directMessageInteropReachabilityOptions9 = directMessagesInteropOptionsViewModel.A09;
        if (directMessageInteropReachabilityOptions9 != null) {
            str10 = directMessageInteropReachabilityOptions9.A03;
        }
        str7 = "people_with_your_phone_number";
        A0I.put(str7, str10);
        return A0I;
    }

    public static final void A03(C63083bT r3, DirectMessagesInteropOptionsViewModel directMessagesInteropOptionsViewModel, DirectMessagesInteropOptionsViewModel directMessagesInteropOptionsViewModel2, AnonymousClass266 r6, String str, boolean z, boolean z2, boolean z3) {
        C315928f r1;
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(r3.A00, "ig_interop_reachability_settings_suggestion"), 1251);
        if (AnonymousClass0wJ.A1U(A0I)) {
            C318929j A012 = A01(directMessagesInteropOptionsViewModel.A00(str));
            C318929j A013 = A01(directMessagesInteropOptionsViewModel2.A00(str));
            if (A012 != null && A013 != null) {
                if (z3) {
                    r1 = C315928f.DIALOG_CONFIRM;
                } else {
                    r1 = C315928f.DIALOG_SHOWN;
                }
                A0I.A0O(r1, "event_subtype");
                A0I.A0O(A00(str), "setting_name");
                A0I.A0O(A012, "setting_from_value");
                A0I.A0O(A013, "setting_to_value");
                A0I.A0V("extra_data_map", A02(directMessagesInteropOptionsViewModel2, r6, z, z2));
                A0I.Bb4();
            }
        }
    }

    public C63083bT(C11630kW r2, UserSession userSession, String str) {
        this.A03 = userSession;
        this.A02 = r2;
        this.A01 = str;
        this.A00 = C13330nS.A01(r2, userSession);
    }

    public static final C319429o A00(String str) {
        switch (str.hashCode()) {
            case -2143256302:
                if (str.equals("fb_friends")) {
                    return C319429o.KIGDIRECTINTEROPREACHABILITYSETTINGSFBFRIENDS;
                }
                break;
            case -1890055046:
                if (str.equals("fb_friends_of_friends")) {
                    return C319429o.KIGDIRECTINTEROPREACHABILITYSETTINGSFBFRIENDSOFFRIENDS;
                }
                break;
            case -1839818691:
                if (str.equals("people_with_your_phone_number")) {
                    return C319429o.KIGDIRECTINTEROPREACHABILITYSETTINGSPEOPLEWITHYOURPHONENUMBER;
                }
                break;
            case -1275916548:
                if (str.equals("fb_messaged_your_page")) {
                    return C319429o.KIGDIRECTINTEROPREACHABILITYSETTINGSFBMESSAGEDYOURPAGE;
                }
                break;
            case -456614348:
                if (str.equals("ig_followers")) {
                    return C319429o.KIGDIRECTINTEROPREACHABILITYSETTINGSIGFOLLOWERS;
                }
                break;
            case -371252023:
                if (str.equals("ig_verified")) {
                    return C319429o.KIGDIRECTINTEROPREACHABILITYSETTINGSVERIFIEDACCOUNTS;
                }
                break;
            case -8227469:
                if (str.equals("fb_liked_or_followed_your_page")) {
                    return C319429o.KIGDIRECTINTEROPREACHABILITYSETTINGSFBLIKEDORFOLLOWEDYOURPAGE;
                }
                break;
            case 949752640:
                if (str.equals("others_on_fb")) {
                    return C319429o.KIGDIRECTINTEROPREACHABILITYSETTINGSOTHERSONFB;
                }
                break;
            case 949752738:
                if (str.equals("others_on_ig")) {
                    return C319429o.KIGDIRECTINTEROPREACHABILITYSETTINGSOTHERSONIG;
                }
                break;
            case 1767124056:
                if (str.equals("group_message_setting")) {
                    return C319429o.KIGDIRECTINTEROPREACHABILITYSETTINGSIGGROUPSETTINGS;
                }
                break;
        }
        throw C18180wK.A0a(AnonymousClass00U.A0L("Invalid MessageInteropOption ", str));
    }
}
