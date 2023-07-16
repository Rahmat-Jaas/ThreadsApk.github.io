package X;

import android.os.Handler;
import com.facebook.rti.common.time.RealtimeSinceBootClock;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.0P1  reason: invalid class name */
public class AnonymousClass0P1 {
    public Handler A00;
    public C14930qQ A01;
    public C08860eQ A02;
    public C12800mV A03;
    public RealtimeSinceBootClock A04;
    public C12830mZ A05;
    public AnonymousClass0PL A06;
    public AnonymousClass0P7 A07;
    public AnonymousClass0OX A08;
    public AnonymousClass0NR A09;
    public C04230Mt A0A;
    public AnonymousClass0MO A0B;
    public AnonymousClass0MC A0C;
    public AnonymousClass0Lp A0D;
    public AnonymousClass0L5 A0E;
    public AnonymousClass06Y A0F;
    public AnonymousClass06H A0G;
    public AnonymousClass071 A0H;
    public AnonymousClass068 A0I;
    public C004201y A0J;
    public C13000mq A0K;
    public C08770eG A0L;
    public AnonymousClass0Re A0M;
    public C13050mv A0N;
    public C000200d A0O;
    public AnonymousClass0n2 A0P;
    public C07050ao A0Q;
    public AnonymousClass0ET A0R;
    public AnonymousClass0ES A0S;
    public C17910vk A0T;
    public C17030uB A0U;
    public AtomicInteger A0V;
    public boolean A0W = false;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0036, code lost:
        if (r0 != false) goto L_0x0038;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(X.C09740gb r37, X.C17130uL r38, java.util.List r39) {
        /*
            r36 = this;
            r4 = r38
            android.content.Context r3 = r4.A00
            android.content.Context r1 = r3.getApplicationContext()
            X.0OX r0 = new X.0OX
            r0.<init>(r1)
            r5 = r36
            r5.A08 = r0
            java.lang.Integer r7 = r4.A0N
            java.lang.String r2 = X.C18140wF.A00(r7)
            X.0P7 r0 = X.AnonymousClass0P7.A00
            r5.A07 = r0
            X.0PL r0 = X.AnonymousClass0PL.A00(r3)
            r5.A06 = r0
            java.lang.String r0 = r3.getPackageName()
            boolean r32 = X.AnonymousClass0s5.A02(r0)
            X.0PL r0 = r5.A06
            boolean r0 = r0.A02
            r0 = r0 ^ 1
            X.0mV r6 = r4.A07
            r5.A03 = r6
            if (r32 == 0) goto L_0x0038
            r1 = 1
            if (r0 == 0) goto L_0x0039
        L_0x0038:
            r1 = 0
        L_0x0039:
            X.0MC r0 = new X.0MC
            r0.<init>(r3, r6, r2, r1)
            r5.A0C = r0
            X.0mZ r0 = X.C12830mZ.A00
            r5.A05 = r0
            com.facebook.rti.common.time.RealtimeSinceBootClock r0 = com.facebook.rti.common.time.RealtimeSinceBootClock.INSTANCE
            r5.A04 = r0
            X.0PL r9 = r5.A06
            X.0vk r0 = r4.A0I
            r35 = r0
            java.lang.String r8 = r35.getAppName()
            java.util.Map r1 = r4.A0Q
            X.0NR r0 = new X.0NR
            r0.<init>(r3, r9, r8, r1)
            r5.A09 = r0
            X.0OX r8 = r5.A08
            android.os.Handler r10 = r4.A01
            com.facebook.rti.common.time.RealtimeSinceBootClock r1 = r5.A04
            X.01y r0 = new X.01y
            r0.<init>(r3, r10, r1, r8)
            r5.A0J = r0
            X.0P3 r18 = X.AnonymousClass0P3.A00
            java.util.concurrent.ExecutorService r30 = java.util.concurrent.Executors.newSingleThreadExecutor()
            java.util.concurrent.ExecutorService r11 = java.util.concurrent.Executors.newSingleThreadExecutor()
            r0 = 2
            java.util.concurrent.Executors.newFixedThreadPool(r0)
            java.util.concurrent.ScheduledExecutorService r31 = java.util.concurrent.Executors.newScheduledThreadPool(r0)
            r5.A00 = r10
            X.01r r0 = new X.01r
            r0.<init>(r10)
            r5.A0F = r0
            X.0OX r12 = r5.A08
            com.facebook.rti.common.time.RealtimeSinceBootClock r9 = r5.A04
            android.os.Handler r8 = r5.A00
            X.0P7 r1 = r5.A07
            X.06H r0 = new X.06H
            r20 = r3
            r21 = r8
            r22 = r9
            r23 = r1
            r24 = r12
            r25 = r2
            r19 = r0
            r19.<init>(r20, r21, r22, r23, r24, r25)
            r5.A0G = r0
            X.0OX r9 = r5.A08
            android.content.Context r20 = r3.getApplicationContext()
            com.facebook.rti.common.time.RealtimeSinceBootClock r8 = r5.A04
            android.content.Context r0 = r3.getApplicationContext()
            X.0bS r1 = new X.0bS
            r1.<init>(r0)
            r17 = 0
            X.068 r0 = new X.068
            r19 = r0
            r21 = r10
            r22 = r1
            r23 = r8
            r24 = r9
            r19.<init>(r20, r21, r22, r23, r24)
            r5.A0I = r0
            X.071 r0 = new X.071
            r0.<init>(r3)
            r5.A0H = r0
            r0 = r35
            r5.A0T = r0
            X.0L5 r8 = r4.A0D
            r5.A0E = r8
            X.0mZ r1 = r5.A05
            X.0ES r0 = new X.0ES
            r20 = r3
            r21 = r6
            r22 = r1
            r23 = r8
            r24 = r7
            r19 = r0
            r19.<init>(r20, r21, r22, r23, r24)
            r5.A0S = r0
            X.0mv r0 = new X.0mv
            r0.<init>(r3)
            r5.A0N = r0
            X.0L5 r1 = r5.A0E
            X.0ET r0 = new X.0ET
            r0.<init>(r3, r6, r1, r7)
            r5.A0R = r0
            X.0L5 r6 = r5.A0E
            X.0ES r1 = r5.A0S
            monitor-enter(r6)
            java.util.List r0 = r6.A00     // Catch:{ all -> 0x0435 }
            r0.add(r1)     // Catch:{ all -> 0x0435 }
            monitor-exit(r6)
            X.0L5 r6 = r5.A0E
            X.0mv r1 = r5.A0N
            monitor-enter(r6)
            java.util.List r0 = r6.A00     // Catch:{ all -> 0x0435 }
            r0.add(r1)     // Catch:{ all -> 0x0435 }
            monitor-exit(r6)
            X.0L5 r0 = r5.A0E
            r0.A01()
            X.0L5 r0 = r5.A0E
            r5.A0E = r0
            X.0qQ r9 = r4.A03
            r5.A01 = r9
            X.0eQ r8 = r4.A06
            r5.A02 = r8
            X.068 r7 = r5.A0I
            X.071 r6 = r5.A0H
            X.09x r12 = r4.A02
            X.0mZ r1 = r5.A05
            X.0MO r0 = new X.0MO
            r19 = r0
            r21 = r12
            r22 = r9
            r23 = r8
            r24 = r1
            r25 = r6
            r26 = r7
            r27 = r2
            r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27)
            r5.A0B = r0
            X.0OX r14 = r5.A08
            X.068 r13 = r5.A0I
            X.01y r10 = r5.A0J
            com.facebook.rti.common.time.RealtimeSinceBootClock r9 = r5.A04
            X.0mZ r8 = r5.A05
            X.0PW r7 = r4.A0A
            X.0mS r0 = r4.A05
            r34 = r0
            boolean r6 = r0.A00
            X.0mV r1 = r5.A03
            X.0Lp r0 = new X.0Lp
            r21 = r1
            r22 = r9
            r23 = r8
            r24 = r7
            r25 = r14
            r26 = r13
            r27 = r10
            r28 = r2
            r29 = r6
            r19 = r0
            r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            r5.A0D = r0
            X.0vG r9 = r4.A0J
            X.068 r6 = r5.A0I
            X.0mZ r1 = r5.A05
            X.0MO r8 = r5.A0B
            X.0li r0 = r4.A0E
            r33 = r0
            java.lang.String r0 = r33.AXb()
            r9.A01 = r1
            r9.A02 = r8
            r9.A03 = r6
            r9.A00 = r12
            r9.A04 = r0
            com.facebook.rti.common.time.RealtimeSinceBootClock r9 = r5.A04
            X.0PW r0 = r4.A09
            java.lang.Object r0 = r0.get()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r6 = r0.booleanValue()
            X.0mV r1 = r5.A03
            X.0Mt r0 = new X.0Mt
            r0.<init>(r1, r9, r8, r6)
            r5.A0A = r0
            X.0L5 r0 = r5.A0E
            X.0K0 r0 = r0.A00()
            int r1 = r0.A08
            java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
            r0.<init>(r1)
            r5.A0V = r0
            java.lang.Object r0 = X.C17250ua.A00
            X.0m4 r0 = (X.C12530m4) r0
            X.0ib r0 = r0.A01
            java.lang.Object r0 = r0.A00
            if (r0 == 0) goto L_0x042d
            X.0mp r8 = new X.0mp
            r8.<init>()
            java.net.Proxy r0 = r4.A0P
            r8.A00 = r0
            X.0vW r6 = new X.0vW
            r6.<init>()
            X.0mV r0 = r5.A03
            X.0pW r1 = new X.0pW
            r1.<init>(r0, r6, r11)
            X.0n2 r0 = new X.0n2
            r24 = r3
            r25 = r18
            r26 = r8
            r27 = r5
            r28 = r4
            r29 = r1
            r23 = r0
            r23.<init>(r24, r25, r26, r27, r28, r29, r30, r31, r32)
            r5.A0P = r0
            X.0L5 r0 = r5.A0E
            X.0K0 r0 = r0.A00()
            int r8 = r0.A0C
            X.0L5 r0 = r5.A0E
            X.0K0 r0 = r0.A00()
            int r0 = r0.A0B
            if (r8 <= 0) goto L_0x034a
            if (r0 <= 0) goto L_0x034a
            com.facebook.rti.common.time.RealtimeSinceBootClock r6 = r5.A04
            long r0 = (long) r0
            X.0mb r12 = new X.0mb
            r12.<init>(r6, r8, r0)
        L_0x01fd:
            com.facebook.rti.common.time.RealtimeSinceBootClock r11 = r5.A04
            if (r7 != 0) goto L_0x0208
            com.facebook.redex.IDxIProviderShape675S0100000_I2 r7 = new com.facebook.redex.IDxIProviderShape675S0100000_I2
            r0 = r17
            r7.<init>(r5, r0)
        L_0x0208:
            X.06Y r10 = r5.A0F
            X.06H r9 = r5.A0G
            android.os.Handler r8 = r5.A00
            X.0L5 r6 = r5.A0E
            X.0eQ r1 = r5.A02
            X.0uB r0 = new X.0uB
            r19 = r0
            r20 = r8
            r21 = r1
            r22 = r11
            r23 = r7
            r24 = r12
            r25 = r6
            r26 = r10
            r27 = r9
            r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27)
            r5.A0U = r0
            X.06Y r10 = r5.A0F
            X.06H r11 = r5.A0G
            X.0MO r8 = r5.A0B
            X.0Lp r9 = r5.A0D
            com.facebook.rti.common.time.RealtimeSinceBootClock r7 = r5.A04
            X.0ao r6 = new X.0ao
            r6.<init>(r7, r8, r9, r10, r11)
            r5.A0Q = r6
            X.0OX r12 = r5.A08
            java.util.concurrent.atomic.AtomicInteger r11 = r5.A0V
            X.0L5 r0 = r5.A0E
            X.0K0 r0 = r0.A00()
            int r0 = r0.A0H
            int r0 = r0 * 1000
            long r6 = (long) r0
            com.facebook.rti.common.time.RealtimeSinceBootClock r10 = r5.A04
            android.os.Handler r9 = r5.A00
            X.0P7 r8 = r5.A07
            X.0MO r1 = r5.A0B
            X.0eG r0 = new X.0eG
            r19 = r0
            r20 = r3
            r21 = r9
            r22 = r10
            r23 = r8
            r24 = r12
            r25 = r1
            r26 = r2
            r27 = r11
            r28 = r6
            r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27, r28)
            r5.A0L = r0
            X.0mq r0 = new X.0mq
            r0.<init>()
            r5.A0K = r0
            java.util.Set r6 = r0.A00
            X.068 r1 = r5.A0I
            X.0ms r0 = new X.0ms
            r0.<init>(r1)
            r6.add(r0)
            X.0OX r8 = r5.A08
            com.facebook.rti.common.time.RealtimeSinceBootClock r7 = r5.A04
            android.os.Handler r6 = r5.A00
            X.0Z1 r0 = r4.A0F
            r28 = r0
            X.0P7 r1 = r5.A07
            X.0Re r0 = new X.0Re
            r9 = r0
            r10 = r3
            r11 = r6
            r12 = r7
            r13 = r1
            r14 = r8
            r15 = r28
            r16 = r2
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)
            r5.A0M = r0
            X.00d r13 = r4.A0H
            r5.A0O = r13
            X.0OX r0 = r5.A08
            r27 = r0
            X.03q r0 = r4.A0G
            r26 = r0
            X.0pp r0 = r4.A0K
            r25 = r0
            java.lang.String r16 = r3.getPackageName()
            X.0n2 r0 = r5.A0P
            r24 = r0
            X.0uB r12 = r5.A0U
            X.0ao r0 = r5.A0Q
            r23 = r0
            X.0eG r0 = r5.A0L
            r22 = r0
            X.0Re r0 = r5.A0M
            r21 = r0
            java.util.concurrent.atomic.AtomicInteger r0 = r5.A0V
            r20 = r0
            X.0MO r0 = r5.A0B
            r19 = r0
            X.0eQ r14 = r5.A02
            X.0Lp r11 = r5.A0D
            android.os.Handler r10 = r5.A00
            com.facebook.rti.common.time.RealtimeSinceBootClock r9 = r5.A04
            X.0L5 r8 = r5.A0E
            X.0uE r15 = r4.A0M
            X.068 r0 = r5.A0I
            X.01y r7 = r5.A0J
            X.0ES r6 = r5.A0S
            X.0ET r4 = r5.A0R
            java.util.concurrent.ExecutorService r1 = java.util.concurrent.Executors.newCachedThreadPool()
            X.0jH r2 = new X.0jH
            r2.<init>(r1)
            X.0jQ r1 = X.C11070jQ.A01
            if (r1 != 0) goto L_0x02f4
            X.0jQ r1 = new X.0jQ
            r1.<init>()
            X.C11070jQ.A01 = r1
        L_0x02f4:
            r5 = r27
            r13.A0B = r5
            r13.A04 = r3
            r3 = r26
            r13.A0M = r3
            r3 = r25
            r13.A0u = r3
            r3 = r16
            r13.A0V = r3
            r3 = r24
            r13.A0N = r3
            r13.A0T = r12
            r3 = r35
            r13.A0R = r3
            r3 = r33
            r13.A0I = r3
            r3 = r23
            r13.A0O = r3
            r3 = r22
            r13.A0J = r3
            r3 = r21
            r13.A0L = r3
            r3 = r20
            r13.A0Z = r3
            r3 = r19
            r13.A0C = r3
            r13.A08 = r14
            r13.A0D = r11
            r13.A05 = r10
            r13.A09 = r9
            r13.A0E = r8
            r3 = r28
            r13.A0K = r3
            r13.A0S = r15
            r13.A0F = r0
            r0 = r18
            r13.A0A = r0
            r13.A0G = r7
            r13.A0Q = r6
            r13.A0P = r4
            r13.A0X = r2
            java.lang.Runnable r3 = r13.A0m
            monitor-enter(r12)
            goto L_0x0351
        L_0x034a:
            X.0ma r12 = new X.0ma
            r12.<init>()
            goto L_0x01fd
        L_0x0351:
            java.lang.Runnable r2 = r12.A08     // Catch:{ all -> 0x042a }
            r0 = 0
            if (r2 != 0) goto L_0x0357
            r0 = 1
        L_0x0357:
            X.AnonymousClass0g1.A01(r0)     // Catch:{ all -> 0x042a }
            r12.A08 = r3     // Catch:{ all -> 0x042a }
            monitor-exit(r12)
            X.0uB r5 = r13.A0T
            java.lang.Runnable r3 = r13.A0j
            monitor-enter(r5)
            java.lang.Runnable r2 = r5.A07     // Catch:{ all -> 0x0427 }
            r0 = 0
            if (r2 != 0) goto L_0x0368
            r0 = 1
        L_0x0368:
            X.AnonymousClass0g1.A01(r0)     // Catch:{ all -> 0x0427 }
            r5.A07 = r3     // Catch:{ all -> 0x0427 }
            monitor-exit(r5)
            X.0eG r5 = r13.A0J
            java.lang.Runnable r2 = r13.A0k
            monitor-enter(r5)
            java.lang.Runnable r0 = r5.A0P     // Catch:{ all -> 0x0427 }
            if (r0 != 0) goto L_0x03a3
            r5.A0P = r2     // Catch:{ all -> 0x0427 }
            X.0P7 r7 = r5.A0G     // Catch:{ all -> 0x0427 }
            android.content.Context r6 = r5.A0D     // Catch:{ all -> 0x0427 }
            android.content.BroadcastReceiver r3 = r5.A0B     // Catch:{ all -> 0x0427 }
            java.lang.String r2 = r5.A0J     // Catch:{ all -> 0x0427 }
            android.content.IntentFilter r0 = new android.content.IntentFilter     // Catch:{ all -> 0x0427 }
            r0.<init>(r2)     // Catch:{ all -> 0x0427 }
            android.os.Handler r4 = r5.A0E     // Catch:{ all -> 0x0427 }
            r7.A04(r3, r6, r0, r4)     // Catch:{ all -> 0x0427 }
            android.content.BroadcastReceiver r3 = r5.A0C     // Catch:{ all -> 0x0427 }
            java.lang.String r2 = r5.A0K     // Catch:{ all -> 0x0427 }
            android.content.IntentFilter r0 = new android.content.IntentFilter     // Catch:{ all -> 0x0427 }
            r0.<init>(r2)     // Catch:{ all -> 0x0427 }
            r7.A04(r3, r6, r0, r4)     // Catch:{ all -> 0x0427 }
            android.content.BroadcastReceiver r3 = r5.A0A     // Catch:{ all -> 0x0427 }
            java.lang.String r2 = r5.A0I     // Catch:{ all -> 0x0427 }
            android.content.IntentFilter r0 = new android.content.IntentFilter     // Catch:{ all -> 0x0427 }
            r0.<init>(r2)     // Catch:{ all -> 0x0427 }
            r7.A04(r3, r6, r0, r4)     // Catch:{ all -> 0x0427 }
        L_0x03a3:
            monitor-exit(r5)
            X.0Re r5 = r13.A0L
            java.lang.Runnable r2 = r13.A0l
            monitor-enter(r5)
            java.lang.Runnable r0 = r5.A0C     // Catch:{ all -> 0x0427 }
            if (r0 != 0) goto L_0x03af
            r5.A0C = r2     // Catch:{ all -> 0x0427 }
        L_0x03af:
            monitor-exit(r5)
            java.util.Iterator r4 = r39.iterator()
        L_0x03b4:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x03c8
            java.lang.Object r3 = r4.next()
            com.facebook.rti.mqtt.protocol.messages.SubscribeTopic r3 = (com.facebook.rti.mqtt.protocol.messages.SubscribeTopic) r3
            java.util.Map r2 = r13.A0W
            java.lang.String r0 = r3.A01
            r2.put(r0, r3)
            goto L_0x03b4
        L_0x03c8:
            X.0L5 r0 = r13.A0E
            r0.A01()
            X.0L5 r0 = r13.A0E
            X.0K0 r0 = r0.A00()
            r13.A0r = r0
            r0 = r34
            r13.A07 = r0
            r0 = r37
            r13.A06 = r0
            r0 = r17
            r13.A0b = r0
            r13.A0c = r0
            X.0K0 r0 = r13.A0r
            boolean r0 = r0.A0V
            if (r0 == 0) goto L_0x03ec
            r0 = 1
            r13.A0a = r0
        L_0x03ec:
            X.0K0 r0 = r13.A0r
            boolean r0 = r0.A0Y
            if (r0 == 0) goto L_0x040e
            java.lang.String r5 = r13.A0U
            java.lang.String r4 = "_"
            X.0li r0 = r13.A0I
            X.0lk r0 = r0.Aqs()
            java.lang.Object r3 = r0.first
            java.lang.String r3 = (java.lang.String) r3
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 == 0) goto L_0x0411
            java.lang.String r0 = "????"
        L_0x0408:
            java.lang.String r0 = X.AnonymousClass00U.A0V(r5, r4, r0)
            r13.A0U = r0
        L_0x040e:
            r13.A0H = r1
            return
        L_0x0411:
            int r2 = r3.length()
            r0 = 4
            if (r2 > r0) goto L_0x0421
            int r0 = r3.hashCode()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            goto L_0x0408
        L_0x0421:
            int r2 = r2 - r0
            java.lang.String r0 = r3.substring(r2)
            goto L_0x0408
        L_0x0427:
            r1 = move-exception
            monitor-exit(r5)
            throw r1
        L_0x042a:
            r1 = move-exception
            monitor-exit(r12)
            throw r1
        L_0x042d:
            java.lang.String r0 = "mSSLSocketFactoryAdapterBuilder not bound in Fbns Config Manager"
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
        L_0x0435:
            r1 = move-exception
            monitor-exit(r6)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0P1.A00(X.0gb, X.0uL, java.util.List):void");
    }
}
