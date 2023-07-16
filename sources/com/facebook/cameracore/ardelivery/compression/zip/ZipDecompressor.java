package com.facebook.cameracore.ardelivery.compression.zip;

import X.AnonymousClass00U;
import X.C86144wL;
import java.io.File;

public class ZipDecompressor {
    public static final String TAG = "ZipDecompressor";
    public static final int UNZIP_BUFFER_SIZE = 4096;

    /* JADX WARNING: type inference failed for: r1v2, types: [java.io.OutputStream, java.io.Closeable, java.io.BufferedOutputStream] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int unZipToFolderBuffered(java.io.InputStream r11, java.lang.String r12) {
        /*
            r10 = 0
            java.util.zip.ZipInputStream r3 = new java.util.zip.ZipInputStream     // Catch:{ all -> 0x00b7 }
            r3.<init>(r11)     // Catch:{ all -> 0x00b7 }
            java.io.BufferedInputStream r4 = new java.io.BufferedInputStream     // Catch:{ all -> 0x00b5 }
            r4.<init>(r3)     // Catch:{ all -> 0x00b5 }
            java.lang.String r0 = ""
            createDirIfNotExist(r12, r0)     // Catch:{ all -> 0x00ba }
            r0 = 4096(0x1000, float:5.74E-42)
            byte[] r7 = new byte[r0]     // Catch:{ all -> 0x00ba }
            r6 = 0
            r9 = 0
        L_0x0016:
            java.util.zip.ZipEntry r1 = r3.getNextEntry()     // Catch:{ all -> 0x00ba }
            if (r1 == 0) goto L_0x00ae
            java.lang.String r8 = r1.getName()     // Catch:{ all -> 0x00ba }
            java.lang.String r0 = ".."
            java.lang.String r2 = java.io.File.separator     // Catch:{ all -> 0x00ba }
            java.lang.String r0 = X.AnonymousClass00U.A0L(r0, r2)     // Catch:{ all -> 0x00ba }
            boolean r0 = r8.contains(r0)     // Catch:{ all -> 0x00ba }
            if (r0 != 0) goto L_0x009c
            boolean r0 = r1.isDirectory()     // Catch:{ all -> 0x00ba }
            if (r0 == 0) goto L_0x0038
            createDirIfNotExist(r12, r8)     // Catch:{ all -> 0x00ba }
            goto L_0x0016
        L_0x0038:
            int r0 = r8.lastIndexOf(r2)     // Catch:{ all -> 0x00ba }
            r5 = -1
            if (r0 == r5) goto L_0x004e
            java.lang.String r0 = r8.substring(r6, r0)     // Catch:{ all -> 0x00ba }
            java.lang.String r0 = X.AnonymousClass00U.A0V(r12, r2, r0)     // Catch:{ all -> 0x00ba }
            java.io.File r0 = X.C86144wL.A0Z(r0)     // Catch:{ all -> 0x00ba }
            r0.mkdirs()     // Catch:{ all -> 0x00ba }
        L_0x004e:
            java.io.File r0 = new java.io.File     // Catch:{ all -> 0x00ba }
            r0.<init>(r12, r8)     // Catch:{ all -> 0x00ba }
            java.lang.String r1 = r0.getCanonicalPath()     // Catch:{ all -> 0x00ba }
            java.io.File r0 = X.C86144wL.A0Z(r12)     // Catch:{ all -> 0x00ba }
            java.lang.String r0 = r0.getCanonicalPath()     // Catch:{ all -> 0x00ba }
            boolean r0 = r1.startsWith(r0)     // Catch:{ all -> 0x00ba }
            if (r0 == 0) goto L_0x00a3
            java.lang.String r0 = X.AnonymousClass00U.A0V(r12, r2, r8)     // Catch:{ all -> 0x0090 }
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ all -> 0x0090 }
            r2.<init>(r0)     // Catch:{ all -> 0x0090 }
            java.io.BufferedOutputStream r1 = new java.io.BufferedOutputStream     // Catch:{ all -> 0x008e }
            r1.<init>(r2)     // Catch:{ all -> 0x008e }
        L_0x0073:
            int r0 = r4.read(r7)     // Catch:{ all -> 0x008b }
            if (r0 == r5) goto L_0x007e
            r1.write(r7, r6, r0)     // Catch:{ all -> 0x008b }
            int r9 = r9 + r0
            goto L_0x0073
        L_0x007e:
            r1.flush()     // Catch:{ all -> 0x008b }
            r3.closeEntry()     // Catch:{ all -> 0x00ba }
            X.AnonymousClass6GR.A00(r1)     // Catch:{ all -> 0x00ba }
            X.AnonymousClass6GR.A00(r2)     // Catch:{ all -> 0x00ba }
            goto L_0x0016
        L_0x008b:
            r0 = move-exception
            r10 = r1
            goto L_0x0092
        L_0x008e:
            r0 = move-exception
            goto L_0x0092
        L_0x0090:
            r0 = move-exception
            r2 = r10
        L_0x0092:
            r3.closeEntry()     // Catch:{ all -> 0x00ba }
            X.AnonymousClass6GR.A00(r10)     // Catch:{ all -> 0x00ba }
            X.AnonymousClass6GR.A00(r2)     // Catch:{ all -> 0x00ba }
            goto L_0x00ad
        L_0x009c:
            java.lang.String r0 = "zipEntryName contains ../"
            java.io.IOException r0 = X.C86154wM.A0V(r0)     // Catch:{ all -> 0x00ba }
            goto L_0x00ad
        L_0x00a3:
            java.lang.String r0 = "ZIP input flows into path traversal sink. The generated file doesn't start with "
            java.lang.String r0 = X.AnonymousClass00U.A0L(r0, r12)     // Catch:{ all -> 0x00ba }
            java.io.IOException r0 = X.C86154wM.A0V(r0)     // Catch:{ all -> 0x00ba }
        L_0x00ad:
            throw r0     // Catch:{ all -> 0x00ba }
        L_0x00ae:
            X.AnonymousClass6GR.A00(r4)
            X.AnonymousClass6GR.A00(r3)
            return r9
        L_0x00b5:
            r0 = move-exception
            goto L_0x00bc
        L_0x00b7:
            r0 = move-exception
            r3 = r10
            goto L_0x00bc
        L_0x00ba:
            r0 = move-exception
            r10 = r4
        L_0x00bc:
            X.AnonymousClass6GR.A00(r10)
            X.AnonymousClass6GR.A00(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor.unZipToFolderBuffered(java.io.InputStream, java.lang.String):int");
    }

    public static void createDirIfNotExist(String str, String str2) {
        File A0Z = C86144wL.A0Z(AnonymousClass00U.A0V(str, File.separator, str2));
        if (!A0Z.isDirectory()) {
            A0Z.mkdirs();
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0027 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C1192874j decompress(java.lang.String r4, java.lang.String r5) {
        /*
            r3 = this;
            X.1z9 r0 = new X.1z9     // Catch:{ IOException | IllegalArgumentException -> 0x0028 }
            r0.<init>((java.lang.String) r4)     // Catch:{ IOException | IllegalArgumentException -> 0x0028 }
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ IOException | IllegalArgumentException -> 0x0028 }
            r2.<init>(r0)     // Catch:{ IOException | IllegalArgumentException -> 0x0028 }
            int r0 = unZipToFolderBuffered(r2, r5)     // Catch:{ all -> 0x0023 }
            if (r0 <= 0) goto L_0x001a
            java.io.File r1 = X.C86144wL.A0Z(r5)     // Catch:{ all -> 0x0023 }
            X.74j r0 = new X.74j     // Catch:{ all -> 0x0023 }
            r0.<init>(r1)     // Catch:{ all -> 0x0023 }
            goto L_0x001f
        L_0x001a:
            X.74j r0 = new X.74j     // Catch:{ all -> 0x0023 }
            r0.<init>()     // Catch:{ all -> 0x0023 }
        L_0x001f:
            r2.close()     // Catch:{ IOException | IllegalArgumentException -> 0x0028 }
            return r0
        L_0x0023:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x0027 }
        L_0x0027:
            throw r0     // Catch:{ IOException | IllegalArgumentException -> 0x0028 }
        L_0x0028:
            r0 = move-exception
            java.lang.String r1 = "Failed to unzip:"
            java.lang.String r0 = r0.getMessage()
            X.AnonymousClass00U.A0L(r1, r0)
            X.74j r0 = new X.74j
            r0.<init>()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor.decompress(java.lang.String, java.lang.String):X.74j");
    }
}
