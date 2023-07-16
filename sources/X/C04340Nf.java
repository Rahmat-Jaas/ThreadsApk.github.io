package X;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.0Nf  reason: invalid class name and case insensitive filesystem */
public final class C04340Nf implements ThreadFactory {
    public final int A00;
    public final String A01;
    public final AtomicInteger A02 = new AtomicInteger(1);

    public final Thread newThread(Runnable runnable) {
        StringBuilder sb = new StringBuilder("Lacrima_");
        sb.append(this.A01);
        sb.append("_");
        sb.append(this.A02.getAndIncrement());
        AnonymousClass0Z2 r1 = AnonymousClass0MI.A04;
        if (r1 != null) {
            sb.append(":");
            String str = r1.A04;
            if (str == null) {
                str = "unknown";
            }
            sb.append(str);
        }
        return new C04330Ne(this, runnable, sb.toString());
    }

    public C04340Nf(String str, int i) {
        this.A01 = str;
        this.A00 = i;
    }
}
