package X;

/* renamed from: X.0SQ  reason: invalid class name */
public final class AnonymousClass0SQ extends Thread {
    public AnonymousClass0SQ() {
        super("HybridData DestructorThread");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:0|1|(3:3|(1:5)|8)(1:7)|6) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:0:0x0000 */
    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP:0: B:0:0x0000->B:6:0x0030, LOOP_START, MTH_ENTER_BLOCK, SYNTHETIC, Splitter:B:0:0x0000] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r5 = this;
        L_0x0000:
            java.lang.ref.ReferenceQueue r0 = X.AnonymousClass0SU.A02     // Catch:{ InterruptedException -> 0x0000 }
            java.lang.ref.Reference r4 = r0.remove()     // Catch:{ InterruptedException -> 0x0000 }
            X.0SR r4 = (X.AnonymousClass0SR) r4     // Catch:{ InterruptedException -> 0x0000 }
            r4.destruct()     // Catch:{ InterruptedException -> 0x0000 }
            X.0SR r0 = r4.previous     // Catch:{ InterruptedException -> 0x0000 }
            if (r0 != 0) goto L_0x0030
            X.0ST r0 = X.AnonymousClass0SU.A01     // Catch:{ InterruptedException -> 0x0000 }
            java.util.concurrent.atomic.AtomicReference r1 = r0.A00     // Catch:{ InterruptedException -> 0x0000 }
            r0 = 0
            java.lang.Object r3 = r1.getAndSet(r0)     // Catch:{ InterruptedException -> 0x0000 }
            X.0SR r3 = (X.AnonymousClass0SR) r3     // Catch:{ InterruptedException -> 0x0000 }
        L_0x001a:
            if (r3 == 0) goto L_0x0030
            X.0SR r2 = r3.next     // Catch:{ InterruptedException -> 0x0000 }
            X.0SS r0 = X.AnonymousClass0SU.A00     // Catch:{ InterruptedException -> 0x0000 }
            X.0SR r1 = r0.A00     // Catch:{ InterruptedException -> 0x0000 }
            X.0SR r0 = r1.next     // Catch:{ InterruptedException -> 0x0000 }
            r3.next = r0     // Catch:{ InterruptedException -> 0x0000 }
            r1.next = r3     // Catch:{ InterruptedException -> 0x0000 }
            X.0SR r0 = r3.next     // Catch:{ InterruptedException -> 0x0000 }
            r0.previous = r3     // Catch:{ InterruptedException -> 0x0000 }
            r3.previous = r1     // Catch:{ InterruptedException -> 0x0000 }
            r3 = r2
            goto L_0x001a
        L_0x0030:
            X.0SR r1 = r4.next     // Catch:{ InterruptedException -> 0x0000 }
            X.0SR r0 = r4.previous     // Catch:{ InterruptedException -> 0x0000 }
            r1.previous = r0     // Catch:{ InterruptedException -> 0x0000 }
            X.0SR r0 = r4.previous     // Catch:{ InterruptedException -> 0x0000 }
            r0.next = r1     // Catch:{ InterruptedException -> 0x0000 }
            goto L_0x0000
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0SQ.run():void");
    }
}
