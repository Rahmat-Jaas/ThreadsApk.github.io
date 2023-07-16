package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.Spannable;
import android.text.style.ImageSpan;
import android.text.style.LineBackgroundSpan;
import ch.boye.httpclientandroidlib.HttpStatus;

/* renamed from: X.7QL  reason: invalid class name */
public class AnonymousClass7QL implements LineBackgroundSpan {
    public final int A00;
    public final int A01;
    public final int A02;
    public final Paint A03;
    public final RectF A04 = C86134wK.A0E();
    public final Rect A05 = C86134wK.A0D();

    public void drawBackground(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, int i8) {
        char c;
        CharSequence charSequence2 = charSequence;
        char[] charArray = charSequence2.toString().toCharArray();
        for (int i9 = 0; i9 < charArray.length; i9++) {
            switch (charArray[i9]) {
                case 193:
                case 195:
                    c = 'A';
                    break;
                case 199:
                    c = 'C';
                    break;
                case HttpStatus.SC_CREATED /*201*/:
                case HttpStatus.SC_ACCEPTED /*202*/:
                    c = 'E';
                    break;
                case 211:
                case 213:
                    c = 'O';
                    break;
                case 218:
                    c = 'U';
                    break;
                case 225:
                case 227:
                    c = 'a';
                    break;
                case 231:
                    c = 'c';
                    break;
                case 233:
                case 234:
                    c = 'e';
                    break;
                case 243:
                case 245:
                    c = 'o';
                    break;
                case 250:
                    c = 'u';
                    break;
            }
            charArray[i9] = Character.valueOf(c).charValue();
        }
        String str = new String(charArray);
        Rect rect = this.A05;
        int i10 = i6;
        int i11 = i7;
        paint.getTextBounds(str, i10, i11, rect);
        int i12 = 0;
        if (charSequence2 instanceof Spannable) {
            ImageSpan[] imageSpanArr = (ImageSpan[]) ((Spannable) charSequence2).getSpans(i10, i11, ImageSpan.class);
            int length = imageSpanArr.length;
            int i13 = 0;
            while (i12 < length) {
                i13 += C86124wJ.A0A(imageSpanArr[i12].getDrawable());
                i12++;
            }
            i12 = i13;
        }
        int i14 = (i + i2) >> 1;
        RectF rectF = this.A04;
        int width = (rect.width() + i12) >> 1;
        int i15 = this.A00;
        int i16 = this.A01;
        rectF.set((float) ((i14 - width) - i15), (float) ((rect.top + i4) - i16), (float) (i14 + width + i15), (float) (i4 + rect.bottom + i16));
        float f = (float) this.A02;
        canvas.drawRoundRect(rectF, f, f, this.A03);
    }

    public AnonymousClass7QL(int i, int i2, int i3, int i4) {
        Paint A0C = C86114wI.A0C(1);
        this.A03 = A0C;
        A0C.setColor(i);
        C86134wK.A13(A0C);
        this.A02 = i2;
        this.A00 = i3;
        this.A01 = i4;
    }
}
