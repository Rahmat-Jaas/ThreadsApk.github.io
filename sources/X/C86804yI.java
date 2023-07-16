package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2101000_I2;
import com.facebook.react.uimanager.BaseViewManager;

/* renamed from: X.4yI  reason: invalid class name and case insensitive filesystem */
public final class C86804yI extends Drawable implements C39769Kzd, Drawable.Callback {
    public float A00;
    public Drawable A01;

    public final void C1y(L5E l5e, KHQ khq) {
    }

    public final void C25(L5E l5e, int i) {
    }

    public final int getOpacity() {
        return -3;
    }

    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
    }

    public final void setAlpha(int i) {
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
    }

    public final void BmZ(KtCSuperShape0S2101000_I2 ktCSuperShape0S2101000_I2, L5E l5e) {
        Bitmap bitmap = (Bitmap) ktCSuperShape0S2101000_I2.A01;
        C04220Ms.A0B(bitmap, 1);
        C86364xY r0 = new C86364xY(bitmap, false);
        this.A01 = r0;
        r0.setCallback(this);
        this.A01.setBounds(0, 0, bitmap.getWidth(), bitmap.getHeight());
        invalidateSelf();
    }

    public final void draw(Canvas canvas) {
        Drawable drawable = this.A01;
        if (drawable != null && this.A00 > BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = this.A01.getIntrinsicHeight();
            float f = this.A00;
            float max = Math.max(f / ((float) intrinsicWidth), f / ((float) intrinsicHeight));
            C86114wI.A10(canvas, this);
            canvas.scale(max, max);
            this.A01.draw(canvas);
            canvas.restore();
        }
    }

    public final int getIntrinsicHeight() {
        return (int) this.A00;
    }

    public final int getIntrinsicWidth() {
        return (int) this.A00;
    }

    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }
}
