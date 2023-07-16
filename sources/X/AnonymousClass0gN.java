package X;

/* renamed from: X.0gN  reason: invalid class name */
public final class AnonymousClass0gN {
    public static volatile AnonymousClass0gW A00;

    public static AnonymousClass0gW A00() {
        if (A00 == null) {
            synchronized (AnonymousClass0gN.class) {
                if (A00 == null) {
                    throw new AssertionError("Do not call IgExecutor before it is configured");
                }
                A00 = new C12670mI(new AnonymousClass0gM());
            }
        }
        return A00;
    }
}
