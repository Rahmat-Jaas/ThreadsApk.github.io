package com.instagram.debug.devoptions.disk;

import X.C04220Ms;
import X.C14620pq;
import X.C18180wK;
import X.C18200wM;
import android.content.Context;
import android.os.Environment;
import android.os.StatFs;
import java.io.File;
import java.text.StringCharacterIterator;
import java.util.Arrays;

public final class DiskUtils {
    public static final DiskUtils INSTANCE = new DiskUtils();

    public static final long getExternalCacheUsed(Context context) {
        C04220Ms.A0B(context, 0);
        File externalCacheDir = context.getExternalCacheDir();
        if (externalCacheDir == null || !externalCacheDir.exists()) {
            return -1;
        }
        return getFolderSize(externalCacheDir);
    }

    public static final long getExternalFileTotalSize(Context context) {
        C04220Ms.A0B(context, 0);
        File externalFilesDir = context.getExternalFilesDir((String) null);
        if (externalFilesDir == null || !externalFilesDir.exists()) {
            return -1;
        }
        return getFolderSize(externalFilesDir);
    }

    public static final long getExternalMediaTotalSize(Context context) {
        int length;
        C04220Ms.A0B(context, 0);
        File[] externalMediaDirs = context.getExternalMediaDirs();
        long j = 0;
        if (externalMediaDirs == null || (length = externalMediaDirs.length) <= 0) {
            return j;
        }
        int i = 0;
        do {
            j += getFolderSize(externalMediaDirs[i]);
            i++;
        } while (i < length);
        return j;
    }

    public static final long getFileTotalSize(Context context) {
        C04220Ms.A0B(context, 0);
        return getFolderSize(context.getFilesDir());
    }

    public static final long getInternalCacheUsed(Context context) {
        C04220Ms.A0B(context, 0);
        return getFolderSize(context.getCacheDir());
    }

    public static final long getInternalOtherUsed(Context context) {
        C04220Ms.A0B(context, 0);
        long totalInternalDataUsed = (getTotalInternalDataUsed(context) - getFolderSize(context.getCacheDir())) - getFolderSize(context.getFilesDir());
        if (totalInternalDataUsed < 0) {
            return 0;
        }
        return totalInternalDataUsed;
    }

    public static final long getTotalCaches(Context context) {
        C04220Ms.A0B(context, 0);
        return getFolderSize(context.getCacheDir()) + getExternalCacheUsed(context);
    }

    public static final long getTotalDataFootprint(Context context) {
        C04220Ms.A0B(context, 0);
        long totalInternalDataUsed = getTotalInternalDataUsed(context);
        long folderSize = getFolderSize(context.getCacheDir());
        return (totalInternalDataUsed - folderSize) + getExternalFileTotalSize(context) + getExternalMediaTotalSize(context);
    }

    public static final long getTotalInternalDataUsed(Context context) {
        C04220Ms.A0B(context, 0);
        File parentFile = context.getFilesDir().getParentFile();
        if (parentFile == null || !parentFile.exists()) {
            return -1;
        }
        return getFolderSize(parentFile);
    }

    public static final void clearDir(File file) {
        File[] listFiles;
        if (file != null && file.exists()) {
            if (file.isDirectory() && (listFiles = file.listFiles()) != null) {
                for (File file2 : listFiles) {
                    if (file2.isDirectory()) {
                        clearDir(file2);
                    } else {
                        file2.delete();
                    }
                }
            }
            file.delete();
        }
    }

    public static final String formatSize(long j) {
        if (j < 0) {
            return "Error";
        }
        if (-1000 >= j || j >= 1000) {
            StringCharacterIterator stringCharacterIterator = new StringCharacterIterator("kMGTPE");
            while (true) {
                if (j <= -999950 || j >= 999950) {
                    j /= (long) 1000;
                    stringCharacterIterator.next();
                } else {
                    String format = String.format("%.2f %cB", Arrays.copyOf(new Object[]{Double.valueOf(((double) j) / 1000.0d), Character.valueOf(stringCharacterIterator.current())}, 2));
                    C04220Ms.A06(format);
                    return format;
                }
            }
        } else {
            StringBuilder A0r = C18200wM.A0r();
            A0r.append(j);
            return C18180wK.A0i(" B", A0r);
        }
    }

    public static final long getFolderSize(File file) {
        File[] listFiles;
        long folderSize;
        if (file == null || (listFiles = file.listFiles()) == null) {
            return -1;
        }
        long j = 0;
        for (File file2 : listFiles) {
            if (file2.isFile()) {
                folderSize = file2.length();
            } else {
                folderSize = getFolderSize(file2);
            }
            j += folderSize;
        }
        return j;
    }

    public static final boolean externalMemoryAvailable() {
        return C04220Ms.A0I(Environment.getExternalStorageState(), "mounted");
    }

    public static final long getAvailableExternal() {
        if (!externalMemoryAvailable()) {
            return -1;
        }
        synchronized (C14620pq.class) {
        }
        File externalStorageDirectory = Environment.getExternalStorageDirectory();
        C04220Ms.A06(externalStorageDirectory);
        StatFs statFs = new StatFs(externalStorageDirectory.getPath());
        return statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong();
    }

    public static final long getAvailableInternal() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        return statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0043, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        X.C102596Vu.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0047, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0051, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        X.C102596Vu.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0055, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void writeRandomData(java.io.File r7) {
        /*
            java.lang.String r2 = X.C18180wK.A0e()
            X.C04220Ms.A06(r2)
            java.util.Random r6 = new java.util.Random
            r6.<init>()
            java.lang.String r0 = "dummy"
            java.io.File r1 = new java.io.File
            r1.<init>(r7, r0)
            r1.mkdir()
            java.io.File r0 = new java.io.File
            r0.<init>(r1, r2)
            java.io.FileWriter r5 = new java.io.FileWriter     // Catch:{ IOException -> 0x0056 }
            r5.<init>(r0)     // Catch:{ IOException -> 0x0056 }
            java.io.BufferedWriter r4 = new java.io.BufferedWriter     // Catch:{ all -> 0x004f }
            r4.<init>(r5)     // Catch:{ all -> 0x004f }
            r3 = 0
        L_0x0026:
            r0 = 5000000(0x4c4b40, float:7.006492E-39)
            if (r3 >= r0) goto L_0x0048
            int r2 = r6.nextInt(r0)     // Catch:{ all -> 0x0041 }
            java.lang.String r1 = "\n  "
            java.lang.String r0 = "\n  \n  "
            java.lang.String r0 = X.AnonymousClass00U.A0S(r1, r0, r2)     // Catch:{ all -> 0x0041 }
            java.lang.String r0 = X.AnonymousClass4n8.A08(r0)     // Catch:{ all -> 0x0041 }
            r4.write(r0)     // Catch:{ all -> 0x0041 }
            int r3 = r3 + 1
            goto L_0x0026
        L_0x0041:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0043 }
        L_0x0043:
            r0 = move-exception
            X.C102596Vu.A00(r4, r1)     // Catch:{ all -> 0x004f }
            throw r0     // Catch:{ all -> 0x004f }
        L_0x0048:
            r4.close()     // Catch:{ all -> 0x004f }
            r5.close()     // Catch:{ IOException -> 0x0056 }
            return
        L_0x004f:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0051 }
        L_0x0051:
            r0 = move-exception
            X.C102596Vu.A00(r5, r1)     // Catch:{ IOException -> 0x0056 }
            throw r0     // Catch:{ IOException -> 0x0056 }
        L_0x0056:
            r2 = move-exception
            java.lang.String r1 = "DebugDiskUtils"
            java.lang.String r0 = "error writing data"
            X.AnonymousClass0LU.A0E(r1, r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.debug.devoptions.disk.DiskUtils.writeRandomData(java.io.File):void");
    }
}
