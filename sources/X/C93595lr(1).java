package X;

import android.content.Context;
import android.os.Looper;

/* renamed from: X.5lr  reason: invalid class name and case insensitive filesystem */
public final class C93595lr extends C93625lu {
    public final C142228eO A00;
    public final String A01 = "locationServices";
    public final C110366lZ A02;

    public final int Ave() {
        return 11717000;
    }

    public C93595lr(Context context, Looper looper, C148648rc r12, C148658rd r13, C110886mR r14) {
        super(context, looper, r12, r13, r14, 23);
        C129557m6 r1 = new C129557m6(this);
        this.A00 = r1;
        this.A02 = new C110366lZ(context, r1);
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
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
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
    public final void AI7() {
        /*
            r4 = this;
            X.6lZ r3 = r4.A02
            monitor-enter(r3)
            boolean r0 = r4.isConnected()     // Catch:{ all -> 0x005f }
            if (r0 == 0) goto L_0x005a
            java.util.Map r2 = r3.A01     // Catch:{ Exception -> 0x0052 }
            monitor-enter(r2)     // Catch:{ Exception -> 0x0052 }
            java.util.Iterator r1 = X.C86104wH.A14(r2)     // Catch:{ all -> 0x004f }
        L_0x0010:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x004f }
            if (r0 == 0) goto L_0x001a
            r1.next()     // Catch:{ all -> 0x004f }
            goto L_0x0010
        L_0x001a:
            r2.clear()     // Catch:{ all -> 0x004f }
            monitor-exit(r2)     // Catch:{ all -> 0x004f }
            java.util.Map r2 = r3.A03     // Catch:{ Exception -> 0x0052 }
            monitor-enter(r2)     // Catch:{ Exception -> 0x0052 }
            java.util.Iterator r1 = X.C86104wH.A14(r2)     // Catch:{ all -> 0x004c }
        L_0x0025:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x004c }
            if (r0 == 0) goto L_0x002f
            r1.next()     // Catch:{ all -> 0x004c }
            goto L_0x0025
        L_0x002f:
            r2.clear()     // Catch:{ all -> 0x004c }
            monitor-exit(r2)     // Catch:{ all -> 0x004c }
            java.util.Map r2 = r3.A02     // Catch:{ Exception -> 0x0052 }
            monitor-enter(r2)     // Catch:{ Exception -> 0x0052 }
            java.util.Iterator r1 = X.C86104wH.A14(r2)     // Catch:{ all -> 0x0049 }
        L_0x003a:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x0049 }
            if (r0 == 0) goto L_0x0044
            r1.next()     // Catch:{ all -> 0x0049 }
            goto L_0x003a
        L_0x0044:
            r2.clear()     // Catch:{ all -> 0x0049 }
            monitor-exit(r2)     // Catch:{ all -> 0x0049 }
            goto L_0x005a
        L_0x0049:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0049 }
            goto L_0x0051
        L_0x004c:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x004c }
            goto L_0x0051
        L_0x004f:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x004f }
        L_0x0051:
            throw r0     // Catch:{ Exception -> 0x0052 }
        L_0x0052:
            r2 = move-exception
            java.lang.String r1 = "LocationClientImpl"
            java.lang.String r0 = "Client disconnected before listeners could be cleaned up"
            android.util.Log.e(r1, r0, r2)     // Catch:{ all -> 0x005f }
        L_0x005a:
            super.AI7()     // Catch:{ all -> 0x005f }
            monitor-exit(r3)     // Catch:{ all -> 0x005f }
            return
        L_0x005f:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x005f }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C93595lr.AI7():void");
    }
}
