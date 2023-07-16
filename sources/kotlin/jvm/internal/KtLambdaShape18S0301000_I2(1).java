package kotlin.jvm.internal;

import X.AnonymousClass0YP;
import X.C02220Ah;

public class KtLambdaShape18S0301000_I2 extends C02220Ah implements AnonymousClass0YP {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public final int A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtLambdaShape18S0301000_I2(int i, int i2, Object obj, Object obj2, Object obj3) {
        super(2);
        this.A04 = i2;
        this.A01 = obj;
        this.A02 = obj2;
        this.A00 = i;
        this.A03 = obj3;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0596, code lost:
        r12.CuJ();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x079c, code lost:
        return X.C147618pd.A00(r12, r11, r6, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0026, code lost:
        return kotlin.Unit.A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r26, java.lang.Object r27) {
        /*
            r25 = this;
            r0 = r25
            r11 = r27
            r12 = r26
            int r1 = r0.A04
            switch(r1) {
                case 0: goto L_0x05ea;
                case 1: goto L_0x05cf;
                case 2: goto L_0x05b6;
                case 3: goto L_0x059b;
                case 4: goto L_0x04e7;
                case 5: goto L_0x06e6;
                case 6: goto L_0x049b;
                case 7: goto L_0x0482;
                case 8: goto L_0x0469;
                case 9: goto L_0x043f;
                case 10: goto L_0x0424;
                case 11: goto L_0x040b;
                case 12: goto L_0x03a8;
                case 13: goto L_0x0644;
                case 14: goto L_0x035b;
                case 15: goto L_0x0340;
                case 16: goto L_0x025e;
                case 17: goto L_0x0243;
                case 18: goto L_0x0228;
                case 19: goto L_0x020d;
                case 20: goto L_0x01f2;
                case 21: goto L_0x01d7;
                case 22: goto L_0x01bc;
                case 23: goto L_0x0628;
                case 24: goto L_0x0174;
                case 25: goto L_0x010a;
                case 26: goto L_0x0605;
                case 27: goto L_0x00ef;
                case 28: goto L_0x00d4;
                case 29: goto L_0x0075;
                case 30: goto L_0x005b;
                case 31: goto L_0x0041;
                case 32: goto L_0x0027;
                default: goto L_0x000b;
            }
        L_0x000b:
            X.8nY r4 = X.C86104wH.A0H(r12, r11)
            java.lang.Object r3 = r0.A03
            X.5N7 r3 = (X.AnonymousClass5N7) r3
            java.lang.Object r2 = r0.A01
            X.8jX r2 = (X.C144938jX) r2
            java.lang.Object r1 = r0.A02
            X.0YY r1 = (X.AnonymousClass0YY) r1
            int r0 = r0.A00
            int r0 = X.C115796vv.A00(r0)
            X.C121937Iw.A03(r4, r2, r3, r1, r0)
        L_0x0024:
            kotlin.Unit r7 = kotlin.Unit.A00
            return r7
        L_0x0027:
            X.8nY r4 = X.C86104wH.A0H(r12, r11)
            java.lang.Object r3 = r0.A01
            androidx.fragment.app.Fragment r3 = (androidx.fragment.app.Fragment) r3
            java.lang.Object r2 = r0.A03
            com.instagram.service.session.UserSession r2 = (com.instagram.service.session.UserSession) r2
            java.lang.Object r1 = r0.A02
            X.3EY r1 = (X.AnonymousClass3EY) r1
            int r0 = r0.A00
            int r0 = X.C115796vv.A00(r0)
            X.C1184771b.A00(r4, r3, r1, r2, r0)
            goto L_0x0024
        L_0x0041:
            X.8nY r4 = X.C86104wH.A0H(r12, r11)
            java.lang.Object r3 = r0.A02
            X.0ZU r3 = (X.AnonymousClass0ZU) r3
            java.lang.Object r2 = r0.A01
            androidx.compose.ui.Modifier r2 = (androidx.compose.ui.Modifier) r2
            java.lang.Object r1 = r0.A03
            com.instagram.common.typedurl.ImageUrl r1 = (com.instagram.common.typedurl.ImageUrl) r1
            int r0 = r0.A00
            int r0 = X.C115796vv.A00(r0)
            X.C101746Sl.A00(r4, r2, r1, r3, r0)
            goto L_0x0024
        L_0x005b:
            X.8nY r4 = X.C86104wH.A0H(r12, r11)
            java.lang.Object r3 = r0.A03
            java.util.List r3 = (java.util.List) r3
            java.lang.Object r2 = r0.A02
            com.instagram.api.schemas.ProfileTheme r2 = (com.instagram.api.schemas.ProfileTheme) r2
            java.lang.Object r1 = r0.A01
            X.0YY r1 = (X.AnonymousClass0YY) r1
            int r0 = r0.A00
            int r0 = X.C115796vv.A00(r0)
            X.C122077Ka.A06(r4, r2, r3, r1, r0)
            goto L_0x0024
        L_0x0075:
            X.8nY r12 = (X.C147188nY) r12
            int r1 = X.AnonymousClass0wJ.A04(r11)
            r2 = r1 & 11
            r1 = 2
            if (r2 != r1) goto L_0x0086
            boolean r1 = r12.BCM()
            if (r1 != 0) goto L_0x0596
        L_0x0086:
            java.lang.Object r1 = r0.A03
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            int r3 = r0.A00
            java.lang.Object r2 = r0.A01
            java.lang.Object r4 = r0.A02
            java.util.Iterator r9 = r1.iterator()
            r8 = 0
        L_0x0095:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x0024
            java.lang.Object r7 = r9.next()
            int r6 = r8 + 1
            if (r8 >= 0) goto L_0x00a8
            X.C06750aI.A1A()
            r0 = 0
            throw r0
        L_0x00a8:
            java.lang.String r7 = (java.lang.String) r7
            r5 = 1
            boolean r23 = X.AnonymousClass0wJ.A1T(r3, r8)
            r0 = 5
            kotlin.jvm.internal.KtLambdaShape29S0201000_I2 r14 = new kotlin.jvm.internal.KtLambdaShape29S0201000_I2
            r14.<init>(r8, r0, r4, r2)
            r11 = 0
            r24 = 0
            r1 = -771814442(0xffffffffd1ff0bd6, float:-1.36926904E11)
            kotlin.jvm.internal.KtLambdaShape1S1002000_I2 r0 = new kotlin.jvm.internal.KtLambdaShape1S1002000_I2
            r0.<init>(r3, r8, r7, r5)
            X.8sI r15 = X.AnonymousClass7JR.A00(r12, r0, r1)
            r19 = 0
            r17 = 24576(0x6000, float:3.4438E-41)
            r18 = 492(0x1ec, float:6.9E-43)
            r13 = r11
            r16 = r11
            r21 = r19
            X.AnonymousClass7IG.A00(r11, r12, r13, r14, r15, r16, r17, r18, r19, r21, r23, r24)
            r8 = r6
            goto L_0x0095
        L_0x00d4:
            X.8nY r4 = X.C86104wH.A0H(r12, r11)
            java.lang.Object r3 = r0.A01
            androidx.compose.foundation.lazy.LazyListState r3 = (androidx.compose.foundation.lazy.LazyListState) r3
            java.lang.Object r2 = r0.A03
            X.57T r2 = (X.AnonymousClass57T) r2
            java.lang.Object r1 = r0.A02
            X.06E r1 = (X.AnonymousClass06E) r1
            int r0 = r0.A00
            int r0 = X.C115796vv.A00(r0)
            X.C122077Ka.A01(r3, r4, r1, r2, r0)
            goto L_0x0024
        L_0x00ef:
            X.8nY r4 = X.C86104wH.A0H(r12, r11)
            java.lang.Object r3 = r0.A02
            androidx.compose.foundation.lazy.LazyListState r3 = (androidx.compose.foundation.lazy.LazyListState) r3
            java.lang.Object r2 = r0.A03
            X.57s r2 = (X.C883557s) r2
            java.lang.Object r1 = r0.A01
            X.0YY r1 = (X.AnonymousClass0YY) r1
            int r0 = r0.A00
            int r0 = X.C115796vv.A00(r0)
            X.C121917Iu.A00(r3, r4, r2, r1, r0)
            goto L_0x0024
        L_0x010a:
            X.90u r12 = (X.C1526490u) r12
            android.app.Activity r11 = (android.app.Activity) r11
            r1 = 0
            X.C04220Ms.A0B(r12, r1)
            java.lang.Object r5 = r0.A03
            X.AeL r5 = (X.C18371AeL) r5
            java.lang.Object r4 = r0.A02
            X.BKU r4 = (X.BKU) r4
            int r3 = r0.A00
            java.lang.Object r2 = r0.A01
            android.content.Context r2 = (android.content.Context) r2
            boolean r0 = X.C19548Ay9.A00()
            if (r0 == 0) goto L_0x0024
            r0 = 2130970951(0x7f040947, float:1.7550627E38)
            int r1 = X.C121907Is.A01(r2, r0)
            int r1 = r1 + r3
            if (r11 == 0) goto L_0x0172
            int r0 = X.C31164GhX.A01(r11)
        L_0x0134:
            int r1 = r1 + r0
            com.instagram.service.session.UserSession r0 = r5.A00
            android.util.Size r6 = X.C18731AkP.A00(r2, r4, r0, r1)
            if (r6 == 0) goto L_0x0024
            int r0 = r6.getHeight()
            float r5 = (float) r0
            r4 = 1068289229(0x3faccccd, float:1.35)
            float r5 = r5 * r4
            int r0 = X.C09850gn.A00(r2)
            int r0 = r0 - r1
            float r3 = (float) r0
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            android.view.View r2 = r12.A01
            android.view.ViewGroup$LayoutParams r1 = r2.getLayoutParams()
            if (r0 <= 0) goto L_0x0168
            int r0 = r6.getWidth()
            r1.width = r0
            android.view.ViewGroup$LayoutParams r1 = r2.getLayoutParams()
            int r0 = r6.getHeight()
        L_0x0164:
            r1.height = r0
            goto L_0x0024
        L_0x0168:
            float r3 = r3 / r4
            int r0 = (int) r3
            r1.width = r0
            android.view.ViewGroup$LayoutParams r1 = r2.getLayoutParams()
            int r0 = (int) r5
            goto L_0x0164
        L_0x0172:
            r0 = 0
            goto L_0x0134
        L_0x0174:
            android.graphics.Bitmap r12 = (android.graphics.Bitmap) r12
            r10 = 0
            boolean r6 = X.AnonymousClass0wJ.A1Z(r12, r11)
            java.lang.Object r3 = r0.A03
            X.CeN r3 = (X.C22673CeN) r3
            X.CBU r5 = r3.A0C
            X.CKL r4 = r5.A00()
            r1 = 41
            kotlin.jvm.internal.KtLambdaShape157S0100000_I2_12 r2 = new kotlin.jvm.internal.KtLambdaShape157S0100000_I2_12
            r2.<init>(r4, r1)
            java.lang.Object r1 = r0.A02
            java.lang.Object r1 = r2.invoke(r1)
            boolean r1 = r11.equals(r1)
            if (r1 == 0) goto L_0x0024
            java.lang.Object r2 = r0.A01
            X.CH4 r2 = (X.CH4) r2
            X.CKL r1 = r5.A00()
            int r7 = r1.A01
            X.CKL r1 = r5.A00()
            int r8 = r1.A00
            r5 = 0
            r9 = 8
            X.CKZ r4 = new X.CKZ
            r4.<init>(r5, r6, r7, r8, r9, r10)
            r4.A00(r10, r12)
            r2.A00 = r4
            int r0 = r0.A00
            X.C22673CeN.A01(r3, r2, r0)
            goto L_0x0024
        L_0x01bc:
            X.8nY r4 = X.C86104wH.A0H(r12, r11)
            java.lang.Object r3 = r0.A03
            androidx.compose.foundation.lazy.LazyListState r3 = (androidx.compose.foundation.lazy.LazyListState) r3
            java.lang.Object r2 = r0.A01
            X.0ZU r2 = (X.AnonymousClass0ZU) r2
            java.lang.Object r1 = r0.A02
            X.0ZU r1 = (X.AnonymousClass0ZU) r1
            int r0 = r0.A00
            int r0 = X.C115796vv.A00(r0)
            X.AnonymousClass70X.A01(r3, r4, r2, r1, r0)
            goto L_0x0024
        L_0x01d7:
            X.8nY r4 = X.C86104wH.A0H(r12, r11)
            java.lang.Object r3 = r0.A02
            X.0ZU r3 = (X.AnonymousClass0ZU) r3
            java.lang.Object r2 = r0.A01
            X.0YP r2 = (X.AnonymousClass0YP) r2
            java.lang.Object r1 = r0.A03
            X.0zT r1 = (X.C19200zT) r1
            int r0 = r0.A00
            int r0 = X.C115796vv.A00(r0)
            X.C117906zR.A01(r4, r1, r3, r2, r0)
            goto L_0x0024
        L_0x01f2:
            X.8nY r4 = X.C86104wH.A0H(r12, r11)
            java.lang.Object r3 = r0.A03
            X.0ZU r3 = (X.AnonymousClass0ZU) r3
            java.lang.Object r2 = r0.A02
            X.0ZU r2 = (X.AnonymousClass0ZU) r2
            java.lang.Object r1 = r0.A01
            X.21k r1 = (X.C304621k) r1
            int r0 = r0.A00
            int r0 = X.C115796vv.A00(r0)
            X.C122107Kg.A0B(r4, r1, r3, r2, r0)
            goto L_0x0024
        L_0x020d:
            X.8nY r4 = X.C86104wH.A0H(r12, r11)
            java.lang.Object r3 = r0.A02
            X.0YY r3 = (X.AnonymousClass0YY) r3
            java.lang.Object r2 = r0.A03
            X.5Im r2 = (X.AnonymousClass5Im) r2
            java.lang.Object r1 = r0.A01
            androidx.compose.ui.Modifier r1 = (androidx.compose.ui.Modifier) r1
            int r0 = r0.A00
            int r0 = X.C115796vv.A00(r0)
            X.C121867Io.A03(r4, r1, r2, r3, r0)
            goto L_0x0024
        L_0x0228:
            X.8nY r4 = X.C86104wH.A0H(r12, r11)
            java.lang.Object r3 = r0.A02
            X.0YY r3 = (X.AnonymousClass0YY) r3
            java.lang.Object r2 = r0.A03
            X.5Im r2 = (X.AnonymousClass5Im) r2
            java.lang.Object r1 = r0.A01
            androidx.compose.ui.Modifier r1 = (androidx.compose.ui.Modifier) r1
            int r0 = r0.A00
            int r0 = X.C115796vv.A00(r0)
            X.C121867Io.A02(r4, r1, r2, r3, r0)
            goto L_0x0024
        L_0x0243:
            X.8nY r4 = X.C86104wH.A0H(r12, r11)
            java.lang.Object r3 = r0.A01
            X.0ZU r3 = (X.AnonymousClass0ZU) r3
            java.lang.Object r2 = r0.A02
            X.0ZU r2 = (X.AnonymousClass0ZU) r2
            java.lang.Object r1 = r0.A03
            X.57z r1 = (X.C884257z) r1
            int r0 = r0.A00
            int r0 = X.C115796vv.A00(r0)
            X.C121857Im.A05(r4, r1, r3, r2, r0)
            goto L_0x0024
        L_0x025e:
            X.8nY r12 = (X.C147188nY) r12
            int r1 = X.AnonymousClass0wJ.A04(r11)
            r2 = r1 & 11
            r1 = 2
            if (r2 != r1) goto L_0x026f
            boolean r1 = r12.BCM()
            if (r1 != 0) goto L_0x0596
        L_0x026f:
            java.lang.Object r6 = r0.A01
            X.8lm r6 = (X.C146178lm) r6
            java.lang.Object r10 = r0.A02
            java.lang.Object r7 = r0.A03
            X.7Wm r5 = androidx.compose.ui.Modifier.A01(r12)
            androidx.compose.ui.Alignment r0 = X.AnonymousClass7KV.A0E
            r4 = 0
            X.8ly r11 = X.C120767Cj.A00(r12, r0, r4)
            java.lang.Object r9 = X.C147188nY.A0p(r12)
            java.lang.Object r8 = X.C147188nY.A0n(r12)
            java.lang.Object r2 = X.C147188nY.A0m(r12)
            X.0ZU r1 = X.AnonymousClass74X.A00
            X.0YM r0 = X.C98236Es.A00(r5)
            r3 = r12
            X.7W3 r3 = (X.AnonymousClass7W3) r3
            X.C147188nY.A0w(r12, r3, r1)
            X.AnonymousClass7W3.A0a(r12, r3, r11, r9)
            X.AnonymousClass7KP.A07(r12, r8, r2, r0)
            X.7V3 r2 = X.AnonymousClass7V3.A00
            r0 = -1515090057(0xffffffffa5b18f77, float:-3.080182E-16)
            r12.Cvb(r0)
            boolean r0 = r6 instanceof X.C90245Lb
            if (r0 == 0) goto L_0x02e8
            r0 = 1310732778(0x4e2031ea, float:6.7190643E8)
            int r1 = X.C120577Bm.A00(r2, r12, r5, r6, r0)
        L_0x02b3:
            X.AnonymousClass7W3.A0w(r3, r4)
            boolean r0 = X.C147188nY.A10(r12, r7, r6, r1)
            java.lang.Object r1 = r3.A13()
            if (r0 != 0) goto L_0x02c4
            java.lang.Object r0 = X.AnonymousClass7GN.A00
            if (r1 != r0) goto L_0x02ce
        L_0x02c4:
            r0 = 47
            kotlin.jvm.internal.KtLambdaShape18S0200000_I2_2 r1 = new kotlin.jvm.internal.KtLambdaShape18S0200000_I2_2
            r1.<init>(r0, r6, r7)
            r3.A14(r1)
        L_0x02ce:
            X.0ZU r6 = X.AnonymousClass7W3.A09(r3, r1, r4)
            androidx.compose.ui.Alignment r0 = X.AnonymousClass7KV.A0D
            androidx.compose.ui.Modifier r2 = r2.A86(r0, r5)
            r0 = 12
            float r1 = (float) r0
            float r0 = (float) r4
            androidx.compose.ui.Modifier r0 = X.AnonymousClass7K4.A05(r2, r0, r1, r1, r0)
            X.AnonymousClass6M9.A00(r12, r0, r6, r4, r4)
            X.AnonymousClass7W3.A0f(r3)
            goto L_0x0024
        L_0x02e8:
            r1 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            boolean r0 = r6 instanceof X.C90255Lc
            if (r0 == 0) goto L_0x0321
            r0 = 1310733051(0x4e2032fb, float:6.719239E8)
            r12.Cvb(r0)
            r0 = r6
            X.5Lc r0 = (X.C90255Lc) r0
            java.lang.String r14 = r0.A04
            boolean r8 = r0.A05
            boolean r0 = X.C147188nY.A10(r12, r10, r6, r1)
            java.lang.Object r9 = r3.A13()
            if (r0 != 0) goto L_0x030a
            java.lang.Object r0 = X.AnonymousClass7GN.A00
            if (r9 != r0) goto L_0x0310
        L_0x030a:
            r0 = 26
            kotlin.jvm.internal.KtLambdaShape41S0200000_I2_2 r9 = X.AnonymousClass7W3.A0L(r3, r10, r6, r0)
        L_0x0310:
            X.0YY r15 = X.AnonymousClass7W3.A0B(r3, r9, r4)
            r13 = 0
            r18 = 1
            r16 = 48
            r17 = 16
            r19 = r8
            X.C100116Ma.A00(r12, r13, r14, r15, r16, r17, r18, r19)
            goto L_0x02b3
        L_0x0321:
            boolean r0 = r6 instanceof X.C90235La
            if (r0 == 0) goto L_0x0338
            r0 = 1310733341(0x4e20341d, float:6.7194246E8)
            r12.Cvb(r0)
            androidx.compose.ui.Modifier r8 = X.AnonymousClass7KV.A01(r2, r5)
            X.5HL r0 = X.C101296Qq.A00(r12)
            X.AnonymousClass6MF.A00(r12, r8, r0, r4, r4)
            goto L_0x02b3
        L_0x0338:
            r0 = 1310733489(0x4e2034b1, float:6.7195194E8)
            r12.Cvb(r0)
            goto L_0x02b3
        L_0x0340:
            X.8nY r4 = X.C86104wH.A0H(r12, r11)
            java.lang.Object r3 = r0.A02
            X.0YY r3 = (X.AnonymousClass0YY) r3
            java.lang.Object r2 = r0.A03
            X.0ZU r2 = (X.AnonymousClass0ZU) r2
            java.lang.Object r1 = r0.A01
            X.6m7 r1 = (X.C110696m7) r1
            int r0 = r0.A00
            int r0 = X.C115796vv.A00(r0)
            X.C117726z9.A00(r4, r1, r2, r3, r0)
            goto L_0x0024
        L_0x035b:
            X.8nY r12 = (X.C147188nY) r12
            int r1 = X.AnonymousClass0wJ.A04(r11)
            r2 = r1 & 11
            r1 = 2
            if (r2 != r1) goto L_0x036c
            boolean r1 = r12.BCM()
            if (r1 != 0) goto L_0x0596
        L_0x036c:
            X.7Wm r1 = androidx.compose.ui.Modifier.A00
            r3 = 0
            androidx.compose.ui.Modifier r2 = androidx.compose.ui.Modifier.A04(r1)
            java.lang.Object r9 = r0.A03
            java.lang.Object r7 = r0.A01
            java.lang.Object r8 = r0.A02
            int r5 = r0.A00
            r0 = 1618982084(0x607fb4c4, float:7.370227E19)
            boolean r0 = X.C147188nY.A10(r12, r9, r7, r0)
            boolean r0 = X.C147188nY.A12(r12, r8, r0)
            r1 = r12
            X.7W3 r1 = (X.AnonymousClass7W3) r1
            java.lang.Object r4 = r1.A13()
            if (r0 != 0) goto L_0x0393
            java.lang.Object r0 = X.AnonymousClass7GN.A00
            if (r4 != r0) goto L_0x039d
        L_0x0393:
            r6 = 13
            kotlin.jvm.internal.KtLambdaShape18S0301000_I2 r4 = new kotlin.jvm.internal.KtLambdaShape18S0301000_I2
            r4.<init>(r5, r6, r7, r8, r9)
            r1.A14(r4)
        L_0x039d:
            X.AnonymousClass7W3.A0w(r1, r3)
            X.0YP r4 = (X.AnonymousClass0YP) r4
            r0 = 6
            X.C115906w6.A01(r12, r2, r4, r0, r3)
            goto L_0x0024
        L_0x03a8:
            X.8nY r12 = (X.C147188nY) r12
            int r1 = X.AnonymousClass0wJ.A04(r11)
            r2 = r1 & 11
            r1 = 2
            if (r2 != r1) goto L_0x03b9
            boolean r1 = r12.BCM()
            if (r1 != 0) goto L_0x0596
        L_0x03b9:
            java.lang.Object r1 = r0.A02
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.lang.Object r4 = r0.A01
            java.lang.Object r5 = r0.A03
            java.util.Iterator r7 = r1.iterator()
        L_0x03c5:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x0024
            java.lang.Object r6 = r7.next()
            X.68l r6 = (X.C972268l) r6
            r3 = 0
            if (r4 != r6) goto L_0x0408
            X.66u r14 = X.C968166u.Primary
        L_0x03d6:
            int r0 = r6.A00
            java.lang.String r15 = X.AnonymousClass7JS.A01(r12, r0)
            r0 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            boolean r1 = X.C147188nY.A10(r12, r5, r6, r0)
            r2 = r12
            X.7W3 r2 = (X.AnonymousClass7W3) r2
            java.lang.Object r0 = r2.A13()
            if (r1 != 0) goto L_0x03f0
            java.lang.Object r1 = X.AnonymousClass7GN.A00
            if (r0 != r1) goto L_0x03fa
        L_0x03f0:
            r1 = 33
            kotlin.jvm.internal.KtLambdaShape18S0200000_I2_2 r0 = new kotlin.jvm.internal.KtLambdaShape18S0200000_I2_2
            r0.<init>(r1, r6, r5)
            r2.A14(r0)
        L_0x03fa:
            X.0ZU r16 = X.AnonymousClass7W3.A08(r2, r0, r3)
            r11 = 0
            r18 = 24
            r13 = r11
            r17 = r3
            X.C100106Lz.A00(r11, r12, r13, r14, r15, r16, r17, r18)
            goto L_0x03c5
        L_0x0408:
            X.66u r14 = X.C968166u.Secondary
            goto L_0x03d6
        L_0x040b:
            X.8nY r4 = X.C86104wH.A0H(r12, r11)
            java.lang.Object r3 = r0.A03
            X.7Zx r3 = (X.C123917Zx) r3
            java.lang.Object r2 = r0.A02
            X.8jq r2 = (X.C145108jq) r2
            java.lang.Object r1 = r0.A01
            X.0YP r1 = (X.AnonymousClass0YP) r1
            int r0 = r0.A00
            r0 = r0 | 1
            X.C116086wO.A00(r4, r2, r3, r1, r0)
            goto L_0x0024
        L_0x0424:
            X.8nY r4 = X.C86104wH.A0H(r12, r11)
            java.lang.Object r3 = r0.A02
            X.8nO r3 = (X.C147098nO) r3
            java.lang.Object r2 = r0.A03
            X.8d5 r2 = (X.AnonymousClass8d5) r2
            java.lang.Object r1 = r0.A01
            X.0YP r1 = (X.AnonymousClass0YP) r1
            int r0 = r0.A00
            int r0 = X.C115796vv.A00(r0)
            X.AnonymousClass7DE.A00(r4, r3, r2, r1, r0)
            goto L_0x0024
        L_0x043f:
            X.8nY r12 = (X.C147188nY) r12
            int r1 = X.AnonymousClass0wJ.A04(r11)
            r2 = r1 & 11
            r1 = 2
            if (r2 != r1) goto L_0x0450
            boolean r1 = r12.BCM()
            if (r1 != 0) goto L_0x0596
        L_0x0450:
            java.lang.Object r3 = r0.A02
            androidx.compose.ui.platform.AndroidComposeView r3 = (androidx.compose.ui.platform.AndroidComposeView) r3
            java.lang.Object r2 = r0.A03
            X.7YY r2 = (X.AnonymousClass7YY) r2
            java.lang.Object r1 = r0.A01
            X.0YP r1 = (X.AnonymousClass0YP) r1
            int r0 = r0.A00
            int r0 = r0 << 3
            r0 = r0 & 896(0x380, float:1.256E-42)
            r0 = r0 | 72
            X.AnonymousClass7DE.A00(r12, r3, r2, r1, r0)
            goto L_0x0024
        L_0x0469:
            X.8nY r4 = X.C86104wH.A0H(r12, r11)
            java.lang.Object r3 = r0.A03
            X.7WZ r3 = (X.AnonymousClass7WZ) r3
            java.lang.Object r2 = r0.A02
            java.lang.Object r1 = r0.A01
            X.0YP r1 = (X.AnonymousClass0YP) r1
            int r0 = r0.A00
            int r0 = X.C115796vv.A00(r0)
            r3.A4s(r4, r2, r1, r0)
            goto L_0x0024
        L_0x0482:
            X.8nY r4 = X.C86104wH.A0H(r12, r11)
            r1 = 0
            X.C04220Ms.A0B(r4, r1)
            java.lang.Object r3 = r0.A03
            X.7WY r3 = (X.AnonymousClass7WY) r3
            java.lang.Object r2 = r0.A01
            java.lang.Object r1 = r0.A02
            int r0 = r0.A00
            r0 = r0 | 1
            r3.A05(r4, r2, r1, r0)
            goto L_0x0024
        L_0x049b:
            X.8nY r12 = (X.C147188nY) r12
            int r1 = X.AnonymousClass0wJ.A04(r11)
            r2 = r1 & 11
            r1 = 2
            if (r2 != r1) goto L_0x04ac
            boolean r1 = r12.BCM()
            if (r1 != 0) goto L_0x0596
        L_0x04ac:
            X.7Wm r1 = androidx.compose.ui.Modifier.A00
            r3 = 0
            androidx.compose.ui.Modifier r2 = androidx.compose.ui.Modifier.A04(r1)
            java.lang.Object r9 = r0.A03
            java.lang.Object r7 = r0.A01
            java.lang.Object r8 = r0.A02
            int r5 = r0.A00
            r0 = 1618982084(0x607fb4c4, float:7.370227E19)
            boolean r0 = X.C147188nY.A10(r12, r9, r7, r0)
            boolean r0 = X.C147188nY.A12(r12, r8, r0)
            r1 = r12
            X.7W3 r1 = (X.AnonymousClass7W3) r1
            java.lang.Object r4 = r1.A13()
            if (r0 != 0) goto L_0x04d3
            java.lang.Object r0 = X.AnonymousClass7GN.A00
            if (r4 != r0) goto L_0x04dc
        L_0x04d3:
            r6 = 5
            kotlin.jvm.internal.KtLambdaShape18S0301000_I2 r4 = new kotlin.jvm.internal.KtLambdaShape18S0301000_I2
            r4.<init>(r5, r6, r7, r8, r9)
            r1.A14(r4)
        L_0x04dc:
            X.AnonymousClass7W3.A0w(r1, r3)
            X.0YP r4 = (X.AnonymousClass0YP) r4
            r0 = 6
            X.C115906w6.A01(r12, r2, r4, r0, r3)
            goto L_0x0024
        L_0x04e7:
            X.8nY r12 = (X.C147188nY) r12
            int r1 = X.AnonymousClass0wJ.A04(r11)
            r2 = r1 & 11
            r1 = 2
            if (r2 != r1) goto L_0x04f8
            boolean r1 = r12.BCM()
            if (r1 != 0) goto L_0x0596
        L_0x04f8:
            java.lang.Object r5 = r0.A03
            androidx.compose.ui.Modifier r5 = (androidx.compose.ui.Modifier) r5
            java.lang.Object r7 = r0.A02
            X.7F8 r7 = (X.AnonymousClass7F8) r7
            X.7Wm r1 = androidx.compose.ui.Modifier.A00
            r2 = 46
            kotlin.jvm.internal.KtLambdaShape20S0100000_I2 r6 = X.C86154wM.A12(r7, r2)
            r3 = r1
            X.8pE r2 = r7.A0E
            boolean r2 = X.C86104wH.A1X(r2)
            if (r2 == 0) goto L_0x051e
            kotlin.Unit r4 = kotlin.Unit.A00
            r3 = 0
            r2 = 16
            kotlin.coroutines.jvm.internal.KtSLambdaShape8S0301000_I2 r2 = X.C86164wN.A0p(r7, r6, r3, r2)
            androidx.compose.ui.Modifier r3 = X.AnonymousClass7CA.A01(r1, r4, r2)
        L_0x051e:
            r2 = 34
            kotlin.jvm.internal.KtLambdaShape146S0100000_I2_1 r2 = X.C86154wM.A0z(r7, r2)
            androidx.compose.ui.Modifier r4 = X.C98246Et.A00(r3, r2)
            X.77X r3 = r7.A00
            X.AnonymousClass0wJ.A1N(r4, r3)
            androidx.compose.ui.focus.FocusRequesterElement r2 = new androidx.compose.ui.focus.FocusRequesterElement
            r2.<init>(r3)
            androidx.compose.ui.Modifier r4 = r4.Cx6(r2)
            r2 = 35
            kotlin.jvm.internal.KtLambdaShape146S0100000_I2_1 r3 = X.C86154wM.A0z(r7, r2)
            X.AnonymousClass0wJ.A1N(r4, r3)
            androidx.compose.ui.focus.FocusChangedElement r2 = new androidx.compose.ui.focus.FocusChangedElement
            r2.<init>(r3)
            androidx.compose.ui.Modifier r4 = r4.Cx6(r2)
            r3 = 0
            r2 = 1
            androidx.compose.ui.Modifier r4 = X.AnonymousClass72L.A00(r3, r4, r2)
            r2 = 36
            kotlin.jvm.internal.KtLambdaShape146S0100000_I2_1 r3 = X.C86154wM.A0z(r7, r2)
            r6 = 0
            X.C04220Ms.A0B(r4, r6)
            androidx.compose.ui.input.key.OnKeyEventElement r2 = new androidx.compose.ui.input.key.OnKeyEventElement
            r2.<init>(r3)
            androidx.compose.ui.Modifier r4 = r4.Cx6(r2)
            X.8pE r2 = r7.A0C
            java.lang.Object r2 = r2.getValue()
            if (r2 == 0) goto L_0x0575
            r2 = 9
            kotlin.jvm.internal.KtLambdaShape171S0100000_I2 r3 = X.C86164wN.A0w(r7, r2)
            X.0YY r2 = androidx.compose.ui.platform.InspectableValueKt.A00
            androidx.compose.ui.Modifier r1 = X.C120417Am.A02(r1, r2, r3)
        L_0x0575:
            androidx.compose.ui.Modifier r1 = r4.Cx6(r1)
            androidx.compose.ui.Modifier r5 = r5.Cx6(r1)
            r4 = 1375295262(0x51f9571e, float:1.33863555E11)
            java.lang.Object r3 = r0.A01
            int r2 = r0.A00
            r1 = 14
            kotlin.jvm.internal.KtLambdaShape27S0201000_I2 r0 = new kotlin.jvm.internal.KtLambdaShape27S0201000_I2
            r0.<init>(r2, r1, r7, r3)
            X.8sI r1 = X.AnonymousClass7JR.A00(r12, r0, r4)
            r0 = 48
            X.AnonymousClass6E9.A00(r12, r5, r1, r0, r6)
            goto L_0x0024
        L_0x0596:
            r12.CuJ()
            goto L_0x0024
        L_0x059b:
            X.8nY r4 = X.C86104wH.A0H(r12, r11)
            java.lang.Object r3 = r0.A03
            androidx.compose.ui.Modifier r3 = (androidx.compose.ui.Modifier) r3
            java.lang.Object r2 = r0.A02
            X.7Ii r2 = (X.C121827Ii) r2
            java.lang.Object r1 = r0.A01
            X.0YP r1 = (X.AnonymousClass0YP) r1
            int r0 = r0.A00
            int r0 = X.C115796vv.A00(r0)
            X.AnonymousClass7JQ.A06(r2, r4, r3, r1, r0)
            goto L_0x0024
        L_0x05b6:
            X.8nY r4 = X.C86104wH.A0H(r12, r11)
            java.lang.Object r3 = r0.A03
            X.7Wb r3 = (X.AnonymousClass7Wb) r3
            java.lang.Object r2 = r0.A02
            java.lang.Object r1 = r0.A01
            X.0YP r1 = (X.AnonymousClass0YP) r1
            int r0 = r0.A00
            int r0 = X.C115796vv.A00(r0)
            r3.A4s(r4, r2, r1, r0)
            goto L_0x0024
        L_0x05cf:
            X.8nY r4 = X.C86104wH.A0H(r12, r11)
            java.lang.Object r3 = r0.A02
            X.6o6 r3 = (X.C111656o6) r3
            java.lang.Object r2 = r0.A01
            X.6rp r2 = (X.C113626rp) r2
            java.lang.Object r1 = r0.A03
            X.76a r1 = (X.C1195976a) r1
            int r0 = r0.A00
            int r0 = X.C115796vv.A00(r0)
            X.C98016Dv.A00(r2, r3, r4, r1, r0)
            goto L_0x0024
        L_0x05ea:
            X.8nY r4 = X.C86104wH.A0H(r12, r11)
            java.lang.Object r3 = r0.A02
            X.8p3 r3 = (X.C147258p3) r3
            java.lang.Object r2 = r0.A03
            X.8pE r2 = (X.C147368pE) r2
            java.lang.Object r1 = r0.A01
            java.util.Map r1 = (java.util.Map) r1
            int r0 = r0.A00
            int r0 = X.C115796vv.A00(r0)
            X.AnonymousClass7HZ.A04(r3, r4, r2, r1, r0)
            goto L_0x0024
        L_0x0605:
            android.widget.FrameLayout r12 = (android.widget.FrameLayout) r12
            boolean r13 = X.AnonymousClass0wJ.A1X(r11)
            java.lang.Object r3 = r0.A02
            X.97l r3 = (X.AnonymousClass97l) r3
            if (r3 == 0) goto L_0x0626
            java.lang.Object r2 = r0.A03
            X.C00 r2 = (X.C00) r2
            int r1 = r0.A00
            java.lang.Object r0 = r0.A01
            X.8lO r0 = (X.C145958lO) r0
            X.7RM r7 = new X.7RM
            r8 = r12
            r9 = r3
            r10 = r2
            r11 = r0
            r12 = r1
            r7.<init>(r8, r9, r10, r11, r12, r13)
            return r7
        L_0x0626:
            r7 = 0
            return r7
        L_0x0628:
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Integer r11 = (java.lang.Integer) r11
            r1 = 0
            X.C04220Ms.A0B(r12, r1)
            java.lang.Object r8 = r0.A01
            android.content.Context r8 = (android.content.Context) r8
            java.lang.Object r9 = r0.A02
            X.9b1 r9 = (X.C159859b1) r9
            int r13 = r0.A00
            java.lang.Object r10 = r0.A03
            com.instagram.service.session.UserSession r10 = (com.instagram.service.session.UserSession) r10
            X.F1n r7 = new X.F1n
            r7.<init>(r8, r9, r10, r11, r12, r13)
            return r7
        L_0x0644:
            X.8pc r12 = (X.C147608pc) r12
            androidx.compose.ui.unit.Constraints r11 = (androidx.compose.ui.unit.Constraints) r11
            long r1 = r11.A00
            r3 = 0
            X.C04220Ms.A0B(r12, r3)
            int r6 = androidx.compose.ui.unit.Constraints.A02(r1)
            X.67S r4 = X.AnonymousClass67S.Tabs
            java.lang.Object r3 = r0.A03
            X.0YP r3 = (X.AnonymousClass0YP) r3
            java.util.List r11 = r12.CwO(r4, r3)
            int r9 = r11.size()
            X.0MZ r7 = new X.0MZ
            r7.<init>()
            if (r9 <= 0) goto L_0x066b
            int r3 = r6 / r9
            r7.A00 = r3
        L_0x066b:
            java.util.Iterator r10 = r11.iterator()
            r8 = 0
            r5 = 0
        L_0x0671:
            boolean r3 = r10.hasNext()
            if (r3 == 0) goto L_0x0688
            java.lang.Object r4 = r10.next()
            X.8nT r4 = (X.C147148nT) r4
            int r3 = r7.A00
            int r3 = r4.Bf8(r3)
            int r5 = java.lang.Math.max(r3, r5)
            goto L_0x0671
        L_0x0688:
            java.util.ArrayList r13 = X.AnonymousClass0wJ.A0w(r11)
            java.util.Iterator r11 = r11.iterator()
        L_0x0690:
            boolean r3 = r11.hasNext()
            if (r3 == 0) goto L_0x06aa
            java.lang.Object r10 = r11.next()
            X.8pZ r10 = (X.C147578pZ) r10
            int r3 = r7.A00
            long r3 = androidx.compose.ui.unit.Constraints.A05(r3, r3, r5, r5)
            X.7Xy r3 = r10.Bg4(r3)
            r13.add(r3)
            goto L_0x0690
        L_0x06aa:
            java.util.ArrayList r14 = X.C18240wQ.A0k(r9)
        L_0x06ae:
            if (r8 >= r9) goto L_0x06c9
            int r3 = r7.A00
            float r10 = r12.CxE(r3)
            float r3 = (float) r8
            float r10 = r10 * r3
            int r3 = r7.A00
            float r4 = r12.CxE(r3)
            X.6tu r3 = new X.6tu
            r3.<init>(r10, r4)
            r14.add(r3)
            int r8 = r8 + 1
            goto L_0x06ae
        L_0x06c9:
            java.lang.Object r15 = r0.A01
            X.0YP r15 = (X.AnonymousClass0YP) r15
            java.lang.Object r3 = r0.A02
            X.0YM r3 = (X.AnonymousClass0YM) r3
            int r0 = r0.A00
            X.8Ju r11 = new X.8Ju
            r16 = r3
            r17 = r7
            r18 = r5
            r19 = r0
            r20 = r6
            r21 = r1
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            goto L_0x0798
        L_0x06e6:
            X.8pc r12 = (X.C147608pc) r12
            androidx.compose.ui.unit.Constraints r11 = (androidx.compose.ui.unit.Constraints) r11
            long r3 = r11.A00
            r1 = 0
            X.C04220Ms.A0B(r12, r1)
            int r6 = androidx.compose.ui.unit.Constraints.A02(r3)
            X.67B r2 = X.AnonymousClass67B.Tabs
            java.lang.Object r1 = r0.A03
            X.0YP r1 = (X.AnonymousClass0YP) r1
            java.util.List r1 = r12.CwO(r2, r1)
            int r8 = r1.size()
            int r7 = r6 / r8
            java.util.ArrayList r13 = X.AnonymousClass0wJ.A0w(r1)
            java.util.Iterator r9 = r1.iterator()
        L_0x070c:
            boolean r1 = r9.hasNext()
            if (r1 == 0) goto L_0x072c
            java.lang.Object r5 = r9.next()
            X.8pZ r5 = (X.C147578pZ) r5
            int r2 = androidx.compose.ui.unit.Constraints.A03(r3)
            int r1 = androidx.compose.ui.unit.Constraints.A01(r3)
            long r1 = androidx.compose.ui.unit.Constraints.A05(r7, r7, r2, r1)
            X.7Xy r1 = r5.Bg4(r1)
            r13.add(r1)
            goto L_0x070c
        L_0x072c:
            java.util.Iterator r10 = r13.iterator()
            boolean r1 = r10.hasNext()
            r9 = 0
            if (r1 == 0) goto L_0x0759
            java.lang.Object r9 = r10.next()
            boolean r1 = r10.hasNext()
            if (r1 == 0) goto L_0x0759
            r1 = r9
            X.7Xy r1 = (X.C123657Xy) r1
            int r5 = r1.A00
        L_0x0746:
            java.lang.Object r2 = r10.next()
            r1 = r2
            X.7Xy r1 = (X.C123657Xy) r1
            int r1 = r1.A00
            if (r5 >= r1) goto L_0x0753
            r9 = r2
            r5 = r1
        L_0x0753:
            boolean r1 = r10.hasNext()
            if (r1 != 0) goto L_0x0746
        L_0x0759:
            X.7Xy r9 = (X.C123657Xy) r9
            r10 = 0
            if (r9 == 0) goto L_0x077b
            int r5 = r9.A00
        L_0x0760:
            java.util.ArrayList r14 = X.C18240wQ.A0k(r8)
        L_0x0764:
            if (r10 >= r8) goto L_0x077d
            float r9 = r12.CxE(r7)
            float r1 = (float) r10
            float r9 = r9 * r1
            float r2 = r12.CxE(r7)
            X.6tQ r1 = new X.6tQ
            r1.<init>(r9, r2)
            r14.add(r1)
            int r10 = r10 + 1
            goto L_0x0764
        L_0x077b:
            r5 = 0
            goto L_0x0760
        L_0x077d:
            java.lang.Object r15 = r0.A01
            X.0YP r15 = (X.AnonymousClass0YP) r15
            java.lang.Object r1 = r0.A02
            X.0YM r1 = (X.AnonymousClass0YM) r1
            int r0 = r0.A00
            X.8Jt r11 = new X.8Jt
            r16 = r1
            r17 = r7
            r18 = r5
            r19 = r0
            r20 = r6
            r21 = r3
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
        L_0x0798:
            X.8ld r7 = X.C147618pd.A00(r12, r11, r6, r5)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.KtLambdaShape18S0301000_I2.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
