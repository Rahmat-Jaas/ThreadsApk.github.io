package X;

/* renamed from: X.3RZ  reason: invalid class name */
public final class AnonymousClass3RZ {
    public static AnonymousClass3RZ A00;
    public static C86014w8 A01;
    public static boolean A02;

    public static AnonymousClass3RZ A00() {
        AnonymousClass3RZ r0;
        if (!A02) {
            return A00;
        }
        synchronized (AnonymousClass3RZ.class) {
            r0 = A00;
            if (r0 == null) {
                r0 = (AnonymousClass3RZ) A01.get();
                A00 = r0;
            }
        }
        return r0;
    }
}
