package X;

import java.util.Random;

/* renamed from: X.0QJ  reason: invalid class name */
public final class AnonymousClass0QJ {
    public static final Random A00 = new Random();

    public static String A00(long j) {
        if (j < 0) {
            throw new IllegalArgumentException(AnonymousClass00U.A08(j, "Cannot internalEncode negative integer "));
        } else if (j <= (1 << Math.min(63, 66)) - 1) {
            StringBuilder sb = new StringBuilder();
            int i = 0;
            do {
                sb.append("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".charAt((int) (j % 64)));
                j >>= 6;
                i++;
            } while (i < 11);
            if (j <= 0) {
                sb.reverse();
                return sb.toString();
            }
            throw new IllegalArgumentException("Number won't fit in string");
        } else {
            StringBuilder sb2 = new StringBuilder("Cannot internalEncode integer ");
            sb2.append(j);
            sb2.append(" in ");
            sb2.append(11);
            sb2.append(" chars");
            throw new IllegalArgumentException(sb2.toString());
        }
    }
}
