package X;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;

/* renamed from: X.0h1  reason: invalid class name */
public final class AnonymousClass0h1 extends View.AccessibilityDelegate {
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        accessibilityNodeInfo.setClickable(false);
        accessibilityNodeInfo.removeAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_CLICK);
    }
}
