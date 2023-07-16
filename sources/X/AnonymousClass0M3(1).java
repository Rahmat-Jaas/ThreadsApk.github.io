package X;

/* renamed from: X.0M3  reason: invalid class name */
public final class AnonymousClass0M3 extends AnonymousClass0AW {
    public static AnonymousClass0AW A00;

    public static synchronized AnonymousClass0AW A01() {
        AnonymousClass0AW r0;
        synchronized (AnonymousClass0M3.class) {
            r0 = A00;
            if (r0 == null) {
                r0 = new AnonymousClass0M3();
                A00 = r0;
            }
        }
        return r0;
    }

    public final AnonymousClass0AV A03(Object obj) {
        return new AnonymousClass0MR(this, obj);
    }
}
