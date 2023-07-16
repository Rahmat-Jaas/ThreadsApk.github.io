package X;

import java.util.HashSet;
import java.util.Set;

/* renamed from: X.0Ed  reason: invalid class name and case insensitive filesystem */
public final class C03050Ed {
    public final Set A00 = new HashSet();

    /* JADX WARNING: Can't wrap try/catch for region: R(5:17|18|19|20|21) */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:2|(9:3|4|5|6|7|8|(2:9|10)|11|(2:(1:15)|16))|24|25|(2:27|28)) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x002b */
    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x002c */
    /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x002f */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0034  */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:20:0x002b=Splitter:B:20:0x002b, B:24:0x002f=Splitter:B:24:0x002f} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int A00(X.C03050Ed r5, java.lang.String r6, byte[] r7) {
        /*
            java.util.Set r5 = r5.A00
            boolean r0 = r5.contains(r6)
            r4 = -1
            if (r0 != 0) goto L_0x003f
            android.os.StrictMode$ThreadPolicy r3 = android.os.StrictMode.allowThreadDiskReads()
            int r0 = r7.length     // Catch:{ all -> 0x0038 }
            r1 = 0
            java.io.FileDescriptor r2 = android.system.Os.open(r6, r1, r1)     // Catch:{ ErrnoException -> 0x002f }
            int r0 = r0 + -1
            int r1 = android.system.Os.read(r2, r7, r1, r0)     // Catch:{ ErrnoException | InterruptedIOException -> 0x002c, all -> 0x0027 }
            android.system.Os.close(r2)     // Catch:{ ErrnoException -> 0x001c }
        L_0x001c:
            r0 = -2147483647(0xffffffff80000001, float:-1.4E-45)
            if (r1 == r0) goto L_0x002f
            if (r3 == 0) goto L_0x0026
            android.os.StrictMode.setThreadPolicy(r3)
        L_0x0026:
            return r1
        L_0x0027:
            r0 = move-exception
            android.system.Os.close(r2)     // Catch:{ ErrnoException -> 0x002b }
        L_0x002b:
            throw r0     // Catch:{ all -> 0x0038 }
        L_0x002c:
            android.system.Os.close(r2)     // Catch:{ ErrnoException -> 0x002f }
        L_0x002f:
            r5.add(r6)     // Catch:{ all -> 0x0038 }
            if (r3 == 0) goto L_0x003f
            android.os.StrictMode.setThreadPolicy(r3)
            return r4
        L_0x0038:
            r0 = move-exception
            if (r3 == 0) goto L_0x003e
            android.os.StrictMode.setThreadPolicy(r3)
        L_0x003e:
            throw r0
        L_0x003f:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C03050Ed.A00(X.0Ed, java.lang.String, byte[]):int");
    }
}
