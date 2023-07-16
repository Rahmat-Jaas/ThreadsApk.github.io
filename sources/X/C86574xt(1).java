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
import android.text.TextPaint;
import com.facebook.fbreactmodules.datepicker.DatePickerDialogModule;
import com.instagram.barcelona.R;
import java.text.NumberFormat;
import java.util.Calendar;
import java.util.Locale;

/* renamed from: X.4xt  reason: invalid class name and case insensitive filesystem */
public final class C86574xt extends Drawable {
    public Bitmap A00;
    public String A01;
    public ColorStateList A02;
    public final Rect A03;
    public final TextPaint A04;
    public final float A05;
    public final float A06;
    public final float A07;
    public final float A08;
    public final float A09;
    public final float A0A;
    public final int A0B;
    public final Paint A0C;
    public final Paint A0D = C86114wI.A0C(1);
    public final RectF A0E = C86134wK.A0E();
    public final Drawable A0F;

    public final int getOpacity() {
        return -3;
    }

    public final boolean isStateful() {
        return true;
    }

    public final int getIntrinsicHeight() {
        return this.A0F.getIntrinsicHeight();
    }

    public final int getIntrinsicWidth() {
        return this.A0F.getIntrinsicWidth();
    }

    public final boolean onStateChange(int[] iArr) {
        ColorStateList colorStateList = this.A02;
        if (colorStateList == null) {
            return false;
        }
        setColorFilter(C63393hP.A00(colorStateList.getColorForState(iArr, this.A0B)));
        return true;
    }

    public final void setAlpha(int i) {
        this.A0D.setAlpha(i);
        invalidateSelf();
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.A0D.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public final void setTintList(ColorStateList colorStateList) {
        this.A02 = colorStateList;
        if (colorStateList != null) {
            setColorFilter(C63393hP.A00(colorStateList.getColorForState(getState(), this.A0B)));
        } else {
            clearColorFilter();
        }
    }

    public C86574xt(Context context) {
        this.A0F = context.getDrawable(R.drawable.instagram_calendar_pano_outline_24);
        this.A0B = context.getColor(R.color.igds_primary_text);
        Paint A0C2 = C86114wI.A0C(1);
        this.A0C = A0C2;
        C86134wK.A13(A0C2);
        A0C2.setColor(-16777216);
        TextPaint textPaint = new TextPaint(1);
        this.A04 = textPaint;
        textPaint.setTypeface(C09250f7.A05.A00(context).A03(C09340fG.A0i));
        textPaint.setTextSize(C09860go.A00(context, 12.5f));
        textPaint.setColor(-16777216);
        textPaint.setTextAlign(Paint.Align.CENTER);
        this.A0A = C09860go.A00(context, 0.5f);
        C86144wL.A18(A0C2, PorterDuff.Mode.CLEAR);
        this.A05 = C09860go.A00(context, 3.0f);
        this.A06 = C09860go.A00(context, 3.0f);
        this.A07 = C09860go.A00(context, 3.0f);
        this.A09 = C09860go.A00(context, 1.5f);
        this.A08 = C09860go.A00(context, 9.0f);
        this.A03 = C86134wK.A0D();
        int i = Calendar.getInstance().get(5);
        C002801h.A01(i, 1, DatePickerDialogModule.ARG_DATE, 31);
        String format = NumberFormat.getInstance(Locale.getDefault()).format((long) i);
        this.A01 = format;
        this.A04.getTextBounds(format, 0, format.length(), this.A03);
        this.A00 = null;
        invalidateSelf();
    }

    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        if (this.A00 == null) {
            Bitmap createBitmap = Bitmap.createBitmap(bounds.width(), bounds.height(), Bitmap.Config.ARGB_8888);
            this.A00 = createBitmap;
            Canvas canvas2 = new Canvas(createBitmap);
            this.A0F.draw(canvas2);
            RectF rectF = this.A0E;
            float f = this.A09;
            canvas2.drawRoundRect(rectF, f, f, this.A0C);
            String str = this.A01;
            if (str != null) {
                float centerX = rectF.centerX();
                float f2 = this.A0A;
                float centerY = rectF.centerY();
                Rect rect = this.A03;
                canvas2.drawText(str, centerX - f2, ((centerY - ((float) rect.top)) - C86134wK.A01(rect.height())) - f2, this.A04);
            }
        }
        canvas.drawBitmap(this.A00, (float) bounds.left, (float) bounds.top, this.A0D);
    }

    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.A0F.setBounds(rect);
        RectF rectF = this.A0E;
        rectF.set(rect);
        rectF.left += this.A06;
        rectF.top += this.A08;
        rectF.right -= this.A07;
        rectF.bottom -= this.A05;
        this.A00 = null;
    }
}
