package X;

import java.util.Arrays;

/* renamed from: X.7C5  reason: invalid class name */
public final class AnonymousClass7C5 {
    public static byte[] A00 = {-102, -101, -84, -97, -103, -101, -107, -97, -102, -26, -34, -27, -28, -37, -43, -28, -21, -29, -40, -37, -24, -69, -83, -69, -69, -79, -73, -74, -89, -79, -84, -58, -60, -74, -61, -65, -78, -66, -74};

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 13);
        }
        return new String(copyOfRange);
    }

    public static void A01(AnonymousClass0A3 r3, String str) {
        r3.A0T(A00(21, 10, 59), str);
    }
}
