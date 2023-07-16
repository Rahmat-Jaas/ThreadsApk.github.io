package X;

import java.io.InputStream;

/* renamed from: X.0jL  reason: invalid class name and case insensitive filesystem */
public final class C11020jL extends C14920qP {
    public int A00;
    public final InputStream A01;
    public final /* synthetic */ AnonymousClass0NH A02;

    public final C14940qR A00() {
        C12780mT r1;
        while (true) {
            r1 = null;
            int i = this.A00;
            AnonymousClass08E[] r2 = this.A02.A02;
            if (i >= r2.length) {
                break;
            }
            this.A00 = i + 1;
            AnonymousClass08E r3 = r2[i];
            C14860qH r22 = new C14860qH(this, r3.A02);
            try {
                r1 = new C12780mT(r3, r22);
                if (r3.A00) {
                    break;
                }
                r1.close();
            } catch (Throwable th) {
                r22.close();
                throw th;
            }
        }
        return r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0091, code lost:
        r7.A01 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0097, code lost:
        if (A01() != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0099, code lost:
        close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C11020jL(X.AnonymousClass0NH r8) {
        /*
            r7 = this;
            r7.A02 = r8
            r7.<init>()
            java.util.zip.ZipFile r1 = r8.A01
            java.util.zip.ZipEntry r0 = r8.A00
            java.io.InputStream r3 = r1.getInputStream(r0)
            X.03e r0 = r8.A03     // Catch:{ all -> 0x009d }
            X.0q9 r6 = r0.A00     // Catch:{ all -> 0x009d }
            int r0 = r6.ordinal()     // Catch:{ all -> 0x009d }
            switch(r0) {
                case 0: goto L_0x008c;
                case 1: goto L_0x0020;
                case 2: goto L_0x0042;
                case 3: goto L_0x0042;
                case 4: goto L_0x0042;
                case 5: goto L_0x0042;
                default: goto L_0x0018;
            }     // Catch:{ all -> 0x009d }
        L_0x0018:
            java.lang.String r0 = "Unknown compression algorithm"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x009d }
            r1.<init>(r0)     // Catch:{ all -> 0x009d }
        L_0x001f:
            throw r1     // Catch:{ all -> 0x009d }
        L_0x0020:
            java.lang.String r0 = "com.facebook.zstd.ZstdInputStream"
            java.lang.Class r1 = java.lang.Class.forName(r0)     // Catch:{ Exception -> 0x003b }
            java.lang.Class<java.io.InputStream> r0 = java.io.InputStream.class
            java.lang.Class[] r0 = new java.lang.Class[]{r0}     // Catch:{ Exception -> 0x003b }
            java.lang.reflect.Constructor r1 = r1.getConstructor(r0)     // Catch:{ Exception -> 0x003b }
            java.lang.Object[] r0 = new java.lang.Object[]{r3}     // Catch:{ Exception -> 0x003b }
            java.lang.Object r0 = r1.newInstance(r0)     // Catch:{ Exception -> 0x003b }
            java.io.InputStream r0 = (java.io.InputStream) r0     // Catch:{ Exception -> 0x003b }
            goto L_0x0091
        L_0x003b:
            r0 = move-exception
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x009d }
            r1.<init>(r0)     // Catch:{ all -> 0x009d }
            goto L_0x001f
        L_0x0042:
            X.0q9 r0 = X.AnonymousClass0q9.SUPERPACK_OB     // Catch:{ all -> 0x009d }
            if (r6 != r0) goto L_0x0049
            java.lang.String r5 = "spo"
            goto L_0x0059
        L_0x0049:
            X.0q9 r0 = X.AnonymousClass0q9.SUPERPACK_XZ     // Catch:{ all -> 0x009d }
            if (r6 != r0) goto L_0x0050
            java.lang.String r5 = "xz"
            goto L_0x0059
        L_0x0050:
            X.0q9 r0 = X.AnonymousClass0q9.SUPERPACK_BR     // Catch:{ all -> 0x009d }
            if (r6 != r0) goto L_0x0057
            java.lang.String r5 = "br"
            goto L_0x0059
        L_0x0057:
            java.lang.String r5 = "zst"
        L_0x0059:
            java.lang.String r0 = "com.facebook.superpack.SuperpackFileInputStream"
            java.lang.Class r4 = java.lang.Class.forName(r0)     // Catch:{ Exception -> 0x0079 }
            java.lang.String r2 = "createFromSingletonArchiveInputStream"
            java.lang.Class<java.io.InputStream> r1 = java.io.InputStream.class
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            java.lang.Class[] r0 = new java.lang.Class[]{r1, r0}     // Catch:{ Exception -> 0x0079 }
            java.lang.reflect.Method r2 = r4.getMethod(r2, r0)     // Catch:{ Exception -> 0x0079 }
            r1 = 0
            java.lang.Object[] r0 = new java.lang.Object[]{r3, r5}     // Catch:{ Exception -> 0x0079 }
            java.lang.Object r0 = r2.invoke(r1, r0)     // Catch:{ Exception -> 0x0079 }
            java.io.InputStream r0 = (java.io.InputStream) r0     // Catch:{ Exception -> 0x0079 }
            goto L_0x0091
        L_0x0079:
            r5 = move-exception
            java.lang.String r4 = "Could not access Superpack archive from "
            java.lang.String r2 = r6.A00     // Catch:{ all -> 0x009d }
            java.lang.String r1 = "."
            java.lang.String r0 = r6.A01     // Catch:{ all -> 0x009d }
            java.lang.String r0 = X.AnonymousClass00U.A0d(r4, r2, r1, r0)     // Catch:{ all -> 0x009d }
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ all -> 0x009d }
            r1.<init>(r0, r5)     // Catch:{ all -> 0x009d }
            goto L_0x001f
        L_0x008c:
            com.facebook.xzdecoder.XzInputStream r0 = new com.facebook.xzdecoder.XzInputStream     // Catch:{ all -> 0x009d }
            r0.<init>(r3)     // Catch:{ all -> 0x009d }
        L_0x0091:
            r7.A01 = r0     // Catch:{ all -> 0x009d }
            boolean r0 = r7.A01()
            if (r0 != 0) goto L_0x009c
            r7.close()
        L_0x009c:
            return
        L_0x009d:
            r0 = move-exception
            if (r3 == 0) goto L_0x00a3
            r3.close()
        L_0x00a3:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11020jL.<init>(X.0NH):void");
    }

    public final boolean A01() {
        int length;
        int i = this.A00;
        while (true) {
            AnonymousClass08E[] r0 = this.A02.A02;
            length = r0.length;
            if (i < length && !r0[i].A00) {
                i++;
            }
        }
        if (i < length) {
            return true;
        }
        return false;
    }

    public final void close() {
        this.A01.close();
    }
}
