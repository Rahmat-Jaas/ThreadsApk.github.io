package X;

import android.content.Context;
import android.content.SharedPreferences;
import com.facebook.common.dextricks.Constants;
import java.util.HashSet;
import java.util.Set;
import kotlin.jvm.internal.IDxLambdaShape52S1100000_I2;

/* renamed from: X.0et  reason: invalid class name and case insensitive filesystem */
public final class C09120et extends C08390dI {
    public static C09120et A3C;
    public static final C08380dH A3D = new C08380dH();
    public static final Set A3E = new HashSet();
    public final SharedPreferences A00;
    public final C08410dK A01 = A0A("blokswww_ig_www_host", "");
    public final C08410dK A02 = A09("arclass_value", -1);
    public final C08410dK A03 = A0B("add_debug_logs_to_rage_shakes", false);
    public final C08410dK A04 = A0B("vc_auto_answer_incoming_call", false);
    public final C08410dK A05 = A08("aymh_fetch_account_center_list");
    public final C08410dK A06 = A08("caa_login_spi");
    public final C08410dK A07 = A0A("caa_saved_foreground_user_id_to_logout", "");
    public final C08410dK A08 = A0B("camera_recording_muxer_stop_timeout_once", false);
    public final C08410dK A09 = A0B("clips_litho_debug_overlay", false);
    public final C08410dK A0A = A0B("debug_clips_remix_green_screen_overlay_enabled", false);
    public final C08410dK A0B = C08390dI.A00(this, "configuration_device_spoof_id");
    public final C08410dK A0C = A0B("configuration_spoof_success", false);
    public final C08410dK A0D = C08390dI.A00(this, "configuration_user_spoof_id");
    public final C08410dK A0E = A0A("crash_report_host_override", "");
    public final C08410dK A0F = A0B("debug_bar", false);
    public final C08410dK A0G = A0B("debug_bar_overlay_mode", false);
    public final C08410dK A0H = A0B("debug_dead_code_detection", false);
    public final C08410dK A0I = C08390dI.A00(this, "debug_head_crash_data");
    public final C08410dK A0J = A0B("debug_cache_layers_enable_disk", true);
    public final C08410dK A0K = A0B("debug_cache_layers_enable_memory", true);
    public final C08410dK A0L = A0A("dev_options_image_color_fidelity", "");
    public final C08410dK A0M = A0B("dev_options_image_in_dither", false);
    public final C08410dK A0N = A09("debug_image_interaction_long_click", 0);
    public final C08410dK A0O = A09("debug_image_network_shaping_delay_per_chunk", 0);
    public final C08410dK A0P = A09("debug_image_network_shaping_fail_after_bytes", -1);
    public final C08410dK A0Q = A09("debug_image_network_shaping_fail_probability", 1);
    public final C08410dK A0R = A0B("debug_image_overlay_cache_key", false);
    public final C08410dK A0S = A0B("dev_options_image_overlay_color_fidelity", false);
    public final C08410dK A0T = A09("debug_image_overlay_display_mode", 0);
    public final C08410dK A0U = A0B("debug_image_overlay_file_size", false);
    public final C08410dK A0V = A0B("debug_image_overlay_image_res", false);
    public final C08410dK A0W = A0B("debug_image_overlay_image_res_perc", false);
    public final C08410dK A0X = A09("debug_image_overlay_load_source", 0);
    public final C08410dK A0Y = A0B("debug_image_overlay_offscreen_pixels_perc", false);
    public final C08410dK A0Z = A0B("debug_image_overlay_scan_num", false);
    public final C08410dK A0a = A0B("show_media_percentage_debug_lines", false);
    public final C08410dK A0b = A09("debug_network_shaping_delay_per_chunk", 0);
    public final C08410dK A0c = A0A("dev_server_health_status", "");
    public final C08410dK A0d = A0A("dev_server_name", "");
    public final C08410dK A0e = C08390dI.A00(this, "direct_video_upload_hostname");
    public final C08410dK A0f = C08390dI.A00(this, "direct_video_upload_ipv6_address");
    public final C08410dK A0g = A0B("disable_post_capture_effect_filters", false);
    public final C08410dK A0h = A0B("debug_enable_1080w_upload", false);
    public final C08410dK A0i = A0B("camera_enable_ar_engine", true);
    public final C08410dK A0j = A0B("camera_enable_dev_sdk", false);
    public final C08410dK A0k = A0B("enable_feed_media_debug_info", false);
    public final C08410dK A0l = A0B("enable_feed_post_only", false);
    public final C08410dK A0m = A0B("enable_feed_seen_state_logging", true);
    public final C08410dK A0n = A0B("enable_force_progressive_videos", false);
    public final C08410dK A0o = A0B("enable_hero_log", false);
    public final C08410dK A0p = A0B("enable_video_debug_utility", false);
    public final C08410dK A0q = A0B("enable_video_source_fetching", false);
    public final C08410dK A0r = A0B("event_sampling_disabled", false);
    public final C08410dK A0s = A0B("force_defer_feed_response", false);
    public final C08410dK A0t = A0B("force_demote_ig_live_story_tray_enabled", false);
    public final C08410dK A0u = A0B("force_disable_gre", false);
    public final C08410dK A0v = A0B("force_stories_in_feed_tray", false);
    public final C08410dK A0w = A0B("force_mock_close_friends_reel", false);
    public final C08410dK A0x = A0B("force_mock_empty_reel", false);
    public final C08410dK A0y = A0B("force_mock_large_reel", false);
    public final C08410dK A0z = A0B("force_mock_many_large_reels", false);
    public final C08410dK A10 = A0B("force_mock_post_live_reel", false);
    public final C08410dK A11 = A0B("force_new_nux_reel", false);
    public final C08410dK A12 = A0B("show_ard_debug_overlay", false);
    public final C08410dK A13 = A0B("force_surfaceview", false);
    public final C08410dK A14 = A0A("gql_ig_www_host", "");
    public final C08410dK A15 = A0A("igds_color_prefix_to_highlight", "no_color");
    public final C08410dK A16 = A0B("show_iglive_mute_audio", false);
    public final C08410dK A17 = A0B("show_iglive_mute_video", false);
    public final C08410dK A18 = A0B("igds_bloks_overlay", false);
    public final C08410dK A19 = A08("local_media_injector_feed_ads_ids");
    public final C08410dK A1A = A08("local_media_injector_feed_netego_ids");
    public final C08410dK A1B = C08390dI.A00(this, "headmoji_sticker_specs");
    public final C08410dK A1C = A08("local_media_injector_reels_ads_ids");
    public final C08410dK A1D = A08("local_media_injector_reels_organic_ids");
    public final C08410dK A1E = A08("local_media_injector_stories_ads_ids");
    public final C08410dK A1F = A08("local_media_injector_stories_netego_ids");
    public final C08410dK A1G = A09("instacrash_loop_test_crashes_left", 0);
    public final C08410dK A1H = A0B("instacrash_loop_test_mode", false);
    public final C08410dK A1I = A0B("enable_background_prefetch_notification", false);
    public final C08410dK A1J = A0B("client_leak_analysis", false);
    public final C08410dK A1K = A0B("camera_mediap_pipeline_debug", false);
    public final C08410dK A1L = A0B("pixel_grid", false);
    public final C08410dK A1M = A0B("push_debug_enabled", false);
    public final C08410dK A1N = A0B("enable_rage_shake_long_press", true);
    public final C08410dK A1O = A0B("save_with_music", false);
    public final C08410dK A1P = A0B("showreel_clickable_layers_indicator_enabled", false);
    public final C08410dK A1Q = A0B("showreel_debug_overlay_enabled", false);
    public final C08410dK A1R = A0B("showreel_ui_elements_indicator_enabled", false);
    public final C08410dK A1S = A0B("showreel_visual_indicator_enabled", false);
    public final C08410dK A1T = A0B("slow_uploads", false);
    public final C08410dK A1U = A0B("enable_stetho", true);
    public final C08410dK A1V = A0B("stories_ads_cta_sticker_safe_zone_barrier_enabled", false);
    public final C08410dK A1W = A0B("sup_debug_overlay", false);
    public final C08410dK A1X = A0B("sup_debug_overlay_ui", false);
    public final C08410dK A1Y = A0B("using_blokswww_ig_www_host", false);
    public final C08410dK A1Z = A0B("using_dev_server", false);
    public final C08410dK A1a = A0B("using_mqtt_sandbox", false);
    public final C08410dK A1b = A09("java_allocations_sampling_size", Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP);
    public final C08410dK A1c = A0B("debug_sdcard_for_tmp_media_file", false);
    public final C08410dK A1d = new C08410dK(new IDxLambdaShape52S1100000_I2(this, "last_app_task_removal_timestamp", 0), new AnonymousClass034(this, "last_app_task_removal_timestamp", true));
    public final C08410dK A1e = A0A("last_navigation_destination", "");
    public final C08410dK A1f = A0A("last_navigation_fragment_classname", "");
    public final C08410dK A1g = A0A("last_navigation_history", "");
    public final C08410dK A1h = A0A("last_navigation_source", "");
    public final C08410dK A1i = new C08410dK(new IDxLambdaShape52S1100000_I2(this, "last_navigation_timestamp", 0), new AnonymousClass034(this, "last_navigation_timestamp", false));
    public final C08410dK A1j = A0B("debug_main_feed_media_overlay_enabled", false);
    public final C08410dK A1k = A09("max_debug_event_count", 100);
    public final C08410dK A1l = A0A("mqtt_server_name", "");
    public final C08410dK A1m = C08390dI.A00(this, "mws_core_host");
    public final C08410dK A1n = C08390dI.A00(this, "mws_www_host");
    public final C08410dK A1o = A09("native_allocations_sampling_size", 524288);
    public final C08410dK A1p = A0A("opengl_renderer", "");
    public final C08410dK A1q = A0A("opengl_vendor", "");
    public final C08410dK A1r = A0B("camera_override_optic_api_level", false);
    public final C08410dK A1s = A09("pixel_guide_size", 8);
    public final C08410dK A1t = C08390dI.A00(this, "pixel_guide_style");
    public final C08410dK A1u = A09("loom_qpl_marker_trigger", -1);
    public final C08410dK A1v = C08390dI.A00(this, "qe_user_bisect_id");
    public final C08410dK A1w = C08390dI.A00(this, "qp_override_ip");
    public final C08410dK A1x = C08390dI.A00(this, "recent_qe");
    public final C08410dK A1y = A0B("stories_id_in_pog_overlay_enabled", false);
    public final C08410dK A1z = A0B("reg_existing_login_success", false);
    public final C08410dK A20 = A0B("reg_existing_login_success_multiple_accounts", false);
    public final C08410dK A21 = A0B("run_ndx_on_cold_start", false);
    public final C08410dK A22 = A0B("run_nux_on_login", false);
    public final C08410dK A23 = A0B("debug_iab_autofill", false);
    public final C08410dK A24 = A0B("hide_internal_only_reel_media", false);
    public final C08410dK A25 = A0B("show_ard_debug_overlay", false);
    public final C08410dK A26 = A0B("auto_media_grouping_debug", false);
    public final C08410dK A27 = A0B("show_camera_debug_info", false);
    public final C08410dK A28 = A0B("camera_gpu_timer_info", false);
    public final C08410dK A29 = A0B("camera_gpu_timer_info_verbose", false);
    public final C08410dK A2A = A0B("show_clips_viewer_debug_overlay", false);
    public final C08410dK A2B = A0B("contextual_music_recommendation_debug", false);
    public final C08410dK A2C = A0B("show_debug_head", false);
    public final C08410dK A2D = A0B("show_event_logger", false);
    public final C08410dK A2E = A0B("show_igds_component_overlay", false);
    public final C08410dK A2F = A0B("show_module_overlay", false);
    public final C08410dK A2G = A0B("show_nametag_debug_overlay", false);
    public final C08410dK A2H = A0B("show_navigation_chain_overlay", false);
    public final C08410dK A2I = A0B("show_navigation_events", false);
    public final C08410dK A2J = A0B("show_phuji_client_debug", false);
    public final C08410dK A2K = A0B("show_player_debug", false);
    public final C08410dK A2L = A0B("show_player_debug_verbose", false);
    public final C08410dK A2M = A0B("show_post_capture_sticker_boundaries", false);
    public final C08410dK A2N = A0B("show_prefetch_debug", false);
    public final C08410dK A2O = A0B("show_reel_mention_boundaries", false);
    public final C08410dK A2P = A0B("show_shared_video_logger_watch_time_debug", false);
    public final C08410dK A2Q = A0B("show_vc_debug", false);
    public final C08410dK A2R = A0B("show_video_views_tracking_debug", false);
    public final C08410dK A2S = A0B("show_viewpoint_overlay", false);
    public final C08410dK A2T = A0B("debug_ssim_dump", false);
    public final C08410dK A2U = A09("story_ads_carousel_opt_in_position", -1);
    public final C08410dK A2V = A0B("story_drafts_use_persisted_media", false);
    public final C08410dK A2W = A0B("rtc_suppress_mqtt", false);
    public final C08410dK A2X = A0B("rtc_suppress_push", false);
    public final C08410dK A2Y = A0B("debug_unlink_accounts_on_logout", false);
    public final C08410dK A2Z = A0B("ikon_overlay", false);
    public final C08410dK A2a = A0B("vc_audio_off", false);
    public final C08410dK A2b = A0B("vc_video_off", false);
    public final C08410dK A2c = A09("video_to_carousel_cut_number", 0);
    public final C08410dK A2d = C08390dI.A00(this, "device_app_startup_country");
    public final C08410dK A2e = A08("aymh_removed_accounts");
    public final C08410dK A2f = A0B("debug_clips_recommender_overlay_enabled", false);
    public final C08410dK A2g = A0B("disable_live_h264", false);
    public final C08410dK A2h = A0B("enable_ads_invalidation_bypass", false);
    public final C08410dK A2i = A0B("vc_enable_mock_participants", false);
    public final C08410dK A2j = A0B("force_off_session_scoping_facebook_account", false);
    public final C08410dK A2k = A0B("gallery_enable_faceboxes", false);
    public final C08410dK A2l = A08("local_media_injector_igtv_ads_ids");
    public final C08410dK A2m = A0B("direct_connectivity_check_enabled", true);
    public final C08410dK A2n = A0B("direct_retries_enabled", true);
    public final C08410dK A2o = A0B("direct_sending_indicator", false);
    public final C08410dK A2p = A0B("direct_hide_xma_viewholders", false);
    public final C08410dK A2q = A0B("leak_detector_toast", false);
    public final C08410dK A2r = A0B("long_press_to_end_room", false);
    public final C08410dK A2s = A0B("msys_debug_overlay", false);
    public final C08410dK A2t = A0B("navigate_to_direct_enabled", false);
    public final C08410dK A2u = A0B("enable_netlog", false);
    public final C08410dK A2v = A0B("nudity_detection_enabled", false);
    public final C08410dK A2w = A0B("enable_promote_debug", false);
    public final C08410dK A2x = A0B("using_gql_ig_www_host", false);
    public final C08410dK A2y = A09("qe_user_bisect_top", -1);
    public final C08410dK A2z = A09("qe_user_bisect_bottom", -1);
    public final C08410dK A30 = A09("render_failures", 0);
    public final C08410dK A31 = C08390dI.A00(this, "sandbox_experience");
    public final C08410dK A32 = A0B("direct_open_rooms_tab", false);
    public final C08410dK A33 = A0B("show_ads_pool_debug_info_overlay", false);
    public final C08410dK A34 = A0B("show_ads_swipe_up_area_overlay", false);
    public final C08410dK A35 = A0B("show_camera_debug_overlay", false);
    public final C08410dK A36 = A0B("gallery_enable_high_concept_card", false);
    public final C08410dK A37 = A0B("gallery_enable_scores_overlay", false);
    public final C08410dK A38 = A0B("show_live_video_debug", false);
    public final C08410dK A39 = A0B("show_vc_stats", false);
    public final C08410dK A3A = A09("upload_failures", 0);
    public final C08410dK A3B = A0A("waterfall_id", "");

    public static final synchronized C09120et A02() {
        C09120et A002;
        synchronized (C09120et.class) {
            A002 = A3D.A00();
        }
        return A002;
    }

    public static final synchronized C09120et A03(Context context) {
        C09120et A012;
        synchronized (C09120et.class) {
            A012 = A3D.A01(context);
        }
        return A012;
    }

    public final void A0F(String str) {
        C04220Ms.A0B(str, 0);
        this.A3B.A01.invoke(str);
    }

    public final void A0G(Set set) {
        C04220Ms.A0B(set, 0);
        this.A2e.A01.invoke(set);
    }

    public final String A0D() {
        return (String) this.A3B.A00.invoke();
    }

    public final Set A0E() {
        return (Set) this.A2e.A00.invoke();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0040, code lost:
        if (r0 >= 0) goto L_0x0042;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A0H() {
        /*
            r11 = this;
            android.content.SharedPreferences r9 = r11.A00
            java.lang.String r1 = "debug_allow_user_certs_ttl"
            java.lang.String r0 = ""
            java.lang.String r2 = r9.getString(r1, r0)
            X.C04220Ms.A0A(r2)
            java.lang.String r1 = ":"
            X.7yC r0 = new X.7yC
            r0.<init>(r1)
            r6 = 0
            java.util.List r1 = r0.A02(r2, r6)
            java.lang.String[] r0 = new java.lang.String[r6]
            java.lang.Object[] r2 = r1.toArray(r0)
            java.lang.String[] r2 = (java.lang.String[]) r2
            int r1 = r2.length
            java.lang.String r5 = "debug_allow_user_certs"
            r10 = 1
            r0 = 2
            if (r1 != r0) goto L_0x004f
            r0 = r2[r6]     // Catch:{ NumberFormatException -> 0x004f }
            long r7 = java.lang.Long.parseLong(r0)     // Catch:{ NumberFormatException -> 0x004f }
            r0 = r2[r10]     // Catch:{ NumberFormatException -> 0x004f }
            long r3 = java.lang.Long.parseLong(r0)     // Catch:{ NumberFormatException -> 0x004f }
            long r1 = java.lang.System.currentTimeMillis()     // Catch:{ NumberFormatException -> 0x004f }
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r0 < 0) goto L_0x0042
            long r1 = r1 - r7
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            r1 = 0
            if (r0 < 0) goto L_0x0050
        L_0x0042:
            r1 = 1
            android.content.SharedPreferences$Editor r0 = r9.edit()     // Catch:{ NumberFormatException -> 0x0050 }
            android.content.SharedPreferences$Editor r0 = r0.putBoolean(r5, r6)     // Catch:{ NumberFormatException -> 0x0050 }
            r0.apply()     // Catch:{ NumberFormatException -> 0x0050 }
            goto L_0x0050
        L_0x004f:
            r1 = 0
        L_0x0050:
            boolean r0 = r9.getBoolean(r5, r6)
            if (r0 == 0) goto L_0x005a
            if (r1 != 0) goto L_0x005a
            r6 = 1
        L_0x0059:
            return r6
        L_0x005a:
            java.util.Set r0 = A3E
            boolean r0 = r0.contains(r5)
            if (r0 == 0) goto L_0x0059
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C09120et.A0H():boolean");
    }

    public final boolean A0I() {
        boolean z = this.A00.getBoolean("debug_disable_liger_fizz", false);
        if (z || !A3E.contains("debug_disable_liger_fizz")) {
            return z;
        }
        return true;
    }

    public final boolean A0J() {
        return ((Boolean) this.A2h.A00.invoke()).booleanValue();
    }

    public final boolean A0K() {
        return ((Boolean) this.A0o.A00.invoke()).booleanValue();
    }

    public final boolean A0L() {
        return ((Boolean) this.A2i.A00.invoke()).booleanValue();
    }

    public final boolean A0M() {
        if (this.A0B.A00.invoke() != null) {
            return true;
        }
        return false;
    }

    public final boolean A0N() {
        if (this.A0D.A00.invoke() != null) {
            return true;
        }
        return false;
    }

    public final boolean A0O() {
        if (this.A1v.A00.invoke() != null) {
            return true;
        }
        return false;
    }

    public final boolean A0P() {
        return ((Boolean) this.A16.A00.invoke()).booleanValue();
    }

    public final boolean A0Q() {
        return ((Boolean) this.A33.A00.invoke()).booleanValue();
    }

    public final boolean A0R() {
        return ((Boolean) this.A35.A00.invoke()).booleanValue();
    }

    public final boolean A0S() {
        return ((Boolean) this.A2C.A00.invoke()).booleanValue();
    }

    public final boolean A0T() {
        return ((Boolean) this.A38.A00.invoke()).booleanValue();
    }

    public final boolean A0U() {
        return ((Boolean) this.A2J.A00.invoke()).booleanValue();
    }

    public final boolean A0V() {
        return ((Boolean) this.A2K.A00.invoke()).booleanValue();
    }

    public final boolean A0W() {
        if (((Boolean) this.A11.A00.invoke()).booleanValue() || ((Boolean) this.A10.A00.invoke()).booleanValue() || ((Boolean) this.A0w.A00.invoke()).booleanValue() || ((Boolean) this.A0y.A00.invoke()).booleanValue() || ((Boolean) this.A0z.A00.invoke()).booleanValue() || ((Boolean) this.A0x.A00.invoke()).booleanValue()) {
            return true;
        }
        return false;
    }

    public final boolean A0X() {
        return ((Boolean) this.A1Z.A00.invoke()).booleanValue();
    }

    public final boolean A0Y() {
        return ((Boolean) this.A2x.A00.invoke()).booleanValue();
    }

    public final SharedPreferences A0C() {
        return this.A00;
    }

    public C09120et(Context context) {
        this.A00 = C08340dC.A00(context, "devprefs");
    }
}
