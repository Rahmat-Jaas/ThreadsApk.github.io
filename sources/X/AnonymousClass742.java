package X;

import android.util.Base64;
import java.security.GeneralSecurityException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: X.742  reason: invalid class name */
public final class AnonymousClass742 {
    public static final SecretKeySpec A00;
    public static final byte[] A01;

    static {
        byte[] bytes = "iN4$aGr0m".getBytes();
        A01 = bytes;
        A00 = new SecretKeySpec(bytes, "HmacSHA256");
    }

    public static String A00(int i, int i2, long j) {
        String str;
        StringBuilder A0r = C18200wM.A0r();
        A0r.append(i);
        A0r.append(" ");
        A0r.append(j);
        A0r.append(" ");
        A0r.append(i2);
        A0r.append(" ");
        String A0n = C86154wM.A0n(A0r, System.currentTimeMillis());
        try {
            Mac instance = Mac.getInstance("HmacSHA256");
            instance.init(A00);
            str = Base64.encodeToString(instance.doFinal(A0n.getBytes()), 0);
        } catch (GeneralSecurityException unused) {
            str = null;
        }
        if (str == null) {
            return null;
        }
        return AnonymousClass00U.A0L(str, Base64.encodeToString(A0n.getBytes(), 0));
    }
}
