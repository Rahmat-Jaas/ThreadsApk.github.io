package X;

import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.view.View;
import java.util.List;

/* renamed from: X.55u  reason: invalid class name */
public final class AnonymousClass55u extends C879455k {
    public static int A04;
    public boolean A00 = true;
    public Spanned A01;
    public final View A02;
    public final List A03 = AnonymousClass0wJ.A0v();

    public AnonymousClass55u(View view) {
        super(view);
        this.A02 = view;
    }

    public static final void A01(AnonymousClass55u r11) {
        C146308m1 r2 = (C146308m1) r11.A02;
        if (r2.getText() != r11.A01 && (r2.getText() instanceof Spanned)) {
            List list = r11.A03;
            list.clear();
            CharSequence text = r2.getText();
            C04220Ms.A0C(text, C28174Ezk.A00(23));
            Spanned spanned = (Spanned) text;
            r11.A01 = spanned;
            if (spanned != null) {
                if (r11.A00) {
                    C110876mQ r1 = new C110876mQ();
                    r1.A05 = spanned.toString();
                    r1.A01 = 0;
                    r1.A00 = spanned.length();
                    r1.A06 = true;
                    list.add(r1);
                }
                ClickableSpan[] A0d = r11.A0d(0, spanned.length());
                if (A0d != null) {
                    for (ClickableSpan clickableSpan : A0d) {
                        int spanStart = spanned.getSpanStart(clickableSpan);
                        int spanEnd = spanned.getSpanEnd(clickableSpan);
                        C110876mQ r12 = new C110876mQ();
                        r12.A05 = spanned.subSequence(spanStart, spanEnd).toString();
                        r12.A03 = AnonymousClass006.A01;
                        r12.A01 = spanStart;
                        r12.A00 = spanEnd;
                        r12.A06 = false;
                        r12.A02 = clickableSpan;
                        list.add(r12);
                    }
                    return;
                }
                return;
            }
            throw AnonymousClass0wJ.A0b();
        }
    }

    public final ClickableSpan[] A0d(int i, int i2) {
        C146308m1 r1 = (C146308m1) this.A02;
        if (!(r1.getText() instanceof Spanned)) {
            return null;
        }
        CharSequence text = r1.getText();
        C04220Ms.A0C(text, C28174Ezk.A00(23));
        return (ClickableSpan[]) ((Spanned) text).getSpans(i, i2, ClickableSpan.class);
    }
}
