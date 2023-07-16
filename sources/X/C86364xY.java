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

/* renamed from: X.4xY  reason: invalid class name and case insensitive filesystem */
public final class C86364xY extends Drawable {
    public final Bitmap A00;
    public final Paint A01;
    public final RectF A02 = C86134wK.A0E();
    public final boolean A03;

    public final void draw(Canvas canvas) {
        C04220Ms.A0B(canvas, 0);
        RectF rectF = this.A02;
        C86164wN.A16(rectF, this);
        if (rectF.height() > rectF.width()) {
            rectF.inset(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, (rectF.height() - rectF.width()) / 2.0f);
        } else if (rectF.height() < rectF.width()) {
            rectF.inset((rectF.width() - rectF.height()) / 2.0f, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
        }
        canvas.drawOval(rectF, this.A01);
    }

    public final int getOpacity() {
        return -3;
    }

    public final int getIntrinsicHeight() {
        boolean z = this.A03;
        Bitmap bitmap = this.A00;
        if (z) {
            return Math.min(bitmap.getWidth(), bitmap.getHeight());
        }
        return bitmap.getHeight();
    }

    public final int getIntrinsicWidth() {
        boolean z = this.A03;
        Bitmap bitmap = this.A00;
        if (z) {
            return Math.min(bitmap.getWidth(), bitmap.getHeight());
        }
        return bitmap.getWidth();
    }

    public final void setAlpha(int i) {
        this.A01.setAlpha(i);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.A01.setColorFilter(colorFilter);
    }

    public C86364xY(Bitmap bitmap, boolean z) {
        float f;
        this.A00 = bitmap;
        this.A03 = z;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Paint A0C = C86114wI.A0C(7);
        A0C.setShader(bitmapShader);
        this.A01 = A0C;
        Matrix A0E = C86164wN.A0E();
        if (z) {
            float height = (float) bitmap.getHeight();
            float width = (float) bitmap.getWidth();
            float f2 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
            if (width > height) {
                f = (height - width) / 2.0f;
            } else {
                f = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
            }
            A0E.setTranslate(f, height > width ? (width - height) / 2.0f : f2);
        }
        bitmapShader.setLocalMatrix(A0E);
    }
}
