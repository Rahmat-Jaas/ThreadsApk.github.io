package X;

import androidx.compose.ui.Modifier;
import java.util.List;

/* renamed from: X.8ax  reason: invalid class name */
public final class AnonymousClass8ax extends C02220Ah implements AnonymousClass0YC {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C147368pE A01;
    public final /* synthetic */ C81784oM A02;
    public final /* synthetic */ Modifier A03;
    public final /* synthetic */ C105496dW A04;
    public final /* synthetic */ C146638ma A05;
    public final /* synthetic */ AnonymousClass56T A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ List A08;
    public final /* synthetic */ AnonymousClass0ZU A09;
    public final /* synthetic */ AnonymousClass0YY A0A;
    public final /* synthetic */ AnonymousClass0YY A0B;
    public final /* synthetic */ AnonymousClass0YY A0C;
    public final /* synthetic */ AnonymousClass0YP A0D;
    public final /* synthetic */ AnonymousClass0YP A0E;
    public final /* synthetic */ AnonymousClass0YP A0F;
    public final /* synthetic */ AnonymousClass0YP A0G;
    public final /* synthetic */ AnonymousClass0YC A0H;
    public final /* synthetic */ AnonymousClass0YC A0I;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8ax(C147368pE r2, C81784oM r3, Modifier modifier, C105496dW r5, C146638ma r6, AnonymousClass56T r7, String str, List list, AnonymousClass0ZU r10, AnonymousClass0YY r11, AnonymousClass0YY r12, AnonymousClass0YY r13, AnonymousClass0YP r14, AnonymousClass0YP r15, AnonymousClass0YP r16, AnonymousClass0YP r17, AnonymousClass0YC r18, AnonymousClass0YC r19, int i) {
        super(4);
        this.A08 = list;
        this.A04 = r5;
        this.A07 = str;
        this.A05 = r6;
        this.A0I = r18;
        this.A0G = r14;
        this.A0H = r19;
        this.A09 = r10;
        this.A0A = r11;
        this.A0B = r12;
        this.A0F = r15;
        this.A0D = r16;
        this.A03 = modifier;
        this.A0C = r13;
        this.A0E = r17;
        this.A00 = i;
        this.A06 = r7;
        this.A01 = r2;
        this.A02 = r3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x009d, code lost:
        if (((com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0110000_I2) r8.A02.getValue()).A00 != null) goto L_0x009f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r43, java.lang.Object r44, java.lang.Object r45, java.lang.Object r46) {
        /*
            r42 = this;
            r7 = r45
            int r2 = X.AnonymousClass0wJ.A04(r44)
            X.8nY r7 = (X.C147188nY) r7
            int r1 = X.AnonymousClass0wJ.A04(r46)
            r6 = 0
            r3 = r43
            X.C04220Ms.A0B(r3, r6)
            r0 = r1 & 14
            if (r0 != 0) goto L_0x0133
            int r0 = X.C147188nY.A0F(r7, r3)
            r3 = r1 | r0
        L_0x001c:
            r0 = r1 & 112(0x70, float:1.57E-43)
            r10 = 32
            if (r0 != 0) goto L_0x0027
            int r0 = X.C147188nY.A04(r7, r2)
            r3 = r3 | r0
        L_0x0027:
            r1 = r3 & 731(0x2db, float:1.024E-42)
            r0 = 146(0x92, float:2.05E-43)
            if (r1 != r0) goto L_0x0039
            boolean r0 = r7.BCM()
            if (r0 == 0) goto L_0x0039
            r7.CuJ()
        L_0x0036:
            kotlin.Unit r0 = kotlin.Unit.A00
            return r0
        L_0x0039:
            r8 = r42
            java.util.List r0 = r8.A08
            java.lang.Object r5 = r0.get(r2)
            r0 = r3 & 14
            r1 = r3 & 112(0x70, float:1.57E-43)
            r1 = r1 | r0
            X.8mY r5 = (X.C146628mY) r5
            r0 = -1920363779(0xffffffff8d8992fd, float:-8.478663E-31)
            r7.Cvb(r0)
            r0 = r1 & 112(0x70, float:1.57E-43)
            if (r0 != 0) goto L_0x0130
            boolean r0 = r7.ACW(r2)
            if (r0 != 0) goto L_0x005a
            r10 = 16
        L_0x005a:
            r10 = r10 | r1
        L_0x005b:
            r0 = r1 & 896(0x380, float:1.256E-42)
            if (r0 != 0) goto L_0x0064
            int r0 = X.C147188nY.A0H(r7, r5)
            r10 = r10 | r0
        L_0x0064:
            r1 = r10 & 5841(0x16d1, float:8.185E-42)
            r0 = 1168(0x490, float:1.637E-42)
            if (r1 != r0) goto L_0x0077
            boolean r0 = r7.BCM()
            if (r0 == 0) goto L_0x0077
            r7.CuJ()
        L_0x0073:
            X.AnonymousClass7W3.A0z(r7, r6)
            goto L_0x0036
        L_0x0077:
            X.6dW r0 = r8.A04
            java.lang.String r1 = r5.B2L()
            X.8p3 r16 = X.AnonymousClass6MD.A00(r7, r0, r1)
            X.8pE r0 = r8.A01
            java.lang.Object r0 = r0.getValue()
            int r0 = X.AnonymousClass0wJ.A04(r0)
            boolean r39 = X.AnonymousClass0wJ.A1T(r0, r2)
            if (r2 != 0) goto L_0x009f
            X.4oM r0 = r8.A02
            java.lang.Object r0 = r0.getValue()
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0110000_I2 r0 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0110000_I2) r0
            java.lang.Object r0 = r0.A00
            r40 = 1
            if (r0 == 0) goto L_0x00a1
        L_0x009f:
            r40 = 0
        L_0x00a1:
            java.lang.String r0 = r8.A07
            boolean r41 = X.C04220Ms.A0I(r1, r0)
            X.8ma r0 = r8.A05
            r18 = r0
            X.0YC r0 = r8.A0I
            r17 = r0
            X.0YP r15 = r8.A0G
            X.0YC r14 = r8.A0H
            X.0ZU r13 = r8.A09
            X.0YY r12 = r8.A0A
            X.0YY r11 = r8.A0B
            X.0YP r9 = r8.A0F
            X.0YP r4 = r8.A0D
            androidx.compose.ui.Modifier r3 = r8.A03
            r2 = 0
            X.0YY r1 = r8.A0C
            X.0YP r0 = r8.A0E
            int r10 = r10 >> 6
            r35 = r10 & 14
            int r10 = r8.A00
            int r10 = r10 << 3
            r10 = r10 & 112(0x70, float:1.57E-43)
            r35 = r35 | r10
            r36 = 384(0x180, float:5.38E-43)
            r38 = 319488(0x4e000, float:4.47698E-40)
            r25 = r2
            r26 = r2
            r28 = r2
            r29 = r15
            r30 = r9
            r31 = r4
            r32 = r0
            r33 = r17
            r34 = r14
            r37 = r6
            r23 = r11
            r24 = r2
            r27 = r1
            r20 = r18
            r21 = r13
            r22 = r12
            r17 = r7
            r18 = r3
            r19 = r5
            X.AnonymousClass6N1.A00(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41)
            boolean r0 = r5 instanceof X.C90335Ll
            if (r0 == 0) goto L_0x0073
            kotlin.Unit r9 = kotlin.Unit.A00
            r0 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r7.Cvb(r0)
            X.56T r4 = r8.A06
            boolean r0 = r7.ACY(r4)
            boolean r0 = X.C147188nY.A12(r7, r5, r0)
            r3 = r7
            X.7W3 r3 = (X.AnonymousClass7W3) r3
            java.lang.Object r1 = r3.A13()
            if (r0 != 0) goto L_0x0121
            java.lang.Object r0 = X.AnonymousClass7GN.A00
            if (r1 != r0) goto L_0x012b
        L_0x0121:
            r0 = 20
            kotlin.coroutines.jvm.internal.KtSLambdaShape6S0200000_I2_1 r1 = new kotlin.coroutines.jvm.internal.KtSLambdaShape6S0200000_I2_1
            r1.<init>((java.lang.Object) r5, (java.lang.Object) r4, (X.C146958n9) r2, (int) r0)
            r3.A14(r1)
        L_0x012b:
            X.AnonymousClass7W3.A0b(r7, r3, r1, r9, r6)
            goto L_0x0073
        L_0x0130:
            r10 = r1
            goto L_0x005b
        L_0x0133:
            r3 = r1
            goto L_0x001c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8ax.invoke(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
