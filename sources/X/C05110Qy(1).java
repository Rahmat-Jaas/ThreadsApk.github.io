package X;

/* renamed from: X.0Qy  reason: invalid class name and case insensitive filesystem */
public final class C05110Qy {
    public static final C319629q A00(String str) {
        String str2;
        switch (str.hashCode()) {
            case -1814342561:
                if (str.equals("double_tap_tab_bar")) {
                    return C319629q.TAB_BAR_DOUBLE_TAP;
                }
                break;
            case -976711082:
                str2 = "tab_bar_long_press";
                break;
            case -657162262:
                str2 = "long_press_tab_bar";
                break;
            case -309425751:
                if (str.equals("profile")) {
                    return C319629q.PROFILE_TITLE;
                }
                break;
            case 441111834:
                if (str.equals("unknown_nt_action")) {
                    return C319629q.UNKNOWN_NT_ACTION;
                }
                break;
            case 660917936:
                if (str.equals("direct_inbox")) {
                    return C319629q.DIRECT_INBOX;
                }
                break;
            case 1414199215:
                if (str.equals("horizontal_switch")) {
                    return C319629q.HORIZONTAL_SWITCH;
                }
                break;
            case 2005378358:
                if (str.equals("bookmark")) {
                    return C319629q.BOOKMARK;
                }
                break;
        }
        if (str.equals(str2)) {
            return C319629q.TAB_BAR_LONG_PRESS;
        }
        return C319629q.UNKNOWN;
    }
}
