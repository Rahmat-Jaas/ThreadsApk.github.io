package X;

/* renamed from: X.09e  reason: invalid class name and case insensitive filesystem */
public final class C019709e implements Runnable {
    public final /* synthetic */ C019809f A00;

    public C019709e(C019809f r1) {
        this.A00 = r1;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0032 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r4 = this;
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            X.09f r3 = r4.A00
            java.io.File r0 = r3.A02
            r1.append(r0)
            java.lang.String r0 = "_entity"
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.io.File r0 = new java.io.File
            r0.<init>(r1)
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0039, AssertionError -> 0x0033 }
            r2.<init>(r0)     // Catch:{ IOException -> 0x0039, AssertionError -> 0x0033 }
            monitor-enter(r3)     // Catch:{ all -> 0x002e }
            java.util.Properties r1 = r3.A03     // Catch:{ all -> 0x002b }
            r0 = 0
            r1.store(r2, r0)     // Catch:{ all -> 0x002b }
            monitor-exit(r3)     // Catch:{ all -> 0x002b }
            r2.close()     // Catch:{ IOException -> 0x0039, AssertionError -> 0x0033 }
            return
        L_0x002b:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x002b }
            throw r0     // Catch:{ all -> 0x002e }
        L_0x002e:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x0032 }
        L_0x0032:
            throw r0     // Catch:{ IOException -> 0x0039, AssertionError -> 0x0033 }
        L_0x0033:
            r2 = move-exception
            java.lang.String r1 = "ForegroundEntityMapper"
            java.lang.String r0 = "Error storing properties"
            goto L_0x003e
        L_0x0039:
            r2 = move-exception
            java.lang.String r1 = "ForegroundEntityMapper"
            java.lang.String r0 = "Error saving entity map"
        L_0x003e:
            X.AnonymousClass0LU.A0E(r1, r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C019709e.run():void");
    }
}
