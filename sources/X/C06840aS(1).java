package X;

/* renamed from: X.0aS  reason: invalid class name and case insensitive filesystem */
public final class C06840aS implements C03170Es {
    public final /* synthetic */ AnonymousClass0NA A00;
    public final /* synthetic */ AnonymousClass0Q4 A01;

    public C06840aS(AnonymousClass0NA r1, AnonymousClass0Q4 r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00c9, code lost:
        if (r2 == false) goto L_0x00d8;
     */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00e8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void BnV(X.C016507v r36) {
        /*
            r35 = this;
            r0 = r35
            X.0NA r6 = r0.A00
            X.0Q4 r1 = r0.A01
            java.lang.String r28 = "<not set>"
            java.lang.String r27 = ", but should be waiting"
            boolean r0 = X.AnonymousClass0PE.A05
            r5 = 1
            r21 = 0
            r3 = r36
            if (r0 != 0) goto L_0x0020
            X.0K9 r4 = X.AnonymousClass0PE.A07
            java.lang.Object[] r2 = new java.lang.Object[]{r3}
            java.lang.String r0 = "We received a hooked handler on pause call when we are not supposed to be hooked. Marking it on.\n Info: %s"
            r4.A07(r0, r2)
            X.AnonymousClass0PE.A05 = r5
        L_0x0020:
            X.012 r0 = X.AnonymousClass012.A07
            X.012 r4 = r3.A0D
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x00ef
            boolean r0 = X.AnonymousClass0PE.A04
            long r30 = android.os.SystemClock.uptimeMillis()
            long r32 = java.lang.System.currentTimeMillis()
            r19 = -2
            if (r0 == 0) goto L_0x00db
            X.0K9 r4 = X.AnonymousClass0PE.A07     // Catch:{ 0F9 | ClassCastException -> 0x00b9, all -> 0x00d6 }
            java.lang.Long r23 = java.lang.Long.valueOf(r30)     // Catch:{ 0F9 | ClassCastException -> 0x00b9, all -> 0x00d6 }
            java.lang.Long r26 = java.lang.Long.valueOf(r32)     // Catch:{ 0F9 | ClassCastException -> 0x00b9, all -> 0x00d6 }
            r5 = r3
            X.0QT r5 = (X.AnonymousClass0QT) r5     // Catch:{ 0F9 | ClassCastException -> 0x00b9, all -> 0x00d6 }
            r5.A02()     // Catch:{ 0F9 | ClassCastException -> 0x00b9, all -> 0x00d6 }
            boolean r2 = r5.A03     // Catch:{ 0F9 | ClassCastException -> 0x00b9, all -> 0x00d6 }
            long r17 = X.AnonymousClass0PE.A01     // Catch:{ 0F9 | ClassCastException -> 0x00b9, all -> 0x00d6 }
            long r15 = X.AnonymousClass0PE.A00     // Catch:{ 0F9 | ClassCastException -> 0x00b9, all -> 0x00d6 }
            X.AnonymousClass0PE.A01 = r19     // Catch:{ 0F9 | ClassCastException -> 0x00b9, all -> 0x00d6 }
            X.AnonymousClass0PE.A00 = r19     // Catch:{ 0F9 | ClassCastException -> 0x00b9, all -> 0x00d6 }
            long r13 = X.AnonymousClass0PE.A03     // Catch:{ 0F9 | ClassCastException -> 0x00b9, all -> 0x00d6 }
            long r11 = X.AnonymousClass0PE.A02     // Catch:{ 0F9 | ClassCastException -> 0x00b9, all -> 0x00d6 }
            r9 = 0
            r7 = -6
            int r0 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
            if (r0 != 0) goto L_0x0084
            int r0 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r0 != 0) goto L_0x0084
            int r0 = (r17 > r9 ? 1 : (r17 == r9 ? 0 : -1))
            if (r0 <= 0) goto L_0x0084
            int r0 = (r15 > r9 ? 1 : (r15 == r9 ? 0 : -1))
            if (r0 <= 0) goto L_0x0084
            r6.CAR(r5)     // Catch:{ 0F9 | ClassCastException -> 0x0081, all -> 0x007e }
            X.0Xk r1 = r1.A03     // Catch:{ 0F9 | ClassCastException -> 0x0081, all -> 0x007e }
            java.lang.String r0 = "Did you call SessionManager.init()?"
            X.C002801h.A02(r1, r0)     // Catch:{ 0F9 | ClassCastException -> 0x0081, all -> 0x007e }
            r29 = r1
            r34 = r2
            r29.A07(r30, r32, r34)     // Catch:{ 0F9 | ClassCastException -> 0x0081, all -> 0x007e }
            X.AnonymousClass0PE.A03 = r30
            goto L_0x00ea
        L_0x007e:
            r0 = move-exception
            r2 = 1
            goto L_0x00cb
        L_0x0081:
            r4 = move-exception
            r2 = 1
            goto L_0x00bb
        L_0x0084:
            java.lang.String r2 = "We received an unexpected on pause (info type:  %s) handler callback.\n\tGot current handler hook rel time as %d ms%s and previous rel binder hook time of %s ms.\n\tGot current handler hook abs time as %d ms%s and previous abs binder hook time of %s ms\n Info: %s"
            X.012 r0 = r5.A0D     // Catch:{ 0F9 | ClassCastException -> 0x00b9, all -> 0x00d6 }
            java.lang.String r1 = r0.A03     // Catch:{ 0F9 | ClassCastException -> 0x00b9, all -> 0x00d6 }
            int r0 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
            if (r0 == 0) goto L_0x008f
            goto L_0x0092
        L_0x008f:
            java.lang.String r24 = ""
            goto L_0x0094
        L_0x0092:
            r24 = r27
        L_0x0094:
            int r0 = (r17 > r9 ? 1 : (r17 == r9 ? 0 : -1))
            if (r0 <= 0) goto L_0x009d
            java.lang.String r25 = java.lang.Long.toString(r17)     // Catch:{ 0F9 | ClassCastException -> 0x00b9, all -> 0x00d6 }
            goto L_0x009f
        L_0x009d:
            r25 = r28
        L_0x009f:
            int r0 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r0 != 0) goto L_0x00a5
            java.lang.String r27 = ""
        L_0x00a5:
            int r0 = (r15 > r9 ? 1 : (r15 == r9 ? 0 : -1))
            if (r0 <= 0) goto L_0x00ad
            java.lang.String r28 = java.lang.Long.toString(r15)     // Catch:{ 0F9 | ClassCastException -> 0x00b9, all -> 0x00d6 }
        L_0x00ad:
            r22 = r1
            r29 = r5
            java.lang.Object[] r0 = new java.lang.Object[]{r22, r23, r24, r25, r26, r27, r28, r29}     // Catch:{ 0F9 | ClassCastException -> 0x00b9, all -> 0x00d6 }
            r4.A07(r2, r0)     // Catch:{ 0F9 | ClassCastException -> 0x00b9, all -> 0x00d6 }
            goto L_0x00db
        L_0x00b9:
            r4 = move-exception
            r2 = 0
        L_0x00bb:
            X.C04790Pd.A00()     // Catch:{ all -> 0x00c8 }
            java.lang.String r1 = "Failed to parse handler info given to on pause. Info: %s"
            java.lang.Object[] r0 = new java.lang.Object[]{r3}     // Catch:{ all -> 0x00c8 }
            X.AnonymousClass0PE.A00(r4, r1, r0)     // Catch:{ all -> 0x00c8 }
            goto L_0x00e0
        L_0x00c8:
            r0 = move-exception
            if (r2 == 0) goto L_0x00d8
        L_0x00cb:
            X.AnonymousClass0PE.A03 = r30
            if (r2 != 0) goto L_0x00d1
            r32 = -2
        L_0x00d1:
            X.AnonymousClass0PE.A02 = r32
            X.AnonymousClass0PE.A06 = r21
            throw r0
        L_0x00d6:
            r0 = move-exception
            r2 = 0
        L_0x00d8:
            r30 = -2
            goto L_0x00cb
        L_0x00db:
            X.AnonymousClass0PE.A03 = r19
            X.AnonymousClass0PE.A02 = r19
            goto L_0x00ec
        L_0x00e0:
            if (r2 != 0) goto L_0x00e4
            r30 = -2
        L_0x00e4:
            X.AnonymousClass0PE.A03 = r30
            if (r2 != 0) goto L_0x00ea
            r32 = -2
        L_0x00ea:
            X.AnonymousClass0PE.A02 = r32
        L_0x00ec:
            X.AnonymousClass0PE.A06 = r21
            return
        L_0x00ef:
            X.0K9 r2 = X.AnonymousClass0PE.A07
            java.lang.String r0 = r4.A03
            java.lang.Object[] r1 = new java.lang.Object[]{r0, r4, r3}
            java.lang.String r0 = "Got handler info from the wrong Activity lifecycle state %s (expected on pause). \n\t State: %s \n\t \n\t Info: %s"
            r2.A07(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C06840aS.BnV(X.07v):void");
    }
}
