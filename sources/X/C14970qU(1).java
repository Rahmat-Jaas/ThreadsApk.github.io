package X;

import java.io.File;

/* renamed from: X.0qU  reason: invalid class name and case insensitive filesystem */
public final class C14970qU implements Runnable {
    public final /* synthetic */ C15180qs A00;
    public final /* synthetic */ C14950qS A01;
    public final /* synthetic */ AnonymousClass0EA A02;
    public final /* synthetic */ File A03;
    public final /* synthetic */ File A04;
    public final /* synthetic */ byte[] A05;

    public C14970qU(C15180qs r1, C14950qS r2, AnonymousClass0EA r3, File file, File file2, byte[] bArr) {
        this.A02 = r3;
        this.A03 = file;
        this.A05 = bArr;
        this.A01 = r2;
        this.A04 = file2;
        this.A00 = r1;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x006b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r9 = this;
            java.lang.String r3 = "rw"
            java.lang.String r7 = "fb-UnpackingSoSource"
            r6 = 2
            android.util.Log.isLoggable(r7, r6)     // Catch:{ all -> 0x006c }
            java.io.File r0 = r9.A03     // Catch:{ all -> 0x006c }
            java.io.RandomAccessFile r2 = new java.io.RandomAccessFile     // Catch:{ all -> 0x006c }
            r2.<init>(r0, r3)     // Catch:{ all -> 0x006c }
            byte[] r0 = r9.A05     // Catch:{ all -> 0x0067 }
            r2.write(r0)     // Catch:{ all -> 0x0067 }
            long r0 = r2.getFilePointer()     // Catch:{ all -> 0x0067 }
            r2.setLength(r0)     // Catch:{ all -> 0x0067 }
            r2.close()     // Catch:{ all -> 0x006c }
            X.0EA r0 = r9.A02     // Catch:{ all -> 0x006c }
            java.io.File r8 = r0.A00     // Catch:{ all -> 0x006c }
            java.lang.String r1 = "dso_manifest"
            java.io.File r0 = new java.io.File     // Catch:{ all -> 0x006c }
            r0.<init>(r8, r1)     // Catch:{ all -> 0x006c }
            java.io.RandomAccessFile r5 = new java.io.RandomAccessFile     // Catch:{ all -> 0x006c }
            r5.<init>(r0, r3)     // Catch:{ all -> 0x006c }
            X.0qS r0 = r9.A01     // Catch:{ all -> 0x0062 }
            r4 = 1
            r5.writeByte(r4)     // Catch:{ all -> 0x0062 }
            X.0qT[] r3 = r0.A00     // Catch:{ all -> 0x0062 }
            int r2 = r3.length     // Catch:{ all -> 0x0062 }
            r5.writeInt(r2)     // Catch:{ all -> 0x0062 }
            r1 = 0
        L_0x003b:
            if (r1 >= r2) goto L_0x004e
            r0 = r3[r1]     // Catch:{ all -> 0x0062 }
            java.lang.String r0 = r0.A01     // Catch:{ all -> 0x0062 }
            r5.writeUTF(r0)     // Catch:{ all -> 0x0062 }
            r0 = r3[r1]     // Catch:{ all -> 0x0062 }
            java.lang.String r0 = r0.A00     // Catch:{ all -> 0x0062 }
            r5.writeUTF(r0)     // Catch:{ all -> 0x0062 }
            int r1 = r1 + 1
            goto L_0x003b
        L_0x004e:
            r5.close()     // Catch:{ all -> 0x006c }
            X.C14990qW.A03(r8)     // Catch:{ all -> 0x006c }
            java.io.File r0 = r9.A04     // Catch:{ all -> 0x006c }
            X.AnonymousClass0EA.A00(r0, r4)     // Catch:{ all -> 0x006c }
            android.util.Log.isLoggable(r7, r6)     // Catch:{ IOException -> 0x0076 }
            X.0qs r0 = r9.A00     // Catch:{ IOException -> 0x0076 }
            r0.close()     // Catch:{ IOException -> 0x0076 }
            return
        L_0x0062:
            r0 = move-exception
            r5.close()     // Catch:{ all -> 0x006b }
            goto L_0x006b
        L_0x0067:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x006b }
        L_0x006b:
            throw r0     // Catch:{ all -> 0x006c }
        L_0x006c:
            r1 = move-exception
            android.util.Log.isLoggable(r7, r6)     // Catch:{ IOException -> 0x0076 }
            X.0qs r0 = r9.A00     // Catch:{ IOException -> 0x0076 }
            r0.close()     // Catch:{ IOException -> 0x0076 }
            throw r1     // Catch:{ IOException -> 0x0076 }
        L_0x0076:
            r1 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14970qU.run():void");
    }
}
