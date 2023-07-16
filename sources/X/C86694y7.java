package X;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.facebook.react.uimanager.BaseViewManager;
import com.instagram.barcelona.R;

/* renamed from: X.4y7  reason: invalid class name and case insensitive filesystem */
public final class C86694y7 extends Drawable implements ValueAnimator.AnimatorUpdateListener {
    public float A00;
    public final ValueAnimator A01;
    public final Resources A02;
    public final Bitmap A03;
    public final Bitmap A04;
    public final Paint A05 = C86144wL.A0F();

    public final int getOpacity() {
        return -3;
    }

    public final void draw(Canvas canvas) {
        float f;
        Rect bounds = getBounds();
        Canvas canvas2 = canvas;
        canvas2.save();
        double d = (double) this.A00;
        double width = (double) bounds.width();
        Bitmap bitmap = this.A04;
        canvas2.translate((float) C98896Hi.A00(d, 1.0d, 0.0d, width, (double) (-bitmap.getWidth())), BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
        Paint paint = this.A05;
        canvas2.drawBitmap(bitmap, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, paint);
        canvas2.restore();
        canvas2.save();
        float f2 = this.A00;
        if (((double) f2) > 0.5d) {
            f = f2 - 0.5f;
        } else {
            f = f2 + 0.5f;
        }
        this.A00 = f;
        double d2 = (double) f;
        double width2 = (double) bounds.width();
        Bitmap bitmap2 = this.A03;
        canvas2.translate((float) C98896Hi.A00(d2, 1.0d, 0.0d, width2, (double) (-bitmap2.getWidth())), BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
        canvas2.drawBitmap(bitmap2, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, this.A02.getDimension(R.dimen.abc_edit_text_inset_top_material), paint);
        canvas2.restore();
    }

    public final void setAlpha(int i) {
        this.A05.setAlpha(i);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.A05.setColorFilter(colorFilter);
    }

    public C86694y7(Resources resources) {
        this.A02 = resources;
        this.A04 = BitmapFactory.decodeResource(resources, R.drawable.small_cloud);
        this.A03 = BitmapFactory.decodeResource(resources, R.drawable.big_cloud);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{1.0f, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER});
        this.A01 = ofFloat;
        ofFloat.setInterpolator((TimeInterpolator) null);
        ofFloat.setRepeatCount(-1);
        ofFloat.addUpdateListener(this);
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.A00 = C18240wQ.A00(valueAnimator.getAnimatedValue());
        invalidateSelf();
    }
}
