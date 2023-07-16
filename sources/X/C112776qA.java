package X;

/* renamed from: X.6qA  reason: invalid class name and case insensitive filesystem */
public final class C112776qA {
    public boolean A00;
    public final C106796fd A01;
    public final C104146bJ A02 = new C104146bJ();
    public final AnonymousClass84G A03 = new AnonymousClass84G();
    public final AnonymousClass7Y3 A04;

    public C112776qA(AnonymousClass7Y3 r3) {
        C04220Ms.A0B(r3, 1);
        this.A04 = r3;
        this.A01 = new C106796fd(r3.A0a.A06);
    }

    /* JADX INFO: finally extract failed */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v0, resolved type: java.lang.Object[]} */
    /* JADX WARNING: type inference failed for: r9v13 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00ed A[Catch:{ all -> 0x020e }] */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x00fe A[EDGE_INSN: B:96:0x00fe->B:30:0x00fe ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int A00(X.C106806fe r42, X.C142948fr r43, boolean r44) {
        /*
            r41 = this;
            r6 = 0
            r40 = r42
            r0 = r40
            X.C04220Ms.A0B(r0, r6)
            r19 = 1
            r7 = r41
            boolean r0 = r7.A00
            if (r0 == 0) goto L_0x0012
            r9 = 0
            return r9
        L_0x0012:
            r0 = r19
            r7.A00 = r0     // Catch:{ all -> 0x020e }
            X.6bJ r0 = r7.A02     // Catch:{ all -> 0x020e }
            r39 = r0
            r0 = r40
            java.util.List r0 = r0.A01     // Catch:{ all -> 0x020e }
            r38 = r0
            int r0 = r38.size()     // Catch:{ all -> 0x020e }
            java.util.LinkedHashMap r14 = X.C18190wL.A0v(r0)     // Catch:{ all -> 0x020e }
            int r17 = r38.size()     // Catch:{ all -> 0x020e }
            r9 = 0
        L_0x002d:
            r0 = r17
            if (r9 >= r0) goto L_0x00cd
            r0 = r38
            java.lang.Object r8 = r0.get(r9)     // Catch:{ all -> 0x020e }
            X.6uy r8 = (X.C115386uy) r8     // Catch:{ all -> 0x020e }
            r0 = r39
            java.util.Map r13 = r0.A00     // Catch:{ all -> 0x020e }
            long r0 = r8.A02     // Catch:{ all -> 0x020e }
            X.6sr r2 = new X.6sr     // Catch:{ all -> 0x020e }
            r2.<init>(r0)     // Catch:{ all -> 0x020e }
            java.lang.Object r1 = r13.get(r2)     // Catch:{ all -> 0x020e }
            X.6iZ r1 = (X.C108566iZ) r1     // Catch:{ all -> 0x020e }
            if (r1 != 0) goto L_0x0090
            long r11 = r8.A06     // Catch:{ all -> 0x020e }
            long r4 = r8.A03     // Catch:{ all -> 0x020e }
            r16 = 0
        L_0x0052:
            long r2 = r8.A02     // Catch:{ all -> 0x020e }
            X.6sr r10 = new X.6sr     // Catch:{ all -> 0x020e }
            r10.<init>(r2)     // Catch:{ all -> 0x020e }
            long r0 = r8.A06     // Catch:{ all -> 0x020e }
            r28 = r0
            long r0 = r8.A03     // Catch:{ all -> 0x020e }
            r30 = r0
            boolean r15 = r8.A08     // Catch:{ all -> 0x020e }
            float r0 = r8.A00     // Catch:{ all -> 0x020e }
            r22 = r0
            int r0 = r8.A01     // Catch:{ all -> 0x020e }
            r23 = r0
            java.util.List r0 = r8.A07     // Catch:{ all -> 0x020e }
            r18 = r0
            long r0 = r8.A05     // Catch:{ all -> 0x020e }
            r20 = r0
            X.7Es r0 = new X.7Es     // Catch:{ all -> 0x020e }
            r24 = r2
            r26 = r28
            r28 = r30
            r30 = r11
            r32 = r4
            r34 = r20
            r36 = r15
            r37 = r16
            r20 = r0
            r21 = r18
            r20.<init>(r21, r22, r23, r24, r26, r28, r30, r32, r34, r36, r37)     // Catch:{ all -> 0x020e }
            r14.put(r10, r0)     // Catch:{ all -> 0x020e }
            goto L_0x009f
        L_0x0090:
            long r11 = r1.A01     // Catch:{ all -> 0x020e }
            boolean r0 = r1.A02     // Catch:{ all -> 0x020e }
            r16 = r0
            long r0 = r1.A00     // Catch:{ all -> 0x020e }
            r2 = r43
            long r4 = X.AnonymousClass7FN.A02(r2, r0)     // Catch:{ all -> 0x020e }
            goto L_0x0052
        L_0x009f:
            if (r15 == 0) goto L_0x00bf
            long r0 = r8.A02     // Catch:{ all -> 0x020e }
            X.6sr r10 = new X.6sr     // Catch:{ all -> 0x020e }
            r10.<init>(r0)     // Catch:{ all -> 0x020e }
            long r2 = r8.A06     // Catch:{ all -> 0x020e }
            long r0 = r8.A04     // Catch:{ all -> 0x020e }
            boolean r5 = r8.A08     // Catch:{ all -> 0x020e }
            X.6iZ r4 = new X.6iZ     // Catch:{ all -> 0x020e }
            r23 = r0
            r25 = r5
            r20 = r4
            r21 = r2
            r20.<init>(r21, r23, r25)     // Catch:{ all -> 0x020e }
            r13.put(r10, r4)     // Catch:{ all -> 0x020e }
            goto L_0x00c9
        L_0x00bf:
            long r0 = r8.A02     // Catch:{ all -> 0x020e }
            X.6sr r2 = new X.6sr     // Catch:{ all -> 0x020e }
            r2.<init>(r0)     // Catch:{ all -> 0x020e }
            r13.remove(r2)     // Catch:{ all -> 0x020e }
        L_0x00c9:
            int r9 = r9 + 1
            goto L_0x002d
        L_0x00cd:
            X.6pN r3 = new X.6pN     // Catch:{ all -> 0x020e }
            r0 = r40
            r3.<init>(r0, r14)     // Catch:{ all -> 0x020e }
            java.util.Map r4 = r3.A02     // Catch:{ all -> 0x020e }
            java.util.Collection r1 = r4.values()     // Catch:{ all -> 0x020e }
            if (r1 == 0) goto L_0x00e3
            boolean r0 = r1.isEmpty()     // Catch:{ all -> 0x020e }
            if (r0 == 0) goto L_0x00e3
            goto L_0x00fe
        L_0x00e3:
            java.util.Iterator r2 = r1.iterator()     // Catch:{ all -> 0x020e }
        L_0x00e7:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x020e }
            if (r0 == 0) goto L_0x00fe
            java.lang.Object r1 = r2.next()     // Catch:{ all -> 0x020e }
            X.7Es r1 = (X.C121197Es) r1     // Catch:{ all -> 0x020e }
            boolean r0 = r1.A0A     // Catch:{ all -> 0x020e }
            if (r0 != 0) goto L_0x00fb
            boolean r0 = r1.A0B     // Catch:{ all -> 0x020e }
            if (r0 == 0) goto L_0x00e7
        L_0x00fb:
            r18 = 0
            goto L_0x0100
        L_0x00fe:
            r18 = 1
        L_0x0100:
            java.util.Iterator r17 = X.C86144wL.A0z(r4)     // Catch:{ all -> 0x020e }
        L_0x0104:
            boolean r0 = r17.hasNext()     // Catch:{ all -> 0x020e }
            if (r0 == 0) goto L_0x01b0
            java.lang.Object r2 = r17.next()     // Catch:{ all -> 0x020e }
            X.7Es r2 = (X.C121197Es) r2     // Catch:{ all -> 0x020e }
            if (r18 != 0) goto L_0x0118
            boolean r0 = X.C121667Hg.A01(r2)     // Catch:{ all -> 0x020e }
            if (r0 == 0) goto L_0x0104
        L_0x0118:
            int r1 = r2.A03     // Catch:{ all -> 0x020e }
            r0 = r19
            boolean r13 = X.AnonymousClass0wJ.A1T(r1, r0)
            X.7Y3 r8 = r7.A04     // Catch:{ all -> 0x020e }
            long r0 = r2.A05     // Catch:{ all -> 0x020e }
            X.84G r5 = r7.A03     // Catch:{ all -> 0x020e }
            X.7IW r9 = r8.A0a     // Catch:{ all -> 0x020e }
            X.54T r8 = r9.A04     // Catch:{ all -> 0x020e }
            long r11 = r8.A0J(r0)     // Catch:{ all -> 0x020e }
            X.54T r0 = r9.A04     // Catch:{ all -> 0x020e }
            X.8le r10 = X.AnonymousClass54T.A0L     // Catch:{ all -> 0x020e }
            r8 = r0
            r9 = r5
            r14 = r19
            r8.A0W(r9, r10, r11, r13, r14)     // Catch:{ all -> 0x020e }
            boolean r0 = r5.isEmpty()     // Catch:{ all -> 0x020e }
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0104
            X.6fd r0 = r7.A01     // Catch:{ all -> 0x020e }
            long r1 = r2.A04     // Catch:{ all -> 0x020e }
            X.6vN r13 = r0.A00     // Catch:{ all -> 0x020e }
            int r11 = r5.size()     // Catch:{ all -> 0x020e }
            r16 = 1
            r10 = 0
        L_0x014e:
            if (r10 >= r11) goto L_0x01ab
            java.lang.Object r15 = r5.get(r10)     // Catch:{ all -> 0x020e }
            X.8po r15 = (X.C147728po) r15     // Catch:{ all -> 0x020e }
            if (r16 == 0) goto L_0x0193
            X.84X r0 = r13.A00     // Catch:{ all -> 0x020e }
            int r14 = r0.A00     // Catch:{ all -> 0x020e }
            if (r14 <= 0) goto L_0x0172
            java.lang.Object[] r12 = r0.A01     // Catch:{ all -> 0x020e }
            r8 = 0
        L_0x0161:
            r9 = r12[r8]     // Catch:{ all -> 0x020e }
            r0 = r9
            X.54B r0 = (X.AnonymousClass54B) r0     // Catch:{ all -> 0x020e }
            X.8po r0 = r0.A06     // Catch:{ all -> 0x020e }
            boolean r0 = X.C04220Ms.A0I(r0, r15)     // Catch:{ all -> 0x020e }
            if (r0 != 0) goto L_0x0173
            int r8 = r8 + 1
            if (r8 < r14) goto L_0x0161
        L_0x0172:
            r9 = 0
        L_0x0173:
            X.54B r9 = (X.AnonymousClass54B) r9     // Catch:{ all -> 0x020e }
            if (r9 == 0) goto L_0x0191
            r0 = r19
            r9.A02 = r0     // Catch:{ all -> 0x020e }
            X.84X r8 = r9.A05     // Catch:{ all -> 0x020e }
            X.6sr r0 = new X.6sr     // Catch:{ all -> 0x020e }
            r0.<init>(r1)     // Catch:{ all -> 0x020e }
            boolean r0 = r8.A0D(r0)     // Catch:{ all -> 0x020e }
            if (r0 != 0) goto L_0x01a7
            X.6sr r0 = new X.6sr     // Catch:{ all -> 0x020e }
            r0.<init>(r1)     // Catch:{ all -> 0x020e }
            r8.A0C(r0)     // Catch:{ all -> 0x020e }
            goto L_0x01a7
        L_0x0191:
            r16 = 0
        L_0x0193:
            X.54B r9 = new X.54B     // Catch:{ all -> 0x020e }
            r9.<init>(r15)     // Catch:{ all -> 0x020e }
            X.84X r8 = r9.A05     // Catch:{ all -> 0x020e }
            X.6sr r0 = new X.6sr     // Catch:{ all -> 0x020e }
            r0.<init>(r1)     // Catch:{ all -> 0x020e }
            r8.A0C(r0)     // Catch:{ all -> 0x020e }
            X.84X r0 = r13.A00     // Catch:{ all -> 0x020e }
            r0.A0C(r9)     // Catch:{ all -> 0x020e }
        L_0x01a7:
            r13 = r9
            int r10 = r10 + 1
            goto L_0x014e
        L_0x01ab:
            r5.clear()     // Catch:{ all -> 0x020e }
            goto L_0x0104
        L_0x01b0:
            X.6fd r0 = r7.A01     // Catch:{ all -> 0x020e }
            X.6vN r2 = r0.A00     // Catch:{ all -> 0x020e }
            r2.A01()     // Catch:{ all -> 0x020e }
            X.8mM r1 = r0.A01     // Catch:{ all -> 0x020e }
            r5 = r44
            boolean r0 = r2.A04(r3, r1, r4, r5)     // Catch:{ all -> 0x020e }
            r9 = 0
            if (r0 == 0) goto L_0x01cf
            boolean r1 = r2.A05(r3, r1, r4, r5)     // Catch:{ all -> 0x020e }
            boolean r0 = r2.A03(r3)     // Catch:{ all -> 0x020e }
            if (r0 != 0) goto L_0x01ce
            if (r1 == 0) goto L_0x01cf
        L_0x01ce:
            r9 = 1
        L_0x01cf:
            boolean r0 = r3.A00     // Catch:{ all -> 0x020e }
            if (r0 != 0) goto L_0x0209
            java.util.Collection r1 = r4.values()     // Catch:{ all -> 0x020e }
            if (r1 == 0) goto L_0x01e0
            boolean r0 = r1.isEmpty()     // Catch:{ all -> 0x020e }
            if (r0 == 0) goto L_0x01e0
            goto L_0x0209
        L_0x01e0:
            java.util.Iterator r8 = r1.iterator()     // Catch:{ all -> 0x020e }
        L_0x01e4:
            boolean r0 = r8.hasNext()     // Catch:{ all -> 0x020e }
            if (r0 == 0) goto L_0x0209
            java.lang.Object r5 = r8.next()     // Catch:{ all -> 0x020e }
            X.7Es r5 = (X.C121197Es) r5     // Catch:{ all -> 0x020e }
            X.C04220Ms.A0B(r5, r6)     // Catch:{ all -> 0x020e }
            long r2 = r5.A06     // Catch:{ all -> 0x020e }
            long r0 = r5.A05     // Catch:{ all -> 0x020e }
            long r3 = X.AnonymousClass7KC.A04(r0, r2)     // Catch:{ all -> 0x020e }
            long r1 = X.AnonymousClass7KC.A03     // Catch:{ all -> 0x020e }
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x01e4
            boolean r0 = r5.A02()     // Catch:{ all -> 0x020e }
            if (r0 == 0) goto L_0x01e4
            r0 = 2
            goto L_0x020a
        L_0x0209:
            r0 = 0
        L_0x020a:
            r9 = r9 | r0
            r7.A00 = r6
            return r9
        L_0x020e:
            r0 = move-exception
            r7.A00 = r6
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C112776qA.A00(X.6fe, X.8fr, boolean):int");
    }
}
