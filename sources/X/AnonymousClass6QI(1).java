package X;

/* renamed from: X.6QI  reason: invalid class name */
public final class AnonymousClass6QI {
    public static boolean A00(String str) {
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt == 'x' || charAt < 9 || (charAt > 13 && (charAt < ' ' || charAt > '~'))) {
                return true;
            }
        }
        return false;
    }
}
