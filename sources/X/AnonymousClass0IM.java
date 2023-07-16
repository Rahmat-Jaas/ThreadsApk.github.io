package X;

import java.io.File;
import java.nio.MappedByteBuffer;

/* renamed from: X.0IM  reason: invalid class name */
public final class AnonymousClass0IM {
    public C03700Kj A00 = AnonymousClass0IY.A00;
    public final File A01;
    public final MappedByteBuffer A02;

    public final void A00() {
        MappedByteBuffer mappedByteBuffer = this.A02;
        int i = -1;
        int i2 = 0;
        long j = -1;
        do {
            int i3 = i2 << 3;
            long j2 = mappedByteBuffer.getLong(i3);
            if (j == -1 || j2 < j) {
                i = i3;
                j = j2;
            }
            i2++;
        } while (i2 < 40);
        mappedByteBuffer.putLong(i, System.currentTimeMillis());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00e1, code lost:
        if (r7 == null) goto L_0x00e9;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x00a4 A[Catch:{ FileNotFoundException -> 0x00c9, all -> 0x00e0 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass0IM(android.content.Context r10, java.io.File r11) {
        /*
            r9 = this;
            r9.<init>()
            X.0IY r0 = X.AnonymousClass0IY.A00
            r9.A00 = r0
            r9.A01 = r11
            r7 = 0
            java.lang.String r0 = "rw"
            java.io.RandomAccessFile r2 = new java.io.RandomAccessFile     // Catch:{ FileNotFoundException -> 0x0031 }
            r2.<init>(r11, r0)     // Catch:{ FileNotFoundException -> 0x0031 }
            r0 = 320(0x140, float:4.48E-43)
            long r7 = (long) r0     // Catch:{ FileNotFoundException -> 0x0031 }
            r2.setLength(r7)     // Catch:{ FileNotFoundException -> 0x002e, all -> 0x00e4 }
            java.nio.channels.FileChannel r3 = r2.getChannel()     // Catch:{ FileNotFoundException -> 0x002e, all -> 0x00e4 }
            java.nio.channels.FileChannel$MapMode r4 = java.nio.channels.FileChannel.MapMode.READ_WRITE     // Catch:{ FileNotFoundException -> 0x002e, all -> 0x00e4 }
            r5 = 0
            java.nio.MappedByteBuffer r1 = r3.map(r4, r5, r7)     // Catch:{ FileNotFoundException -> 0x002e, all -> 0x00e4 }
            r9.A02 = r1     // Catch:{ FileNotFoundException -> 0x002e, all -> 0x00e4 }
            java.nio.ByteOrder r0 = java.nio.ByteOrder.LITTLE_ENDIAN     // Catch:{ FileNotFoundException -> 0x002e, all -> 0x00e4 }
            r1.order(r0)     // Catch:{ FileNotFoundException -> 0x002e, all -> 0x00e4 }
            r2.close()
            return
        L_0x002e:
            r0 = move-exception
            r7 = r2
            goto L_0x0032
        L_0x0031:
            r0 = move-exception
        L_0x0032:
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x00e0 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x00e0 }
            r3.<init>(r0)     // Catch:{ all -> 0x00e0 }
            java.lang.String r0 = " path: "
            r3.append(r0)     // Catch:{ all -> 0x00e0 }
            java.lang.String r0 = r11.getCanonicalPath()     // Catch:{ all -> 0x00e0 }
            r3.append(r0)     // Catch:{ all -> 0x00e0 }
            java.lang.String r0 = " exists: "
            r3.append(r0)     // Catch:{ all -> 0x00e0 }
            boolean r0 = r11.exists()     // Catch:{ all -> 0x00e0 }
            r3.append(r0)     // Catch:{ all -> 0x00e0 }
            java.lang.String r0 = " canWrite: "
            r3.append(r0)     // Catch:{ all -> 0x00e0 }
            boolean r0 = r11.canWrite()     // Catch:{ all -> 0x00e0 }
            r3.append(r0)     // Catch:{ all -> 0x00e0 }
            java.lang.String r0 = " parent exists: "
            r3.append(r0)     // Catch:{ all -> 0x00e0 }
            java.io.File r0 = r11.getParentFile()     // Catch:{ all -> 0x00e0 }
            boolean r0 = r0.exists()     // Catch:{ all -> 0x00e0 }
            r3.append(r0)     // Catch:{ all -> 0x00e0 }
            java.lang.String r0 = " parent canWrite: "
            r3.append(r0)     // Catch:{ all -> 0x00e0 }
            java.io.File r0 = r11.getParentFile()     // Catch:{ all -> 0x00e0 }
            boolean r0 = r0.canWrite()     // Catch:{ all -> 0x00e0 }
            r3.append(r0)     // Catch:{ all -> 0x00e0 }
            r6 = 0
            java.lang.String r0 = "user"
            java.lang.Object r1 = r10.getSystemService(r0)     // Catch:{ all -> 0x00e0 }
            android.os.UserManager r1 = (android.os.UserManager) r1     // Catch:{ all -> 0x00e0 }
            android.os.UserHandle r0 = android.os.Process.myUserHandle()     // Catch:{ all -> 0x00e0 }
            long r0 = r1.getSerialNumberForUser(r0)     // Catch:{ all -> 0x00e0 }
            java.lang.String r2 = " user id: "
            r3.append(r2)     // Catch:{ all -> 0x00e0 }
            r3.append(r0)     // Catch:{ all -> 0x00e0 }
            java.lang.String r2 = " is system user: "
            r3.append(r2)     // Catch:{ all -> 0x00e0 }
            r4 = 0
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            r0 = 0
            if (r2 != 0) goto L_0x00a5
            r0 = 1
        L_0x00a5:
            r3.append(r0)     // Catch:{ all -> 0x00e0 }
            java.lang.String r0 = r11.getName()     // Catch:{ FileNotFoundException -> 0x00c9 }
            r10.openFileOutput(r0, r6)     // Catch:{ FileNotFoundException -> 0x00c9 }
            java.io.File r2 = r10.getFilesDir()     // Catch:{ FileNotFoundException -> 0x00c9 }
            java.lang.String r0 = r11.getName()     // Catch:{ FileNotFoundException -> 0x00c9 }
            java.io.File r1 = new java.io.File     // Catch:{ FileNotFoundException -> 0x00c9 }
            r1.<init>(r2, r0)     // Catch:{ FileNotFoundException -> 0x00c9 }
            java.lang.String r0 = " openFileOutput canwrite: "
            r3.append(r0)     // Catch:{ FileNotFoundException -> 0x00c9 }
            boolean r0 = r1.canWrite()     // Catch:{ FileNotFoundException -> 0x00c9 }
            r3.append(r0)     // Catch:{ FileNotFoundException -> 0x00c9 }
            goto L_0x00d6
        L_0x00c9:
            r1 = move-exception
            java.lang.String r0 = " openFileOutput error: "
            r3.append(r0)     // Catch:{ all -> 0x00e0 }
            java.lang.String r0 = r1.getMessage()     // Catch:{ all -> 0x00e0 }
            r3.append(r0)     // Catch:{ all -> 0x00e0 }
        L_0x00d6:
            java.lang.String r1 = r3.toString()     // Catch:{ all -> 0x00e0 }
            java.io.FileNotFoundException r0 = new java.io.FileNotFoundException     // Catch:{ all -> 0x00e0 }
            r0.<init>(r1)     // Catch:{ all -> 0x00e0 }
            throw r0     // Catch:{ all -> 0x00e0 }
        L_0x00e0:
            r0 = move-exception
            if (r7 == 0) goto L_0x00e9
            goto L_0x00e6
        L_0x00e4:
            r0 = move-exception
            r7 = r2
        L_0x00e6:
            r7.close()
        L_0x00e9:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0IM.<init>(android.content.Context, java.io.File):void");
    }
}
