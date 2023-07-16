package com.facebook.msys.mci;

import X.AnonymousClass737;
import X.C86114wI;
import X.C86144wL;
import X.C86154wM;
import android.content.ContentResolver;
import com.facebook.redex.IDxComparatorShape95S0000000_2_I2;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Arrays;

public class FileManager {
    public static File mCacheDir;
    public static ContentResolver mContentResolver;
    public static boolean sInitialized;

    public static native void nativeInitialize();

    public static void copyInputStreamIntoOutputStream(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = new byte[1024];
        while (true) {
            int read = inputStream.read(bArr);
            if (read >= 0) {
                outputStream.write(bArr, 0, read);
            } else {
                return;
            }
        }
    }

    public static String createCacheDirectory(String str) {
        File A0U = C86154wM.A0U(mCacheDir, str);
        if ((!A0U.exists() || !A0U.isDirectory()) && !A0U.mkdirs()) {
            return null;
        }
        return A0U.toString();
    }

    public static String getCacheDirectory() {
        return mCacheDir.toString();
    }

    public static synchronized File getFileFromPathWithOptionalScheme(String str) {
        File file;
        synchronized (FileManager.class) {
            if (str.startsWith("file://")) {
                try {
                    file = new File(new URI(str));
                } catch (URISyntaxException e) {
                    throw C86114wI.A0k(e);
                }
            } else if (str.startsWith("cache://")) {
                file = C86154wM.A0U(mCacheDir, str.substring(8));
            } else {
                file = C86144wL.A0Z(str);
            }
        }
        return file;
    }

    public static boolean isMCPEnabledForFileManager() {
        return false;
    }

    static {
        AnonymousClass737.A00();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0099, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x009a, code lost:
        r1 = r0.getMessage();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x009e, code lost:
        if (r1 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x00ac, code lost:
        return 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:?, code lost:
        return 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:?, code lost:
        return 1;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:17:0x003c, B:48:0x007a, B:68:0x0098] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:32:0x005b */
    /* JADX WARNING: Missing exception handler attribute for start block: B:38:0x0062 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:63:0x0093 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:68:0x0098 */
    /* JADX WARNING: Removed duplicated region for block: B:76:? A[ExcHandler: FileNotFoundException (unused java.io.FileNotFoundException), SYNTHETIC, Splitter:B:17:0x003c] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:38:0x0062=Splitter:B:38:0x0062, B:68:0x0098=Splitter:B:68:0x0098} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int copyFile(java.lang.String r5, java.lang.String r6) {
        /*
            java.io.File r4 = getFileFromPathWithOptionalScheme(r6)
            boolean r0 = r4.exists()
            if (r0 == 0) goto L_0x000c
            r3 = 2
        L_0x000b:
            return r3
        L_0x000c:
            java.io.File r0 = getFileFromPathWithOptionalScheme(r6)
            java.io.File r1 = r0.getParentFile()
            if (r1 == 0) goto L_0x001f
            boolean r0 = r1.exists()
            if (r0 != 0) goto L_0x001f
            r1.mkdirs()
        L_0x001f:
            java.lang.String r0 = "content://"
            boolean r0 = r5.startsWith(r0)
            if (r0 == 0) goto L_0x0076
            android.content.ContentResolver r0 = mContentResolver
            if (r0 != 0) goto L_0x002d
            r3 = 5
            return r3
        L_0x002d:
            X.0sy r1 = new X.0sy
            r1.<init>()
            r0 = 0
            android.net.Uri r1 = X.C15430rJ.A00(r1, r5, r0)
            if (r1 != 0) goto L_0x003b
            r3 = 3
            return r3
        L_0x003b:
            r3 = 1
            android.content.ContentResolver r0 = mContentResolver     // Catch:{ FileNotFoundException -> 0x00ac, IOException -> 0x0063 }
            java.io.InputStream r2 = r0.openInputStream(r1)     // Catch:{ FileNotFoundException -> 0x00ac, IOException -> 0x0063 }
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ all -> 0x005c }
            r1.<init>(r4)     // Catch:{ all -> 0x005c }
            if (r2 != 0) goto L_0x004d
            r1.close()     // Catch:{ all -> 0x005c }
            goto L_0x0073
        L_0x004d:
            copyInputStreamIntoOutputStream(r2, r1)     // Catch:{ all -> 0x0057 }
            r1.close()     // Catch:{ all -> 0x005c }
            r2.close()     // Catch:{ FileNotFoundException -> 0x00ac, IOException -> 0x0063 }
            goto L_0x0074
        L_0x0057:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x005b }
        L_0x005b:
            throw r0     // Catch:{ all -> 0x005c }
        L_0x005c:
            r0 = move-exception
            if (r2 == 0) goto L_0x0062
            r2.close()     // Catch:{ all -> 0x0062 }
        L_0x0062:
            throw r0     // Catch:{ FileNotFoundException -> 0x00ac, IOException -> 0x0063 }
        L_0x0063:
            r0 = move-exception
            java.lang.String r1 = r0.getMessage()
            if (r1 == 0) goto L_0x000b
            java.lang.String r0 = "space"
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x000b
            goto L_0x00a8
        L_0x0073:
            return r3
        L_0x0074:
            r3 = 0
            return r3
        L_0x0076:
            java.io.File r0 = getFileFromPathWithOptionalScheme(r5)
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ FileNotFoundException -> 0x00ac, IOException -> 0x0099 }
            r2.<init>(r0)     // Catch:{ FileNotFoundException -> 0x00ac, IOException -> 0x0099 }
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ all -> 0x0094 }
            r1.<init>(r4)     // Catch:{ all -> 0x0094 }
            copyInputStreamIntoOutputStream(r2, r1)     // Catch:{ all -> 0x008f }
            r3 = 0
            r1.close()     // Catch:{ all -> 0x0094 }
            r2.close()     // Catch:{ FileNotFoundException -> 0x00ac, IOException -> 0x0099 }
            return r3
        L_0x008f:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x0093 }
        L_0x0093:
            throw r0     // Catch:{ all -> 0x0094 }
        L_0x0094:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x0098 }
        L_0x0098:
            throw r0     // Catch:{ FileNotFoundException -> 0x00ac, IOException -> 0x0099 }
        L_0x0099:
            r0 = move-exception
            java.lang.String r1 = r0.getMessage()
            if (r1 == 0) goto L_0x00aa
            java.lang.String r0 = "space"
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x00aa
        L_0x00a8:
            r3 = 4
            return r3
        L_0x00aa:
            r3 = 1
            return r3
        L_0x00ac:
            r3 = 3
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.msys.mci.FileManager.copyFile(java.lang.String, java.lang.String):int");
    }

    public static int createDirectory(String str) {
        File fileFromPathWithOptionalScheme = getFileFromPathWithOptionalScheme(str);
        if ((!fileFromPathWithOptionalScheme.exists() || !fileFromPathWithOptionalScheme.isDirectory()) && !fileFromPathWithOptionalScheme.mkdirs()) {
            return 7;
        }
        return 0;
    }

    public static boolean deleteItem(String str) {
        return deleteItemRecursive(getFileFromPathWithOptionalScheme(str));
    }

    public static boolean deleteItemRecursive(File file) {
        boolean delete;
        if (!file.isDirectory()) {
            return file.delete();
        }
        boolean z = true;
        for (File file2 : file.listFiles()) {
            if (file2.isDirectory()) {
                if (z) {
                    delete = deleteItemRecursive(file2);
                }
                z = false;
            } else {
                if (z) {
                    delete = file2.delete();
                }
                z = false;
            }
            z = true;
            if (delete) {
            }
            z = false;
        }
        if (!file.delete() || !z) {
            return false;
        }
        return true;
    }

    public static boolean itemExists(String str) {
        return getFileFromPathWithOptionalScheme(str).exists();
    }

    public static String[] listDirectory(String str) {
        File[] listFiles = getFileFromPathWithOptionalScheme(str).listFiles();
        if (listFiles == null) {
            return null;
        }
        int length = listFiles.length;
        if (length > 1) {
            Arrays.sort(listFiles, new IDxComparatorShape95S0000000_2_I2(7));
        }
        String[] strArr = new String[length];
        for (int i = 0; i < length; i++) {
            strArr[i] = listFiles[i].getAbsolutePath();
        }
        return strArr;
    }

    public static int moveFile(String str, String str2) {
        File fileFromPathWithOptionalScheme = getFileFromPathWithOptionalScheme(str);
        File fileFromPathWithOptionalScheme2 = getFileFromPathWithOptionalScheme(str2);
        if (fileFromPathWithOptionalScheme.equals(fileFromPathWithOptionalScheme2) || fileFromPathWithOptionalScheme.renameTo(fileFromPathWithOptionalScheme2)) {
            return 0;
        }
        int copyFile = copyFile(str, str2);
        if (copyFile != 0) {
            return copyFile;
        }
        if (!fileFromPathWithOptionalScheme.delete()) {
            return 8;
        }
        return 0;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x0030 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] readFile(java.lang.String r6) {
        /*
            java.io.File r1 = getFileFromPathWithOptionalScheme(r6)     // Catch:{ IOException -> 0x0031 }
            java.lang.String r6 = "Cannot read more than 2GB into an array"
            java.lang.String r0 = "r"
            java.io.RandomAccessFile r5 = new java.io.RandomAccessFile     // Catch:{ IOException -> 0x0031 }
            r5.<init>(r1, r0)     // Catch:{ IOException -> 0x0031 }
            long r3 = r5.length()     // Catch:{ all -> 0x002c }
            r1 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0022
            int r0 = (int) r3     // Catch:{ all -> 0x002c }
            byte[] r0 = new byte[r0]     // Catch:{ all -> 0x002c }
            r5.readFully(r0)     // Catch:{ all -> 0x002c }
            r5.close()     // Catch:{ IOException -> 0x0031 }
            return r0
        L_0x0022:
            java.lang.String r0 = "FileUtils"
            android.util.Log.e(r0, r6)     // Catch:{ all -> 0x002c }
            java.io.IOException r0 = X.C86154wM.A0V(r6)     // Catch:{ all -> 0x002c }
            throw r0     // Catch:{ all -> 0x002c }
        L_0x002c:
            r0 = move-exception
            r5.close()     // Catch:{ all -> 0x0030 }
        L_0x0030:
            throw r0     // Catch:{ IOException -> 0x0031 }
        L_0x0031:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.msys.mci.FileManager.readFile(java.lang.String):byte[]");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0030 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x0035 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int writeDataToFile(byte[] r2, java.lang.String r3, boolean r4) {
        /*
            java.io.File r0 = getFileFromPathWithOptionalScheme(r3)
            java.io.File r1 = r0.getParentFile()
            if (r1 == 0) goto L_0x0013
            boolean r0 = r1.exists()
            if (r0 != 0) goto L_0x0013
            r1.mkdirs()
        L_0x0013:
            java.io.File r0 = getFileFromPathWithOptionalScheme(r3)
            java.io.ByteArrayInputStream r3 = new java.io.ByteArrayInputStream     // Catch:{ FileNotFoundException -> 0x0048, IOException -> 0x0036 }
            r3.<init>(r2)     // Catch:{ FileNotFoundException -> 0x0048, IOException -> 0x0036 }
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ all -> 0x0031 }
            r2.<init>(r0, r4)     // Catch:{ all -> 0x0031 }
            copyInputStreamIntoOutputStream(r3, r2)     // Catch:{ all -> 0x002c }
            r1 = 0
            r2.close()     // Catch:{ all -> 0x0031 }
            r3.close()     // Catch:{ FileNotFoundException -> 0x0048, IOException -> 0x0036 }
            return r1
        L_0x002c:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x0030 }
        L_0x0030:
            throw r0     // Catch:{ all -> 0x0031 }
        L_0x0031:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x0035 }
        L_0x0035:
            throw r0     // Catch:{ FileNotFoundException -> 0x0048, IOException -> 0x0036 }
        L_0x0036:
            r0 = move-exception
            java.lang.String r1 = r0.getMessage()
            if (r1 == 0) goto L_0x0046
            java.lang.String r0 = "space"
            boolean r0 = r1.contains(r0)
            r1 = 4
            if (r0 != 0) goto L_0x0047
        L_0x0046:
            r1 = 1
        L_0x0047:
            return r1
        L_0x0048:
            r0 = 3
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.msys.mci.FileManager.writeDataToFile(byte[], java.lang.String, boolean):int");
    }
}
