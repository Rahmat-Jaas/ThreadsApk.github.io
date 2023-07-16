package X;

import android.net.Uri;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* renamed from: X.0xd  reason: invalid class name and case insensitive filesystem */
public final class C18680xd extends ClickableSpan {
    public final int A00;
    public final Uri A01;

    public final void onClick(View view) {
        C10650ih.A06(view.getContext(), this.A01);
    }

    public C18680xd(Uri uri, int i) {
        this.A01 = uri;
        this.A00 = i;
    }

    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setColor(this.A00);
        textPaint.setUnderlineText(true);
    }
}
