package X;

import java.util.List;

/* renamed from: X.0vM  reason: invalid class name and case insensitive filesystem */
public final class C17680vM implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C17630vH A01;
    public final /* synthetic */ List A02;

    public C17680vM(C17630vH r1, List list, int i) {
        this.A01 = r1;
        this.A02 = list;
        this.A00 = i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005d, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x005e, code lost:
        X.C17630vH.A03(r4, X.C17540v7.UNSUBSCRIBE, X.C17490uz.A00(r2), r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r8 = this;
            X.0vH r4 = r8.A01
            java.util.List r2 = r8.A02
            int r7 = r8.A00
            X.C17630vH.A02(r4)     // Catch:{ all -> 0x005d }
            java.lang.Integer r1 = r4.A0Y     // Catch:{ all -> 0x005d }
            java.lang.Integer r0 = X.AnonymousClass006.A0C     // Catch:{ all -> 0x005d }
            if (r1 != r0) goto L_0x0067
            X.0pX r6 = r4.A0E     // Catch:{ all -> 0x005d }
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ all -> 0x005d }
            r5.<init>()     // Catch:{ all -> 0x005d }
            java.util.Iterator r1 = r2.iterator()     // Catch:{ all -> 0x005d }
        L_0x001a:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x005d }
            if (r0 == 0) goto L_0x002c
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x005d }
            com.facebook.rti.mqtt.protocol.messages.SubscribeTopic r0 = (com.facebook.rti.mqtt.protocol.messages.SubscribeTopic) r0     // Catch:{ all -> 0x005d }
            java.lang.String r0 = r0.A01     // Catch:{ all -> 0x005d }
            r5.add(r0)     // Catch:{ all -> 0x005d }
            goto L_0x001a
        L_0x002c:
            monitor-enter(r6)     // Catch:{ all -> 0x005d }
            X.0ue r0 = X.C17290ue.UNSUBSCRIBE     // Catch:{ all -> 0x005a }
            X.0uh r3 = new X.0uh     // Catch:{ all -> 0x005a }
            r3.<init>(r0)     // Catch:{ all -> 0x005a }
            X.0ug r2 = new X.0ug     // Catch:{ all -> 0x005a }
            r2.<init>(r7)     // Catch:{ all -> 0x005a }
            X.0uS r0 = new X.0uS     // Catch:{ all -> 0x005a }
            r0.<init>(r5)     // Catch:{ all -> 0x005a }
            X.0qe r1 = new X.0qe     // Catch:{ all -> 0x005a }
            r1.<init>(r3, r2, r0)     // Catch:{ all -> 0x005a }
            X.0uG r0 = r6.A01     // Catch:{ all -> 0x005a }
            X.C14510pX.A01(r6, r1, r0)     // Catch:{ all -> 0x005a }
            monitor-exit(r6)     // Catch:{ all -> 0x005d }
            X.0my r2 = r4.A0X     // Catch:{ all -> 0x005d }
            if (r2 == 0) goto L_0x0067
            X.00d r0 = r2.A01     // Catch:{ all -> 0x005d }
            android.os.Handler r1 = r0.A05     // Catch:{ all -> 0x005d }
            X.0AA r0 = new X.0AA     // Catch:{ all -> 0x005d }
            r0.<init>(r2)     // Catch:{ all -> 0x005d }
            r1.post(r0)     // Catch:{ all -> 0x005d }
            return
        L_0x005a:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x005d }
            throw r0     // Catch:{ all -> 0x005d }
        L_0x005d:
            r2 = move-exception
            X.0uz r1 = X.C17490uz.A00(r2)
            X.0v7 r0 = X.C17540v7.UNSUBSCRIBE
            X.C17630vH.A03(r4, r0, r1, r2)
        L_0x0067:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C17680vM.run():void");
    }
}
