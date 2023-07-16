package X;

import androidx.compose.ui.Modifier;
import kotlin.jvm.internal.KtLambdaShape1S1001000_I2;

/* renamed from: X.7Fv  reason: invalid class name and case insensitive filesystem */
public final class C121417Fv {
    public static final void A03(String str, C147188nY r20, int i) {
        int i2;
        String str2 = str;
        C04220Ms.A0B(str2, 0);
        C147188nY r4 = r20;
        r4.Cvd(-894711963);
        int i3 = i;
        if ((i & 14) == 0) {
            i2 = C147188nY.A0F(r4, str2) | i;
        } else {
            i2 = i3;
        }
        if ((i2 & 11) != 2 || !r4.BCM()) {
            AnonymousClass7I9.A02(r4, (Modifier) null, (C121807If) null, (C114236su) null, (C134817yQ) null, (C121117Ee) null, str2, 0, 0, 0, i2 & 14, 0, 4094, 0, 0, false);
        } else {
            r4.CuJ();
        }
        C147178nW AKE = r4.AKE();
        if (AKE != null) {
            AKE.D9d(new KtLambdaShape1S1001000_I2(str2, i3, 6));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00e7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C147258p3 r16, X.C147188nY r17, androidx.compose.ui.Modifier r18, X.AnonymousClass0YM r19, int r20, int r21, boolean r22, boolean r23) {
        /*
            r6 = r23
            r15 = r22
            r10 = r16
            r9 = r18
            r0 = 4
            r11 = r19
            X.C04220Ms.A0B(r11, r0)
            r0 = 1055911511(0x3eefee57, float:0.46861526)
            r5 = r17
            r5.Cvd(r0)
            r13 = r21
            r8 = r21 & 1
            r12 = r20
            if (r8 == 0) goto L_0x0129
            r2 = r20 | 6
        L_0x0020:
            r4 = r21 & 2
            if (r4 == 0) goto L_0x011e
            r2 = r2 | 48
        L_0x0026:
            r7 = r21 & 4
            if (r7 == 0) goto L_0x0113
            r2 = r2 | 384(0x180, float:5.38E-43)
        L_0x002c:
            r3 = r21 & 8
            if (r3 == 0) goto L_0x0108
            r2 = r2 | 3072(0xc00, float:4.305E-42)
        L_0x0032:
            r0 = r21 & 16
            if (r0 == 0) goto L_0x00fa
            r2 = r2 | 24576(0x6000, float:3.4438E-41)
        L_0x0038:
            r1 = 46811(0xb6db, float:6.5596E-41)
            r1 = r1 & r2
            r0 = 9362(0x2492, float:1.3119E-41)
            if (r1 != r0) goto L_0x005b
            boolean r0 = r5.BCM()
            if (r0 == 0) goto L_0x005b
            r5.CuJ()
        L_0x0049:
            X.8nW r0 = r5.AKE()
            if (r0 == 0) goto L_0x005a
            r14 = 3
            kotlin.jvm.internal.KtLambdaShape0S0322000_I2 r8 = new kotlin.jvm.internal.KtLambdaShape0S0322000_I2
            r16 = r6
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16)
            r0.D9d(r8)
        L_0x005a:
            return
        L_0x005b:
            if (r8 == 0) goto L_0x005f
            X.7Wm r9 = androidx.compose.ui.Modifier.A00
        L_0x005f:
            if (r4 == 0) goto L_0x006a
            r0 = r5
            X.7W3 r0 = (X.AnonymousClass7W3) r0
            java.lang.Object r10 = X.AnonymousClass7GN.A00(r0)
            X.8fV r10 = (X.C142738fV) r10
        L_0x006a:
            r4 = 0
            if (r7 == 0) goto L_0x006e
            r15 = 0
        L_0x006e:
            if (r3 == 0) goto L_0x0071
            r6 = 1
        L_0x0071:
            X.4oM r0 = X.C97866Dg.A00(r10, r5)
            boolean r8 = X.C86104wH.A1X(r0)
            r7 = 1
            r0 = 973044525(0x39ff7b2d, float:4.8729163E-4)
            r5.Cvb(r0)
            if (r15 == 0) goto L_0x00f0
            r0 = -1705543749(0xffffffff9a5777bb, float:-4.4557675E-23)
            X.7KB r0 = X.C120537Bh.A01(r5, r0)
            long r0 = r0.A0Z
        L_0x008b:
            X.7W3 r3 = X.AnonymousClass7W3.A04(r5, r4)
            if (r6 != 0) goto L_0x00ea
            r8 = 1050253722(0x3e99999a, float:0.3)
        L_0x0094:
            long r0 = X.C121657He.A04(X.C86154wM.A0G(r0), X.AnonymousClass7KE.A03(r0), X.AnonymousClass7KE.A02(r0), X.AnonymousClass7KE.A01(r0), r8)
        L_0x0098:
            X.7KE r0 = X.C86134wK.A0I(r0)
            X.4oM r0 = X.C115806vw.A01(r5, r0)
            X.AnonymousClass7W3.A0w(r3, r4)
            long r22 = X.C86114wI.A0A(r0)
            r0 = 8
            float r0 = (float) r0
            X.52s r17 = X.AnonymousClass7G5.A00(r0)
            r0 = 928678694(0x375a8326, float:1.3024348E-5)
            X.7KB r0 = X.C120537Bh.A01(r5, r0)
            if (r15 == 0) goto L_0x00e7
            long r0 = r0.A0a
        L_0x00b9:
            X.7KE r0 = X.C86134wK.A0I(r0)
            X.4oM r0 = X.C115806vw.A01(r5, r0)
            X.AnonymousClass7W3.A0w(r3, r4)
            long r3 = X.C86114wI.A0A(r0)
            X.534 r1 = X.AnonymousClass6YS.A00
            X.7KE r0 = X.C86134wK.A0I(r3)
            X.7DS[] r3 = X.AnonymousClass7DS.A01(r1, r0, r7)
            r1 = 999031191(0x3b8c0197, float:0.0042726505)
            r21 = 3
            kotlin.jvm.internal.KtLambdaShape2S0301100_I2 r0 = new kotlin.jvm.internal.KtLambdaShape2S0301100_I2
            r18 = r9
            r20 = r2
            r16 = r0
            r16.<init>(r17, r18, r19, r20, r21, r22)
            X.AnonymousClass7JR.A05(r5, r0, r3, r1)
            goto L_0x0049
        L_0x00e7:
            long r0 = r0.A0h
            goto L_0x00b9
        L_0x00ea:
            if (r8 == 0) goto L_0x0098
            r8 = 1060320051(0x3f333333, float:0.7)
            goto L_0x0094
        L_0x00f0:
            r0 = -1705543686(0xffffffff9a5777fa, float:-4.4557874E-23)
            X.7KB r0 = X.C120537Bh.A01(r5, r0)
            long r0 = r0.A0b
            goto L_0x008b
        L_0x00fa:
            r0 = 57344(0xe000, float:8.0356E-41)
            r0 = r0 & r20
            if (r0 != 0) goto L_0x0038
            int r0 = X.C147188nY.A0D(r5, r11)
            r2 = r2 | r0
            goto L_0x0038
        L_0x0108:
            r0 = r12 & 7168(0x1c00, float:1.0045E-41)
            if (r0 != 0) goto L_0x0032
            int r0 = X.C147188nY.A0O(r5, r6)
            r2 = r2 | r0
            goto L_0x0032
        L_0x0113:
            r0 = r12 & 896(0x380, float:1.256E-42)
            if (r0 != 0) goto L_0x002c
            int r0 = X.C147188nY.A0N(r5, r15)
            r2 = r2 | r0
            goto L_0x002c
        L_0x011e:
            r0 = r20 & 112(0x70, float:1.57E-43)
            if (r0 != 0) goto L_0x0026
            int r0 = X.C147188nY.A0G(r5, r10)
            r2 = r2 | r0
            goto L_0x0026
        L_0x0129:
            r0 = r20 & 14
            if (r0 != 0) goto L_0x0135
            int r2 = X.C147188nY.A0F(r5, r9)
            r2 = r2 | r20
            goto L_0x0020
        L_0x0135:
            r2 = r12
            goto L_0x0020
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C121417Fv.A00(X.8p3, X.8nY, androidx.compose.ui.Modifier, X.0YM, int, int, boolean, boolean):void");
    }

    public static final void A01(C147188nY r19, C115286uo r20, Integer num, String str, String str2, int i, int i2) {
        String str3 = str2;
        Integer num2 = num;
        C147188nY r6 = r19;
        r6.Cvd(-909483918);
        if ((i2 & 4) != 0) {
            num2 = AnonymousClass006.A00;
        }
        if ((i2 & 8) != 0) {
            str3 = null;
        }
        r6.Cvb(-2056837587);
        C115286uo r4 = r20;
        if (num2 == AnonymousClass006.A00) {
            A02(r6, r4, str3, C103826an.A00, ((i >> 3) & 896) | 56);
            C115686vk.A01(r6, AnonymousClass7Kq.A0A(Modifier.A00, C103826an.A02), 6);
        }
        AnonymousClass7W3.A0z(r6, false);
        String str4 = str;
        AnonymousClass7I9.A02(r6, (Modifier) null, (C121807If) null, (C114236su) null, (C134817yQ) null, (C121117Ee) null, str4, 0, 0, 0, i & 14, 0, 4094, 0, 0, false);
        if (num2 == AnonymousClass006.A01) {
            C115686vk.A01(r6, AnonymousClass7Kq.A0A(Modifier.A00, C103826an.A02), 6);
            A02(r6, r4, str3, C103826an.A00, ((i >> 3) & 896) | 56);
        }
        C147178nW AKE = r6.AKE();
        if (AKE != null) {
            AnonymousClass7WO.A00(AKE, new AnonymousClass8Rf(r4, num2, str4, str3, i, i2));
        }
    }

    public static final void A02(C147188nY r8, C115286uo r9, String str, float f, int i) {
        C147188nY r1 = r8;
        r8.Cvd(1695605811);
        AnonymousClass72U.A00(r1, AnonymousClass7Kq.A09(Modifier.A00, f), r9, str, ((i >> 3) & 112) | 8, 8, 0);
        C147178nW AKE = r1.AKE();
        if (AKE != null) {
            AnonymousClass7WO.A00(AKE, new AnonymousClass8R5(r9, str, f, i));
        }
    }
}
