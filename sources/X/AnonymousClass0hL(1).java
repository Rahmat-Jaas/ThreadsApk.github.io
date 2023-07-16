package X;

import android.content.Context;
import android.os.StatFs;
import com.google.common.io.Closeables;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Set;

/* renamed from: X.0hL  reason: invalid class name */
public final class AnonymousClass0hL {
    public static long A00(Context context) {
        File externalFilesDir = context.getExternalFilesDir((String) null);
        if (externalFilesDir == null) {
            return 0;
        }
        StatFs statFs = new StatFs(externalFilesDir.getAbsolutePath());
        return statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong();
    }

    public static String A06(File file, StringBuilder sb) {
        InputStreamReader inputStreamReader = null;
        try {
            sb.delete(0, sb.length());
            InputStreamReader inputStreamReader2 = new InputStreamReader(new FileInputStream(file), "UTF-8");
            try {
                char[] cArr = new char[1024];
                while (true) {
                    int read = inputStreamReader2.read(cArr);
                    if (read != -1) {
                        sb.append(cArr, 0, read);
                    } else {
                        String obj = sb.toString();
                        Closeables.A02(inputStreamReader2);
                        return obj;
                    }
                }
            } catch (Throwable th) {
                th = th;
                inputStreamReader = inputStreamReader2;
                Closeables.A02(inputStreamReader);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            Closeables.A02(inputStreamReader);
            throw th;
        }
    }

    public static long A02(C41836MeS meS, String str, Set set) {
        File[] listFiles;
        File file = new File(str);
        long j = 0;
        if (file.isDirectory() && (listFiles = file.listFiles()) != null) {
            for (File obj : listFiles) {
                j += A02(meS, obj.toString(), set);
            }
        }
        if (meS.apply(file)) {
            j += file.length();
            file.delete();
            if (set != null) {
                try {
                    set.add(file.getCanonicalPath());
                } catch (IOException unused) {
                }
            }
        }
        return j;
    }

    public static long A04(String str) {
        if (str == null) {
            return 0;
        }
        return A03(new File(str));
    }

    public static File A05(Context context) {
        try {
            return File.createTempFile("tmp_photo_", ".jpg", context.getCacheDir());
        } catch (IOException e) {
            AnonymousClass0LU.A0E("FileUtil", "failed to create temp file", e);
            return new File("");
        }
    }

    public static void A08(String str) {
        new File(str).delete();
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x0023 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A09(java.io.File r4, java.io.InputStream r5) {
        /*
            r0 = 4096(0x1000, float:5.74E-42)
            byte[] r3 = new byte[r0]
            r2 = 0
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch:{ all -> 0x0027 }
            r0.<init>(r4)     // Catch:{ all -> 0x0027 }
            java.io.BufferedOutputStream r1 = new java.io.BufferedOutputStream     // Catch:{ all -> 0x0027 }
            r1.<init>(r0)     // Catch:{ all -> 0x0027 }
        L_0x000f:
            int r0 = r5.read(r3)     // Catch:{ IOException -> 0x0023, all -> 0x001e }
            if (r0 <= 0) goto L_0x0019
            r1.write(r3, r2, r0)     // Catch:{ IOException -> 0x0023, all -> 0x001e }
            goto L_0x000f
        L_0x0019:
            r1.close()     // Catch:{ IOException -> 0x001c }
        L_0x001c:
            r0 = 1
            return r0
        L_0x001e:
            r0 = move-exception
            r1.close()     // Catch:{ IOException -> 0x0028 }
            throw r0
        L_0x0023:
            r1.close()     // Catch:{ IOException -> 0x0029 }
            return r2
        L_0x0027:
            r0 = move-exception
        L_0x0028:
            throw r0
        L_0x0029:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0hL.A09(java.io.File, java.io.InputStream):boolean");
    }

    public static long A01(Context context) {
        StatFs statFs = new StatFs(context.getCacheDir().getAbsolutePath());
        return statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong();
    }

    public static long A03(File file) {
        File[] listFiles;
        long j = 0;
        if (!file.exists()) {
            return 0;
        }
        if (file.isFile()) {
            return file.length();
        }
        LinkedList linkedList = new LinkedList();
        linkedList.add(file);
        while (!linkedList.isEmpty()) {
            File file2 = (File) linkedList.remove();
            if (file2.exists() && (listFiles = file2.listFiles()) != null) {
                for (File file3 : listFiles) {
                    if (file3.isFile()) {
                        j += file3.length();
                    } else {
                        file3.isDirectory();
                    }
                }
            }
        }
        return j;
    }

    public static void A07(File file) {
        if (!file.exists() && !file.mkdirs()) {
            IOException e = null;
            StringBuilder sb = new StringBuilder("could not make directory: ");
            try {
                sb.append(file.getCanonicalPath());
                sb.append("-canonical");
            } catch (IOException e2) {
                e = e2;
                sb.append(file.getAbsolutePath());
                sb.append("-absolute");
            }
            IOException iOException = new IOException(sb.toString());
            if (e != null) {
                iOException.initCause(e);
            }
            throw iOException;
        }
    }
}
