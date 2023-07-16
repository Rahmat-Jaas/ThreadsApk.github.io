package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.react.uimanager.BaseViewManager;

/* renamed from: X.5AL  reason: invalid class name */
public final class AnonymousClass5AL extends C61803Vq {
    public Paint A00;
    public final int A01;
    public final int A02;
    public final boolean A03;

    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C41006Ltt ltt) {
        int i;
        C04220Ms.A0B(rect, 0);
        AnonymousClass0wJ.A1O(view, recyclerView);
        int A032 = RecyclerView.A03(view);
        rect.left = 0;
        rect.right = 0;
        if (A032 == 0) {
            i = this.A02;
        } else {
            i = this.A01;
        }
        rect.top = i;
        C41030Luu luu = recyclerView.A0F;
        if (luu == null || A032 != luu.getItemCount()) {
            rect.bottom = 0;
        } else {
            rect.bottom = this.A02;
        }
    }

    public final void onDraw(Canvas canvas, RecyclerView recyclerView, C41006Ltt ltt) {
        Canvas canvas2 = canvas;
        AnonymousClass0wJ.A1N(canvas, recyclerView);
        C04220Ms.A0B(ltt, 2);
        if (this.A03) {
            int width = recyclerView.getWidth();
            int childCount = recyclerView.getChildCount() - 1;
            for (int i = 0; i < childCount; i++) {
                int bottom = recyclerView.getChildAt(i).getBottom() + this.A01;
                Paint paint = this.A00;
                if (paint != null) {
                    float f = (float) bottom;
                    canvas2.drawLine(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, f, (float) width, f, paint);
                }
            }
        }
    }

    public AnonymousClass5AL(int i, int i2, int i3, boolean z) {
        Paint paint;
        this.A02 = i;
        this.A01 = i2;
        this.A03 = z;
        if (z) {
            paint = C86144wL.A0F();
            paint.setColor(i3);
            paint.setStrokeWidth((float) i2);
        } else {
            paint = null;
        }
        this.A00 = paint;
    }
}
