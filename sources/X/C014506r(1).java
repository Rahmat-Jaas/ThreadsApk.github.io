package X;

import java.io.OutputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Map;

/* renamed from: X.06r  reason: invalid class name and case insensitive filesystem */
public final class C014506r {
    public static final byte[] A00 = {112, 114, 111, 0};
    public static final byte[] A01 = {112, 114, 109, 0};

    public static String A00(String str, String str2, byte[] bArr) {
        byte[] bArr2 = C014806w.A02;
        String str3 = ":";
        String str4 = str3;
        if (!Arrays.equals(bArr, bArr2) && !Arrays.equals(bArr, C014806w.A03)) {
            str3 = "!";
        }
        if (str.length() > 0) {
            if (str2.equals("classes.dex")) {
                return str;
            }
            if (!str2.contains("!") && !str2.contains(str4)) {
                if (str2.endsWith(".apk")) {
                    return str2;
                }
                if (!Arrays.equals(bArr, bArr2) && !Arrays.equals(bArr, C014806w.A03)) {
                    str4 = "!";
                }
                return AnonymousClass00U.A0V(str, str4, str2);
            }
        }
        if ("!".equals(str3)) {
            return str2.replace(str4, "!");
        }
        if (str4.equals(str3)) {
            return str2.replace("!", str4);
        }
        return str2;
    }

    public static void A02(C013106d r8, OutputStream outputStream) {
        int i = r8.A04;
        byte[] bArr = new byte[(((((i << 1) + 8) - 1) & -8) >> 3)];
        for (Map.Entry entry : r8.A08.entrySet()) {
            int intValue = ((Number) entry.getKey()).intValue();
            int intValue2 = ((Number) entry.getValue()).intValue();
            if ((intValue2 & 2) != 0) {
                int i2 = intValue >> 3;
                bArr[i2] = (byte) ((1 << (intValue % 8)) | bArr[i2]);
            }
            if ((intValue2 & 4) != 0) {
                int i3 = intValue + i;
                int i4 = i3 >> 3;
                bArr[i4] = (byte) ((1 << (i3 % 8)) | bArr[i4]);
            }
        }
        outputStream.write(bArr);
    }

    public static void A03(C013106d r4, OutputStream outputStream) {
        int i = 0;
        for (Map.Entry entry : r4.A08.entrySet()) {
            int intValue = ((Number) entry.getKey()).intValue();
            if ((((Number) entry.getValue()).intValue() & 1) != 0) {
                C013206e.A02(outputStream, 2, (long) (intValue - i));
                C013206e.A02(outputStream, 2, (long) 0);
                i = intValue;
            }
        }
    }

    public static void A04(C013106d r4, OutputStream outputStream, String str) {
        Charset charset = StandardCharsets.UTF_8;
        C013206e.A02(outputStream, 2, (long) str.getBytes(charset).length);
        C013206e.A02(outputStream, 2, (long) r4.A00);
        C013206e.A02(outputStream, 4, (long) r4.A03);
        C013206e.A02(outputStream, 4, r4.A05);
        C013206e.A02(outputStream, 4, (long) r4.A04);
        outputStream.write(str.getBytes(charset));
    }

    public static void A01(C013106d r7, OutputStream outputStream) {
        A03(r7, outputStream);
        int i = 0;
        for (int i2 : r7.A02) {
            Integer valueOf = Integer.valueOf(i2);
            C013206e.A02(outputStream, 2, (long) (i2 - i));
            i = valueOf.intValue();
        }
        A02(r7, outputStream);
    }
}
