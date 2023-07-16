package X;

/* renamed from: X.0iB  reason: invalid class name and case insensitive filesystem */
public enum C10340iB {
    NONE,
    ALPHA,
    BETA,
    PROD;
    
    public static C04560Oe A00;
    public static C10340iB A01;

    public static synchronized C10340iB A00() {
        C10340iB r0;
        Class<C10340iB> cls = C10340iB.class;
        synchronized (cls) {
            C04560Oe r2 = A00;
            if (r2 == null) {
                AnonymousClass0LU.A01(cls, "Release Channel not set yet");
                r0 = NONE;
            } else {
                r0 = A01;
                if (r0 == null || r0 == NONE) {
                    r0 = (C10340iB) r2.get();
                    A01 = r0;
                }
            }
        }
        return r0;
    }
}
