package com.facebook.papaya.store.encryptor.otp;

import X.C15020qa;
import android.content.Context;
import com.facebook.jni.HybridData;

public class Encryptor {
    public final HybridData mHybridData;

    public static native HybridData initHybrid(Context context, String str);

    static {
        C15020qa.A0A("papaya-store-encryptor-otp");
    }

    /* JADX WARNING: Removed duplicated region for block: B:51:0x01e8 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x01e9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.List getKeys(android.content.Context r16, java.lang.String r17) {
        /*
            java.lang.String r5 = "KeyProvider"
            r3 = 0
            r2 = r17
            java.lang.String r1 = "AndroidKeyStore"
            java.security.KeyStore r13 = java.security.KeyStore.getInstance(r1)     // Catch:{ IOException | KeyStoreException | NoSuchAlgorithmException | CertificateException -> 0x01ce }
            r13.load(r3)     // Catch:{ IOException | KeyStoreException | NoSuchAlgorithmException | CertificateException -> 0x01ce }
            boolean r0 = r13.containsAlias(r2)     // Catch:{ RuntimeException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException -> 0x01ca }
            if (r0 != 0) goto L_0x0043
            java.lang.String r0 = "AES"
            javax.crypto.KeyGenerator r6 = javax.crypto.KeyGenerator.getInstance(r0, r1)     // Catch:{ RuntimeException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException -> 0x01ca }
            r0 = 3
            android.security.keystore.KeyGenParameterSpec$Builder r4 = new android.security.keystore.KeyGenParameterSpec$Builder     // Catch:{ RuntimeException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException -> 0x01ca }
            r4.<init>(r2, r0)     // Catch:{ RuntimeException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException -> 0x01ca }
            java.lang.String r0 = "GCM"
            r1 = 0
            java.lang.String[] r0 = new java.lang.String[]{r0}     // Catch:{ RuntimeException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException -> 0x01ca }
            android.security.keystore.KeyGenParameterSpec$Builder r0 = r4.setBlockModes(r0)     // Catch:{ RuntimeException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException -> 0x01ca }
            android.security.keystore.KeyGenParameterSpec$Builder r1 = r0.setRandomizedEncryptionRequired(r1)     // Catch:{ RuntimeException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException -> 0x01ca }
            java.lang.String r0 = "NoPadding"
            java.lang.String[] r0 = new java.lang.String[]{r0}     // Catch:{ RuntimeException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException -> 0x01ca }
            android.security.keystore.KeyGenParameterSpec$Builder r0 = r1.setEncryptionPaddings(r0)     // Catch:{ RuntimeException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException -> 0x01ca }
            android.security.keystore.KeyGenParameterSpec r0 = r0.build()     // Catch:{ RuntimeException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException -> 0x01ca }
            r6.init(r0)     // Catch:{ RuntimeException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException -> 0x01ca }
            r6.generateKey()     // Catch:{ RuntimeException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException -> 0x01ca }
        L_0x0043:
            android.content.SharedPreferences r11 = android.preference.PreferenceManager.getDefaultSharedPreferences(r16)
            java.lang.String r10 = "papaya_store_preference/"
            java.lang.String r0 = X.AnonymousClass00U.A0L(r10, r2)
            boolean r0 = r11.contains(r0)
            r14 = 3
            r1 = 2
            r4 = 4
            r12 = 1
            r9 = 0
            if (r0 == 0) goto L_0x010c
            java.lang.String r6 = X.AnonymousClass00U.A0L(r10, r2)     // Catch:{ UnrecoverableEntryException -> 0x0109, NoSuchAlgorithmException -> 0x0106, KeyStoreException -> 0x0103, NoSuchPaddingException -> 0x0100, InvalidKeyException -> 0x00fd, BadPaddingException -> 0x00fa, IllegalBlockSizeException -> 0x00f7, RuntimeException -> 0x01d9, InvalidAlgorithmParameterException -> 0x00f4 }
            java.lang.String r0 = ""
            java.lang.String r6 = r11.getString(r6, r0)     // Catch:{ UnrecoverableEntryException -> 0x0109, NoSuchAlgorithmException -> 0x0106, KeyStoreException -> 0x0103, NoSuchPaddingException -> 0x0100, InvalidKeyException -> 0x00fd, BadPaddingException -> 0x00fa, IllegalBlockSizeException -> 0x00f7, RuntimeException -> 0x01d9, InvalidAlgorithmParameterException -> 0x00f4 }
            r6.getClass()     // Catch:{ UnrecoverableEntryException -> 0x0109, NoSuchAlgorithmException -> 0x0106, KeyStoreException -> 0x0103, NoSuchPaddingException -> 0x0100, InvalidKeyException -> 0x00fd, BadPaddingException -> 0x00fa, IllegalBlockSizeException -> 0x00f7, RuntimeException -> 0x01d9, InvalidAlgorithmParameterException -> 0x00f4 }
            java.security.KeyStore$Entry r7 = r13.getEntry(r2, r3)     // Catch:{ UnrecoverableEntryException -> 0x0109, NoSuchAlgorithmException -> 0x0106, KeyStoreException -> 0x0103, NoSuchPaddingException -> 0x0100, InvalidKeyException -> 0x00fd, BadPaddingException -> 0x00fa, IllegalBlockSizeException -> 0x00f7, RuntimeException -> 0x01d9, InvalidAlgorithmParameterException -> 0x00f4 }
            if (r7 == 0) goto L_0x00ed
            boolean r0 = r7 instanceof java.security.KeyStore.SecretKeyEntry     // Catch:{ UnrecoverableEntryException -> 0x0109, NoSuchAlgorithmException -> 0x0106, KeyStoreException -> 0x0103, NoSuchPaddingException -> 0x0100, InvalidKeyException -> 0x00fd, BadPaddingException -> 0x00fa, IllegalBlockSizeException -> 0x00f7, RuntimeException -> 0x01d9, InvalidAlgorithmParameterException -> 0x00f4 }
            if (r0 == 0) goto L_0x00a5
            java.security.KeyStore$SecretKeyEntry r7 = (java.security.KeyStore.SecretKeyEntry) r7     // Catch:{ UnrecoverableEntryException -> 0x0109, NoSuchAlgorithmException -> 0x0106, KeyStoreException -> 0x0103, NoSuchPaddingException -> 0x0100, InvalidKeyException -> 0x00fd, BadPaddingException -> 0x00fa, IllegalBlockSizeException -> 0x00f7, RuntimeException -> 0x01d9, InvalidAlgorithmParameterException -> 0x00f4 }
            java.lang.String r0 = "AES/GCM/NoPadding"
            javax.crypto.Cipher r11 = javax.crypto.Cipher.getInstance(r0)     // Catch:{ UnrecoverableEntryException -> 0x0109, NoSuchAlgorithmException -> 0x0106, KeyStoreException -> 0x0103, NoSuchPaddingException -> 0x0100, InvalidKeyException -> 0x00fd, BadPaddingException -> 0x00fa, IllegalBlockSizeException -> 0x00f7, RuntimeException -> 0x01d9, InvalidAlgorithmParameterException -> 0x00f4 }
            javax.crypto.SecretKey r13 = r7.getSecretKey()     // Catch:{ UnrecoverableEntryException -> 0x0109, NoSuchAlgorithmException -> 0x0106, KeyStoreException -> 0x0103, NoSuchPaddingException -> 0x0100, InvalidKeyException -> 0x00fd, BadPaddingException -> 0x00fa, IllegalBlockSizeException -> 0x00f7, RuntimeException -> 0x01d9, InvalidAlgorithmParameterException -> 0x00f4 }
            byte[] r10 = android.util.Base64.decode(r6, r9)     // Catch:{ UnrecoverableEntryException -> 0x0109, NoSuchAlgorithmException -> 0x0106, KeyStoreException -> 0x0103, NoSuchPaddingException -> 0x0100, InvalidKeyException -> 0x00fd, BadPaddingException -> 0x00fa, IllegalBlockSizeException -> 0x00f7, RuntimeException -> 0x01d9, InvalidAlgorithmParameterException -> 0x00f4 }
            r8 = 12
            byte[] r7 = java.util.Arrays.copyOfRange(r10, r9, r8)     // Catch:{ UnrecoverableEntryException -> 0x0109, NoSuchAlgorithmException -> 0x0106, KeyStoreException -> 0x0103, NoSuchPaddingException -> 0x0100, InvalidKeyException -> 0x00fd, BadPaddingException -> 0x00fa, IllegalBlockSizeException -> 0x00f7, RuntimeException -> 0x01d9, InvalidAlgorithmParameterException -> 0x00f4 }
            r6 = 128(0x80, float:1.794E-43)
            javax.crypto.spec.GCMParameterSpec r0 = new javax.crypto.spec.GCMParameterSpec     // Catch:{ UnrecoverableEntryException -> 0x0109, NoSuchAlgorithmException -> 0x0106, KeyStoreException -> 0x0103, NoSuchPaddingException -> 0x0100, InvalidKeyException -> 0x00fd, BadPaddingException -> 0x00fa, IllegalBlockSizeException -> 0x00f7, RuntimeException -> 0x01d9, InvalidAlgorithmParameterException -> 0x00f4 }
            r0.<init>(r6, r7)     // Catch:{ UnrecoverableEntryException -> 0x0109, NoSuchAlgorithmException -> 0x0106, KeyStoreException -> 0x0103, NoSuchPaddingException -> 0x0100, InvalidKeyException -> 0x00fd, BadPaddingException -> 0x00fa, IllegalBlockSizeException -> 0x00f7, RuntimeException -> 0x01d9, InvalidAlgorithmParameterException -> 0x00f4 }
            r11.init(r1, r13, r0)     // Catch:{ UnrecoverableEntryException -> 0x0109, NoSuchAlgorithmException -> 0x0106, KeyStoreException -> 0x0103, NoSuchPaddingException -> 0x0100, InvalidKeyException -> 0x00fd, BadPaddingException -> 0x00fa, IllegalBlockSizeException -> 0x00f7, RuntimeException -> 0x01d9, InvalidAlgorithmParameterException -> 0x00f4 }
            int r0 = r10.length     // Catch:{ UnrecoverableEntryException -> 0x0109, NoSuchAlgorithmException -> 0x0106, KeyStoreException -> 0x0103, NoSuchPaddingException -> 0x0100, InvalidKeyException -> 0x00fd, BadPaddingException -> 0x00fa, IllegalBlockSizeException -> 0x00f7, RuntimeException -> 0x01d9, InvalidAlgorithmParameterException -> 0x00f4 }
            byte[] r0 = java.util.Arrays.copyOfRange(r10, r8, r0)     // Catch:{ UnrecoverableEntryException -> 0x0109, NoSuchAlgorithmException -> 0x0106, KeyStoreException -> 0x0103, NoSuchPaddingException -> 0x0100, InvalidKeyException -> 0x00fd, BadPaddingException -> 0x00fa, IllegalBlockSizeException -> 0x00f7, RuntimeException -> 0x01d9, InvalidAlgorithmParameterException -> 0x00f4 }
        L_0x0094:
            byte[] r0 = r11.doFinal(r0)     // Catch:{ UnrecoverableEntryException -> 0x0109, NoSuchAlgorithmException -> 0x0106, KeyStoreException -> 0x0103, NoSuchPaddingException -> 0x0100, InvalidKeyException -> 0x00fd, BadPaddingException -> 0x00fa, IllegalBlockSizeException -> 0x00f7, RuntimeException -> 0x01d9, InvalidAlgorithmParameterException -> 0x00f4 }
            java.lang.String r6 = new java.lang.String     // Catch:{ UnrecoverableEntryException -> 0x0109, NoSuchAlgorithmException -> 0x0106, KeyStoreException -> 0x0103, NoSuchPaddingException -> 0x0100, InvalidKeyException -> 0x00fd, BadPaddingException -> 0x00fa, IllegalBlockSizeException -> 0x00f7, RuntimeException -> 0x01d9, InvalidAlgorithmParameterException -> 0x00f4 }
            r6.<init>(r0)     // Catch:{ UnrecoverableEntryException -> 0x0109, NoSuchAlgorithmException -> 0x0106, KeyStoreException -> 0x0103, NoSuchPaddingException -> 0x0100, InvalidKeyException -> 0x00fd, BadPaddingException -> 0x00fa, IllegalBlockSizeException -> 0x00f7, RuntimeException -> 0x01d9, InvalidAlgorithmParameterException -> 0x00f4 }
            java.lang.String r0 = ":"
            java.lang.String[] r7 = r6.split(r0)     // Catch:{ UnrecoverableEntryException -> 0x0109, NoSuchAlgorithmException -> 0x0106, KeyStoreException -> 0x0103, NoSuchPaddingException -> 0x0100, InvalidKeyException -> 0x00fd, BadPaddingException -> 0x00fa, IllegalBlockSizeException -> 0x00f7, RuntimeException -> 0x01d9, InvalidAlgorithmParameterException -> 0x00f4 }
            int r0 = r7.length     // Catch:{ UnrecoverableEntryException -> 0x0109, NoSuchAlgorithmException -> 0x0106, KeyStoreException -> 0x0103, NoSuchPaddingException -> 0x0100, InvalidKeyException -> 0x00fd, BadPaddingException -> 0x00fa, IllegalBlockSizeException -> 0x00f7, RuntimeException -> 0x01d9, InvalidAlgorithmParameterException -> 0x00f4 }
            goto L_0x00bd
        L_0x00a5:
            boolean r0 = r7 instanceof java.security.KeyStore.PrivateKeyEntry     // Catch:{ UnrecoverableEntryException -> 0x0109, NoSuchAlgorithmException -> 0x0106, KeyStoreException -> 0x0103, NoSuchPaddingException -> 0x0100, InvalidKeyException -> 0x00fd, BadPaddingException -> 0x00fa, IllegalBlockSizeException -> 0x00f7, RuntimeException -> 0x01d9, InvalidAlgorithmParameterException -> 0x00f4 }
            if (r0 == 0) goto L_0x00e6
            java.security.KeyStore$PrivateKeyEntry r7 = (java.security.KeyStore.PrivateKeyEntry) r7     // Catch:{ UnrecoverableEntryException -> 0x0109, NoSuchAlgorithmException -> 0x0106, KeyStoreException -> 0x0103, NoSuchPaddingException -> 0x0100, InvalidKeyException -> 0x00fd, BadPaddingException -> 0x00fa, IllegalBlockSizeException -> 0x00f7, RuntimeException -> 0x01d9, InvalidAlgorithmParameterException -> 0x00f4 }
            java.lang.String r0 = "RSA/ECB/PKCS1Padding"
            javax.crypto.Cipher r11 = javax.crypto.Cipher.getInstance(r0)     // Catch:{ UnrecoverableEntryException -> 0x0109, NoSuchAlgorithmException -> 0x0106, KeyStoreException -> 0x0103, NoSuchPaddingException -> 0x0100, InvalidKeyException -> 0x00fd, BadPaddingException -> 0x00fa, IllegalBlockSizeException -> 0x00f7, RuntimeException -> 0x01d9, InvalidAlgorithmParameterException -> 0x00f4 }
            java.security.PrivateKey r0 = r7.getPrivateKey()     // Catch:{ UnrecoverableEntryException -> 0x0109, NoSuchAlgorithmException -> 0x0106, KeyStoreException -> 0x0103, NoSuchPaddingException -> 0x0100, InvalidKeyException -> 0x00fd, BadPaddingException -> 0x00fa, IllegalBlockSizeException -> 0x00f7, RuntimeException -> 0x01d9, InvalidAlgorithmParameterException -> 0x00f4 }
            r11.init(r1, r0)     // Catch:{ UnrecoverableEntryException -> 0x0109, NoSuchAlgorithmException -> 0x0106, KeyStoreException -> 0x0103, NoSuchPaddingException -> 0x0100, InvalidKeyException -> 0x00fd, BadPaddingException -> 0x00fa, IllegalBlockSizeException -> 0x00f7, RuntimeException -> 0x01d9, InvalidAlgorithmParameterException -> 0x00f4 }
            byte[] r0 = android.util.Base64.decode(r6, r9)     // Catch:{ UnrecoverableEntryException -> 0x0109, NoSuchAlgorithmException -> 0x0106, KeyStoreException -> 0x0103, NoSuchPaddingException -> 0x0100, InvalidKeyException -> 0x00fd, BadPaddingException -> 0x00fa, IllegalBlockSizeException -> 0x00f7, RuntimeException -> 0x01d9, InvalidAlgorithmParameterException -> 0x00f4 }
            goto L_0x0094
        L_0x00bd:
            boolean r0 = X.AnonymousClass0wJ.A1T(r0, r4)
            X.AnonymousClass7Ko.A0B(r0)     // Catch:{ UnrecoverableEntryException -> 0x0109, NoSuchAlgorithmException -> 0x0106, KeyStoreException -> 0x0103, NoSuchPaddingException -> 0x0100, InvalidKeyException -> 0x00fd, BadPaddingException -> 0x00fa, IllegalBlockSizeException -> 0x00f7, RuntimeException -> 0x01d9, InvalidAlgorithmParameterException -> 0x00f4 }
            r0 = r7[r9]     // Catch:{ UnrecoverableEntryException -> 0x0109, NoSuchAlgorithmException -> 0x0106, KeyStoreException -> 0x0103, NoSuchPaddingException -> 0x0100, InvalidKeyException -> 0x00fd, BadPaddingException -> 0x00fa, IllegalBlockSizeException -> 0x00f7, RuntimeException -> 0x01d9, InvalidAlgorithmParameterException -> 0x00f4 }
            java.lang.Integer r6 = X.C86124wJ.A0h(r0)     // Catch:{ UnrecoverableEntryException -> 0x0109, NoSuchAlgorithmException -> 0x0106, KeyStoreException -> 0x0103, NoSuchPaddingException -> 0x0100, InvalidKeyException -> 0x00fd, BadPaddingException -> 0x00fa, IllegalBlockSizeException -> 0x00f7, RuntimeException -> 0x01d9, InvalidAlgorithmParameterException -> 0x00f4 }
            r0 = r7[r12]     // Catch:{ UnrecoverableEntryException -> 0x0109, NoSuchAlgorithmException -> 0x0106, KeyStoreException -> 0x0103, NoSuchPaddingException -> 0x0100, InvalidKeyException -> 0x00fd, BadPaddingException -> 0x00fa, IllegalBlockSizeException -> 0x00f7, RuntimeException -> 0x01d9, InvalidAlgorithmParameterException -> 0x00f4 }
            java.lang.Integer r4 = X.C86124wJ.A0h(r0)     // Catch:{ UnrecoverableEntryException -> 0x0109, NoSuchAlgorithmException -> 0x0106, KeyStoreException -> 0x0103, NoSuchPaddingException -> 0x0100, InvalidKeyException -> 0x00fd, BadPaddingException -> 0x00fa, IllegalBlockSizeException -> 0x00f7, RuntimeException -> 0x01d9, InvalidAlgorithmParameterException -> 0x00f4 }
            r0 = r7[r1]     // Catch:{ UnrecoverableEntryException -> 0x0109, NoSuchAlgorithmException -> 0x0106, KeyStoreException -> 0x0103, NoSuchPaddingException -> 0x0100, InvalidKeyException -> 0x00fd, BadPaddingException -> 0x00fa, IllegalBlockSizeException -> 0x00f7, RuntimeException -> 0x01d9, InvalidAlgorithmParameterException -> 0x00f4 }
            java.lang.Integer r1 = X.C86124wJ.A0h(r0)     // Catch:{ UnrecoverableEntryException -> 0x0109, NoSuchAlgorithmException -> 0x0106, KeyStoreException -> 0x0103, NoSuchPaddingException -> 0x0100, InvalidKeyException -> 0x00fd, BadPaddingException -> 0x00fa, IllegalBlockSizeException -> 0x00f7, RuntimeException -> 0x01d9, InvalidAlgorithmParameterException -> 0x00f4 }
            r0 = r7[r14]     // Catch:{ UnrecoverableEntryException -> 0x0109, NoSuchAlgorithmException -> 0x0106, KeyStoreException -> 0x0103, NoSuchPaddingException -> 0x0100, InvalidKeyException -> 0x00fd, BadPaddingException -> 0x00fa, IllegalBlockSizeException -> 0x00f7, RuntimeException -> 0x01d9, InvalidAlgorithmParameterException -> 0x00f4 }
            java.lang.Integer r0 = X.C86124wJ.A0h(r0)     // Catch:{ UnrecoverableEntryException -> 0x0109, NoSuchAlgorithmException -> 0x0106, KeyStoreException -> 0x0103, NoSuchPaddingException -> 0x0100, InvalidKeyException -> 0x00fd, BadPaddingException -> 0x00fa, IllegalBlockSizeException -> 0x00f7, RuntimeException -> 0x01d9, InvalidAlgorithmParameterException -> 0x00f4 }
            java.lang.Integer[] r0 = new java.lang.Integer[]{r6, r4, r1, r0}     // Catch:{ UnrecoverableEntryException -> 0x0109, NoSuchAlgorithmException -> 0x0106, KeyStoreException -> 0x0103, NoSuchPaddingException -> 0x0100, InvalidKeyException -> 0x00fd, BadPaddingException -> 0x00fa, IllegalBlockSizeException -> 0x00f7, RuntimeException -> 0x01d9, InvalidAlgorithmParameterException -> 0x00f4 }
            java.util.List r3 = java.util.Arrays.asList(r0)     // Catch:{ UnrecoverableEntryException -> 0x0109, NoSuchAlgorithmException -> 0x0106, KeyStoreException -> 0x0103, NoSuchPaddingException -> 0x0100, InvalidKeyException -> 0x00fd, BadPaddingException -> 0x00fa, IllegalBlockSizeException -> 0x00f7, RuntimeException -> 0x01d9, InvalidAlgorithmParameterException -> 0x00f4 }
            goto L_0x01df
        L_0x00e6:
            java.lang.String r0 = "Unexpected key entry type"
            java.lang.RuntimeException r0 = X.C18250wR.A0V(r0)     // Catch:{ UnrecoverableEntryException -> 0x0109, NoSuchAlgorithmException -> 0x0106, KeyStoreException -> 0x0103, NoSuchPaddingException -> 0x0100, InvalidKeyException -> 0x00fd, BadPaddingException -> 0x00fa, IllegalBlockSizeException -> 0x00f7, RuntimeException -> 0x01d9, InvalidAlgorithmParameterException -> 0x00f4 }
            throw r0     // Catch:{ UnrecoverableEntryException -> 0x0109, NoSuchAlgorithmException -> 0x0106, KeyStoreException -> 0x0103, NoSuchPaddingException -> 0x0100, InvalidKeyException -> 0x00fd, BadPaddingException -> 0x00fa, IllegalBlockSizeException -> 0x00f7, RuntimeException -> 0x01d9, InvalidAlgorithmParameterException -> 0x00f4 }
        L_0x00ed:
            java.lang.String r0 = "Key not found"
            java.lang.RuntimeException r0 = X.C18250wR.A0V(r0)     // Catch:{ UnrecoverableEntryException -> 0x0109, NoSuchAlgorithmException -> 0x0106, KeyStoreException -> 0x0103, NoSuchPaddingException -> 0x0100, InvalidKeyException -> 0x00fd, BadPaddingException -> 0x00fa, IllegalBlockSizeException -> 0x00f7, RuntimeException -> 0x01d9, InvalidAlgorithmParameterException -> 0x00f4 }
            throw r0     // Catch:{ UnrecoverableEntryException -> 0x0109, NoSuchAlgorithmException -> 0x0106, KeyStoreException -> 0x0103, NoSuchPaddingException -> 0x0100, InvalidKeyException -> 0x00fd, BadPaddingException -> 0x00fa, IllegalBlockSizeException -> 0x00f7, RuntimeException -> 0x01d9, InvalidAlgorithmParameterException -> 0x00f4 }
        L_0x00f4:
            r1 = move-exception
            goto L_0x01da
        L_0x00f7:
            r1 = move-exception
            goto L_0x01da
        L_0x00fa:
            r1 = move-exception
            goto L_0x01da
        L_0x00fd:
            r1 = move-exception
            goto L_0x01da
        L_0x0100:
            r1 = move-exception
            goto L_0x01da
        L_0x0103:
            r1 = move-exception
            goto L_0x01da
        L_0x0106:
            r1 = move-exception
            goto L_0x01da
        L_0x0109:
            r1 = move-exception
            goto L_0x01da
        L_0x010c:
            java.security.SecureRandom r15 = X.AnonymousClass739.A00     // Catch:{ RuntimeException | InvalidAlgorithmParameterException | InvalidKeyException | KeyStoreException | NoSuchAlgorithmException | UnrecoverableEntryException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x01d2 }
            int r0 = r15.nextInt()     // Catch:{ RuntimeException | InvalidAlgorithmParameterException | InvalidKeyException | KeyStoreException | NoSuchAlgorithmException | UnrecoverableEntryException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x01d2 }
            int r7 = java.lang.Math.abs(r0)     // Catch:{ RuntimeException | InvalidAlgorithmParameterException | InvalidKeyException | KeyStoreException | NoSuchAlgorithmException | UnrecoverableEntryException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x01d2 }
            int r0 = r15.nextInt()     // Catch:{ RuntimeException | InvalidAlgorithmParameterException | InvalidKeyException | KeyStoreException | NoSuchAlgorithmException | UnrecoverableEntryException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x01d2 }
            int r6 = java.lang.Math.abs(r0)     // Catch:{ RuntimeException | InvalidAlgorithmParameterException | InvalidKeyException | KeyStoreException | NoSuchAlgorithmException | UnrecoverableEntryException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x01d2 }
            int r0 = r15.nextInt()     // Catch:{ RuntimeException | InvalidAlgorithmParameterException | InvalidKeyException | KeyStoreException | NoSuchAlgorithmException | UnrecoverableEntryException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x01d2 }
            int r4 = java.lang.Math.abs(r0)     // Catch:{ RuntimeException | InvalidAlgorithmParameterException | InvalidKeyException | KeyStoreException | NoSuchAlgorithmException | UnrecoverableEntryException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x01d2 }
            int r0 = r15.nextInt()     // Catch:{ RuntimeException | InvalidAlgorithmParameterException | InvalidKeyException | KeyStoreException | NoSuchAlgorithmException | UnrecoverableEntryException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x01d2 }
            int r1 = java.lang.Math.abs(r0)     // Catch:{ RuntimeException | InvalidAlgorithmParameterException | InvalidKeyException | KeyStoreException | NoSuchAlgorithmException | UnrecoverableEntryException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x01d2 }
            java.lang.String r0 = "%d:%d:%d:%d"
            java.lang.Integer r8 = java.lang.Integer.valueOf(r7)     // Catch:{ RuntimeException | InvalidAlgorithmParameterException | InvalidKeyException | KeyStoreException | NoSuchAlgorithmException | UnrecoverableEntryException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x01d2 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)     // Catch:{ RuntimeException | InvalidAlgorithmParameterException | InvalidKeyException | KeyStoreException | NoSuchAlgorithmException | UnrecoverableEntryException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x01d2 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r4)     // Catch:{ RuntimeException | InvalidAlgorithmParameterException | InvalidKeyException | KeyStoreException | NoSuchAlgorithmException | UnrecoverableEntryException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x01d2 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r1)     // Catch:{ RuntimeException | InvalidAlgorithmParameterException | InvalidKeyException | KeyStoreException | NoSuchAlgorithmException | UnrecoverableEntryException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x01d2 }
            java.lang.String r17 = com.facebook.common.stringformat.StringFormatUtil.formatStrLocaleSafe(r0, r8, r7, r6, r4)     // Catch:{ RuntimeException | InvalidAlgorithmParameterException | InvalidKeyException | KeyStoreException | NoSuchAlgorithmException | UnrecoverableEntryException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x01d2 }
            java.security.KeyStore$Entry r13 = r13.getEntry(r2, r3)     // Catch:{ RuntimeException | InvalidAlgorithmParameterException | InvalidKeyException | KeyStoreException | NoSuchAlgorithmException | UnrecoverableEntryException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x01d2 }
            if (r13 == 0) goto L_0x01bc
            boolean r0 = r13 instanceof java.security.KeyStore.SecretKeyEntry     // Catch:{ RuntimeException | InvalidAlgorithmParameterException | InvalidKeyException | KeyStoreException | NoSuchAlgorithmException | UnrecoverableEntryException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x01d2 }
            if (r0 == 0) goto L_0x019c
            java.security.KeyStore$SecretKeyEntry r13 = (java.security.KeyStore.SecretKeyEntry) r13     // Catch:{ RuntimeException | InvalidAlgorithmParameterException | InvalidKeyException | KeyStoreException | NoSuchAlgorithmException | UnrecoverableEntryException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x01d2 }
            javax.crypto.SecretKey r16 = r13.getSecretKey()     // Catch:{ RuntimeException | InvalidAlgorithmParameterException | InvalidKeyException | KeyStoreException | NoSuchAlgorithmException | UnrecoverableEntryException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x01d2 }
            java.lang.String r0 = "AES/GCM/NoPadding"
            javax.crypto.Cipher r14 = javax.crypto.Cipher.getInstance(r0)     // Catch:{ RuntimeException | InvalidAlgorithmParameterException | InvalidKeyException | KeyStoreException | NoSuchAlgorithmException | UnrecoverableEntryException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x01d2 }
            r13 = 12
            byte[] r1 = new byte[r13]     // Catch:{ RuntimeException | InvalidAlgorithmParameterException | InvalidKeyException | KeyStoreException | NoSuchAlgorithmException | UnrecoverableEntryException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x01d2 }
            r15.nextBytes(r1)     // Catch:{ RuntimeException | InvalidAlgorithmParameterException | InvalidKeyException | KeyStoreException | NoSuchAlgorithmException | UnrecoverableEntryException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x01d2 }
            r0 = 128(0x80, float:1.794E-43)
            javax.crypto.spec.GCMParameterSpec r15 = new javax.crypto.spec.GCMParameterSpec     // Catch:{ RuntimeException | InvalidAlgorithmParameterException | InvalidKeyException | KeyStoreException | NoSuchAlgorithmException | UnrecoverableEntryException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x01d2 }
            r15.<init>(r0, r1)     // Catch:{ RuntimeException | InvalidAlgorithmParameterException | InvalidKeyException | KeyStoreException | NoSuchAlgorithmException | UnrecoverableEntryException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x01d2 }
            r0 = r16
            r14.init(r12, r0, r15)     // Catch:{ RuntimeException | InvalidAlgorithmParameterException | InvalidKeyException | KeyStoreException | NoSuchAlgorithmException | UnrecoverableEntryException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x01d2 }
            byte[] r0 = r17.getBytes()     // Catch:{ RuntimeException | InvalidAlgorithmParameterException | InvalidKeyException | KeyStoreException | NoSuchAlgorithmException | UnrecoverableEntryException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x01d2 }
            byte[] r14 = r14.doFinal(r0)     // Catch:{ RuntimeException | InvalidAlgorithmParameterException | InvalidKeyException | KeyStoreException | NoSuchAlgorithmException | UnrecoverableEntryException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x01d2 }
            int r12 = r14.length     // Catch:{ RuntimeException | InvalidAlgorithmParameterException | InvalidKeyException | KeyStoreException | NoSuchAlgorithmException | UnrecoverableEntryException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x01d2 }
            int r0 = r12 + 12
            byte[] r0 = new byte[r0]     // Catch:{ RuntimeException | InvalidAlgorithmParameterException | InvalidKeyException | KeyStoreException | NoSuchAlgorithmException | UnrecoverableEntryException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x01d2 }
            java.lang.System.arraycopy(r1, r9, r0, r9, r13)     // Catch:{ RuntimeException | InvalidAlgorithmParameterException | InvalidKeyException | KeyStoreException | NoSuchAlgorithmException | UnrecoverableEntryException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x01d2 }
            java.lang.System.arraycopy(r14, r9, r0, r13, r12)     // Catch:{ RuntimeException | InvalidAlgorithmParameterException | InvalidKeyException | KeyStoreException | NoSuchAlgorithmException | UnrecoverableEntryException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x01d2 }
        L_0x0180:
            java.lang.String r9 = android.util.Base64.encodeToString(r0, r9)     // Catch:{ RuntimeException | InvalidAlgorithmParameterException | InvalidKeyException | KeyStoreException | NoSuchAlgorithmException | UnrecoverableEntryException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x01d2 }
            android.content.SharedPreferences$Editor r1 = r11.edit()     // Catch:{ RuntimeException | InvalidAlgorithmParameterException | InvalidKeyException | KeyStoreException | NoSuchAlgorithmException | UnrecoverableEntryException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x01d2 }
            java.lang.String r0 = X.AnonymousClass00U.A0L(r10, r2)     // Catch:{ RuntimeException | InvalidAlgorithmParameterException | InvalidKeyException | KeyStoreException | NoSuchAlgorithmException | UnrecoverableEntryException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x01d2 }
            android.content.SharedPreferences$Editor r0 = r1.putString(r0, r9)     // Catch:{ RuntimeException | InvalidAlgorithmParameterException | InvalidKeyException | KeyStoreException | NoSuchAlgorithmException | UnrecoverableEntryException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x01d2 }
            r0.commit()     // Catch:{ RuntimeException | InvalidAlgorithmParameterException | InvalidKeyException | KeyStoreException | NoSuchAlgorithmException | UnrecoverableEntryException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x01d2 }
            java.lang.Integer[] r0 = new java.lang.Integer[]{r8, r7, r6, r4}     // Catch:{ RuntimeException | InvalidAlgorithmParameterException | InvalidKeyException | KeyStoreException | NoSuchAlgorithmException | UnrecoverableEntryException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x01d2 }
            java.util.List r3 = java.util.Arrays.asList(r0)     // Catch:{ RuntimeException | InvalidAlgorithmParameterException | InvalidKeyException | KeyStoreException | NoSuchAlgorithmException | UnrecoverableEntryException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x01d2 }
            goto L_0x01df
        L_0x019c:
            boolean r0 = r13 instanceof java.security.KeyStore.PrivateKeyEntry     // Catch:{ RuntimeException | InvalidAlgorithmParameterException | InvalidKeyException | KeyStoreException | NoSuchAlgorithmException | UnrecoverableEntryException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x01d2 }
            if (r0 == 0) goto L_0x01c3
            java.security.KeyStore$PrivateKeyEntry r13 = (java.security.KeyStore.PrivateKeyEntry) r13     // Catch:{ RuntimeException | InvalidAlgorithmParameterException | InvalidKeyException | KeyStoreException | NoSuchAlgorithmException | UnrecoverableEntryException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x01d2 }
            java.lang.String r0 = "RSA/ECB/PKCS1Padding"
            javax.crypto.Cipher r1 = javax.crypto.Cipher.getInstance(r0)     // Catch:{ RuntimeException | InvalidAlgorithmParameterException | InvalidKeyException | KeyStoreException | NoSuchAlgorithmException | UnrecoverableEntryException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x01d2 }
            java.security.cert.Certificate r0 = r13.getCertificate()     // Catch:{ RuntimeException | InvalidAlgorithmParameterException | InvalidKeyException | KeyStoreException | NoSuchAlgorithmException | UnrecoverableEntryException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x01d2 }
            java.security.PublicKey r0 = r0.getPublicKey()     // Catch:{ RuntimeException | InvalidAlgorithmParameterException | InvalidKeyException | KeyStoreException | NoSuchAlgorithmException | UnrecoverableEntryException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x01d2 }
            r1.init(r12, r0)     // Catch:{ RuntimeException | InvalidAlgorithmParameterException | InvalidKeyException | KeyStoreException | NoSuchAlgorithmException | UnrecoverableEntryException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x01d2 }
            byte[] r0 = r17.getBytes()     // Catch:{ RuntimeException | InvalidAlgorithmParameterException | InvalidKeyException | KeyStoreException | NoSuchAlgorithmException | UnrecoverableEntryException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x01d2 }
            byte[] r0 = r1.doFinal(r0)     // Catch:{ RuntimeException | InvalidAlgorithmParameterException | InvalidKeyException | KeyStoreException | NoSuchAlgorithmException | UnrecoverableEntryException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x01d2 }
            goto L_0x0180
        L_0x01bc:
            java.lang.String r0 = "Key not found"
            java.lang.RuntimeException r0 = X.C18250wR.A0V(r0)     // Catch:{ RuntimeException | InvalidAlgorithmParameterException | InvalidKeyException | KeyStoreException | NoSuchAlgorithmException | UnrecoverableEntryException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x01d2 }
            goto L_0x01c9
        L_0x01c3:
            java.lang.String r0 = "Unexpected key entry type"
            java.lang.RuntimeException r0 = X.C18250wR.A0V(r0)     // Catch:{ RuntimeException | InvalidAlgorithmParameterException | InvalidKeyException | KeyStoreException | NoSuchAlgorithmException | UnrecoverableEntryException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x01d2 }
        L_0x01c9:
            throw r0     // Catch:{ RuntimeException | InvalidAlgorithmParameterException | InvalidKeyException | KeyStoreException | NoSuchAlgorithmException | UnrecoverableEntryException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x01d2 }
        L_0x01ca:
            r1 = move-exception
            java.lang.String r0 = "Fail to generate encryption/decryption key"
            goto L_0x01d5
        L_0x01ce:
            r1 = move-exception
            java.lang.String r0 = "Failed to get key store"
            goto L_0x01d5
        L_0x01d2:
            r1 = move-exception
            java.lang.String r0 = "Failed to encrypt keys"
        L_0x01d5:
            X.AnonymousClass0LU.A0E(r5, r0, r1)
            goto L_0x01df
        L_0x01d9:
            r1 = move-exception
        L_0x01da:
            java.lang.String r0 = "Fail to decrypt keys"
            X.AnonymousClass0LU.A0E(r5, r0, r1)
        L_0x01df:
            if (r3 == 0) goto L_0x01e9
            int r1 = r3.size()
            r0 = 4
            if (r1 != r0) goto L_0x01e9
            return r3
        L_0x01e9:
            java.lang.String r0 = "Fail to get encryption key for "
            java.lang.String r0 = X.AnonymousClass00U.A0L(r0, r2)
            java.lang.RuntimeException r0 = X.C18250wR.A0V(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.papaya.store.encryptor.otp.Encryptor.getKeys(android.content.Context, java.lang.String):java.util.List");
    }

    public Encryptor(Context context, String str) {
        this.mHybridData = initHybrid(context, str);
    }
}
