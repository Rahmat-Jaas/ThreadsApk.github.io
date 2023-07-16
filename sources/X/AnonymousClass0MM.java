package X;

import java.util.Map;

/* renamed from: X.0MM  reason: invalid class name */
public final class AnonymousClass0MM {
    public static AnonymousClass0MM A02;
    public C15910s8 A00;
    public Map A01;

    public static synchronized AnonymousClass0MM A00() {
        AnonymousClass0MM r0;
        synchronized (AnonymousClass0MM.class) {
            r0 = A02;
            if (r0 == null) {
                r0 = new AnonymousClass0MM();
                A02 = r0;
            }
        }
        return r0;
    }
}
