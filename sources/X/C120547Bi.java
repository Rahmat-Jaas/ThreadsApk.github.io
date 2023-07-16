package X;

import android.graphics.drawable.Drawable;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import com.facebook.react.uimanager.BaseViewManager;
import kotlin.jvm.internal.KtLambdaShape0S0322002_I2;
import kotlin.jvm.internal.KtLambdaShape156S0100000_I2_11;
import kotlin.jvm.internal.KtLambdaShape24S0200000_I2_8;

/* renamed from: X.7Bi  reason: invalid class name and case insensitive filesystem */
public final class C120547Bi {
    public static final void A00(Drawable drawable, C147188nY r14, Modifier modifier, AnonymousClass0YY r16, float f, float f2, int i, int i2, boolean z, boolean z2) {
        AnonymousClass0YY r5 = r16;
        Drawable drawable2 = drawable;
        C04220Ms.A0B(drawable, 0);
        C147188nY r13 = r14;
        int i3 = i2;
        Modifier A0d = C147188nY.A0d(r14, modifier, 736926801, i3);
        boolean A1R = C18240wQ.A1R(i2 & 16, z);
        boolean A1R2 = C18240wQ.A1R(i2 & 32, z2);
        if ((i2 & 64) != 0) {
            r5 = null;
        }
        int i4 = i;
        float f3 = f;
        float f4 = f2;
        A01(r13, A0d, AnonymousClass73J.A00(drawable2, r14), r5, f, f2, C86114wI.A04(i4, C86114wI.A03(i4, 8)) | (3670016 & i4), 0, A1R, A1R2);
        C147178nW AKE = r13.AKE();
        if (AKE != null) {
            AKE.D9d(new KtLambdaShape0S0322002_I2(drawable2, A0d, r5, f3, f4, i4, i3, 1, A1R, A1R2));
        }
    }

    public static final void A01(C147188nY r26, Modifier modifier, C115286uo r28, AnonymousClass0YY r29, float f, float f2, int i, int i2, boolean z, boolean z2) {
        AnonymousClass0YY r10 = r29;
        C147188nY r0 = r26;
        int i3 = i2;
        Modifier A0d = C147188nY.A0d(r0, modifier, 2127105451, i3);
        boolean A1R = C18240wQ.A1R(i2 & 16, z);
        boolean A1R2 = C18240wQ.A1R(i2 & 32, z2);
        if ((i2 & 64) != 0) {
            r10 = null;
        }
        float f3 = f;
        Modifier A09 = AnonymousClass7Kq.A09(A0d, f3);
        C146288ly A0h = C147188nY.A0h(r0, AnonymousClass7KV.A09);
        Object A0p = C147188nY.A0p(r0);
        Object A0n = C147188nY.A0n(r0);
        Object A0m = C147188nY.A0m(r0);
        AnonymousClass0ZU r4 = AnonymousClass74X.A00;
        AnonymousClass0YM A00 = C98236Es.A00(A09);
        AnonymousClass7W3 r1 = (AnonymousClass7W3) r0;
        C147188nY.A0w(r0, r1, r4);
        AnonymousClass7W3.A0a(r0, r1, A0h, A0p);
        AnonymousClass7KP.A07(r0, A0n, A0m, A00);
        r0.Cvb(-211975963);
        r0.Cvb(2071703767);
        int i4 = i;
        if (A1R) {
            C101276Qo.A00(r0, (C303320p) null, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 0, (i >> 15) & 14, 30, A1R2);
        }
        AnonymousClass7W3.A0w(r1, false);
        AnonymousClass0MJ A17 = C86144wL.A17();
        A17.A00 = AnonymousClass7F6.A04;
        float f4 = f2;
        Modifier A02 = AnonymousClass7G5.A02(Modifier.A00, f4);
        if (r10 != null) {
            A02 = C98246Et.A00(AnonymousClass7HZ.A02(A02, (AnonymousClass799) null, new KtLambdaShape24S0200000_I2_8(7, (Object) r10, (Object) A17), 7, false), new KtLambdaShape156S0100000_I2_11(A17, 26));
        }
        C115286uo r8 = r28;
        C97846Dc.A00(r0, (Alignment) null, A02, (C104136bI) null, r8, (C146878n1) null, (String) null, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 56, 120);
        AnonymousClass7W3.A0f(r1);
        C147178nW AKE = r0.AKE();
        if (AKE != null) {
            AKE.D9d(new KtLambdaShape0S0322002_I2(r8, A0d, r10, f3, f4, i4, i3, 2, A1R, A1R2));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A02(X.C147188nY r20, androidx.compose.ui.Modifier r21, com.instagram.common.typedurl.ImageUrl r22, X.AnonymousClass0YY r23, float r24, float r25, int r26, int r27, boolean r28, boolean r29) {
        /*
            r6 = r23
            r0 = r29
            r4 = r28
            r1 = r21
            r3 = 0
            r7 = r22
            X.C04220Ms.A0B(r7, r3)
            r2 = 86246215(0x5240347, float:7.711845E-36)
            r8 = r20
            r8.Cvd(r2)
            r19 = r27
            r2 = r27 & 1
            r5 = r26
            if (r2 == 0) goto L_0x010d
            r2 = r26 | 6
        L_0x0020:
            r9 = r27 & 2
            r15 = r24
            if (r9 == 0) goto L_0x0102
            r2 = r2 | 48
        L_0x0028:
            r9 = r27 & 4
            r10 = r25
            if (r9 == 0) goto L_0x00f3
            r2 = r2 | 384(0x180, float:5.38E-43)
        L_0x0030:
            r18 = r27 & 8
            if (r18 == 0) goto L_0x00e8
            r2 = r2 | 3072(0xc00, float:4.305E-42)
        L_0x0036:
            r14 = r27 & 16
            r9 = 57344(0xe000, float:8.0356E-41)
            if (r14 == 0) goto L_0x00dd
            r2 = r2 | 24576(0x6000, float:3.4438E-41)
        L_0x003f:
            r13 = r27 & 32
            r9 = 458752(0x70000, float:6.42848E-40)
            if (r13 == 0) goto L_0x00d3
            r11 = 196608(0x30000, float:2.75506E-40)
        L_0x0047:
            r2 = r2 | r11
        L_0x0048:
            r17 = r27 & 64
            r16 = 3670016(0x380000, float:5.142788E-39)
            if (r17 == 0) goto L_0x00c5
            r11 = 1572864(0x180000, float:2.204052E-39)
        L_0x0050:
            r2 = r2 | r11
        L_0x0051:
            r11 = 2995931(0x2db6db, float:4.198194E-39)
            r12 = r2 & r11
            r11 = 599186(0x92492, float:8.39638E-40)
            if (r12 != r11) goto L_0x0082
            boolean r11 = r8.BCM()
            if (r11 == 0) goto L_0x0082
            r8.CuJ()
        L_0x0064:
            X.8nW r2 = r8.AKE()
            if (r2 == 0) goto L_0x0081
            kotlin.jvm.internal.KtLambdaShape0S0322002_I2 r12 = new kotlin.jvm.internal.KtLambdaShape0S0322002_I2
            r20 = r3
            r21 = r4
            r22 = r0
            r16 = r15
            r17 = r10
            r18 = r5
            r13 = r7
            r14 = r1
            r15 = r6
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            r2.D9d(r12)
        L_0x0081:
            return
        L_0x0082:
            if (r18 == 0) goto L_0x0086
            X.7Wm r1 = androidx.compose.ui.Modifier.A00
        L_0x0086:
            boolean r4 = X.C18240wQ.A1R(r14, r4)
            boolean r0 = X.C18240wQ.A1R(r13, r0)
            if (r17 == 0) goto L_0x0091
            r6 = 0
        L_0x0091:
            r22 = 0
            r23 = 6
            r24 = 0
            r21 = r7
            X.6uo r22 = X.C120577Bm.A02(r20, r21, r22, r23, r24)
            r11 = r2 & 112(0x70, float:1.57E-43)
            r12 = r11 | 8
            r11 = r2 & 896(0x380, float:1.256E-42)
            r12 = r12 | r11
            r11 = r2 & 7168(0x1c00, float:1.0045E-41)
            r12 = r12 | r11
            r11 = 57344(0xe000, float:8.0356E-41)
            r11 = r11 & r2
            int r26 = X.C86144wL.A04(r12, r11, r9, r2)
            r2 = r2 & r16
            r26 = r26 | r2
            r21 = r1
            r23 = r6
            r24 = r15
            r25 = r10
            r27 = r3
            r28 = r4
            r29 = r0
            A01(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            goto L_0x0064
        L_0x00c5:
            r11 = r26 & r16
            if (r11 != 0) goto L_0x0051
            boolean r11 = r8.ACa(r6)
            int r11 = X.C86104wH.A01(r11)
            goto L_0x0050
        L_0x00d3:
            r11 = r26 & r9
            if (r11 != 0) goto L_0x0048
            int r11 = X.C147188nY.A0Q(r8, r0)
            goto L_0x0047
        L_0x00dd:
            r9 = r26 & r9
            if (r9 != 0) goto L_0x003f
            int r9 = X.C147188nY.A0P(r8, r4)
            r2 = r2 | r9
            goto L_0x003f
        L_0x00e8:
            r9 = r5 & 7168(0x1c00, float:1.0045E-41)
            if (r9 != 0) goto L_0x0036
            int r9 = X.C147188nY.A0I(r8, r1)
            r2 = r2 | r9
            goto L_0x0036
        L_0x00f3:
            r9 = r5 & 896(0x380, float:1.256E-42)
            if (r9 != 0) goto L_0x0030
            boolean r9 = r8.ACV(r10)
            int r9 = X.C86124wJ.A06(r9)
            r2 = r2 | r9
            goto L_0x0030
        L_0x0102:
            r9 = r26 & 112(0x70, float:1.57E-43)
            if (r9 != 0) goto L_0x0028
            int r9 = X.C147188nY.A01(r8, r15)
            r2 = r2 | r9
            goto L_0x0028
        L_0x010d:
            r2 = r26 & 14
            if (r2 != 0) goto L_0x0119
            int r2 = X.C147188nY.A0F(r8, r7)
            r2 = r2 | r26
            goto L_0x0020
        L_0x0119:
            r2 = r5
            goto L_0x0020
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C120547Bi.A02(X.8nY, androidx.compose.ui.Modifier, com.instagram.common.typedurl.ImageUrl, X.0YY, float, float, int, int, boolean, boolean):void");
    }
}
