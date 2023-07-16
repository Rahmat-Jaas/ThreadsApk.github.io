package X;

/* renamed from: X.31o  reason: invalid class name and case insensitive filesystem */
public final class C550631o {
    public static boolean A00;
    public static boolean A01;

    public static final boolean A00() {
        if (!A00) {
            A01 = "true".equals(System.getProperty("fb.running_e2e"));
            A00 = true;
        }
        return A01;
    }
}
