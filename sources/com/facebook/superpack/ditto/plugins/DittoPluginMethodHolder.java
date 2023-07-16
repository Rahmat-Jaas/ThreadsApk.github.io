package com.facebook.superpack.ditto.plugins;

import android.util.Pair;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class DittoPluginMethodHolder {
    public static Map firstIds = new ConcurrentHashMap();
    public static Pair interactionIds = new Pair(0L, 0L);
    public static final Object lock = new Object();

    public static void dittoDeadCodePluginDataRecorder(long j) {
        if (firstIds.size() <= 100000) {
            synchronized (lock) {
                Map map = firstIds;
                Long valueOf = Long.valueOf(j);
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) map.get(valueOf);
                if (concurrentHashMap == null) {
                    ConcurrentHashMap concurrentHashMap2 = new ConcurrentHashMap();
                    Pair pair = interactionIds;
                    concurrentHashMap2.put(new Pair((Long) pair.first, (Long) pair.second), 1L);
                    firstIds.put(valueOf, concurrentHashMap2);
                } else {
                    Long l = (Long) concurrentHashMap.get(interactionIds);
                    if (l == null) {
                        Pair pair2 = interactionIds;
                        concurrentHashMap.put(new Pair((Long) pair2.first, (Long) pair2.second), 1L);
                    } else {
                        Pair pair3 = interactionIds;
                        concurrentHashMap.put(new Pair((Long) pair3.first, (Long) pair3.second), Long.valueOf(l.longValue() + 1));
                    }
                }
            }
        }
    }

    public static Map getDeadCodeIdsAndClear() {
        Map map = firstIds;
        firstIds = new ConcurrentHashMap();
        synchronized (lock) {
            interactionIds = new Pair(0L, 0L);
        }
        return map;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001e, code lost:
        if (((java.lang.Long) r4.second).equals(0L) != false) goto L_0x0020;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean startInteraction(java.lang.Long r9) {
        /*
            java.lang.Object r8 = lock
            monitor-enter(r8)
            android.util.Pair r4 = interactionIds     // Catch:{ all -> 0x005d }
            java.lang.Object r3 = r4.first     // Catch:{ all -> 0x005d }
            java.lang.Long r3 = (java.lang.Long) r3     // Catch:{ all -> 0x005d }
            r0 = 0
            java.lang.Long r2 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x005d }
            boolean r1 = r3.equals(r2)     // Catch:{ all -> 0x005d }
            if (r1 != 0) goto L_0x0020
            java.lang.Object r0 = r4.second     // Catch:{ all -> 0x005d }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ all -> 0x005d }
            boolean r0 = r0.equals(r2)     // Catch:{ all -> 0x005d }
            r7 = 0
            if (r0 == 0) goto L_0x0034
        L_0x0020:
            r7 = 1
            if (r1 == 0) goto L_0x0055
            java.lang.Object r1 = r4.second     // Catch:{ all -> 0x005d }
            java.lang.Long r1 = (java.lang.Long) r1     // Catch:{ all -> 0x005d }
            boolean r0 = r1.equals(r2)     // Catch:{ all -> 0x005d }
            if (r0 == 0) goto L_0x0036
            android.util.Pair r1 = new android.util.Pair     // Catch:{ all -> 0x005d }
            r1.<init>(r2, r9)     // Catch:{ all -> 0x005d }
        L_0x0032:
            interactionIds = r1     // Catch:{ all -> 0x005d }
        L_0x0034:
            monitor-exit(r8)     // Catch:{ all -> 0x005d }
            goto L_0x0054
        L_0x0036:
            long r5 = r1.longValue()     // Catch:{ all -> 0x005d }
            long r3 = r9.longValue()     // Catch:{ all -> 0x005d }
            long r0 = java.lang.Math.min(r5, r3)     // Catch:{ all -> 0x005d }
            java.lang.Long r2 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x005d }
            long r0 = java.lang.Math.max(r5, r3)     // Catch:{ all -> 0x005d }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x005d }
            android.util.Pair r1 = new android.util.Pair     // Catch:{ all -> 0x005d }
            r1.<init>(r2, r0)     // Catch:{ all -> 0x005d }
            goto L_0x0032
        L_0x0054:
            return r7
        L_0x0055:
            java.lang.String r1 = "Unreachable startInteraction"
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ all -> 0x005d }
            r0.<init>(r1)     // Catch:{ all -> 0x005d }
            throw r0     // Catch:{ all -> 0x005d }
        L_0x005d:
            r0 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x005d }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.superpack.ditto.plugins.DittoPluginMethodHolder.startInteraction(java.lang.Long):boolean");
    }

    public static void stopInteraction(Long l) {
        Pair pair;
        synchronized (lock) {
            Pair pair2 = interactionIds;
            Object obj = pair2.first;
            if (((Long) obj).equals(l)) {
                pair = new Pair(0L, pair2.second);
            } else if (((Long) pair2.second).equals(l)) {
                pair = new Pair(0L, obj);
            } else {
                throw new RuntimeException("Unreachable stopInteraction");
            }
            interactionIds = pair;
        }
    }
}
