package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Base64;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: X.7v4  reason: invalid class name and case insensitive filesystem */
public abstract class C133087v4 implements C146218lq {
    /* JADX WARNING: Removed duplicated region for block: B:19:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0071  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.io.OutputStream BEI(android.content.Context r7) {
        /*
            r6 = this;
            r5 = 0
            java.lang.String r0 = r6.A01(r7)     // Catch:{ IOException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0063 }
            java.io.File r1 = X.C86144wL.A0Z(r0)     // Catch:{ IOException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0063 }
            boolean r0 = r1.exists()     // Catch:{ IOException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0063 }
            if (r0 == 0) goto L_0x0033
            r1.delete()     // Catch:{ IOException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0063 }
        L_0x0012:
            r1.createNewFile()     // Catch:{ IOException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0063 }
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch:{ IOException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0063 }
            r0.<init>(r1)     // Catch:{ IOException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0063 }
            java.io.BufferedOutputStream r3 = new java.io.BufferedOutputStream     // Catch:{ IOException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0063 }
            r3.<init>(r0)     // Catch:{ IOException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0063 }
            java.lang.String r0 = "AES/GCM/NoPadding"
            javax.crypto.Cipher r2 = javax.crypto.Cipher.getInstance(r0)     // Catch:{ IOException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0063 }
            r1 = 1
            javax.crypto.SecretKey r0 = r6.A02(r1)     // Catch:{ IOException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0063 }
            r2.init(r1, r0)     // Catch:{ IOException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0063 }
            javax.crypto.CipherOutputStream r4 = new javax.crypto.CipherOutputStream     // Catch:{ IOException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0063 }
            r4.<init>(r3, r2)     // Catch:{ IOException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0063 }
            goto L_0x003f
        L_0x0033:
            java.lang.String r0 = r1.getParent()     // Catch:{ IOException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0063 }
            java.io.File r0 = X.C86144wL.A0Z(r0)     // Catch:{ IOException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0063 }
            r0.mkdirs()     // Catch:{ IOException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0063 }
            goto L_0x0012
        L_0x003f:
            java.lang.String r3 = r6.getName()     // Catch:{ IOException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0065 }
            byte[] r2 = r2.getIV()     // Catch:{ IOException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0065 }
            r1 = r6
            boolean r0 = r6 instanceof X.C956461p     // Catch:{ IOException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0065 }
            if (r0 == 0) goto L_0x005d
            X.61p r1 = (X.C956461p) r1     // Catch:{ IOException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0065 }
            android.content.SharedPreferences r0 = r1.A01     // Catch:{ IOException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0065 }
        L_0x0050:
            android.content.SharedPreferences$Editor r1 = r0.edit()     // Catch:{ IOException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0065 }
            r0 = 0
            java.lang.String r0 = android.util.Base64.encodeToString(r2, r0)     // Catch:{ IOException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0065 }
            X.C18180wK.A0v(r1, r3, r0)     // Catch:{ IOException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0065 }
            goto L_0x0062
        L_0x005d:
            X.61o r1 = (X.C956361o) r1     // Catch:{ IOException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0065 }
            android.content.SharedPreferences r0 = r1.A01     // Catch:{ IOException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0065 }
            goto L_0x0050
        L_0x0062:
            return r4
        L_0x0063:
            r1 = move-exception
            goto L_0x0067
        L_0x0065:
            r1 = move-exception
            r5 = r4
        L_0x0067:
            boolean r0 = r6 instanceof X.C956461p
            if (r0 == 0) goto L_0x0071
            java.lang.String r0 = "SymmetricTransformer"
        L_0x006d:
            X.C10450iM.A07(r0, r1)
            return r5
        L_0x0071:
            java.lang.String r0 = "AsymmetricTransformer"
            goto L_0x006d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C133087v4.BEI(android.content.Context):java.io.OutputStream");
    }

    public final InputStream CwL(Context context) {
        String str;
        SharedPreferences sharedPreferences;
        GCMParameterSpec gCMParameterSpec;
        try {
            String name = getName();
            if (this instanceof C956461p) {
                sharedPreferences = ((C956461p) this).A01;
            } else {
                sharedPreferences = ((C956361o) this).A01;
            }
            String string = sharedPreferences.getString(name, (String) null);
            if (string != null) {
                gCMParameterSpec = new GCMParameterSpec(128, Base64.decode(string, 0));
            } else {
                gCMParameterSpec = null;
            }
            if (gCMParameterSpec != null) {
                Cipher instance = Cipher.getInstance("AES/GCM/NoPadding");
                instance.init(2, A02(false), gCMParameterSpec);
                return new CipherInputStream(new BufferedInputStream(new FileInputStream(A01(context))), instance);
            }
        } catch (IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException e) {
            if (this instanceof C956461p) {
                str = "SymmetricTransformer";
            } else {
                str = "AsymmetricTransformer";
            }
            C10450iM.A07(str, e);
        }
        return null;
    }

    public final SecretKey A02(boolean z) {
        SecretKey secretKey;
        byte[] bArr;
        if (this instanceof C956461p) {
            C956461p r2 = (C956461p) this;
            if (z) {
                try {
                    KeyStore instance = KeyStore.getInstance("AndroidKeyStore");
                    instance.load((KeyStore.LoadStoreParameter) null);
                    String str = r2.A02;
                    instance.deleteEntry(str);
                    r2.A00 = C956461p.A00(str);
                } catch (IOException | KeyStoreException | NoSuchAlgorithmException | CertificateException e) {
                    C10450iM.A07("SymmetricTransformer", e);
                }
            }
            secretKey = r2.A00;
            if (secretKey == null) {
                throw new InvalidKeyException("no secret key");
            }
        } else {
            C956361o r5 = (C956361o) this;
            if ((r5.A00 != null || r5.A01.contains(r5.A02)) && !z) {
                byte[] bArr2 = r5.A00;
                if (bArr2 == null) {
                    bArr2 = Base64.decode(C18200wM.A0h(r5.A01, r5.A02), 0);
                    r5.A00 = bArr2;
                }
                try {
                    Cipher instance2 = Cipher.getInstance("RSA/ECB/PKCS1Padding");
                    instance2.init(4, r5.A03.getPrivateKey());
                    secretKey = (SecretKey) instance2.unwrap(bArr2, "AES", 3);
                } catch (InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException e2) {
                    C10450iM.A07("AsymmetricTransformer", e2);
                    secretKey = null;
                }
                if (secretKey == null) {
                    throw new InvalidKeyException("No key found");
                }
            } else {
                byte[] bArr3 = new byte[16];
                new SecureRandom().nextBytes(bArr3);
                secretKey = new SecretKeySpec(bArr3, "AES/GCM/NoPadding");
                try {
                    Cipher instance3 = Cipher.getInstance("RSA/ECB/PKCS1Padding");
                    instance3.init(3, r5.A03.getCertificate().getPublicKey());
                    bArr = instance3.wrap(secretKey);
                } catch (InvalidKeyException | NoSuchAlgorithmException | IllegalBlockSizeException | NoSuchPaddingException e3) {
                    C10450iM.A07("AsymmetricTransformer", e3);
                    bArr = null;
                }
                r5.A00 = bArr;
                C18180wK.A0v(r5.A01.edit(), r5.A02, Base64.encodeToString(r5.A00, 0));
            }
        }
        return secretKey;
    }

    private String A01(Context context) {
        C91285fx A00;
        int i;
        int intValue = BJ1().intValue();
        if (intValue != 2) {
            A00 = C91285fx.A00(context);
            if (intValue != 1) {
                i = 557628693;
            } else {
                i = 1485823976;
            }
        } else {
            A00 = C91285fx.A00(context);
            i = 69931577;
        }
        return C86154wM.A0U(A00.BMF((C109746kY) null, i), getName()).getCanonicalPath();
    }
}
