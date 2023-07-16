package X;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import androidx.core.view.IDxVPropertyShape9S0000000_I2;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.instagram.barcelona.R;
import java.util.Collections;
import java.util.List;

/* renamed from: X.01l  reason: invalid class name and case insensitive filesystem */
public final class C003001l extends View.AccessibilityDelegate {
    public final C003201n A00;

    public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        return this.A00.A0N(view, accessibilityEvent);
    }

    public final AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
        C008703u A0P = this.A00.A0P(view);
        if (A0P != null) {
            return (AccessibilityNodeProvider) A0P.A00;
        }
        return null;
    }

    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.A00.A0I(view, accessibilityEvent);
    }

    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompat = new AccessibilityNodeInfoCompat(accessibilityNodeInfo);
        boolean A0J = C006702y.A0J(view);
        AccessibilityNodeInfo accessibilityNodeInfo2 = accessibilityNodeInfoCompat.A02;
        accessibilityNodeInfo2.setScreenReaderFocusable(A0J);
        accessibilityNodeInfo2.setHeading(C006702y.A0I(view));
        accessibilityNodeInfo2.setPaneTitle((CharSequence) new IDxVPropertyShape9S0000000_I2(1).A02(view));
        accessibilityNodeInfoCompat.A0D((CharSequence) new IDxVPropertyShape9S0000000_I2(2).A02(view));
        this.A00.A0L(view, accessibilityNodeInfoCompat);
        accessibilityNodeInfo.getText();
        List list = (List) view.getTag(R.id.tag_accessibility_actions);
        if (list == null) {
            list = Collections.emptyList();
        }
        for (int i = 0; i < list.size(); i++) {
            accessibilityNodeInfoCompat.A08((C008103m) list.get(i));
        }
    }

    public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.A00.A0J(view, accessibilityEvent);
    }

    public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.A00.A0O(viewGroup, view, accessibilityEvent);
    }

    public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        return this.A00.A0M(view, i, bundle);
    }

    public final void sendAccessibilityEvent(View view, int i) {
        this.A00.A0H(view, i);
    }

    public final void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
        this.A00.A0K(view, accessibilityEvent);
    }

    public C003001l(C003201n r1) {
        this.A00 = r1;
    }
}
