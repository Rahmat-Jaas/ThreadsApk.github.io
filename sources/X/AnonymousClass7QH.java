package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.style.LeadingMarginSpan;
import com.facebook.react.uimanager.BaseViewManager;

/* renamed from: X.7QH  reason: invalid class name */
public final class AnonymousClass7QH implements LeadingMarginSpan {
    public final int getLeadingMargin(boolean z) {
        return 0;
    }

    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
        int lineForOffset;
        Layout layout2 = layout;
        if (layout != null && paint != null && (lineForOffset = layout2.getLineForOffset(i6)) == layout2.getLineCount() - 1 && layout2.getEllipsisCount(lineForOffset) > 0) {
            float A00 = C115976wD.A00(paint, layout2, lineForOffset) + C115976wD.A01(paint, layout2, lineForOffset);
            if (A00 != BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
                C04220Ms.A0A(canvas);
                canvas.translate(A00, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
            }
        }
    }
}
