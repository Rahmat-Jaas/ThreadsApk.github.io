package X;

/* renamed from: X.800  reason: invalid class name */
public final /* synthetic */ class AnonymousClass800 implements Runnable {
    public final /* synthetic */ C86824zB A00;

    public /* synthetic */ AnonymousClass800(C86824zB r1) {
        this.A00 = r1;
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final void run() {
        /*
            r10 = this;
            X.4zB r0 = r10.A00
            X.CRf r1 = r0.A00
            boolean r0 = r1.A0S
            if (r0 != 0) goto L_0x00db
            X.5zw r0 = r1.A0k
            if (r0 == 0) goto L_0x00db
            r7 = 1
            r1.A0S = r7
            X.5zw r5 = r1.A0k
            boolean r0 = r5.A01
            if (r0 != 0) goto L_0x00db
            X.6pW r1 = r5.A05
            X.6iu r9 = r5.A01()
            r6 = 0
            X.3UO r4 = r1.A01
            X.4nK r0 = r4.A00
            monitor-enter(r0)
            monitor-exit(r0)
            java.util.Map r3 = r1.A02
            java.lang.String r8 = r9.A01
            r2 = 21
            r1 = 10
            r0 = 90
            java.lang.String r0 = X.C62983bG.A03(r2, r1, r0)
            r3.put(r0, r8)
            java.lang.String r1 = r9.A02
            java.lang.String r0 = "source"
            r3.put(r0, r1)
            java.lang.String r1 = r9.A00
            java.lang.String r0 = "entry_point"
            r3.put(r0, r1)
            java.lang.String r1 = "unset"
            java.lang.String r0 = "location_service_always"
            r3.put(r0, r1)
            r4.A00(r3)
            r4.A00(r3)
            X.6oL r1 = r5.A04
            java.lang.String r0 = X.C95345zw.A00(r5)
            X.6od r3 = r1.A00
            X.89Y r2 = new X.89Y
            r2.<init>(r1, r0)
            java.lang.String r1 = "gms_ls_upsell_requested"
            java.lang.String r0 = "gms_ls_upsell"
            r3.A00(r1, r0, r2)
            X.7AL r4 = r5.A00
            r4.A05()
            com.google.android.gms.location.LocationRequest r8 = new com.google.android.gms.location.LocationRequest
            r8.<init>()
            r0 = 10000(0x2710, double:4.9407E-320)
            r8.A01 = r0
            boolean r2 = r8.A04
            if (r2 != 0) goto L_0x007b
            double r2 = (double) r0
            r0 = 4618441417868443648(0x4018000000000000, double:6.0)
            double r2 = r2 / r0
            long r0 = (long) r2
            r8.A02 = r0
        L_0x007b:
            r0 = 5000(0x1388, double:2.4703E-320)
            r8.A04 = r7
            r8.A02 = r0
            r0 = 100
            r8.A00 = r0
            java.util.ArrayList r2 = X.AnonymousClass0wJ.A0v()
            r2.add(r8)
            r1 = 0
            com.google.android.gms.location.LocationSettingsRequest r0 = new com.google.android.gms.location.LocationSettingsRequest
            r0.<init>(r6, r2, r7, r1)
            X.5lN r8 = new X.5lN
            r8.<init>(r4, r0)
            r4.A07(r8)
            X.7lW r6 = new X.7lW
            r6.<init>(r5)
            java.lang.Object r5 = r8.A07
            monitor-enter(r5)
            boolean r0 = r8.A0C     // Catch:{ all -> 0x00d8 }
            r1 = r0 ^ 1
            java.lang.String r0 = "Result has already been consumed."
            X.C13320nQ.A07(r1, r0)     // Catch:{ all -> 0x00d8 }
            monitor-enter(r5)     // Catch:{ all -> 0x00d8 }
            boolean r0 = r8.A03     // Catch:{ all -> 0x00d5 }
            monitor-exit(r5)     // Catch:{ all -> 0x00d5 }
            if (r0 != 0) goto L_0x00cf
            java.util.concurrent.CountDownLatch r0 = r8.A0A     // Catch:{ all -> 0x00d8 }
            long r3 = r0.getCount()     // Catch:{ all -> 0x00d8 }
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            boolean r0 = X.C18180wK.A1W(r0)     // Catch:{ all -> 0x00d8 }
            if (r0 == 0) goto L_0x00d1
            X.5pv r2 = r8.A06     // Catch:{ all -> 0x00d8 }
            X.4ow r1 = com.google.android.gms.common.api.internal.BasePendingResult.A00(r8)     // Catch:{ all -> 0x00d8 }
            android.util.Pair r0 = new android.util.Pair     // Catch:{ all -> 0x00d8 }
            r0.<init>(r6, r1)     // Catch:{ all -> 0x00d8 }
            X.C86124wJ.A1E(r2, r0, r7)     // Catch:{ all -> 0x00d8 }
        L_0x00cf:
            monitor-exit(r5)     // Catch:{ all -> 0x00d8 }
            goto L_0x00d4
        L_0x00d1:
            r8.A01 = r6     // Catch:{ all -> 0x00d8 }
            goto L_0x00cf
        L_0x00d4:
            return
        L_0x00d5:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x00d5 }
            throw r0     // Catch:{ all -> 0x00d8 }
        L_0x00d8:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x00d8 }
            throw r0
        L_0x00db:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass800.run():void");
    }
}
