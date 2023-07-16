package com.instagram.fbpay.graphql;

import X.C04220Ms;
import X.C146418mD;
import X.C31580Grx;
import X.C83304rA;
import X.C83334rD;
import java.util.concurrent.Executor;

public final class FBPayIGGraphQLQueryExecutor implements C83304rA {
    public final C31580Grx A00;

    public FBPayIGGraphQLQueryExecutor(C31580Grx grx) {
        C04220Ms.A0B(grx, 1);
        this.A00 = grx;
    }

    public final void AMA(C146418mD r2, C83334rD r3) {
        C04220Ms.A0B(r2, 0);
        this.A00.AMA(r2, r3);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(X.C146418mD r6, X.C146958n9 r7) {
        /*
            r5 = this;
            r3 = 39
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape7S0201000_I2_5.A00(r3, r7)
            if (r0 == 0) goto L_0x0041
            r4 = r7
            kotlin.coroutines.jvm.internal.KtCImplShape7S0201000_I2_5 r4 = (kotlin.coroutines.jvm.internal.KtCImplShape7S0201000_I2_5) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0041
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0016:
            java.lang.Object r3 = r4.A01
            X.D0E r2 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r4.A00
            r1 = 1
            if (r0 == 0) goto L_0x0033
            if (r0 != r1) goto L_0x0077
            X.AnonymousClass0OU.A00(r3)
        L_0x0024:
            X.3b6 r3 = (X.C62903b6) r3
            boolean r0 = r3 instanceof X.AnonymousClass1jA
            if (r0 == 0) goto L_0x0046
            java.lang.Object r0 = X.C62903b6.A06(r3)
            X.7EC r2 = X.AnonymousClass7EC.A00(r0)
            return r2
        L_0x0033:
            X.AnonymousClass0OU.A00(r3)
            X.Grx r0 = r5.A00
            r4.A00 = r1
            java.lang.Object r3 = r0.A06(r6, r4)
            if (r3 != r2) goto L_0x0024
            return r2
        L_0x0041:
            kotlin.coroutines.jvm.internal.KtCImplShape7S0201000_I2_5 r4 = X.C18190wL.A0y(r5, r7, r3)
            goto L_0x0016
        L_0x0046:
            boolean r0 = r3 instanceof X.AnonymousClass1jB
            if (r0 == 0) goto L_0x0072
            X.2L8 r1 = X.AnonymousClass1jB.A00(r3)
            boolean r0 = r1 instanceof X.AnonymousClass1j8
            if (r0 == 0) goto L_0x005b
            X.1j8 r1 = (X.AnonymousClass1j8) r1
            java.lang.Throwable r1 = r1.A00
        L_0x0056:
            X.7EC r2 = X.AnonymousClass7EC.A01(r1)
            return r2
        L_0x005b:
            boolean r0 = r1 instanceof X.AnonymousClass1j9
            if (r0 == 0) goto L_0x006d
            X.1j9 r1 = (X.AnonymousClass1j9) r1
            X.8mT r0 = r1.A00
            java.lang.String r0 = r0.toString()
            java.io.IOException r1 = new java.io.IOException
            r1.<init>(r0)
            goto L_0x0056
        L_0x006d:
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        L_0x0072:
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        L_0x0077:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.fbpay.graphql.FBPayIGGraphQLQueryExecutor.A00(X.8mD, X.8n9):java.lang.Object");
    }

    public final void AMB(C146418mD r2, C83334rD r3, Executor executor) {
        this.A00.AMB(r2, r3, executor);
    }
}
