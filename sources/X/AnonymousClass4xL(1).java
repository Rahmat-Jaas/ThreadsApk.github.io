package X;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* renamed from: X.4xL  reason: invalid class name */
public final class AnonymousClass4xL extends Drawable {
    public float A00;
    public int A01;
    public ColorStateList A02;
    public final int A03;
    public final Paint A04;
    public final Paint A05;
    public final RectF A06 = C86134wK.A0E();
    public final Drawable A07;

    public final int getOpacity() {
        return -3;
    }

    public final void setAlpha(int i) {
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public AnonymousClass4xL(ColorStateList colorStateList, Drawable drawable, float f, int i, int i2, int i3, int i4) {
        Paint A0C = C86114wI.A0C(1);
        this.A04 = A0C;
        C86134wK.A13(A0C);
        if (i3 > 0 && i4 != 0) {
            this.A03 = i3;
            Paint A0C2 = C86114wI.A0C(1);
            this.A05 = A0C2;
            C86134wK.A12(A0C2);
            A0C2.setColor(i4);
            A0C2.setStrokeWidth((float) i3);
        }
        this.A01 = i;
        this.A00 = f;
        this.A02 = colorStateList;
        this.A07 = drawable;
        drawable.setColorFilter(C63393hP.A00(i2));
    }

    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        int round = Math.round((((float) Math.min(bounds.height(), bounds.width())) - (((float) this.A01) * 2.0f)) / 2.0f);
        RectF rectF = this.A06;
        C86164wN.A16(rectF, this);
        float f = (float) 0;
        rectF.inset(f, f);
        Paint paint = this.A04;
        paint.setColor(this.A02.getColorForState(getState(), 0));
        canvas.drawCircle(bounds.exactCenterX(), bounds.exactCenterY(), (float) round, paint);
        Paint paint2 = this.A05;
        if (paint2 != null) {
            float f2 = ((float) this.A03) / 2.0f;
            rectF.inset(f2, f2);
            float f3 = this.A00;
            canvas.drawRoundRect(rectF, f3, f3, paint2);
        }
        Drawable drawable = this.A07;
        if (drawable != null) {
            canvas.save();
            Rect bounds2 = drawable.getBounds();
            if ((bounds2.width() == 0 || bounds2.height() == 0) && drawable.getIntrinsicWidth() > 0 && drawable.getIntrinsicHeight() > 0) {
                C86124wJ.A1C(drawable);
            }
            canvas.translate((((float) bounds.width()) / 2.0f) - (((float) bounds2.width()) / 2.0f), (((float) bounds.height()) / 2.0f) - (((float) bounds2.height()) / 2.0f));
            drawable.draw(canvas);
            canvas.restore();
        }
    }
}
