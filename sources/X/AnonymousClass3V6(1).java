package X;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.3V6  reason: invalid class name */
public final class AnonymousClass3V6 {
    public final ConcurrentHashMap A00;
    public final AnonymousClass2LS A01;

    /* JADX WARNING: type inference failed for: r1v5, types: [kotlin.coroutines.jvm.internal.KtSLambdaShape5S0401000_I2_1] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(java.lang.Object r12, X.C146958n9 r13, X.AnonymousClass0YY r14) {
        /*
            r11 = this;
            r2 = r11
            X.2LS r1 = r11.A01
            X.1k8 r0 = X.AnonymousClass1k8.A00
            boolean r0 = X.C04220Ms.A0I(r1, r0)
            r3 = r12
            r4 = r14
            if (r0 == 0) goto L_0x001d
            r5 = 0
            r6 = 3
            kotlin.coroutines.jvm.internal.KtSLambdaShape5S0401000_I2_1 r1 = new kotlin.coroutines.jvm.internal.KtSLambdaShape5S0401000_I2_1
            r1.<init>(r2, r3, r4, r5, r6)
        L_0x0014:
            java.lang.Object r1 = X.AnonymousClass7Ja.A01(r13, r1)
            X.D0E r0 = X.D0E.COROUTINE_SUSPENDED
            if (r1 != r0) goto L_0x0032
            return r1
        L_0x001d:
            X.1k7 r0 = X.AnonymousClass1k7.A00
            boolean r0 = X.C04220Ms.A0I(r1, r0)
            if (r0 == 0) goto L_0x0032
            r9 = 0
            r10 = 39
            kotlin.coroutines.jvm.internal.KtSLambdaShape10S0301000_I2_2 r1 = new kotlin.coroutines.jvm.internal.KtSLambdaShape10S0301000_I2_2
            r5 = r1
            r6 = r14
            r7 = r11
            r8 = r12
            r5.<init>(r6, r7, r8, r9, r10)
            goto L_0x0014
        L_0x0032:
            kotlin.Unit r1 = kotlin.Unit.A00
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3V6.A00(java.lang.Object, X.8n9, X.0YY):java.lang.Object");
    }

    public final void A01() {
        ConcurrentHashMap concurrentHashMap = this.A00;
        for (C148838sG r1 : concurrentHashMap.values()) {
            C04220Ms.A04(r1);
            r1.AC7((CancellationException) null);
        }
        concurrentHashMap.clear();
    }

    public AnonymousClass3V6(AnonymousClass2LS r2) {
        this.A01 = r2;
        this.A00 = new ConcurrentHashMap();
    }

    public AnonymousClass3V6() {
        this(AnonymousClass1k8.A00);
    }
}
