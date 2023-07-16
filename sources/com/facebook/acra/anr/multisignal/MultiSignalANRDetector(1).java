package com.facebook.acra.anr.multisignal;

import X.AnonymousClass00U;
import X.AnonymousClass08D;
import X.AnonymousClass08I;
import X.AnonymousClass0LU;
import X.AnonymousClass0MI;
import X.AnonymousClass0N5;
import X.AnonymousClass0NG;
import X.AnonymousClass0UP;
import X.C017408g;
import X.C017908l;
import X.C05010Qj;
import X.C06870aW;
import X.C13820oM;
import X.C16650tV;
import android.os.ConditionVariable;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import com.facebook.acra.anr.sigquit.SigquitDetectorLacrima;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

public class MultiSignalANRDetector {
    public static Map A0d = new HashMap();
    public int A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public long A06;
    public long A07;
    public long A08;
    public AnonymousClass08D A09;
    public C017408g A0A;
    public C16650tV A0B;
    public String A0C = "MultiSignalANRDetector";
    public String A0D;
    public String A0E;
    public String A0F;
    public String A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public final ConditionVariable A0P = new ConditionVariable();
    public final Handler A0Q;
    public final C05010Qj A0R = new C05010Qj(this);
    public final AnonymousClass0UP A0S = new AnonymousClass0UP(this);
    public final C017908l A0T;
    public final AnonymousClass0N5 A0U;
    public final AnonymousClass0NG A0V;
    public final Object A0W = new Object();
    public final Runnable A0X = new AnonymousClass08I(this);
    public final AtomicBoolean A0Y = new AtomicBoolean(false);
    public final AtomicReference A0Z = new AtomicReference();
    public final AtomicReference A0a = new AtomicReference();
    public final HandlerThread A0b;
    public volatile boolean A0c;

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0071, code lost:
        if (r9.A0L != false) goto L_0x0073;
     */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x013d A[Catch:{ IOException -> 0x020f }] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x01ca A[Catch:{ IOException -> 0x020f }] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x01df A[Catch:{ IOException -> 0x020f }] */
    /* JADX WARNING: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A00(X.AnonymousClass08X r28, com.facebook.acra.anr.multisignal.MultiSignalANRDetector r29) {
        /*
            r9 = r29
            java.lang.String r2 = r9.A0C
            r27 = 0
            boolean r0 = r9.A0H
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r8 = 1
            r10 = r28
            java.lang.Object[] r1 = new java.lang.Object[]{r10, r0}
            java.lang.String r0 = "On maybeStartReport event: %s has pending report %b"
            X.AnonymousClass0LU.A0O(r2, r0, r1)
            boolean r0 = r9.A0H
            if (r0 == 0) goto L_0x006a
            X.08X r0 = X.AnonymousClass08X.SIGQUIT_RECEIVED
            if (r10 != r0) goto L_0x0055
            X.0NG r0 = r9.A0V
            X.0aW r10 = r0.A03
            java.lang.String r12 = r9.A0D
            java.lang.String r11 = r9.A0E
            long r6 = r9.A05
            long r4 = r9.A04
            long r2 = r9.A07
            long r0 = r9.A06
            r10.A0I = r12
            r10.A0J = r11
            r9 = 0
            r10.A0M = r9
            r10.A0S = r8
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            r10.A0D = r6
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r10.A0C = r4
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r10.A0F = r2
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r10.A0E = r0
        L_0x0051:
            X.C06870aW.A00(r10)
        L_0x0054:
            return
        L_0x0055:
            X.08X r0 = X.AnonymousClass08X.AM_CONFIRMED
            if (r10 != r0) goto L_0x0206
            X.0NG r0 = r9.A0V
            X.0aW r10 = r0.A03
            java.lang.String r3 = r9.A0F
            java.lang.String r2 = r9.A0G
            long r0 = r9.A08
            r10.A0K = r3
            r10.A0L = r2
            r10.A08 = r0
            goto L_0x0051
        L_0x006a:
            boolean r0 = r9.A0M
            if (r0 != 0) goto L_0x0073
            boolean r1 = r9.A0L
            r0 = 0
            if (r1 == 0) goto L_0x0074
        L_0x0073:
            r0 = 1
        L_0x0074:
            X.0NG r2 = r9.A0V
            if (r0 == 0) goto L_0x01f5
            X.08D r0 = r9.A09
            if (r0 == 0) goto L_0x00ad
            X.0ab r0 = (X.C06920ab) r0
            X.0ac r0 = r0.A00
            boolean r6 = r0.A03
        L_0x0082:
            boolean r0 = r9.A0N
            if (r0 != 0) goto L_0x00a3
            r5 = 30000(0x7530, float:4.2039E-41)
            X.0tV r1 = r9.A0B
            X.0tV r0 = X.C16650tV.SIGQUIT_RECEIVED_AM_UNCONFIRMED_MT_BLOCKED
            if (r1 == r0) goto L_0x0092
            X.0tV r0 = X.C16650tV.SIGQUIT_RECEIVED_AM_UNCONFIRMED_MT_UNBLOCKED
            if (r1 != r0) goto L_0x00a3
        L_0x0092:
            java.lang.String r1 = r9.A0C
            java.lang.String r0 = "Starting timer for AM confirmation"
            X.AnonymousClass0LU.A0C(r1, r0)
            r9.A0N = r8
            android.os.Handler r4 = r9.A0Q
            java.lang.Runnable r3 = r9.A0X
            long r0 = (long) r5
            r4.postDelayed(r3, r0)
        L_0x00a3:
            if (r6 == 0) goto L_0x01e8
            java.lang.String r1 = r9.A0C
            java.lang.String r0 = "Reporting ANR start"
            X.AnonymousClass0LU.A0C(r1, r0)
            goto L_0x00af
        L_0x00ad:
            r6 = 1
            goto L_0x0082
        L_0x00af:
            r9.A0H = r8     // Catch:{ IOException -> 0x020f }
            long r0 = android.os.SystemClock.uptimeMillis()     // Catch:{ IOException -> 0x020f }
            r9.A01 = r0     // Catch:{ IOException -> 0x020f }
            r7 = 0
            r6 = 0
            X.08X r3 = X.AnonymousClass08X.SIGQUIT_RECEIVED     // Catch:{ IOException -> 0x020f }
            r25 = 0
            if (r10 != r3) goto L_0x00d4
            java.lang.String r6 = r9.A0D     // Catch:{ IOException -> 0x020f }
            java.lang.String r0 = r9.A0E     // Catch:{ IOException -> 0x020f }
            r24 = r0
            long r0 = r9.A05     // Catch:{ IOException -> 0x020f }
            r16 = r0
            long r11 = r9.A04     // Catch:{ IOException -> 0x020f }
            long r0 = r9.A07     // Catch:{ IOException -> 0x020f }
            r22 = r0
            long r0 = r9.A06     // Catch:{ IOException -> 0x020f }
            r20 = r0
            goto L_0x00de
        L_0x00d4:
            r24 = r7
            r20 = 0
            r16 = 0
            r11 = 0
            r22 = 0
        L_0x00de:
            if (r10 != r3) goto L_0x00e7
            if (r6 != 0) goto L_0x00e5
            if (r24 != 0) goto L_0x00e5
            goto L_0x00e7
        L_0x00e5:
            r14 = 1
            goto L_0x0136
        L_0x00e7:
            java.io.ByteArrayOutputStream r5 = new java.io.ByteArrayOutputStream     // Catch:{ IOException -> 0x020f }
            r5.<init>()     // Catch:{ IOException -> 0x020f }
            java.io.PrintWriter r4 = new java.io.PrintWriter     // Catch:{ IOException -> 0x020f }
            r4.<init>(r5)     // Catch:{ IOException -> 0x020f }
            java.util.Map r13 = java.lang.Thread.getAllStackTraces()     // Catch:{ IOException -> 0x020f }
            android.os.Looper r0 = android.os.Looper.getMainLooper()     // Catch:{ IOException -> 0x020f }
            java.lang.Thread r3 = r0.getThread()     // Catch:{ IOException -> 0x020f }
            java.util.Set r0 = r13.entrySet()     // Catch:{ IOException -> 0x020f }
            java.util.Iterator r6 = r0.iterator()     // Catch:{ IOException -> 0x020f }
        L_0x0105:
            boolean r0 = r6.hasNext()     // Catch:{ IOException -> 0x020f }
            if (r0 == 0) goto L_0x0121
            java.lang.Object r0 = r6.next()     // Catch:{ IOException -> 0x020f }
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch:{ IOException -> 0x020f }
            java.lang.Object r1 = r0.getKey()     // Catch:{ IOException -> 0x020f }
            java.lang.Thread r1 = (java.lang.Thread) r1     // Catch:{ IOException -> 0x020f }
            java.lang.Object r0 = r0.getValue()     // Catch:{ IOException -> 0x020f }
            java.lang.StackTraceElement[] r0 = (java.lang.StackTraceElement[]) r0     // Catch:{ IOException -> 0x020f }
            X.AnonymousClass08G.A00(r4, r1, r0)     // Catch:{ IOException -> 0x020f }
            goto L_0x0105
        L_0x0121:
            boolean r0 = r13.containsKey(r3)     // Catch:{ IOException -> 0x020f }
            if (r0 != 0) goto L_0x012e
            java.lang.StackTraceElement[] r0 = r3.getStackTrace()     // Catch:{ IOException -> 0x020f }
            X.AnonymousClass08G.A00(r4, r3, r0)     // Catch:{ IOException -> 0x020f }
        L_0x012e:
            r4.flush()     // Catch:{ IOException -> 0x020f }
            java.lang.String r6 = r5.toString()     // Catch:{ IOException -> 0x020f }
            r14 = 0
        L_0x0136:
            X.0aW r13 = r2.A03     // Catch:{ IOException -> 0x020f }
            X.08D r0 = r9.A09     // Catch:{ IOException -> 0x020f }
            r15 = 0
            if (r0 != 0) goto L_0x013e
            r15 = 1
        L_0x013e:
            r19 = 6
            boolean r0 = r9.A0L     // Catch:{ IOException -> 0x020f }
            r29 = r0
            boolean r0 = r9.A0M     // Catch:{ IOException -> 0x020f }
            r28 = r0
            long r4 = android.os.SystemClock.uptimeMillis()     // Catch:{ IOException -> 0x020f }
            long r2 = r9.A02     // Catch:{ IOException -> 0x020f }
            java.lang.Long r18 = java.lang.Long.valueOf(r16)     // Catch:{ IOException -> 0x020f }
            java.lang.Long r17 = java.lang.Long.valueOf(r11)     // Catch:{ IOException -> 0x020f }
            java.lang.Long r16 = java.lang.Long.valueOf(r22)     // Catch:{ IOException -> 0x020f }
            java.lang.Long r11 = java.lang.Long.valueOf(r20)     // Catch:{ IOException -> 0x020f }
            r0 = -1
            r13.A0A = r0     // Catch:{ IOException -> 0x020f }
            java.util.List r12 = r13.A0U     // Catch:{ IOException -> 0x020f }
            r12.clear()     // Catch:{ IOException -> 0x020f }
            r13.A03 = r0     // Catch:{ IOException -> 0x020f }
            r13.A06 = r0     // Catch:{ IOException -> 0x020f }
            r13.A09 = r0     // Catch:{ IOException -> 0x020f }
            r12 = r27
            r13.A01 = r12     // Catch:{ IOException -> 0x020f }
            r13.A07 = r0     // Catch:{ IOException -> 0x020f }
            r13.A0K = r7     // Catch:{ IOException -> 0x020f }
            r13.A0L = r7     // Catch:{ IOException -> 0x020f }
            r13.A08 = r0     // Catch:{ IOException -> 0x020f }
            r0 = r19
            r13.A00 = r0     // Catch:{ IOException -> 0x020f }
            r0 = r29
            r13.A0P = r0     // Catch:{ IOException -> 0x020f }
            r0 = r28
            r13.A0Q = r0     // Catch:{ IOException -> 0x020f }
            r13.A0R = r15     // Catch:{ IOException -> 0x020f }
            r13.A04 = r4     // Catch:{ IOException -> 0x020f }
            r13.A05 = r2     // Catch:{ IOException -> 0x020f }
            r0 = r18
            r13.A0D = r0     // Catch:{ IOException -> 0x020f }
            r0 = r17
            r13.A0C = r0     // Catch:{ IOException -> 0x020f }
            r0 = r16
            r13.A0F = r0     // Catch:{ IOException -> 0x020f }
            r13.A0E = r11     // Catch:{ IOException -> 0x020f }
            r13.A0I = r6     // Catch:{ IOException -> 0x020f }
            r0 = r24
            r13.A0J = r0     // Catch:{ IOException -> 0x020f }
            r13.A0M = r7     // Catch:{ IOException -> 0x020f }
            r13.A0S = r14     // Catch:{ IOException -> 0x020f }
            X.0Oe r0 = r13.A0X     // Catch:{ IOException -> 0x020f }
            java.lang.Object r0 = r0.get()     // Catch:{ IOException -> 0x020f }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ IOException -> 0x020f }
            r13.A0N = r0     // Catch:{ IOException -> 0x020f }
            X.0Oe r0 = r13.A0W     // Catch:{ IOException -> 0x020f }
            java.lang.Object r0 = r0.get()     // Catch:{ IOException -> 0x020f }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ IOException -> 0x020f }
            r13.A0H = r0     // Catch:{ IOException -> 0x020f }
            X.0Oe r0 = r13.A0V     // Catch:{ IOException -> 0x020f }
            java.lang.Object r0 = r0.get()     // Catch:{ IOException -> 0x020f }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ IOException -> 0x020f }
            r13.A0G = r0     // Catch:{ IOException -> 0x020f }
            r13.A0O = r8     // Catch:{ IOException -> 0x020f }
            X.C06870aW.A00(r13)     // Catch:{ IOException -> 0x020f }
            X.08X r0 = X.AnonymousClass08X.AM_CONFIRMED     // Catch:{ IOException -> 0x020f }
            if (r10 != r0) goto L_0x01d9
            java.lang.String r3 = r9.A0F     // Catch:{ IOException -> 0x020f }
            java.lang.String r2 = r9.A0G     // Catch:{ IOException -> 0x020f }
            long r0 = r9.A08     // Catch:{ IOException -> 0x020f }
            r13.A0K = r3     // Catch:{ IOException -> 0x020f }
            r13.A0L = r2     // Catch:{ IOException -> 0x020f }
            r13.A08 = r0     // Catch:{ IOException -> 0x020f }
            X.C06870aW.A00(r13)     // Catch:{ IOException -> 0x020f }
        L_0x01d9:
            long r1 = r9.A03     // Catch:{ IOException -> 0x020f }
            int r0 = (r1 > r25 ? 1 : (r1 == r25 ? 0 : -1))
            if (r0 == 0) goto L_0x0054
            r0 = 3
            r13.A09 = r1     // Catch:{ IOException -> 0x020f }
            r13.A01 = r0     // Catch:{ IOException -> 0x020f }
            X.C06870aW.A00(r13)     // Catch:{ IOException -> 0x020f }
            goto L_0x020e
        L_0x01e8:
            X.0aW r2 = r2.A03
            boolean r1 = r9.A0L
            boolean r0 = r9.A0M
            r2.A0P = r1
            r2.A0Q = r0
            X.C06870aW.A00(r2)
        L_0x01f5:
            X.08X r0 = X.AnonymousClass08X.SIGQUIT_RECEIVED
            if (r10 != r0) goto L_0x0054
            java.lang.String r1 = r9.A0E
            if (r1 == 0) goto L_0x0054
            java.io.File r0 = new java.io.File
            r0.<init>(r1)
            r0.delete()
            return
        L_0x0206:
            java.lang.String r1 = "Event should be SIGQUIT_RECEIVED or AM_CONFIRMED"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x020e:
            return
        L_0x020f:
            r2 = move-exception
            java.lang.String r1 = r9.A0C
            java.lang.String r0 = "Error starting ANR report"
            X.AnonymousClass0LU.A0F(r1, r0, r2)
            r0 = r27
            r9.A0H = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.acra.anr.multisignal.MultiSignalANRDetector.A00(X.08X, com.facebook.acra.anr.multisignal.MultiSignalANRDetector):void");
    }

    public static void A01(MultiSignalANRDetector multiSignalANRDetector) {
        AnonymousClass0LU.A0O(multiSignalANRDetector.A0C, "Clearing error state has pending report %b", Boolean.valueOf(multiSignalANRDetector.A0H));
        if (multiSignalANRDetector.A0H) {
            long uptimeMillis = SystemClock.uptimeMillis() - multiSignalANRDetector.A01;
            C06870aW r0 = multiSignalANRDetector.A0V.A03;
            r0.A0A = uptimeMillis;
            C06870aW.A00(r0);
            multiSignalANRDetector.A0H = false;
        }
        multiSignalANRDetector.A0F = null;
        multiSignalANRDetector.A0G = null;
        multiSignalANRDetector.A08 = 0;
        multiSignalANRDetector.A07 = 0;
        multiSignalANRDetector.A06 = 0;
        multiSignalANRDetector.A05 = 0;
        multiSignalANRDetector.A0D = null;
        multiSignalANRDetector.A0E = null;
        multiSignalANRDetector.A04 = 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005c, code lost:
        if (r1 != 1) goto L_0x009e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0063, code lost:
        if (r1 != 3) goto L_0x0065;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0065, code lost:
        r0 = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0066, code lost:
        if (r1 == r0) goto L_0x014c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0069, code lost:
        r0 = X.C16650tV.SIGQUIT_RECEIVED_AM_CONFIRMED_MT_UNBLOCKED;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0084, code lost:
        r0 = X.C16650tV.SIGQUIT_RECEIVED_AM_CONFIRMED_MT_BLOCKED;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0092, code lost:
        if (r1 != 3) goto L_0x00a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0095, code lost:
        r0 = X.C16650tV.SIGQUIT_RECEIVED_AM_UNCONFIRMED_MT_BLOCKED;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x009e, code lost:
        if (r1 == r2) goto L_0x014c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00a0, code lost:
        X.AnonymousClass0LU.A0O(r8.A0C, "Unexpected event %s received in state %s", r9, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00ad, code lost:
        if (r9 == X.AnonymousClass08X.SIGQUIT_RECEIVED) goto L_0x00de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00b1, code lost:
        if (r8.A09 == null) goto L_0x00de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00b3, code lost:
        r1 = new java.lang.StringBuilder("Unexpected event ");
        r1.append(r9);
        r1.append(" received in state ");
        r1.append(r8.A0B);
        r3 = new java.lang.IllegalStateException(r1.toString());
        r0 = X.C07290bH.A08;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00d4, code lost:
        if (r0 == null) goto L_0x00de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00d6, code lost:
        r0.A00("Unexpected event", "ANR", r3, 100, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00de, code lost:
        r7 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00e1, code lost:
        if (r9 != X.AnonymousClass08X.SIGQUIT_RECEIVED) goto L_0x00e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00e3, code lost:
        r7 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00e4, code lost:
        r3 = r8.A0V;
        r6 = r3.A00;
        r5 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00e9, code lost:
        if (r7 == false) goto L_0x00f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00eb, code lost:
        r5 = new X.AnonymousClass08S(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00f0, code lost:
        r1 = r8.A0B;
        r4 = X.C16650tV.SIGQUIT_RECEIVED_AM_UNCONFIRMED_MT_BLOCKED;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00f4, code lost:
        if (r1 == r4) goto L_0x00fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00f6, code lost:
        r2 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00f9, code lost:
        if (r1 != X.C16650tV.NO_SIGQUIT_AM_CONFIRMED_MT_BLOCKED) goto L_0x00fc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00fb, code lost:
        r2 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0038, code lost:
        if (r1 != 0) goto L_0x0065;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00fc, code lost:
        if (r7 == false) goto L_0x012f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00fe, code lost:
        if (r2 == false) goto L_0x012f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0100, code lost:
        X.C06910aa.A01(r6.A01, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0105, code lost:
        if (r5 == null) goto L_0x010a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0107, code lost:
        r5.run();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x010a, code lost:
        r8.A0L = r10;
        r8.A0M = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0110, code lost:
        if (r8.A0O != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0112, code lost:
        r1 = r8.A0B;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0114, code lost:
        if (r1 == r4) goto L_0x011a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0118, code lost:
        if (r1 != X.C16650tV.NO_SIGQUIT_AM_CONFIRMED_MT_BLOCKED) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x011a, code lost:
        X.AnonymousClass0LU.A0C(r8.A0C, "Posting main thread check");
        r8.A0O = true;
        r3.A02.post(new X.AnonymousClass08T(r8));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x012f, code lost:
        r11 = X.AnonymousClass0MI.A08();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0135, code lost:
        if (X.AnonymousClass0MI.A04 != null) goto L_0x0147;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0137, code lost:
        r10 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0138, code lost:
        X.C06910aa.A01(r6.A01, r8.A0B);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x013f, code lost:
        if (r5 == null) goto L_0x0144;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0141, code lost:
        r5.run();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0144, code lost:
        if (r2 == false) goto L_0x010e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0147, code lost:
        r10 = X.AnonymousClass0MI.A04.A05;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x014c, code lost:
        r0 = X.C16650tV.NO_ANR_DETECTED;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0151, code lost:
        r8.A0B = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02(X.AnonymousClass08X r9, boolean r10, boolean r11) {
        /*
            r8 = this;
            java.lang.String r4 = r8.A0C
            X.0tV r3 = r8.A0B
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r10)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r11)
            r2 = 3
            java.lang.Object[] r1 = new java.lang.Object[]{r3, r9, r1, r0}
            java.lang.String r0 = "Transitioning from %s event %s inFgV1: %b inFgV2: %b"
            X.AnonymousClass0LU.A0O(r4, r0, r1)
            X.0tV r3 = r8.A0B
            int r0 = r3.ordinal()
            switch(r0) {
                case 0: goto L_0x0088;
                case 1: goto L_0x001f;
                case 2: goto L_0x001f;
                case 3: goto L_0x006d;
                case 4: goto L_0x005f;
                case 5: goto L_0x0099;
                case 6: goto L_0x0048;
                case 7: goto L_0x0054;
                case 8: goto L_0x003b;
                case 9: goto L_0x0033;
                default: goto L_0x001f;
            }
        L_0x001f:
            java.lang.String r1 = "Unknown state: "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r1 = r0.toString()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0033:
            int r1 = r9.ordinal()
            r0 = 0
            if (r1 == r0) goto L_0x0069
            goto L_0x0065
        L_0x003b:
            int r1 = r9.ordinal()
            r0 = 0
            if (r1 == r0) goto L_0x0084
            if (r1 != r2) goto L_0x0065
            X.0tV r0 = X.C16650tV.NO_SIGQUIT_AM_CONFIRMED_MT_UNBLOCKED
            goto L_0x0151
        L_0x0048:
            int r1 = r9.ordinal()
            r0 = 0
            if (r1 == r0) goto L_0x0095
            r0 = 1
            if (r1 == r0) goto L_0x0069
            r0 = 2
            goto L_0x0066
        L_0x0054:
            int r1 = r9.ordinal()
            r0 = 0
            if (r1 == r0) goto L_0x0095
            r0 = 1
            if (r1 == r0) goto L_0x0084
            goto L_0x009e
        L_0x005f:
            int r1 = r9.ordinal()
            if (r1 == r2) goto L_0x0069
        L_0x0065:
            r0 = 4
        L_0x0066:
            if (r1 == r0) goto L_0x014c
            goto L_0x00a0
        L_0x0069:
            X.0tV r0 = X.C16650tV.SIGQUIT_RECEIVED_AM_CONFIRMED_MT_UNBLOCKED
            goto L_0x0151
        L_0x006d:
            int r1 = r9.ordinal()
            r0 = 0
            if (r1 == r0) goto L_0x00de
            r0 = 1
            if (r1 == r0) goto L_0x0084
            if (r1 == r2) goto L_0x0080
            r0 = 2
            if (r1 != r0) goto L_0x00a0
            X.0tV r0 = X.C16650tV.SIGQUIT_RECEIVED_AM_EXPIRED_MT_BLOCKED
            goto L_0x0151
        L_0x0080:
            X.0tV r0 = X.C16650tV.SIGQUIT_RECEIVED_AM_UNCONFIRMED_MT_UNBLOCKED
            goto L_0x0151
        L_0x0084:
            X.0tV r0 = X.C16650tV.SIGQUIT_RECEIVED_AM_CONFIRMED_MT_BLOCKED
            goto L_0x0151
        L_0x0088:
            int r1 = r9.ordinal()
            r0 = 0
            if (r1 == r0) goto L_0x0095
            r0 = 1
            if (r1 == r0) goto L_0x014f
            if (r1 == r2) goto L_0x00de
            goto L_0x00a0
        L_0x0095:
            X.0tV r0 = X.C16650tV.SIGQUIT_RECEIVED_AM_UNCONFIRMED_MT_BLOCKED
            goto L_0x0151
        L_0x0099:
            int r1 = r9.ordinal()
            r2 = 4
        L_0x009e:
            if (r1 == r2) goto L_0x014c
        L_0x00a0:
            java.lang.String r2 = r8.A0C
            java.lang.Object[] r1 = new java.lang.Object[]{r9, r3}
            java.lang.String r0 = "Unexpected event %s received in state %s"
            X.AnonymousClass0LU.A0O(r2, r0, r1)
            X.08X r0 = X.AnonymousClass08X.SIGQUIT_RECEIVED
            if (r9 == r0) goto L_0x00de
            X.08D r0 = r8.A09
            if (r0 == 0) goto L_0x00de
            java.lang.String r0 = "Unexpected event "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r9)
            java.lang.String r0 = " received in state "
            r1.append(r0)
            X.0tV r0 = r8.A0B
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            r3.<init>(r0)
            java.lang.String r1 = "Unexpected event"
            X.0bH r0 = X.C07290bH.A08
            if (r0 == 0) goto L_0x00de
            java.lang.String r2 = "ANR"
            r4 = 100
            r6 = 0
            r0.A00(r1, r2, r3, r4, r6)
        L_0x00de:
            X.08X r0 = X.AnonymousClass08X.SIGQUIT_RECEIVED
            r7 = 0
            if (r9 != r0) goto L_0x00e4
            r7 = 1
        L_0x00e4:
            X.0NG r3 = r8.A0V
            X.0aY r6 = r3.A00
            r5 = 0
            if (r7 == 0) goto L_0x00f0
            X.08S r5 = new X.08S
            r5.<init>(r8)
        L_0x00f0:
            X.0tV r1 = r8.A0B
            X.0tV r4 = X.C16650tV.SIGQUIT_RECEIVED_AM_UNCONFIRMED_MT_BLOCKED
            if (r1 == r4) goto L_0x00fb
            X.0tV r0 = X.C16650tV.NO_SIGQUIT_AM_CONFIRMED_MT_BLOCKED
            r2 = 0
            if (r1 != r0) goto L_0x00fc
        L_0x00fb:
            r2 = 1
        L_0x00fc:
            if (r7 == 0) goto L_0x012f
            if (r2 == 0) goto L_0x012f
            X.0aa r0 = r6.A01
            X.C06910aa.A01(r0, r1)
            if (r5 == 0) goto L_0x010a
            r5.run()
        L_0x010a:
            r8.A0L = r10
            r8.A0M = r11
        L_0x010e:
            boolean r0 = r8.A0O
            if (r0 != 0) goto L_0x012e
            X.0tV r1 = r8.A0B
            if (r1 == r4) goto L_0x011a
            X.0tV r0 = X.C16650tV.NO_SIGQUIT_AM_CONFIRMED_MT_BLOCKED
            if (r1 != r0) goto L_0x012e
        L_0x011a:
            java.lang.String r1 = r8.A0C
            java.lang.String r0 = "Posting main thread check"
            X.AnonymousClass0LU.A0C(r1, r0)
            r0 = 1
            r8.A0O = r0
            android.os.Handler r1 = r3.A02
            X.08T r0 = new X.08T
            r0.<init>(r8)
            r1.post(r0)
        L_0x012e:
            return
        L_0x012f:
            boolean r11 = X.AnonymousClass0MI.A08()
            X.0Z2 r0 = X.AnonymousClass0MI.A04
            if (r0 != 0) goto L_0x0147
            r10 = 0
        L_0x0138:
            X.0tV r1 = r8.A0B
            X.0aa r0 = r6.A01
            X.C06910aa.A01(r0, r1)
            if (r5 == 0) goto L_0x0144
            r5.run()
        L_0x0144:
            if (r2 == 0) goto L_0x010e
            goto L_0x010a
        L_0x0147:
            X.0Z2 r0 = X.AnonymousClass0MI.A04
            boolean r10 = r0.A05
            goto L_0x0138
        L_0x014c:
            X.0tV r0 = X.C16650tV.NO_ANR_DETECTED
            goto L_0x0151
        L_0x014f:
            X.0tV r0 = X.C16650tV.NO_SIGQUIT_AM_CONFIRMED_MT_BLOCKED
        L_0x0151:
            r8.A0B = r0
            goto L_0x00de
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.acra.anr.multisignal.MultiSignalANRDetector.A02(X.08X, boolean, boolean):void");
    }

    public MultiSignalANRDetector(AnonymousClass0N5 r4, AnonymousClass0NG r5) {
        this.A0V = r5;
        C017908l r0 = SigquitDetectorLacrima.sInstance;
        if (r0 == null) {
            r0 = new SigquitDetectorLacrima(this);
            SigquitDetectorLacrima.sInstance = r0;
        }
        this.A0T = r0;
        this.A0B = C16650tV.NO_ANR_DETECTED;
        this.A0A = new C017408g(r5.A01, r5.A04);
        this.A0U = r4;
        HandlerThread handlerThread = new HandlerThread(AnonymousClass00U.A0L("MultiSignalANRDetectorThread:", AnonymousClass0MI.A01()));
        C13820oM.A00(handlerThread);
        this.A0b = handlerThread;
        handlerThread.start();
        this.A0Q = new Handler(handlerThread.getLooper());
    }
}
