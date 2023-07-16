package X;

/* renamed from: X.0vv  reason: invalid class name and case insensitive filesystem */
public final class C18010vv implements Runnable {
    public final /* synthetic */ AnonymousClass03R A00;

    public C18010vv(AnonymousClass03R r1) {
        this.A00 = r1;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:116:0x0206 */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x01e5 A[Catch:{ Exception -> 0x0210 }] */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x01ec A[Catch:{ Exception -> 0x0210 }] */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x0163 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x014c A[Catch:{ all -> 0x0202, all -> 0x0206, IOException -> 0x0207 }] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x016e A[Catch:{ all -> 0x0202, all -> 0x0206, IOException -> 0x0207 }] */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x01de A[Catch:{ Exception -> 0x0210 }] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:116:0x0206=Splitter:B:116:0x0206, B:111:0x01fe=Splitter:B:111:0x01fe} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r25 = this;
            r0 = r25
            X.03R r7 = r0.A00
            X.0Kl r0 = r7.A00
            r24 = r0
            r24.nowNanos()
            r13 = 0
            java.util.concurrent.atomic.AtomicReference r6 = r7.A08     // Catch:{ Exception -> 0x0210 }
            X.0Oe r0 = r7.A09     // Catch:{ Exception -> 0x0210 }
            java.lang.Object r1 = r0.get()     // Catch:{ Exception -> 0x0210 }
            X.0lG r1 = (X.C12070lG) r1     // Catch:{ Exception -> 0x0210 }
            X.0oW r0 = r7.A03     // Catch:{ Exception -> 0x0210 }
            java.lang.String r0 = r0.A00     // Catch:{ Exception -> 0x0210 }
            java.lang.String r22 = X.C18000vu.A00(r0)     // Catch:{ Exception -> 0x0210 }
            java.lang.String r3 = "qpl_sampling_config_v2.%s"
            android.content.Context r1 = r1.A00     // Catch:{ IOException -> 0x0207 }
            r0 = 1045170971(0x3e4c0b1b, float:0.19926111)
            java.io.File r2 = X.C14630pr.A00(r1, r0)     // Catch:{ IOException -> 0x0207 }
            r2.mkdirs()     // Catch:{ IOException -> 0x0207 }
            java.util.Locale r1 = java.util.Locale.US     // Catch:{ IOException -> 0x0207 }
            r5 = 1
            java.lang.Object[] r0 = new java.lang.Object[]{r22}     // Catch:{ IOException -> 0x0207 }
            java.lang.String r1 = java.lang.String.format(r1, r3, r0)     // Catch:{ IOException -> 0x0207 }
            java.io.File r0 = new java.io.File     // Catch:{ IOException -> 0x0207 }
            r0.<init>(r2, r1)     // Catch:{ IOException -> 0x0207 }
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ IOException -> 0x0207 }
            r1.<init>(r0)     // Catch:{ IOException -> 0x0207 }
            java.io.BufferedInputStream r0 = new java.io.BufferedInputStream     // Catch:{ IOException -> 0x0207 }
            r0.<init>(r1)     // Catch:{ IOException -> 0x0207 }
            java.io.ObjectInputStream r4 = new java.io.ObjectInputStream     // Catch:{ IOException -> 0x0207 }
            r4.<init>(r0)     // Catch:{ IOException -> 0x0207 }
            java.lang.Object r0 = r6.get()     // Catch:{ all -> 0x0202 }
            r15 = 0
            if (r0 != 0) goto L_0x01fe
            int r3 = r4.readInt()     // Catch:{ all -> 0x0202 }
            r0 = 7
            if (r3 == r0) goto L_0x006a
            java.lang.String r2 = "QPLConfig"
            java.lang.String r1 = "unsupported config version %d"
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0202 }
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch:{ all -> 0x0202 }
            X.AnonymousClass0LU.A0N(r2, r1, r0)     // Catch:{ all -> 0x0202 }
            goto L_0x01fe
        L_0x006a:
            java.lang.String r23 = r4.readUTF()     // Catch:{ all -> 0x0202 }
            java.lang.Object r0 = r6.get()     // Catch:{ all -> 0x0202 }
            if (r0 != 0) goto L_0x01fe
            X.0vr r19 = X.C17970vr.A00(r4, r6)     // Catch:{ all -> 0x0202 }
            if (r19 == 0) goto L_0x01fe
            java.lang.Object r0 = r6.get()     // Catch:{ all -> 0x0202 }
            if (r0 != 0) goto L_0x01fe
            byte r1 = r4.readByte()     // Catch:{ all -> 0x0202 }
            if (r1 != r5) goto L_0x00a3
            X.0vr r0 = X.C17970vr.A00(r4, r6)     // Catch:{ all -> 0x0202 }
            if (r0 == 0) goto L_0x01fe
            X.0lW r10 = new X.0lW     // Catch:{ all -> 0x0202 }
            r10.<init>(r0)     // Catch:{ all -> 0x0202 }
        L_0x0091:
            java.lang.Object r0 = r6.get()     // Catch:{ all -> 0x0202 }
            if (r0 != 0) goto L_0x01fe
            int r12 = r4.readInt()     // Catch:{ all -> 0x0202 }
            if (r12 == 0) goto L_0x0142
            X.0vt r14 = new X.0vt     // Catch:{ all -> 0x0202 }
            r14.<init>()     // Catch:{ all -> 0x0202 }
            goto L_0x00f8
        L_0x00a3:
            r0 = 2
            if (r1 != r0) goto L_0x01f0
            long r2 = r4.readLong()     // Catch:{ all -> 0x0202 }
            java.lang.Object r0 = r6.get()     // Catch:{ all -> 0x0202 }
            if (r0 != 0) goto L_0x01fe
            int r11 = r4.readInt()     // Catch:{ all -> 0x0202 }
            if (r11 > 0) goto L_0x00b8
            r9 = 0
            goto L_0x00ce
        L_0x00b8:
            X.0lo r9 = new X.0lo     // Catch:{ all -> 0x0202 }
            r9.<init>(r11)     // Catch:{ all -> 0x0202 }
            r10 = 0
        L_0x00be:
            int r8 = r4.readInt()     // Catch:{ all -> 0x0202 }
            long r0 = r4.readLong()     // Catch:{ all -> 0x0202 }
            r9.put(r8, r0)     // Catch:{ all -> 0x0202 }
            int r10 = r10 + 1
            if (r10 >= r11) goto L_0x00ce
            goto L_0x00be
        L_0x00ce:
            java.lang.Object r0 = r6.get()     // Catch:{ all -> 0x0202 }
            if (r0 != 0) goto L_0x01fe
            int r12 = r4.readInt()     // Catch:{ all -> 0x0202 }
            if (r12 > 0) goto L_0x00dc
            r11 = 0
            goto L_0x00f2
        L_0x00dc:
            X.0lo r11 = new X.0lo     // Catch:{ all -> 0x0202 }
            r11.<init>(r12)     // Catch:{ all -> 0x0202 }
            r10 = 0
        L_0x00e2:
            int r8 = r4.readInt()     // Catch:{ all -> 0x0202 }
            long r0 = r4.readLong()     // Catch:{ all -> 0x0202 }
            r11.put(r8, r0)     // Catch:{ all -> 0x0202 }
            int r10 = r10 + 1
            if (r10 >= r12) goto L_0x00f2
            goto L_0x00e2
        L_0x00f2:
            X.0lV r10 = new X.0lV     // Catch:{ all -> 0x0202 }
            r10.<init>(r9, r11, r2)     // Catch:{ all -> 0x0202 }
            goto L_0x0091
        L_0x00f8:
            r11 = 0
            goto L_0x00fc
        L_0x00fa:
            int r11 = r11 + 1
        L_0x00fc:
            if (r11 >= r12) goto L_0x0143
            java.lang.Object r0 = r6.get()     // Catch:{ all -> 0x0202 }
            if (r0 != 0) goto L_0x0142
            int r9 = r4.readInt()     // Catch:{ all -> 0x0202 }
            X.0vs r8 = new X.0vs     // Catch:{ all -> 0x0202 }
            r8.<init>()     // Catch:{ all -> 0x0202 }
            int r3 = r4.readInt()     // Catch:{ all -> 0x0202 }
            r2 = 0
            goto L_0x0115
        L_0x0113:
            int r2 = r2 + 1
        L_0x0115:
            if (r2 >= r3) goto L_0x013c
            java.lang.Object r0 = r6.get()     // Catch:{ all -> 0x0202 }
            if (r0 == 0) goto L_0x012c
            java.lang.Object r0 = r6.get()     // Catch:{ all -> 0x0202 }
            if (r0 != 0) goto L_0x0142
            java.lang.String r0 = "StringToIntMap.load should return null only on interruption"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0202 }
            r1.<init>(r0)     // Catch:{ all -> 0x0202 }
            goto L_0x01fd
        L_0x012c:
            java.lang.String r1 = r4.readUTF()     // Catch:{ all -> 0x0202 }
            int r0 = r4.readInt()     // Catch:{ all -> 0x0202 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0202 }
            r8.put(r1, r0)     // Catch:{ all -> 0x0202 }
            goto L_0x0113
        L_0x013c:
            X.0Jz r0 = r14.A00     // Catch:{ all -> 0x0202 }
            r0.put(r9, r8)     // Catch:{ all -> 0x0202 }
            goto L_0x00fa
        L_0x0142:
            r14 = r15
        L_0x0143:
            int r3 = r4.readInt()     // Catch:{ all -> 0x0202 }
            int[] r2 = new int[r3]     // Catch:{ all -> 0x0202 }
            r1 = 0
        L_0x014a:
            if (r1 >= r3) goto L_0x0163
            java.lang.Object r0 = r6.get()     // Catch:{ all -> 0x0202 }
            if (r0 == 0) goto L_0x015a
            int[] r0 = new int[r13]     // Catch:{ all -> 0x0202 }
            X.0vp r12 = new X.0vp     // Catch:{ all -> 0x0202 }
            r12.<init>(r0)     // Catch:{ all -> 0x0202 }
            goto L_0x0168
        L_0x015a:
            int r0 = r4.readInt()     // Catch:{ all -> 0x0202 }
            r2[r1] = r0     // Catch:{ all -> 0x0202 }
            int r1 = r1 + 1
            goto L_0x014a
        L_0x0163:
            X.0vp r12 = new X.0vp     // Catch:{ all -> 0x0202 }
            r12.<init>(r2)     // Catch:{ all -> 0x0202 }
        L_0x0168:
            short r11 = r4.readShort()     // Catch:{ all -> 0x0202 }
            if (r11 == 0) goto L_0x01b2
            X.0vz r9 = new X.0vz     // Catch:{ all -> 0x0202 }
            r9.<init>()     // Catch:{ all -> 0x0202 }
            r8 = 0
        L_0x0174:
            if (r8 >= r11) goto L_0x01b4
            java.lang.Object r0 = r6.get()     // Catch:{ all -> 0x0202 }
            if (r0 != 0) goto L_0x01b2
            int r13 = r4.readInt()     // Catch:{ all -> 0x0202 }
            short r1 = r4.readShort()     // Catch:{ all -> 0x0202 }
            if (r1 != 0) goto L_0x0188
            r3 = 0
            goto L_0x0196
        L_0x0188:
            java.lang.String[] r3 = new java.lang.String[r1]     // Catch:{ all -> 0x0202 }
            r0 = 0
        L_0x018b:
            if (r0 >= r1) goto L_0x0196
            java.lang.String r2 = r4.readUTF()     // Catch:{ all -> 0x0202 }
            r3[r0] = r2     // Catch:{ all -> 0x0202 }
            int r0 = r0 + 1
            goto L_0x018b
        L_0x0196:
            short r2 = r4.readShort()     // Catch:{ all -> 0x0202 }
            if (r2 != 0) goto L_0x019e
            r1 = 0
            goto L_0x01ac
        L_0x019e:
            java.lang.String[] r1 = new java.lang.String[r2]     // Catch:{ all -> 0x0202 }
            r0 = 0
        L_0x01a1:
            if (r0 >= r2) goto L_0x01ac
            java.lang.String r16 = r4.readUTF()     // Catch:{ all -> 0x0202 }
            r1[r0] = r16     // Catch:{ all -> 0x0202 }
            int r0 = r0 + 1
            goto L_0x01a1
        L_0x01ac:
            r9.A00(r3, r1, r13)     // Catch:{ all -> 0x0202 }
            int r8 = r8 + 1
            goto L_0x0174
        L_0x01b2:
            r0 = r15
            goto L_0x01c3
        L_0x01b4:
            X.0Jz r1 = r9.A00     // Catch:{ all -> 0x0202 }
            r0 = r1
            X.0lq r0 = (X.C12400lq) r0     // Catch:{ all -> 0x0202 }
            r0.A00 = r5     // Catch:{ all -> 0x0202 }
            r0.size()     // Catch:{ all -> 0x0202 }
            X.0lX r0 = new X.0lX     // Catch:{ all -> 0x0202 }
            r0.<init>(r1)     // Catch:{ all -> 0x0202 }
        L_0x01c3:
            X.0vu r2 = new X.0vu     // Catch:{ all -> 0x0202 }
            r16 = r2
            r17 = r12
            r18 = r10
            r20 = r14
            r21 = r0
            r16.<init>(r17, r18, r19, r20, r21, r22, r23)     // Catch:{ all -> 0x0202 }
            r4.close()     // Catch:{ IOException -> 0x0207 }
            r6.compareAndSet(r15, r2)     // Catch:{ Exception -> 0x0210 }
            X.0vr r1 = r2.A02     // Catch:{ Exception -> 0x0210 }
            X.0Ow r0 = r1.A03     // Catch:{ Exception -> 0x0210 }
            if (r0 == 0) goto L_0x01e1
            r0.size()     // Catch:{ Exception -> 0x0210 }
        L_0x01e1:
            X.0Ow r0 = r1.A02     // Catch:{ Exception -> 0x0210 }
            if (r0 == 0) goto L_0x01e8
            r0.size()     // Catch:{ Exception -> 0x0210 }
        L_0x01e8:
            X.0vq r0 = r2.A01     // Catch:{ Exception -> 0x0210 }
            if (r0 == 0) goto L_0x0220
            r0.A01()     // Catch:{ Exception -> 0x0210 }
            goto L_0x0220
        L_0x01f0:
            if (r1 == 0) goto L_0x01fe
            java.lang.String r0 = "We do not support metadata type "
            java.lang.String r0 = X.AnonymousClass00U.A0J(r0, r1)     // Catch:{ all -> 0x0202 }
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0202 }
            r1.<init>(r0)     // Catch:{ all -> 0x0202 }
        L_0x01fd:
            throw r1     // Catch:{ all -> 0x0202 }
        L_0x01fe:
            r4.close()     // Catch:{ IOException -> 0x0207 }
            goto L_0x0220
        L_0x0202:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x0206 }
        L_0x0206:
            throw r0     // Catch:{ IOException -> 0x0207 }
        L_0x0207:
            r2 = move-exception
            java.lang.String r1 = "QPLConfig"
            java.lang.String r0 = "failed to load config"
            X.AnonymousClass0LU.A0G(r1, r0, r2)     // Catch:{ Exception -> 0x0210 }
            goto L_0x0220
        L_0x0210:
            r3 = move-exception
            X.0Oe r0 = r7.A0A
            java.lang.Object r2 = r0.get()
            X.0IB r2 = (X.AnonymousClass0IB) r2
            java.lang.String r1 = "QPLConfig"
            java.lang.String r0 = "Failed to load config"
            r2.CuY(r1, r0, r3)
        L_0x0220:
            r24.nowNanos()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18010vv.run():void");
    }
}
