package X;

/* renamed from: X.0om  reason: invalid class name and case insensitive filesystem */
public abstract class C14080om {
    public static volatile int A00;

    public static void A00() {
        if (A00 == 0) {
            synchronized (C14080om.class) {
                if (A00 == 0) {
                    A00 = -1;
                }
            }
        }
    }

    public C14080om() {
        throw null;
    }
}
