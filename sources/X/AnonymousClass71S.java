package X;

import androidx.compose.ui.Modifier;

/* renamed from: X.71S  reason: invalid class name */
public final class AnonymousClass71S {
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00b8, code lost:
        if (r9 != null) goto L_0x00ba;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C147188nY r20, X.C21982CAs r21, int r22) {
        /*
            r4 = 0
            r3 = r21
            X.C04220Ms.A0B(r3, r4)
            r0 = 436869482(0x1a0a196a, float:2.855826E-23)
            r14 = r20
            r14.Cvd(r0)
            r1 = 2
            r10 = 0
            X.4tk r0 = r3.A01(r10, r4)
            X.CrS r16 = X.C23403CrS.A00
            X.84Y r19 = X.AnonymousClass84Y.A00
            X.0ZV r17 = X.AnonymousClass0ZV.A00
            X.CKl r15 = new X.CKl
            r18 = r17
            r20 = r4
            r21 = r4
            r15.<init>(r16, r17, r18, r19, r20, r21)
            X.4oM r7 = X.AnonymousClass7Aj.A00(r14, r15, r10, r0, r1)
            kotlin.Unit r2 = kotlin.Unit.A00
            r1 = 22
            kotlin.coroutines.jvm.internal.KtSLambdaShape21S0201000_I2_7 r0 = new kotlin.coroutines.jvm.internal.KtSLambdaShape21S0201000_I2_7
            r0.<init>((java.lang.Object) r3, (java.lang.Object) r7, (X.C146958n9) r10, (int) r1)
            X.AnonymousClass7K5.A05(r14, r2, r0)
            r1 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            X.7W3 r8 = X.C147188nY.A0Z(r14, r1)
            java.lang.Object r6 = r8.A13()
            java.lang.Object r0 = X.AnonymousClass7GN.A00
            if (r6 != r0) goto L_0x004c
            X.7Bt r6 = new X.7Bt
            r6.<init>()
            r8.A14(r6)
        L_0x004c:
            X.AnonymousClass7W3.A0w(r8, r4)
            java.lang.Object r2 = X.C147188nY.A0r(r14, r8, r1)
            if (r2 != r0) goto L_0x00bd
            java.lang.Object r0 = r7.getValue()
            X.CKl r0 = (X.C22175CKl) r0
            java.util.List r0 = r0.A03
            java.util.ArrayList r2 = X.AnonymousClass0wJ.A0v()
            java.util.Iterator r1 = r0.iterator()
        L_0x0065:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0081
            java.lang.Object r0 = r1.next()
            X.5HZ r0 = (X.AnonymousClass5HZ) r0
            X.DsH r0 = r0.A00
            X.DZC r0 = r0.A04
            if (r0 == 0) goto L_0x007b
            java.util.List r0 = r0.A0q
            if (r0 != 0) goto L_0x007d
        L_0x007b:
            r0 = r17
        L_0x007d:
            X.C000300e.A0r(r0, r2)
            goto L_0x0065
        L_0x0081:
            java.util.ArrayList r5 = X.AnonymousClass0wJ.A0v()
            java.util.Iterator r2 = r2.iterator()
        L_0x0089:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00a0
            java.lang.Object r1 = r2.next()
            r0 = r1
            com.instagram.user.model.User r0 = (com.instagram.user.model.User) r0
            boolean r0 = r0.BZi()
            if (r0 == 0) goto L_0x0089
            r5.add(r1)
            goto L_0x0089
        L_0x00a0:
            java.util.ArrayList r9 = X.AnonymousClass0wJ.A0w(r5)
            java.util.Iterator r1 = r5.iterator()
        L_0x00a8:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00b2
            X.C18190wL.A1T(r9, r1)
            goto L_0x00a8
        L_0x00b2:
            boolean r0 = r9 instanceof X.AnonymousClass8s7
            r5 = 0
            if (r0 == 0) goto L_0x00e6
            r2 = r9
            if (r9 == 0) goto L_0x00e6
        L_0x00ba:
            r8.A14(r2)
        L_0x00bd:
            X.AnonymousClass7W3.A0w(r8, r4)
            r1 = 9
            kotlin.jvm.internal.KtLambdaShape12S0300000_I2_2 r0 = new kotlin.jvm.internal.KtLambdaShape12S0300000_I2_2
            r0.<init>(r1, r7, r6, r2)
            r18 = 12582912(0xc00000, float:1.7632415E-38)
            r19 = 127(0x7f, float:1.78E-43)
            r21 = 1
            r11 = r10
            r12 = r10
            r13 = r10
            r15 = r10
            r16 = r10
            r17 = r0
            X.C115696vl.A01(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            X.8nW r1 = r14.AKE()
            if (r1 == 0) goto L_0x00e5
            r0 = 15
            r2 = r22
            X.C147178nW.A01(r1, r3, r2, r0)
        L_0x00e5:
            return
        L_0x00e6:
            boolean r1 = r9 instanceof X.AnonymousClass8s6
            r0 = r9
            if (r1 != 0) goto L_0x00ec
            r0 = r5
        L_0x00ec:
            X.8s6 r0 = (X.AnonymousClass8s6) r0
            if (r0 == 0) goto L_0x00f7
            X.MWD r2 = r0.AB8()
            if (r2 == 0) goto L_0x00f7
            goto L_0x00ba
        L_0x00f7:
            X.MWD r2 = X.MWD.A03
            boolean r1 = r9 instanceof java.util.Collection
            X.MW8 r0 = new X.MW8
            if (r1 == 0) goto L_0x010a
            r0.<init>(r2)
            r0.addAll(r9)
            X.MWD r2 = r0.AB8()
            goto L_0x00ba
        L_0x010a:
            r0.<init>(r2)
            X.C000300e.A0r(r9, r0)
            X.MWD r2 = r0.AB8()
            goto L_0x00ba
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass71S.A00(X.8nY, X.CAs, int):void");
    }

    public static final void A01(C147188nY r20, AnonymousClass5Hd r21, int i) {
        AnonymousClass5Hd r3 = r21;
        C04220Ms.A0B(r3, 0);
        C147188nY r4 = r20;
        r4.Cvd(113181521);
        AnonymousClass7I9.A02(r4, (Modifier) null, (C121807If) null, (C114236su) null, (C134817yQ) null, (C121117Ee) null, r3.A00, 0, 0, 0, 0, 0, 4094, 0, 0, false);
        C147178nW AKE = r4.AKE();
        if (AKE != null) {
            C147178nW.A01(AKE, r3, i, 16);
        }
    }
}
