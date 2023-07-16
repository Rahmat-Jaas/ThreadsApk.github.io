package X;

/* renamed from: X.7CI  reason: invalid class name */
public final class AnonymousClass7CI {
    public static C36136JIa A00;

    public static final synchronized C36399JTi A00() {
        C36399JTi jTi;
        synchronized (AnonymousClass7CI.class) {
            jTi = A01().A01;
        }
        return jTi;
    }

    public static final synchronized C36136JIa A01() {
        C36136JIa jIa;
        synchronized (AnonymousClass7CI.class) {
            jIa = A00;
            if (jIa == null) {
                throw C18250wR.A0V("Fresco context provider must be set");
            }
        }
        return jIa;
    }
}
