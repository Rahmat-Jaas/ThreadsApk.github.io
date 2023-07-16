package X;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import com.facebook.common.dextricks.DalvikInternals;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2210000_I2;
import com.instagram.barcelona.R;
import kotlin.jvm.internal.KtLambdaShape0S1203000_I2;
import kotlin.jvm.internal.KtLambdaShape0S1212000_I2;
import kotlin.jvm.internal.KtLambdaShape18S0301000_I2;
import kotlin.jvm.internal.KtLambdaShape1S0412000_I2;
import kotlin.jvm.internal.KtLambdaShape2S0202000_I2;
import kotlin.jvm.internal.KtLambdaShape3S0302000_I2;
import kotlin.jvm.internal.KtLambdaShape3S1201000_I2;
import kotlin.jvm.internal.KtLambdaShape42S0200000_I2_3;

/* renamed from: X.7Kg  reason: invalid class name and case insensitive filesystem */
public final class C122107Kg {
    public static final void A02(C147188nY r18, Modifier modifier, C970867w r20, C304621k r21, AnonymousClass0ZU r22, int i, int i2, boolean z) {
        int i3;
        Modifier modifier2 = modifier;
        C147188nY r10 = r18;
        r10.Cvd(1324391717);
        int i4 = i2;
        AnonymousClass0ZU r2 = r22;
        int i5 = i;
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = C147188nY.A09(r10, r2) | i;
        } else {
            i3 = i5;
        }
        C304621k r3 = r21;
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= C147188nY.A0G(r10, r3);
        }
        boolean z2 = z;
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i5 & 896) == 0) {
            i3 |= C147188nY.A0N(r10, z2);
        }
        C970867w r4 = r20;
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i5 & 7168) == 0) {
            i3 |= C147188nY.A0I(r10, r4);
        }
        int i6 = i2 & 16;
        if (i6 != 0) {
            i3 |= DalvikInternals.IOPRIO_BACKGROUND;
        } else if ((57344 & i) == 0) {
            i3 |= C147188nY.A0J(r10, modifier2);
        }
        if ((46811 & i3) != 9362 || !r10.BCM()) {
            if (i6 != 0) {
                modifier2 = Modifier.A00;
            }
            C81784oM A01 = AnonymousClass7DC.A01((C142638fL) null, r10, "clearButtonAlpha", C86164wN.A01(z2 ? 1 : 0), 22);
            boolean A1T = AnonymousClass0wJ.A1T(r3.ordinal(), 2);
            AnonymousClass7JP.A06(AnonymousClass7KU.A01((C147218oz) null, 3), C1203779x.A00, r10, modifier2, (String) null, AnonymousClass7JR.A00(r10, new C140878Yv(A01, r4, r3, r2, i3, A1T), 1458976077), 196992 | ((i3 >> 9) & 112), 16, A1T);
        } else {
            r10.CuJ();
        }
        C147178nW AKE = r10.AKE();
        if (AKE != null) {
            AnonymousClass0ZU r14 = r2;
            C970867w r13 = r4;
            AKE.D9d(new KtLambdaShape1S0412000_I2(r13, r14, modifier2, r3, i5, i4, 1, z2));
        }
    }

    public static final void A03(C147188nY r15, Modifier modifier, C90395Lv r17, AnonymousClass0YP r18, int i, int i2) {
        int i3;
        Modifier modifier2 = modifier;
        C147188nY r5 = r15;
        r15.Cvd(-972514420);
        int i4 = i2;
        C90395Lv r12 = r17;
        int i5 = i;
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = C147188nY.A0F(r5, r12) | i;
        } else {
            i3 = i5;
        }
        AnonymousClass0YP r13 = r18;
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= C147188nY.A0A(r5, r13);
        }
        int i6 = i2 & 4;
        if (i6 != 0) {
            i3 |= 384;
        } else if ((i5 & 896) == 0) {
            i3 |= C147188nY.A0H(r5, modifier2);
        }
        if ((i3 & 731) != 146 || !r5.BCM()) {
            if (i6 != 0) {
                modifier2 = Modifier.A00;
            }
            String str = r12.A01;
            boolean A10 = C147188nY.A10(r5, r13, r12, 511388516);
            AnonymousClass7W3 r3 = (AnonymousClass7W3) r5;
            Object A13 = r3.A13();
            if (A10 || A13 == AnonymousClass7GN.A00) {
                A13 = new KtLambdaShape42S0200000_I2_3(15, (Object) r13, (Object) r12);
                r3.A14(A13);
            }
            AnonymousClass0YY A0B = AnonymousClass7W3.A0B(r3, A13, false);
            C04220Ms.A0B(modifier2, 0);
            AnonymousClass70R.A00((C147258p3) null, r5, AnonymousClass7K4.A06(Modifier.A04(modifier2), (float) 16, 8), str, (String) null, A0B, 0, 24);
        } else {
            r5.CuJ();
        }
        C147178nW AKE = r5.AKE();
        if (AKE != null) {
            AKE.D9d(new KtLambdaShape3S0302000_I2(r12, r13, modifier2, i5, i4, 14));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A04(X.C147188nY r33, androidx.compose.ui.Modifier r34, X.C90405Lw r35, X.AnonymousClass0ZU r36, X.AnonymousClass0YY r37, X.AnonymousClass0YY r38, X.AnonymousClass0YY r39, int r40, int r41) {
        /*
            r2 = r34
            r0 = 1701055185(0x65640ad1, float:6.7306193E22)
            r5 = r33
            r5.Cvd(r0)
            r32 = r41
            r0 = r41 & 1
            r4 = r35
            r3 = r40
            if (r0 == 0) goto L_0x0154
            r6 = r40 | 6
        L_0x0016:
            r0 = r41 & 2
            r35 = r37
            if (r0 == 0) goto L_0x0147
            r6 = r6 | 48
        L_0x001e:
            r0 = r41 & 4
            r34 = r38
            if (r0 == 0) goto L_0x013a
            r6 = r6 | 384(0x180, float:5.38E-43)
        L_0x0026:
            r0 = r41 & 8
            r15 = r39
            if (r0 == 0) goto L_0x012f
            r6 = r6 | 3072(0xc00, float:4.305E-42)
        L_0x002e:
            r0 = r41 & 16
            if (r0 == 0) goto L_0x011f
            r6 = r6 | 24576(0x6000, float:3.4438E-41)
        L_0x0034:
            r7 = r41 & 32
            if (r7 == 0) goto L_0x0113
            r0 = 196608(0x30000, float:2.75506E-40)
        L_0x003a:
            r6 = r6 | r0
        L_0x003b:
            r1 = 374491(0x5b6db, float:5.24774E-40)
            r1 = r1 & r6
            r0 = 74898(0x12492, float:1.04954E-40)
            if (r1 != r0) goto L_0x006e
            boolean r0 = r5.BCM()
            if (r0 == 0) goto L_0x006e
            r5.CuJ()
        L_0x004d:
            X.8nW r1 = r5.AKE()
            if (r1 == 0) goto L_0x006d
            r33 = 6
            kotlin.jvm.internal.KtLambdaShape1S0602000_I2 r0 = new kotlin.jvm.internal.KtLambdaShape1S0602000_I2
            r25 = r34
            r26 = r36
            r27 = r4
            r28 = r35
            r29 = r15
            r30 = r2
            r31 = r3
            r24 = r0
            r24.<init>(r25, r26, r27, r28, r29, r30, r31, r32, r33)
            r1.D9d(r0)
        L_0x006d:
            return
        L_0x006e:
            if (r7 == 0) goto L_0x0072
            X.7Wm r2 = androidx.compose.ui.Modifier.A00
        L_0x0072:
            r0 = 2131820557(0x7f11000d, float:1.9273832E38)
            r1 = 0
            java.lang.String r7 = X.AnonymousClass7JS.A01(r5, r0)
            r8 = 2131821946(0x7f11057a, float:1.927665E38)
            java.lang.String r0 = r4.A05
            java.lang.Object[] r7 = new java.lang.Object[]{r0, r7}
            java.lang.String r20 = X.AnonymousClass7JS.A03(r5, r7, r8)
            r21 = 5
            kotlin.jvm.internal.KtLambdaShape4S1300000_I2 r10 = new kotlin.jvm.internal.KtLambdaShape4S1300000_I2
            r17 = r34
            r18 = r35
            r19 = r4
            r16 = r10
            r16.<init>(r17, r18, r19, r20, r21)
            com.instagram.common.typedurl.ImageUrl r14 = r4.A02
            java.lang.String r8 = r4.A03
            boolean r7 = r4.A07
            X.5I4 r18 = X.AnonymousClass5I4.A04
            r11 = 1157296644(0x44faf204, float:2007.563)
            boolean r9 = X.C147188nY.A0z(r5, r10, r11)
            r12 = r5
            X.7W3 r12 = (X.AnonymousClass7W3) r12
            java.lang.Object r13 = r12.A13()
            if (r9 != 0) goto L_0x00b2
            java.lang.Object r9 = X.AnonymousClass7GN.A00
            if (r13 != r9) goto L_0x00bc
        L_0x00b2:
            r9 = 8
            kotlin.jvm.internal.KtLambdaShape36S0100000_I2_16 r13 = new kotlin.jvm.internal.KtLambdaShape36S0100000_I2_16
            r13.<init>(r10, r9)
            r12.A14(r13)
        L_0x00bc:
            X.0ZU r22 = X.AnonymousClass7W3.A08(r12, r13, r1)
            boolean r11 = X.C147188nY.A0z(r5, r10, r11)
            java.lang.Object r9 = r12.A13()
            if (r11 != 0) goto L_0x00ce
            java.lang.Object r11 = X.AnonymousClass7GN.A00
            if (r9 != r11) goto L_0x00d6
        L_0x00ce:
            kotlin.jvm.internal.KtLambdaShape153S0100000_I2_8 r9 = new kotlin.jvm.internal.KtLambdaShape153S0100000_I2_8
            r9.<init>(r10, r1)
            r12.A14(r9)
        L_0x00d6:
            X.0YY r23 = X.AnonymousClass7W3.A0A(r12, r9, r1)
            r10 = -570536296(0xffffffffddfe4e98, float:-2.29059388E18)
            r26 = 6
            kotlin.jvm.internal.KtLambdaShape20S0301000_I2 r9 = new kotlin.jvm.internal.KtLambdaShape20S0301000_I2
            r27 = r15
            r28 = r36
            r29 = r4
            r24 = r9
            r25 = r6
            r24.<init>(r25, r26, r27, r28, r29)
            X.8sI r24 = X.AnonymousClass7JR.A00(r5, r9, r10)
            int r6 = r6 >> 9
            r6 = r6 & 896(0x380, float:1.256E-42)
            r26 = 48
            r27 = 224(0xe0, float:3.14E-43)
            r28 = r7
            r29 = r1
            r30 = r1
            r31 = r1
            r20 = r0
            r21 = r8
            r25 = r6
            r16 = r5
            r17 = r2
            r19 = r14
            X.AnonymousClass6MG.A00(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            goto L_0x004d
        L_0x0113:
            r0 = 458752(0x70000, float:6.42848E-40)
            r0 = r0 & r40
            if (r0 != 0) goto L_0x003b
            int r0 = X.C147188nY.A0K(r5, r2)
            goto L_0x003a
        L_0x011f:
            r0 = 57344(0xe000, float:8.0356E-41)
            r0 = r0 & r40
            if (r0 != 0) goto L_0x0034
            r0 = r36
            int r0 = X.C147188nY.A0D(r5, r0)
            r6 = r6 | r0
            goto L_0x0034
        L_0x012f:
            r0 = r3 & 7168(0x1c00, float:1.0045E-41)
            if (r0 != 0) goto L_0x002e
            int r0 = X.C147188nY.A0C(r5, r15)
            r6 = r6 | r0
            goto L_0x002e
        L_0x013a:
            r0 = r3 & 896(0x380, float:1.256E-42)
            if (r0 != 0) goto L_0x0026
            r0 = r34
            int r0 = X.C147188nY.A0B(r5, r0)
            r6 = r6 | r0
            goto L_0x0026
        L_0x0147:
            r0 = r40 & 112(0x70, float:1.57E-43)
            if (r0 != 0) goto L_0x001e
            r0 = r35
            int r0 = X.C147188nY.A0A(r5, r0)
            r6 = r6 | r0
            goto L_0x001e
        L_0x0154:
            r0 = r40 & 14
            if (r0 != 0) goto L_0x0160
            int r6 = X.C147188nY.A0F(r5, r4)
            r6 = r6 | r40
            goto L_0x0016
        L_0x0160:
            r6 = r3
            goto L_0x0016
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C122107Kg.A04(X.8nY, androidx.compose.ui.Modifier, X.5Lw, X.0ZU, X.0YY, X.0YY, X.0YY, int, int):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v53, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v54, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v13, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v16, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v17, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v20, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v21, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v101, resolved type: kotlin.coroutines.jvm.internal.KtSLambdaShape1S0300000_I2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v21, resolved type: kotlin.coroutines.jvm.internal.KtSLambdaShape1S1201000_I2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r29v6, resolved type: kotlin.coroutines.jvm.internal.KtSLambdaShape1S1201000_I2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v22, resolved type: kotlin.coroutines.jvm.internal.KtSLambdaShape1S1201000_I2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r29v7, resolved type: kotlin.coroutines.jvm.internal.KtSLambdaShape1S1201000_I2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v28, resolved type: kotlin.coroutines.jvm.internal.KtSLambdaShape1S1201000_I2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r29v8, resolved type: kotlin.coroutines.jvm.internal.KtSLambdaShape1S1201000_I2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v29, resolved type: kotlin.coroutines.jvm.internal.KtSLambdaShape1S1201000_I2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r29v9, resolved type: kotlin.coroutines.jvm.internal.KtSLambdaShape1S1201000_I2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r29v10, resolved type: kotlin.coroutines.jvm.internal.KtSLambdaShape1S0300000_I2} */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0268, code lost:
        r6.Cvb(-2072620916);
        r13 = X.AnonymousClass7JS.A01(r6, 2131821933);
        r14 = X.C147188nY.A12(r6, r13, X.C147188nY.A10(r6, r9, r7, 1618982084));
        r10 = r8.A13();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0281, code lost:
        if (r14 != false) goto L_0x0285;
        r10 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0283, code lost:
        if (r10 != r11) goto L_0x0299;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0285, code lost:
        r29 = new kotlin.coroutines.jvm.internal.KtSLambdaShape1S1201000_I2(r9, r7, r13, (X.C146958n9) null, 14);
        r8.A14(r29);
        r29 = r29;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0299, code lost:
        X.AnonymousClass7W3.A0b(r6, r8, r10, r1, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x029d, code lost:
        r6.Cvb(-2072621257);
        r13 = X.AnonymousClass7JS.A01(r6, 2131821932);
        r14 = X.C147188nY.A12(r6, r13, X.C147188nY.A10(r6, r9, r7, 1618982084));
        r10 = r8.A13();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x02b6, code lost:
        if (r14 != false) goto L_0x02ba;
        r10 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x02b8, code lost:
        if (r10 != r11) goto L_0x02ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x02ba, code lost:
        r29 = new kotlin.coroutines.jvm.internal.KtSLambdaShape1S1201000_I2(r9, r7, r13, (X.C146958n9) null, 13);
        r8.A14(r29);
        r29 = r29;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x02ce, code lost:
        X.AnonymousClass7W3.A0b(r6, r8, r10, r1, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x02d3, code lost:
        r6.Cvb(-2072621293);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x02db, code lost:
        r6.Cvb(-2072621680);
        r14 = X.AnonymousClass7JS.A01(r6, 2131821935);
        r1 = kotlin.Unit.A00;
        r15 = X.C147188nY.A12(r6, r14, X.C147188nY.A10(r6, r9, r7, 1618982084));
        r13 = r8.A13();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x02f6, code lost:
        if (r15 != false) goto L_0x02fa;
        r13 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x02f8, code lost:
        if (r13 != r11) goto L_0x030e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x02fa, code lost:
        r29 = new kotlin.coroutines.jvm.internal.KtSLambdaShape1S1201000_I2(r9, r7, r14, (X.C146958n9) null, 16);
        r8.A14(r29);
        r29 = r29;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x030e, code lost:
        X.AnonymousClass7W3.A0b(r6, r8, r13, r1, false);
        X.AnonymousClass7W3.A0w(r8, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0316, code lost:
        r6.Cvb(-2072621994);
        r14 = X.AnonymousClass7JS.A01(r6, 2131821951);
        r1 = kotlin.Unit.A00;
        r15 = X.C147188nY.A12(r6, r14, X.C147188nY.A10(r6, r9, r7, 1618982084));
        r13 = r8.A13();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0331, code lost:
        if (r15 != false) goto L_0x0335;
        r13 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0333, code lost:
        if (r13 != r11) goto L_0x0349;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0335, code lost:
        r29 = new kotlin.coroutines.jvm.internal.KtSLambdaShape1S1201000_I2(r9, r7, r14, (X.C146958n9) null, 15);
        r8.A14(r29);
        r29 = r29;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x0349, code lost:
        X.AnonymousClass7W3.A0b(r6, r8, r13, r1, false);
        X.AnonymousClass7W3.A0w(r8, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x0351, code lost:
        r6.Cvb(-2072622030);
        X.AnonymousClass7W3.A0w(r8, false);
        r1 = kotlin.Unit.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x005e, code lost:
        if (r2 == false) goto L_0x0060;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00aa, code lost:
        if ((r4 & 128) != 0) goto L_0x00ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01dc, code lost:
        if (r1 == r11) goto L_0x01de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x01de, code lost:
        r29 = new kotlin.coroutines.jvm.internal.KtSLambdaShape1S0300000_I2(r9, r20, r17, (X.C146958n9) null, 13);
        r8.A14(r29);
        r29 = r29;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01f2, code lost:
        X.AnonymousClass7W3.A0b(r6, r8, r1, r13, false);
        r13 = ((X.AnonymousClass5Hg) r20.getValue()).A01.ordinal();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0201, code lost:
        if (r13 == 0) goto L_0x0351;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0204, code lost:
        if (r13 == 3) goto L_0x0351;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0208, code lost:
        if (r13 == 1) goto L_0x0316;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x020c, code lost:
        if (r13 == 2) goto L_0x02db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x020e, code lost:
        r6.Cvb(-2072621412);
        X.AnonymousClass7W3.A0w(r8, false);
        r1 = kotlin.Unit.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0219, code lost:
        r14 = ((X.AnonymousClass5Hg) r20.getValue()).A00.ordinal();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0225, code lost:
        if (r14 == 0) goto L_0x02d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0228, code lost:
        if (r14 == 3) goto L_0x02d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x022c, code lost:
        if (r14 == 1) goto L_0x029d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0230, code lost:
        if (r14 == 2) goto L_0x0268;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0232, code lost:
        r6.Cvb(-2072620615);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0238, code lost:
        X.AnonymousClass7W3.A0w(r8, false);
        X.C117656z2.A01(r6, X.AnonymousClass7FI.A01(r28), new X.C140318Ty(r19, r17, r12, r2, r20, r7, r9, r35, r26, r25, r23, r24, r42, r0), -295579865);
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x035e  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x03ad  */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x0415  */
    /* JADX WARNING: Removed duplicated region for block: B:167:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0106  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0122  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x013a  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x015c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A05(X.C147188nY r36, androidx.compose.ui.Modifier r37, X.C882757k r38, java.lang.String r39, java.lang.String r40, X.AnonymousClass0ZU r41, X.AnonymousClass0ZU r42, X.AnonymousClass0ZU r43, X.AnonymousClass0YY r44, int r45, int r46) {
        /*
            r27 = r40
            r23 = r43
            r25 = r42
            r24 = r44
            r26 = r41
            r9 = r38
            r28 = r37
            r3 = 0
            r44 = r39
            r0 = r44
            X.C04220Ms.A0B(r0, r3)
            r0 = 1132423157(0x437f67f5, float:255.40608)
            r6 = r36
            r6.Cvd(r0)
            r4 = r46
            r0 = r46 & 1
            r5 = r45
            if (r0 == 0) goto L_0x0404
            r0 = r45 | 6
        L_0x0028:
            r13 = r46 & 2
            if (r13 == 0) goto L_0x03f7
            r0 = r0 | 48
        L_0x002e:
            r12 = r46 & 4
            if (r12 == 0) goto L_0x03ea
            r0 = r0 | 384(0x180, float:5.38E-43)
        L_0x0034:
            r11 = r46 & 8
            if (r11 == 0) goto L_0x03dd
            r0 = r0 | 3072(0xc00, float:4.305E-42)
        L_0x003a:
            r10 = r46 & 16
            if (r10 == 0) goto L_0x03cd
            r0 = r0 | 24576(0x6000, float:3.4438E-41)
        L_0x0040:
            r8 = r46 & 32
            if (r8 == 0) goto L_0x03bf
            r1 = 196608(0x30000, float:2.75506E-40)
        L_0x0046:
            r0 = r0 | r1
        L_0x0047:
            r7 = r46 & 64
            if (r7 == 0) goto L_0x03ad
            r1 = 1572864(0x180000, float:2.204052E-39)
        L_0x004d:
            r0 = r0 | r1
        L_0x004e:
            r1 = 29360128(0x1c00000, float:7.052966E-38)
            r1 = r45 & r1
            if (r1 != 0) goto L_0x0063
            r1 = r4 & 128(0x80, float:1.794E-43)
            if (r1 != 0) goto L_0x0060
            boolean r2 = r6.ACY(r9)
            r1 = 8388608(0x800000, float:1.17549435E-38)
            if (r2 != 0) goto L_0x0062
        L_0x0060:
            r1 = 4194304(0x400000, float:5.877472E-39)
        L_0x0062:
            r0 = r0 | r1
        L_0x0063:
            r1 = 23967451(0x16db6db, float:4.3661218E-38)
            r2 = r0 & r1
            r1 = 4793490(0x492492, float:6.71711E-39)
            if (r2 != r1) goto L_0x0098
            boolean r1 = r6.BCM()
            if (r1 == 0) goto L_0x0098
            r6.CuJ()
        L_0x0076:
            X.8nW r1 = r6.AKE()
            if (r1 == 0) goto L_0x0097
            X.8T3 r0 = new X.8T3
            r6 = r0
            r7 = r28
            r8 = r9
            r9 = r44
            r10 = r27
            r11 = r26
            r12 = r25
            r13 = r23
            r14 = r24
            r15 = r5
            r16 = r4
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            X.AnonymousClass7WO.A00(r1, r0)
        L_0x0097:
            return
        L_0x0098:
            r6.CvD()
            r1 = r45 & 1
            if (r1 == 0) goto L_0x0361
            boolean r1 = r6.Acj()
            if (r1 != 0) goto L_0x0361
            r6.CuJ()
            r1 = r4 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x00b0
        L_0x00ac:
            r1 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r0 = r0 & r1
        L_0x00b0:
            r6.AKA()
            X.4wG r1 = r9.A0F
            r22 = 0
            r21 = 1
            X.4oM r20 = X.AnonymousClass7Aj.A01(r6, r1)
            int r10 = X.C147188nY.A00(r6)
            r8 = r6
            X.7W3 r8 = (X.AnonymousClass7W3) r8
            java.lang.Object r2 = r8.A13()
            java.lang.Object r11 = X.AnonymousClass7GN.A00
            if (r2 != r11) goto L_0x00da
            X.869 r1 = X.AnonymousClass869.A00
            X.4qz r1 = X.AnonymousClass7K5.A00(r6, r1)
            X.7WN r2 = new X.7WN
            r2.<init>(r1)
            r8.A14(r2)
        L_0x00da:
            X.4qz r42 = X.AnonymousClass7WN.A01(r8, r2)
            java.lang.Object r19 = X.C147188nY.A0o(r6)
            r1 = r19
            android.content.Context r1 = (android.content.Context) r1
            r19 = r1
            if (r27 == 0) goto L_0x035e
            X.21k r14 = X.C304621k.valueOf(r27)
        L_0x00ee:
            java.lang.Object r1 = r20.getValue()
            X.5Hg r1 = (X.AnonymousClass5Hg) r1
            X.21k r1 = r1.A02
            r35 = r1
            java.lang.Object r1 = r20.getValue()
            X.5Hg r1 = (X.AnonymousClass5Hg) r1
            X.8s2 r1 = r1.A05
            int r2 = r1.indexOf(r14)
            if (r2 >= r3) goto L_0x0107
            r2 = 0
        L_0x0107:
            r18 = 2
            r1 = r18
            androidx.compose.foundation.lazy.LazyListState r17 = X.C97946Do.A00(r6, r2, r1)
            java.lang.Object r1 = X.C147188nY.A0r(r6, r8, r10)
            java.lang.Object r7 = X.C86144wL.A0g(r8, r1, r11, r1)
            X.AnonymousClass7W3.A0w(r8, r3)
            X.75b r7 = (X.AnonymousClass75b) r7
            java.lang.Object r2 = X.C147188nY.A0r(r6, r8, r10)
            if (r2 != r11) goto L_0x012f
            X.7WR r12 = X.AnonymousClass7WR.A00
            java.lang.String r2 = "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>"
            r1 = r22
            androidx.compose.runtime.ParcelableSnapshotMutableState r2 = X.C86104wH.A0I(r12, r1, r2)
            r8.A14(r2)
        L_0x012f:
            X.AnonymousClass7W3.A0w(r8, r3)
            X.8pE r2 = (X.C147368pE) r2
            java.lang.Object r12 = X.C147188nY.A0r(r6, r8, r10)
            if (r12 != r11) goto L_0x0142
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r3)
            androidx.compose.runtime.ParcelableSnapshotMutableState r12 = X.AnonymousClass7WR.A00(r8, r1)
        L_0x0142:
            X.AnonymousClass7W3.A0w(r8, r3)
            X.8pE r12 = (X.C147368pE) r12
            r10 = -2072622718(0xffffffff84764982, float:-2.8950914E-36)
            r1 = r20
            java.lang.Object r1 = X.C147188nY.A0u(r6, r1, r10)
            X.5Hg r1 = (X.AnonymousClass5Hg) r1
            java.util.Map r10 = r1.A04
            r1 = r35
            java.lang.Object r1 = r10.get(r1)
            if (r1 == 0) goto L_0x0415
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0100000_I2 r1 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0100000_I2) r1
            java.lang.Object r10 = r1.A00
            X.8s2 r10 = (X.AnonymousClass8s2) r10
            X.7pA r1 = X.AnonymousClass7pA.A00
            boolean r1 = r10.contains(r1)
            if (r1 == 0) goto L_0x0193
            r1 = 2131834837(0x7f1137d5, float:1.9302796E38)
            java.lang.String r13 = X.AnonymousClass7JS.A01(r6, r1)
            kotlin.Unit r16 = kotlin.Unit.A00
            r1 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            boolean r1 = X.C147188nY.A10(r6, r7, r13, r1)
            java.lang.Object r10 = r8.A13()
            if (r1 != 0) goto L_0x0182
            if (r10 != r11) goto L_0x018e
        L_0x0182:
            r15 = 17
            kotlin.coroutines.jvm.internal.KtSLambdaShape1S1101000_I2 r10 = new kotlin.coroutines.jvm.internal.KtSLambdaShape1S1101000_I2
            r1 = r22
            r10.<init>(r7, r13, r1, r15)
            r8.A14(r10)
        L_0x018e:
            r1 = r16
            X.AnonymousClass7W3.A0b(r6, r8, r10, r1, r3)
        L_0x0193:
            X.AnonymousClass7W3.A0w(r8, r3)
            r1 = -2072622415(0xffffffff84764ab1, float:-2.8951458E-36)
            r6.Cvb(r1)
            if (r14 == 0) goto L_0x01bc
            r1 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            boolean r1 = X.C147188nY.A10(r6, r9, r14, r1)
            java.lang.Object r13 = r8.A13()
            if (r1 != 0) goto L_0x01ad
            if (r13 != r11) goto L_0x01b9
        L_0x01ad:
            r10 = 33
            kotlin.coroutines.jvm.internal.KtSLambdaShape6S0200000_I2_1 r13 = new kotlin.coroutines.jvm.internal.KtSLambdaShape6S0200000_I2_1
            r1 = r22
            r13.<init>((java.lang.Object) r14, (java.lang.Object) r9, (X.C146958n9) r1, (int) r10)
            r8.A14(r13)
        L_0x01b9:
            X.AnonymousClass7W3.A0b(r6, r8, r13, r14, r3)
        L_0x01bc:
            X.AnonymousClass7W3.A0w(r8, r3)
            int r1 = r17.A00()
            java.lang.Integer r13 = java.lang.Integer.valueOf(r1)
            r10 = 1618982084(0x607fb4c4, float:7.370227E19)
            r1 = r20
            boolean r14 = X.C147188nY.A10(r6, r9, r1, r10)
            r1 = r17
            boolean r14 = X.C147188nY.A12(r6, r1, r14)
            java.lang.Object r1 = r8.A13()
            if (r14 != 0) goto L_0x01de
            if (r1 != r11) goto L_0x01f2
        L_0x01de:
            r34 = 13
            kotlin.coroutines.jvm.internal.KtSLambdaShape1S0300000_I2 r1 = new kotlin.coroutines.jvm.internal.KtSLambdaShape1S0300000_I2
            r29 = r1
            r30 = r9
            r31 = r20
            r32 = r17
            r33 = r22
            r29.<init>(r30, r31, r32, r33, r34)
            r8.A14(r1)
        L_0x01f2:
            X.AnonymousClass7W3.A0b(r6, r8, r1, r13, r3)
            java.lang.Object r1 = r20.getValue()
            X.5Hg r1 = (X.AnonymousClass5Hg) r1
            X.67w r1 = r1.A01
            int r13 = r1.ordinal()
            if (r13 == r3) goto L_0x0351
            r1 = 3
            if (r13 == r1) goto L_0x0351
            r1 = r21
            if (r13 == r1) goto L_0x0316
            r1 = r18
            if (r13 == r1) goto L_0x02db
            r1 = -2072621412(0xffffffff84764e9c, float:-2.8953257E-36)
            r6.Cvb(r1)
            X.AnonymousClass7W3.A0w(r8, r3)
            kotlin.Unit r1 = kotlin.Unit.A00
        L_0x0219:
            java.lang.Object r13 = r20.getValue()
            X.5Hg r13 = (X.AnonymousClass5Hg) r13
            X.67w r13 = r13.A00
            int r14 = r13.ordinal()
            if (r14 == r3) goto L_0x02d3
            r13 = 3
            if (r14 == r13) goto L_0x02d3
            r13 = r21
            if (r14 == r13) goto L_0x029d
            r13 = r18
            if (r14 == r13) goto L_0x0268
            r1 = -2072620615(0xffffffff847651b9, float:-2.8954686E-36)
            r6.Cvb(r1)
        L_0x0238:
            X.AnonymousClass7W3.A0w(r8, r3)
            androidx.compose.ui.Modifier r8 = X.AnonymousClass7FI.A01(r28)
            r3 = -295579865(0xffffffffee61cf27, float:-1.747114E28)
            X.8Ty r1 = new X.8Ty
            r36 = r9
            r37 = r35
            r38 = r26
            r39 = r25
            r40 = r23
            r41 = r24
            r43 = r0
            r30 = r19
            r31 = r17
            r32 = r12
            r33 = r2
            r34 = r20
            r35 = r7
            r29 = r1
            r29.<init>(r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43)
            X.C117656z2.A01(r6, r8, r1, r3)
            goto L_0x0076
        L_0x0268:
            r13 = -2072620916(0xffffffff8476508c, float:-2.8954146E-36)
            r6.Cvb(r13)
            r13 = 2131821933(0x7f11056d, float:1.9276623E38)
            java.lang.String r13 = X.AnonymousClass7JS.A01(r6, r13)
            boolean r10 = X.C147188nY.A10(r6, r9, r7, r10)
            boolean r14 = X.C147188nY.A12(r6, r13, r10)
            java.lang.Object r10 = r8.A13()
            if (r14 != 0) goto L_0x0285
            if (r10 != r11) goto L_0x0299
        L_0x0285:
            r34 = 14
            kotlin.coroutines.jvm.internal.KtSLambdaShape1S1201000_I2 r10 = new kotlin.coroutines.jvm.internal.KtSLambdaShape1S1201000_I2
            r29 = r10
            r30 = r9
            r31 = r7
            r32 = r13
            r33 = r22
            r29.<init>(r30, r31, r32, r33, r34)
            r8.A14(r10)
        L_0x0299:
            X.AnonymousClass7W3.A0b(r6, r8, r10, r1, r3)
            goto L_0x0238
        L_0x029d:
            r13 = -2072621257(0xffffffff84764f37, float:-2.8953535E-36)
            r6.Cvb(r13)
            r13 = 2131821932(0x7f11056c, float:1.9276621E38)
            java.lang.String r13 = X.AnonymousClass7JS.A01(r6, r13)
            boolean r10 = X.C147188nY.A10(r6, r9, r7, r10)
            boolean r14 = X.C147188nY.A12(r6, r13, r10)
            java.lang.Object r10 = r8.A13()
            if (r14 != 0) goto L_0x02ba
            if (r10 != r11) goto L_0x02ce
        L_0x02ba:
            r34 = 13
            kotlin.coroutines.jvm.internal.KtSLambdaShape1S1201000_I2 r10 = new kotlin.coroutines.jvm.internal.KtSLambdaShape1S1201000_I2
            r29 = r10
            r30 = r9
            r31 = r7
            r32 = r13
            r33 = r22
            r29.<init>(r30, r31, r32, r33, r34)
            r8.A14(r10)
        L_0x02ce:
            X.AnonymousClass7W3.A0b(r6, r8, r10, r1, r3)
            goto L_0x0238
        L_0x02d3:
            r1 = -2072621293(0xffffffff84764f13, float:-2.895347E-36)
            r6.Cvb(r1)
            goto L_0x0238
        L_0x02db:
            r1 = -2072621680(0xffffffff84764d90, float:-2.8952776E-36)
            r6.Cvb(r1)
            r1 = 2131821935(0x7f11056f, float:1.9276627E38)
            java.lang.String r14 = X.AnonymousClass7JS.A01(r6, r1)
            kotlin.Unit r1 = kotlin.Unit.A00
            boolean r13 = X.C147188nY.A10(r6, r9, r7, r10)
            boolean r15 = X.C147188nY.A12(r6, r14, r13)
            java.lang.Object r13 = r8.A13()
            if (r15 != 0) goto L_0x02fa
            if (r13 != r11) goto L_0x030e
        L_0x02fa:
            r34 = 16
            kotlin.coroutines.jvm.internal.KtSLambdaShape1S1201000_I2 r13 = new kotlin.coroutines.jvm.internal.KtSLambdaShape1S1201000_I2
            r29 = r13
            r30 = r9
            r31 = r7
            r32 = r14
            r33 = r22
            r29.<init>(r30, r31, r32, r33, r34)
            r8.A14(r13)
        L_0x030e:
            X.AnonymousClass7W3.A0b(r6, r8, r13, r1, r3)
            X.AnonymousClass7W3.A0w(r8, r3)
            goto L_0x0219
        L_0x0316:
            r1 = -2072621994(0xffffffff84764c56, float:-2.8952213E-36)
            r6.Cvb(r1)
            r1 = 2131821951(0x7f11057f, float:1.927666E38)
            java.lang.String r14 = X.AnonymousClass7JS.A01(r6, r1)
            kotlin.Unit r1 = kotlin.Unit.A00
            boolean r13 = X.C147188nY.A10(r6, r9, r7, r10)
            boolean r15 = X.C147188nY.A12(r6, r14, r13)
            java.lang.Object r13 = r8.A13()
            if (r15 != 0) goto L_0x0335
            if (r13 != r11) goto L_0x0349
        L_0x0335:
            r34 = 15
            kotlin.coroutines.jvm.internal.KtSLambdaShape1S1201000_I2 r13 = new kotlin.coroutines.jvm.internal.KtSLambdaShape1S1201000_I2
            r29 = r13
            r30 = r9
            r31 = r7
            r32 = r14
            r33 = r22
            r29.<init>(r30, r31, r32, r33, r34)
            r8.A14(r13)
        L_0x0349:
            X.AnonymousClass7W3.A0b(r6, r8, r13, r1, r3)
            X.AnonymousClass7W3.A0w(r8, r3)
            goto L_0x0219
        L_0x0351:
            r1 = -2072622030(0xffffffff84764c32, float:-2.8952148E-36)
            r6.Cvb(r1)
            X.AnonymousClass7W3.A0w(r8, r3)
            kotlin.Unit r1 = kotlin.Unit.A00
            goto L_0x0219
        L_0x035e:
            r14 = 0
            goto L_0x00ee
        L_0x0361:
            if (r13 == 0) goto L_0x0365
            X.7Wm r28 = androidx.compose.ui.Modifier.A00
        L_0x0365:
            if (r12 == 0) goto L_0x0369
            X.4aw r26 = X.C74744aw.A00
        L_0x0369:
            if (r11 == 0) goto L_0x036d
            X.4il r24 = X.C78644il.A00
        L_0x036d:
            if (r10 == 0) goto L_0x0371
            X.4ax r25 = X.C74754ax.A00
        L_0x0371:
            if (r8 == 0) goto L_0x0375
            X.4ay r23 = X.C74764ay.A00
        L_0x0375:
            if (r7 == 0) goto L_0x0379
            r27 = 0
        L_0x0379:
            r1 = r4 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x00b0
            com.instagram.service.session.UserSession r9 = X.AnonymousClass7CZ.A00(r6)
            android.content.Context r1 = X.C147188nY.A0T(r6)
            android.content.Context r8 = X.C18230wP.A09(r1)
            X.0kW r7 = X.C1189973c.A00(r6)
            X.7bc r2 = new X.7bc
            r1 = r44
            r2.<init>(r8, r7, r9, r1)
            X.06C r8 = X.AnonymousClass7CD.A00(r6)
            if (r8 == 0) goto L_0x041c
            X.6o9 r9 = X.C86104wH.A0J(r8)
            java.lang.Class<X.57k> r10 = X.C882757k.class
            r7 = r2
            r11 = r1
            X.3ak r9 = X.C98396Fj.A00(r6, r7, r8, r9, r10, r11)
            X.AnonymousClass7W3.A0z(r6, r3)
            X.57k r9 = (X.C882757k) r9
            goto L_0x00ac
        L_0x03ad:
            r1 = 3670016(0x380000, float:5.142788E-39)
            r1 = r45 & r1
            if (r1 != 0) goto L_0x004e
            r1 = r27
            boolean r1 = r6.ACY(r1)
            int r1 = X.C86104wH.A01(r1)
            goto L_0x004d
        L_0x03bf:
            r1 = 458752(0x70000, float:6.42848E-40)
            r1 = r45 & r1
            if (r1 != 0) goto L_0x0047
            r1 = r23
            int r1 = X.C147188nY.A0E(r6, r1)
            goto L_0x0046
        L_0x03cd:
            r1 = 57344(0xe000, float:8.0356E-41)
            r1 = r1 & r45
            if (r1 != 0) goto L_0x0040
            r1 = r25
            int r1 = X.C147188nY.A0D(r6, r1)
            r0 = r0 | r1
            goto L_0x0040
        L_0x03dd:
            r1 = r5 & 7168(0x1c00, float:1.0045E-41)
            if (r1 != 0) goto L_0x003a
            r1 = r24
            int r1 = X.C147188nY.A0C(r6, r1)
            r0 = r0 | r1
            goto L_0x003a
        L_0x03ea:
            r1 = r5 & 896(0x380, float:1.256E-42)
            if (r1 != 0) goto L_0x0034
            r1 = r26
            int r1 = X.C147188nY.A0B(r6, r1)
            r0 = r0 | r1
            goto L_0x0034
        L_0x03f7:
            r1 = r45 & 112(0x70, float:1.57E-43)
            if (r1 != 0) goto L_0x002e
            r1 = r28
            int r1 = X.C147188nY.A0G(r6, r1)
            r0 = r0 | r1
            goto L_0x002e
        L_0x0404:
            r0 = r45 & 14
            if (r0 != 0) goto L_0x0412
            r0 = r44
            int r0 = X.C147188nY.A0F(r6, r0)
            r0 = r0 | r45
            goto L_0x0028
        L_0x0412:
            r0 = r5
            goto L_0x0028
        L_0x0415:
            java.lang.String r0 = "Required value was null."
            java.lang.IllegalArgumentException r0 = X.C18190wL.A0a(r0)
            throw r0
        L_0x041c:
            java.lang.String r0 = "No ViewModelStoreOwner was provided via LocalViewModelStoreOwner"
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C122107Kg.A05(X.8nY, androidx.compose.ui.Modifier, X.57k, java.lang.String, java.lang.String, X.0ZU, X.0ZU, X.0ZU, X.0YY, int, int):void");
    }

    public static final void A06(C147188nY r37, Modifier modifier, C304621k r39, String str, int i, int i2, boolean z) {
        int i3;
        int i4;
        String A02;
        int i5;
        Modifier modifier2 = modifier;
        C147188nY r15 = r37;
        r15.Cvd(1123504737);
        int i6 = i2;
        C304621k r7 = r39;
        int i7 = i;
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = C147188nY.A0F(r15, r7) | i;
        } else {
            i3 = i7;
        }
        boolean z2 = z;
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= C147188nY.A0M(r15, z2);
        }
        String str2 = str;
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i7 & 896) == 0) {
            i3 |= C147188nY.A0H(r15, str2);
        }
        int i8 = i2 & 8;
        if (i8 != 0) {
            i3 |= 3072;
        } else if ((i7 & 7168) == 0) {
            i3 |= C147188nY.A0I(r15, modifier2);
        }
        if ((i3 & 5851) != 1170 || !r15.BCM()) {
            if (i8 != 0) {
                modifier2 = Modifier.A00;
            }
            int i9 = (i3 >> 9) & 14;
            C146288ly A00 = C120767Cj.A00(r15, AnonymousClass7KV.A00(r15), false);
            Object A0p = C147188nY.A0p(r15);
            Object A0n = C147188nY.A0n(r15);
            Object A0m = C147188nY.A0m(r15);
            AnonymousClass0ZU r9 = AnonymousClass74X.A00;
            AnonymousClass0YM A002 = C98236Es.A00(modifier2);
            int A01 = C86114wI.A01((i9 << 3) & 112);
            AnonymousClass7W3 r1 = (AnonymousClass7W3) r15;
            C147188nY.A0w(r15, r1, r9);
            AnonymousClass7W3.A0a(r15, r1, A00, A0p);
            AnonymousClass7KP.A08(r15, A0n, A0m, A002, A01);
            AnonymousClass7V3 r5 = AnonymousClass7V3.A00;
            int A05 = C86124wJ.A05(i9);
            r15.Cvb(-764013977);
            if ((A05 & 14) == 0) {
                A05 |= C147188nY.A0F(r15, r5);
            }
            if ((A05 & 91) != 18 || !r15.BCM()) {
                int A07 = C147188nY.A07(r15, r7, -434344146);
                if (A07 == 0) {
                    r15.Cvb(1145699473);
                    if (z) {
                        r15.Cvb(1145699492);
                        i5 = 2131821952;
                        A02 = AnonymousClass7JS.A01(r15, i5);
                        AnonymousClass7W3.A0w(r1, false);
                    } else {
                        r15.Cvb(1145699598);
                        i4 = 2131821934;
                        A02 = AnonymousClass7JS.A02(r15, str2, i4);
                        AnonymousClass7W3.A0w(r1, false);
                    }
                } else if (A07 == 1) {
                    r15.Cvb(1145699196);
                    if (z) {
                        r15.Cvb(1145699215);
                        i5 = 2131821953;
                        A02 = AnonymousClass7JS.A01(r15, i5);
                        AnonymousClass7W3.A0w(r1, false);
                    } else {
                        r15.Cvb(1145699322);
                        i4 = 2131821937;
                        A02 = AnonymousClass7JS.A02(r15, str2, i4);
                        AnonymousClass7W3.A0w(r1, false);
                    }
                } else if (A07 == 2) {
                    r15.Cvb(1145699747);
                    A02 = AnonymousClass7JS.A01(r15, 2131821943);
                } else {
                    r15.Cvb(1145681922);
                    AnonymousClass7W3.A0w(r1, false);
                    throw AnonymousClass4VZ.A00();
                }
                AnonymousClass7W3.A0w(r1, false);
                AnonymousClass7W3.A0w(r1, false);
                AnonymousClass7I9.A02(r15, AnonymousClass7K4.A06(AnonymousClass7KV.A01(r5, Modifier.A00), (float) 34, 0), AnonymousClass7J9.A03(r15).A01(new C121807If((C134817yQ) null, (C121117Ee) null, 196605, 0, AnonymousClass7Hi.A03(17), AnonymousClass7Hi.A03(22))), (C114236su) null, (C134817yQ) null, C121117Ee.A01(3), A02, 0, 0, 0, 0, 0, 1976, AnonymousClass7KB.A03(r15), 0, false);
            } else {
                r15.CuJ();
            }
            AnonymousClass7W3.A0f(r1);
        } else {
            r15.CuJ();
        }
        C147178nW AKE = r15.AKE();
        if (AKE != null) {
            AKE.D9d(new KtLambdaShape0S1212000_I2(modifier2, r7, str2, i7, i6, 2, z2));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A07(X.C147188nY r32, androidx.compose.ui.Modifier r33, X.C304621k r34, X.AnonymousClass0ZU r35, X.AnonymousClass0ZU r36, int r37, int r38, int r39, boolean r40) {
        /*
            r3 = r33
            r0 = 1210093406(0x48208f5e, float:164413.47)
            r12 = r32
            r12.Cvd(r0)
            r30 = r39
            r1 = r39 & 1
            r8 = r37
            r0 = r38
            if (r1 == 0) goto L_0x018f
            r2 = r38 | 6
        L_0x0016:
            r5 = r39 & 2
            r4 = 16
            r1 = r34
            if (r5 == 0) goto L_0x0184
            r2 = r2 | 48
        L_0x0020:
            r10 = r39 & 4
            if (r10 == 0) goto L_0x0179
            r2 = r2 | 384(0x180, float:5.38E-43)
        L_0x0026:
            r5 = r39 & 8
            r11 = r35
            if (r5 == 0) goto L_0x016e
            r2 = r2 | 3072(0xc00, float:4.305E-42)
        L_0x002e:
            r5 = r39 & 16
            r9 = r36
            if (r5 == 0) goto L_0x0160
            r2 = r2 | 24576(0x6000, float:3.4438E-41)
        L_0x0036:
            r5 = r39 & 32
            r7 = r40
            if (r5 == 0) goto L_0x0154
            r5 = 196608(0x30000, float:2.75506E-40)
        L_0x003e:
            r2 = r2 | r5
        L_0x003f:
            r6 = 374491(0x5b6db, float:5.24774E-40)
            r6 = r6 & r2
            r5 = 74898(0x12492, float:1.04954E-40)
            if (r6 != r5) goto L_0x0070
            boolean r5 = r12.BCM()
            if (r5 == 0) goto L_0x0070
            r12.CuJ()
        L_0x0051:
            X.8nW r4 = r12.AKE()
            if (r4 == 0) goto L_0x006f
            X.8SK r2 = new X.8SK
            r23 = r2
            r24 = r3
            r25 = r1
            r26 = r11
            r27 = r9
            r28 = r8
            r29 = r0
            r31 = r7
            r23.<init>(r24, r25, r26, r27, r28, r29, r30, r31)
            X.AnonymousClass7WO.A00(r4, r2)
        L_0x006f:
            return
        L_0x0070:
            if (r10 == 0) goto L_0x0074
            X.7Wm r3 = androidx.compose.ui.Modifier.A00
        L_0x0074:
            android.content.Context r5 = X.C147188nY.A0T(r12)
            android.content.res.Resources r10 = r5.getResources()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r8)
            r5 = 1
            java.lang.String r14 = X.C120737Cg.A01(r10, r6, r5)
            X.C04220Ms.A06(r14)
            X.21k r5 = X.C304621k.Following
            if (r1 != r5) goto L_0x00b2
            if (r40 == 0) goto L_0x00b2
            r4 = 588954115(0x231aba03, float:8.387746E-18)
            r12.Cvb(r4)
            int r4 = r2 >> 9
            r17 = r4 & 14
            int r4 = r2 >> 3
            r4 = r4 & 112(0x70, float:1.57E-43)
            r17 = r17 | r4
            int r2 = r2 << 6
            r2 = r2 & 896(0x380, float:1.256E-42)
            r17 = r17 | r2
            r2 = 0
            r13 = r3
            r15 = r11
            r16 = r8
            r18 = r2
            A08(r12, r13, r14, r15, r16, r17, r18)
        L_0x00ae:
            X.AnonymousClass7W3.A0z(r12, r2)
            goto L_0x0051
        L_0x00b2:
            X.21k r5 = X.C304621k.Pending
            if (r1 != r5) goto L_0x00d7
            r4 = 588954363(0x231abafb, float:8.387951E-18)
            r12.Cvb(r4)
            int r4 = r2 >> 12
            r17 = r4 & 14
            int r4 = r2 >> 3
            r4 = r4 & 112(0x70, float:1.57E-43)
            r17 = r17 | r4
            int r2 = r2 << 6
            r2 = r2 & 896(0x380, float:1.256E-42)
            r17 = r17 | r2
            r2 = 0
            r13 = r3
            r15 = r9
            r16 = r8
            r18 = r2
            A09(r12, r13, r14, r15, r16, r17, r18)
            goto L_0x00ae
        L_0x00d7:
            r2 = 588954548(0x231abbb4, float:8.388104E-18)
            r12.Cvb(r2)
            X.21k r5 = X.C304621k.Follower
            r2 = 0
            if (r1 != r5) goto L_0x014a
            r5 = 588954651(0x231abc1b, float:8.38819E-18)
            r12.Cvb(r5)
            r6 = 2131689487(0x7f0f000f, float:1.900799E38)
        L_0x00eb:
            java.lang.Object[] r5 = new java.lang.Object[]{r14}
            java.lang.String r18 = X.AnonymousClass7JS.A04(r12, r5, r6, r8)
            X.7W3 r6 = X.AnonymousClass7W3.A04(r12, r2)
            long r25 = X.AnonymousClass7KB.A03(r12)
            r5 = 44
            float r10 = (float) r5
            float r5 = (float) r4
            r4 = 8
            float r4 = (float) r4
            androidx.compose.ui.Modifier r13 = X.AnonymousClass7K4.A05(r3, r10, r5, r10, r4)
            r4 = 12
            long r27 = X.AnonymousClass7Hi.A03(r4)
            r10 = 3
            X.7If r5 = X.AnonymousClass7J9.A02(r12)
            r35 = 0
            r15 = 0
            r4 = 19
            long r39 = X.AnonymousClass7Hi.A03(r4)
            r34 = 196607(0x2ffff, float:2.75505E-40)
            X.7If r4 = new X.7If
            r31 = r4
            r32 = r15
            r33 = r15
            r37 = r35
            r31.<init>(r32, r33, r34, r35, r37, r39)
            X.7If r14 = r5.A01(r4)
            X.7Ee r17 = X.C121117Ee.A01(r10)
            r22 = 3072(0xc00, float:4.305E-42)
            r24 = 1968(0x7b0, float:2.758E-42)
            r16 = r15
            r20 = r2
            r21 = r2
            r23 = r2
            r29 = r2
            r19 = r2
            X.AnonymousClass7I9.A02(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r27, r29)
            X.AnonymousClass7W3.A0w(r6, r2)
            goto L_0x0051
        L_0x014a:
            r5 = 588954805(0x231abcb5, float:8.388317E-18)
            r12.Cvb(r5)
            r6 = 2131689488(0x7f0f0010, float:1.9007993E38)
            goto L_0x00eb
        L_0x0154:
            r5 = 458752(0x70000, float:6.42848E-40)
            r5 = r5 & r38
            if (r5 != 0) goto L_0x003f
            int r5 = X.C147188nY.A0Q(r12, r7)
            goto L_0x003e
        L_0x0160:
            r5 = 57344(0xe000, float:8.0356E-41)
            r5 = r5 & r38
            if (r5 != 0) goto L_0x0036
            int r5 = X.C147188nY.A0D(r12, r9)
            r2 = r2 | r5
            goto L_0x0036
        L_0x016e:
            r5 = r0 & 7168(0x1c00, float:1.0045E-41)
            if (r5 != 0) goto L_0x002e
            int r5 = X.C147188nY.A0C(r12, r11)
            r2 = r2 | r5
            goto L_0x002e
        L_0x0179:
            r5 = r0 & 896(0x380, float:1.256E-42)
            if (r5 != 0) goto L_0x0026
            int r5 = X.C147188nY.A0H(r12, r3)
            r2 = r2 | r5
            goto L_0x0026
        L_0x0184:
            r5 = r38 & 112(0x70, float:1.57E-43)
            if (r5 != 0) goto L_0x0020
            int r5 = X.C147188nY.A0G(r12, r1)
            r2 = r2 | r5
            goto L_0x0020
        L_0x018f:
            r1 = r38 & 14
            if (r1 != 0) goto L_0x019b
            int r2 = X.C147188nY.A03(r12, r8)
            r2 = r2 | r38
            goto L_0x0016
        L_0x019b:
            r2 = r0
            goto L_0x0016
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C122107Kg.A07(X.8nY, androidx.compose.ui.Modifier, X.21k, X.0ZU, X.0ZU, int, int, int, boolean):void");
    }

    public static final void A08(C147188nY r24, Modifier modifier, String str, AnonymousClass0ZU r27, int i, int i2, int i3) {
        int i4;
        int i5;
        Object[] objArr;
        Modifier modifier2 = modifier;
        C147188nY r11 = r24;
        r11.Cvd(-676769123);
        int i6 = i3;
        AnonymousClass0ZU r5 = r27;
        int i7 = i2;
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            i4 = C147188nY.A09(r11, r5) | i2;
        } else {
            i4 = i7;
        }
        int i8 = i3 & 2;
        if (i8 != 0) {
            i4 |= 48;
        } else if ((i2 & 112) == 0) {
            i4 |= C147188nY.A0G(r11, modifier2);
        }
        int i9 = i;
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i7 & 896) == 0) {
            i4 |= C86124wJ.A06(r11.ACW(i9) ? 1 : 0);
        }
        String str2 = str;
        if ((i3 & 8) != 0) {
            i4 |= 3072;
        } else if ((i7 & 7168) == 0) {
            i4 |= C147188nY.A0I(r11, str2);
        }
        if ((i4 & 5851) != 1170 || !r11.BCM()) {
            if (i8 != 0) {
                modifier2 = Modifier.A00;
            }
            String A01 = AnonymousClass7JS.A01(r11, R.string.f0nameremoved);
            String A012 = AnonymousClass7JS.A01(r11, 2131821940);
            if (i > 0) {
                r11.Cvb(348550780);
                i5 = 2131821939;
                objArr = new Object[]{str2, A01, A012};
            } else {
                r11.Cvb(348550959);
                i5 = 2131821938;
                objArr = new Object[]{A01, A012};
            }
            String A03 = AnonymousClass7JS.A03(r11, objArr, i5);
            AnonymousClass7W3 A04 = AnonymousClass7W3.A04(r11, false);
            C134747yH A013 = AnonymousClass7GE.A01(C134817yQ.A01, A03, A012, "see_all_span", "Clickable link", 32, 0, true);
            float f = (float) 44;
            Modifier A05 = AnonymousClass7K4.A05(modifier2, f, (float) 16, f, (float) 8);
            C121807If A02 = AnonymousClass7J9.A02(r11);
            long A032 = AnonymousClass7Hi.A03(19);
            C121807If A014 = A02.A01(new C121807If((C134817yQ) null, C121117Ee.A01(3), 180220, AnonymousClass7KB.A03(r11), AnonymousClass7Hi.A03(12), A032));
            boolean A10 = C147188nY.A10(r11, A013, r5, 511388516);
            Object A13 = A04.A13();
            if (A10 || A13 == AnonymousClass7GN.A00) {
                A13 = new KtLambdaShape42S0200000_I2_3(13, (Object) A013, (Object) r5);
                A04.A14(A13);
            }
            AnonymousClass6E3.A00(r11, A05, A013, A014, (AnonymousClass0YY) null, AnonymousClass7W3.A0B(A04, A13, false), 0, 0, 0, 120, false);
        } else {
            r11.CuJ();
        }
        C147178nW AKE = r11.AKE();
        if (AKE != null) {
            AKE.D9d(new KtLambdaShape0S1203000_I2(modifier2, r5, str2, i9, i7, i6, 1));
        }
    }

    public static final void A09(C147188nY r25, Modifier modifier, String str, AnonymousClass0ZU r28, int i, int i2, int i3) {
        int i4;
        Modifier modifier2 = modifier;
        C147188nY r11 = r25;
        r11.Cvd(-1469195101);
        int i5 = i3;
        AnonymousClass0ZU r3 = r28;
        int i6 = i2;
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            i4 = C147188nY.A09(r11, r3) | i2;
        } else {
            i4 = i6;
        }
        int i7 = i3 & 2;
        if (i7 != 0) {
            i4 |= 48;
        } else if ((i2 & 112) == 0) {
            i4 |= C147188nY.A0G(r11, modifier2);
        }
        int i8 = i;
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i6 & 896) == 0) {
            i4 |= C86124wJ.A06(r11.ACW(i8) ? 1 : 0);
        }
        String str2 = str;
        if ((i3 & 8) != 0) {
            i4 |= 3072;
        } else if ((i6 & 7168) == 0) {
            i4 |= C147188nY.A0I(r11, str2);
        }
        if ((i4 & 5851) != 1170 || !r11.BCM()) {
            if (i7 != 0) {
                modifier2 = Modifier.A00;
            }
            String A01 = AnonymousClass7JS.A01(r11, R.string.f0nameremoved);
            String A012 = AnonymousClass7JS.A01(r11, 2131821944);
            C134747yH A013 = AnonymousClass7GE.A01(C134817yQ.A01, AnonymousClass7JS.A04(r11, new Object[]{str2, A01, A012}, R.plurals.barcelona_following_graph_pending_tab_count, i8), A012, "how_it_works_span", "Clickable link", 32, 0, true);
            float f = (float) 44;
            Modifier A05 = AnonymousClass7K4.A05(modifier2, f, (float) 16, f, (float) 8);
            C121807If A02 = AnonymousClass7J9.A02(r11);
            long A03 = AnonymousClass7Hi.A03(19);
            C121807If A014 = A02.A01(new C121807If((C134817yQ) null, C121117Ee.A01(3), 180220, AnonymousClass7KB.A03(r11), AnonymousClass7Hi.A03(12), A03));
            boolean A10 = C147188nY.A10(r11, A013, r3, 511388516);
            AnonymousClass7W3 r8 = (AnonymousClass7W3) r11;
            Object A13 = r8.A13();
            if (A10 || A13 == AnonymousClass7GN.A00) {
                A13 = new KtLambdaShape42S0200000_I2_3(14, (Object) A013, (Object) r3);
                r8.A14(A13);
            }
            AnonymousClass6E3.A00(r11, A05, A013, A014, (AnonymousClass0YY) null, AnonymousClass7W3.A0B(r8, A13, false), 0, 0, 0, 120, false);
        } else {
            r11.CuJ();
        }
        C147178nW AKE = r11.AKE();
        if (AKE != null) {
            AKE.D9d(new KtLambdaShape0S1203000_I2(modifier2, r3, str2, i8, i6, i5, 2));
        }
    }

    public static final void A0A(C147188nY r23, Modifier modifier, AnonymousClass0ZU r25, int i, int i2) {
        int i3;
        Modifier modifier2 = modifier;
        C147188nY r14 = r23;
        r14.Cvd(-1317198816);
        int i4 = i2;
        AnonymousClass0ZU r2 = r25;
        int i5 = i;
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = C147188nY.A09(r14, r2) | i;
        } else {
            i3 = i5;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= C147188nY.A0G(r14, modifier2);
        }
        if ((i3 & 91) != 18 || !r14.BCM()) {
            if (i6 != 0) {
                modifier2 = Modifier.A00;
            }
            int i7 = (i3 >> 3) & 14;
            C146288ly A00 = C120767Cj.A00(r14, AnonymousClass7KV.A00(r14), false);
            Object A0p = C147188nY.A0p(r14);
            Object A0n = C147188nY.A0n(r14);
            Object A0m = C147188nY.A0m(r14);
            AnonymousClass0ZU r7 = AnonymousClass74X.A00;
            AnonymousClass0YM A002 = C98236Es.A00(modifier2);
            int A01 = C86114wI.A01((i7 << 3) & 112);
            AnonymousClass7W3 r3 = (AnonymousClass7W3) r14;
            C147188nY.A0w(r14, r3, r7);
            AnonymousClass7W3.A0a(r14, r3, A00, A0p);
            AnonymousClass7KP.A08(r14, A0n, A0m, A002, A01);
            AnonymousClass7V3 r72 = AnonymousClass7V3.A00;
            int A05 = C86124wJ.A05(i7);
            r14.Cvb(-1424957530);
            if ((A05 & 14) == 0) {
                A05 |= C147188nY.A0F(r14, r72);
            }
            if ((A05 & 91) != 18 || !r14.BCM()) {
                C115286uo A003 = AnonymousClass6QP.A00(r14, R.drawable.loadmore_icon_refresh_compound);
                Modifier A012 = AnonymousClass7KV.A01(r72, AnonymousClass7K4.A08(AnonymousClass7Kq.A03((Alignment) null, Modifier.A00, 3), 8));
                boolean A0y = C147188nY.A0y(r14, r2);
                Object A13 = r3.A13();
                if (A0y || A13 == AnonymousClass7GN.A00) {
                    A13 = AnonymousClass7W3.A0K(r3, r2, 5);
                }
                C1190173e.A00(r14, C117646z1.A00(A012, (AnonymousClass799) null, (String) null, AnonymousClass7W3.A08(r3, A13, false), 15, false), A003, (String) null, 56, 0, AnonymousClass7KB.A03(r14));
            } else {
                r14.CuJ();
            }
            AnonymousClass7W3.A0f(r3);
        } else {
            r14.CuJ();
        }
        C147178nW AKE = r14.AKE();
        if (AKE != null) {
            AKE.D9d(new KtLambdaShape2S0202000_I2(modifier2, i5, r2, i4, 21));
        }
    }

    public static final void A00(C147188nY r29, int i) {
        C147188nY r4 = r29;
        r4.Cvd(1817378582);
        int i2 = i;
        if (i != 0 || !r4.BCM()) {
            String A01 = AnonymousClass7JS.A01(r4, 2131821942);
            long A03 = AnonymousClass7KB.A03(r4);
            AnonymousClass7I9.A02(r4, AnonymousClass7K4.A06(Modifier.A00, (float) 16, 12), AnonymousClass7J9.A03(r4).A01(new C121807If((C134817yQ) null, (C121117Ee) null, 196605, 0, AnonymousClass7Hi.A03(17), AnonymousClass7Hi.A03(22))), (C114236su) null, (C134817yQ) null, C121117Ee.A01(5), A01, 0, 0, 0, 3120, 0, 1968, A03, AnonymousClass7Hi.A03(17), false);
        } else {
            r4.CuJ();
        }
        C147178nW AKE = r4.AKE();
        if (AKE != null) {
            C147178nW.A00(AKE, i2, 2);
        }
    }

    public static final void A0B(C147188nY r15, C304621k r16, AnonymousClass0ZU r17, AnonymousClass0ZU r18, int i) {
        int i2;
        int i3;
        String A01;
        C147188nY r9 = r15;
        r15.Cvd(-1808135045);
        int i4 = i;
        AnonymousClass0ZU r152 = r17;
        if ((i & 14) == 0) {
            i2 = C147188nY.A09(r9, r152) | i;
        } else {
            i2 = i4;
        }
        AnonymousClass0ZU r2 = r18;
        if ((i & 112) == 0) {
            i2 |= C147188nY.A0A(r9, r2);
        }
        C304621k r3 = r16;
        if ((i4 & 896) == 0) {
            i2 |= C147188nY.A0H(r9, r3);
        }
        if ((i2 & 731) != 146 || !r9.BCM()) {
            String A012 = AnonymousClass7JS.A01(r9, R.string.f0nameremoved);
            int i5 = 2131821515;
            if (r3 == C304621k.Pending) {
                i5 = 2131821931;
            }
            String A013 = AnonymousClass7JS.A01(r9, i5);
            int ordinal = r3.ordinal();
            if (ordinal == 0) {
                i3 = 2131821928;
                A01 = AnonymousClass7JS.A01(r9, i3);
            } else if (ordinal == 1) {
                i3 = 2131821929;
                A01 = AnonymousClass7JS.A01(r9, i3);
            } else if (ordinal == 2) {
                A01 = AnonymousClass7JS.A02(r9, A012, 2131821930);
            } else {
                throw AnonymousClass4VZ.A00();
            }
            AnonymousClass6QY.A00(r9, new KtCSuperShape0S2210000_I2(AnonymousClass006.A0C, AnonymousClass7JS.A01(r9, 2131824237), r2, 12), AnonymousClass6QW.A00(r9, (Integer) null, (AnonymousClass0ZU) null, 2131823054, 30), (KtCSuperShape0S2210000_I2) null, A013, A01, r152, i2 & 14, 224, false, false);
        } else {
            r9.CuJ();
        }
        C147178nW AKE = r9.AKE();
        if (AKE != null) {
            AKE.D9d(new KtLambdaShape18S0301000_I2(i4, 20, r3, r2, r152));
        }
    }

    public static final void A0C(C147188nY r13, String str, AnonymousClass0ZU r15, AnonymousClass0ZU r16, int i) {
        int i2;
        C147188nY r7 = r13;
        r13.Cvd(-1595842153);
        int i3 = i;
        String str2 = str;
        if ((i & 14) == 0) {
            i2 = C147188nY.A0F(r13, str) | i;
        } else {
            i2 = i3;
        }
        AnonymousClass0ZU r132 = r15;
        if ((i & 112) == 0) {
            i2 |= C147188nY.A0A(r7, r15);
        }
        AnonymousClass0ZU r3 = r16;
        if ((i3 & 896) == 0) {
            i2 |= C147188nY.A0B(r7, r3);
        }
        if ((i2 & 731) != 146 || !r7.BCM()) {
            String A01 = AnonymousClass7JS.A01(r7, R.string.f0nameremoved);
            AnonymousClass6QY.A00(r7, AnonymousClass6QW.A00(r7, AnonymousClass006.A0C, r3, 2131821948, 12), AnonymousClass6QW.A00(r7, (Integer) null, (AnonymousClass0ZU) null, 2131823054, 30), (KtCSuperShape0S2210000_I2) null, AnonymousClass7JS.A01(r7, 2131821950), AnonymousClass7JS.A03(r7, new Object[]{A01, str}, 2131821949), r132, (i2 >> 3) & 14, 224, false, false);
        } else {
            r7.CuJ();
        }
        C147178nW AKE = r7.AKE();
        if (AKE != null) {
            AKE.D9d(new KtLambdaShape3S1201000_I2(str2, r132, r3, i3, 8));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:112:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x013e  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x014d  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x015a  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0165  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0176  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0188  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x019a  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x01ad  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(X.C147188nY r36, androidx.compose.ui.Modifier r37, com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0100000_I2 r38, X.C304621k r39, java.lang.String r40, X.AnonymousClass0ZU r41, X.AnonymousClass0ZU r42, X.AnonymousClass0ZU r43, X.AnonymousClass0ZU r44, X.AnonymousClass0YY r45, X.AnonymousClass0YY r46, X.AnonymousClass0YY r47, X.AnonymousClass0YY r48, X.AnonymousClass0YP r49, int r50, int r51, int r52, boolean r53) {
        /*
            r1 = r37
            r0 = -1104997531(0xffffffffbe231365, float:-0.15925367)
            r8 = r36
            r8.Cvd(r0)
            r3 = r52
            r0 = r52 & 1
            r5 = r50
            if (r0 == 0) goto L_0x01fa
            r12 = r50 | 6
        L_0x0014:
            r0 = r52 & 2
            r14 = r46
            if (r0 == 0) goto L_0x01ef
            r12 = r12 | 48
        L_0x001c:
            r0 = r52 & 4
            r10 = r47
            if (r0 == 0) goto L_0x01e4
            r12 = r12 | 384(0x180, float:5.38E-43)
        L_0x0024:
            r0 = r52 & 8
            r15 = 2048(0x800, float:2.87E-42)
            r6 = r49
            if (r0 == 0) goto L_0x01d9
            r12 = r12 | 3072(0xc00, float:4.305E-42)
        L_0x002e:
            r0 = r52 & 16
            r9 = r48
            if (r0 == 0) goto L_0x01cb
            r12 = r12 | 24576(0x6000, float:3.4438E-41)
        L_0x0036:
            r0 = r52 & 32
            r7 = r41
            if (r0 == 0) goto L_0x01bf
            r0 = 196608(0x30000, float:2.75506E-40)
        L_0x003e:
            r12 = r12 | r0
        L_0x003f:
            r0 = r52 & 64
            r22 = r42
            if (r0 == 0) goto L_0x01ad
            r0 = 1572864(0x180000, float:2.204052E-39)
        L_0x0047:
            r12 = r12 | r0
        L_0x0048:
            r0 = r3 & 128(0x80, float:1.794E-43)
            r16 = 12582912(0xc00000, float:1.7632415E-38)
            r47 = r43
            if (r0 == 0) goto L_0x019a
            r12 = r12 | r16
        L_0x0052:
            r0 = r3 & 256(0x100, float:3.59E-43)
            r46 = r44
            if (r0 == 0) goto L_0x0188
            r0 = 100663296(0x6000000, float:2.4074124E-35)
        L_0x005a:
            r12 = r12 | r0
        L_0x005b:
            r0 = r3 & 512(0x200, float:7.175E-43)
            r49 = r39
            if (r0 == 0) goto L_0x0176
            r0 = 805306368(0x30000000, float:4.656613E-10)
        L_0x0063:
            r12 = r12 | r0
        L_0x0064:
            r0 = r3 & 1024(0x400, float:1.435E-42)
            r4 = r51
            r50 = r38
            if (r0 == 0) goto L_0x0165
            r11 = r51 | 6
        L_0x006e:
            r0 = r3 & 2048(0x800, float:2.87E-42)
            r2 = r53
            if (r0 == 0) goto L_0x015a
            r11 = r11 | 48
        L_0x0076:
            r0 = r3 & 4096(0x1000, float:5.74E-42)
            r48 = r40
            if (r0 == 0) goto L_0x014d
            r11 = r11 | 384(0x180, float:5.38E-43)
        L_0x007e:
            r13 = r3 & 8192(0x2000, float:1.14794E-41)
            if (r13 == 0) goto L_0x013e
            r11 = r11 | 3072(0xc00, float:4.305E-42)
        L_0x0084:
            r0 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r15 = r12 & r0
            r0 = 306783378(0x12492492, float:6.3469493E-28)
            if (r15 != r0) goto L_0x00cd
            r15 = r11 & 5851(0x16db, float:8.199E-42)
            r0 = 1170(0x492, float:1.64E-42)
            if (r15 != r0) goto L_0x00cd
            boolean r0 = r8.BCM()
            if (r0 == 0) goto L_0x00cd
            r8.CuJ()
        L_0x009d:
            X.8nW r8 = r8.AKE()
            if (r8 == 0) goto L_0x00cc
            X.8UD r0 = new X.8UD
            r23 = r6
            r24 = r5
            r25 = r4
            r26 = r3
            r27 = r2
            r15 = r7
            r16 = r22
            r17 = r47
            r18 = r46
            r19 = r45
            r20 = r14
            r21 = r10
            r22 = r9
            r10 = r0
            r11 = r1
            r12 = r50
            r13 = r49
            r14 = r48
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            X.AnonymousClass7WO.A00(r8, r0)
        L_0x00cc:
            return
        L_0x00cd:
            if (r13 == 0) goto L_0x00d1
            X.7Wm r1 = androidx.compose.ui.Modifier.A00
        L_0x00d1:
            r13 = 3
            r0 = 0
            androidx.compose.foundation.lazy.LazyListState r36 = X.C97946Do.A00(r8, r0, r13)
            r33 = 0
            X.8K6 r17 = new X.8K6
            r18 = r1
            r19 = r50
            r20 = r49
            r21 = r48
            r23 = r47
            r24 = r46
            r25 = r14
            r26 = r10
            r27 = r45
            r28 = r9
            r29 = r6
            r30 = r12
            r31 = r11
            r32 = r2
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
            int r11 = r11 >> 9
            r41 = r11 & 14
            r41 = r41 | r16
            r42 = 124(0x7c, float:1.74E-43)
            r44 = 1
            r34 = r33
            r35 = r33
            r37 = r8
            r38 = r33
            r39 = r1
            r40 = r17
            r43 = r0
            X.C115696vl.A01(r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44)
            boolean r11 = X.C147188nY.A0y(r8, r7)
            r13 = r8
            X.7W3 r13 = (X.AnonymousClass7W3) r13
            java.lang.Object r12 = r13.A13()
            if (r11 != 0) goto L_0x0126
            java.lang.Object r11 = X.AnonymousClass7GN.A00
            if (r12 != r11) goto L_0x012b
        L_0x0126:
            r11 = 7
            kotlin.jvm.internal.KtLambdaShape36S0100000_I2_16 r12 = X.AnonymousClass7W3.A0K(r13, r7, r11)
        L_0x012b:
            X.0ZU r17 = X.AnonymousClass7W3.A08(r13, r12, r0)
            r15 = r36
            r16 = r8
            r18 = r0
            r19 = r0
            r20 = r44
            X.AnonymousClass70X.A00(r15, r16, r17, r18, r19, r20)
            goto L_0x009d
        L_0x013e:
            r0 = r4 & 7168(0x1c00, float:1.0045E-41)
            if (r0 != 0) goto L_0x0084
            boolean r0 = r8.ACY(r1)
            if (r0 != 0) goto L_0x014a
            r15 = 1024(0x400, float:1.435E-42)
        L_0x014a:
            r11 = r11 | r15
            goto L_0x0084
        L_0x014d:
            r0 = r4 & 896(0x380, float:1.256E-42)
            if (r0 != 0) goto L_0x007e
            r0 = r48
            int r0 = X.C147188nY.A0H(r8, r0)
            r11 = r11 | r0
            goto L_0x007e
        L_0x015a:
            r0 = r51 & 112(0x70, float:1.57E-43)
            if (r0 != 0) goto L_0x0076
            int r0 = X.C147188nY.A0M(r8, r2)
            r11 = r11 | r0
            goto L_0x0076
        L_0x0165:
            r0 = r51 & 14
            if (r0 != 0) goto L_0x0173
            r0 = r50
            int r0 = X.C147188nY.A0F(r8, r0)
            r11 = r51 | r0
            goto L_0x006e
        L_0x0173:
            r11 = r4
            goto L_0x006e
        L_0x0176:
            r0 = 1879048192(0x70000000, float:1.58456325E29)
            r0 = r0 & r50
            if (r0 != 0) goto L_0x0064
            r0 = r49
            boolean r0 = r8.ACY(r0)
            int r0 = X.C86104wH.A02(r0)
            goto L_0x0063
        L_0x0188:
            r0 = 234881024(0xe000000, float:1.5777218E-30)
            r0 = r0 & r50
            if (r0 != 0) goto L_0x005b
            r0 = r46
            boolean r0 = r8.ACa(r0)
            int r0 = X.C86104wH.A03(r0)
            goto L_0x005a
        L_0x019a:
            r0 = 29360128(0x1c00000, float:7.052966E-38)
            r0 = r0 & r50
            if (r0 != 0) goto L_0x0052
            r0 = r47
            boolean r0 = r8.ACa(r0)
            int r0 = X.C86104wH.A04(r0)
            r12 = r12 | r0
            goto L_0x0052
        L_0x01ad:
            r0 = 3670016(0x380000, float:5.142788E-39)
            r0 = r50 & r0
            if (r0 != 0) goto L_0x0048
            r0 = r22
            boolean r0 = r8.ACa(r0)
            int r0 = X.C86104wH.A01(r0)
            goto L_0x0047
        L_0x01bf:
            r0 = 458752(0x70000, float:6.42848E-40)
            r0 = r50 & r0
            if (r0 != 0) goto L_0x003f
            int r0 = X.C147188nY.A0E(r8, r7)
            goto L_0x003e
        L_0x01cb:
            r0 = 57344(0xe000, float:8.0356E-41)
            r0 = r50 & r0
            if (r0 != 0) goto L_0x0036
            int r0 = X.C147188nY.A0D(r8, r9)
            r12 = r12 | r0
            goto L_0x0036
        L_0x01d9:
            r0 = r5 & 7168(0x1c00, float:1.0045E-41)
            if (r0 != 0) goto L_0x002e
            int r0 = X.C147188nY.A0C(r8, r6)
            r12 = r12 | r0
            goto L_0x002e
        L_0x01e4:
            r0 = r5 & 896(0x380, float:1.256E-42)
            if (r0 != 0) goto L_0x0024
            int r0 = X.C147188nY.A0B(r8, r10)
            r12 = r12 | r0
            goto L_0x0024
        L_0x01ef:
            r0 = r50 & 112(0x70, float:1.57E-43)
            if (r0 != 0) goto L_0x001c
            int r0 = X.C147188nY.A0A(r8, r14)
            r12 = r12 | r0
            goto L_0x001c
        L_0x01fa:
            r0 = r50 & 14
            if (r0 != 0) goto L_0x0208
            r0 = r45
            int r12 = X.C147188nY.A09(r8, r0)
            r12 = r12 | r50
            goto L_0x0014
        L_0x0208:
            r12 = r5
            goto L_0x0014
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C122107Kg.A01(X.8nY, androidx.compose.ui.Modifier, com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0100000_I2, X.21k, java.lang.String, X.0ZU, X.0ZU, X.0ZU, X.0ZU, X.0YY, X.0YY, X.0YY, X.0YY, X.0YP, int, int, int, boolean):void");
    }
}
