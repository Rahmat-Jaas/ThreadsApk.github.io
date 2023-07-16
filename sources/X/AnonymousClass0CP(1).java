package X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.os.PowerManager;
import android.os.RemoteException;
import java.util.concurrent.TimeUnit;

/* renamed from: X.0CP  reason: invalid class name */
public final class AnonymousClass0CP {
    public static AnonymousClass0CP A02;
    public static final long A03 = TimeUnit.SECONDS.toMillis(60);
    public final Context A00;
    public final AnonymousClass0C6 A01;

    public final int A02(Intent intent, AnonymousClass0CO r11) {
        String str;
        if (intent != null) {
            try {
                Bundle extras = intent.getExtras();
                Context context = this.A00;
                AnonymousClass0CN A002 = AnonymousClass0CN.A00(context, extras);
                PowerManager.WakeLock A003 = C13750oF.A00((PowerManager) A002.A03.getApplicationContext().getSystemService("power"), AnonymousClass00U.A05(A002.A02, "UploadServiceLogic-", intent.getComponent().getShortClassName(), "-service-"), 1);
                A002.A00 = A003;
                C13750oF.A03(A003);
                PowerManager.WakeLock wakeLock = A002.A00;
                long j = A03;
                wakeLock.acquire(j);
                AnonymousClass0DB.A01(wakeLock, j);
                Messenger messenger = A002.A05;
                if (messenger != null) {
                    try {
                        messenger.send(Message.obtain());
                    } catch (RemoteException unused) {
                        AnonymousClass0LU.A0C("UploadServiceLogic", "The peer died unexpectedly, possible wakelock gap detected.");
                    }
                }
                C02570By r3 = A002.A06;
                String str2 = r3.A09;
                if (str2 != null) {
                    C02200Af A004 = C02200Af.A00(context);
                    C02200Af.A02(A004, str2, A004.A03);
                }
                A01(A002, r11, intent.getAction());
                return !r3.A0B ? 3 : 2;
            } catch (IllegalArgumentException e) {
                e = e;
                str = "Failure in runJobNow";
                AnonymousClass0LU.A0G("UploadServiceLogic", str, e);
                r11.A01.stopSelf(r11.A00);
                return 2;
            } catch (AnonymousClass0BI e2) {
                e = e2;
                str = "Misunderstood service intent: %s";
                AnonymousClass0LU.A0G("UploadServiceLogic", str, e);
                r11.A01.stopSelf(r11.A00);
                return 2;
            }
        } else {
            throw new AnonymousClass0BI("Received a null intent in runJobFromService, did you ever return START_STICKY?");
        }
    }

    public final void A05(AnonymousClass0CN r2, String str) {
        A01(r2, (AnonymousClass0CO) null, str);
    }

    public static synchronized AnonymousClass0CP A00(Context context) {
        AnonymousClass0CP r0;
        synchronized (AnonymousClass0CP.class) {
            r0 = A02;
            if (r0 == null) {
                r0 = new AnonymousClass0CP(context);
                A02 = r0;
            }
        }
        return r0;
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    private void A01(X.AnonymousClass0CN r7, X.AnonymousClass0CO r8, java.lang.String r9) {
        /*
            r6 = this;
            java.lang.String r0 = "com.facebook.analytics2.logger.UPLOAD_NOW"
            boolean r0 = r0.equals(r9)
            if (r0 == 0) goto L_0x0030
            X.0C6 r3 = r6.A01
            X.AnonymousClass0SJ.A00(r3)
            int r2 = r7.A02
            java.lang.String r1 = r7.A08
            X.0By r0 = r7.A06
            X.0Bz r5 = new X.0Bz
            r5.<init>(r0, r1, r2)
        L_0x0018:
            X.0C0 r1 = r7.A01
            if (r1 != 0) goto L_0x0029
            android.content.Context r0 = r7.A03
            X.0CD r0 = X.AnonymousClass0CD.A00(r0)
            X.0CL r1 = new X.0CL
            r1.<init>(r0, r7)
            r7.A01 = r1
        L_0x0029:
            X.0C8 r4 = new X.0C8
            r4.<init>(r1, r8)
            monitor-enter(r3)
            goto L_0x0056
        L_0x0030:
            java.lang.String r0 = "com.facebook.analytics2.logger.USER_LOGOUT"
            boolean r0 = r0.equals(r9)
            if (r0 == 0) goto L_0x008f
            android.os.Bundle r1 = r7.A04
            X.AnonymousClass0SJ.A00(r1)
            java.lang.String r0 = "user_id"
            r1.getString(r0)
            X.0C6 r3 = r6.A01
            X.AnonymousClass0SJ.A00(r3)
            int r2 = r7.A02
            X.0By r1 = r7.A06
            java.lang.String r0 = r7.A08
            X.AnonymousClass0SJ.A00(r0)
            X.0Bz r5 = new X.0Bz
            r5.<init>(r1, r0, r2)
            goto L_0x0018
        L_0x0056:
            android.util.SparseArray r1 = r3.A01     // Catch:{ all -> 0x008c }
            int r0 = r5.A00     // Catch:{ all -> 0x008c }
            java.lang.Object r2 = r1.get(r0)     // Catch:{ all -> 0x008c }
            X.0C5 r2 = (X.AnonymousClass0C5) r2     // Catch:{ all -> 0x008c }
            monitor-enter(r3)     // Catch:{ all -> 0x008c }
            if (r2 == 0) goto L_0x0069
            X.0C1 r0 = r2.A00     // Catch:{ all -> 0x006d }
            if (r0 == 0) goto L_0x0069
            r0 = 0
            goto L_0x0071
        L_0x0069:
            X.AnonymousClass0C6.A00(r5, r4, r3)     // Catch:{ all -> 0x006d }
            goto L_0x0070
        L_0x006d:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x008c }
            throw r0     // Catch:{ all -> 0x008c }
        L_0x0070:
            r0 = 1
        L_0x0071:
            monitor-exit(r3)     // Catch:{ all -> 0x008c }
            if (r0 != 0) goto L_0x008a
            X.AnonymousClass0SJ.A00(r2)     // Catch:{ all -> 0x008c }
            X.0C3 r1 = new X.0C3     // Catch:{ all -> 0x008c }
            r1.<init>(r5, r4, r3)     // Catch:{ all -> 0x008c }
            java.util.ArrayDeque r0 = r2.A01     // Catch:{ all -> 0x008c }
            if (r0 != 0) goto L_0x0087
            java.util.ArrayDeque r0 = new java.util.ArrayDeque     // Catch:{ all -> 0x008c }
            r0.<init>()     // Catch:{ all -> 0x008c }
            r2.A01 = r0     // Catch:{ all -> 0x008c }
        L_0x0087:
            r0.offer(r1)     // Catch:{ all -> 0x008c }
        L_0x008a:
            monitor-exit(r3)
            return
        L_0x008c:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x008f:
            java.lang.String r0 = "Unknown action="
            java.lang.String r1 = X.AnonymousClass00U.A0L(r0, r9)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0CP.A01(X.0CN, X.0CO, java.lang.String):void");
    }

    public final void A03(int i) {
        AnonymousClass0C1 r1;
        AnonymousClass0C6 r2 = this.A01;
        AnonymousClass0SJ.A00(r2);
        synchronized (r2) {
            AnonymousClass0C5 r0 = (AnonymousClass0C5) r2.A01.get(i);
            if (!(r0 == null || (r1 = r0.A00) == null)) {
                r1.sendMessageAtFrontOfQueue(r1.obtainMessage(3));
            }
        }
    }

    public final void A04(C02570By r6, AnonymousClass0CK r7, String str, int i) {
        boolean z;
        String str2 = r6.A09;
        if (str2 != null) {
            C02200Af A002 = C02200Af.A00(this.A00);
            C02200Af.A02(A002, str2, A002.A03);
        }
        AnonymousClass0C6 r4 = this.A01;
        AnonymousClass0SJ.A00(r4);
        C02580Bz r3 = new C02580Bz(r6, str, i);
        AnonymousClass0CS r2 = new AnonymousClass0CS(r7);
        synchronized (r4) {
            AnonymousClass0C5 r0 = (AnonymousClass0C5) r4.A01.get(r3.A00);
            if (r0 != null) {
                if (r0.A00 != null) {
                    z = false;
                }
            }
            AnonymousClass0C6.A00(r3, r2, r4);
            z = true;
        }
        if (!z) {
            r7.CV4(true);
        }
    }

    public AnonymousClass0CP(Context context) {
        this.A00 = context.getApplicationContext();
        this.A01 = new AnonymousClass0C6(context.getApplicationContext());
    }
}
