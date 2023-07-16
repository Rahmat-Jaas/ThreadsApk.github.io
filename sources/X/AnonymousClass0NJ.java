package X;

import java.io.File;

/* renamed from: X.0NJ  reason: invalid class name */
public final class AnonymousClass0NJ {
    public File A00;

    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x0028 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static char A00(java.io.File r6) {
        /*
            boolean r0 = r6.exists()
            if (r0 == 0) goto L_0x0037
            java.lang.String r0 = "rw"
            java.io.RandomAccessFile r5 = new java.io.RandomAccessFile     // Catch:{ IOException -> 0x0029 }
            r5.<init>(r6, r0)     // Catch:{ IOException -> 0x0029 }
            long r3 = r5.length()     // Catch:{ all -> 0x0024 }
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0020
            byte r0 = r5.readByte()     // Catch:{ all -> 0x0024 }
            char r0 = (char) r0     // Catch:{ all -> 0x0024 }
            r5.close()     // Catch:{ IOException -> 0x0029 }
            return r0
        L_0x0020:
            r5.close()     // Catch:{ IOException -> 0x0029 }
            goto L_0x0034
        L_0x0024:
            r0 = move-exception
            r5.close()     // Catch:{ all -> 0x0028 }
        L_0x0028:
            throw r0     // Catch:{ IOException -> 0x0029 }
        L_0x0029:
            r2 = move-exception
            X.C04790Pd.A00()
            java.lang.String r1 = "lacrima"
            java.lang.String r0 = "Reading AppStateNativeParser failed"
            X.AnonymousClass0LU.A0G(r1, r0, r2)
        L_0x0034:
            X.0NQ r0 = X.AnonymousClass0NQ.A0B
            goto L_0x0039
        L_0x0037:
            X.0NQ r0 = X.AnonymousClass0NQ.A0E
        L_0x0039:
            char r0 = r0.A01
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0NJ.A00(java.io.File):char");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x002a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final char A01() {
        /*
            r6 = this;
            java.io.File r1 = r6.A00
            boolean r0 = r1.exists()
            if (r0 == 0) goto L_0x002b
            java.lang.String r0 = "rw"
            java.io.RandomAccessFile r5 = new java.io.RandomAccessFile     // Catch:{ IOException -> 0x002e }
            r5.<init>(r1, r0)     // Catch:{ IOException -> 0x002e }
            long r3 = r5.length()     // Catch:{ all -> 0x0026 }
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0022
            byte r0 = r5.readByte()     // Catch:{ all -> 0x0026 }
            char r0 = (char) r0     // Catch:{ all -> 0x0026 }
            r5.close()     // Catch:{ IOException -> 0x002e }
            return r0
        L_0x0022:
            r5.close()     // Catch:{ IOException -> 0x002e }
            goto L_0x0039
        L_0x0026:
            r0 = move-exception
            r5.close()     // Catch:{ all -> 0x002a }
        L_0x002a:
            throw r0     // Catch:{ IOException -> 0x002e }
        L_0x002b:
            X.0NQ r0 = X.AnonymousClass0NQ.A0E
            goto L_0x003b
        L_0x002e:
            r2 = move-exception
            X.C04790Pd.A00()
            java.lang.String r1 = "lacrima"
            java.lang.String r0 = "Reading AppStateNativeParser failed"
            X.AnonymousClass0LU.A0G(r1, r0, r2)
        L_0x0039:
            X.0NQ r0 = X.AnonymousClass0NQ.A0B
        L_0x003b:
            char r0 = r0.A01
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0NJ.A01():char");
    }

    public AnonymousClass0NJ(File file) {
        this.A00 = file;
    }
}
