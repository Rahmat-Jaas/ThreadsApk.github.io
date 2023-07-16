package X;

import androidx.compose.ui.Modifier;
import kotlin.jvm.internal.KtLambdaShape1S0211000_I2;

/* renamed from: X.70S  reason: invalid class name */
public final class AnonymousClass70S {
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C147188nY r17, androidx.compose.ui.Modifier r18, X.C115286uo r19, X.C142508ey r20, java.lang.String r21, java.lang.String r22, int r23, int r24, boolean r25) {
        /*
            r13 = r20
            r15 = r22
            r12 = r19
            r2 = r25
            r11 = r18
            r0 = 0
            r14 = r21
            X.C04220Ms.A0B(r14, r0)
            r0 = 341777431(0x145f1c17, float:1.12641626E-26)
            r4 = r17
            r4.Cvd(r0)
            r22 = r24
            r0 = r24 & 1
            r3 = r23
            if (r0 == 0) goto L_0x00e1
            r0 = r23 | 6
        L_0x0022:
            r7 = r24 & 2
            r5 = 16
            if (r7 == 0) goto L_0x00d6
            r0 = r0 | 48
        L_0x002a:
            r6 = r24 & 4
            if (r6 == 0) goto L_0x00cb
            r0 = r0 | 384(0x180, float:5.38E-43)
        L_0x0030:
            r10 = r24 & 8
            if (r10 == 0) goto L_0x00c0
            r0 = r0 | 3072(0xc00, float:4.305E-42)
        L_0x0036:
            r8 = r24 & 16
            if (r8 == 0) goto L_0x003c
            r0 = r0 | 8192(0x2000, float:1.14794E-41)
        L_0x003c:
            r9 = r24 & 32
            if (r9 == 0) goto L_0x00b5
            r1 = 196608(0x30000, float:2.75506E-40)
        L_0x0042:
            r0 = r0 | r1
        L_0x0043:
            if (r8 != r5) goto L_0x0077
            r5 = 374491(0x5b6db, float:5.24774E-40)
            r5 = r5 & r0
            r1 = 74898(0x12492, float:1.04954E-40)
            if (r5 != r1) goto L_0x0077
            boolean r1 = r4.BCM()
            if (r1 == 0) goto L_0x0077
            r4.CuJ()
        L_0x0057:
            X.8nW r1 = r4.AKE()
            if (r1 == 0) goto L_0x0076
            r23 = 2
            kotlin.jvm.internal.KtLambdaShape0S2312000_I2 r0 = new kotlin.jvm.internal.KtLambdaShape0S2312000_I2
            r16 = r11
            r17 = r12
            r18 = r13
            r19 = r14
            r20 = r15
            r21 = r3
            r24 = r2
            r15 = r0
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24)
            r1.D9d(r0)
        L_0x0076:
            return
        L_0x0077:
            if (r7 == 0) goto L_0x007b
            X.7Wm r11 = androidx.compose.ui.Modifier.A00
        L_0x007b:
            r7 = 1
            boolean r2 = X.C86154wM.A1Z(r6, r2)
            r1 = 0
            if (r10 == 0) goto L_0x0084
            r15 = r1
        L_0x0084:
            if (r8 == 0) goto L_0x0087
            r12 = r1
        L_0x0087:
            if (r9 == 0) goto L_0x008a
            r13 = r1
        L_0x008a:
            r5 = r4
            X.7W3 r5 = (X.AnonymousClass7W3) r5
            java.lang.Object r1 = r5.A13()
            java.lang.Object r10 = X.AnonymousClass7GN.A01(r5, r1)
            X.8p3 r10 = (X.C147258p3) r10
            float r16 = X.C18230wP.A00(r2)
            X.534 r5 = X.AnonymousClass6YR.A00
            java.lang.Float r1 = java.lang.Float.valueOf(r16)
            X.7DS[] r5 = X.AnonymousClass7DS.A01(r5, r1, r7)
            r1 = 1921847511(0x728d10d7, float:5.588191E30)
            X.8Sj r9 = new X.8Sj
            r18 = r2
            r17 = r0
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18)
            X.AnonymousClass7JR.A05(r4, r9, r5, r1)
            goto L_0x0057
        L_0x00b5:
            r1 = 458752(0x70000, float:6.42848E-40)
            r1 = r1 & r23
            if (r1 != 0) goto L_0x0043
            int r1 = X.C147188nY.A0K(r4, r13)
            goto L_0x0042
        L_0x00c0:
            r1 = r3 & 7168(0x1c00, float:1.0045E-41)
            if (r1 != 0) goto L_0x0036
            int r1 = X.C147188nY.A0I(r4, r15)
            r0 = r0 | r1
            goto L_0x0036
        L_0x00cb:
            r1 = r3 & 896(0x380, float:1.256E-42)
            if (r1 != 0) goto L_0x0030
            int r1 = X.C147188nY.A0N(r4, r2)
            r0 = r0 | r1
            goto L_0x0030
        L_0x00d6:
            r1 = r23 & 112(0x70, float:1.57E-43)
            if (r1 != 0) goto L_0x002a
            int r1 = X.C147188nY.A0G(r4, r11)
            r0 = r0 | r1
            goto L_0x002a
        L_0x00e1:
            r0 = r23 & 14
            if (r0 != 0) goto L_0x00ed
            int r0 = X.C147188nY.A0F(r4, r14)
            r0 = r0 | r23
            goto L_0x0022
        L_0x00ed:
            r0 = r3
            goto L_0x0022
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass70S.A00(X.8nY, androidx.compose.ui.Modifier, X.6uo, X.8ey, java.lang.String, java.lang.String, int, int, boolean):void");
    }

    public static final void A01(C147188nY r13, Modifier modifier, C142508ey r15, int i, boolean z) {
        int i2;
        C147188nY r3 = r13;
        r13.Cvd(-244966507);
        int i3 = i;
        C142508ey r11 = r15;
        if ((i & 14) == 0) {
            i2 = C147188nY.A0F(r3, r15) | i;
        } else {
            i2 = i3;
        }
        Modifier modifier2 = modifier;
        if ((i & 112) == 0) {
            i2 |= C147188nY.A0G(r3, modifier);
        }
        boolean z2 = z;
        if ((i3 & 896) == 0) {
            i2 |= C147188nY.A0N(r3, z2);
        }
        if ((i2 & 731) != 146 || !r3.BCM()) {
            if (r15 instanceof C132877ue) {
                r3.Cvb(1983655013);
                C132877ue r0 = (C132877ue) r11;
                boolean z3 = r0.A01;
                AnonymousClass0YY r5 = r0.A00;
                int i4 = i2 << 3;
                C120567Bk.A02(r3, modifier2, r5, (i4 & 896) | (i4 & 7168), 0, z3, z2);
            } else if (r15 instanceof C132857uc) {
                r3.Cvb(1983655229);
                C132857uc r02 = (C132857uc) r11;
                AnonymousClass0YY r52 = r02.A00;
                boolean z4 = r02.A01;
                int i5 = i2 << 3;
                AnonymousClass6QV.A00(r3, modifier2, r52, (i5 & 896) | (i5 & 7168), 0, z4, z2);
            } else if (r15 instanceof C132867ud) {
                r3.Cvb(1983655460);
                C132867ud r03 = (C132867ud) r11;
                C101146Qb.A00((C147258p3) null, r3, modifier2, r03.A00, ((i2 >> 3) & 14) | ((i2 << 3) & 7168), 16, r03.A01, z2);
            } else {
                r3.Cvb(1983655965);
            }
            AnonymousClass7W3.A0y(r3);
        } else {
            r3.CuJ();
        }
        C147178nW AKE = r3.AKE();
        if (AKE != null) {
            AKE.D9d(new KtLambdaShape1S0211000_I2(r11, modifier2, i3, 6, z2));
        }
    }
}
