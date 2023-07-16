package com.instagram.debug.devoptions;

public final class PublicDeveloperOptions$forceAnr$1 implements Runnable {
    public static final PublicDeveloperOptions$forceAnr$1 INSTANCE = new PublicDeveloperOptions$forceAnr$1();

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r3 = this;
            java.lang.Object r2 = com.instagram.debug.devoptions.PublicDeveloperOptions.LOCK_FOR_ANR
            monitor-enter(r2)
            r0 = 60000(0xea60, double:2.9644E-319)
            java.lang.Thread.sleep(r0)     // Catch:{ InterruptedException -> 0x0009, all -> 0x000b }
        L_0x0009:
            monitor-exit(r2)
            return
        L_0x000b:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.debug.devoptions.PublicDeveloperOptions$forceAnr$1.run():void");
    }
}
