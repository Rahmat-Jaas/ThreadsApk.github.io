package X;

import android.content.Context;
import java.io.File;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.0SH  reason: invalid class name */
public final class AnonymousClass0SH {
    public static final Map A00 = Collections.synchronizedMap(new HashMap());

    public static boolean A03(Context context, String str) {
        try {
            boolean z = true;
            if (A00(context, str, 0) != 1) {
                z = false;
            }
            return z;
        } finally {
            A01(context, str);
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:30|(2:32|33)|34|35) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:28:0x0069 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:34:0x0070 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:28:0x0069=Splitter:B:28:0x0069, B:20:0x005c=Splitter:B:20:0x005c} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int A00(android.content.Context r5, java.lang.String r6, int r7) {
        /*
            if (r5 == 0) goto L_0x0010
            java.util.Map r2 = A00
            java.lang.Object r0 = r2.get(r6)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x0011
            int r7 = r0.intValue()
        L_0x0010:
            return r7
        L_0x0011:
            java.io.File r0 = r5.getFilesDir()     // Catch:{ IOException -> 0x0072 }
            java.lang.String r4 = "GkBootstrap"
            java.io.File r1 = new java.io.File     // Catch:{ IOException -> 0x0072 }
            r1.<init>(r0, r4)     // Catch:{ IOException -> 0x0072 }
            java.io.File r0 = new java.io.File     // Catch:{ IOException -> 0x0072 }
            r0.<init>(r1, r6)     // Catch:{ IOException -> 0x0072 }
            boolean r3 = r0.exists()     // Catch:{ IOException -> 0x0072 }
            if (r3 == 0) goto L_0x003b
            java.io.File r1 = r5.getFilesDir()     // Catch:{ IOException -> 0x0072 }
            java.io.File r0 = new java.io.File     // Catch:{ IOException -> 0x0072 }
            r0.<init>(r1, r4)     // Catch:{ IOException -> 0x0072 }
            java.io.File r1 = new java.io.File     // Catch:{ IOException -> 0x0072 }
            r1.<init>(r0, r6)     // Catch:{ IOException -> 0x0072 }
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch:{ all -> 0x006a }
            r0.<init>(r1)     // Catch:{ all -> 0x006a }
            goto L_0x004e
        L_0x003b:
            java.io.File r1 = r5.getFilesDir()     // Catch:{ IOException -> 0x0072 }
            java.io.File r0 = new java.io.File     // Catch:{ IOException -> 0x0072 }
            r0.<init>(r1, r6)     // Catch:{ IOException -> 0x0072 }
            boolean r0 = r0.exists()     // Catch:{ IOException -> 0x0072 }
            if (r0 == 0) goto L_0x0072
            java.io.FileInputStream r0 = r5.openFileInput(r6)     // Catch:{ all -> 0x006a }
        L_0x004e:
            java.io.DataInputStream r1 = new java.io.DataInputStream     // Catch:{ all -> 0x006a }
            r1.<init>(r0)     // Catch:{ all -> 0x006a }
            int r0 = r1.readInt()     // Catch:{ all -> 0x0065 }
            if (r3 != 0) goto L_0x005c
            A02(r5, r6, r0)     // Catch:{ all -> 0x0065 }
        L_0x005c:
            r1.close()     // Catch:{ all -> 0x006a }
            if (r3 != 0) goto L_0x0071
            r5.deleteFile(r6)     // Catch:{ SecurityException -> 0x0071 }
            goto L_0x0071
        L_0x0065:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x0069 }
        L_0x0069:
            throw r0     // Catch:{ all -> 0x006a }
        L_0x006a:
            r0 = move-exception
            if (r3 != 0) goto L_0x0070
            r5.deleteFile(r6)     // Catch:{ SecurityException -> 0x0070 }
        L_0x0070:
            throw r0     // Catch:{ IOException -> 0x0072 }
        L_0x0071:
            r7 = r0
        L_0x0072:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)
            r2.put(r6, r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0SH.A00(android.content.Context, java.lang.String, int):int");
    }

    public static void A01(Context context, String str) {
        File filesDir;
        if (context != null) {
            if (new File(new File(context.getFilesDir(), "GkBootstrap"), str).exists()) {
                filesDir = new File(context.getFilesDir(), "GkBootstrap");
            } else {
                filesDir = context.getFilesDir();
            }
            File file = new File(filesDir, str);
            try {
                if (file.delete() || !file.exists()) {
                    return;
                }
            } catch (SecurityException unused) {
            }
            AnonymousClass0LU.A0O("GkBootstrap", "Unable to clean up GK file %s", str);
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x003b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A02(android.content.Context r5, java.lang.String r6, int r7) {
        /*
            java.lang.String r4 = "GkBootstrap"
            java.io.File r0 = r5.getFilesDir()     // Catch:{ SecurityException -> 0x0047 }
            java.io.File r1 = new java.io.File     // Catch:{ SecurityException -> 0x0047 }
            r1.<init>(r0, r4)     // Catch:{ SecurityException -> 0x0047 }
            boolean r0 = r1.exists()     // Catch:{ SecurityException -> 0x0047 }
            if (r0 != 0) goto L_0x0018
            boolean r0 = r1.mkdir()     // Catch:{ SecurityException -> 0x0047 }
            if (r0 != 0) goto L_0x0018
            return
        L_0x0018:
            java.io.File r1 = r5.getFilesDir()
            java.io.File r0 = new java.io.File
            r0.<init>(r1, r4)
            java.io.File r3 = new java.io.File
            r3.<init>(r0, r6)
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch:{ IOException | SecurityException -> 0x003c }
            r0.<init>(r3)     // Catch:{ IOException | SecurityException -> 0x003c }
            java.io.DataOutputStream r1 = new java.io.DataOutputStream     // Catch:{ IOException | SecurityException -> 0x003c }
            r1.<init>(r0)     // Catch:{ IOException | SecurityException -> 0x003c }
            r1.writeInt(r7)     // Catch:{ all -> 0x0037 }
            r1.close()     // Catch:{ IOException | SecurityException -> 0x003c }
            return
        L_0x0037:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x003b }
        L_0x003b:
            throw r0     // Catch:{ IOException | SecurityException -> 0x003c }
        L_0x003c:
            r2 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[]{r3}
            java.lang.String r0 = "Unable to persist GK value to %s"
            X.AnonymousClass0LU.A0L(r4, r0, r2, r1)
            return
        L_0x0047:
            r2 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[]{r4}
            java.lang.String r0 = "Unable to create %s directory"
            X.AnonymousClass0LU.A0K(r4, r0, r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0SH.A02(android.content.Context, java.lang.String, int):void");
    }
}
