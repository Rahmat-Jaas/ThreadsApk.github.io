package X;

import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import com.facebook.common.time.AwakeTimeSinceBootClock;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.service.session.UserSession;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: X.3hV  reason: invalid class name and case insensitive filesystem */
public final class C63453hV {
    public static long A00;
    public static long A01;
    public static String A02 = "";
    public static String A03 = "";
    public static boolean A04;
    public static final C03710Kk A05;
    public static final String A06 = C18200wM.A0g();

    public static final HashMap A00(C319629q r13, C10300i6 r14, Boolean bool, Long l, Long l2, long j, boolean z, boolean z2, boolean z3) {
        AnonymousClass295 r0;
        C04220Ms.A0B(r14, 0);
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A02(r14), "switcher_button_tapped"), 2761);
        String A0e = C18180wK.A0e();
        C04220Ms.A06(A0e);
        double A002 = AnonymousClass269.A00();
        HashMap A0y = AnonymousClass0wJ.A0y();
        AnonymousClass266 A012 = C04660Oo.A01(r14);
        String[] A042 = A04(r13);
        String str = A042[0];
        String str2 = A042[1];
        String valueOf = String.valueOf(A002);
        if (valueOf != null) {
            A0y.put(TraceFieldType.StartTime, valueOf);
        }
        A0y.put("event_session_id", A0e);
        String str3 = r13.A00;
        C04220Ms.A06(str3);
        A0y.put("entry_point", str3);
        if (AnonymousClass0wJ.A1U(A0I)) {
            A0I.A0Q("is_badge_shown", Boolean.valueOf(z));
            A0I.A0S("badge_count", Long.valueOf(j));
            A0I.A0S("raw_initiator_account_id", l);
            A0I.A0S("initiator_identity_id", l2);
            A0I.A0O(C317028q.INSTAGRAM, "initiator_account_type");
            A0I.A0Q("is_in_switcher_test", C18210wN.A0R(A0I, C18210wN.A0R(A0I, bool, "is_cds", z2), "is_switcher_cached", z3));
            A0I.A0O(r13, "entry_point");
            C18200wM.A1K(A0I, A002);
            A0I.A0T("event_session_id", A0e);
            A0I.A0O(AnonymousClass27h.SWITCHER, OptSvcAnalyticsStore.LOGGING_KEY_STEP);
            if (AnonymousClass266.A07 == A012) {
                r0 = null;
            } else {
                int ordinal = A012.ordinal();
                if (ordinal == 2) {
                    r0 = AnonymousClass295.IG_BUSINESS;
                } else if (ordinal != 3) {
                    r0 = AnonymousClass295.IG_PERSONAL;
                } else {
                    r0 = AnonymousClass295.IG_CREATOR;
                }
            }
            A0I.A0O(r0, "initiator_identity_type");
            A0I.A0T(AnonymousClass000.A00(485), str);
            A0I.A0Q("is_tooltip_shown", Boolean.valueOf(Boolean.parseBoolean(str2)));
            A0I.Bb4();
        }
        return A0y;
    }

    static {
        AwakeTimeSinceBootClock awakeTimeSinceBootClock = AwakeTimeSinceBootClock.INSTANCE;
        C04220Ms.A06(awakeTimeSinceBootClock);
        A05 = awakeTimeSinceBootClock;
    }

    public static final synchronized void A02(C10300i6 r9, String str, String str2) {
        synchronized (C63453hV.class) {
            C04220Ms.A0B(r9, 0);
            boolean A1Z = C18200wM.A1Z(str2);
            if (A04) {
                AnonymousClass01V r4 = AnonymousClass01V.A0p;
                C04220Ms.A06(r4);
                r4.markerStart(857811724);
                r4.markerAnnotate(857811724, "FAILURE_REASON", "PREVIOUS_TIMESTAMP_FOUND");
                r4.markerEnd(857811724, 3, A05.now(), TimeUnit.MILLISECONDS);
            }
            A04 = A1Z;
            A01 = A05.now();
            A02 = str2;
            A03 = str;
        }
    }

    public static final void A03(UserSession userSession) {
        AnonymousClass0BO r0 = userSession.multipleAccountHelper;
        Iterator it = r0.A00.A04(AnonymousClass0wJ.A0Y(userSession)).iterator();
        while (it.hasNext()) {
            int A012 = C18220wO.A0c(it).A01();
            if (A012 > 0) {
                AnonymousClass3NS.A00(userSession).A00.AD8();
                AnonymousClass17J r4 = new AnonymousClass17J(AnonymousClass2AP.A03, (List) null, A012, A012);
                AnonymousClass3NS.A00(userSession).A03(AnonymousClass25P.NUMBERED, AnonymousClass25R.BOTTOM_SHEET_VERTICAL, r4, AnonymousClass006.A0C);
            }
        }
    }

    public static final String[] A04(C319629q r4) {
        String str;
        boolean z;
        if (C319629q.TAB_BAR_LONG_PRESS == r4) {
            z = C18180wK.A1X(C18200wM.A0C().getInt("long_press_account_switcher_row_to_create_shortcut_tooltip_impressions", 0));
            str = "long_press_tooltip";
        } else {
            str = "";
            z = false;
        }
        if (C319629q.TAB_BAR_DOUBLE_TAP == r4) {
            z = C18180wK.A1X(C18200wM.A0C().getInt("preference_double_tap_profile_tab_tooltip_impressions", 0));
            str = "double_tap_tooltip";
        }
        return new String[]{str, String.valueOf(z)};
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(X.AnonymousClass28R r5, X.C10300i6 r6, java.lang.Long r7, java.lang.Long r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, double r14, boolean r16, boolean r17, boolean r18) {
        /*
            r2 = 0
            X.AnonymousClass0wJ.A1M(r6, r2, r5)
            r0 = 6
            X.C04220Ms.A0B(r9, r0)
            X.0nS r0 = X.C13330nS.A02(r6)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r1 = X.AnonymousClass2C0.A00(r0)
            if (r10 == 0) goto L_0x0019
            int r0 = r10.hashCode()
            switch(r0) {
                case -976711082: goto L_0x00d8;
                case -713987006: goto L_0x00e4;
                case -416741326: goto L_0x00f0;
                case -138683230: goto L_0x00fc;
                case 129084363: goto L_0x0108;
                case 359330359: goto L_0x0114;
                case 441111834: goto L_0x0120;
                case 660917936: goto L_0x012c;
                case 1414199215: goto L_0x0138;
                case 2005378358: goto L_0x0144;
                default: goto L_0x0019;
            }
        L_0x0019:
            X.29q r3 = X.C319629q.UNKNOWN
        L_0x001b:
            java.lang.String[] r4 = A04(r3)
            r2 = r4[r2]
            r0 = 1
            r4 = r4[r0]
            X.C04660Oo.A01(r6)
            boolean r0 = X.AnonymousClass0wJ.A1U(r1)
            if (r0 == 0) goto L_0x00ac
            java.lang.String r0 = "raw_target_account_id"
            r1.A0S(r0, r7)
            java.lang.String r0 = "target_identity_id"
            r1.A0S(r0, r8)
            java.lang.String r0 = "entry_point"
            r1.A0O(r3, r0)
            X.C18200wM.A1K(r1, r14)
            java.lang.String r0 = "xapp_session_id"
            r1.A0T(r0, r13)
            java.lang.String r0 = "event_session_id"
            r3 = r16
            java.lang.Boolean r3 = X.C18190wL.A0Z(r1, r0, r9, r3)
            java.lang.String r0 = "is_logged_in"
            r1.A0Q(r0, r3)
            java.lang.String r0 = "switch_type"
            r1.A0O(r5, r0)
            if (r12 == 0) goto L_0x00d6
            int r0 = r12.hashCode()
            switch(r0) {
                case -1663636798: goto L_0x00b5;
                case 518669073: goto L_0x00c0;
                case 1842542915: goto L_0x00cb;
                default: goto L_0x005f;
            }
        L_0x005f:
            X.29R r3 = X.AnonymousClass29R.ACTIVE_SESSION
        L_0x0061:
            java.lang.String r0 = "landing_point"
            r1.A0O(r3, r0)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r17)
            java.lang.String r0 = "is_cds"
            r5 = r18
            java.lang.Boolean r3 = X.C18210wN.A0R(r1, r3, r0, r5)
            java.lang.String r0 = "is_sso_enabled"
            r1.A0Q(r0, r3)
            boolean r0 = java.lang.Boolean.parseBoolean(r4)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "is_tooltip_shown"
            r1.A0Q(r0, r3)
            r0 = 485(0x1e5, float:6.8E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r1.A0T(r0, r2)
            java.lang.String r0 = "FB_ANDROID"
            boolean r0 = X.C04220Ms.A0I(r11, r0)
            if (r0 == 0) goto L_0x00ad
            X.28q r2 = X.C317028q.FACEBOOK
        L_0x0097:
            java.lang.String r0 = "initiator_account_type"
            r1.A0O(r2, r0)
            double r2 = X.C18200wM.A00()
            java.lang.Double r2 = java.lang.Double.valueOf(r2)
            java.lang.String r0 = "end_time"
            r1.A0R(r0, r2)
            r1.Bb4()
        L_0x00ac:
            return
        L_0x00ad:
            java.lang.String r0 = "IG_ANDROID"
            X.C04220Ms.A0I(r11, r0)
            X.28q r2 = X.C317028q.INSTAGRAM
            goto L_0x0097
        L_0x00b5:
            java.lang.String r0 = "inactive_session"
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L_0x005f
            X.29R r3 = X.AnonymousClass29R.INACTIVE_SESSION
            goto L_0x0061
        L_0x00c0:
            java.lang.String r0 = "logged_out"
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L_0x005f
            X.29R r3 = X.AnonymousClass29R.LOGGED_OUT
            goto L_0x0061
        L_0x00cb:
            java.lang.String r0 = "app_store"
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L_0x005f
            X.29R r3 = X.AnonymousClass29R.APP_STORE
            goto L_0x0061
        L_0x00d6:
            r3 = 0
            goto L_0x0061
        L_0x00d8:
            java.lang.String r0 = "tab_bar_long_press"
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x0019
            X.29q r3 = X.C319629q.TAB_BAR_LONG_PRESS
            goto L_0x001b
        L_0x00e4:
            java.lang.String r0 = "profile_title"
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x0019
            X.29q r3 = X.C319629q.PROFILE_TITLE
            goto L_0x001b
        L_0x00f0:
            java.lang.String r0 = "mini_switcher_select"
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x0019
            X.29q r3 = X.C319629q.MINI_SWITCHER_SELECT
            goto L_0x001b
        L_0x00fc:
            java.lang.String r0 = "snack_bar"
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x0019
            X.29q r3 = X.C319629q.SNACK_BAR
            goto L_0x001b
        L_0x0108:
            java.lang.String r0 = "tab_bar_double_tap"
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x0019
            X.29q r3 = X.C319629q.TAB_BAR_DOUBLE_TAP
            goto L_0x001b
        L_0x0114:
            java.lang.String r0 = "new_account_created"
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x0019
            X.29q r3 = X.C319629q.NEW_ACCOUNT_CREATED
            goto L_0x001b
        L_0x0120:
            java.lang.String r0 = "unknown_nt_action"
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x0019
            X.29q r3 = X.C319629q.UNKNOWN_NT_ACTION
            goto L_0x001b
        L_0x012c:
            java.lang.String r0 = "direct_inbox"
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x0019
            X.29q r3 = X.C319629q.DIRECT_INBOX
            goto L_0x001b
        L_0x0138:
            java.lang.String r0 = "horizontal_switch"
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x0019
            X.29q r3 = X.C319629q.HORIZONTAL_SWITCH
            goto L_0x001b
        L_0x0144:
            java.lang.String r0 = "bookmark"
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x0019
            X.29q r3 = X.C319629q.BOOKMARK
            goto L_0x001b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63453hV.A01(X.28R, X.0i6, java.lang.Long, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, double, boolean, boolean, boolean):void");
    }
}
