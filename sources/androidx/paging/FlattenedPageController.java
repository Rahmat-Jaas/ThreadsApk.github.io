package androidx.paging;

import X.C110556ls;
import X.C25549Dnh;

public final class FlattenedPageController {
    public int A00 = -1;
    public final C110556ls A01 = new C110556ls();
    public final C25549Dnh A02 = new C25549Dnh();

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x005f A[Catch:{ all -> 0x014d }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00ac A[Catch:{ all -> 0x014d }] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(X.AnonymousClass3I2 r10, X.C146958n9 r11) {
        /*
            r9 = this;
            r4 = 6
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape1S0501000_I2.A00(r4, r11)
            if (r0 == 0) goto L_0x0031
            r3 = r11
            kotlin.coroutines.jvm.internal.KtCImplShape1S0501000_I2 r3 = (kotlin.coroutines.jvm.internal.KtCImplShape1S0501000_I2) r3
            int r2 = r3.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0031
            int r2 = r2 - r1
            r3.A00 = r2
        L_0x0015:
            java.lang.Object r2 = r3.A04
            X.D0E r1 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r3.A00
            r5 = 0
            r8 = 1
            if (r0 == 0) goto L_0x003c
            if (r0 != r8) goto L_0x0037
            java.lang.Object r4 = r3.A03
            X.Dnh r4 = (X.C25549Dnh) r4
            java.lang.Object r10 = r3.A02
            X.3I2 r10 = (X.AnonymousClass3I2) r10
            java.lang.Object r1 = r3.A01
            androidx.paging.FlattenedPageController r1 = (androidx.paging.FlattenedPageController) r1
            X.AnonymousClass0OU.A00(r2)
            goto L_0x004b
        L_0x0031:
            kotlin.coroutines.jvm.internal.KtCImplShape1S0501000_I2 r3 = new kotlin.coroutines.jvm.internal.KtCImplShape1S0501000_I2
            r3.<init>(r9, r11, r4)
            goto L_0x0015
        L_0x0037:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x003c:
            X.AnonymousClass0OU.A00(r2)
            X.Dnh r4 = r9.A02
            X.C86114wI.A1J(r9, r10, r4, r3, r8)
            java.lang.Object r0 = r4.A00(r5, r3)
            if (r0 == r1) goto L_0x0152
            r1 = r9
        L_0x004b:
            int r0 = r10.A00     // Catch:{ all -> 0x014d }
            r1.A00 = r0     // Catch:{ all -> 0x014d }
            X.6ls r2 = r1.A01     // Catch:{ all -> 0x014d }
            java.lang.Object r6 = r10.A01     // Catch:{ all -> 0x014d }
            X.6qx r6 = (X.C113226qx) r6     // Catch:{ all -> 0x014d }
            r7 = 0
            X.C04220Ms.A0B(r6, r7)     // Catch:{ all -> 0x014d }
            r2.A03 = r8     // Catch:{ all -> 0x014d }
            boolean r0 = r6 instanceof androidx.paging.PageEvent$Insert     // Catch:{ all -> 0x014d }
            if (r0 == 0) goto L_0x00ac
            androidx.paging.PageEvent$Insert r6 = (androidx.paging.PageEvent$Insert) r6     // Catch:{ all -> 0x014d }
            X.6vB r1 = r2.A04     // Catch:{ all -> 0x014d }
            X.79c r0 = r6.A03     // Catch:{ all -> 0x014d }
            r1.A03(r0)     // Catch:{ all -> 0x014d }
            X.79c r0 = r6.A02     // Catch:{ all -> 0x014d }
            r2.A02 = r0     // Catch:{ all -> 0x014d }
            X.67E r0 = r6.A04     // Catch:{ all -> 0x014d }
            int r1 = r0.ordinal()     // Catch:{ all -> 0x014d }
            if (r1 == r8) goto L_0x0083
            r0 = 2
            if (r1 == r0) goto L_0x007b
            if (r1 != r7) goto L_0x0147
            goto L_0x0135
        L_0x007b:
            int r0 = r6.A00     // Catch:{ all -> 0x014d }
            r2.A00 = r0     // Catch:{ all -> 0x014d }
            X.8AL r1 = r2.A05     // Catch:{ all -> 0x014d }
            goto L_0x0142
        L_0x0083:
            int r0 = r6.A01     // Catch:{ all -> 0x014d }
            r2.A01 = r0     // Catch:{ all -> 0x014d }
            java.util.List r6 = r6.A05     // Catch:{ all -> 0x014d }
            int r0 = X.C86144wL.A0C(r6, r8)     // Catch:{ all -> 0x014d }
            X.7yc r0 = X.AnonymousClass8bI.A09(r0, r7)     // Catch:{ all -> 0x014d }
            java.util.Iterator r3 = r0.iterator()     // Catch:{ all -> 0x014d }
        L_0x0095:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x014d }
            if (r0 == 0) goto L_0x0147
            r0 = r3
            X.83z r0 = (X.C1367083z) r0     // Catch:{ all -> 0x014d }
            int r0 = r0.A00()     // Catch:{ all -> 0x014d }
            X.8AL r1 = r2.A05     // Catch:{ all -> 0x014d }
            java.lang.Object r0 = r6.get(r0)     // Catch:{ all -> 0x014d }
            r1.A0W(r0)     // Catch:{ all -> 0x014d }
            goto L_0x0095
        L_0x00ac:
            boolean r0 = r6 instanceof X.AnonymousClass59N     // Catch:{ all -> 0x014d }
            if (r0 == 0) goto L_0x00f6
            X.59N r6 = (X.AnonymousClass59N) r6     // Catch:{ all -> 0x014d }
            X.6vB r3 = r2.A04     // Catch:{ all -> 0x014d }
            X.67E r1 = r6.A03     // Catch:{ all -> 0x014d }
            X.59K r0 = X.AnonymousClass59K.A01     // Catch:{ all -> 0x014d }
            r3.A02(r0, r1)     // Catch:{ all -> 0x014d }
            int r1 = r1.ordinal()     // Catch:{ all -> 0x014d }
            r3 = 0
            if (r1 == r8) goto L_0x00e1
            r0 = 2
            if (r1 != r0) goto L_0x00da
            int r0 = r6.A02     // Catch:{ all -> 0x014d }
            r2.A00 = r0     // Catch:{ all -> 0x014d }
            int r1 = r6.A00     // Catch:{ all -> 0x014d }
            int r0 = r6.A01     // Catch:{ all -> 0x014d }
            int r1 = r1 - r0
            int r1 = r1 + 1
        L_0x00d0:
            if (r3 >= r1) goto L_0x0147
            X.8AL r0 = r2.A05     // Catch:{ all -> 0x014d }
            r0.A0V()     // Catch:{ all -> 0x014d }
            int r3 = r3 + 1
            goto L_0x00d0
        L_0x00da:
            java.lang.String r0 = "Page drop type must be prepend or append"
            java.lang.IllegalArgumentException r0 = X.C18190wL.A0a(r0)     // Catch:{ all -> 0x014d }
            throw r0     // Catch:{ all -> 0x014d }
        L_0x00e1:
            int r0 = r6.A02     // Catch:{ all -> 0x014d }
            r2.A01 = r0     // Catch:{ all -> 0x014d }
            int r1 = r6.A00     // Catch:{ all -> 0x014d }
            int r0 = r6.A01     // Catch:{ all -> 0x014d }
            int r1 = r1 - r0
            int r1 = r1 + 1
        L_0x00ec:
            if (r3 >= r1) goto L_0x0147
            X.8AL r0 = r2.A05     // Catch:{ all -> 0x014d }
            r0.A0U()     // Catch:{ all -> 0x014d }
            int r3 = r3 + 1
            goto L_0x00ec
        L_0x00f6:
            boolean r0 = r6 instanceof X.AnonymousClass59L     // Catch:{ all -> 0x014d }
            if (r0 == 0) goto L_0x0108
            X.59L r6 = (X.AnonymousClass59L) r6     // Catch:{ all -> 0x014d }
            X.6vB r1 = r2.A04     // Catch:{ all -> 0x014d }
            X.79c r0 = r6.A01     // Catch:{ all -> 0x014d }
            r1.A03(r0)     // Catch:{ all -> 0x014d }
            X.79c r0 = r6.A00     // Catch:{ all -> 0x014d }
            r2.A02 = r0     // Catch:{ all -> 0x014d }
            goto L_0x0147
        L_0x0108:
            boolean r0 = r6 instanceof androidx.paging.PageEvent$StaticList     // Catch:{ all -> 0x014d }
            if (r0 == 0) goto L_0x0147
            androidx.paging.PageEvent$StaticList r6 = (androidx.paging.PageEvent$StaticList) r6     // Catch:{ all -> 0x014d }
            X.79c r1 = r6.A01     // Catch:{ all -> 0x014d }
            if (r1 == 0) goto L_0x0117
            X.6vB r0 = r2.A04     // Catch:{ all -> 0x014d }
            r0.A03(r1)     // Catch:{ all -> 0x014d }
        L_0x0117:
            X.79c r0 = r6.A00     // Catch:{ all -> 0x014d }
            if (r0 == 0) goto L_0x011d
            r2.A02 = r0     // Catch:{ all -> 0x014d }
        L_0x011d:
            X.8AL r3 = r2.A05     // Catch:{ all -> 0x014d }
            r3.clear()     // Catch:{ all -> 0x014d }
            r2.A00 = r7     // Catch:{ all -> 0x014d }
            r2.A01 = r7     // Catch:{ all -> 0x014d }
            java.util.List r2 = r6.A02     // Catch:{ all -> 0x014d }
            int[] r1 = new int[]{r7}     // Catch:{ all -> 0x014d }
            X.79m r0 = new X.79m     // Catch:{ all -> 0x014d }
            r0.<init>(r2, r5, r1, r7)     // Catch:{ all -> 0x014d }
            r3.add(r0)     // Catch:{ all -> 0x014d }
            goto L_0x0147
        L_0x0135:
            X.8AL r1 = r2.A05     // Catch:{ all -> 0x014d }
            r1.clear()     // Catch:{ all -> 0x014d }
            int r0 = r6.A00     // Catch:{ all -> 0x014d }
            r2.A00 = r0     // Catch:{ all -> 0x014d }
            int r0 = r6.A01     // Catch:{ all -> 0x014d }
            r2.A01 = r0     // Catch:{ all -> 0x014d }
        L_0x0142:
            java.util.List r0 = r6.A05     // Catch:{ all -> 0x014d }
            r1.addAll(r0)     // Catch:{ all -> 0x014d }
        L_0x0147:
            kotlin.Unit r1 = kotlin.Unit.A00     // Catch:{ all -> 0x014d }
            r4.A02(r5)
            return r1
        L_0x014d:
            r0 = move-exception
            r4.A02(r5)
            throw r0
        L_0x0152:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.FlattenedPageController.A00(X.3I2, X.8n9):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x004d A[Catch:{ all -> 0x00b3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0067 A[Catch:{ all -> 0x00b3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0080 A[Catch:{ all -> 0x00b3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A01(X.C146958n9 r14) {
        /*
            r13 = this;
            r3 = 7
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape0S0401000_I2.A00(r3, r14)
            if (r0 == 0) goto L_0x002d
            r5 = r14
            kotlin.coroutines.jvm.internal.KtCImplShape0S0401000_I2 r5 = (kotlin.coroutines.jvm.internal.KtCImplShape0S0401000_I2) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x002d
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x0015:
            java.lang.Object r4 = r5.A03
            X.D0E r8 = X.D0E.COROUTINE_SUSPENDED
            int r1 = r5.A00
            r3 = 0
            r0 = 1
            if (r1 == 0) goto L_0x0038
            if (r1 != r0) goto L_0x0033
            java.lang.Object r2 = r5.A02
            X.Dnh r2 = (X.C25549Dnh) r2
            java.lang.Object r5 = r5.A01
            androidx.paging.FlattenedPageController r5 = (androidx.paging.FlattenedPageController) r5
            X.AnonymousClass0OU.A00(r4)
            goto L_0x0047
        L_0x002d:
            kotlin.coroutines.jvm.internal.KtCImplShape0S0401000_I2 r5 = new kotlin.coroutines.jvm.internal.KtCImplShape0S0401000_I2
            r5.<init>(r13, r14, r3)
            goto L_0x0015
        L_0x0033:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x0038:
            X.AnonymousClass0OU.A00(r4)
            X.Dnh r2 = r13.A02
            X.C86124wJ.A1S(r13, r2, r5, r0)
            java.lang.Object r0 = r2.A00(r3, r5)
            if (r0 == r8) goto L_0x00b8
            r5 = r13
        L_0x0047:
            X.6ls r6 = r5.A01     // Catch:{ all -> 0x00b3 }
            boolean r0 = r6.A03     // Catch:{ all -> 0x00b3 }
            if (r0 != 0) goto L_0x0080
            X.0ZV r4 = X.AnonymousClass0ZV.A00     // Catch:{ all -> 0x00b3 }
        L_0x004f:
            int r1 = r5.A00     // Catch:{ all -> 0x00b3 }
            int r0 = r4.size()     // Catch:{ all -> 0x00b3 }
            int r1 = r1 - r0
            int r7 = r1 + 1
            java.util.ArrayList r8 = X.AnonymousClass0wJ.A0w(r4)     // Catch:{ all -> 0x00b3 }
            r6 = 0
            java.util.Iterator r5 = r4.iterator()     // Catch:{ all -> 0x00b3 }
        L_0x0061:
            boolean r0 = r5.hasNext()     // Catch:{ all -> 0x00b3 }
            if (r0 == 0) goto L_0x00af
            java.lang.Object r4 = r5.next()     // Catch:{ all -> 0x00b3 }
            int r1 = r6 + 1
            if (r6 >= 0) goto L_0x0073
            X.C06750aI.A1A()     // Catch:{ all -> 0x00b3 }
            throw r3     // Catch:{ all -> 0x00b3 }
        L_0x0073:
            X.6qx r4 = (X.C113226qx) r4     // Catch:{ all -> 0x00b3 }
            int r6 = r6 + r7
            X.3I2 r0 = new X.3I2     // Catch:{ all -> 0x00b3 }
            r0.<init>(r6, r4)     // Catch:{ all -> 0x00b3 }
            r8.add(r0)     // Catch:{ all -> 0x00b3 }
            r6 = r1
            goto L_0x0061
        L_0x0080:
            java.util.ArrayList r4 = X.AnonymousClass0wJ.A0v()     // Catch:{ all -> 0x00b3 }
            X.6vB r0 = r6.A04     // Catch:{ all -> 0x00b3 }
            X.79c r7 = r0.A01()     // Catch:{ all -> 0x00b3 }
            X.8AL r1 = r6.A05     // Catch:{ all -> 0x00b3 }
            boolean r0 = X.C18250wR.A1K(r1)     // Catch:{ all -> 0x00b3 }
            if (r0 == 0) goto L_0x00a7
            java.util.List r10 = X.AnonymousClass00J.A0N(r1)     // Catch:{ all -> 0x00b3 }
            int r11 = r6.A01     // Catch:{ all -> 0x00b3 }
            int r12 = r6.A00     // Catch:{ all -> 0x00b3 }
            X.79c r8 = r6.A02     // Catch:{ all -> 0x00b3 }
            X.67E r9 = X.AnonymousClass67E.REFRESH     // Catch:{ all -> 0x00b3 }
            androidx.paging.PageEvent$Insert r6 = new androidx.paging.PageEvent$Insert     // Catch:{ all -> 0x00b3 }
            r6.<init>(r7, r8, r9, r10, r11, r12)     // Catch:{ all -> 0x00b3 }
        L_0x00a3:
            r4.add(r6)     // Catch:{ all -> 0x00b3 }
            goto L_0x004f
        L_0x00a7:
            X.79c r0 = r6.A02     // Catch:{ all -> 0x00b3 }
            X.59L r6 = new X.59L     // Catch:{ all -> 0x00b3 }
            r6.<init>(r7, r0)     // Catch:{ all -> 0x00b3 }
            goto L_0x00a3
        L_0x00af:
            r2.A02(r3)
            return r8
        L_0x00b3:
            r0 = move-exception
            r2.A02(r3)
            throw r0
        L_0x00b8:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.FlattenedPageController.A01(X.8n9):java.lang.Object");
    }
}
