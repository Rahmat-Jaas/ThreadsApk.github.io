package com.instagram.debug.devoptions.section.contentliquidity;

import X.AnonymousClass0wJ;
import X.AnonymousClass3WS;
import X.AnonymousClass3ZL;
import X.AnonymousClass3Zu;
import X.AnonymousClass4MA;
import X.AnonymousClass4MC;
import X.C18180wK;
import X.C28161tl;
import android.content.SharedPreferences;
import androidx.fragment.app.FragmentActivity;
import com.instagram.debug.devoptions.section.intf.DeveloperOptionsSection;
import com.instagram.service.session.UserSession;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public final class ContentLiquidityOptions implements DeveloperOptionsSection {
    public final int titleRes = 2131825051;

    /* access modifiers changed from: private */
    public final void resetAllUpsells(C28161tl r7, UserSession userSession) {
        SharedPreferences sharedPreferences = r7.A00;
        AnonymousClass0wJ.A11(sharedPreferences.edit(), "story_xpost_user_migration_upsell_display_count", 0);
        AnonymousClass0wJ.A12(sharedPreferences.edit(), "story_xpost_user_migration_upsell_last_seen_sec", 0);
        AnonymousClass0wJ.A11(sharedPreferences.edit(), "story_xpost_user_migration_upsell_second_wave_display_count", 0);
        AnonymousClass0wJ.A12(sharedPreferences.edit(), "story_xpost_user_migration_upsell_second_wave_last_seen_sec", 0);
        AnonymousClass0wJ.A11(sharedPreferences.edit(), "feed_xpost_user_migration_upsell_display_count", 0);
        AnonymousClass0wJ.A12(sharedPreferences.edit(), "feed_xpost_user_migration_upsell_last_seen_sec", 0);
        AnonymousClass0wJ.A11(sharedPreferences.edit(), "feed_xpost_user_migration_upsell_second_wave_display_count", 0);
        AnonymousClass0wJ.A12(sharedPreferences.edit(), "feed_xpost_user_migration_upsell_second_wave_last_seen_sec", 0);
        AnonymousClass0wJ.A11(sharedPreferences.edit(), "xpost_unified_onboarding_upsell_display_count", 0);
        AnonymousClass0wJ.A12(sharedPreferences.edit(), "xpost_unified_onboarding_upsell_last_seen_sec", 0);
        resetTooltips(r7, userSession);
        resetRowshareUpsells(r7);
        resetDialogs(r7);
        resetOnlyMeUpsell(r7);
        resetSharedCooldowns(userSession);
        resetMediaCreationCooldowns(userSession);
        resetMultipleUpsellDismissalCooldowns(userSession);
        resetXpostSettingDisableCooldowns(userSession);
    }

    /* access modifiers changed from: private */
    public final void resetDialogs(C28161tl r9) {
        SharedPreferences sharedPreferences = r9.A00;
        AnonymousClass0wJ.A11(sharedPreferences.edit(), "dialog_after_sharing_story_show_times", 0);
        AnonymousClass0wJ.A12(sharedPreferences.edit(), "dialog_after_sharing_story_time_stamp", 0);
        AnonymousClass0wJ.A11(sharedPreferences.edit(), "dialog_after_sharing_feed_show_times", 0);
        AnonymousClass0wJ.A12(sharedPreferences.edit(), "dialog_after_sharing_feed_time_stamp", 0);
        AnonymousClass0wJ.A11(sharedPreferences.edit(), "feed_fb_autoshare_upsell_dialog_display_count", 0);
        AnonymousClass0wJ.A12(C28161tl.A02(r9), "feed_fb_autoshare_upsell_dialog_last_seen_sec", TimeUnit.MILLISECONDS.toSeconds(0));
        AnonymousClass0wJ.A11(sharedPreferences.edit(), "direct_sharesheet_auto_share_to_fb_dialog_display_count", 0);
        AnonymousClass0wJ.A12(sharedPreferences.edit(), "last_seen_direct_sharesheet_auto_share_to_fb_dialog_sec", 0);
    }

    /* access modifiers changed from: private */
    public final void resetOnlyMeUpsell(C28161tl r6) {
        SharedPreferences sharedPreferences = r6.A00;
        AnonymousClass0wJ.A11(sharedPreferences.edit(), "fb_feed_crossposting_only_me_privacy_prompt_times_shown", 0);
        AnonymousClass0wJ.A12(sharedPreferences.edit(), "fb_feed_crossposting_only_me_privacy_prompt_time_stamp_ms", 0);
    }

    /* access modifiers changed from: private */
    public final void resetRowshareUpsells(C28161tl r8) {
        SharedPreferences sharedPreferences = r8.A00;
        AnonymousClass0wJ.A13(sharedPreferences.edit(), "fb_feed_crossposting_like_sheet_upsell_has_dismissed", false);
        AnonymousClass0wJ.A13(sharedPreferences.edit(), "fx_cal_story_viewers_dashboard_upsell_dismissed", false);
        SharedPreferences.Editor A02 = C28161tl.A02(r8);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        AnonymousClass0wJ.A12(A02, "reel_one_tap_fbshare_tooltip_last_seen_sec", timeUnit.toSeconds(0));
        AnonymousClass0wJ.A12(C28161tl.A02(r8), "feed_fb_autoshare_upsell_dialog_last_seen_sec", timeUnit.toSeconds(0));
    }

    /* access modifiers changed from: private */
    public final void resetTooltips(C28161tl r9, UserSession userSession) {
        SharedPreferences sharedPreferences = r9.A00;
        AnonymousClass0wJ.A11(sharedPreferences.edit(), "reel_one_tap_fbshare_tooltip_count", 0);
        AnonymousClass0wJ.A12(C28161tl.A02(r9), "reel_one_tap_fbshare_tooltip_last_seen_sec", TimeUnit.MILLISECONDS.toSeconds(0));
        AnonymousClass0wJ.A12(sharedPreferences.edit(), "fb_feed_crossposting_toggle_tooltip_last_seen_time_in_ms", 0);
        AnonymousClass0wJ.A11(sharedPreferences.edit(), "fb_feed_crossposting_advanced_settings_tooltip", 0);
        AnonymousClass0wJ.A13(sharedPreferences.edit(), "seen_also_share_to_nux", false);
        AnonymousClass0wJ.A13(AnonymousClass3Zu.A01(userSession), "PREFERENCE_REELS_HAS_SHOWN_CROSS_POST_TO_FACEBOOK_TOOLTIP", false);
        AnonymousClass0wJ.A13(AnonymousClass3ZL.A00(AnonymousClass3Zu.A03(userSession)), "PREFERENCE_HAS_SEEN_SHARE_TO_FACEBOOK_TOOLTIP_ON_PANAVISION_M15", false);
        AnonymousClass0wJ.A11(sharedPreferences.edit(), "xshare_facebook_page_nux_impression", 0);
        AnonymousClass0wJ.A12(sharedPreferences.edit(), "xshare_facebook_page_nux_last_seen_time", 0);
        AnonymousClass0wJ.A11(sharedPreferences.edit(), "story_composer_my_story_fb_share_nux_tooltip_count", 0);
        AnonymousClass0wJ.A12(sharedPreferences.edit(), "story_composer_my_story_fb_share_nux_tooltip_last_seen", 0);
    }

    public Integer getTitleRes() {
        return Integer.valueOf(this.titleRes);
    }

    /* access modifiers changed from: private */
    public final void resetMediaCreationCooldowns(UserSession userSession) {
        C18180wK.A0u(AnonymousClass3Zu.A00(AnonymousClass3Zu.A00(AnonymousClass3Zu.A01(userSession), userSession, "PREFERENCE_STORIES_POSTS_SINCE_LAST_STORIES_UPSELL_IMPRESSION"), userSession, "PREFERENCE_FEED_POSTS_SINCE_LAST_FEED_UPSELL_IMPRESSION"), "PREFERENCE_REELS_POSTS_SINCE_LAST_REELS_UPSELL_IMPRESSION");
    }

    /* access modifiers changed from: private */
    public final void resetMultipleUpsellDismissalCooldowns(UserSession userSession) {
        C18180wK.A0u(AnonymousClass3Zu.A00(AnonymousClass3Zu.A00(AnonymousClass3Zu.A00(AnonymousClass3Zu.A00(AnonymousClass3Zu.A00(AnonymousClass3Zu.A01(userSession), userSession, "PREFERENCE_FEED_DISMISSED_UPSELLS_SINCE_COOLDOWN"), userSession, "PREFERENCE_FEED_UPSELL_LAST_DISMISSED_SECONDS"), userSession, "PREFERENCE_STORIES_DISMISSED_UPSELLS_SINCE_COOLDOWN"), userSession, "PREFERENCE_STORIES_UPSELL_LAST_DISMISSED_SECONDS"), userSession, "PREFERENCE_REELS_DISMISSED_UPSELLS_SINCE_COOLDOWN"), "PREFERENCE_REELS_UPSELL_LAST_DISMISSED_SECONDS");
    }

    /* access modifiers changed from: private */
    public final void resetSharedCooldowns(UserSession userSession) {
        C18180wK.A0u(AnonymousClass3Zu.A00(AnonymousClass3Zu.A00(AnonymousClass3Zu.A00(AnonymousClass3Zu.A01(userSession), userSession, "PREFERENCE_SHARED_UPSELL_COOLDOWNS_LAST_SEEN_SECONDS_FEED"), userSession, "PREFERENCE_SHARED_UPSELL_COOLDOWNS_LAST_SEEN_SECONDS_STORY"), userSession, "PREFERENCE_SHARED_UPSELL_COOLDOWNS_LAST_SEEN_SECONDS_REEL"), "PREFERENCE_SHARED_UPSELL_COOLDOWNS_LAST_SEEN_SECONDS_GLOBAL");
    }

    /* access modifiers changed from: private */
    public final void resetXpostSettingDisableCooldowns(UserSession userSession) {
        C18180wK.A0u(AnonymousClass3Zu.A00(AnonymousClass3Zu.A00(AnonymousClass3Zu.A00(AnonymousClass3Zu.A01(userSession), userSession, "PREFERENCE_FEED_CROSSPOST_SETTING_LAST_DISABLED_SECONDS"), userSession, "PREFERENCE_STORY_CROSSPOST_SETTING_LAST_DISABLED_SECONDS"), userSession, "PREFERENCE_REEL_CROSSPOST_SETTING_LAST_DISABLED_SECONDS"), "PREFERENCE_REEL_RECOMMEND_SETTING_LAST_DISABLED_SECONDS");
    }

    public List getItems(UserSession userSession, FragmentActivity fragmentActivity) {
        C28161tl A00 = AnonymousClass3WS.A00(userSession);
        ArrayList A0v = AnonymousClass0wJ.A0v();
        AnonymousClass4MA.A03(new ContentLiquidityOptions$getItems$1(this, A00, userSession), A0v, 2131825053);
        AnonymousClass4MA.A03(new ContentLiquidityOptions$getItems$2(A00), A0v, 2131825058);
        AnonymousClass4MA.A03(new ContentLiquidityOptions$getItems$3(A00), A0v, 2131825059);
        AnonymousClass4MA.A03(new ContentLiquidityOptions$getItems$4(A00), A0v, 2131825060);
        AnonymousClass4MA.A03(new ContentLiquidityOptions$getItems$5(A00), A0v, 2131825061);
        AnonymousClass4MA.A03(new ContentLiquidityOptions$getItems$6(A00), A0v, 2131825054);
        AnonymousClass4MA.A03(new ContentLiquidityOptions$getItems$7(A00), A0v, 2131825055);
        AnonymousClass4MA.A03(new ContentLiquidityOptions$getItems$8(A00), A0v, 2131825056);
        AnonymousClass4MA.A03(new ContentLiquidityOptions$getItems$9(A00), A0v, 2131825057);
        AnonymousClass4MA.A03(new ContentLiquidityOptions$getItems$10(A00), A0v, 2131825070);
        AnonymousClass4MA.A03(new ContentLiquidityOptions$getItems$11(A00), A0v, 2131825071);
        AnonymousClass4MA.A03(new ContentLiquidityOptions$getItems$12(this, A00, userSession), A0v, 2131825069);
        AnonymousClass4MA.A03(new ContentLiquidityOptions$getItems$13(this, A00), A0v, 2131825066);
        AnonymousClass4MA.A03(new ContentLiquidityOptions$getItems$14(this, A00), A0v, 2131825062);
        AnonymousClass4MA.A03(new ContentLiquidityOptions$getItems$15(this, A00), A0v, 2131825065);
        AnonymousClass4MA.A03(new ContentLiquidityOptions$getItems$16(this, userSession), A0v, 2131825068);
        AnonymousClass4MA.A03(new ContentLiquidityOptions$getItems$17(this, userSession), A0v, 2131825067);
        AnonymousClass4MA.A03(new ContentLiquidityOptions$getItems$18(this, userSession), A0v, 2131825063);
        AnonymousClass4MA.A03(new ContentLiquidityOptions$getItems$19(this, userSession), A0v, 2131825064);
        AnonymousClass4MC.A07(new ContentLiquidityOptions$getItems$20(userSession), A0v, 2131825049, AnonymousClass3Zu.A02(userSession).getBoolean("PREFERENCE_SHARED_COOLDOWN_ENABLED", true));
        AnonymousClass4MC.A07(new ContentLiquidityOptions$getItems$21(userSession), A0v, 2131825048, AnonymousClass3Zu.A02(userSession).getBoolean("PREFERENCE_SETTING_DISABLE_COOLDOWN_ENABLED", true));
        AnonymousClass4MC.A07(new ContentLiquidityOptions$getItems$22(userSession), A0v, 2131825046, AnonymousClass3Zu.A02(userSession).getBoolean("PREFERENCE_CREATED_MEDIA_COOLDOWN_ENABLED", true));
        AnonymousClass4MC.A07(new ContentLiquidityOptions$getItems$23(userSession), A0v, 2131825047, AnonymousClass3Zu.A02(userSession).getBoolean("PREFERENCE_MULTIPLE_UPSELL_DISMISSAL_ENABLED", true));
        return A0v;
    }

    public /* synthetic */ boolean isEnabled(UserSession userSession) {
        return true;
    }
}
