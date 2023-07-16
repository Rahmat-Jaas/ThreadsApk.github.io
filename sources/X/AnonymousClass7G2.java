package X;

/* renamed from: X.7G2  reason: invalid class name */
public final class AnonymousClass7G2 {
    public static final double A01(long j) {
        return (((double) (j >>> 11)) * ((double) 2048)) + ((double) (j & 2047));
    }

    public static final String A03(long j) {
        if (j >= 0) {
            AnonymousClass725.A00(10);
            String l = Long.toString(j, 10);
            C04220Ms.A06(l);
            return l;
        }
        long j2 = (long) 10;
        long j3 = ((j >>> 1) / j2) << 1;
        long j4 = j - (j3 * j2);
        if (j4 >= j2) {
            j4 -= j2;
            j3++;
        }
        AnonymousClass725.A00(10);
        String l2 = Long.toString(j3, 10);
        C04220Ms.A06(l2);
        AnonymousClass725.A00(10);
        String l3 = Long.toString(j4, 10);
        C04220Ms.A06(l3);
        return AnonymousClass00U.A0L(l2, l3);
    }

    public static final double A00(int i) {
        return ((double) (Integer.MAX_VALUE & i)) + (((double) ((i >>> 31) << 30)) * ((double) 2));
    }

    public static final int A02(double d) {
        if (Double.isNaN(d) || d <= A00(0)) {
            return 0;
        }
        if (d >= A00(-1)) {
            return -1;
        }
        if (d <= 2.147483647E9d) {
            return (int) d;
        }
        return ((int) (d - ((double) Integer.MAX_VALUE))) + Integer.MAX_VALUE;
    }
}
