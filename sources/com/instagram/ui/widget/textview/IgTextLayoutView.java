package com.instagram.ui.widget.textview;

import X.AnonymousClass5yD;
import X.AnonymousClass6VQ;
import X.C14030oh;
import X.C18190wL;
import X.C18220wO;
import X.C550631o;
import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import android.text.Spanned;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;

public class IgTextLayoutView extends View {
    public Layout A00;
    public Integer A01;
    public AnonymousClass5yD A02;
    public final int A03;

    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        if (this.A02.A07(motionEvent)) {
            return true;
        }
        return super.dispatchHoverEvent(motionEvent);
    }

    public AccessibilityNodeProvider getAccessibilityNodeProvider() {
        return (AccessibilityNodeProvider) this.A02.A00;
    }

    public Integer getCarouselIndex() {
        return this.A01;
    }

    public CharSequence getTextForAccessibility() {
        Layout layout = this.A00;
        if (layout == null) {
            return "";
        }
        return layout.getText();
    }

    public Layout getTextLayout() {
        return this.A00;
    }

    public void setCarouselIndex(Integer num) {
        if (num != null) {
            this.A01 = num;
        }
    }

    public IgTextLayoutView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A00 = null;
        this.A01 = null;
        setFocusable(true);
        this.A03 = getPaddingBottom();
        this.A02 = new AnonymousClass5yD(this);
    }

    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.save();
        if (this.A00 != null) {
            canvas.translate((float) getPaddingLeft(), (float) getPaddingTop());
            this.A00.draw(canvas);
        }
        canvas.restore();
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(C18220wO.A0q(this));
        accessibilityNodeInfo.setText(getTextForAccessibility());
    }

    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.A00 != null) {
            setMeasuredDimension(getPaddingLeft() + getPaddingRight() + this.A00.getWidth(), getPaddingTop() + getPaddingBottom() + this.A00.getHeight());
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i;
        int A05 = C14030oh.A05(-1347815446);
        Layout layout = this.A00;
        boolean z = false;
        if (layout == null) {
            i = -173329971;
        } else {
            if (AnonymousClass6VQ.A00(layout, motionEvent, this) || super.onTouchEvent(motionEvent)) {
                z = true;
            }
            i = 1681844219;
        }
        C14030oh.A0C(i, A05);
        return z;
    }

    public void setTextLayout(Layout layout) {
        if (layout.getText() instanceof Spanned) {
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int paddingRight = getPaddingRight();
            float f = (float) this.A03;
            int lineCount = layout.getLineCount();
            if (lineCount > 0) {
                f += ((float) (layout.getLineTop(lineCount) - layout.getLineTop(lineCount - 1))) * (layout.getSpacingMultiplier() - 1.0f);
            }
            setPadding(paddingLeft, paddingTop, paddingRight, (int) (f + layout.getSpacingAdd()));
            this.A00 = layout;
            if (C550631o.A00()) {
                setContentDescription(getTextForAccessibility());
            }
            requestLayout();
            return;
        }
        throw C18190wL.A0a("CommentText must be spanned text");
    }

    public IgTextLayoutView(Context context) {
        this(context, (AttributeSet) null);
        this.A02 = new AnonymousClass5yD(this);
    }

    public IgTextLayoutView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, -1);
        this.A02 = new AnonymousClass5yD(this);
    }
}
