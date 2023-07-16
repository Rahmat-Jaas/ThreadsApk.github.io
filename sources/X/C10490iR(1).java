package X;

import java.util.Locale;

/* renamed from: X.0iR  reason: invalid class name and case insensitive filesystem */
public final class C10490iR {
    public static final Integer A00(String str) {
        C04220Ms.A0B(str, 0);
        try {
            String upperCase = str.toUpperCase(Locale.ROOT);
            C04220Ms.A06(upperCase);
            if (upperCase.equals("C1")) {
                return AnonymousClass006.A00;
            }
            if (upperCase.equals("C2")) {
                return AnonymousClass006.A01;
            }
            if (upperCase.equals("CANARY")) {
                return AnonymousClass006.A0C;
            }
            if (upperCase.equals("UNKNOWN")) {
                return AnonymousClass006.A0N;
            }
            throw new IllegalArgumentException(upperCase);
        } catch (IllegalArgumentException unused) {
            return AnonymousClass006.A0N;
        }
    }
}
