package X;

/* renamed from: X.7Hh  reason: invalid class name */
public final class AnonymousClass7Hh {
    public static final long A00(int i, int i2) {
        return (((long) i2) & 4294967295L) | (((long) i) << 32);
    }

    public static C121127Eg A03() {
        return new C121127Eg(A00(1, 1));
    }

    public static long A01(long j, long j2) {
        return A00(((int) (j >> 32)) + ((int) (j2 >> 32)), C121127Eg.A00(j) + C121127Eg.A00(j2));
    }

    public static long A02(long j, long j2) {
        return A00(((int) (j >> 32)) - ((int) (j2 >> 32)), C121127Eg.A00(j) - C121127Eg.A00(j2));
    }

    public static C121127Eg A04(int i, int i2) {
        return new C121127Eg(A00(i, i2));
    }
}
