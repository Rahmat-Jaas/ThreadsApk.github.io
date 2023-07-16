package X;

import java.io.DataOutputStream;
import java.io.UnsupportedEncodingException;

/* renamed from: X.0uI  reason: invalid class name and case insensitive filesystem */
public final class C17100uI {
    public static int A01(DataOutputStream dataOutputStream, int i) {
        int i2 = 0;
        do {
            int i3 = i % 128;
            i >>= 7;
            if (i > 0) {
                i3 |= 128;
            }
            dataOutputStream.writeByte(i3);
            i2++;
        } while (i > 0);
        return i2;
    }

    public static int A00(C17320uh r2) {
        int i = r2.A03.A00 << 4;
        if (r2.A04) {
            i |= 8;
        }
        int i2 = i | (r2.A02 << 1);
        if (r2.A01) {
            return i2 | 1;
        }
        return i2;
    }

    public static byte[] A02(String str) {
        try {
            return str.getBytes("utf-8");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }
}
