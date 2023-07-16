package kotlin.jvm.internal;

import X.AnonymousClass0YC;
import X.C02220Ah;

public class KtLambdaShape15S0300000_I2 extends C02220Ah implements AnonymousClass0YC {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtLambdaShape15S0300000_I2(int i, Object obj, Object obj2, Object obj3) {
        super(4);
        this.A03 = i;
        this.A00 = obj;
        this.A02 = obj2;
        this.A01 = obj3;
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x041f, code lost:
        if (r11 != false) goto L_0x0421;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x0502, code lost:
        X.AnonymousClass7W3.A0z(r0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x05b9, code lost:
        r0.CuJ();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x0681, code lost:
        return kotlin.Unit.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00c8, code lost:
        if (r6 >= 6) goto L_0x00ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0173, code lost:
        if ((r14 & 1) != 1) goto L_0x018a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x0341  */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x0654  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r43, java.lang.Object r44, java.lang.Object r45, java.lang.Object r46) {
        /*
            r42 = this;
            r1 = r42
            r4 = r43
            r6 = r44
            r0 = r45
            int r2 = r1.A03
            r3 = r46
            switch(r2) {
                case 0: goto L_0x05da;
                case 1: goto L_0x05be;
                case 2: goto L_0x04a6;
                case 3: goto L_0x045e;
                case 4: goto L_0x03ef;
                case 5: goto L_0x0384;
                default: goto L_0x000f;
            }
        L_0x000f:
            int r6 = X.AnonymousClass0wJ.A04(r6)
            X.8nY r0 = (X.C147188nY) r0
            int r5 = X.AnonymousClass0wJ.A04(r3)
            r2 = 0
            X.C04220Ms.A0B(r4, r2)
            r3 = r5 & 14
            if (r3 != 0) goto L_0x01f0
            int r3 = X.C147188nY.A0F(r0, r4)
            r4 = r5 | r3
        L_0x0027:
            r3 = r5 & 112(0x70, float:1.57E-43)
            if (r3 != 0) goto L_0x0030
            int r3 = X.C147188nY.A04(r0, r6)
            r4 = r4 | r3
        L_0x0030:
            r4 = r4 & 731(0x2db, float:1.024E-42)
            r3 = 146(0x92, float:2.05E-43)
            if (r4 != r3) goto L_0x003c
            boolean r3 = r0.BCM()
            if (r3 != 0) goto L_0x05b9
        L_0x003c:
            java.lang.Object r3 = r1.A00
            java.lang.Object r7 = X.C86124wJ.A0p(r3, r6)
            X.5HZ r7 = (X.AnonymousClass5HZ) r7
            java.lang.Object r3 = r1.A01
            r21 = r3
            r3 = r21
            X.7Bt r3 = (X.C120617Bt) r3
            r21 = r3
            java.lang.String r4 = r7.A02
            java.lang.String r6 = r7.A04
            X.8s2 r9 = r7.A05
            java.lang.String r5 = r7.A03
            java.lang.Double r3 = r7.A01
            r20 = r3
            java.lang.Object r8 = r1.A02
            X.8s7 r8 = (X.AnonymousClass8s7) r8
            r11 = 2
            r19 = 5
            r1 = r19
            X.C04220Ms.A0B(r8, r1)
            r1 = -449464741(0xffffffffe535b65b, float:-5.3632012E22)
            r0.Cvb(r1)
            r18 = 0
            r1 = 1
            X.7yF r7 = new X.7yF
            r3 = r18
            r7.<init>(r3, r2, r1)
            if (r4 == 0) goto L_0x01f8
            int r3 = r4.length()
            if (r3 == 0) goto L_0x01f8
            r3 = 1568962672(0x5d847870, float:1.19318782E18)
            r0.Cvb(r3)
            r3 = 1117349816(0x429967b8, float:76.702576)
            r0.Cvb(r3)
            X.7yF r10 = new X.7yF
            r3 = r18
            r10.<init>(r3, r2, r1)
            char[] r3 = new char[r11]
            r3 = {123, 125} // fill-array
            java.util.List r3 = X.AnonymousClass8bP.A0e(r4, r3, r2)
            java.util.Iterator r17 = r3.iterator()
        L_0x009e:
            boolean r3 = r17.hasNext()
            if (r3 == 0) goto L_0x02f4
            java.lang.String r6 = X.C18180wK.A0k(r17)
            r3 = 124(0x7c, float:1.74E-43)
            boolean r3 = X.C04220Ms.A0B(r6, 0)
            if (r3 == 0) goto L_0x01eb
            X.C04220Ms.A0B(r6, r2)
            java.lang.String r3 = "\\|"
            X.7yC r4 = X.C18250wR.A0h(r3)
            r3 = r19
            java.util.List r13 = r4.A02(r6, r3)
            int r6 = r13.size()
            r12 = 4
            if (r12 > r6) goto L_0x00ca
            r4 = 6
            r3 = 1
            if (r6 < r4) goto L_0x00cb
        L_0x00ca:
            r3 = 0
        L_0x00cb:
            java.lang.String r9 = "verified"
            java.lang.String r8 = ""
            if (r3 == 0) goto L_0x0176
            java.lang.String r4 = X.C18190wL.A0p(r13, r2)     // Catch:{ Exception -> 0x00df }
            java.lang.String r3 = "UTF-8"
            java.lang.String r8 = java.net.URLDecoder.decode(r4, r3)     // Catch:{ Exception -> 0x00df }
            X.C04220Ms.A06(r8)     // Catch:{ Exception -> 0x00df }
            goto L_0x00fb
        L_0x00df:
            r6 = move-exception
            r3 = 645(0x285, float:9.04E-43)
            java.lang.String r4 = X.C18170wI.A00(r3)
            java.lang.String r3 = X.C18190wL.A0p(r13, r2)
            java.lang.String r4 = X.AnonymousClass00U.A0L(r4, r3)
            r3 = 626(0x272, float:8.77E-43)
            java.lang.String r3 = X.C18170wI.A00(r3)
            X.C10450iM.A06(r3, r4, r6)
            java.lang.String r8 = X.C18190wL.A0p(r13, r2)
        L_0x00fb:
            r4 = 35
            java.lang.String r3 = X.C18190wL.A0p(r13, r1)     // Catch:{ NumberFormatException -> 0x010e }
            java.lang.String r3 = X.AnonymousClass00U.A0B(r3, r4)     // Catch:{ NumberFormatException -> 0x010e }
            int r3 = android.graphics.Color.parseColor(r3)     // Catch:{ NumberFormatException -> 0x010e }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ NumberFormatException -> 0x010e }
            goto L_0x0127
        L_0x010e:
            r3 = 647(0x287, float:9.07E-43)
            java.lang.String r4 = X.C18170wI.A00(r3)
            java.lang.String r3 = X.C18190wL.A0p(r13, r1)
            java.lang.String r4 = X.AnonymousClass00U.A0L(r4, r3)
            r3 = 694(0x2b6, float:9.73E-43)
            java.lang.String r3 = X.C18170wI.A00(r3)
            X.C10450iM.A03(r3, r4)
            r3 = r18
        L_0x0127:
            if (r3 == 0) goto L_0x0132
            int r3 = r3.intValue()
            long r3 = (long) r3
            r6 = 32
            long r3 = r3 << r6
            goto L_0x0134
        L_0x0132:
            long r3 = X.AnonymousClass7KE.A06
        L_0x0134:
            java.lang.String r6 = X.C18190wL.A0p(r13, r11)     // Catch:{ NumberFormatException -> 0x013d }
            int r14 = java.lang.Integer.parseInt(r6)     // Catch:{ NumberFormatException -> 0x013d }
            goto L_0x0163
        L_0x013d:
            r15 = move-exception
            r6 = 646(0x286, float:9.05E-43)
            java.lang.String r6 = X.C18170wI.A00(r6)
            java.lang.StringBuilder r14 = X.C18190wL.A0s(r6)
            java.lang.String r6 = X.C18190wL.A0p(r13, r11)
            r14.append(r6)
            r6 = 239(0xef, float:3.35E-43)
            java.lang.String r6 = X.C18170wI.A00(r6)
            java.lang.String r14 = X.C86104wH.A0x(r15, r6, r14)
            r6 = 695(0x2b7, float:9.74E-43)
            java.lang.String r6 = X.C18170wI.A00(r6)
            X.C10450iM.A03(r6, r14)
            r14 = 0
        L_0x0163:
            r6 = 3
            java.lang.String r15 = X.C18190wL.A0p(r13, r6)
            java.lang.Object r6 = X.AnonymousClass00J.A0G(r13, r12)
            boolean r16 = X.C04220Ms.A0I(r6, r9)
            r6 = r14 & 1
            r13 = 1
            if (r6 == r1) goto L_0x018b
            goto L_0x018a
        L_0x0176:
            long r3 = X.AnonymousClass7KE.A06
            r6 = 693(0x2b5, float:9.71E-43)
            java.lang.String r12 = X.C18170wI.A00(r6)
            r6 = 736(0x2e0, float:1.031E-42)
            java.lang.String r6 = X.C18170wI.A00(r6)
            X.C10450iM.A03(r12, r6)
            r15 = r8
            r16 = 0
        L_0x018a:
            r13 = 0
        L_0x018b:
            X.7yF r6 = new X.7yF
            r12 = r18
            r6.<init>(r12, r2, r1)
            r36 = 0
            if (r13 == 0) goto L_0x01be
            X.7yQ r27 = X.C134817yQ.A01
        L_0x0198:
            r33 = 16378(0x3ffa, float:2.295E-41)
            X.7F0 r12 = new X.7F0
            r22 = r12
            r23 = r18
            r24 = r18
            r25 = r18
            r26 = r18
            r28 = r18
            r29 = r18
            r30 = r18
            r31 = r18
            r32 = r18
            r34 = r3
            r38 = r36
            r40 = r36
            r22.<init>(r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r36, r38, r40)
            int r12 = r6.A00(r12)
            goto L_0x01c1
        L_0x01be:
            r27 = r12
            goto L_0x0198
        L_0x01c1:
            java.lang.String r13 = "InlineLinkUrn"
            X.Kq4 r14 = X.C36975Ji8.A03     // Catch:{ all -> 0x01f3 }
            com.instagram.newsfeed.ui.InlineLinkUrn r4 = new com.instagram.newsfeed.ui.InlineLinkUrn     // Catch:{ all -> 0x01f3 }
            r4.<init>(r8, r15)     // Catch:{ all -> 0x01f3 }
            X.76V r15 = r14.A02     // Catch:{ all -> 0x01f3 }
            java.lang.Class<com.instagram.newsfeed.ui.InlineLinkUrn> r3 = com.instagram.newsfeed.ui.InlineLinkUrn.class
            java.lang.String r3 = X.C18210wN.A0d(r3, r4, r14, r15)     // Catch:{ all -> 0x01f3 }
            r6.A08(r13, r3)     // Catch:{ all -> 0x01f3 }
            r6.A07(r8)     // Catch:{ all -> 0x01f3 }
            r6.A03(r12)
            if (r16 == 0) goto L_0x01e2
            java.lang.String r3 = "�"
            X.AnonymousClass6E5.A00(r6, r9, r3)
        L_0x01e2:
            X.7yH r3 = r6.A01()
            r10.A04(r3)
            goto L_0x009e
        L_0x01eb:
            r10.A07(r6)
            goto L_0x009e
        L_0x01f0:
            r4 = r5
            goto L_0x0027
        L_0x01f3:
            r0 = move-exception
            r6.A03(r12)
            throw r0
        L_0x01f8:
            if (r6 == 0) goto L_0x02ed
            int r11 = r6.length()
            if (r11 == 0) goto L_0x02ed
            r3 = 1568962754(0x5d8478c2, float:1.19319909E18)
            r0.Cvb(r3)
            r3 = -110768546(0xfffffffff965ce5e, float:-7.457635E34)
            r0.Cvb(r3)
            r10 = 0
            X.7yF r3 = new X.7yF
            r4 = r18
            r3.<init>(r4, r2, r1)
            r12 = 12
            com.facebook.redex.IDxComparatorShape95S0000000_2_I2 r4 = new com.facebook.redex.IDxComparatorShape95S0000000_2_I2
            r4.<init>(r12)
            java.util.List r4 = X.AnonymousClass00J.A0W(r9, r4)
            java.util.Iterator r17 = r4.iterator()
        L_0x0223:
            boolean r4 = r17.hasNext()
            if (r4 == 0) goto L_0x02e5
            java.lang.Object r9 = r17.next()
            X.6mH r9 = (X.C110786mH) r9
            int r12 = r9.A01
            if (r12 < 0) goto L_0x0223
            int r4 = r9.A00
            if (r4 >= r11) goto L_0x0223
            r3.A06(r6, r10, r12)
            r34 = 0
            X.7yQ r27 = X.C134817yQ.A01
            r33 = 16379(0x3ffb, float:2.2952E-41)
            X.7F0 r4 = new X.7F0
            r22 = r4
            r23 = r18
            r24 = r18
            r25 = r18
            r26 = r18
            r28 = r18
            r29 = r18
            r30 = r18
            r31 = r18
            r32 = r18
            r36 = r34
            r38 = r34
            r40 = r34
            r22.<init>(r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r36, r38, r40)
            int r12 = r3.A00(r4)
            X.Kq4 r14 = X.C36975Ji8.A03     // Catch:{ all -> 0x037f }
            int r10 = r9.A01     // Catch:{ all -> 0x037f }
            int r4 = r9.A00     // Catch:{ all -> 0x037f }
            java.lang.String r10 = X.C18230wP.A0s(r6, r10, r4)     // Catch:{ all -> 0x037f }
            X.9ua r4 = r9.A02     // Catch:{ all -> 0x037f }
            java.lang.String r13 = r4.A00     // Catch:{ all -> 0x037f }
            java.util.Map r4 = r9.A05     // Catch:{ all -> 0x037f }
            java.util.Map r15 = java.util.Collections.unmodifiableMap(r4)     // Catch:{ all -> 0x037f }
            X.C04220Ms.A06(r15)     // Catch:{ all -> 0x037f }
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap     // Catch:{ all -> 0x037f }
            r4.<init>(r15)     // Catch:{ all -> 0x037f }
            java.lang.String r15 = r9.A03     // Catch:{ all -> 0x037f }
            if (r15 == 0) goto L_0x0286
            X.C86164wN.A1J(r15, r4)     // Catch:{ all -> 0x037f }
        L_0x0286:
            android.net.Uri$Builder r15 = new android.net.Uri$Builder     // Catch:{ all -> 0x037f }
            r15.<init>()     // Catch:{ all -> 0x037f }
            r15.authority(r13)     // Catch:{ all -> 0x037f }
            java.util.Iterator r16 = X.AnonymousClass0wJ.A0z(r4)     // Catch:{ all -> 0x037f }
        L_0x0292:
            boolean r4 = r16.hasNext()     // Catch:{ all -> 0x037f }
            if (r4 == 0) goto L_0x02a8
            java.util.Map$Entry r4 = X.C18180wK.A0o(r16)     // Catch:{ all -> 0x037f }
            java.lang.String r13 = X.C18200wM.A0p(r4)     // Catch:{ all -> 0x037f }
            java.lang.String r4 = X.C18230wP.A0u(r4)     // Catch:{ all -> 0x037f }
            r15.appendQueryParameter(r13, r4)     // Catch:{ all -> 0x037f }
            goto L_0x0292
        L_0x02a8:
            android.net.Uri r4 = r15.build()     // Catch:{ all -> 0x037f }
            java.lang.String r4 = X.C18190wL.A0n(r4)     // Catch:{ all -> 0x037f }
            com.instagram.newsfeed.ui.InlineLinkUrn r13 = new com.instagram.newsfeed.ui.InlineLinkUrn     // Catch:{ all -> 0x037f }
            r13.<init>(r10, r4)     // Catch:{ all -> 0x037f }
            X.76V r10 = r14.A02     // Catch:{ all -> 0x037f }
            java.lang.Class<com.instagram.newsfeed.ui.InlineLinkUrn> r4 = com.instagram.newsfeed.ui.InlineLinkUrn.class
            java.lang.String r10 = X.C18210wN.A0d(r4, r13, r14, r10)     // Catch:{ all -> 0x037f }
            java.lang.String r4 = "InlineLinkUrn"
            r3.A08(r4, r10)     // Catch:{ all -> 0x037f }
            int r10 = r9.A01     // Catch:{ all -> 0x037f }
            int r4 = r9.A00     // Catch:{ all -> 0x037f }
            r3.A06(r6, r10, r4)     // Catch:{ all -> 0x037f }
            r3.A03(r12)
            X.9ua r10 = r9.A02
            X.9ua r4 = X.C170189ua.USER
            if (r10 != r4) goto L_0x02e1
            java.lang.String r4 = r9.A03
            boolean r4 = r8.contains(r4)
            if (r4 == 0) goto L_0x02e1
            java.lang.String r10 = "verified"
            java.lang.String r4 = "�"
            X.AnonymousClass6E5.A00(r3, r10, r4)
        L_0x02e1:
            int r10 = r9.A00
            goto L_0x0223
        L_0x02e5:
            r3.A06(r6, r10, r11)
            X.7yH r3 = r3.A01()
            goto L_0x02f8
        L_0x02ed:
            r3 = 1568962819(0x5d847903, float:1.19320802E18)
            r0.Cvb(r3)
            goto L_0x02fe
        L_0x02f4:
            X.7yH r3 = r10.A01()
        L_0x02f8:
            X.AnonymousClass7W3.A0z(r0, r2)
            r7.A04(r3)
        L_0x02fe:
            X.7W3 r6 = X.AnonymousClass7W3.A04(r0, r2)
            r3 = 1556730324(0x5cc9d1d4, float:4.5445743E17)
            r0.Cvb(r3)
            r3 = 1266103706(0x4b77359a, float:1.6201114E7)
            r0.Cvb(r3)
            if (r5 == 0) goto L_0x0316
            int r3 = r5.length()
            if (r3 != 0) goto L_0x033b
        L_0x0316:
            if (r20 == 0) goto L_0x033b
            android.content.Context r3 = X.C147188nY.A0T(r0)
            android.content.res.Resources r22 = r3.getResources()
            double r25 = r20.doubleValue()
            java.lang.Integer r24 = X.AnonymousClass006.A00
            X.68E r23 = X.AnonymousClass68E.SECONDS
            long r3 = X.C18190wL.A07()
            double r8 = (double) r3
            r27 = r8
            r29 = r2
            r30 = r2
            r31 = r2
            r32 = r1
            java.lang.String r5 = X.C19591Ayr.A08(r22, r23, r24, r25, r27, r29, r30, r31, r32)
        L_0x033b:
            X.AnonymousClass7W3.A0w(r6, r2)
            r3 = 0
            if (r5 == 0) goto L_0x064f
            X.7yF r3 = new X.7yF
            r4 = r18
            r3.<init>(r4, r2, r1)
            r4 = 32
            java.lang.StringBuilder r1 = r3.A00
            r1.append(r4)
            long r34 = X.AnonymousClass7KB.A03(r0)
            r36 = 0
            r33 = 16382(0x3ffe, float:2.2956E-41)
            X.7F0 r1 = new X.7F0
            r22 = r1
            r23 = r18
            r24 = r18
            r25 = r18
            r26 = r18
            r27 = r18
            r28 = r18
            r29 = r18
            r30 = r18
            r31 = r18
            r32 = r18
            r38 = r36
            r40 = r36
            r22.<init>(r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r36, r38, r40)
            int r12 = r3.A00(r1)
            r3.A07(r5)     // Catch:{ all -> 0x037f }
            goto L_0x0648
        L_0x037f:
            r0 = move-exception
            r3.A03(r12)
            throw r0
        L_0x0384:
            int r6 = X.AnonymousClass0wJ.A04(r6)
            X.8nY r0 = (X.C147188nY) r0
            int r5 = X.AnonymousClass0wJ.A04(r3)
            r2 = 0
            X.C04220Ms.A0B(r4, r2)
            r3 = r5 & 14
            if (r3 != 0) goto L_0x03d7
            int r4 = X.C147188nY.A0F(r0, r4)
            r4 = r4 | r5
        L_0x039b:
            r3 = r5 & 112(0x70, float:1.57E-43)
            if (r3 != 0) goto L_0x03a4
            int r3 = X.C147188nY.A04(r0, r6)
            r4 = r4 | r3
        L_0x03a4:
            r4 = r4 & 731(0x2db, float:1.024E-42)
            r3 = 146(0x92, float:2.05E-43)
            if (r4 != r3) goto L_0x03b0
            boolean r3 = r0.BCM()
            if (r3 != 0) goto L_0x05b9
        L_0x03b0:
            java.lang.Object r3 = r1.A00
            java.lang.Object r5 = X.C86124wJ.A0p(r3, r6)
            com.instagram.api.schemas.ProfileTheme r5 = (com.instagram.api.schemas.ProfileTheme) r5
            java.lang.Object r3 = r1.A02
            com.instagram.api.schemas.ProfileTheme r3 = (com.instagram.api.schemas.ProfileTheme) r3
            if (r3 == 0) goto L_0x03d5
            java.lang.String r4 = r3.A04
        L_0x03c0:
            java.lang.String r3 = r5.A04
            boolean r3 = X.C04220Ms.A0I(r4, r3)
            if (r3 == 0) goto L_0x03d9
            r1 = 225026954(0xd69a38a, float:7.199552E-31)
            r0.Cvb(r1)
            r1 = 8
            X.C122077Ka.A04(r0, r5, r1)
            goto L_0x0502
        L_0x03d5:
            r4 = 0
            goto L_0x03c0
        L_0x03d7:
            r4 = r5
            goto L_0x039b
        L_0x03d9:
            r3 = 225026989(0xd69a3ad, float:7.1995686E-31)
            r0.Cvb(r3)
            java.lang.Object r4 = r1.A01
            r1 = 28
            kotlin.jvm.internal.KtLambdaShape28S0200000_I2_12 r3 = new kotlin.jvm.internal.KtLambdaShape28S0200000_I2_12
            r3.<init>((int) r1, (java.lang.Object) r4, (java.lang.Object) r5)
            r1 = 8
            X.C122077Ka.A09(r0, r5, r3, r1)
            goto L_0x0502
        L_0x03ef:
            X.BMj r4 = (X.C20066BMj) r4
            java.lang.String r6 = (java.lang.String) r6
            X.C2o r0 = (X.C21839C2o) r0
            int r19 = X.AnonymousClass0wJ.A04(r3)
            r2 = 0
            int r3 = X.C18200wM.A02(r2, r4, r0)
            java.lang.Object r2 = r1.A02
            X.AsY r2 = (X.C19211AsY) r2
            com.instagram.service.session.UserSession r10 = r2.A02
            java.lang.Object r9 = r1.A00
            X.BKU r9 = (X.BKU) r9
            java.lang.Object r8 = r1.A01
            com.instagram.user.model.User r8 = (com.instagram.user.model.User) r8
            boolean r11 = r2.A06
            X.C3G r7 = r2.A00
            r1 = 1
            X.C04220Ms.A0B(r9, r1)
            X.C04220Ms.A0B(r8, r3)
            com.instagram.model.reels.Reel r1 = X.C19600Az1.A00(r9, r4, r10)
            if (r1 == 0) goto L_0x0421
            r22 = 1
            if (r11 == 0) goto L_0x0423
        L_0x0421:
            r22 = 0
        L_0x0423:
            boolean r23 = r9.BSA()
            java.lang.String r21 = X.C86154wM.A0m(r9)
            X.Bn7 r5 = new X.Bn7
            r12 = r5
            r13 = r9
            r14 = r0
            r15 = r7
            r16 = r4
            r17 = r10
            r18 = r6
            r20 = r11
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20)
            r1 = 22
            kotlin.jvm.internal.KtLambdaShape13S0300000_I2 r3 = new kotlin.jvm.internal.KtLambdaShape13S0300000_I2
            r3.<init>(r1, r9, r7, r4)
            X.8SN r2 = new X.8SN
            r12 = r2
            r18 = r8
            r19 = r6
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20)
            r1 = 17
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0300000_I2 r0 = new com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0300000_I2
            r0.<init>((X.AnonymousClass0YP) r3, (X.AnonymousClass0YP) r2, (X.AnonymousClass0YM) r5, (int) r1)
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1220000_I2 r18 = new com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1220000_I2
            r19 = r0
            r20 = r8
            r18.<init>((com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0300000_I2) r19, (com.instagram.user.model.User) r20, (java.lang.String) r21, (boolean) r22, (boolean) r23)
            return r18
        L_0x045e:
            X.8nY r5 = X.C86104wH.A0H(r0, r3)
            boolean r16 = X.AnonymousClass0wJ.A1Y(r4, r6)
            java.lang.Object r2 = r1.A00
            java.lang.Object r3 = r1.A02
            r0 = 30
            kotlin.jvm.internal.KtLambdaShape20S0200000_I2_4 r8 = X.C86164wN.A0y(r2, r3, r0)
            r0 = 13
            kotlin.jvm.internal.KtLambdaShape37S0100000_I2_17 r9 = X.C86154wM.A14(r2, r0)
            r0 = 14
            kotlin.jvm.internal.KtLambdaShape37S0100000_I2_17 r10 = X.C86154wM.A14(r2, r0)
            r0 = 15
            kotlin.jvm.internal.KtLambdaShape37S0100000_I2_17 r11 = X.C86154wM.A14(r2, r0)
            r0 = 16
            kotlin.jvm.internal.KtLambdaShape37S0100000_I2_17 r12 = X.C86154wM.A14(r2, r0)
            r0 = 17
            kotlin.jvm.internal.KtLambdaShape37S0100000_I2_17 r13 = X.C86154wM.A14(r2, r0)
            r0 = 18
            kotlin.jvm.internal.KtLambdaShape37S0100000_I2_17 r14 = X.C86154wM.A14(r2, r0)
            java.lang.Object r15 = r1.A01
            X.0YP r15 = (X.AnonymousClass0YP) r15
            X.7Wm r0 = androidx.compose.ui.Modifier.A00
            androidx.compose.ui.Modifier r6 = X.AnonymousClass7FI.A02(r0)
            r7 = 0
            r17 = 512(0x200, float:7.175E-43)
            X.C117916zS.A00(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            goto L_0x067f
        L_0x04a6:
            int r15 = X.AnonymousClass0wJ.A04(r6)
            X.8nY r0 = (X.C147188nY) r0
            int r5 = X.AnonymousClass0wJ.A04(r3)
            r2 = 0
            X.C04220Ms.A0B(r4, r2)
            r3 = r5 & 14
            r9 = 2
            if (r3 != 0) goto L_0x05b6
            int r3 = X.C147188nY.A0F(r0, r4)
            r4 = r5 | r3
        L_0x04bf:
            r3 = r5 & 112(0x70, float:1.57E-43)
            r5 = 16
            if (r3 != 0) goto L_0x04ca
            int r3 = X.C147188nY.A04(r0, r15)
            r4 = r4 | r3
        L_0x04ca:
            r4 = r4 & 731(0x2db, float:1.024E-42)
            r3 = 146(0x92, float:2.05E-43)
            if (r4 != r3) goto L_0x04d6
            boolean r3 = r0.BCM()
            if (r3 != 0) goto L_0x05b9
        L_0x04d6:
            java.lang.Object r3 = r1.A01
            java.lang.Object r6 = X.C86124wJ.A0p(r3, r15)
            X.8iU r6 = (X.AnonymousClass8iU) r6
            boolean r3 = r6 instanceof X.AnonymousClass5M1
            r8 = 1
            r7 = 0
            if (r3 == 0) goto L_0x0589
            r3 = 521365655(0x1f136897, float:3.1214976E-20)
            r0.Cvb(r3)
            r4 = r6
            X.5M1 r4 = (X.AnonymousClass5M1) r4
            java.lang.Integer r3 = r4.A01
            int r3 = r3.intValue()
            if (r3 == r8) goto L_0x0567
            if (r3 == r9) goto L_0x052c
            if (r3 == r2) goto L_0x0507
            r1 = 521368036(0x1f1371e4, float:3.122267E-20)
            r0.Cvb(r1)
        L_0x04ff:
            X.AnonymousClass7W3.A0z(r0, r2)
        L_0x0502:
            X.AnonymousClass7W3.A0z(r0, r2)
            goto L_0x067f
        L_0x0507:
            r3 = 521367398(0x1f136f66, float:3.1220607E-20)
            r0.Cvb(r3)
            java.lang.Object r5 = r1.A02
            r3 = 18
            kotlin.jvm.internal.KtLambdaShape20S0200000_I2_4 r8 = X.C86164wN.A0y(r6, r5, r3)
            java.lang.Object r1 = r1.A00
            kotlin.jvm.internal.KtLambdaShape6S0300000_I2_1 r3 = new kotlin.jvm.internal.KtLambdaShape6S0300000_I2_1
            r3.<init>(r2, r1, r6, r5)
            X.7Wm r1 = androidx.compose.ui.Modifier.A00
            androidx.compose.ui.Modifier r6 = androidx.compose.ui.Modifier.A04(r1)
            r10 = 3080(0xc08, float:4.316E-42)
            r5 = r0
            r7 = r4
            r9 = r3
            r11 = r2
            X.C100496Nn.A00(r5, r6, r7, r8, r9, r10, r11)
            goto L_0x04ff
        L_0x052c:
            r3 = 521366208(0x1f136ac0, float:3.1216762E-20)
            r0.Cvb(r3)
            X.5Hm r5 = r4.A00
            X.7Wm r3 = androidx.compose.ui.Modifier.A00
            androidx.compose.ui.Modifier r9 = androidx.compose.ui.Modifier.A04(r3)
            java.lang.Object r4 = r1.A02
            com.instagram.barcelona.search.SearchScreenViewModel r4 = (com.instagram.barcelona.search.SearchScreenViewModel) r4
            java.lang.Object r1 = r1.A00
            kotlin.jvm.internal.KtLambdaShape21S0301000_I2 r11 = new kotlin.jvm.internal.KtLambdaShape21S0301000_I2
            r14 = r11
            r18 = r6
            r19 = r1
            r17 = r4
            r16 = r8
            r14.<init>(r15, r16, r17, r18, r19)
            r1 = 17
            kotlin.jvm.internal.KtLambdaShape20S0200000_I2_4 r12 = X.C86164wN.A0y(r6, r4, r1)
            r13 = 56
            r8 = r0
            r10 = r5
            r14 = r2
            X.C100466Nk.A00(r8, r9, r10, r11, r12, r13, r14)
            kotlin.Unit r3 = kotlin.Unit.A00
            kotlin.coroutines.jvm.internal.KtSLambdaShape16S0201000_I2_2 r1 = new kotlin.coroutines.jvm.internal.KtSLambdaShape16S0201000_I2_2
            r1.<init>((com.instagram.barcelona.search.SearchScreenViewModel) r4, (X.AnonymousClass8iU) r6, (X.C146958n9) r7, (int) r15)
            X.AnonymousClass7K5.A05(r0, r3, r1)
            goto L_0x04ff
        L_0x0567:
            r3 = 521365729(0x1f1368e1, float:3.1215215E-20)
            r0.Cvb(r3)
            java.lang.Object r3 = r1.A02
            r1 = 15
            kotlin.jvm.internal.KtLambdaShape20S0200000_I2_4 r8 = X.C86164wN.A0y(r6, r3, r1)
            kotlin.jvm.internal.KtLambdaShape20S0200000_I2_4 r9 = X.C86164wN.A0y(r6, r3, r5)
            X.7Wm r1 = androidx.compose.ui.Modifier.A00
            androidx.compose.ui.Modifier r6 = androidx.compose.ui.Modifier.A04(r1)
            r10 = 3080(0xc08, float:4.316E-42)
            r5 = r0
            r7 = r4
            r11 = r2
            X.C100456Nj.A00(r5, r6, r7, r8, r9, r10, r11)
            goto L_0x04ff
        L_0x0589:
            boolean r3 = r6 instanceof X.AnonymousClass5M2
            if (r3 == 0) goto L_0x05ae
            r3 = 521368114(0x1f137232, float:3.122292E-20)
            r0.Cvb(r3)
            java.lang.Object r3 = r1.A02
            r1 = 34
            kotlin.jvm.internal.KtLambdaShape36S0100000_I2_16 r4 = new kotlin.jvm.internal.KtLambdaShape36S0100000_I2_16
            r4.<init>(r3, r1)
            X.7Wm r1 = androidx.compose.ui.Modifier.A00
            androidx.compose.ui.Modifier r3 = androidx.compose.ui.Modifier.A04(r1)
            float r1 = (float) r5
            androidx.compose.ui.Modifier r3 = X.AnonymousClass7K4.A06(r3, r1, r2)
            r1 = 48
            X.C100446Ni.A00(r0, r3, r4, r1, r2)
            goto L_0x0502
        L_0x05ae:
            r1 = 521368329(0x1f137309, float:3.1223616E-20)
            r0.Cvb(r1)
            goto L_0x0502
        L_0x05b6:
            r4 = r5
            goto L_0x04bf
        L_0x05b9:
            r0.CuJ()
            goto L_0x067f
        L_0x05be:
            X.8nY r4 = X.C86104wH.A0H(r0, r3)
            java.lang.Object r3 = r1.A00
            java.lang.Object r2 = r1.A02
            java.lang.Object r1 = r1.A01
            r0 = 34
            kotlin.jvm.internal.KtLambdaShape5S0300000_I2 r2 = X.C86154wM.A15(r3, r2, r1, r0)
            X.7Wm r0 = androidx.compose.ui.Modifier.A00
            androidx.compose.ui.Modifier r1 = X.AnonymousClass7FI.A01(r0)
            r0 = 0
            X.AnonymousClass6NZ.A00(r4, r1, r2, r0)
            goto L_0x067f
        L_0x05da:
            X.7Zx r6 = (X.C123917Zx) r6
            X.8nY r5 = X.C86104wH.A0H(r0, r3)
            r22 = 0
            boolean r25 = X.AnonymousClass0wJ.A1Z(r4, r6)
            android.os.Bundle r4 = r6.A06
            if (r4 == 0) goto L_0x0646
            java.lang.String r0 = "id"
            java.lang.String r11 = r4.getString(r0)
        L_0x05f0:
            if (r4 == 0) goto L_0x0644
            r3 = 19
            r2 = 8
            r0 = 108(0x6c, float:1.51E-43)
            java.lang.String r0 = X.AnonymousClass3QI.A00(r3, r2, r0)
            java.lang.String r12 = r4.getString(r0)
        L_0x0600:
            java.lang.Object r0 = r1.A01
            r2 = 4
            kotlin.jvm.internal.KtLambdaShape34S0100000_I2_14 r13 = X.C86164wN.A0z(r0, r2)
            java.lang.Object r8 = r1.A02
            X.7p0 r8 = (X.AnonymousClass7p0) r8
            r2 = 5
            kotlin.jvm.internal.KtLambdaShape34S0100000_I2_14 r14 = X.C86164wN.A0z(r0, r2)
            kotlin.jvm.internal.KtLambdaShape152S0100000_I2_7 r18 = X.C86164wN.A0t(r0, r2)
            r2 = 6
            kotlin.jvm.internal.KtLambdaShape34S0100000_I2_14 r15 = X.C86164wN.A0z(r0, r2)
            java.lang.Object r1 = r1.A00
            kotlin.jvm.internal.KtLambdaShape152S0100000_I2_7 r19 = X.C86164wN.A0t(r1, r2)
            r2 = 7
            kotlin.jvm.internal.KtLambdaShape34S0100000_I2_14 r16 = X.C86164wN.A0z(r0, r2)
            kotlin.jvm.internal.KtLambdaShape152S0100000_I2_7 r20 = X.C86164wN.A0t(r0, r2)
            r2 = 8
            kotlin.jvm.internal.KtLambdaShape152S0100000_I2_7 r21 = X.C86164wN.A0t(r0, r2)
            r2 = 32
            kotlin.jvm.internal.KtLambdaShape19S0200000_I2_3 r3 = new kotlin.jvm.internal.KtLambdaShape19S0200000_I2_3
            r3.<init>(r2, r1, r0)
            r6 = 0
            r23 = 384(0x180, float:5.38E-43)
            r24 = 116736(0x1c800, float:1.63582E-40)
            r7 = r6
            r9 = r6
            r10 = r6
            r17 = r3
            X.C100386Nc.A00(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            goto L_0x067f
        L_0x0644:
            r12 = 0
            goto L_0x0600
        L_0x0646:
            r11 = 0
            goto L_0x05f0
        L_0x0648:
            r3.A03(r12)
            X.7yH r3 = r3.A01()
        L_0x064f:
            X.AnonymousClass7W3.A0w(r6, r2)
            if (r3 == 0) goto L_0x0657
            r7.A04(r3)
        L_0x0657:
            r3 = 8
            r1 = r21
            X.C120617Bt.A00(r0, r7, r1, r3)
            X.C120617Bt.A01(r0, r7, r1, r3)
            X.7yH r5 = r7.A01()
            X.AnonymousClass7W3.A0w(r6, r2)
            r16 = 0
            r15 = 4094(0xffe, float:5.737E-42)
            r3 = r0
            r4 = r18
            r6 = r4
            r7 = r4
            r8 = r4
            r9 = r4
            r10 = r2
            r11 = r2
            r12 = r2
            r13 = r2
            r14 = r2
            r18 = r16
            r20 = r2
            X.AnonymousClass7I9.A01(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r18, r20)
        L_0x067f:
            kotlin.Unit r18 = kotlin.Unit.A00
            return r18
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.KtLambdaShape15S0300000_I2.invoke(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
