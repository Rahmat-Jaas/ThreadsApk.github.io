package X;

import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.service.session.UserSession;

/* renamed from: X.3hd  reason: invalid class name and case insensitive filesystem */
public final class C63513hd {
    public static final C63513hd A00 = new C63513hd();

    public static final void A02(C11630kW r11, C309223m r12, UserSession userSession, String str, String str2) {
        C18180wK.A1P(userSession, 0, r12);
        A01(r11, r12, userSession, (Integer) null, str, str2, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 16777184);
    }

    public static final void A03(C11630kW r12, C309223m r13, UserSession userSession, String str, String str2, String str3) {
        AnonymousClass0wJ.A1N(userSession, r12);
        C04220Ms.A0B(r13, 3);
        A01(r12, r13, userSession, (Integer) null, str, str2, str3, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 16777056);
    }

    public static final void A04(C11630kW r10, C309223m r11, UserSession userSession, String str, String str2, String str3, String str4, String str5) {
        AnonymousClass0wJ.A1N(userSession, r10);
        AnonymousClass0wJ.A1Q(str, r11);
        A01(r10, r11, userSession, (Integer) null, str, str2, str5, str3, str4, (String) null, (String) null, (String) null, (String) null, 16776288);
    }

    public static final void A05(C309223m r12, UserSession userSession, String str, String str2, String str3, String str4, String str5, int i) {
        C04220Ms.A0B(r12, 3);
        A01(new C682843e(str), r12, userSession, Integer.valueOf(i), str2, str3, str4, (String) null, (String) null, (String) null, (String) null, str5, (String) null, 15761248);
    }

    public static final C309223m A00(C23894D0g d0g) {
        if (d0g == C23894D0g.FollowStatusFollowing) {
            return C309223m.FOLLOWING;
        }
        return C309223m.NOT_FOLLOWING;
    }

    public static /* synthetic */ void A01(C11630kW r13, C309223m r14, UserSession userSession, Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i) {
        Long l;
        String str10 = str;
        String str11 = str4;
        String str12 = str3;
        String str13 = str6;
        String str14 = str5;
        String str15 = str8;
        String str16 = str7;
        String str17 = str9;
        int i2 = i;
        if ((i & 4) != 0) {
            str10 = null;
        }
        if ((i & 16) != 0) {
            str2 = null;
        }
        if ((i2 & 128) != 0) {
            str12 = null;
        }
        if ((i2 & 256) != 0) {
            str11 = null;
        }
        if ((i2 & 512) != 0) {
            str14 = null;
        }
        if ((i2 & 2048) != 0) {
            str13 = null;
        }
        if ((i2 & 4096) != 0) {
            str16 = null;
        }
        if ((65536 & i) != 0) {
            num = null;
        }
        if ((131072 & i) != 0) {
            str15 = null;
        }
        if ((1048576 & i) != 0) {
            str17 = null;
        }
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(C18230wP.A0U(r13, userSession), "ig_profile_action"), 1401);
        if (AnonymousClass0wJ.A1U(A0I)) {
            C18210wN.A1A(A0I, str10);
            A0I.A1M(r14.A00);
            C315628c r5 = null;
            if (str2 != null) {
                l = AnonymousClass0wJ.A0d(str2);
            } else {
                l = null;
            }
            A0I.A0S("profile_user_id", l);
            A0I.A0T("navstack", AnonymousClass4WE.A00().A01());
            A0I.A0S("product_id", (Long) null);
            A0I.A0T("product_collection_type", (String) null);
            A0I.A0T("click_point", str12);
            A0I.A0T("media_id_attribution", str11);
            A0I.A0T("media_tracking_token_attribution", str14);
            A0I.A0T("subscribed_status", (String) null);
            A0I.A0T("starting_clips_media_id", str13);
            A0I.A0T("starting_clips_media_ranking_token", str16);
            A0I.A1X(str17);
            A0I.A0S("hashtag_id", (Long) null);
            A0I.A0T(I17.A00(663), (String) null);
            A0I.A0T("direct_thread_id", (String) null);
            if (num != null) {
                if (num.intValue() == 1) {
                    r5 = C315628c.INTEROP_USER_TYPE_FACEBOOK;
                } else {
                    r5 = C315628c.INTEROP_USER_TYPE_INSTAGRAM;
                }
            }
            A0I.A0O(r5, "profile_user_type");
            A0I.A0T(TraceFieldType.RequestID, str15);
            A0I.A0O((C021109v) null, "direct_source");
            A0I.A0O((C021109v) null, "direct_source_type");
            A0I.A0S("time_on_profile", (Long) null);
            A0I.A0T("highlight_reel_id_str", (String) null);
            A0I.A0Q("seen_state_ring", (Boolean) null);
            A0I.Bb4();
        }
    }
}
