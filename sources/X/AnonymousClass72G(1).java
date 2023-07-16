package X;

import java.util.Arrays;

/* renamed from: X.72G  reason: invalid class name */
public final class AnonymousClass72G {
    public static byte[] A00 = {-80, -79, -62, -75, -81, -79, -85, -75, -80, -8, -22, -8, -8, -18, -12, -13, -28, -18, -23, -93, -95, -109, -96, -100, -113, -101, -109};

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 15);
        }
        return new String(copyOfRange);
    }
}
