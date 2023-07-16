package X;

/* renamed from: X.6Iz  reason: invalid class name and case insensitive filesystem */
public final class C99326Iz {
    public C99326Iz(String str) {
        C13320nQ.A02(str, "log tag cannot be null");
        boolean z = str.length() <= 23;
        Object[] A1Y = C18210wN.A1Y(str, 23);
        if (!z) {
            throw C18190wL.A0a(String.format("tag \"%s\" is longer than the %d character maximum", A1Y));
        }
    }
}
