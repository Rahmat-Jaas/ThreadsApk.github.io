package X;

import android.graphics.Paint;
import android.text.Layout;
import com.facebook.react.uimanager.BaseViewManager;

/* renamed from: X.6wD  reason: invalid class name and case insensitive filesystem */
public final class C115976wD {
    public static final float A00(Paint paint, Layout layout, int i) {
        float abs;
        float width;
        float lineLeft = layout.getLineLeft(i);
        if (!C18180wK.A1X(layout.getEllipsisCount(i)) || layout.getParagraphDirection(i) != 1 || lineLeft >= BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
            return BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
        }
        float primaryHorizontal = (layout.getPrimaryHorizontal(layout.getLineStart(i) + layout.getEllipsisStart(i)) - lineLeft) + paint.measureText("…");
        Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i);
        if (paragraphAlignment == null || C102876Ww.A00[paragraphAlignment.ordinal()] != 1) {
            abs = Math.abs(lineLeft);
            width = ((float) layout.getWidth()) - primaryHorizontal;
        } else {
            abs = Math.abs(lineLeft);
            width = (((float) layout.getWidth()) - primaryHorizontal) / 2.0f;
        }
        return abs + width;
    }

    public static final float A01(Paint paint, Layout layout, int i) {
        float width;
        float width2;
        if (layout.getEllipsisCount(i) <= 0 || layout.getParagraphDirection(i) != -1 || ((float) layout.getWidth()) >= layout.getLineRight(i)) {
            return BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
        }
        float lineRight = (layout.getLineRight(i) - layout.getPrimaryHorizontal(layout.getLineStart(i) + layout.getEllipsisStart(i))) + paint.measureText("…");
        Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i);
        if (paragraphAlignment == null || C102876Ww.A00[paragraphAlignment.ordinal()] != 1) {
            width = ((float) layout.getWidth()) - layout.getLineRight(i);
            width2 = ((float) layout.getWidth()) - lineRight;
        } else {
            width = ((float) layout.getWidth()) - layout.getLineRight(i);
            width2 = (((float) layout.getWidth()) - lineRight) / 2.0f;
        }
        return width - width2;
    }
}
