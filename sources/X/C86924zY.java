package X;

import android.text.TextPaint;
import android.text.style.CharacterStyle;

/* renamed from: X.4zY  reason: invalid class name and case insensitive filesystem */
public final class C86924zY extends CharacterStyle {
    public final boolean A00;
    public final boolean A01;

    public final void updateDrawState(TextPaint textPaint) {
        C04220Ms.A0B(textPaint, 0);
        textPaint.setUnderlineText(this.A01);
        textPaint.setStrikeThruText(this.A00);
    }

    public C86924zY(boolean z, boolean z2) {
        this.A01 = z;
        this.A00 = z2;
    }
}
