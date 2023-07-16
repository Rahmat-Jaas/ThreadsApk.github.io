package X;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutIdModifierElement;
import ch.boye.httpclientandroidlib.HttpStatus;
import com.facebook.redex.IDxMPolicyShape843S0100000_2_I2;
import kotlin.jvm.internal.KtLambdaShape1S1311000_I2;
import kotlin.jvm.internal.KtLambdaShape3S1201000_I2;

/* renamed from: X.7Hu  reason: invalid class name and case insensitive filesystem */
public final class C121737Hu {
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0067, code lost:
        if (r5 == false) goto L_0x0069;
     */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x01a1  */
    /* JADX WARNING: Removed duplicated region for block: B:95:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C147258p3 r39, X.C147188nY r40, androidx.compose.ui.Modifier r41, X.C142488ew r42, java.lang.String r43, java.lang.String r44, X.AnonymousClass0YY r45, int r46, int r47, int r48, int r49, boolean r50) {
        /*
            r13 = r50
            r6 = r39
            r9 = r47
            r15 = r46
            r14 = r42
            r8 = 0
            r7 = r43
            r46 = r45
            r0 = r46
            boolean r12 = X.AnonymousClass0wJ.A1Z(r7, r0)
            r10 = r41
            r47 = r44
            r0 = r47
            X.AnonymousClass0wJ.A1Q(r0, r10)
            r0 = 596121625(0x23881819, float:1.4755355E-17)
            r1 = r40
            r1.Cvd(r0)
            r2 = r49
            r3 = r49 & 1
            r0 = r48
            if (r3 == 0) goto L_0x0205
            r3 = r48 | 6
        L_0x0030:
            r4 = r49 & 2
            if (r4 == 0) goto L_0x01f8
            r3 = r3 | 48
        L_0x0036:
            r4 = r49 & 4
            if (r4 == 0) goto L_0x01eb
            r3 = r3 | 384(0x180, float:5.38E-43)
        L_0x003c:
            r4 = r49 & 8
            if (r4 == 0) goto L_0x01e0
            r3 = r3 | 3072(0xc00, float:4.305E-42)
        L_0x0042:
            r20 = r49 & 16
            if (r20 == 0) goto L_0x01d2
            r3 = r3 | 24576(0x6000, float:3.4438E-41)
        L_0x0048:
            r19 = r49 & 32
            r18 = 196608(0x30000, float:2.75506E-40)
            if (r19 == 0) goto L_0x01bf
            r3 = r3 | r18
        L_0x0050:
            r17 = r49 & 64
            if (r17 == 0) goto L_0x01af
            r4 = 1572864(0x180000, float:2.204052E-39)
        L_0x0056:
            r3 = r3 | r4
        L_0x0057:
            r4 = 29360128(0x1c00000, float:7.052966E-38)
            r4 = r4 & r48
            if (r4 != 0) goto L_0x006c
            r4 = r2 & 128(0x80, float:1.794E-43)
            if (r4 != 0) goto L_0x0069
            boolean r5 = r1.ACZ(r13)
            r4 = 8388608(0x800000, float:1.17549435E-38)
            if (r5 != 0) goto L_0x006b
        L_0x0069:
            r4 = 4194304(0x400000, float:5.877472E-39)
        L_0x006b:
            r3 = r3 | r4
        L_0x006c:
            r5 = r2 & 256(0x100, float:3.59E-43)
            r16 = 234881024(0xe000000, float:1.5777218E-30)
            if (r5 == 0) goto L_0x01a1
            r4 = 100663296(0x6000000, float:2.4074124E-35)
        L_0x0074:
            r3 = r3 | r4
        L_0x0075:
            r4 = 191739611(0xb6db6db, float:4.5782105E-32)
            r11 = r3 & r4
            r4 = 38347922(0x2492492, float:1.4777643E-37)
            if (r11 != r4) goto L_0x00af
            boolean r4 = r1.BCM()
            if (r4 == 0) goto L_0x00af
            r1.CuJ()
        L_0x0088:
            X.8nW r3 = r1.AKE()
            if (r3 == 0) goto L_0x00ae
            X.8TR r1 = new X.8TR
            r16 = r1
            r17 = r6
            r18 = r10
            r19 = r14
            r20 = r7
            r21 = r47
            r22 = r46
            r23 = r15
            r24 = r9
            r25 = r0
            r26 = r2
            r27 = r13
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            X.AnonymousClass7WO.A00(r3, r1)
        L_0x00ae:
            return
        L_0x00af:
            r1.CvD()
            r4 = r48 & 1
            r11 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            if (r4 == 0) goto L_0x0181
            boolean r4 = r1.Acj()
            if (r4 != 0) goto L_0x0181
            r1.CuJ()
            r4 = r2 & 128(0x80, float:1.794E-43)
            if (r4 == 0) goto L_0x00c7
            r3 = r3 & r11
        L_0x00c7:
            r1.AKA()
            r30 = r3 & 14
            boolean r5 = X.C147188nY.A0y(r1, r7)
            r4 = r1
            X.7W3 r4 = (X.AnonymousClass7W3) r4
            java.lang.Object r11 = r4.A13()
            if (r5 != 0) goto L_0x00dd
            java.lang.Object r5 = X.AnonymousClass7GN.A00
            if (r11 != r5) goto L_0x00e3
        L_0x00dd:
            r5 = 10
            kotlin.jvm.internal.KtLambdaShape8S1000000_I2 r11 = X.AnonymousClass7W3.A0Q(r4, r7, r5)
        L_0x00e3:
            X.0ZU r5 = X.AnonymousClass7W3.A09(r4, r11, r8)
            X.7Wf r25 = X.C123267Wf.A01(r5)
            r5 = 54
            float r5 = (float) r5
            r17 = 0
            androidx.compose.ui.Modifier r20 = X.AnonymousClass7Kq.A07(r10, r5)
            r5 = -2108279257(0xffffffff82563627, float:-1.5737778E-37)
            r1.Cvb(r5)
            X.7If r31 = X.AnonymousClass7J9.A03(r1)
            long r38 = X.AnonymousClass7KB.A02(r1)
            r40 = 0
            X.7If r5 = X.AnonymousClass7J9.A03(r1)
            X.7Ex r5 = r5.A00
            X.6sy r5 = r5.A05
            r37 = 2097150(0x1ffffe, float:2.938733E-39)
            r32 = r17
            r33 = r17
            r34 = r5
            r35 = r17
            r36 = r17
            r42 = r40
            r44 = r40
            X.7If r22 = X.C121807If.A00(r31, r32, r33, r34, r35, r36, r37, r38, r40, r42, r44)
            X.AnonymousClass7W3.A0w(r4, r8)
            long r4 = X.AnonymousClass7KB.A04(r1)
            X.53m r11 = new X.53m
            r11.<init>(r4)
            r5 = -211775709(0xfffffffff3608f23, float:-1.7791407E31)
            kotlin.jvm.internal.KtLambdaShape2S1301000_I2 r4 = new kotlin.jvm.internal.KtLambdaShape2S1301000_I2
            r23 = r4
            r24 = r6
            r26 = r14
            r27 = r47
            r28 = r3
            r29 = r12
            r23.<init>(r24, r25, r26, r27, r28, r29)
            X.8sI r27 = X.AnonymousClass7JR.A00(r1, r4, r5)
            r4 = r3 & 112(0x70, float:1.57E-43)
            r30 = r30 | r4
            int r4 = r3 << 3
            r4 = r4 & r16
            r30 = r30 | r4
            r5 = 1879048192(0x70000000, float:1.58456325E29)
            int r4 = r3 << 9
            r5 = r5 & r4
            r30 = r30 | r5
            int r3 = r3 >> 15
            r31 = r3 & 14
            r31 = r31 | r18
            r3 = r3 & 7168(0x1c00, float:1.0045E-41)
            r31 = r31 | r3
            r32 = 6360(0x18d8, float:8.912E-42)
            r18 = r17
            r23 = r17
            r24 = r7
            r25 = r46
            r26 = r17
            r28 = r9
            r29 = r15
            r33 = r8
            r34 = r8
            r35 = r13
            r16 = r6
            r19 = r1
            r21 = r11
            X.C115736vp.A01(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35)
            goto L_0x0088
        L_0x0181:
            if (r20 == 0) goto L_0x0185
            X.7uV r14 = X.C132787uV.A00
        L_0x0185:
            if (r19 == 0) goto L_0x0188
            r15 = 1
        L_0x0188:
            if (r17 == 0) goto L_0x018b
            r9 = 1
        L_0x018b:
            r4 = r2 & 128(0x80, float:1.794E-43)
            if (r4 == 0) goto L_0x0194
            boolean r13 = X.AnonymousClass0wJ.A1T(r9, r12)
            r3 = r3 & r11
        L_0x0194:
            if (r5 == 0) goto L_0x00c7
            r4 = r1
            X.7W3 r4 = (X.AnonymousClass7W3) r4
            java.lang.Object r6 = X.AnonymousClass7GN.A00(r4)
            X.8p3 r6 = (X.C147258p3) r6
            goto L_0x00c7
        L_0x01a1:
            r4 = r48 & r16
            if (r4 != 0) goto L_0x0075
            boolean r4 = r1.ACY(r6)
            int r4 = X.C86104wH.A03(r4)
            goto L_0x0074
        L_0x01af:
            r4 = 3670016(0x380000, float:5.142788E-39)
            r4 = r4 & r48
            if (r4 != 0) goto L_0x0057
            boolean r4 = r1.ACW(r9)
            int r4 = X.C86104wH.A01(r4)
            goto L_0x0056
        L_0x01bf:
            r4 = 458752(0x70000, float:6.42848E-40)
            r4 = r4 & r48
            if (r4 != 0) goto L_0x0050
            boolean r5 = r1.ACW(r15)
            r4 = 65536(0x10000, float:9.18355E-41)
            if (r5 == 0) goto L_0x01cf
            r4 = 131072(0x20000, float:1.83671E-40)
        L_0x01cf:
            r3 = r3 | r4
            goto L_0x0050
        L_0x01d2:
            r4 = 57344(0xe000, float:8.0356E-41)
            r4 = r4 & r48
            if (r4 != 0) goto L_0x0048
            int r4 = X.C147188nY.A0J(r1, r14)
            r3 = r3 | r4
            goto L_0x0048
        L_0x01e0:
            r4 = r0 & 7168(0x1c00, float:1.0045E-41)
            if (r4 != 0) goto L_0x0042
            int r4 = X.C147188nY.A0I(r1, r10)
            r3 = r3 | r4
            goto L_0x0042
        L_0x01eb:
            r4 = r0 & 896(0x380, float:1.256E-42)
            if (r4 != 0) goto L_0x003c
            r4 = r47
            int r4 = X.C147188nY.A0H(r1, r4)
            r3 = r3 | r4
            goto L_0x003c
        L_0x01f8:
            r4 = r48 & 112(0x70, float:1.57E-43)
            if (r4 != 0) goto L_0x0036
            r4 = r46
            int r4 = X.C147188nY.A0A(r1, r4)
            r3 = r3 | r4
            goto L_0x0036
        L_0x0205:
            r3 = r48 & 14
            if (r3 != 0) goto L_0x0211
            int r3 = X.C147188nY.A0F(r1, r7)
            r3 = r3 | r48
            goto L_0x0030
        L_0x0211:
            r3 = r0
            goto L_0x0030
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C121737Hu.A00(X.8p3, X.8nY, androidx.compose.ui.Modifier, X.8ew, java.lang.String, java.lang.String, X.0YY, int, int, int, int, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0081, code lost:
        if ((r6 instanceof X.C132787uV) == false) goto L_0x0083;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(X.C147258p3 r18, X.C147188nY r19, X.C142488ew r20, java.lang.String r21, X.AnonymousClass0YP r22, int r23, boolean r24) {
        /*
            r0 = -1361581537(0xffffffffaed7ea1f, float:-9.818656E-11)
            r10 = r19
            r10.Cvd(r0)
            r3 = r23
            r0 = r23 & 14
            r2 = r24
            if (r0 != 0) goto L_0x0108
            int r17 = X.C147188nY.A0L(r10, r2)
            r17 = r17 | r23
        L_0x0016:
            r0 = r23 & 112(0x70, float:1.57E-43)
            r5 = r21
            if (r0 != 0) goto L_0x0022
            int r0 = X.C147188nY.A0G(r10, r5)
            r17 = r17 | r0
        L_0x0022:
            r0 = r3 & 896(0x380, float:1.256E-42)
            r6 = r20
            if (r0 != 0) goto L_0x002e
            int r0 = X.C147188nY.A0H(r10, r6)
            r17 = r17 | r0
        L_0x002e:
            r0 = r3 & 7168(0x1c00, float:1.0045E-41)
            r7 = r18
            if (r0 != 0) goto L_0x003a
            int r0 = X.C147188nY.A0I(r10, r7)
            r17 = r17 | r0
        L_0x003a:
            r0 = 57344(0xe000, float:8.0356E-41)
            r0 = r23 & r0
            r4 = r22
            if (r0 != 0) goto L_0x0049
            int r0 = X.C147188nY.A0D(r10, r4)
            r17 = r17 | r0
        L_0x0049:
            r1 = 46811(0xb6db, float:6.5596E-41)
            r1 = r1 & r17
            r0 = 9362(0x2492, float:1.3119E-41)
            if (r1 != r0) goto L_0x0070
            boolean r0 = r10.BCM()
            if (r0 == 0) goto L_0x0070
            r10.CuJ()
        L_0x005b:
            X.8nW r1 = r10.AKE()
            if (r1 == 0) goto L_0x006f
            r11 = 1
            kotlin.jvm.internal.KtLambdaShape1S1311000_I2 r0 = new kotlin.jvm.internal.KtLambdaShape1S1311000_I2
            r12 = r2
            r9 = r5
            r10 = r3
            r8 = r4
            r5 = r0
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            r1.D9d(r0)
        L_0x006f:
            return
        L_0x0070:
            X.4oM r0 = X.C97856Df.A00(r7, r10)
            boolean r0 = X.C86104wH.A1X(r0)
            r9 = 0
            if (r0 != 0) goto L_0x0083
            if (r24 != 0) goto L_0x0083
            boolean r0 = r6 instanceof X.C132787uV
            r23 = 0
            if (r0 != 0) goto L_0x0085
        L_0x0083:
            r23 = 1
        L_0x0085:
            X.7Wm r11 = androidx.compose.ui.Modifier.A00
            r0 = 2131165209(0x7f070019, float:1.7944629E38)
            float r0 = X.AnonymousClass6FH.A00(r10, r0)
            androidx.compose.ui.Modifier r12 = X.AnonymousClass7K4.A06(r11, r0, r9)
            int r16 = r17 >> 6
            r8 = r16 & 112(0x70, float:1.57E-43)
            r0 = 1016704421(0x3c99ada5, float:0.018759558)
            r10.Cvb(r0)
            r0 = 10
            kotlin.jvm.internal.KtLambdaShape25S0101000_I2 r1 = new kotlin.jvm.internal.KtLambdaShape25S0101000_I2
            r1.<init>(r7, r8, r0)
            X.0YY r0 = androidx.compose.ui.platform.InspectableValueKt.A00
            androidx.compose.ui.Modifier r15 = X.C120417Am.A02(r12, r0, r1)
            X.7W3 r9 = X.AnonymousClass7W3.A04(r10, r9)
            r0 = 12
            float r0 = (float) r0
            X.8p4 r1 = X.AnonymousClass7J3.A01(r0)
            X.8cu r0 = X.AnonymousClass7KV.A04
            X.8ly r14 = X.C147188nY.A0e(r1, r10, r0)
            java.lang.Object r13 = X.C147188nY.A0p(r10)
            java.lang.Object r12 = X.C147188nY.A0n(r10)
            java.lang.Object r8 = X.C147188nY.A0m(r10)
            X.0ZU r1 = X.AnonymousClass74X.A00
            X.0YM r0 = X.C98236Es.A00(r15)
            X.C147188nY.A0w(r10, r9, r1)
            X.AnonymousClass7W3.A0a(r10, r9, r14, r13)
            X.AnonymousClass7KP.A07(r10, r12, r8, r0)
            X.7VA r1 = X.AnonymousClass7VA.A00
            r0 = 2041346619(0x79ac7a3b, float:1.1194427E35)
            r10.Cvb(r0)
            r0 = 1065353216(0x3f800000, float:1.0)
            r8 = 1
            androidx.compose.ui.Modifier r18 = r1.DB5(r11, r0, r8)
            int r1 = r17 >> 3
            r0 = r1 & 14
            r22 = r1 & 112(0x70, float:1.57E-43)
            r22 = r22 | r0
            r0 = 57344(0xe000, float:8.0356E-41)
            r17 = r17 & r0
            r22 = r22 | r17
            r17 = r10
            r19 = r6
            r20 = r5
            r21 = r4
            A03(r17, r18, r19, r20, r21, r22, r23)
            r0 = r16 & 14
            A04(r10, r6, r0)
            X.AnonymousClass7W3.A0v(r9, r8)
            goto L_0x005b
        L_0x0108:
            r17 = r3
            goto L_0x0016
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C121737Hu.A01(X.8p3, X.8nY, X.8ew, java.lang.String, X.0YP, int, boolean):void");
    }

    public static final void A02(C147188nY r19, Modifier modifier, C142488ew r21, String str, int i) {
        int i2;
        boolean z;
        C147188nY r6 = r19;
        r6.Cvd(499268713);
        int i3 = i;
        String str2 = str;
        if ((i & 14) == 0) {
            i2 = C147188nY.A0F(r6, str2) | i;
        } else {
            i2 = i3;
        }
        C142488ew r2 = r21;
        if ((i & 112) == 0) {
            i2 |= C147188nY.A0G(r6, r2);
        }
        Modifier modifier2 = modifier;
        if ((i3 & 896) == 0) {
            i2 |= C147188nY.A0H(r6, modifier2);
        }
        if ((i2 & 731) != 146 || !r6.BCM()) {
            if (r2 instanceof C132757uS) {
                r6.Cvb(-1600215692);
                z = false;
                AnonymousClass7I9.A02(r6, modifier2, AnonymousClass7J9.A03(r6), (C114236su) null, (C134817yQ) null, (C121117Ee) null, ((C132757uS) r2).A00, 0, 0, 0, (i2 >> 3) & 112, 0, 2040, C120537Bh.A00(r6).A0A, 0, false);
            } else {
                r6.Cvb(-1600215511);
                z = false;
                String str3 = str2;
                AnonymousClass7I9.A02(r6, modifier2, AnonymousClass7J9.A03(r6), (C114236su) null, (C134817yQ) null, (C121117Ee) null, str3, 0, 1, 2, (i2 & 14) | 805306368 | ((i2 >> 3) & 112), 6, HttpStatus.SC_GATEWAY_TIMEOUT, AnonymousClass7KB.A03(r6), 0, false);
            }
            AnonymousClass7W3.A0z(r6, z);
        } else {
            r6.CuJ();
        }
        C147178nW AKE = r6.AKE();
        if (AKE != null) {
            AKE.D9d(new KtLambdaShape3S1201000_I2((Object) modifier2, (Object) r2, str2, i3, 10));
        }
    }

    public static final void A03(C147188nY r26, Modifier modifier, C142488ew r28, String str, AnonymousClass0YP r30, int i, boolean z) {
        int i2;
        C147188nY r8 = r26;
        r8.Cvd(1495579998);
        int i3 = i;
        String str2 = str;
        if ((i & 14) == 0) {
            i2 = C147188nY.A0F(r8, str2) | i;
        } else {
            i2 = i3;
        }
        C142488ew r262 = r28;
        if ((i & 112) == 0) {
            i2 |= C147188nY.A0G(r8, r262);
        }
        boolean z2 = z;
        if ((i3 & 896) == 0) {
            i2 |= C147188nY.A0N(r8, z2);
        }
        if ((i3 & 7168) == 0) {
            i2 |= C147188nY.A0I(r8, modifier);
        }
        AnonymousClass0YP r24 = r30;
        if ((57344 & i) == 0) {
            i2 |= C147188nY.A0D(r8, r24);
        }
        if ((46811 & i2) != 9362 || !r8.BCM()) {
            IDxMPolicyShape843S0100000_2_I2 iDxMPolicyShape843S0100000_2_I2 = new IDxMPolicyShape843S0100000_2_I2(AnonymousClass7DC.A01((C142638fL) null, r8, "LabelTopAnimation", C86164wN.A01(z2 ? 1 : 0), 22), 1);
            AnonymousClass534 A0b = C147188nY.A0b(r8, -1323940314);
            Object AEA = r8.AEA(A0b);
            AnonymousClass534 r18 = AnonymousClass7DE.A07;
            Object AEA2 = r8.AEA(r18);
            AnonymousClass534 r12 = AnonymousClass7DE.A0B;
            Object AEA3 = r8.AEA(r12);
            AnonymousClass0ZU r11 = AnonymousClass74X.A00;
            AnonymousClass0YM A00 = C98236Es.A00(modifier);
            int A01 = C86114wI.A01((i2 >> 6) & 112);
            AnonymousClass7W3 r10 = (AnonymousClass7W3) r8;
            C147188nY.A0w(r8, r10, r11);
            AnonymousClass0YP r9 = AnonymousClass74X.A03;
            AnonymousClass0YP A002 = AnonymousClass7Ak.A00(r8, iDxMPolicyShape843S0100000_2_I2, AEA, r9);
            AnonymousClass0YP r5 = AnonymousClass74X.A02;
            AnonymousClass0YP A012 = AnonymousClass7Ak.A01(r8, AEA2, r5);
            AnonymousClass7Ak.A02(r8, AEA3, A012);
            C86104wH.A1R(new AnonymousClass7KP(r8), r8, A00, (A01 >> 3) & 112);
            r8.Cvb(2058660585);
            r8.Cvb(-451145785);
            if (((A01 >> 9) & 14 & 11) != 2 || !r8.BCM()) {
                C123327Wm r14 = Modifier.A00;
                A02(r8, r14.Cx6(new LayoutIdModifierElement("Label")), r262, str2, (i2 & 14) | 384 | (i2 & 112));
                Modifier Cx6 = r14.Cx6(new LayoutIdModifierElement("TextField"));
                C146288ly A07 = AnonymousClass7KV.A07(r8, false);
                Object A0t = C147188nY.A0t(r8, A0b, -1323940314);
                Object AEA4 = r8.AEA(r18);
                Object AEA5 = r8.AEA(r12);
                AnonymousClass0YM A003 = C98236Es.A00(Cx6);
                C147188nY.A0w(r8, r10, r11);
                r10.A0T = false;
                AnonymousClass7Ak.A02(r8, A07, r9);
                AnonymousClass7Ak.A02(r8, A0t, A002);
                C86104wH.A1R(AnonymousClass7KP.A03(r8, AEA4, AEA5, r5, A012), r8, A003, 0);
                r8.Cvb(2058660585);
                r8.Cvb(-1237067135);
                C86104wH.A1S(r8, r24, i2 >> 12);
                AnonymousClass7W3.A0v(r10, true);
            } else {
                r8.CuJ();
            }
            AnonymousClass7W3.A0w(r10, false);
            AnonymousClass7W3.A0u(r10, true);
        } else {
            r8.CuJ();
        }
        C147178nW AKE = r8.AKE();
        if (AKE != null) {
            AKE.D9d(new KtLambdaShape1S1311000_I2(r262, modifier, r24, str2, i3, 2, z2));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: androidx.compose.ui.Alignment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: androidx.compose.ui.Alignment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: androidx.compose.ui.Alignment} */
    /* JADX WARNING: type inference failed for: r8v0, types: [X.8n1] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A04(X.C147188nY r12, X.C142488ew r13, int r14) {
        /*
            r0 = 685784107(0x28e03c2b, float:2.489509E-14)
            r3 = r12
            r12.Cvd(r0)
            r0 = r14 & 14
            r1 = 2
            if (r0 != 0) goto L_0x00b9
            int r0 = X.C147188nY.A0F(r12, r13)
            r0 = r0 | r14
        L_0x0011:
            r0 = r0 & 11
            if (r0 != r1) goto L_0x002a
            boolean r0 = r12.BCM()
            if (r0 == 0) goto L_0x002a
            r12.CuJ()
        L_0x001e:
            X.8nW r1 = r3.AKE()
            if (r1 == 0) goto L_0x0029
            r0 = 47
            X.C147178nW.A02(r1, r13, r14, r0)
        L_0x0029:
            return
        L_0x002a:
            X.7Wm r1 = androidx.compose.ui.Modifier.A00
            r0 = 16
            androidx.compose.ui.Modifier r5 = X.AnonymousClass7Kq.A0F(r1, r0)
            X.7uV r0 = X.C132787uV.A00
            boolean r0 = X.C04220Ms.A0I(r13, r0)
            if (r0 == 0) goto L_0x0044
            r1 = -1318185688(0xffffffffb16e1528, float:-3.4645584E-9)
        L_0x003d:
            r12.Cvb(r1)
        L_0x0040:
            X.AnonymousClass7W3.A0y(r3)
            goto L_0x001e
        L_0x0044:
            X.7uU r0 = X.C132777uU.A00
            boolean r0 = X.C04220Ms.A0I(r13, r0)
            if (r0 == 0) goto L_0x0061
            r0 = -1318185641(0xffffffffb16e1557, float:-3.4645689E-9)
            r12.Cvb(r0)
            X.5HL r6 = X.C101296Qq.A00(r12)
            long r9 = X.AnonymousClass7KB.A03(r12)
            r7 = 6
            r8 = 0
            r4 = r12
            X.C101286Qp.A00(r4, r5, r6, r7, r8, r9)
            goto L_0x0040
        L_0x0061:
            X.7uT r0 = X.C132767uT.A00
            boolean r0 = X.C04220Ms.A0I(r13, r0)
            if (r0 == 0) goto L_0x0094
            r0 = -1318185438(0xffffffffb16e1622, float:-3.464614E-9)
            r12.Cvb(r0)
            android.content.Context r1 = X.C147188nY.A0T(r12)
            r0 = 2131232443(0x7f0806bb, float:1.8080995E38)
            android.graphics.drawable.Drawable r0 = X.C40348Lds.A00(r1, r0)
            X.6uo r7 = X.AnonymousClass73J.A00(r0, r12)
            r4 = 0
            r10 = 0
            X.7KB r0 = X.C120537Bh.A00(r12)
            long r0 = r0.A0t
        L_0x0086:
            X.6bI r6 = X.C115866w2.A01(r0)
            r11 = 440(0x1b8, float:6.17E-43)
            r12 = 56
            r8 = r4
            r9 = r4
            X.C97846Dc.A00(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            goto L_0x0040
        L_0x0094:
            boolean r0 = r13 instanceof X.C132757uS
            r1 = -1318184637(0xffffffffb16e1943, float:-3.4647918E-9)
            if (r0 == 0) goto L_0x003d
            r0 = -1318185017(0xffffffffb16e17c7, float:-3.4647074E-9)
            r12.Cvb(r0)
            android.content.Context r1 = X.C147188nY.A0T(r12)
            r0 = 2131232570(0x7f08073a, float:1.8081253E38)
            android.graphics.drawable.Drawable r0 = X.C40348Lds.A00(r1, r0)
            X.6uo r7 = X.AnonymousClass73J.A00(r0, r12)
            r4 = 0
            r10 = 0
            X.7KB r0 = X.C120537Bh.A00(r12)
            long r0 = r0.A0A
            goto L_0x0086
        L_0x00b9:
            r0 = r14
            goto L_0x0011
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C121737Hu.A04(X.8nY, X.8ew, int):void");
    }
}
