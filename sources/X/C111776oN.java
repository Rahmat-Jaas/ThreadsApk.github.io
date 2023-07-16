package X;

import java.io.IOException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;

/* renamed from: X.6oN  reason: invalid class name and case insensitive filesystem */
public final class C111776oN {
    public final KeyStore A00;

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x007e, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0086, code lost:
        throw new X.AnonymousClass6CP("Unable to generate attested key", r2);
     */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x007e A[ExcHandler: NullPointerException | InvalidAlgorithmParameterException | NoSuchAlgorithmException | NoSuchProviderException (r2v0 'e' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:1:0x0002] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(X.C973268x r7, byte[] r8, boolean r9) {
        /*
            r6 = this;
            java.lang.String r5 = "w6CmevIyM/PL6Q5uUDw="
            java.util.Date r4 = new java.util.Date     // Catch:{ NullPointerException | InvalidAlgorithmParameterException | NoSuchAlgorithmException | NoSuchProviderException -> 0x007e }
            r4.<init>()     // Catch:{ NullPointerException | InvalidAlgorithmParameterException | NoSuchAlgorithmException | NoSuchProviderException -> 0x007e }
            java.util.Calendar r1 = java.util.Calendar.getInstance()     // Catch:{ NullPointerException | InvalidAlgorithmParameterException | NoSuchAlgorithmException | NoSuchProviderException -> 0x007e }
            r1.setTime(r4)     // Catch:{ NullPointerException | InvalidAlgorithmParameterException | NoSuchAlgorithmException | NoSuchProviderException -> 0x007e }
            r3 = 1
            r0 = 10
            r1.add(r3, r0)     // Catch:{ NullPointerException | InvalidAlgorithmParameterException | NoSuchAlgorithmException | NoSuchProviderException -> 0x007e }
            java.util.Date r2 = r1.getTime()     // Catch:{ NullPointerException | InvalidAlgorithmParameterException | NoSuchAlgorithmException | NoSuchProviderException -> 0x007e }
            r0 = 12
            android.security.keystore.KeyGenParameterSpec$Builder r1 = new android.security.keystore.KeyGenParameterSpec$Builder     // Catch:{ NullPointerException | InvalidAlgorithmParameterException | NoSuchAlgorithmException | NoSuchProviderException -> 0x007e }
            r1.<init>(r5, r0)     // Catch:{ NullPointerException | InvalidAlgorithmParameterException | NoSuchAlgorithmException | NoSuchProviderException -> 0x007e }
            java.lang.String[] r0 = r7.A01     // Catch:{ NullPointerException | InvalidAlgorithmParameterException | NoSuchAlgorithmException | NoSuchProviderException -> 0x007e }
            android.security.keystore.KeyGenParameterSpec$Builder r0 = r1.setDigests(r0)     // Catch:{ NullPointerException | InvalidAlgorithmParameterException | NoSuchAlgorithmException | NoSuchProviderException -> 0x007e }
            android.security.keystore.KeyGenParameterSpec$Builder r0 = r0.setAttestationChallenge(r8)     // Catch:{ NullPointerException | InvalidAlgorithmParameterException | NoSuchAlgorithmException | NoSuchProviderException -> 0x007e }
            android.security.keystore.KeyGenParameterSpec$Builder r0 = r0.setCertificateNotBefore(r4)     // Catch:{ NullPointerException | InvalidAlgorithmParameterException | NoSuchAlgorithmException | NoSuchProviderException -> 0x007e }
            android.security.keystore.KeyGenParameterSpec$Builder r4 = r0.setCertificateNotAfter(r2)     // Catch:{ NullPointerException | InvalidAlgorithmParameterException | NoSuchAlgorithmException | NoSuchProviderException -> 0x007e }
            java.lang.String r2 = "EC"
            java.lang.String r0 = "AndroidKeyStore"
            java.security.KeyPairGenerator r1 = java.security.KeyPairGenerator.getInstance(r2, r0)     // Catch:{ NullPointerException | InvalidAlgorithmParameterException | NoSuchAlgorithmException | NoSuchProviderException -> 0x007e }
            r4.setIsStrongBoxBacked(r9)     // Catch:{ NullPointerException | InvalidAlgorithmParameterException | NoSuchAlgorithmException | NoSuchProviderException -> 0x007e }
            android.security.keystore.KeyGenParameterSpec r0 = r4.build()     // Catch:{ NullPointerException | InvalidAlgorithmParameterException | NoSuchAlgorithmException | NoSuchProviderException -> 0x007e }
            r1.initialize(r0)     // Catch:{ NullPointerException | InvalidAlgorithmParameterException | NoSuchAlgorithmException | NoSuchProviderException -> 0x007e }
            java.security.KeyPair r0 = r1.generateKeyPair()     // Catch:{ NullPointerException | InvalidAlgorithmParameterException | NoSuchAlgorithmException | NoSuchProviderException -> 0x007e }
            java.security.KeyFactory r2 = java.security.KeyFactory.getInstance(r2)     // Catch:{ NoSuchAlgorithmException | InvalidKeySpecException -> 0x0077, NullPointerException | InvalidAlgorithmParameterException | NoSuchAlgorithmException | NoSuchProviderException -> 0x007e, NullPointerException | InvalidAlgorithmParameterException | NoSuchAlgorithmException | NoSuchProviderException -> 0x007e, NullPointerException | InvalidAlgorithmParameterException | NoSuchAlgorithmException | NoSuchProviderException -> 0x007e }
            java.security.PrivateKey r1 = r0.getPrivate()     // Catch:{ NoSuchAlgorithmException | InvalidKeySpecException -> 0x0077, NullPointerException | InvalidAlgorithmParameterException | NoSuchAlgorithmException | NoSuchProviderException -> 0x007e, NullPointerException | InvalidAlgorithmParameterException | NoSuchAlgorithmException | NoSuchProviderException -> 0x007e, NullPointerException | InvalidAlgorithmParameterException | NoSuchAlgorithmException | NoSuchProviderException -> 0x007e }
            java.lang.Class<android.security.keystore.KeyInfo> r0 = android.security.keystore.KeyInfo.class
            java.security.spec.KeySpec r2 = r2.getKeySpec(r1, r0)     // Catch:{ NoSuchAlgorithmException | InvalidKeySpecException -> 0x0077, NullPointerException | InvalidAlgorithmParameterException | NoSuchAlgorithmException | NoSuchProviderException -> 0x007e, NullPointerException | InvalidAlgorithmParameterException | NoSuchAlgorithmException | NoSuchProviderException -> 0x007e, NullPointerException | InvalidAlgorithmParameterException | NoSuchAlgorithmException | NoSuchProviderException -> 0x007e }
            android.security.keystore.KeyInfo r2 = (android.security.keystore.KeyInfo) r2     // Catch:{ NoSuchAlgorithmException | InvalidKeySpecException -> 0x0077, NullPointerException | InvalidAlgorithmParameterException | NoSuchAlgorithmException | NoSuchProviderException -> 0x007e, NullPointerException | InvalidAlgorithmParameterException | NoSuchAlgorithmException | NoSuchProviderException -> 0x007e, NullPointerException | InvalidAlgorithmParameterException | NoSuchAlgorithmException | NoSuchProviderException -> 0x007e }
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ NoSuchAlgorithmException | InvalidKeySpecException -> 0x0077, NullPointerException | InvalidAlgorithmParameterException | NoSuchAlgorithmException | NoSuchProviderException -> 0x007e, NullPointerException | InvalidAlgorithmParameterException | NoSuchAlgorithmException | NoSuchProviderException -> 0x007e, NullPointerException | InvalidAlgorithmParameterException | NoSuchAlgorithmException | NoSuchProviderException -> 0x007e }
            r0 = 31
            if (r1 < r0) goto L_0x006a
            int r1 = r2.getSecurityLevel()     // Catch:{ NoSuchAlgorithmException | InvalidKeySpecException -> 0x0077, NullPointerException | InvalidAlgorithmParameterException | NoSuchAlgorithmException | NoSuchProviderException -> 0x007e, NullPointerException | InvalidAlgorithmParameterException | NoSuchAlgorithmException | NoSuchProviderException -> 0x007e, NullPointerException | InvalidAlgorithmParameterException | NoSuchAlgorithmException | NoSuchProviderException -> 0x007e }
            r0 = -1
            if (r1 == r0) goto L_0x0069
            if (r1 == r3) goto L_0x0069
            r0 = 2
            if (r1 != r0) goto L_0x0071
        L_0x0069:
            return
        L_0x006a:
            boolean r0 = r2.isInsideSecureHardware()     // Catch:{ NoSuchAlgorithmException | InvalidKeySpecException -> 0x0077, NullPointerException | InvalidAlgorithmParameterException | NoSuchAlgorithmException | NoSuchProviderException -> 0x007e, NullPointerException | InvalidAlgorithmParameterException | NoSuchAlgorithmException | NoSuchProviderException -> 0x007e, NullPointerException | InvalidAlgorithmParameterException | NoSuchAlgorithmException | NoSuchProviderException -> 0x007e }
            if (r0 == 0) goto L_0x0071
            return
        L_0x0071:
            X.5fm r0 = new X.5fm     // Catch:{ NoSuchAlgorithmException | InvalidKeySpecException -> 0x0077, NullPointerException | InvalidAlgorithmParameterException | NoSuchAlgorithmException | NoSuchProviderException -> 0x007e, NullPointerException | InvalidAlgorithmParameterException | NoSuchAlgorithmException | NoSuchProviderException -> 0x007e, NullPointerException | InvalidAlgorithmParameterException | NoSuchAlgorithmException | NoSuchProviderException -> 0x007e }
            r0.<init>()     // Catch:{ NoSuchAlgorithmException | InvalidKeySpecException -> 0x0077, NullPointerException | InvalidAlgorithmParameterException | NoSuchAlgorithmException | NoSuchProviderException -> 0x007e, NullPointerException | InvalidAlgorithmParameterException | NoSuchAlgorithmException | NoSuchProviderException -> 0x007e, NullPointerException | InvalidAlgorithmParameterException | NoSuchAlgorithmException | NoSuchProviderException -> 0x007e }
            throw r0     // Catch:{ NoSuchAlgorithmException | InvalidKeySpecException -> 0x0077, NullPointerException | InvalidAlgorithmParameterException | NoSuchAlgorithmException | NoSuchProviderException -> 0x007e, NullPointerException | InvalidAlgorithmParameterException | NoSuchAlgorithmException | NoSuchProviderException -> 0x007e, NullPointerException | InvalidAlgorithmParameterException | NoSuchAlgorithmException | NoSuchProviderException -> 0x007e }
        L_0x0077:
            r1 = move-exception
            X.5fm r0 = new X.5fm     // Catch:{ NullPointerException | InvalidAlgorithmParameterException | NoSuchAlgorithmException | NoSuchProviderException -> 0x007e }
            r0.<init>(r1)     // Catch:{ NullPointerException | InvalidAlgorithmParameterException | NoSuchAlgorithmException | NoSuchProviderException -> 0x007e }
            throw r0     // Catch:{ NullPointerException | InvalidAlgorithmParameterException | NoSuchAlgorithmException | NoSuchProviderException -> 0x007e }
        L_0x007e:
            r2 = move-exception
            java.lang.String r1 = "Unable to generate attested key"
            X.6CP r0 = new X.6CP
            r0.<init>(r1, r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C111776oN.A00(X.68x, byte[], boolean):void");
    }

    public C111776oN() {
        try {
            KeyStore instance = KeyStore.getInstance("AndroidKeyStore");
            this.A00 = instance;
            instance.load((KeyStore.LoadStoreParameter) null);
        } catch (IOException | KeyStoreException | NoSuchAlgorithmException | CertificateException e) {
            throw new AnonymousClass6CP("Unable to create or load AndroidKeyStore", e);
        }
    }
}
