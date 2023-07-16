package X;

import ch.boye.httpclientandroidlib.client.utils.Rfc3492Idn;
import ch.boye.httpclientandroidlib.util.LangUtils;
import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.instagram.debug.devoptions.debughead.linechart.LineChartAxesView;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.service.session.UserSession;
import go.Seq;

/* renamed from: X.3hq  reason: invalid class name and case insensitive filesystem */
public final class C63583hq {
    public static final C63583hq A00 = new C63583hq();

    public static final void A00(UserSession userSession, long j) {
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A01((C11630kW) null, userSession), "ig_time_spent_screen_time"), 1459);
        C18210wN.A1A(A0I, "ig_ts_session_end");
        Double valueOf = Double.valueOf((double) j);
        A0I.A0R("usage_seconds", valueOf);
        A0I.A0U("weekly_screen_time", AnonymousClass0ZV.A00);
        A0I.A0R("session_length", valueOf);
        A0I.Bb4();
    }

    public static void A01(UserSession userSession, Integer num) {
        A04(userSession, num, (Integer) null, (Long) null, (Long) null, (Long) null, "take_break", true);
    }

    public static final void A02(UserSession userSession, Integer num, long j) {
        C04220Ms.A0B(userSession, 0);
        A03(userSession, AnonymousClass006.A05, num, (Long) null, Long.valueOf(j), (Long) null, (String) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003e, code lost:
        if (X.C04220Ms.A0I(r0, "") != false) goto L_0x0040;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        r14 = "";
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A03(com.instagram.service.session.UserSession r15, java.lang.Integer r16, java.lang.Integer r17, java.lang.Long r18, java.lang.Long r19, java.lang.Long r20, java.lang.String r21) {
        /*
            r8 = r15
            r14 = r21
            if (r21 != 0) goto L_0x0016
            X.3am r0 = X.C63043bN.A01
            android.content.SharedPreferences r1 = r0.A06(r15)
            java.lang.String r0 = "TAB_REMINDER_TYPE"
            java.lang.String r14 = ""
            java.lang.String r0 = r1.getString(r0, r14)
            if (r0 == 0) goto L_0x0016
            r14 = r0
        L_0x0016:
            X.3am r7 = X.C63043bN.A01
            long r5 = r7.A04(r15)
            long r3 = r7.A05(r15)
            r1 = 0
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x002a
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0040
        L_0x002a:
            android.content.SharedPreferences r2 = r7.A06(r15)
            java.lang.String r0 = "TAB_REMINDER_TYPE"
            java.lang.String r1 = ""
            java.lang.String r0 = r2.getString(r0, r1)
            if (r0 != 0) goto L_0x0039
            r0 = r1
        L_0x0039:
            boolean r0 = X.C04220Ms.A0I(r0, r1)
            r15 = 1
            if (r0 == 0) goto L_0x0041
        L_0x0040:
            r15 = 0
        L_0x0041:
            r9 = r16
            r10 = r17
            r11 = r18
            r12 = r19
            r13 = r20
            A04(r8, r9, r10, r11, r12, r13, r14, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63583hq.A03(com.instagram.service.session.UserSession, java.lang.Integer, java.lang.Integer, java.lang.Long, java.lang.Long, java.lang.Long, java.lang.String):void");
    }

    public static final void A04(UserSession userSession, Integer num, Integer num2, Long l, Long l2, Long l3, String str, boolean z) {
        String str2;
        String str3;
        Double d;
        C62803am r0 = C63043bN.A01;
        long A04 = r0.A04(userSession);
        long A05 = r0.A05(userSession);
        if (!C04220Ms.A0I(str, "daily_limit")) {
            if (C04220Ms.A0I(str, "take_break")) {
                A04 = A05;
            } else {
                A04 = 0;
            }
        }
        Double d2 = null;
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A01((C11630kW) null, userSession), "ig_time_spent_action"), 1458);
        if (AnonymousClass0wJ.A1U(A0I)) {
            switch (num.intValue()) {
                case 0:
                    str2 = "ig_ts_your_activity";
                    break;
                case 1:
                    str2 = "ig_ts_edit_reminder_dialog";
                    break;
                case 2:
                    str2 = "ig_ts_set_reminder_dialog";
                    break;
                case 3:
                    str2 = "ig_ts_set_reminder_tap";
                    break;
                case 4:
                    str2 = "ig_ts_reminder_set_ok";
                    break;
                case 5:
                    str2 = "ig_ts_reminder_set_success";
                    break;
                case 6:
                    str2 = "ig_ts_edit_reminder_tap";
                    break;
                case 7:
                    str2 = "ig_ts_cancel_reminder_tap";
                    break;
                case 8:
                    str2 = "ig_ts_set_daily_reminder_tap";
                    break;
                case 9:
                    str2 = "ig_ts_change_notification_settings_tap";
                    break;
                case 10:
                    str2 = "ig_ts_reminder_dialog";
                    break;
                case 11:
                    str2 = "ig_ts_reminder_dialog_ok_tap";
                    break;
                case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                    str2 = "ig_ts_day_chart_bar_tap";
                    break;
                case 13:
                    str2 = "ig_ts_edit_reminder_bottom_sheet_impression";
                    break;
                case 14:
                    str2 = "ig_ts_set_take_break_reminder_tap";
                    break;
                case 15:
                    str2 = "ig_ts_reminder_dialog_take_break_tap";
                    break;
                case 16:
                    str2 = "ig_ts_tips_screen_did_enter_background";
                    break;
                case LangUtils.HASH_SEED /*17*/:
                    str2 = "ig_ts_blocking_screen_impression";
                    break;
                case 18:
                    str2 = "ig_ts_blocking_screen_did_enter_background";
                    break;
                case 19:
                    str2 = "ig_ts_blocking_screen_learn_more_tap";
                    break;
                case 20:
                    str2 = "ig_ts_blocking_screen_settings_tap";
                    break;
                case 21:
                    str2 = "ig_ts_take_a_break_not_shown_no_activity";
                    break;
                case 22:
                    str2 = "ig_ts_take_a_break_not_shown_backgrounded";
                    break;
                case 23:
                    str2 = "ig_ts_take_a_break_not_shown_already_shown";
                    break;
                case 24:
                    str2 = "ig_ts_take_a_break_tips_launched";
                    break;
                case 25:
                    str2 = "ig_ts_take_a_break_tips_triggered";
                    break;
                case Rfc3492Idn.tmax /*26*/:
                    str2 = "ig_ts_take_a_break_reminder_schedule_success";
                    break;
                case 27:
                    str2 = "ig_ts_take_a_break_reminder_schedule_failure";
                    break;
                case 28:
                    str2 = "ig_ts_take_a_break_not_shown_bloks_transition";
                    break;
                case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /*29*/:
                    str2 = "ig_ts_reminder_set_confirmation_impression";
                    break;
                case 30:
                    str2 = "ig_ts_reminder_set_confirmation_ok_tap";
                    break;
                case 31:
                    str2 = "ig_ts_reminder_set_confirmation_edit_reminder_tap";
                    break;
                case 32:
                    str2 = "ig_ts_reminder_already_enabled_impression";
                    break;
                case 33:
                    str2 = "ig_ts_reminder_already_enabled_edit";
                    break;
                case 34:
                    str2 = "ig_ts_tips_screen_done_tap";
                    break;
                case 35:
                    str2 = "ig_ts_tips_screen_edit_reminder_tap";
                    break;
                case Rfc3492Idn.base /*36*/:
                    str2 = "ig_ts_tips_screen_menu_tap";
                    break;
                case LangUtils.HASH_OFFSET /*37*/:
                    str2 = "ig_ts_tips_screen_menu_help_center_tap";
                    break;
                case Rfc3492Idn.skew /*38*/:
                    str2 = "ig_ts_tips_screen_menu_cancel_tap";
                    break;
                case 39:
                    str2 = "ig_ts_session_start";
                    break;
                case LineChartAxesView.AXIS_TICK_OFFSET /*40*/:
                    str2 = "ig_ts_session_end";
                    break;
                case Seq.NULL_REFNUM /*41*/:
                    str2 = "ig_ts_screen_time_fetch_attempt";
                    break;
                case Seq.RefTracker.REF_OFFSET /*42*/:
                    str2 = "ig_ts_screen_time_all_zero_fetch";
                    break;
                case 43:
                    str2 = "ig_ts_screen_time_data_fetch_retry_scheduled";
                    break;
                case 44:
                    str2 = "ig_ts_screen_time_data_fetch_retry_upload";
                    break;
                default:
                    str2 = "ig_ts_take_a_break_should_have_shown";
                    break;
            }
            C18210wN.A1A(A0I, str2);
            if (num2 != null) {
                switch (num2.intValue()) {
                    case 1:
                        str3 = "ig_ts_entry_point_settings";
                        break;
                    case 2:
                        str3 = "ig_ts_entry_activity_center";
                        break;
                    case 3:
                        str3 = "ig_ts_entry_point_reminder_dialog";
                        break;
                    case 4:
                        str3 = "ig_ts_entry_point_take_a_break_tips";
                        break;
                    case 5:
                        str3 = "ig_ts_entry_point_similar_posts_nudge";
                        break;
                    case 6:
                        str3 = "ig_ts_entry_point_url";
                        break;
                    case 7:
                        str3 = "ig_ts_entry_point_stories";
                        break;
                    case 8:
                        str3 = "ig_ts_entry_point_notification";
                        break;
                    case 9:
                        str3 = "ig_ts_qp";
                        break;
                    case 10:
                        str3 = "ig_ts_entry_point_profile_qp";
                        break;
                    case 11:
                        str3 = "ig_ts_entry_point_direct_header";
                        break;
                    case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                        str3 = "unknown";
                        break;
                    default:
                        str3 = "ig_ts_entry_point_side_tray";
                        break;
                }
            } else {
                str3 = null;
            }
            A0I.A0Q("is_reminder_set", C18190wL.A0Z(A0I, "entrypoint", str3, z));
            A0I.A0T("reminder_type", str);
            A0I.A0S("current_reminder_seconds", Long.valueOf(A04));
            A0I.A0S("previous_reminder_seconds", l);
            if (l2 != null) {
                d = Double.valueOf((double) l2.longValue());
            } else {
                d = null;
            }
            A0I.A0R("usage_seconds", d);
            A0I.A0S("bar_idx", (Long) null);
            if (l3 != null) {
                d2 = Double.valueOf((double) l3.longValue());
            }
            A0I.A0R("session_length", d2);
            A0I.Bb4();
        }
    }

    public static final void A05(UserSession userSession, String str, long j) {
        C04220Ms.A0B(userSession, 0);
        Integer num = AnonymousClass006.A09;
        Long valueOf = Long.valueOf(j);
        A03(userSession, num, (Integer) null, (Long) null, valueOf, valueOf, str);
    }

    public static final void A06(UserSession userSession, String str, long j, long j2) {
        C04220Ms.A0B(userSession, 0);
        A03(userSession, AnonymousClass006.A0j, (Integer) null, Long.valueOf(j2), Long.valueOf(j), (Long) null, str);
    }
}
