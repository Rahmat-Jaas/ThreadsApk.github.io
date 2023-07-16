package X;

import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: X.3Xb  reason: invalid class name and case insensitive filesystem */
public final class C62083Xb {
    public static final long A03 = TimeUnit.MINUTES.toMillis(15);
    public static final C58043Dp A04 = new C58043Dp();
    public final long A00;
    public final Map A01;
    public final Map A02;

    public C62083Xb() {
        this.A00 = A03;
        this.A01 = null;
        this.A02 = null;
    }

    public C62083Xb(Map map, Map map2, long j) {
        this.A00 = j;
        this.A01 = map;
        this.A02 = map2;
    }
}
