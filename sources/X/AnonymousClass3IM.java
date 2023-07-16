package X;

import com.facebook.proxygen.TraceFieldType;

/* renamed from: X.3IM  reason: invalid class name */
public abstract class AnonymousClass3IM {
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final long A02() {
        /*
            r3 = this;
            r2 = r3
            boolean r0 = r3 instanceof X.AnonymousClass1o1
            if (r0 == 0) goto L_0x000f
            r0 = r3
            X.1o1 r0 = (X.AnonymousClass1o1) r0
            monitor-enter(r2)
            r0.A05()     // Catch:{ all -> 0x001a }
            long r0 = r0.A00     // Catch:{ all -> 0x001a }
            goto L_0x0018
        L_0x000f:
            r0 = r3
            X.1o2 r0 = (X.AnonymousClass1o2) r0
            monitor-enter(r2)
            r0.A05()     // Catch:{ all -> 0x001a }
            long r0 = r0.A00     // Catch:{ all -> 0x001a }
        L_0x0018:
            monitor-exit(r2)
            return r0
        L_0x001a:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3IM.A02():long");
    }

    public final C15730rn A03(String str) {
        String str2;
        if (this instanceof AnonymousClass1o1) {
            str2 = ((AnonymousClass1o1) this).A01;
        } else {
            str2 = ((AnonymousClass1o2) this).A04;
        }
        C15730rn A01 = C15730rn.A01(str, str2);
        synchronized (this) {
            A05();
            long currentTimeMillis = System.currentTimeMillis();
            A01.A0D("waterfall_id", A04());
            A01.A0C(TraceFieldType.StartTime, Long.valueOf(A02()));
            A01.A0C("current_time", Long.valueOf(currentTimeMillis));
            A01.A0C("elapsed_time", Long.valueOf(currentTimeMillis - A02()));
        }
        return A01;
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final java.lang.String A04() {
        /*
            r2 = this;
            r1 = r2
            boolean r0 = r2 instanceof X.AnonymousClass1o1
            if (r0 == 0) goto L_0x000f
            r0 = r2
            X.1o1 r0 = (X.AnonymousClass1o1) r0
            monitor-enter(r1)
            r0.A05()     // Catch:{ all -> 0x001a }
            java.lang.String r0 = r0.A02     // Catch:{ all -> 0x001a }
            goto L_0x0018
        L_0x000f:
            r0 = r2
            X.1o2 r0 = (X.AnonymousClass1o2) r0
            monitor-enter(r1)
            r0.A05()     // Catch:{ all -> 0x001a }
            java.lang.String r0 = r0.A01     // Catch:{ all -> 0x001a }
        L_0x0018:
            monitor-exit(r1)
            return r0
        L_0x001a:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3IM.A04():java.lang.String");
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final void A05() {
        /*
            r7 = this;
            r6 = r7
            boolean r0 = r7 instanceof X.AnonymousClass1o1
            if (r0 == 0) goto L_0x0018
            r5 = r7
            X.1o1 r5 = (X.AnonymousClass1o1) r5
            monitor-enter(r6)
            long r3 = r5.A00     // Catch:{ all -> 0x0056 }
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0054
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0056 }
            r5.A00 = r0     // Catch:{ all -> 0x0056 }
            goto L_0x0054
        L_0x0018:
            r5 = r7
            X.1o2 r5 = (X.AnonymousClass1o2) r5
            monitor-enter(r6)
            java.lang.String r0 = r5.A01     // Catch:{ all -> 0x0056 }
            if (r0 != 0) goto L_0x0054
            X.3Eq r4 = r5.A03     // Catch:{ all -> 0x0056 }
            android.content.SharedPreferences r1 = r4.A00     // Catch:{ all -> 0x0056 }
            java.lang.String r0 = "id"
            java.lang.String r0 = X.C18200wM.A0h(r1, r0)     // Catch:{ all -> 0x0056 }
            r5.A01 = r0     // Catch:{ all -> 0x0056 }
            X.3Ep r3 = r5.A02     // Catch:{ all -> 0x0056 }
            android.content.SharedPreferences r1 = r3.A00     // Catch:{ all -> 0x0056 }
            java.lang.String r0 = "start_time"
            long r0 = X.C18180wK.A05(r1, r0)     // Catch:{ all -> 0x0056 }
            r5.A00 = r0     // Catch:{ all -> 0x0056 }
            java.lang.String r0 = r5.A01     // Catch:{ all -> 0x0056 }
            if (r0 != 0) goto L_0x0054
            java.lang.String r2 = X.C18180wK.A0e()     // Catch:{ all -> 0x0056 }
            r5.A01 = r2     // Catch:{ all -> 0x0056 }
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0056 }
            r5.A00 = r0     // Catch:{ all -> 0x0056 }
            r4.A00(r2)     // Catch:{ all -> 0x0056 }
            long r0 = r5.A00     // Catch:{ all -> 0x0056 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0056 }
            r3.A00(r0)     // Catch:{ all -> 0x0056 }
        L_0x0054:
            monitor-exit(r6)
            return
        L_0x0056:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3IM.A05():void");
    }
}
