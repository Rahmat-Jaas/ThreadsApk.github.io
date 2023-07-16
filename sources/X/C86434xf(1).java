package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.facebook.react.uimanager.BaseViewManager;

/* renamed from: X.4xf  reason: invalid class name and case insensitive filesystem */
public final class C86434xf extends Drawable {
    public float A00;
    public float A01;
    public float A02;
    public int A03;
    public final Paint A04;
    public final Paint A05 = C86114wI.A0C(5);
    public final float[] A06;
    public final Path A07;
    public final Path A08;
    public final Rect A09;
    public final RectF A0A;
    public final RectF A0B;

    public final int getOpacity() {
        return -1;
    }

    public final void setAlpha(int i) {
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public final void draw(Canvas canvas) {
        if (C120517Bf.A02(this.A03)) {
            RectF rectF = this.A0B;
            float f = this.A02;
            canvas.drawRoundRect(rectF, f, f, this.A05);
            Paint paint = this.A04;
            if (paint.getStrokeWidth() != BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
                RectF rectF2 = this.A0A;
                float f2 = this.A01;
                canvas.drawRoundRect(rectF2, f2, f2, paint);
                return;
            }
            return;
        }
        canvas.drawPath(this.A08, this.A05);
        Paint paint2 = this.A04;
        if (paint2.getStrokeWidth() != BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
            canvas.drawPath(this.A07, paint2);
        }
    }

    public final void getOutline(Outline outline) {
        outline.setRoundRect(this.A09, this.A02);
    }

    public C86434xf() {
        Paint A0C = C86114wI.A0C(1);
        this.A04 = A0C;
        this.A0B = C86134wK.A0E();
        this.A09 = C86134wK.A0D();
        this.A0A = C86134wK.A0E();
        this.A08 = C86144wL.A0G();
        this.A07 = C86144wL.A0G();
        this.A06 = new float[8];
        C86134wK.A12(A0C);
    }

    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        RectF rectF = this.A0B;
        rectF.set(rect);
        this.A09.set(rect);
        RectF rectF2 = this.A0A;
        float f = this.A00;
        rectF2.set(((float) rect.left) + f, ((float) rect.top) + f, ((float) rect.right) - f, ((float) rect.bottom) - f);
        int i = this.A03;
        if (!C120517Bf.A02(i)) {
            Path path = this.A08;
            float f2 = this.A02;
            float[] fArr = this.A06;
            C120517Bf.A01(fArr, f2, i);
            path.reset();
            Path.Direction direction = Path.Direction.CW;
            path.addRoundRect(rectF, fArr, direction);
            if (this.A04.getStrokeWidth() != BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
                Path path2 = this.A07;
                C120517Bf.A01(fArr, this.A01, this.A03);
                path2.reset();
                path2.addRoundRect(rectF2, fArr, direction);
            }
        }
    }
}
