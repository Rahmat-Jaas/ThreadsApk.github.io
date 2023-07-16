package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import com.instagram.barcelona.R;

/* renamed from: X.4xp  reason: invalid class name and case insensitive filesystem */
public final class C86534xp extends Drawable {
    public final float A00;
    public final float A01;
    public final float A02;
    public final float A03;
    public final float A04;
    public final float A05;
    public final float A06;
    public final float A07;
    public final float A08;
    public final Context A09;
    public final Paint A0A;
    public final Paint A0B;
    public final Rect A0C;
    public final RectF A0D = C86134wK.A0E();
    public final Drawable A0E;
    public final TextPaint A0F;
    public final Integer A0G;
    public final boolean A0H;

    public C86534xp(Context context, Integer num) {
        C04220Ms.A0B(context, 1);
        this.A09 = context;
        this.A0G = num;
        this.A06 = C09860go.A00(context, 24.0f);
        this.A07 = C09860go.A00(context, 6.0f);
        this.A01 = C09860go.A00(context, 14.0f);
        this.A00 = C09860go.A00(context, 18.0f);
        this.A02 = C09860go.A00(context, 5.0f);
        this.A03 = C09860go.A00(context, 100.0f);
        float A002 = C09860go.A00(context, 1.5f);
        this.A04 = A002;
        this.A05 = C09860go.A00(context, 10.0f);
        Drawable drawable = context.getDrawable(R.drawable.instagram_shopping_cart_pano_outline_24);
        C04220Ms.A0A(drawable);
        C63393hP.A03(context, drawable, R.color.fundraiser_sticker_consumption_sheet_donation_disclaimer_bold_text_color);
        this.A0E = drawable;
        boolean z = true;
        Paint A0C2 = C86114wI.A0C(1);
        C86134wK.A12(A0C2);
        C86104wH.A18(context, A0C2, R.color.fundraiser_sticker_consumption_sheet_donation_disclaimer_bold_text_color);
        A0C2.setStrokeWidth(A002);
        this.A0A = A0C2;
        TextPaint textPaint = new TextPaint(1);
        C86104wH.A18(context, textPaint, R.color.fundraiser_sticker_consumption_sheet_donation_disclaimer_bold_text_color);
        textPaint.setTextSize(C09860go.A00(context, 14.0f));
        textPaint.setTextAlign(Paint.Align.CENTER);
        textPaint.setFakeBoldText(true);
        this.A0F = textPaint;
        Paint A0C3 = C86114wI.A0C(1);
        C86134wK.A13(A0C3);
        C86104wH.A18(context, A0C3, R.color.direct_widget_primary_background);
        this.A0B = A0C3;
        Rect A0D2 = C86134wK.A0D();
        this.A0C = A0D2;
        this.A08 = C09860go.A00(context, 8.0f);
        z = (num == null || num.intValue() <= 0) ? false : z;
        this.A0H = z;
        if (z) {
            textPaint.getTextBounds(String.valueOf(num), 0, C86104wH.A0A(num), A0D2);
        }
    }

    public final void draw(Canvas canvas) {
        C04220Ms.A0B(canvas, 0);
        canvas.save();
        this.A0E.draw(canvas);
        if (this.A0H) {
            RectF rectF = this.A0D;
            float f = this.A03;
            canvas.drawRoundRect(rectF, f, f, this.A0B);
            canvas.drawRoundRect(rectF, f, f, this.A0A);
            canvas.drawText(String.valueOf(this.A0G), rectF.centerX(), rectF.centerY() + C86134wK.A01(this.A0C.height()), this.A0F);
        }
        canvas.restore();
    }

    public final int getOpacity() {
        return -3;
    }

    public final void onBoundsChange(Rect rect) {
        C04220Ms.A0B(rect, 0);
        super.onBoundsChange(rect);
        int i = rect.left;
        int centerY = rect.centerY();
        Drawable drawable = this.A0E;
        int intrinsicHeight = centerY - (drawable.getIntrinsicHeight() >> 1);
        drawable.setBounds(i, intrinsicHeight, rect.right - ((int) this.A06), drawable.getIntrinsicHeight() + intrinsicHeight);
        if (this.A0H) {
            RectF rectF = this.A0D;
            C86164wN.A16(rectF, drawable);
            float f = rectF.top - (((float) ((int) this.A07)) + (this.A04 / 2.0f));
            rectF.top = f;
            float f2 = rectF.left + this.A01;
            rectF.left = f2;
            rectF.bottom = f + this.A00;
            float f3 = f2 + (this.A02 * 2.0f);
            float width = (float) this.A0C.width();
            float f4 = this.A08;
            if (width < f4) {
                width = f4;
            }
            rectF.right = f3 + width;
        }
    }

    public final int getIntrinsicHeight() {
        return (int) (((float) this.A0E.getIntrinsicHeight()) + (this.A05 * ((float) 2)));
    }

    public final int getIntrinsicWidth() {
        return (int) (((float) this.A0E.getIntrinsicWidth()) + this.A06);
    }

    public final void setAlpha(int i) {
        this.A0E.setAlpha(i);
        this.A0B.setAlpha(i);
        this.A0A.setAlpha(i);
        this.A0F.setAlpha(i);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.A0E.setColorFilter(colorFilter);
        this.A0F.setColorFilter(colorFilter);
        this.A0A.setColorFilter(colorFilter);
    }
}
