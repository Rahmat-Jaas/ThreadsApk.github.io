package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.facebook.react.uimanager.BaseViewManager;

/* renamed from: X.4y2  reason: invalid class name and case insensitive filesystem */
public final class C86664y2 extends Drawable {
    public float A00;
    public ColorStateList A01;
    public String A02;
    public String A03;
    public int A04 = 255;
    public Bitmap A05;
    public boolean A06;
    public final Paint A07;
    public final String A08;
    public final int A09;
    public final Paint A0A;
    public final Rect A0B;
    public final RectF A0C;

    private void A00() {
        this.A06 = true;
        Paint paint = this.A07;
        String str = this.A02;
        int length = str.length();
        Rect rect = this.A0B;
        paint.getTextBounds(str, 0, length, rect);
        rect.offsetTo(0, 0);
        setBounds(0, 0, rect.width(), rect.height());
    }

    public final int getOpacity() {
        return -3;
    }

    public final boolean isStateful() {
        return true;
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public C86664y2(Context context, ColorStateList colorStateList, float f, float f2, int i, int i2, int i3) {
        String str;
        String str2;
        Paint A0C2 = C86114wI.A0C(1);
        this.A0A = A0C2;
        C86134wK.A13(A0C2);
        this.A08 = "+";
        this.A09 = i3;
        Paint A0F = C86144wL.A0F();
        this.A07 = A0F;
        A0F.setFilterBitmap(true);
        A0F.setAntiAlias(true);
        if (i2 == 0) {
            C86144wL.A18(A0F, PorterDuff.Mode.DST_OUT);
        } else {
            A0F.setColor(i2);
        }
        A0F.setTypeface(C86154wM.A0C(context));
        A0F.setTextAlign(Paint.Align.CENTER);
        this.A0B = C86134wK.A0D();
        this.A0C = C86134wK.A0E();
        if (i < 100) {
            str = String.valueOf(i);
        } else {
            str = "99+";
        }
        this.A03 = str;
        String str3 = this.A08;
        if (str3 != null) {
            this.A03 = AnonymousClass00U.A0L(str3, str);
        }
        if (i < 10) {
            str2 = "8";
        } else if (i < 100) {
            str2 = "88";
        } else {
            str2 = "888";
        }
        this.A02 = str2;
        A00();
        this.A00 = f;
        A00();
        this.A01 = colorStateList;
        A00();
        A00();
        this.A07.setTextSize(f2);
        A00();
    }

    public final void draw(Canvas canvas) {
        if (this.A06) {
            Bitmap bitmap = this.A05;
            if (bitmap != null) {
                if (bitmap.getWidth() == C86124wJ.A0A(this) && this.A05.getHeight() == C86134wK.A08(this)) {
                    this.A05.eraseColor(0);
                    Canvas canvas2 = new Canvas(this.A05);
                    RectF rectF = this.A0C;
                    C86164wN.A16(rectF, this);
                    float f = (float) this.A09;
                    rectF.inset(f, f);
                    Paint paint = this.A0A;
                    paint.setColor(this.A01.getColorForState(getState(), 0));
                    paint.setAlpha(this.A04);
                    float f2 = this.A00;
                    canvas2.drawRoundRect(rectF, f2, f2, paint);
                    canvas2.drawText(this.A03, (float) getBounds().centerX(), ((float) getBounds().centerY()) + (((float) this.A0B.height()) / 2.0f), this.A07);
                } else {
                    this.A05.recycle();
                }
            }
            this.A05 = Bitmap.createBitmap(C86124wJ.A0A(this), C86134wK.A08(this), Bitmap.Config.ARGB_8888);
            Canvas canvas22 = new Canvas(this.A05);
            RectF rectF2 = this.A0C;
            C86164wN.A16(rectF2, this);
            float f3 = (float) this.A09;
            rectF2.inset(f3, f3);
            Paint paint2 = this.A0A;
            paint2.setColor(this.A01.getColorForState(getState(), 0));
            paint2.setAlpha(this.A04);
            float f22 = this.A00;
            canvas22.drawRoundRect(rectF2, f22, f22, paint2);
            canvas22.drawText(this.A03, (float) getBounds().centerX(), ((float) getBounds().centerY()) + (((float) this.A0B.height()) / 2.0f), this.A07);
        }
        Bitmap bitmap2 = this.A05;
        if (bitmap2 == null || bitmap2.isRecycled()) {
            C10450iM.A03("CounterPillDrawable", "cachebitmap null or recycled");
        } else {
            canvas.drawBitmap(this.A05, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, (Paint) null);
        }
    }

    public final void setAlpha(int i) {
        this.A04 = i;
        this.A0A.setAlpha(i);
        this.A07.setAlpha(i);
    }

    public final int getIntrinsicHeight() {
        return C86134wK.A08(this);
    }

    public final int getIntrinsicWidth() {
        return C86124wJ.A0A(this);
    }
}
