package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.facebook.react.uimanager.BaseViewManager;

/* renamed from: X.4xa  reason: invalid class name and case insensitive filesystem */
public final class C86384xa extends Drawable {
    public boolean A00;
    public final Path A01 = C86144wL.A0G();
    public final RectF A02;
    public final float[] A03;
    public final Paint A04;

    public final void A00(int i) {
        Paint paint = this.A04;
        if (i != paint.getColor()) {
            paint.setColor(i);
            invalidateSelf();
        }
    }

    public final void draw(Canvas canvas) {
        if (this.A00) {
            RectF rectF = this.A02;
            float f = this.A03[0];
            canvas.drawRoundRect(rectF, f, f, this.A04);
            return;
        }
        canvas.drawPath(this.A01, this.A04);
    }

    public final int getOpacity() {
        float[] fArr = this.A03;
        int length = fArr.length;
        int i = 0;
        while (true) {
            if (i < length) {
                if (Float.compare(fArr[i], BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) == 0) {
                    break;
                }
                i++;
            } else if (this.A04.getAlpha() != 255) {
                return -3;
            } else {
                return -1;
            }
        }
        return -3;
    }

    public final void setAlpha(int i) {
        Paint paint = this.A04;
        if (i != paint.getAlpha()) {
            paint.setAlpha(i);
            invalidateSelf();
        }
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.A04.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public C86384xa() {
        Paint A0F = C86144wL.A0F();
        this.A04 = A0F;
        this.A02 = C86134wK.A0E();
        this.A03 = new float[8];
        this.A00 = true;
        A0F.setAntiAlias(true);
        C86134wK.A13(A0F);
    }

    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        RectF rectF = this.A02;
        rectF.set(rect);
        if (!this.A00) {
            Path path = this.A01;
            path.reset();
            path.addRoundRect(rectF, this.A03, Path.Direction.CW);
        }
    }
}
