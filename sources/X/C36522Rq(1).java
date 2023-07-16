package X;

/* renamed from: X.2Rq  reason: invalid class name and case insensitive filesystem */
public final class C36522Rq {
    public static Integer A00(String str) {
        String upperCase = str.toUpperCase();
        if (upperCase.equals("REG_FLOW")) {
            return AnonymousClass006.A00;
        }
        if (upperCase.equals("NUX_FLOW")) {
            return AnonymousClass006.A01;
        }
        throw C18190wL.A0a(upperCase);
    }
}
