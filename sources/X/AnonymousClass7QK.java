package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Spannable;
import android.text.style.LineBackgroundSpan;

/* renamed from: X.7QK  reason: invalid class name */
public final class AnonymousClass7QK implements LineBackgroundSpan {
    public int A00;
    public int A01;
    public final Rect A02 = C86134wK.A0D();
    public final float[] A03;
    public final int[] A04;

    public final void drawBackground(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, int i8) {
        C86984ze r1;
        CharSequence charSequence2 = charSequence;
        String charSequence3 = charSequence2.toString();
        Rect rect = this.A02;
        int i9 = i7;
        int i10 = i6;
        paint.getTextBounds(charSequence3, i10, i9, rect);
        if (charSequence2 instanceof Spannable) {
            Spannable spannable = (Spannable) charSequence2;
            int i11 = (i + i2) >> 1;
            if (i11 != this.A00 || rect.width() != this.A01) {
                this.A00 = i11;
                this.A01 = rect.width();
                C86984ze[] r12 = (C86984ze[]) spannable.getSpans(i10, i9, C86984ze.class);
                CharSequence subSequence = charSequence2.subSequence(i10, i9);
                if (r12.length > 0) {
                    r1 = r12[0];
                } else {
                    r1 = new C86984ze(subSequence, this.A03, this.A04);
                    spannable.setSpan(r1, i10, i9, 18);
                }
                r1.A03 = subSequence.toString();
                r1.A00 = (float) i11;
            }
        }
    }

    public AnonymousClass7QK(float[] fArr, int[] iArr) {
        this.A04 = iArr;
        this.A03 = fArr;
    }
}
