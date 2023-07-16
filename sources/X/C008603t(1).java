package X;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import java.util.List;

/* renamed from: X.03t  reason: invalid class name and case insensitive filesystem */
public class C008603t extends AccessibilityNodeProvider {
    public final C008703u A00;

    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
        AccessibilityNodeInfoCompat A002 = this.A00.A00(i);
        if (A002 == null) {
            return null;
        }
        return A002.A02;
    }

    public final boolean performAction(int i, int i2, Bundle bundle) {
        return this.A00.A02(i, i2, bundle);
    }

    public C008603t(C008703u r1) {
        this.A00 = r1;
    }

    public final List findAccessibilityNodeInfosByText(String str, int i) {
        return null;
    }
}
