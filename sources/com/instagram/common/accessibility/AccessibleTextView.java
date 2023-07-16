package com.instagram.common.accessibility;

import X.AnonymousClass5yB;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityNodeProvider;
import com.instagram.common.ui.base.IgTextView;

public class AccessibleTextView extends IgTextView {
    public AnonymousClass5yB A00 = new AnonymousClass5yB(this);

    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        if (this.A00.A07(motionEvent)) {
            return true;
        }
        return super.dispatchHoverEvent(motionEvent);
    }

    public AccessibilityNodeProvider getAccessibilityNodeProvider() {
        return (AccessibilityNodeProvider) this.A00.A00;
    }

    public AccessibleTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public AccessibleTextView(Context context) {
        super(context);
    }

    public AccessibleTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
