package X;

import com.instagram.realtimeclient.RealtimeConstants;

/* renamed from: X.25R  reason: invalid class name */
public enum AnonymousClass25R {
    BOTTOM_NAVIGATION_BAR("bottom_navigation_bar"),
    TOP_NAVIGATION_BAR("top_navigation_bar"),
    PROFILE_PAGE("profile_page"),
    PROFILE_MENU("profile_menu"),
    ACCOUNT_SWITCHER("account_switcher"),
    ACTIVITY_FEED("activity_feed"),
    DIRECT(RealtimeConstants.GRAPHQL_SUBSCRIPTION_MESSAGE_TOPIC_FOR_DIRECT_TYPING),
    BOTTOM_SHEET_VERTICAL("bottom_sheet_vertical"),
    INVALID("invalid");
    
    public final String A00;

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    AnonymousClass25R(String str) {
        this.A00 = str;
    }
}
