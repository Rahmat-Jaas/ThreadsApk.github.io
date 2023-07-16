package X;

import java.io.File;
import java.util.Random;

/* renamed from: X.0WY  reason: invalid class name */
public final class AnonymousClass0WY implements C04050Mb {
    public final Integer A00;
    public final File A01;
    public final Random A02 = new Random();

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final synchronized void CWp(X.C04170Mn r12, X.AnonymousClass0ND r13) {
        /*
            r11 = this;
            monitor-enter(r11)
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ all -> 0x00db }
            r4.<init>()     // Catch:{ all -> 0x00db }
            X.0Z2 r0 = X.AnonymousClass0MI.A04     // Catch:{ all -> 0x00db }
            if (r0 == 0) goto L_0x0027
            boolean r2 = r0.A05     // Catch:{ all -> 0x00db }
            if (r2 != 0) goto L_0x001b
            java.util.Random r1 = r11.A02     // Catch:{ all -> 0x00db }
            r0 = 10000(0x2710, float:1.4013E-41)
            int r1 = r1.nextInt(r0)     // Catch:{ all -> 0x00db }
            r0 = 0
            if (r1 < r0) goto L_0x001b
            goto L_0x00d9
        L_0x001b:
            java.lang.String r0 = "is_fad_v2"
            r4.add(r0)     // Catch:{ all -> 0x00db }
            java.lang.String r0 = java.lang.Boolean.toString(r2)     // Catch:{ all -> 0x00db }
            r4.add(r0)     // Catch:{ all -> 0x00db }
        L_0x0027:
            java.lang.Integer r3 = r11.A00     // Catch:{ all -> 0x00db }
            int r1 = r3.intValue()     // Catch:{ all -> 0x00db }
            r0 = 0
            r6 = 15859715(0xf20003, float:2.2224194E-38)
            if (r1 == r0) goto L_0x0036
            r6 = 15859713(0xf20001, float:2.2224191E-38)
        L_0x0036:
            java.lang.Integer r0 = X.AnonymousClass006.A01     // Catch:{ all -> 0x00db }
            if (r3 != r0) goto L_0x0069
            java.lang.String r2 = "anr"
        L_0x003c:
            java.lang.Integer r0 = X.AnonymousClass006.A00     // Catch:{ all -> 0x00db }
            if (r3 != r0) goto L_0x0054
            X.0ON r1 = X.AnonymousClass0MU.A5m     // Catch:{ all -> 0x00db }
            java.util.Map r0 = r12.A07     // Catch:{ all -> 0x00db }
            java.lang.Object r1 = r0.get(r1)     // Catch:{ all -> 0x00db }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x00db }
            if (r1 == 0) goto L_0x0054
            java.lang.String r0 = "throwable"
            r4.add(r0)     // Catch:{ all -> 0x00db }
            r4.add(r1)     // Catch:{ all -> 0x00db }
        L_0x0054:
            int r0 = r4.size()     // Catch:{ all -> 0x00db }
            java.lang.String[] r0 = new java.lang.String[r0]     // Catch:{ all -> 0x00db }
            r4.toArray(r0)     // Catch:{ all -> 0x00db }
            X.0UG r5 = X.AnonymousClass0UF.A00(r2, r0, r6)     // Catch:{ all -> 0x00db }
            if (r5 == 0) goto L_0x00d9
            r5.A00()     // Catch:{ all -> 0x00db }
            java.lang.String r4 = r5.A01     // Catch:{ all -> 0x00db }
            goto L_0x006c
        L_0x0069:
            java.lang.String r2 = "crash"
            goto L_0x003c
        L_0x006c:
            monitor-enter(r5)     // Catch:{ InterruptedException -> 0x008e }
            long r9 = java.lang.System.nanoTime()     // Catch:{ all -> 0x008b }
            r0 = 1000000000(0x3b9aca00, double:4.94065646E-315)
            long r9 = r9 + r0
        L_0x0075:
            boolean r0 = r5.A02     // Catch:{ all -> 0x008b }
            if (r0 != 0) goto L_0x0089
            long r2 = java.lang.System.nanoTime()     // Catch:{ all -> 0x008b }
            long r0 = r9 - r2
            r7 = 0
            int r2 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r2 <= 0) goto L_0x0089
            r5.wait(r0)     // Catch:{ all -> 0x008b }
            goto L_0x0075
        L_0x0089:
            monitor-exit(r5)     // Catch:{ InterruptedException -> 0x008e }
            goto L_0x00ac
        L_0x008b:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ InterruptedException -> 0x008e }
            throw r0     // Catch:{ InterruptedException -> 0x008e }
        L_0x008e:
            r3 = move-exception
            java.util.HashMap r2 = new java.util.HashMap     // Catch:{ all -> 0x00db }
            r2.<init>()     // Catch:{ all -> 0x00db }
            java.lang.String r1 = java.lang.Integer.toString(r6)     // Catch:{ all -> 0x00db }
            java.lang.String r0 = "TriggerID"
            r2.put(r0, r1)     // Catch:{ all -> 0x00db }
            java.lang.String r0 = "TraceId"
            r2.put(r0, r4)     // Catch:{ all -> 0x00db }
            X.C04790Pd.A00()     // Catch:{ all -> 0x00db }
            java.lang.String r1 = "lacrima/blackbox"
            java.lang.String r0 = "Wait for Black Box trace interrupted"
            X.AnonymousClass0LU.A0E(r1, r0, r3)     // Catch:{ all -> 0x00db }
        L_0x00ac:
            monitor-enter(r5)     // Catch:{ all -> 0x00db }
            java.io.File r0 = r5.A00     // Catch:{ all -> 0x00d6 }
            monitor-exit(r5)     // Catch:{ all -> 0x00db }
            if (r0 != 0) goto L_0x00d0
            java.util.HashMap r2 = new java.util.HashMap     // Catch:{ all -> 0x00db }
            r2.<init>()     // Catch:{ all -> 0x00db }
            java.lang.String r1 = java.lang.Integer.toString(r6)     // Catch:{ all -> 0x00db }
            java.lang.String r0 = "TriggerID"
            r2.put(r0, r1)     // Catch:{ all -> 0x00db }
            java.lang.String r0 = "TraceId"
            r2.put(r0, r4)     // Catch:{ all -> 0x00db }
            X.C04790Pd.A00()     // Catch:{ all -> 0x00db }
            java.lang.String r1 = "lacrima/blackbox"
            java.lang.String r0 = "Failed to collect a trace file"
            X.AnonymousClass0LU.A0B(r1, r0)     // Catch:{ all -> 0x00db }
            goto L_0x00d9
        L_0x00d0:
            X.0ON r0 = X.AnonymousClass0MU.A4L     // Catch:{ all -> 0x00db }
            r12.A03(r0, r4)     // Catch:{ all -> 0x00db }
            goto L_0x00d9
        L_0x00d6:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x00db }
            throw r0     // Catch:{ all -> 0x00db }
        L_0x00d9:
            monitor-exit(r11)
            return
        L_0x00db:
            r0 = move-exception
            monitor-exit(r11)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0WY.CWp(X.0Mn, X.0ND):void");
    }

    public AnonymousClass0WY(File file, Integer num) {
        this.A00 = num;
        this.A01 = file;
    }

    public final Integer Awy() {
        return AnonymousClass006.A02;
    }

    public final /* synthetic */ boolean BNv(Integer num) {
        return false;
    }
}
