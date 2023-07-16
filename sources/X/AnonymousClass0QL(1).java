package X;

import java.io.File;

/* renamed from: X.0QL  reason: invalid class name */
public final class AnonymousClass0QL {
    /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x006d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A01(java.io.File r9, java.lang.String r10, java.util.zip.ZipOutputStream r11) {
        /*
            java.io.File r0 = new java.io.File
            r0.<init>(r9, r10)
            java.io.File r8 = r0.getAbsoluteFile()
            java.net.URI r7 = r9.toURI()
            java.lang.String[] r6 = r8.list()
            int r5 = r6.length
            r4 = 0
        L_0x0013:
            if (r4 >= r5) goto L_0x0073
            r0 = r6[r4]
            java.io.File r2 = new java.io.File
            r2.<init>(r8, r0)
            boolean r0 = r2.exists()
            if (r0 == 0) goto L_0x0066
            java.net.URI r0 = r2.toURI()
            java.net.URI r0 = r7.relativize(r0)
            java.lang.String r1 = r0.getPath()
            boolean r0 = r2.isFile()
            if (r0 == 0) goto L_0x0059
            java.io.File r0 = new java.io.File     // Catch:{ all -> 0x006e }
            r0.<init>(r9, r1)     // Catch:{ all -> 0x006e }
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch:{ all -> 0x006e }
            r3.<init>(r0)     // Catch:{ all -> 0x006e }
            r0 = 1024(0x400, float:1.435E-42)
            byte[] r2 = new byte[r0]     // Catch:{ all -> 0x0069 }
            java.util.zip.ZipEntry r0 = new java.util.zip.ZipEntry     // Catch:{ all -> 0x0069 }
            r0.<init>(r1)     // Catch:{ all -> 0x0069 }
            r11.putNextEntry(r0)     // Catch:{ all -> 0x0069 }
        L_0x004a:
            int r1 = r3.read(r2)     // Catch:{ all -> 0x0069 }
            if (r1 <= 0) goto L_0x0055
            r0 = 0
            r11.write(r2, r0, r1)     // Catch:{ all -> 0x0069 }
            goto L_0x004a
        L_0x0055:
            r3.close()     // Catch:{ all -> 0x006e }
            goto L_0x0063
        L_0x0059:
            boolean r0 = r2.isDirectory()
            if (r0 == 0) goto L_0x0066
            A01(r9, r1, r11)
            goto L_0x0066
        L_0x0063:
            r11.closeEntry()
        L_0x0066:
            int r4 = r4 + 1
            goto L_0x0013
        L_0x0069:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x006d }
        L_0x006d:
            throw r0     // Catch:{ all -> 0x006e }
        L_0x006e:
            r0 = move-exception
            r11.closeEntry()
            throw r0
        L_0x0073:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0QL.A01(java.io.File, java.lang.String, java.util.zip.ZipOutputStream):void");
    }

    public static void A00(File file) {
        if (file.isDirectory()) {
            String[] list = file.list();
            if (list != null) {
                for (String file2 : list) {
                    File file3 = new File(file, file2);
                    if (file3.isDirectory()) {
                        A00(file3);
                    } else {
                        file3.delete();
                    }
                }
            }
            file.delete();
        }
    }
}
