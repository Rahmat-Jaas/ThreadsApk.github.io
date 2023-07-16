package X;

import android.text.SpannableStringBuilder;
import android.text.style.CharacterStyle;
import android.text.style.ClickableSpan;
import android.widget.TextView;
import com.facebook.redex.IDxCSpanShape14S0100000_1_I2;

/* renamed from: X.3Zw  reason: invalid class name */
public final class AnonymousClass3Zw {
    public static void A02(SpannableStringBuilder spannableStringBuilder, Object obj, String str, int i) {
        A01(spannableStringBuilder, new IDxCSpanShape14S0100000_1_I2(obj, i), str);
    }

    public static void A00(SpannableStringBuilder spannableStringBuilder, CharacterStyle characterStyle, String str) {
        int indexOf = spannableStringBuilder.toString().indexOf(str);
        if (indexOf != -1) {
            spannableStringBuilder.setSpan(characterStyle, indexOf, AnonymousClass0hA.A01(str) + indexOf, 33);
        }
    }

    public static void A01(SpannableStringBuilder spannableStringBuilder, CharacterStyle characterStyle, String str) {
        int lastIndexOf = spannableStringBuilder.toString().lastIndexOf(str);
        if (lastIndexOf != -1) {
            spannableStringBuilder.setSpan(characterStyle, lastIndexOf, AnonymousClass0hA.A01(str) + lastIndexOf, 33);
        }
    }

    public static void A03(ClickableSpan clickableSpan, TextView textView, String str, String str2) {
        SpannableStringBuilder A0E = C18200wM.A0E(str2);
        A01(A0E, clickableSpan, str);
        textView.setText(A0E);
        C18180wK.A0z(textView);
        textView.setHighlightColor(0);
    }
}
