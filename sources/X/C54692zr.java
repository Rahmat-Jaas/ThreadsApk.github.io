package X;

import java.util.Locale;

/* renamed from: X.2zr  reason: invalid class name and case insensitive filesystem */
public final class C54692zr {
    public static final String A00(char c) {
        String valueOf = String.valueOf(c);
        C04220Ms.A0C(valueOf, "null cannot be cast to non-null type java.lang.String");
        Locale locale = Locale.ROOT;
        String A0u = C18220wO.A0u(locale, valueOf);
        if (A0u.length() <= 1) {
            return String.valueOf(Character.toTitleCase(c));
        }
        if (c == 329) {
            return A0u;
        }
        char charAt = A0u.charAt(0);
        String substring = A0u.substring(1);
        C04220Ms.A06(substring);
        return AnonymousClass00U.A0B(C18190wL.A0r(locale, substring), charAt);
    }
}
