package X;

import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.instagram.ui.text.IDxCSpanShape183S0100000_1_I2;

/* renamed from: X.0xk  reason: invalid class name and case insensitive filesystem */
public class C18720xk extends ClickableSpan {
    public final Integer A00;

    public void onClick(View view) {
    }

    public static void A00(SpannableStringBuilder spannableStringBuilder, Object obj, String str, int i, int i2) {
        AnonymousClass3Zw.A01(spannableStringBuilder, new IDxCSpanShape183S0100000_1_I2(obj, i, i2), str);
    }

    public C18720xk(int i) {
        this.A00 = Integer.valueOf(i);
    }

    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        Integer num = this.A00;
        if (num != null) {
            textPaint.setColor(num.intValue());
        }
        textPaint.setUnderlineText(false);
        textPaint.setFakeBoldText(true);
    }

    public C18720xk() {
        this.A00 = null;
    }
}
