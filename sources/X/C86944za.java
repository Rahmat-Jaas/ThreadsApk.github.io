package X;

import android.text.TextPaint;
import android.text.style.CharacterStyle;

/* renamed from: X.4za  reason: invalid class name and case insensitive filesystem */
public final class C86944za extends CharacterStyle {
    public final float A00;
    public final float A01;
    public final float A02;
    public final int A03;

    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setShadowLayer(this.A02, this.A00, this.A01, this.A03);
    }

    public C86944za(float f, float f2, float f3, int i) {
        this.A02 = f;
        this.A00 = f2;
        this.A01 = f3;
        this.A03 = i;
    }
}
