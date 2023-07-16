package X;

/* renamed from: X.7C3  reason: invalid class name */
public final class AnonymousClass7C3 {
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A01(X.C146958n9 r8, X.AnonymousClass0YP r9, long r10) {
        /*
            r0 = 5
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape0S0301100_I2.A00(r0, r8)
            if (r0 == 0) goto L_0x0026
            r7 = r8
            kotlin.coroutines.jvm.internal.KtCImplShape0S0301100_I2 r7 = (kotlin.coroutines.jvm.internal.KtCImplShape0S0301100_I2) r7
            int r2 = r7.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0026
            int r2 = r2 - r1
            r7.A00 = r2
        L_0x0015:
            java.lang.Object r0 = r7.A04
            X.D0E r6 = X.D0E.COROUTINE_SUSPENDED
            int r1 = r7.A00
            r5 = 0
            r4 = 1
            if (r1 == 0) goto L_0x0030
            if (r1 != r4) goto L_0x005c
            java.lang.Object r3 = r7.A03
            X.0MJ r3 = (X.AnonymousClass0MJ) r3
            goto L_0x002c
        L_0x0026:
            kotlin.coroutines.jvm.internal.KtCImplShape0S0301100_I2 r7 = new kotlin.coroutines.jvm.internal.KtCImplShape0S0301100_I2
            r7.<init>(r8)
            goto L_0x0015
        L_0x002c:
            X.AnonymousClass0OU.A00(r0)     // Catch:{ 8A0 -> 0x0054 }
            return r0
        L_0x0030:
            X.AnonymousClass0OU.A00(r0)
            r1 = 0
            int r0 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0061
            X.0MJ r3 = X.C86144wL.A17()
            r7.A02 = r9     // Catch:{ 8A0 -> 0x0054 }
            r7.A03 = r3     // Catch:{ 8A0 -> 0x0054 }
            r7.A01 = r10     // Catch:{ 8A0 -> 0x0054 }
            r7.A00 = r4     // Catch:{ 8A0 -> 0x0054 }
            X.8bj r0 = new X.8bj     // Catch:{ 8A0 -> 0x0054 }
            r0.<init>(r7, r10)     // Catch:{ 8A0 -> 0x0054 }
            r3.A00 = r0     // Catch:{ 8A0 -> 0x0054 }
            java.lang.Object r0 = A02(r9, r0)     // Catch:{ 8A0 -> 0x0054 }
            if (r0 != r6) goto L_0x0053
            return r6
        L_0x0053:
            return r0
        L_0x0054:
            r2 = move-exception
            X.8sG r1 = r2.A00
            java.lang.Object r0 = r3.A00
            if (r1 != r0) goto L_0x0060
            return r5
        L_0x005c:
            java.lang.IllegalStateException r2 = X.AnonymousClass0wJ.A0a()
        L_0x0060:
            throw r2
        L_0x0061:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7C3.A01(X.8n9, X.0YP, long):java.lang.Object");
    }

    public static final Object A00(C146958n9 r3, AnonymousClass0YP r4, long j) {
        if (j > 0) {
            return A02(r4, new C141508bj(r3, j));
        }
        throw new AnonymousClass8A0("Timed out immediately", (C148838sG) null);
    }

    public static final Object A02(AnonymousClass0YP r5, C141508bj r6) {
        C145648kq r3;
        Object obj;
        Object A0B;
        C148848sH AOA = r6.A00.getContext().AOA(C148798sC.A00);
        if (!(AOA instanceof C145648kq) || (r3 = (C145648kq) AOA) == null) {
            r3 = AnonymousClass6Z8.A00;
        }
        r6.BQv(new C27430EnM(r3.BQx(r6, r6.A00, r6.A00)));
        boolean z = false;
        try {
            C03940Lk.A03(r5, 2);
            obj = r5.invoke(r6, r6);
        } catch (Throwable th) {
            obj = new C25463Dm5(false, th);
        }
        D0E d0e = D0E.COROUTINE_SUSPENDED;
        if (obj == d0e || (A0B = r6.A0B(obj)) == C25299DjK.A04) {
            return d0e;
        }
        if (!(A0B instanceof C25463Dm5)) {
            return C25299DjK.A00(A0B);
        }
        Throwable th2 = ((C25463Dm5) A0B).A00;
        if (!(th2 instanceof AnonymousClass8A0) || ((AnonymousClass8A0) th2).A00 != r6) {
            z = true;
        }
        if (!z) {
            if (!(obj instanceof C25463Dm5)) {
                return obj;
            }
            th2 = ((C25463Dm5) obj).A00;
        }
        throw th2;
    }
}
