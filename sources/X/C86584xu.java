package X;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.facebook.react.uimanager.BaseViewManager;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* renamed from: X.4xu  reason: invalid class name and case insensitive filesystem */
public final class C86584xu extends Drawable {
    public float A00 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
    public RectF A01;
    public WeakReference A02;
    public boolean A03 = true;
    public boolean A04 = true;
    public boolean A05 = false;
    public final Bitmap A06;
    public final Matrix A07 = C86164wN.A0E();
    public final Matrix A08 = C86164wN.A0E();
    public final Matrix A09 = C86164wN.A0E();
    public final Matrix A0A = C86164wN.A0E();
    public final Matrix A0B = C86164wN.A0E();
    public final Matrix A0C = C86164wN.A0E();
    public final Paint A0D;
    public final Paint A0E;
    public final Path A0F = C86144wL.A0G();
    public final Path A0G = C86144wL.A0G();
    public final RectF A0H = C86134wK.A0E();
    public final RectF A0I = C86134wK.A0E();
    public final RectF A0J = C86134wK.A0E();
    public final RectF A0K = C86134wK.A0E();
    public final Drawable A0L;
    public final float[] A0M = new float[8];
    public final float[] A0N = new float[8];

    public C86584xu(Resources resources, Bitmap bitmap) {
        BitmapDrawable bitmapDrawable = new BitmapDrawable(resources, bitmap);
        this.A0L = bitmapDrawable;
        Paint A0F2 = C86144wL.A0F();
        this.A0E = A0F2;
        Paint A0C2 = C86114wI.A0C(1);
        this.A0D = A0C2;
        this.A01 = null;
        this.A06 = bitmap;
        A0F2.setFlags(1);
        C86134wK.A12(A0C2);
    }

    public final void A00(float f) {
        boolean z = false;
        if (f >= BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
            Arrays.fill(this.A0N, f);
            if (f != BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
                z = true;
            }
            this.A05 = z;
            this.A04 = true;
            invalidateSelf();
            return;
        }
        throw new IllegalStateException();
    }

    public final void clearColorFilter() {
        this.A0L.clearColorFilter();
    }

    public final int getAlpha() {
        return this.A0L.getAlpha();
    }

    public final ColorFilter getColorFilter() {
        return this.A0L.getColorFilter();
    }

    public final int getIntrinsicHeight() {
        return this.A0L.getIntrinsicHeight();
    }

    public final int getIntrinsicWidth() {
        return this.A0L.getIntrinsicWidth();
    }

    public final int getOpacity() {
        return this.A0L.getOpacity();
    }

    public final void onBoundsChange(Rect rect) {
        this.A0L.setBounds(rect);
    }

    public final void setAlpha(int i) {
        Drawable drawable = this.A0L;
        drawable.setAlpha(i);
        Paint paint = this.A0E;
        if (i != paint.getAlpha()) {
            paint.setAlpha(i);
            drawable.setAlpha(i);
            invalidateSelf();
        }
    }

    public final void setColorFilter(int i, PorterDuff.Mode mode) {
        this.A0L.setColorFilter(i, mode);
    }

    public final void draw(Canvas canvas) {
        Bitmap bitmap;
        float[] fArr;
        AnonymousClass734.A00();
        if (!this.A05 || (bitmap = this.A06) == null) {
            AnonymousClass734.A00();
            this.A0L.draw(canvas);
            AnonymousClass734.A00();
        } else {
            Matrix matrix = this.A0A;
            matrix.reset();
            RectF rectF = this.A0K;
            C86164wN.A16(rectF, this);
            RectF rectF2 = this.A0H;
            Drawable drawable = this.A0L;
            rectF2.set(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, (float) drawable.getIntrinsicWidth(), (float) drawable.getIntrinsicHeight());
            RectF rectF3 = this.A0I;
            C86164wN.A16(rectF3, drawable);
            Matrix matrix2 = this.A09;
            matrix2.setRectToRect(rectF2, rectF3, Matrix.ScaleToFit.FILL);
            Matrix matrix3 = this.A0C;
            if (!matrix.equals(matrix3) || !matrix2.equals(this.A0B)) {
                this.A03 = true;
                matrix.invert(this.A08);
                Matrix matrix4 = this.A07;
                matrix4.set(matrix);
                matrix4.preConcat(matrix2);
                matrix3.set(matrix);
                this.A0B.set(matrix2);
            }
            RectF rectF4 = this.A0J;
            if (!rectF.equals(rectF4)) {
                this.A04 = true;
                rectF4.set(rectF);
            }
            RectF rectF5 = this.A01;
            if (rectF5 == null) {
                rectF5 = C86134wK.A0E();
                this.A01 = rectF5;
            }
            Matrix matrix5 = this.A07;
            matrix5.mapRect(rectF5, rectF2);
            if (this.A04) {
                Path path = this.A0F;
                path.reset();
                float f = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER / 2.0f;
                rectF.inset(f, f);
                int i = 0;
                while (true) {
                    fArr = this.A0M;
                    if (i >= fArr.length) {
                        break;
                    }
                    fArr[i] = (this.A0N[i] + this.A00) - f;
                    i++;
                }
                Path.Direction direction = Path.Direction.CW;
                path.addRoundRect(rectF, fArr, direction);
                float f2 = (-BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) / 2.0f;
                rectF.inset(f2, f2);
                Path path2 = this.A0G;
                path2.reset();
                float f3 = this.A00 + BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
                rectF.inset(f3, f3);
                path2.addRoundRect(rectF, this.A0N, direction);
                float f4 = -f3;
                rectF.inset(f4, f4);
                path2.setFillType(Path.FillType.WINDING);
                this.A04 = false;
            }
            WeakReference weakReference = this.A02;
            if (weakReference == null || weakReference.get() != bitmap) {
                this.A02 = C86144wL.A0w(bitmap);
                C86124wJ.A1B(bitmap, this.A0E);
                this.A03 = true;
            }
            if (this.A03) {
                this.A0E.getShader().setLocalMatrix(matrix5);
                this.A03 = false;
            }
            Paint paint = this.A0E;
            paint.setFilterBitmap(false);
            int save = canvas.save();
            canvas.concat(this.A08);
            if (this.A01 != null) {
                int save2 = canvas.save();
                canvas.clipRect(this.A01);
                canvas.drawPath(this.A0G, paint);
                canvas.restoreToCount(save2);
            } else {
                canvas.drawPath(this.A0G, paint);
            }
            canvas.restoreToCount(save);
        }
        AnonymousClass734.A00();
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.A0L.setColorFilter(colorFilter);
        this.A0E.setColorFilter(colorFilter);
    }
}
