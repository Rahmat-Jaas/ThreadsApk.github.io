package X;

import android.text.Spannable;
import android.text.style.ClickableSpan;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.6cI  reason: invalid class name and case insensitive filesystem */
public final class C104736cI {
    public final List A00;

    public C104736cI(Spannable spannable, ClickableSpan[] clickableSpanArr) {
        ArrayList A0v = AnonymousClass0wJ.A0v();
        int i = 0;
        while (true) {
            int length = clickableSpanArr.length;
            if (i < length) {
                ClickableSpan clickableSpan = clickableSpanArr[i];
                int spanStart = spannable.getSpanStart(clickableSpan);
                int spanEnd = spannable.getSpanEnd(clickableSpan);
                if (spanStart != spanEnd && spanStart >= 0 && spanEnd >= 0 && spanStart <= spannable.length() && spanEnd <= spannable.length()) {
                    C109726kW r1 = new C109726kW();
                    r1.A03 = spannable.subSequence(spanStart, spanEnd).toString();
                    r1.A02 = spanStart;
                    r1.A00 = spanEnd;
                    r1.A01 = (length - 1) - i;
                    A0v.add(r1);
                }
                i++;
            } else {
                this.A00 = A0v;
                return;
            }
        }
    }
}
