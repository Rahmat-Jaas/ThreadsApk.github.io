package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Spannable;

/* renamed from: X.65P  reason: invalid class name */
public final class AnonymousClass65P extends AnonymousClass7QL {
    public int A00;
    public int A01;
    public final int[] A02;

    public AnonymousClass65P(int[] iArr, int i, int i2, int i3) {
        super(-1, i, i2, i3);
        this.A02 = iArr;
    }

    public final void drawBackground(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, int i8) {
        C86984ze r1;
        int i9 = i7;
        int i10 = i6;
        CharSequence charSequence2 = charSequence;
        super.drawBackground(canvas, paint, i, i2, i3, i4, i5, charSequence, i6, i7, i8);
        if (charSequence2 instanceof Spannable) {
            Spannable spannable = (Spannable) charSequence2;
            int i11 = (i + i2) >> 1;
            if (i11 != this.A00 || this.A05.width() != this.A01) {
                this.A00 = i11;
                this.A01 = this.A05.width();
                C86984ze[] r12 = (C86984ze[]) spannable.getSpans(i10, i9, C86984ze.class);
                CharSequence subSequence = charSequence2.subSequence(i10, i9);
                if (r12.length > 0) {
                    r1 = r12[0];
                } else {
                    r1 = new C86984ze(subSequence, (float[]) null, this.A02);
                    spannable.setSpan(r1, i10, i9, 18);
                }
                r1.A03 = subSequence.toString();
                r1.A00 = (float) i11;
            }
        }
    }
}
