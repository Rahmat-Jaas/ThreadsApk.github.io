package X;

import android.content.Context;
import android.os.Process;
import java.io.File;
import java.io.IOException;

/* renamed from: X.7Au  reason: invalid class name */
public final class AnonymousClass7Au {
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0032 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x0037 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.nio.ByteBuffer A01(android.content.Context r8, android.net.Uri r9) {
        /*
            r3 = 0
            android.content.ContentResolver r1 = r8.getContentResolver()
            java.lang.String r0 = "r"
            android.os.ParcelFileDescriptor r2 = r1.openFileDescriptor(r9, r0, r3)     // Catch:{ IOException -> 0x0038 }
            if (r2 != 0) goto L_0x000e
            return r3
        L_0x000e:
            java.io.FileDescriptor r0 = r2.getFileDescriptor()     // Catch:{ all -> 0x0033 }
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ all -> 0x0033 }
            r1.<init>(r0)     // Catch:{ all -> 0x0033 }
            java.nio.channels.FileChannel r4 = r1.getChannel()     // Catch:{ all -> 0x002e }
            long r8 = r4.size()     // Catch:{ all -> 0x002e }
            java.nio.channels.FileChannel$MapMode r5 = java.nio.channels.FileChannel.MapMode.READ_ONLY     // Catch:{ all -> 0x002e }
            r6 = 0
            java.nio.MappedByteBuffer r0 = r4.map(r5, r6, r8)     // Catch:{ all -> 0x002e }
            r1.close()     // Catch:{ all -> 0x0033 }
            r2.close()     // Catch:{ IOException -> 0x0038 }
            return r0
        L_0x002e:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x0032 }
        L_0x0032:
            throw r0     // Catch:{ all -> 0x0033 }
        L_0x0033:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x0037 }
        L_0x0037:
            throw r0     // Catch:{ IOException -> 0x0038 }
        L_0x0038:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7Au.A01(android.content.Context, android.net.Uri):java.nio.ByteBuffer");
    }

    public static File A00(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir != null) {
            String A0Z = AnonymousClass00U.A0Z(".font", "-", "-", Process.myPid(), Process.myTid());
            int i = 0;
            while (i < 100) {
                File A0U = C86154wM.A0U(cacheDir, AnonymousClass00U.A0J(A0Z, i));
                try {
                    if (A0U.createNewFile()) {
                        return A0U;
                    }
                    i++;
                } catch (IOException unused) {
                }
            }
        }
        return null;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:21|22|(0)|26|27) */
    /* JADX WARNING: Can't wrap try/catch for region: R(7:11|12|13|14|29|30|31) */
    /* JADX WARNING: Can't wrap try/catch for region: R(7:15|16|35|36|37|38|39) */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0041, code lost:
        if (r6 == null) goto L_0x0046;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0048, code lost:
        if (r4 == null) goto L_0x004d;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0021 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x003d */
    /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x004d */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x003a A[SYNTHETIC, Splitter:B:24:0x003a] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:13:0x0021=Splitter:B:13:0x0021, B:26:0x003d=Splitter:B:26:0x003d, B:37:0x004d=Splitter:B:37:0x004d} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A02(android.content.res.Resources r7, java.io.File r8, int r9) {
        /*
            java.io.InputStream r6 = r7.openRawResource(r9)     // Catch:{ all -> 0x0058 }
            android.os.StrictMode$ThreadPolicy r7 = android.os.StrictMode.allowThreadDiskWrites()     // Catch:{ all -> 0x0051 }
            r5 = 0
            r4 = 0
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x002c }
            r3.<init>(r8, r5)     // Catch:{ IOException -> 0x002c }
            r0 = 1024(0x400, float:1.435E-42)
            byte[] r2 = new byte[r0]     // Catch:{ IOException -> 0x0029, all -> 0x0026 }
        L_0x0013:
            int r1 = r6.read(r2)     // Catch:{ IOException -> 0x0029, all -> 0x0026 }
            r0 = -1
            if (r1 == r0) goto L_0x001e
            r3.write(r2, r5, r1)     // Catch:{ IOException -> 0x0029, all -> 0x0026 }
            goto L_0x0013
        L_0x001e:
            r3.close()     // Catch:{ IOException -> 0x0021 }
        L_0x0021:
            android.os.StrictMode.setThreadPolicy(r7)     // Catch:{ all -> 0x0051 }
            r0 = 1
            goto L_0x0043
        L_0x0026:
            r0 = move-exception
            r4 = r3
            goto L_0x004a
        L_0x0029:
            r2 = move-exception
            r4 = r3
            goto L_0x002d
        L_0x002c:
            r2 = move-exception
        L_0x002d:
            java.lang.String r1 = "TypefaceCompatUtil"
            java.lang.String r0 = "Error copying resource contents to temp file: "
            java.lang.String r0 = X.C18230wP.A0t(r0, r2)     // Catch:{ all -> 0x0047 }
            android.util.Log.e(r1, r0)     // Catch:{ all -> 0x0047 }
            if (r4 == 0) goto L_0x003d
            r4.close()     // Catch:{ IOException -> 0x003d }
        L_0x003d:
            android.os.StrictMode.setThreadPolicy(r7)     // Catch:{ all -> 0x0051 }
            r0 = 0
            if (r6 == 0) goto L_0x0046
        L_0x0043:
            r6.close()     // Catch:{ IOException -> 0x0046 }
        L_0x0046:
            return r0
        L_0x0047:
            r0 = move-exception
            if (r4 == 0) goto L_0x004d
        L_0x004a:
            r4.close()     // Catch:{ IOException -> 0x004d }
        L_0x004d:
            android.os.StrictMode.setThreadPolicy(r7)     // Catch:{ all -> 0x0051 }
            throw r0     // Catch:{ all -> 0x0051 }
        L_0x0051:
            r0 = move-exception
            if (r6 == 0) goto L_0x0059
            r6.close()     // Catch:{ IOException -> 0x0059 }
            throw r0
        L_0x0058:
            r0 = move-exception
        L_0x0059:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7Au.A02(android.content.res.Resources, java.io.File, int):boolean");
    }
}
