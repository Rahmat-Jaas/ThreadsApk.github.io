package X;

import java.util.regex.Pattern;

/* renamed from: X.73P  reason: invalid class name */
public final class AnonymousClass73P {
    public static final Pattern A00 = Pattern.compile(AnonymousClass00U.A0h("[+-]?(?:NaN|Infinity|", "(?:\\d+#(?:\\.\\d*#)?|\\.\\d+#)(?:[eE][+-]?\\d+#)?[fFdD]?", "|", "0[xX](?:[0-9a-fA-F]+#(?:\\.[0-9a-fA-F]*#)?|\\.[0-9a-fA-F]+#)[pP][+-]?\\d+#[fFdD]?", ")").replace("#", "+"));

    public static boolean A00(double d) {
        return Double.NEGATIVE_INFINITY < d && d < Double.POSITIVE_INFINITY;
    }
}
