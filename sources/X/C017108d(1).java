package X;

import android.app.ActivityManager;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.08d  reason: invalid class name and case insensitive filesystem */
public final class C017108d extends Thread {
    public boolean A00;
    public boolean A01;
    public boolean A02;
    public final long A03;
    public final ActivityManager A04;
    public final Object A05 = new Object();
    public final Set A06 = new HashSet();
    public volatile C05010Qj A07;
    public final /* synthetic */ C017408g A08;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C017108d(ActivityManager activityManager, C05010Qj r4, C017408g r5, long j) {
        super(AnonymousClass00U.A0L("ProcessAnrErrorMonitorThread:", AnonymousClass0MI.A01()));
        this.A08 = r5;
        this.A04 = activityManager;
        this.A07 = r4;
        this.A03 = j;
        this.A00 = true;
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
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:210)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0136  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x015e  */
    public final void run() {
        /*
            r18 = this;
            r1 = r18
            X.0Qj r0 = r1.A07
            if (r0 != 0) goto L_0x002b
            r3 = 0
            java.lang.Object r5 = r1.A05
            monitor-enter(r5)
            X.0Qj r0 = r1.A07     // Catch:{ all -> 0x0028 }
            r2 = 0
            if (r0 != 0) goto L_0x0011
            r2 = 1
        L_0x0011:
            boolean r0 = r1.A02     // Catch:{ all -> 0x0028 }
            android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x0028 }
        L_0x0016:
            if (r2 == 0) goto L_0x0024
            r5.wait(r3)     // Catch:{ InterruptedException -> 0x001b }
        L_0x001b:
            X.0Qj r0 = r1.A07     // Catch:{ all -> 0x0028 }
            r2 = 0
            if (r0 != 0) goto L_0x0021
            r2 = 1
        L_0x0021:
            boolean r0 = r1.A02     // Catch:{ all -> 0x0028 }
            goto L_0x0016
        L_0x0024:
            monitor-exit(r5)     // Catch:{ all -> 0x0028 }
            if (r0 == 0) goto L_0x002b
            return
        L_0x0028:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0028 }
            throw r0
        L_0x002b:
            r10 = 0
        L_0x002c:
            r8 = 2
            r5 = 0
            X.08g r4 = r1.A08     // Catch:{ RuntimeException -> 0x0172 }
            android.app.ActivityManager r0 = r1.A04     // Catch:{ RuntimeException -> 0x0172 }
            java.util.List r0 = r0.getProcessesInErrorState()     // Catch:{ RuntimeException -> 0x0172 }
            java.util.LinkedList r6 = new java.util.LinkedList     // Catch:{ RuntimeException -> 0x0172 }
            r6.<init>()     // Catch:{ RuntimeException -> 0x0172 }
            if (r0 == 0) goto L_0x0078
            java.util.Iterator r9 = r0.iterator()     // Catch:{ RuntimeException -> 0x0172 }
        L_0x0041:
            boolean r0 = r9.hasNext()     // Catch:{ RuntimeException -> 0x0172 }
            if (r0 == 0) goto L_0x0078
            java.lang.Object r7 = r9.next()     // Catch:{ RuntimeException -> 0x0172 }
            android.app.ActivityManager$ProcessErrorStateInfo r7 = (android.app.ActivityManager.ProcessErrorStateInfo) r7     // Catch:{ RuntimeException -> 0x0172 }
            int r0 = r7.condition     // Catch:{ RuntimeException -> 0x0172 }
            if (r0 != r8) goto L_0x0041
            int r2 = r7.uid     // Catch:{ RuntimeException -> 0x0172 }
            int r0 = r4.A03     // Catch:{ RuntimeException -> 0x0172 }
            if (r2 != r0) goto L_0x0041
            X.08b r3 = new X.08b     // Catch:{ RuntimeException -> 0x0172 }
            r3.<init>()     // Catch:{ RuntimeException -> 0x0172 }
            java.lang.String r0 = r7.shortMsg     // Catch:{ RuntimeException -> 0x0172 }
            r3.A00 = r0     // Catch:{ RuntimeException -> 0x0172 }
            java.lang.String r0 = r7.tag     // Catch:{ RuntimeException -> 0x0172 }
            r3.A02 = r0     // Catch:{ RuntimeException -> 0x0172 }
            java.lang.String r2 = r7.processName     // Catch:{ RuntimeException -> 0x0172 }
            r3.A01 = r2     // Catch:{ RuntimeException -> 0x0172 }
            java.lang.String r0 = r4.A05     // Catch:{ RuntimeException -> 0x0172 }
            boolean r0 = r0.equals(r2)     // Catch:{ RuntimeException -> 0x0172 }
            if (r0 == 0) goto L_0x0074
            r6.addFirst(r3)     // Catch:{ RuntimeException -> 0x0172 }
            goto L_0x0041
        L_0x0074:
            r6.addLast(r3)     // Catch:{ RuntimeException -> 0x0172 }
            goto L_0x0041
        L_0x0078:
            boolean r0 = r1.A00     // Catch:{ RuntimeException -> 0x0172 }
            if (r0 == 0) goto L_0x0093
            java.lang.String r3 = "ProcessAnrErrorMonitor"
            java.lang.String r2 = "Starting process monitor checks for process '%s'"
            java.lang.String r0 = r4.A05     // Catch:{ RuntimeException -> 0x0172 }
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch:{ RuntimeException -> 0x0172 }
            X.AnonymousClass0LU.A0O(r3, r2, r0)     // Catch:{ RuntimeException -> 0x0172 }
            r1.A00 = r5     // Catch:{ RuntimeException -> 0x0172 }
            java.lang.Integer r3 = X.AnonymousClass006.A00     // Catch:{ RuntimeException -> 0x0172 }
            X.0Qj r2 = r1.A07     // Catch:{ RuntimeException -> 0x0172 }
            r0 = 0
            r4.A01(r2, r3, r0, r0)     // Catch:{ RuntimeException -> 0x0172 }
        L_0x0093:
            boolean r0 = r6.isEmpty()
            if (r0 != 0) goto L_0x011f
            java.lang.Object r7 = r6.getFirst()
            X.08b r7 = (X.C016908b) r7
            java.lang.String r2 = r4.A05
            java.lang.String r0 = r7.A01
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x011f
            if (r10 != 0) goto L_0x00c6
            r10 = 1
            java.lang.String r3 = "ProcessAnrErrorMonitor"
            java.lang.String r2 = r7.A00
            java.lang.String r0 = r7.A02
            java.lang.Object[] r2 = new java.lang.Object[]{r2, r0}
            java.lang.String r0 = "ANR detected Short msg: %s Tag: %s"
            X.AnonymousClass0LU.A0O(r3, r0, r2)
            java.lang.Integer r5 = X.AnonymousClass006.A0C
            X.0Qj r3 = r1.A07
            java.lang.String r2 = r7.A00
            java.lang.String r0 = r7.A02
            r4.A01(r3, r5, r2, r0)
        L_0x00c6:
            boolean r0 = r6.isEmpty()
            if (r0 != 0) goto L_0x0132
            java.lang.String r3 = r4.A05
            X.0Qj r0 = r1.A07
            if (r0 == 0) goto L_0x0132
            java.util.Iterator r7 = r6.iterator()
        L_0x00d6:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x0132
            java.lang.Object r5 = r7.next()
            X.08b r5 = (X.C016908b) r5
            java.lang.String r2 = r5.A01
            boolean r0 = r3.equals(r2)
            if (r0 != 0) goto L_0x00d6
            java.lang.String r6 = "ProcessAnrErrorMonitor"
            java.lang.Object[] r2 = new java.lang.Object[]{r2, r3}
            java.lang.String r0 = "Error found in process '%s' different from process being searched '%s'"
            X.AnonymousClass0LU.A0O(r6, r0, r2)
            java.lang.String r0 = r5.A01
            if (r0 == 0) goto L_0x00d6
            java.util.Set r2 = r1.A06
            boolean r0 = r2.contains(r0)
            if (r0 != 0) goto L_0x00d6
            X.0Qj r12 = r1.A07
            java.lang.String r13 = r5.A01
            java.lang.String r14 = r5.A00
            java.lang.String r15 = r5.A02
            long r16 = android.os.SystemClock.uptimeMillis()
            com.facebook.acra.anr.multisignal.MultiSignalANRDetector r0 = r12.A00
            android.os.Handler r0 = r0.A0Q
            X.08M r11 = new X.08M
            r11.<init>(r12, r13, r14, r15, r16)
            r0.post(r11)
            java.lang.String r0 = r5.A01
            r2.add(r0)
            goto L_0x00d6
        L_0x011f:
            if (r10 == 0) goto L_0x00c6
            java.lang.String r2 = "ProcessAnrErrorMonitor"
            java.lang.String r0 = "On error cleared"
            X.AnonymousClass0LU.A0C(r2, r0)
            java.lang.Integer r3 = X.AnonymousClass006.A01
            X.0Qj r2 = r1.A07
            r0 = 0
            r4.A01(r2, r3, r0, r0)
            r10 = 0
            goto L_0x00c6
        L_0x0132:
            X.0Qj r0 = r1.A07
            if (r0 == 0) goto L_0x0144
            X.0Qj r3 = r1.A07
            com.facebook.acra.anr.multisignal.MultiSignalANRDetector r0 = r3.A00
            android.os.Handler r2 = r0.A0Q
            X.08N r0 = new X.08N
            r0.<init>(r3)
            r2.post(r0)
        L_0x0144:
            java.lang.Object r6 = r1.A05
            monitor-enter(r6)
            boolean r0 = r1.A02     // Catch:{ all -> 0x016f }
            if (r0 != 0) goto L_0x0158
            r5 = 500(0x1f4, float:7.0E-43)
            goto L_0x015a
        L_0x014e:
            boolean r0 = r1.A01     // Catch:{ all -> 0x016f }
            if (r0 == 0) goto L_0x0156
            boolean r0 = r1.A02     // Catch:{ all -> 0x016f }
            if (r0 == 0) goto L_0x015a
        L_0x0156:
            boolean r0 = r1.A02     // Catch:{ all -> 0x016f }
        L_0x0158:
            monitor-exit(r6)     // Catch:{ all -> 0x016f }
            goto L_0x0164
        L_0x015a:
            boolean r0 = r1.A01     // Catch:{ all -> 0x016f }
            if (r0 == 0) goto L_0x015f
            r5 = 0
        L_0x015f:
            long r2 = (long) r5     // Catch:{ InterruptedException -> 0x014e }
            r6.wait(r2)     // Catch:{ InterruptedException -> 0x014e }
            goto L_0x014e
        L_0x0164:
            if (r0 == 0) goto L_0x002c
            java.lang.Integer r2 = X.AnonymousClass006.A0j
            X.0Qj r1 = r1.A07
            r0 = 0
            r4.A01(r1, r2, r0, r0)
            return
        L_0x016f:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x016f }
            throw r0
        L_0x0172:
            r4 = move-exception
            java.lang.Throwable r0 = r4.getCause()
            boolean r0 = r0 instanceof android.os.DeadObjectException
            if (r0 != 0) goto L_0x0184
            java.lang.Throwable r0 = r4.getCause()
            boolean r0 = r0 instanceof android.os.RemoteException
            if (r0 != 0) goto L_0x0184
            throw r4
        L_0x0184:
            X.08g r3 = r1.A08
            java.lang.Integer r2 = X.AnonymousClass006.A0u
            X.0Qj r1 = r1.A07
            r0 = 0
            r3.A01(r1, r2, r0, r0)
            java.lang.String r2 = "ProcessAnrErrorMonitor"
            java.lang.String r0 = r3.A05
            java.lang.Object[] r1 = new java.lang.Object[]{r0, r4}
            java.lang.String r0 = "Stopping checks for '%s' because of ERROR_QUERYING_ACTIVITY_MANAGER"
            X.AnonymousClass0LU.A0N(r2, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C017108d.run():void");
    }
}
