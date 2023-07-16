package X;

import androidx.compose.ui.Modifier;
import com.facebook.common.dextricks.DalvikInternals;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2210000_I2;
import com.instagram.barcelona.R;
import kotlin.jvm.internal.KtLambdaShape1S0502000_I2;

/* renamed from: X.7Fq  reason: invalid class name and case insensitive filesystem */
public final class C121367Fq {
    public static final void A02(C147188nY r11, Modifier modifier, AnonymousClass67Y r13, C970767v r14, AnonymousClass0ZU r15, AnonymousClass0ZU r16, int i, int i2) {
        int i3;
        Modifier modifier2 = modifier;
        r11.Cvd(1563277778);
        int i4 = i2;
        AnonymousClass0ZU r5 = r15;
        int i5 = i;
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = C147188nY.A09(r11, r15) | i;
        } else {
            i3 = i5;
        }
        AnonymousClass0ZU r7 = r16;
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= C147188nY.A0A(r11, r7);
        }
        C970767v r6 = r14;
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i5 & 896) == 0) {
            i3 |= C147188nY.A0H(r11, r14);
        }
        AnonymousClass67Y r4 = r13;
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i5 & 7168) == 0) {
            i3 |= C147188nY.A0I(r11, r13);
        }
        int i6 = i2 & 16;
        if (i6 != 0) {
            i3 |= DalvikInternals.IOPRIO_BACKGROUND;
        } else if ((57344 & i) == 0) {
            i3 |= C147188nY.A0J(r11, modifier);
        }
        if ((46811 & i3) != 9362 || !r11.BCM()) {
            if (i6 != 0) {
                modifier2 = Modifier.A00;
            }
            int i7 = i3 >> 6;
            boolean A12 = C147188nY.A12(r11, r15, C147188nY.A10(r11, r14, r7, 1618982084));
            AnonymousClass7W3 r2 = (AnonymousClass7W3) r11;
            Object A13 = r2.A13();
            if (A12 || A13 == AnonymousClass7GN.A00) {
                A13 = C86154wM.A15(r14, r15, r7, 38);
                r2.A14(A13);
            }
            AnonymousClass0ZU A08 = AnonymousClass7W3.A08(r2, A13, false);
            int i8 = 2131822004;
            if (r6 == C970767v.UnselectAll) {
                i8 = 2131821997;
            }
            Modifier modifier3 = modifier2;
            C117816zI.A01(r11, modifier3, AnonymousClass7JS.A01(r11, i8), A08, i7 & 896, 8, false, C18180wK.A1Z(r4, AnonymousClass67Y.Loading));
        } else {
            r11.CuJ();
        }
        C147178nW AKE = r11.AKE();
        if (AKE != null) {
            AKE.D9d(new KtLambdaShape1S0502000_I2(r4, r5, r6, r7, modifier2, i5, i4, 5));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004d, code lost:
        if (r3 == false) goto L_0x004f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0098, code lost:
        if ((r29 & 32) != 0) goto L_0x009a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00c2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(X.C147188nY r22, androidx.compose.ui.Modifier r23, X.AnonymousClass582 r24, X.AnonymousClass0ZU r25, X.AnonymousClass0ZU r26, X.AnonymousClass0ZU r27, int r28, int r29, boolean r30) {
        /*
            r9 = r24
            r4 = r23
            r1 = 0
            r10 = r25
            X.C04220Ms.A0B(r10, r1)
            r11 = r26
            r12 = r27
            X.AnonymousClass0wJ.A1O(r11, r12)
            r0 = 440815280(0x1a464eb0, float:4.1009004E-23)
            r15 = r22
            r15.Cvd(r0)
            r22 = r29
            r2 = r29 & 1
            r0 = r28
            if (r2 == 0) goto L_0x0155
            r13 = r28 | 6
        L_0x0023:
            r2 = r29 & 2
            if (r2 == 0) goto L_0x014a
            r13 = r13 | 48
        L_0x0029:
            r2 = r29 & 4
            if (r2 == 0) goto L_0x013f
            r13 = r13 | 384(0x180, float:5.38E-43)
        L_0x002f:
            r2 = r29 & 8
            r14 = r30
            if (r2 == 0) goto L_0x0134
            r13 = r13 | 3072(0xc00, float:4.305E-42)
        L_0x0037:
            r5 = r29 & 16
            if (r5 == 0) goto L_0x0126
            r13 = r13 | 24576(0x6000, float:3.4438E-41)
        L_0x003d:
            r2 = 458752(0x70000, float:6.42848E-40)
            r2 = r2 & r28
            if (r2 != 0) goto L_0x0052
            r2 = r29 & 32
            if (r2 != 0) goto L_0x004f
            boolean r3 = r15.ACY(r9)
            r2 = 131072(0x20000, float:1.83671E-40)
            if (r3 != 0) goto L_0x0051
        L_0x004f:
            r2 = 65536(0x10000, float:9.18355E-41)
        L_0x0051:
            r13 = r13 | r2
        L_0x0052:
            r3 = 374491(0x5b6db, float:5.24774E-40)
            r3 = r3 & r13
            r2 = 74898(0x12492, float:1.04954E-40)
            if (r3 != r2) goto L_0x0083
            boolean r2 = r15.BCM()
            if (r2 == 0) goto L_0x0083
            r15.CuJ()
        L_0x0064:
            X.8nW r1 = r15.AKE()
            if (r1 == 0) goto L_0x0082
            r23 = 3
            kotlin.jvm.internal.KtLambdaShape0S0512000_I2 r15 = new kotlin.jvm.internal.KtLambdaShape0S0512000_I2
            r16 = r10
            r17 = r11
            r18 = r12
            r19 = r4
            r20 = r9
            r21 = r0
            r24 = r14
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24)
            r1.D9d(r15)
        L_0x0082:
            return
        L_0x0083:
            r15.CvD()
            r2 = r28 & 1
            r6 = -458753(0xfffffffffff8ffff, float:NaN)
            if (r2 == 0) goto L_0x00f6
            boolean r2 = r15.Acj()
            if (r2 != 0) goto L_0x00f6
            r15.CuJ()
            r2 = r29 & 32
            if (r2 == 0) goto L_0x009b
        L_0x009a:
            r13 = r13 & r6
        L_0x009b:
            r15.AKA()
            X.4wG r2 = r9.A06
            r25 = 0
            X.4oM r3 = X.AnonymousClass7Aj.A01(r15, r2)
            X.4wG r2 = r9.A07
            X.4oM r6 = X.AnonymousClass7Aj.A01(r15, r2)
            java.lang.Object r2 = r3.getValue()
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1200000_I2 r2 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1200000_I2) r2
            java.lang.Object r7 = r2.A01
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1200000_I2 r7 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1200000_I2) r7
            X.7W3 r3 = X.C147188nY.A0Y(r15)
            java.lang.Object r8 = r3.A13()
            java.lang.Object r2 = X.AnonymousClass7GN.A00
            if (r8 != r2) goto L_0x00ca
            X.75b r8 = new X.75b
            r8.<init>()
            r3.A14(r8)
        L_0x00ca:
            X.AnonymousClass7W3.A0w(r3, r1)
            X.75b r8 = (X.AnonymousClass75b) r8
            long r1 = X.AnonymousClass7KB.A01(r15)
            androidx.compose.ui.Modifier r1 = X.C115656vh.A00(r4, r1)
            androidx.compose.ui.Modifier r24 = X.AnonymousClass7FI.A03(r1)
            long r29 = X.AnonymousClass7KB.A01(r15)
            X.8Sh r5 = new X.8Sh
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r1 = 1836145122(0x6d7159e2, float:4.6684093E27)
            X.8sI r26 = X.AnonymousClass7JR.A00(r15, r5, r1)
            r28 = 26
            r27 = 196608(0x30000, float:2.75506E-40)
            r23 = r15
            X.C117656z2.A00(r23, r24, r25, r26, r27, r28, r29)
            goto L_0x0064
        L_0x00f6:
            if (r5 == 0) goto L_0x00fa
            X.7Wm r4 = androidx.compose.ui.Modifier.A00
        L_0x00fa:
            r2 = r29 & 32
            if (r2 == 0) goto L_0x009b
            com.instagram.service.session.UserSession r5 = X.AnonymousClass7CZ.A00(r15)
            X.0kW r3 = X.C1189973c.A00(r15)
            X.7bN r2 = new X.7bN
            r2.<init>(r3, r5, r14)
            X.06C r17 = X.AnonymousClass7CD.A00(r15)
            if (r17 == 0) goto L_0x0164
            r20 = 0
            X.6o9 r18 = X.C86104wH.A0J(r17)
            java.lang.Class<X.582> r19 = X.AnonymousClass582.class
            r16 = r2
            X.3ak r9 = X.C98396Fj.A00(r15, r16, r17, r18, r19, r20)
            X.AnonymousClass7W3.A0z(r15, r1)
            X.582 r9 = (X.AnonymousClass582) r9
            goto L_0x009a
        L_0x0126:
            r2 = 57344(0xe000, float:8.0356E-41)
            r2 = r2 & r28
            if (r2 != 0) goto L_0x003d
            int r2 = X.C147188nY.A0J(r15, r4)
            r13 = r13 | r2
            goto L_0x003d
        L_0x0134:
            r2 = r0 & 7168(0x1c00, float:1.0045E-41)
            if (r2 != 0) goto L_0x0037
            int r2 = X.C147188nY.A0O(r15, r14)
            r13 = r13 | r2
            goto L_0x0037
        L_0x013f:
            r2 = r0 & 896(0x380, float:1.256E-42)
            if (r2 != 0) goto L_0x002f
            int r2 = X.C147188nY.A0B(r15, r12)
            r13 = r13 | r2
            goto L_0x002f
        L_0x014a:
            r2 = r28 & 112(0x70, float:1.57E-43)
            if (r2 != 0) goto L_0x0029
            int r2 = X.C147188nY.A0A(r15, r11)
            r13 = r13 | r2
            goto L_0x0029
        L_0x0155:
            r2 = r28 & 14
            if (r2 != 0) goto L_0x0161
            int r13 = X.C147188nY.A09(r15, r10)
            r13 = r13 | r28
            goto L_0x0023
        L_0x0161:
            r13 = r0
            goto L_0x0023
        L_0x0164:
            java.lang.String r0 = "No ViewModelStoreOwner was provided via LocalViewModelStoreOwner"
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C121367Fq.A01(X.8nY, androidx.compose.ui.Modifier, X.582, X.0ZU, X.0ZU, X.0ZU, int, int, boolean):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v19, resolved type: kotlin.jvm.internal.KtLambdaShape4S0310000_I2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r43v3, resolved type: kotlin.jvm.internal.KtLambdaShape4S0310000_I2} */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0162, code lost:
        if (r7 == r3) goto L_0x0164;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0164, code lost:
        r43 = new kotlin.jvm.internal.KtLambdaShape4S0310000_I2(0, r45, r4, r5, r48);
        r1.A14(r43);
        r43 = r43;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0174, code lost:
        r23 = X.AnonymousClass7W3.A08(r1, r7, false);
        r8 = X.C147188nY.A0z(r0, r5, 1157296644);
        r7 = r1.A13();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0183, code lost:
        if (r8 != false) goto L_0x0187;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0185, code lost:
        if (r7 != r3) goto L_0x018b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0187, code lost:
        r7 = X.AnonymousClass7W3.A0J(r1, r5, 3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x018b, code lost:
        r19 = r0;
        A02(r19, r6.A86(X.AnonymousClass7KV.A06, androidx.compose.ui.Modifier.A04(r11)), (X.AnonymousClass67Y) r17.getValue(), (X.C970767v) ((com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1200000_I2) r31.getValue()).A00, r23, X.AnonymousClass7W3.A09(r1, r7, false), 0, 0);
        r7 = X.C147188nY.A0z(r0, r5, 1157296644);
        r6 = r1.A13();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x01be, code lost:
        if (r7 != false) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x01c0, code lost:
        if (r6 != r3) goto L_0x01c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x01c2, code lost:
        r6 = X.AnonymousClass7W3.A0J(r1, r5, 4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x01c6, code lost:
        X.AnonymousClass70X.A00(r15, r0, X.AnonymousClass7W3.A08(r1, r6, false), 0, 0, 1);
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C147188nY r40, androidx.compose.ui.Modifier r41, com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1200000_I2 r42, X.AnonymousClass75b r43, X.AnonymousClass582 r44, X.AnonymousClass0ZU r45, X.AnonymousClass0ZU r46, int r47, boolean r48) {
        /*
            r1 = -547991520(0xffffffffdf565020, float:-1.5442878E19)
            r0 = r40
            r0.Cvd(r1)
            r5 = r44
            X.4wG r1 = r5.A06
            r19 = 0
            r18 = 1
            X.4oM r31 = X.AnonymousClass7Aj.A01(r0, r1)
            X.4wG r1 = r5.A07
            X.4oM r17 = X.AnonymousClass7Aj.A01(r0, r1)
            r2 = 0
            r14 = 3
            androidx.compose.foundation.lazy.LazyListState r15 = X.C97946Do.A00(r0, r2, r14)
            int r6 = X.C147188nY.A00(r0)
            r1 = r0
            X.7W3 r1 = (X.AnonymousClass7W3) r1
            java.lang.Object r4 = r1.A13()
            java.lang.Object r3 = X.AnonymousClass7GN.A00
            java.lang.Object r4 = X.C86104wH.A0b(r0, r1, r4, r3, r4)
            X.4qz r38 = X.AnonymousClass7WN.A01(r1, r4)
            java.lang.String r36 = X.AnonymousClass7JS.A00(r0)
            java.lang.Object r7 = X.C147188nY.A0r(r0, r1, r6)
            if (r7 != r3) goto L_0x0047
            X.77X r7 = new X.77X
            r7.<init>()
            r1.A14(r7)
        L_0x0047:
            X.AnonymousClass7W3.A0w(r1, r2)
            X.77X r7 = (X.AnonymousClass77X) r7
            r33 = r42
            r4 = r33
            java.lang.Object r4 = r4.A01
            java.util.Collection r4 = (java.util.Collection) r4
            boolean r40 = X.C18190wL.A1a(r4)
            java.lang.Object r4 = X.C147188nY.A0r(r0, r1, r6)
            if (r4 != r3) goto L_0x0066
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r2)
            androidx.compose.runtime.ParcelableSnapshotMutableState r4 = X.AnonymousClass7WR.A00(r1, r4)
        L_0x0066:
            X.AnonymousClass7W3.A0w(r1, r2)
            X.4oM r4 = (X.C81784oM) r4
            X.AnonymousClass6ME.A00(r15, r0, r2)
            r39 = r47
            int r6 = r47 >> 18
            r16 = r6 & 14
            X.8ly r13 = X.AnonymousClass7KV.A07(r0, r2)
            int r6 = r16 << 3
            r6 = r6 & 112(0x70, float:1.57E-43)
            java.lang.Object r12 = X.C147188nY.A0p(r0)
            java.lang.Object r11 = X.C147188nY.A0n(r0)
            java.lang.Object r10 = X.C147188nY.A0m(r0)
            X.0ZU r9 = X.AnonymousClass74X.A00
            X.0YM r8 = X.C98236Es.A00(r41)
            int r6 = X.C86114wI.A01(r6)
            X.C147188nY.A0w(r0, r1, r9)
            X.AnonymousClass7W3.A0a(r0, r1, r13, r12)
            X.AnonymousClass7KP.A08(r0, r11, r10, r8, r6)
            X.7V3 r6 = X.AnonymousClass7V3.A00
            int r9 = X.C86124wJ.A05(r16)
            r8 = 1911762522(0x71f32e5a, float:2.4083486E30)
            r0.Cvb(r8)
            r8 = r9 & 14
            if (r8 != 0) goto L_0x00b0
            int r8 = X.C147188nY.A0F(r0, r6)
            r9 = r9 | r8
        L_0x00b0:
            r9 = r9 & 91
            r8 = 18
            r34 = r43
            r13 = r45
            r37 = r46
            if (r9 != r8) goto L_0x0117
            boolean r8 = r0.BCM()
            if (r8 == 0) goto L_0x0117
            r0.CuJ()
        L_0x00c5:
            r6 = r18
            X.AnonymousClass7W3.A0v(r1, r6)
            boolean r6 = X.C86104wH.A1X(r4)
            if (r6 == 0) goto L_0x00fe
            r6 = 2131822200(0x7f110678, float:1.9277165E38)
            java.lang.String r18 = X.AnonymousClass7JS.A01(r0, r6)
            boolean r7 = X.C147188nY.A0y(r0, r4)
            java.lang.Object r6 = r1.A13()
            if (r7 != 0) goto L_0x00e3
            if (r6 != r3) goto L_0x00e8
        L_0x00e3:
            r3 = 5
            kotlin.jvm.internal.KtLambdaShape35S0100000_I2_15 r6 = X.AnonymousClass7W3.A0J(r1, r4, r3)
        L_0x00e8:
            X.0ZU r3 = X.AnonymousClass7W3.A08(r1, r6, r2)
            r19 = 2
            kotlin.jvm.internal.KtLambdaShape1S1500000_I2 r1 = new kotlin.jvm.internal.KtLambdaShape1S1500000_I2
            r12 = r1
            r14 = r4
            r15 = r34
            r16 = r38
            r17 = r5
            r12.<init>(r13, r14, r15, r16, r17, r18, r19)
            A03(r0, r3, r1, r2)
        L_0x00fe:
            X.8nW r1 = r0.AKE()
            if (r1 == 0) goto L_0x0116
            X.8SJ r0 = new X.8SJ
            r40 = r0
            r43 = r34
            r44 = r5
            r46 = r37
            r47 = r39
            r40.<init>(r41, r42, r43, r44, r45, r46, r47, r48)
            X.AnonymousClass7WO.A00(r1, r0)
        L_0x0116:
            return
        L_0x0117:
            X.7Wm r11 = androidx.compose.ui.Modifier.A00
            androidx.compose.ui.Alignment r8 = X.AnonymousClass7KV.A0C
            androidx.compose.ui.Modifier r25 = r6.A86(r8, r11)
            r12 = 4
            X.8Jw r26 = new X.8Jw
            r30 = r26
            r32 = r7
            r35 = r5
            r30.<init>(r31, r32, r33, r34, r35, r36, r37, r38, r39, r40)
            r27 = 12582912(0xc00000, float:1.7632415E-38)
            r28 = 124(0x7c, float:1.74E-43)
            r20 = r19
            r21 = r19
            r23 = r0
            r24 = r19
            r29 = r2
            r30 = r18
            r22 = r15
            X.C115696vl.A01(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            r7 = -118388225(0xfffffffff8f189ff, float:-3.919195E34)
            r0.Cvb(r7)
            if (r40 == 0) goto L_0x01d3
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r48)
            java.lang.Object[] r10 = X.C147188nY.A13(r0, r7, r4, r5, r13)
            r9 = 0
            r8 = 0
        L_0x0152:
            r7 = r10[r8]
            boolean r9 = X.C147188nY.A12(r0, r7, r9)
            int r8 = r8 + 1
            if (r8 < r12) goto L_0x0152
            java.lang.Object r7 = r1.A13()
            if (r9 != 0) goto L_0x0164
            if (r7 != r3) goto L_0x0174
        L_0x0164:
            kotlin.jvm.internal.KtLambdaShape4S0310000_I2 r7 = new kotlin.jvm.internal.KtLambdaShape4S0310000_I2
            r43 = r7
            r44 = r2
            r46 = r4
            r47 = r5
            r43.<init>(r44, r45, r46, r47, r48)
            r1.A14(r7)
        L_0x0174:
            X.0ZU r23 = X.AnonymousClass7W3.A08(r1, r7, r2)
            r9 = 1157296644(0x44faf204, float:2007.563)
            boolean r8 = X.C147188nY.A0z(r0, r5, r9)
            java.lang.Object r7 = r1.A13()
            if (r8 != 0) goto L_0x0187
            if (r7 != r3) goto L_0x018b
        L_0x0187:
            kotlin.jvm.internal.KtLambdaShape35S0100000_I2_15 r7 = X.AnonymousClass7W3.A0J(r1, r5, r14)
        L_0x018b:
            X.0ZU r24 = X.AnonymousClass7W3.A09(r1, r7, r2)
            java.lang.Object r7 = r31.getValue()
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1200000_I2 r7 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1200000_I2) r7
            java.lang.Object r10 = r7.A00
            X.67v r10 = (X.C970767v) r10
            java.lang.Object r8 = r17.getValue()
            X.67Y r8 = (X.AnonymousClass67Y) r8
            androidx.compose.ui.Modifier r11 = androidx.compose.ui.Modifier.A04(r11)
            androidx.compose.ui.Alignment r7 = X.AnonymousClass7KV.A06
            androidx.compose.ui.Modifier r20 = r6.A86(r7, r11)
            r19 = r0
            r21 = r8
            r22 = r10
            r25 = r2
            r26 = r2
            A02(r19, r20, r21, r22, r23, r24, r25, r26)
            boolean r7 = X.C147188nY.A0z(r0, r5, r9)
            java.lang.Object r6 = r1.A13()
            if (r7 != 0) goto L_0x01c2
            if (r6 != r3) goto L_0x01c6
        L_0x01c2:
            kotlin.jvm.internal.KtLambdaShape35S0100000_I2_15 r6 = X.AnonymousClass7W3.A0J(r1, r5, r12)
        L_0x01c6:
            X.0ZU r8 = X.AnonymousClass7W3.A08(r1, r6, r2)
            r6 = r15
            r7 = r0
            r9 = r2
            r10 = r2
            r11 = r18
            X.AnonymousClass70X.A00(r6, r7, r8, r9, r10, r11)
        L_0x01d3:
            X.AnonymousClass7W3.A0w(r1, r2)
            goto L_0x00c5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C121367Fq.A00(X.8nY, androidx.compose.ui.Modifier, com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1200000_I2, X.75b, X.582, X.0ZU, X.0ZU, int, boolean):void");
    }

    public static final void A03(C147188nY r13, AnonymousClass0ZU r14, AnonymousClass0ZU r15, int i) {
        int i2;
        C147188nY r6 = r13;
        r13.Cvd(-1001554769);
        int i3 = i;
        AnonymousClass0ZU r12 = r14;
        if ((i & 14) == 0) {
            i2 = C147188nY.A09(r13, r14) | i;
        } else {
            i2 = i3;
        }
        AnonymousClass0ZU r3 = r15;
        if ((i & 112) == 0) {
            i2 |= C147188nY.A0A(r13, r15);
        }
        if ((i2 & 91) != 18 || !r13.BCM()) {
            String A01 = AnonymousClass7JS.A01(r13, R.string.f0nameremoved);
            AnonymousClass6QY.A00(r6, new KtCSuperShape0S2210000_I2(AnonymousClass006.A0C, AnonymousClass7JS.A01(r13, 2131824237), r3, 12), AnonymousClass6QW.A00(r13, (Integer) null, (AnonymousClass0ZU) null, 2131823054, 30), (KtCSuperShape0S2210000_I2) null, AnonymousClass7JS.A01(r13, 2131822199), AnonymousClass7JS.A02(r13, A01, 2131822198), r12, i2 & 14, 224, false, false);
        } else {
            r13.CuJ();
        }
        C147178nW AKE = r6.AKE();
        if (AKE != null) {
            C147178nW.A04(AKE, r12, r3, i3, 48);
        }
    }
}
