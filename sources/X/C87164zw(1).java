package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.style.ReplacementSpan;

/* renamed from: X.4zw  reason: invalid class name and case insensitive filesystem */
public class C87164zw extends ReplacementSpan {
    public int A00;
    public int A01;
    public Rect A02;
    public final int A03;
    public final Paint.FontMetricsInt A04 = new Paint.FontMetricsInt();
    public final Rect A05;
    public final Drawable A06;

    public static final void A00(Paint.FontMetricsInt fontMetricsInt, int i, int i2) {
        if (i < fontMetricsInt.ascent) {
            fontMetricsInt.ascent = i;
        }
        if (i < fontMetricsInt.top) {
            fontMetricsInt.top = i;
        }
        if (i2 > fontMetricsInt.descent) {
            fontMetricsInt.descent = i2;
        }
        if (i2 > fontMetricsInt.bottom) {
            fontMetricsInt.bottom = i2;
        }
    }

    public final int A01(int i, int i2) {
        int i3;
        int i4;
        int i5 = this.A03;
        if (i5 == 0) {
            return (i2 - this.A00) - this.A05.bottom;
        }
        if (i5 != 2) {
            i4 = -this.A00;
            i3 = this.A05.bottom;
        } else {
            Rect rect = this.A05;
            i3 = rect.bottom;
            i4 = i + (((((i2 - i) + rect.top) + i3) - this.A00) / 2);
        }
        return i4 - i3;
    }

    public final void A02() {
        Rect bounds = this.A06.getBounds();
        this.A02 = bounds;
        int width = bounds.width();
        Rect rect = this.A05;
        this.A01 = width + rect.left + rect.right;
        this.A00 = this.A02.height();
    }

    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        int A012;
        Paint.FontMetricsInt fontMetricsInt = this.A04;
        paint.getFontMetricsInt(fontMetricsInt);
        int i6 = fontMetricsInt.ascent;
        int i7 = fontMetricsInt.descent;
        if (this instanceof C91305g1) {
            C91305g1 r2 = (C91305g1) this;
            if (r2.A01 != 1) {
                i6 = i3 - i4;
                i7 = i5 - i4;
            }
            A012 = r2.A01(i6, i7);
        } else {
            A012 = A01(i6, i7);
        }
        int i8 = i4 + A012;
        float f2 = f + ((float) this.A05.left);
        canvas.translate(f2, (float) i8);
        this.A06.draw(canvas);
        canvas.translate(-f2, (float) (-i8));
    }

    public C87164zw(Rect rect, Drawable drawable, int i) {
        this.A06 = drawable;
        this.A03 = i;
        this.A05 = rect;
        A02();
    }

    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        int i3;
        int i4;
        A02();
        if (fontMetricsInt != null) {
            if (this instanceof C91305g1) {
                C91305g1 r7 = (C91305g1) this;
                int i5 = r7.A01;
                if (i5 == 1) {
                    i3 = fontMetricsInt.ascent;
                    i4 = fontMetricsInt.descent;
                } else {
                    i3 = fontMetricsInt.top;
                    i4 = fontMetricsInt.bottom;
                }
                int A012 = r7.A01(i3, i4);
                int i6 = r7.A00 + A012;
                int i7 = r7.A00;
                Rect rect = r7.A05;
                int i8 = A012 - rect.top;
                if (i7 == 2) {
                    i6 += rect.bottom;
                    if (i5 == 0) {
                        int abs = Math.abs(fontMetricsInt.bottom) / 2;
                        i8 -= abs;
                        i6 += abs;
                    }
                }
                A00(fontMetricsInt, i8, i6);
                return r7.A01;
            }
            int A013 = A01(fontMetricsInt.ascent, fontMetricsInt.descent);
            int i9 = this.A00 + A013;
            int i10 = this.A03;
            Rect rect2 = this.A05;
            int i11 = A013 - rect2.top;
            if (i10 == 2) {
                i9 += rect2.bottom;
            }
            A00(fontMetricsInt, i11, i9);
        }
        return this.A01;
    }
}
