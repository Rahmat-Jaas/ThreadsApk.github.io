package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.LeadingMarginSpan;
import com.instagram.barcelona.R;

/* renamed from: X.7QI  reason: invalid class name */
public final class AnonymousClass7QI implements LeadingMarginSpan {
    public final int A00;
    public final int A01;
    public final int A02;

    public AnonymousClass7QI() {
        this(0, 0, 7);
    }

    public /* synthetic */ AnonymousClass7QI(int i, int i2, int i3) {
        int i4 = 0;
        i = (i3 & 1) != 0 ? 4 : i;
        i2 = (i3 & 2) != 0 ? 2 : i2;
        i4 = (i3 & 4) != 0 ? R.color.igds_primary_text : i4;
        this.A00 = i;
        this.A02 = i2;
        this.A01 = i4;
    }

    public final int getLeadingMargin(boolean z) {
        return (this.A00 << 1) + this.A02;
    }

    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
        float A012;
        AnonymousClass0wJ.A1N(canvas, paint);
        C04220Ms.A0B(charSequence, 7);
        if (((Spanned) charSequence).getSpanStart(this) == i6) {
            Paint.Style style = paint.getStyle();
            int color = paint.getColor();
            C86134wK.A13(paint);
            int i8 = this.A01;
            if (i8 != R.color.igds_primary_text) {
                paint.setColor(i8);
            }
            int i9 = this.A00;
            float f = (float) (i + (i2 * i9));
            Layout layout2 = layout;
            if (layout != null) {
                A012 = ((float) layout2.getLineBaseline(layout2.getLineForOffset(i6))) - ((float) i9);
            } else {
                A012 = C86134wK.A01(i3 + i5);
            }
            canvas.drawCircle(f, A012, (float) i9, paint);
            paint.setStyle(style);
            paint.setColor(color);
        }
    }
}
