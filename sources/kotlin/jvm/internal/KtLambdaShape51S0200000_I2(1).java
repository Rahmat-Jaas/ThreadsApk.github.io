package kotlin.jvm.internal;

import X.AnonymousClass0YC;
import X.C02220Ah;

public class KtLambdaShape51S0200000_I2 extends C02220Ah implements AnonymousClass0YC {
    public Object A00;
    public Object A01;
    public final int A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtLambdaShape51S0200000_I2(int i, Object obj, Object obj2) {
        super(4);
        this.A02 = i;
        this.A01 = obj;
        this.A00 = obj2;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x040e, code lost:
        X.AnonymousClass6N3.A00(r10, r11, r12, r13, r14, r15, r16);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x042a, code lost:
        r5 = X.C86114wI.A0W(r7, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x042e, code lost:
        if (r5 == null) goto L_0x0464;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x0430, code lost:
        r3 = new X.C10680ik(r7);
        r3.A00 = r6;
        r3.A01 = X.C10690il.A03;
        r4 = r3.A00();
        r3 = X.C19541Ay2.A01(r5, r6, r7, (X.C145018jf) null, (java.lang.Integer) null, X.C86144wL.A0b(), X.I17.A00(109));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x044f, code lost:
        if (r3 == null) goto L_0x0464;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x0451, code lost:
        r0 = r5.A0f.A1i;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x0455, code lost:
        if (r0 == null) goto L_0x0461;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x0457, code lost:
        r0 = r0.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x0459, code lost:
        if (r0 == null) goto L_0x0461;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x045b, code lost:
        r3.A3u = X.C19527Axo.A03(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x0461, code lost:
        X.J1Y.A00(r4, r3, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x0464, code lost:
        ((X.C146638ma) r1.A00).BhK(r2, r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x046d, code lost:
        ((X.C146638ma) r1.A00).Bh6(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00e2, code lost:
        r14.CuJ();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0030, code lost:
        return kotlin.Unit.A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r20, java.lang.Object r21, java.lang.Object r22, java.lang.Object r23) {
        /*
            r19 = this;
            r1 = r19
            r14 = r22
            r0 = r21
            r2 = r20
            int r3 = r1.A02
            r4 = r23
            switch(r3) {
                case 0: goto L_0x0031;
                case 1: goto L_0x0092;
                case 2: goto L_0x00e7;
                case 3: goto L_0x0100;
                case 4: goto L_0x0139;
                case 5: goto L_0x0181;
                case 6: goto L_0x01b7;
                case 7: goto L_0x01f8;
                case 8: goto L_0x022c;
                case 9: goto L_0x0270;
                case 10: goto L_0x02a2;
                case 11: goto L_0x02d5;
                case 12: goto L_0x02f9;
                case 13: goto L_0x036d;
                case 14: goto L_0x0413;
                case 15: goto L_0x0476;
                case 16: goto L_0x049b;
                default: goto L_0x000f;
            }
        L_0x000f:
            X.8nY r3 = X.C86104wH.A0H(r14, r4)
            java.lang.Object r2 = r1.A00
            r0 = 35
            kotlin.jvm.internal.KtLambdaShape37S0100000_I2_17 r7 = X.C86154wM.A14(r2, r0)
            java.lang.Object r8 = r1.A01
            X.0YP r8 = (X.AnonymousClass0YP) r8
            X.7Wm r0 = androidx.compose.ui.Modifier.A00
            androidx.compose.ui.Modifier r4 = X.AnonymousClass7FI.A02(r0)
            r2 = 0
            r9 = 0
            r10 = 56
            r5 = r2
            r6 = r2
            X.C100546Ns.A00(r2, r3, r4, r5, r6, r7, r8, r9, r10)
        L_0x002e:
            kotlin.Unit r0 = kotlin.Unit.A00
            return r0
        L_0x0031:
            X.6iT r2 = (X.C108506iT) r2
            int r5 = X.AnonymousClass0wJ.A04(r0)
            X.8nY r14 = (X.C147188nY) r14
            int r3 = X.AnonymousClass0wJ.A04(r4)
            int r0 = X.C86124wJ.A0G(r2, r3)
            if (r0 != 0) goto L_0x0090
            int r7 = X.C147188nY.A0F(r14, r2)
            r7 = r7 | r3
        L_0x0048:
            r0 = r3 & 112(0x70, float:1.57E-43)
            if (r0 != 0) goto L_0x0051
            int r0 = X.C147188nY.A04(r14, r5)
            r7 = r7 | r0
        L_0x0051:
            r3 = r7 & 731(0x2db, float:1.024E-42)
            r0 = 146(0x92, float:2.05E-43)
            if (r3 != r0) goto L_0x005d
            boolean r0 = r14.BCM()
            if (r0 != 0) goto L_0x00e2
        L_0x005d:
            int r0 = r2.A01
            int r6 = r5 - r0
            java.lang.Object r0 = r2.A02
            X.7VY r0 = (X.AnonymousClass7VY) r0
            X.0YY r0 = r0.A00
            if (r0 == 0) goto L_0x008e
            java.lang.Object r15 = X.C86154wM.A0f(r0, r6)
        L_0x006d:
            java.lang.Object r0 = r1.A01
            androidx.compose.foundation.lazy.LazyListState r0 = (androidx.compose.foundation.lazy.LazyListState) r0
            X.84E r13 = r0.A0A
            r4 = 1210565839(0x4827c4cf, float:171795.23)
            java.lang.Object r3 = r1.A00
            r1 = 5
            kotlin.jvm.internal.KtLambdaShape27S0201000_I2 r0 = new kotlin.jvm.internal.KtLambdaShape27S0201000_I2
            r0.<init>(r6, r1, r3, r2)
            X.8sI r16 = X.AnonymousClass7JR.A00(r14, r0, r4)
            r0 = r7 & 112(0x70, float:1.57E-43)
            r0 = r0 | 3592(0xe08, float:5.033E-42)
            r18 = r0
            r17 = r5
            X.C98006Du.A00(r13, r14, r15, r16, r17, r18)
            goto L_0x002e
        L_0x008e:
            r15 = 0
            goto L_0x006d
        L_0x0090:
            r7 = r3
            goto L_0x0048
        L_0x0092:
            int r5 = X.AnonymousClass0wJ.A04(r0)
            X.8nY r14 = (X.C147188nY) r14
            int r3 = X.AnonymousClass0wJ.A04(r4)
            int r0 = X.C86124wJ.A0G(r2, r3)
            if (r0 != 0) goto L_0x00e0
            int r4 = X.C147188nY.A0F(r14, r2)
            r4 = r4 | r3
        L_0x00a7:
            r0 = r3 & 112(0x70, float:1.57E-43)
            if (r0 != 0) goto L_0x00b0
            int r0 = X.C147188nY.A04(r14, r5)
            r4 = r4 | r0
        L_0x00b0:
            r3 = r4 & 731(0x2db, float:1.024E-42)
            r0 = 146(0x92, float:2.05E-43)
            if (r3 != r0) goto L_0x00bc
            boolean r0 = r14.BCM()
            if (r0 != 0) goto L_0x00e2
        L_0x00bc:
            java.lang.Object r3 = r1.A00
            X.0YC r3 = (X.AnonymousClass0YC) r3
            java.lang.Object r1 = r1.A01
            X.76o r1 = (X.C1197176o) r1
            X.59Y r0 = r1.A02
            r0.A02(r5)
            X.8pE r0 = r1.A00
            java.lang.Object r0 = r0.getValue()
            X.8AJ r0 = (X.AnonymousClass8AJ) r0
            java.lang.Object r1 = r0.get(r5)
            r0 = r4 & 14
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.invoke(r2, r1, r14, r0)
            goto L_0x002e
        L_0x00e0:
            r4 = r3
            goto L_0x00a7
        L_0x00e2:
            r14.CuJ()
            goto L_0x002e
        L_0x00e7:
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r14 = (java.lang.String) r14
            boolean r3 = X.AnonymousClass0wJ.A1X(r4)
            X.AnonymousClass0wJ.A1N(r2, r0)
            if (r3 == 0) goto L_0x046d
            java.lang.Object r0 = r1.A01
            X.56T r0 = (X.AnonymousClass56T) r0
            com.instagram.service.session.UserSession r7 = r0.A07
            X.C2o r6 = r0.A06
            goto L_0x042a
        L_0x0100:
            X.7Zx r0 = (X.C123917Zx) r0
            X.8nY r3 = X.C86104wH.A0H(r14, r4)
            r2 = 1
            X.C04220Ms.A0B(r0, r2)
            android.os.Bundle r2 = r0.A06
            if (r2 == 0) goto L_0x04bc
            java.lang.String r0 = "id"
            java.lang.String r7 = r2.getString(r0)
            if (r7 != 0) goto L_0x0122
            java.lang.String r0 = "shortcode"
            java.lang.String r0 = r2.getString(r0)
            if (r0 == 0) goto L_0x04bc
            java.lang.String r7 = X.AnonymousClass6SQ.A00(r0)
        L_0x0122:
            java.lang.Object r5 = r1.A01
            X.7p0 r5 = (X.AnonymousClass7p0) r5
            java.lang.Object r1 = r1.A00
            r0 = 41
            kotlin.jvm.internal.KtLambdaShape33S0100000_I2_13 r8 = new kotlin.jvm.internal.KtLambdaShape33S0100000_I2_13
            r8.<init>(r1, r0)
            r4 = 0
            r9 = 0
            r10 = 24
            r6 = r4
            X.C121377Fr.A02(r3, r4, r5, r6, r7, r8, r9, r10)
            goto L_0x002e
        L_0x0139:
            X.7Zx r0 = (X.C123917Zx) r0
            X.8nY r4 = X.C86104wH.A0H(r14, r4)
            r2 = 1
            X.C04220Ms.A0B(r0, r2)
            X.7Wm r2 = androidx.compose.ui.Modifier.A00
            androidx.compose.ui.Modifier r2 = X.AnonymousClass7FI.A01(r2)
            androidx.compose.ui.Modifier r3 = X.AnonymousClass7FI.A00(r2)
            r7 = 0
            r2 = 0
            X.C04220Ms.A0B(r3, r2)
            androidx.compose.ui.Modifier r5 = androidx.compose.ui.Modifier.A05(r3)
            X.7En r3 = X.C123917Zx.A00(r0)
            java.lang.String r2 = "selected_media_ids"
            java.lang.Object r8 = r3.A00(r2)
            java.util.List r8 = (java.util.List) r8
            if (r8 != 0) goto L_0x0166
            X.0ZV r8 = X.AnonymousClass0ZV.A00
        L_0x0166:
            java.lang.Object r6 = r1.A00
            X.06E r6 = (X.AnonymousClass06E) r6
            java.lang.Object r2 = r1.A01
            r1 = 2
            kotlin.jvm.internal.KtLambdaShape34S0100000_I2_14 r9 = X.C86164wN.A0z(r2, r1)
            r1 = 47
            kotlin.jvm.internal.KtLambdaShape41S0200000_I2_2 r10 = new kotlin.jvm.internal.KtLambdaShape41S0200000_I2_2
            r10.<init>((int) r1, (java.lang.Object) r2, (java.lang.Object) r0)
            r11 = 4104(0x1008, float:5.751E-42)
            r12 = 32
            X.AnonymousClass7BX.A01(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            goto L_0x002e
        L_0x0181:
            X.8nY r3 = X.C86104wH.A0H(r14, r4)
            java.lang.Object r2 = r1.A01
            X.0i6 r2 = (X.C10300i6) r2
            boolean r0 = r2 instanceof com.instagram.service.session.UserSession
            if (r0 == 0) goto L_0x002e
            com.instagram.service.session.UserSession r2 = (com.instagram.service.session.UserSession) r2
            java.lang.String r6 = r2.getUserId()
            X.7Wm r0 = androidx.compose.ui.Modifier.A00
            r5 = 0
            androidx.compose.ui.Modifier r4 = androidx.compose.ui.Modifier.A05(r0)
            java.lang.Object r1 = r1.A00
            r0 = 8
            kotlin.jvm.internal.KtLambdaShape34S0100000_I2_14 r8 = X.C86164wN.A0z(r1, r0)
            r0 = 9
            kotlin.jvm.internal.KtLambdaShape152S0100000_I2_7 r11 = X.C86164wN.A0t(r1, r0)
            kotlin.jvm.internal.KtLambdaShape34S0100000_I2_14 r9 = X.C86164wN.A0z(r1, r0)
            r12 = 48
            r13 = 224(0xe0, float:3.14E-43)
            r7 = r5
            r10 = r5
            X.C122107Kg.A05(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            goto L_0x002e
        L_0x01b7:
            X.8nY r7 = X.C86104wH.A0H(r14, r4)
            X.AnonymousClass0wJ.A1N(r2, r0)
            java.lang.Object r3 = r1.A01
            java.lang.Object r3 = X.C86104wH.A0f(r3)
            java.util.List r3 = (java.util.List) r3
            java.util.ListIterator r4 = X.C86144wL.A10(r3)
        L_0x01ca:
            boolean r3 = r4.hasPrevious()
            if (r3 == 0) goto L_0x01f6
            java.lang.Object r6 = r4.previous()
            boolean r3 = r0.equals(r6)
            if (r3 == 0) goto L_0x01ca
        L_0x01da:
            X.7Zx r6 = (X.C123917Zx) r6
            if (r6 == 0) goto L_0x002e
            java.lang.Object r5 = r1.A00
            X.8jq r5 = (X.C145108jq) r5
            r4 = 1840477093(0x6db373a5, float:6.942203E27)
            r3 = 5
            kotlin.jvm.internal.KtLambdaShape13S0300000_I2 r1 = new kotlin.jvm.internal.KtLambdaShape13S0300000_I2
            r1.<init>(r3, r0, r6, r2)
            X.8sI r1 = X.AnonymousClass7JR.A00(r7, r1, r4)
            r0 = 456(0x1c8, float:6.39E-43)
            X.C116086wO.A00(r7, r5, r6, r1, r0)
            goto L_0x002e
        L_0x01f6:
            r6 = 0
            goto L_0x01da
        L_0x01f8:
            X.7Zx r0 = (X.C123917Zx) r0
            X.8nY r4 = X.C86104wH.A0H(r14, r4)
            r3 = 1
            X.C04220Ms.A0B(r0, r3)
            android.os.Bundle r2 = r0.A06
            if (r2 == 0) goto L_0x04c3
            java.lang.String r0 = "postId"
            java.lang.String r7 = r2.getString(r0)
            if (r7 == 0) goto L_0x04c3
            java.lang.Object r2 = r1.A00
            r0 = 29
            kotlin.jvm.internal.KtLambdaShape34S0100000_I2_14 r8 = X.C86164wN.A0z(r2, r0)
            java.lang.Object r0 = r1.A01
            kotlin.jvm.internal.KtLambdaShape42S0200000_I2_3 r9 = new kotlin.jvm.internal.KtLambdaShape42S0200000_I2_3
            r9.<init>((int) r3, (java.lang.Object) r2, (java.lang.Object) r0)
            X.7Wm r0 = androidx.compose.ui.Modifier.A00
            androidx.compose.ui.Modifier r5 = X.AnonymousClass7FI.A01(r0)
            r6 = 0
            r10 = 0
            r11 = 16
            X.C117746zB.A00(r4, r5, r6, r7, r8, r9, r10, r11)
            goto L_0x002e
        L_0x022c:
            X.7Zx r0 = (X.C123917Zx) r0
            X.8nY r3 = X.C86104wH.A0H(r14, r4)
            r2 = 1
            X.C04220Ms.A0B(r0, r2)
            android.os.Bundle r2 = r0.A06
            if (r2 == 0) goto L_0x04d1
            java.lang.String r0 = "postId"
            java.lang.String r7 = r2.getString(r0)
            if (r7 == 0) goto L_0x04d1
            java.lang.String r0 = "isRepostedBySelf"
            boolean r12 = r2.getBoolean(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r12)
            if (r0 == 0) goto L_0x04ca
            java.lang.Object r2 = r1.A01
            r0 = 30
            kotlin.jvm.internal.KtLambdaShape152S0100000_I2_7 r9 = X.C86164wN.A0t(r2, r0)
            r0 = 37
            kotlin.jvm.internal.KtLambdaShape34S0100000_I2_14 r8 = X.C86164wN.A0z(r2, r0)
            X.7Wm r0 = androidx.compose.ui.Modifier.A00
            androidx.compose.ui.Modifier r4 = X.AnonymousClass7FI.A01(r0)
            r6 = 0
            java.lang.Object r5 = r1.A00
            X.06E r5 = (X.AnonymousClass06E) r5
            r10 = 2097152(0x200000, float:2.938736E-39)
            r11 = 32
            X.AnonymousClass7JX.A00(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            goto L_0x002e
        L_0x0270:
            X.7Zx r0 = (X.C123917Zx) r0
            X.8nY r3 = X.C86104wH.A0H(r14, r4)
            r2 = 1
            X.C04220Ms.A0B(r0, r2)
            android.os.Bundle r2 = r0.A06
            if (r2 == 0) goto L_0x04d8
            java.lang.String r0 = "userId"
            java.lang.String r7 = r2.getString(r0)
            if (r7 == 0) goto L_0x04d8
            java.lang.Object r2 = r1.A01
            r0 = 39
            kotlin.jvm.internal.KtLambdaShape34S0100000_I2_14 r8 = X.C86164wN.A0z(r2, r0)
            java.lang.Object r5 = r1.A00
            X.06E r5 = (X.AnonymousClass06E) r5
            X.7Wm r0 = androidx.compose.ui.Modifier.A00
            androidx.compose.ui.Modifier r4 = X.AnonymousClass7FI.A01(r0)
            r6 = 0
            r9 = 512(0x200, float:7.175E-43)
            r10 = 16
            X.C117876zO.A01(r3, r4, r5, r6, r7, r8, r9, r10)
            goto L_0x002e
        L_0x02a2:
            X.7Zx r0 = (X.C123917Zx) r0
            X.8nY r3 = X.C86104wH.A0H(r14, r4)
            X.AnonymousClass0wJ.A1N(r2, r0)
            java.lang.Object r7 = r1.A01
            X.0ZU r7 = (X.AnonymousClass0ZU) r7
            java.lang.Object r2 = r1.A00
            r1 = 34
            kotlin.jvm.internal.KtLambdaShape152S0100000_I2_7 r9 = X.C86164wN.A0t(r2, r1)
            r1 = 35
            kotlin.jvm.internal.KtLambdaShape152S0100000_I2_7 r10 = X.C86164wN.A0t(r2, r1)
            r1 = 8
            kotlin.jvm.internal.KtLambdaShape35S0100000_I2_15 r8 = new kotlin.jvm.internal.KtLambdaShape35S0100000_I2_15
            r8.<init>(r2, r1)
            X.7En r5 = X.C123917Zx.A00(r0)
            X.7Wm r4 = androidx.compose.ui.Modifier.A00
            r6 = 0
            r11 = 229376(0x38000, float:3.21424E-40)
            r12 = 64
            X.AnonymousClass7In.A01(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            goto L_0x002e
        L_0x02d5:
            X.8nY r3 = X.C86104wH.A0H(r14, r4)
            java.lang.Object r2 = r1.A00
            r0 = 12
            kotlin.jvm.internal.KtLambdaShape35S0100000_I2_15 r6 = new kotlin.jvm.internal.KtLambdaShape35S0100000_I2_15
            r6.<init>(r2, r0)
            java.lang.Object r7 = r1.A01
            X.0ZU r7 = (X.AnonymousClass0ZU) r7
            r0 = 13
            kotlin.jvm.internal.KtLambdaShape35S0100000_I2_15 r8 = new kotlin.jvm.internal.KtLambdaShape35S0100000_I2_15
            r8.<init>(r2, r0)
            X.7Wm r4 = androidx.compose.ui.Modifier.A00
            r5 = 0
            r9 = 3072(0xc00, float:4.305E-42)
            r10 = 16
            X.C121357Fp.A01(r3, r4, r5, r6, r7, r8, r9, r10)
            goto L_0x002e
        L_0x02f9:
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r14 = (java.lang.String) r14
            boolean r16 = X.AnonymousClass0wJ.A1X(r4)
            boolean r3 = X.AnonymousClass0wJ.A1Y(r2, r0)
            java.lang.Object r6 = r1.A01
            X.57x r6 = (X.C884057x) r6
            java.lang.Object r1 = r1.A00
            java.lang.Object r10 = X.C86104wH.A0f(r1)
            android.content.Context r10 = (android.content.Context) r10
            X.C04220Ms.A0B(r10, r3)
            X.4wG r1 = r6.A0G
            java.lang.Object r1 = r1.getValue()
            X.5Ho r1 = (X.C89925Ho) r1
            java.util.List r1 = r1.A08
            java.util.ArrayList r7 = X.AnonymousClass0wJ.A0v()
            java.util.Iterator r4 = r1.iterator()
        L_0x0326:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L_0x0338
            java.lang.Object r3 = r4.next()
            boolean r1 = r3 instanceof X.C90315Lj
            if (r1 == 0) goto L_0x0326
            r7.add(r3)
            goto L_0x0326
        L_0x0338:
            java.util.Iterator r5 = r7.iterator()
        L_0x033c:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L_0x036b
            java.lang.Object r4 = r5.next()
            r3 = r4
            X.8mY r3 = (X.C146628mY) r3
            boolean r1 = r3 instanceof X.C90315Lj
            if (r1 == 0) goto L_0x033c
            java.lang.String r1 = r3.BGO()
            boolean r1 = X.C04220Ms.A0I(r1, r0)
            if (r1 == 0) goto L_0x033c
        L_0x0357:
            int r15 = r7.indexOf(r4)
            X.64o r1 = r6.A06
            X.9BI r0 = r1.A02(r2)
            if (r0 == 0) goto L_0x002e
            X.BKU r11 = r0.A05
            com.instagram.service.session.UserSession r13 = r1.A02
            X.C2o r12 = r1.A01
            goto L_0x040e
        L_0x036b:
            r4 = 0
            goto L_0x0357
        L_0x036d:
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r14 = (java.lang.String) r14
            boolean r16 = X.AnonymousClass0wJ.A1X(r4)
            boolean r3 = X.AnonymousClass0wJ.A1Y(r2, r0)
            java.lang.Object r6 = r1.A01
            com.instagram.barcelona.profile.ui.ProfileViewModel r6 = (com.instagram.barcelona.profile.ui.ProfileViewModel) r6
            java.lang.Object r1 = r1.A00
            java.lang.Object r10 = X.C86104wH.A0f(r1)
            android.content.Context r10 = (android.content.Context) r10
            X.C04220Ms.A0B(r10, r3)
            X.4wG r5 = r6.A0L
            java.lang.Object r1 = r5.getValue()
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0510000_I2 r1 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0510000_I2) r1
            java.lang.Object r3 = r1.A04
            java.util.Map r3 = (java.util.Map) r3
            java.lang.Object r1 = r5.getValue()
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0510000_I2 r1 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0510000_I2) r1
            java.lang.Object r1 = r1.A03
            java.lang.Object r1 = r3.get(r1)
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0100000_I2 r1 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0100000_I2) r1
            r8 = 0
            if (r1 == 0) goto L_0x04df
            java.lang.Object r1 = r1.A00
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            if (r1 == 0) goto L_0x04df
            java.util.ArrayList r7 = X.AnonymousClass0wJ.A0v()
            java.util.Iterator r4 = r1.iterator()
        L_0x03b3:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L_0x03cc
            java.lang.Object r3 = r4.next()
            r1 = r3
            X.5HK r1 = (X.AnonymousClass5HK) r1
            if (r1 == 0) goto L_0x03b3
            X.8mY r1 = r1.A00
            boolean r1 = r1 instanceof X.C90315Lj
            if (r1 == 0) goto L_0x03b3
            r7.add(r3)
            goto L_0x03b3
        L_0x03cc:
            java.util.Iterator r9 = r7.iterator()
        L_0x03d0:
            boolean r1 = r9.hasNext()
            if (r1 == 0) goto L_0x03f0
            java.lang.Object r4 = r9.next()
            r1 = r4
            X.5HK r1 = (X.AnonymousClass5HK) r1
            if (r1 == 0) goto L_0x03d0
            X.8mY r3 = r1.A00
            boolean r1 = r3 instanceof X.C90315Lj
            if (r1 == 0) goto L_0x03d0
            java.lang.String r1 = r3.BGO()
            boolean r1 = X.C04220Ms.A0I(r1, r0)
            if (r1 == 0) goto L_0x03d0
            r8 = r4
        L_0x03f0:
            int r15 = r7.indexOf(r8)
            X.7y5 r3 = r6.A06
            java.lang.Object r0 = r5.getValue()
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0510000_I2 r0 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0510000_I2) r0
            java.lang.Object r1 = r0.A03
            X.66y r1 = (X.C968566y) r1
            r0 = 5
            X.C04220Ms.A0B(r1, r0)
            X.BKU r11 = r3.A02(r1, r2)
            if (r11 == 0) goto L_0x002e
            com.instagram.service.session.UserSession r13 = r3.A05
            X.C2o r12 = r3.A04
        L_0x040e:
            X.AnonymousClass6N3.A00(r10, r11, r12, r13, r14, r15, r16)
            goto L_0x002e
        L_0x0413:
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r14 = (java.lang.String) r14
            boolean r3 = X.AnonymousClass0wJ.A1X(r4)
            X.AnonymousClass0wJ.A1N(r2, r0)
            if (r3 == 0) goto L_0x046d
            java.lang.Object r0 = r1.A01
            com.instagram.barcelona.profile.ui.ProfileViewModel r0 = (com.instagram.barcelona.profile.ui.ProfileViewModel) r0
            com.instagram.service.session.UserSession r7 = r0.A0D
            X.C2o r6 = r0.A0C
        L_0x042a:
            X.BKU r5 = X.C86114wI.A0W(r7, r2)
            if (r5 == 0) goto L_0x0464
            X.0ik r3 = new X.0ik
            r3.<init>(r7)
            r3.A00 = r6
            X.0il r0 = X.C10690il.A03
            r3.A01 = r0
            X.0nS r4 = r3.A00()
            r8 = 0
            r0 = 109(0x6d, float:1.53E-43)
            java.lang.String r11 = X.I17.A00(r0)
            java.lang.Integer r10 = X.C86144wL.A0b()
            r9 = r8
            X.BK1 r3 = X.C19541Ay2.A01(r5, r6, r7, r8, r9, r10, r11)
            if (r3 == 0) goto L_0x0464
            X.BKN r0 = r5.A0f
            com.instagram.user.model.User r0 = r0.A1i
            if (r0 == 0) goto L_0x0461
            X.D0g r0 = r0.A03
            if (r0 == 0) goto L_0x0461
            java.lang.String r0 = X.C19527Axo.A03(r0)
            r3.A3u = r0
        L_0x0461:
            X.J1Y.A00(r4, r3, r6)
        L_0x0464:
            java.lang.Object r0 = r1.A00
            X.8ma r0 = (X.C146638ma) r0
            r0.BhK(r2, r14)
            goto L_0x002e
        L_0x046d:
            java.lang.Object r1 = r1.A00
            X.8ma r1 = (X.C146638ma) r1
            r1.Bh6(r0)
            goto L_0x002e
        L_0x0476:
            X.8nY r3 = X.C86104wH.A0H(r14, r4)
            java.lang.Object r2 = r1.A00
            r0 = 25
            kotlin.jvm.internal.KtLambdaShape37S0100000_I2_17 r6 = X.C86154wM.A14(r2, r0)
            java.lang.Object r8 = r1.A01
            X.0YP r8 = (X.AnonymousClass0YP) r8
            X.7Wm r0 = androidx.compose.ui.Modifier.A00
            androidx.compose.ui.Modifier r4 = X.AnonymousClass7FI.A02(r0)
            r0 = 26
            kotlin.jvm.internal.KtLambdaShape37S0100000_I2_17 r7 = X.C86154wM.A14(r2, r0)
            r5 = 0
            r9 = 0
            r10 = 16
            X.C117906zR.A00(r3, r4, r5, r6, r7, r8, r9, r10)
            goto L_0x002e
        L_0x049b:
            X.8nY r4 = X.C86104wH.A0H(r14, r4)
            java.lang.Object r3 = r1.A00
            r2 = 31
            kotlin.jvm.internal.KtLambdaShape37S0100000_I2_17 r7 = X.C86154wM.A14(r3, r2)
            java.lang.Object r0 = r1.A01
            kotlin.jvm.internal.KtLambdaShape20S0200000_I2_4 r8 = X.C86164wN.A0y(r3, r0, r2)
            X.7Wm r0 = androidx.compose.ui.Modifier.A00
            androidx.compose.ui.Modifier r5 = X.AnonymousClass7FI.A02(r0)
            r6 = 0
            r9 = 0
            r10 = 8
            X.C100576Nv.A00(r4, r5, r6, r7, r8, r9, r10)
            goto L_0x002e
        L_0x04bc:
            java.lang.String r0 = "Required value was null."
            java.lang.IllegalArgumentException r0 = X.C18190wL.A0a(r0)
            throw r0
        L_0x04c3:
            java.lang.String r0 = "Required value was null."
            java.lang.IllegalArgumentException r0 = X.C18190wL.A0a(r0)
            throw r0
        L_0x04ca:
            java.lang.String r0 = "Required value was null."
            java.lang.IllegalArgumentException r0 = X.C18190wL.A0a(r0)
            throw r0
        L_0x04d1:
            java.lang.String r0 = "Required value was null."
            java.lang.IllegalArgumentException r0 = X.C18190wL.A0a(r0)
            throw r0
        L_0x04d8:
            java.lang.String r0 = "Required value was null."
            java.lang.IllegalArgumentException r0 = X.C18190wL.A0a(r0)
            throw r0
        L_0x04df:
            java.lang.String r0 = "Required value was null."
            java.lang.IllegalArgumentException r0 = X.C18190wL.A0a(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.KtLambdaShape51S0200000_I2.invoke(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
