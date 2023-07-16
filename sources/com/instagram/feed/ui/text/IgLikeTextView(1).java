package com.instagram.feed.ui.text;

import X.AnonymousClass5yC;
import X.AnonymousClass6VQ;
import X.C14030oh;
import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityNodeProvider;

public class IgLikeTextView extends BulletAwareTextView {
    public AnonymousClass5yC A00 = new AnonymousClass5yC(this);

    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        if (this.A00.A07(motionEvent)) {
            return true;
        }
        return super.dispatchHoverEvent(motionEvent);
    }

    public AccessibilityNodeProvider getAccessibilityNodeProvider() {
        return (AccessibilityNodeProvider) this.A00.A00;
    }

    public IgLikeTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int A05 = C14030oh.A05(-726500127);
        Layout layout = getLayout();
        boolean z = false;
        if ((layout != null && !(layout.getText() instanceof String) && AnonymousClass6VQ.A00(layout, motionEvent, this)) || super.onTouchEvent(motionEvent)) {
            z = true;
        }
        C14030oh.A0C(1462814487, A05);
        return z;
    }

    public IgLikeTextView(Context context) {
        super(context);
    }

    public IgLikeTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
