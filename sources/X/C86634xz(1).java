package X;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.facebook.react.uimanager.BaseViewManager;

/* renamed from: X.4xz  reason: invalid class name and case insensitive filesystem */
public final class C86634xz extends Drawable {
    public final Paint A00;
    public final Paint A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final Path A07 = C86144wL.A0G();
    public final Path A08 = C86144wL.A0G();
    public final RectF A09;
    public final RectF A0A;
    public final boolean A0B = true;

    public C86634xz(int i, int i2, int i3, int i4, int i5) {
        this.A03 = i4;
        this.A02 = i5;
        this.A05 = i3;
        Path path = this.A07;
        if (path != null) {
            path.setFillType(Path.FillType.EVEN_ODD);
        }
        this.A04 = i;
        Paint A0F = C86144wL.A0F();
        this.A00 = A0F;
        A0F.setColor(i);
        C86134wK.A13(A0F);
        A0F.setStrokeWidth(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
        if (i4 > 0) {
            A0F.setAntiAlias(true);
        }
        this.A06 = i2;
        Paint A0F2 = C86144wL.A0F();
        this.A01 = A0F2;
        A0F2.setColor(i2);
        C86134wK.A12(A0F2);
        A0F2.setStrokeWidth((float) i5);
        if (i4 > 0) {
            A0F2.setAntiAlias(true);
        }
        this.A09 = C86134wK.A0E();
        this.A0A = C86134wK.A0E();
    }

    public final void draw(Canvas canvas) {
        A00(canvas, this.A00, this.A07);
        A00(canvas, this.A01, this.A08);
    }

    public final int getOpacity() {
        if (this.A03 == 0 && this.A00.getAlpha() == 255 && this.A01.getAlpha() == 255) {
            return -1;
        }
        return -3;
    }

    public final void onBoundsChange(Rect rect) {
        Path path;
        Rect rect2 = rect;
        super.onBoundsChange(rect2);
        RectF rectF = this.A09;
        rectF.set(rect2);
        RectF rectF2 = this.A0A;
        rectF2.set(rect2);
        float f = (float) (this.A02 >> 1);
        rectF2.inset(f, f);
        Path path2 = this.A07;
        if (path2 != null && (path = this.A08) != null) {
            int i = this.A03;
            int i2 = this.A05;
            boolean z = this.A0B;
            int i3 = i2 & 1;
            float f2 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
            float f3 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
            if (i3 == 1) {
                f3 = (float) i;
            }
            int i4 = i2 & 2;
            float f4 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
            if (i4 == 2) {
                f4 = (float) i;
            }
            int i5 = i2 & 4;
            float f5 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
            if (i5 == 4) {
                f5 = (float) i;
            }
            if ((i2 & 8) == 8) {
                f2 = (float) i;
            }
            float[] fArr = {f3, f3, f4, f4, f5, f5, f2, f2};
            path2.reset();
            path.reset();
            if (z) {
                path2.addRect(rectF, Path.Direction.CW);
            }
            Path.Direction direction = Path.Direction.CW;
            path2.addRoundRect(rectF2, fArr, direction);
            path.addRoundRect(rectF2, fArr, direction);
        }
    }

    public final void setAlpha(int i) {
        float f = ((float) i) / 255.0f;
        this.A00.setAlpha((int) ((((float) Color.alpha(this.A04)) / 255.0f) * f * 255.0f));
        this.A01.setAlpha((int) (f * (((float) Color.alpha(this.A06)) / 255.0f) * 255.0f));
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.A00.setColorFilter(colorFilter);
        this.A01.setColorFilter(colorFilter);
    }

    private void A00(Canvas canvas, Paint paint, Path path) {
        Paint.Style style = paint.getStyle();
        if (paint.getAlpha() != 0 || paint.getColorFilter() != null) {
            if (style != Paint.Style.STROKE || this.A02 != 0) {
                if (path != null) {
                    canvas.drawPath(path, paint);
                    return;
                }
                int i = this.A03;
                if (i > 0) {
                    float f = (float) i;
                    canvas.drawRoundRect(this.A0A, f, f, paint);
                    return;
                }
                canvas.drawRect(this.A0A, paint);
            }
        }
    }
}
