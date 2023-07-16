package X;

/* renamed from: X.6Hp  reason: invalid class name and case insensitive filesystem */
public final class C98966Hp {
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00fc, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00fd, code lost:
        r15.logError("Error in encrypting results", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000d, code lost:
        if (r5.length() == 0) goto L_0x000f;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00fc A[ExcHandler: InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException (r0v0 'e' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:2:0x0008] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String A00(com.facebook.smartcapture.logging.IdCaptureLogger r15, java.lang.String r16, java.security.PublicKey r17) {
        /*
            java.lang.String r2 = "Error in encrypting results"
            r14 = 0
            r3 = 1
            r5 = r16
            if (r16 == 0) goto L_0x000f
            int r1 = r5.length()     // Catch:{ InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x00fc }
            r0 = 0
            if (r1 != 0) goto L_0x0010
        L_0x000f:
            r0 = 1
        L_0x0010:
            if (r0 != 0) goto L_0x0100
            r1 = r17
            if (r17 == 0) goto L_0x0100
            java.lang.String r0 = "RSA/ECB/PKCS1Padding"
            javax.crypto.Cipher r4 = javax.crypto.Cipher.getInstance(r0)     // Catch:{ InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x00fc }
            r4.init(r3, r1)     // Catch:{ InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x00fc }
            if (r16 == 0) goto L_0x00ee
            java.nio.charset.Charset r0 = X.AnonymousClass6ZG.A00     // Catch:{ InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x00fc }
            byte[] r1 = r5.getBytes(r0)     // Catch:{ InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x00fc }
            X.7yV r0 = new X.7yV     // Catch:{ InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x00fc }
            r0.<init>(r1)     // Catch:{ InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x00fc }
            r0.A01 = r5     // Catch:{ InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x00fc }
            byte[] r0 = r0.A01()     // Catch:{ InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x00fc }
            byte[] r1 = r4.doFinal(r0)     // Catch:{ InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x00fc }
            int r0 = r1.length     // Catch:{ InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x00fc }
            byte[] r0 = java.util.Arrays.copyOf(r1, r0)     // Catch:{ InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x00fc }
            X.7yV r0 = X.C134867yV.A00(r0)     // Catch:{ InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x00fc }
            byte[] r5 = r0.data     // Catch:{ InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x00fc }
            byte[] r13 = X.AnonymousClass6ZF.A00     // Catch:{ InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x00fc }
            int r8 = r5.length     // Catch:{ InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x00fc }
            r6 = 2
            int r0 = r8 + 2
            int r0 = r0 / 3
            int r0 = r0 << 2
            byte[] r4 = new byte[r0]     // Catch:{ InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x00fc }
            int r1 = r8 % 3
            int r8 = r8 - r1
            r7 = 0
            r12 = 0
        L_0x0052:
            if (r7 >= r8) goto L_0x0095
            int r11 = r12 + 1
            byte r0 = r5[r7]     // Catch:{ InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x00fc }
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r0 >> r6
            byte r0 = r13[r0]     // Catch:{ InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x00fc }
            r4[r12] = r0     // Catch:{ InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x00fc }
            int r12 = r11 + 1
            byte r0 = r5[r7]     // Catch:{ InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x00fc }
            r0 = r0 & 3
            int r10 = r0 << 4
            int r9 = r7 + 1
            byte r0 = r5[r9]     // Catch:{ InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x00fc }
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r0 >> 4
            r10 = r10 | r0
            byte r0 = r13[r10]     // Catch:{ InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x00fc }
            r4[r11] = r0     // Catch:{ InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x00fc }
            int r11 = r12 + 1
            byte r0 = r5[r9]     // Catch:{ InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x00fc }
            r10 = r0 & 15
            int r10 = r10 << r6
            int r9 = r7 + 2
            byte r0 = r5[r9]     // Catch:{ InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x00fc }
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r0 >> 6
            r10 = r10 | r0
            byte r0 = r13[r10]     // Catch:{ InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x00fc }
            r4[r12] = r0     // Catch:{ InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x00fc }
            int r12 = r11 + 1
            byte r0 = r5[r9]     // Catch:{ InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x00fc }
            r0 = r0 & 63
            byte r0 = r13[r0]     // Catch:{ InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x00fc }
            r4[r11] = r0     // Catch:{ InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x00fc }
            int r7 = r7 + 3
            goto L_0x0052
        L_0x0095:
            r10 = 61
            if (r1 == r3) goto L_0x009c
            if (r1 != r6) goto L_0x00e6
            goto L_0x00b9
        L_0x009c:
            int r3 = r12 + 1
            byte r0 = r5[r8]     // Catch:{ InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x00fc }
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r0 >> 2
            byte r0 = r13[r0]     // Catch:{ InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x00fc }
            r4[r12] = r0     // Catch:{ InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x00fc }
            int r1 = r3 + 1
            byte r0 = r5[r8]     // Catch:{ InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x00fc }
            r0 = r0 & 3
            int r0 = r0 << 4
            byte r0 = r13[r0]     // Catch:{ InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x00fc }
            r4[r3] = r0     // Catch:{ InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x00fc }
            int r3 = r1 + 1
            r4[r1] = r10     // Catch:{ InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x00fc }
            goto L_0x00e4
        L_0x00b9:
            int r9 = r12 + 1
            byte r0 = r5[r8]     // Catch:{ InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x00fc }
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r0 >> r6
            byte r0 = r13[r0]     // Catch:{ InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x00fc }
            r4[r12] = r0     // Catch:{ InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x00fc }
            int r7 = r9 + 1
            byte r0 = r5[r8]     // Catch:{ InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x00fc }
            r0 = r0 & 3
            int r3 = r0 << 4
            int r1 = r8 + 1
            byte r0 = r5[r1]     // Catch:{ InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x00fc }
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r0 >> 4
            r0 = r0 | r3
            byte r0 = r13[r0]     // Catch:{ InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x00fc }
            r4[r9] = r0     // Catch:{ InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x00fc }
            int r3 = r7 + 1
            byte r0 = r5[r1]     // Catch:{ InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x00fc }
            r0 = r0 & 15
            int r0 = r0 << r6
            byte r0 = r13[r0]     // Catch:{ InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x00fc }
            r4[r7] = r0     // Catch:{ InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x00fc }
        L_0x00e4:
            r4[r3] = r10     // Catch:{ InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x00fc }
        L_0x00e6:
            java.lang.String r1 = "US-ASCII"
            java.lang.String r0 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x00f5, InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x00fc, InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x00fc, InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x00fc, InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x00fc }
            r0.<init>(r4, r1)     // Catch:{ UnsupportedEncodingException -> 0x00f5, InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x00fc, InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x00fc, InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x00fc, InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x00fc }
            return r0
        L_0x00ee:
            java.lang.String r0 = "s == null"
            java.lang.IllegalArgumentException r0 = X.C18190wL.A0a(r0)     // Catch:{ InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x00fc }
            goto L_0x00fb
        L_0x00f5:
            r1 = move-exception
            java.lang.AssertionError r0 = new java.lang.AssertionError     // Catch:{ InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x00fc }
            r0.<init>(r1)     // Catch:{ InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x00fc }
        L_0x00fb:
            throw r0     // Catch:{ InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x00fc }
        L_0x00fc:
            r0 = move-exception
            r15.logError(r2, r0)
        L_0x0100:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C98966Hp.A00(com.facebook.smartcapture.logging.IdCaptureLogger, java.lang.String, java.security.PublicKey):java.lang.String");
    }
}
