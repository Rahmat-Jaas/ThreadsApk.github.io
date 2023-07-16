package X;

import com.instagram.nux.aymh.responsehandlers.HandlerExecutorAndBuilder;
import kotlin.jvm.internal.KtLambdaShape160S0100000_I2_15;

/* renamed from: X.3a6  reason: invalid class name and case insensitive filesystem */
public final class C62483a6 {
    public static final C62483a6 A00 = new C62483a6();

    public static final HandlerExecutorAndBuilder A00(AnonymousClass3DH r3) {
        C70424Ek r0;
        KtLambdaShape160S0100000_I2_15 ktLambdaShape160S0100000_I2_15 = new KtLambdaShape160S0100000_I2_15(r3, 41);
        HandlerExecutorAndBuilder handlerExecutorAndBuilder = new HandlerExecutorAndBuilder();
        ktLambdaShape160S0100000_I2_15.invoke(handlerExecutorAndBuilder);
        AnonymousClass2L8 r1 = (AnonymousClass2L8) C59983Ne.A00(r3.A02);
        if (r1 instanceof AnonymousClass1j8) {
            r0 = AnonymousClass3XQ.A06;
        } else if (!(r1 instanceof AnonymousClass1j9)) {
            throw AnonymousClass4VZ.A00();
        } else if (C67323zM.A02(r1).A03) {
            r0 = AnonymousClass3XQ.A00;
        } else {
            Integer num = r3.A03.A01;
            if (num == AnonymousClass006.A0C || num == AnonymousClass006.A0Y || num == AnonymousClass006.A0N) {
                r0 = AnonymousClass3XQ.A05;
            } else {
                r0 = AnonymousClass3XQ.A07;
            }
        }
        handlerExecutorAndBuilder.A03(r0);
        return handlerExecutorAndBuilder;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0026, code lost:
        if (r0 != false) goto L_0x0028;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final com.instagram.nux.aymh.responsehandlers.HandlerExecutorAndBuilder A01(X.AnonymousClass3DH r3) {
        /*
            com.instagram.nux.aymh.responsehandlers.HandlerExecutorAndBuilder r2 = A00(r3)
            X.3b6 r1 = r3.A02
            java.lang.Object r0 = X.C59983Ne.A00(r1)
            boolean r0 = r0 instanceof X.AnonymousClass1j9
            java.lang.Object r1 = X.C59983Ne.A00(r1)
            X.2L8 r1 = (X.AnonymousClass2L8) r1
            if (r0 == 0) goto L_0x002e
            X.3GF r1 = X.C67323zM.A02(r1)
            boolean r0 = r3.A07
            if (r0 != 0) goto L_0x0028
            boolean r0 = r1.A02
            if (r0 != 0) goto L_0x0028
            boolean r0 = r1.A05
            if (r0 != 0) goto L_0x0028
            boolean r0 = r1.A06
        L_0x0026:
            if (r0 == 0) goto L_0x002d
        L_0x0028:
            X.4Ek r0 = X.AnonymousClass3XQ.A08
            r2.A03(r0)
        L_0x002d:
            return r2
        L_0x002e:
            boolean r0 = r1 instanceof X.AnonymousClass1j8
            if (r0 == 0) goto L_0x002d
            X.1j8 r1 = (X.AnonymousClass1j8) r1
            java.lang.Throwable r0 = r1.A00
            boolean r0 = r0 instanceof X.AnonymousClass4VY
            goto L_0x0026
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C62483a6.A01(X.3DH):com.instagram.nux.aymh.responsehandlers.HandlerExecutorAndBuilder");
    }
}
