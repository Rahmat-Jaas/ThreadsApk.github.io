package X;

/* renamed from: X.8DI  reason: invalid class name */
public class AnonymousClass8DI extends C97816Cz {
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0093, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0094, code lost:
        X.C102596Vu.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0097, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final byte[] A02(java.io.File r9) {
        /*
            r8 = 0
            java.io.FileInputStream r3 = new java.io.FileInputStream
            r3.<init>(r9)
            long r4 = r9.length()     // Catch:{ all -> 0x0091 }
            r1 = 2147483647(0x7fffffff, double:1.060997895E-314)
            java.lang.String r7 = "File "
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0073
            int r6 = (int) r4
            byte[] r1 = new byte[r6]     // Catch:{ all -> 0x0091 }
            r4 = r6
            r2 = 0
        L_0x0018:
            if (r4 <= 0) goto L_0x0023
            int r0 = r3.read(r1, r2, r4)     // Catch:{ all -> 0x0091 }
            if (r0 < 0) goto L_0x0023
            int r4 = r4 - r0
            int r2 = r2 + r0
            goto L_0x0018
        L_0x0023:
            if (r4 <= 0) goto L_0x002d
            byte[] r1 = java.util.Arrays.copyOf(r1, r2)     // Catch:{ all -> 0x0091 }
            X.C04220Ms.A06(r1)     // Catch:{ all -> 0x0091 }
            goto L_0x006f
        L_0x002d:
            int r2 = r3.read()     // Catch:{ all -> 0x0091 }
            r0 = -1
            if (r2 == r0) goto L_0x006f
            X.660 r4 = new X.660     // Catch:{ all -> 0x0091 }
            r4.<init>()     // Catch:{ all -> 0x0091 }
            r4.write(r2)     // Catch:{ all -> 0x0091 }
            X.AnonymousClass723.A00(r3, r4)     // Catch:{ all -> 0x0091 }
            int r0 = r4.size()     // Catch:{ all -> 0x0091 }
            int r0 = r0 + r6
            if (r0 < 0) goto L_0x0059
            byte[] r2 = r4.A00()     // Catch:{ all -> 0x0091 }
            byte[] r1 = java.util.Arrays.copyOf(r1, r0)     // Catch:{ all -> 0x0091 }
            X.C04220Ms.A06(r1)     // Catch:{ all -> 0x0091 }
            int r0 = r4.size()     // Catch:{ all -> 0x0091 }
            java.lang.System.arraycopy(r2, r8, r1, r6, r0)     // Catch:{ all -> 0x0091 }
            goto L_0x006f
        L_0x0059:
            java.lang.StringBuilder r1 = X.C18200wM.A0r()     // Catch:{ all -> 0x0091 }
            r1.append(r7)     // Catch:{ all -> 0x0091 }
            r1.append(r9)     // Catch:{ all -> 0x0091 }
            java.lang.String r0 = " is too big to fit in memory."
            java.lang.String r0 = X.C18180wK.A0i(r0, r1)     // Catch:{ all -> 0x0091 }
            java.lang.OutOfMemoryError r1 = new java.lang.OutOfMemoryError     // Catch:{ all -> 0x0091 }
            r1.<init>(r0)     // Catch:{ all -> 0x0091 }
            goto L_0x0090
        L_0x006f:
            r3.close()
            return r1
        L_0x0073:
            java.lang.StringBuilder r1 = X.C18200wM.A0r()     // Catch:{ all -> 0x0091 }
            r1.append(r7)     // Catch:{ all -> 0x0091 }
            r1.append(r9)     // Catch:{ all -> 0x0091 }
            java.lang.String r0 = " is too big ("
            r1.append(r0)     // Catch:{ all -> 0x0091 }
            r1.append(r4)     // Catch:{ all -> 0x0091 }
            java.lang.String r0 = " bytes) to fit in memory."
            java.lang.String r0 = X.C18180wK.A0i(r0, r1)     // Catch:{ all -> 0x0091 }
            java.lang.OutOfMemoryError r1 = new java.lang.OutOfMemoryError     // Catch:{ all -> 0x0091 }
            r1.<init>(r0)     // Catch:{ all -> 0x0091 }
        L_0x0090:
            throw r1     // Catch:{ all -> 0x0091 }
        L_0x0091:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0093 }
        L_0x0093:
            r0 = move-exception
            X.C102596Vu.A00(r3, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8DI.A02(java.io.File):byte[]");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0018, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0014, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0015, code lost:
        X.C102596Vu.A00(r2, r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String A00(java.io.File r2, java.nio.charset.Charset r3) {
        /*
            java.io.FileInputStream r0 = new java.io.FileInputStream
            r0.<init>(r2)
            java.io.InputStreamReader r2 = new java.io.InputStreamReader
            r2.<init>(r0, r3)
            java.lang.String r0 = X.C120677Bz.A00(r2)     // Catch:{ all -> 0x0012 }
            r2.close()
            return r0
        L_0x0012:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0014 }
        L_0x0014:
            r0 = move-exception
            X.C102596Vu.A00(r2, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8DI.A00(java.io.File, java.nio.charset.Charset):java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0012, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x000e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x000f, code lost:
        X.C102596Vu.A00(r2, r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(java.io.File r3, byte[] r4) {
        /*
            java.io.FileOutputStream r2 = new java.io.FileOutputStream
            r2.<init>(r3)
            r2.write(r4)     // Catch:{ all -> 0x000c }
            r2.close()
            return
        L_0x000c:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x000e }
        L_0x000e:
            r0 = move-exception
            X.C102596Vu.A00(r2, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8DI.A01(java.io.File, byte[]):void");
    }
}
