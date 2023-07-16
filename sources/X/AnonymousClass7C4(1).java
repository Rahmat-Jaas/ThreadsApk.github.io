package X;

/* renamed from: X.7C4  reason: invalid class name */
public final /* synthetic */ class AnonymousClass7C4 {
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0095, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0096, code lost:
        if (r10 != false) goto L_0x0098;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0098, code lost:
        X.AnonymousClass6W2.A00(r0, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x009b, code lost:
        throw r1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0073 A[Catch:{ all -> 0x0095 }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0076 A[Catch:{ all -> 0x0095 }] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x008a A[Catch:{ all -> 0x0095 }] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0092 A[SYNTHETIC, Splitter:B:37:0x0092] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(X.C146958n9 r7, X.C27996Ewk r8, X.C83234r0 r9, boolean r10) {
        /*
            r3 = 6
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape0S0311000_I2.A00(r3, r7)
            if (r0 == 0) goto L_0x002e
            r6 = r7
            kotlin.coroutines.jvm.internal.KtCImplShape0S0311000_I2 r6 = (kotlin.coroutines.jvm.internal.KtCImplShape0S0311000_I2) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x002e
            int r2 = r2 - r1
            r6.A00 = r2
        L_0x0015:
            java.lang.Object r1 = r6.A03
            X.D0E r5 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r6.A00
            r4 = 2
            r3 = 1
            if (r0 == 0) goto L_0x0044
            if (r0 == r3) goto L_0x0039
            if (r0 != r4) goto L_0x0034
            boolean r10 = r6.A04
            java.lang.Object r8 = r6.A02
            X.Ewk r8 = (X.C27996Ewk) r8
            java.lang.Object r9 = r6.A01
            X.4r0 r9 = (X.C83234r0) r9
            goto L_0x0050
        L_0x002e:
            kotlin.coroutines.jvm.internal.KtCImplShape0S0311000_I2 r6 = new kotlin.coroutines.jvm.internal.KtCImplShape0S0311000_I2
            r6.<init>(r3, r7)
            goto L_0x0015
        L_0x0034:
            java.lang.IllegalStateException r1 = X.AnonymousClass0wJ.A0a()
            throw r1
        L_0x0039:
            boolean r10 = r6.A04
            java.lang.Object r8 = r6.A02
            X.Ewk r8 = (X.C27996Ewk) r8
            java.lang.Object r9 = r6.A01
            X.4r0 r9 = (X.C83234r0) r9
            goto L_0x0062
        L_0x0044:
            X.AnonymousClass0OU.A00(r1)
            boolean r0 = r9 instanceof X.AnonymousClass872
            if (r0 == 0) goto L_0x0053
            X.872 r9 = (X.AnonymousClass872) r9
            java.lang.Throwable r1 = r9.A00
        L_0x004f:
            throw r1
        L_0x0050:
            X.AnonymousClass0OU.A00(r1)     // Catch:{ all -> 0x0093 }
        L_0x0053:
            r6.A01 = r9     // Catch:{ all -> 0x0093 }
            r6.A02 = r8     // Catch:{ all -> 0x0093 }
            r6.A04 = r10     // Catch:{ all -> 0x0093 }
            r6.A00 = r3     // Catch:{ all -> 0x0093 }
            java.lang.Object r2 = r8.CZG(r6)     // Catch:{ all -> 0x0093 }
            if (r2 != r5) goto L_0x0069
            goto L_0x009c
        L_0x0062:
            X.AnonymousClass0OU.A00(r1)     // Catch:{ all -> 0x0093 }
            X.7Eh r1 = (X.C121137Eh) r1     // Catch:{ all -> 0x0093 }
            java.lang.Object r2 = r1.A00     // Catch:{ all -> 0x0093 }
        L_0x0069:
            r1 = 0
            boolean r0 = r2 instanceof X.C141488bh     // Catch:{ all -> 0x0093 }
            if (r0 == 0) goto L_0x0076
            r0 = 0
            X.8bh r2 = (X.C141488bh) r2     // Catch:{ all -> 0x0093 }
            if (r2 == 0) goto L_0x0088
            java.lang.Throwable r0 = r2.A00     // Catch:{ all -> 0x0093 }
            goto L_0x0088
        L_0x0076:
            X.C121137Eh.A00(r2)     // Catch:{ all -> 0x0093 }
            r6.A01 = r9     // Catch:{ all -> 0x0093 }
            r6.A02 = r8     // Catch:{ all -> 0x0093 }
            r6.A04 = r10     // Catch:{ all -> 0x0093 }
            r6.A00 = r4     // Catch:{ all -> 0x0093 }
            java.lang.Object r0 = r9.emit(r2, r6)     // Catch:{ all -> 0x0093 }
            if (r0 != r5) goto L_0x0053
            goto L_0x009d
        L_0x0088:
            if (r0 != 0) goto L_0x0092
            if (r10 == 0) goto L_0x008f
            r8.AC7(r1)
        L_0x008f:
            kotlin.Unit r5 = kotlin.Unit.A00
            return r5
        L_0x0092:
            throw r0     // Catch:{ all -> 0x0093 }
        L_0x0093:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0095 }
        L_0x0095:
            r1 = move-exception
            if (r10 == 0) goto L_0x004f
            X.AnonymousClass6W2.A00(r0, r8)
            throw r1
        L_0x009c:
            return r5
        L_0x009d:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7C4.A00(X.8n9, X.Ewk, X.4r0, boolean):java.lang.Object");
    }

    public static final C84714tk A01(C27996Ewk ewk) {
        return new C27463Ent(AnonymousClass006.A00, AnonymousClass869.A00, ewk, -3, true);
    }

    public static final C84714tk A02(C27996Ewk ewk) {
        return new C27463Ent(AnonymousClass006.A00, AnonymousClass869.A00, ewk, -3, false);
    }
}
