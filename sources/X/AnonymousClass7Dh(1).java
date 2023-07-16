package X;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.os.Messenger;
import android.util.Log;
import com.google.firebase.iid.zzm;

/* renamed from: X.7Dh  reason: invalid class name */
public final class AnonymousClass7Dh {
    public static int A06;
    public static PendingIntent A07;
    public Messenger A00;
    public zzm A01;
    public Messenger A02;
    public final Context A03;
    public final C002000x A04 = new C002000x();
    public final AnonymousClass7HG A05;

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
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public static final android.os.Bundle A00(android.os.Bundle r10, X.AnonymousClass7Dh r11) {
        /*
            java.lang.Class<X.7Dh> r6 = X.AnonymousClass7Dh.class
            monitor-enter(r6)
            int r1 = A06     // Catch:{ all -> 0x00f9 }
            int r0 = r1 + 1
            A06 = r0     // Catch:{ all -> 0x00f9 }
            java.lang.String r5 = java.lang.Integer.toString(r1)     // Catch:{ all -> 0x00f9 }
            monitor-exit(r6)
            X.6rN r8 = new X.6rN
            r8.<init>()
            X.00x r4 = r11.A04
            monitor-enter(r4)
            r4.put(r5, r8)     // Catch:{ all -> 0x00f6 }
            monitor-exit(r4)     // Catch:{ all -> 0x00f6 }
            X.7HG r9 = r11.A05
            int r0 = r9.A03()
            if (r0 == 0) goto L_0x00ef
            android.content.Intent r7 = X.C18230wP.A0B()
            java.lang.String r0 = "com.google.android.gms"
            r7.setPackage(r0)
            int r0 = r9.A03()
            r3 = 2
            if (r0 != r3) goto L_0x003e
            java.lang.String r0 = "com.google.iid.TOKEN_REQUEST"
        L_0x0034:
            r7.setAction(r0)
            r7.putExtras(r10)
            android.content.Context r2 = r11.A03
            monitor-enter(r6)
            goto L_0x0041
        L_0x003e:
            java.lang.String r0 = "com.google.android.c2dm.intent.REGISTER"
            goto L_0x0034
        L_0x0041:
            android.app.PendingIntent r1 = A07     // Catch:{ all -> 0x00f9 }
            if (r1 != 0) goto L_0x0055
            android.content.Intent r1 = X.C18230wP.A0B()     // Catch:{ all -> 0x00f9 }
            java.lang.String r0 = "com.google.example.invalidpackage"
            r1.setPackage(r0)     // Catch:{ all -> 0x00f9 }
            r0 = 0
            android.app.PendingIntent r1 = android.app.PendingIntent.getBroadcast(r2, r0, r1, r0)     // Catch:{ all -> 0x00f9 }
            A07 = r1     // Catch:{ all -> 0x00f9 }
        L_0x0055:
            java.lang.String r0 = "app"
            r7.putExtra(r0, r1)     // Catch:{ all -> 0x00f9 }
            monitor-exit(r6)
            java.lang.String r6 = "kid"
            int r0 = X.C86104wH.A0A(r5)
            int r0 = r0 + 5
            java.lang.StringBuilder r1 = X.C86114wI.A0s(r0)
            java.lang.String r0 = "|ID|"
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = "|"
            java.lang.String r0 = X.C18180wK.A0i(r0, r1)
            r7.putExtra(r6, r0)
            java.lang.String r6 = "FirebaseInstanceId"
            r10 = 3
            boolean r0 = android.util.Log.isLoggable(r6, r10)
            if (r0 == 0) goto L_0x008c
            android.os.Bundle r0 = r7.getExtras()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String.valueOf(r0)
        L_0x008c:
            java.lang.String r1 = "google.messenger"
            android.os.Messenger r0 = r11.A02
            r7.putExtra(r1, r0)
            android.os.Messenger r0 = r11.A00
            if (r0 != 0) goto L_0x009b
            com.google.firebase.iid.zzm r0 = r11.A01
            if (r0 == 0) goto L_0x00b0
        L_0x009b:
            android.os.Message r1 = android.os.Message.obtain()
            r1.obj = r7
            android.os.Messenger r0 = r11.A00     // Catch:{ RemoteException -> 0x00ad }
            if (r0 != 0) goto L_0x00a9
            com.google.firebase.iid.zzm r0 = r11.A01     // Catch:{ RemoteException -> 0x00ad }
            android.os.Messenger r0 = r0.A00     // Catch:{ RemoteException -> 0x00ad }
        L_0x00a9:
            r0.send(r1)     // Catch:{ RemoteException -> 0x00ad }
            goto L_0x00bd
        L_0x00ad:
            android.util.Log.isLoggable(r6, r10)
        L_0x00b0:
            int r0 = r9.A03()
            if (r0 != r3) goto L_0x00ba
            r2.sendBroadcast(r7)
            goto L_0x00bd
        L_0x00ba:
            r2.startService(r7)
        L_0x00bd:
            X.7HU r3 = r8.A00     // Catch:{ InterruptedException | TimeoutException -> 0x00d9, ExecutionException -> 0x00d2 }
            r1 = 30000(0x7530, double:1.4822E-319)
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ InterruptedException | TimeoutException -> 0x00d9, ExecutionException -> 0x00d2 }
            java.lang.Object r0 = X.C117056y3.A01(r3, r0, r1)     // Catch:{ InterruptedException | TimeoutException -> 0x00d9, ExecutionException -> 0x00d2 }
            android.os.Bundle r0 = (android.os.Bundle) r0     // Catch:{ InterruptedException | TimeoutException -> 0x00d9, ExecutionException -> 0x00d2 }
            monitor-enter(r4)
            r4.remove(r5)     // Catch:{ all -> 0x00cf }
            monitor-exit(r4)     // Catch:{ all -> 0x00cf }
            return r0
        L_0x00cf:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x00cf }
            throw r0
        L_0x00d2:
            r1 = move-exception
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x00e5 }
            r0.<init>(r1)     // Catch:{ all -> 0x00e5 }
            goto L_0x00e4
        L_0x00d9:
            java.lang.String r0 = "No response"
            android.util.Log.w(r6, r0)     // Catch:{ all -> 0x00e5 }
            java.lang.String r0 = "TIMEOUT"
            java.io.IOException r0 = X.C86154wM.A0V(r0)     // Catch:{ all -> 0x00e5 }
        L_0x00e4:
            throw r0     // Catch:{ all -> 0x00e5 }
        L_0x00e5:
            r0 = move-exception
            monitor-enter(r4)
            r4.remove(r5)     // Catch:{ all -> 0x00ec }
        L_0x00ea:
            monitor-exit(r4)     // Catch:{ all -> 0x00ec }
            goto L_0x00ee
        L_0x00ec:
            r0 = move-exception
            goto L_0x00ea
        L_0x00ee:
            throw r0
        L_0x00ef:
            java.lang.String r0 = "MISSING_INSTANCEID_SERVICE"
            java.io.IOException r0 = X.C86154wM.A0V(r0)
            throw r0
        L_0x00f6:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x00f6 }
            throw r0
        L_0x00f9:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7Dh.A00(android.os.Bundle, X.7Dh):android.os.Bundle");
    }

    public static final void A01(Bundle bundle, AnonymousClass7Dh r2, String str) {
        C002000x r22 = r2.A04;
        synchronized (r22) {
            C113426rN r0 = (C113426rN) r22.remove(str);
            if (r0 == null) {
                Log.w("FirebaseInstanceId", C86104wH.A0w(str, "Missing callback for "));
            } else {
                r0.A00.A0B(bundle);
            }
        }
    }

    public AnonymousClass7Dh(Context context, AnonymousClass7HG r4) {
        this.A03 = context;
        this.A05 = r4;
        this.A02 = new Messenger(new AnonymousClass5qF(Looper.getMainLooper(), this));
    }
}
