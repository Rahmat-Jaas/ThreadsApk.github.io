package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.instagram.barcelona.R;

/* renamed from: X.4xI  reason: invalid class name */
public final class AnonymousClass4xI extends Drawable {
    public Bitmap A00;
    public final Paint A01;
    public final int A02;
    public final Paint A03;
    public final Paint A04;
    public final Rect A05 = C86134wK.A0D();
    public final Rect A06 = C86134wK.A0D();

    public final int getOpacity() {
        return -3;
    }

    public final void setAlpha(int i) {
        this.A01.setAlpha(i);
        invalidateSelf();
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.A01.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public AnonymousClass4xI(Context context) {
        Paint A0C = C86114wI.A0C(1);
        this.A01 = A0C;
        Paint.Style style = Paint.Style.FILL;
        A0C.setStyle(style);
        Paint A0C2 = C86114wI.A0C(1);
        this.A04 = A0C2;
        C86134wK.A12(A0C2);
        C86104wH.A18(context, A0C2, R.color.canvas_bottom_sheet_description_text_color);
        A0C2.setStrokeWidth(C09860go.A00(context, 1.5f));
        Paint A0C3 = C86114wI.A0C(3);
        this.A03 = A0C3;
        A0C3.setStyle(style);
        this.A02 = C86144wL.A07(context, 5);
        A0C3.setColorFilter(C63393hP.A01(context, R.color.canvas_bottom_sheet_description_text_color));
        this.A01.setColor(context.getColor(R.color.igds_primary_button));
        invalidateSelf();
    }

    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.drawCircle(bounds.exactCenterX(), bounds.exactCenterY(), ((float) bounds.width()) / 2.0f, this.A01);
        canvas.drawCircle(bounds.exactCenterX(), bounds.exactCenterY(), ((float) bounds.width()) / 2.0f, this.A04);
        Bitmap bitmap = this.A00;
        if (bitmap != null) {
            Rect rect = this.A06;
            rect.set(0, 0, bitmap.getWidth(), this.A00.getHeight());
            Rect rect2 = this.A05;
            int i = bounds.left;
            int i2 = this.A02;
            rect2.set(i + i2, bounds.top + i2, bounds.right - i2, bounds.bottom - i2);
            canvas.drawBitmap(this.A00, rect, rect2, this.A03);
        }
    }
}
