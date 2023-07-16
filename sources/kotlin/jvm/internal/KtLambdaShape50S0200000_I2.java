package kotlin.jvm.internal;

import X.AnonymousClass0YM;
import X.C02220Ah;

public class KtLambdaShape50S0200000_I2 extends C02220Ah implements AnonymousClass0YM {
    public Object A00;
    public Object A01;
    public final int A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtLambdaShape50S0200000_I2(int i, Object obj, Object obj2) {
        super(3);
        this.A02 = i;
        this.A01 = obj;
        this.A00 = obj2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v6, resolved type: X.8nY} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v20, resolved type: X.7W3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v7, resolved type: X.8nY} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v22, resolved type: X.7W3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v21, resolved type: X.8nY} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v24, resolved type: X.7W3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v18, resolved type: X.8nY} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v36, resolved type: X.7W3} */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x046b, code lost:
        X.AnonymousClass7W3.A0w(r3, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x046e, code lost:
        return r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x05ae, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x05af, code lost:
        X.C102596Vu.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x05b2, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x0658, code lost:
        X.C04220Ms.A0B(r4, r5);
        X.C04220Ms.A0B(r3, r2);
        r2 = X.C37235Jn1.A00(r3);
        r2.A0A(r9, new X.KE0((X.C39519Kv3) null, r4, r11, r3));
        r2.A06(r9, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x06d8, code lost:
        if (r2.A3s() == false) goto L_0x06a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:0x072e, code lost:
        r11.CuJ();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x0751, code lost:
        return kotlin.Unit.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00f2, code lost:
        if (r8 != null) goto L_0x00f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00f4, code lost:
        r8 = X.AnonymousClass7KU.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00f6, code lost:
        r7 = (X.AnonymousClass7W3) r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0140, code lost:
        X.AnonymousClass7W3.A0w(r7, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0143, code lost:
        return r8;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:250:0x0320 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x029b  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x02ce  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r22, java.lang.Object r23, java.lang.Object r24) {
        /*
            r21 = this;
            r0 = r21
            r10 = r24
            r11 = r23
            r9 = r22
            int r1 = r0.A02
            switch(r1) {
                case 0: goto L_0x003b;
                case 1: goto L_0x0090;
                case 2: goto L_0x00ca;
                case 3: goto L_0x010a;
                case 4: goto L_0x0144;
                case 5: goto L_0x01a9;
                case 6: goto L_0x0232;
                case 7: goto L_0x0247;
                case 8: goto L_0x0256;
                case 9: goto L_0x000d;
                case 10: goto L_0x032a;
                case 11: goto L_0x000d;
                case 12: goto L_0x0350;
                case 13: goto L_0x036f;
                case 14: goto L_0x03d7;
                case 15: goto L_0x0417;
                case 16: goto L_0x046f;
                case 17: goto L_0x04b9;
                case 18: goto L_0x04e7;
                case 19: goto L_0x052e;
                case 20: goto L_0x0564;
                case 21: goto L_0x05b3;
                case 22: goto L_0x05cf;
                case 23: goto L_0x05f3;
                case 24: goto L_0x060f;
                case 25: goto L_0x0627;
                case 26: goto L_0x063f;
                case 27: goto L_0x0670;
                case 28: goto L_0x06e0;
                case 29: goto L_0x070c;
                case 30: goto L_0x0732;
                case 31: goto L_0x0754;
                case 32: goto L_0x07de;
                default: goto L_0x000d;
            }
        L_0x000d:
            X.8mL r9 = (X.C146498mL) r9
            X.AnonymousClass0wJ.A1N(r9, r11)
            r1 = 2
            X.C04220Ms.A0B(r10, r1)
            java.lang.Object r1 = r0.A00
            X.0MZ r1 = (X.AnonymousClass0MZ) r1
            int r2 = r1.A00
            if (r2 <= 0) goto L_0x0024
            X.7W2 r1 = new X.7W2
            r1.<init>(r9, r2)
            r9 = r1
        L_0x0024:
            java.lang.Object r3 = r0.A01
            java.util.List r3 = (java.util.List) r3
            r2 = 0
            int r1 = r3.size()
        L_0x002d:
            if (r2 >= r1) goto L_0x074f
            java.lang.Object r0 = r3.get(r2)
            X.0YM r0 = (X.AnonymousClass0YM) r0
            r0.invoke(r9, r11, r10)
            int r2 = r2 + 1
            goto L_0x002d
        L_0x003b:
            androidx.compose.ui.Modifier r9 = (androidx.compose.ui.Modifier) r9
            X.8nY r2 = X.C86104wH.A0H(r11, r10)
            r6 = 0
            X.C04220Ms.A0B(r9, r6)
            r1 = -843180607(0xffffffffcdbe15c1, float:-3.98637088E8)
            r2.Cvb(r1)
            r1 = 773894976(0x2e20b340, float:3.6538994E-11)
            r2.Cvb(r1)
            X.7W3 r7 = X.C147188nY.A0Y(r2)
            java.lang.Object r1 = r7.A13()
            java.lang.Object r5 = X.AnonymousClass7GN.A00
            java.lang.Object r1 = X.C86104wH.A0b(r2, r7, r1, r5, r1)
            X.4qz r4 = X.AnonymousClass7WN.A00(r7, r1)
            java.lang.Object r3 = r0.A00
            X.8fL r3 = (X.C142638fL) r3
            boolean r2 = X.C147188nY.A0y(r2, r4)
            java.lang.Object r1 = r7.A13()
            if (r2 != 0) goto L_0x0073
            if (r1 != r5) goto L_0x007b
        L_0x0073:
            androidx.compose.animation.SizeAnimationModifier r1 = new androidx.compose.animation.SizeAnimationModifier
            r1.<init>(r3, r4)
            r7.A14(r1)
        L_0x007b:
            X.AnonymousClass7W3.A0w(r7, r6)
            androidx.compose.animation.SizeAnimationModifier r1 = (androidx.compose.animation.SizeAnimationModifier) r1
            java.lang.Object r0 = r0.A01
            X.0YP r0 = (X.AnonymousClass0YP) r0
            r1.A00 = r0
            androidx.compose.ui.Modifier r0 = X.C115826vy.A00(r9)
            androidx.compose.ui.Modifier r8 = r0.Cx6(r1)
            goto L_0x0140
        L_0x0090:
            X.8ku r9 = (X.C145678ku) r9
            X.8nY r7 = X.C86104wH.A0H(r11, r10)
            r6 = 0
            X.C04220Ms.A0B(r9, r6)
            r1 = -57153604(0xfffffffffc97e7bc, float:-6.3098957E36)
            r7.Cvb(r1)
            X.677 r1 = X.AnonymousClass677.PreEnter
            X.677 r2 = X.AnonymousClass677.Visible
            boolean r1 = r9.BZF(r1, r2)
            if (r1 == 0) goto L_0x00b9
            java.lang.Object r0 = r0.A00
            X.79w r0 = (X.C1203679w) r0
            X.52U r0 = (X.AnonymousClass52U) r0
            X.79e r0 = r0.A00
        L_0x00b2:
            X.6se r0 = r0.A01
            if (r0 == 0) goto L_0x00f4
            X.8oz r8 = r0.A00
            goto L_0x00f2
        L_0x00b9:
            X.677 r1 = X.AnonymousClass677.PostExit
            boolean r1 = r9.BZF(r2, r1)
            if (r1 == 0) goto L_0x00f4
            java.lang.Object r0 = r0.A01
            X.79x r0 = (X.C1203779x) r0
            X.52V r0 = (X.AnonymousClass52V) r0
            X.79e r0 = r0.A00
            goto L_0x00b2
        L_0x00ca:
            X.8ku r9 = (X.C145678ku) r9
            X.8nY r7 = X.C86104wH.A0H(r11, r10)
            r6 = 0
            X.C04220Ms.A0B(r9, r6)
            r1 = -53984035(0xfffffffffcc844dd, float:-8.3188487E36)
            r7.Cvb(r1)
            X.677 r1 = X.AnonymousClass677.PreEnter
            X.677 r2 = X.AnonymousClass677.Visible
            boolean r1 = r9.BZF(r1, r2)
            if (r1 == 0) goto L_0x00f9
            java.lang.Object r0 = r0.A00
            X.79w r0 = (X.C1203679w) r0
            X.52U r0 = (X.AnonymousClass52U) r0
            X.79e r0 = r0.A00
        L_0x00ec:
            X.6u1 r0 = r0.A02
            if (r0 == 0) goto L_0x00f4
            X.8oz r8 = r0.A02
        L_0x00f2:
            if (r8 != 0) goto L_0x00f6
        L_0x00f4:
            X.7Tu r8 = X.AnonymousClass7KU.A00
        L_0x00f6:
            X.7W3 r7 = (X.AnonymousClass7W3) r7
            goto L_0x0140
        L_0x00f9:
            X.677 r1 = X.AnonymousClass677.PostExit
            boolean r1 = r9.BZF(r2, r1)
            if (r1 == 0) goto L_0x00f4
            java.lang.Object r0 = r0.A01
            X.79x r0 = (X.C1203779x) r0
            X.52V r0 = (X.AnonymousClass52V) r0
            X.79e r0 = r0.A00
            goto L_0x00ec
        L_0x010a:
            X.8nY r7 = X.C86104wH.A0H(r11, r10)
            r1 = -353972293(0xffffffffeae6cfbb, float:-1.3951696E26)
            r7.Cvb(r1)
            java.lang.Object r1 = r0.A00
            X.8fO r1 = (X.C142668fO) r1
            if (r1 != 0) goto L_0x011c
            X.7UB r1 = X.AnonymousClass7UB.A00
        L_0x011c:
            java.lang.Object r0 = r0.A01
            X.8fV r0 = (X.C142738fV) r0
            r6 = 0
            X.8fP r1 = r1.CbD(r0, r7, r6)
            boolean r0 = X.C147188nY.A0y(r7, r1)
            X.7W3 r7 = (X.AnonymousClass7W3) r7
            java.lang.Object r8 = r7.A13()
            if (r0 != 0) goto L_0x0135
            java.lang.Object r0 = X.AnonymousClass7GN.A00
            if (r8 != r0) goto L_0x013d
        L_0x0135:
            X.7Wt r8 = new X.7Wt
            r8.<init>(r1)
            r7.A14(r8)
        L_0x013d:
            X.AnonymousClass7W3.A0w(r7, r6)
        L_0x0140:
            X.AnonymousClass7W3.A0w(r7, r6)
            return r8
        L_0x0144:
            X.8nY r5 = X.C86104wH.A0H(r11, r10)
            r1 = -102778667(0xfffffffff9dfb8d5, float:-1.4520388E35)
            r5.Cvb(r1)
            int r6 = X.C147188nY.A00(r5)
            r3 = r5
            X.7W3 r3 = (X.AnonymousClass7W3) r3
            java.lang.Object r1 = r3.A13()
            java.lang.Object r4 = X.AnonymousClass7GN.A00
            java.lang.Object r1 = X.C86104wH.A0b(r5, r3, r1, r4, r1)
            r2 = 0
            X.4qz r9 = X.AnonymousClass7WN.A01(r3, r1)
            java.lang.Object r7 = X.C147188nY.A0r(r5, r3, r6)
            if (r7 != r4) goto L_0x016f
            r1 = 0
            androidx.compose.runtime.ParcelableSnapshotMutableState r7 = X.AnonymousClass7WR.A00(r3, r1)
        L_0x016f:
            X.AnonymousClass7W3.A0w(r3, r2)
            X.8pE r7 = (X.C147368pE) r7
            java.lang.Object r1 = r0.A01
            X.4oM r8 = X.C115806vw.A01(r5, r1)
            java.lang.Object r6 = r0.A00
            X.8p3 r6 = (X.C147258p3) r6
            r0 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            boolean r0 = X.C147188nY.A10(r5, r7, r6, r0)
            java.lang.Object r1 = r3.A13()
            if (r0 != 0) goto L_0x018d
            if (r1 != r4) goto L_0x0197
        L_0x018d:
            r0 = 41
            kotlin.jvm.internal.KtLambdaShape39S0200000_I2 r1 = new kotlin.jvm.internal.KtLambdaShape39S0200000_I2
            r1.<init>((X.C147258p3) r6, (X.C147368pE) r7, (int) r0)
            r3.A14(r1)
        L_0x0197:
            X.AnonymousClass7W3.A0c(r5, r3, r1, r6, r2)
            X.7Wm r0 = androidx.compose.ui.Modifier.A00
            r10 = 0
            r11 = 3
            kotlin.coroutines.jvm.internal.KtSLambdaShape4S0501000_I2 r5 = new kotlin.coroutines.jvm.internal.KtSLambdaShape4S0501000_I2
            r5.<init>((java.lang.Object) r6, (java.lang.Object) r7, (java.lang.Object) r8, (java.lang.Object) r9, (X.C146958n9) r10, (int) r11)
            androidx.compose.ui.Modifier r8 = X.AnonymousClass7CA.A01(r0, r6, r5)
            goto L_0x046b
        L_0x01a9:
            X.8nY r8 = X.C86104wH.A0H(r11, r10)
            r1 = 759876635(0x2d4acc1b, float:1.1527691E-11)
            r8.Cvb(r1)
            java.lang.Object r2 = r0.A00
            X.0ZU r2 = (X.AnonymousClass0ZU) r2
            r1 = -1589795249(0xffffffffa13da64f, float:-6.42558E-19)
            r8.Cvb(r1)
            r1 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            X.7W3 r3 = X.C147188nY.A0Z(r8, r1)
            java.lang.Object r10 = r3.A13()
            java.lang.Object r7 = X.AnonymousClass7GN.A00
            if (r10 != r7) goto L_0x01d3
            X.7Wf r10 = X.C123267Wf.A01(r2)
            r3.A14(r10)
        L_0x01d3:
            r2 = 0
            X.AnonymousClass7W3.A0w(r3, r2)
            X.4oM r10 = (X.C81784oM) r10
            java.lang.Object r11 = X.C147188nY.A0r(r8, r3, r1)
            if (r11 != r7) goto L_0x01f9
            long r4 = X.C86164wN.A08(r10)
            X.7KC r9 = X.C86124wJ.A0O(r4)
            X.8cW r6 = X.C103656aV.A03
            long r4 = X.C103656aV.A00
            X.7KC r4 = X.C86124wJ.A0O(r4)
            java.lang.String r1 = "Animatable"
            X.7JH r11 = new X.7JH
            r11.<init>(r6, r9, r4, r1)
            r3.A14(r11)
        L_0x01f9:
            X.AnonymousClass7W3.A0w(r3, r2)
            X.7JH r11 = (X.AnonymousClass7JH) r11
            kotlin.Unit r6 = kotlin.Unit.A00
            r5 = 0
            r4 = 15
            kotlin.coroutines.jvm.internal.KtSLambdaShape8S0301000_I2 r1 = new kotlin.coroutines.jvm.internal.KtSLambdaShape8S0301000_I2
            r1.<init>((java.lang.Object) r11, (java.lang.Object) r10, (X.C146958n9) r5, (int) r4)
            X.AnonymousClass7K5.A05(r8, r6, r1)
            X.7WW r5 = r11.A04
            X.AnonymousClass7W3.A0w(r3, r2)
            java.lang.Object r4 = r0.A01
            X.0YY r4 = (X.AnonymousClass0YY) r4
            boolean r1 = X.C147188nY.A0y(r8, r5)
            java.lang.Object r0 = r3.A13()
            if (r1 != 0) goto L_0x0220
            if (r0 != r7) goto L_0x0229
        L_0x0220:
            r0 = 43
            kotlin.jvm.internal.KtLambdaShape20S0100000_I2 r0 = X.C86154wM.A12(r5, r0)
            r3.A14(r0)
        L_0x0229:
            X.AnonymousClass7W3.A0w(r3, r2)
            java.lang.Object r8 = r4.invoke(r0)
            goto L_0x046b
        L_0x0232:
            X.8mL r9 = (X.C146498mL) r9
            r1 = 0
            X.C04220Ms.A0B(r9, r1)
            java.lang.Object r2 = r0.A00
            X.0YP r2 = (X.AnonymousClass0YP) r2
            java.lang.Object r1 = r9.AbA()
            java.lang.Object r0 = r0.A01
            r2.invoke(r1, r0)
            goto L_0x074f
        L_0x0247:
            java.lang.Object r1 = r0.A00
            X.0YY r1 = (X.AnonymousClass0YY) r1
            java.lang.Object r0 = r0.A01
            X.7W3 r0 = (X.AnonymousClass7W3) r0
            X.8p9 r0 = r0.A0d
            r1.invoke(r0)
            goto L_0x074f
        L_0x0256:
            X.8mL r9 = (X.C146498mL) r9
            X.7Ks r11 = (X.C122137Ks) r11
            X.AnonymousClass0wJ.A1N(r9, r11)
            java.lang.Object r5 = r0.A01
            X.0MZ r5 = (X.AnonymousClass0MZ) r5
            java.lang.Object r1 = r0.A00
            X.6b8 r1 = (X.C104036b8) r1
            r0 = 0
            X.C04220Ms.A0B(r1, r0)
            int r6 = r1.A00
            if (r6 >= 0) goto L_0x0272
            int r0 = X.C122137Ks.A00(r11)
            int r6 = r6 + r0
        L_0x0272:
            int r0 = r11.A00
            r8 = 1
            boolean r0 = X.C18230wP.A1W(r0, r6)
            X.AnonymousClass7J4.A04(r0)
            X.AnonymousClass7W3.A0Z(r9, r11, r6)
            int r4 = r11.A00
            int r2 = r11.A08
        L_0x0283:
            if (r2 < 0) goto L_0x0296
            int[] r1 = r11.A0E
            int r0 = X.C122137Ks.A01(r11, r2)
            boolean r0 = X.C121627Hb.A04(r0, r1)
            if (r0 != 0) goto L_0x0296
            int r2 = X.C122137Ks.A04(r11, r1, r2)
            goto L_0x0283
        L_0x0296:
            int r3 = r2 + 1
            r7 = 0
        L_0x0299:
            if (r3 >= r4) goto L_0x02ca
            boolean r2 = r11.A0U(r4, r3)
            int[] r1 = r11.A0E
            int r0 = X.C122137Ks.A01(r11, r3)
            boolean r0 = X.C121627Hb.A04(r0, r1)
            if (r2 == 0) goto L_0x02b1
            if (r0 == 0) goto L_0x02ae
            r7 = 0
        L_0x02ae:
            int r3 = r3 + 1
            goto L_0x0299
        L_0x02b1:
            if (r0 == 0) goto L_0x02bf
            r0 = 1
        L_0x02b4:
            int r7 = r7 + r0
            int r0 = X.C122137Ks.A01(r11, r3)
            int r0 = X.C86154wM.A03(r0, r1)
            int r3 = r3 + r0
            goto L_0x0299
        L_0x02bf:
            int r0 = X.C122137Ks.A01(r11, r3)
            int r0 = r0 * 5
            int r0 = X.C86144wL.A05(r0, r1)
            goto L_0x02b4
        L_0x02ca:
            int r1 = r11.A00
            if (r1 >= r6) goto L_0x0320
            boolean r0 = r11.A0U(r6, r1)
            if (r0 == 0) goto L_0x02fb
            int r0 = r11.A01
            if (r1 >= r0) goto L_0x02f7
            int[] r3 = r11.A0E
            int r1 = X.C122137Ks.A01(r11, r1)
            boolean r0 = X.C121627Hb.A04(r1, r3)
            if (r0 == 0) goto L_0x02f7
            java.lang.Object[] r2 = r11.A0F
            int r1 = X.C122137Ks.A03(r11, r3, r1)
            int r0 = r11.A0B
            if (r1 < r0) goto L_0x02f1
            int r0 = r11.A09
            int r1 = r1 + r0
        L_0x02f1:
            r0 = r2[r1]
            r9.AIY(r0)
            r7 = 0
        L_0x02f7:
            r11.A0O()
            goto L_0x02ca
        L_0x02fb:
            int r4 = r11.A00
            int r3 = X.C122137Ks.A01(r11, r4)
            int[] r2 = r11.A0E
            int r1 = r3 * 5
            int r0 = r1 + 3
            r0 = r2[r0]
            int r4 = r4 + r0
            r11.A00 = r4
            int r0 = X.C122137Ks.A02(r11, r2, r4)
            r11.A02 = r0
            boolean r0 = X.C121627Hb.A04(r3, r2)
            if (r0 == 0) goto L_0x031b
            r0 = 1
        L_0x0319:
            int r7 = r7 + r0
            goto L_0x02ca
        L_0x031b:
            int r0 = X.C86144wL.A05(r1, r2)
            goto L_0x0319
        L_0x0320:
            if (r1 == r6) goto L_0x0323
            r8 = 0
        L_0x0323:
            X.AnonymousClass7J4.A04(r8)
            r5.A00 = r7
            goto L_0x074f
        L_0x032a:
            X.8mL r9 = (X.C146498mL) r9
            r1 = 0
            X.C04220Ms.A0B(r9, r1)
            java.lang.Object r1 = r0.A00
            X.0MZ r1 = (X.AnonymousClass0MZ) r1
            int r5 = r1.A00
            java.lang.Object r4 = r0.A01
            java.util.List r4 = (java.util.List) r4
            int r3 = r4.size()
            r2 = 0
        L_0x033f:
            if (r2 >= r3) goto L_0x074f
            java.lang.Object r1 = r4.get(r2)
            int r0 = r5 + r2
            r9.BQW(r0, r1)
            r9.BQd(r0, r1)
            int r2 = r2 + 1
            goto L_0x033f
        L_0x0350:
            X.7Ks r3 = X.C86164wN.A0G(r11)
            r3.A0J()
            java.lang.Object r2 = r0.A01
            X.7yb r2 = (X.C134927yb) r2
            java.lang.Object r1 = r0.A00
            X.6b8 r1 = (X.C104036b8) r1
            r0 = 0
            X.C04220Ms.A0B(r2, r0)
            int r0 = r2.A00(r1)
            r3.A0R(r2, r0)
            r3.A0M()
            goto L_0x074f
        L_0x036f:
            X.8nY r8 = X.C86104wH.A0H(r11, r10)
            r1 = 410346167(0x187562b7, float:3.1715346E-24)
            r8.Cvb(r1)
            int r7 = X.C147188nY.A00(r8)
            r3 = r8
            X.7W3 r3 = (X.AnonymousClass7W3) r3
            java.lang.Object r1 = r3.A13()
            java.lang.Object r6 = X.AnonymousClass7GN.A00
            java.lang.Object r1 = X.C86104wH.A0b(r8, r3, r1, r6, r1)
            r2 = 0
            X.4qz r5 = X.AnonymousClass7WN.A01(r3, r1)
            java.lang.Object r4 = r0.A01
            androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher r4 = (androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher) r4
            r1 = 100475956(0x5fd2434, float:2.3805305E-35)
            r8.Cvb(r1)
            if (r4 != 0) goto L_0x03ae
            java.lang.Object r4 = X.C147188nY.A0r(r8, r3, r7)
            if (r4 != r6) goto L_0x03a9
            androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher r4 = new androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher
            r4.<init>()
            r3.A14(r4)
        L_0x03a9:
            X.AnonymousClass7W3.A0w(r3, r2)
            androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher r4 = (androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher) r4
        L_0x03ae:
            X.AnonymousClass7W3.A0w(r3, r2)
            java.lang.Object r1 = r0.A00
            X.8lc r1 = (X.C146088lc) r1
            r0 = 1618982084(0x607fb4c4, float:7.370227E19)
            boolean r0 = X.C147188nY.A10(r8, r1, r4, r0)
            boolean r0 = X.C147188nY.A12(r8, r5, r0)
            java.lang.Object r8 = r3.A13()
            if (r0 != 0) goto L_0x03c8
            if (r8 != r6) goto L_0x03d2
        L_0x03c8:
            r4.A02 = r5
            androidx.compose.ui.input.nestedscroll.NestedScrollModifierLocal r8 = new androidx.compose.ui.input.nestedscroll.NestedScrollModifierLocal
            r8.<init>(r1, r4)
            r3.A14(r8)
        L_0x03d2:
            X.AnonymousClass7W3.A0w(r3, r2)
            goto L_0x046b
        L_0x03d7:
            X.8nY r7 = X.C86104wH.A0H(r11, r10)
            r1 = -906157935(0xffffffffc9fd2091, float:-2073618.1)
            java.lang.Object r4 = X.C147188nY.A0q(r7, r1)
            X.8nV r4 = (X.C147168nV) r4
            java.lang.Object r2 = X.C147188nY.A0m(r7)
            X.8lf r2 = (X.C146118lf) r2
            boolean r1 = X.C147188nY.A0y(r7, r4)
            r3 = r7
            X.7W3 r3 = (X.AnonymousClass7W3) r3
            java.lang.Object r8 = r3.A13()
            if (r1 != 0) goto L_0x03fb
            java.lang.Object r1 = X.AnonymousClass7GN.A00
            if (r8 != r1) goto L_0x0403
        L_0x03fb:
            X.54D r8 = new X.54D
            r8.<init>(r2, r4)
            r3.A14(r8)
        L_0x0403:
            r2 = 0
            X.AnonymousClass7W3.A0w(r3, r2)
            java.lang.Object r6 = r0.A01
            java.lang.Object r5 = r0.A00
            r4 = 0
            r1 = 23
            kotlin.coroutines.jvm.internal.KtSLambdaShape8S0301000_I2 r0 = new kotlin.coroutines.jvm.internal.KtSLambdaShape8S0301000_I2
            r0.<init>((java.lang.Object) r5, (java.lang.Object) r8, (X.C146958n9) r4, (int) r1)
            X.AnonymousClass7K5.A03(r7, r8, r6, r0)
            goto L_0x046b
        L_0x0417:
            X.8nY r7 = X.C86104wH.A0H(r11, r10)
            r1 = 664422852(0x279a49c4, float:4.2823563E-15)
            java.lang.Object r4 = X.C147188nY.A0q(r7, r1)
            X.8nV r4 = (X.C147168nV) r4
            java.lang.Object r2 = X.C147188nY.A0m(r7)
            X.8lf r2 = (X.C146118lf) r2
            boolean r1 = X.C147188nY.A0y(r7, r4)
            r3 = r7
            X.7W3 r3 = (X.AnonymousClass7W3) r3
            java.lang.Object r8 = r3.A13()
            if (r1 != 0) goto L_0x043b
            java.lang.Object r1 = X.AnonymousClass7GN.A00
            if (r8 != r1) goto L_0x0443
        L_0x043b:
            X.54D r8 = new X.54D
            r8.<init>(r2, r4)
            r3.A14(r8)
        L_0x0443:
            r2 = 0
            X.AnonymousClass7W3.A0w(r3, r2)
            java.lang.Object r4 = r0.A01
            java.lang.Object r6 = r0.A00
            r5 = 0
            r0 = 2
            java.util.ArrayList r1 = X.C18240wQ.A0k(r0)
            r1.add(r8)
            X.AnonymousClass0Lm.A00(r4, r1)
            int r0 = r1.size()
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Object[] r4 = r1.toArray(r0)
            r1 = 25
            kotlin.coroutines.jvm.internal.KtSLambdaShape8S0301000_I2 r0 = new kotlin.coroutines.jvm.internal.KtSLambdaShape8S0301000_I2
            r0.<init>((java.lang.Object) r6, (java.lang.Object) r8, (X.C146958n9) r5, (int) r1)
            X.AnonymousClass7K5.A07(r7, r0, r4)
        L_0x046b:
            X.AnonymousClass7W3.A0w(r3, r2)
            return r8
        L_0x046f:
            X.7F0 r9 = (X.AnonymousClass7F0) r9
            int r6 = X.AnonymousClass0wJ.A04(r11)
            int r7 = X.AnonymousClass0wJ.A04(r10)
            r1 = 0
            X.C04220Ms.A0B(r9, r1)
            java.lang.Object r5 = r0.A01
            android.text.Spannable r5 = (android.text.Spannable) r5
            java.lang.Object r8 = r0.A00
            X.0YC r8 = (X.AnonymousClass0YC) r8
            X.72l r4 = r9.A06
            X.7yQ r3 = r9.A09
            if (r3 != 0) goto L_0x048d
            X.7yQ r3 = X.C134817yQ.A04
        L_0x048d:
            X.6su r0 = r9.A07
            if (r0 == 0) goto L_0x04b7
            int r0 = r0.A00
        L_0x0493:
            X.6su r2 = new X.6su
            r2.<init>(r0)
            X.6sv r0 = r9.A08
            if (r0 == 0) goto L_0x04b5
            int r1 = r0.A00
        L_0x049e:
            X.6sv r0 = new X.6sv
            r0.<init>(r1)
            java.lang.Object r0 = r8.invoke(r4, r3, r2, r0)
            android.graphics.Typeface r0 = (android.graphics.Typeface) r0
            X.4zr r1 = new X.4zr
            r1.<init>(r0)
            r0 = 33
            r5.setSpan(r1, r6, r7, r0)
            goto L_0x074f
        L_0x04b5:
            r1 = 1
            goto L_0x049e
        L_0x04b7:
            r0 = 0
            goto L_0x0493
        L_0x04b9:
            X.8nY r11 = (X.C147188nY) r11
            int r1 = X.AnonymousClass0wJ.A04(r10)
            r2 = r1 & 81
            r1 = 16
            if (r2 != r1) goto L_0x04cb
            boolean r1 = r11.BCM()
            if (r1 != 0) goto L_0x072e
        L_0x04cb:
            java.lang.Object r2 = r0.A01
            X.5IJ r2 = (X.AnonymousClass5IJ) r2
            X.68K r14 = r2.A01()
            java.lang.Object r1 = r0.A00
            r0 = 38
            kotlin.jvm.internal.KtLambdaShape19S0200000_I2_3 r15 = new kotlin.jvm.internal.KtLambdaShape19S0200000_I2_3
            r15.<init>(r0, r1, r2)
            r12 = 0
            r16 = 0
            r17 = 12
            r13 = r12
            X.AnonymousClass6M7.A00(r11, r12, r13, r14, r15, r16, r17)
            goto L_0x074f
        L_0x04e7:
            X.8nY r4 = X.C86104wH.A0H(r11, r10)
            r10 = 0
            X.C04220Ms.A0B(r9, r10)
            java.lang.Object r6 = r0.A00
            X.7yH r6 = (X.C134747yH) r6
            X.7Wm r3 = androidx.compose.ui.Modifier.A00
            r1 = 4
            float r2 = (float) r1
            r8 = 0
            float r1 = (float) r10
            androidx.compose.ui.Modifier r5 = X.AnonymousClass7K4.A05(r3, r1, r2, r1, r1)
            X.7If r2 = X.AnonymousClass7J9.A03(r4)
            java.lang.Object r0 = r0.A01
            X.5HP r0 = (X.AnonymousClass5HP) r0
            long r0 = r0.A00
            long r17 = X.AnonymousClass7Hi.A00()
            r19 = 0
            r3 = 5
            X.7Ee r13 = X.C121117Ee.A01(r3)
            r14 = 245756(0x3bffc, float:3.44378E-40)
            X.7If r11 = new X.7If
            r12 = r8
            r15 = r0
            r11.<init>(r12, r13, r14, r15, r17, r19)
            X.7If r7 = r2.A01(r11)
            r12 = 1
            r13 = 12582960(0xc00030, float:1.7632483E-38)
            r14 = 376(0x178, float:5.27E-43)
            r9 = r8
            r11 = r10
            r15 = r10
            X.C115746vq.A00(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            goto L_0x074f
        L_0x052e:
            X.8nY r11 = (X.C147188nY) r11
            int r1 = X.AnonymousClass0wJ.A04(r10)
            r2 = r1 & 81
            r1 = 16
            if (r2 != r1) goto L_0x0540
            boolean r1 = r11.BCM()
            if (r1 != 0) goto L_0x072e
        L_0x0540:
            java.lang.Object r1 = r0.A00
            java.lang.Object r1 = X.C86104wH.A0f(r1)
            X.5IV r1 = (X.AnonymousClass5IV) r1
            java.lang.Integer r2 = r1.A01
            java.lang.Integer r1 = X.AnonymousClass006.A0C
            boolean r3 = X.C18180wK.A1Z(r2, r1)
            java.lang.Object r2 = r0.A01
            r0 = 35
            kotlin.jvm.internal.KtLambdaShape36S0100000_I2_16 r1 = new kotlin.jvm.internal.KtLambdaShape36S0100000_I2_16
            r1.<init>(r2, r0)
            X.7Wm r0 = androidx.compose.ui.Modifier.A00
            androidx.compose.ui.Modifier r0 = androidx.compose.ui.Modifier.A04(r0)
            X.C117686z5.A01(r11, r0, r1, r3)
            goto L_0x074f
        L_0x0564:
            java.lang.String r9 = (java.lang.String) r9
            java.nio.ByteBuffer r11 = (java.nio.ByteBuffer) r11
            int r12 = X.AnonymousClass0wJ.A04(r10)
            boolean r3 = X.AnonymousClass0wJ.A1Y(r9, r11)
            java.lang.Object r8 = r0.A01
            com.instagram.direct.headmojis.service.HeadmojiRepository r8 = (com.instagram.direct.headmojis.service.HeadmojiRepository) r8
            X.Dov r4 = r8.A02
            long r1 = java.lang.System.currentTimeMillis()
            java.lang.String r10 = X.AnonymousClass00U.A08(r1, r9)
            X.C04220Ms.A0B(r10, r3)
            java.lang.String r2 = "sticker"
            java.lang.String r1 = ".webp"
            java.lang.String r2 = X.AnonymousClass00U.A0V(r2, r10, r1)
            X.IT9 r1 = r4.A00
            java.io.OutputStream r2 = r1.DBH(r2)
            java.nio.channels.WritableByteChannel r1 = java.nio.channels.Channels.newChannel(r2)     // Catch:{ all -> 0x05ac }
            r1.write(r11)     // Catch:{ all -> 0x05ac }
            if (r2 == 0) goto L_0x059b
            r2.close()
        L_0x059b:
            java.lang.Object r1 = r0.A00
            X.4qz r1 = (X.C83224qz) r1
            r11 = 0
            kotlin.coroutines.jvm.internal.KtSLambdaShape2S2102000_I2 r7 = new kotlin.coroutines.jvm.internal.KtSLambdaShape2S2102000_I2
            r13 = r3
            r7.<init>(r8, r9, r10, r11, r12, r13)
            r0 = 3
            X.C25237DiI.A00(r11, r11, r7, r1, r0)
            goto L_0x074f
        L_0x05ac:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x05ae }
        L_0x05ae:
            r0 = move-exception
            X.C102596Vu.A00(r2, r1)
            throw r0
        L_0x05b3:
            X.APc r9 = (X.C17828APc) r9
            X.BMj r11 = (X.C20066BMj) r11
            X.AZw r10 = (X.C18106AZw) r10
            X.AnonymousClass0wJ.A1N(r9, r11)
            r1 = 2
            X.C04220Ms.A0B(r10, r1)
            java.lang.Object r1 = r0.A01
            X.Aee r1 = (X.C18390Aee) r1
            X.C3y r1 = r1.A00
            java.lang.Object r0 = r0.A00
            X.BKU r0 = (X.BKU) r0
            r1.C2H(r9, r10, r0, r11)
            goto L_0x074f
        L_0x05cf:
            X.BMj r9 = (X.C20066BMj) r9
            android.view.View r11 = (android.view.View) r11
            X.0kW r10 = (X.C11630kW) r10
            X.AnonymousClass0wJ.A1N(r9, r11)
            r1 = 2
            X.C04220Ms.A0B(r10, r1)
            java.lang.Object r1 = r0.A00
            X.8m7 r1 = (X.C146358m7) r1
            java.lang.Object r0 = r0.A01
            X.BKU r0 = (X.BKU) r0
            java.lang.String r5 = r10.getModuleName()
            r6 = 0
            r2 = r11
            r3 = r0
            r4 = r9
            r7 = r6
            r8 = r6
            r1.CDY(r2, r3, r4, r5, r6, r7, r8)
            goto L_0x074f
        L_0x05f3:
            com.instagram.user.model.User r9 = (com.instagram.user.model.User) r9
            X.BMj r11 = (X.C20066BMj) r11
            int r3 = X.AnonymousClass0wJ.A04(r10)
            X.AnonymousClass0wJ.A1N(r9, r11)
            java.lang.Object r2 = r0.A00
            X.C3G r2 = (X.C3G) r2
            java.lang.Object r1 = r0.A01
            X.BKU r1 = (X.BKU) r1
            java.lang.String r0 = r9.getId()
            r2.Bq2(r1, r11, r0, r3)
            goto L_0x074f
        L_0x060f:
            android.text.SpannableStringBuilder r9 = (android.text.SpannableStringBuilder) r9
            X.C3G r11 = (X.C3G) r11
            int r2 = X.AnonymousClass0wJ.A04(r10)
            X.AnonymousClass0wJ.A1N(r9, r11)
            java.lang.Object r1 = r0.A00
            X.BKU r1 = (X.BKU) r1
            java.lang.Object r0 = r0.A01
            com.instagram.service.session.UserSession r0 = (com.instagram.service.session.UserSession) r0
            X.C19544Ay5.A04(r9, r1, r11, r0, r2)
            goto L_0x074f
        L_0x0627:
            android.view.View r9 = (android.view.View) r9
            X.C2o r11 = (X.C21839C2o) r11
            X.9zx r10 = (X.C171779zx) r10
            r5 = 0
            boolean r2 = X.AnonymousClass0wJ.A1Z(r9, r11)
            r1 = 2
            X.C04220Ms.A0B(r10, r1)
            java.lang.Object r4 = r0.A00
            X.BKU r4 = (X.BKU) r4
            java.lang.Object r3 = r0.A01
            com.instagram.service.session.UserSession r3 = (com.instagram.service.session.UserSession) r3
            goto L_0x0658
        L_0x063f:
            android.view.View r9 = (android.view.View) r9
            X.C2o r11 = (X.C21839C2o) r11
            X.9zx r10 = (X.C171779zx) r10
            r5 = 0
            boolean r2 = X.AnonymousClass0wJ.A1Z(r9, r11)
            r1 = 2
            X.C04220Ms.A0B(r10, r1)
            java.lang.Object r4 = r0.A00
            X.BKU r4 = (X.BKU) r4
            java.lang.Object r0 = r0.A01
            X.AsY r0 = (X.C19211AsY) r0
            com.instagram.service.session.UserSession r3 = r0.A02
        L_0x0658:
            X.C04220Ms.A0B(r4, r5)
            X.C04220Ms.A0B(r3, r2)
            X.Jn1 r2 = X.C37235Jn1.A00(r3)
            r1 = 0
            X.KE0 r0 = new X.KE0
            r0.<init>(r1, r4, r11, r3)
            r2.A0A(r9, r0)
            r2.A06(r9, r10)
            goto L_0x074f
        L_0x0670:
            X.AaK r9 = (X.C18130AaK) r9
            X.9Bd r11 = (X.C154259Bd) r11
            X.0kW r10 = (X.C11630kW) r10
            X.AnonymousClass0wJ.A1N(r9, r11)
            r1 = 2
            X.C04220Ms.A0B(r10, r1)
            java.lang.Object r1 = r0.A01
            X.AsY r1 = (X.C19211AsY) r1
            java.lang.Object r2 = r0.A00
            X.BKU r2 = (X.BKU) r2
            com.instagram.service.session.UserSession r3 = r1.A02
            com.instagram.user.model.User r0 = r2.A2Z(r3)
            if (r0 == 0) goto L_0x06db
            r1 = 1
            X.D0g r4 = r0.Aj4()
            X.D0g r0 = X.C23894D0g.FollowStatusUnknown
            if (r4 == r0) goto L_0x06b7
            boolean r0 = r9.A07
            if (r0 == 0) goto L_0x06b7
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0020000_I2 r0 = r11.A01
            boolean r0 = r0.A00
            if (r0 != 0) goto L_0x06b7
            boolean r0 = r11.A0K
            if (r0 == 0) goto L_0x06ab
            boolean r1 = r11.A0L
        L_0x06a6:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r1)
            return r8
        L_0x06ab:
            boolean r0 = r2.BYi()
            if (r0 != 0) goto L_0x06b9
            boolean r0 = r2.A4i()
            if (r0 == 0) goto L_0x06b9
        L_0x06b7:
            r1 = 0
            goto L_0x06a6
        L_0x06b9:
            X.BKN r0 = r2.A0f
            X.97W r0 = r0.A00
            if (r0 != 0) goto L_0x06b7
            boolean r0 = r9.A04
            boolean r0 = X.C18729AkN.A01(r10, r2, r3, r0)
            if (r0 != 0) goto L_0x06b7
            java.lang.String r0 = r10.getModuleName()
            X.C04220Ms.A06(r0)
            boolean r0 = X.C19600Az1.A0D(r2, r3)
            if (r0 != 0) goto L_0x06b7
            boolean r0 = r2.A3s()
            if (r0 == 0) goto L_0x06a6
            goto L_0x06b7
        L_0x06db:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0b()
            throw r0
        L_0x06e0:
            X.AXa r9 = (X.C18032AXa) r9
            android.app.Activity r11 = (android.app.Activity) r11
            android.content.Context r10 = (android.content.Context) r10
            r1 = 0
            X.AnonymousClass0wJ.A1M(r9, r1, r10)
            java.lang.Object r3 = r0.A00
            X.BKU r3 = (X.BKU) r3
            java.lang.Object r2 = r0.A01
            X.AgP r2 = (X.C18493AgP) r2
            r0 = 2130970951(0x7f040947, float:1.7550627E38)
            int r1 = X.C121907Is.A01(r10, r0)
            int r0 = r9.A00
            int r1 = r1 + r0
            if (r11 == 0) goto L_0x070a
            int r0 = X.C31164GhX.A01(r11)
        L_0x0702:
            int r1 = r1 + r0
            com.instagram.service.session.UserSession r0 = r2.A02
            android.util.Size r8 = X.C18731AkP.A00(r10, r3, r0, r1)
            return r8
        L_0x070a:
            r0 = 0
            goto L_0x0702
        L_0x070c:
            X.8nY r11 = (X.C147188nY) r11
            int r1 = X.AnonymousClass0wJ.A04(r10)
            r2 = r1 & 81
            r1 = 16
            if (r2 != r1) goto L_0x071e
            boolean r1 = r11.BCM()
            if (r1 != 0) goto L_0x072e
        L_0x071e:
            java.lang.Object r3 = r0.A00
            java.lang.Object r2 = r0.A01
            r0 = 31
            kotlin.jvm.internal.KtLambdaShape28S0200000_I2_12 r1 = new kotlin.jvm.internal.KtLambdaShape28S0200000_I2_12
            r1.<init>((int) r0, (java.lang.Object) r3, (java.lang.Object) r2)
            r0 = 0
            X.C121927Iv.A05(r11, r1, r0)
            goto L_0x074f
        L_0x072e:
            r11.CuJ()
            goto L_0x074f
        L_0x0732:
            com.instagram.model.shopping.productfeed.ProductTileMedia r9 = (com.instagram.model.shopping.productfeed.ProductTileMedia) r9
            X.C86144wL.A1M(r10)
            if (r9 == 0) goto L_0x0752
            java.lang.String r2 = r9.A02
        L_0x073b:
            java.lang.Object r1 = r0.A00
            com.instagram.model.shopping.productfeed.ProductFeedItem r1 = (com.instagram.model.shopping.productfeed.ProductFeedItem) r1
            java.lang.String r1 = r1.getId()
            boolean r1 = X.C04220Ms.A0I(r2, r1)
            if (r1 != 0) goto L_0x074f
            java.lang.Object r0 = r0.A01
            X.8wB r0 = (X.C150398wB) r0
            r0.A01 = r9
        L_0x074f:
            kotlin.Unit r8 = kotlin.Unit.A00
            return r8
        L_0x0752:
            r2 = 0
            goto L_0x073b
        L_0x0754:
            int r13 = X.AnonymousClass0wJ.A04(r9)
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1400000_I2 r11 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1400000_I2) r11
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1200000_I2 r10 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1200000_I2) r10
            r6 = 1
            int r4 = X.C18200wM.A02(r6, r11, r10)
            java.lang.Object r8 = r0.A01
            X.8v8 r8 = (X.AnonymousClass8v8) r8
            X.4wE r3 = r8.A0D
            java.lang.Object r9 = r0.A00
            X.8fB r9 = (X.C142538fB) r9
            r5 = r9
            X.5N8 r5 = (X.AnonymousClass5N8) r5
            java.lang.Object r0 = r10.A01
            X.9wD r0 = (X.C171189wD) r0
            int r0 = r0.ordinal()
            r7 = 0
            if (r0 == r7) goto L_0x07d6
            if (r0 == r6) goto L_0x07d3
            if (r0 != r4) goto L_0x07d9
            X.9wD r2 = X.C171189wD.UNKNOWN
        L_0x077f:
            r12 = 0
            java.lang.String r1 = r10.A02
            java.lang.Object r0 = r10.A00
            com.instagram.model.shopping.Product r0 = (com.instagram.model.shopping.Product) r0
            X.C04220Ms.A0B(r1, r7)
            X.C04220Ms.A0B(r0, r6)
            X.C04220Ms.A0B(r2, r4)
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1200000_I2 r15 = new com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1200000_I2
            r15.<init>((com.instagram.model.shopping.Product) r0, (X.C171189wD) r2, (java.lang.String) r1)
            java.lang.String r4 = r11.A04
            java.lang.Object r2 = r11.A03
            X.3Dd r2 = (X.C57943Dd) r2
            java.lang.Object r1 = r11.A00
            X.3Dd r1 = (X.C57943Dd) r1
            java.lang.Object r0 = r11.A01
            X.BKU r0 = (X.BKU) r0
            X.C04220Ms.A0B(r4, r7)
            X.C04220Ms.A0B(r2, r6)
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1400000_I2 r14 = new com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1400000_I2
            r16 = r2
            r17 = r1
            r18 = r0
            r19 = r4
            r14.<init>((com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1200000_I2) r15, (X.C57943Dd) r16, (X.C57943Dd) r17, (X.BKU) r18, (java.lang.String) r19)
            java.util.List r0 = r5.A00
            java.util.ArrayList r1 = X.C18200wM.A0s(r0)
            r1.set(r13, r14)
            X.5N8 r0 = new X.5N8
            r0.<init>(r1)
            X.4qz r1 = X.C86154wM.A17(r8, r0, r3)
            r14 = 4
            kotlin.coroutines.jvm.internal.KtSLambdaShape1S0402000_I2 r7 = new kotlin.coroutines.jvm.internal.KtSLambdaShape1S0402000_I2
            r7.<init>((java.lang.Object) r8, (java.lang.Object) r9, (java.lang.Object) r10, (java.lang.Object) r11, (X.C146958n9) r12, (int) r13, (int) r14)
            r0 = 3
            X.8sG r8 = X.C25237DiI.A00(r12, r12, r7, r1, r0)
            return r8
        L_0x07d3:
            X.9wD r2 = X.C171189wD.SAVED
            goto L_0x077f
        L_0x07d6:
            X.9wD r2 = X.C171189wD.NOT_SAVED
            goto L_0x077f
        L_0x07d9:
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        L_0x07de:
            r1 = 0
            X.C04220Ms.A0B(r9, r1)
            java.lang.Object r1 = r0.A01
            X.0YM r1 = (X.AnonymousClass0YM) r1
            java.lang.Object r8 = r1.invoke(r9, r11, r10)
            X.8m9 r8 = (X.C146378m9) r8
            X.0YY r5 = r8.AdR()
            X.4m5 r1 = X.AnonymousClass4m5.A00
            r8.CkG(r1)
            java.lang.Object r4 = r0.A00
            X.0YY[] r4 = (X.AnonymousClass0YY[]) r4
            int r3 = r4.length
            java.util.ArrayList r2 = X.C18240wQ.A0k(r3)
            r1 = 0
        L_0x07ff:
            if (r1 >= r3) goto L_0x080d
            r0 = r4[r1]
            java.lang.Object r0 = r0.invoke(r8)
            r2.add(r0)
            int r1 = r1 + 1
            goto L_0x07ff
        L_0x080d:
            r1 = 47
            kotlin.jvm.internal.KtLambdaShape166S0100000_I2_21 r0 = new kotlin.jvm.internal.KtLambdaShape166S0100000_I2_21
            r0.<init>(r2, r1)
            java.lang.Object r0 = r0.invoke(r5)
            X.0YY r0 = (X.AnonymousClass0YY) r0
            r8.CkG(r0)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.KtLambdaShape50S0200000_I2.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
