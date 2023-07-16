package X;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;

/* renamed from: X.0Rq  reason: invalid class name and case insensitive filesystem */
public final class C05160Rq extends C008603t {
    public final AccessibilityNodeInfo findFocus(int i) {
        AccessibilityNodeInfoCompat A01 = this.A00.A01(i);
        if (A01 == null) {
            return null;
        }
        return A01.A02;
    }

    public C05160Rq(C008703u r1) {
        super(r1);
    }

    public final void addExtraDataToAccessibilityNodeInfo(int i, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
    }
}
