package X;

import android.os.Build;
import android.util.Base64;
import java.security.Signature;

/* renamed from: X.6xx  reason: invalid class name and case insensitive filesystem */
public final class C116996xx {
    public static boolean A01() {
        return C86114wI.A1U(Build.VERSION.SDK_INT, 30);
    }

    public static String A00(Signature signature, byte[] bArr) {
        int i;
        signature.update(bArr);
        byte[] sign = signature.sign();
        int length = sign.length;
        if (length < 8 || sign[0] != 48) {
            throw C18190wL.A0a("Invalid ECDSA signature format");
        }
        byte b = sign[1];
        if (b > 0) {
            i = 2;
        } else if (b == -127) {
            i = 3;
        } else {
            throw C18190wL.A0a("Invalid ECDSA signature format");
        }
        byte b2 = sign[i + 1];
        int i2 = b2;
        while (i2 > 0 && sign[((i + 2) + b2) - i2] == 0) {
            i2--;
        }
        int i3 = i + 2 + b2;
        byte b3 = sign[i3 + 1];
        int i4 = b3;
        while (i4 > 0 && sign[((i3 + 2) + b3) - i4] == 0) {
            i4--;
        }
        int max = Math.max(Math.max(i2, i4), 32);
        byte b4 = sign[i - 1] & 255;
        if (b4 == length - i && b4 == b2 + 2 + 2 + b3 && sign[i] == 2 && sign[i3] == 2) {
            int i5 = max << 1;
            byte[] bArr2 = new byte[i5];
            System.arraycopy(sign, i3 - i2, bArr2, max - i2, i2);
            System.arraycopy(sign, ((i3 + 2) + b3) - i4, bArr2, i5 - i4, i4);
            return Base64.encodeToString(bArr2, 11);
        }
        throw C18190wL.A0a("Invalid ECDSA signature format");
    }
}
