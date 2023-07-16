package X;

import android.net.Uri;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* renamed from: X.0xb  reason: invalid class name and case insensitive filesystem */
public final class C18670xb extends ClickableSpan {
    public final Uri A00;

    public final void onClick(View view) {
        C10650ih.A06(view.getContext(), this.A00);
    }

    public C18670xb(Uri uri) {
        this.A00 = uri;
    }

    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setColor(textPaint.linkColor);
        textPaint.setFakeBoldText(true);
        textPaint.setUnderlineText(false);
    }
}
