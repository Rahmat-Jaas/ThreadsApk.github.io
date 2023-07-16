package X;

import androidx.compose.animation.core.MutableTransitionState;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutIdModifierElement;
import com.facebook.redex.IDxMPolicyShape265S0200000_2_I2;

/* renamed from: X.7IG  reason: invalid class name */
public final class AnonymousClass7IG {
    public static final float A00 = ((float) 6);
    public static final float A01 = ((float) 72);
    public static final float A02 = ((float) 14);
    public static final float A03 = ((float) 48);
    public static final long A04 = AnonymousClass7Hi.A03(20);
    public static final float A05 = ((float) 16);

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0067, code lost:
        if (r12 == false) goto L_0x0069;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x007c, code lost:
        if (r10.ACX(r1) == false) goto L_0x007e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0169  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C147258p3 r24, X.C147188nY r25, androidx.compose.ui.Modifier r26, X.AnonymousClass0ZU r27, X.AnonymousClass0YP r28, X.AnonymousClass0YP r29, int r30, int r31, long r32, long r34, boolean r36, boolean r37) {
        /*
            r1 = r34
            r3 = r32
            r34 = r29
            r9 = r28
            r5 = r24
            r20 = r37
            r6 = r26
            r7 = 1
            r35 = r27
            r0 = r35
            X.C04220Ms.A0B(r0, r7)
            r0 = -1486097588(0xffffffffa76bf34c, float:-3.2744693E-15)
            r10 = r25
            r10.Cvd(r0)
            r7 = r31
            r0 = r31 & 1
            r8 = r30
            r32 = r36
            if (r0 == 0) goto L_0x01b3
            r11 = r30 | 6
        L_0x002a:
            r0 = r31 & 2
            if (r0 == 0) goto L_0x01a6
            r11 = r11 | 48
        L_0x0030:
            r19 = r31 & 4
            if (r19 == 0) goto L_0x019b
            r11 = r11 | 384(0x180, float:5.38E-43)
        L_0x0036:
            r18 = r31 & 8
            if (r18 == 0) goto L_0x018e
            r11 = r11 | 3072(0xc00, float:4.305E-42)
        L_0x003c:
            r17 = r31 & 16
            r0 = 57344(0xe000, float:8.0356E-41)
            if (r17 == 0) goto L_0x0183
            r11 = r11 | 24576(0x6000, float:3.4438E-41)
        L_0x0045:
            r15 = r31 & 32
            r0 = 458752(0x70000, float:6.42848E-40)
            if (r15 == 0) goto L_0x0177
            r0 = 196608(0x30000, float:2.75506E-40)
        L_0x004d:
            r11 = r11 | r0
        L_0x004e:
            r13 = r31 & 64
            r16 = 3670016(0x380000, float:5.142788E-39)
            if (r13 == 0) goto L_0x0169
            r0 = 1572864(0x180000, float:2.204052E-39)
        L_0x0056:
            r11 = r11 | r0
        L_0x0057:
            r0 = 29360128(0x1c00000, float:7.052966E-38)
            r0 = r30 & r0
            if (r0 != 0) goto L_0x006c
            r0 = r7 & 128(0x80, float:1.794E-43)
            if (r0 != 0) goto L_0x0069
            boolean r12 = r10.ACX(r3)
            r0 = 8388608(0x800000, float:1.17549435E-38)
            if (r12 != 0) goto L_0x006b
        L_0x0069:
            r0 = 4194304(0x400000, float:5.877472E-39)
        L_0x006b:
            r11 = r11 | r0
        L_0x006c:
            r0 = 234881024(0xe000000, float:1.5777218E-30)
            r0 = r0 & r30
            if (r0 != 0) goto L_0x0081
            r0 = r7 & 256(0x100, float:3.59E-43)
            if (r0 != 0) goto L_0x007e
            boolean r12 = r10.ACX(r1)
            r0 = 67108864(0x4000000, float:1.5046328E-36)
            if (r12 != 0) goto L_0x0080
        L_0x007e:
            r0 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0080:
            r11 = r11 | r0
        L_0x0081:
            r12 = 191739611(0xb6db6db, float:4.5782105E-32)
            r12 = r12 & r11
            r0 = 38347922(0x2492492, float:1.4777643E-37)
            if (r12 != r0) goto L_0x00b8
            boolean r0 = r10.BCM()
            if (r0 == 0) goto L_0x00b8
            r10.CuJ()
        L_0x0093:
            X.8nW r10 = r10.AKE()
            if (r10 == 0) goto L_0x00b7
            X.8TL r0 = new X.8TL
            r21 = r7
            r22 = r3
            r24 = r1
            r26 = r32
            r27 = r20
            r14 = r0
            r15 = r5
            r16 = r6
            r17 = r35
            r18 = r9
            r19 = r34
            r20 = r8
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r24, r26, r27)
            X.AnonymousClass7WO.A00(r10, r0)
        L_0x00b7:
            return
        L_0x00b8:
            r10.CvD()
            r0 = r30 & 1
            r14 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r12 = 0
            if (r0 == 0) goto L_0x011e
            boolean r0 = r10.Acj()
            if (r0 != 0) goto L_0x011e
            r10.CuJ()
            r0 = r7 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x00d1
            r11 = r11 & r14
        L_0x00d1:
            r0 = r7 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x00d9
            r0 = -234881025(0xfffffffff1ffffff, float:-2.535301E30)
            r11 = r11 & r0
        L_0x00d9:
            r10.AKA()
            if (r9 == 0) goto L_0x00e7
            r12 = -1729014781(0xffffffff98f15403, float:-6.238187E-24)
            r0 = 10
            X.8sI r12 = X.AnonymousClass7JR.A02(r10, r9, r11, r0, r12)
        L_0x00e7:
            r15 = -178151495(0xfffffffff5619fb9, float:-2.860123E32)
            r13 = 0
            kotlin.jvm.internal.KtLambdaShape30S0201000_I2 r14 = new kotlin.jvm.internal.KtLambdaShape30S0201000_I2
            r0 = r34
            r14.<init>(r11, r13, r0, r12)
            X.8sI r25 = X.AnonymousClass7JR.A00(r10, r14, r15)
            r12 = 12582912(0xc00000, float:1.7632415E-38)
            r0 = r11 & 14
            r12 = r12 | r0
            int r12 = X.C86114wI.A03(r11, r12)
            r0 = 6
            int r11 = r11 >> r0
            int r26 = X.C86114wI.A04(r11, r12)
            r11 = r11 & r16
            r26 = r26 | r11
            r21 = r5
            r22 = r10
            r23 = r6
            r24 = r35
            r27 = r13
            r28 = r3
            r30 = r1
            r33 = r20
            A01(r21, r22, r23, r24, r25, r26, r27, r28, r30, r32, r33)
            goto L_0x0093
        L_0x011e:
            if (r19 == 0) goto L_0x0122
            X.7Wm r6 = androidx.compose.ui.Modifier.A00
        L_0x0122:
            if (r18 == 0) goto L_0x0126
            r20 = 1
        L_0x0126:
            if (r17 == 0) goto L_0x0129
            r9 = r12
        L_0x0129:
            if (r15 == 0) goto L_0x012d
            r34 = r12
        L_0x012d:
            if (r13 == 0) goto L_0x013d
            X.7W3 r13 = X.C147188nY.A0Y(r10)
            java.lang.Object r5 = X.AnonymousClass7GN.A00(r13)
            r0 = 0
            X.AnonymousClass7W3.A0w(r13, r0)
            X.8p3 r5 = (X.C147258p3) r5
        L_0x013d:
            r0 = r7 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0148
            X.534 r0 = X.AnonymousClass6WZ.A00
            long r3 = X.C147188nY.A0R(r10, r0)
            r11 = r11 & r14
        L_0x0148:
            r0 = r7 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x00d9
            r0 = 1999054879(0x7727281f, float:3.390341E33)
            r10.Cvb(r0)
            r1 = 1060991140(0x3f3d70a4, float:0.74)
            r0 = 1058642330(0x3f19999a, float:0.6)
            float r0 = X.AnonymousClass6EC.A00(r10, r1, r0)
            X.AnonymousClass7W3.A0y(r10)
            long r1 = X.C121657He.A04(X.C86154wM.A0G(r3), X.AnonymousClass7KE.A03(r3), X.AnonymousClass7KE.A02(r3), X.AnonymousClass7KE.A01(r3), r0)
            r0 = -234881025(0xfffffffff1ffffff, float:-2.535301E30)
            r11 = r11 & r0
            goto L_0x00d9
        L_0x0169:
            r0 = r30 & r16
            if (r0 != 0) goto L_0x0057
            boolean r0 = r10.ACY(r5)
            int r0 = X.C86104wH.A01(r0)
            goto L_0x0056
        L_0x0177:
            r0 = r30 & r0
            if (r0 != 0) goto L_0x004e
            r0 = r34
            int r0 = X.C147188nY.A0E(r10, r0)
            goto L_0x004d
        L_0x0183:
            r0 = r30 & r0
            if (r0 != 0) goto L_0x0045
            int r0 = X.C147188nY.A0D(r10, r9)
            r11 = r11 | r0
            goto L_0x0045
        L_0x018e:
            r0 = r8 & 7168(0x1c00, float:1.0045E-41)
            if (r0 != 0) goto L_0x003c
            r0 = r20
            int r0 = X.C147188nY.A0O(r10, r0)
            r11 = r11 | r0
            goto L_0x003c
        L_0x019b:
            r0 = r8 & 896(0x380, float:1.256E-42)
            if (r0 != 0) goto L_0x0036
            int r0 = X.C147188nY.A0H(r10, r6)
            r11 = r11 | r0
            goto L_0x0036
        L_0x01a6:
            r0 = r30 & 112(0x70, float:1.57E-43)
            if (r0 != 0) goto L_0x0030
            r0 = r35
            int r0 = X.C147188nY.A0A(r10, r0)
            r11 = r11 | r0
            goto L_0x0030
        L_0x01b3:
            r0 = r30 & 14
            if (r0 != 0) goto L_0x01c1
            r0 = r32
            int r11 = X.C147188nY.A0L(r10, r0)
            r11 = r11 | r30
            goto L_0x002a
        L_0x01c1:
            r11 = r8
            goto L_0x002a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7IG.A00(X.8p3, X.8nY, androidx.compose.ui.Modifier, X.0ZU, X.0YP, X.0YP, int, int, long, long, boolean, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004a, code lost:
        if (r13 == false) goto L_0x004c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x005f, code lost:
        if (r8.ACX(r2) == false) goto L_0x0061;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00ba, code lost:
        if ((r25 & 64) != 0) goto L_0x00bc;
     */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:86:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(X.C147258p3 r19, X.C147188nY r20, androidx.compose.ui.Modifier r21, X.AnonymousClass0ZU r22, X.AnonymousClass0YM r23, int r24, int r25, long r26, long r28, boolean r30, boolean r31) {
        /*
            r0 = r26
            r2 = r28
            r4 = r19
            r9 = r31
            r10 = r21
            r21 = 1
            r5 = 713679175(0x2a89e147, float:2.4492406E-13)
            r8 = r20
            r8.Cvd(r5)
            r6 = r25
            r5 = r25 & 1
            r7 = r24
            r11 = r30
            if (r5 == 0) goto L_0x0189
            r5 = r24 | 6
        L_0x0020:
            r12 = r25 & 2
            r15 = r22
            if (r12 == 0) goto L_0x017e
            r5 = r5 | 48
        L_0x0028:
            r19 = r25 & 4
            if (r19 == 0) goto L_0x0173
            r5 = r5 | 384(0x180, float:5.38E-43)
        L_0x002e:
            r18 = r25 & 8
            if (r18 == 0) goto L_0x0168
            r5 = r5 | 3072(0xc00, float:4.305E-42)
        L_0x0034:
            r17 = r25 & 16
            if (r17 == 0) goto L_0x015a
            r5 = r5 | 24576(0x6000, float:3.4438E-41)
        L_0x003a:
            r12 = 458752(0x70000, float:6.42848E-40)
            r12 = r12 & r24
            if (r12 != 0) goto L_0x004f
            r12 = r25 & 32
            if (r12 != 0) goto L_0x004c
            boolean r13 = r8.ACX(r0)
            r12 = 131072(0x20000, float:1.83671E-40)
            if (r13 != 0) goto L_0x004e
        L_0x004c:
            r12 = 65536(0x10000, float:9.18355E-41)
        L_0x004e:
            r5 = r5 | r12
        L_0x004f:
            r12 = 3670016(0x380000, float:5.142788E-39)
            r12 = r24 & r12
            if (r12 != 0) goto L_0x0064
            r12 = r25 & 64
            if (r12 != 0) goto L_0x0061
            boolean r13 = r8.ACX(r2)
            r12 = 1048576(0x100000, float:1.469368E-39)
            if (r13 != 0) goto L_0x0063
        L_0x0061:
            r12 = 524288(0x80000, float:7.34684E-40)
        L_0x0063:
            r5 = r5 | r12
        L_0x0064:
            r12 = r6 & 128(0x80, float:1.794E-43)
            r14 = r23
            if (r12 == 0) goto L_0x014a
            r12 = 12582912(0xc00000, float:1.7632415E-38)
        L_0x006c:
            r5 = r5 | r12
        L_0x006d:
            r13 = 23967451(0x16db6db, float:4.3661218E-38)
            r13 = r13 & r5
            r12 = 4793490(0x492492, float:6.71711E-39)
            if (r13 != r12) goto L_0x009f
            boolean r12 = r8.BCM()
            if (r12 == 0) goto L_0x009f
            r8.CuJ()
        L_0x007f:
            X.8nW r8 = r8.AKE()
            if (r8 == 0) goto L_0x009e
            X.8Sw r5 = new X.8Sw
            r23 = r11
            r24 = r9
            r19 = r0
            r21 = r2
            r16 = r14
            r17 = r7
            r18 = r6
            r12 = r5
            r13 = r4
            r14 = r10
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r21, r23, r24)
            X.AnonymousClass7WO.A00(r8, r5)
        L_0x009e:
            return
        L_0x009f:
            r8.CvD()
            r12 = r24 & 1
            r16 = -458753(0xfffffffffff8ffff, float:NaN)
            if (r12 == 0) goto L_0x010a
            boolean r12 = r8.Acj()
            if (r12 != 0) goto L_0x010a
            r8.CuJ()
            r12 = r25 & 32
            if (r12 == 0) goto L_0x00b8
            r5 = r5 & r16
        L_0x00b8:
            r12 = r25 & 64
            if (r12 == 0) goto L_0x00c0
        L_0x00bc:
            r12 = -3670017(0xffffffffffc7ffff, float:NaN)
            r5 = r5 & r12
        L_0x00c0:
            r8.AKA()
            r17 = 0
            r18 = 2
            r16 = r8
            r19 = r0
            X.8fO r17 = X.AnonymousClass72Y.A00(r16, r17, r18, r19, r21)
            r13 = -1237246709(0xffffffffb6411d0b, float:-2.8776146E-6)
            r23 = 0
            kotlin.jvm.internal.KtLambdaShape0S0521000_I2 r12 = new kotlin.jvm.internal.KtLambdaShape0S0521000_I2
            r16 = r12
            r18 = r10
            r19 = r15
            r20 = r14
            r21 = r4
            r22 = r5
            r24 = r9
            r25 = r11
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25)
            X.8sI r17 = X.AnonymousClass7JR.A00(r8, r12, r13)
            int r13 = r5 >> 15
            r12 = r13 & 14
            r12 = r12 | 3072(0xc00, float:4.305E-42)
            r18 = r13 & 112(0x70, float:1.57E-43)
            r18 = r18 | r12
            int r5 = r5 << 6
            r5 = r5 & 896(0x380, float:1.256E-42)
            r18 = r18 | r5
            r16 = r8
            r19 = r0
            r21 = r2
            r23 = r11
            A02(r16, r17, r18, r19, r21, r23)
            goto L_0x007f
        L_0x010a:
            if (r19 == 0) goto L_0x010e
            X.7Wm r10 = androidx.compose.ui.Modifier.A00
        L_0x010e:
            if (r18 == 0) goto L_0x0111
            r9 = 1
        L_0x0111:
            if (r17 == 0) goto L_0x0121
            X.7W3 r13 = X.C147188nY.A0Y(r8)
            java.lang.Object r4 = X.AnonymousClass7GN.A00(r13)
            r12 = 0
            X.AnonymousClass7W3.A0w(r13, r12)
            X.8p3 r4 = (X.C147258p3) r4
        L_0x0121:
            r12 = r25 & 32
            if (r12 == 0) goto L_0x012d
            X.534 r0 = X.AnonymousClass6WZ.A00
            long r0 = X.C147188nY.A0R(r8, r0)
            r5 = r5 & r16
        L_0x012d:
            r12 = r25 & 64
            if (r12 == 0) goto L_0x00c0
            r2 = 1999054879(0x7727281f, float:3.390341E33)
            r8.Cvb(r2)
            r3 = 1060991140(0x3f3d70a4, float:0.74)
            r2 = 1058642330(0x3f19999a, float:0.6)
            float r2 = X.AnonymousClass6EC.A00(r8, r3, r2)
            X.AnonymousClass7W3.A0y(r8)
            long r2 = X.C121657He.A04(X.C86154wM.A0G(r0), X.AnonymousClass7KE.A03(r0), X.AnonymousClass7KE.A02(r0), X.AnonymousClass7KE.A01(r0), r2)
            goto L_0x00bc
        L_0x014a:
            r12 = 29360128(0x1c00000, float:7.052966E-38)
            r12 = r12 & r24
            if (r12 != 0) goto L_0x006d
            boolean r12 = r8.ACa(r14)
            int r12 = X.C86104wH.A04(r12)
            goto L_0x006c
        L_0x015a:
            r12 = 57344(0xe000, float:8.0356E-41)
            r12 = r12 & r24
            if (r12 != 0) goto L_0x003a
            int r12 = X.C147188nY.A0J(r8, r4)
            r5 = r5 | r12
            goto L_0x003a
        L_0x0168:
            r12 = r7 & 7168(0x1c00, float:1.0045E-41)
            if (r12 != 0) goto L_0x0034
            int r12 = X.C147188nY.A0O(r8, r9)
            r5 = r5 | r12
            goto L_0x0034
        L_0x0173:
            r12 = r7 & 896(0x380, float:1.256E-42)
            if (r12 != 0) goto L_0x002e
            int r12 = X.C147188nY.A0H(r8, r10)
            r5 = r5 | r12
            goto L_0x002e
        L_0x017e:
            r12 = r24 & 112(0x70, float:1.57E-43)
            if (r12 != 0) goto L_0x0028
            int r12 = X.C147188nY.A0A(r8, r15)
            r5 = r5 | r12
            goto L_0x0028
        L_0x0189:
            r5 = r24 & 14
            if (r5 != 0) goto L_0x0195
            int r5 = X.C147188nY.A0L(r8, r11)
            r5 = r5 | r24
            goto L_0x0020
        L_0x0195:
            r5 = r7
            goto L_0x0020
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7IG.A01(X.8p3, X.8nY, androidx.compose.ui.Modifier, X.0ZU, X.0YM, int, int, long, long, boolean, boolean):void");
    }

    public static final void A02(C147188nY r20, AnonymousClass0YP r21, int i, long j, long j2, boolean z) {
        int i2;
        long j3;
        long j4;
        long j5;
        C147188nY r8 = r20;
        r8.Cvd(-405571117);
        int i3 = i;
        long j6 = j;
        if ((i & 14) == 0) {
            i2 = C147188nY.A05(r8, j6) | i;
        } else {
            i2 = i3;
        }
        long j7 = j2;
        if ((i & 112) == 0) {
            int i4 = 16;
            if (r8.ACX(j7)) {
                i4 = 32;
            }
            i2 |= i4;
        }
        boolean z2 = z;
        if ((i3 & 896) == 0) {
            i2 |= C147188nY.A0N(r8, z2);
        }
        AnonymousClass0YP r7 = r21;
        if ((i3 & 7168) == 0) {
            i2 |= C147188nY.A0C(r8, r7);
        }
        if ((i2 & 5851) != 1170 || !r8.BCM()) {
            int i5 = i2 >> 6;
            C115556vT A022 = AnonymousClass7FH.A02(r8, Boolean.valueOf(z2), (String) null, i5 & 14, 2);
            AnonymousClass8Zi r13 = AnonymousClass8Zi.A00;
            r8.Cvb(-1939694975);
            C147368pE r14 = A022.A06;
            boolean A1X = AnonymousClass0wJ.A1X(r14.getValue());
            r8.Cvb(1445938070);
            if (A1X) {
                j3 = j6;
            } else {
                j3 = j7;
            }
            AnonymousClass7W3 A042 = AnonymousClass7W3.A04(r8, false);
            C115606vY A0G = C86154wM.A0G(j3);
            boolean A0y = C147188nY.A0y(r8, A0G);
            Object A13 = A042.A13();
            if (A0y || A13 == AnonymousClass7GN.A00) {
                A13 = (AnonymousClass8cW) ((AnonymousClass8Kd) AnonymousClass6a4.A00).invoke(A0G);
                A042.A14(A13);
            }
            AnonymousClass7W3.A0w(A042, false);
            AnonymousClass8cW r3 = (AnonymousClass8cW) A13;
            r8.Cvb(-142660079);
            boolean A1X2 = AnonymousClass0wJ.A1X(MutableTransitionState.A00(A022));
            r8.Cvb(1445938070);
            if (A1X2) {
                j4 = j6;
            } else {
                j4 = j7;
            }
            AnonymousClass7W3.A0w(A042, false);
            AnonymousClass7KE A0I = C86134wK.A0I(j4);
            boolean A1X3 = AnonymousClass0wJ.A1X(r14.getValue());
            r8.Cvb(1445938070);
            if (A1X3) {
                j5 = j6;
            } else {
                j5 = j7;
            }
            AnonymousClass7W3.A0w(A042, false);
            AnonymousClass7KE A0I2 = C86134wK.A0I(j5);
            C81784oM A032 = AnonymousClass7FH.A03((C147218oz) r13.invoke(A022.A04.getValue(), r8, 0), A022, r3, r8, A0I, A0I2, "ColorAnimation");
            AnonymousClass7W3.A0w(A042, false);
            AnonymousClass7W3.A0w(A042, false);
            AnonymousClass7Ai.A01(r8, r7, new AnonymousClass7DS[]{AnonymousClass7DS.A00(AnonymousClass6WZ.A00, C86134wK.A0I(C121657He.A04(C86154wM.A0G(C86114wI.A0A(A032)), AnonymousClass7KE.A03(C86114wI.A0A(A032)), AnonymousClass7KE.A02(C86114wI.A0A(A032)), AnonymousClass7KE.A01(C86114wI.A0A(A032)), 1.0f)), true), AnonymousClass7DS.A00(AnonymousClass6WY.A00, Float.valueOf(AnonymousClass7KE.A00(C86114wI.A0A(A032))), true)}, i5);
        } else {
            r8.CuJ();
        }
        C147178nW AKE = r8.AKE();
        if (AKE != null) {
            AnonymousClass7WO.A00(AKE, new AnonymousClass8RH(r7, i3, j6, j7, z2));
        }
    }

    public static final void A03(C147188nY r20, AnonymousClass0YP r21, AnonymousClass0YP r22, int i) {
        int i2;
        C147188nY r14 = r20;
        r14.Cvd(1249848471);
        AnonymousClass0YP r13 = r21;
        if ((i & 14) == 0) {
            i2 = C147188nY.A09(r14, r13) | i;
        } else {
            i2 = i;
        }
        AnonymousClass0YP r12 = r22;
        if ((i & 112) == 0) {
            i2 |= C147188nY.A0A(r14, r12);
        }
        if ((i2 & 91) != 18 || !r14.BCM()) {
            IDxMPolicyShape265S0200000_2_I2 iDxMPolicyShape265S0200000_2_I2 = new IDxMPolicyShape265S0200000_2_I2(0, r12, r13);
            C123327Wm A022 = Modifier.A02(r14, -1323940314);
            AnonymousClass534 r9 = AnonymousClass7DE.A02;
            Object AEA = r14.AEA(r9);
            AnonymousClass534 r8 = AnonymousClass7DE.A07;
            Object AEA2 = r14.AEA(r8);
            AnonymousClass534 r7 = AnonymousClass7DE.A0B;
            Object AEA3 = r14.AEA(r7);
            AnonymousClass0ZU r6 = AnonymousClass74X.A00;
            AnonymousClass0YM A002 = C98236Es.A00(A022);
            AnonymousClass7W3 r5 = (AnonymousClass7W3) r14;
            C147188nY.A0w(r14, r5, r6);
            AnonymousClass0YP r4 = AnonymousClass74X.A03;
            AnonymousClass0YP A003 = AnonymousClass7Ak.A00(r14, iDxMPolicyShape265S0200000_2_I2, AEA, r4);
            AnonymousClass0YP r3 = AnonymousClass74X.A02;
            AnonymousClass0YP A012 = AnonymousClass7Ak.A01(r14, AEA2, r3);
            AnonymousClass7Ak.A02(r14, AEA3, A012);
            A002.invoke(new AnonymousClass7KP(r14), r14, 0);
            r14.Cvb(2058660585);
            r14.Cvb(-2141028452);
            if (r13 != null) {
                Modifier A06 = AnonymousClass7K4.A06(A022.Cx6(new LayoutIdModifierElement("text")), A05, 0);
                r14.Cvb(733328855);
                C146288ly A004 = C120767Cj.A00(r14, AnonymousClass7KV.A0E, false);
                Object A0s = C147188nY.A0s(r14, r9);
                Object AEA4 = r14.AEA(r8);
                Object AEA5 = r14.AEA(r7);
                AnonymousClass0YM A005 = C98236Es.A00(A06);
                C147188nY.A0w(r14, r5, r6);
                r5.A0T = false;
                AnonymousClass7Ak.A02(r14, A004, r4);
                AnonymousClass7Ak.A02(r14, A0s, A003);
                AnonymousClass7Ak.A02(r14, AEA4, r3);
                AnonymousClass7KP.A06(r14, AEA5, 0, A012, A005);
                C86104wH.A1S(r14, r13, i2);
                AnonymousClass7W3.A0d(r5);
                AnonymousClass7W3.A0w(r5, false);
            }
            AnonymousClass7W3.A0w(r5, false);
            r14.Cvb(448373045);
            if (r12 != null) {
                Modifier Cx6 = A022.Cx6(new LayoutIdModifierElement("icon"));
                r14.Cvb(733328855);
                C146288ly A006 = C120767Cj.A00(r14, AnonymousClass7KV.A0E, false);
                Object A0s2 = C147188nY.A0s(r14, r9);
                Object AEA6 = r14.AEA(r8);
                Object AEA7 = r14.AEA(r7);
                AnonymousClass0YM A007 = C98236Es.A00(Cx6);
                C147188nY.A0w(r14, r5, r6);
                r5.A0T = false;
                AnonymousClass7Ak.A02(r14, A006, r4);
                AnonymousClass7Ak.A02(r14, A0s2, A003);
                AnonymousClass7Ak.A02(r14, AEA6, r3);
                AnonymousClass7KP.A06(r14, AEA7, 0, A012, A007);
                C86104wH.A1S(r14, r12, i2 >> 3);
                AnonymousClass7W3.A0d(r5);
                AnonymousClass7W3.A0w(r5, false);
            }
            AnonymousClass7W3.A0w(r5, false);
            AnonymousClass7W3.A0d(r5);
        } else {
            r14.CuJ();
        }
        C147178nW AKE = r14.AKE();
        if (AKE != null) {
            C147178nW.A04(AKE, r13, r12, i, 19);
        }
    }
}
