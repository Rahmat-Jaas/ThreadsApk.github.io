package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.25S  reason: invalid class name */
public enum AnonymousClass25S {
    USER_OPTIONS("user_options"),
    RAGE_SHAKE("ig_rage_shake"),
    DIRECT_APP_PROFILE_SETTINGS("direct_app_profile_settings"),
    DIRECT_SEND_FAILURE("direct_send_failure"),
    DIRECT_THREAD_DETAIL("thread_details"),
    DIRECT_VISUAL_MESSAGE_REPORT_FLOW("direct_visual_message_report_flow"),
    IGTV_UPLOAD_REPORT_FLOW("igtv_upload_report_flow"),
    APPIRATER_FEEDBACK("appirater_feedback"),
    VIDEO_CALL_FAILED("video_call_failed"),
    VIDEO_CALL_FULL("video_call_is_full"),
    VIDEO_CALL_NO_ANSWER("video_call_no_answer"),
    UI_QUALITY_REVIEW("ui_quality_review"),
    BLOKS("bloks"),
    COWATCH("cowatch"),
    MEDIA_DELETED_REEL("media_deleted_reel"),
    BARCELONA_RAGE_SHAKE("barcelona_rage_shake"),
    BARCELONA_APP_SETTING("barcelona_app_setting"),
    UNKNOWN("unknown");
    
    public static final Map A01 = null;
    public final String A00;

    /* access modifiers changed from: public */
    static {
        int i;
        LinkedHashMap A0v = C18190wL.A0v(AnonymousClass4WK.A0M(r3));
        for (AnonymousClass25S r1 : values()) {
            A0v.put(r1.A00, r1);
        }
        A01 = A0v;
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    AnonymousClass25S(String str) {
        this.A00 = str;
    }
}
