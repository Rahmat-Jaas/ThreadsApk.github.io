package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import com.facebook.react.uimanager.BaseViewManager;
import kotlin.jvm.internal.KtLambdaShape97S0100000_I2_77;

/* renamed from: X.4xs  reason: invalid class name and case insensitive filesystem */
public final class C86564xs extends Drawable {
    public Bitmap A00;
    public String A01;
    public final float A02;
    public final Paint A03 = C86144wL.A0F();
    public final C04530Oa A04 = AnonymousClass0OY.A01(AnonymousClass006.A0C, new KtLambdaShape97S0100000_I2_77(this, 40));
    public final Rect A05 = C86134wK.A0D();
    public final RectF A06 = C86134wK.A0E();
    public final C109476k4 A07 = new C109476k4();

    public final void A00(String str) {
        if (str == null || str.length() == 0) {
            this.A00 = null;
        } else if (!str.equals(this.A01)) {
            try {
                C109476k4 r8 = this.A07;
                float f = this.A02;
                Paint paint = r8.A01;
                paint.setTextSize(f);
                int A002 = AnonymousClass2C6.A00(str);
                Rect rect = r8.A02;
                paint.getTextBounds(str, 0, A002, rect);
                Bitmap createBitmap = Bitmap.createBitmap(rect.width(), rect.height(), Bitmap.Config.ARGB_8888);
                Canvas canvas = r8.A00;
                canvas.setBitmap(createBitmap);
                canvas.drawText(str, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, -((float) rect.top), paint);
                C04220Ms.A06(createBitmap);
                this.A00 = createBitmap;
            } catch (IllegalArgumentException e) {
                C10450iM.A04("EmojiDrawable_IllegalArgumentException", AnonymousClass00U.A0e("emoji: ", str, " [", e.getMessage(), ']'), 1);
                ((Paint) this.A04.getValue()).getTextBounds(str, 0, AnonymousClass2C6.A00(str), this.A05);
            }
        }
        this.A01 = str;
    }

    public final void draw(Canvas canvas) {
        boolean quickReject;
        C04220Ms.A0B(canvas, 0);
        RectF rectF = this.A06;
        if (Build.VERSION.SDK_INT >= 30) {
            quickReject = canvas.quickReject(rectF);
        } else {
            quickReject = canvas.quickReject(rectF, Canvas.EdgeType.BW);
        }
        if (!quickReject) {
            Bitmap bitmap = this.A00;
            if (bitmap != null) {
                canvas.drawBitmap(bitmap, getBounds().exactCenterX() - (((float) bitmap.getWidth()) / 2.0f), getBounds().exactCenterY() - (((float) bitmap.getHeight()) / 2.0f), this.A03);
                return;
            }
            String str = this.A01;
            if (str != null) {
                float exactCenterX = getBounds().exactCenterX();
                Rect rect = this.A05;
                float exactCenterX2 = exactCenterX - rect.exactCenterX();
                float exactCenterY = getBounds().exactCenterY() - rect.exactCenterY();
                C04530Oa r3 = this.A04;
                Paint paint = this.A03;
                ((Paint) r3.getValue()).setAlpha(paint.getAlpha());
                ((Paint) r3.getValue()).setColorFilter(paint.getColorFilter());
                canvas.drawText(str, exactCenterX2, exactCenterY, (Paint) r3.getValue());
            }
        }
    }

    public final int getOpacity() {
        return -3;
    }

    public final void onBoundsChange(Rect rect) {
        C04220Ms.A0B(rect, 0);
        super.onBoundsChange(rect);
        this.A06.set(rect);
    }

    public final int getAlpha() {
        return this.A03.getAlpha();
    }

    public final ColorFilter getColorFilter() {
        return this.A03.getColorFilter();
    }

    public final int getIntrinsicHeight() {
        Bitmap bitmap = this.A00;
        if (bitmap != null) {
            return bitmap.getHeight();
        }
        return this.A05.height();
    }

    public final int getIntrinsicWidth() {
        Bitmap bitmap = this.A00;
        if (bitmap != null) {
            return bitmap.getWidth();
        }
        return this.A05.width();
    }

    public final void setAlpha(int i) {
        this.A03.setAlpha(i);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.A03.setColorFilter(colorFilter);
    }

    public C86564xs(float f) {
        this.A02 = f;
    }
}
