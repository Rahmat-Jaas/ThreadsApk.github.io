package kotlin.jvm.internal;

import X.AnonymousClass0YM;
import X.C02220Ah;

public class KtLambdaShape9S0400000_I2 extends C02220Ah implements AnonymousClass0YM {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public final int A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtLambdaShape9S0400000_I2(int i, Object obj, Object obj2, Object obj3, Object obj4) {
        super(3);
        this.A04 = i;
        this.A01 = obj;
        this.A00 = obj2;
        this.A02 = obj3;
        this.A03 = obj4;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v22, resolved type: X.8nY} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v24, resolved type: X.7W3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v12, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v18, resolved type: kotlin.jvm.internal.KtLambdaShape0S0100200_I2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v6, resolved type: kotlin.jvm.internal.KtLambdaShape0S0100200_I2} */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0168, code lost:
        if (r8 == X.AnonymousClass7GN.A00) goto L_0x016a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x02ee, code lost:
        X.AnonymousClass7W3.A0w(r2, r3);
        X.AnonymousClass7W3.A0e(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x02f6, code lost:
        return kotlin.Unit.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x02f7, code lost:
        r0.CuJ();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0377, code lost:
        X.AnonymousClass7W3.A0w(r0, r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x037a, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x03a1, code lost:
        throw null;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r30, java.lang.Object r31, java.lang.Object r32) {
        /*
            r29 = this;
            r2 = r29
            r6 = r32
            r0 = r31
            r1 = r30
            int r3 = r2.A04
            switch(r3) {
                case 0: goto L_0x02fb;
                case 1: goto L_0x01d6;
                case 2: goto L_0x0380;
                case 3: goto L_0x0113;
                case 4: goto L_0x0065;
                case 5: goto L_0x0035;
                default: goto L_0x000d;
            }
        L_0x000d:
            android.content.Context r1 = (android.content.Context) r1
            X.9uR r0 = (X.C170099uR) r0
            r3 = 0
            X.C04220Ms.A0B(r1, r3)
            X.ArO r6 = X.C19147ArO.A00
            java.lang.Object r3 = r2.A03
            X.AgP r3 = (X.C18493AgP) r3
            com.instagram.service.session.UserSession r5 = r3.A02
            java.lang.Object r4 = r2.A01
            X.BKU r4 = (X.BKU) r4
            java.lang.Object r3 = r2.A02
            X.BMj r3 = (X.C20066BMj) r3
            java.lang.Object r2 = r2.A00
            X.C2o r2 = (X.C21839C2o) r2
            r9 = r4
            r10 = r2
            r11 = r3
            r12 = r5
            r13 = r0
            r7 = r1
            r8 = r4
            X.939 r1 = r6.A00(r7, r8, r9, r10, r11, r12, r13)
            return r1
        L_0x0035:
            android.content.Context r1 = (android.content.Context) r1
            X.9uP r0 = (X.AnonymousClass9uP) r0
            X.9tY r6 = (X.C169569tY) r6
            X.AnonymousClass0wJ.A1N(r1, r0)
            r3 = 2
            X.C04220Ms.A0B(r6, r3)
            java.lang.Object r3 = r2.A03
            X.AgQ r3 = (X.C18494AgQ) r3
            X.0Oa r3 = r3.A06
            java.lang.Object r5 = r3.getValue()
            X.AgP r5 = (X.C18493AgP) r5
            java.lang.Object r4 = r2.A00
            X.BKU r4 = (X.BKU) r4
            java.lang.Object r3 = r2.A01
            X.BMj r3 = (X.C20066BMj) r3
            java.lang.Object r2 = r2.A02
            X.C2o r2 = (X.C21839C2o) r2
            r9 = r3
            r10 = r6
            r11 = r0
            r6 = r1
            r7 = r4
            r8 = r2
            X.93Z r1 = r5.A01(r6, r7, r8, r9, r10, r11)
            return r1
        L_0x0065:
            X.8nY r0 = (X.C147188nY) r0
            int r4 = X.AnonymousClass0wJ.A04(r6)
            r3 = 0
            X.C04220Ms.A0B(r1, r3)
            r1 = r4 & 81
            r10 = 16
            if (r1 != r10) goto L_0x007b
            boolean r1 = r0.BCM()
            if (r1 != 0) goto L_0x02f7
        L_0x007b:
            X.7Wm r9 = androidx.compose.ui.Modifier.A00
            r4 = 1
            X.54z r8 = X.AnonymousClass7Kq.A02
            androidx.compose.ui.Modifier r1 = r9.Cx6(r8)
            androidx.compose.ui.Modifier r1 = X.AnonymousClass7G5.A01(r0, r1, r4)
            java.lang.Object r7 = r2.A01
            java.util.List r7 = (java.util.List) r7
            java.lang.Object r13 = r2.A03
            java.lang.Object r6 = r2.A00
            java.lang.Object r11 = r2.A02
            X.8ly r15 = X.AnonymousClass7KV.A05(r0)
            java.lang.Object r14 = X.C147188nY.A0p(r0)
            java.lang.Object r12 = X.C147188nY.A0n(r0)
            java.lang.Object r5 = X.C147188nY.A0m(r0)
            X.0ZU r4 = X.AnonymousClass74X.A00
            X.0YM r1 = X.C98236Es.A00(r1)
            r2 = r0
            X.7W3 r2 = (X.AnonymousClass7W3) r2
            X.C147188nY.A0w(r0, r2, r4)
            X.AnonymousClass7W3.A0a(r0, r2, r15, r14)
            X.AnonymousClass7KP.A07(r0, r12, r5, r1)
            r1 = 2089450523(0x7c8a7c1b, float:5.752433E36)
            r0.Cvb(r1)
            java.util.Iterator r15 = r7.iterator()
            r5 = 0
        L_0x00bf:
            boolean r1 = r15.hasNext()
            if (r1 == 0) goto L_0x010e
            java.lang.Object r1 = r15.next()
            int r14 = r5 + 1
            if (r5 >= 0) goto L_0x00d2
            X.C06750aI.A1A()
            goto L_0x03a0
        L_0x00d2:
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S3100000_I2 r1 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S3100000_I2) r1
            r22 = 12
            kotlin.jvm.internal.KtLambdaShape4S0400000_I2 r21 = new kotlin.jvm.internal.KtLambdaShape4S0400000_I2
            r23 = r6
            r24 = r11
            r25 = r1
            r26 = r13
            r21.<init>(r22, r23, r24, r25, r26)
            java.lang.String r12 = r1.A03
            java.lang.String r4 = r1.A02
            java.lang.Object r1 = r1.A00
            com.instagram.common.typedurl.ImageUrl r1 = (com.instagram.common.typedurl.ImageUrl) r1
            androidx.compose.ui.Modifier r17 = r9.Cx6(r8)
            r22 = 24576(0x6000, float:3.4438E-41)
            r16 = r0
            r18 = r1
            r19 = r12
            r20 = r4
            r23 = r3
            X.AnonymousClass7Hs.A04(r16, r17, r18, r19, r20, r21, r22, r23)
            int r1 = r7.size()
            if (r5 >= r1) goto L_0x010c
            float r1 = (float) r10
            androidx.compose.ui.Modifier r1 = X.AnonymousClass7K4.A06(r9, r1, r3)
            X.AnonymousClass70V.A00(r0, r1)
        L_0x010c:
            r5 = r14
            goto L_0x00bf
        L_0x010e:
            X.AnonymousClass7W3.A0w(r2, r3)
            goto L_0x02ee
        L_0x0113:
            androidx.compose.ui.Modifier r1 = (androidx.compose.ui.Modifier) r1
            X.8nY r5 = X.C86104wH.A0H(r0, r6)
            r15 = 0
            X.C04220Ms.A0B(r1, r15)
            r0 = 1472820394(0x57c974aa, float:4.43005811E14)
            X.7KB r0 = X.C120537Bh.A01(r5, r0)
            long r6 = r0.A0q
            X.7KB r0 = X.C120537Bh.A00(r5)
            long r3 = r0.A0q
            r0 = 1050253722(0x3e99999a, float:0.3)
            r11 = 0
            long r19 = X.C121657He.A04(X.C86154wM.A0G(r3), X.AnonymousClass7KE.A03(r3), X.AnonymousClass7KE.A02(r3), X.AnonymousClass7KE.A01(r3), r0)
            java.lang.Object r0 = r2.A03
            java.lang.Object r0 = X.C86144wL.A0j(r0)
            float r4 = X.C18240wQ.A00(r0)
            r3 = 22
            java.lang.String r0 = "Video progress indicator"
            X.4oM r9 = X.AnonymousClass7DC.A01(r11, r5, r0, r4, r3)
            X.7KE r8 = X.C86134wK.A0I(r19)
            X.7KE r4 = X.C86134wK.A0I(r6)
            r3 = 1618982084(0x607fb4c4, float:7.370227E19)
            boolean r0 = X.C147188nY.A0z(r5, r9, r3)
            boolean r0 = X.C147188nY.A11(r5, r8, r0)
            boolean r4 = X.C147188nY.A12(r5, r4, r0)
            r0 = r5
            X.7W3 r0 = (X.AnonymousClass7W3) r0
            java.lang.Object r8 = r0.A13()
            if (r4 != 0) goto L_0x016a
            java.lang.Object r4 = X.AnonymousClass7GN.A00
            if (r8 != r4) goto L_0x017a
        L_0x016a:
            kotlin.jvm.internal.KtLambdaShape0S0100200_I2 r8 = new kotlin.jvm.internal.KtLambdaShape0S0100200_I2
            r18 = 1
            r16 = r8
            r17 = r9
            r21 = r6
            r16.<init>(r17, r18, r19, r21)
            r0.A14(r8)
        L_0x017a:
            X.0YY r4 = X.AnonymousClass7W3.A0B(r0, r8, r15)
            androidx.compose.ui.Modifier r6 = androidx.compose.ui.Modifier.A08(r1, r4)
            kotlin.Unit r4 = kotlin.Unit.A00
            java.lang.Object r9 = r2.A02
            java.lang.Object r8 = r2.A01
            java.lang.Object r10 = r2.A00
            boolean r1 = X.C147188nY.A10(r5, r9, r8, r3)
            boolean r1 = X.C147188nY.A12(r5, r10, r1)
            java.lang.Object r7 = r0.A13()
            if (r1 != 0) goto L_0x019c
            java.lang.Object r1 = X.AnonymousClass7GN.A00
            if (r7 != r1) goto L_0x01a6
        L_0x019c:
            r12 = 39
            kotlin.coroutines.jvm.internal.KtSLambdaShape4S0401000_I2 r7 = new kotlin.coroutines.jvm.internal.KtSLambdaShape4S0401000_I2
            r7.<init>((java.lang.Object) r8, (java.lang.Object) r9, (java.lang.Object) r10, (X.C146958n9) r11, (int) r12)
            r0.A14(r7)
        L_0x01a6:
            X.AnonymousClass7W3.A0w(r0, r15)
            X.0YP r7 = (X.AnonymousClass0YP) r7
            androidx.compose.ui.Modifier r2 = X.AnonymousClass7CA.A01(r6, r4, r7)
            boolean r1 = X.C147188nY.A10(r5, r9, r10, r3)
            boolean r1 = X.C147188nY.A12(r5, r8, r1)
            java.lang.Object r7 = r0.A13()
            if (r1 != 0) goto L_0x01c1
            java.lang.Object r1 = X.AnonymousClass7GN.A00
            if (r7 != r1) goto L_0x01cb
        L_0x01c1:
            r12 = 40
            kotlin.coroutines.jvm.internal.KtSLambdaShape4S0401000_I2 r7 = new kotlin.coroutines.jvm.internal.KtSLambdaShape4S0401000_I2
            r7.<init>((java.lang.Object) r8, (java.lang.Object) r9, (java.lang.Object) r10, (X.C146958n9) r11, (int) r12)
            r0.A14(r7)
        L_0x01cb:
            X.AnonymousClass7W3.A0w(r0, r15)
            X.0YP r7 = (X.AnonymousClass0YP) r7
            androidx.compose.ui.Modifier r1 = X.AnonymousClass7CA.A01(r2, r4, r7)
            goto L_0x0377
        L_0x01d6:
            X.0YP r1 = (X.AnonymousClass0YP) r1
            X.8nY r0 = (X.C147188nY) r0
            int r4 = X.AnonymousClass0wJ.A04(r6)
            r3 = 0
            X.C04220Ms.A0B(r1, r3)
            r5 = r4 & 14
            if (r5 != 0) goto L_0x01eb
            int r5 = X.C147188nY.A09(r0, r1)
            r4 = r4 | r5
        L_0x01eb:
            r6 = r4 & 91
            r5 = 18
            if (r6 != r5) goto L_0x01f7
            boolean r5 = r0.BCM()
            if (r5 != 0) goto L_0x02f7
        L_0x01f7:
            r15 = 0
            r12 = 1
            java.lang.Object r5 = r2.A02
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.List r5 = X.AnonymousClass00J.A0K(r5)
            int r5 = r5.size()
            r13 = 0
            if (r5 == r12) goto L_0x020a
            r13 = 75
        L_0x020a:
            X.8fN r5 = X.AnonymousClass6aT.A01
            r11 = 150(0x96, float:2.1E-43)
            r10 = 2
            X.7Tr r9 = new X.7Tr
            r9.<init>(r5, r11, r13)
            java.lang.Object r5 = r2.A03
            r2 = 14
            kotlin.jvm.internal.KtLambdaShape16S0200000_I2 r19 = X.C86164wN.A0v(r15, r5, r2)
            r2 = 1016418159(0x3c954f6f, float:0.018226353)
            r0.Cvb(r2)
            r8 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            X.7W3 r2 = X.C147188nY.A0Z(r0, r8)
            java.lang.Object r14 = r2.A13()
            java.lang.Object r7 = X.AnonymousClass7GN.A00
            if (r14 != r7) goto L_0x0239
            r5 = 0
            X.7JH r14 = X.AnonymousClass6DU.A00(r5)
            r2.A14(r14)
        L_0x0239:
            X.AnonymousClass7W3.A0w(r2, r3)
            X.7JH r14 = (X.AnonymousClass7JH) r14
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r12)
            kotlin.coroutines.jvm.internal.KtSLambdaShape1S0311000_I2 r5 = new kotlin.coroutines.jvm.internal.KtSLambdaShape1S0311000_I2
            r16 = r5
            r17 = r14
            r18 = r9
            r20 = r15
            r21 = r12
            r22 = r12
            r16.<init>(r17, r18, r19, r20, r21, r22)
            X.AnonymousClass7K5.A05(r0, r6, r5)
            X.7WW r5 = r14.A04
            X.AnonymousClass7W3.A0w(r2, r3)
            X.8fN r9 = X.AnonymousClass6aT.A00
            X.7Tr r18 = X.C122747Tr.A00(r9, r10, r11, r13)
            r9 = 2003504988(0x776b0f5c, float:4.767583E33)
            r0.Cvb(r9)
            java.lang.Object r8 = X.C147188nY.A0r(r0, r2, r8)
            if (r8 != r7) goto L_0x0277
            r7 = 1061997773(0x3f4ccccd, float:0.8)
            X.7JH r8 = X.AnonymousClass6DU.A00(r7)
            r2.A14(r8)
        L_0x0277:
            X.AnonymousClass7W3.A0w(r2, r3)
            X.7JH r8 = (X.AnonymousClass7JH) r8
            kotlin.coroutines.jvm.internal.KtSLambdaShape0S0211000_I2 r7 = new kotlin.coroutines.jvm.internal.KtSLambdaShape0S0211000_I2
            r16 = r7
            r17 = r8
            r19 = r15
            r20 = r12
            r16.<init>(r17, r18, r19, r20, r21)
            X.AnonymousClass7K5.A05(r0, r6, r7)
            X.7WW r8 = r8.A04
            X.AnonymousClass7W3.A0w(r2, r3)
            X.7Wm r6 = androidx.compose.ui.Modifier.A00
            java.lang.Object r7 = r8.getValue()
            float r18 = X.C18240wQ.A00(r7)
            java.lang.Object r7 = r8.getValue()
            float r19 = X.C18240wQ.A00(r7)
            java.lang.Object r5 = r5.getValue()
            float r20 = X.C18240wQ.A00(r5)
            r21 = 0
            long r22 = X.AnonymousClass79F.A01
            X.8fo r17 = X.C102746Wj.A00
            long r24 = X.C102736Wi.A00
            androidx.compose.ui.graphics.GraphicsLayerModifierNodeElement r5 = new androidx.compose.ui.graphics.GraphicsLayerModifierNodeElement
            r26 = r24
            r28 = r3
            r16 = r5
            r16.<init>(r17, r18, r19, r20, r21, r22, r24, r26, r28)
            androidx.compose.ui.Modifier r6 = r6.Cx6(r5)
            r5 = 45
            kotlin.jvm.internal.KtLambdaShape146S0100000_I2_1 r5 = X.C86154wM.A0z(r15, r5)
            androidx.compose.ui.Modifier r5 = X.AnonymousClass6FI.A00(r6, r5, r3)
            X.8ly r10 = X.AnonymousClass7KV.A07(r0, r3)
            java.lang.Object r9 = X.C147188nY.A0p(r0)
            java.lang.Object r8 = X.C147188nY.A0n(r0)
            java.lang.Object r7 = X.C147188nY.A0m(r0)
            X.0ZU r6 = X.AnonymousClass74X.A00
            X.0YM r5 = X.C98236Es.A00(r5)
            X.C147188nY.A0w(r0, r2, r6)
            X.AnonymousClass7W3.A0a(r0, r2, r10, r9)
            X.AnonymousClass7KP.A07(r0, r8, r7, r5)
            X.C86104wH.A1S(r0, r1, r4)
        L_0x02ee:
            X.AnonymousClass7W3.A0w(r2, r3)
            X.AnonymousClass7W3.A0e(r2)
        L_0x02f4:
            kotlin.Unit r1 = kotlin.Unit.A00
            return r1
        L_0x02f7:
            r0.CuJ()
            goto L_0x02f4
        L_0x02fb:
            androidx.compose.ui.Modifier r1 = (androidx.compose.ui.Modifier) r1
            X.8nY r10 = X.C86104wH.A0H(r0, r6)
            r15 = 0
            X.C04220Ms.A0B(r1, r15)
            r0 = 1634330012(0x6169e59c, float:2.6966478E20)
            r10.Cvb(r0)
            X.7W3 r0 = X.C147188nY.A0Y(r10)
            java.lang.Object r8 = r0.A13()
            java.lang.Object r3 = X.AnonymousClass7GN.A00
            r11 = 0
            if (r8 != r3) goto L_0x0321
            r3 = 1065353216(0x3f800000, float:1.0)
            X.7JH r8 = X.AnonymousClass6DU.A00(r3)
            r0.A14(r8)
        L_0x0321:
            X.AnonymousClass7W3.A0w(r0, r15)
            java.lang.Object r7 = r2.A00
            X.6nD r7 = (X.C111366nD) r7
            boolean r3 = r7 instanceof X.C876253m
            r14 = 0
            if (r3 == 0) goto L_0x037e
            r3 = r7
            X.53m r3 = (X.C876253m) r3
            long r3 = r3.A00
            long r12 = X.AnonymousClass7KE.A06
            int r5 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            if (r5 != 0) goto L_0x037e
        L_0x0338:
            java.lang.Object r9 = r2.A02
            X.6qu r9 = (X.C113196qu) r9
            X.8pE r3 = r9.A09
            boolean r3 = X.C86104wH.A1X(r3)
            if (r3 == 0) goto L_0x037b
            java.lang.Object r6 = r2.A03
            X.7HD r6 = (X.AnonymousClass7HD) r6
            long r3 = r6.A00
            boolean r5 = X.C121767Ia.A02(r3)
            if (r5 == 0) goto L_0x037b
            if (r14 == 0) goto L_0x037b
            X.7yH r12 = r6.A01
            X.7Ia r5 = new X.7Ia
            r5.<init>(r3)
            r3 = 9
            kotlin.coroutines.jvm.internal.KtSLambdaShape3S0101000_I2 r3 = X.C86164wN.A0o(r8, r11, r3)
            X.AnonymousClass7K5.A03(r10, r12, r5, r3)
            java.lang.Object r2 = r2.A01
            kotlin.jvm.internal.KtLambdaShape4S0500000_I2 r14 = new kotlin.jvm.internal.KtLambdaShape4S0500000_I2
            r16 = r8
            r17 = r6
            r18 = r9
            r19 = r7
            r20 = r2
            r14.<init>(r15, r16, r17, r18, r19, r20)
            androidx.compose.ui.Modifier r1 = androidx.compose.ui.Modifier.A08(r1, r14)
        L_0x0377:
            X.AnonymousClass7W3.A0w(r0, r15)
            return r1
        L_0x037b:
            X.7Wm r1 = androidx.compose.ui.Modifier.A00
            goto L_0x0377
        L_0x037e:
            r14 = 1
            goto L_0x0338
        L_0x0380:
            r1 = 1
            X.C04220Ms.A0B(r0, r1)
            java.lang.Object r0 = r2.A03
            X.7W3 r0 = (X.AnonymousClass7W3) r0
            X.6vH r1 = r0.A0c
            java.lang.Object r0 = r2.A00
            X.6Cm r0 = (X.C97716Cm) r0
            X.6Cl r0 = r1.A06(r0)
            if (r0 == 0) goto L_0x039b
            java.lang.String r0 = "getSlotTable$runtime_release"
            java.lang.NullPointerException r0 = X.C18210wN.A0W(r0)
            throw r0
        L_0x039b:
            java.lang.String r0 = "Could not resolve state for movable content"
            X.AnonymousClass7J4.A02(r0)
        L_0x03a0:
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.KtLambdaShape9S0400000_I2.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
