package androidx.paging;

import X.C148838sG;
import X.C25549Dnh;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class SingleRunner {
    public final Holder A00;

    public final class Holder {
        public int A00;
        public C148838sG A01;
        public final SingleRunner A02;
        public final C25549Dnh A03 = new C25549Dnh();

        /* JADX WARNING: Code restructure failed: missing block: B:3:0x000b, code lost:
            if (((kotlin.coroutines.jvm.internal.KtCImplShape0S0502000_I2) r11).A07 != 0) goto L_0x000d;
         */
        /* JADX WARNING: Removed duplicated region for block: B:11:0x0029  */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x0059  */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x0083 A[Catch:{ all -> 0x00af }] */
        /* JADX WARNING: Removed duplicated region for block: B:33:0x008f A[Catch:{ all -> 0x00af }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object A01(X.C146958n9 r11, X.C148838sG r12, int r13) {
            /*
                r10 = this;
                r3 = 0
                boolean r0 = r11 instanceof kotlin.coroutines.jvm.internal.KtCImplShape0S0502000_I2
                if (r0 == 0) goto L_0x000d
                r0 = r11
                kotlin.coroutines.jvm.internal.KtCImplShape0S0502000_I2 r0 = (kotlin.coroutines.jvm.internal.KtCImplShape0S0502000_I2) r0
                int r1 = r0.A07
                r0 = 1
                if (r1 == r3) goto L_0x000e
            L_0x000d:
                r0 = 0
            L_0x000e:
                if (r0 == 0) goto L_0x003c
                r8 = r11
                kotlin.coroutines.jvm.internal.KtCImplShape0S0502000_I2 r8 = (kotlin.coroutines.jvm.internal.KtCImplShape0S0502000_I2) r8
                int r2 = r8.A01
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                r0 = r2 & r1
                if (r0 == 0) goto L_0x003c
                int r2 = r2 - r1
                r8.A01 = r2
            L_0x001e:
                java.lang.Object r1 = r8.A05
                X.D0E r7 = X.D0E.COROUTINE_SUSPENDED
                int r0 = r8.A01
                r9 = 2
                r6 = 0
                r5 = 1
                if (r0 == 0) goto L_0x0059
                if (r0 == r5) goto L_0x0047
                if (r0 != r9) goto L_0x0042
                int r13 = r8.A00
                java.lang.Object r4 = r8.A04
                X.Dnh r4 = (X.C25549Dnh) r4
                java.lang.Object r12 = r8.A03
                X.8sG r12 = (X.C148838sG) r12
                java.lang.Object r3 = r8.A02
                androidx.paging.SingleRunner$Holder r3 = (androidx.paging.SingleRunner.Holder) r3
                goto L_0x00a0
            L_0x003c:
                kotlin.coroutines.jvm.internal.KtCImplShape0S0502000_I2 r8 = new kotlin.coroutines.jvm.internal.KtCImplShape0S0502000_I2
                r8.<init>(r10, r11, r3)
                goto L_0x001e
            L_0x0042:
                java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
                throw r0
            L_0x0047:
                int r13 = r8.A00
                java.lang.Object r4 = r8.A04
                X.Dnh r4 = (X.C25549Dnh) r4
                java.lang.Object r12 = r8.A03
                X.8sG r12 = (X.C148838sG) r12
                java.lang.Object r3 = r8.A02
                androidx.paging.SingleRunner$Holder r3 = (androidx.paging.SingleRunner.Holder) r3
                X.AnonymousClass0OU.A00(r1)
                goto L_0x006f
            L_0x0059:
                X.AnonymousClass0OU.A00(r1)
                X.Dnh r4 = r10.A03
                r8.A02 = r10
                r8.A03 = r12
                r8.A04 = r4
                r8.A00 = r13
                r8.A01 = r5
                java.lang.Object r0 = r4.A00(r6, r8)
                if (r0 == r7) goto L_0x00b4
                r3 = r10
            L_0x006f:
                X.8sG r2 = r3.A01     // Catch:{ all -> 0x00af }
                if (r2 == 0) goto L_0x0081
                boolean r0 = r2.isActive()     // Catch:{ all -> 0x00af }
                if (r0 == 0) goto L_0x0081
                int r0 = r3.A00     // Catch:{ all -> 0x00af }
                if (r0 < r13) goto L_0x0081
                if (r0 == r13) goto L_0x0081
                r5 = 0
                goto L_0x00a7
            L_0x0081:
                if (r2 == 0) goto L_0x008d
                androidx.paging.SingleRunner r1 = r3.A02     // Catch:{ all -> 0x00af }
                X.89y r0 = new X.89y     // Catch:{ all -> 0x00af }
                r0.<init>(r1)     // Catch:{ all -> 0x00af }
                r2.AC7(r0)     // Catch:{ all -> 0x00af }
            L_0x008d:
                if (r2 == 0) goto L_0x00a3
                r8.A02 = r3     // Catch:{ all -> 0x00af }
                r8.A03 = r12     // Catch:{ all -> 0x00af }
                r8.A04 = r4     // Catch:{ all -> 0x00af }
                r8.A00 = r13     // Catch:{ all -> 0x00af }
                r8.A01 = r9     // Catch:{ all -> 0x00af }
                java.lang.Object r0 = r2.Ba9(r8)     // Catch:{ all -> 0x00af }
                if (r0 != r7) goto L_0x00a3
                return r7
            L_0x00a0:
                X.AnonymousClass0OU.A00(r1)     // Catch:{ all -> 0x00af }
            L_0x00a3:
                r3.A01 = r12     // Catch:{ all -> 0x00af }
                r3.A00 = r13     // Catch:{ all -> 0x00af }
            L_0x00a7:
                java.lang.Boolean r7 = java.lang.Boolean.valueOf(r5)     // Catch:{ all -> 0x00af }
                r4.A02(r6)
                return r7
            L_0x00af:
                r0 = move-exception
                r4.A02(r6)
                throw r0
            L_0x00b4:
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.paging.SingleRunner.Holder.A01(X.8n9, X.8sG, int):java.lang.Object");
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x003b  */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x004e A[Catch:{ all -> 0x0056 }] */
        /* JADX WARNING: Removed duplicated region for block: B:7:0x0020  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object A00(X.C146958n9 r8, X.C148838sG r9) {
            /*
                r7 = this;
                r3 = 8
                boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape1S0501000_I2.A00(r3, r8)
                if (r0 == 0) goto L_0x0030
                r6 = r8
                kotlin.coroutines.jvm.internal.KtCImplShape1S0501000_I2 r6 = (kotlin.coroutines.jvm.internal.KtCImplShape1S0501000_I2) r6
                int r2 = r6.A00
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                r0 = r2 & r1
                if (r0 == 0) goto L_0x0030
                int r2 = r2 - r1
                r6.A00 = r2
            L_0x0016:
                java.lang.Object r5 = r6.A04
                X.D0E r4 = X.D0E.COROUTINE_SUSPENDED
                int r1 = r6.A00
                r0 = 1
                r3 = 0
                if (r1 == 0) goto L_0x003b
                if (r1 != r0) goto L_0x0036
                java.lang.Object r2 = r6.A03
                X.Dnh r2 = (X.C25549Dnh) r2
                java.lang.Object r9 = r6.A02
                java.lang.Object r1 = r6.A01
                androidx.paging.SingleRunner$Holder r1 = (androidx.paging.SingleRunner.Holder) r1
                X.AnonymousClass0OU.A00(r5)
                goto L_0x004a
            L_0x0030:
                kotlin.coroutines.jvm.internal.KtCImplShape1S0501000_I2 r6 = new kotlin.coroutines.jvm.internal.KtCImplShape1S0501000_I2
                r6.<init>(r7, r8, r3)
                goto L_0x0016
            L_0x0036:
                java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
                throw r0
            L_0x003b:
                X.AnonymousClass0OU.A00(r5)
                X.Dnh r2 = r7.A03
                X.C86114wI.A1J(r7, r9, r2, r6, r0)
                java.lang.Object r0 = r2.A00(r3, r6)
                if (r0 == r4) goto L_0x005b
                r1 = r7
            L_0x004a:
                X.8sG r0 = r1.A01     // Catch:{ all -> 0x0056 }
                if (r9 != r0) goto L_0x0050
                r1.A01 = r3     // Catch:{ all -> 0x0056 }
            L_0x0050:
                kotlin.Unit r4 = kotlin.Unit.A00     // Catch:{ all -> 0x0056 }
                r2.A02(r3)
                return r4
            L_0x0056:
                r0 = move-exception
                r2.A02(r3)
                throw r0
            L_0x005b:
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.paging.SingleRunner.Holder.A00(X.8n9, X.8sG):java.lang.Object");
        }

        public Holder(SingleRunner singleRunner) {
            this.A02 = singleRunner;
        }
    }

    public SingleRunner() {
        this((DefaultConstructorMarker) null, 1, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0048, code lost:
        if (r0 != r2) goto L_0x0051;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0020  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(X.C146958n9 r7, X.AnonymousClass0YY r8) {
        /*
            r6 = this;
            r5 = 0
            r3 = 21
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape1S0301000_I2.A00(r3, r7)
            if (r0 == 0) goto L_0x0025
            r4 = r7
            kotlin.coroutines.jvm.internal.KtCImplShape1S0301000_I2 r4 = (kotlin.coroutines.jvm.internal.KtCImplShape1S0301000_I2) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0025
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0017:
            java.lang.Object r1 = r4.A02
            X.D0E r3 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r4.A00
            r2 = 1
            if (r0 == 0) goto L_0x002e
            if (r0 != r2) goto L_0x004d
            java.lang.Object r2 = r4.A01
            goto L_0x002a
        L_0x0025:
            kotlin.coroutines.jvm.internal.KtCImplShape1S0301000_I2 r4 = X.C86164wN.A0n(r6, r7, r3)
            goto L_0x0017
        L_0x002a:
            X.AnonymousClass0OU.A00(r1)     // Catch:{ 89y -> 0x0045 }
            goto L_0x004a
        L_0x002e:
            X.AnonymousClass0OU.A00(r1)
            r1 = 0
            kotlin.coroutines.jvm.internal.KtSLambdaShape2S0302000_I2 r0 = new kotlin.coroutines.jvm.internal.KtSLambdaShape2S0302000_I2     // Catch:{ 89y -> 0x0042 }
            r0.<init>(r6, r1, r8, r5)     // Catch:{ 89y -> 0x0042 }
            r4.A01 = r6     // Catch:{ 89y -> 0x0042 }
            r4.A00 = r2     // Catch:{ 89y -> 0x0042 }
            java.lang.Object r0 = X.AnonymousClass7Ja.A01(r4, r0)     // Catch:{ 89y -> 0x0042 }
            if (r0 != r3) goto L_0x004a
            return r3
        L_0x0042:
            r1 = move-exception
            r2 = r6
            goto L_0x0046
        L_0x0045:
            r1 = move-exception
        L_0x0046:
            androidx.paging.SingleRunner r0 = r1.A00
            if (r0 != r2) goto L_0x0051
        L_0x004a:
            kotlin.Unit r3 = kotlin.Unit.A00
            return r3
        L_0x004d:
            java.lang.IllegalStateException r1 = X.AnonymousClass0wJ.A0a()
        L_0x0051:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.SingleRunner.A00(X.8n9, X.0YY):java.lang.Object");
    }

    public /* synthetic */ SingleRunner(DefaultConstructorMarker defaultConstructorMarker, int i, boolean z) {
        this.A00 = new Holder(this);
    }
}
