package X;

/* renamed from: X.6Q5  reason: invalid class name */
public final class AnonymousClass6Q5 {
    public static int A00(String str) {
        int length;
        if (str == null || (length = str.length()) == 0 || str.offsetByCodePoints(0, 1) != length) {
            return -1;
        }
        return str.codePointAt(0);
    }
}
