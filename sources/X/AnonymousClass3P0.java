package X;

import android.text.SpannableStringBuilder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.3P0  reason: invalid class name */
public final class AnonymousClass3P0 {
    public static final AnonymousClass2AD A00(boolean z, boolean z2) {
        if (z) {
            if (z2) {
                return AnonymousClass2AD.A09;
            }
            return AnonymousClass2AD.A0A;
        } else if (z2) {
            return AnonymousClass2AD.A07;
        } else {
            return AnonymousClass2AD.A08;
        }
    }

    public static final void A01(SpannableStringBuilder spannableStringBuilder, CharSequence charSequence, String str) {
        Matcher matcher = Pattern.compile(Pattern.quote(str)).matcher(spannableStringBuilder);
        if (matcher.find()) {
            spannableStringBuilder.replace(matcher.start(), matcher.end(), charSequence);
        }
    }
}
