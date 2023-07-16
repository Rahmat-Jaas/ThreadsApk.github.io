package X;

import android.text.SpannableStringBuilder;
import java.util.ArrayDeque;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.2C8  reason: invalid class name */
public final class AnonymousClass2C8 {
    public static void A00(SpannableStringBuilder spannableStringBuilder, CharSequence charSequence, String str, ArrayDeque arrayDeque, Object[] objArr, int i) {
        AnonymousClass7Ko.A0C(arrayDeque.isEmpty());
        Matcher matcher = Pattern.compile(Pattern.quote(str)).matcher(spannableStringBuilder);
        if (matcher.find()) {
            int start = matcher.start();
            spannableStringBuilder.replace(start, matcher.end(), charSequence);
            for (Object span : objArr) {
                spannableStringBuilder.setSpan(span, start, charSequence.length() + start, i);
            }
        }
    }
}
