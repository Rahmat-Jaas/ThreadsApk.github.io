package X;

import java.util.Locale;

/* renamed from: X.2Rt  reason: invalid class name and case insensitive filesystem */
public final class C36552Rt {
    public static Integer A00(String str) {
        String upperCase = str.toUpperCase(Locale.US);
        if (upperCase.equals("HEADER")) {
            return AnonymousClass006.A00;
        }
        if (upperCase.equals("PARAGRAPH")) {
            return AnonymousClass006.A01;
        }
        if (upperCase.equals("BULLETED_LIST")) {
            return AnonymousClass006.A0C;
        }
        throw C18190wL.A0a(upperCase);
    }
}
