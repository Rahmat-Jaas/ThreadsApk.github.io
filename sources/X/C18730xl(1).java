package X;

import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.instagram.ui.text.IDxCSpanShape187S0100000_1_I2;

/* renamed from: X.0xl  reason: invalid class name and case insensitive filesystem */
public class C18730xl extends ClickableSpan {
    public final Integer A00;

    public void onClick(View view) {
    }

    public static IDxCSpanShape187S0100000_1_I2 A00(Object obj, int i, int i2) {
        return new IDxCSpanShape187S0100000_1_I2(i, i2, obj);
    }

    public static void A01(SpannableStringBuilder spannableStringBuilder, Object obj, String str, int i, int i2) {
        AnonymousClass3Zw.A01(spannableStringBuilder, new IDxCSpanShape187S0100000_1_I2(i, i2, obj), str);
    }

    public C18730xl(int i) {
        this.A00 = Integer.valueOf(i);
    }

    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        Integer num = this.A00;
        if (num != null) {
            textPaint.setColor(num.intValue());
        }
        textPaint.setUnderlineText(false);
    }

    public C18730xl() {
        this.A00 = null;
    }
}
