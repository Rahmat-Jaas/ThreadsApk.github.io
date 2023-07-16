package X;

import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.instagram.realtimeclient.RealtimeConstants;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.3iK  reason: invalid class name and case insensitive filesystem */
public final class C63773iK {
    public static final C63773iK A00 = new C63773iK();

    public static final Long A00(String str) {
        if (str == null) {
            return null;
        }
        try {
            return AnonymousClass0wJ.A0d(str);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static final void A01(C021209x r1, BZI bzi, String str, String str2) {
        C04220Ms.A0B(r1, 0);
        A04(r1, bzi, str, str2, (String) null);
    }

    public static final void A06(C021209x r3, C307722x r4, String str, String str2, String str3) {
        String str4;
        C04220Ms.A0B(r4, 1);
        HashMap A0y = AnonymousClass0wJ.A0y();
        C18190wL.A1U(A0y);
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M((C13330nS) r3, "ig_wellbeing_restrict_upsell_action"), 1526);
        C18210wN.A1A(A0I, str);
        C18190wL.A1I(A0I, str2);
        switch (r4.ordinal()) {
            case 0:
                str4 = RealtimeConstants.GRAPHQL_SUBSCRIPTION_MESSAGE_TOPIC_FOR_DIRECT_TYPING;
                break;
            case 1:
            case 2:
                str4 = "comment";
                break;
            case 5:
                str4 = "profile_following_sheet";
                break;
            case 7:
                str4 = "newsfeed_you";
                break;
            default:
                str4 = "profile";
                break;
        }
        A0B(A0I, str4, str3, A0y);
        A0I.Bb4();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0063, code lost:
        if (r1 != null) goto L_0x0065;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A02(X.C021209x r5, X.BZI r6, java.lang.String r7, java.lang.String r8) {
        /*
            java.lang.String r4 = "click"
            java.util.HashMap r3 = X.AnonymousClass0wJ.A0y()
            X.C18190wL.A1U(r3)
            java.lang.String r0 = "ig_wellbeing_restrict_upsell_action"
            X.0nS r5 = (X.C13330nS) r5
            X.0A2 r1 = X.AnonymousClass0wJ.A0M(r5, r0)
            r0 = 1526(0x5f6, float:2.138E-42)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r2 = X.C18180wK.A0I(r1, r0)
            X.C18210wN.A1A(r2, r4)
            X.C18190wL.A1I(r2, r7)
            java.lang.String r0 = "comment"
            X.C18250wR.A11(r2, r0, r3)
            if (r6 == 0) goto L_0x004f
            java.lang.String r0 = r6.A0f
            java.lang.Long r1 = A00(r0)
            if (r1 == 0) goto L_0x0031
            java.lang.String r0 = "comment_id"
            r2.A0S(r0, r1)
        L_0x0031:
            java.lang.String r0 = r6.A0e
            java.lang.Long r1 = A00(r0)
            if (r1 == 0) goto L_0x003e
            java.lang.String r0 = "parent_comment_id"
            r2.A0S(r0, r1)
        L_0x003e:
            X.BKU r0 = r6.A0G
            java.lang.String r0 = r0.A33()
            java.lang.Long r1 = A00(r0)
            if (r1 == 0) goto L_0x004f
            java.lang.String r0 = "parent_media_id"
            r2.A0S(r0, r1)
        L_0x004f:
            java.lang.Long r1 = A00(r8)
            if (r1 != 0) goto L_0x0065
            if (r6 == 0) goto L_0x006a
            com.instagram.user.model.User r0 = r6.A0J
            if (r0 == 0) goto L_0x006e
            java.lang.String r0 = r0.getId()
        L_0x005f:
            java.lang.Long r1 = A00(r0)
            if (r1 == 0) goto L_0x006a
        L_0x0065:
            java.lang.String r0 = "actor_ig_userid"
            r2.A0S(r0, r1)
        L_0x006a:
            r2.Bb4()
            return
        L_0x006e:
            r0 = 0
            goto L_0x005f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63773iK.A02(X.09x, X.BZI, java.lang.String, java.lang.String):void");
    }

    public static final void A07(C021209x r8, String str) {
        C04220Ms.A0B(r8, 0);
        ArrayList A0v = AnonymousClass0wJ.A0v();
        HashMap A0y = AnonymousClass0wJ.A0y();
        C18190wL.A1U(A0y);
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M((C13330nS) r8, "ig_wellbeing_restrict_direct_flow_action"), 1522);
        C18210wN.A1A(A0I, "click");
        C18190wL.A1I(A0I, "restrict_account_button");
        C18250wR.A11(A0I, RealtimeConstants.GRAPHQL_SUBSCRIPTION_MESSAGE_TOPIC_FOR_DIRECT_TYPING, A0y);
        Long A002 = A00(str);
        if (A002 != null || (!A0v.isEmpty() && A0v.size() == 1 && (A002 = A00(C18190wL.A0p(A0v, 0))) != null)) {
            A0I.A0S("actor_ig_userid", A002);
        }
        A0I.Bb4();
    }

    public static void A0B(USLEBaseShape0S0000000 uSLEBaseShape0S0000000, String str, String str2, Map map) {
        uSLEBaseShape0S0000000.A0T("entrypoint", str);
        uSLEBaseShape0S0000000.A1h(map);
        Long A002 = A00(str2);
        if (A002 != null) {
            uSLEBaseShape0S0000000.A0S("actor_ig_userid", A002);
        }
    }

    public static final void A03(C021209x r4, BZI bzi, String str, String str2) {
        String str3;
        HashMap A0y = AnonymousClass0wJ.A0y();
        C18190wL.A1U(A0y);
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M((C13330nS) r4, "ig_wellbeing_restrict_manage_comment"), 1524);
        C18210wN.A1A(A0I, str);
        C18190wL.A1I(A0I, str2);
        C18250wR.A11(A0I, "comment", A0y);
        User user = bzi.A0J;
        if (user != null) {
            str3 = user.getId();
        } else {
            str3 = null;
        }
        Long A002 = A00(str3);
        if (A002 != null) {
            A0I.A0S("actor_ig_userid", A002);
        }
        Long A003 = A00(bzi.A0f);
        if (A003 != null) {
            A0I.A0S("comment_id", A003);
        }
        Long A004 = A00(bzi.A0e);
        if (A004 != null) {
            A0I.A0S("parent_comment_id", A004);
        }
        Long A005 = A00(bzi.A0G.A33());
        if (A005 != null) {
            A0I.A0S("parent_media_id", A005);
        }
        A0I.Bb4();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0061, code lost:
        if (r1 != null) goto L_0x0063;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A04(X.C021209x r4, X.BZI r5, java.lang.String r6, java.lang.String r7, java.lang.String r8) {
        /*
            java.util.HashMap r3 = X.AnonymousClass0wJ.A0y()
            X.C18190wL.A1U(r3)
            java.lang.String r0 = "ig_wellbeing_restrict_comment_flow_action"
            X.0nS r4 = (X.C13330nS) r4
            X.0A2 r1 = X.AnonymousClass0wJ.A0M(r4, r0)
            r0 = 1521(0x5f1, float:2.131E-42)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r2 = X.C18180wK.A0I(r1, r0)
            X.C18210wN.A1A(r2, r6)
            X.C18190wL.A1I(r2, r7)
            java.lang.String r0 = "comment"
            X.C18250wR.A11(r2, r0, r3)
            if (r5 == 0) goto L_0x004d
            java.lang.String r0 = r5.A0f
            java.lang.Long r1 = A00(r0)
            if (r1 == 0) goto L_0x002f
            java.lang.String r0 = "comment_id"
            r2.A0S(r0, r1)
        L_0x002f:
            java.lang.String r0 = r5.A0e
            java.lang.Long r1 = A00(r0)
            if (r1 == 0) goto L_0x003c
            java.lang.String r0 = "parent_comment_id"
            r2.A0S(r0, r1)
        L_0x003c:
            X.BKU r0 = r5.A0G
            java.lang.String r0 = r0.A33()
            java.lang.Long r1 = A00(r0)
            if (r1 == 0) goto L_0x004d
            java.lang.String r0 = "parent_media_id"
            r2.A0S(r0, r1)
        L_0x004d:
            java.lang.Long r1 = A00(r8)
            if (r1 != 0) goto L_0x0063
            if (r5 == 0) goto L_0x0068
            com.instagram.user.model.User r0 = r5.A0J
            if (r0 == 0) goto L_0x006c
            java.lang.String r0 = r0.getId()
        L_0x005d:
            java.lang.Long r1 = A00(r0)
            if (r1 == 0) goto L_0x0068
        L_0x0063:
            java.lang.String r0 = "actor_ig_userid"
            r2.A0S(r0, r1)
        L_0x0068:
            r2.Bb4()
            return
        L_0x006c:
            r0 = 0
            goto L_0x005d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63773iK.A04(X.09x, X.BZI, java.lang.String, java.lang.String, java.lang.String):void");
    }

    public static final void A05(C021209x r4, User user, String str, String str2) {
        String str3;
        HashMap A0y = AnonymousClass0wJ.A0y();
        C18190wL.A1U(A0y);
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M((C13330nS) r4, "ig_wellbeing_restrict_list_action"), 1523);
        C18210wN.A1A(A0I, str);
        C18190wL.A1I(A0I, str2);
        A0I.A1h(A0y);
        if (user != null) {
            str3 = user.getId();
        } else {
            str3 = null;
        }
        Long A002 = A00(str3);
        if (A002 != null) {
            A0I.A0S("actor_ig_userid", A002);
        }
        A0I.Bb4();
    }

    public static final void A08(C021209x r3, String str, String str2, String str3) {
        HashMap A0y = AnonymousClass0wJ.A0y();
        C18190wL.A1U(A0y);
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M((C13330nS) r3, "ig_wellbeing_restrict_activity_feed_flow_action"), 1520);
        C18210wN.A1A(A0I, str);
        C18190wL.A1I(A0I, str2);
        A0B(A0I, "newsfeed_you", str3, A0y);
        A0I.Bb4();
    }

    public static final void A09(C021209x r3, String str, String str2, String str3) {
        AnonymousClass0wJ.A1O(str, str2);
        HashMap A0y = AnonymousClass0wJ.A0y();
        C18190wL.A1U(A0y);
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M((C13330nS) r3, "ig_wellbeing_restrict_profile_flow_action"), 1525);
        C18210wN.A1A(A0I, str);
        C18190wL.A1I(A0I, str2);
        A0B(A0I, "profile", str3, A0y);
        A0I.Bb4();
    }

    public static final void A0A(C021209x r3, String str, String str2, String str3) {
        HashMap A0y = AnonymousClass0wJ.A0y();
        C18190wL.A1U(A0y);
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M((C13330nS) r3, "ig_wellbeing_restrict_upsell_action"), 1526);
        C18210wN.A1A(A0I, str);
        C18190wL.A1I(A0I, str2);
        A0B(A0I, "profile", str3, A0y);
        A0I.Bb4();
    }
}
