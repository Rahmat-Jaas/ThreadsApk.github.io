package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.instagram.barcelona.R;

/* renamed from: X.4xc  reason: invalid class name and case insensitive filesystem */
public final class C86404xc extends Drawable {
    public final float A00;
    public final float A01;
    public final Paint A02;
    public final Drawable A03;
    public final C86294xP A04;

    public final int getOpacity() {
        return -3;
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public final int getIntrinsicHeight() {
        return Math.round(this.A01 * 2.0f);
    }

    public final int getIntrinsicWidth() {
        return Math.round(this.A01 * 2.0f);
    }

    public final void setAlpha(int i) {
        this.A03.setAlpha(i);
        this.A02.setAlpha(i);
        this.A04.setAlpha(i);
        invalidateSelf();
    }

    public C86404xc(Context context, Drawable drawable) {
        Paint A0C = C86114wI.A0C(1);
        this.A02 = A0C;
        float f = C18230wP.A0E(context).density;
        this.A01 = 23.0f * f;
        this.A00 = 13.0f * f;
        this.A03 = drawable;
        C63393hP.A03(context, drawable, R.color.fundraiser_sticker_consumption_sheet_donation_disclaimer_bold_text_color);
        C86134wK.A13(A0C);
        C86104wH.A18(context, A0C, R.color.direct_widget_primary_background);
        this.A04 = new C86294xP(context.getColor(R.color.gallery_item_selection_circle_shadow_color), Math.round(f * 10.0f));
    }

    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        C86294xP r0 = this.A04;
        r0.setBounds(bounds);
        r0.draw(canvas);
        float exactCenterX = bounds.exactCenterX();
        float exactCenterY = bounds.exactCenterY();
        float f = this.A01;
        canvas.drawCircle(exactCenterX, exactCenterY, f, this.A02);
        Drawable drawable = this.A03;
        float f2 = this.A00;
        drawable.setBounds((int) ((exactCenterX - f) + f2), (int) ((exactCenterY - f) + f2), (int) ((exactCenterX + f) - f2), (int) ((exactCenterY + f) - f2));
        drawable.draw(canvas);
    }
}
