package X;

import android.content.Context;

/* renamed from: X.0Np  reason: invalid class name and case insensitive filesystem */
public final class C04430Np implements AnonymousClass0A9 {
    public AnonymousClass0AY A00;
    public C02390Az A01;
    public C02390Az A02;
    public AnonymousClass0Jk A03;
    public final int A04;
    public final long A05;
    public final Context A06;
    public final AnonymousClass0AG A07;
    public final AnonymousClass0AH A08;
    public final C02160Ab A09;
    public final C02180Ad A0A;
    public final AnonymousClass0BP A0B;
    public final AnonymousClass0BP A0C;
    public final AnonymousClass0BQ A0D;
    public final AnonymousClass0CG A0E;
    public final AnonymousClass0CG A0F;
    public final C02530Bu A0G;
    public final C02530Bu A0H;
    public final AnonymousClass0LI A0I;
    public final Class A0J;
    public final boolean A0K;
    public final Class A0L;
    public final Class A0M;

    private synchronized C02190Ae A00(String str) {
        return new C02190Ae(this.A0M, this.A0L, this.A0J, AnonymousClass006.A00, str);
    }

    public final synchronized void CvS(AnonymousClass0AY r4) {
        synchronized (this) {
            this.A00 = r4;
            C02390Az r0 = this.A01;
            if (r0 != null) {
                C02380Ay r1 = r0.A03;
                C02380Ay.A02(r1);
                r1.sendMessage(r1.obtainMessage(3, r4));
            }
            C02390Az r02 = this.A02;
            if (r02 != null) {
                C02380Ay r12 = r02.A03;
                C02380Ay.A02(r12);
                r12.sendMessage(r12.obtainMessage(3, r4));
            }
            AnonymousClass0Jk r03 = this.A03;
            if (r03 != null) {
                r03.CvS(r4);
            }
        }
    }

    public final synchronized void D7i() {
        synchronized (this) {
            C02390Az r0 = this.A01;
            if (r0 != null) {
                C02380Ay r1 = r0.A03;
                C02380Ay.A02(r1);
                r1.sendMessage(r1.obtainMessage(9));
            }
            C02390Az r02 = this.A02;
            if (r02 != null) {
                C02380Ay r12 = r02.A03;
                C02380Ay.A02(r12);
                r12.sendMessage(r12.obtainMessage(9));
            }
            AnonymousClass0Jk r03 = this.A03;
            if (r03 != null) {
                r03.D7i();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:63:0x025c, code lost:
        r2 = r8.A04;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void CXo(X.AnonymousClass0KD r46, java.lang.String r47, long r48) {
        /*
            r45 = this;
            r0 = r45
            r16 = r0
            monitor-enter(r16)
            X.0BQ r7 = r0.A0D     // Catch:{ all -> 0x0290 }
            boolean r3 = r7.BWC()     // Catch:{ all -> 0x0290 }
            r14 = r46
            r1 = r48
            if (r3 == 0) goto L_0x0110
            r4 = -2
            int r3 = (r48 > r4 ? 1 : (r48 == r4 ? 0 : -1))
            r8 = r47
            if (r3 != 0) goto L_0x0021
            boolean r3 = r7.BTe(r8)     // Catch:{ all -> 0x0290 }
            if (r3 == 0) goto L_0x0021
            goto L_0x0110
        L_0x0021:
            X.0CG r35 = r7.Axl()     // Catch:{ all -> 0x028e }
            X.0CG r36 = r7.An0()     // Catch:{ all -> 0x028e }
            android.os.HandlerThread r32 = r7.AlK()     // Catch:{ all -> 0x028e }
            X.0Jk r3 = r0.A03     // Catch:{ all -> 0x028e }
            if (r3 != 0) goto L_0x0109
            if (r32 != 0) goto L_0x004b
            java.lang.String r6 = "Analytics-MicroBatch-Proc"
            r5 = 10
            android.content.Context r3 = r0.A06     // Catch:{ all -> 0x028e }
            X.0Af r4 = X.C02200Af.A00(r3)     // Catch:{ all -> 0x028e }
            java.lang.Class r3 = r0.A0J     // Catch:{ all -> 0x028e }
            java.lang.String r3 = r3.getName()     // Catch:{ all -> 0x028e }
            com.facebook.analytics2.logger.HandlerThreadFactory r3 = r4.A04(r3)     // Catch:{ all -> 0x028e }
            android.os.HandlerThread r32 = r3.AFM(r6, r5)     // Catch:{ all -> 0x028e }
        L_0x004b:
            X.0Bu r3 = r0.A0H     // Catch:{ all -> 0x028e }
            r44 = r3
            X.0Bu r3 = r0.A0G     // Catch:{ all -> 0x028e }
            r43 = r3
            android.content.Context r3 = r0.A06     // Catch:{ all -> 0x028e }
            java.lang.String r5 = "micro_batch"
            X.0BP r4 = r0.A0C     // Catch:{ all -> 0x028e }
            r22 = r4
            X.0Ad r4 = r0.A0A     // Catch:{ all -> 0x028e }
            X.0AU r6 = new X.0AU     // Catch:{ all -> 0x028e }
            r6.<init>(r4)     // Catch:{ all -> 0x028e }
            X.0LI r15 = r0.A0I     // Catch:{ all -> 0x028e }
            X.0Ae r21 = r0.A00(r5)     // Catch:{ all -> 0x028e }
            java.lang.Class r13 = r0.A0J     // Catch:{ all -> 0x028e }
            X.0AH r4 = r0.A08     // Catch:{ all -> 0x028e }
            long r37 = r7.B5x()     // Catch:{ all -> 0x028e }
            long r39 = r7.B6d()     // Catch:{ all -> 0x028e }
            long r41 = r7.ArP()     // Catch:{ all -> 0x028e }
            X.0Ba r25 = new X.0Ba     // Catch:{ all -> 0x028e }
            r34 = r4
            r33 = r25
            r33.<init>(r34, r35, r36, r37, r39, r41)     // Catch:{ all -> 0x028e }
            java.lang.String r5 = "normal"
            r9 = 1543572765(0x5c010d1d, float:1.45298761E17)
            java.io.File r4 = X.C14630pr.A00(r3, r9)     // Catch:{ all -> 0x00ca }
            r4.mkdirs()     // Catch:{ all -> 0x00ca }
            java.io.File r10 = new java.io.File     // Catch:{ all -> 0x00ca }
            r10.<init>(r4, r5)     // Catch:{ all -> 0x00ca }
            java.lang.String r4 = "regular"
            X.0Ae r5 = r0.A00(r4)     // Catch:{ all -> 0x00ca }
            int r11 = r7.Bgi()     // Catch:{ all -> 0x00ca }
            X.0By r4 = new X.0By     // Catch:{ all -> 0x00ca }
            r4.<init>(r5, r10, r11)     // Catch:{ all -> 0x00ca }
            X.0BY r10 = new X.0BY     // Catch:{ all -> 0x00ca }
            r10.<init>(r4)     // Catch:{ all -> 0x00ca }
            java.lang.String r5 = "high"
            java.io.File r4 = X.C14630pr.A00(r3, r9)     // Catch:{ all -> 0x00ca }
            r4.mkdirs()     // Catch:{ all -> 0x00ca }
            java.io.File r9 = new java.io.File     // Catch:{ all -> 0x00ca }
            r9.<init>(r4, r5)     // Catch:{ all -> 0x00ca }
            java.lang.String r4 = "ads"
            X.0Ae r5 = r0.A00(r4)     // Catch:{ all -> 0x00ca }
            X.0By r4 = new X.0By     // Catch:{ all -> 0x00ca }
            r4.<init>(r5, r9, r11)     // Catch:{ all -> 0x00ca }
            X.0BY r5 = new X.0BY     // Catch:{ all -> 0x00ca }
            r5.<init>(r4)     // Catch:{ all -> 0x00ca }
            X.0BZ r11 = new X.0BZ     // Catch:{ all -> 0x00ca }
            r11.<init>(r10, r5)     // Catch:{ all -> 0x00ca }
            goto L_0x00cc
        L_0x00ca:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x028e }
        L_0x00cc:
            boolean r12 = r0.A0K     // Catch:{ all -> 0x028e }
            long r4 = r0.A05     // Catch:{ all -> 0x028e }
            int r10 = r0.A04     // Catch:{ all -> 0x028e }
            X.0AG r9 = r0.A07     // Catch:{ all -> 0x028e }
            X.0BS r17 = new X.0BS     // Catch:{ all -> 0x028e }
            r23 = r7
            r24 = r11
            r26 = r15
            r27 = r13
            r28 = r10
            r29 = r4
            r31 = r12
            r18 = r3
            r19 = r9
            r20 = r6
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r31)     // Catch:{ all -> 0x028e }
            X.0Ab r3 = r0.A09     // Catch:{ all -> 0x028e }
            X.0Jk r4 = new X.0Jk     // Catch:{ all -> 0x028e }
            r31 = r4
            r33 = r3
            r34 = r22
            r35 = r7
            r36 = r17
            r37 = r44
            r38 = r43
            r31.<init>(r32, r33, r34, r35, r36, r37, r38)     // Catch:{ all -> 0x028e }
            r0.A03 = r4     // Catch:{ all -> 0x028e }
            X.0AY r3 = r0.A00     // Catch:{ all -> 0x028e }
            r4.CvS(r3)     // Catch:{ all -> 0x028e }
        L_0x0109:
            X.0Jk r0 = r0.A03     // Catch:{ all -> 0x028e }
            r0.CXo(r14, r8, r1)     // Catch:{ all -> 0x0290 }
            goto L_0x028c
        L_0x0110:
            r4 = -2
            int r3 = (r48 > r4 ? 1 : (r48 == r4 ? 0 : -1))
            if (r3 != 0) goto L_0x0198
            X.0Az r1 = r0.A01     // Catch:{ all -> 0x028e }
            if (r1 != 0) goto L_0x0194
            java.lang.String r4 = "Analytics-HighPri-Proc"
            r3 = 0
            android.content.Context r13 = r0.A06     // Catch:{ all -> 0x028e }
            X.0Af r2 = X.C02200Af.A00(r13)     // Catch:{ all -> 0x028e }
            java.lang.Class r12 = r0.A0J     // Catch:{ all -> 0x028e }
            java.lang.String r1 = r12.getName()     // Catch:{ all -> 0x028e }
            com.facebook.analytics2.logger.HandlerThreadFactory r1 = r2.A04(r1)     // Catch:{ all -> 0x028e }
            android.os.HandlerThread r33 = r1.AFM(r4, r3)     // Catch:{ all -> 0x028e }
            java.lang.Integer r38 = X.AnonymousClass006.A00     // Catch:{ all -> 0x028e }
            X.0Bu r11 = r0.A0G     // Catch:{ all -> 0x028e }
            r28 = 2131302291(0x7f091793, float:1.8222664E38)
            java.lang.String r27 = "high"
            X.0BP r10 = r0.A0B     // Catch:{ all -> 0x028e }
            X.0Ad r1 = r0.A0A     // Catch:{ all -> 0x028e }
            X.0AU r9 = new X.0AU     // Catch:{ all -> 0x028e }
            r9.<init>(r1)     // Catch:{ all -> 0x028e }
            X.0LI r8 = r0.A0I     // Catch:{ all -> 0x028e }
            java.lang.String r1 = "ads"
            X.0Ae r22 = r0.A00(r1)     // Catch:{ all -> 0x028e }
            X.0AH r7 = r0.A08     // Catch:{ all -> 0x028e }
            X.0CG r6 = r0.A0E     // Catch:{ all -> 0x028e }
            boolean r5 = r0.A0K     // Catch:{ all -> 0x028e }
            long r1 = r0.A05     // Catch:{ all -> 0x028e }
            int r4 = r0.A04     // Catch:{ all -> 0x028e }
            X.0AG r3 = r0.A07     // Catch:{ all -> 0x028e }
            X.0Aq r17 = new X.0Aq     // Catch:{ all -> 0x028e }
            r23 = r10
            r24 = r6
            r25 = r8
            r26 = r12
            r29 = r4
            r30 = r1
            r32 = r5
            r18 = r13
            r19 = r3
            r20 = r7
            r21 = r9
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r32)     // Catch:{ all -> 0x028e }
            X.0Ab r2 = r0.A09     // Catch:{ all -> 0x028e }
            X.0Az r1 = new X.0Az     // Catch:{ all -> 0x028e }
            r35 = r17
            r32 = r1
            r34 = r2
            r36 = r10
            r37 = r11
            r32.<init>(r33, r34, r35, r36, r37, r38)     // Catch:{ all -> 0x028e }
            r0.A01 = r1     // Catch:{ all -> 0x028e }
            X.0AY r3 = r0.A00     // Catch:{ all -> 0x028e }
            X.0Ay r2 = r1.A03     // Catch:{ all -> 0x028e }
            X.C02380Ay.A02(r2)     // Catch:{ all -> 0x028e }
            r1 = 3
            android.os.Message r1 = r2.obtainMessage(r1, r3)     // Catch:{ all -> 0x028e }
            r2.sendMessage(r1)     // Catch:{ all -> 0x028e }
        L_0x0194:
            X.0Az r0 = r0.A01     // Catch:{ all -> 0x028e }
            goto L_0x0219
        L_0x0198:
            X.0Az r1 = r0.A02     // Catch:{ all -> 0x028e }
            if (r1 != 0) goto L_0x0217
            java.lang.String r4 = "Analytics-NormalPri-Proc"
            r3 = 10
            android.content.Context r13 = r0.A06     // Catch:{ all -> 0x028e }
            X.0Af r2 = X.C02200Af.A00(r13)     // Catch:{ all -> 0x028e }
            java.lang.Class r12 = r0.A0J     // Catch:{ all -> 0x028e }
            java.lang.String r1 = r12.getName()     // Catch:{ all -> 0x028e }
            com.facebook.analytics2.logger.HandlerThreadFactory r1 = r2.A04(r1)     // Catch:{ all -> 0x028e }
            android.os.HandlerThread r33 = r1.AFM(r4, r3)     // Catch:{ all -> 0x028e }
            java.lang.Integer r38 = X.AnonymousClass006.A01     // Catch:{ all -> 0x028e }
            X.0Bu r11 = r0.A0H     // Catch:{ all -> 0x028e }
            r28 = 2131302293(0x7f091795, float:1.8222668E38)
            java.lang.String r27 = "normal"
            X.0BP r10 = r0.A0C     // Catch:{ all -> 0x028e }
            X.0Ad r1 = r0.A0A     // Catch:{ all -> 0x028e }
            X.0AU r9 = new X.0AU     // Catch:{ all -> 0x028e }
            r9.<init>(r1)     // Catch:{ all -> 0x028e }
            X.0LI r8 = r0.A0I     // Catch:{ all -> 0x028e }
            java.lang.String r1 = "regular"
            X.0Ae r22 = r0.A00(r1)     // Catch:{ all -> 0x028e }
            X.0AH r7 = r0.A08     // Catch:{ all -> 0x028e }
            X.0CG r6 = r0.A0F     // Catch:{ all -> 0x028e }
            boolean r5 = r0.A0K     // Catch:{ all -> 0x028e }
            long r1 = r0.A05     // Catch:{ all -> 0x028e }
            int r4 = r0.A04     // Catch:{ all -> 0x028e }
            X.0AG r3 = r0.A07     // Catch:{ all -> 0x028e }
            X.0Aq r17 = new X.0Aq     // Catch:{ all -> 0x028e }
            r23 = r10
            r24 = r6
            r25 = r8
            r26 = r12
            r29 = r4
            r30 = r1
            r32 = r5
            r18 = r13
            r19 = r3
            r20 = r7
            r21 = r9
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r32)     // Catch:{ all -> 0x028e }
            X.0Ab r2 = r0.A09     // Catch:{ all -> 0x028e }
            X.0Az r1 = new X.0Az     // Catch:{ all -> 0x028e }
            r35 = r17
            r32 = r1
            r34 = r2
            r36 = r10
            r37 = r11
            r32.<init>(r33, r34, r35, r36, r37, r38)     // Catch:{ all -> 0x028e }
            r0.A02 = r1     // Catch:{ all -> 0x028e }
            X.0AY r3 = r0.A00     // Catch:{ all -> 0x028e }
            X.0Ay r2 = r1.A03     // Catch:{ all -> 0x028e }
            X.C02380Ay.A02(r2)     // Catch:{ all -> 0x028e }
            r1 = 3
            android.os.Message r1 = r2.obtainMessage(r1, r3)     // Catch:{ all -> 0x028e }
            r2.sendMessage(r1)     // Catch:{ all -> 0x028e }
        L_0x0217:
            X.0Az r0 = r0.A02     // Catch:{ all -> 0x028e }
        L_0x0219:
            X.0Ay r5 = r0.A03     // Catch:{ all -> 0x0290 }
            X.0Az r0 = r5.A06     // Catch:{ all -> 0x0290 }
            X.0BP r2 = r0.A04     // Catch:{ all -> 0x0290 }
            boolean r0 = r2.AfZ()     // Catch:{ all -> 0x0290 }
            if (r0 == 0) goto L_0x0283
            java.lang.Object r4 = r5.A05     // Catch:{ all -> 0x0290 }
            monitor-enter(r4)     // Catch:{ all -> 0x0290 }
            X.0Ax r8 = r5.A01     // Catch:{ all -> 0x0280 }
            r7 = 1
            r6 = 0
            if (r8 == 0) goto L_0x023b
            boolean r0 = r8.A03     // Catch:{ all -> 0x0280 }
            if (r0 != 0) goto L_0x023b
            X.0KD[] r0 = r8.A04     // Catch:{ all -> 0x0280 }
            int r1 = r0.length     // Catch:{ all -> 0x0280 }
            int r0 = r8.A01     // Catch:{ all -> 0x0280 }
            if (r1 <= r0) goto L_0x023b
            r3 = 0
            goto L_0x0258
        L_0x023b:
            int r0 = r2.AQc()     // Catch:{ all -> 0x0280 }
            java.lang.Object r2 = X.C02370Ax.A06     // Catch:{ all -> 0x0280 }
            monitor-enter(r2)     // Catch:{ all -> 0x0280 }
            X.0Ax r8 = X.C02370Ax.A05     // Catch:{ all -> 0x0275 }
            if (r8 == 0) goto L_0x024f
            X.0Ax r0 = r8.A02     // Catch:{ all -> 0x0275 }
            X.C02370Ax.A05 = r0     // Catch:{ all -> 0x0275 }
            r0 = 0
            r8.A02 = r0     // Catch:{ all -> 0x0275 }
        L_0x024d:
            monitor-exit(r2)     // Catch:{ all -> 0x0275 }
            goto L_0x0255
        L_0x024f:
            X.0Ax r8 = new X.0Ax     // Catch:{ all -> 0x0275 }
            r8.<init>(r0)     // Catch:{ all -> 0x0275 }
            goto L_0x024d
        L_0x0255:
            r5.A01 = r8     // Catch:{ all -> 0x0280 }
            r3 = 1
        L_0x0258:
            boolean r0 = r8.A03     // Catch:{ all -> 0x0280 }
            if (r0 != 0) goto L_0x0278
            X.0KD[] r2 = r8.A04     // Catch:{ all -> 0x0280 }
            int r1 = r2.length     // Catch:{ all -> 0x0280 }
            int r0 = r8.A01     // Catch:{ all -> 0x0280 }
            if (r1 <= r0) goto L_0x0278
            r2[r0] = r46     // Catch:{ all -> 0x0280 }
            int r0 = r0 + 1
            r8.A01 = r0     // Catch:{ all -> 0x0280 }
            if (r3 == 0) goto L_0x0273
            r0 = 2
            android.os.Message r0 = r5.obtainMessage(r7, r0, r6, r8)     // Catch:{ all -> 0x0280 }
            r5.sendMessage(r0)     // Catch:{ all -> 0x0280 }
        L_0x0273:
            monitor-exit(r4)     // Catch:{ all -> 0x0280 }
            goto L_0x028c
        L_0x0275:
            r1 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0275 }
            goto L_0x027f
        L_0x0278:
            java.lang.String r0 = "Batch cannot accept more events"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0280 }
            r1.<init>(r0)     // Catch:{ all -> 0x0280 }
        L_0x027f:
            throw r1     // Catch:{ all -> 0x0280 }
        L_0x0280:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0280 }
            goto L_0x028f
        L_0x0283:
            r1 = 1
            r0 = 0
            android.os.Message r0 = r5.obtainMessage(r1, r1, r0, r14)     // Catch:{ all -> 0x0290 }
            r5.sendMessage(r0)     // Catch:{ all -> 0x0290 }
        L_0x028c:
            monitor-exit(r16)
            return
        L_0x028e:
            r0 = move-exception
        L_0x028f:
            throw r0     // Catch:{ all -> 0x0290 }
        L_0x0290:
            r0 = move-exception
            monitor-exit(r16)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C04430Np.CXo(X.0KD, java.lang.String, long):void");
    }

    public C04430Np(Context context, AnonymousClass0AG r4, AnonymousClass0AH r5, C02160Ab r6, C02180Ad r7, AnonymousClass0BP r8, AnonymousClass0BP r9, AnonymousClass0BQ r10, AnonymousClass0CG r11, AnonymousClass0CG r12, C02530Bu r13, C02530Bu r14, AnonymousClass0LI r15, Class cls, Class cls2, Class cls3, int i, long j, boolean z) {
        this.A06 = context;
        this.A0M = cls;
        this.A0H = r13;
        this.A0G = r14;
        this.A0L = cls2;
        this.A0J = cls3;
        this.A0A = r7;
        this.A0I = r15;
        this.A08 = r5;
        this.A0F = r11;
        this.A0E = r12;
        this.A0C = r8;
        this.A0B = r9;
        this.A0D = r10;
        this.A09 = r6;
        this.A0K = z;
        this.A05 = j;
        this.A04 = i;
        this.A07 = r4;
    }
}
