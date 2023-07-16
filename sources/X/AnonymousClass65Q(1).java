package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Spannable;

/* renamed from: X.65Q  reason: invalid class name */
public final class AnonymousClass65Q extends AnonymousClass7QL {
    public int A00;
    public int A01;
    public final float[] A02;
    public final int[] A03;
    public final int[] A04;

    public AnonymousClass65Q(float[] fArr, int[] iArr, int[] iArr2, int i, int i2) {
        super(-1, i, i2, i2);
        this.A03 = iArr;
        this.A02 = fArr;
        this.A04 = iArr2;
    }

    public final void drawBackground(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, int i8) {
        Paint paint2 = paint;
        CharSequence charSequence2 = charSequence;
        int i9 = i7;
        int i10 = i;
        CharSequence charSequence3 = charSequence2;
        super.drawBackground(canvas, paint2, i10, i2, i3, i4, i5, charSequence3, i6, i9, i8);
        if (charSequence2 instanceof Spannable) {
            Spannable spannable = (Spannable) charSequence2;
            CharSequence subSequence = charSequence2.subSequence(0, 1);
            String charSequence4 = charSequence2.toString();
            int length = charSequence2.length();
            Rect rect = this.A05;
            paint2.getTextBounds(charSequence4, 0, length, rect);
            int width = rect.width();
            int height = rect.height();
            int i11 = ((i + i2) - width) >> 1;
            int i12 = ((i3 + i5) - height) >> 1;
            if (i11 != this.A00 || width != this.A01) {
                this.A00 = i11;
                this.A01 = width;
                Rect A0D = C86134wK.A0D();
                paint2.getTextBounds(subSequence.toString(), 0, 1, A0D);
                spannable.setSpan(new C86984ze(charSequence2, (float[]) null, this.A04), 1, i9, 18);
                int[] iArr = this.A03;
                float[] fArr = this.A02;
                spannable.setSpan(new C86974zd(AnonymousClass006.A01, fArr, iArr, i11, A0D.width() + i11, i12, A0D.height() + i12), 0, 1, 18);
            }
        }
    }
}
