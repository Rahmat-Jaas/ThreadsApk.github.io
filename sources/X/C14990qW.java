package X;

import android.os.Build;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/* renamed from: X.0qW  reason: invalid class name and case insensitive filesystem */
public final class C14990qW {
    /* JADX WARNING: Can't wrap try/catch for region: R(4:6|7|8|(4:10|11|(1:13)|14)(2:15|16)) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0017, code lost:
        r1 = new X.C15180qs(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0020, code lost:
        if (r6.setWritable(false) == false) goto L_0x0022;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0022, code lost:
        android.util.Log.w("SysUtil", X.AnonymousClass00U.A0V("error removing ", r6.getCanonicalPath(), " write permission"));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002d, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002f, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0034, code lost:
        if (r6.setWritable(false) == false) goto L_0x0036;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0036, code lost:
        android.util.Log.w("SysUtil", X.AnonymousClass00U.A0V("error removing ", r6.getCanonicalPath(), " write permission"));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0041, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0010, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0015, code lost:
        if (r6.setWritable(true) != false) goto L_0x0017;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C15180qs A00(java.io.File r6, java.io.File r7) {
        /*
            java.lang.String r5 = " write permission"
            java.lang.String r4 = "error removing "
            java.lang.String r3 = "SysUtil"
            r0 = 1
            r2 = 0
            X.0qs r1 = new X.0qs     // Catch:{ FileNotFoundException -> 0x0010, all -> 0x000e }
            r1.<init>(r7)     // Catch:{ FileNotFoundException -> 0x0010, all -> 0x000e }
            return r1
        L_0x000e:
            r1 = move-exception
            throw r1
        L_0x0010:
            r1 = move-exception
            boolean r0 = r6.setWritable(r0)     // Catch:{ all -> 0x002f }
            if (r0 == 0) goto L_0x002e
            X.0qs r1 = new X.0qs     // Catch:{ all -> 0x002f }
            r1.<init>(r7)     // Catch:{ all -> 0x002f }
            boolean r0 = r6.setWritable(r2)
            if (r0 != 0) goto L_0x002d
            java.lang.String r0 = r6.getCanonicalPath()
            java.lang.String r0 = X.AnonymousClass00U.A0V(r4, r0, r5)
            android.util.Log.w(r3, r0)
        L_0x002d:
            return r1
        L_0x002e:
            throw r1     // Catch:{ all -> 0x002f }
        L_0x002f:
            r1 = move-exception
            boolean r0 = r6.setWritable(r2)
            if (r0 != 0) goto L_0x0041
            java.lang.String r0 = r6.getCanonicalPath()
            java.lang.String r0 = X.AnonymousClass00U.A0V(r4, r0, r5)
            android.util.Log.w(r3, r0)
        L_0x0041:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14990qW.A00(java.io.File, java.io.File):X.0qs");
    }

    public static void A01() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 23 && i <= 27) {
            try {
                Runtime.class.getDeclaredMethod("nativeLoad", new Class[]{String.class, ClassLoader.class, String.class}).setAccessible(true);
            } catch (Exception e) {
                Log.w("SysUtil", "Cannot get nativeLoad method", e);
            }
        }
    }

    public static void A02(File file) {
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                for (File A02 : listFiles) {
                    A02(A02);
                }
            } else {
                return;
            }
        }
        File parentFile = file.getParentFile();
        if (parentFile != null && !parentFile.canWrite() && !parentFile.setWritable(true)) {
            StringBuilder sb = new StringBuilder("Enable write permission failed: ");
            sb.append(parentFile);
            Log.e("SysUtil", sb.toString());
        }
        if (!file.delete() && file.exists()) {
            StringBuilder sb2 = new StringBuilder("Could not delete file ");
            sb2.append(file);
            throw new IOException(sb2.toString());
        }
    }

    public static void A03(File file) {
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                for (File A03 : listFiles) {
                    A03(A03);
                }
                return;
            }
            StringBuilder sb = new StringBuilder("cannot list directory ");
            sb.append(file);
            throw new IOException(sb.toString());
        } else if (!file.getPath().endsWith("_lock")) {
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
            try {
                randomAccessFile.getFD().sync();
                randomAccessFile.close();
                return;
            } catch (Throwable unused) {
            }
        } else {
            return;
        }
        throw th;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:1|2|(2:4|5)|6|7|8|9) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x002b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] A04(android.content.Context r4, java.io.File r5) {
        /*
            java.io.File r1 = r5.getCanonicalFile()
            android.os.Parcel r3 = android.os.Parcel.obtain()
            r0 = 1
            r3.writeByte(r0)     // Catch:{ all -> 0x0036 }
            java.lang.String r0 = r1.getPath()     // Catch:{ all -> 0x0036 }
            r3.writeString(r0)     // Catch:{ all -> 0x0036 }
            long r0 = r1.lastModified()     // Catch:{ all -> 0x0036 }
            r3.writeLong(r0)     // Catch:{ all -> 0x0036 }
            android.content.pm.PackageManager r2 = r4.getPackageManager()     // Catch:{ all -> 0x0036 }
            r1 = 0
            if (r2 == 0) goto L_0x002b
            java.lang.String r0 = r4.getPackageName()     // Catch:{ NameNotFoundException | RuntimeException -> 0x002b }
            android.content.pm.PackageInfo r0 = r2.getPackageInfo(r0, r1)     // Catch:{ NameNotFoundException | RuntimeException -> 0x002b }
            int r1 = r0.versionCode     // Catch:{ NameNotFoundException | RuntimeException -> 0x002b }
        L_0x002b:
            r3.writeInt(r1)     // Catch:{ all -> 0x0036 }
            byte[] r0 = r3.marshall()     // Catch:{ all -> 0x0036 }
            r3.recycle()
            return r0
        L_0x0036:
            r0 = move-exception
            r3.recycle()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14990qW.A04(android.content.Context, java.io.File):byte[]");
    }
}
