package X;

/* renamed from: X.7yO  reason: invalid class name and case insensitive filesystem */
public abstract class C134797yO implements Comparable {
    public static final long A00 = ((4611686018427387903L << 1) + 1);
    public static final long A01 = ((-4611686018427387903L << 1) + 1);

    public static final long A00(C972768s r4, long j) {
        C972768s r0;
        if (j == A00) {
            return Long.MAX_VALUE;
        }
        if (j == A01) {
            return Long.MIN_VALUE;
        }
        long j2 = j >> 1;
        if ((((int) j) & 1) == 0) {
            r0 = C972768s.NANOSECONDS;
        } else {
            r0 = C972768s.MILLISECONDS;
        }
        C04220Ms.A0B(r0, 1);
        return r4.A00.convert(j2, r0.A00);
    }
}
