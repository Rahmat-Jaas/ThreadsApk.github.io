package X;

import java.io.File;
import java.nio.MappedByteBuffer;

/* renamed from: X.0Xx  reason: invalid class name and case insensitive filesystem */
public class C06160Xx {
    public MappedByteBuffer A00;
    public final int A01;
    public final File A02;

    public void mlockBuffer() {
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x0048 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C06160Xx(java.io.File r10, int r11) {
        /*
            r9 = this;
            r9.<init>()
            r0 = 65536(0x10000, float:9.18355E-41)
            if (r11 > r0) goto L_0x004e
            r9.A02 = r10
            r9.A01 = r11
            java.lang.String r0 = "rw"
            java.io.RandomAccessFile r2 = new java.io.RandomAccessFile
            r2.<init>(r10, r0)
            java.nio.channels.FileChannel r3 = r2.getChannel()     // Catch:{ all -> 0x0049 }
            java.nio.channels.FileChannel$MapMode r4 = java.nio.channels.FileChannel.MapMode.READ_WRITE     // Catch:{ all -> 0x0042 }
            r5 = 0
            long r7 = (long) r11     // Catch:{ all -> 0x0042 }
            java.nio.MappedByteBuffer r0 = r3.map(r4, r5, r7)     // Catch:{ all -> 0x0042 }
            r9.A00 = r0     // Catch:{ all -> 0x0042 }
            java.nio.channels.FileLock r0 = r3.tryLock()     // Catch:{ all -> 0x0042 }
            if (r0 == 0) goto L_0x002e
            r3.close()     // Catch:{ all -> 0x0049 }
            r2.close()
            return
        L_0x002e:
            java.lang.String r1 = "Unable to acquire lock for app state log aslFile: %s"
            java.lang.String r0 = r10.getCanonicalPath()     // Catch:{ all -> 0x0042 }
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch:{ all -> 0x0042 }
            java.lang.String r1 = java.lang.String.format(r1, r0)     // Catch:{ all -> 0x0042 }
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x0042 }
            r0.<init>(r1)     // Catch:{ all -> 0x0042 }
            throw r0     // Catch:{ all -> 0x0042 }
        L_0x0042:
            r0 = move-exception
            if (r3 == 0) goto L_0x0048
            r3.close()     // Catch:{ all -> 0x0048 }
        L_0x0048:
            throw r0     // Catch:{ all -> 0x0049 }
        L_0x0049:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x004d }
        L_0x004d:
            throw r0
        L_0x004e:
            java.lang.String r0 = "Size too big for file: "
            java.lang.String r1 = X.AnonymousClass00U.A0J(r0, r11)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C06160Xx.<init>(java.io.File, int):void");
    }
}
