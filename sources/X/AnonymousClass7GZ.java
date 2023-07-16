package X;

import android.content.Context;
import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.KeyStore;
import javax.crypto.Cipher;
import kotlin.jvm.internal.KtLambdaShape26S0100000_I2_6;

/* renamed from: X.7GZ  reason: invalid class name */
public final class AnonymousClass7GZ {
    public static KeyPair A00;
    public static KeyStore A01;
    public static Cipher A02;
    public static final AnonymousClass7GZ A03 = new AnonymousClass7GZ();

    public static final void A01(Context context) {
        if (A01 == null || A00 == null || A02 == null) {
            KeyStore keyStore = (KeyStore) A00(AnonymousClass8HF.A00);
            if (keyStore != null) {
                A01 = keyStore;
            }
            if (A01 != null) {
                Cipher cipher = (Cipher) A00(AnonymousClass8HG.A00);
                if (cipher != null) {
                    A02 = cipher;
                }
                KeyPair keyPair = (KeyPair) A00(new KtLambdaShape26S0100000_I2_6(context, 35));
                if (keyPair != null) {
                    A00 = keyPair;
                }
            }
        }
    }

    public static final Object A00(AnonymousClass0ZU r2) {
        try {
            return r2.invoke();
        } catch (GeneralSecurityException e) {
            AnonymousClass0LU.A0E("CryptographyUtil", "Security Exception:", e);
            return null;
        }
    }
}
