package X;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: X.0Km  reason: invalid class name and case insensitive filesystem */
public final class C03730Km {
    public static final byte[] A00 = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};

    public static String A01(byte[] bArr) {
        StringBuilder sb = new StringBuilder(r5);
        for (byte b : bArr) {
            byte b2 = b & 255;
            byte[] bArr2 = A00;
            sb.append((char) bArr2[b2 >>> 4]);
            sb.append((char) bArr2[b2 & 15]);
        }
        return sb.toString();
    }

    public static String A00(String str) {
        RuntimeException runtimeException;
        try {
            byte[] bytes = str.getBytes("utf-8");
            try {
                MessageDigest instance = MessageDigest.getInstance("MD5");
                instance.update(bytes, 0, bytes.length);
                return A01(instance.digest());
            } catch (NoSuchAlgorithmException e) {
                runtimeException = new RuntimeException(e);
                throw runtimeException;
            } catch (UnsupportedEncodingException e2) {
                runtimeException = new RuntimeException(e2);
                throw runtimeException;
            }
        } catch (UnsupportedEncodingException e3) {
            throw new RuntimeException(e3);
        }
    }
}
