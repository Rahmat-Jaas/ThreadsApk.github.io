package X;

import ch.boye.httpclientandroidlib.HttpStatus;
import com.instagram.react.modules.base.IgReactQEModule;

/* renamed from: X.2Js  reason: invalid class name and case insensitive filesystem */
public final class C34482Js {
    public static final String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return I17.A00(HttpStatus.SC_MULTI_STATUS);
            case 2:
                return "feed_gallery_main_button";
            case 3:
                return "main_camera_button";
            case 4:
                return "profile_unified_composer";
            case 5:
                return "start_live_from_user_profile";
            case 6:
                return "stories_main_camera_button";
            case 7:
                return "swipe";
            case 8:
                return "activity_feed";
            case 9:
                return "gallery";
            case 10:
                return "hamburger";
            case 11:
                return "post_advanced_settings";
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                return "reels_advanced_settings";
            case 13:
                return "reschedule";
            case 14:
                return "pro_home";
            case 15:
                return "unknown";
            default:
                return "bottom_nav_bar_plus";
        }
    }
}
