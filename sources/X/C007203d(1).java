package X;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;

/* renamed from: X.03d  reason: invalid class name and case insensitive filesystem */
public final class C007203d extends ClickableSpan {
    public final int A00;
    public final int A01;
    public final AccessibilityNodeInfoCompat A02;

    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.A01);
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompat = this.A02;
        accessibilityNodeInfoCompat.A02.performAction(this.A00, bundle);
    }

    public C007203d(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, int i, int i2) {
        this.A01 = i;
        this.A02 = accessibilityNodeInfoCompat;
        this.A00 = i2;
    }
}
