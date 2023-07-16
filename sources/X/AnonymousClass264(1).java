package X;

/* renamed from: X.264  reason: invalid class name */
public enum AnonymousClass264 {
    A0c("sign_up", 0),
    A0H("log_in", 1),
    A0R("profile_pic_homepage", 2),
    A0S("profile_pic_reg", 3),
    A0L("nux_find_friends_dialog", 4),
    A0K("nux_find_friends", 5),
    A0M("nux_main_screen", 6),
    A0J("nux_main_screen", 7),
    A0I("megaphone", 8),
    A0N("options_follow_people", 9),
    A0D("graphql_auth", 10),
    A0b("share_photo", 11),
    A0O("options_linked_accounts", 12),
    A0C("follow_people", 13),
    A03("business_back_to_personal", 14),
    A06("claim_page", 15),
    A08("delta_challenge", 16),
    A0W("reel_settings", 17),
    A0a("share_advanced_settings", 18),
    A0Y("reel_viewer_self_story", 19),
    A09("direct_inbox_tab", 20),
    A0T("quick_promotion", 21),
    A0V("reauth", 22),
    A05("business_switch_page", 23),
    A0A("discover_accounts", 24),
    INTEROP("interop"),
    REACHABILLITY("reachability"),
    PROFESSIONAL_OPTION_LINKED_ACCOUNTS("professional_share_settings"),
    BUSINESS_CONNECT_FB_PAGE("business_connect_fb_page"),
    REEL_STORY_VIEWERS_DASHBOARD_BOTTOM("reel_story_viewers_dashboard_bottom"),
    RIGHT_BEFORE_LOGOUT_SSO_UPSELL("right_before_logout_sso_upsell"),
    CREATOR_ACCOUNT_CONVERSION("creator_account_conversion"),
    FEED_CROSS_POSTING_AFTER_SHARE_CHAINING_UPSELL("feed_cross_posting_after_share_chaining_upsell"),
    PROFILE_PHOTO_CHANGE_CHAINING_UPSELL("profile_photo_change_chaining_upsell"),
    IG_FB_NUX_FIND_FRIENDS("ig_fb_nux_find_friends"),
    IG_FB_PROFILE_PIC_REG("ig_fb_profile_pic_reg"),
    SMB__FEED_CONTEXTUAL_PROFILE__PROMOTED_POSTS__FB_LOGIN("smb__feed_contextual_profile__promoted_posts__fb_login"),
    SMB__FEED_CONTEXTUAL_SELF_PROFILE__PROMOTED_POSTS__FB_LOGIN("smb__feed_contextual_self_profile__promoted_posts__fb_login"),
    SMB__FEED_TIMELINE__PROMOTED_POSTS__FB_LOGIN("smb__feed_timeline__promoted_posts__fb_login"),
    SMB__REEL_PROFILE__PROMOTED_POSTS__FB_LOGIN("smb__reel_profile__promoted_posts__fb_login"),
    SMB__REEL_FEED_TIMELINE__PROMOTED_POSTS_FB_LOGIN("smb__reel_feed_timeline__promoted_posts__fb_login"),
    SMB__REEL_DASHBOARD__PROMOTED_POSTS_FB_LOGIN("smb__reel_dashboard__promoted_posts__fb_login"),
    SMB__ADS_MANAGER__PROMOTED_POSTS__FB_LOGIN("smb__ads_manager__promoted_posts__fb_login"),
    SMB__ADS_MANAGER_SUGGESTED_POST__PROMOTED_POSTS__FB_LOGIN("smb__ads_manager_suggested_post__promoted_posts__fb_login"),
    SMB__BLOKS__PROMOTED_POSTS__FB_LOGIN("smb__bloks__promoted_posts__fb_login"),
    SMB__SETTING__PROMOTED_POSTS__PROMOTION_PAYMENT("smb__setting__promoted_posts__promotion_payment"),
    SMB__EDIT_PROFILE__EDIT_PROFILE__CLAIM_PAGE("smb__edit_profile__edit_profile__claim_page"),
    SMB__SETTING__EDIT_PROFILE__CLAIM_PAGE("smb__setting__edit_profile__claim_page"),
    SMB__EDIT_PROFILE__EDIT_PROFILE__FACEBOOK_CONNECT("smb__edit_profile__edit_profile__facebook_connect"),
    SMB__SETTING__EDIT_PROFILE__FACEBOOK_CONNECT("smb__setting__edit_profile__facebook_connect"),
    SMB__EDIT_PROFILE__PAGE_CONFIRMATION__REVIEW_CONNECTION("smb__edit_profile__page_confirmation__review_connection"),
    SMB__SETTING__INSTAGRAM_SHOPPING__ONBOARDING("smb__setting__instagram_shopping__onboarding"),
    SMB__SETTING__BUSINESS_CONVERSION__FACEBOOK_CONNECT("smb__setting__business_conversion__facebook_connect"),
    SMB__EDIT_PROFILE__BUSINESS_CONVERSION__FACEBOOK_CONNECT("smb__edit_profile__business_conversion__facebook_connect"),
    SMB__SETTING__BUSINESS_CONVERSION__SWITCH_BACK("smb__setting__business_conversion__switch_back");
    
    public final Integer A00;
    public final String A01;

    public final String A00() {
        String str;
        String str2 = this.A01;
        switch (str2.hashCode()) {
            case -993045025:
                if (str2.equals("profile_photo_change_chaining_upsell")) {
                    return "ig_profile_photo_change_chaining";
                }
                break;
            case -41098153:
                if (str2.equals("reachability")) {
                    return "ig_interop_reachability_settings";
                }
                break;
            case 26599175:
                str = "ig_fb_profile_pic_reg";
                break;
            case 403918290:
                if (str2.equals("share_photo")) {
                    return "ig_fb_share_feed";
                }
                break;
            case 577549183:
                str = "ig_fb_nux_find_friends";
                break;
            case 1119220651:
                if (str2.equals("options_linked_accounts")) {
                    return "ig_fb_share_settings";
                }
                break;
            case 1670988475:
                if (str2.equals("business_switch_page")) {
                    return "ig_fb_business_connect_fb_page";
                }
                break;
            case 1958063037:
                if (str2.equals("interop")) {
                    return AnonymousClass00U.A0L("ig_", str2);
                }
                break;
        }
        if (str2.equals(str)) {
            return str2;
        }
        return AnonymousClass00U.A0L("ig_fb_", str2);
    }

    /* access modifiers changed from: public */
    AnonymousClass264(String str, int i) {
        this.A01 = str;
        this.A00 = r1;
    }

    /* access modifiers changed from: public */
    AnonymousClass264(String str) {
        this.A01 = str;
        this.A00 = null;
    }
}
