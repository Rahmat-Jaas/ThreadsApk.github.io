package X;

import android.graphics.drawable.Drawable;
import androidx.compose.ui.Modifier;
import kotlin.jvm.internal.KtLambdaShape1S0221000_I2;
import kotlin.jvm.internal.KtLambdaShape2S0202000_I2;

/* renamed from: X.7Bj  reason: invalid class name and case insensitive filesystem */
public final class C120557Bj {
    public static final void A00(Drawable drawable, C147188nY r16, AnonymousClass68N r17, String str, String str2, String str3, AnonymousClass0ZU r21, AnonymousClass0ZU r22, AnonymousClass0YY r23, int i, int i2, boolean z, boolean z2) {
        String str4 = str;
        AnonymousClass0YY r9 = r23;
        AnonymousClass0ZU r7 = r21;
        AnonymousClass68N r3 = r17;
        AnonymousClass0ZU r8 = r22;
        String str5 = str2;
        boolean A1V = C18210wN.A1V(str4);
        C147188nY r14 = r16;
        r14.Cvd(-1359186304);
        int i3 = i2;
        String str6 = null;
        if ((i2 & 4) != 0) {
            str5 = null;
        }
        if ((i2 & 8) == 0) {
            str6 = str3;
        }
        boolean z3 = false;
        boolean A1R = C18240wQ.A1R(i2 & 16, z);
        if ((i2 & 32) == 0) {
            z3 = z2;
        }
        if ((i2 & 64) != 0) {
            r3 = AnonymousClass68N.UNKNOWN;
        }
        if ((i3 & 128) != 0) {
            r7 = C75474cI.A00;
        }
        if ((i3 & 256) != 0) {
            r9 = C79044jP.A00;
        }
        if ((i3 & 512) != 0) {
            r8 = C75484cJ.A00;
        }
        Drawable drawable2 = drawable;
        int i4 = i;
        int i5 = i >> 6;
        A01(r14, r3, str4, str5, str6, r7, r8, AnonymousClass7JR.A00(r14, new KtLambdaShape1S0221000_I2(drawable2, r9, i4, 3, A1R, z3), -1120484548), (i & 112) | 6 | (i4 & 896) | (i4 & 7168) | (57344 & i5) | (458752 & i5) | (3670016 & (i >> 9)), A1V ? 1 : 0);
        C147178nW AKE = r14.AKE();
        if (AKE != null) {
            AnonymousClass7WO.A00(AKE, new AnonymousClass8Th(drawable2, r3, str4, str5, str6, r7, r8, r9, i4, i3, A1R, z3));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(X.C147188nY r28, X.AnonymousClass68N r29, java.lang.String r30, java.lang.String r31, java.lang.String r32, X.AnonymousClass0ZU r33, X.AnonymousClass0ZU r34, X.AnonymousClass0YP r35, int r36, int r37) {
        /*
            r10 = r32
            r4 = r34
            r1 = r29
            r0 = r33
            r5 = r31
            r2 = -307226498(0xffffffffedb0187e, float:-6.8123714E27)
            r7 = r28
            r7.Cvd(r2)
            r17 = r37
            r6 = r37 & 1
            r3 = r35
            r2 = r36
            if (r6 == 0) goto L_0x0104
            r8 = r36 | 6
        L_0x001e:
            r9 = r37 & 2
            r6 = r30
            if (r9 == 0) goto L_0x00f9
            r8 = r8 | 48
        L_0x0026:
            r16 = r37 & 4
            if (r16 == 0) goto L_0x00ee
            r8 = r8 | 384(0x180, float:5.38E-43)
        L_0x002c:
            r15 = r37 & 8
            if (r15 == 0) goto L_0x00e3
            r8 = r8 | 3072(0xc00, float:4.305E-42)
        L_0x0032:
            r14 = r37 & 16
            if (r14 == 0) goto L_0x00d5
            r8 = r8 | 24576(0x6000, float:3.4438E-41)
        L_0x0038:
            r13 = r37 & 32
            if (r13 == 0) goto L_0x00c9
            r9 = 196608(0x30000, float:2.75506E-40)
        L_0x003e:
            r8 = r8 | r9
        L_0x003f:
            r12 = r37 & 64
            if (r12 == 0) goto L_0x00b9
            r9 = 1572864(0x180000, float:2.204052E-39)
        L_0x0045:
            r8 = r8 | r9
        L_0x0046:
            r9 = 2995931(0x2db6db, float:4.198194E-39)
            r11 = r8 & r9
            r9 = 599186(0x92492, float:8.39638E-40)
            if (r11 != r9) goto L_0x0073
            boolean r9 = r7.BCM()
            if (r9 == 0) goto L_0x0073
            r7.CuJ()
        L_0x0059:
            X.8nW r7 = r7.AKE()
            if (r7 == 0) goto L_0x0072
            r18 = 1
            kotlin.jvm.internal.KtLambdaShape0S3402000_I2 r8 = new kotlin.jvm.internal.KtLambdaShape0S3402000_I2
            r16 = r2
            r15 = r6
            r14 = r5
            r13 = r10
            r12 = r1
            r11 = r4
            r10 = r0
            r9 = r3
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r7.D9d(r8)
        L_0x0072:
            return
        L_0x0073:
            r21 = 0
            if (r16 == 0) goto L_0x0079
            r5 = r21
        L_0x0079:
            if (r15 != 0) goto L_0x007d
            r21 = r10
        L_0x007d:
            if (r14 == 0) goto L_0x0081
            X.68N r1 = X.AnonymousClass68N.UNKNOWN
        L_0x0081:
            if (r13 == 0) goto L_0x0085
            X.4cK r0 = X.C75494cK.A00
        L_0x0085:
            if (r12 == 0) goto L_0x0089
            X.4cL r4 = X.C75504cL.A00
        L_0x0089:
            r27 = 0
            r10 = -1887619683(0xffffffff8f7d359d, float:-1.24841886E-29)
            X.8SL r9 = new X.8SL
            r18 = r9
            r19 = r1
            r20 = r5
            r22 = r6
            r23 = r0
            r24 = r4
            r25 = r3
            r26 = r8
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26)
            X.8sI r31 = X.AnonymousClass7JR.A00(r7, r9, r10)
            r34 = 0
            r32 = 196608(0x30000, float:2.75506E-40)
            r33 = 31
            r29 = r27
            r30 = r27
            r36 = r34
            X.AnonymousClass70T.A01(r27, r28, r29, r30, r31, r32, r33, r34, r36)
            r10 = r21
            goto L_0x0059
        L_0x00b9:
            r9 = 3670016(0x380000, float:5.142788E-39)
            r9 = r9 & r36
            if (r9 != 0) goto L_0x0046
            boolean r9 = r7.ACa(r4)
            int r9 = X.C86104wH.A01(r9)
            goto L_0x0045
        L_0x00c9:
            r9 = 458752(0x70000, float:6.42848E-40)
            r9 = r9 & r36
            if (r9 != 0) goto L_0x003f
            int r9 = X.C147188nY.A0E(r7, r0)
            goto L_0x003e
        L_0x00d5:
            r9 = 57344(0xe000, float:8.0356E-41)
            r9 = r9 & r36
            if (r9 != 0) goto L_0x0038
            int r9 = X.C147188nY.A0J(r7, r1)
            r8 = r8 | r9
            goto L_0x0038
        L_0x00e3:
            r9 = r2 & 7168(0x1c00, float:1.0045E-41)
            if (r9 != 0) goto L_0x0032
            int r9 = X.C147188nY.A0I(r7, r10)
            r8 = r8 | r9
            goto L_0x0032
        L_0x00ee:
            r9 = r2 & 896(0x380, float:1.256E-42)
            if (r9 != 0) goto L_0x002c
            int r9 = X.C147188nY.A0H(r7, r5)
            r8 = r8 | r9
            goto L_0x002c
        L_0x00f9:
            r9 = r36 & 112(0x70, float:1.57E-43)
            if (r9 != 0) goto L_0x0026
            int r9 = X.C147188nY.A0G(r7, r6)
            r8 = r8 | r9
            goto L_0x0026
        L_0x0104:
            r6 = r36 & 14
            if (r6 != 0) goto L_0x0110
            int r8 = X.C147188nY.A09(r7, r3)
            r8 = r8 | r36
            goto L_0x001e
        L_0x0110:
            r8 = r2
            goto L_0x001e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C120557Bj.A01(X.8nY, X.68N, java.lang.String, java.lang.String, java.lang.String, X.0ZU, X.0ZU, X.0YP, int, int):void");
    }

    public static final void A02(C147188nY r24, AnonymousClass68N r25, AnonymousClass0ZU r26, int i, int i2) {
        int i3;
        AnonymousClass0ZU r3 = r26;
        C147188nY r6 = r24;
        r6.Cvd(1649812210);
        int i4 = i2;
        AnonymousClass68N r2 = r25;
        int i5 = i;
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = C147188nY.A0F(r6, r2) | i;
        } else {
            i3 = i5;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= C147188nY.A0A(r6, r3);
        }
        if ((i3 & 91) != 18 || !r6.BCM()) {
            if (i6 != 0) {
                r3 = C75464cH.A00;
            }
            if (r2 == AnonymousClass68N.FOLLOW || r2 == AnonymousClass68N.FOLLOWING) {
                String A01 = AnonymousClass7JS.A01(r6, 2131826228);
                AnonymousClass7I9.A02(r6, AnonymousClass7K4.A06(Modifier.A00, (float) 6, 0), AnonymousClass7J9.A04(r6), (C114236su) null, (C134817yQ) null, (C121117Ee) null, A01, 0, 1, 0, 805306416, 0, 1532, 0, 0, false);
                C101266Qn.A00(r6, (Modifier) null, r2, C303220o.LINK_BUTTON, r3, (i3 & 14) | 384 | ((i3 << 6) & 7168), 2);
            }
        } else {
            r6.CuJ();
        }
        C147178nW AKE = r6.AKE();
        if (AKE != null) {
            AKE.D9d(new KtLambdaShape2S0202000_I2(r2, i5, r3, i4, 25));
        }
    }
}
