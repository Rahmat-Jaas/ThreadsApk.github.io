package ch.boye.httpclientandroidlib.impl.client.cache;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class IOUtils {
    public static void copy(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = new byte[2048];
        while (true) {
            int read = inputStream.read(bArr);
            if (read != -1) {
                outputStream.write(bArr, 0, read);
            } else {
                return;
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:15|16|17|18|19|20) */
    /* JADX WARNING: Can't wrap try/catch for region: R(7:8|9|10|11|12|13|14) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0030 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0033 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x0038 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void copyFile(java.io.File r7, java.io.File r8) {
        /*
            java.lang.String r0 = "r"
            java.io.RandomAccessFile r2 = new java.io.RandomAccessFile
            r2.<init>(r7, r0)
            java.lang.String r0 = "w"
            java.io.RandomAccessFile r1 = new java.io.RandomAccessFile
            r1.<init>(r8, r0)
            java.nio.channels.FileChannel r3 = r2.getChannel()     // Catch:{ IOException -> 0x0034 }
            java.nio.channels.FileChannel r8 = r1.getChannel()     // Catch:{ IOException -> 0x0034 }
            r4 = 0
            long r6 = r2.length()     // Catch:{ IOException -> 0x002c }
            r3.transferTo(r4, r6, r8)     // Catch:{ IOException -> 0x002c }
            r3.close()     // Catch:{ IOException -> 0x002c }
            r8.close()     // Catch:{ IOException -> 0x002c }
            r2.close()     // Catch:{ IOException -> 0x0034 }
            r1.close()     // Catch:{ IOException -> 0x0034 }
            return
        L_0x002c:
            r0 = move-exception
            r3.close()     // Catch:{ IOException -> 0x0030 }
        L_0x0030:
            r8.close()     // Catch:{ IOException -> 0x0033 }
        L_0x0033:
            throw r0     // Catch:{ IOException -> 0x0034 }
        L_0x0034:
            r0 = move-exception
            r2.close()     // Catch:{ IOException -> 0x0038 }
        L_0x0038:
            r1.close()     // Catch:{ IOException -> 0x003b }
        L_0x003b:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ch.boye.httpclientandroidlib.impl.client.cache.IOUtils.copyFile(java.io.File, java.io.File):void");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:3|4|5|6|7|8) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x000e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void copyAndClose(java.io.InputStream r1, java.io.OutputStream r2) {
        /*
            copy(r1, r2)     // Catch:{ IOException -> 0x000a }
            r1.close()     // Catch:{ IOException -> 0x000a }
            r2.close()     // Catch:{ IOException -> 0x000a }
            return
        L_0x000a:
            r0 = move-exception
            r1.close()     // Catch:{ IOException -> 0x000e }
        L_0x000e:
            r2.close()     // Catch:{ IOException -> 0x0011 }
        L_0x0011:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ch.boye.httpclientandroidlib.impl.client.cache.IOUtils.copyAndClose(java.io.InputStream, java.io.OutputStream):void");
    }

    public static void closeSilently(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException unused) {
        }
    }
}
