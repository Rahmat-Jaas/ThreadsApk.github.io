package com.google.ar.core;

import X.AnonymousClass0wJ;
import X.AnonymousClass4VQ;
import X.AnonymousClass5rT;
import X.AnonymousClass5rU;
import X.AnonymousClass5rV;
import X.AnonymousClass5rW;
import X.AnonymousClass5rX;
import X.AnonymousClass696;
import X.C86134wK;
import java.util.HashMap;
import java.util.Map;

public final class ArCoreApkJniAdapter {
    public static final Map a;

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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:158:0x01bb=Splitter:B:158:0x01bb, B:152:0x01ae=Splitter:B:152:0x01ae} */
    public static int checkAvailability(android.content.Context r10) {
        /*
            X.7Gi r2 = X.AnonymousClass7Gi.A06     // Catch:{ all -> 0x01d4 }
            X.AnonymousClass7Gi.A01(r10, r2)     // Catch:{ 88j -> 0x01c7 }
            int r0 = X.AnonymousClass7Gi.A00(r10)     // Catch:{ 88j -> 0x01c7 }
            if (r0 == 0) goto L_0x00ff
            int r1 = X.AnonymousClass7Gi.A00(r10)     // Catch:{ 88j -> 0x01c7 }
            int r0 = r2.A00     // Catch:{ 88j -> 0x01c7 }
            if (r1 >= r0) goto L_0x00ff
            monitor-enter(r2)     // Catch:{ all -> 0x01d4 }
            X.68r r1 = r2.A01     // Catch:{ all -> 0x00fc }
            if (r1 == 0) goto L_0x0024
            boolean r0 = r1 instanceof X.AnonymousClass5rI     // Catch:{ all -> 0x00fc }
            if (r0 != 0) goto L_0x0024
            boolean r0 = r1 instanceof X.AnonymousClass5rH     // Catch:{ all -> 0x00fc }
            if (r0 != 0) goto L_0x0024
            boolean r0 = r1 instanceof X.AnonymousClass5rG     // Catch:{ all -> 0x00fc }
            if (r0 == 0) goto L_0x004d
        L_0x0024:
            boolean r0 = r2.A03     // Catch:{ all -> 0x00fc }
            if (r0 != 0) goto L_0x004d
            r6 = 1
            r2.A03 = r6     // Catch:{ all -> 0x00fc }
            X.6oW r5 = new X.6oW     // Catch:{ all -> 0x00fc }
            r5.<init>(r2)     // Catch:{ all -> 0x00fc }
            X.AnonymousClass7Gi.A01(r10, r2)     // Catch:{ all -> 0x00fc }
            int r0 = X.AnonymousClass7Gi.A00(r10)     // Catch:{ all -> 0x00fc }
            if (r0 == 0) goto L_0x00d7
            int r1 = X.AnonymousClass7Gi.A00(r10)     // Catch:{ all -> 0x00fc }
            int r0 = r2.A00     // Catch:{ all -> 0x00fc }
            if (r1 >= r0) goto L_0x00d7
            int r1 = X.AnonymousClass7Gi.A00(r10)     // Catch:{ all -> 0x00fc }
            r0 = -1
            if (r1 == r0) goto L_0x0054
            X.68r r0 = X.C972668r.A02     // Catch:{ all -> 0x00fc }
            r5.A00(r0)     // Catch:{ all -> 0x00fc }
        L_0x004d:
            X.68r r0 = r2.A01     // Catch:{ all -> 0x00fc }
            if (r0 == 0) goto L_0x00de
            monitor-exit(r2)     // Catch:{ all -> 0x00fc }
            goto L_0x01d1
        L_0x0054:
            X.AnonymousClass7Gi.A01(r10, r2)     // Catch:{ all -> 0x00fc }
            boolean r0 = r2.A04     // Catch:{ all -> 0x00fc }
            if (r0 == 0) goto L_0x0061
            X.68r r0 = X.C972668r.A04     // Catch:{ all -> 0x00fc }
            r5.A00(r0)     // Catch:{ all -> 0x00fc }
            goto L_0x004d
        L_0x0061:
            r9 = r2
            monitor-enter(r9)     // Catch:{ all -> 0x00fc }
            X.76g r4 = r2.A02     // Catch:{ all -> 0x00f9 }
            if (r4 != 0) goto L_0x009d
            r8 = 0
            X.76g r4 = new X.76g     // Catch:{ all -> 0x00f9 }
            r4.<init>(r8)     // Catch:{ all -> 0x00f9 }
            android.content.Context r7 = r10.getApplicationContext()     // Catch:{ all -> 0x00f9 }
            monitor-enter(r4)     // Catch:{ all -> 0x00f9 }
            r4.A00 = r7     // Catch:{ all -> 0x00f3 }
            java.lang.String r0 = "com.google.android.play.core.install.BIND_INSTALL_SERVICE"
            android.content.Intent r1 = X.C18250wR.A05(r0)     // Catch:{ all -> 0x00f3 }
            java.lang.String r0 = "com.android.vending"
            android.content.Intent r0 = r1.setPackage(r0)     // Catch:{ all -> 0x00f3 }
            android.content.ServiceConnection r3 = r4.A02     // Catch:{ all -> 0x00f3 }
            boolean r0 = r7.bindService(r0, r3, r6)     // Catch:{ all -> 0x00f3 }
            if (r0 == 0) goto L_0x008c
            r0 = 2
            r4.A04 = r0     // Catch:{ all -> 0x00f3 }
            goto L_0x009a
        L_0x008c:
            r4.A04 = r6     // Catch:{ all -> 0x00f3 }
            r4.A00 = r8     // Catch:{ all -> 0x00f3 }
            java.lang.String r1 = "ARCore-InstallService"
            java.lang.String r0 = "bindService returned false."
            android.util.Log.w(r1, r0)     // Catch:{ all -> 0x00f3 }
            r7.unbindService(r3)     // Catch:{ all -> 0x00f3 }
        L_0x009a:
            monitor-exit(r4)     // Catch:{ all -> 0x00f9 }
            r2.A02 = r4     // Catch:{ all -> 0x00f9 }
        L_0x009d:
            monitor-exit(r9)     // Catch:{ all -> 0x00fc }
            monitor-enter(r4)     // Catch:{ all -> 0x00fc }
            X.82Q r3 = new X.82Q     // Catch:{ 6C7 -> 0x00c8 }
            r3.<init>(r10, r5, r4)     // Catch:{ 6C7 -> 0x00c8 }
            monitor-enter(r4)     // Catch:{ 6C7 -> 0x00c8 }
            int r0 = r4.A04     // Catch:{ all -> 0x00c5 }
            int r1 = r0 + -1
            if (r0 == 0) goto L_0x00bd
            if (r1 == 0) goto L_0x00bf
            if (r1 == r6) goto L_0x00b6
            r0 = 2
            if (r1 != r0) goto L_0x00bb
            r3.run()     // Catch:{ all -> 0x00c5 }
            goto L_0x00bb
        L_0x00b6:
            java.util.Queue r0 = r4.A03     // Catch:{ all -> 0x00c5 }
            r0.offer(r3)     // Catch:{ all -> 0x00c5 }
        L_0x00bb:
            monitor-exit(r4)     // Catch:{ 6C7 -> 0x00c8 }
            goto L_0x00d4
        L_0x00bd:
            r0 = 0
            goto L_0x00c4
        L_0x00bf:
            X.6C7 r0 = new X.6C7     // Catch:{ all -> 0x00c5 }
            r0.<init>()     // Catch:{ all -> 0x00c5 }
        L_0x00c4:
            throw r0     // Catch:{ all -> 0x00c5 }
        L_0x00c5:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ 6C7 -> 0x00c8 }
            throw r0     // Catch:{ 6C7 -> 0x00c8 }
        L_0x00c8:
            java.lang.String r1 = "ARCore-InstallService"
            java.lang.String r0 = "Play Store install service could not be bound."
            android.util.Log.e(r1, r0)     // Catch:{ all -> 0x00f6 }
            X.68r r0 = X.C972668r.A06     // Catch:{ all -> 0x00f6 }
            r5.A00(r0)     // Catch:{ all -> 0x00f6 }
        L_0x00d4:
            monitor-exit(r4)     // Catch:{ all -> 0x00fc }
            goto L_0x004d
        L_0x00d7:
            X.68r r0 = X.C972668r.A03     // Catch:{ all -> 0x00fc }
            r5.A00(r0)     // Catch:{ all -> 0x00fc }
            goto L_0x004d
        L_0x00de:
            boolean r0 = r2.A03     // Catch:{ all -> 0x00fc }
            if (r0 == 0) goto L_0x00e7
            X.68r r0 = X.C972668r.A05     // Catch:{ all -> 0x00fc }
            monitor-exit(r2)     // Catch:{ all -> 0x00fc }
            goto L_0x01d1
        L_0x00e7:
            java.lang.String r1 = "ARCore-ArCoreApk"
            java.lang.String r0 = "request not running but result is null?"
            android.util.Log.e(r1, r0)     // Catch:{ all -> 0x00fc }
            X.68r r0 = X.C972668r.A06     // Catch:{ all -> 0x00fc }
            monitor-exit(r2)     // Catch:{ all -> 0x00fc }
            goto L_0x01d1
        L_0x00f3:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x00f9 }
            throw r0     // Catch:{ all -> 0x00f9 }
        L_0x00f6:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x00fc }
            goto L_0x00fb
        L_0x00f9:
            r0 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x00fc }
        L_0x00fb:
            throw r0     // Catch:{ all -> 0x00fc }
        L_0x00fc:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x00fc }
            throw r0     // Catch:{ all -> 0x01d4 }
        L_0x00ff:
            monitor-enter(r2)     // Catch:{ 88j -> 0x01c7 }
            X.76g r5 = r2.A02     // Catch:{ all -> 0x01c4 }
            if (r5 == 0) goto L_0x0126
            monitor-enter(r5)     // Catch:{ all -> 0x01c4 }
            int r0 = r5.A04     // Catch:{ all -> 0x0123 }
            int r1 = r0 + -1
            r4 = 0
            if (r0 == 0) goto L_0x0122
            r3 = 1
            if (r1 == r3) goto L_0x0113
            r0 = 2
            if (r1 == r0) goto L_0x0113
            goto L_0x011e
        L_0x0113:
            android.content.Context r1 = r5.A00     // Catch:{ all -> 0x0123 }
            android.content.ServiceConnection r0 = r5.A02     // Catch:{ all -> 0x0123 }
            r1.unbindService(r0)     // Catch:{ all -> 0x0123 }
            r5.A00 = r4     // Catch:{ all -> 0x0123 }
            r5.A04 = r3     // Catch:{ all -> 0x0123 }
        L_0x011e:
            monitor-exit(r5)     // Catch:{ all -> 0x01c4 }
            r2.A02 = r4     // Catch:{ all -> 0x01c4 }
            goto L_0x0126
        L_0x0122:
            throw r4     // Catch:{ all -> 0x0123 }
        L_0x0123:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x01c4 }
            throw r0     // Catch:{ all -> 0x01c4 }
        L_0x0126:
            monitor-exit(r2)     // Catch:{ 88j -> 0x01c7 }
            java.lang.String r5 = ""
            r2 = 0
            android.content.ContentResolver r4 = r10.getContentResolver()     // Catch:{ ReflectiveOperationException | RuntimeException -> 0x01bb, 5rX | RuntimeException -> 0x01be }
            android.net.Uri$Builder r1 = new android.net.Uri$Builder     // Catch:{ ReflectiveOperationException | RuntimeException -> 0x01bb, 5rX | RuntimeException -> 0x01be }
            r1.<init>()     // Catch:{ ReflectiveOperationException | RuntimeException -> 0x01bb, 5rX | RuntimeException -> 0x01be }
            java.lang.String r0 = "content"
            android.net.Uri$Builder r1 = r1.scheme(r0)     // Catch:{ ReflectiveOperationException | RuntimeException -> 0x01bb, 5rX | RuntimeException -> 0x01be }
            java.lang.String r0 = "com.google.ar.core.services.arcorecontentprovider"
            android.net.Uri$Builder r0 = r1.authority(r0)     // Catch:{ ReflectiveOperationException | RuntimeException -> 0x01bb, 5rX | RuntimeException -> 0x01be }
            android.net.Uri$Builder r0 = r0.path(r5)     // Catch:{ ReflectiveOperationException | RuntimeException -> 0x01bb, 5rX | RuntimeException -> 0x01be }
            android.net.Uri r3 = r0.build()     // Catch:{ ReflectiveOperationException | RuntimeException -> 0x01bb, 5rX | RuntimeException -> 0x01be }
            java.lang.String r1 = "getSetupIntent"
            java.lang.String r0 = r10.getPackageName()     // Catch:{ ReflectiveOperationException | RuntimeException -> 0x01bb, 5rX | RuntimeException -> 0x01be }
            android.os.Bundle r4 = r4.call(r3, r1, r0, r2)     // Catch:{ ReflectiveOperationException | RuntimeException -> 0x01bb, 5rX | RuntimeException -> 0x01be }
            if (r4 == 0) goto L_0x01bb
            java.lang.String r0 = "intent"
            android.os.Parcelable r0 = r4.getParcelable(r0)     // Catch:{ ReflectiveOperationException | RuntimeException -> 0x01bb, 5rX | RuntimeException -> 0x01be }
            android.app.PendingIntent r0 = (android.app.PendingIntent) r0     // Catch:{ ReflectiveOperationException | RuntimeException -> 0x01bb, 5rX | RuntimeException -> 0x01be }
            if (r0 == 0) goto L_0x0160
            X.68r r0 = X.C972668r.A02     // Catch:{ 5rV -> 0x01c1, 5rX | RuntimeException -> 0x01be }
            goto L_0x01d1
        L_0x0160:
            java.lang.String r0 = "exceptionType"
            java.lang.String r1 = r4.getString(r0, r5)     // Catch:{ ReflectiveOperationException | RuntimeException -> 0x01bb, 5rX | RuntimeException -> 0x01be }
            boolean r0 = r1.isEmpty()     // Catch:{ ReflectiveOperationException | RuntimeException -> 0x01bb, 5rX | RuntimeException -> 0x01be }
            if (r0 != 0) goto L_0x01bb
            java.lang.Class<X.5rV> r0 = X.AnonymousClass5rV.class
            java.lang.String r0 = r0.getName()     // Catch:{ ReflectiveOperationException | RuntimeException -> 0x01bb, 5rX | RuntimeException -> 0x01be }
            boolean r0 = r1.equals(r0)     // Catch:{ ReflectiveOperationException | RuntimeException -> 0x01bb, 5rX | RuntimeException -> 0x01be }
            if (r0 != 0) goto L_0x01b5
            java.lang.Class<X.5rX> r0 = X.AnonymousClass5rX.class
            java.lang.String r0 = r0.getName()     // Catch:{ ReflectiveOperationException | RuntimeException -> 0x01bb, 5rX | RuntimeException -> 0x01be }
            boolean r0 = r1.equals(r0)     // Catch:{ ReflectiveOperationException | RuntimeException -> 0x01bb, 5rX | RuntimeException -> 0x01be }
            if (r0 != 0) goto L_0x01af
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch:{ ReflectiveOperationException | RuntimeException -> 0x01bb, 5rX | RuntimeException -> 0x01be }
            java.lang.Class<java.lang.RuntimeException> r0 = java.lang.RuntimeException.class
            java.lang.Class r3 = r1.asSubclass(r0)     // Catch:{ ReflectiveOperationException | RuntimeException -> 0x01bb, 5rX | RuntimeException -> 0x01be }
            java.lang.String r0 = "exceptionText"
            java.lang.String r1 = r4.getString(r0, r2)     // Catch:{ ReflectiveOperationException | RuntimeException -> 0x01bb, 5rX | RuntimeException -> 0x01be }
            r2 = 0
            if (r1 == 0) goto L_0x01a0
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            java.lang.Object r0 = X.C86134wK.A0h(r0, r3, r1)     // Catch:{ ReflectiveOperationException | RuntimeException -> 0x01bb, 5rX | RuntimeException -> 0x01be }
            java.lang.RuntimeException r0 = (java.lang.RuntimeException) r0     // Catch:{ ReflectiveOperationException | RuntimeException -> 0x01bb, 5rX | RuntimeException -> 0x01be }
            goto L_0x01ae
        L_0x01a0:
            java.lang.Class[] r0 = new java.lang.Class[r2]     // Catch:{ ReflectiveOperationException | RuntimeException -> 0x01bb, 5rX | RuntimeException -> 0x01be }
            java.lang.reflect.Constructor r1 = r3.getConstructor(r0)     // Catch:{ ReflectiveOperationException | RuntimeException -> 0x01bb, 5rX | RuntimeException -> 0x01be }
            java.lang.Object[] r0 = new java.lang.Object[r2]     // Catch:{ ReflectiveOperationException | RuntimeException -> 0x01bb, 5rX | RuntimeException -> 0x01be }
            java.lang.Object r0 = r1.newInstance(r0)     // Catch:{ ReflectiveOperationException | RuntimeException -> 0x01bb, 5rX | RuntimeException -> 0x01be }
            java.lang.RuntimeException r0 = (java.lang.RuntimeException) r0     // Catch:{ ReflectiveOperationException | RuntimeException -> 0x01bb, 5rX | RuntimeException -> 0x01be }
        L_0x01ae:
            throw r0     // Catch:{ 5rV -> 0x01c1, 5rX | RuntimeException -> 0x01be }
        L_0x01af:
            X.5rX r0 = new X.5rX     // Catch:{ ReflectiveOperationException | RuntimeException -> 0x01bb, 5rX | RuntimeException -> 0x01be }
            r0.<init>()     // Catch:{ ReflectiveOperationException | RuntimeException -> 0x01bb, 5rX | RuntimeException -> 0x01be }
            goto L_0x01ba
        L_0x01b5:
            X.5rV r0 = new X.5rV     // Catch:{ ReflectiveOperationException | RuntimeException -> 0x01bb, 5rX | RuntimeException -> 0x01be }
            r0.<init>()     // Catch:{ ReflectiveOperationException | RuntimeException -> 0x01bb, 5rX | RuntimeException -> 0x01be }
        L_0x01ba:
            throw r0     // Catch:{ ReflectiveOperationException | RuntimeException -> 0x01bb, 5rX | RuntimeException -> 0x01be }
        L_0x01bb:
            X.68r r0 = X.C972668r.A03     // Catch:{ 5rV -> 0x01c1, 5rX | RuntimeException -> 0x01be }
            goto L_0x01d1
        L_0x01be:
            X.68r r0 = X.C972668r.A06     // Catch:{ 88j -> 0x01c7 }
            goto L_0x01d1
        L_0x01c1:
            X.68r r0 = X.C972668r.A08     // Catch:{ 88j -> 0x01c7 }
            goto L_0x01d1
        L_0x01c4:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ 88j -> 0x01c7 }
            throw r0     // Catch:{ 88j -> 0x01c7 }
        L_0x01c7:
            r2 = move-exception
            java.lang.String r1 = "ARCore-ArCoreApk"
            java.lang.String r0 = "Error while checking app details and ARCore status"
            android.util.Log.e(r1, r0, r2)     // Catch:{ all -> 0x01d4 }
            X.68r r0 = X.C972668r.A06     // Catch:{ all -> 0x01d4 }
        L_0x01d1:
            int r0 = r0.A00     // Catch:{ all -> 0x01d4 }
            return r0
        L_0x01d4:
            r2 = move-exception
            java.lang.String r1 = "ARCore-ArCoreApkJniAdapter"
            java.lang.String r0 = "Exception details:"
            android.util.Log.e(r1, r0, r2)
            java.lang.Class r2 = r2.getClass()
            java.util.Map r1 = a
            boolean r0 = r1.containsKey(r2)
            if (r0 == 0) goto L_0x01eb
            r1.get(r2)
        L_0x01eb:
            X.68r r0 = X.C972668r.A06
            int r0 = r0.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ar.core.ArCoreApkJniAdapter.checkAvailability(android.content.Context):int");
    }

    static {
        HashMap A0y = AnonymousClass0wJ.A0y();
        a = A0y;
        C86134wK.A1P(IllegalArgumentException.class, A0y, AnonymousClass696.A08.A00);
        C86134wK.A1P(AnonymousClass4VQ.class, A0y, AnonymousClass696.A09.A00);
        C86134wK.A1P(AnonymousClass5rU.class, A0y, AnonymousClass696.A0A.A00);
        C86134wK.A1P(AnonymousClass5rV.class, A0y, AnonymousClass696.A04.A00);
        C86134wK.A1P(AnonymousClass5rT.class, A0y, AnonymousClass696.A05.A00);
        C86134wK.A1P(AnonymousClass5rW.class, A0y, AnonymousClass696.A06.A00);
        C86134wK.A1P(AnonymousClass5rX.class, A0y, AnonymousClass696.A07.A00);
    }
}
