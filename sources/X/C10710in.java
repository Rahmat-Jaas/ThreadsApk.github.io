package X;

/* renamed from: X.0in  reason: invalid class name and case insensitive filesystem */
public final class C10710in {
    public final MIS A00 = C18987Aon.A00;
    public final C10740ir A01;

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00ad, code lost:
        if (r0.equals(r1) != false) goto L_0x00af;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:81:0x01cf */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00e2 A[Catch:{ all -> 0x01cb, all -> 0x01cf, IOException -> 0x01d0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00ea A[Catch:{ all -> 0x01cb, all -> 0x01cf, IOException -> 0x01d0 }] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:76:0x01c7=Splitter:B:76:0x01c7, B:81:0x01cf=Splitter:B:81:0x01cf} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(java.io.InputStream r28) {
        /*
            r27 = this;
            r15 = 1
            boolean r0 = com.facebook.systrace.Systrace.A0F(r15)
            if (r0 == 0) goto L_0x0010
            r1 = 1020063669(0x3cccefb5, float:0.025016645)
            java.lang.String r0 = "onSessionUploaded"
            X.C13930oX.A01(r0, r1)
        L_0x0010:
            r2 = r27
            X.MIS r0 = r2.A00     // Catch:{ IOException -> 0x01eb }
            r1 = r28
            X.MMo r0 = r0.A07(r1)     // Catch:{ IOException -> 0x01eb }
            r0.A0g()     // Catch:{ IOException -> 0x01eb }
            X.0jp r1 = X.C11220jk.parseFromJson(r0)     // Catch:{ IOException -> 0x01eb }
            if (r1 == 0) goto L_0x01e1
            java.lang.String r3 = r1.A05     // Catch:{ IOException -> 0x01eb }
            if (r3 == 0) goto L_0x01e1
            boolean r0 = r3.isEmpty()     // Catch:{ IOException -> 0x01eb }
            if (r0 != 0) goto L_0x01e1
            X.0ir r2 = r2.A01     // Catch:{ IOException -> 0x01eb }
            java.util.Map r5 = r1.A07     // Catch:{ IOException -> 0x01eb }
            java.util.Set r4 = r1.A08     // Catch:{ IOException -> 0x01eb }
            java.lang.String r14 = r1.A06     // Catch:{ IOException -> 0x01eb }
            X.0jj r1 = r1.A04     // Catch:{ IOException -> 0x01eb }
            X.0io r0 = X.C10740ir.A02(r2)     // Catch:{ IOException -> 0x01eb }
            r0.A04(r3, r14, r5, r4)     // Catch:{ IOException -> 0x01eb }
            if (r1 == 0) goto L_0x01db
            X.0ns r0 = r2.A03     // Catch:{ IOException -> 0x01eb }
            if (r0 == 0) goto L_0x01db
            X.0ns r13 = r2.A03     // Catch:{ IOException -> 0x01eb }
            r0 = 1
            X.C04220Ms.A0B(r14, r0)     // Catch:{ IOException -> 0x01eb }
            java.lang.String r12 = r1.A00     // Catch:{ IOException -> 0x01eb }
            X.03R r9 = r13.A01     // Catch:{ IOException -> 0x01eb }
            java.util.concurrent.atomic.AtomicReference r10 = r9.A08     // Catch:{ IOException -> 0x01eb }
            java.lang.Object r0 = r10.get()     // Catch:{ IOException -> 0x01eb }
            X.0vu r0 = (X.C18000vu) r0     // Catch:{ IOException -> 0x01eb }
            if (r0 != 0) goto L_0x0071
            java.lang.String r0 = ""
        L_0x005a:
            boolean r0 = X.C04220Ms.A0I(r0, r12)     // Catch:{ IOException -> 0x01eb }
            if (r0 != 0) goto L_0x01db
            java.lang.String r11 = r1.A07     // Catch:{ IOException -> 0x01eb }
            java.lang.String r8 = r1.A05     // Catch:{ IOException -> 0x01eb }
            java.lang.String r7 = r1.A06     // Catch:{ IOException -> 0x01eb }
            java.lang.String r6 = r1.A03     // Catch:{ IOException -> 0x01eb }
            java.lang.String r3 = r1.A04     // Catch:{ IOException -> 0x01eb }
            java.lang.String r2 = r1.A02     // Catch:{ IOException -> 0x01eb }
            java.lang.String r1 = r1.A01     // Catch:{ IOException -> 0x01eb }
            if (r11 == 0) goto L_0x01db
            goto L_0x0074
        L_0x0071:
            java.lang.String r0 = r0.A05     // Catch:{ IOException -> 0x01eb }
            goto L_0x005a
        L_0x0074:
            if (r8 == 0) goto L_0x01db
            if (r6 == 0) goto L_0x01db
            if (r3 == 0) goto L_0x01db
            if (r12 == 0) goto L_0x01db
            if (r2 == 0) goto L_0x01db
            if (r7 != 0) goto L_0x0082
            java.lang.String r7 = "{}"
        L_0x0082:
            X.0vw r0 = r13.A00     // Catch:{ IOException -> 0x01eb }
            r21 = r6
            r22 = r3
            r23 = r2
            r24 = r12
            r25 = r14
            r26 = r1
            r19 = r8
            r20 = r7
            r17 = r0
            r18 = r11
            X.0vu r2 = r17.A0A(r18, r19, r20, r21, r22, r23, r24, r25, r26)     // Catch:{ IOException -> 0x01eb }
            if (r2 == 0) goto L_0x01db
            X.0oW r0 = r9.A03     // Catch:{ IOException -> 0x01eb }
            java.lang.String r0 = r0.A00     // Catch:{ IOException -> 0x01eb }
            java.lang.String r1 = r2.A06     // Catch:{ IOException -> 0x01eb }
            if (r0 != 0) goto L_0x00a9
            if (r1 != 0) goto L_0x00b2
            goto L_0x00af
        L_0x00a9:
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x01eb }
            if (r0 == 0) goto L_0x00b2
        L_0x00af:
            r10.set(r2)     // Catch:{ IOException -> 0x01eb }
        L_0x00b2:
            X.0Kl r3 = r9.A00     // Catch:{ IOException -> 0x01eb }
            r3.nowNanos()     // Catch:{ IOException -> 0x01eb }
            X.0Oe r0 = r9.A09     // Catch:{ IOException -> 0x01eb }
            java.lang.Object r7 = r0.get()     // Catch:{ IOException -> 0x01eb }
            X.0lG r7 = (X.C12070lG) r7     // Catch:{ IOException -> 0x01eb }
            java.lang.String r11 = X.C18000vu.A00(r1)     // Catch:{ IOException -> 0x01eb }
            android.content.Context r1 = r7.A00     // Catch:{ IOException -> 0x01d0 }
            r0 = 1045170971(0x3e4c0b1b, float:0.19926111)
            java.io.File r1 = X.C14630pr.A00(r1, r0)     // Catch:{ IOException -> 0x01d0 }
            r1.mkdirs()     // Catch:{ IOException -> 0x01d0 }
            java.lang.String r0 = "qpl_sampling_config_v2.tmp"
            java.io.File r8 = new java.io.File     // Catch:{ IOException -> 0x01d0 }
            r8.<init>(r1, r0)     // Catch:{ IOException -> 0x01d0 }
            boolean r0 = r1.exists()     // Catch:{ IOException -> 0x01d0 }
            if (r0 != 0) goto L_0x00ea
            boolean r0 = r1.mkdirs()     // Catch:{ IOException -> 0x01d0 }
            if (r0 != 0) goto L_0x00ea
            java.lang.String r1 = "Failed to create storage dir"
            java.io.IOException r0 = new java.io.IOException     // Catch:{ IOException -> 0x01d0 }
            r0.<init>(r1)     // Catch:{ IOException -> 0x01d0 }
            throw r0     // Catch:{ IOException -> 0x01d0 }
        L_0x00ea:
            X.0vm r6 = new X.0vm     // Catch:{ IOException -> 0x01d0 }
            r9 = r8
            r10 = r1
            r6.<init>(r7, r8, r9, r10, r11)     // Catch:{ IOException -> 0x01d0 }
            java.io.BufferedOutputStream r0 = new java.io.BufferedOutputStream     // Catch:{ IOException -> 0x01d0 }
            r0.<init>(r6)     // Catch:{ IOException -> 0x01d0 }
            java.io.ObjectOutputStream r8 = new java.io.ObjectOutputStream     // Catch:{ IOException -> 0x01d0 }
            r8.<init>(r0)     // Catch:{ IOException -> 0x01d0 }
            r0 = 7
            r8.writeInt(r0)     // Catch:{ all -> 0x01cb }
            java.lang.String r0 = r2.A05     // Catch:{ all -> 0x01cb }
            r8.writeUTF(r0)     // Catch:{ all -> 0x01cb }
            X.0vr r1 = r2.A02     // Catch:{ all -> 0x01cb }
            int r0 = r1.A00     // Catch:{ all -> 0x01cb }
            r8.writeInt(r0)     // Catch:{ all -> 0x01cb }
            X.0Ow r0 = r1.A03     // Catch:{ all -> 0x01cb }
            X.C17970vr.A02(r0, r8)     // Catch:{ all -> 0x01cb }
            X.0Ow r0 = r1.A02     // Catch:{ all -> 0x01cb }
            X.C17970vr.A02(r0, r8)     // Catch:{ all -> 0x01cb }
            X.0Ow r0 = r1.A01     // Catch:{ all -> 0x01cb }
            X.C17970vr.A02(r0, r8)     // Catch:{ all -> 0x01cb }
            X.0vq r0 = r2.A01     // Catch:{ all -> 0x01cb }
            if (r0 != 0) goto L_0x0184
            r0 = 0
            r8.writeByte(r0)     // Catch:{ all -> 0x01cb }
        L_0x0122:
            X.0vt r0 = r2.A03     // Catch:{ all -> 0x01cb }
            r9 = 0
            if (r0 != 0) goto L_0x0133
            r8.writeInt(r9)     // Catch:{ all -> 0x01cb }
        L_0x012a:
            X.0vp r0 = r2.A00     // Catch:{ all -> 0x01cb }
            int[] r7 = r0.A00     // Catch:{ all -> 0x01cb }
            int r6 = r7.length     // Catch:{ all -> 0x01cb }
            r8.writeInt(r6)     // Catch:{ all -> 0x01cb }
            goto L_0x0188
        L_0x0133:
            X.0Jz r7 = r0.A00     // Catch:{ all -> 0x01cb }
            int r0 = r7.size()     // Catch:{ all -> 0x01cb }
            r8.writeInt(r0)     // Catch:{ all -> 0x01cb }
        L_0x013c:
            int r0 = r7.size()     // Catch:{ all -> 0x01cb }
            if (r9 >= r0) goto L_0x012a
            int r0 = r7.keyAt(r9)     // Catch:{ all -> 0x01cb }
            java.lang.Object r1 = r7.valueAt(r9)     // Catch:{ all -> 0x01cb }
            X.0vs r1 = (X.C17980vs) r1     // Catch:{ all -> 0x01cb }
            r8.writeInt(r0)     // Catch:{ all -> 0x01cb }
            int r0 = r1.size()     // Catch:{ all -> 0x01cb }
            r8.writeInt(r0)     // Catch:{ all -> 0x01cb }
            java.util.Set r0 = r1.entrySet()     // Catch:{ all -> 0x01cb }
            java.util.Iterator r6 = r0.iterator()     // Catch:{ all -> 0x01cb }
        L_0x015e:
            boolean r0 = r6.hasNext()     // Catch:{ all -> 0x01cb }
            if (r0 == 0) goto L_0x0181
            java.lang.Object r1 = r6.next()     // Catch:{ all -> 0x01cb }
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch:{ all -> 0x01cb }
            java.lang.Object r0 = r1.getKey()     // Catch:{ all -> 0x01cb }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x01cb }
            r8.writeUTF(r0)     // Catch:{ all -> 0x01cb }
            java.lang.Object r0 = r1.getValue()     // Catch:{ all -> 0x01cb }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x01cb }
            int r0 = r0.intValue()     // Catch:{ all -> 0x01cb }
            r8.writeInt(r0)     // Catch:{ all -> 0x01cb }
            goto L_0x015e
        L_0x0181:
            int r9 = r9 + 1
            goto L_0x013c
        L_0x0184:
            r0.A03(r8)     // Catch:{ all -> 0x01cb }
            goto L_0x0122
        L_0x0188:
            r1 = 0
        L_0x0189:
            if (r1 >= r6) goto L_0x0193
            r0 = r7[r1]     // Catch:{ all -> 0x01cb }
            r8.writeInt(r0)     // Catch:{ all -> 0x01cb }
            int r1 = r1 + 1
            goto L_0x0189
        L_0x0193:
            X.0lX r0 = r2.A04     // Catch:{ all -> 0x01cb }
            r7 = 0
            if (r0 != 0) goto L_0x019c
            r8.writeShort(r7)     // Catch:{ all -> 0x01cb }
            goto L_0x01c7
        L_0x019c:
            X.0Jz r6 = r0.A00     // Catch:{ all -> 0x01cb }
            int r1 = r6.size()     // Catch:{ all -> 0x01cb }
            r0 = 32767(0x7fff, float:4.5916E-41)
            int r2 = java.lang.Math.min(r1, r0)     // Catch:{ all -> 0x01cb }
            r8.writeShort(r2)     // Catch:{ all -> 0x01cb }
        L_0x01ab:
            if (r7 >= r2) goto L_0x01c7
            int r0 = r6.keyAt(r7)     // Catch:{ all -> 0x01cb }
            r8.writeInt(r0)     // Catch:{ all -> 0x01cb }
            java.lang.Object r1 = r6.valueAt(r7)     // Catch:{ all -> 0x01cb }
            X.0w0 r1 = (X.AnonymousClass0w0) r1     // Catch:{ all -> 0x01cb }
            java.util.LinkedHashMap r0 = r1.A00     // Catch:{ all -> 0x01cb }
            X.C12220lX.A00(r8, r0)     // Catch:{ all -> 0x01cb }
            java.util.LinkedHashMap r0 = r1.A01     // Catch:{ all -> 0x01cb }
            X.C12220lX.A00(r8, r0)     // Catch:{ all -> 0x01cb }
            int r7 = r7 + 1
            goto L_0x01ab
        L_0x01c7:
            r8.close()     // Catch:{ IOException -> 0x01d0 }
            goto L_0x01d8
        L_0x01cb:
            r0 = move-exception
            r8.close()     // Catch:{ all -> 0x01cf }
        L_0x01cf:
            throw r0     // Catch:{ IOException -> 0x01d0 }
        L_0x01d0:
            r2 = move-exception
            java.lang.String r1 = "QPLConfig"
            java.lang.String r0 = "failed to save qpl config"
            X.AnonymousClass0LU.A0G(r1, r0, r2)     // Catch:{ IOException -> 0x01eb }
        L_0x01d8:
            r3.nowNanos()     // Catch:{ IOException -> 0x01eb }
        L_0x01db:
            r5.size()     // Catch:{ IOException -> 0x01eb }
            r4.size()     // Catch:{ IOException -> 0x01eb }
        L_0x01e1:
            boolean r0 = com.facebook.systrace.Systrace.A0F(r15)
            if (r0 == 0) goto L_0x01ff
            r0 = -1177246425(0xffffffffb9d4a527, float:-4.055884E-4)
            goto L_0x01fc
        L_0x01eb:
            r2 = move-exception
            java.lang.String r1 = "SamplingPolicyParser"
            java.lang.String r0 = "Exception while parsing MarauderResponse."
            X.C10450iM.A06(r1, r0, r2)     // Catch:{ all -> 0x0200 }
            boolean r0 = com.facebook.systrace.Systrace.A0F(r15)
            if (r0 == 0) goto L_0x01ff
            r0 = -1673888669(0xffffffff9c3a7c63, float:-6.1703004E-22)
        L_0x01fc:
            X.C13930oX.A00(r0)
        L_0x01ff:
            return
        L_0x0200:
            r1 = move-exception
            boolean r0 = com.facebook.systrace.Systrace.A0F(r15)
            if (r0 == 0) goto L_0x020d
            r0 = 1427237117(0x5511e8fd, float:1.00268664E13)
            X.C13930oX.A00(r0)
        L_0x020d:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C10710in.A00(java.io.InputStream):void");
    }

    public C10710in(C10740ir r2) {
        this.A01 = r2;
    }
}
