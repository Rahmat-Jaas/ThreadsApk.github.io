package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.media.ThumbnailUtils;
import android.os.Build;
import android.os.CancellationSignal;
import android.util.Size;
import com.facebook.react.uimanager.BaseViewManager;
import java.io.IOException;

/* renamed from: X.4xr  reason: invalid class name and case insensitive filesystem */
public final class C86554xr extends Drawable {
    public boolean A00 = true;
    public final int A01;
    public final int A02;
    public final Paint A03;
    public final Paint A04;
    public final RectF A05;

    public final void draw(Canvas canvas) {
        C04220Ms.A0B(canvas, 0);
        float f = (float) getBounds().left;
        float f2 = (float) getBounds().top;
        canvas.translate(f, f2);
        RectF rectF = this.A05;
        Paint paint = this.A03;
        canvas.drawRoundRect(rectF, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, paint);
        if (this.A00 && paint.getShader() != null) {
            canvas.drawRoundRect(rectF, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, this.A04);
        }
        canvas.translate(-f, -f2);
    }

    public final int getOpacity() {
        return -3;
    }

    public /* synthetic */ C86554xr(String str, int i, int i2, int i3) {
        Bitmap decodeFile;
        this.A02 = i;
        this.A01 = i2;
        Paint A0C = C86114wI.A0C(3);
        Paint.Style style = Paint.Style.FILL;
        A0C.setStyle(style);
        A0C.setColor(i3);
        this.A03 = A0C;
        this.A05 = new RectF(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, (float) i, (float) i2);
        Paint A0C2 = C86114wI.A0C(1);
        A0C2.setStyle(style);
        A0C2.setColor(-1291845632);
        this.A04 = A0C2;
        if (str != null) {
            try {
                if (Build.VERSION.SDK_INT >= 29) {
                    decodeFile = ThumbnailUtils.createImageThumbnail(C86144wL.A0Z(str), new Size(i, i2), (CancellationSignal) null);
                } else {
                    decodeFile = BitmapFactory.decodeFile(str);
                }
                Rect rect = new Rect(0, 0, decodeFile.getWidth(), decodeFile.getHeight());
                Rect rect2 = new Rect(0, 0, i, i2);
                Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                if (decodeFile.getWidth() == i && decodeFile.getHeight() == i2) {
                    canvas.drawBitmap(decodeFile, rect, rect2, (Paint) null);
                } else {
                    Matrix A0E = C86164wN.A0E();
                    C19587Ayn.A08(A0E, rect, rect2);
                    canvas.drawBitmap(decodeFile, A0E, (Paint) null);
                }
                C86124wJ.A1B(createBitmap, A0C);
            } catch (IOException unused) {
                C10450iM.A04("SharedCanvasIndeterminateProgressDrawable_fail_to_load_media_from_gallery", "", 1);
            }
        }
    }

    public final int getAlpha() {
        return this.A03.getAlpha();
    }

    public final ColorFilter getColorFilter() {
        return this.A03.getColorFilter();
    }

    public final int getIntrinsicHeight() {
        return this.A01;
    }

    public final int getIntrinsicWidth() {
        return this.A02;
    }

    public final void setAlpha(int i) {
        this.A03.setAlpha(i);
        this.A04.setAlpha(i);
        invalidateSelf();
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.A03.setColorFilter(colorFilter);
        this.A04.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
