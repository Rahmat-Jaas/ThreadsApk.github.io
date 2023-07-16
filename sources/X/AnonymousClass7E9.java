package X;

import android.security.keystore.KeyGenParameterSpec;
import android.util.Base64;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.PublicKey;
import java.security.Signature;

/* renamed from: X.7E9  reason: invalid class name */
public class AnonymousClass7E9 {
    public static final C99266It A02 = new C99266It();
    public static final C04530Oa A03 = AnonymousClass0OY.A02(AnonymousClass8HJ.A00);
    public final String A00;
    public final KeyPair A01;

    public AnonymousClass7E9(String str, AnonymousClass0YY r7, int i, boolean z) {
        KeyPair keyPair;
        C04220Ms.A0B(str, 1);
        this.A00 = str;
        synchronized (A02) {
            KeyPairGenerator instance = KeyPairGenerator.getInstance("RSA", "AndroidKeyStore");
            C04220Ms.A06(instance);
            if (z) {
                C04530Oa r1 = A03;
                if (((KeyStore) C18190wL.A0f(r1)).containsAlias(str)) {
                    ((KeyStore) C18190wL.A0f(r1)).deleteEntry(str);
                }
            }
            C04530Oa r2 = A03;
            if (!((KeyStore) C18190wL.A0f(r2)).containsAlias(str)) {
                KeyGenParameterSpec.Builder builder = new KeyGenParameterSpec.Builder(str, i);
                r7.invoke(builder);
                builder.setKeySize(2048);
                KeyGenParameterSpec build = builder.build();
                C04220Ms.A06(build);
                instance.initialize(build);
                C04220Ms.A06(instance.generateKeyPair());
            }
            KeyStore keyStore = (KeyStore) C18190wL.A0f(r2);
            PublicKey publicKey = keyStore.getCertificate(str).getPublicKey();
            KeyStore.Entry entry = keyStore.getEntry(str, (KeyStore.ProtectionParameter) null);
            C04220Ms.A0C(entry, "null cannot be cast to non-null type java.security.KeyStore.PrivateKeyEntry");
            keyPair = new KeyPair(publicKey, ((KeyStore.PrivateKeyEntry) entry).getPrivateKey());
        }
        this.A01 = keyPair;
    }

    public final String A01() {
        byte[] encoded = this.A01.getPublic().getEncoded();
        C04220Ms.A06(encoded);
        String encodeToString = Base64.encodeToString(encoded, 11);
        C04220Ms.A06(encodeToString);
        return encodeToString;
    }

    public static String A00(AnonymousClass7E9 r2, byte[] bArr) {
        C04220Ms.A06(bArr);
        Signature instance = Signature.getInstance("SHA256withRSA");
        instance.initSign(r2.A01.getPrivate());
        instance.update(bArr);
        byte[] sign = instance.sign();
        C04220Ms.A06(sign);
        String encodeToString = Base64.encodeToString(sign, 11);
        C04220Ms.A06(encodeToString);
        return encodeToString;
    }
}
