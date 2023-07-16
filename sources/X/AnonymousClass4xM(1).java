package X;

import android.content.Context;
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
import com.instagram.barcelona.R;

/* renamed from: X.4xM  reason: invalid class name */
public final class AnonymousClass4xM extends Drawable {
    public int A00 = 255;
    public Bitmap A01;
    public Paint A02;
    public final float A03;
    public final float A04;
    public final Paint A05;
    public final Paint A06;
    public final Paint A07;
    public final RectF A08 = C86134wK.A0E();
    public final boolean A09;

    public final int getOpacity() {
        return -1;
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public final void draw(Canvas canvas) {
        Paint paint = this.A05;
        paint.setAlpha(this.A00);
        Paint paint2 = this.A02;
        paint2.setAlpha(this.A00);
        Paint paint3 = this.A06;
        paint3.setAlpha(this.A00);
        Paint paint4 = this.A07;
        paint4.setAlpha(this.A00);
        RectF rectF = this.A08;
        float f = this.A04;
        rectF.set(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, f, f);
        float f2 = f / 2.0f;
        float width = (((float) canvas.getWidth()) / 2.0f) - f2;
        float height = (((float) canvas.getHeight()) / 2.0f) - f2;
        Bitmap bitmap = this.A01;
        if (!(bitmap != null && bitmap.getWidth() == canvas.getWidth() && this.A01.getHeight() == canvas.getHeight())) {
            Bitmap bitmap2 = this.A01;
            if (bitmap2 != null) {
                bitmap2.recycle();
            }
            Bitmap createBitmap = Bitmap.createBitmap(canvas.getWidth(), canvas.getHeight(), Bitmap.Config.ARGB_8888);
            this.A01 = createBitmap;
            Canvas canvas2 = new Canvas(createBitmap);
            canvas2.save();
            canvas2.translate(width, height);
            if (this.A09) {
                canvas2.drawCircle(f2, f2, f2, paint3);
                canvas2.drawCircle(f2, f2, f2, paint4);
            } else {
                float f3 = this.A03;
                canvas2.drawRoundRect(rectF, f3, f3, paint3);
                canvas2.drawRoundRect(rectF, f3, f3, paint4);
            }
            canvas2.restore();
        }
        canvas.drawBitmap(this.A01, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, paint);
        canvas.save();
        canvas.translate(width, height);
        if (this.A09) {
            canvas.drawCircle(f2, f2, f2, paint);
            canvas.drawCircle(f2, f2, f2, paint2);
        } else {
            float f4 = this.A03;
            canvas.drawRoundRect(rectF, f4, f4, paint);
            canvas.drawRoundRect(rectF, f4, f4, paint2);
        }
        canvas.restore();
    }

    public final void setAlpha(int i) {
        this.A00 = i;
        invalidateSelf();
    }

    public AnonymousClass4xM(Context context, Bitmap bitmap, float f, float f2, int i, int i2, boolean z) {
        this.A09 = z;
        int i3 = i;
        this.A04 = ((float) i3) - f;
        this.A03 = f2;
        Paint A0C = C86114wI.A0C(1);
        this.A02 = A0C;
        C86134wK.A12(A0C);
        this.A02.setColor(-1);
        this.A02.setStrokeWidth(f);
        Paint A0C2 = C86114wI.A0C(3);
        this.A05 = A0C2;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Matrix A0E = C86164wN.A0E();
        C31176Gi6.A0G(A0E, width, height, i3, i3, i2, false);
        bitmapShader.setLocalMatrix(A0E);
        A0C2.setShader(bitmapShader);
        Paint A0C3 = C86114wI.A0C(1);
        this.A06 = A0C3;
        Paint.Style style = Paint.Style.FILL;
        A0C3.setStyle(style);
        A0C3.setColor(-1);
        A0C3.setShadowLayer(C09860go.A03(context, 10), BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, context.getColor(R.color.black_15_transparent));
        Paint A0C4 = C86114wI.A0C(1);
        this.A07 = A0C4;
        A0C4.setStyle(style);
        A0C4.setColor(-1);
        A0C4.setShadowLayer(C09860go.A03(context, 1), BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, context.getColor(R.color.black_20_transparent));
    }
}
