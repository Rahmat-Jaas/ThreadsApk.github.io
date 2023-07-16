package kotlin.jvm.internal;

import X.AnonymousClass0YC;
import X.C02220Ah;

public class KtLambdaShape173S0100000_I2 extends C02220Ah implements AnonymousClass0YC {
    public Object A00;
    public final int A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtLambdaShape173S0100000_I2(Object obj, int i) {
        super(4);
        this.A01 = i;
        this.A00 = obj;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0522, code lost:
        X.AnonymousClass6N5.A00(r3, androidx.compose.ui.Modifier.A05(androidx.compose.ui.Modifier.A00), (X.C882357g) null, r6, r7, X.C86164wN.A0t(r1, r0), 3072, 16);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0048, code lost:
        return kotlin.Unit.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x06f7, code lost:
        r14.CuJ();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x039a, code lost:
        r11 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x039b, code lost:
        X.C121367Fq.A01(r3, (androidx.compose.ui.Modifier) null, (X.AnonymousClass582) null, r6, r7, r8, 3072, 48, r11);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r25, java.lang.Object r26, java.lang.Object r27, java.lang.Object r28) {
        /*
            r24 = this;
            r2 = r24
            r13 = r28
            r14 = r27
            r1 = r25
            r0 = r26
            int r3 = r2.A01
            switch(r3) {
                case 0: goto L_0x0681;
                case 1: goto L_0x06ac;
                case 2: goto L_0x0681;
                case 3: goto L_0x0659;
                case 4: goto L_0x0717;
                case 5: goto L_0x06fc;
                case 6: goto L_0x063b;
                case 7: goto L_0x05df;
                case 8: goto L_0x05b7;
                case 9: goto L_0x057a;
                case 10: goto L_0x0536;
                case 11: goto L_0x0502;
                case 12: goto L_0x04d4;
                case 13: goto L_0x0484;
                case 14: goto L_0x046c;
                case 15: goto L_0x0452;
                case 16: goto L_0x0438;
                case 17: goto L_0x0418;
                case 18: goto L_0x03dc;
                case 19: goto L_0x03ba;
                case 20: goto L_0x03a6;
                case 21: goto L_0x0382;
                case 22: goto L_0x034d;
                case 23: goto L_0x0320;
                case 24: goto L_0x02f9;
                case 25: goto L_0x02db;
                case 26: goto L_0x022b;
                case 27: goto L_0x0216;
                case 28: goto L_0x01fc;
                case 29: goto L_0x01d3;
                case 30: goto L_0x01a6;
                case 31: goto L_0x018c;
                case 32: goto L_0x0172;
                case 33: goto L_0x0155;
                case 34: goto L_0x00dd;
                case 35: goto L_0x0083;
                case 36: goto L_0x0049;
                default: goto L_0x000f;
            }
        L_0x000f:
            X.6Ub r0 = (X.C102166Ub) r0
            X.8nY r5 = X.C86104wH.A0H(r14, r13)
            r10 = 0
            X.C04220Ms.A0B(r1, r10)
            java.lang.String r1 = "null cannot be cast to non-null type com.instagram.save.model.AudioListItem.AudioTrackItem"
            X.C04220Ms.A0C(r0, r1)
            X.CsR r0 = (X.C23447CsR) r0
            com.instagram.clips.model.metadata.AudioPageMetadata r1 = r0.A00
            if (r1 == 0) goto L_0x0046
            com.instagram.common.typedurl.ImageUrl r7 = r1.A01
            if (r7 == 0) goto L_0x0046
            java.lang.String r8 = r1.A0M
            if (r8 == 0) goto L_0x0046
            java.lang.String r9 = r1.A07
            if (r9 == 0) goto L_0x0046
            X.7Wm r1 = androidx.compose.ui.Modifier.A00
            androidx.compose.ui.Modifier r4 = androidx.compose.ui.Modifier.A04(r1)
            java.lang.Object r3 = r2.A00
            r2 = 41
            kotlin.jvm.internal.KtLambdaShape33S0200000_I2_17 r1 = new kotlin.jvm.internal.KtLambdaShape33S0200000_I2_17
            r1.<init>(r2, r0, r3)
            androidx.compose.ui.Modifier r6 = X.AnonymousClass7HZ.A03(r4, r1, r10)
            X.AnonymousClass7I0.A01(r5, r6, r7, r8, r9, r10)
        L_0x0046:
            kotlin.Unit r1 = kotlin.Unit.A00
            return r1
        L_0x0049:
            int r4 = X.AnonymousClass0wJ.A04(r0)
            X.8nY r14 = (X.C147188nY) r14
            int r3 = X.AnonymousClass0wJ.A04(r13)
            int r0 = X.C86124wJ.A0G(r1, r3)
            if (r0 != 0) goto L_0x0081
            int r1 = X.C147188nY.A0F(r14, r1)
            r1 = r1 | r3
        L_0x005e:
            r0 = r3 & 112(0x70, float:1.57E-43)
            if (r0 != 0) goto L_0x0067
            int r0 = X.C147188nY.A04(r14, r4)
            r1 = r1 | r0
        L_0x0067:
            r1 = r1 & 731(0x2db, float:1.024E-42)
            r0 = 146(0x92, float:2.05E-43)
            if (r1 != r0) goto L_0x0073
            boolean r0 = r14.BCM()
            if (r0 != 0) goto L_0x06f7
        L_0x0073:
            java.lang.Object r0 = r2.A00
            java.lang.Object r1 = X.C86124wJ.A0p(r0, r4)
            X.5Hd r1 = (X.AnonymousClass5Hd) r1
            r0 = 8
            X.AnonymousClass71S.A01(r14, r1, r0)
            goto L_0x0046
        L_0x0081:
            r1 = r3
            goto L_0x005e
        L_0x0083:
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0200000_I2 r0 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0200000_I2) r0
            X.8nY r6 = X.C86104wH.A0H(r14, r13)
            r3 = 0
            X.C04220Ms.A0B(r1, r3)
            if (r0 == 0) goto L_0x0046
            java.lang.Object r5 = r0.A01
            com.instagram.user.model.User r5 = (com.instagram.user.model.User) r5
            if (r5 == 0) goto L_0x0046
            com.instagram.common.typedurl.ImageUrl r8 = r5.B4M()
            java.lang.String r11 = r5.BK7()
            java.lang.String r12 = r5.Ak1()
            java.lang.Object r0 = r0.A00
            com.instagram.user.model.User r0 = (com.instagram.user.model.User) r0
            if (r0 == 0) goto L_0x00db
            r1 = 2131828085(0x7f111d75, float:1.92891E38)
            java.lang.String r0 = r0.BK7()
            java.lang.String r13 = X.AnonymousClass7JS.A02(r6, r0, r1)
        L_0x00b2:
            X.5I7 r10 = X.AnonymousClass5I7.A05
            r7 = 0
            r4 = -1704518581(0xffffffff9a671c4b, float:-4.7792535E-23)
            java.lang.Object r2 = r2.A00
            r1 = 29
            kotlin.jvm.internal.KtLambdaShape50S0200000_I2 r0 = new kotlin.jvm.internal.KtLambdaShape50S0200000_I2
            r0.<init>(r1, r5, r2)
            X.8sI r16 = X.AnonymousClass7JR.A00(r6, r0, r4)
            r18 = 3072(0xc00, float:4.305E-42)
            r19 = 7652(0x1de4, float:1.0723E-41)
            r9 = r7
            r14 = r7
            r15 = r7
            r17 = r3
            r20 = r3
            r21 = r3
            r22 = r3
            r23 = r3
            X.C121747Hv.A00(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            goto L_0x0046
        L_0x00db:
            r13 = 0
            goto L_0x00b2
        L_0x00dd:
            int r6 = X.AnonymousClass0wJ.A04(r0)
            X.8nY r14 = (X.C147188nY) r14
            int r3 = X.AnonymousClass0wJ.A04(r13)
            r4 = 0
            X.C04220Ms.A0B(r1, r4)
            r0 = r3 & 14
            if (r0 != 0) goto L_0x0153
            int r5 = X.C147188nY.A0F(r14, r1)
            r5 = r5 | r3
        L_0x00f4:
            r0 = r3 & 112(0x70, float:1.57E-43)
            r3 = 16
            if (r0 != 0) goto L_0x00ff
            int r0 = X.C147188nY.A04(r14, r6)
            r5 = r5 | r0
        L_0x00ff:
            r1 = r5 & 731(0x2db, float:1.024E-42)
            r0 = 146(0x92, float:2.05E-43)
            if (r1 != r0) goto L_0x010b
            boolean r0 = r14.BCM()
            if (r0 != 0) goto L_0x06f7
        L_0x010b:
            java.lang.Object r0 = r2.A00
            java.lang.Object r2 = X.C86124wJ.A0p(r0, r6)
            r1 = r5 & 14
            kotlin.Pair r2 = (kotlin.Pair) r2
            r0 = 2073619643(0x7b98ecbb, float:1.5880612E36)
            r14.Cvb(r0)
            r0 = r1 & 81
            if (r0 != r3) goto L_0x012d
            boolean r0 = r14.BCM()
            if (r0 == 0) goto L_0x012d
            r14.CuJ()
        L_0x0128:
            X.AnonymousClass7W3.A0z(r14, r4)
            goto L_0x0046
        L_0x012d:
            java.lang.Object r0 = r2.A00
            int r3 = X.AnonymousClass0wJ.A04(r0)
            java.lang.Object r0 = r2.A01
            int r0 = X.AnonymousClass0wJ.A04(r0)
            java.lang.String r2 = X.AnonymousClass7JS.A01(r14, r0)
            r1 = 1
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape3S1000000_I2 r0 = new com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape3S1000000_I2
            r0.<init>(r2, r1)
            X.6uo r15 = X.AnonymousClass6QP.A00(r14, r3)
            r17 = 64
            r18 = 4
            r19 = r4
            r16 = r0
            X.AnonymousClass6QU.A00(r14, r15, r16, r17, r18, r19)
            goto L_0x0128
        L_0x0153:
            r5 = r3
            goto L_0x00f4
        L_0x0155:
            X.8nY r3 = X.C86104wH.A0H(r14, r13)
            java.lang.Object r1 = r2.A00
            r0 = 34
            kotlin.jvm.internal.KtLambdaShape37S0100000_I2_17 r7 = X.C86154wM.A14(r1, r0)
            X.7Wm r0 = androidx.compose.ui.Modifier.A00
            androidx.compose.ui.Modifier r4 = X.AnonymousClass7FI.A02(r0)
            r2 = 0
            r8 = 0
            r9 = 28
            r5 = r2
            r6 = r2
            X.C100506No.A00(r2, r3, r4, r5, r6, r7, r8, r9)
            goto L_0x0046
        L_0x0172:
            X.8nY r3 = X.C86104wH.A0H(r14, r13)
            java.lang.Object r1 = r2.A00
            r0 = 33
            kotlin.jvm.internal.KtLambdaShape37S0100000_I2_17 r6 = X.C86154wM.A14(r1, r0)
            X.7Wm r0 = androidx.compose.ui.Modifier.A00
            androidx.compose.ui.Modifier r4 = X.AnonymousClass7FI.A02(r0)
            r5 = 0
            r7 = 0
            r8 = 4
            X.C117896zQ.A00(r3, r4, r5, r6, r7, r8)
            goto L_0x0046
        L_0x018c:
            X.8nY r3 = X.C86104wH.A0H(r14, r13)
            java.lang.Object r1 = r2.A00
            r0 = 32
            kotlin.jvm.internal.KtLambdaShape37S0100000_I2_17 r6 = X.C86154wM.A14(r1, r0)
            X.7Wm r0 = androidx.compose.ui.Modifier.A00
            androidx.compose.ui.Modifier r4 = X.AnonymousClass7FI.A02(r0)
            r5 = 0
            r7 = 0
            r8 = 4
            X.C117886zP.A00(r3, r4, r5, r6, r7, r8)
            goto L_0x0046
        L_0x01a6:
            X.8nY r3 = X.C86104wH.A0H(r14, r13)
            java.lang.Object r1 = r2.A00
            r0 = 27
            kotlin.jvm.internal.KtLambdaShape37S0100000_I2_17 r6 = X.C86154wM.A14(r1, r0)
            r0 = 28
            kotlin.jvm.internal.KtLambdaShape37S0100000_I2_17 r7 = X.C86154wM.A14(r1, r0)
            r0 = 29
            kotlin.jvm.internal.KtLambdaShape37S0100000_I2_17 r8 = X.C86154wM.A14(r1, r0)
            r0 = 30
            kotlin.jvm.internal.KtLambdaShape37S0100000_I2_17 r9 = X.C86154wM.A14(r1, r0)
            X.7Wm r0 = androidx.compose.ui.Modifier.A00
            androidx.compose.ui.Modifier r4 = X.AnonymousClass7FI.A02(r0)
            r5 = 0
            r10 = 0
            r11 = 32
            X.C100516Np.A00(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            goto L_0x0046
        L_0x01d3:
            X.8nY r3 = X.C86104wH.A0H(r14, r13)
            java.lang.Object r1 = r2.A00
            r0 = 22
            kotlin.jvm.internal.KtLambdaShape37S0100000_I2_17 r7 = X.C86154wM.A14(r1, r0)
            r0 = 23
            kotlin.jvm.internal.KtLambdaShape37S0100000_I2_17 r8 = X.C86154wM.A14(r1, r0)
            r0 = 24
            kotlin.jvm.internal.KtLambdaShape37S0100000_I2_17 r9 = X.C86154wM.A14(r1, r0)
            X.7Wm r0 = androidx.compose.ui.Modifier.A00
            androidx.compose.ui.Modifier r4 = X.AnonymousClass7FI.A02(r0)
            r2 = 0
            r10 = 0
            r11 = 112(0x70, float:1.57E-43)
            r5 = r2
            r6 = r2
            X.C100556Nt.A00(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            goto L_0x0046
        L_0x01fc:
            X.8nY r3 = X.C86104wH.A0H(r14, r13)
            java.lang.Object r1 = r2.A00
            r0 = 19
            kotlin.jvm.internal.KtLambdaShape37S0100000_I2_17 r6 = X.C86154wM.A14(r1, r0)
            r0 = 20
            kotlin.jvm.internal.KtLambdaShape37S0100000_I2_17 r7 = X.C86154wM.A14(r1, r0)
            r0 = 21
            kotlin.jvm.internal.KtLambdaShape37S0100000_I2_17 r8 = X.C86154wM.A14(r1, r0)
            goto L_0x039a
        L_0x0216:
            X.8nY r4 = X.C86104wH.A0H(r14, r13)
            java.lang.Object r1 = r2.A00
            r0 = 22
            kotlin.jvm.internal.KtLambdaShape35S0100000_I2_15 r3 = new kotlin.jvm.internal.KtLambdaShape35S0100000_I2_15
            r3.<init>(r1, r0)
            r2 = 0
            r1 = 0
            r0 = 2
            X.C117826zJ.A01(r4, r2, r3, r1, r0)
            goto L_0x0046
        L_0x022b:
            X.7Zx r0 = (X.C123917Zx) r0
            X.8nY r5 = X.C86104wH.A0H(r14, r13)
            r1 = 1
            X.C04220Ms.A0B(r0, r1)
            android.os.Bundle r4 = r0.A06
            if (r4 == 0) goto L_0x0759
            java.lang.String r3 = "infoType"
            java.lang.String r1 = r4.getString(r3)
            if (r1 == 0) goto L_0x0759
            java.lang.String r0 = "Following"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0264
            r0 = -1794162936(0xffffffff950f3f08, float:-2.8928343E-26)
            r5.Cvb(r0)
            java.lang.Object r1 = r2.A00
            r0 = 17
            kotlin.jvm.internal.KtLambdaShape35S0100000_I2_15 r8 = new kotlin.jvm.internal.KtLambdaShape35S0100000_I2_15
            r8.<init>(r1, r0)
            r6 = 0
            r9 = 0
            r10 = 6
            r7 = r6
            X.C121857Im.A03(r5, r6, r7, r8, r9, r10)
        L_0x025f:
            X.AnonymousClass7W3.A0y(r5)
            goto L_0x0046
        L_0x0264:
            java.lang.String r0 = "SuggestedFollowing"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0294
            r0 = -1794162793(0xffffffff950f3f97, float:-2.8928784E-26)
            r5.Cvb(r0)
            java.lang.Object r1 = r2.A00
            r0 = 18
            kotlin.jvm.internal.KtLambdaShape35S0100000_I2_15 r8 = new kotlin.jvm.internal.KtLambdaShape35S0100000_I2_15
            r8.<init>(r1, r0)
            r0 = 19
            kotlin.jvm.internal.KtLambdaShape35S0100000_I2_15 r9 = new kotlin.jvm.internal.KtLambdaShape35S0100000_I2_15
            r9.<init>(r1, r0)
            r0 = 20
            kotlin.jvm.internal.KtLambdaShape35S0100000_I2_15 r10 = new kotlin.jvm.internal.KtLambdaShape35S0100000_I2_15
            r10.<init>(r1, r0)
            r13 = 0
            r6 = 0
            r11 = 3072(0xc00, float:4.305E-42)
            r12 = 48
            r7 = r6
            X.C121367Fq.A01(r5, r6, r7, r8, r9, r10, r11, r12, r13)
            goto L_0x025f
        L_0x0294:
            r0 = -1794162453(0xffffffff950f40eb, float:-2.892983E-26)
            r5.Cvb(r0)
            java.lang.Object r1 = r2.A00
            r0 = 21
            kotlin.jvm.internal.KtLambdaShape35S0100000_I2_15 r9 = new kotlin.jvm.internal.KtLambdaShape35S0100000_I2_15
            r9.<init>(r1, r0)
            java.lang.String r8 = r4.getString(r3)
            if (r8 == 0) goto L_0x0752
            X.7Wm r0 = androidx.compose.ui.Modifier.A00
            androidx.compose.ui.Modifier r0 = X.AnonymousClass7FI.A01(r0)
            androidx.compose.ui.Modifier r6 = X.AnonymousClass7FI.A00(r0)
            com.instagram.service.session.UserSession r0 = X.AnonymousClass7CZ.A00(r5)
            X.7am r13 = new X.7am
            r13.<init>(r0)
            X.06C r14 = X.AnonymousClass7CD.A00(r5)
            if (r14 == 0) goto L_0x074b
            r17 = 0
            X.6o9 r15 = X.C86104wH.A0J(r14)
            java.lang.Class<java.lang.Object> r16 = java.lang.Object.class
            r11 = 0
            r12 = r5
            X.3ak r7 = X.C98396Fj.A00(r12, r13, r14, r15, r16, r17)
            X.AnonymousClass7W3.A0z(r5, r11)
            X.8mS r7 = (X.C146568mS) r7
            r10 = 4096(0x1000, float:5.74E-42)
            X.C121867Io.A01(r5, r6, r7, r8, r9, r10, r11)
            goto L_0x025f
        L_0x02db:
            X.8nY r3 = X.C86104wH.A0H(r14, r13)
            java.lang.Object r1 = r2.A00
            r0 = 14
            kotlin.jvm.internal.KtLambdaShape35S0100000_I2_15 r6 = new kotlin.jvm.internal.KtLambdaShape35S0100000_I2_15
            r6.<init>(r1, r0)
            r0 = 15
            kotlin.jvm.internal.KtLambdaShape35S0100000_I2_15 r7 = new kotlin.jvm.internal.KtLambdaShape35S0100000_I2_15
            r7.<init>(r1, r0)
            r0 = 16
            kotlin.jvm.internal.KtLambdaShape35S0100000_I2_15 r8 = new kotlin.jvm.internal.KtLambdaShape35S0100000_I2_15
            r8.<init>(r1, r0)
            r11 = 0
            goto L_0x039b
        L_0x02f9:
            X.8nY r3 = X.C86104wH.A0H(r14, r13)
            java.lang.Object r1 = r2.A00
            r0 = 9
            kotlin.jvm.internal.KtLambdaShape35S0100000_I2_15 r6 = new kotlin.jvm.internal.KtLambdaShape35S0100000_I2_15
            r6.<init>(r1, r0)
            r0 = 10
            kotlin.jvm.internal.KtLambdaShape35S0100000_I2_15 r7 = new kotlin.jvm.internal.KtLambdaShape35S0100000_I2_15
            r7.<init>(r1, r0)
            r0 = 11
            kotlin.jvm.internal.KtLambdaShape35S0100000_I2_15 r8 = new kotlin.jvm.internal.KtLambdaShape35S0100000_I2_15
            r8.<init>(r1, r0)
            X.7Wm r4 = androidx.compose.ui.Modifier.A00
            r5 = 0
            r9 = 3072(0xc00, float:4.305E-42)
            r10 = 16
            X.C121347Fo.A01(r3, r4, r5, r6, r7, r8, r9, r10)
            goto L_0x0046
        L_0x0320:
            X.7Zx r0 = (X.C123917Zx) r0
            X.8nY r3 = X.C86104wH.A0H(r14, r13)
            r1 = 1
            X.C04220Ms.A0B(r0, r1)
            android.os.Bundle r1 = r0.A06
            if (r1 == 0) goto L_0x0760
            java.lang.String r0 = "postId"
            java.lang.String r6 = r1.getString(r0)
            if (r6 == 0) goto L_0x0760
            java.lang.Object r1 = r2.A00
            r0 = 40
            kotlin.jvm.internal.KtLambdaShape34S0100000_I2_14 r7 = X.C86164wN.A0z(r1, r0)
            X.7Wm r0 = androidx.compose.ui.Modifier.A00
            androidx.compose.ui.Modifier r4 = X.AnonymousClass7FI.A01(r0)
            r5 = 0
            r8 = 0
            r9 = 8
            X.C100176Mh.A00(r3, r4, r5, r6, r7, r8, r9)
            goto L_0x0046
        L_0x034d:
            X.7Zx r0 = (X.C123917Zx) r0
            X.8nY r3 = X.C86104wH.A0H(r14, r13)
            r1 = 1
            X.C04220Ms.A0B(r0, r1)
            android.os.Bundle r1 = r0.A06
            if (r1 == 0) goto L_0x076e
            java.lang.String r0 = "postId"
            java.lang.String r6 = r1.getString(r0)
            if (r6 == 0) goto L_0x076e
            java.lang.String r0 = "source_module"
            java.lang.String r7 = r1.getString(r0)
            if (r7 == 0) goto L_0x0767
            java.lang.Object r1 = r2.A00
            r0 = 38
            kotlin.jvm.internal.KtLambdaShape34S0100000_I2_14 r8 = X.C86164wN.A0z(r1, r0)
            X.7Wm r0 = androidx.compose.ui.Modifier.A00
            androidx.compose.ui.Modifier r4 = X.AnonymousClass7FI.A01(r0)
            r5 = 0
            r9 = 0
            r10 = 16
            X.C117926zT.A01(r3, r4, r5, r6, r7, r8, r9, r10)
            goto L_0x0046
        L_0x0382:
            X.8nY r3 = X.C86104wH.A0H(r14, r13)
            java.lang.Object r1 = r2.A00
            r0 = 34
            kotlin.jvm.internal.KtLambdaShape34S0100000_I2_14 r6 = X.C86164wN.A0z(r1, r0)
            r0 = 35
            kotlin.jvm.internal.KtLambdaShape34S0100000_I2_14 r7 = X.C86164wN.A0z(r1, r0)
            r0 = 36
            kotlin.jvm.internal.KtLambdaShape34S0100000_I2_14 r8 = X.C86164wN.A0z(r1, r0)
        L_0x039a:
            r11 = 1
        L_0x039b:
            r4 = 0
            r9 = 3072(0xc00, float:4.305E-42)
            r10 = 48
            r5 = r4
            X.C121367Fq.A01(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            goto L_0x0046
        L_0x03a6:
            X.8nY r4 = X.C86104wH.A0H(r14, r13)
            java.lang.Object r1 = r2.A00
            r0 = 33
            kotlin.jvm.internal.KtLambdaShape34S0100000_I2_14 r3 = X.C86164wN.A0z(r1, r0)
            r2 = 0
            r1 = 0
            r0 = 2
            X.C100596Nx.A00(r4, r2, r3, r1, r0)
            goto L_0x0046
        L_0x03ba:
            X.7Zx r0 = (X.C123917Zx) r0
            X.8nY r3 = X.C86104wH.A0H(r14, r13)
            r1 = 1
            X.C04220Ms.A0B(r0, r1)
            android.os.Bundle r1 = r0.A06
            if (r1 == 0) goto L_0x0775
            java.lang.String r0 = "postId"
            java.lang.String r6 = r1.getString(r0)
            if (r6 == 0) goto L_0x0775
            java.lang.Object r1 = r2.A00
            r0 = 32
            kotlin.jvm.internal.KtLambdaShape34S0100000_I2_14 r7 = X.C86164wN.A0z(r1, r0)
            r0 = 29
            goto L_0x0522
        L_0x03dc:
            X.7Zx r0 = (X.C123917Zx) r0
            X.8nY r3 = X.C86104wH.A0H(r14, r13)
            r1 = 1
            X.C04220Ms.A0B(r0, r1)
            android.os.Bundle r1 = r0.A06
            if (r1 == 0) goto L_0x077c
            java.lang.String r0 = "userId"
            java.lang.String r6 = r1.getString(r0)
            if (r6 == 0) goto L_0x077c
            X.7Wm r0 = androidx.compose.ui.Modifier.A00
            r5 = 0
            androidx.compose.ui.Modifier r4 = androidx.compose.ui.Modifier.A05(r0)
            java.lang.Object r1 = r2.A00
            r0 = 30
            kotlin.jvm.internal.KtLambdaShape34S0100000_I2_14 r8 = X.C86164wN.A0z(r1, r0)
            r0 = 28
            kotlin.jvm.internal.KtLambdaShape152S0100000_I2_7 r11 = X.C86164wN.A0t(r1, r0)
            r0 = 31
            kotlin.jvm.internal.KtLambdaShape34S0100000_I2_14 r9 = X.C86164wN.A0z(r1, r0)
            r12 = 48
            r13 = 224(0xe0, float:3.14E-43)
            r7 = r5
            r10 = r5
            X.C122107Kg.A05(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            goto L_0x0046
        L_0x0418:
            X.8nY r3 = X.C86104wH.A0H(r14, r13)
            java.lang.Object r1 = r2.A00
            r0 = 18
            kotlin.jvm.internal.KtLambdaShape152S0100000_I2_7 r7 = X.C86164wN.A0t(r1, r0)
            X.5I9 r0 = X.AnonymousClass5I9.A09
            X.8pE r4 = r0.A03
            X.7Wm r0 = androidx.compose.ui.Modifier.A00
            r6 = 0
            androidx.compose.ui.Modifier r5 = androidx.compose.ui.Modifier.A05(r0)
            r8 = 432(0x1b0, float:6.05E-43)
            r9 = 8
            X.C100486Nm.A00(r3, r4, r5, r6, r7, r8, r9)
            goto L_0x0046
        L_0x0438:
            X.8nY r1 = X.C86104wH.A0H(r14, r13)
            java.lang.Object r4 = r2.A00
            X.7oz r4 = (X.C130247oz) r4
            X.5I9 r0 = X.AnonymousClass5I9.A07
            X.8pE r2 = r0.A03
            r0 = 0
            r8 = 48
            r9 = 124(0x7c, float:1.74E-43)
            r3 = r0
            r5 = r0
            r6 = r0
            r7 = r0
            X.AnonymousClass6N2.A00(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
            goto L_0x0046
        L_0x0452:
            X.8nY r3 = X.C86104wH.A0H(r14, r13)
            java.lang.Object r1 = r2.A00
            r0 = 16
            kotlin.jvm.internal.KtLambdaShape34S0100000_I2_14 r5 = X.C86164wN.A0z(r1, r0)
            r0 = 17
            kotlin.jvm.internal.KtLambdaShape34S0100000_I2_14 r6 = X.C86164wN.A0z(r1, r0)
            r4 = 0
            r7 = 0
            r8 = 4
            X.AnonymousClass6O4.A00(r3, r4, r5, r6, r7, r8)
            goto L_0x0046
        L_0x046c:
            X.8nY r3 = X.C86104wH.A0H(r14, r13)
            java.lang.Object r1 = r2.A00
            r0 = 15
            kotlin.jvm.internal.KtLambdaShape34S0100000_I2_14 r2 = X.C86164wN.A0z(r1, r0)
            X.7Wm r0 = androidx.compose.ui.Modifier.A00
            androidx.compose.ui.Modifier r1 = X.AnonymousClass7FI.A01(r0)
            r0 = 0
            X.AnonymousClass6NZ.A00(r3, r1, r2, r0)
            goto L_0x0046
        L_0x0484:
            X.7Zx r0 = (X.C123917Zx) r0
            X.8nY r3 = X.C86104wH.A0H(r14, r13)
            r1 = 1
            X.C04220Ms.A0B(r0, r1)
            java.lang.Object r2 = r2.A00
            r1 = 14
            kotlin.jvm.internal.KtLambdaShape34S0100000_I2_14 r7 = X.C86164wN.A0z(r2, r1)
            android.os.Bundle r1 = r0.A06
            if (r1 == 0) goto L_0x078a
            java.lang.String r0 = "infoType"
            java.lang.String r6 = r1.getString(r0)
            if (r6 == 0) goto L_0x078a
            X.7Wm r0 = androidx.compose.ui.Modifier.A00
            androidx.compose.ui.Modifier r0 = X.AnonymousClass7FI.A01(r0)
            androidx.compose.ui.Modifier r4 = X.AnonymousClass7FI.A00(r0)
            com.instagram.service.session.UserSession r0 = X.AnonymousClass7CZ.A00(r3)
            X.7an r11 = new X.7an
            r11.<init>(r0)
            X.06C r12 = X.AnonymousClass7CD.A00(r3)
            if (r12 == 0) goto L_0x0783
            r15 = 0
            X.6o9 r13 = X.C86104wH.A0J(r12)
            java.lang.Class<java.lang.Object> r14 = java.lang.Object.class
            r9 = 0
            r10 = r3
            X.3ak r5 = X.C98396Fj.A00(r10, r11, r12, r13, r14, r15)
            X.AnonymousClass7W3.A0z(r3, r9)
            X.8mS r5 = (X.C146568mS) r5
            r8 = 4096(0x1000, float:5.74E-42)
            X.C121867Io.A01(r3, r4, r5, r6, r7, r8, r9)
            goto L_0x0046
        L_0x04d4:
            X.7Zx r0 = (X.C123917Zx) r0
            X.8nY r4 = X.C86104wH.A0H(r14, r13)
            r1 = 1
            X.C04220Ms.A0B(r0, r1)
            android.os.Bundle r1 = r0.A06
            if (r1 == 0) goto L_0x0791
            java.lang.String r0 = "hasProfilePicture"
            boolean r3 = r1.getBoolean(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            if (r0 == 0) goto L_0x0791
            java.lang.Object r1 = r2.A00
            r0 = 12
            kotlin.jvm.internal.KtLambdaShape152S0100000_I2_7 r2 = X.C86164wN.A0t(r1, r0)
            X.7Wm r0 = androidx.compose.ui.Modifier.A00
            androidx.compose.ui.Modifier r1 = X.AnonymousClass7FI.A01(r0)
            r0 = 0
            X.AnonymousClass6NQ.A00(r4, r1, r2, r0, r3)
            goto L_0x0046
        L_0x0502:
            X.7Zx r0 = (X.C123917Zx) r0
            X.8nY r3 = X.C86104wH.A0H(r14, r13)
            r1 = 1
            X.C04220Ms.A0B(r0, r1)
            android.os.Bundle r1 = r0.A06
            if (r1 == 0) goto L_0x0798
            java.lang.String r0 = "id"
            java.lang.String r6 = r1.getString(r0)
            if (r6 == 0) goto L_0x0798
            java.lang.Object r1 = r2.A00
            r0 = 13
            kotlin.jvm.internal.KtLambdaShape34S0100000_I2_14 r7 = X.C86164wN.A0z(r1, r0)
            r0 = 11
        L_0x0522:
            kotlin.jvm.internal.KtLambdaShape152S0100000_I2_7 r8 = X.C86164wN.A0t(r1, r0)
            X.7Wm r0 = androidx.compose.ui.Modifier.A00
            r5 = 0
            androidx.compose.ui.Modifier r4 = androidx.compose.ui.Modifier.A05(r0)
            r9 = 3072(0xc00, float:4.305E-42)
            r10 = 16
            X.AnonymousClass6N5.A00(r3, r4, r5, r6, r7, r8, r9, r10)
            goto L_0x0046
        L_0x0536:
            X.7Zx r0 = (X.C123917Zx) r0
            X.8nY r3 = X.C86104wH.A0H(r14, r13)
            r1 = 1
            X.C04220Ms.A0B(r0, r1)
            android.os.Bundle r1 = r0.A06
            if (r1 == 0) goto L_0x079f
            java.lang.String r0 = "userId"
            java.lang.String r6 = r1.getString(r0)
            if (r6 == 0) goto L_0x079f
            java.lang.String r0 = "activeTab"
            java.lang.String r7 = r1.getString(r0)
            X.7Wm r0 = androidx.compose.ui.Modifier.A00
            r5 = 0
            androidx.compose.ui.Modifier r4 = androidx.compose.ui.Modifier.A05(r0)
            java.lang.Object r1 = r2.A00
            r0 = 10
            kotlin.jvm.internal.KtLambdaShape34S0100000_I2_14 r8 = X.C86164wN.A0z(r1, r0)
            kotlin.jvm.internal.KtLambdaShape152S0100000_I2_7 r11 = X.C86164wN.A0t(r1, r0)
            r0 = 11
            kotlin.jvm.internal.KtLambdaShape34S0100000_I2_14 r9 = X.C86164wN.A0z(r1, r0)
            r0 = 12
            kotlin.jvm.internal.KtLambdaShape34S0100000_I2_14 r10 = X.C86164wN.A0z(r1, r0)
            r12 = 48
            r13 = 128(0x80, float:1.794E-43)
            X.C122107Kg.A05(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            goto L_0x0046
        L_0x057a:
            X.7Zx r0 = (X.C123917Zx) r0
            X.8nY r3 = X.C86104wH.A0H(r14, r13)
            r1 = 1
            X.C04220Ms.A0B(r0, r1)
            android.os.Bundle r1 = r0.A06
            if (r1 == 0) goto L_0x07b4
            java.lang.String r0 = "postId"
            java.lang.String r6 = r1.getString(r0)
            if (r6 == 0) goto L_0x07b4
            java.lang.String r0 = "targetMediaId"
            java.lang.String r7 = r1.getString(r0)
            if (r7 == 0) goto L_0x07ad
            java.lang.String r0 = "isVideoMuted"
            boolean r11 = r1.getBoolean(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r11)
            if (r0 == 0) goto L_0x07a6
            java.lang.Object r1 = r2.A00
            r0 = 44
            kotlin.jvm.internal.KtLambdaShape33S0100000_I2_13 r8 = new kotlin.jvm.internal.KtLambdaShape33S0100000_I2_13
            r8.<init>(r1, r0)
            r4 = 0
            r9 = 0
            r10 = 48
            r5 = r4
            X.C100126Mb.A00(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            goto L_0x0046
        L_0x05b7:
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r14 = (java.lang.String) r14
            boolean r16 = X.AnonymousClass0wJ.A1X(r13)
            X.AnonymousClass0wJ.A1N(r1, r0)
            java.lang.Object r2 = r2.A00
            X.56T r2 = (X.AnonymousClass56T) r2
            com.instagram.barcelona.feed.data.BarcelonaFeedRepository r2 = r2.A00
            com.instagram.service.session.UserSession r13 = r2.A05
            X.BKU r11 = X.C86114wI.A0W(r13, r1)
            if (r11 == 0) goto L_0x0046
            int r15 = r2.A03(r0)
            android.content.Context r10 = r2.A00
            X.C2o r12 = r2.A04
            X.AnonymousClass6N3.A00(r10, r11, r12, r13, r14, r15, r16)
            goto L_0x0046
        L_0x05df:
            com.instagram.model.reels.Reel r1 = (com.instagram.model.reels.Reel) r1
            com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView r0 = (com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView) r0
            java.lang.String r14 = (java.lang.String) r14
            java.lang.String r13 = (java.lang.String) r13
            X.AnonymousClass0wJ.A1N(r1, r0)
            X.AnonymousClass0wJ.A1Q(r14, r13)
            java.lang.Object r6 = r2.A00
            X.5xd r6 = (X.AnonymousClass5xd) r6
            X.0Oa r2 = r6.A08
            java.lang.Object r2 = r2.getValue()
            X.58E r2 = (X.AnonymousClass58E) r2
            X.7JF r7 = r2.A01
            java.lang.Long r12 = r2.A03()
            java.lang.Integer r10 = X.AnonymousClass006.A01
            java.lang.Integer r11 = X.AnonymousClass006.A1C
            r8 = 0
            r16 = 28
            r9 = r8
            r15 = r8
            X.5Cg r2 = X.AnonymousClass7JF.A00(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            X.AnonymousClass7JF.A03(r2, r7)
            X.0Oa r2 = r6.A07
            com.instagram.service.session.UserSession r4 = X.AnonymousClass0wJ.A0X(r2)
            r3 = -1
            X.7wk r2 = new X.7wk
            r2.<init>(r6, r3)
            X.DeI r5 = new X.DeI
            r5.<init>(r6, r2, r4)
            java.lang.String r2 = r6.A00
            r5.A0C = r2
            androidx.fragment.app.FragmentActivity r4 = r6.requireActivity()
            X.7wi r3 = new X.7wi
            r3.<init>(r6, r14)
            X.Cqx r2 = new X.Cqx
            r2.<init>((android.app.Activity) r4, (android.view.View) r0, (X.C27907EvI) r3)
            r5.A05 = r2
            X.9wH r2 = X.C171229wH.A04
            r5.A03(r1, r2, r0)
            goto L_0x0046
        L_0x063b:
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r0 = (java.lang.String) r0
            long r4 = X.C18190wL.A08(r14)
            X.LcE r13 = (X.C40307LcE) r13
            X.AnonymousClass0wJ.A1N(r1, r0)
            r3 = 3
            X.C04220Ms.A0B(r13, r3)
            java.lang.Object r3 = r2.A00
            X.5j7 r3 = (X.AnonymousClass5j7) r3
            java.lang.Long r2 = java.lang.Long.valueOf(r4)
            X.AnonymousClass5j7.A06(r13, r3, r2, r1, r0)
            goto L_0x0046
        L_0x0659:
            java.lang.Number r1 = (java.lang.Number) r1
            r1.floatValue()
            java.lang.Number r0 = (java.lang.Number) r0
            r0.floatValue()
            X.8nY r14 = (X.C147188nY) r14
            int r0 = X.AnonymousClass0wJ.A04(r13)
            r0 = r0 & 11
            r3 = 2
            if (r0 != r3) goto L_0x0674
            boolean r0 = r14.BCM()
            if (r0 != 0) goto L_0x06f7
        L_0x0674:
            java.lang.Object r0 = r2.A00
            X.6sR r0 = (X.C113956sR) r0
            X.54A r2 = r0.A06
            r1 = 0
            r0 = 0
            X.C98156Ek.A00(r14, r2, r1, r0, r3)
            goto L_0x0046
        L_0x0681:
            X.C86144wL.A1M(r0)
            X.8nY r14 = (X.C147188nY) r14
            int r4 = X.AnonymousClass0wJ.A04(r13)
            int r0 = X.C86124wJ.A0G(r1, r4)
            if (r0 != 0) goto L_0x0695
            int r0 = X.C147188nY.A0F(r14, r1)
            r4 = r4 | r0
        L_0x0695:
            r3 = r4 & 651(0x28b, float:9.12E-43)
            r0 = 130(0x82, float:1.82E-43)
            if (r3 != r0) goto L_0x06a1
            boolean r0 = r14.BCM()
            if (r0 != 0) goto L_0x06f7
        L_0x06a1:
            java.lang.Object r2 = r2.A00
            X.0YM r2 = (X.AnonymousClass0YM) r2
            r0 = r4 & 14
            X.C86104wH.A1R(r1, r14, r2, r0)
            goto L_0x0046
        L_0x06ac:
            X.6iT r1 = (X.C108506iT) r1
            int r9 = X.AnonymousClass0wJ.A04(r0)
            X.8nY r14 = (X.C147188nY) r14
            int r3 = X.AnonymousClass0wJ.A04(r13)
            int r0 = X.C86124wJ.A0G(r1, r3)
            if (r0 != 0) goto L_0x06f5
            int r4 = X.C147188nY.A0F(r14, r1)
            r4 = r4 | r3
        L_0x06c3:
            r0 = r3 & 112(0x70, float:1.57E-43)
            if (r0 != 0) goto L_0x06cc
            int r0 = X.C147188nY.A04(r14, r9)
            r4 = r4 | r0
        L_0x06cc:
            r3 = r4 & 731(0x2db, float:1.024E-42)
            r0 = 146(0x92, float:2.05E-43)
            if (r3 != r0) goto L_0x06d8
            boolean r0 = r14.BCM()
            if (r0 != 0) goto L_0x06f7
        L_0x06d8:
            int r0 = r1.A01
            int r3 = r9 - r0
            r7 = 0
            java.lang.Object r0 = r2.A00
            androidx.compose.foundation.lazy.grid.LazyGridState r0 = (androidx.compose.foundation.lazy.grid.LazyGridState) r0
            X.84E r5 = r0.A08
            r2 = -269692885(0xffffffffefecd02b, float:-1.4658024E29)
            r0 = 2
            X.8sI r8 = X.AnonymousClass7JR.A02(r14, r1, r3, r0, r2)
            r0 = r4 & 112(0x70, float:1.57E-43)
            r10 = r0 | 3592(0xe08, float:5.033E-42)
            r6 = r14
            X.C98006Du.A00(r5, r6, r7, r8, r9, r10)
            goto L_0x0046
        L_0x06f5:
            r4 = r3
            goto L_0x06c3
        L_0x06f7:
            r14.CuJ()
            goto L_0x0046
        L_0x06fc:
            android.database.sqlite.SQLiteCursorDriver r0 = (android.database.sqlite.SQLiteCursorDriver) r0
            java.lang.String r14 = (java.lang.String) r14
            android.database.sqlite.SQLiteQuery r13 = (android.database.sqlite.SQLiteQuery) r13
            java.lang.Object r2 = r2.A00
            X.8jv r2 = (X.C145148jv) r2
            X.C04220Ms.A0A(r13)
            X.7cU r1 = new X.7cU
            r1.<init>(r13)
            r2.AAk(r1)
            android.database.sqlite.SQLiteCursor r1 = new android.database.sqlite.SQLiteCursor
            r1.<init>(r0, r14, r13)
            return r1
        L_0x0717:
            X.72l r1 = (X.C1188372l) r1
            X.7yQ r0 = (X.C134817yQ) r0
            X.6su r14 = (X.C114236su) r14
            int r5 = r14.A00
            X.6sv r13 = (X.C114246sv) r13
            int r4 = r13.A00
            r3 = 1
            X.C04220Ms.A0B(r0, r3)
            java.lang.Object r3 = r2.A00
            X.7Yg r3 = (X.C123727Yg) r3
            X.8g4 r2 = r3.A04
            X.4oM r2 = r2.Cen(r1, r0, r5, r4)
            boolean r0 = r2 instanceof X.C123757Yl
            if (r0 != 0) goto L_0x0746
            X.6pP r1 = r3.A00
            X.6pP r0 = new X.6pP
            r0.<init>(r2, r1)
            r3.A00 = r0
            java.lang.Object r1 = r0.A00
        L_0x0740:
            java.lang.String r0 = "null cannot be cast to non-null type android.graphics.Typeface"
            X.C04220Ms.A0C(r1, r0)
            return r1
        L_0x0746:
            java.lang.Object r1 = r2.getValue()
            goto L_0x0740
        L_0x074b:
            java.lang.String r0 = "No ViewModelStoreOwner was provided via LocalViewModelStoreOwner"
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r0)
            throw r0
        L_0x0752:
            java.lang.String r0 = "Required value was null."
            java.lang.IllegalArgumentException r0 = X.C18190wL.A0a(r0)
            throw r0
        L_0x0759:
            java.lang.String r0 = "Required value was null."
            java.lang.IllegalArgumentException r0 = X.C18190wL.A0a(r0)
            throw r0
        L_0x0760:
            java.lang.String r0 = "Required value was null."
            java.lang.IllegalArgumentException r0 = X.C18190wL.A0a(r0)
            throw r0
        L_0x0767:
            java.lang.String r0 = "Required value was null."
            java.lang.IllegalArgumentException r0 = X.C18190wL.A0a(r0)
            throw r0
        L_0x076e:
            java.lang.String r0 = "Required value was null."
            java.lang.IllegalArgumentException r0 = X.C18190wL.A0a(r0)
            throw r0
        L_0x0775:
            java.lang.String r0 = "Required value was null."
            java.lang.IllegalArgumentException r0 = X.C18190wL.A0a(r0)
            throw r0
        L_0x077c:
            java.lang.String r0 = "Required value was null."
            java.lang.IllegalArgumentException r0 = X.C18190wL.A0a(r0)
            throw r0
        L_0x0783:
            java.lang.String r0 = "No ViewModelStoreOwner was provided via LocalViewModelStoreOwner"
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r0)
            throw r0
        L_0x078a:
            java.lang.String r0 = "Required value was null."
            java.lang.IllegalArgumentException r0 = X.C18190wL.A0a(r0)
            throw r0
        L_0x0791:
            java.lang.String r0 = "Required value was null."
            java.lang.IllegalArgumentException r0 = X.C18190wL.A0a(r0)
            throw r0
        L_0x0798:
            java.lang.String r0 = "Required value was null."
            java.lang.IllegalArgumentException r0 = X.C18190wL.A0a(r0)
            throw r0
        L_0x079f:
            java.lang.String r0 = "Required value was null."
            java.lang.IllegalArgumentException r0 = X.C18190wL.A0a(r0)
            throw r0
        L_0x07a6:
            java.lang.String r0 = "Required value was null."
            java.lang.IllegalArgumentException r0 = X.C18190wL.A0a(r0)
            throw r0
        L_0x07ad:
            java.lang.String r0 = "Required value was null."
            java.lang.IllegalArgumentException r0 = X.C18190wL.A0a(r0)
            throw r0
        L_0x07b4:
            java.lang.String r0 = "Required value was null."
            java.lang.IllegalArgumentException r0 = X.C18190wL.A0a(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.KtLambdaShape173S0100000_I2.invoke(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
