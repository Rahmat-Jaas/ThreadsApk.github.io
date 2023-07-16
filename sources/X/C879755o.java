package X;

import android.os.Bundle;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.facebook.common.dextricks.Constants;
import com.facebook.forker.Process;

/* renamed from: X.55o  reason: invalid class name and case insensitive filesystem */
public final class C879755o extends C008703u {
    public final /* synthetic */ C879455k A00;

    public final AccessibilityNodeInfoCompat A01(int i) {
        int i2;
        C879455k r0 = this.A00;
        if (i == 2) {
            i2 = r0.A00;
        } else {
            i2 = r0.A01;
        }
        if (i2 == Integer.MIN_VALUE) {
            return null;
        }
        return A00(i2);
    }

    public C879755o(C879455k r1) {
        this.A00 = r1;
    }

    public final AccessibilityNodeInfoCompat A00(int i) {
        return new AccessibilityNodeInfoCompat(AccessibilityNodeInfo.obtain(this.A00.A0R(i).A02));
    }

    public final boolean A02(int i, int i2, Bundle bundle) {
        int i3;
        int i4;
        C879455k r3 = this.A00;
        if (i == -1) {
            return r3.A03.performAccessibilityAction(i2, bundle);
        }
        if (i2 == 1) {
            return r3.A0a(i);
        }
        if (i2 == 2) {
            return r3.A0Z(i);
        }
        if (i2 == 64) {
            AccessibilityManager accessibilityManager = r3.A04;
            if (!accessibilityManager.isEnabled() || !accessibilityManager.isTouchExplorationEnabled() || (i4 = r3.A00) == i) {
                return false;
            }
            if (i4 != Integer.MIN_VALUE && i4 == i4) {
                r3.A00 = Process.WAIT_RESULT_TIMEOUT;
                r3.A03.invalidate();
                r3.A0T(i4, Constants.LOAD_RESULT_PGO_ATTEMPTED);
            }
            r3.A00 = i;
            r3.A03.invalidate();
            i3 = 32768;
        } else if (i2 != 128) {
            return r3.A0b(i, i2, bundle);
        } else {
            if (r3.A00 != i) {
                return false;
            }
            r3.A00 = Process.WAIT_RESULT_TIMEOUT;
            r3.A03.invalidate();
            i3 = Constants.LOAD_RESULT_PGO_ATTEMPTED;
        }
        r3.A0T(i, i3);
        return true;
    }
}
