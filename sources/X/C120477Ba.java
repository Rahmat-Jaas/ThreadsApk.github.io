package X;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import com.facebook.react.uimanager.BaseViewManager;
import com.instagram.barcelona.R;
import kotlin.jvm.internal.KtLambdaShape0S1203000_I2;
import kotlin.jvm.internal.KtLambdaShape19S0200000_I2_3;
import kotlin.jvm.internal.KtLambdaShape2S0212000_I2;

/* renamed from: X.7Ba  reason: invalid class name and case insensitive filesystem */
public final class C120477Ba {
    public static final void A01(C147188nY r11, Modifier modifier, String str, AnonymousClass0ZU r14, int i, int i2, int i3) {
        int i4;
        Modifier modifier2 = modifier;
        C147188nY r10 = r11;
        r11.Cvd(381370256);
        int i5 = i3;
        AnonymousClass0ZU r5 = r14;
        int i6 = i2;
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            i4 = C147188nY.A09(r11, r14) | i2;
        } else {
            i4 = i6;
        }
        int i7 = i;
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 112) == 0) {
            i4 |= C147188nY.A04(r11, i);
        }
        String str2 = str;
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i6 & 896) == 0) {
            i4 |= C147188nY.A0H(r11, str);
        }
        int i8 = i3 & 8;
        if (i8 != 0) {
            i4 |= 3072;
        } else if ((i6 & 7168) == 0) {
            i4 |= C147188nY.A0I(r11, modifier);
        }
        if ((i4 & 5851) != 1170 || !r11.BCM()) {
            if (i8 != 0) {
                modifier2 = Modifier.A00;
            }
            C1190173e.A00(r10, AnonymousClass7Kq.A03((Alignment) null, C117646z1.A01(modifier2, AnonymousClass799.A00(0), r14), 3), AnonymousClass6QP.A00(r11, i), str, ((i4 >> 3) & 112) | 8, 8, 0);
        } else {
            r11.CuJ();
        }
        C147178nW AKE = r10.AKE();
        if (AKE != null) {
            AKE.D9d(new KtLambdaShape0S1203000_I2(modifier2, r5, str2, i7, i6, i5, 0));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00c6, code lost:
        if (r8 == X.C970267q.REPOST_PREVIEW) goto L_0x00c8;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x01ab  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x01bd  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x01cd  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01df  */
    /* JADX WARNING: Removed duplicated region for block: B:98:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C147188nY r30, androidx.compose.ui.Modifier r31, com.instagram.api.schemas.LineType r32, X.C970267q r33, X.AnonymousClass0ZU r34, X.AnonymousClass0ZU r35, X.AnonymousClass0ZU r36, X.AnonymousClass0YY r37, int r38, int r39, boolean r40, boolean r41, boolean r42) {
        /*
            r16 = r31
            r2 = 0
            r8 = r33
            r6 = r37
            boolean r10 = X.AnonymousClass0wJ.A1Z(r8, r6)
            r1 = 3
            r29 = r34
            r0 = r29
            X.C04220Ms.A0B(r0, r1)
            r9 = 4
            r28 = r35
            r27 = r36
            r1 = r28
            r0 = r27
            X.C18190wL.A1S(r1, r9, r0)
            r17 = 7
            r0 = 613681808(0x24940a90, float:6.420266E-17)
            r7 = r30
            r7.Cvd(r0)
            r4 = r39
            r0 = r39 & 1
            r5 = r38
            if (r0 == 0) goto L_0x0234
            r0 = r38 | 6
        L_0x0033:
            r1 = r39 & 2
            if (r1 == 0) goto L_0x0229
            r0 = r0 | 48
        L_0x0039:
            r1 = r39 & 4
            r26 = r40
            if (r1 == 0) goto L_0x021c
            r0 = r0 | 384(0x180, float:5.38E-43)
        L_0x0041:
            r1 = r39 & 8
            if (r1 == 0) goto L_0x020f
            r0 = r0 | 3072(0xc00, float:4.305E-42)
        L_0x0047:
            r1 = r39 & 16
            if (r1 == 0) goto L_0x01ff
            r0 = r0 | 24576(0x6000, float:3.4438E-41)
        L_0x004d:
            r1 = r39 & 32
            if (r1 == 0) goto L_0x01f1
            r1 = 196608(0x30000, float:2.75506E-40)
        L_0x0053:
            r0 = r0 | r1
        L_0x0054:
            r1 = r39 & 64
            r18 = r41
            if (r1 == 0) goto L_0x01df
            r1 = 1572864(0x180000, float:2.204052E-39)
        L_0x005c:
            r0 = r0 | r1
        L_0x005d:
            r1 = r4 & 128(0x80, float:1.794E-43)
            r30 = r32
            if (r1 == 0) goto L_0x01cd
            r1 = 12582912(0xc00000, float:1.7632415E-38)
        L_0x0065:
            r0 = r0 | r1
        L_0x0066:
            r1 = r4 & 256(0x100, float:3.59E-43)
            r3 = r42
            if (r1 == 0) goto L_0x01bd
            r1 = 100663296(0x6000000, float:2.4074124E-35)
        L_0x006e:
            r0 = r0 | r1
        L_0x006f:
            r11 = r4 & 512(0x200, float:7.175E-43)
            if (r11 == 0) goto L_0x01ab
            r1 = 805306368(0x30000000, float:4.656613E-10)
        L_0x0075:
            r0 = r0 | r1
        L_0x0076:
            r1 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r12 = r0 & r1
            r1 = 306783378(0x12492492, float:6.3469493E-28)
            if (r12 != r1) goto L_0x00ab
            boolean r1 = r7.BCM()
            if (r1 == 0) goto L_0x00ab
            r7.CuJ()
        L_0x0089:
            X.8nW r0 = r7.AKE()
            if (r0 == 0) goto L_0x00aa
            X.8TZ r2 = new X.8TZ
            r9 = r6
            r10 = r5
            r11 = r4
            r12 = r26
            r13 = r18
            r14 = r3
            r3 = r16
            r4 = r30
            r5 = r8
            r6 = r29
            r7 = r28
            r8 = r27
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            X.AnonymousClass7WO.A00(r0, r2)
        L_0x00aa:
            return
        L_0x00ab:
            if (r11 == 0) goto L_0x00af
            X.7Wm r16 = androidx.compose.ui.Modifier.A00
        L_0x00af:
            r1 = r16
            androidx.compose.ui.Modifier r13 = X.C100346My.A00(r7, r1, r3)
            if (r42 == 0) goto L_0x01a7
            X.687 r11 = X.AnonymousClass687.Middle
        L_0x00b9:
            r1 = r30
            X.687 r12 = X.AnonymousClass6MK.A00(r1, r11)
            X.67q r1 = X.C970267q.POST
            if (r8 == r1) goto L_0x00c8
            X.67q r11 = X.C970267q.REPOST_PREVIEW
            r1 = 0
            if (r8 != r11) goto L_0x00c9
        L_0x00c8:
            r1 = 1
        L_0x00c9:
            androidx.compose.ui.Modifier r13 = X.AnonymousClass73T.A00(r7, r13, r12, r9, r1)
            X.6hH r1 = X.C103106Xv.A00
            float r12 = r1.A00
            r1 = 8
            float r11 = (float) r1
            float r12 = r12 - r11
            if (r42 == 0) goto L_0x00d8
            float r11 = (float) r2
        L_0x00d8:
            r1 = 16
            float r9 = (float) r1
            float r1 = (float) r2
            androidx.compose.ui.Modifier r1 = X.AnonymousClass7K4.A05(r13, r12, r1, r9, r11)
            X.8ly r15 = X.AnonymousClass7KV.A06(r7)
            java.lang.Object r14 = X.C147188nY.A0p(r7)
            java.lang.Object r13 = X.C147188nY.A0n(r7)
            java.lang.Object r12 = X.C147188nY.A0m(r7)
            X.0ZU r11 = X.AnonymousClass74X.A00
            X.0YM r9 = X.C98236Es.A00(r1)
            r1 = r7
            X.7W3 r1 = (X.AnonymousClass7W3) r1
            X.C147188nY.A0w(r7, r1, r11)
            X.AnonymousClass7W3.A0a(r7, r1, r15, r14)
            X.AnonymousClass7KP.A07(r7, r13, r12, r9)
            X.7VA r15 = X.AnonymousClass7VA.A00
            r9 = 24671220(0x17873f4, float:4.5633598E-38)
            X.7Wm r9 = androidx.compose.ui.Modifier.A02(r7, r9)
            r11 = 36
            float r12 = (float) r11
            r11 = 32
            float r11 = (float) r11
            androidx.compose.ui.Modifier r20 = X.AnonymousClass7Kq.A0D(r9, r12, r11)
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r26)
            int r11 = r0 >> 3
            r13 = r11 & 112(0x70, float:1.57E-43)
            r11 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            boolean r11 = X.C147188nY.A0z(r7, r6, r11)
            boolean r11 = X.C147188nY.A11(r7, r12, r11)
            java.lang.Object r14 = r1.A13()
            if (r11 != 0) goto L_0x0132
            java.lang.Object r11 = X.AnonymousClass7GN.A00
            if (r14 != r11) goto L_0x013e
        L_0x0132:
            kotlin.jvm.internal.KtLambdaShape4S0110000_I2 r14 = new kotlin.jvm.internal.KtLambdaShape4S0110000_I2
            r12 = r26
            r11 = r17
            r14.<init>(r11, r6, r12)
            r1.A14(r14)
        L_0x013e:
            X.0ZU r21 = X.AnonymousClass7W3.A08(r1, r14, r2)
            r11 = r13 | 384(0x180, float:5.38E-43)
            r19 = r7
            r22 = r11
            r23 = r2
            r24 = r26
            A02(r19, r20, r21, r22, r23, r24)
            r23 = 2131230957(0x7f0800ed, float:1.8077981E38)
            r11 = 2131822099(0x7f110613, float:1.927696E38)
            java.lang.String r21 = X.AnonymousClass7JS.A01(r7, r11)
            int r11 = r0 >> 9
            r11 = r11 & 14
            r11 = r11 | 3072(0xc00, float:4.305E-42)
            r22 = r29
            r24 = r11
            r25 = r2
            A01(r19, r20, r21, r22, r23, r24, r25)
            r23 = 2131230989(0x7f08010d, float:1.8078046E38)
            if (r41 == 0) goto L_0x0170
            r23 = 2131230990(0x7f08010e, float:1.8078048E38)
        L_0x0170:
            r11 = 2131822100(0x7f110614, float:1.9276962E38)
            java.lang.String r21 = X.AnonymousClass7JS.A01(r7, r11)
            int r11 = r0 >> 15
            r11 = r11 & 14
            r11 = r11 | 3072(0xc00, float:4.305E-42)
            r22 = r27
            r24 = r11
            A01(r19, r20, r21, r22, r23, r24, r25)
            r23 = 2131230992(0x7f080110, float:1.8078052E38)
            r11 = 2131822106(0x7f11061a, float:1.9276974E38)
            java.lang.String r21 = X.AnonymousClass7JS.A01(r7, r11)
            int r0 = r0 >> 12
            r0 = r0 & 14
            r0 = r0 | 3072(0xc00, float:4.305E-42)
            r22 = r28
            r24 = r0
            A01(r19, r20, r21, r22, r23, r24, r25)
            androidx.compose.ui.Modifier r0 = X.C146818mu.A00(r15, r9, r10)
            X.C115686vk.A01(r7, r0, r2)
            X.AnonymousClass7W3.A0v(r1, r10)
            goto L_0x0089
        L_0x01a7:
            X.687 r11 = X.AnonymousClass687.End
            goto L_0x00b9
        L_0x01ab:
            r1 = 1879048192(0x70000000, float:1.58456325E29)
            r1 = r38 & r1
            if (r1 != 0) goto L_0x0076
            r1 = r16
            boolean r1 = r7.ACY(r1)
            int r1 = X.C86104wH.A02(r1)
            goto L_0x0075
        L_0x01bd:
            r1 = 234881024(0xe000000, float:1.5777218E-30)
            r1 = r1 & r38
            if (r1 != 0) goto L_0x006f
            boolean r1 = r7.ACZ(r3)
            int r1 = X.C86104wH.A03(r1)
            goto L_0x006e
        L_0x01cd:
            r1 = 29360128(0x1c00000, float:7.052966E-38)
            r1 = r1 & r38
            if (r1 != 0) goto L_0x0066
            r1 = r30
            boolean r1 = r7.ACY(r1)
            int r1 = X.C86104wH.A04(r1)
            goto L_0x0065
        L_0x01df:
            r1 = 3670016(0x380000, float:5.142788E-39)
            r1 = r1 & r38
            if (r1 != 0) goto L_0x005d
            r1 = r18
            boolean r1 = r7.ACZ(r1)
            int r1 = X.C86104wH.A01(r1)
            goto L_0x005c
        L_0x01f1:
            r1 = 458752(0x70000, float:6.42848E-40)
            r1 = r1 & r38
            if (r1 != 0) goto L_0x0054
            r1 = r27
            int r1 = X.C147188nY.A0E(r7, r1)
            goto L_0x0053
        L_0x01ff:
            r1 = 57344(0xe000, float:8.0356E-41)
            r1 = r1 & r38
            if (r1 != 0) goto L_0x004d
            r1 = r28
            int r1 = X.C147188nY.A0D(r7, r1)
            r0 = r0 | r1
            goto L_0x004d
        L_0x020f:
            r1 = r5 & 7168(0x1c00, float:1.0045E-41)
            if (r1 != 0) goto L_0x0047
            r1 = r29
            int r1 = X.C147188nY.A0C(r7, r1)
            r0 = r0 | r1
            goto L_0x0047
        L_0x021c:
            r1 = r5 & 896(0x380, float:1.256E-42)
            if (r1 != 0) goto L_0x0041
            r1 = r26
            int r1 = X.C147188nY.A0N(r7, r1)
            r0 = r0 | r1
            goto L_0x0041
        L_0x0229:
            r1 = r38 & 112(0x70, float:1.57E-43)
            if (r1 != 0) goto L_0x0039
            int r1 = X.C147188nY.A0A(r7, r6)
            r0 = r0 | r1
            goto L_0x0039
        L_0x0234:
            r0 = r38 & 14
            if (r0 != 0) goto L_0x0240
            int r0 = X.C147188nY.A0F(r7, r8)
            r0 = r0 | r38
            goto L_0x0033
        L_0x0240:
            r0 = r5
            goto L_0x0033
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C120477Ba.A00(X.8nY, androidx.compose.ui.Modifier, com.instagram.api.schemas.LineType, X.67q, X.0ZU, X.0ZU, X.0ZU, X.0YY, int, int, boolean, boolean, boolean):void");
    }

    public static final void A02(C147188nY r24, Modifier modifier, AnonymousClass0ZU r26, int i, int i2, boolean z) {
        int i3;
        long j;
        Modifier modifier2 = modifier;
        C147188nY r7 = r24;
        r7.Cvd(-1350621050);
        int i4 = i2;
        AnonymousClass0ZU r6 = r26;
        int i5 = i;
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = C147188nY.A09(r7, r6) | i;
        } else {
            i3 = i5;
        }
        boolean z2 = z;
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= C147188nY.A0M(r7, z2);
        }
        int i6 = i2 & 4;
        if (i6 != 0) {
            i3 |= 384;
        } else if ((i5 & 896) == 0) {
            i3 |= C147188nY.A0H(r7, modifier2);
        }
        if ((i3 & 731) != 146 || !r7.BCM()) {
            if (i6 != 0) {
                modifier2 = Modifier.A00;
            }
            Object AEA = r7.AEA(AnonymousClass7DE.A05);
            int i7 = R.drawable.barcelona_heart_outline_20;
            if (z) {
                i7 = R.drawable.barcelona_heart_filled_20;
            }
            C115286uo A00 = AnonymousClass6QP.A00(r7, i7);
            int i8 = 2131822092;
            if (z) {
                i8 = 2131822111;
            }
            String A01 = AnonymousClass7JS.A01(r7, i8);
            Modifier A002 = AnonymousClass6FI.A00(modifier2, AnonymousClass8O8.A00, true);
            float f = 0.9f;
            if (!z) {
                f = 0.8f;
            }
            float f2 = 1500.0f;
            float f3 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
            if (!z) {
                f2 = 600.0f;
                f3 = 15.0f;
            }
            Modifier A03 = AnonymousClass7Kq.A03((Alignment) null, AnonymousClass70U.A00(r7, A002, AnonymousClass799.A00(0), new KtLambdaShape19S0200000_I2_3(7, AEA, r6), f, 10000.0f, f2, f3, 97, false), 3);
            if (z) {
                j = C40602Ljh.A0T;
            } else {
                j = C120537Bh.A00(r7).A0g;
            }
            C1190173e.A00(r7, A03, A00, A01, 8, 0, j);
        } else {
            r7.CuJ();
        }
        C147178nW AKE = r7.AKE();
        if (AKE != null) {
            AKE.D9d(new KtLambdaShape2S0212000_I2(r6, modifier2, i5, i4, 7, z2));
        }
    }
}
