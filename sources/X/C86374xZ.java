package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;

/* renamed from: X.4xZ  reason: invalid class name and case insensitive filesystem */
public final class C86374xZ extends Drawable {
    public String A00;
    public final Paint A01;
    public final Rect A02;
    public final Drawable A03;

    public final int getOpacity() {
        return -3;
    }

    public final void setAlpha(int i) {
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public final void draw(Canvas canvas) {
        this.A03.draw(canvas);
        String str = this.A00;
        if (str != null && !str.isEmpty()) {
            canvas.drawText(str, (float) getBounds().centerX(), (float) this.A02.bottom, this.A01);
        }
    }

    public C86374xZ(int i, int i2, int i3, int i4) {
        Paint A0F = C86144wL.A0F();
        this.A01 = A0F;
        A0F.setFilterBitmap(true);
        A0F.setAntiAlias(true);
        A0F.setTypeface(Typeface.DEFAULT_BOLD);
        A0F.setTextAlign(Paint.Align.CENTER);
        A0F.setTextSize((float) i2);
        A0F.setColor(i3);
        Rect A0D = C86134wK.A0D();
        this.A02 = A0D;
        AnonymousClass4xC r4 = new AnonymousClass4xC(i4);
        this.A03 = r4;
        A0F.getTextBounds("0:00:00", 0, 7, A0D);
        A0D.offsetTo(i, i);
        int i5 = i << 1;
        setBounds(0, 0, A0D.width() + i5, A0D.height() + i5);
        r4.setBounds(getBounds());
    }

    public final int getIntrinsicHeight() {
        return C86134wK.A08(this);
    }

    public final int getIntrinsicWidth() {
        return C86124wJ.A0A(this);
    }
}
