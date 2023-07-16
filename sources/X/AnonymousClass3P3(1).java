package X;

import android.content.SharedPreferences;
import com.instagram.service.session.UserSession;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;

/* renamed from: X.3P3  reason: invalid class name */
public final class AnonymousClass3P3 {
    public static C207916c A00(TimeUnit timeUnit, int i, long j) {
        return new C207916c(0, i, (int) timeUnit.toSeconds(j), false);
    }

    public static final Map A01(UserSession userSession) {
        UserSession userSession2 = userSession;
        C04220Ms.A0B(userSession2, 0);
        AnonymousClass3ZL A03 = AnonymousClass3Zu.A03(userSession2);
        C28161tl A01 = AnonymousClass3WS.A01(userSession2);
        SharedPreferences sharedPreferences = A03.A04;
        int i = (C18180wK.A1X((sharedPreferences.getLong("PREFERENCE_REELS_SHARE_TO_FACEBOOK_SIMPLIFICATION_UPSELL_LAST_SEEN", 0) > 0 ? 1 : (sharedPreferences.getLong("PREFERENCE_REELS_SHARE_TO_FACEBOOK_SIMPLIFICATION_UPSELL_LAST_SEEN", 0) == 0 ? 0 : -1))) ? 1 : 0) + (C18180wK.A1X((sharedPreferences.getLong("PREFERENCE_REELS_SHARE_TO_FACEBOOK_SIMPLIFICATION_V_1_5_UPSELL_LAST_SEEN", 0) > 0 ? 1 : (sharedPreferences.getLong("PREFERENCE_REELS_SHARE_TO_FACEBOOK_SIMPLIFICATION_V_1_5_UPSELL_LAST_SEEN", 0) == 0 ? 0 : -1))) ? 1 : 0);
        C313425p r7 = C313425p.A01;
        SharedPreferences sharedPreferences2 = A01.A00;
        int i2 = sharedPreferences2.getInt("fb_feed_crossposting_only_me_privacy_prompt_times_shown", 0);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        Pair A0p = C18180wK.A0p(r7, A00(timeUnit, i2, sharedPreferences2.getLong("fb_feed_crossposting_only_me_privacy_prompt_time_stamp_ms", 0)));
        Pair A0p2 = C18180wK.A0p(C313425p.A02, A00(timeUnit, sharedPreferences.getInt("PREFERENCE_CROSSPOST_TO_FACEBOOK_UPSELL_VIEW_COUNT", 0), sharedPreferences.getLong("PREFERENCE_CROSSPOST_TO_FACEBOOK_UPSELL_LAST_SEEN_TIME_MS", 0)));
        Pair A0p3 = C18180wK.A0p(C313425p.A03, new C207916c(0, sharedPreferences2.getInt("feed_xpost_user_migration_upsell_display_count", 0), (int) sharedPreferences2.getLong("feed_xpost_user_migration_upsell_last_seen_sec", 0), false));
        Pair A0p4 = C18180wK.A0p(C313425p.A04, new C207916c(0, sharedPreferences2.getInt("feed_xpost_user_migration_upsell_second_wave_display_count", 0), (int) sharedPreferences2.getLong("feed_xpost_user_migration_upsell_second_wave_last_seen_sec", 0), false));
        Pair A0p5 = C18180wK.A0p(C313425p.A05, new C207916c(0, sharedPreferences2.getInt("story_xpost_user_migration_upsell_display_count", 0), (int) sharedPreferences2.getLong("story_xpost_user_migration_upsell_last_seen_sec", 0), false));
        Pair A0p6 = C18180wK.A0p(C313425p.A06, new C207916c(0, sharedPreferences2.getInt("story_xpost_user_migration_upsell_second_wave_display_count", 0), (int) sharedPreferences2.getLong("story_xpost_user_migration_upsell_second_wave_last_seen_sec", 0), false));
        Pair A0p7 = C18180wK.A0p(C313425p.A07, new C207916c(0, sharedPreferences2.getInt("xpost_unified_onboarding_upsell_display_count", 0), (int) sharedPreferences2.getLong("xpost_unified_onboarding_upsell_last_seen_sec", 0), false));
        Pair A0p8 = C18180wK.A0p(C313425p.A08, new C207916c(0, sharedPreferences2.getBoolean("fx_cal_ig_fb_feed_crosspost_after_share_ac_upsell_seen", false) ? 1 : 0, (int) sharedPreferences.getLong("PREFERENCE_SHARED_UPSELL_COOLDOWNS_LAST_SEEN_SECONDS_FEED", 0), false));
        Pair A0p9 = C18180wK.A0p(C313425p.A09, A00(timeUnit, i, Math.max(sharedPreferences.getLong("PREFERENCE_REELS_SHARE_TO_FACEBOOK_SIMPLIFICATION_V_1_5_UPSELL_LAST_SEEN", 0), sharedPreferences.getLong("PREFERENCE_REELS_SHARE_TO_FACEBOOK_SIMPLIFICATION_UPSELL_LAST_SEEN", 0))));
        Pair A0p10 = C18180wK.A0p(C313425p.A0A, A00(timeUnit, !A03.A07() ? 1 : 0, sharedPreferences.getLong("PREFERENCE_REELS_XAR_UPSELL_LAST_SEEN_MS", 0)));
        Pair A0p11 = C18180wK.A0p(C313425p.A0B, A00(timeUnit, C28161tl.A04(userSession2).getInt("dialog_after_sharing_feed_show_times", 0), sharedPreferences2.getLong("dialog_after_sharing_feed_time_stamp", 0)));
        Pair A0p12 = C18180wK.A0p(C313425p.A0C, A00(timeUnit, C28161tl.A04(userSession2).getInt("dialog_after_sharing_story_show_times", 0), sharedPreferences2.getLong("dialog_after_sharing_story_time_stamp", 0)));
        Pair A0p13 = C18180wK.A0p(C313425p.A0D, new C207916c(0, C28161tl.A04(userSession2).getInt("feed_fb_autoshare_upsell_dialog_display_count", 0), (int) sharedPreferences2.getLong("feed_fb_autoshare_upsell_dialog_last_seen_sec", 0), false));
        Pair A0p14 = C18180wK.A0p(C313425p.A0E, new C207916c(0, sharedPreferences2.getInt("direct_sharesheet_auto_share_to_fb_dialog_display_count", 0), (int) sharedPreferences2.getLong("last_seen_direct_sharesheet_auto_share_to_fb_dialog_sec", 0), false));
        Pair A0p15 = C18180wK.A0p(C313425p.A0G, A00(timeUnit, sharedPreferences2.getInt("fb_feed_crossposting_toggle_tooltip_show_times", 0), sharedPreferences2.getLong("fb_feed_crossposting_toggle_tooltip_last_seen_time_in_ms", 0)));
        Pair A0p16 = C18180wK.A0p(C313425p.A0H, new C207916c(0, sharedPreferences2.getInt("fb_currently_sharing_feed_tooltip_show_times", 0), 0, false));
        C313425p r8 = C313425p.A0I;
        Map A0H = AnonymousClass4WJ.A0H(A0p, A0p2, A0p3, A0p4, A0p5, A0p6, A0p7, A0p8, A0p9, A0p10, A0p11, A0p12, A0p13, A0p14, A0p15, A0p16, C18180wK.A0p(r8, new C207916c(0, sharedPreferences2.getInt("reel_one_tap_fbshare_tooltip_count", 0), (int) sharedPreferences2.getLong("reel_one_tap_fbshare_tooltip_last_seen_sec", 0), false)), C18180wK.A0p(r8, new C207916c(0, sharedPreferences2.getInt("reel_one_tap_fbshare_tooltip_count", 0), (int) sharedPreferences2.getLong("reel_one_tap_fbshare_tooltip_last_seen_sec", 0), false)), C18180wK.A0p(C313425p.A0J, A00(timeUnit, sharedPreferences2.getInt("xshare_facebook_page_nux_impression", 0), sharedPreferences2.getLong("xshare_facebook_page_nux_last_seen_time", 0))), C18180wK.A0p(C313425p.A0K, new C207916c(0, sharedPreferences2.getBoolean("seen_also_share_to_nux", false) ? 1 : 0, (int) sharedPreferences.getLong("PREFERENCE_SHARED_UPSELL_COOLDOWNS_LAST_SEEN_SECONDS_REEL", 0), false)), C18180wK.A0p(C313425p.A0L, new C207916c(0, sharedPreferences.getBoolean("PREFERENCE_REELS_HAS_SHOWN_CROSS_POST_TO_FACEBOOK_TOOLTIP", false) ? 1 : 0, (int) sharedPreferences.getLong("PREFERENCE_SHARED_UPSELL_COOLDOWNS_LAST_SEEN_SECONDS_REEL", 0), false)), C18180wK.A0p(C313425p.A0M, A00(timeUnit, sharedPreferences2.getInt("story_composer_my_story_fb_share_nux_tooltip_count", 0), sharedPreferences2.getLong("story_composer_my_story_fb_share_nux_tooltip_last_seen", 0))), C18180wK.A0p(C313425p.A0N, new C207916c(0, sharedPreferences2.getInt("story_composer_my_story_button_nux_tooltip_count", 0), sharedPreferences2.getInt("story_last_server_xposting_turn_on_time_in_second", -1), false)), C18180wK.A0p(C313425p.A0P, new C207916c(0, A03.A02(), 0, false)), C18180wK.A0p(C313425p.A0Q, A00(timeUnit, sharedPreferences.getInt("PREFERENCE_REELS_XAR_CCP_MIGRATION_UPSELL_SEEN_COUNT", 0), sharedPreferences.getLong("PREFERENCE_REELS_XAR_CCP_MIGRATION_UPSELL_LAST_SEEN_MS", 0))));
        LinkedHashMap A0y = C18220wO.A0y();
        Iterator A0z = AnonymousClass0wJ.A0z(A0H);
        while (A0z.hasNext()) {
            Map.Entry A0o = C18180wK.A0o(A0z);
            if (((C207916c) A0o.getValue()).A00 > 0) {
                C18210wN.A1Q(A0y, A0o);
            }
        }
        return A0y;
    }
}
