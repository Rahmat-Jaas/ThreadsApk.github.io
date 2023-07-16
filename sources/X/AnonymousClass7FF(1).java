package X;

import android.hardware.biometrics.BiometricPrompt;
import android.os.Build;
import android.security.identity.IdentityCredential;
import android.security.keystore.KeyGenParameterSpec;
import android.util.Log;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Signature;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.Mac;
import javax.crypto.NoSuchPaddingException;

/* renamed from: X.7FF  reason: invalid class name */
public final class AnonymousClass7FF {
    public static BiometricPrompt.CryptoObject A00(C121597Gy r3) {
        IdentityCredential A00;
        if (r3 == null) {
            return null;
        }
        Cipher cipher = r3.A01;
        if (cipher != null) {
            return new BiometricPrompt.CryptoObject(cipher);
        }
        Signature signature = r3.A00;
        if (signature != null) {
            return new BiometricPrompt.CryptoObject(signature);
        }
        Mac mac = r3.A02;
        if (mac != null) {
            return new BiometricPrompt.CryptoObject(mac);
        }
        if (Build.VERSION.SDK_INT < 30 || (A00 = r3.A00()) == null) {
            return null;
        }
        return C115636vf.A00(A00);
    }

    public static C121597Gy A02(BiometricPrompt.CryptoObject cryptoObject) {
        IdentityCredential A01;
        if (cryptoObject == null) {
            return null;
        }
        Cipher cipher = cryptoObject.getCipher();
        if (cipher != null) {
            return new C121597Gy(cipher);
        }
        Signature signature = cryptoObject.getSignature();
        if (signature != null) {
            return new C121597Gy(signature);
        }
        Mac mac = cryptoObject.getMac();
        if (mac != null) {
            return new C121597Gy(mac);
        }
        if (Build.VERSION.SDK_INT < 30 || (A01 = C115636vf.A01(cryptoObject)) == null) {
            return null;
        }
        return new C121597Gy(A01);
    }

    public static AnonymousClass7DT A03(C121597Gy r3) {
        if (r3 == null) {
            return null;
        }
        Cipher cipher = r3.A01;
        if (cipher != null) {
            return new AnonymousClass7DT(cipher);
        }
        Signature signature = r3.A00;
        if (signature != null) {
            return new AnonymousClass7DT(signature);
        }
        Mac mac = r3.A02;
        if (mac != null) {
            return new AnonymousClass7DT(mac);
        }
        if (Build.VERSION.SDK_INT < 30 || r3.A00() == null) {
            return null;
        }
        Log.e("CryptoObjectUtils", "Identity credential is not supported by FingerprintManager.");
        return null;
    }

    public static C121597Gy A01() {
        try {
            KeyStore instance = KeyStore.getInstance("AndroidKeyStore");
            instance.load((KeyStore.LoadStoreParameter) null);
            KeyGenParameterSpec.Builder builder = new KeyGenParameterSpec.Builder("androidxBiometric", 3);
            builder.setBlockModes(new String[]{"CBC"});
            builder.setEncryptionPaddings(new String[]{"PKCS7Padding"});
            KeyGenerator instance2 = KeyGenerator.getInstance("AES", "AndroidKeyStore");
            instance2.init(builder.build());
            instance2.generateKey();
            Key key = instance.getKey("androidxBiometric", (char[]) null);
            Cipher instance3 = Cipher.getInstance("AES/CBC/PKCS7Padding");
            instance3.init(1, key);
            return new C121597Gy(instance3);
        } catch (IOException | InvalidAlgorithmParameterException | InvalidKeyException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | UnrecoverableKeyException | CertificateException | NoSuchPaddingException e) {
            Log.w("CryptoObjectUtils", "Failed to create fake crypto object.", e);
            return null;
        }
    }
}
