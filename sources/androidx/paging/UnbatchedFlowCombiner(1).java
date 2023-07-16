package androidx.paging;

import X.AnonymousClass0YC;
import X.AnonymousClass6X2;
import X.C25549Dnh;
import X.C27438EnU;
import X.C86034wA;

public final class UnbatchedFlowCombiner {
    public final AnonymousClass0YC A00;
    public final C86034wA A01 = new C27438EnU();
    public final C25549Dnh A02;
    public final Object[] A03;
    public final C86034wA[] A04;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0011, code lost:
        if (((kotlin.coroutines.jvm.internal.KtCImplShape0S0502000_I2) r4).A07 != 1) goto L_0x0013;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00a0 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00a8 A[Catch:{ all -> 0x0107 }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00bd A[Catch:{ all -> 0x0107 }] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00b7 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x00c2 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(java.lang.Object r16, X.C146958n9 r17, int r18) {
        /*
            r15 = this;
            r2 = r16
            r12 = r18
            r11 = 1
            r4 = r17
            boolean r0 = r4 instanceof kotlin.coroutines.jvm.internal.KtCImplShape0S0502000_I2
            if (r0 == 0) goto L_0x0013
            r0 = r4
            kotlin.coroutines.jvm.internal.KtCImplShape0S0502000_I2 r0 = (kotlin.coroutines.jvm.internal.KtCImplShape0S0502000_I2) r0
            int r1 = r0.A07
            r0 = 1
            if (r1 == r11) goto L_0x0014
        L_0x0013:
            r0 = 0
        L_0x0014:
            if (r0 == 0) goto L_0x003f
            r10 = r4
            kotlin.coroutines.jvm.internal.KtCImplShape0S0502000_I2 r10 = (kotlin.coroutines.jvm.internal.KtCImplShape0S0502000_I2) r10
            int r3 = r10.A01
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r1
            if (r0 == 0) goto L_0x003f
            int r3 = r3 - r1
            r10.A01 = r3
        L_0x0024:
            java.lang.Object r1 = r10.A05
            X.D0E r9 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r10.A01
            r8 = 3
            r3 = 2
            r6 = 0
            if (r0 == 0) goto L_0x0066
            if (r0 == r11) goto L_0x005a
            if (r0 == r3) goto L_0x004a
            if (r0 != r8) goto L_0x0045
            java.lang.Object r5 = r10.A03
            X.Dnh r5 = (X.C25549Dnh) r5
            java.lang.Object r7 = r10.A02
            androidx.paging.UnbatchedFlowCombiner r7 = (androidx.paging.UnbatchedFlowCombiner) r7
            goto L_0x00f3
        L_0x003f:
            kotlin.coroutines.jvm.internal.KtCImplShape0S0502000_I2 r10 = new kotlin.coroutines.jvm.internal.KtCImplShape0S0502000_I2
            r10.<init>(r15, r4, r11)
            goto L_0x0024
        L_0x0045:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x004a:
            int r12 = r10.A00
            java.lang.Object r5 = r10.A04
            X.Dnh r5 = (X.C25549Dnh) r5
            java.lang.Object r2 = r10.A03
            java.lang.Object r7 = r10.A02
            androidx.paging.UnbatchedFlowCombiner r7 = (androidx.paging.UnbatchedFlowCombiner) r7
            X.AnonymousClass0OU.A00(r1)
            goto L_0x00a1
        L_0x005a:
            int r12 = r10.A00
            java.lang.Object r2 = r10.A03
            java.lang.Object r7 = r10.A02
            androidx.paging.UnbatchedFlowCombiner r7 = (androidx.paging.UnbatchedFlowCombiner) r7
            X.AnonymousClass0OU.A00(r1)
            goto L_0x008e
        L_0x0066:
            X.AnonymousClass0OU.A00(r1)
            X.4wA[] r1 = r15.A04
            r0 = r1[r18]
            boolean r0 = r0.BSN()
            if (r0 == 0) goto L_0x0084
            X.4wA r0 = r15.A01
            r10.A02 = r15
            r10.A03 = r2
            r10.A00 = r12
            r10.A01 = r11
            java.lang.Object r0 = r0.AA2(r10)
            if (r0 != r9) goto L_0x008d
            return r9
        L_0x0084:
            r1 = r1[r18]
            kotlin.Unit r0 = kotlin.Unit.A00
            X.EfE r1 = (X.C27178EfE) r1
            r1.A0M(r0)
        L_0x008d:
            r7 = r15
        L_0x008e:
            X.Dnh r5 = r7.A02
            r10.A02 = r7
            r10.A03 = r2
            r10.A04 = r5
            r10.A00 = r12
            r10.A01 = r3
            java.lang.Object r0 = r5.A00(r6, r10)
            if (r0 != r9) goto L_0x00a1
            return r9
        L_0x00a1:
            java.lang.Object[] r4 = r7.A03     // Catch:{ all -> 0x0107 }
            int r13 = r4.length     // Catch:{ all -> 0x0107 }
            r14 = 0
            r3 = 0
        L_0x00a6:
            if (r3 >= r13) goto L_0x00b7
            r1 = r4[r3]     // Catch:{ all -> 0x0107 }
            java.lang.Object r0 = X.AnonymousClass6X2.A00     // Catch:{ all -> 0x0107 }
            boolean r0 = X.C18180wK.A1Z(r1, r0)
            if (r0 == 0) goto L_0x00b4
            r3 = 1
            goto L_0x00b8
        L_0x00b4:
            int r3 = r3 + 1
            goto L_0x00a6
        L_0x00b7:
            r3 = 0
        L_0x00b8:
            r4[r12] = r2     // Catch:{ all -> 0x0107 }
            r2 = 0
        L_0x00bb:
            if (r2 >= r13) goto L_0x00c2
            r1 = r4[r2]     // Catch:{ all -> 0x0107 }
            java.lang.Object r0 = X.AnonymousClass6X2.A00     // Catch:{ all -> 0x0107 }
            goto L_0x00c4
        L_0x00c2:
            r0 = 1
            goto L_0x00cb
        L_0x00c4:
            boolean r0 = X.C18180wK.A1Z(r1, r0)
            if (r0 == 0) goto L_0x00d0
            r0 = 0
        L_0x00cb:
            if (r0 == 0) goto L_0x00ff
            if (r3 == 0) goto L_0x00d6
            goto L_0x00d3
        L_0x00d0:
            int r2 = r2 + 1
            goto L_0x00bb
        L_0x00d3:
            X.67D r3 = X.AnonymousClass67D.INITIAL     // Catch:{ all -> 0x0107 }
            goto L_0x00de
        L_0x00d6:
            if (r12 != 0) goto L_0x00d9
            goto L_0x00dc
        L_0x00d9:
            X.67D r3 = X.AnonymousClass67D.OTHER     // Catch:{ all -> 0x0107 }
            goto L_0x00de
        L_0x00dc:
            X.67D r3 = X.AnonymousClass67D.RECEIVER     // Catch:{ all -> 0x0107 }
        L_0x00de:
            X.0YC r2 = r7.A00     // Catch:{ all -> 0x0107 }
            r1 = r4[r14]     // Catch:{ all -> 0x0107 }
            r0 = r4[r11]     // Catch:{ all -> 0x0107 }
            r10.A02 = r7     // Catch:{ all -> 0x0107 }
            r10.A03 = r5     // Catch:{ all -> 0x0107 }
            r10.A04 = r6     // Catch:{ all -> 0x0107 }
            r10.A01 = r8     // Catch:{ all -> 0x0107 }
            java.lang.Object r0 = r2.invoke(r1, r0, r3, r10)     // Catch:{ all -> 0x0107 }
            if (r0 != r9) goto L_0x00f6
            return r9
        L_0x00f3:
            X.AnonymousClass0OU.A00(r1)     // Catch:{ all -> 0x0105 }
        L_0x00f6:
            X.4wA r1 = r7.A01     // Catch:{ all -> 0x0105 }
            kotlin.Unit r0 = kotlin.Unit.A00     // Catch:{ all -> 0x0105 }
            X.EnU r1 = (X.C27438EnU) r1     // Catch:{ all -> 0x0105 }
            r1.A0M(r0)     // Catch:{ all -> 0x0105 }
        L_0x00ff:
            kotlin.Unit r0 = kotlin.Unit.A00     // Catch:{ all -> 0x0105 }
            r5.A02(r6)
            return r0
        L_0x0105:
            r0 = move-exception
            goto L_0x0108
        L_0x0107:
            r0 = move-exception
        L_0x0108:
            r5.A02(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.UnbatchedFlowCombiner.A00(java.lang.Object, X.8n9, int):java.lang.Object");
    }

    public UnbatchedFlowCombiner(AnonymousClass0YC r6) {
        this.A00 = r6;
        int i = 0;
        this.A02 = new C25549Dnh();
        C86034wA[] r2 = new C86034wA[2];
        int i2 = 0;
        do {
            r2[i2] = new C27438EnU();
            i2++;
        } while (i2 < 2);
        this.A04 = r2;
        Object[] objArr = new Object[2];
        do {
            objArr[i] = AnonymousClass6X2.A00;
            i++;
        } while (i < 2);
        this.A03 = objArr;
    }
}
