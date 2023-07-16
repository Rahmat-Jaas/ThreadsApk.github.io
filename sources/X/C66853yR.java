package X;

/* renamed from: X.3yR  reason: invalid class name and case insensitive filesystem */
public final class C66853yR implements C81854oV {
    public final /* synthetic */ C63113bW A00;
    public final /* synthetic */ C81854oV A01;
    public final /* synthetic */ C84684tg A02;

    public C66853yR(C63113bW r1, C81854oV r2, C84684tg r3) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0082, code lost:
        r5.Bex(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0085, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00e4, code lost:
        X.C63113bW.A03(r0, r2, r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00e7, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0191, code lost:
        X.C63113bW.A03(r0, r2, r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0194, code lost:
        throw r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01a9, code lost:
        r5.Bex(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01ac, code lost:
        throw r16;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void CFx(int r24) {
        /*
            r23 = this;
            java.lang.String r21 = "request_end"
            java.lang.String r12 = "request_start"
            java.lang.String r20 = "initial_content_step"
            java.lang.String r11 = "action_load_step"
            java.lang.String r10 = "Bloks Request Error."
            java.lang.String r9 = "stream_on_load_actions_end"
            java.lang.String r8 = "stream_on_load_actions_start"
            java.lang.String r7 = "render_load_action_start"
            java.lang.String r6 = "render_data_end"
            java.lang.String r5 = "render_end"
            java.lang.String r4 = "render_start"
            java.lang.String r19 = "initial_render_data_end"
            java.lang.String r3 = "initial_render_end"
            java.lang.String r2 = "initial_render_start"
            java.lang.String r14 = "Fetch summary is missing."
            r17 = 0
            r13 = r23
            r22 = r24
            X.4oV r1 = r13.A01     // Catch:{ all -> 0x00e8 }
            r0 = r22
            r1.CFx(r0)     // Catch:{ all -> 0x00e8 }
            X.3bW r0 = r13.A00
            java.util.concurrent.atomic.AtomicReference r1 = r0.A09
            java.lang.Object r15 = r1.get()
            if (r15 == 0) goto L_0x0183
            X.3SZ r15 = (X.AnonymousClass3SZ) r15
            int r1 = r15.A00
            X.3Ci r14 = r15.A01
            switch(r24) {
                case 1: goto L_0x003f;
                case 2: goto L_0x0046;
                case 3: goto L_0x009d;
                case 4: goto L_0x0069;
                case 5: goto L_0x00cb;
                case 6: goto L_0x004d;
                case 7: goto L_0x0086;
                case 8: goto L_0x003e;
                case 9: goto L_0x00db;
                case 10: goto L_0x003e;
                case 11: goto L_0x0054;
                case 12: goto L_0x005b;
                case 13: goto L_0x0062;
                default: goto L_0x003e;
            }
        L_0x003e:
            return
        L_0x003f:
            X.4tg r5 = r13.A02
            java.lang.String r0 = X.C63113bW.A02(r2, r1)
            goto L_0x0082
        L_0x0046:
            X.4tg r5 = r13.A02
            java.lang.String r0 = X.C63113bW.A02(r3, r1)
            goto L_0x0082
        L_0x004d:
            X.4tg r5 = r13.A02
            java.lang.String r0 = X.C63113bW.A02(r4, r1)
            goto L_0x0082
        L_0x0054:
            X.4tg r5 = r13.A02
            java.lang.String r0 = X.C63113bW.A02(r7, r1)
            goto L_0x0082
        L_0x005b:
            X.4tg r5 = r13.A02
            java.lang.String r0 = X.C63113bW.A02(r8, r1)
            goto L_0x0082
        L_0x0062:
            X.4tg r5 = r13.A02
            java.lang.String r0 = X.C63113bW.A02(r9, r1)
            goto L_0x0082
        L_0x0069:
            boolean r0 = r14.A05
            if (r0 == 0) goto L_0x003e
            long r2 = r14.A04
            int r0 = (r2 > r17 ? 1 : (r2 == r17 ? 0 : -1))
            if (r0 <= 0) goto L_0x003e
            X.4tg r5 = r13.A02
            java.lang.String r0 = X.C63113bW.A02(r12, r1)
            r5.Bey(r0, r2)
            r0 = r21
            java.lang.String r0 = X.C63113bW.A02(r0, r1)
        L_0x0082:
            r5.Bex(r0)
            return
        L_0x0086:
            X.4tg r2 = r13.A02
            java.lang.String r1 = X.C63113bW.A02(r5, r1)
            r2.Bex(r1)
            java.util.concurrent.atomic.AtomicReference r1 = r0.A0A
            java.lang.Object r1 = r1.get()
            boolean r1 = r1 instanceof X.AnonymousClass1jZ
            if (r1 == 0) goto L_0x003e
            r2.Cvv(r11)
            goto L_0x00e4
        L_0x009d:
            X.4tg r3 = r13.A02
            r2 = r19
            java.lang.String r1 = X.C63113bW.A02(r2, r1)
            r3.Bex(r1)
            X.4sv r1 = r0.A01
            if (r1 != 0) goto L_0x00ba
            long r4 = r14.A02
            X.4ob r1 = r0.A06
            long r8 = r1.now()
            r7 = 1
            java.lang.String r6 = "bloks_query"
            r3.ABT(r4, r6, r7, r8)
        L_0x00ba:
            X.3yQ r1 = r0.A05
            java.lang.String r0 = r1.A08
            if (r0 == 0) goto L_0x00c5
            boolean r0 = r1.A0G
            if (r0 != 0) goto L_0x00c5
            return
        L_0x00c5:
            r0 = r20
            r3.Cvv(r0)
            return
        L_0x00cb:
            java.lang.Throwable r0 = r0.A05()
            if (r0 == 0) goto L_0x00d5
            java.lang.String r10 = r0.getMessage()
        L_0x00d5:
            X.4tg r0 = r13.A02
            r0.ALz(r10)
            return
        L_0x00db:
            X.4tg r2 = r13.A02
            java.lang.String r1 = X.C63113bW.A02(r6, r1)
            r2.Bex(r1)
        L_0x00e4:
            X.C63113bW.A03(r0, r2, r15)
            return
        L_0x00e8:
            r16 = move-exception
            X.3bW r0 = r13.A00
            java.util.concurrent.atomic.AtomicReference r1 = r0.A09
            java.lang.Object r15 = r1.get()
            if (r15 == 0) goto L_0x01ad
            X.3SZ r15 = (X.AnonymousClass3SZ) r15
            int r1 = r15.A00
            X.3Ci r14 = r15.A01
            switch(r24) {
                case 1: goto L_0x00fd;
                case 2: goto L_0x0105;
                case 3: goto L_0x010d;
                case 4: goto L_0x013b;
                case 5: goto L_0x0155;
                case 6: goto L_0x0165;
                case 7: goto L_0x016c;
                case 8: goto L_0x00fc;
                case 9: goto L_0x0188;
                case 10: goto L_0x00fc;
                case 11: goto L_0x0195;
                case 12: goto L_0x019c;
                case 13: goto L_0x01a3;
                default: goto L_0x00fc;
            }
        L_0x00fc:
            throw r16
        L_0x00fd:
            X.4tg r5 = r13.A02
            java.lang.String r0 = X.C63113bW.A02(r2, r1)
            goto L_0x01a9
        L_0x0105:
            X.4tg r5 = r13.A02
            java.lang.String r0 = X.C63113bW.A02(r3, r1)
            goto L_0x01a9
        L_0x010d:
            X.4tg r3 = r13.A02
            r2 = r19
            java.lang.String r1 = X.C63113bW.A02(r2, r1)
            r3.Bex(r1)
            X.4sv r1 = r0.A01
            if (r1 != 0) goto L_0x012a
            long r4 = r14.A02
            X.4ob r1 = r0.A06
            long r8 = r1.now()
            r7 = 1
            java.lang.String r6 = "bloks_query"
            r3.ABT(r4, r6, r7, r8)
        L_0x012a:
            X.3yQ r1 = r0.A05
            java.lang.String r0 = r1.A08
            if (r0 == 0) goto L_0x0135
            boolean r0 = r1.A0G
            if (r0 != 0) goto L_0x0135
            throw r16
        L_0x0135:
            r0 = r20
            r3.Cvv(r0)
            throw r16
        L_0x013b:
            boolean r0 = r14.A05
            if (r0 == 0) goto L_0x0187
            long r2 = r14.A04
            int r0 = (r2 > r17 ? 1 : (r2 == r17 ? 0 : -1))
            if (r0 <= 0) goto L_0x0187
            X.4tg r5 = r13.A02
            java.lang.String r0 = X.C63113bW.A02(r12, r1)
            r5.Bey(r0, r2)
            r0 = r21
            java.lang.String r0 = X.C63113bW.A02(r0, r1)
            goto L_0x01a9
        L_0x0155:
            java.lang.Throwable r0 = r0.A05()
            if (r0 == 0) goto L_0x015f
            java.lang.String r10 = r0.getMessage()
        L_0x015f:
            X.4tg r0 = r13.A02
            r0.ALz(r10)
            throw r16
        L_0x0165:
            X.4tg r5 = r13.A02
            java.lang.String r0 = X.C63113bW.A02(r4, r1)
            goto L_0x01a9
        L_0x016c:
            X.4tg r2 = r13.A02
            java.lang.String r1 = X.C63113bW.A02(r5, r1)
            r2.Bex(r1)
            java.util.concurrent.atomic.AtomicReference r1 = r0.A0A
            java.lang.Object r1 = r1.get()
            boolean r1 = r1 instanceof X.AnonymousClass1jZ
            if (r1 == 0) goto L_0x0187
            r2.Cvv(r11)
            goto L_0x0191
        L_0x0183:
            java.lang.IllegalArgumentException r16 = X.C18190wL.A0a(r14)
        L_0x0187:
            throw r16
        L_0x0188:
            X.4tg r2 = r13.A02
            java.lang.String r1 = X.C63113bW.A02(r6, r1)
            r2.Bex(r1)
        L_0x0191:
            X.C63113bW.A03(r0, r2, r15)
            throw r16
        L_0x0195:
            X.4tg r5 = r13.A02
            java.lang.String r0 = X.C63113bW.A02(r7, r1)
            goto L_0x01a9
        L_0x019c:
            X.4tg r5 = r13.A02
            java.lang.String r0 = X.C63113bW.A02(r8, r1)
            goto L_0x01a9
        L_0x01a3:
            X.4tg r5 = r13.A02
            java.lang.String r0 = X.C63113bW.A02(r9, r1)
        L_0x01a9:
            r5.Bex(r0)
            throw r16
        L_0x01ad:
            java.lang.IllegalArgumentException r0 = X.C18190wL.A0a(r14)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66853yR.CFx(int):void");
    }
}
