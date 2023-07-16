package X;

import java.util.concurrent.Executor;

/* renamed from: X.75K  reason: invalid class name */
public final class AnonymousClass75K {
    public static final int A01;
    public static final int A02;
    public static final AnonymousClass75K A03 = new AnonymousClass75K();
    public final Executor A00 = new C1368884w();

    static {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        A01 = availableProcessors + 1;
        A02 = (availableProcessors << 1) + 1;
    }
}
