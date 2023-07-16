package kotlin.jvm.internal;

import X.AnonymousClass0YM;
import X.C02220Ah;

public class IDxLambdaShape13S0210000_2_I2 extends C02220Ah implements AnonymousClass0YM {
    public Object A00;
    public Object A01;
    public boolean A02;
    public final int A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IDxLambdaShape13S0210000_2_I2(int i, Object obj, Object obj2, boolean z) {
        super(3);
        this.A03 = i;
        this.A01 = obj2;
        this.A02 = z;
        this.A00 = obj;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: X.8nY} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: X.7W3} */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00e9, code lost:
        if (X.C18240wQ.A00(r5.A02.getValue()) == com.facebook.react.uimanager.BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) goto L_0x00eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0064, code lost:
        if (r2 == false) goto L_0x0066;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r16, java.lang.Object r17, java.lang.Object r18) {
        /*
            r15 = this;
            int r0 = r15.A03
            r2 = r17
            r1 = r18
            switch(r0) {
                case 0: goto L_0x000b;
                case 1: goto L_0x0041;
                case 2: goto L_0x00fb;
                default: goto L_0x0009;
            }
        L_0x0009:
            r2 = 0
            return r2
        L_0x000b:
            X.8nY r1 = X.C86104wH.A0H(r2, r1)
            r0 = -756081143(0xffffffffd2ef1e09, float:-5.13500545E11)
            X.7Wm r4 = androidx.compose.ui.Modifier.A02(r1, r0)
            X.534 r0 = X.AnonymousClass6WN.A00
            java.lang.Object r2 = r1.AEA(r0)
            X.8fO r2 = (X.C142668fO) r2
            X.7W3 r0 = X.C147188nY.A0Y(r1)
            java.lang.Object r1 = r0.A13()
            java.lang.Object r3 = X.AnonymousClass7GN.A01(r0, r1)
            r1 = 0
            X.AnonymousClass7W3.A0w(r0, r1)
            X.8p3 r3 = (X.C147258p3) r3
            boolean r8 = r15.A02
            r6 = 0
            java.lang.Object r5 = r15.A01
            X.799 r5 = (X.AnonymousClass799) r5
            java.lang.Object r7 = r15.A00
            X.0ZU r7 = (X.AnonymousClass0ZU) r7
            androidx.compose.ui.Modifier r2 = X.AnonymousClass7HZ.A00(r2, r3, r4, r5, r6, r7, r8)
            goto L_0x017a
        L_0x0041:
            X.8nY r8 = X.C86104wH.A0H(r2, r1)
            r0 = 805428266(0x3001dc2a, float:4.72428E-10)
            r8.Cvb(r0)
            java.lang.Object r1 = X.C147188nY.A0n(r8)
            X.69J r0 = X.AnonymousClass69J.Rtl
            boolean r2 = X.C18180wK.A1Z(r1, r0)
            java.lang.Object r5 = r15.A01
            X.7EJ r5 = (X.AnonymousClass7EJ) r5
            X.8pE r7 = r5.A04
            java.lang.Object r1 = r7.getValue()
            X.66l r0 = X.C967266l.Vertical
            if (r1 == r0) goto L_0x0066
            r12 = 0
            if (r2 != 0) goto L_0x0067
        L_0x0066:
            r12 = 1
        L_0x0067:
            boolean r1 = X.C147188nY.A0y(r8, r5)
            r0 = r8
            X.7W3 r0 = (X.AnonymousClass7W3) r0
            java.lang.Object r3 = r0.A13()
            if (r1 != 0) goto L_0x0078
            java.lang.Object r1 = X.AnonymousClass7GN.A00
            if (r3 != r1) goto L_0x0081
        L_0x0078:
            r1 = 24
            kotlin.jvm.internal.KtLambdaShape146S0100000_I2_1 r3 = X.C86154wM.A0z(r5, r1)
            r0.A14(r3)
        L_0x0081:
            r1 = 0
            X.AnonymousClass7W3.A0w(r0, r1)
            X.C04220Ms.A0B(r3, r1)
            r2 = -180460798(0xfffffffff53e6302, float:-2.4134388E32)
            r8.Cvb(r2)
            X.4oM r6 = X.C115806vw.A01(r8, r3)
            r2 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            java.lang.Object r4 = X.C147188nY.A0r(r8, r0, r2)
            java.lang.Object r3 = X.AnonymousClass7GN.A00
            if (r4 != r3) goto L_0x00ab
            r2 = 31
            kotlin.jvm.internal.KtLambdaShape145S0100000_I2 r2 = X.C86144wL.A16(r6, r2)
            X.7Ua r4 = new X.7Ua
            r4.<init>(r2)
            r0.A14(r4)
        L_0x00ab:
            X.AnonymousClass7W3.A0w(r0, r1)
            X.8lv r4 = (X.C146258lv) r4
            X.AnonymousClass7W3.A0w(r0, r1)
            r2 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            boolean r2 = X.C147188nY.A10(r8, r4, r5, r2)
            java.lang.Object r8 = r0.A13()
            if (r2 != 0) goto L_0x00c2
            if (r8 != r3) goto L_0x00ca
        L_0x00c2:
            X.7UZ r8 = new X.7UZ
            r8.<init>(r4, r5)
            r0.A14(r8)
        L_0x00ca:
            X.AnonymousClass7W3.A0w(r0, r1)
            X.7UZ r8 = (X.AnonymousClass7UZ) r8
            X.7Wm r10 = androidx.compose.ui.Modifier.A00
            java.lang.Object r7 = r7.getValue()
            X.66l r7 = (X.C967266l) r7
            boolean r2 = r15.A02
            if (r2 == 0) goto L_0x00eb
            X.8pE r2 = r5.A02
            java.lang.Object r2 = r2.getValue()
            float r3 = X.C18240wQ.A00(r2)
            r2 = 0
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            r11 = 1
            if (r2 != 0) goto L_0x00ec
        L_0x00eb:
            r11 = 0
        L_0x00ec:
            r5 = 0
            java.lang.Object r9 = r15.A00
            X.8p3 r9 = (X.C147258p3) r9
            X.AnonymousClass0wJ.A1O(r8, r7)
            r6 = r5
            androidx.compose.ui.Modifier r2 = androidx.compose.foundation.gestures.ScrollableKt.A00(r5, r6, r7, r8, r9, r10, r11, r12)
            goto L_0x017a
        L_0x00fb:
            X.8nY r7 = X.C86104wH.A0H(r2, r1)
            r0 = 775464325(0x2e38a585, float:4.1983767E-11)
            X.7W3 r0 = X.C147188nY.A0Z(r7, r0)
            java.lang.Object r1 = r0.A13()
            java.lang.Object r5 = X.AnonymousClass7GN.A00
            java.lang.Object r9 = X.C86144wL.A0f(r0, r1, r5)
            X.8p3 r9 = (X.C147258p3) r9
            java.lang.Object r4 = r15.A00
            r1 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            boolean r1 = X.C147188nY.A10(r7, r9, r4, r1)
            java.lang.Object r3 = r0.A13()
            if (r1 != 0) goto L_0x0123
            if (r3 != r5) goto L_0x012d
        L_0x0123:
            r2 = 0
            r1 = 3
            kotlin.coroutines.jvm.internal.KtSLambdaShape18S0201000_I2_4 r3 = new kotlin.coroutines.jvm.internal.KtSLambdaShape18S0201000_I2_4
            r3.<init>(r9, r4, r2, r1)
            r0.A14(r3)
        L_0x012d:
            r1 = 0
            X.AnonymousClass7W3.A0b(r7, r0, r3, r9, r1)
            X.7Wm r8 = androidx.compose.ui.Modifier.A00
            r6 = 1157296644(0x44faf204, float:2007.563)
            boolean r2 = X.C147188nY.A0z(r7, r4, r6)
            java.lang.Object r3 = r0.A13()
            if (r2 != 0) goto L_0x0142
            if (r3 != r5) goto L_0x014c
        L_0x0142:
            r2 = 29
            kotlin.jvm.internal.KtLambdaShape156S0100000_I2_11 r3 = new kotlin.jvm.internal.KtLambdaShape156S0100000_I2_11
            r3.<init>(r4, r2)
            r0.A14(r3)
        L_0x014c:
            X.0YY r2 = X.AnonymousClass7W3.A0B(r0, r3, r1)
            androidx.compose.ui.Modifier r10 = X.C115876w3.A01(r8, r2)
            r8 = 0
            boolean r14 = r15.A02
            java.lang.Object r11 = r15.A01
            X.799 r11 = (X.AnonymousClass799) r11
            boolean r2 = X.C147188nY.A0z(r7, r4, r6)
            java.lang.Object r3 = r0.A13()
            if (r2 != 0) goto L_0x0167
            if (r3 != r5) goto L_0x0171
        L_0x0167:
            r2 = 10
            kotlin.jvm.internal.IDxRImplShape182S0000000_2_I2 r3 = new kotlin.jvm.internal.IDxRImplShape182S0000000_2_I2
            r3.<init>(r4, r2)
            r0.A14(r3)
        L_0x0171:
            X.0ZU r13 = X.AnonymousClass7W3.A08(r0, r3, r1)
            r12 = r8
            androidx.compose.ui.Modifier r2 = X.AnonymousClass7HZ.A00(r8, r9, r10, r11, r12, r13, r14)
        L_0x017a:
            X.AnonymousClass7W3.A0w(r0, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.IDxLambdaShape13S0210000_2_I2.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
