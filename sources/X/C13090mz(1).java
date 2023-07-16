package X;

import android.text.TextPaint;

/* renamed from: X.0mz  reason: invalid class name and case insensitive filesystem */
public final class C13090mz implements AnonymousClass0h9 {
    public final /* synthetic */ int A00;
    public final /* synthetic */ TextPaint A01;
    public final /* synthetic */ String A02;

    public C13090mz(TextPaint textPaint, String str, int i) {
        this.A01 = textPaint;
        this.A02 = str;
        this.A00 = i;
    }

    public final boolean ACi(float f) {
        TextPaint textPaint = this.A01;
        textPaint.setTextSize(f);
        if (textPaint.measureText(this.A02) <= ((float) this.A00)) {
            return true;
        }
        return false;
    }
}
