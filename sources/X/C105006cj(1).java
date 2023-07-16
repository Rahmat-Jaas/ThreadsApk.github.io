package X;

import android.security.keystore.KeyGenParameterSpec;
import java.security.InvalidKeyException;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.UnrecoverableKeyException;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;

/* renamed from: X.6cj  reason: invalid class name and case insensitive filesystem */
public final class C105006cj {
    public KeyStore A00;

    public C105006cj() {
        KeyStore instance = KeyStore.getInstance("AndroidKeyStore");
        instance.load((KeyStore.LoadStoreParameter) null);
        this.A00 = instance;
        if (instance.containsAlias("alias")) {
            try {
                Cipher.getInstance("RSA/ECB/PKCS1Padding").init(2, this.A00.getKey("alias", (char[]) null));
                return;
            } catch (Exception e) {
                if (!(e instanceof KeyStoreException) && !(e instanceof NoSuchAlgorithmException) && !(e instanceof UnrecoverableKeyException) && !(e instanceof NoSuchPaddingException) && !(e instanceof InvalidKeyException)) {
                    throw e;
                }
            }
        }
        instance.deleteEntry("alias");
        KeyPairGenerator instance2 = KeyPairGenerator.getInstance("RSA", "AndroidKeyStore");
        C04220Ms.A06(instance2);
        KeyGenParameterSpec build = new KeyGenParameterSpec.Builder("alias", 3).setBlockModes(new String[]{"ECB"}).setEncryptionPaddings(new String[]{"PKCS1Padding"}).build();
        C04220Ms.A06(build);
        instance2.initialize(build);
        instance2.generateKeyPair();
    }
}
