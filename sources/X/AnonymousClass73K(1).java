package X;

import java.util.regex.Pattern;

/* renamed from: X.73K  reason: invalid class name */
public final class AnonymousClass73K {
    public static final Pattern A00 = Pattern.compile("^NOTE([ \t].*)?$");

    public static float A00(String str) {
        if (C86144wL.A1Y(str)) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException("Percentages must end with %");
    }
}
