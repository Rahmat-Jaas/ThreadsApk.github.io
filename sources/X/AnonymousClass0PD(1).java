package X;

import com.facebook.react.modules.appstate.AppStateModule;

/* renamed from: X.0PD  reason: invalid class name */
public enum AnonymousClass0PD {
    ANR("anr", false),
    ANR_APP_DEATH("anr_app_death", false),
    APP_LIFECYCLE("app_lifecycle", true),
    ATTRIBUTION_ID("attribution_id", true),
    JAVA("java", false),
    JAVA_DETECT("java_detect", true),
    JAVA_APP_DEATH("java_app_death", false),
    JAVASCRIPT("javascript", false),
    NATIVE("native", false),
    MOBILE_CONFIG("mobile_config", true),
    NAVIGATION("navigation", true),
    PERIODIC_MEMORY("periodic_memory", true),
    LATE_STARTUP("late_startup", true),
    AFTER_STARTUP("after_startup", true),
    REPORT_SOURCE("report_source", true),
    SOFT_ERROR("soft_error", false),
    STARTUP("startup", true),
    UNEXPLAINED("unexplained", false),
    CUSTOM_DATA("custom_data", true),
    FOREGROUND_TRANSITION("foreground_transition", true),
    USER_PERCEPTIBLE_SCOPE("user_perceptible_scope", true),
    USER_CHANGE("user_change", true),
    PERIODIC_BATTERY("periodic_battery", true),
    MEMORY_TRIM("memory_trim", true),
    BACKGROUND(AppStateModule.APP_STATE_BACKGROUND, true);
    
    public final String A00;
    public final boolean A01;

    /* access modifiers changed from: public */
    AnonymousClass0PD(String str, boolean z) {
        this.A00 = str;
        this.A01 = z;
    }

    public final String toString() {
        return this.A00;
    }
}
