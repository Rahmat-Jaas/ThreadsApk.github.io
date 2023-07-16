package com.instagram.ui.widget.textview;

import X.C10450iM;
import X.C14030oh;
import android.content.Context;
import android.text.Layout;
import android.text.Spannable;
import android.text.style.ClickableSpan;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.instagram.common.accessibility.AccessibleTextView;

public class CommentTextView extends AccessibleTextView {
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        int i;
        int i2;
        int A05 = C14030oh.A05(-1953878172);
        if (motionEvent.getAction() == 0) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            int totalPaddingLeft = x - getTotalPaddingLeft();
            int totalPaddingTop = y - getTotalPaddingTop();
            int scrollX = totalPaddingLeft + getScrollX();
            Layout layout = getLayout();
            int lineForVertical = layout.getLineForVertical(totalPaddingTop + getScrollY());
            if (getTag() != null && (getTag() instanceof String)) {
                C10450iM.A00().CYW("comment_id", (String) getTag());
            }
            try {
                i2 = layout.getOffsetForHorizontal(lineForVertical, (float) scrollX);
            } catch (ArrayIndexOutOfBoundsException e) {
                C10450iM.A03("IgSpannableTouchHelper HorizontalMeasurementProvider crash....", e.getMessage());
                i2 = -1;
            }
            z = false;
            if (i2 == -1) {
                i = 2089807832;
            } else if (getText() == null || !(getText() instanceof Spannable) || ((ClickableSpan[]) ((Spannable) getText()).getSpans(i2, i2, ClickableSpan.class)).length == 0) {
                i = -184921541;
            } else {
                z = super.onTouchEvent(motionEvent);
                i = -192586435;
            }
        } else {
            z = super.onTouchEvent(motionEvent);
            i = -23519700;
        }
        C14030oh.A0C(i, A05);
        return z;
    }

    public CommentTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public CommentTextView(Context context) {
        super(context);
    }

    public CommentTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
