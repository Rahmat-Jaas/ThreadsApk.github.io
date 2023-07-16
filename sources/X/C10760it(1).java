package X;

import java.util.Set;
import java.util.concurrent.CountDownLatch;

/* renamed from: X.0it  reason: invalid class name and case insensitive filesystem */
public final class C10760it extends AnonymousClass0gG {
    public final /* synthetic */ C10630if A00;
    public final /* synthetic */ Set A01;
    public final /* synthetic */ CountDownLatch A02;

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0021, code lost:
        if (r0 == null) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        r2 = r0.A00.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002d, code lost:
        if (r2.hasNext() == false) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002f, code lost:
        r5.A01.add((X.C08890eT) r2.next());
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r5 = this;
            r4 = 0
            X.0if r3 = r5.A00     // Catch:{ IOException -> 0x0045 }
            java.lang.Object r2 = r3.A02     // Catch:{ IOException -> 0x0045 }
            monitor-enter(r2)     // Catch:{ IOException -> 0x0045 }
            java.io.File r1 = r3.A00()     // Catch:{ all -> 0x0042 }
            boolean r0 = r1.exists()     // Catch:{ all -> 0x0042 }
            if (r0 == 0) goto L_0x003b
            boolean r0 = r1.canRead()     // Catch:{ all -> 0x0042 }
            if (r0 == 0) goto L_0x003b
            com.instagram.service.session.UserSession r0 = r3.A00     // Catch:{ all -> 0x0042 }
            X.0Os r4 = X.C04690Os.A00(r0, r1)     // Catch:{ all -> 0x0042 }
            X.0ec r0 = X.C08970eb.parseFromJson(r4)     // Catch:{ all -> 0x0042 }
            monitor-exit(r2)     // Catch:{ all -> 0x0042 }
            if (r0 == 0) goto L_0x004b
            java.util.List r0 = r0.A00     // Catch:{ IOException -> 0x0045 }
            java.util.Iterator r2 = r0.iterator()     // Catch:{ IOException -> 0x0045 }
        L_0x0029:
            boolean r0 = r2.hasNext()     // Catch:{ IOException -> 0x0045 }
            if (r0 == 0) goto L_0x004b
            java.lang.Object r1 = r2.next()     // Catch:{ IOException -> 0x0045 }
            X.0eT r1 = (X.C08890eT) r1     // Catch:{ IOException -> 0x0045 }
            java.util.Set r0 = r5.A01     // Catch:{ IOException -> 0x0045 }
            r0.add(r1)     // Catch:{ IOException -> 0x0045 }
            goto L_0x0029
        L_0x003b:
            monitor-exit(r2)     // Catch:{ all -> 0x0042 }
            java.util.concurrent.CountDownLatch r0 = r5.A02
            r0.countDown()
            return
        L_0x0042:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0042 }
            throw r0     // Catch:{ IOException -> 0x0045 }
        L_0x0045:
            r1 = move-exception
            java.lang.String r0 = "JsonFileStoreAdapter"
            X.C10450iM.A07(r0, r1)     // Catch:{ all -> 0x0056 }
        L_0x004b:
            if (r4 == 0) goto L_0x0050
            r4.close()     // Catch:{ IOException -> 0x0050 }
        L_0x0050:
            java.util.concurrent.CountDownLatch r0 = r5.A02
            r0.countDown()
            return
        L_0x0056:
            r1 = move-exception
            if (r4 == 0) goto L_0x005c
            r4.close()     // Catch:{ IOException -> 0x005c }
        L_0x005c:
            java.util.concurrent.CountDownLatch r0 = r5.A02
            r0.countDown()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C10760it.run():void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10760it(C10630if r4, Set set, CountDownLatch countDownLatch) {
        super(129, 1, false, true);
        this.A00 = r4;
        this.A01 = set;
        this.A02 = countDownLatch;
    }
}
