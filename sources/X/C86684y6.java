package X;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.facebook.react.uimanager.BaseViewManager;

/* renamed from: X.4y6  reason: invalid class name and case insensitive filesystem */
public final class C86684y6 extends Drawable implements Animator.AnimatorListener, C144458iX, ValueAnimator.AnimatorUpdateListener {
    public int A00;
    public int A01;
    public Drawable A02;
    public Integer A03 = AnonymousClass006.A00;
    public final ValueAnimator A04;
    public final Matrix A05 = C86164wN.A0E();
    public final Matrix A06 = C86164wN.A0E();
    public final Drawable A07;

    public final int getOpacity() {
        return -3;
    }

    public final void onAnimationCancel(Animator animator) {
    }

    public final void onAnimationRepeat(Animator animator) {
    }

    public final void setAlpha(int i) {
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }

    private void A00() {
        float f;
        float f2;
        Drawable drawable = this.A02;
        if (drawable != null) {
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), this.A02.getIntrinsicHeight());
            Matrix matrix = this.A05;
            Drawable drawable2 = this.A02;
            matrix.reset();
            int intrinsicWidth = drawable2.getIntrinsicWidth();
            int intrinsicHeight = drawable2.getIntrinsicHeight();
            int i = this.A00;
            int i2 = intrinsicWidth * i;
            int i3 = this.A01;
            int i4 = i3 * intrinsicHeight;
            float f3 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
            if (i2 > i4) {
                f = ((float) i) / ((float) intrinsicHeight);
                f3 = (((float) i3) - (((float) intrinsicWidth) * f)) * 0.5f;
                f2 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
            } else {
                f = ((float) i3) / ((float) intrinsicWidth);
                f2 = (((float) i) - (((float) intrinsicHeight) * f)) * 0.5f;
            }
            matrix.setScale(f, f);
            matrix.postTranslate((float) ((int) (f3 + 0.5f)), (float) ((int) (f2 + 0.5f)));
        }
        C86124wJ.A1C(this.A07);
        invalidateSelf();
    }

    public static void A01(Drawable drawable, String str, StringBuilder sb) {
        String A0q;
        if (drawable != null) {
            sb.append(str);
            sb.append(":");
            if (drawable instanceof C144458iX) {
                sb.append(",image:");
                A0q = ((C144458iX) drawable).AoM();
            } else if (drawable instanceof BitmapDrawable) {
                Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
                if (bitmap != null) {
                    sb.append("bmp:");
                    sb.append(bitmap.getWidth());
                    sb.append("x");
                    sb.append(bitmap.getHeight());
                    return;
                }
                return;
            } else {
                sb.append(",drawable (no bitmap info):");
                A0q = C18220wO.A0q(drawable);
            }
            sb.append(A0q);
        }
    }

    public final String AoM() {
        String str;
        StringBuilder A0s = C18190wL.A0s("[TransitionAnimationDrawable:");
        A01(this.A02, "source", A0s);
        A0s.append(", src mat:");
        A0s.append(this.A05.toShortString());
        A01(this.A07, ", target", A0s);
        A0s.append(", src mat:");
        A0s.append(this.A06.toShortString());
        A0s.append(", State:");
        switch (this.A03.intValue()) {
            case 1:
                str = "IN_TRANSITION";
                break;
            case 2:
                str = "POST_TRANSITION";
                break;
            default:
                str = "PRE_TRANSITION";
                break;
        }
        A0s.append(str);
        A0s.append(", animation:");
        A0s.append(this.A04.getAnimatedFraction());
        return C18180wK.A0i("]", A0s);
    }

    public final void draw(Canvas canvas) {
        if (!(this.A03 == AnonymousClass006.A0C || this.A02 == null)) {
            int saveCount = canvas.getSaveCount();
            canvas.save();
            canvas.concat(this.A05);
            this.A02.draw(canvas);
            canvas.restoreToCount(saveCount);
        }
        if (this.A03 != AnonymousClass006.A00) {
            this.A07.draw(canvas);
        }
    }

    public final int getIntrinsicHeight() {
        return this.A00;
    }

    public final int getIntrinsicWidth() {
        return this.A01;
    }

    public final void onAnimationEnd(Animator animator) {
        this.A03 = AnonymousClass006.A0C;
        this.A07.setAlpha(255);
        this.A02 = null;
    }

    public final void onAnimationStart(Animator animator) {
        this.A03 = AnonymousClass006.A01;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.A07.setAlpha(AnonymousClass0wJ.A04(valueAnimator.getAnimatedValue()));
        invalidateSelf();
    }

    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.A02;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        this.A01 = rect.width();
        this.A00 = rect.height();
        A00();
    }

    public C86684y6(Drawable drawable, Drawable drawable2) {
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{0, 255});
        this.A04 = ofInt;
        this.A02 = drawable;
        this.A07 = drawable2;
        drawable2.setAlpha(0);
        this.A01 = drawable2.getIntrinsicWidth();
        this.A00 = drawable2.getIntrinsicHeight();
        ofInt.addListener(this);
        ofInt.addUpdateListener(this);
        A00();
    }
}
