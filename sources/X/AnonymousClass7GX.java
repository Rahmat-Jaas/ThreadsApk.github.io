package X;

import androidx.compose.ui.Modifier;
import kotlin.coroutines.jvm.internal.KtSLambdaShape15S0201000_I2_1;
import kotlin.jvm.internal.KtLambdaShape0S0111100_I2;
import kotlin.jvm.internal.KtLambdaShape3S0310000_I2;
import kotlin.jvm.internal.KtLambdaShape3S0410000_I2;
import kotlin.jvm.internal.KtLambdaShape4S0100100_I2;

/* renamed from: X.7GX  reason: invalid class name */
public final class AnonymousClass7GX {
    public static final float A00 = ((float) 640);
    public static final float A01 = ((float) 56);
    public static final float A02 = ((float) 125);

    public static final C109936kr A00(C142638fL r14, C147188nY r15, AnonymousClass67T r16, int i, boolean z) {
        C142638fL r8 = r14;
        C78364iJ r11 = null;
        C147188nY r4 = r15;
        r15.Cvb(1469749119);
        if ((i & 2) != 0) {
            r8 = C103596Zu.A01;
        }
        if ((i & 4) != 0) {
            r11 = C78364iJ.A00;
        }
        boolean A1R = C18240wQ.A1R(i & 8, z);
        Object AEA = r15.AEA(AnonymousClass7DE.A02);
        AnonymousClass67T r10 = r16;
        r15.CvO(-799036781, r10);
        Object[] objArr = {r10, r8, Boolean.valueOf(A1R), r11, AEA};
        boolean A1Z = AnonymousClass0wJ.A1Z(r8, r11);
        C04220Ms.A0B(AEA, 3);
        AnonymousClass8XW r1 = AnonymousClass8XW.A00;
        KtLambdaShape3S0310000_I2 ktLambdaShape3S0310000_I2 = new KtLambdaShape3S0310000_I2(5, AEA, r11, r8, A1R);
        AnonymousClass0wJ.A1N(r1, ktLambdaShape3S0310000_I2);
        C109936kr r12 = (C109936kr) AnonymousClass6EN.A00(r4, new AnonymousClass7Wc(ktLambdaShape3S0310000_I2, r1), new KtLambdaShape3S0410000_I2(A1Z ? 1 : 0, r8, AEA, r10, r11, A1R), objArr, 4);
        AnonymousClass7W3.A0w(AnonymousClass7W3.A04(r4, false), false);
        return r12;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0049, code lost:
        if (r13 == false) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x005e, code lost:
        if (r8.ACX(r2) == false) goto L_0x0060;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0073, code lost:
        if (r13 == false) goto L_0x0075;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00e4, code lost:
        if ((r6 & 128) != 0) goto L_0x00e6;
     */
    /* JADX WARNING: Removed duplicated region for block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00f5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(X.C147188nY r28, androidx.compose.ui.Modifier r29, X.C142918fo r30, X.C109936kr r31, X.AnonymousClass0YP r32, X.AnonymousClass0YM r33, float r34, int r35, int r36, long r37, long r39, long r41) {
        /*
            r0 = r41
            r17 = r30
            r2 = r39
            r4 = r31
            r14 = r37
            r18 = r29
            r5 = 0
            r25 = r33
            r6 = r25
            X.C04220Ms.A0B(r6, r5)
            r6 = -975760509(0xffffffffc5d71383, float:-6882.439)
            r8 = r28
            r8.Cvd(r6)
            r6 = r36
            r9 = r36 & 1
            r11 = 4
            r7 = r35
            if (r9 == 0) goto L_0x01e6
            r9 = r35 | 6
        L_0x0027:
            r21 = r36 & 2
            if (r21 == 0) goto L_0x01d9
            r9 = r9 | 48
        L_0x002d:
            r12 = r36 & 4
            if (r12 == 0) goto L_0x0033
            r9 = r9 | 128(0x80, float:1.794E-43)
        L_0x0033:
            r20 = r36 & 8
            if (r20 == 0) goto L_0x01cc
            r9 = r9 | 3072(0xc00, float:4.305E-42)
        L_0x0039:
            r10 = 458752(0x70000, float:6.42848E-40)
            r10 = r10 & r35
            if (r10 != 0) goto L_0x004e
            r10 = r36 & 32
            if (r10 != 0) goto L_0x004b
            boolean r13 = r8.ACX(r14)
            r10 = 131072(0x20000, float:1.83671E-40)
            if (r13 != 0) goto L_0x004d
        L_0x004b:
            r10 = 65536(0x10000, float:9.18355E-41)
        L_0x004d:
            r9 = r9 | r10
        L_0x004e:
            r10 = 3670016(0x380000, float:5.142788E-39)
            r10 = r10 & r35
            if (r10 != 0) goto L_0x0063
            r10 = r36 & 64
            if (r10 != 0) goto L_0x0060
            boolean r13 = r8.ACX(r2)
            r10 = 1048576(0x100000, float:1.469368E-39)
            if (r13 != 0) goto L_0x0062
        L_0x0060:
            r10 = 524288(0x80000, float:7.34684E-40)
        L_0x0062:
            r9 = r9 | r10
        L_0x0063:
            r10 = 29360128(0x1c00000, float:7.052966E-38)
            r10 = r10 & r35
            if (r10 != 0) goto L_0x0078
            r10 = r6 & 128(0x80, float:1.794E-43)
            if (r10 != 0) goto L_0x0075
            boolean r13 = r8.ACX(r0)
            r10 = 8388608(0x800000, float:1.17549435E-38)
            if (r13 != 0) goto L_0x0077
        L_0x0075:
            r10 = 4194304(0x400000, float:5.877472E-39)
        L_0x0077:
            r9 = r9 | r10
        L_0x0078:
            r10 = r6 & 256(0x100, float:3.59E-43)
            r24 = r32
            if (r10 == 0) goto L_0x01ba
            r10 = 100663296(0x6000000, float:2.4074124E-35)
        L_0x0080:
            r9 = r9 | r10
        L_0x0081:
            if (r12 != r11) goto L_0x00ba
            r11 = 191698651(0xb6d16db, float:4.5661734E-32)
            r11 = r11 & r9
            r10 = 38339730(0x2490492, float:1.4768459E-37)
            if (r11 != r10) goto L_0x00ba
            boolean r10 = r8.BCM()
            if (r10 == 0) goto L_0x00ba
            r8.CuJ()
        L_0x0095:
            X.8nW r8 = r8.AKE()
            if (r8 == 0) goto L_0x00b9
            X.8TM r5 = new X.8TM
            r30 = r17
            r31 = r4
            r32 = r24
            r33 = r25
            r35 = r7
            r36 = r6
            r37 = r14
            r39 = r2
            r41 = r0
            r28 = r5
            r29 = r18
            r28.<init>(r29, r30, r31, r32, r33, r34, r35, r36, r37, r39, r41)
            X.AnonymousClass7WO.A00(r8, r5)
        L_0x00b9:
            return
        L_0x00ba:
            r8.CvD()
            r10 = r35 & 1
            r19 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r16 = -3670017(0xffffffffffc7ffff, float:NaN)
            r13 = -458753(0xfffffffffff8ffff, float:NaN)
            if (r10 == 0) goto L_0x0173
            boolean r10 = r8.Acj()
            if (r10 != 0) goto L_0x0173
            r8.CuJ()
            if (r12 == 0) goto L_0x00d7
            r9 = r9 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x00d7:
            r10 = r36 & 32
            if (r10 == 0) goto L_0x00dc
            r9 = r9 & r13
        L_0x00dc:
            r10 = r36 & 64
            if (r10 == 0) goto L_0x00e2
            r9 = r9 & r16
        L_0x00e2:
            r10 = r6 & 128(0x80, float:1.794E-43)
            if (r10 == 0) goto L_0x00e8
        L_0x00e6:
            r9 = r9 & r19
        L_0x00e8:
            r8.AKA()
            r10 = 2076879402(0x7bcaaa2a, float:2.1045906E36)
            r8.Cvb(r10)
            X.8nV r10 = r4.A00
            if (r10 != 0) goto L_0x0105
            X.534 r10 = X.AnonymousClass7DE.A02
            java.lang.Object r12 = r8.AEA(r10)
            r11 = 37
            kotlin.jvm.internal.KtLambdaShape18S0200000_I2_2 r10 = new kotlin.jvm.internal.KtLambdaShape18S0200000_I2_2
            r10.<init>(r11, r12, r4)
            X.AnonymousClass7K5.A06(r8, r10)
        L_0x0105:
            X.7W3 r13 = X.AnonymousClass7W3.A04(r8, r5)
            r10 = 773894976(0x2e20b340, float:3.6538994E-11)
            r8.Cvb(r10)
            r10 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            java.lang.Object r11 = X.C147188nY.A0r(r8, r13, r10)
            java.lang.Object r10 = X.AnonymousClass7GN.A00
            java.lang.Object r11 = X.C86104wH.A0b(r8, r13, r11, r10, r11)
            X.4qz r12 = X.AnonymousClass7WN.A00(r13, r11)
            X.66l r20 = X.C967266l.Vertical
            r11 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            boolean r16 = X.C147188nY.A10(r8, r4, r12, r11)
            java.lang.Object r11 = r13.A13()
            if (r16 != 0) goto L_0x0131
            if (r11 != r10) goto L_0x0139
        L_0x0131:
            X.6hJ r11 = new X.6hJ
            r11.<init>(r4, r12)
            r13.A14(r11)
        L_0x0139:
            X.AnonymousClass7W3.A0w(r13, r5)
            X.6hJ r11 = (X.C107786hJ) r11
            r36 = 0
            X.8Z9 r10 = new X.8Z9
            r28 = r14
            r30 = r2
            r32 = r0
            r19 = r10
            r21 = r17
            r22 = r11
            r23 = r4
            r26 = r12
            r27 = r9
            r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27, r28, r30, r32)
            r11 = 1971587437(0x7584096d, float:3.347531E32)
            X.8sI r38 = X.AnonymousClass7JR.A00(r8, r10, r11)
            int r9 = r9 >> 3
            r9 = r9 & 14
            r9 = r9 | 3072(0xc00, float:4.305E-42)
            r40 = 6
            r35 = r8
            r37 = r18
            r39 = r9
            r41 = r5
            X.C97886Di.A00(r35, r36, r37, r38, r39, r40, r41)
            goto L_0x0095
        L_0x0173:
            if (r21 == 0) goto L_0x0177
            X.7Wm r18 = androidx.compose.ui.Modifier.A00
        L_0x0177:
            if (r12 == 0) goto L_0x0184
            X.67T r11 = X.AnonymousClass67T.Hidden
            r10 = 0
            r4 = 14
            X.6kr r4 = A00(r10, r8, r11, r4, r5)
            r9 = r9 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x0184:
            if (r20 == 0) goto L_0x0188
            X.8fo r17 = X.C103486Zj.A01
        L_0x0188:
            r10 = r36 & 16
            if (r10 == 0) goto L_0x018e
            float r34 = X.C103486Zj.A00
        L_0x018e:
            r10 = r36 & 32
            if (r10 == 0) goto L_0x0199
            X.7KB r10 = X.C120537Bh.A00(r8)
            long r14 = r10.A07
            r9 = r9 & r13
        L_0x0199:
            r10 = r36 & 64
            if (r10 == 0) goto L_0x01a3
            long r2 = X.AnonymousClass7KB.A02(r8)
            r9 = r9 & r16
        L_0x01a3:
            r10 = r6 & 128(0x80, float:1.794E-43)
            if (r10 == 0) goto L_0x00e8
            r0 = 31167449(0x1db93d9, float:8.0660046E-38)
            r8.Cvb(r0)
            long r0 = X.AnonymousClass7KE.A01
            r10 = 1056964608(0x3f000000, float:0.5)
            long r0 = X.C121657He.A04(X.C86154wM.A0G(r0), X.AnonymousClass7KE.A03(r0), X.AnonymousClass7KE.A02(r0), X.AnonymousClass7KE.A01(r0), r10)
            X.AnonymousClass7W3.A0z(r8, r5)
            goto L_0x00e6
        L_0x01ba:
            r10 = 234881024(0xe000000, float:1.5777218E-30)
            r10 = r10 & r35
            if (r10 != 0) goto L_0x0081
            r10 = r24
            boolean r10 = r8.ACa(r10)
            int r10 = X.C86104wH.A03(r10)
            goto L_0x0080
        L_0x01cc:
            r10 = r7 & 7168(0x1c00, float:1.0045E-41)
            if (r10 != 0) goto L_0x0039
            r10 = r17
            int r10 = X.C147188nY.A0I(r8, r10)
            r9 = r9 | r10
            goto L_0x0039
        L_0x01d9:
            r10 = r35 & 112(0x70, float:1.57E-43)
            if (r10 != 0) goto L_0x002d
            r10 = r18
            int r10 = X.C147188nY.A0G(r8, r10)
            r9 = r9 | r10
            goto L_0x002d
        L_0x01e6:
            r9 = r35 & 14
            if (r9 != 0) goto L_0x01f4
            r9 = r25
            int r9 = X.C147188nY.A09(r8, r9)
            r9 = r9 | r35
            goto L_0x0027
        L_0x01f4:
            r9 = r7
            goto L_0x0027
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7GX.A01(X.8nY, androidx.compose.ui.Modifier, X.8fo, X.6kr, X.0YP, X.0YM, float, int, int, long, long, long):void");
    }

    public static final void A02(C147188nY r12, AnonymousClass0ZU r13, int i, long j, boolean z) {
        int i2;
        Modifier modifier;
        Modifier modifier2;
        C147188nY r8 = r12;
        r12.Cvd(-1481140581);
        int i3 = i;
        long j2 = j;
        if ((i & 14) == 0) {
            i2 = C147188nY.A05(r12, j2) | i;
        } else {
            i2 = i;
        }
        AnonymousClass0ZU r6 = r13;
        if ((i & 112) == 0) {
            i2 |= C147188nY.A0A(r12, r13);
        }
        if ((i & 896) == 0) {
            i2 |= C147188nY.A0N(r12, z);
        }
        if ((i2 & 731) == 146 && r12.BCM()) {
            r12.CuJ();
        } else if (j2 != AnonymousClass7KE.A06) {
            C81784oM A012 = AnonymousClass7DC.A01(new C122747Tr(AnonymousClass6aT.A00, 300, 0), r12, "scrim alpha", C86164wN.A01(z ? 1 : 0), 20);
            String A013 = AnonymousClass7JS.A01(r12, 2131821883);
            r12.Cvb(597056113);
            if (z) {
                modifier2 = Modifier.A00;
                boolean A0y = C147188nY.A0y(r12, r6);
                AnonymousClass7W3 r122 = (AnonymousClass7W3) r8;
                Object A13 = r122.A13();
                if (A0y || A13 == AnonymousClass7GN.A00) {
                    A13 = new KtSLambdaShape15S0201000_I2_1((Object) r6, (C146958n9) null, 38, 42);
                    r122.A14(A13);
                }
                AnonymousClass7W3.A0w(r122, false);
                Modifier A014 = AnonymousClass7CA.A01(modifier2, r6, (AnonymousClass0YP) A13);
                boolean A10 = C147188nY.A10(r8, A013, r6, 511388516);
                Object A132 = r122.A13();
                if (A10 || A132 == AnonymousClass7GN.A00) {
                    A132 = AnonymousClass7W3.A0O(r122, r6, A013, 20);
                }
                modifier = AnonymousClass6FI.A00(A014, AnonymousClass7W3.A0B(r122, A132, false), true);
            } else {
                modifier = Modifier.A00;
                modifier2 = modifier;
            }
            AnonymousClass7W3 A04 = AnonymousClass7W3.A04(r8, false);
            Modifier Cx6 = Modifier.A05(modifier2).Cx6(modifier);
            boolean A102 = C147188nY.A10(r8, C86134wK.A0I(j2), A012, 511388516);
            Object A133 = A04.A13();
            if (A102 || A133 == AnonymousClass7GN.A00) {
                A133 = new KtLambdaShape4S0100100_I2(j2, A012, 7);
                A04.A14(A133);
            }
            AnonymousClass6DZ.A00(r8, Cx6, AnonymousClass7W3.A0B(A04, A133, false), 0);
        }
        C147178nW AKE = r8.AKE();
        if (AKE != null) {
            AKE.D9d(new KtLambdaShape0S0111100_I2(r6, i3, 0, j2, z));
        }
    }
}
