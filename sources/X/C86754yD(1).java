package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.text.TextUtils;
import com.facebook.react.uimanager.BaseViewManager;

/* renamed from: X.4yD  reason: invalid class name and case insensitive filesystem */
public final class C86754yD extends Drawable implements C27927Evd {
    public float A00;
    public String A01;
    public boolean A02;
    public final C25812DsR A03;
    public final Paint A04;
    public final Path A05;
    public final Rect A06 = C86134wK.A0D();
    public final RectF A07 = C86134wK.A0E();
    public final TextPaint A08;

    public final void CLf(C25812DsR dsR) {
    }

    public final void CLg(C25812DsR dsR) {
    }

    public final void CLh(C25812DsR dsR) {
    }

    public final int getOpacity() {
        return 1;
    }

    public final boolean isStateful() {
        return true;
    }

    public final void setAlpha(int i) {
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public final void CLi(C25812DsR dsR) {
        this.A00 = (float) dsR.A09.A00;
        invalidateSelf();
    }

    public final void draw(Canvas canvas) {
        if (this.A00 != BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
            Canvas canvas2 = canvas;
            int width = canvas2.getWidth();
            float height = (float) canvas2.getHeight();
            float f = height / 2.0f;
            float min = (float) Math.min(Math.max(C98896Hi.A00((double) this.A00, 0.0d, 1.0d, 0.0d, 1.0d), 0.0d), 1.0d);
            TextPaint textPaint = this.A08;
            String str = this.A01;
            int length = str.length();
            Rect rect = this.A06;
            textPaint.getTextBounds(str, 0, length, rect);
            float f2 = (float) width;
            float f3 = f2 - height;
            this.A01 = TextUtils.ellipsize(this.A01, textPaint, f3, TextUtils.TruncateAt.END).toString();
            float f4 = f3 * min;
            float f5 = ((f2 - f4) / 2.0f) - f;
            float f6 = f2 / 2.0f;
            int round = Math.round(min * 255.0f);
            boolean z = this.A02;
            Paint paint = this.A04;
            int i = 255;
            if (z) {
                i = 179;
            }
            paint.setAlpha(i);
            textPaint.setAlpha(i);
            Path path = this.A05;
            path.reset();
            RectF rectF = this.A07;
            rectF.set(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, height, height);
            path.arcTo(rectF, 90.0f, 180.0f, false);
            path.moveTo(f, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
            rectF.set(f4, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, f4 + height, height);
            path.arcTo(rectF, 270.0f, 180.0f, false);
            path.lineTo(f, height);
            path.offset(f5, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
            Canvas canvas3 = canvas2;
            canvas3.drawPath(path, paint);
            canvas3.clipPath(path);
            textPaint.setAlpha(round);
            canvas2.drawText(this.A01, f6, f - ((float) rect.centerY()), textPaint);
        }
    }

    public final boolean onStateChange(int[] iArr) {
        boolean z = this.A02;
        this.A02 = false;
        boolean z2 = false;
        int length = iArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            int i2 = iArr[i];
            if (i2 == 16842919 || i2 == 16842908) {
                this.A02 = true;
                z2 = true;
            } else {
                i++;
            }
        }
        if (z2 == z) {
            return false;
        }
        invalidateSelf();
        return true;
    }

    public C86754yD(String str, float f, int i, int i2) {
        this.A01 = str;
        TextPaint textPaint = new TextPaint();
        this.A08 = textPaint;
        textPaint.setColor(i);
        textPaint.setTextAlign(Paint.Align.CENTER);
        textPaint.setTextSize(f);
        textPaint.setAntiAlias(true);
        this.A05 = C86144wL.A0G();
        Paint A0F = C86144wL.A0F();
        this.A04 = A0F;
        A0F.setColor(i2);
        A0F.setAntiAlias(true);
        C25812DsR A0P = C86114wI.A0P();
        A0P.A06 = true;
        A0P.A0E(this);
        this.A03 = A0P;
    }
}
