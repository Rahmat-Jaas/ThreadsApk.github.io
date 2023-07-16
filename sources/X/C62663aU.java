package X;

/* renamed from: X.3aU  reason: invalid class name and case insensitive filesystem */
public final class C62663aU {
    public static final Integer A03 = AnonymousClass006.A0N;
    public final C13330nS A00;
    public final C58623Gm A01;
    public final AnonymousClass3XZ A02;

    public static String A00(H1T h1t, C10300i6 r2, String str) {
        h1t.A0J("accounts/change_password/");
        return new C62663aU(r2).A02(str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00de, code lost:
        if (r2 == X.AnonymousClass006.A01) goto L_0x00e0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String A02(java.lang.String r11) {
        /*
            r10 = this;
            X.3XZ r5 = r10.A02
            r9 = 0
            java.lang.String r7 = ""
            r3 = 0
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            if (r11 == 0) goto L_0x0052
            boolean r0 = r11.isEmpty()
            if (r0 != 0) goto L_0x0052
            java.util.Locale r2 = java.util.Locale.US
            java.util.Calendar r0 = java.util.Calendar.getInstance()
            long r0 = X.C18210wN.A07(r0)
            java.lang.Object[] r1 = X.C18240wQ.A1b(r0)
            java.lang.String r0 = "%d"
            java.lang.String r6 = java.lang.String.format(r2, r0, r1)
            X.3Gm r5 = r5.A00
            X.3Sm r0 = r5.A00()
            if (r0 == 0) goto L_0x004d
            int r2 = r0.A00
            if (r2 < 0) goto L_0x004d
            java.lang.String r1 = r0.A02
            if (r1 == 0) goto L_0x004d
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x004d
            com.facebook.cryptopub.CryptoPubNative r0 = X.AnonymousClass3XZ.A04     // Catch:{ Exception -> 0x0061 }
            byte[] r1 = r0.encrypt(r2, r1, r11, r6)     // Catch:{ Exception -> 0x0061 }
            r0 = 2
            java.lang.String r0 = android.util.Base64.encodeToString(r1, r0)     // Catch:{ Exception -> 0x0061 }
            X.3Bw r8 = new X.3Bw     // Catch:{ Exception -> 0x0061 }
            r8.<init>(r7, r0, r9, r3)     // Catch:{ Exception -> 0x0061 }
            goto L_0x0065
        L_0x004d:
            X.3Bw r8 = X.AnonymousClass3XZ.A00(r11, r6)
            goto L_0x0065
        L_0x0052:
            java.lang.Integer r2 = X.AnonymousClass006.A01
            java.lang.String r1 = "Empty password passed in"
            X.2Ak r0 = new X.2Ak
            r0.<init>((java.lang.String) r1, (java.lang.Integer) r2)
            X.3Bw r6 = new X.3Bw
            r6.<init>(r7, r11, r0, r3)
            goto L_0x0086
        L_0x0061:
            X.3Bw r8 = X.AnonymousClass3XZ.A00(r11, r6)
        L_0x0065:
            X.3Sm r1 = r5.A00()
            java.lang.String r7 = "%s:%s:%s:%s"
            java.lang.String r0 = "#PWD_TRANSIENT"
            if (r1 == 0) goto L_0x00cf
            java.lang.Integer r2 = r1.A01
            java.lang.Integer r1 = X.AnonymousClass006.A01
            if (r2 != r1) goto L_0x00cf
            java.util.Locale r2 = java.util.Locale.US
            java.lang.Object[] r1 = new java.lang.Object[]{r0, r4, r6, r11}
            java.lang.String r2 = java.lang.String.format(r2, r7, r1)
            X.2Ak r1 = r8.A03
            X.3Bw r6 = new X.3Bw
            r6.<init>(r0, r2, r1, r3)
        L_0x0086:
            X.0nS r1 = r10.A00
            java.lang.String r0 = "instagram_client_password_encryption_encrypt_attempt"
            X.0A2 r1 = X.AnonymousClass0wJ.A0M(r1, r0)
            r0 = 1724(0x6bc, float:2.416E-42)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r4 = X.C18180wK.A0I(r1, r0)
            X.3Gm r0 = r10.A01
            X.3Sm r0 = r0.A00()
            if (r0 == 0) goto L_0x00c6
            java.lang.String r3 = r0.A02
            int r0 = r0.A00
            java.lang.Long r2 = X.C18230wP.A0f(r0)
        L_0x00a4:
            int r0 = r6.A00
            java.lang.Long r1 = X.C18230wP.A0f(r0)
            java.lang.String r0 = "version"
            r4.A0S(r0, r1)
            java.lang.String r0 = "key"
            r4.A0T(r0, r3)
            java.lang.String r0 = "key_id"
            r4.A0S(r0, r2)
            java.lang.String r1 = r6.A02
            java.lang.String r0 = "tag"
            r4.A0T(r0, r1)
            r4.Bb4()
            java.lang.String r0 = r6.A01
            return r0
        L_0x00c6:
            r0 = 41
            java.lang.Long r2 = java.lang.Long.valueOf(r0)
            java.lang.String r3 = "-----BEGIN PUBLIC KEY-----\nMIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAvcu1KMDR1vzuBr9iYKW8\nKWmhT8CVUBRkchiO8861H7zIOYRwkQrkeHA+0mkBo3Ly1PiLXDkbKQZyeqZbspke\n4e7WgFNwT23jHfRMV/cNPxjPEy4kxNEbzLET6GlWepGdXFhzHfnS1PinGQzj0ZOU\nZM3pQjgGRL9fAf8brt1ewhQ5XtpvKFdPyQq5BkeFEDKoInDsC/yKDWRAx2twgPFr\nCYUzAB8/yXuL30ErTHT79bt3yTnv1fRtE19tROIlBuqruwSBk9gGq/LuvSECgsl5\nz4VcpHXhgZt6MhrAj6y9vAAxO2RVrt0Mq4OY4HgyYz9Wlr1vAxXXGAAYIvrhAYLP\n7QIDAQAB\n-----END PUBLIC KEY-----\n"
            goto L_0x00a4
        L_0x00cf:
            int r5 = X.AnonymousClass3XZ.A02
            X.2Ak r4 = r8.A03
            if (r4 == 0) goto L_0x00fc
            java.lang.Integer r2 = r4.A00
            java.lang.Integer r1 = X.AnonymousClass006.A00
            if (r2 != r1) goto L_0x00f6
            r5 = 1
        L_0x00dc:
            java.lang.Integer r1 = X.AnonymousClass006.A01
            if (r2 != r1) goto L_0x00fc
        L_0x00e0:
            java.util.Locale r3 = java.util.Locale.US
            java.lang.Integer r2 = java.lang.Integer.valueOf(r5)
            java.lang.String r1 = r8.A01
            java.lang.Object[] r1 = new java.lang.Object[]{r0, r2, r6, r1}
            java.lang.String r1 = java.lang.String.format(r3, r7, r1)
            X.3Bw r6 = new X.3Bw
            r6.<init>(r0, r1, r4, r5)
            goto L_0x0086
        L_0x00f6:
            java.lang.Integer r1 = X.AnonymousClass006.A01
            if (r2 != r1) goto L_0x00dc
            r5 = 0
            goto L_0x00dc
        L_0x00fc:
            java.lang.String r0 = "#PWD_INSTAGRAM"
            goto L_0x00e0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C62663aU.A02(java.lang.String):java.lang.String");
    }

    public C62663aU(C10300i6 r4) {
        C58623Gm r2 = C58623Gm.A01;
        if (r2 == null) {
            r2 = new C58623Gm(C10600ic.A00);
            C58623Gm.A01 = r2;
        }
        AnonymousClass3XZ.A02 = 4;
        this.A02 = new AnonymousClass3XZ(r2, new AnonymousClass301());
        this.A01 = r2;
        C10680ik r1 = new C10680ik(r4);
        r1.A02 = AnonymousClass4WE.A00().A00;
        this.A00 = r1.A00();
    }

    public static String A01(H1T h1t, C10300i6 r1, String str, String str2, String str3) {
        h1t.A0O(str, str2);
        return new C62663aU(r1).A02(str3);
    }
}
