package X;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.78y  reason: invalid class name */
public final class AnonymousClass78y {
    public C142868fj A00;
    public C111226mz A01;
    public boolean A02;
    public boolean A03;
    public final AnonymousClass84X A04 = AnonymousClass84X.A01(new C111226mz[16]);
    public final AtomicReference A05 = new AtomicReference((Object) null);
    public final AnonymousClass0YY A06;
    public final AnonymousClass0YY A07 = C86154wM.A10(this, 17);
    public final AnonymousClass0YP A08 = C86164wN.A0u(this, 16);

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v29, resolved type: X.6pM} */
    /* JADX WARNING: type inference failed for: r9v5 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02(java.lang.Object r18, X.AnonymousClass0ZU r19, X.AnonymousClass0YY r20) {
        /*
            r17 = this;
            r12 = 0
            r6 = 1
            r3 = r19
            r7 = r20
            X.AnonymousClass0wJ.A1M(r7, r6, r3)
            r8 = r17
            X.84X r5 = r8.A04
            monitor-enter(r5)
            int r4 = r5.A00     // Catch:{ all -> 0x00ed }
            if (r4 <= 0) goto L_0x0022
            java.lang.Object[] r2 = r5.A01     // Catch:{ all -> 0x00ed }
            r1 = 0
        L_0x0015:
            r9 = r2[r1]     // Catch:{ all -> 0x00ed }
            r0 = r9
            X.6mz r0 = (X.C111226mz) r0     // Catch:{ all -> 0x00ed }
            X.0YY r0 = r0.A0B     // Catch:{ all -> 0x00ed }
            if (r0 == r7) goto L_0x0023
            int r1 = r1 + 1
            if (r1 < r4) goto L_0x0015
        L_0x0022:
            r9 = 0
        L_0x0023:
            X.6mz r9 = (X.C111226mz) r9     // Catch:{ all -> 0x00ed }
            if (r9 != 0) goto L_0x0032
            X.C03940Lk.A03(r7, r6)     // Catch:{ all -> 0x00ed }
            X.6mz r9 = new X.6mz     // Catch:{ all -> 0x00ed }
            r9.<init>(r7)     // Catch:{ all -> 0x00ed }
            r5.A0C(r9)     // Catch:{ all -> 0x00ed }
        L_0x0032:
            monitor-exit(r5)
            boolean r7 = r8.A02
            X.6mz r6 = r8.A01
            r8.A02 = r12     // Catch:{ all -> 0x00e7 }
            r8.A01 = r9     // Catch:{ all -> 0x00e7 }
            java.lang.Object r0 = r9.A03     // Catch:{ all -> 0x00e7 }
            r16 = r0
            X.6pM r10 = r9.A02     // Catch:{ all -> 0x00e7 }
            int r5 = r9.A00     // Catch:{ all -> 0x00e7 }
            r1 = r18
            r9.A03 = r1     // Catch:{ all -> 0x00e7 }
            X.7EA r0 = r9.A04     // Catch:{ all -> 0x00e7 }
            X.C04220Ms.A0B(r1, r12)     // Catch:{ all -> 0x00e7 }
            int r1 = X.AnonymousClass7EA.A00(r0, r1)     // Catch:{ all -> 0x00e7 }
            if (r1 < 0) goto L_0x0084
            java.lang.Object[] r0 = r0.A02     // Catch:{ all -> 0x00e7 }
            r0 = r0[r1]     // Catch:{ all -> 0x00e7 }
        L_0x0056:
            X.6pM r0 = (X.C112306pM) r0     // Catch:{ all -> 0x00e7 }
            r9.A02 = r0     // Catch:{ all -> 0x00e7 }
            int r1 = r9.A00     // Catch:{ all -> 0x00e7 }
            r0 = -1
            if (r1 != r0) goto L_0x0069
            androidx.compose.runtime.snapshots.Snapshot r0 = X.C122127Kl.A00()     // Catch:{ all -> 0x00e7 }
            int r0 = r0.A04()     // Catch:{ all -> 0x00e7 }
            r9.A00 = r0     // Catch:{ all -> 0x00e7 }
        L_0x0069:
            X.0YY r2 = r9.A09     // Catch:{ all -> 0x00e7 }
            X.0YY r1 = r9.A0A     // Catch:{ all -> 0x00e7 }
            r0 = 17
            kotlin.jvm.internal.KtLambdaShape16S0200000_I2 r0 = X.C86164wN.A0v(r3, r8, r0)     // Catch:{ all -> 0x00e7 }
            X.C1191373q.A00(r0, r2, r1)     // Catch:{ all -> 0x00e7 }
            java.lang.Object r13 = r9.A03     // Catch:{ all -> 0x00e7 }
            X.C04220Ms.A0A(r13)     // Catch:{ all -> 0x00e7 }
            X.6pM r11 = r9.A02     // Catch:{ all -> 0x00e7 }
            if (r11 == 0) goto L_0x00da
            int r3 = r11.A00     // Catch:{ all -> 0x00e7 }
            r2 = 0
            r4 = 0
            goto L_0x0086
        L_0x0084:
            r0 = 0
            goto L_0x0056
        L_0x0086:
            if (r2 >= r3) goto L_0x00cb
            java.lang.Object[] r0 = r11.A02     // Catch:{ all -> 0x00e7 }
            r1 = r0[r2]     // Catch:{ all -> 0x00e7 }
            r0 = 19
            java.lang.String r0 = X.I17.A00(r0)     // Catch:{ all -> 0x00e7 }
            X.C04220Ms.A0C(r1, r0)     // Catch:{ all -> 0x00e7 }
            int[] r15 = r11.A01     // Catch:{ all -> 0x00e7 }
            r14 = r15[r2]     // Catch:{ all -> 0x00e7 }
            int r0 = r9.A00     // Catch:{ all -> 0x00e7 }
            if (r14 == r0) goto L_0x00be
            X.7Ew r14 = r9.A07     // Catch:{ all -> 0x00e7 }
            r14.A05(r1, r13)     // Catch:{ all -> 0x00e7 }
            boolean r0 = r1 instanceof X.C147358pD     // Catch:{ all -> 0x00e7 }
            if (r0 == 0) goto L_0x00c8
            X.C04220Ms.A0B(r1, r12)     // Catch:{ all -> 0x00e7 }
            int r0 = X.C121227Ew.A00(r14, r1)     // Catch:{ all -> 0x00e7 }
            boolean r0 = X.C86114wI.A1S(r0)     // Catch:{ all -> 0x00e7 }
            if (r0 != 0) goto L_0x00c8
            X.7Ew r0 = r9.A06     // Catch:{ all -> 0x00e7 }
            r0.A03(r1)     // Catch:{ all -> 0x00e7 }
            java.util.HashMap r0 = r9.A08     // Catch:{ all -> 0x00e7 }
            r0.remove(r1)     // Catch:{ all -> 0x00e7 }
            goto L_0x00c8
        L_0x00be:
            if (r4 == r2) goto L_0x00c6
            java.lang.Object[] r0 = r11.A02     // Catch:{ all -> 0x00e7 }
            r0[r4] = r1     // Catch:{ all -> 0x00e7 }
            r15[r4] = r14     // Catch:{ all -> 0x00e7 }
        L_0x00c6:
            int r4 = r4 + 1
        L_0x00c8:
            int r2 = r2 + 1
            goto L_0x0086
        L_0x00cb:
            int r3 = r11.A00     // Catch:{ all -> 0x00e7 }
            r2 = r4
        L_0x00ce:
            if (r2 >= r3) goto L_0x00d8
            java.lang.Object[] r1 = r11.A02     // Catch:{ all -> 0x00e7 }
            r0 = 0
            r1[r2] = r0     // Catch:{ all -> 0x00e7 }
            int r2 = r2 + 1
            goto L_0x00ce
        L_0x00d8:
            r11.A00 = r4     // Catch:{ all -> 0x00e7 }
        L_0x00da:
            r0 = r16
            r9.A03 = r0     // Catch:{ all -> 0x00e7 }
            r9.A02 = r10     // Catch:{ all -> 0x00e7 }
            r9.A00 = r5     // Catch:{ all -> 0x00e7 }
            r8.A01 = r6
            r8.A02 = r7
            return
        L_0x00e7:
            r0 = move-exception
            r8.A01 = r6
            r8.A02 = r7
            throw r0
        L_0x00ed:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass78y.A02(java.lang.Object, X.0ZU, X.0YY):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0086, code lost:
        r1 = r11.A07;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00d1, code lost:
        if (r0 != false) goto L_0x00d3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A00(X.AnonymousClass78y r19) {
        /*
            r9 = r19
            X.84X r8 = r9.A04
            monitor-enter(r8)
            boolean r0 = r9.A03     // Catch:{ all -> 0x010e }
            monitor-exit(r8)
            r7 = 0
            if (r0 == 0) goto L_0x000c
            return r7
        L_0x000c:
            r19 = 0
        L_0x000e:
            java.util.concurrent.atomic.AtomicReference r10 = r9.A05
            java.lang.Object r5 = r10.get()
            r4 = 0
            if (r5 == 0) goto L_0x010d
            boolean r0 = r5 instanceof java.util.Set
            if (r0 == 0) goto L_0x00dc
            r6 = r5
            java.util.Set r6 = (java.util.Set) r6
        L_0x001e:
            boolean r0 = r10.compareAndSet(r5, r4)
            if (r0 == 0) goto L_0x000e
            if (r6 == 0) goto L_0x010d
            monitor-enter(r8)
            int r5 = r8.A00     // Catch:{ all -> 0x010e }
            if (r5 <= 0) goto L_0x00d9
            java.lang.Object[] r0 = r8.A01     // Catch:{ all -> 0x010e }
            r18 = r0
            r10 = 0
        L_0x0030:
            r11 = r18[r10]     // Catch:{ all -> 0x010e }
            X.6mz r11 = (X.C111226mz) r11     // Catch:{ all -> 0x010e }
            java.util.Iterator r17 = r6.iterator()     // Catch:{ all -> 0x010e }
            r16 = 0
        L_0x003a:
            boolean r0 = r17.hasNext()     // Catch:{ all -> 0x010e }
            if (r0 == 0) goto L_0x00cb
            java.lang.Object r14 = r17.next()     // Catch:{ all -> 0x010e }
            X.7Ew r1 = r11.A06     // Catch:{ all -> 0x010e }
            X.C04220Ms.A0B(r14, r7)     // Catch:{ all -> 0x010e }
            int r0 = X.C121227Ew.A00(r1, r14)     // Catch:{ all -> 0x010e }
            boolean r0 = X.C86114wI.A1S(r0)     // Catch:{ all -> 0x010e }
            if (r0 == 0) goto L_0x00aa
            int r0 = X.C121227Ew.A00(r1, r14)     // Catch:{ all -> 0x010e }
            if (r0 < 0) goto L_0x00aa
            X.84Z r15 = X.C121227Ew.A01(r1, r0)     // Catch:{ all -> 0x010e }
            int r13 = r15.size()     // Catch:{ all -> 0x010e }
            r12 = 0
        L_0x0062:
            if (r12 >= r13) goto L_0x00aa
            java.lang.Object r2 = r15.A01(r12)     // Catch:{ all -> 0x010e }
            X.8pD r2 = (X.C147358pD) r2     // Catch:{ all -> 0x010e }
            java.lang.String r0 = "null cannot be cast to non-null type androidx.compose.runtime.DerivedState<kotlin.Any?>"
            X.C04220Ms.A0C(r2, r0)     // Catch:{ all -> 0x010e }
            java.util.HashMap r0 = r11.A08     // Catch:{ all -> 0x010e }
            java.lang.Object r3 = r0.get(r2)     // Catch:{ all -> 0x010e }
            X.7WR r1 = X.AnonymousClass7WR.A00     // Catch:{ all -> 0x010e }
            java.lang.String r0 = "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>"
            X.C04220Ms.A0C(r1, r0)     // Catch:{ all -> 0x010e }
            java.lang.Object r0 = r2.Abn()     // Catch:{ all -> 0x010e }
            boolean r0 = r1.AKU(r0, r3)     // Catch:{ all -> 0x010e }
            if (r0 != 0) goto L_0x00a7
            X.7Ew r1 = r11.A07     // Catch:{ all -> 0x010e }
            int r0 = X.C121227Ew.A00(r1, r2)     // Catch:{ all -> 0x010e }
            if (r0 < 0) goto L_0x00a7
            X.84Z r4 = X.C121227Ew.A01(r1, r0)     // Catch:{ all -> 0x010e }
            int r3 = r4.size()     // Catch:{ all -> 0x010e }
            r2 = 0
        L_0x0097:
            if (r2 >= r3) goto L_0x00a7
            java.lang.Object r1 = r4.A01(r2)     // Catch:{ all -> 0x010e }
            X.84Z r0 = r11.A05     // Catch:{ all -> 0x010e }
            r0.add(r1)     // Catch:{ all -> 0x010e }
            int r2 = r2 + 1
            r16 = 1
            goto L_0x0097
        L_0x00a7:
            int r12 = r12 + 1
            goto L_0x0062
        L_0x00aa:
            X.7Ew r1 = r11.A07     // Catch:{ all -> 0x010e }
            int r0 = X.C121227Ew.A00(r1, r14)     // Catch:{ all -> 0x010e }
            if (r0 < 0) goto L_0x003a
            X.84Z r4 = X.C121227Ew.A01(r1, r0)     // Catch:{ all -> 0x010e }
            int r3 = r4.size()     // Catch:{ all -> 0x010e }
            r2 = 0
        L_0x00bb:
            if (r2 >= r3) goto L_0x003a
            java.lang.Object r1 = r4.A01(r2)     // Catch:{ all -> 0x010e }
            X.84Z r0 = r11.A05     // Catch:{ all -> 0x010e }
            r0.add(r1)     // Catch:{ all -> 0x010e }
            int r2 = r2 + 1
            r16 = 1
            goto L_0x00bb
        L_0x00cb:
            if (r16 != 0) goto L_0x00d3
            r0 = r19
            r19 = 0
            if (r0 == 0) goto L_0x00d5
        L_0x00d3:
            r19 = 1
        L_0x00d5:
            int r10 = r10 + 1
            if (r10 < r5) goto L_0x0030
        L_0x00d9:
            monitor-exit(r8)
            goto L_0x000e
        L_0x00dc:
            boolean r0 = r5 instanceof java.util.List
            if (r0 == 0) goto L_0x0107
            r3 = r5
            java.util.List r3 = (java.util.List) r3
            java.lang.Object r6 = r3.get(r7)
            java.util.Set r6 = (java.util.Set) r6
            int r0 = r3.size()
            r2 = 1
            r1 = 2
            if (r0 != r1) goto L_0x00f7
            java.lang.Object r4 = r3.get(r2)
            goto L_0x001e
        L_0x00f7:
            int r0 = r3.size()
            if (r0 <= r1) goto L_0x001e
            int r0 = r3.size()
            java.util.List r4 = r3.subList(r2, r0)
            goto L_0x001e
        L_0x0107:
            java.lang.String r0 = "Unexpected notification"
            X.AnonymousClass7J4.A02(r0)
            throw r4
        L_0x010d:
            return r19
        L_0x010e:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass78y.A00(X.78y):boolean");
    }

    public final void A01() {
        AnonymousClass84X r8 = this.A04;
        synchronized (r8) {
            int i = r8.A00;
            if (i > 0) {
                int i2 = 0;
                Object[] objArr = r8.A01;
                do {
                    C111226mz r5 = (C111226mz) objArr[i2];
                    r5.A07.A02();
                    AnonymousClass7EA r4 = r5.A04;
                    r4.A00 = 0;
                    Object[] objArr2 = r4.A01;
                    Arrays.fill(objArr2, 0, objArr2.length, (Object) null);
                    Object[] objArr3 = r4.A02;
                    Arrays.fill(objArr3, 0, objArr3.length, (Object) null);
                    r5.A06.A02();
                    r5.A08.clear();
                    i2++;
                } while (i2 < i);
            }
        }
    }

    public AnonymousClass78y(AnonymousClass0YY r3) {
        this.A06 = r3;
    }
}
