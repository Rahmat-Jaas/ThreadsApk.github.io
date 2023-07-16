package X;

import android.text.TextPaint;
import android.text.style.ClickableSpan;

/* renamed from: X.0xa  reason: invalid class name and case insensitive filesystem */
public abstract class C18660xa extends ClickableSpan {
    public final void updateDrawState(TextPaint textPaint) {
        C04220Ms.A0B(textPaint, 0);
        super.updateDrawState(textPaint);
        textPaint.setColor(textPaint.linkColor);
        textPaint.setUnderlineText(false);
    }
}
