package X;

import android.util.Base64;
import java.io.File;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: X.6GO  reason: invalid class name */
public final class AnonymousClass6GO {
    public static String A00(String str, String str2) {
        int length;
        if (str == null || str.isEmpty() || str2.isEmpty()) {
            throw C18190wL.A0a("Invalid Input");
        }
        int length2 = str2.length();
        char c = File.separatorChar;
        Cipher instance = Cipher.getInstance(AnonymousClass00U.A0Y("Blowfish", "CBC", "PKCS5Padding", c, c));
        SecretKeySpec secretKeySpec = new SecretKeySpec(str2.getBytes(), "Blowfish");
        int i = length2 >> 1;
        byte[] bytes = str2.substring(0, i).getBytes();
        byte[] bytes2 = str2.substring(i, length2).getBytes();
        if (bytes == null || bytes2 == null || (length = bytes.length) != bytes2.length) {
            throw C18210wN.A0W("Invalid IV");
        }
        byte[] bArr = new byte[length];
        for (int i2 = 0; i2 < length; i2++) {
            bArr[i2] = (byte) (bytes[i2] ^ bytes2[i2]);
        }
        instance.init(1, secretKeySpec, new IvParameterSpec(bArr));
        return Base64.encodeToString(instance.doFinal(str.getBytes()), 0);
    }
}
