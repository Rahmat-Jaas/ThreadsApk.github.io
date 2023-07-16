package X;

/* renamed from: X.2Ro  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C36502Ro {
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00e8, code lost:
        if (r0 == null) goto L_0x00ea;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ com.instagram.nux.aymh.responsehandlers.HandlerExecutorAndBuilder A00(X.C62903b6 r15, X.C209216q r16, X.C07530bf r17, java.lang.Integer r18, int r19, int r20, boolean r21, boolean r22) {
        /*
            r12 = r19
            r11 = r18
            r10 = 0
            r3 = r20
            r0 = r20 & 16
            r1 = r21
            boolean r14 = X.C18240wQ.A1R(r0, r1)
            r0 = r20 & 64
            r1 = r22
            boolean r13 = X.C18240wQ.A1R(r0, r1)
            r0 = r3 & 128(0x80, float:1.794E-43)
            r2 = 0
            if (r0 == 0) goto L_0x001d
            r11 = r10
        L_0x001d:
            r0 = r3 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x0022
            r12 = 1
        L_0x0022:
            r0 = r3 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x0091
            android.content.Context r4 = X.C10600ic.A00
            X.C04220Ms.A06(r4)
        L_0x002b:
            r0 = r3 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L_0x0031
            X.265 r10 = X.AnonymousClass265.A0G
        L_0x0031:
            r8 = r16
            boolean r3 = X.AnonymousClass0wJ.A1Z(r8, r15)
            r0 = 3
            r9 = r17
            X.C04220Ms.A0B(r9, r0)
            r0 = 9
            X.C18240wQ.A1J(r4, r0, r10)
            boolean r1 = r15 instanceof X.AnonymousClass1jA
            if (r1 == 0) goto L_0x008b
            r0 = r15
            X.1jA r0 = (X.AnonymousClass1jA) r0
            java.lang.Object r0 = r0.A00
            X.1TP r0 = (X.AnonymousClass1TP) r0
            X.3IO r0 = X.C36492Rn.A00(r0)
            X.1jA r7 = X.AnonymousClass1jA.A00(r0)
        L_0x0055:
            android.content.Context r6 = X.C18230wP.A09(r4)
            X.3DH r5 = new X.3DH
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14)
            if (r1 == 0) goto L_0x00a6
            X.16q r0 = r5.A03
            java.lang.Integer r2 = r0.A01
            java.lang.Integer r0 = X.AnonymousClass006.A0C
            if (r2 == r0) goto L_0x00c1
            java.lang.Integer r0 = X.AnonymousClass006.A0N
            if (r2 == r0) goto L_0x00c1
            java.lang.Integer r0 = X.AnonymousClass006.A0Y
            if (r2 == r0) goto L_0x00c1
            r1 = 42
            kotlin.jvm.internal.KtLambdaShape160S0100000_I2_15 r0 = new kotlin.jvm.internal.KtLambdaShape160S0100000_I2_15
            r0.<init>(r5, r1)
            com.instagram.nux.aymh.responsehandlers.HandlerExecutorAndBuilder r3 = new com.instagram.nux.aymh.responsehandlers.HandlerExecutorAndBuilder
            r3.<init>()
            r0.invoke(r3)
            int r0 = r2.intValue()
            switch(r0) {
                case 0: goto L_0x0097;
                case 1: goto L_0x01ab;
                case 2: goto L_0x0097;
                case 3: goto L_0x0097;
                case 4: goto L_0x0097;
                case 5: goto L_0x01ba;
                case 6: goto L_0x01ba;
                case 7: goto L_0x01ba;
                case 8: goto L_0x01ab;
                case 9: goto L_0x0093;
                default: goto L_0x0086;
            }
        L_0x0086:
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        L_0x008b:
            boolean r0 = r15 instanceof X.AnonymousClass1jB
            if (r0 == 0) goto L_0x01c0
            r7 = r15
            goto L_0x0055
        L_0x0091:
            r4 = r10
            goto L_0x002b
        L_0x0093:
            X.4Ek r0 = X.C63033bM.A09
            goto L_0x01b7
        L_0x0097:
            java.lang.String r1 = "Unexpected resolvable account type received: "
            java.lang.String r0 = X.C59973Nd.A00(r2)
            java.lang.String r0 = X.AnonymousClass00U.A0L(r1, r0)
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r0)
            throw r0
        L_0x00a6:
            boolean r0 = r15 instanceof X.AnonymousClass1jB
            if (r0 == 0) goto L_0x01bb
            X.16q r1 = r5.A03
            java.lang.Integer r4 = r1.A01
            X.3b6 r0 = r5.A02
            java.lang.Object r0 = X.C59983Ne.A00(r0)
            X.2L8 r0 = (X.AnonymousClass2L8) r0
            X.3GF r0 = X.C67323zM.A02(r0)
            boolean r0 = r0.A09
            if (r0 == 0) goto L_0x011c
            r1 = 43
            goto L_0x00ec
        L_0x00c1:
            X.3b6 r1 = r5.A02
            boolean r0 = r1 instanceof X.AnonymousClass1jA
            if (r0 == 0) goto L_0x0110
            X.1jA r1 = (X.AnonymousClass1jA) r1
            java.lang.Object r4 = r1.A00
            X.3IO r4 = (X.AnonymousClass3IO) r4
            if (r4 == 0) goto L_0x0119
            com.instagram.user.model.User r0 = r4.A01()
            if (r0 == 0) goto L_0x0119
            boolean r2 = r4 instanceof X.C27241sC
            if (r2 == 0) goto L_0x0103
            r0 = 0
        L_0x00da:
            if (r0 != r3) goto L_0x00ea
            if (r2 == 0) goto L_0x00fa
            X.1sC r4 = (X.C27241sC) r4
            X.0Oa r0 = r4.A08
            java.lang.String r0 = X.C18200wM.A0q(r0)
        L_0x00e6:
            r1 = 44
            if (r0 != 0) goto L_0x00ec
        L_0x00ea:
            r1 = 45
        L_0x00ec:
            kotlin.jvm.internal.KtLambdaShape160S0100000_I2_15 r0 = new kotlin.jvm.internal.KtLambdaShape160S0100000_I2_15
            r0.<init>(r5, r1)
            com.instagram.nux.aymh.responsehandlers.HandlerExecutorAndBuilder r3 = new com.instagram.nux.aymh.responsehandlers.HandlerExecutorAndBuilder
            r3.<init>()
            r0.invoke(r3)
            return r3
        L_0x00fa:
            X.1sB r4 = (X.C27231sB) r4
            X.0Oa r0 = r4.A08
            java.lang.String r0 = X.C18200wM.A0q(r0)
            goto L_0x00e6
        L_0x0103:
            r0 = r4
            X.1sB r0 = (X.C27231sB) r0
            X.1qz r0 = r0.A00
            int r1 = r0.A00
            r0 = 4
            boolean r0 = X.AnonymousClass0wJ.A1T(r1, r0)
            goto L_0x00da
        L_0x0110:
            boolean r0 = r1 instanceof X.AnonymousClass1jB
            if (r0 != 0) goto L_0x0119
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        L_0x0119:
            r1 = 46
            goto L_0x00ec
        L_0x011c:
            boolean r0 = r5.A07
            if (r0 == 0) goto L_0x012e
            java.lang.String r0 = r1.A03
            if (r0 != 0) goto L_0x0129
            com.instagram.nux.aymh.responsehandlers.HandlerExecutorAndBuilder r3 = X.C62483a6.A00(r5)
            return r3
        L_0x0129:
            com.instagram.nux.aymh.responsehandlers.HandlerExecutorAndBuilder r3 = X.C62483a6.A01(r5)
            return r3
        L_0x012e:
            java.lang.Integer r0 = X.AnonymousClass006.A0C
            if (r4 == r0) goto L_0x018a
            java.lang.Integer r0 = X.AnonymousClass006.A0N
            if (r4 == r0) goto L_0x018a
            java.lang.Integer r0 = X.AnonymousClass006.A0Y
            if (r4 == r0) goto L_0x018a
            java.lang.Integer r0 = X.AnonymousClass006.A1L
            if (r4 != r0) goto L_0x0167
            com.instagram.nux.aymh.responsehandlers.HandlerExecutorAndBuilder r3 = X.C62483a6.A00(r5)
            X.4Ek r0 = X.C63033bM.A08
            r3.A02(r0)
        L_0x0147:
            r1 = 25
            kotlin.coroutines.jvm.internal.KtSLambdaShape0S0000000_I2 r0 = new kotlin.coroutines.jvm.internal.KtSLambdaShape0S0000000_I2
            r0.<init>(r1, r2)
            X.4Ej r1 = new X.4Ej
            r1.<init>(r0)
            X.4Ek r0 = new X.4Ek
            r0.<init>(r1)
            r3.A02(r0)
            int r0 = r4.intValue()
            switch(r0) {
                case 0: goto L_0x01ba;
                case 1: goto L_0x0175;
                case 2: goto L_0x017b;
                case 3: goto L_0x017b;
                case 4: goto L_0x017b;
                case 5: goto L_0x01ba;
                case 6: goto L_0x0178;
                case 7: goto L_0x0178;
                case 8: goto L_0x0175;
                case 9: goto L_0x01ba;
                default: goto L_0x0162;
            }
        L_0x0162:
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        L_0x0167:
            java.lang.Integer r0 = X.AnonymousClass006.A00
            if (r4 != r0) goto L_0x0170
            com.instagram.nux.aymh.responsehandlers.HandlerExecutorAndBuilder r3 = X.C62483a6.A01(r5)
            goto L_0x0147
        L_0x0170:
            com.instagram.nux.aymh.responsehandlers.HandlerExecutorAndBuilder r3 = X.C62483a6.A00(r5)
            goto L_0x0147
        L_0x0175:
            X.4Ek r0 = X.C63033bM.A07
            goto L_0x01b7
        L_0x0178:
            X.4Ek r0 = X.C63033bM.A0A
            goto L_0x01b7
        L_0x017b:
            java.lang.String r1 = "Unexpected resolvable account type received: "
            java.lang.String r0 = X.C59973Nd.A00(r4)
            java.lang.String r0 = X.AnonymousClass00U.A0L(r1, r0)
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r0)
            throw r0
        L_0x018a:
            com.instagram.nux.aymh.responsehandlers.HandlerExecutorAndBuilder r3 = X.C62483a6.A00(r5)
            r0 = 24
            kotlin.coroutines.jvm.internal.KtSLambdaShape0S0000000_I2 r1 = new kotlin.coroutines.jvm.internal.KtSLambdaShape0S0000000_I2
            r1.<init>(r0, r2)
            X.4Ej r0 = new X.4Ej
            r0.<init>(r1)
            X.4Ek r2 = new X.4Ek
            r2.<init>(r0)
            java.lang.String r1 = "defaultErrorType"
            X.4Ej r0 = r2.A00
            r0.A00 = r1
            r3.A02(r2)
            X.4Ek r0 = X.C63033bM.A05
            goto L_0x01b7
        L_0x01ab:
            X.4Ek r0 = X.C63033bM.A01
            r3.A02(r0)
            X.4Ek r0 = X.C63033bM.A0F
            r3.A02(r0)
            X.4Ek r0 = X.C63033bM.A0B
        L_0x01b7:
            r3.A02(r0)
        L_0x01ba:
            return r3
        L_0x01bb:
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        L_0x01c0:
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C36502Ro.A00(X.3b6, X.16q, X.0bf, java.lang.Integer, int, int, boolean, boolean):com.instagram.nux.aymh.responsehandlers.HandlerExecutorAndBuilder");
    }
}
