package X;

import android.content.Context;
import android.view.accessibility.AccessibilityManager;

/* renamed from: X.3JA  reason: invalid class name */
public final class AnonymousClass3JA {
    public static boolean A00(Context context) {
        AccessibilityManager accessibilityManager;
        if (context != null) {
            accessibilityManager = (AccessibilityManager) context.getSystemService("accessibility");
        } else {
            accessibilityManager = null;
        }
        if (Boolean.getBoolean("is_accessibility_enabled") || (accessibilityManager != null && accessibilityManager.isEnabled())) {
            return true;
        }
        return false;
    }

    public static boolean A01(Context context) {
        AccessibilityManager accessibilityManager;
        if (Boolean.getBoolean("is_accessibility_enabled")) {
            return true;
        }
        if (context == null || (accessibilityManager = (AccessibilityManager) context.getSystemService("accessibility")) == null) {
            return false;
        }
        return accessibilityManager.isTouchExplorationEnabled();
    }
}
