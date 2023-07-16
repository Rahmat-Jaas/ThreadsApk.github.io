package X;

/* renamed from: X.6U7  reason: invalid class name */
public final class AnonymousClass6U7 {
    /* JADX WARNING: Can't wrap try/catch for region: R(12:5|6|7|8|9|10|11|(2:12|(2:14|(1:16)(0))(2:51|17))|18|19|(3:21|22|23)|(2:24|25)) */
    /* JADX WARNING: Can't wrap try/catch for region: R(3:33|34|35) */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0068, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        r7.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x006d, code lost:
        r0 = null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x0056 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x006e */
    /* JADX WARNING: Missing exception handler attribute for start block: B:34:0x0073 */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x005b A[Catch:{ FileNotFoundException -> 0x006d, all -> 0x0068 }] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0068 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:8:0x0026] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0078 A[SYNTHETIC, Splitter:B:42:0x0078] */
    /* JADX WARNING: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String A00(java.lang.String r15) {
        /*
            java.io.File r1 = X.C86144wL.A0Z(r15)
            java.lang.String r0 = ""
            X.7J8 r2 = new X.7J8
            r2.<init>(r1, r0)
            java.lang.String r10 = "MD5"
            r12 = 256(0x100, float:3.59E-43)
            java.util.Map r9 = r2.A05     // Catch:{ NoSuchAlgorithmException -> 0x009e }
            boolean r0 = r9.containsKey(r10)     // Catch:{ NoSuchAlgorithmException -> 0x009e }
            if (r0 == 0) goto L_0x001e
            java.lang.Object r8 = r9.get(r10)     // Catch:{ NoSuchAlgorithmException -> 0x009e }
            X.6c5 r8 = (X.C104626c5) r8     // Catch:{ NoSuchAlgorithmException -> 0x009e }
            goto L_0x0076
        L_0x001e:
            r8 = 0
            java.io.File r0 = r2.A01     // Catch:{ FileNotFoundException -> 0x0074, all -> 0x0072 }
            java.io.FileInputStream r7 = new java.io.FileInputStream     // Catch:{ FileNotFoundException -> 0x0074, all -> 0x0072 }
            r7.<init>(r0)     // Catch:{ FileNotFoundException -> 0x0074, all -> 0x0072 }
            android.os.SystemClock.uptimeMillis()     // Catch:{ FileNotFoundException -> 0x006d, all -> 0x0068 }
            r0 = 0
            long r5 = r2.A00     // Catch:{ FileNotFoundException -> 0x006d, all -> 0x0068 }
            r4 = 0
            java.security.MessageDigest r13 = java.security.MessageDigest.getInstance(r10)     // Catch:{ IOException -> 0x0056 }
            byte[] r11 = new byte[r12]     // Catch:{ IOException -> 0x0056 }
            r7.skip(r0)     // Catch:{ IOException -> 0x0056 }
            r14 = 0
        L_0x0039:
            int r0 = (r14 > r5 ? 1 : (r14 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x0052
            long r2 = (long) r12     // Catch:{ IOException -> 0x0056 }
            long r0 = r5 - r14
            long r0 = java.lang.Math.min(r2, r0)     // Catch:{ IOException -> 0x0056 }
            int r2 = (int) r0     // Catch:{ IOException -> 0x0056 }
            r1 = 0
            int r0 = r7.read(r11, r1, r2)     // Catch:{ IOException -> 0x0056 }
            if (r0 <= 0) goto L_0x0056
            r13.update(r11, r1, r0)     // Catch:{ IOException -> 0x0056 }
            long r0 = (long) r0     // Catch:{ IOException -> 0x0056 }
            long r14 = r14 + r0
            goto L_0x0039
        L_0x0052:
            byte[] r4 = r13.digest()     // Catch:{ IOException -> 0x0056 }
        L_0x0056:
            android.os.SystemClock.uptimeMillis()     // Catch:{ FileNotFoundException -> 0x006d, all -> 0x0068 }
            if (r4 == 0) goto L_0x0064
            X.6c5 r0 = new X.6c5     // Catch:{ FileNotFoundException -> 0x006d, all -> 0x0068 }
            r0.<init>(r4)     // Catch:{ FileNotFoundException -> 0x006d, all -> 0x0068 }
            r9.put(r10, r0)     // Catch:{ FileNotFoundException -> 0x006e, all -> 0x0068 }
            r8 = r0
        L_0x0064:
            r7.close()     // Catch:{ IOException -> 0x0076 }
            goto L_0x0076
        L_0x0068:
            r0 = move-exception
            r7.close()     // Catch:{ IOException -> 0x0073 }
            goto L_0x0073
        L_0x006d:
            r0 = r8
        L_0x006e:
            r7.close()     // Catch:{ IOException -> 0x0075 }
            goto L_0x0075
        L_0x0072:
            r0 = move-exception
        L_0x0073:
            throw r0     // Catch:{ NoSuchAlgorithmException -> 0x009e }
        L_0x0074:
            r0 = r8
        L_0x0075:
            r8 = r0
        L_0x0076:
            if (r8 == 0) goto L_0x00a6
            byte[] r5 = r8.A00     // Catch:{ NoSuchAlgorithmException -> 0x009e }
            java.lang.StringBuffer r4 = new java.lang.StringBuffer     // Catch:{ NoSuchAlgorithmException -> 0x009e }
            r4.<init>()     // Catch:{ NoSuchAlgorithmException -> 0x009e }
            r3 = 0
        L_0x0080:
            int r0 = r5.length     // Catch:{ NoSuchAlgorithmException -> 0x009e }
            if (r3 >= r0) goto L_0x0099
            byte r0 = r5[r3]     // Catch:{ NoSuchAlgorithmException -> 0x009e }
            r0 = r0 & 255(0xff, float:3.57E-43)
            r0 = r0 | 256(0x100, float:3.59E-43)
            java.lang.String r2 = java.lang.Integer.toHexString(r0)     // Catch:{ NoSuchAlgorithmException -> 0x009e }
            r1 = 3
            r0 = 1
            java.lang.String r0 = r2.substring(r0, r1)     // Catch:{ NoSuchAlgorithmException -> 0x009e }
            r4.append(r0)     // Catch:{ NoSuchAlgorithmException -> 0x009e }
            int r3 = r3 + 1
            goto L_0x0080
        L_0x0099:
            java.lang.String r0 = r4.toString()     // Catch:{ NoSuchAlgorithmException -> 0x009e }
            return r0
        L_0x009e:
            r2 = move-exception
            java.lang.String r1 = "MediaPDQReporter"
            java.lang.String r0 = "Failed to generate hash for file"
            X.AnonymousClass0LU.A0E(r1, r0, r2)
        L_0x00a6:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6U7.A00(java.lang.String):java.lang.String");
    }
}
