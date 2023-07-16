package X;

import androidx.compose.ui.Modifier;
import kotlin.jvm.internal.KtLambdaShape2S0202000_I2;

/* renamed from: X.6wE  reason: invalid class name and case insensitive filesystem */
public final class C115986wE {
    public static final void A00(C147188nY r12, Modifier modifier, AnonymousClass0YP r14, int i, int i2) {
        int i3;
        Modifier modifier2 = modifier;
        r12.Cvd(-1177876616);
        int i4 = i2;
        int i5 = i2 & 1;
        int i6 = i;
        if (i5 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = C147188nY.A0F(r12, modifier) | i;
        } else {
            i3 = i;
        }
        AnonymousClass0YP r8 = r14;
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= C147188nY.A0A(r12, r14);
        }
        if ((i3 & 91) != 18 || !r12.BCM()) {
            if (i5 != 0) {
                modifier2 = Modifier.A00;
            }
            C123567Xp r7 = C123567Xp.A00;
            int i7 = ((i3 >> 3) & 14) | ((i3 << 3) & 112);
            Object A0p = C147188nY.A0p(r12);
            Object A0n = C147188nY.A0n(r12);
            Object A0m = C147188nY.A0m(r12);
            AnonymousClass0ZU r0 = AnonymousClass74X.A00;
            AnonymousClass0YM A00 = C98236Es.A00(modifier2);
            int A01 = C86114wI.A01(i7);
            AnonymousClass7W3 r2 = (AnonymousClass7W3) r12;
            C147188nY.A0w(r12, r2, r0);
            C147188nY.A0x(r12, AnonymousClass7KP.A02(r12, r7, A0p, A0n, A0m), A00, (A01 >> 3) & 112);
            C86104wH.A1S(r12, r14, A01 >> 9);
            AnonymousClass7W3.A0d(r2);
        } else {
            r12.CuJ();
        }
        C147178nW AKE = r12.AKE();
        if (AKE != null) {
            AKE.D9d(new KtLambdaShape2S0202000_I2(r8, i6, modifier2, i4, 5));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0093, code lost:
        if (r11 == X.AnonymousClass7GN.A00) goto L_0x0095;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(X.C147188nY r16, X.C1200278c r17, X.AnonymousClass0ZU r18, X.AnonymousClass0YP r19, int r20, int r21) {
        /*
            r15 = r17
            r6 = 0
            r3 = r18
            r2 = r19
            X.AnonymousClass0wJ.A1M(r3, r6, r2)
            r0 = -2032877254(0xffffffff86d4c13a, float:-8.002946E-35)
            r5 = r16
            r5.Cvd(r0)
            r18 = r21
            r0 = r21 & 1
            r1 = r20
            if (r0 == 0) goto L_0x0107
            r0 = r20 | 6
        L_0x001c:
            r7 = r21 & 2
            if (r7 == 0) goto L_0x00fc
            r0 = r0 | 48
        L_0x0022:
            r4 = r21 & 4
            if (r4 == 0) goto L_0x00f1
            r0 = r0 | 384(0x180, float:5.38E-43)
        L_0x0028:
            r4 = r0 & 731(0x2db, float:1.024E-42)
            r0 = 146(0x92, float:2.05E-43)
            if (r4 != r0) goto L_0x004e
            boolean r0 = r5.BCM()
            if (r0 == 0) goto L_0x004e
            r5.CuJ()
        L_0x0037:
            X.8nW r0 = r5.AKE()
            if (r0 == 0) goto L_0x004d
            r19 = 5
            kotlin.jvm.internal.KtLambdaShape3S0302000_I2 r13 = new kotlin.jvm.internal.KtLambdaShape3S0302000_I2
            r14 = r15
            r15 = r3
            r16 = r2
            r17 = r1
            r13.<init>(r14, r15, r16, r17, r18, r19)
            r0.D9d(r13)
        L_0x004d:
            return
        L_0x004e:
            if (r7 == 0) goto L_0x005b
            r8 = 0
            r10 = 7
            X.78c r15 = new X.78c
            r7 = r15
            r9 = r8
            r11 = r6
            r12 = r6
            r7.<init>(r8, r9, r10, r11, r12)
        L_0x005b:
            X.534 r0 = X.AnonymousClass7DA.A05
            java.lang.Object r12 = r5.AEA(r0)
            android.view.View r12 = (android.view.View) r12
            X.8nV r13 = X.C147188nY.A0j(r5)
            java.lang.Object r14 = X.C147188nY.A0n(r5)
            X.69J r14 = (X.AnonymousClass69J) r14
            X.6vH r9 = X.AnonymousClass6EH.A00(r5)
            X.4oM r4 = X.C115806vw.A01(r5, r2)
            java.lang.Object[] r10 = new java.lang.Object[r6]
            r8 = 0
            X.8Fz r7 = X.C138048Fz.A00
            r0 = 6
            java.lang.Object r8 = X.AnonymousClass6EN.A00(r5, r8, r7, r10, r0)
            java.util.UUID r8 = (java.util.UUID) r8
            r0 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            boolean r0 = X.C147188nY.A10(r5, r12, r13, r0)
            r7 = r5
            X.7W3 r7 = (X.AnonymousClass7W3) r7
            java.lang.Object r11 = r7.A13()
            if (r0 != 0) goto L_0x0095
            java.lang.Object r0 = X.AnonymousClass7GN.A00
            if (r11 != r0) goto L_0x00d6
        L_0x0095:
            X.C04220Ms.A04(r8)
            X.52E r11 = new X.52E
            r17 = r3
            r16 = r8
            r11.<init>(r12, r13, r14, r15, r16, r17)
            r0 = 24
            kotlin.jvm.internal.KtLambdaShape167S0100000_I2 r8 = X.C86164wN.A0u(r4, r0)
            r10 = 1
            r4 = 488261145(0x1d1a4619, float:2.041797E-21)
            r0 = 2
            X.C04220Ms.A0B(r8, r0)
            X.7WY r8 = X.AnonymousClass7WY.A01(r8, r4, r10)
            X.54o r4 = r11.A03
            r4.setParentCompositionContext(r9)
            X.8pE r0 = r4.A03
            r0.CrC(r8)
            r4.A00 = r10
            X.6vH r0 = r4.A00
            if (r0 != 0) goto L_0x00d0
            boolean r0 = r4.isAttachedToWindow()
            if (r0 != 0) goto L_0x00d0
            java.lang.String r0 = "createComposition requires either a parent reference or the View to be attachedto a window. Attach the View or call setParentCompositionReference."
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r0)
            throw r0
        L_0x00d0:
            X.C871950n.A02(r4)
            r7.A14(r11)
        L_0x00d6:
            X.AnonymousClass7W3.A0w(r7, r6)
            r0 = 1
            kotlin.jvm.internal.KtLambdaShape148S0100000_I2_3 r0 = X.C86164wN.A0q(r11, r0)
            X.AnonymousClass7K5.A04(r5, r11, r0)
            r7 = 3
            kotlin.jvm.internal.KtLambdaShape4S0400000_I2 r0 = new kotlin.jvm.internal.KtLambdaShape4S0400000_I2
            r6 = r0
            r8 = r11
            r9 = r14
            r10 = r3
            r11 = r15
            r6.<init>(r7, r8, r9, r10, r11)
            X.AnonymousClass7K5.A06(r5, r0)
            goto L_0x0037
        L_0x00f1:
            r4 = r1 & 896(0x380, float:1.256E-42)
            if (r4 != 0) goto L_0x0028
            int r4 = X.C147188nY.A0B(r5, r2)
            r0 = r0 | r4
            goto L_0x0028
        L_0x00fc:
            r4 = r20 & 112(0x70, float:1.57E-43)
            if (r4 != 0) goto L_0x0022
            int r4 = X.C147188nY.A0G(r5, r15)
            r0 = r0 | r4
            goto L_0x0022
        L_0x0107:
            r0 = r20 & 14
            if (r0 != 0) goto L_0x0113
            int r0 = X.C147188nY.A09(r5, r3)
            r0 = r0 | r20
            goto L_0x001c
        L_0x0113:
            r0 = r1
            goto L_0x001c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C115986wE.A01(X.8nY, X.78c, X.0ZU, X.0YP, int, int):void");
    }
}
