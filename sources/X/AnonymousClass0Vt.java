package X;

/* renamed from: X.0Vt  reason: invalid class name */
public final class AnonymousClass0Vt {
    public static C08600dr A00;
    public static volatile boolean A01;

    public static synchronized C08600dr A00() {
        C08600dr r0;
        synchronized (AnonymousClass0Vt.class) {
            r0 = A00;
            if (r0 == null) {
                if (A01) {
                    r0 = new AnonymousClass0IW();
                } else {
                    r0 = new C03420Ih();
                }
                A00 = r0;
            }
        }
        return r0;
    }
}
