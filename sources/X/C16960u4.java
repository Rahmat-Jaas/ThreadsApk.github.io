package X;

import com.facebook.push.fbns.ipc.FbnsAIDLRequest;
import java.util.concurrent.Callable;

/* renamed from: X.0u4  reason: invalid class name and case insensitive filesystem */
public final class C16960u4 implements Callable {
    public final /* synthetic */ FbnsAIDLRequest A00;
    public final /* synthetic */ C16950u2 A01;

    public C16960u4(FbnsAIDLRequest fbnsAIDLRequest, C16950u2 r2) {
        this.A01 = r2;
        this.A00 = fbnsAIDLRequest;
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeEndlessLoop(RegionMaker.java:368)
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:172)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final /* bridge */ /* synthetic */ java.lang.Object call() {
        /*
            r20 = this;
            r3 = r20
            X.0u2 r4 = r3.A01     // Catch:{ all -> 0x018c }
            monitor-enter(r4)     // Catch:{ all -> 0x018c }
            int r0 = r4.A00     // Catch:{ all -> 0x0189 }
            int r0 = r0 + 1
            r4.A00 = r0     // Catch:{ all -> 0x0189 }
            r1 = 200(0xc8, double:9.9E-322)
            r8 = 1
        L_0x000e:
            java.lang.Integer r0 = r4.A02     // Catch:{ all -> 0x0187 }
            java.lang.Integer r7 = X.AnonymousClass006.A0C     // Catch:{ all -> 0x0187 }
            if (r0 == r7) goto L_0x011b
            r0 = 5
            if (r8 <= r0) goto L_0x0019
            goto L_0x00f2
        L_0x0019:
            java.lang.Thread r5 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0189 }
            r5.getId()     // Catch:{ all -> 0x0189 }
            android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0189 }
            java.lang.Integer r0 = r4.A02     // Catch:{ all -> 0x0187 }
            java.lang.Integer r10 = X.AnonymousClass006.A01     // Catch:{ all -> 0x0187 }
            if (r0 == r10) goto L_0x00e8
            android.os.Looper r0 = android.os.Looper.getMainLooper()     // Catch:{ all -> 0x0189 }
            java.lang.Thread r0 = r0.getThread()     // Catch:{ all -> 0x0189 }
            if (r0 != r5) goto L_0x003c
            java.lang.String r1 = "FbnsAIDLClientManager"
            java.lang.String r0 = "This operation can't be run on UI thread"
            X.AnonymousClass0LU.A0B(r1, r0)     // Catch:{ all -> 0x0189 }
            goto L_0x011b
        L_0x003c:
            r5.getId()     // Catch:{ all -> 0x0189 }
            android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0189 }
            android.content.Context r6 = r4.A03     // Catch:{ all -> 0x0189 }
            java.lang.Object r13 = X.C17250ua.A00     // Catch:{ all -> 0x0189 }
            X.0m4 r13 = (X.C12530m4) r13     // Catch:{ all -> 0x0189 }
            java.lang.String r5 = r13.A05     // Catch:{ all -> 0x0189 }
            java.lang.String r0 = r13.A04     // Catch:{ all -> 0x0189 }
            java.lang.String[] r0 = new java.lang.String[]{r5, r0}     // Catch:{ all -> 0x0189 }
            java.util.List r0 = java.util.Arrays.asList(r0)     // Catch:{ all -> 0x0189 }
            java.util.Iterator r5 = r0.iterator()     // Catch:{ all -> 0x0189 }
        L_0x0058:
            boolean r0 = r5.hasNext()     // Catch:{ all -> 0x0189 }
            if (r0 == 0) goto L_0x008f
            java.lang.Object r9 = r5.next()     // Catch:{ all -> 0x0189 }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ all -> 0x0189 }
            boolean r0 = X.AnonymousClass0PS.A01(r6, r9)     // Catch:{ all -> 0x0189 }
            if (r0 == 0) goto L_0x0058
        L_0x006a:
            java.lang.String r0 = com.facebook.rti.push.service.FbnsServiceDelegate.A00(r9)     // Catch:{ all -> 0x0189 }
            android.content.ComponentName r5 = new android.content.ComponentName     // Catch:{ all -> 0x0189 }
            r5.<init>(r9, r0)     // Catch:{ all -> 0x0189 }
            java.lang.Class<com.facebook.push.fbns.ipc.IFbnsAIDLService> r0 = com.facebook.push.fbns.ipc.IFbnsAIDLService.class
            java.lang.String r0 = r0.getName()     // Catch:{ all -> 0x0189 }
            android.content.Intent r11 = new android.content.Intent     // Catch:{ all -> 0x0189 }
            r11.<init>(r0)     // Catch:{ all -> 0x0189 }
            r11.setComponent(r5)     // Catch:{ all -> 0x0189 }
            r18 = 0
            r6.getClass()     // Catch:{ all -> 0x0189 }
            X.0mM r0 = new X.0mM     // Catch:{ all -> 0x0189 }
            r0.<init>((android.content.Context) r6)     // Catch:{ all -> 0x0189 }
            r0.A02(r11)     // Catch:{ all -> 0x0189 }
            goto L_0x0094
        L_0x008f:
            java.lang.String r9 = r6.getPackageName()     // Catch:{ all -> 0x0189 }
            goto L_0x006a
        L_0x0094:
            X.0mM r5 = new X.0mM     // Catch:{ SecurityException -> 0x0113 }
            r5.<init>((android.content.Context) r6)     // Catch:{ SecurityException -> 0x0113 }
            android.content.Context r0 = r5.A00     // Catch:{ SecurityException -> 0x0113 }
            r19 = r0
            r5.A02(r11)     // Catch:{ SecurityException -> 0x0113 }
            java.lang.String r17 = "fbns_aidl_auth_domain"
            android.content.ServiceConnection r9 = r4.A04     // Catch:{ SecurityException -> 0x0113 }
            java.lang.String r16 = "FbnsSecureIntentHelper"
            X.0t2 r12 = X.C16420t2.A00()     // Catch:{ SecurityException -> 0x010a, RuntimeException -> 0x00d5 }
            java.util.Set r0 = r13.A07     // Catch:{ SecurityException -> 0x010a, RuntimeException -> 0x00d5 }
            X.0rs r0 = X.C15760rq.A01(r0)     // Catch:{ SecurityException -> 0x010a, RuntimeException -> 0x00d5 }
            monitor-enter(r12)     // Catch:{ SecurityException -> 0x010a, RuntimeException -> 0x00d5 }
            X.04H r15 = X.C16420t2.A03(r12, r0)     // Catch:{ all -> 0x00d2 }
            java.util.List r14 = r12.A0F     // Catch:{ all -> 0x00d2 }
            java.util.List r13 = r12.A0E     // Catch:{ all -> 0x00d2 }
            X.0EO r5 = new X.0EO     // Catch:{ all -> 0x00d2 }
            r0 = r18
            r5.<init>(r15, r0, r14, r13)     // Catch:{ all -> 0x00d2 }
            r0 = r17
            X.0EO r5 = r5.A01(r0)     // Catch:{ all -> 0x00d2 }
            monitor-exit(r12)     // Catch:{ SecurityException -> 0x010a, RuntimeException -> 0x00d5 }
            r0 = r19
            boolean r0 = r5.A0A(r0, r11, r9)     // Catch:{ SecurityException -> 0x010a, RuntimeException -> 0x00d5 }
            if (r0 == 0) goto L_0x00de
            r4.A02 = r10     // Catch:{ SecurityException -> 0x0113 }
            goto L_0x00e8
        L_0x00d2:
            r0 = move-exception
            monitor-exit(r12)     // Catch:{ SecurityException -> 0x010a, RuntimeException -> 0x00d5 }
            throw r0     // Catch:{ SecurityException -> 0x010a, RuntimeException -> 0x00d5 }
        L_0x00d5:
            r5 = move-exception
            java.lang.Throwable r0 = r5.getCause()     // Catch:{ SecurityException -> 0x0113 }
            boolean r0 = r0 instanceof android.os.DeadObjectException     // Catch:{ SecurityException -> 0x0113 }
            if (r0 == 0) goto L_0x0112
        L_0x00de:
            java.lang.String r5 = "FbnsAIDLClientManager"
            java.lang.String r0 = "open failed: bindService failure, do unbind to let service shutdown"
            X.AnonymousClass0LU.A0B(r5, r0)     // Catch:{ SecurityException -> 0x0113 }
            r6.unbindService(r9)     // Catch:{ SecurityException -> 0x0113 }
        L_0x00e8:
            r4.wait(r1)     // Catch:{ all -> 0x0189 }
            r5 = 2
            long r1 = r1 * r5
            int r8 = r8 + 1
            goto L_0x000e
        L_0x00f2:
            java.lang.String r5 = "FbnsAIDLClientManager"
            java.lang.String r2 = "Max Try reached for binding to FbnsAIDLService, threadId %d"
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0189 }
            long r0 = r0.getId()     // Catch:{ all -> 0x0189 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0189 }
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch:{ all -> 0x0189 }
            X.AnonymousClass0LU.A0N(r5, r2, r0)     // Catch:{ all -> 0x0189 }
            goto L_0x011b
        L_0x010a:
            r5 = move-exception
            java.lang.String r1 = "Failed to bind to service"
            r0 = r16
            X.AnonymousClass0LU.A0F(r0, r1, r5)     // Catch:{ SecurityException -> 0x0113 }
        L_0x0112:
            throw r5     // Catch:{ SecurityException -> 0x0113 }
        L_0x0113:
            r2 = move-exception
            java.lang.String r1 = "FbnsAIDLClientManager"
            java.lang.String r0 = "open failed: bindService throw SecurityException"
            X.AnonymousClass0LU.A0E(r1, r0, r2)     // Catch:{ all -> 0x0187 }
        L_0x011b:
            monitor-exit(r4)     // Catch:{ all -> 0x018c }
            com.facebook.push.fbns.ipc.FbnsAIDLRequest r6 = r3.A00     // Catch:{ all -> 0x018c }
            android.os.Bundle r0 = android.os.Bundle.EMPTY     // Catch:{ all -> 0x018c }
            com.facebook.push.fbns.ipc.FbnsAIDLResult r5 = new com.facebook.push.fbns.ipc.FbnsAIDLResult     // Catch:{ all -> 0x018c }
            r5.<init>((android.os.Bundle) r0)     // Catch:{ all -> 0x018c }
            monitor-enter(r4)     // Catch:{ DeadObjectException -> 0x0175, RemoteException -> 0x017b }
            java.lang.Integer r0 = r4.A02     // Catch:{ all -> 0x0168 }
            if (r0 != r7) goto L_0x0160
            com.facebook.push.fbns.ipc.IFbnsAIDLService r2 = r4.A01     // Catch:{ all -> 0x0172 }
            if (r2 == 0) goto L_0x016a
            monitor-exit(r4)     // Catch:{ DeadObjectException -> 0x0175, RemoteException -> 0x017b }
            int r0 = r6.A00     // Catch:{ DeadObjectException -> 0x0175, RemoteException -> 0x017b }
            java.util.Map r1 = X.C16930u0.A02     // Catch:{ DeadObjectException -> 0x0175, RemoteException -> 0x017b }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ DeadObjectException -> 0x0175, RemoteException -> 0x017b }
            java.lang.Object r0 = r1.get(r0)     // Catch:{ DeadObjectException -> 0x0175, RemoteException -> 0x017b }
            X.0u0 r0 = (X.C16930u0) r0     // Catch:{ DeadObjectException -> 0x0175, RemoteException -> 0x017b }
            if (r0 != 0) goto L_0x0141
            X.0u0 r0 = X.C16930u0.NOT_EXIST     // Catch:{ DeadObjectException -> 0x0175, RemoteException -> 0x017b }
        L_0x0141:
            boolean r0 = r0.A01     // Catch:{ DeadObjectException -> 0x0175, RemoteException -> 0x017b }
            if (r0 == 0) goto L_0x0153
            android.os.Bundle r0 = r6.A00     // Catch:{ DeadObjectException -> 0x0175, RemoteException -> 0x017b }
            if (r0 != 0) goto L_0x014b
            android.os.Bundle r0 = android.os.Bundle.EMPTY     // Catch:{ DeadObjectException -> 0x0175, RemoteException -> 0x017b }
        L_0x014b:
            r0.toString()     // Catch:{ DeadObjectException -> 0x0175, RemoteException -> 0x017b }
            com.facebook.push.fbns.ipc.FbnsAIDLResult r5 = r2.CYb(r6)     // Catch:{ DeadObjectException -> 0x0175, RemoteException -> 0x017b }
            goto L_0x0183
        L_0x0153:
            android.os.Bundle r0 = r6.A00     // Catch:{ DeadObjectException -> 0x0175, RemoteException -> 0x017b }
            if (r0 != 0) goto L_0x0159
            android.os.Bundle r0 = android.os.Bundle.EMPTY     // Catch:{ DeadObjectException -> 0x0175, RemoteException -> 0x017b }
        L_0x0159:
            r0.toString()     // Catch:{ DeadObjectException -> 0x0175, RemoteException -> 0x017b }
            r2.D8a(r6)     // Catch:{ DeadObjectException -> 0x0175, RemoteException -> 0x017b }
            goto L_0x0183
        L_0x0160:
            java.lang.String r0 = "AIDLService is not bound"
            android.os.RemoteException r1 = new android.os.RemoteException     // Catch:{ all -> 0x0172 }
            r1.<init>(r0)     // Catch:{ all -> 0x0172 }
            goto L_0x0171
        L_0x0168:
            r1 = move-exception
            goto L_0x0171
        L_0x016a:
            java.lang.String r0 = "AIDLService is null"
            android.os.RemoteException r1 = new android.os.RemoteException     // Catch:{ all -> 0x0172 }
            r1.<init>(r0)     // Catch:{ all -> 0x0172 }
        L_0x0171:
            throw r1     // Catch:{ all -> 0x0172 }
        L_0x0172:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ DeadObjectException -> 0x0175, RemoteException -> 0x017b }
            throw r0     // Catch:{ DeadObjectException -> 0x0175, RemoteException -> 0x017b }
        L_0x0175:
            r2 = move-exception
            java.lang.String r1 = "FbnsAIDLClientManager"
            java.lang.String r0 = "Fbns AIDL request got DeadObjectException"
            goto L_0x0180
        L_0x017b:
            r2 = move-exception
            java.lang.String r1 = "FbnsAIDLClientManager"
            java.lang.String r0 = "Fbns AIDL request got RemoteException"
        L_0x0180:
            X.AnonymousClass0LU.A0E(r1, r0, r2)     // Catch:{ all -> 0x018c }
        L_0x0183:
            X.C16950u2.A00(r4)
            return r5
        L_0x0187:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0189 }
        L_0x0189:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x018c }
            throw r0     // Catch:{ all -> 0x018c }
        L_0x018c:
            r1 = move-exception
            X.0u2 r0 = r3.A01
            X.C16950u2.A00(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16960u4.call():java.lang.Object");
    }
}
