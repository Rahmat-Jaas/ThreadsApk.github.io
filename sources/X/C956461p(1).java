package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.security.keystore.KeyGenParameterSpec;
import java.io.IOException;
import java.io.InputStream;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.ProviderException;
import java.security.cert.CertificateException;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

/* renamed from: X.61p  reason: invalid class name and case insensitive filesystem */
public final class C956461p extends C133087v4 {
    public SecretKey A00;
    public final SharedPreferences A01;
    public final String A02;

    public static SecretKey A00(String str) {
        String A0L = AnonymousClass00U.A0L(str, "_single");
        try {
            KeyStore.getInstance("AndroidKeyStore").load((InputStream) null, (char[]) null);
            KeyGenerator instance = KeyGenerator.getInstance("AES", "AndroidKeyStore");
            instance.init(new KeyGenParameterSpec.Builder(A0L, 3).setBlockModes(new String[]{"GCM"}).setRandomizedEncryptionRequired(true).setEncryptionPaddings(new String[]{"NoPadding"}).setKeySize(128).build());
            try {
                return instance.generateKey();
            } catch (NullPointerException e) {
                C10450iM.A07("SymmetricTransformer", e);
                return null;
            }
        } catch (IOException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | ProviderException | CertificateException e2) {
            C10450iM.A07("SymmetricTransformer", e2);
            return null;
        }
    }

    public final Integer BJ1() {
        return AnonymousClass006.A00;
    }

    public final String getName() {
        return this.A02;
    }

    public C956461p(Context context, String str, SecretKey secretKey) {
        this.A02 = str;
        this.A00 = secretKey;
        this.A01 = C86164wN.A0C(context, str);
    }
}
