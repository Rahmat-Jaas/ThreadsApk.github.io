package X;

/* renamed from: X.7CV  reason: invalid class name */
public final class AnonymousClass7CV {
    public static String A00;

    public static synchronized String A00() {
        String str;
        synchronized (AnonymousClass7CV.class) {
            str = A00;
            if (str == null) {
                str = C10640ig.A00(C10600ic.A00);
                A00 = str;
            }
        }
        return str;
    }

    public static String A01(String str) {
        return AnonymousClass00U.A0V(str, " ", A00());
    }
}
