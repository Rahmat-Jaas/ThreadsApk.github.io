package X;

/* renamed from: X.8SL  reason: invalid class name */
public final class AnonymousClass8SL extends C02220Ah implements AnonymousClass0YP {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AnonymousClass68N A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ AnonymousClass0ZU A05;
    public final /* synthetic */ AnonymousClass0ZU A06;
    public final /* synthetic */ AnonymousClass0YP A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8SL(AnonymousClass68N r2, String str, String str2, String str3, AnonymousClass0ZU r6, AnonymousClass0ZU r7, AnonymousClass0YP r8, int i) {
        super(2);
        this.A03 = str;
        this.A04 = str2;
        this.A07 = r8;
        this.A00 = i;
        this.A06 = r6;
        this.A02 = str3;
        this.A01 = r2;
        this.A05 = r7;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0029, code lost:
        if (X.AnonymousClass8bQ.A0n(r28) != false) goto L_0x002b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003b, code lost:
        if (X.AnonymousClass8bQ.A0n(r1) != false) goto L_0x003d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r62, java.lang.Object r63) {
        /*
            r61 = this;
            r0 = r62
            X.8nY r0 = (X.C147188nY) r0
            int r1 = X.AnonymousClass0wJ.A04(r63)
            r2 = r1 & 11
            r29 = 2
            r1 = r29
            if (r2 != r1) goto L_0x001c
            boolean r1 = r0.BCM()
            if (r1 == 0) goto L_0x001c
            r0.CuJ()
        L_0x0019:
            kotlin.Unit r0 = kotlin.Unit.A00
            return r0
        L_0x001c:
            r4 = r61
            java.lang.String r1 = r4.A03
            r28 = r1
            if (r1 == 0) goto L_0x002b
            boolean r2 = X.AnonymousClass8bQ.A0n(r28)
            r1 = 0
            if (r2 == 0) goto L_0x002c
        L_0x002b:
            r1 = 1
        L_0x002c:
            r5 = 10
            if (r1 != 0) goto L_0x003d
            java.lang.String r1 = r4.A04
            if (r1 == 0) goto L_0x003d
            boolean r2 = X.AnonymousClass8bQ.A0n(r1)
            float r1 = (float) r5
            r16 = r1
            if (r2 == 0) goto L_0x0042
        L_0x003d:
            r1 = 8
            float r1 = (float) r1
            r16 = r1
        L_0x0042:
            X.7Wm r15 = androidx.compose.ui.Modifier.A00
            r2 = 0
            X.54z r27 = X.AnonymousClass7Kq.A02
            r1 = r27
            androidx.compose.ui.Modifier r3 = r15.Cx6(r1)
            float r1 = (float) r5
            androidx.compose.ui.Modifier r3 = X.AnonymousClass7K4.A06(r3, r1, r2)
            r1 = 54
            float r1 = (float) r1
            androidx.compose.ui.Modifier r9 = X.AnonymousClass7Kq.A06(r3, r1)
            X.8cu r26 = X.AnonymousClass7KV.A04
            X.0YP r1 = r4.A07
            r14 = r1
            int r3 = r4.A00
            X.0ZU r1 = r4.A06
            r60 = r1
            java.lang.String r1 = r4.A04
            r25 = r1
            java.lang.String r1 = r4.A02
            r36 = r1
            X.68N r1 = r4.A01
            r49 = r1
            X.0ZU r1 = r4.A05
            r48 = r1
            r24 = 693286680(0x2952b718, float:4.6788176E-14)
            r1 = r24
            r0.Cvb(r1)
            X.8jk r23 = X.AnonymousClass7J3.A01
            r4 = r23
            r1 = r26
            X.8ly r8 = X.AnonymousClass72N.A00(r4, r0, r1)
            X.534 r13 = X.C147188nY.A0a(r0)
            java.lang.Object r7 = r0.AEA(r13)
            X.534 r12 = X.AnonymousClass7DE.A07
            java.lang.Object r6 = r0.AEA(r12)
            X.534 r11 = X.AnonymousClass7DE.A0B
            java.lang.Object r5 = r0.AEA(r11)
            X.0ZU r10 = X.AnonymousClass74X.A00
            X.0YM r4 = X.C98236Es.A00(r9)
            r1 = r0
            X.7W3 r1 = (X.AnonymousClass7W3) r1
            X.C147188nY.A0w(r0, r1, r10)
            r1.A0T = r2
            X.0YP r9 = X.AnonymousClass74X.A03
            X.0YP r22 = X.AnonymousClass7Ak.A00(r0, r8, r7, r9)
            X.0YP r8 = X.AnonymousClass74X.A02
            X.0YP r7 = X.AnonymousClass7Ak.A01(r0, r6, r8)
            java.lang.Integer r21 = X.AnonymousClass7KP.A05(r0, r5, r7, r4)
            r6 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r0.Cvb(r6)
            X.7VA r20 = X.AnonymousClass7VA.A00
            r4 = 1925571257(0x72c5e2b9, float:7.8390576E30)
            r0.Cvb(r4)
            X.C86104wH.A1S(r0, r14, r3)
            r19 = 1065353216(0x3f800000, float:1.0)
            r33 = 0
            r18 = 1
            r14 = r20
            r5 = r19
            r4 = r18
            androidx.compose.ui.Modifier r5 = r14.DB5(r15, r5, r4)
            r4 = 12
            float r4 = (float) r4
            r14 = r5
            r5 = r4
            r4 = r16
            androidx.compose.ui.Modifier r14 = X.AnonymousClass7K4.A04(r14, r5, r4)
            X.8ly r4 = X.AnonymousClass7KV.A05(r0)
            java.lang.Object r5 = X.C147188nY.A0s(r0, r13)
            java.lang.Object r17 = r0.AEA(r12)
            java.lang.Object r16 = r0.AEA(r11)
            X.0YM r14 = X.C98236Es.A00(r14)
            X.C147188nY.A0w(r0, r1, r10)
            r1.A0T = r2
            X.AnonymousClass7Ak.A02(r0, r4, r9)
            r4 = r22
            X.AnonymousClass7Ak.A02(r0, r5, r4)
            r5 = r17
            r4 = r16
            X.7KP r4 = X.AnonymousClass7KP.A03(r0, r5, r4, r8, r7)
            r5 = r4
            r4 = r21
            r14.invoke(r5, r0, r4)
            r0.Cvb(r6)
            r4 = -1892455421(0xffffffff8f336c03, float:-8.846184E-30)
            r5 = r27
            androidx.compose.ui.Modifier r14 = androidx.compose.ui.Modifier.A03(r0, r15, r5, r4)
            r4 = r24
            r0.Cvb(r4)
            r5 = r23
            r4 = r26
            X.8ly r4 = X.AnonymousClass72N.A00(r5, r0, r4)
            java.lang.Object r13 = X.C147188nY.A0s(r0, r13)
            java.lang.Object r12 = r0.AEA(r12)
            java.lang.Object r11 = r0.AEA(r11)
            X.0YM r5 = X.C98236Es.A00(r14)
            X.C147188nY.A0w(r0, r1, r10)
            r1.A0T = r2
            X.AnonymousClass7Ak.A02(r0, r4, r9)
            r4 = r22
            X.AnonymousClass7Ak.A02(r0, r13, r4)
            X.7KP r7 = X.AnonymousClass7KP.A03(r0, r12, r11, r8, r7)
            r4 = r21
            r5.invoke(r7, r0, r4)
            r0.Cvb(r6)
            r4 = -1803095521(0xffffffff9486f21f, float:-1.3626042E-26)
            r0.Cvb(r4)
            X.7If r32 = X.AnonymousClass7J9.A04(r0)
            r5 = r20
            r4 = r19
            androidx.compose.ui.Modifier r31 = r5.DB5(r15, r4, r2)
            r43 = 0
            r57 = 0
            int r4 = r3 >> 3
            r40 = r4 & 14
            r7 = 805306368(0x30000000, float:4.656613E-10)
            r40 = r40 | r7
            r41 = 6
            r42 = 508(0x1fc, float:7.12E-43)
            r30 = r0
            r34 = r33
            r35 = r33
            r37 = r2
            r38 = r18
            r39 = r29
            r45 = r43
            r47 = r2
            X.AnonymousClass7I9.A02(r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r45, r47)
            int r4 = r3 >> 12
            r6 = r4 & 14
            int r4 = r3 >> 15
            r4 = r4 & 112(0x70, float:1.57E-43)
            r6 = r6 | r4
            r5 = r49
            r4 = r48
            X.C120557Bj.A02(r0, r5, r4, r6, r2)
            r4 = r18
            X.AnonymousClass7W3.A0v(r1, r4)
            r4 = 939045684(0x37f8b334, float:2.9647352E-5)
            r0.Cvb(r4)
            if (r28 == 0) goto L_0x01d6
            boolean r4 = X.AnonymousClass8bQ.A0n(r28)
            if (r4 != 0) goto L_0x01d6
            long r55 = X.AnonymousClass7KB.A03(r0)
            X.7If r44 = X.AnonymousClass7J9.A01(r0)
            int r4 = r3 >> 6
            r52 = r4 & 14
            r52 = r52 | r7
            r54 = 506(0x1fa, float:7.09E-43)
            r42 = r0
            r43 = r33
            r45 = r33
            r46 = r33
            r47 = r33
            r48 = r28
            r49 = r2
            r50 = r18
            r51 = r29
            r53 = r41
            r59 = r2
            X.AnonymousClass7I9.A02(r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r57, r59)
        L_0x01d6:
            X.AnonymousClass7W3.A0w(r1, r2)
            r4 = -1898747022(0xffffffff8ed36b72, float:-5.2118982E-30)
            r0.Cvb(r4)
            if (r25 == 0) goto L_0x0210
            boolean r4 = X.AnonymousClass8bQ.A0n(r25)
            if (r4 != 0) goto L_0x0210
            long r55 = X.AnonymousClass7KB.A03(r0)
            X.7If r44 = X.AnonymousClass7J9.A01(r0)
            int r3 = r3 >> 9
            r52 = r3 & 14
            r52 = r52 | r7
            r54 = 506(0x1fa, float:7.09E-43)
            r42 = r0
            r43 = r33
            r45 = r33
            r46 = r33
            r47 = r33
            r48 = r25
            r49 = r2
            r50 = r18
            r51 = r29
            r53 = r41
            r59 = r2
            X.AnonymousClass7I9.A02(r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r57, r59)
        L_0x0210:
            X.AnonymousClass7W3.A0w(r1, r2)
            r3 = r18
            X.AnonymousClass7W3.A0v(r1, r3)
            r3 = 2131232817(0x7f080831, float:1.8081754E38)
            X.6uo r4 = X.AnonymousClass6QP.A00(r0, r3)
            r3 = r60
            androidx.compose.ui.Modifier r3 = X.AnonymousClass7HZ.A03(r15, r3, r2)
            r2 = 2131830410(0x7f11268a, float:1.9293817E38)
            java.lang.String r2 = X.AnonymousClass7JS.A01(r0, r2)
            X.AnonymousClass7KB.A07(r0, r3, r4, r2)
            r0 = r18
            X.AnonymousClass7W3.A0v(r1, r0)
            goto L_0x0019
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8SL.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
