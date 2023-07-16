package X;

import java.io.File;

/* renamed from: X.0XX  reason: invalid class name */
public final class AnonymousClass0XX implements C04050Mb {
    public final File A00;

    /* JADX WARNING: Can't wrap try/catch for region: R(5:14|17|18|19|20) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0065 */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void CWp(X.C04170Mn r10, X.AnonymousClass0ND r11) {
        /*
            r9 = this;
            java.io.File r5 = r9.A00
            boolean r0 = r5.exists()
            if (r0 == 0) goto L_0x0081
            r7 = 0
            r2 = 0
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ FileNotFoundException | IOException -> 0x0066 }
            r1.<init>(r5)     // Catch:{ FileNotFoundException | IOException -> 0x0066 }
            java.io.BufferedInputStream r0 = new java.io.BufferedInputStream     // Catch:{ FileNotFoundException | IOException -> 0x0066 }
            r0.<init>(r1)     // Catch:{ FileNotFoundException | IOException -> 0x0066 }
            java.io.DataInputStream r6 = new java.io.DataInputStream     // Catch:{ FileNotFoundException | IOException -> 0x0066 }
            r6.<init>(r0)     // Catch:{ FileNotFoundException | IOException -> 0x0066 }
            int r0 = r6.readInt()     // Catch:{ all -> 0x0060 }
            int r8 = java.lang.Integer.reverseBytes(r0)     // Catch:{ all -> 0x0060 }
            int r0 = r6.readInt()     // Catch:{ all -> 0x0060 }
            int r4 = java.lang.Integer.reverseBytes(r0)     // Catch:{ all -> 0x0060 }
            int r0 = r6.readInt()     // Catch:{ all -> 0x0060 }
            int r1 = java.lang.Integer.reverseBytes(r0)     // Catch:{ all -> 0x0060 }
            r0 = 4
            r6.skipBytes(r0)     // Catch:{ all -> 0x0060 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0060 }
            r3.<init>(r8)     // Catch:{ all -> 0x0060 }
            byte[] r2 = new byte[r8]     // Catch:{ all -> 0x005e }
            r6.read(r2)     // Catch:{ all -> 0x005e }
            if (r1 == 0) goto L_0x004e
            int r8 = r8 - r4
            java.nio.charset.Charset r1 = java.nio.charset.Charset.defaultCharset()     // Catch:{ all -> 0x005e }
            java.lang.String r0 = new java.lang.String     // Catch:{ all -> 0x005e }
            r0.<init>(r2, r4, r8, r1)     // Catch:{ all -> 0x005e }
            r3.append(r0)     // Catch:{ all -> 0x005e }
        L_0x004e:
            java.nio.charset.Charset r1 = java.nio.charset.Charset.defaultCharset()     // Catch:{ all -> 0x005e }
            java.lang.String r0 = new java.lang.String     // Catch:{ all -> 0x005e }
            r0.<init>(r2, r7, r4, r1)     // Catch:{ all -> 0x005e }
            r3.append(r0)     // Catch:{ all -> 0x005e }
            r6.close()     // Catch:{ FileNotFoundException | IOException -> 0x0067 }
            goto L_0x006f
        L_0x005e:
            r0 = move-exception
            goto L_0x0062
        L_0x0060:
            r0 = move-exception
            r3 = r2
        L_0x0062:
            r6.close()     // Catch:{ all -> 0x0065 }
        L_0x0065:
            throw r0     // Catch:{ FileNotFoundException | IOException -> 0x0067 }
        L_0x0066:
            r3 = r2
        L_0x0067:
            X.C04790Pd.A00()
            r5.getPath()
            if (r3 == 0) goto L_0x0081
        L_0x006f:
            int r0 = r3.length()
            if (r0 <= 0) goto L_0x0081
            r5.getPath()
            X.0ON r1 = X.AnonymousClass0MU.A6H
            java.lang.String r0 = r3.toString()
            r10.A03(r1, r0)
        L_0x0081:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0XX.CWp(X.0Mn, X.0ND):void");
    }

    public AnonymousClass0XX(File file) {
        this.A00 = file;
    }

    public final Integer Awy() {
        return AnonymousClass006.A0J;
    }

    public final /* synthetic */ boolean BNv(Integer num) {
        return false;
    }
}
