package X;

/* renamed from: X.3RH  reason: invalid class name */
public final class AnonymousClass3RH {
    public static volatile AnonymousClass3RH A00;

    public static synchronized void A00() {
        synchronized (AnonymousClass3RH.class) {
            if (A00 == null) {
                A00 = new AnonymousClass3RH();
            }
        }
    }
}
