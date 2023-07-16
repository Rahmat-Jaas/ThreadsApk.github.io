package com.facebook.msys.mci;

import X.C002801h;
import X.C1191973x;
import X.C18200wM;
import X.C86154wM;
import X.C86164wN;
import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

public class DefaultCrypto implements Crypto {
    public static final Crypto A00 = new DefaultCrypto();

    public byte[] computeMd5(byte[] bArr) {
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            instance.update(bArr);
            byte[] digest = instance.digest();
            StringBuilder A0r = C18200wM.A0r();
            for (byte valueOf : digest) {
                A0r.append(C86164wN.A0i(Byte.valueOf(valueOf), "%02x"));
            }
            return A0r.toString().getBytes();
        } catch (NoSuchAlgorithmException e) {
            throw C86154wM.A0h("MD5 algorithm was not found. Should not happen", e);
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:42:0x00bb */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String computeSHA256(java.lang.String r19, java.lang.String r20) {
        /*
            r18 = this;
            java.lang.String r2 = "HmacSHA256"
            r4 = r19
            android.net.Uri r3 = X.C15430rJ.A01(r4)     // Catch:{ FileNotFoundException | IllegalArgumentException | SecurityException -> 0x011d }
            java.lang.String r1 = r3.getScheme()     // Catch:{ FileNotFoundException | IllegalArgumentException | SecurityException -> 0x011d }
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ FileNotFoundException | IllegalArgumentException | SecurityException -> 0x011d }
            if (r0 != 0) goto L_0x0107
            java.lang.String r0 = "file"
            boolean r0 = r1.equalsIgnoreCase(r0)     // Catch:{ FileNotFoundException | IllegalArgumentException | SecurityException -> 0x011d }
            if (r0 == 0) goto L_0x00fc
            java.lang.String r1 = r3.getPath()     // Catch:{ FileNotFoundException | IllegalArgumentException | SecurityException -> 0x011d }
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ FileNotFoundException | IllegalArgumentException | SecurityException -> 0x011d }
            if (r0 != 0) goto L_0x0112
            java.io.File r1 = X.C86144wL.A0Z(r1)     // Catch:{ FileNotFoundException | IllegalArgumentException | SecurityException -> 0x011d }
            boolean r0 = r1.exists()     // Catch:{ FileNotFoundException | IllegalArgumentException | SecurityException -> 0x011d }
            if (r0 == 0) goto L_0x00f0
            java.lang.String r0 = r1.getPath()     // Catch:{ FileNotFoundException | IllegalArgumentException | SecurityException -> 0x011d }
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch:{ NoSuchAlgorithmException -> 0x00e8, UnsupportedEncodingException -> 0x00e0, InvalidKeyException -> 0x00d8, IOException -> 0x00d0, IllegalStateException -> 0x00c8, IllegalArgumentException -> 0x0125, Exception -> 0x00bc }
            r4.<init>(r0)     // Catch:{ NoSuchAlgorithmException -> 0x00e8, UnsupportedEncodingException -> 0x00e0, InvalidKeyException -> 0x00d8, IOException -> 0x00d0, IllegalStateException -> 0x00c8, IllegalArgumentException -> 0x0125, Exception -> 0x00bc }
            java.io.File r0 = X.C86144wL.A0Z(r0)     // Catch:{ all -> 0x00b7 }
            r9 = 8192(0x2000, float:1.14794E-41)
            byte[] r8 = new byte[r9]     // Catch:{ all -> 0x00b7 }
            long r16 = r0.length()     // Catch:{ all -> 0x00b7 }
            javax.crypto.Mac r7 = javax.crypto.Mac.getInstance(r2)     // Catch:{ all -> 0x00b7 }
            byte[] r1 = r20.getBytes()     // Catch:{ all -> 0x00b7 }
            javax.crypto.spec.SecretKeySpec r0 = new javax.crypto.spec.SecretKeySpec     // Catch:{ all -> 0x00b7 }
            r0.<init>(r1, r2)     // Catch:{ all -> 0x00b7 }
            r7.init(r0)     // Catch:{ all -> 0x00b7 }
            r14 = 0
            r2 = r16
            r12 = 0
            r11 = 1
        L_0x005a:
            r10 = 0
            int r0 = (r2 > r14 ? 1 : (r2 == r14 ? 0 : -1))
            if (r0 <= 0) goto L_0x0081
            int r6 = r4.read(r8)     // Catch:{ all -> 0x00b7 }
            r0 = -1
            if (r6 == r0) goto L_0x0081
            r1 = 0
        L_0x0067:
            if (r11 == 0) goto L_0x0074
            if (r1 >= r9) goto L_0x0074
            byte r0 = r8[r1]     // Catch:{ all -> 0x00b7 }
            boolean r11 = X.C18180wK.A1W(r0)
            int r1 = r1 + 1
            goto L_0x0067
        L_0x0074:
            int r0 = (int) r2     // Catch:{ all -> 0x00b7 }
            int r5 = java.lang.Math.min(r0, r6)     // Catch:{ all -> 0x00b7 }
            r7.update(r8, r10, r5)     // Catch:{ all -> 0x00b7 }
            long r0 = (long) r6     // Catch:{ all -> 0x00b7 }
            long r12 = r12 + r0
            long r0 = (long) r5     // Catch:{ all -> 0x00b7 }
            long r2 = r2 - r0
            goto L_0x005a
        L_0x0081:
            if (r11 != 0) goto L_0x009d
            int r0 = (r12 > r16 ? 1 : (r12 == r16 ? 0 : -1))
            if (r0 != 0) goto L_0x009d
            int r0 = (r2 > r14 ? 1 : (r2 == r14 ? 0 : -1))
            if (r0 != 0) goto L_0x009d
            byte[] r0 = r7.doFinal()     // Catch:{ all -> 0x00b7 }
            java.lang.String r1 = X.C1191973x.A00(r0)     // Catch:{ all -> 0x00b7 }
            java.util.Locale r0 = java.util.Locale.US     // Catch:{ all -> 0x00b7 }
            java.lang.String r0 = r1.toLowerCase(r0)     // Catch:{ all -> 0x00b7 }
            r4.close()     // Catch:{ NoSuchAlgorithmException -> 0x00e8, UnsupportedEncodingException -> 0x00e0, InvalidKeyException -> 0x00d8, IOException -> 0x00d0, IllegalStateException -> 0x00c8, IllegalArgumentException -> 0x0125, Exception -> 0x00bc }
            return r0
        L_0x009d:
            java.lang.Class<com.facebook.msys.mci.DefaultCrypto> r3 = com.facebook.msys.mci.DefaultCrypto.class
            java.lang.String r2 = "Read bytes failed.TotalBytesRead: %d, FileSize: %d"
            java.lang.Long r1 = java.lang.Long.valueOf(r12)     // Catch:{ all -> 0x00b7 }
            java.lang.Long r0 = java.lang.Long.valueOf(r16)     // Catch:{ all -> 0x00b7 }
            java.lang.Object[] r0 = new java.lang.Object[]{r1, r0}     // Catch:{ all -> 0x00b7 }
            X.AnonymousClass0LU.A09(r3, r2, r0)     // Catch:{ all -> 0x00b7 }
            java.lang.String r0 = "Unable to read all bytes from file"
            java.lang.RuntimeException r0 = X.C18250wR.A0V(r0)     // Catch:{ all -> 0x00b7 }
            throw r0     // Catch:{ all -> 0x00b7 }
        L_0x00b7:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x00bb }
        L_0x00bb:
            throw r0     // Catch:{ NoSuchAlgorithmException -> 0x00e8, UnsupportedEncodingException -> 0x00e0, InvalidKeyException -> 0x00d8, IOException -> 0x00d0, IllegalStateException -> 0x00c8, IllegalArgumentException -> 0x0125, Exception -> 0x00bc }
        L_0x00bc:
            r1 = move-exception
            r0 = 462(0x1ce, float:6.47E-43)
            java.lang.String r0 = X.I17.A00(r0)     // Catch:{ RuntimeException -> 0x012d }
            java.lang.RuntimeException r0 = X.C86154wM.A0h(r0, r1)     // Catch:{ RuntimeException -> 0x012d }
            goto L_0x012c
        L_0x00c8:
            r1 = move-exception
            java.lang.String r0 = "Couldn't update the hash."
            java.lang.RuntimeException r0 = X.C86154wM.A0h(r0, r1)     // Catch:{ RuntimeException -> 0x012d }
            goto L_0x012c
        L_0x00d0:
            r1 = move-exception
            java.lang.String r0 = "Couldn't read the content."
            java.lang.RuntimeException r0 = X.C86154wM.A0h(r0, r1)     // Catch:{ RuntimeException -> 0x012d }
            goto L_0x012c
        L_0x00d8:
            r1 = move-exception
            java.lang.String r0 = "Invalid secret key."
            java.lang.RuntimeException r0 = X.C86154wM.A0h(r0, r1)     // Catch:{ RuntimeException -> 0x012d }
            goto L_0x012c
        L_0x00e0:
            r1 = move-exception
            java.lang.String r0 = "UTF_8 encoding is not supported."
            java.lang.RuntimeException r0 = X.C86154wM.A0h(r0, r1)     // Catch:{ RuntimeException -> 0x012d }
            goto L_0x012c
        L_0x00e8:
            r1 = move-exception
            java.lang.String r0 = "HMAC SHA256 algorithm is not found."
            java.lang.RuntimeException r0 = X.C86154wM.A0h(r0, r1)     // Catch:{ RuntimeException -> 0x012d }
            goto L_0x012c
        L_0x00f0:
            java.lang.String r0 = "File does not exist. Url: "
            java.lang.String r0 = X.AnonymousClass00U.A0L(r0, r4)     // Catch:{ FileNotFoundException | IllegalArgumentException | SecurityException -> 0x011d }
            java.io.FileNotFoundException r1 = new java.io.FileNotFoundException     // Catch:{ FileNotFoundException | IllegalArgumentException | SecurityException -> 0x011d }
            r1.<init>(r0)     // Catch:{ FileNotFoundException | IllegalArgumentException | SecurityException -> 0x011d }
            goto L_0x011c
        L_0x00fc:
            java.lang.String r0 = "Url MUST be of 'file:' scheme. Found: "
            java.lang.String r0 = X.AnonymousClass00U.A0L(r0, r1)     // Catch:{ FileNotFoundException | IllegalArgumentException | SecurityException -> 0x011d }
            java.lang.IllegalArgumentException r1 = X.C18190wL.A0a(r0)     // Catch:{ FileNotFoundException | IllegalArgumentException | SecurityException -> 0x011d }
            goto L_0x011c
        L_0x0107:
            java.lang.String r0 = "Invalid fileUrlString: "
            java.lang.String r0 = X.AnonymousClass00U.A0L(r0, r4)     // Catch:{ FileNotFoundException | IllegalArgumentException | SecurityException -> 0x011d }
            java.lang.IllegalArgumentException r1 = X.C18190wL.A0a(r0)     // Catch:{ FileNotFoundException | IllegalArgumentException | SecurityException -> 0x011d }
            goto L_0x011c
        L_0x0112:
            java.lang.String r0 = "Invalid input file Url: "
            java.lang.String r0 = X.AnonymousClass00U.A0L(r0, r4)     // Catch:{ FileNotFoundException | IllegalArgumentException | SecurityException -> 0x011d }
            java.lang.IllegalArgumentException r1 = X.C18190wL.A0a(r0)     // Catch:{ FileNotFoundException | IllegalArgumentException | SecurityException -> 0x011d }
        L_0x011c:
            throw r1     // Catch:{ FileNotFoundException | IllegalArgumentException | SecurityException -> 0x011d }
        L_0x011d:
            r1 = move-exception
            java.lang.String r0 = "Exception while parsing fileUrl"
            java.lang.RuntimeException r0 = X.C86154wM.A0h(r0, r1)     // Catch:{ RuntimeException -> 0x012d }
            goto L_0x012c
        L_0x0125:
            r1 = move-exception
            java.lang.String r0 = "Invalid arguments"
            java.lang.RuntimeException r0 = X.C86154wM.A0h(r0, r1)     // Catch:{ RuntimeException -> 0x012d }
        L_0x012c:
            throw r0     // Catch:{ RuntimeException -> 0x012d }
        L_0x012d:
            r2 = move-exception
            java.lang.Class<com.facebook.msys.mci.DefaultCrypto> r1 = com.facebook.msys.mci.DefaultCrypto.class
            java.lang.String r0 = "computeSHA256 with fileUrl: exception occurred"
            X.AnonymousClass0LU.A03(r1, r0, r2)
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.msys.mci.DefaultCrypto.computeSHA256(java.lang.String, java.lang.String):java.lang.String");
    }

    public final String computeSHA256(byte[] bArr, String str) {
        C002801h.A02(bArr, "file bytes can not be null");
        try {
            Mac instance = Mac.getInstance("HmacSHA256");
            instance.init(new SecretKeySpec(str.getBytes("UTF-8"), "HmacSHA256"));
            return C1191973x.A00(instance.doFinal(bArr)).toLowerCase(Locale.US);
        } catch (NoSuchAlgorithmException e) {
            throw C86154wM.A0h("HMAC SHA256 algorithm is not found.", e);
        } catch (UnsupportedEncodingException e2) {
            throw C86154wM.A0h("UTF_8 encoding is not supported.", e2);
        } catch (InvalidKeyException e3) {
            throw C86154wM.A0h("Invalid secret key.", e3);
        }
    }
}
