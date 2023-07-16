package X;

import com.instagram.service.session.UserSession;

/* renamed from: X.7tL  reason: invalid class name and case insensitive filesystem */
public final class C132107tL implements AnonymousClass0i4 {
    public final UserSession A00;

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0040, code lost:
        r2.unlock();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0043, code lost:
        throw r0;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A00(X.C132107tL r4) {
        /*
            com.instagram.service.session.UserSession r1 = r4.A00
            X.78u r0 = new X.78u
            r0.<init>(r1)
            X.6sL r4 = r0.A00
            if (r4 != 0) goto L_0x0012
            java.lang.String r0 = "sparkARFLMConsentManager"
            X.C04220Ms.A0E(r0)
            r0 = 0
            throw r0
        L_0x0012:
            X.6dK r3 = r0.A02
            r0 = 0
            X.C04220Ms.A0B(r3, r0)
            java.util.concurrent.locks.ReentrantLock r2 = r4.A03
            r2.lock()
            X.22X r0 = r4.A04     // Catch:{ all -> 0x003f }
            if (r0 != 0) goto L_0x002c
            X.6oD r1 = r4.A00     // Catch:{ all -> 0x003f }
            X.7dL r0 = new X.7dL     // Catch:{ all -> 0x003f }
            r0.<init>(r4, r3)     // Catch:{ all -> 0x003f }
            r1.A00(r0)     // Catch:{ all -> 0x003f }
            goto L_0x003b
        L_0x002c:
            X.22X r1 = r4.A04     // Catch:{ all -> 0x003f }
            if (r1 == 0) goto L_0x003b
            X.78u r0 = r3.A00     // Catch:{ all -> 0x003f }
            monitor-enter(r3)     // Catch:{ all -> 0x003f }
            X.C1201378u.A00(r1, r0)     // Catch:{ all -> 0x0038 }
            monitor-exit(r3)     // Catch:{ all -> 0x003f }
            goto L_0x003b
        L_0x0038:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x003f }
            throw r0     // Catch:{ all -> 0x003f }
        L_0x003b:
            r2.unlock()
            return
        L_0x003f:
            r0 = move-exception
            r2.unlock()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C132107tL.A00(X.7tL):void");
    }

    public final void onSessionWillEnd() {
        this.A00.A03(C26222E4m.class);
    }

    public C132107tL(UserSession userSession) {
        this.A00 = userSession;
    }
}
