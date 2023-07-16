package com.instagram.debug.devoptions;

public final class PublicDeveloperOptions$forceAnr$2 implements Runnable {
    public static final PublicDeveloperOptions$forceAnr$2 INSTANCE = new PublicDeveloperOptions$forceAnr$2();

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r3 = this;
            java.lang.Object r2 = com.instagram.debug.devoptions.PublicDeveloperOptions.LOCK_FOR_ANR
            monitor-enter(r2)
            r0 = 1000(0x3e8, double:4.94E-321)
            java.lang.Thread.sleep(r0)     // Catch:{ InterruptedException -> 0x0008, all -> 0x000a }
        L_0x0008:
            monitor-exit(r2)
            return
        L_0x000a:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.debug.devoptions.PublicDeveloperOptions$forceAnr$2.run():void");
    }
}
