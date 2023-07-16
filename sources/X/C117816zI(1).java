package X;

import androidx.compose.ui.Modifier;
import com.facebook.common.dextricks.DalvikInternals;
import kotlin.jvm.internal.KtLambdaShape0S1222000_I2;

/* renamed from: X.6zI  reason: invalid class name and case insensitive filesystem */
public final class C117816zI {
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0099, code lost:
        if (r0 != false) goto L_0x009b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00c1, code lost:
        if (r0 != false) goto L_0x00c3;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C147258p3 r24, X.C147188nY r25, androidx.compose.ui.Modifier r26, java.lang.String r27, X.AnonymousClass0ZU r28, int r29, int r30, boolean r31, boolean r32) {
        /*
            r0 = r32
            r1 = r31
            r2 = r24
            r3 = r26
            r4 = -691848645(0xffffffffd6c33a3b, float:-1.07327433E14)
            r5 = r25
            r5.Cvd(r4)
            r6 = r30 & 1
            r4 = r29
            r13 = r28
            if (r6 == 0) goto L_0x0134
            r6 = r29 | 6
        L_0x001a:
            r7 = r30 & 2
            r14 = r27
            if (r7 == 0) goto L_0x0129
            r6 = r6 | 48
        L_0x0022:
            r12 = r30 & 4
            if (r12 == 0) goto L_0x011e
            r6 = r6 | 384(0x180, float:5.38E-43)
        L_0x0028:
            r11 = r30 & 8
            if (r11 == 0) goto L_0x0113
            r6 = r6 | 3072(0xc00, float:4.305E-42)
        L_0x002e:
            r8 = r30 & 16
            if (r8 == 0) goto L_0x0105
            r6 = r6 | 24576(0x6000, float:3.4438E-41)
        L_0x0034:
            r10 = r30 & 32
            if (r10 == 0) goto L_0x00f9
            r7 = 196608(0x30000, float:2.75506E-40)
        L_0x003a:
            r6 = r6 | r7
        L_0x003b:
            r9 = 374491(0x5b6db, float:5.24774E-40)
            r9 = r9 & r6
            r7 = 74898(0x12492, float:1.04954E-40)
            if (r9 != r7) goto L_0x006c
            boolean r7 = r5.BCM()
            if (r7 == 0) goto L_0x006c
            r5.CuJ()
        L_0x004d:
            X.8nW r6 = r5.AKE()
            if (r6 == 0) goto L_0x006b
            X.8SH r5 = new X.8SH
            r24 = r5
            r25 = r2
            r26 = r3
            r27 = r14
            r28 = r13
            r29 = r4
            r31 = r1
            r32 = r0
            r24.<init>(r25, r26, r27, r28, r29, r30, r31, r32)
            X.AnonymousClass7WO.A00(r6, r5)
        L_0x006b:
            return
        L_0x006c:
            if (r12 == 0) goto L_0x0070
            X.7Wm r3 = androidx.compose.ui.Modifier.A00
        L_0x0070:
            if (r11 == 0) goto L_0x007b
            r2 = r5
            X.7W3 r2 = (X.AnonymousClass7W3) r2
            java.lang.Object r2 = X.AnonymousClass7GN.A00(r2)
            X.8p3 r2 = (X.C147258p3) r2
        L_0x007b:
            r11 = 1
            boolean r1 = X.C86154wM.A1Z(r8, r1)
            r9 = 0
            boolean r0 = X.C18240wQ.A1R(r10, r0)
            X.7KB r7 = X.C120537Bh.A00(r5)
            long r7 = r7.A0w
            X.C04220Ms.A0B(r3, r9)
            androidx.compose.ui.Modifier r9 = androidx.compose.ui.Modifier.A04(r3)
            androidx.compose.ui.Modifier r12 = X.AnonymousClass7Kq.A05(r9)
            if (r1 != 0) goto L_0x009b
            r10 = 0
            if (r0 == 0) goto L_0x009c
        L_0x009b:
            r10 = 1
        L_0x009c:
            r9 = 1050253722(0x3e99999a, float:0.3)
            androidx.compose.ui.Modifier r10 = X.C1190273f.A00(r2, r12, r9, r10)
            X.8P1 r9 = X.AnonymousClass8P1.A00
            androidx.compose.ui.Modifier r19 = X.AnonymousClass6FI.A00(r10, r9, r11)
            r9 = 10
            float r9 = (float) r9
            X.52s r20 = X.AnonymousClass7G5.A00(r9)
            X.7KB r9 = X.C120537Bh.A00(r5)
            long r11 = r9.A04
            r9 = 1065353216(0x3f800000, float:1.0)
            long r27 = X.C121657He.A04(X.C86154wM.A0G(r7), X.AnonymousClass7KE.A03(r7), X.AnonymousClass7KE.A02(r7), X.AnonymousClass7KE.A01(r7), r9)
            r15 = 0
            if (r1 == 0) goto L_0x00c3
            r29 = 1
            if (r0 == 0) goto L_0x00c5
        L_0x00c3:
            r29 = 0
        L_0x00c5:
            r10 = -445166122(0xffffffffe5774dd6, float:-7.299127E22)
            X.8R4 r9 = new X.8R4
            r21 = r9
            r22 = r14
            r23 = r6
            r24 = r7
            r26 = r0
            r21.<init>(r22, r23, r24, r26)
            X.8sI r22 = X.AnonymousClass7JR.A00(r5, r9, r10)
            r23 = 817889280(0x30c00000, float:1.3969839E-9)
            r7 = r6 & 14
            r23 = r23 | r7
            r7 = 3670016(0x380000, float:5.142788E-39)
            int r6 = r6 << 9
            r6 = r6 & r7
            r23 = r23 | r6
            r24 = 32
            r16 = r15
            r21 = r13
            r25 = r11
            r18 = r5
            r17 = r2
            X.AnonymousClass70T.A00(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r27, r29)
            goto L_0x004d
        L_0x00f9:
            r7 = 458752(0x70000, float:6.42848E-40)
            r7 = r7 & r29
            if (r7 != 0) goto L_0x003b
            int r7 = X.C147188nY.A0Q(r5, r0)
            goto L_0x003a
        L_0x0105:
            r7 = 57344(0xe000, float:8.0356E-41)
            r7 = r7 & r29
            if (r7 != 0) goto L_0x0034
            int r7 = X.C147188nY.A0P(r5, r1)
            r6 = r6 | r7
            goto L_0x0034
        L_0x0113:
            r7 = r4 & 7168(0x1c00, float:1.0045E-41)
            if (r7 != 0) goto L_0x002e
            int r7 = X.C147188nY.A0I(r5, r2)
            r6 = r6 | r7
            goto L_0x002e
        L_0x011e:
            r7 = r4 & 896(0x380, float:1.256E-42)
            if (r7 != 0) goto L_0x0028
            int r7 = X.C147188nY.A0H(r5, r3)
            r6 = r6 | r7
            goto L_0x0028
        L_0x0129:
            r7 = r29 & 112(0x70, float:1.57E-43)
            if (r7 != 0) goto L_0x0022
            int r7 = X.C147188nY.A0G(r5, r14)
            r6 = r6 | r7
            goto L_0x0022
        L_0x0134:
            r6 = r29 & 14
            if (r6 != 0) goto L_0x0140
            int r6 = X.C147188nY.A09(r5, r13)
            r6 = r6 | r29
            goto L_0x001a
        L_0x0140:
            r6 = r4
            goto L_0x001a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C117816zI.A00(X.8p3, X.8nY, androidx.compose.ui.Modifier, java.lang.String, X.0ZU, int, int, boolean, boolean):void");
    }

    public static final void A01(C147188nY r33, Modifier modifier, String str, AnonymousClass0ZU r36, int i, int i2, boolean z, boolean z2) {
        int i3;
        boolean z3 = z2;
        boolean z4 = z;
        Modifier modifier2 = modifier;
        String str2 = str;
        AnonymousClass0ZU r1 = r36;
        boolean A1Z = AnonymousClass0wJ.A1Z(r1, str2);
        C147188nY r7 = r33;
        r7.Cvd(-716178845);
        int i4 = i2;
        int i5 = i;
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = C147188nY.A09(r7, r1) | i;
        } else {
            i3 = i5;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= C147188nY.A0G(r7, str2);
        }
        int i6 = i2 & 4;
        if (i6 != 0) {
            i3 |= 384;
        } else if ((i5 & 896) == 0) {
            i3 |= C147188nY.A0H(r7, modifier2);
        }
        int i7 = i2 & 8;
        if (i7 != 0) {
            i3 |= 3072;
        } else if ((i5 & 7168) == 0) {
            i3 |= C147188nY.A0O(r7, z4);
        }
        int i8 = i2 & 16;
        if (i8 != 0) {
            i3 |= DalvikInternals.IOPRIO_BACKGROUND;
        } else if ((i & 57344) == 0) {
            i3 |= C147188nY.A0P(r7, z3);
        }
        if ((46811 & i3) != 9362 || !r7.BCM()) {
            if (i6 != 0) {
                modifier2 = Modifier.A00;
            }
            z4 = C86154wM.A1Z(i7, z4);
            if (i8 != 0) {
                z3 = false;
            }
            Modifier modifier3 = modifier2;
            C04220Ms.A0B(modifier3, 0);
            AnonymousClass54z r11 = AnonymousClass7Kq.A02;
            Modifier A05 = AnonymousClass7Kq.A05(modifier3.Cx6(r11));
            C146288ly A07 = AnonymousClass7KV.A07(r7, false);
            AnonymousClass534 A0a = C147188nY.A0a(r7);
            Object AEA = r7.AEA(A0a);
            AnonymousClass534 r15 = AnonymousClass7DE.A07;
            Object AEA2 = r7.AEA(r15);
            AnonymousClass534 r14 = AnonymousClass7DE.A0B;
            Object AEA3 = r7.AEA(r14);
            AnonymousClass0ZU r13 = AnonymousClass74X.A00;
            AnonymousClass0YM A00 = C98236Es.A00(A05);
            AnonymousClass7W3 r4 = (AnonymousClass7W3) r7;
            C147188nY.A0w(r7, r4, r13);
            r4.A0T = false;
            AnonymousClass0YP r12 = AnonymousClass74X.A03;
            AnonymousClass0YP A002 = AnonymousClass7Ak.A00(r7, A07, AEA, r12);
            AnonymousClass0YP r10 = AnonymousClass74X.A02;
            AnonymousClass0YP A01 = AnonymousClass7Ak.A01(r7, AEA2, r10);
            Integer A052 = AnonymousClass7KP.A05(r7, AEA3, A01, A00);
            r7.Cvb(2058660585);
            AnonymousClass7V3 r16 = AnonymousClass7V3.A00;
            C123327Wm A02 = Modifier.A02(r7, 529247593);
            Modifier A003 = r16.A00(A02);
            C146288ly A053 = AnonymousClass7KV.A05(r7);
            Object A0s = C147188nY.A0s(r7, A0a);
            Object AEA4 = r7.AEA(r15);
            Object AEA5 = r7.AEA(r14);
            AnonymousClass0YM A004 = C98236Es.A00(A003);
            C147188nY.A0w(r7, r4, r13);
            r4.A0T = false;
            AnonymousClass7Ak.A02(r7, A053, r12);
            AnonymousClass7Ak.A02(r7, A0s, A002);
            A004.invoke(AnonymousClass7KP.A03(r7, AEA4, AEA5, r10, A01), r7, A052);
            r7.Cvb(2058660585);
            AnonymousClass7V5 r122 = AnonymousClass7V5.A00;
            Modifier DB5 = r122.DB5(Modifier.A03(r7, A02, r11, -948322721), 1.0f, A1Z);
            long j = C120537Bh.A00(r7).A0y;
            C142918fo r102 = C102746Wj.A00;
            C115686vk.A01(r7, C115656vh.A01(DB5, r102, j), 0);
            C115686vk.A01(r7, C115656vh.A01(r122.DB5(A02.Cx6(r11), 1.0f, A1Z), r102, AnonymousClass7KB.A01(r7)), 0);
            AnonymousClass7W3.A0v(r4, A1Z);
            int i9 = i3 << 3;
            A00((C147258p3) null, r7, AnonymousClass7K4.A07(A02, 0), str2, r36, (i3 & 14) | 384 | (i3 & 112) | (57344 & i9) | (i9 & 458752), 8, z4, z3);
            AnonymousClass7W3.A0v(r4, A1Z);
        } else {
            r7.CuJ();
        }
        C147178nW AKE = r7.AKE();
        if (AKE != null) {
            ((AnonymousClass7WO) AKE).A06 = new KtLambdaShape0S1222000_I2(r36, modifier2, str2, i5, i4, A1Z ? 1 : 0, z3, z4);
        }
    }
}
