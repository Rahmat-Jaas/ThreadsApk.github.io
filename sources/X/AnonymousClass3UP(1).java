package X;

import java.util.concurrent.TimeUnit;

/* renamed from: X.3UP  reason: invalid class name */
public final class AnonymousClass3UP {
    public static AnonymousClass3UP A01;
    public static final long A02 = TimeUnit.MINUTES.toMillis(3);
    public C570639p A00;

    public final C570639p A00() {
        C570639p r0 = this.A00;
        if (r0 != null) {
            long currentTimeMillis = System.currentTimeMillis();
            C04220Ms.A0A(r0);
            Long l = r0.A00;
            C04220Ms.A06(l);
            if (currentTimeMillis - l.longValue() <= A02) {
                return this.A00;
            }
        }
        this.A00 = null;
        return null;
    }
}
