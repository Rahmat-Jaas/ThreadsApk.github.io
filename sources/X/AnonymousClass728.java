package X;

import java.util.concurrent.TimeUnit;

/* renamed from: X.728  reason: invalid class name */
public final class AnonymousClass728 {
    public static final long A00(C972768s r5, int i) {
        C04220Ms.A0B(r5, 1);
        long j = (long) i;
        if (r5.compareTo(C972768s.SECONDS) <= 0) {
            return C972768s.NANOSECONDS.A00.convert(j, r5.A00) << 1;
        }
        return A01(r5, j);
    }

    public static final long A01(C972768s r15, long j) {
        C04220Ms.A0B(r15, 1);
        C972768s r2 = C972768s.NANOSECONDS;
        TimeUnit timeUnit = r15.A00;
        TimeUnit timeUnit2 = r2.A00;
        long convert = timeUnit.convert(4611686018426999999L, timeUnit2);
        long j2 = -convert;
        if (j2 < convert) {
            long j3 = convert % 1;
            if (j3 < 0) {
                j3++;
            }
            long j4 = j2 % 1;
            if (j4 < 0) {
                j4++;
            }
            long j5 = (j3 - j4) % 1;
            if (j5 < 0) {
                j5++;
            }
            convert -= j5;
        }
        long j6 = j;
        if (j2 > j || j > convert) {
            return (AnonymousClass8bI.A07(C972768s.MILLISECONDS.A00.convert(j6, timeUnit), -4611686018427387903L, 4611686018427387903L) << 1) + 1;
        }
        return timeUnit2.convert(j6, timeUnit) << 1;
    }
}
