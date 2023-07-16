package X;

import android.os.HandlerThread;

/* renamed from: X.0Jk  reason: invalid class name */
public final class AnonymousClass0Jk implements AnonymousClass0A9 {
    public AnonymousClass0BR A00;
    public AnonymousClass0BR A01;
    public final AnonymousClass0BP A02;
    public final AnonymousClass0BQ A03;
    public final AnonymousClass0BS A04;
    public final AnonymousClass0BU A05;
    public final C02530Bu A06;
    public final C02530Bu A07;

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0052, code lost:
        r14 = r9.A08;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0059, code lost:
        r11 = r9.A09;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void CXo(X.AnonymousClass0KD r17, java.lang.String r18, long r19) {
        /*
            r16 = this;
            r0 = r16
            X.0BU r5 = r0.A05
            X.0Jk r2 = r5.A05
            X.0BP r0 = r2.A02
            boolean r0 = r0.AfZ()
            r3 = r19
            r13 = r17
            if (r0 == 0) goto L_0x009d
            java.lang.Object r7 = r5.A04
            monitor-enter(r7)
            X.0BT r9 = r5.A01     // Catch:{ all -> 0x009a }
            r8 = 1
            r6 = 0
            if (r9 == 0) goto L_0x002f
            boolean r0 = r9.A05     // Catch:{ all -> 0x009a }
            if (r0 != 0) goto L_0x002f
            X.0KD[] r0 = r9.A08     // Catch:{ all -> 0x009a }
            int r1 = r0.length     // Catch:{ all -> 0x009a }
            int r0 = r9.A02     // Catch:{ all -> 0x009a }
            if (r1 <= r0) goto L_0x002f
            X.0KD[] r0 = r9.A09     // Catch:{ all -> 0x009a }
            int r1 = r0.length     // Catch:{ all -> 0x009a }
            int r0 = r9.A01     // Catch:{ all -> 0x009a }
            if (r1 <= r0) goto L_0x002f
            r15 = 0
            goto L_0x004e
        L_0x002f:
            X.0BQ r0 = r2.A03     // Catch:{ all -> 0x009a }
            int r0 = r0.A8I()     // Catch:{ all -> 0x009a }
            java.lang.Object r2 = X.AnonymousClass0BT.A0B     // Catch:{ all -> 0x009a }
            monitor-enter(r2)     // Catch:{ all -> 0x009a }
            X.0BT r9 = X.AnonymousClass0BT.A0A     // Catch:{ all -> 0x008f }
            if (r9 == 0) goto L_0x0045
            X.0BT r0 = r9.A03     // Catch:{ all -> 0x008f }
            X.AnonymousClass0BT.A0A = r0     // Catch:{ all -> 0x008f }
            r0 = 0
            r9.A03 = r0     // Catch:{ all -> 0x008f }
        L_0x0043:
            monitor-exit(r2)     // Catch:{ all -> 0x008f }
            goto L_0x004b
        L_0x0045:
            X.0BT r9 = new X.0BT     // Catch:{ all -> 0x008f }
            r9.<init>(r0)     // Catch:{ all -> 0x008f }
            goto L_0x0043
        L_0x004b:
            r5.A01 = r9     // Catch:{ all -> 0x009a }
            r15 = 1
        L_0x004e:
            boolean r0 = r9.A05     // Catch:{ all -> 0x009a }
            if (r0 != 0) goto L_0x0092
            X.0KD[] r14 = r9.A08     // Catch:{ all -> 0x009a }
            int r0 = r14.length     // Catch:{ all -> 0x009a }
            int r12 = r9.A02     // Catch:{ all -> 0x009a }
            if (r0 <= r12) goto L_0x0092
            X.0KD[] r11 = r9.A09     // Catch:{ all -> 0x009a }
            int r0 = r11.length     // Catch:{ all -> 0x009a }
            int r10 = r9.A01     // Catch:{ all -> 0x009a }
            if (r0 <= r10) goto L_0x0092
            r1 = -2
            int r0 = (r19 > r1 ? 1 : (r19 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0077
            r1 = -4
            int r0 = (r19 > r1 ? 1 : (r19 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0077
            r14[r12] = r17     // Catch:{ all -> 0x009a }
            long[] r0 = r9.A07     // Catch:{ all -> 0x009a }
            r0[r12] = r19     // Catch:{ all -> 0x009a }
            int r0 = r12 + 1
            r9.A02 = r0     // Catch:{ all -> 0x009a }
            goto L_0x0083
        L_0x0077:
            r11[r10] = r17     // Catch:{ all -> 0x009a }
            long[] r0 = r9.A06     // Catch:{ all -> 0x009a }
            r0[r10] = r19     // Catch:{ all -> 0x009a }
            int r0 = r10 + 1
            r9.A01 = r0     // Catch:{ all -> 0x009a }
            r9.A04 = r8     // Catch:{ all -> 0x009a }
        L_0x0083:
            if (r15 == 0) goto L_0x008d
            r0 = 2
            android.os.Message r0 = r5.obtainMessage(r8, r0, r6, r9)     // Catch:{ all -> 0x009a }
            r5.sendMessage(r0)     // Catch:{ all -> 0x009a }
        L_0x008d:
            monitor-exit(r7)     // Catch:{ all -> 0x009a }
            return
        L_0x008f:
            r1 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x008f }
            goto L_0x0099
        L_0x0092:
            java.lang.String r0 = "Batch cannot accept more events"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x009a }
            r1.<init>(r0)     // Catch:{ all -> 0x009a }
        L_0x0099:
            throw r1     // Catch:{ all -> 0x009a }
        L_0x009a:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x009a }
            throw r0
        L_0x009d:
            X.0Av r2 = new X.0Av
            r2.<init>(r13, r3)
            r1 = 1
            r0 = 0
            android.os.Message r0 = r5.obtainMessage(r1, r1, r0, r2)
            r5.sendMessage(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0Jk.CXo(X.0KD, java.lang.String, long):void");
    }

    public final void CvS(AnonymousClass0AY r3) {
        AnonymousClass0BU r1 = this.A05;
        AnonymousClass0BU.A02(r1);
        r1.sendMessage(r1.obtainMessage(3, r3));
    }

    public final void D7i() {
        AnonymousClass0BU r1 = this.A05;
        AnonymousClass0BU.A02(r1);
        r1.sendMessage(r1.obtainMessage(9));
    }

    public AnonymousClass0Jk(HandlerThread handlerThread, C02160Ab r4, AnonymousClass0BP r5, AnonymousClass0BQ r6, AnonymousClass0BS r7, C02530Bu r8, C02530Bu r9) {
        this.A05 = new AnonymousClass0BU(handlerThread.getLooper(), r4, this);
        this.A07 = r8;
        this.A06 = r9;
        this.A04 = r7;
        this.A02 = r5;
        this.A03 = r6;
    }
}
