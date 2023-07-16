package X;

import java.util.List;

/* renamed from: X.7WG  reason: invalid class name */
public final class AnonymousClass7WG implements C148808sD {
    public Throwable A00;
    public List A01;
    public List A02;
    public final Object A03;
    public final AnonymousClass0ZU A04;

    public final boolean A00() {
        boolean z;
        synchronized (this.A03) {
            z = !this.A01.isEmpty();
        }
        return z;
    }

    public final /* synthetic */ C142578fF Aqq() {
        return C148808sD.A00;
    }

    public AnonymousClass7WG(AnonymousClass0ZU r2) {
        this.A04 = r2;
        this.A03 = C86144wL.A0d();
        this.A01 = AnonymousClass0wJ.A0v();
        this.A02 = AnonymousClass0wJ.A0v();
    }

    public final Object ANL(Object obj, AnonymousClass0YP r3) {
        return C86104wH.A0g(obj, this, r3);
    }

    public final C148848sH AOA(C142578fF r2) {
        return C86144wL.A13(this, r2);
    }

    public final C27952Ew2 BgS(C142578fF r2) {
        return C86144wL.A14(this, r2);
    }

    public final C27952Ew2 CWl(C27952Ew2 ew2) {
        return C86144wL.A15(this, ew2);
    }

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
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processExcHandler(RegionMaker.java:1043)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:975)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        */
    public final java.lang.Object DBB(X.C146958n9 r8, X.AnonymousClass0YY r9) {
        /*
            r7 = this;
            X.EnC r6 = X.C86104wH.A17(r8)
            X.0MJ r3 = X.C86144wL.A17()
            java.lang.Object r5 = r7.A03
            monitor-enter(r5)
            java.lang.Throwable r1 = r7.A00     // Catch:{ all -> 0x007b }
            if (r1 == 0) goto L_0x0018
            X.0OW r0 = new X.0OW     // Catch:{ all -> 0x007b }
            r0.<init>(r1)     // Catch:{ all -> 0x007b }
            r6.resumeWith(r0)     // Catch:{ all -> 0x007b }
            goto L_0x0075
        L_0x0018:
            X.6fc r0 = new X.6fc     // Catch:{ all -> 0x007b }
            r0.<init>(r6, r9)     // Catch:{ all -> 0x007b }
            r3.A00 = r0     // Catch:{ all -> 0x007b }
            java.util.List r0 = r7.A01     // Catch:{ all -> 0x007b }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x007b }
            boolean r2 = X.C18180wK.A1W(r0)
            java.util.List r1 = r7.A01     // Catch:{ all -> 0x007b }
            java.lang.Object r0 = r3.A00     // Catch:{ all -> 0x007b }
            if (r0 != 0) goto L_0x0036
            java.lang.String r0 = "awaiter"
            X.C04220Ms.A0E(r0)     // Catch:{ all -> 0x007b }
            r0 = 0
            throw r0     // Catch:{ all -> 0x007b }
        L_0x0036:
            X.6fc r0 = (X.C106786fc) r0     // Catch:{ all -> 0x007b }
            r1.add(r0)     // Catch:{ all -> 0x007b }
            r1 = r2 ^ 1
            monitor-exit(r5)
            r0 = 48
            kotlin.jvm.internal.KtLambdaShape39S0200000_I2 r0 = X.C86164wN.A10(r3, r7, r0)
            r6.BQt(r0)
            if (r1 == 0) goto L_0x0076
            X.0ZU r0 = r7.A04
            if (r0 == 0) goto L_0x0076
            r0.invoke()     // Catch:{ all -> 0x0051 }
            goto L_0x0076
        L_0x0051:
            r4 = move-exception
            monitor-enter(r5)
            java.lang.Throwable r0 = r7.A00     // Catch:{ all -> 0x007b }
            if (r0 != 0) goto L_0x0075
            r7.A00 = r4     // Catch:{ all -> 0x007b }
            java.util.List r3 = r7.A01     // Catch:{ all -> 0x007b }
            r2 = 0
            int r1 = r3.size()     // Catch:{ all -> 0x007b }
        L_0x0060:
            if (r2 >= r1) goto L_0x0070
            java.lang.Object r0 = r3.get(r2)     // Catch:{ all -> 0x007b }
            X.6fc r0 = (X.C106786fc) r0     // Catch:{ all -> 0x007b }
            X.8n9 r0 = r0.A00     // Catch:{ all -> 0x007b }
            X.C146958n9.A00(r4, r0)     // Catch:{ all -> 0x007b }
            int r2 = r2 + 1
            goto L_0x0060
        L_0x0070:
            java.util.List r0 = r7.A01     // Catch:{ all -> 0x007b }
            r0.clear()     // Catch:{ all -> 0x007b }
        L_0x0075:
            monitor-exit(r5)
        L_0x0076:
            java.lang.Object r0 = r6.A0B()
            return r0
        L_0x007b:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7WG.DBB(X.8n9, X.0YY):java.lang.Object");
    }

    public AnonymousClass7WG() {
        this((AnonymousClass0ZU) null);
    }
}
