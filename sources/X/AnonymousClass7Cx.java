package X;

import android.os.Build;

/* renamed from: X.7Cx  reason: invalid class name */
public final class AnonymousClass7Cx {
    public static final Integer[] A00 = {AnonymousClass006.A00, AnonymousClass006.A01, AnonymousClass006.A0C};
    public static final String[] A01 = {"ASUS_X00GD"};

    public static boolean A01(Integer num) {
        if (num != AnonymousClass006.A0C) {
            String upperCase = Build.MODEL.toUpperCase();
            for (String equals : A01) {
                if (equals.equals(upperCase)) {
                    return false;
                }
            }
        }
        int intValue = num.intValue();
        if (intValue == 0 || intValue == 1 || intValue == 2) {
            return true;
        }
        throw C18250wR.A0V(AnonymousClass00U.A0L("Unknown transformer type ", C101616Ry.A00(num)));
    }

    /* JADX WARNING: Removed duplicated region for block: B:46:0x00e9 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:80:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C146218lq A00(android.content.Context r9, java.lang.Integer r10, java.lang.String r11) {
        /*
            int r1 = r10.intValue()
            r0 = 0
            if (r1 == r0) goto L_0x0100
            r7 = 1
            if (r1 == r7) goto L_0x0013
            r0 = 2
            if (r1 != r0) goto L_0x00f1
            X.4Bx r5 = new X.4Bx
            r5.<init>(r9, r11)
        L_0x0012:
            return r5
        L_0x0013:
            java.lang.String r5 = "_pair"
            java.lang.String r4 = X.AnonymousClass00U.A0L(r11, r5)
            r3 = 0
            java.lang.String r0 = "AndroidKeyStore"
            java.security.KeyStore r1 = java.security.KeyStore.getInstance(r0)     // Catch:{ UnrecoverableEntryException -> 0x0043, NoSuchAlgorithmException -> 0x0041, CertificateException -> 0x003f, IOException -> 0x003d, KeyStoreException -> 0x0045 }
            r1.load(r3)     // Catch:{ UnrecoverableEntryException -> 0x0043, NoSuchAlgorithmException -> 0x0041, CertificateException -> 0x003f, IOException -> 0x003d, KeyStoreException -> 0x0045 }
            java.security.KeyStore$Entry r2 = r1.getEntry(r4, r3)     // Catch:{ NullPointerException -> 0x0036 }
            boolean r0 = r2 instanceof java.security.KeyStore.PrivateKeyEntry     // Catch:{ NullPointerException -> 0x0036 }
            if (r0 == 0) goto L_0x0030
            java.security.KeyStore$PrivateKeyEntry r2 = (java.security.KeyStore.PrivateKeyEntry) r2     // Catch:{ NullPointerException -> 0x0036 }
            if (r2 != 0) goto L_0x00d9
            goto L_0x004b
        L_0x0030:
            if (r2 == 0) goto L_0x004b
            r1.deleteEntry(r4)     // Catch:{ NullPointerException -> 0x0036 }
            goto L_0x004b
        L_0x0036:
            r1 = move-exception
            java.lang.String r0 = "AsymmetricTransformer"
            X.C10450iM.A07(r0, r1)     // Catch:{ UnrecoverableEntryException -> 0x0043, NoSuchAlgorithmException -> 0x0041, CertificateException -> 0x003f, IOException -> 0x003d, KeyStoreException -> 0x0045 }
            goto L_0x004b
        L_0x003d:
            r1 = move-exception
            goto L_0x0046
        L_0x003f:
            r1 = move-exception
            goto L_0x0046
        L_0x0041:
            r1 = move-exception
            goto L_0x0046
        L_0x0043:
            r1 = move-exception
            goto L_0x0046
        L_0x0045:
            r1 = move-exception
        L_0x0046:
            java.lang.String r0 = "AsymmetricTransformer"
            X.C10450iM.A07(r0, r1)
        L_0x004b:
            java.lang.String r2 = "AndroidKeyStore"
            java.lang.String r5 = X.AnonymousClass00U.A0L(r11, r5)
            java.security.KeyStore r4 = java.security.KeyStore.getInstance(r2)     // Catch:{ CertificateException -> 0x00d0, KeyStoreException -> 0x00ce, IOException -> 0x00cc, NoSuchProviderException -> 0x00ca, InvalidAlgorithmParameterException -> 0x00c8, UnrecoverableEntryException -> 0x00c6, NoSuchAlgorithmException -> 0x00c4, ProviderException -> 0x00c2, NullPointerException -> 0x00d2 }
            r4.load(r3)     // Catch:{ CertificateException -> 0x00d0, KeyStoreException -> 0x00ce, IOException -> 0x00cc, NoSuchProviderException -> 0x00ca, InvalidAlgorithmParameterException -> 0x00c8, UnrecoverableEntryException -> 0x00c6, NoSuchAlgorithmException -> 0x00c4, ProviderException -> 0x00c2, NullPointerException -> 0x00d2 }
            java.util.Calendar r8 = java.util.Calendar.getInstance()     // Catch:{ CertificateException -> 0x00d0, KeyStoreException -> 0x00ce, IOException -> 0x00cc, NoSuchProviderException -> 0x00ca, InvalidAlgorithmParameterException -> 0x00c8, UnrecoverableEntryException -> 0x00c6, NoSuchAlgorithmException -> 0x00c4, ProviderException -> 0x00c2, NullPointerException -> 0x00d2 }
            java.util.Calendar r6 = java.util.Calendar.getInstance()     // Catch:{ CertificateException -> 0x00d0, KeyStoreException -> 0x00ce, IOException -> 0x00cc, NoSuchProviderException -> 0x00ca, InvalidAlgorithmParameterException -> 0x00c8, UnrecoverableEntryException -> 0x00c6, NoSuchAlgorithmException -> 0x00c4, ProviderException -> 0x00c2, NullPointerException -> 0x00d2 }
            r0 = 50
            r6.add(r7, r0)     // Catch:{ CertificateException -> 0x00d0, KeyStoreException -> 0x00ce, IOException -> 0x00cc, NoSuchProviderException -> 0x00ca, InvalidAlgorithmParameterException -> 0x00c8, UnrecoverableEntryException -> 0x00c6, NoSuchAlgorithmException -> 0x00c4, ProviderException -> 0x00c2, NullPointerException -> 0x00d2 }
            android.security.KeyPairGeneratorSpec$Builder r7 = new android.security.KeyPairGeneratorSpec$Builder     // Catch:{ CertificateException -> 0x00d0, KeyStoreException -> 0x00ce, IOException -> 0x00cc, NoSuchProviderException -> 0x00ca, InvalidAlgorithmParameterException -> 0x00c8, UnrecoverableEntryException -> 0x00c6, NoSuchAlgorithmException -> 0x00c4, ProviderException -> 0x00c2, NullPointerException -> 0x00d2 }
            r7.<init>(r9)     // Catch:{ CertificateException -> 0x00d0, KeyStoreException -> 0x00ce, IOException -> 0x00cc, NoSuchProviderException -> 0x00ca, InvalidAlgorithmParameterException -> 0x00c8, UnrecoverableEntryException -> 0x00c6, NoSuchAlgorithmException -> 0x00c4, ProviderException -> 0x00c2, NullPointerException -> 0x00d2 }
            java.lang.String r0 = "CN="
            java.lang.String r1 = X.AnonymousClass00U.A0L(r0, r5)     // Catch:{ CertificateException -> 0x00d0, KeyStoreException -> 0x00ce, IOException -> 0x00cc, NoSuchProviderException -> 0x00ca, InvalidAlgorithmParameterException -> 0x00c8, UnrecoverableEntryException -> 0x00c6, NoSuchAlgorithmException -> 0x00c4, ProviderException -> 0x00c2, NullPointerException -> 0x00d2 }
            javax.security.auth.x500.X500Principal r0 = new javax.security.auth.x500.X500Principal     // Catch:{ CertificateException -> 0x00d0, KeyStoreException -> 0x00ce, IOException -> 0x00cc, NoSuchProviderException -> 0x00ca, InvalidAlgorithmParameterException -> 0x00c8, UnrecoverableEntryException -> 0x00c6, NoSuchAlgorithmException -> 0x00c4, ProviderException -> 0x00c2, NullPointerException -> 0x00d2 }
            r0.<init>(r1)     // Catch:{ CertificateException -> 0x00d0, KeyStoreException -> 0x00ce, IOException -> 0x00cc, NoSuchProviderException -> 0x00ca, InvalidAlgorithmParameterException -> 0x00c8, UnrecoverableEntryException -> 0x00c6, NoSuchAlgorithmException -> 0x00c4, ProviderException -> 0x00c2, NullPointerException -> 0x00d2 }
            android.security.KeyPairGeneratorSpec$Builder r0 = r7.setSubject(r0)     // Catch:{ CertificateException -> 0x00d0, KeyStoreException -> 0x00ce, IOException -> 0x00cc, NoSuchProviderException -> 0x00ca, InvalidAlgorithmParameterException -> 0x00c8, UnrecoverableEntryException -> 0x00c6, NoSuchAlgorithmException -> 0x00c4, ProviderException -> 0x00c2, NullPointerException -> 0x00d2 }
            android.security.KeyPairGeneratorSpec$Builder r1 = r0.setAlias(r5)     // Catch:{ CertificateException -> 0x00d0, KeyStoreException -> 0x00ce, IOException -> 0x00cc, NoSuchProviderException -> 0x00ca, InvalidAlgorithmParameterException -> 0x00c8, UnrecoverableEntryException -> 0x00c6, NoSuchAlgorithmException -> 0x00c4, ProviderException -> 0x00c2, NullPointerException -> 0x00d2 }
            r0 = 4096(0x1000, float:5.74E-42)
            android.security.KeyPairGeneratorSpec$Builder r1 = r1.setKeySize(r0)     // Catch:{ CertificateException -> 0x00d0, KeyStoreException -> 0x00ce, IOException -> 0x00cc, NoSuchProviderException -> 0x00ca, InvalidAlgorithmParameterException -> 0x00c8, UnrecoverableEntryException -> 0x00c6, NoSuchAlgorithmException -> 0x00c4, ProviderException -> 0x00c2, NullPointerException -> 0x00d2 }
            java.math.BigInteger r0 = java.math.BigInteger.TEN     // Catch:{ CertificateException -> 0x00d0, KeyStoreException -> 0x00ce, IOException -> 0x00cc, NoSuchProviderException -> 0x00ca, InvalidAlgorithmParameterException -> 0x00c8, UnrecoverableEntryException -> 0x00c6, NoSuchAlgorithmException -> 0x00c4, ProviderException -> 0x00c2, NullPointerException -> 0x00d2 }
            android.security.KeyPairGeneratorSpec$Builder r1 = r1.setSerialNumber(r0)     // Catch:{ CertificateException -> 0x00d0, KeyStoreException -> 0x00ce, IOException -> 0x00cc, NoSuchProviderException -> 0x00ca, InvalidAlgorithmParameterException -> 0x00c8, UnrecoverableEntryException -> 0x00c6, NoSuchAlgorithmException -> 0x00c4, ProviderException -> 0x00c2, NullPointerException -> 0x00d2 }
            java.util.Date r0 = r8.getTime()     // Catch:{ CertificateException -> 0x00d0, KeyStoreException -> 0x00ce, IOException -> 0x00cc, NoSuchProviderException -> 0x00ca, InvalidAlgorithmParameterException -> 0x00c8, UnrecoverableEntryException -> 0x00c6, NoSuchAlgorithmException -> 0x00c4, ProviderException -> 0x00c2, NullPointerException -> 0x00d2 }
            android.security.KeyPairGeneratorSpec$Builder r1 = r1.setStartDate(r0)     // Catch:{ CertificateException -> 0x00d0, KeyStoreException -> 0x00ce, IOException -> 0x00cc, NoSuchProviderException -> 0x00ca, InvalidAlgorithmParameterException -> 0x00c8, UnrecoverableEntryException -> 0x00c6, NoSuchAlgorithmException -> 0x00c4, ProviderException -> 0x00c2, NullPointerException -> 0x00d2 }
            java.util.Date r0 = r6.getTime()     // Catch:{ CertificateException -> 0x00d0, KeyStoreException -> 0x00ce, IOException -> 0x00cc, NoSuchProviderException -> 0x00ca, InvalidAlgorithmParameterException -> 0x00c8, UnrecoverableEntryException -> 0x00c6, NoSuchAlgorithmException -> 0x00c4, ProviderException -> 0x00c2, NullPointerException -> 0x00d2 }
            android.security.KeyPairGeneratorSpec$Builder r0 = r1.setEndDate(r0)     // Catch:{ CertificateException -> 0x00d0, KeyStoreException -> 0x00ce, IOException -> 0x00cc, NoSuchProviderException -> 0x00ca, InvalidAlgorithmParameterException -> 0x00c8, UnrecoverableEntryException -> 0x00c6, NoSuchAlgorithmException -> 0x00c4, ProviderException -> 0x00c2, NullPointerException -> 0x00d2 }
            android.security.KeyPairGeneratorSpec r1 = r0.build()     // Catch:{ CertificateException -> 0x00d0, KeyStoreException -> 0x00ce, IOException -> 0x00cc, NoSuchProviderException -> 0x00ca, InvalidAlgorithmParameterException -> 0x00c8, UnrecoverableEntryException -> 0x00c6, NoSuchAlgorithmException -> 0x00c4, ProviderException -> 0x00c2, NullPointerException -> 0x00d2 }
            java.lang.String r0 = "RSA"
            java.security.KeyPairGenerator r0 = java.security.KeyPairGenerator.getInstance(r0, r2)     // Catch:{ CertificateException -> 0x00d0, KeyStoreException -> 0x00ce, IOException -> 0x00cc, NoSuchProviderException -> 0x00ca, InvalidAlgorithmParameterException -> 0x00c8, UnrecoverableEntryException -> 0x00c6, NoSuchAlgorithmException -> 0x00c4, ProviderException -> 0x00c2, NullPointerException -> 0x00d2 }
            r0.initialize(r1)     // Catch:{ CertificateException -> 0x00d0, KeyStoreException -> 0x00ce, IOException -> 0x00cc, NoSuchProviderException -> 0x00ca, InvalidAlgorithmParameterException -> 0x00c8, UnrecoverableEntryException -> 0x00c6, NoSuchAlgorithmException -> 0x00c4, ProviderException -> 0x00c2, NullPointerException -> 0x00d2 }
            r0.generateKeyPair()     // Catch:{ CertificateException -> 0x00d0, KeyStoreException -> 0x00ce, IOException -> 0x00cc, NoSuchProviderException -> 0x00ca, InvalidAlgorithmParameterException -> 0x00c8, UnrecoverableEntryException -> 0x00c6, NoSuchAlgorithmException -> 0x00c4, ProviderException -> 0x00c2, NullPointerException -> 0x00d2 }
            java.security.KeyStore$Entry r2 = r4.getEntry(r5, r3)     // Catch:{ NullPointerException -> 0x00ba }
            boolean r0 = r2 instanceof java.security.KeyStore.PrivateKeyEntry     // Catch:{ NullPointerException -> 0x00ba }
            if (r0 == 0) goto L_0x00b4
            java.security.KeyStore$PrivateKeyEntry r2 = (java.security.KeyStore.PrivateKeyEntry) r2     // Catch:{ NullPointerException -> 0x00ba }
            goto L_0x00d9
        L_0x00b4:
            if (r2 == 0) goto L_0x00c0
            r4.deleteEntry(r5)     // Catch:{ NullPointerException -> 0x00ba }
            goto L_0x00c0
        L_0x00ba:
            r1 = move-exception
            java.lang.String r0 = "AsymmetricTransformer"
            X.C10450iM.A07(r0, r1)     // Catch:{ CertificateException -> 0x00d0, KeyStoreException -> 0x00ce, IOException -> 0x00cc, NoSuchProviderException -> 0x00ca, InvalidAlgorithmParameterException -> 0x00c8, UnrecoverableEntryException -> 0x00c6, NoSuchAlgorithmException -> 0x00c4, ProviderException -> 0x00c2, NullPointerException -> 0x00d2 }
        L_0x00c0:
            r2 = r3
            goto L_0x00d9
        L_0x00c2:
            r1 = move-exception
            goto L_0x00d3
        L_0x00c4:
            r1 = move-exception
            goto L_0x00d3
        L_0x00c6:
            r1 = move-exception
            goto L_0x00d3
        L_0x00c8:
            r1 = move-exception
            goto L_0x00d3
        L_0x00ca:
            r1 = move-exception
            goto L_0x00d3
        L_0x00cc:
            r1 = move-exception
            goto L_0x00d3
        L_0x00ce:
            r1 = move-exception
            goto L_0x00d3
        L_0x00d0:
            r1 = move-exception
            goto L_0x00d3
        L_0x00d2:
            r1 = move-exception
        L_0x00d3:
            java.lang.String r0 = "AsymmetricTransformer"
            X.C10450iM.A07(r0, r1)
            r2 = r3
        L_0x00d9:
            r5 = 0
            java.lang.String r0 = "RSA/ECB/PKCS1Padding"
            javax.crypto.Cipher r3 = javax.crypto.Cipher.getInstance(r0)     // Catch:{ NoSuchAlgorithmException | NoSuchPaddingException -> 0x00e1 }
            goto L_0x00e7
        L_0x00e1:
            r1 = move-exception
            java.lang.String r0 = "AsymmetricTransformer"
            X.C10450iM.A07(r0, r1)
        L_0x00e7:
            if (r2 == 0) goto L_0x0012
            if (r3 == 0) goto L_0x0012
            X.61o r5 = new X.61o
            r5.<init>(r9, r11, r2)
            return r5
        L_0x00f1:
            java.lang.String r1 = "Unknown transformer type "
            java.lang.String r0 = X.C101616Ry.A00(r10)
            java.lang.String r0 = X.AnonymousClass00U.A0L(r1, r0)
            java.lang.RuntimeException r0 = X.C18250wR.A0V(r0)
            throw r0
        L_0x0100:
            java.lang.Class<X.61p> r4 = X.C956461p.class
            monitor-enter(r4)
            java.lang.String r0 = "_single"
            java.lang.String r3 = X.AnonymousClass00U.A0L(r11, r0)     // Catch:{ all -> 0x0140 }
            r2 = 0
            java.lang.String r0 = "AndroidKeyStore"
            java.security.KeyStore r1 = java.security.KeyStore.getInstance(r0)     // Catch:{ ParcelFormatException | IOException | NullPointerException | KeyStoreException | NoSuchAlgorithmException | UnrecoverableEntryException | CertificateException -> 0x012a }
            r1.load(r2, r2)     // Catch:{ ParcelFormatException | IOException | NullPointerException | KeyStoreException | NoSuchAlgorithmException | UnrecoverableEntryException | CertificateException -> 0x012a }
            boolean r0 = r1.containsAlias(r3)     // Catch:{ ParcelFormatException | IOException | NullPointerException | KeyStoreException | NoSuchAlgorithmException | UnrecoverableEntryException | CertificateException -> 0x012a }
            if (r0 == 0) goto L_0x0130
            java.security.KeyStore$Entry r1 = r1.getEntry(r3, r2)     // Catch:{ ParcelFormatException | IOException | NullPointerException | KeyStoreException | NoSuchAlgorithmException | UnrecoverableEntryException | CertificateException -> 0x012a }
            boolean r0 = r1 instanceof java.security.KeyStore.SecretKeyEntry     // Catch:{ ParcelFormatException | IOException | NullPointerException | KeyStoreException | NoSuchAlgorithmException | UnrecoverableEntryException | CertificateException -> 0x012a }
            if (r0 == 0) goto L_0x0130
            java.security.KeyStore$SecretKeyEntry r1 = (java.security.KeyStore.SecretKeyEntry) r1     // Catch:{ ParcelFormatException | IOException | NullPointerException | KeyStoreException | NoSuchAlgorithmException | UnrecoverableEntryException | CertificateException -> 0x012a }
            javax.crypto.SecretKey r0 = r1.getSecretKey()     // Catch:{ ParcelFormatException | IOException | NullPointerException | KeyStoreException | NoSuchAlgorithmException | UnrecoverableEntryException | CertificateException -> 0x012a }
            if (r0 != 0) goto L_0x0137
            goto L_0x0130
        L_0x012a:
            r1 = move-exception
            java.lang.String r0 = "SymmetricTransformer"
            X.C10450iM.A07(r0, r1)     // Catch:{ all -> 0x0140 }
        L_0x0130:
            javax.crypto.SecretKey r0 = X.C956461p.A00(r11)     // Catch:{ all -> 0x0140 }
            if (r0 != 0) goto L_0x0137
            goto L_0x013d
        L_0x0137:
            X.61p r5 = new X.61p     // Catch:{ all -> 0x0140 }
            r5.<init>(r9, r11, r0)     // Catch:{ all -> 0x0140 }
            goto L_0x013e
        L_0x013d:
            r5 = 0
        L_0x013e:
            monitor-exit(r4)
            return r5
        L_0x0140:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7Cx.A00(android.content.Context, java.lang.Integer, java.lang.String):X.8lq");
    }
}
