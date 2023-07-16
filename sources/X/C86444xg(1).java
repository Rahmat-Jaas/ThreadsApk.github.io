package X;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import com.facebook.react.uimanager.BaseViewManager;

/* renamed from: X.4xg  reason: invalid class name and case insensitive filesystem */
public final class C86444xg extends Drawable {
    public int A00;
    public Bitmap A01;
    public Paint A02;
    public RectF A03;
    public final int A04 = 6;
    public final int A05;
    public final int A06 = 33;
    public final int A07;
    public final int A08 = 45;
    public final int A09 = 8;
    public final RectF A0A;
    public final Paint A0B;
    public final Paint A0C;

    public final int getOpacity() {
        return -3;
    }

    public C86444xg(int i, int i2, Bitmap bitmap, int i3) {
        float f;
        this.A07 = i;
        this.A05 = i2;
        Paint A0F = C86144wL.A0F();
        this.A0B = A0F;
        A0F.setFlags(1);
        Paint.Style style = Paint.Style.STROKE;
        A0F.setStyle(style);
        float f2 = (float) i3;
        A0F.setStrokeWidth(f2);
        A0F.setColor(-1);
        Paint A0F2 = C86144wL.A0F();
        this.A0C = A0F2;
        A0F2.setFlags(1);
        A0F2.setStyle(style);
        A0F2.setStrokeWidth(f2);
        A0F2.setColor(-7829368);
        this.A0A = C86134wK.A0E();
        this.A01 = bitmap;
        this.A03 = C86134wK.A0E();
        Paint A0C2 = C86114wI.A0C(7);
        this.A02 = A0C2;
        if (bitmap == null) {
            A0C2.setColor(-16777216);
            this.A02.setStyle(Paint.Style.FILL_AND_STROKE);
            return;
        }
        Bitmap bitmap2 = this.A01;
        bitmap2.getClass();
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap2, tileMode, tileMode);
        this.A02.setShader(bitmapShader);
        Matrix A0E = C86164wN.A0E();
        Bitmap bitmap3 = this.A01;
        bitmap3.getClass();
        float height = (float) bitmap3.getHeight();
        float width = (float) this.A01.getWidth();
        float f3 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
        if (width > height) {
            f = (height - width) / 2.0f;
        } else {
            f = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
        }
        A0E.setTranslate(f, height > width ? (width - height) / 2.0f : f3);
        bitmapShader.setLocalMatrix(A0E);
    }

    public final void draw(Canvas canvas) {
        Paint paint;
        RectF rectF = this.A0A;
        C86164wN.A16(rectF, this);
        RectF rectF2 = this.A03;
        rectF2.getClass();
        C86164wN.A16(rectF2, this);
        float f = rectF2.top;
        float f2 = (float) this.A05;
        rectF2.top = f + f2;
        rectF2.left += f2;
        rectF2.right -= f2;
        rectF2.bottom -= f2;
        Paint paint2 = this.A02;
        paint2.getClass();
        Canvas canvas2 = canvas;
        canvas.drawOval(rectF2, paint2);
        for (int i = 0; i < this.A09; i++) {
            if (i >= this.A00) {
                paint = this.A0C;
            } else {
                paint = this.A0B;
            }
            int i2 = this.A06;
            canvas2.drawArc(rectF, (float) ((270 - (i2 >> 1)) + (this.A08 * i) + this.A04), (float) i2, false, paint);
        }
    }

    public final int getIntrinsicHeight() {
        return this.A07;
    }

    public final int getIntrinsicWidth() {
        return this.A07;
    }

    public final void setAlpha(int i) {
        Paint paint = this.A02;
        paint.getClass();
        paint.setAlpha(i);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        Paint paint = this.A02;
        paint.getClass();
        paint.setColorFilter(colorFilter);
    }
}
