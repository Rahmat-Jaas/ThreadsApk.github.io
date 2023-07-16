package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import com.facebook.redex.IDxBReceiverShape6S0100000_I2;
import com.facebook.rti.common.time.RealtimeSinceBootClock;
import com.facebook.rti.mqtt.protocol.messages.SubscribeTopic;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONException;

/* renamed from: X.00d  reason: invalid class name and case insensitive filesystem */
public final class C000200d {
    public long A00;
    public long A01;
    public long A02;
    public long A03;
    public Context A04;
    public Handler A05;
    public C09740gb A06;
    public C12770mS A07;
    public C08860eQ A08;
    public RealtimeSinceBootClock A09;
    public AnonymousClass0P3 A0A;
    public AnonymousClass0OX A0B;
    public AnonymousClass0MO A0C;
    public AnonymousClass0Lp A0D;
    public AnonymousClass0L5 A0E;
    public AnonymousClass068 A0F;
    public C004201y A0G;
    public C11070jQ A0H;
    public C12330li A0I;
    public C08770eG A0J;
    public AnonymousClass0Z1 A0K;
    public AnonymousClass0Re A0L;
    public C008403q A0M;
    public AnonymousClass0n2 A0N;
    public C07050ao A0O;
    public AnonymousClass0ET A0P;
    public AnonymousClass0ES A0Q;
    public C17910vk A0R;
    public C17060uE A0S;
    public C17030uB A0T;
    public String A0U = "FbnsConnectionManager";
    public String A0V;
    public Map A0W = new HashMap();
    public Executor A0X;
    public AtomicBoolean A0Y = new AtomicBoolean(false);
    public AtomicInteger A0Z;
    public boolean A0a;
    public boolean A0b;
    public boolean A0c;
    public boolean A0d = false;
    public long A0e;
    public BroadcastReceiver A0f;
    public BroadcastReceiver A0g;
    public Method A0h;
    public final Object A0i;
    public final Runnable A0j;
    public final Runnable A0k;
    public final Runnable A0l;
    public final Runnable A0m;
    public final AtomicLong A0n;
    public final C13060mw A0o;
    public volatile long A0p;
    public volatile Pair A0q;
    public volatile AnonymousClass0K0 A0r;
    public volatile C17630vH A0s;
    public volatile C17630vH A0t;
    public volatile C14610pp A0u;
    public volatile boolean A0v;
    public volatile long A0w;

    public final int A03(C17570vA r9, C17550v8 r10, Integer num, String str, byte[] bArr) {
        C09740gb A062 = A06(r9, r10, num, str, bArr, this.A0E.A00().A0L);
        if (!A062.A01()) {
            return -1;
        }
        return ((C13120n3) A062.A00()).A01;
    }

    public final int A04(C17550v8 r9, Integer num, String str, byte[] bArr) {
        C09740gb A062 = A06((C17570vA) null, r9, num, str, bArr, this.A0E.A00().A0L);
        if (!A062.A01()) {
            return -1;
        }
        return ((C13120n3) A062.A00()).A01;
    }

    public final Future A07(C17630vH r7, C17490uz r8, Integer num) {
        synchronized (this) {
            if (this.A0s == r7) {
                this.A0s = null;
            }
        }
        boolean z = false;
        Future future = C02740Cr.A01;
        if (r7 != null) {
            if (r7.A0Y == AnonymousClass006.A0N) {
                z = true;
            }
            r7.A0X = null;
            synchronized (r7) {
                C17540v7 r2 = C17540v7.DISCONNECT;
                if (r7.A04()) {
                    future = r7.A0J.submit(new C17650vJ(r7, r2, r8, (Throwable) null));
                }
            }
            this.A01 = System.currentTimeMillis();
        }
        if (!z) {
            A01(C12730mO.A00, this, num);
            return future;
        }
        this.A0M.Brp(C12730mO.A00);
        return future;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00b0, code lost:
        if (((android.os.SystemClock.elapsedRealtime() - r0) / 1000) >= ((long) r3.A0E.A00().A0O)) goto L_0x00b2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00db  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A01(X.C09740gb r17, X.C000200d r18, java.lang.Integer r19) {
        /*
            r4 = r17
            boolean r9 = r4.A01()
            if (r9 == 0) goto L_0x000b
            r4.A00()
        L_0x000b:
            r3 = r18
            X.0ao r6 = r3.A0O
            if (r9 == 0) goto L_0x0032
            java.lang.Object r0 = r4.A00()
            X.0v1 r0 = (X.AnonymousClass0v1) r0
            java.lang.String r0 = r0.name()
        L_0x001b:
            java.lang.Integer r2 = X.C17470ux.A00(r0)
            java.lang.String r1 = X.C17470ux.A01(r2)
            r0 = 0
            X.0uv r13 = new X.0uv
            r13.<init>(r2, r1, r0)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Map r1 = r6.A03
            monitor-enter(r1)
            goto L_0x004b
        L_0x0032:
            int r0 = r19.intValue()
            switch(r0) {
                case 0: goto L_0x003c;
                case 1: goto L_0x0048;
                case 2: goto L_0x0045;
                case 3: goto L_0x0042;
                case 4: goto L_0x003f;
                default: goto L_0x0039;
            }
        L_0x0039:
            java.lang.String r0 = "PREEMPTIVE_RECONNECT_SUCCESS"
            goto L_0x001b
        L_0x003c:
            java.lang.String r0 = "CONNECT_FAILED"
            goto L_0x001b
        L_0x003f:
            java.lang.String r0 = "STALED_CONNECTION"
            goto L_0x001b
        L_0x0042:
            java.lang.String r0 = "DISCONNECTED"
            goto L_0x001b
        L_0x0045:
            java.lang.String r0 = "BY_REQUEST"
            goto L_0x001b
        L_0x0048:
            java.lang.String r0 = "CONNECTION_LOST"
            goto L_0x001b
        L_0x004b:
            java.util.Collection r0 = r1.values()     // Catch:{ all -> 0x00e4 }
            r2.addAll(r0)     // Catch:{ all -> 0x00e4 }
            r1.clear()     // Catch:{ all -> 0x00e4 }
            monitor-exit(r1)     // Catch:{ all -> 0x00e4 }
            r2.size()
            java.util.Iterator r5 = r2.iterator()
        L_0x005d:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0081
            java.lang.Object r2 = r5.next()
            X.0n3 r2 = (X.C13120n3) r2
            r2.A01(r13)
            int r15 = r2.A01
            X.0vH r0 = r2.A03
            long r0 = r0.A0V
            X.0MO r10 = r6.A00
            java.lang.String r11 = "abort"
            java.lang.String r12 = r2.A05
            r14 = 1
            r16 = r15
            r17 = r0
            r10.A06(r11, r12, r13, r14, r15, r16, r17)
            goto L_0x005d
        L_0x0081:
            r13.getMessage()
            int r0 = r19.intValue()
            r6 = 0
            r5 = 1
            if (r0 == r6) goto L_0x00d4
            if (r0 != r5) goto L_0x00d9
            X.0Lp r1 = r3.A0D
            java.lang.Integer r0 = X.AnonymousClass006.A15
            r1.A0F = r0
            long r0 = r3.A02
            r7 = 0
            int r2 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r2 <= 0) goto L_0x00b2
            long r7 = android.os.SystemClock.elapsedRealtime()
            long r7 = r7 - r0
            r0 = 1000(0x3e8, double:4.94E-321)
            long r7 = r7 / r0
            X.0L5 r0 = r3.A0E
            X.0K0 r0 = r0.A00()
            int r0 = r0.A0O
            long r1 = (long) r0
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            r2 = 1
            if (r0 < 0) goto L_0x00b3
        L_0x00b2:
            r2 = 0
        L_0x00b3:
            X.068 r0 = r3.A0F
            android.net.NetworkInfo r0 = r0.A01()
            if (r0 == 0) goto L_0x00be
            r0.isConnected()
        L_0x00be:
            X.0uB r1 = r3.A0T
            monitor-enter(r1)
            if (r2 == 0) goto L_0x00c6
            r1.A0A = r5     // Catch:{ all -> 0x00d0 }
            goto L_0x00d3
        L_0x00c6:
            r1.A0A = r6     // Catch:{ all -> 0x00d0 }
            monitor-exit(r1)
            X.0uB r1 = r3.A0T
            monitor-enter(r1)
            X.C17030uB.A00(r1)     // Catch:{ all -> 0x00d0 }
            goto L_0x00d3
        L_0x00d0:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x00d3:
            monitor-exit(r1)
        L_0x00d4:
            X.0uB r0 = r3.A0T
            r0.A01()
        L_0x00d9:
            if (r9 == 0) goto L_0x00de
            r4.A00()
        L_0x00de:
            X.03q r0 = r3.A0M
            r0.Brp(r4)
            return
        L_0x00e4:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x00e4 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C000200d.A01(X.0gb, X.00d, java.lang.Integer):void");
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processExcHandler(RegionMaker.java:1043)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:975)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0268 A[Catch:{ all -> 0x03fa }, LOOP:1: B:45:0x0262->B:47:0x0268, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0284 A[Catch:{ all -> 0x03fa }] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0292 A[Catch:{ all -> 0x03fa }] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x02cb A[Catch:{ all -> 0x03fa }] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x02fe A[Catch:{ all -> 0x03fa }] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x031f A[Catch:{ all -> 0x03fa }] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0320 A[Catch:{ all -> 0x03fa }] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0325 A[Catch:{ all -> 0x03fa }] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0327 A[Catch:{ all -> 0x03fa }] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x032b A[Catch:{ all -> 0x03fa }] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0331 A[Catch:{ all -> 0x03fa }] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0356 A[Catch:{ all -> 0x03fa }] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0378 A[Catch:{ all -> 0x03fa }] */
    public static void A02(X.C000200d r46) {
        /*
            r6 = r46
            X.0Lp r1 = r6.A0D
            java.lang.Class<X.0Ei> r20 = X.C03100Ei.class
            r0 = r20
            X.0LD r1 = r1.A05(r0)
            X.0me r1 = (X.C12880me) r1
            X.0md r19 = X.C12870md.A04
            r0 = r19
            java.lang.Object r0 = r1.A00(r0)
            java.util.concurrent.atomic.AtomicLong r0 = (java.util.concurrent.atomic.AtomicLong) r0
            r0.incrementAndGet()
            java.util.concurrent.atomic.AtomicLong r2 = r6.A0n
            long r0 = android.os.SystemClock.elapsedRealtime()
            r2.set(r0)
            X.0L5 r0 = r6.A0E
            X.0K0 r0 = r0.A00()
            int r1 = r0.A0I
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.setPriority(r1)
            r6.A0C()
            java.util.Map r2 = r6.A0W
            monitor-enter(r2)
            java.util.Collection r0 = r2.values()     // Catch:{ all -> 0x0406 }
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x0406 }
            r1.<init>(r0)     // Catch:{ all -> 0x0406 }
            X.0uE r0 = r6.A0S     // Catch:{ all -> 0x0406 }
            java.util.List r31 = r0.getConnectSubscribeTopics(r1)     // Catch:{ all -> 0x0406 }
            monitor-exit(r2)     // Catch:{ all -> 0x0406 }
            X.0n2 r4 = r6.A0N
            X.0P1 r3 = r4.A03
            X.0L5 r0 = r3.A0E
            X.0K0 r0 = r0.A00()
            X.0uL r2 = r4.A04
            X.0vk r5 = r2.A0I
            java.lang.String r28 = r5.Ad5()
            java.lang.String r7 = r5.Ad8()
            boolean r1 = r4.A08
            if (r1 != 0) goto L_0x0079
            boolean r1 = android.text.TextUtils.isEmpty(r28)
            if (r1 != 0) goto L_0x006f
            boolean r1 = android.text.TextUtils.isEmpty(r7)
            if (r1 == 0) goto L_0x0079
        L_0x006f:
            X.0li r1 = r2.A0E
            r1.clear()
            X.0mt r1 = X.C13030mt.A01
            r5.D8d(r1)
        L_0x0079:
            java.lang.String r1 = r0.A0T
            r26 = r1
            java.lang.String r1 = r0.A0U
            r25 = r1
            int r1 = r0.A0N
            r23 = r1
            int r1 = r0.A09
            r22 = r1
            boolean r15 = r0.A0X
            X.0li r1 = r2.A0E
            r46 = r1
            X.0lk r24 = r46.Aqs()
            java.lang.String r29 = r5.Ad8()
            java.lang.String r30 = r5.AQz()
            X.0NR r14 = r3.A09
            java.util.concurrent.atomic.AtomicInteger r13 = r3.A0V
            int r12 = r0.A0K
            int r11 = r0.A0P
            int r10 = r0.A0D
            boolean r1 = r0.A0W
            r40 = 0
            if (r1 == 0) goto L_0x00ad
            r40 = 1
        L_0x00ad:
            int r9 = r0.A0G
            int r8 = r0.A0J
            X.0PW r7 = r2.A0B
            X.0PW r1 = r2.A08
            java.lang.Object r1 = r1.get()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r44 = r1.booleanValue()
            X.0PW r1 = r2.A0A
            r17 = r1
            if (r1 == 0) goto L_0x018d
            java.lang.Object r1 = r17.get()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r45 = r1.booleanValue()
        L_0x00cf:
            r18 = 0
            java.util.Map r5 = r2.A0Q
            r16 = 0
            X.0vk r1 = r3.A0T
            java.util.Map r0 = r0.A01
            X.0vB r21 = new X.0vB
            r27 = r25
            r32 = r5
            r33 = r0
            r34 = r13
            r35 = r23
            r36 = r22
            r37 = r12
            r38 = r11
            r39 = r10
            r41 = r9
            r42 = r8
            r43 = r15
            r22 = r7
            r23 = r14
            r25 = r1
            r21.<init>(r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45)
            X.0vG r13 = r2.A0J
            X.0mp r14 = r4.A02
            com.facebook.rti.common.time.RealtimeSinceBootClock r12 = r3.A04
            java.util.concurrent.ScheduledExecutorService r11 = r4.A07
            X.0vg r10 = r4.A05
            X.0uE r9 = r2.A0M
            android.content.Context r8 = r4.A00
            X.0MO r7 = r13.A02
            X.0mZ r5 = r13.A01
            X.09x r1 = r13.A00
            java.lang.String r0 = r13.A04
            X.0pX r35 = new X.0pX
            r22 = r35
            r24 = r1
            r25 = r12
            r26 = r5
            r27 = r7
            r28 = r14
            r29 = r10
            r30 = r21
            r31 = r9
            r32 = r0
            r33 = r11
            r23 = r8
            r22.<init>(r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)
            X.0Lp r1 = r3.A0D
            java.lang.String r0 = r13.A05
            r1.A0G = r0
            X.068 r15 = r3.A0I
            X.0P3 r14 = r4.A01
            X.0MO r11 = r3.A0B
            X.0Lp r10 = r3.A0D
            com.facebook.rti.common.time.RealtimeSinceBootClock r9 = r3.A04
            java.util.concurrent.ExecutorService r12 = r4.A06
            X.0MC r8 = r3.A0C
            X.0mN r7 = r2.A04
            X.0pp r5 = r2.A0K
            X.0pw r4 = r2.A0L
            X.0Mt r13 = r3.A0A
            X.0PW r3 = r2.A0C
            X.0mS r1 = r2.A05
            java.lang.Long r2 = r2.A0O
            X.0vH r0 = new X.0vH
            r22 = r0
            r23 = r7
            r24 = r1
            r25 = r9
            r26 = r3
            r27 = r17
            r28 = r14
            r29 = r13
            r30 = r11
            r31 = r8
            r32 = r10
            r33 = r15
            r34 = r46
            r36 = r5
            r37 = r21
            r38 = r4
            r39 = r2
            r40 = r12
            r22.<init>(r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40)
            X.0my r1 = new X.0my
            r1.<init>(r6, r0)
            r0.A0X = r1
            java.util.List r15 = java.util.Collections.emptyList()
            boolean r12 = r6.A0d
            r1 = r12 ^ 1
            r6.A0d = r1
            monitor-enter(r0)
            goto L_0x0191
        L_0x018d:
            r45 = 0
            goto L_0x00cf
        L_0x0191:
            long r1 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0403 }
            r0.A0R = r1     // Catch:{ all -> 0x0403 }
            r0.A0P = r1     // Catch:{ all -> 0x0403 }
            r15.getClass()     // Catch:{ all -> 0x0403 }
            r0.A01 = r15     // Catch:{ all -> 0x0403 }
            X.0vB r1 = r0.A0G     // Catch:{ all -> 0x0403 }
            java.util.concurrent.atomic.AtomicInteger r2 = r1.A0K     // Catch:{ all -> 0x0403 }
            int r43 = r2.get()     // Catch:{ all -> 0x0403 }
            java.util.ArrayList r14 = new java.util.ArrayList     // Catch:{ all -> 0x0403 }
            r14.<init>()     // Catch:{ all -> 0x0403 }
            java.util.Map r5 = r0.A0I     // Catch:{ all -> 0x0403 }
            monitor-enter(r5)     // Catch:{ all -> 0x0403 }
            java.util.List r2 = r1.A0H     // Catch:{ all -> 0x03fd }
            java.util.Iterator r4 = r2.iterator()     // Catch:{ all -> 0x03fd }
        L_0x01b4:
            boolean r2 = r4.hasNext()     // Catch:{ all -> 0x03fd }
            if (r2 == 0) goto L_0x01c9
            java.lang.Object r3 = r4.next()     // Catch:{ all -> 0x03fd }
            com.facebook.rti.mqtt.protocol.messages.SubscribeTopic r3 = (com.facebook.rti.mqtt.protocol.messages.SubscribeTopic) r3     // Catch:{ all -> 0x03fd }
            java.lang.String r2 = r3.A01     // Catch:{ all -> 0x03fd }
            r14.add(r2)     // Catch:{ all -> 0x03fd }
            r5.put(r2, r3)     // Catch:{ all -> 0x03fd }
            goto L_0x01b4
        L_0x01c9:
            monitor-exit(r5)     // Catch:{ all -> 0x03fd }
            X.0pX r7 = r0.A0E     // Catch:{ all -> 0x0403 }
            boolean r9 = r0.A0L     // Catch:{ all -> 0x0403 }
            if (r9 == 0) goto L_0x0237
            X.0NR r2 = r1.A0B     // Catch:{ all -> 0x0403 }
            java.lang.String r5 = "["
            java.lang.String r8 = "FBAN"
            java.lang.String r4 = r2.A02     // Catch:{ all -> 0x0403 }
            java.lang.String r3 = "FBAV"
            X.0PL r2 = r2.A01     // Catch:{ all -> 0x0403 }
            java.lang.String r2 = r2.A01     // Catch:{ all -> 0x0403 }
            java.lang.Object[] r4 = new java.lang.Object[]{r8, r4, r3, r2}     // Catch:{ all -> 0x0403 }
            java.lang.String r3 = "%s/%s;%s/%s;"
            r2 = r16
            java.lang.String r3 = java.lang.String.format(r2, r3, r4)     // Catch:{ all -> 0x0403 }
            java.lang.String r2 = "]"
            java.lang.String r33 = X.AnonymousClass00U.A0V(r5, r3, r2)     // Catch:{ all -> 0x0403 }
            r4 = 0
        L_0x01f1:
            X.0PW r2 = r0.A06     // Catch:{ all -> 0x0403 }
            java.lang.Object r2 = r2.get()     // Catch:{ all -> 0x0403 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x0403 }
            if (r2 == 0) goto L_0x0235
            java.lang.String r10 = r2.trim()     // Catch:{ all -> 0x0403 }
            java.lang.String r2 = ""
            boolean r2 = r10.equals(r2)     // Catch:{ all -> 0x0403 }
            if (r2 != 0) goto L_0x0235
        L_0x0207:
            X.068 r2 = r0.A0C     // Catch:{ all -> 0x0403 }
            r44 = r2
            android.net.NetworkInfo r2 = r44.A02()     // Catch:{ all -> 0x0403 }
            r0.A0W = r2     // Catch:{ all -> 0x0403 }
            X.0bY r2 = r44.A03()     // Catch:{ all -> 0x0403 }
            java.lang.Integer r2 = r2.A02     // Catch:{ all -> 0x0403 }
            java.lang.String r2 = X.C07630bp.A00(r2)     // Catch:{ all -> 0x0403 }
            java.lang.String r2 = r2.toLowerCase()     // Catch:{ all -> 0x0403 }
            r0.A0a = r2     // Catch:{ all -> 0x0403 }
            long r2 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0403 }
            r0.A0V = r2     // Catch:{ all -> 0x0403 }
            X.0vP r2 = new X.0vP     // Catch:{ all -> 0x0403 }
            r2.<init>()     // Catch:{ all -> 0x0403 }
            r0.A0b = r2     // Catch:{ all -> 0x0403 }
            r2 = 0
            java.lang.Long r28 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x0403 }
            goto L_0x0244
        L_0x0235:
            r10 = 0
            goto L_0x0207
        L_0x0237:
            X.0NR r2 = r1.A0B     // Catch:{ all -> 0x0403 }
            java.lang.String r33 = r2.A01()     // Catch:{ all -> 0x0403 }
            X.0mt r2 = r1.A0D     // Catch:{ all -> 0x0403 }
            java.lang.Object r4 = r2.first     // Catch:{ all -> 0x0403 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ all -> 0x0403 }
            goto L_0x01f1
        L_0x0244:
            X.0lk r2 = r1.A0C     // Catch:{ NumberFormatException -> 0x0256 }
            java.lang.Object r2 = r2.first     // Catch:{ NumberFormatException -> 0x0256 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ NumberFormatException -> 0x0256 }
            r0.A0Z = r2     // Catch:{ NumberFormatException -> 0x0256 }
            java.lang.String r2 = r0.A0Z     // Catch:{ NumberFormatException -> 0x0256 }
            long r2 = java.lang.Long.parseLong(r2)     // Catch:{ NumberFormatException -> 0x0256 }
            java.lang.Long r28 = java.lang.Long.valueOf(r2)     // Catch:{ NumberFormatException -> 0x0256 }
        L_0x0256:
            X.0bY r13 = r44.A03()     // Catch:{ all -> 0x0403 }
            java.util.EnumSet r2 = X.C17630vH.A0d     // Catch:{ all -> 0x0403 }
            java.util.Iterator r5 = r2.iterator()     // Catch:{ all -> 0x0403 }
            r16 = 0
        L_0x0262:
            boolean r2 = r5.hasNext()     // Catch:{ all -> 0x0403 }
            if (r2 == 0) goto L_0x0276
            java.lang.Object r2 = r5.next()     // Catch:{ all -> 0x0403 }
            X.0vI r2 = (X.C17640vI) r2     // Catch:{ all -> 0x0403 }
            byte r3 = r2.A00     // Catch:{ all -> 0x0403 }
            r2 = 1
            int r2 = r2 << r3
            long r2 = (long) r2     // Catch:{ all -> 0x0403 }
            long r16 = r16 | r2
            goto L_0x0262
        L_0x0276:
            java.lang.Long r29 = java.lang.Long.valueOf(r16)     // Catch:{ all -> 0x0403 }
            long r2 = r0.A0V     // Catch:{ all -> 0x0403 }
            java.lang.Long r30 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x0403 }
            android.net.NetworkInfo r2 = r0.A0W     // Catch:{ all -> 0x0403 }
            if (r2 == 0) goto L_0x032b
            android.net.NetworkInfo r2 = r0.A0W     // Catch:{ all -> 0x0403 }
            int r2 = r2.getType()     // Catch:{ all -> 0x0403 }
            java.lang.Integer r26 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0403 }
        L_0x028e:
            android.net.NetworkInfo r2 = r0.A0W     // Catch:{ all -> 0x0403 }
            if (r2 == 0) goto L_0x0327
            android.net.NetworkInfo r2 = r0.A0W     // Catch:{ all -> 0x0403 }
            int r2 = r2.getSubtype()     // Catch:{ all -> 0x0403 }
            java.lang.Integer r27 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0403 }
        L_0x029c:
            boolean r2 = r1.A0M     // Catch:{ all -> 0x0403 }
            java.lang.Boolean r22 = java.lang.Boolean.valueOf(r2)     // Catch:{ all -> 0x0403 }
            r2 = 1
            java.lang.Boolean r23 = java.lang.Boolean.valueOf(r2)     // Catch:{ all -> 0x0403 }
            X.0mt r3 = r1.A0D     // Catch:{ all -> 0x0403 }
            java.lang.Object r8 = r3.second     // Catch:{ all -> 0x0403 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x0403 }
            boolean r2 = r1.A0L     // Catch:{ all -> 0x0403 }
            java.lang.Boolean r24 = java.lang.Boolean.valueOf(r2)     // Catch:{ all -> 0x0403 }
            X.0PW r2 = r1.A0A     // Catch:{ all -> 0x0403 }
            java.lang.Object r5 = r2.get()     // Catch:{ all -> 0x0403 }
            java.lang.Long r5 = (java.lang.Long) r5     // Catch:{ all -> 0x0403 }
            int r2 = r1.A07     // Catch:{ all -> 0x0403 }
            r42 = r2
            X.0li r2 = r0.A0D     // Catch:{ all -> 0x0403 }
            java.lang.String r36 = r2.AXb()     // Catch:{ all -> 0x0403 }
            java.lang.String r2 = r1.A0F     // Catch:{ all -> 0x0403 }
            r37 = r2
            if (r9 == 0) goto L_0x0325
            java.lang.String r11 = r1.A0G     // Catch:{ all -> 0x0403 }
        L_0x02cd:
            r2 = 3
            java.lang.Byte r25 = java.lang.Byte.valueOf(r2)     // Catch:{ all -> 0x0403 }
            java.util.Map r2 = r1.A0I     // Catch:{ all -> 0x0403 }
            r17 = r2
            java.lang.Long r2 = r0.A0H     // Catch:{ all -> 0x0403 }
            r16 = r2
            java.lang.Integer r2 = r13.A02     // Catch:{ all -> 0x0403 }
            r2.intValue()     // Catch:{ all -> 0x0403 }
            X.0uj r21 = new X.0uj     // Catch:{ all -> 0x0403 }
            r31 = r5
            r32 = r16
            r34 = r4
            r35 = r8
            r38 = r11
            r39 = r10
            r40 = r14
            r41 = r17
            r21.<init>(r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42)     // Catch:{ all -> 0x0403 }
            java.lang.Object r2 = r3.first     // Catch:{ all -> 0x0403 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x0403 }
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x0403 }
            if (r2 == 0) goto L_0x0320
            java.util.UUID r2 = java.util.UUID.randomUUID()     // Catch:{ all -> 0x0403 }
            java.lang.String r3 = r2.toString()     // Catch:{ all -> 0x0403 }
        L_0x0306:
            r4 = 20
            int r2 = r3.length()     // Catch:{ all -> 0x0403 }
            int r4 = java.lang.Math.min(r4, r2)     // Catch:{ all -> 0x0403 }
            r2 = r18
            java.lang.String r24 = r3.substring(r2, r4)     // Catch:{ all -> 0x0403 }
            java.lang.String r4 = r1.A01     // Catch:{ all -> 0x0403 }
            r44.A03()     // Catch:{ all -> 0x0403 }
            java.lang.Integer r10 = X.AnonymousClass006.A0N     // Catch:{ all -> 0x0403 }
            if (r9 == 0) goto L_0x0331
            goto L_0x032f
        L_0x0320:
            java.lang.Object r3 = r3.first     // Catch:{ all -> 0x0403 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x0403 }
            goto L_0x0306
        L_0x0325:
            r11 = 0
            goto L_0x02cd
        L_0x0327:
            r27 = 0
            goto L_0x029c
        L_0x032b:
            r26 = 0
            goto L_0x028e
        L_0x032f:
            r3 = 0
            goto L_0x0337
        L_0x0331:
            X.0lk r2 = r1.A0C     // Catch:{ all -> 0x0403 }
            java.lang.Object r3 = r2.second     // Catch:{ all -> 0x0403 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x0403 }
        L_0x0337:
            java.util.Map r2 = r1.A0J     // Catch:{ all -> 0x0403 }
            X.0ul r8 = new X.0ul     // Catch:{ all -> 0x0403 }
            r22 = r8
            r23 = r21
            r25 = r3
            r26 = r15
            r27 = r2
            r22.<init>(r23, r24, r25, r26, r27)     // Catch:{ all -> 0x0403 }
            r8.A00 = r4     // Catch:{ all -> 0x0403 }
            java.lang.Integer r2 = X.AnonymousClass006.A00     // Catch:{ all -> 0x0403 }
            r0.A0Y = r2     // Catch:{ all -> 0x0403 }
            X.0Lp r5 = r0.A0B     // Catch:{ all -> 0x0403 }
            X.0jQ r4 = r5.A01     // Catch:{ all -> 0x0403 }
            java.lang.Integer r2 = r5.A0F     // Catch:{ all -> 0x0403 }
            if (r2 == 0) goto L_0x0378
            java.lang.Integer r2 = r5.A0F     // Catch:{ all -> 0x0403 }
            java.lang.String r3 = X.C04260Mw.A00(r2)     // Catch:{ all -> 0x0403 }
        L_0x035c:
            r2 = r20
            X.0LD r11 = r5.A05(r2)     // Catch:{ all -> 0x0403 }
            X.0me r11 = (X.C12880me) r11     // Catch:{ all -> 0x0403 }
            r2 = r19
            java.lang.Object r2 = r11.A00(r2)     // Catch:{ all -> 0x0403 }
            java.util.concurrent.atomic.AtomicLong r2 = (java.util.concurrent.atomic.AtomicLong) r2     // Catch:{ all -> 0x0403 }
            r2.intValue()     // Catch:{ all -> 0x0403 }
            r2 = r18
            X.C04220Ms.A0B(r3, r2)     // Catch:{ all -> 0x0403 }
            java.util.List r4 = r4.A00     // Catch:{ all -> 0x0403 }
            monitor-enter(r4)     // Catch:{ all -> 0x0403 }
            goto L_0x037b
        L_0x0378:
            java.lang.String r3 = "NotSet_MqttHealthStatsHelper"
            goto L_0x035c
        L_0x037b:
            java.util.Iterator r3 = r4.iterator()     // Catch:{ all -> 0x03fa }
            boolean r2 = r3.hasNext()     // Catch:{ all -> 0x03fa }
            if (r2 == 0) goto L_0x0390
            r3.next()     // Catch:{ all -> 0x03fa }
            java.lang.String r2 = "onMqttNetworkConnectionStart"
            java.lang.NullPointerException r1 = new java.lang.NullPointerException     // Catch:{ all -> 0x03fa }
            r1.<init>(r2)     // Catch:{ all -> 0x03fa }
            throw r1     // Catch:{ all -> 0x03fa }
        L_0x0390:
            monitor-exit(r4)     // Catch:{ all -> 0x0403 }
            X.0LW r13 = r5.A00     // Catch:{ all -> 0x0403 }
            long r4 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0403 }
            java.util.concurrent.atomic.AtomicLong r11 = r13.A03     // Catch:{ all -> 0x0403 }
            r2 = 0
            r11.compareAndSet(r2, r4)     // Catch:{ all -> 0x0403 }
            java.util.concurrent.atomic.AtomicLong r11 = r13.A00     // Catch:{ all -> 0x0403 }
            r11.compareAndSet(r2, r4)     // Catch:{ all -> 0x0403 }
            if (r12 == 0) goto L_0x03a8
            int r4 = r1.A02     // Catch:{ all -> 0x0403 }
            goto L_0x03aa
        L_0x03a8:
            int r4 = r1.A06     // Catch:{ all -> 0x0403 }
        L_0x03aa:
            r0.A00 = r4     // Catch:{ all -> 0x0403 }
            java.lang.String r2 = r1.A00     // Catch:{ all -> 0x0403 }
            boolean r1 = r1.A0N     // Catch:{ all -> 0x0403 }
            monitor-enter(r7)     // Catch:{ all -> 0x0403 }
            X.0vV r3 = new X.0vV     // Catch:{ all -> 0x0400 }
            r38 = r3
            r39 = r7
            r40 = r8
            r41 = r2
            r42 = r4
            r44 = r9
            r45 = r1
            r38.<init>(r39, r40, r41, r42, r43, r44, r45)     // Catch:{ all -> 0x0400 }
            java.lang.String r1 = "MqttClient-Network-Thread"
            java.lang.Thread r2 = new java.lang.Thread     // Catch:{ all -> 0x0400 }
            r2.<init>(r3, r1)     // Catch:{ all -> 0x0400 }
            X.0vB r1 = r7.A0C     // Catch:{ all -> 0x0400 }
            int r1 = r1.A09     // Catch:{ all -> 0x0400 }
            r2.setPriority(r1)     // Catch:{ all -> 0x0400 }
            r2.start()     // Catch:{ all -> 0x0400 }
            monitor-exit(r7)     // Catch:{ all -> 0x0403 }
            monitor-exit(r0)
            monitor-enter(r6)
            X.0vH r2 = r6.A0s     // Catch:{ all -> 0x03f7 }
            r6.A0s = r0     // Catch:{ all -> 0x03f7 }
            monitor-exit(r6)     // Catch:{ all -> 0x03f7 }
            if (r2 == 0) goto L_0x03eb
            java.lang.String r1 = r6.A0U
            java.lang.String r0 = "connecting new client without disconnecting old one"
            X.AnonymousClass0LU.A0C(r1, r0)
            X.0uz r0 = X.C17490uz.EXPIRE_CONNECTION
            r6.A07(r2, r0, r10)
        L_0x03eb:
            long r0 = java.lang.System.currentTimeMillis()
            r6.A00 = r0
            X.03q r0 = r6.A0M
            r0.Brl()
            return
        L_0x03f7:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x03f7 }
            throw r0
        L_0x03fa:
            r1 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0403 }
            goto L_0x0402
        L_0x03fd:
            r1 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x03fd }
            goto L_0x0402
        L_0x0400:
            r1 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x0403 }
        L_0x0402:
            throw r1     // Catch:{ all -> 0x0403 }
        L_0x0403:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L_0x0406:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0406 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C000200d.A02(X.00d):void");
    }

    public final Pair A05() {
        ArrayList arrayList;
        ArrayList arrayList2;
        C17630vH r0 = this.A0s;
        if (r0 == null) {
            return null;
        }
        Map map = this.A0W;
        Map map2 = r0.A0I;
        synchronized (map2) {
            arrayList = null;
            for (SubscribeTopic subscribeTopic : map.values()) {
                String str = subscribeTopic.A01;
                if (!map2.containsKey(str)) {
                    map2.put(str, subscribeTopic);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(subscribeTopic);
                }
            }
            Iterator it = map2.entrySet().iterator();
            arrayList2 = null;
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (!map.containsKey(entry.getKey())) {
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                    }
                    arrayList2.add((SubscribeTopic) entry.getValue());
                    it.remove();
                }
            }
            boolean z = false;
            if (map.size() == map2.size()) {
                z = true;
            }
            AnonymousClass0g1.A01(z);
        }
        if (arrayList == null && arrayList2 == null) {
            return null;
        }
        return new Pair(arrayList, arrayList2);
    }

    public final Future A08(C17490uz r3) {
        C17030uB r1 = this.A0T;
        synchronized (r1) {
            C17030uB.A00(r1);
        }
        return A07(this.A0s, r3, AnonymousClass006.A0C);
    }

    public final void A09() {
        this.A0L.A00();
        if (!this.A0a) {
            this.A0J.A06();
        } else {
            this.A0L.A01();
        }
    }

    public final void A0A() {
        IDxBReceiverShape6S0100000_I2 iDxBReceiverShape6S0100000_I2 = new IDxBReceiverShape6S0100000_I2(this, 8);
        this.A0g = iDxBReceiverShape6S0100000_I2;
        this.A04.registerReceiver(iDxBReceiverShape6S0100000_I2, new IntentFilter("android.os.action.POWER_SAVE_MODE_CHANGED"), (String) null, this.A05);
        IDxBReceiverShape6S0100000_I2 iDxBReceiverShape6S0100000_I22 = new IDxBReceiverShape6S0100000_I2(this, 9);
        this.A0f = iDxBReceiverShape6S0100000_I22;
        this.A04.registerReceiver(iDxBReceiverShape6S0100000_I22, new IntentFilter("com.facebook.rti.mqtt.ACTION_MQTT_CONFIG_CHANGED"), (String) null, this.A05);
        AnonymousClass068 r2 = this.A0F;
        C13060mw r1 = this.A0o;
        synchronized (r2) {
            r2.A04.add(r1);
        }
        this.A0Q.A03();
    }

    public final void A0B() {
        this.A0J.A04();
        this.A0L.A00();
        this.A0J.A05();
        AnonymousClass068 r2 = this.A0F;
        C13060mw r1 = this.A0o;
        synchronized (r2) {
            r2.A04.remove(r1);
        }
        BroadcastReceiver broadcastReceiver = this.A0g;
        if (broadcastReceiver != null) {
            try {
                this.A04.unregisterReceiver(broadcastReceiver);
            } catch (IllegalArgumentException e) {
                AnonymousClass0LU.A0H(this.A0U, "Failed to unregister broadcast receiver", e);
            }
            this.A0g = null;
        }
        BroadcastReceiver broadcastReceiver2 = this.A0f;
        if (broadcastReceiver2 != null) {
            try {
                this.A04.unregisterReceiver(broadcastReceiver2);
            } catch (IllegalArgumentException e2) {
                AnonymousClass0LU.A0H(this.A0U, "Failed to unregister broadcast receiver", e2);
            }
            this.A0f = null;
        }
        this.A0Q.A04();
        this.A0P.A04();
    }

    public final void A0C() {
        int ASh;
        boolean z = this.A0Y.get();
        AnonymousClass0Z1 r0 = this.A0K;
        if (z) {
            ASh = r0.AjS();
        } else {
            ASh = r0.ASh();
        }
        if (this.A0Z.getAndSet(ASh) != ASh) {
            A09();
        }
    }

    public final void A0D(Integer num) {
        String str;
        Integer num2;
        C17630vH r3 = this.A0s;
        C11070jQ r5 = this.A0H;
        C17030uB r4 = this.A0T;
        C17000u8 r0 = r4.A06;
        if (r0 == null) {
            str = "Strategy is not initialized";
        } else {
            C17010u9 BEG = r0.BEG();
            if (BEG == C17010u9.BACK_OFF) {
                str = "back_off";
            } else if (BEG == C17010u9.BACK_TO_BACK) {
                str = "back_to_back";
            } else {
                str = "undefined";
            }
        }
        C04220Ms.A0B(AnonymousClass00U.A0R(str, "_", r4.A01), 1);
        List list = r5.A00;
        synchronized (list) {
            Iterator it = list.iterator();
            if (it.hasNext()) {
                it.next();
                throw new NullPointerException("setMqttNetworkConnectionRetryInfo");
            }
        }
        if (AnonymousClass006.A08.equals(num)) {
            num2 = AnonymousClass006.A0C;
        } else if (!this.A0M.CsA()) {
            A08(C17490uz.KICK_SHOULD_NOT_CONNECT);
            return;
        } else {
            if (r3 != null) {
                if (!r3.A04()) {
                    num2 = AnonymousClass006.A0N;
                } else {
                    return;
                }
            }
            A02(this);
        }
        A07(r3, C17490uz.EXPIRE_CONNECTION, num2);
        A02(this);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: X.0Re} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v14, resolved type: X.0eG} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v15, resolved type: X.0Re} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v16, resolved type: X.0Re} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v17, resolved type: X.0Re} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v18, resolved type: X.0Re} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0E(java.lang.Integer r6, java.lang.String r7) {
        /*
            r5 = this;
            X.0vH r2 = r5.A0s
            boolean r0 = r5.A0a
            if (r0 != 0) goto L_0x0015
            X.0eG r1 = r5.A0J
            monitor-enter(r1)
            boolean r0 = r1.A03     // Catch:{ all -> 0x00dc }
            if (r0 != 0) goto L_0x0011
            r1.A06()     // Catch:{ all -> 0x00dc }
            goto L_0x001f
        L_0x0011:
            android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x00dc }
            goto L_0x001f
        L_0x0015:
            X.0Re r1 = r5.A0L
            monitor-enter(r1)
            boolean r0 = r1.A00     // Catch:{ all -> 0x00dc }
            if (r0 != 0) goto L_0x001f
            r1.A01()     // Catch:{ all -> 0x00dc }
        L_0x001f:
            monitor-exit(r1)
            X.03q r0 = r5.A0M
            boolean r0 = r0.CsA()
            if (r0 != 0) goto L_0x002e
            X.0uz r0 = X.C17490uz.KICK_SHOULD_NOT_CONNECT
            r5.A08(r0)
        L_0x002d:
            return
        L_0x002e:
            if (r2 == 0) goto L_0x009d
            java.lang.Integer r1 = r2.A0Y
            java.lang.Integer r0 = X.AnonymousClass006.A0C
            if (r1 != r0) goto L_0x009d
            X.0li r0 = r5.A0I
            X.0lk r0 = r0.Aqs()
            java.lang.Object r1 = r0.first
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r0 = r2.A0Z
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0057
            X.0uz r0 = X.C17490uz.AUTH_CREDENTIALS_CHANGE
            r5.A08(r0)
        L_0x004d:
            X.0jQ r1 = r5.A0H
            r0 = 0
            X.C04220Ms.A0B(r7, r0)
            java.util.List r2 = r1.A00
            monitor-enter(r2)
            goto L_0x00a8
        L_0x0057:
            long r3 = r5.A03
            long r1 = r5.A02
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x004d
            java.lang.Integer r0 = X.AnonymousClass006.A08
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x002d
            X.0Lp r1 = r5.A0D
            java.lang.Integer r0 = X.AnonymousClass006.A0u
            r1.A0F = r0
            X.0uB r2 = r5.A0T
            monitor-enter(r2)
            java.lang.Runnable r0 = r2.A07     // Catch:{ all -> 0x00d9 }
            if (r0 != 0) goto L_0x007c
            java.lang.String r1 = "ConnectionRetryManager"
            java.lang.String r0 = "No force reconnect runnable set. Completing early from kickNow()"
            X.AnonymousClass0LU.A0C(r1, r0)     // Catch:{ all -> 0x00d9 }
            goto L_0x009b
        L_0x007c:
            android.os.Handler r0 = r2.A0B     // Catch:{ all -> 0x00d9 }
            if (r0 == 0) goto L_0x0094
            android.os.Looper r0 = r0.getLooper()     // Catch:{ all -> 0x00d9 }
            java.lang.Thread r1 = r0.getThread()     // Catch:{ all -> 0x00d9 }
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x00d9 }
            if (r1 != r0) goto L_0x0094
            java.lang.Runnable r0 = r2.A07     // Catch:{ all -> 0x00d9 }
            r0.run()     // Catch:{ all -> 0x00d9 }
            goto L_0x009b
        L_0x0094:
            java.util.concurrent.ExecutorService r1 = r2.A0D     // Catch:{ all -> 0x00d9 }
            java.lang.Runnable r0 = r2.A07     // Catch:{ all -> 0x00d9 }
            r1.submit(r0)     // Catch:{ all -> 0x00d9 }
        L_0x009b:
            monitor-exit(r2)
            goto L_0x004d
        L_0x009d:
            X.0vH r0 = r5.A0s
            if (r0 == 0) goto L_0x004d
            boolean r0 = r0.A04()
            if (r0 == 0) goto L_0x004d
            return
        L_0x00a8:
            java.util.Iterator r1 = r2.iterator()     // Catch:{ all -> 0x00d9 }
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x00d9 }
            if (r0 == 0) goto L_0x00bd
            r1.next()     // Catch:{ all -> 0x00d9 }
            java.lang.String r1 = "setMqttNetworkConnectionInfo"
            java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch:{ all -> 0x00d9 }
            r0.<init>(r1)     // Catch:{ all -> 0x00d9 }
            throw r0     // Catch:{ all -> 0x00d9 }
        L_0x00bd:
            monitor-exit(r2)
            r5.A0C()
            X.0Lp r0 = r5.A0D
            r0.A0F = r6
            X.0uB r1 = r5.A0T
            monitor-enter(r1)
            int r0 = r1.A00     // Catch:{ all -> 0x00d6 }
            int r0 = r0 + 1
            r1.A00 = r0     // Catch:{ all -> 0x00d6 }
            X.C17030uB.A00(r1)     // Catch:{ all -> 0x00d6 }
            r1.A01()     // Catch:{ all -> 0x00d6 }
            monitor-exit(r1)
            return
        L_0x00d6:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x00d9:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x00dc:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C000200d.A0E(java.lang.Integer, java.lang.String):void");
    }

    public final void A0F(String str) {
        String str2;
        C17630vH r2 = this.A0s;
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if ((elapsedRealtime - this.A0w) / 1000 >= ((long) this.A0E.A00().A00)) {
                this.A0w = elapsedRealtime;
                C16480tB.A04.A03 = str;
                C12770mS r1 = this.A07;
                this.A0F.A03();
                if (r1.A00) {
                    if (this.A0Y.get()) {
                        ((AtomicLong) ((C12880me) this.A0D.A05(C03040Ec.class)).A00(C12940mk.ForegroundPing)).incrementAndGet();
                    } else {
                        ((AtomicLong) ((C12880me) this.A0D.A05(C03040Ec.class)).A00(C12940mk.BackgroundPing)).incrementAndGet();
                    }
                    if (r2 != null && r2.A0Y == AnonymousClass006.A0C) {
                        long j = r2.A0V;
                        AnonymousClass0Lp r12 = this.A0D;
                        try {
                            str2 = C03960Lr.A00((C03920Li) null, (C03100Ei) null, (C03090Eh) null, AnonymousClass0Lp.A00(r12), (C03070Ef) r12.A05(C03070Ef.class), AnonymousClass0Lp.A01(r12, SystemClock.elapsedRealtime() - j), (C03020Ea) null, (AnonymousClass0EX) null, false, true).toString();
                        } catch (JSONException unused) {
                            str2 = "";
                        }
                        if (!TextUtils.isEmpty(str2)) {
                            try {
                                A03((C17570vA) null, (C17550v8) null, AnonymousClass006.A01, "/mqtt_health_stats", str2.getBytes("UTF-8"));
                            } catch (UnsupportedEncodingException unused2) {
                                throw new RuntimeException("UTF-8 not supported");
                            } catch (C17450uv unused3) {
                            }
                        }
                    }
                } else if (r2 != null) {
                    Integer num = r2.A0Y;
                    Integer num2 = AnonymousClass006.A0C;
                    if (num == num2) {
                        this.A0O.A01(r2, C17290ue.PINGRESP, "callPing", -1, this.A0E.A00().A0L);
                        synchronized (r2) {
                            if (r2.A0Y == num2) {
                                r2.A0J.execute(new C17660vK(r2));
                            } else {
                                Integer num3 = AnonymousClass006.A15;
                                throw new C17450uv(num3, C17470ux.A01(num3), (Throwable) null);
                            }
                        }
                    }
                }
            }
        } catch (C17450uv e) {
            AnonymousClass0LU.A0F(this.A0U, "exception/send_keepalive", e);
            A07(r2, C17490uz.SEND_FAILURE, AnonymousClass006.A01);
        }
    }

    public C000200d() {
        C11070jQ r0 = C11070jQ.A01;
        if (r0 == null) {
            r0 = new C11070jQ();
            C11070jQ.A01 = r0;
        }
        this.A0H = r0;
        this.A0i = new Object();
        this.A0o = new C13060mw(this);
        this.A0n = new AtomicLong();
        this.A0m = new AnonymousClass0Q8(this);
        this.A0j = new AnonymousClass0MX(this);
        this.A0k = new AnonymousClass0KU(this);
        this.A0l = new AnonymousClass0KT(this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0050, code lost:
        if (r3.A01.equals(r4.A01) == false) goto L_0x0052;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0128, code lost:
        if (r0.isConnected() == false) goto L_0x012a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A00(android.content.Intent r7, X.C000200d r8) {
        /*
            java.lang.String r1 = r7.getAction()
            java.lang.String r0 = "com.facebook.rti.mqtt.ACTION_MQTT_CONFIG_CHANGED"
            boolean r0 = X.C09750gc.A00(r1, r0)
            java.lang.String r5 = "FbnsConnectionManager"
            if (r0 == 0) goto L_0x0080
            X.0L5 r0 = r8.A0E
            r0.A01()
            X.0L5 r0 = r8.A0E
            X.0K0 r3 = r0.A00()
            X.0K0 r4 = r8.A0r
            java.lang.String r1 = r3.A0T
            java.lang.String r0 = r4.A0T
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0052
            int r1 = r3.A0N
            int r0 = r4.A0N
            if (r1 != r0) goto L_0x0052
            int r1 = r3.A09
            int r0 = r4.A09
            if (r1 != r0) goto L_0x0052
            boolean r1 = r3.A0X
            boolean r0 = r4.A0X
            if (r1 != r0) goto L_0x0052
            java.lang.String r2 = r3.A0U
            java.lang.String r1 = r4.A0U
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 == 0) goto L_0x006d
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L_0x006d
        L_0x0047:
            java.util.Map r1 = r3.A01
            java.util.Map r0 = r4.A01
            boolean r1 = r1.equals(r0)
            r0 = 0
            if (r1 != 0) goto L_0x0053
        L_0x0052:
            r0 = 1
        L_0x0053:
            r8.A0r = r3
            if (r0 == 0) goto L_0x0062
            X.0uz r0 = X.C17490uz.KICK_CONFIG_CHANGED
            r8.A08(r0)
        L_0x005c:
            java.lang.Integer r0 = X.AnonymousClass006.A0Y
        L_0x005e:
            r8.A0E(r0, r5)
        L_0x0061:
            return
        L_0x0062:
            X.0vH r0 = r8.A0s
            if (r0 == 0) goto L_0x005c
            boolean r0 = r0.A04()
            if (r0 == 0) goto L_0x005c
            return
        L_0x006d:
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L_0x0052
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x0052
            boolean r0 = r2.equals(r1)
            if (r0 == 0) goto L_0x0052
            goto L_0x0047
        L_0x0080:
            java.lang.String r0 = "android.os.action.POWER_SAVE_MODE_CHANGED"
            boolean r0 = X.C09750gc.A00(r1, r0)
            if (r0 == 0) goto L_0x00d3
            java.lang.reflect.Method r0 = r8.A0h     // Catch:{ NoSuchMethodException -> 0x0184, IllegalAccessException -> 0x017e, InvocationTargetException -> 0x018a }
            r3 = 0
            if (r0 != 0) goto L_0x0099
            java.lang.Class<android.os.PowerManager> r2 = android.os.PowerManager.class
            java.lang.String r1 = "isPowerSaveMode"
            java.lang.Class[] r0 = new java.lang.Class[r3]     // Catch:{ NoSuchMethodException -> 0x0184, IllegalAccessException -> 0x017e, InvocationTargetException -> 0x018a }
            java.lang.reflect.Method r0 = r2.getDeclaredMethod(r1, r0)     // Catch:{ NoSuchMethodException -> 0x0184, IllegalAccessException -> 0x017e, InvocationTargetException -> 0x018a }
            r8.A0h = r0     // Catch:{ NoSuchMethodException -> 0x0184, IllegalAccessException -> 0x017e, InvocationTargetException -> 0x018a }
        L_0x0099:
            X.0OX r2 = r8.A0B     // Catch:{ NoSuchMethodException -> 0x0184, IllegalAccessException -> 0x017e, InvocationTargetException -> 0x018a }
            java.lang.String r1 = "power"
            java.lang.Class<android.os.PowerManager> r0 = android.os.PowerManager.class
            X.0gb r1 = r2.A00(r0, r1)     // Catch:{ NoSuchMethodException -> 0x0184, IllegalAccessException -> 0x017e, InvocationTargetException -> 0x018a }
            boolean r0 = r1.A01()     // Catch:{ NoSuchMethodException -> 0x0184, IllegalAccessException -> 0x017e, InvocationTargetException -> 0x018a }
            if (r0 == 0) goto L_0x0061
            java.lang.reflect.Method r2 = r8.A0h     // Catch:{ NoSuchMethodException -> 0x0184, IllegalAccessException -> 0x017e, InvocationTargetException -> 0x018a }
            java.lang.Object r1 = r1.A00()     // Catch:{ NoSuchMethodException -> 0x0184, IllegalAccessException -> 0x017e, InvocationTargetException -> 0x018a }
            java.lang.Object[] r0 = new java.lang.Object[r3]     // Catch:{ NoSuchMethodException -> 0x0184, IllegalAccessException -> 0x017e, InvocationTargetException -> 0x018a }
            java.lang.Object r0 = r2.invoke(r1, r0)     // Catch:{ NoSuchMethodException -> 0x0184, IllegalAccessException -> 0x017e, InvocationTargetException -> 0x018a }
            java.lang.String r1 = r0.toString()     // Catch:{ NoSuchMethodException -> 0x0184, IllegalAccessException -> 0x017e, InvocationTargetException -> 0x018a }
            X.0MO r3 = r8.A0C     // Catch:{ NoSuchMethodException -> 0x0184, IllegalAccessException -> 0x017e, InvocationTargetException -> 0x018a }
            java.lang.String r0 = "pow"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1}     // Catch:{ NoSuchMethodException -> 0x0184, IllegalAccessException -> 0x017e, InvocationTargetException -> 0x018a }
            java.util.Map r2 = X.C14740q4.A01(r0)     // Catch:{ NoSuchMethodException -> 0x0184, IllegalAccessException -> 0x017e, InvocationTargetException -> 0x018a }
            java.lang.String r1 = "mqtt_device_state"
            r3.A07(r1, r2)     // Catch:{ NoSuchMethodException -> 0x0184, IllegalAccessException -> 0x017e, InvocationTargetException -> 0x018a }
            X.0eQ r0 = r3.A01     // Catch:{ NoSuchMethodException -> 0x0184, IllegalAccessException -> 0x017e, InvocationTargetException -> 0x018a }
            if (r0 == 0) goto L_0x0061
            r0.Bb8(r1, r2)     // Catch:{ NoSuchMethodException -> 0x0184, IllegalAccessException -> 0x017e, InvocationTargetException -> 0x018a }
            goto L_0x017d
        L_0x00d3:
            java.lang.String r0 = "com.facebook.orca.ACTION_NETWORK_CONNECTIVITY_CHANGED"
            boolean r0 = X.C09750gc.A00(r1, r0)
            if (r0 == 0) goto L_0x0061
            X.0MO r7 = r8.A0C
            X.068 r0 = r8.A0F
            java.util.concurrent.atomic.AtomicLong r0 = r0.A06
            long r0 = r0.get()
            X.068 r2 = r8.A0F
            android.net.NetworkInfo r3 = r2.A02()
            r2 = 0
            java.lang.String[] r2 = new java.lang.String[r2]
            java.util.Map r6 = X.C14740q4.A01(r2)
            X.AnonymousClass0MO.A00(r0, r6)
            X.AnonymousClass0MO.A01(r3, r7, r6)
            X.068 r0 = r7.A03
            java.util.concurrent.atomic.AtomicLong r0 = r0.A07
            long r3 = r0.get()
            r1 = -1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x010f
            java.lang.String r1 = java.lang.String.valueOf(r3)
            java.lang.String r0 = "dc_ms_ago"
            r6.put(r0, r1)
        L_0x010f:
            java.lang.String r1 = "mqtt_network_changed"
            r7.A07(r1, r6)
            X.0eQ r0 = r7.A01
            if (r0 == 0) goto L_0x011b
            r0.Bb8(r1, r6)
        L_0x011b:
            X.068 r0 = r8.A0F
            android.net.NetworkInfo r0 = r0.A01()
            if (r0 == 0) goto L_0x012a
            boolean r0 = r0.isConnected()
            r6 = 1
            if (r0 != 0) goto L_0x012b
        L_0x012a:
            r6 = 0
        L_0x012b:
            X.068 r0 = r8.A0F
            android.net.NetworkInfo r3 = r0.A02()
            android.net.NetworkInfo$State r2 = android.net.NetworkInfo.State.DISCONNECTED
            if (r3 == 0) goto L_0x016c
            int r1 = r3.getType()
            int r0 = r3.getSubtype()
            android.net.NetworkInfo$State r2 = r3.getState()
            r3.getTypeName()
            r3.getSubtypeName()
            r3.getState()
        L_0x014a:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r1, r0, r2}
            int r0 = java.util.Arrays.hashCode(r0)
            long r3 = (long) r0
            long r1 = r8.A0e
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x016f
            X.0vH r0 = r8.A0s
            if (r0 == 0) goto L_0x016f
            boolean r0 = r0.A04()
            if (r0 == 0) goto L_0x016f
            return
        L_0x016c:
            r1 = 0
            r0 = 0
            goto L_0x014a
        L_0x016f:
            r8.A0e = r3
            long r0 = android.os.SystemClock.elapsedRealtime()
            r8.A03 = r0
            if (r6 == 0) goto L_0x0193
            java.lang.Integer r0 = X.AnonymousClass006.A0N
            goto L_0x005e
        L_0x017d:
            return
        L_0x017e:
            r2 = move-exception
            java.lang.String r1 = r8.A0U
            java.lang.String r0 = "exception/IllegalAccessException"
            goto L_0x018f
        L_0x0184:
            r2 = move-exception
            java.lang.String r1 = r8.A0U
            java.lang.String r0 = "exception/NoSuchMethodException"
            goto L_0x018f
        L_0x018a:
            r2 = move-exception
            java.lang.String r1 = r8.A0U
            java.lang.String r0 = "exception/InvocationTargetException"
        L_0x018f:
            X.AnonymousClass0LU.A0H(r1, r0, r2)
            return
        L_0x0193:
            X.0eG r0 = r8.A0J
            r0.A04()
            X.0Re r0 = r8.A0L
            r0.A00()
            X.0uz r0 = X.C17490uz.NETWORK_LOST
            r8.A08(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C000200d.A00(android.content.Intent, X.00d):void");
    }

    public final C09740gb A06(C17570vA r32, C17550v8 r33, Integer num, String str, byte[] bArr, int i) {
        int i2;
        boolean z;
        long j;
        int i3;
        C13120n3 r3;
        C13120n3 r0;
        long j2;
        int i4 = i;
        Integer num2 = num;
        switch (num2.intValue()) {
            case 0:
                i2 = 0;
                break;
            case 1:
                i2 = 1;
                break;
            default:
                i2 = 2;
                z = false;
                break;
        }
        z = true;
        AnonymousClass0g1.A00(z);
        C17630vH r2 = this.A0s;
        String str2 = str;
        if (r2 == null) {
            j = 0;
        } else if (!r2.A04()) {
            j = r2.A0V;
        } else {
            AnonymousClass0P6 r19 = AnonymousClass0P6.A00;
            try {
                int andIncrement = C17630vH.A0f.getAndIncrement() & 65535;
                Integer num3 = r2.A0Y;
                if (num3 == AnonymousClass006.A00 || num3 == AnonymousClass006.A01) {
                    long j3 = 0;
                    if (r2.A0V > 0) {
                        j2 = SystemClock.elapsedRealtime() - r2.A0V;
                    } else {
                        j2 = 0;
                    }
                    long j4 = ((long) this.A0E.A00().A0K) * 1000;
                    long j5 = j4 - j2;
                    if (j5 >= 0) {
                        j3 = j5 > j4 ? j4 : j5;
                    }
                    i3 = (int) (j3 / 1000);
                } else {
                    i3 = 0;
                }
                int i5 = i3 + i;
                if (i5 < Integer.MAX_VALUE) {
                    i4 = i5;
                }
                Integer num4 = AnonymousClass006.A01;
                if (num2 == num4) {
                    C17570vA r9 = r32;
                    if (r32 == null) {
                        r3 = this.A0O.A01(r2, C17290ue.PUBACK, str2, andIncrement, i4);
                    } else {
                        C07050ao r1 = this.A0O;
                        r3 = new C13120n3(r2, C17290ue.PUBACK, str2, andIncrement, SystemClock.elapsedRealtime());
                        Map map = r1.A03;
                        synchronized (map) {
                            try {
                                r0 = (C13120n3) map.put(Integer.valueOf(r3.A01), r3);
                            } catch (Throwable th) {
                                while (true) {
                                    th = th;
                                }
                            }
                        }
                        if (r0 != null) {
                            r0.A00();
                            AnonymousClass0LU.A0N("MqttOperationManager", "operation/add/duplicate; id=%d, name=%s", Integer.valueOf(r0.A01), r0.A04.name());
                        }
                        AnonymousClass06H r12 = r1.A02;
                        C05080Qt r02 = new C05080Qt(r3, r1);
                        TimeUnit timeUnit = TimeUnit.SECONDS;
                        AnonymousClass06P r11 = new AnonymousClass06P(r12, (Object) null, r02);
                        AnonymousClass06H.A00(r11, r12, SystemClock.elapsedRealtime() + timeUnit.toMillis((long) i4));
                        boolean z2 = false;
                        if (r3.A06 == null) {
                            z2 = true;
                        }
                        AnonymousClass0g1.A01(z2);
                        r3.A06 = r11;
                        boolean z3 = false;
                        if (r3.A07 == null) {
                            z3 = true;
                        }
                        AnonymousClass0g1.A01(z3);
                        r3.A07 = r9;
                    }
                } else {
                    r3 = new C13120n3(r2, C17290ue.PUBACK, str2, andIncrement, SystemClock.elapsedRealtime());
                    if (r3.A07 != null) {
                        r3.A07.onSuccess(r3.A01);
                    }
                    if (r3.A06 != null) {
                        r3.A06.cancel(false);
                    }
                    this.A0C.A04(str2, i2, andIncrement, r3.A01, 0, r2.A0V);
                }
                synchronized (r2) {
                    try {
                        if (r2.A04()) {
                            r2.A0J.execute(new C17670vL(r19, r2, r33, num2, str2, bArr, andIncrement));
                        } else {
                            Integer num5 = AnonymousClass006.A15;
                            throw new C17450uv(num5, C17470ux.A01(num5), (Throwable) null);
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                }
                if (!"/mqtt_health_stats".equals(str2) && num2 == num4) {
                    A09();
                }
                return new C12760mR(r3);
            } catch (C17450uv e) {
                AnonymousClass0LU.A0H(this.A0U, "exception/publish", e);
                A07(r2, C17490uz.SEND_FAILURE, AnonymousClass006.A01);
                throw e;
            }
        }
        this.A0C.A06("not_connected", str2, (Throwable) null, i2, 0, 0, j);
        return C12730mO.A00;
    }
}
