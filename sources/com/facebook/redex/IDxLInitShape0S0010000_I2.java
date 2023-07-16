package com.facebook.redex;

import X.AnonymousClass006;
import X.AnonymousClass0OE;

public class IDxLInitShape0S0010000_I2 implements AnonymousClass0OE {
    public boolean A00;
    public final int A01;

    public IDxLInitShape0S0010000_I2(boolean z, int i) {
        this.A01 = i;
        this.A00 = z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0082, code lost:
        if (X.AnonymousClass0Er.A09 != false) goto L_0x0084;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void BPo(X.AnonymousClass0OK r12) {
        /*
            r11 = this;
            int r1 = r11.A01
            boolean r0 = r12.A04()
            if (r1 == 0) goto L_0x00ea
            if (r0 == 0) goto L_0x019a
            r1 = -1429787822(0xffffffffaac72b52, float:-3.537956E-13)
            java.lang.String r0 = "OnPauseRequestStartExecutingCollection.start"
            X.C13810oL.A01(r0, r1)
            java.lang.Class<X.0Om> r1 = X.C04640Om.class
            monitor-enter(r1)     // Catch:{ all -> 0x00e4 }
            X.0NA r0 = X.C04640Om.A00     // Catch:{ all -> 0x00e1 }
            if (r0 != 0) goto L_0x0020
            X.0YS r0 = new X.0YS     // Catch:{ all -> 0x00e1 }
            r0.<init>(r12)     // Catch:{ all -> 0x00e1 }
            X.C04640Om.A00 = r0     // Catch:{ all -> 0x00e1 }
        L_0x0020:
            monitor-exit(r1)     // Catch:{ all -> 0x00e1 }
            X.0NA r8 = X.C04640Om.A00     // Catch:{ all -> 0x00e4 }
            int r4 = r12.A0H     // Catch:{ all -> 0x00e4 }
            boolean r2 = r11.A00     // Catch:{ all -> 0x00e4 }
            X.0Q4 r3 = r12.A03()     // Catch:{ all -> 0x00e4 }
            boolean r0 = X.AnonymousClass0PE.A05     // Catch:{ all -> 0x00e4 }
            if (r0 != 0) goto L_0x00dc
            X.0K9 r9 = X.AnonymousClass0PE.A07     // Catch:{ all -> 0x00e4 }
            r10 = 0
            r5 = 1
            r1 = 0
            boolean r0 = X.AnonymousClass0Er.A0A     // Catch:{ all -> 0x00e4 }
            if (r0 == 0) goto L_0x003b
            X.0Er r6 = X.AnonymousClass0Er.A07     // Catch:{ all -> 0x00e4 }
            goto L_0x0069
        L_0x003b:
            X.0If r7 = X.C03410If.A01(r1, r4, r2)     // Catch:{ all -> 0x00e4 }
            X.0Eu r6 = X.C03190Eu.A00(r7)     // Catch:{ all -> 0x00e4 }
            X.0F0 r4 = X.AnonymousClass0F0.A00(r7)     // Catch:{ all -> 0x00e4 }
            java.lang.Object r2 = X.AnonymousClass0Er.A0C     // Catch:{ all -> 0x00e4 }
            monitor-enter(r2)     // Catch:{ all -> 0x00e4 }
            boolean r0 = X.AnonymousClass0Er.A0A     // Catch:{ all -> 0x00d9 }
            if (r0 != 0) goto L_0x0066
            X.0Ey r1 = X.C03220Ey.A00(r7)     // Catch:{ all -> 0x00d9 }
            if (r4 == 0) goto L_0x0062
            if (r1 == 0) goto L_0x0062
            if (r6 == 0) goto L_0x0062
            X.AnonymousClass0Er.A09 = r10     // Catch:{ all -> 0x00d9 }
            X.0Er r0 = new X.0Er     // Catch:{ all -> 0x00d9 }
            r0.<init>(r6, r1, r4, r7)     // Catch:{ all -> 0x00d9 }
            X.AnonymousClass0Er.A07 = r0     // Catch:{ all -> 0x00d9 }
            goto L_0x0064
        L_0x0062:
            X.AnonymousClass0Er.A09 = r5     // Catch:{ all -> 0x00d9 }
        L_0x0064:
            X.AnonymousClass0Er.A0A = r5     // Catch:{ all -> 0x00d9 }
        L_0x0066:
            X.0Er r6 = X.AnonymousClass0Er.A07     // Catch:{ all -> 0x00d9 }
            monitor-exit(r2)     // Catch:{ all -> 0x00d9 }
        L_0x0069:
            if (r6 != 0) goto L_0x0074
            java.lang.Object[] r1 = new java.lang.Object[r10]     // Catch:{ all -> 0x00e4 }
            java.lang.String r0 = "Cannot create an instance of ActivityLifecycleHook"
            r9.A07(r0, r1)     // Catch:{ all -> 0x00e4 }
            r4 = 0
            goto L_0x00b4
        L_0x0074:
            X.012 r4 = X.AnonymousClass012.A07     // Catch:{ all -> 0x00e4 }
            X.0aS r2 = new X.0aS     // Catch:{ all -> 0x00e4 }
            r2.<init>(r8, r3)     // Catch:{ all -> 0x00e4 }
            boolean r0 = X.AnonymousClass0Er.A0A     // Catch:{ all -> 0x00e4 }
            if (r0 == 0) goto L_0x0084
            boolean r0 = X.AnonymousClass0Er.A09     // Catch:{ all -> 0x00e4 }
            r1 = 1
            if (r0 == 0) goto L_0x0085
        L_0x0084:
            r1 = 0
        L_0x0085:
            java.lang.String r0 = "Must init ActivityLifecycleHooker first"
            X.AnonymousClass0KW.A06(r1, r0)     // Catch:{ all -> 0x00e4 }
            X.0QP r1 = r4.A02     // Catch:{ all -> 0x00e4 }
            X.01Q[] r0 = r1.A04     // Catch:{ all -> 0x00e4 }
            int r0 = r0.length     // Catch:{ all -> 0x00e4 }
            if (r0 <= 0) goto L_0x00a5
            X.09r r0 = r6.A02     // Catch:{ all -> 0x00e4 }
            boolean r0 = r0.A03(r1, r2, r4)     // Catch:{ all -> 0x00e4 }
            if (r0 != 0) goto L_0x00b0
            X.0K9 r2 = X.AnonymousClass0Er.A0B     // Catch:{ all -> 0x00e4 }
            java.lang.Object[] r1 = new java.lang.Object[]{r4}     // Catch:{ all -> 0x00e4 }
            java.lang.String r0 = "Could not add the ActivityThread handler hook for %s"
        L_0x00a1:
            r2.A07(r0, r1)     // Catch:{ all -> 0x00e4 }
            goto L_0x00ae
        L_0x00a5:
            X.0K9 r2 = X.AnonymousClass0Er.A0B     // Catch:{ all -> 0x00e4 }
            java.lang.Object[] r1 = new java.lang.Object[]{r4}     // Catch:{ all -> 0x00e4 }
            java.lang.String r0 = "Currently do not know how to hook the specific lifecycle state %s"
            goto L_0x00a1
        L_0x00ae:
            r4 = 0
            goto L_0x00b1
        L_0x00b0:
            r4 = 1
        L_0x00b1:
            X.AnonymousClass0KF.A01(r4, r5)     // Catch:{ all -> 0x00e4 }
        L_0x00b4:
            X.AnonymousClass0PE.A05 = r4     // Catch:{ all -> 0x00e4 }
            X.0Jw r1 = X.AnonymousClass0Er.A08     // Catch:{ all -> 0x00e4 }
            X.0Xk r3 = r3.A03     // Catch:{ all -> 0x00e4 }
            java.lang.String r0 = "Did you call SessionManager.init()?"
            X.C002801h.A02(r3, r0)     // Catch:{ all -> 0x00e4 }
            java.lang.String r2 = r1.A00     // Catch:{ all -> 0x00e4 }
            if (r2 != 0) goto L_0x00d1
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x00e4 }
            r0.<init>()     // Catch:{ all -> 0x00e4 }
            r1.A01(r0)     // Catch:{ all -> 0x00e4 }
            java.lang.String r2 = r0.toString()     // Catch:{ all -> 0x00e4 }
            r1.A00 = r2     // Catch:{ all -> 0x00e4 }
        L_0x00d1:
            r1 = 493(0x1ed, float:6.91E-43)
            r0 = 494(0x1ee, float:6.92E-43)
            X.C06040Xk.A03(r3, r2, r1, r0, r4)     // Catch:{ all -> 0x00e4 }
            goto L_0x00dc
        L_0x00d9:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x00d9 }
            goto L_0x00e3
        L_0x00dc:
            r0 = -309164686(0xffffffffed928572, float:-5.668267E27)
            goto L_0x018b
        L_0x00e1:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x00e1 }
        L_0x00e3:
            throw r0     // Catch:{ all -> 0x00e4 }
        L_0x00e4:
            r1 = move-exception
            r0 = 1875587978(0x6fcb338a, float:1.2577553E29)
            goto L_0x0196
        L_0x00ea:
            if (r0 == 0) goto L_0x019a
            r1 = 2072825241(0x7b8ccd99, float:1.4621832E36)
            java.lang.String r0 = "OnPauseRequestReceivedCollection.start"
            X.C13810oL.A01(r0, r1)
            java.lang.Class<X.0Om> r1 = X.C04640Om.class
            monitor-enter(r1)     // Catch:{ all -> 0x0192 }
            X.0NA r0 = X.C04640Om.A00     // Catch:{ all -> 0x018f }
            if (r0 != 0) goto L_0x0102
            X.0YS r0 = new X.0YS     // Catch:{ all -> 0x018f }
            r0.<init>(r12)     // Catch:{ all -> 0x018f }
            X.C04640Om.A00 = r0     // Catch:{ all -> 0x018f }
        L_0x0102:
            monitor-exit(r1)     // Catch:{ all -> 0x018f }
            X.0NA r7 = X.C04640Om.A00     // Catch:{ all -> 0x0192 }
            int r3 = r12.A0H     // Catch:{ all -> 0x0192 }
            boolean r1 = r11.A00     // Catch:{ all -> 0x0192 }
            X.0Q4 r5 = r12.A03()     // Catch:{ all -> 0x0192 }
            boolean r0 = X.AnonymousClass0PE.A04     // Catch:{ all -> 0x0192 }
            if (r0 != 0) goto L_0x0188
            X.0K9 r2 = X.AnonymousClass0PE.A07     // Catch:{ all -> 0x0192 }
            r0 = 0
            r6 = 1
            X.0Et r4 = X.C03180Et.A00(r3, r1)     // Catch:{ all -> 0x0192 }
            if (r4 != 0) goto L_0x0124
            java.lang.Object[] r1 = new java.lang.Object[r0]     // Catch:{ all -> 0x0192 }
            java.lang.String r0 = "Cannot create an instance of ActivityThreadBinderHooker"
            r2.A07(r0, r1)     // Catch:{ all -> 0x0192 }
            r4 = 0
            goto L_0x0164
        L_0x0124:
            X.012 r3 = X.AnonymousClass012.A07     // Catch:{ all -> 0x0192 }
            X.0aR r2 = new X.0aR     // Catch:{ all -> 0x0192 }
            r2.<init>(r7, r5)     // Catch:{ all -> 0x0192 }
            X.0QV r1 = r3.A01     // Catch:{ all -> 0x0192 }
            X.01Q[] r0 = r1.A04     // Catch:{ all -> 0x0192 }
            int r0 = r0.length     // Catch:{ all -> 0x0192 }
            if (r0 <= 0) goto L_0x0155
            X.06R r0 = r4.A03     // Catch:{ all -> 0x0192 }
            boolean r0 = r0.A03(r1, r2, r3)     // Catch:{ all -> 0x0192 }
            if (r0 != 0) goto L_0x0146
            X.0K9 r2 = X.C03180Et.A0E     // Catch:{ all -> 0x0192 }
            java.lang.Object[] r1 = new java.lang.Object[]{r3}     // Catch:{ all -> 0x0192 }
            java.lang.String r0 = "Could not add the ActivityThread binder hook for %s"
        L_0x0142:
            r2.A07(r0, r1)     // Catch:{ all -> 0x0192 }
            goto L_0x015e
        L_0x0146:
            boolean r0 = r4.A01()     // Catch:{ all -> 0x0192 }
            if (r0 != 0) goto L_0x0160
            X.0K9 r2 = X.C03180Et.A0E     // Catch:{ all -> 0x0192 }
            java.lang.Object[] r1 = new java.lang.Object[]{r3}     // Catch:{ all -> 0x0192 }
            java.lang.String r0 = "Cannot hook ActivityThread binder for %s"
            goto L_0x0142
        L_0x0155:
            X.0K9 r2 = X.C03180Et.A0E     // Catch:{ all -> 0x0192 }
            java.lang.Object[] r1 = new java.lang.Object[]{r3}     // Catch:{ all -> 0x0192 }
            java.lang.String r0 = "Currently do not know how to hook the specific lifecycle state %s"
            goto L_0x0142
        L_0x015e:
            r4 = 0
            goto L_0x0161
        L_0x0160:
            r4 = 1
        L_0x0161:
            X.AnonymousClass0KF.A01(r4, r6)     // Catch:{ all -> 0x0192 }
        L_0x0164:
            X.AnonymousClass0PE.A04 = r4     // Catch:{ all -> 0x0192 }
            X.0Jw r1 = X.C03180Et.A0D     // Catch:{ all -> 0x0192 }
            X.0Xk r3 = r5.A03     // Catch:{ all -> 0x0192 }
            java.lang.String r0 = "Did you call SessionManager.init()?"
            X.C002801h.A02(r3, r0)     // Catch:{ all -> 0x0192 }
            java.lang.String r2 = r1.A00     // Catch:{ all -> 0x0192 }
            if (r2 != 0) goto L_0x0181
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0192 }
            r0.<init>()     // Catch:{ all -> 0x0192 }
            r1.A01(r0)     // Catch:{ all -> 0x0192 }
            java.lang.String r2 = r0.toString()     // Catch:{ all -> 0x0192 }
            r1.A00 = r2     // Catch:{ all -> 0x0192 }
        L_0x0181:
            r1 = 364(0x16c, float:5.1E-43)
            r0 = 365(0x16d, float:5.11E-43)
            X.C06040Xk.A03(r3, r2, r1, r0, r4)     // Catch:{ all -> 0x0192 }
        L_0x0188:
            r0 = 102486189(0x61bd0ad, float:2.930557E-35)
        L_0x018b:
            X.C13810oL.A00(r0)
            return
        L_0x018f:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x018f }
            throw r0     // Catch:{ all -> 0x0192 }
        L_0x0192:
            r1 = move-exception
            r0 = 2111112723(0x7dd50613, float:3.5394638E37)
        L_0x0196:
            X.C13810oL.A00(r0)
            throw r1
        L_0x019a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.IDxLInitShape0S0010000_I2.BPo(X.0OK):void");
    }

    public final Integer BM7() {
        return AnonymousClass006.A0C;
    }
}
