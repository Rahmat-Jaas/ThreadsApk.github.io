package X;

/* renamed from: X.8Yu  reason: invalid class name and case insensitive filesystem */
public final class C140868Yu extends C02220Ah implements AnonymousClass0YM {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C147368pE A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ AnonymousClass8s2 A03;
    public final /* synthetic */ boolean A04;
    public final /* synthetic */ boolean A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C140868Yu(C147368pE r2, String str, AnonymousClass8s2 r4, int i, boolean z, boolean z2) {
        super(3);
        this.A04 = z;
        this.A03 = r4;
        this.A00 = i;
        this.A05 = z2;
        this.A01 = r2;
        this.A02 = str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0049, code lost:
        if (X.C04220Ms.A0I(r3.getId(), ((X.C147068nL) X.AnonymousClass00J.A0C(r5.A03)).getId()) == false) goto L_0x004b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r20, java.lang.Object r21, java.lang.Object r22) {
        /*
            r19 = this;
            r7 = r21
            r3 = r20
            X.8nL r3 = (X.C147068nL) r3
            X.8nY r7 = (X.C147188nY) r7
            int r2 = X.AnonymousClass0wJ.A04(r22)
            r1 = 0
            X.C04220Ms.A0B(r3, r1)
            r0 = r2 & 14
            r4 = 4
            if (r0 != 0) goto L_0x00f2
            int r0 = X.C147188nY.A0F(r7, r3)
            r0 = r0 | r2
        L_0x001a:
            r2 = r0 & 91
            r0 = 18
            if (r2 != r0) goto L_0x002c
            boolean r0 = r7.BCM()
            if (r0 == 0) goto L_0x002c
            r7.CuJ()
        L_0x0029:
            kotlin.Unit r0 = kotlin.Unit.A00
            return r0
        L_0x002c:
            r5 = r19
            boolean r0 = r5.A04
            r16 = 1
            if (r0 == 0) goto L_0x004b
            java.lang.String r2 = r3.getId()
            X.8s2 r0 = r5.A03
            java.lang.Object r0 = X.AnonymousClass00J.A0C(r0)
            X.8nL r0 = (X.C147068nL) r0
            java.lang.String r0 = r0.getId()
            boolean r0 = X.C04220Ms.A0I(r2, r0)
            r6 = 1
            if (r0 != 0) goto L_0x004c
        L_0x004b:
            r6 = 0
        L_0x004c:
            int r0 = r5.A00
            r0 = r0 & 14
            boolean r2 = X.AnonymousClass0wJ.A1T(r0, r4)
            java.lang.String r4 = r5.A02
            r0 = r7
            X.7W3 r0 = (X.AnonymousClass7W3) r0
            java.lang.Object r12 = r0.A13()
            if (r2 != 0) goto L_0x0063
            java.lang.Object r2 = X.AnonymousClass7GN.A00
            if (r12 != r2) goto L_0x0068
        L_0x0063:
            r2 = 5
            kotlin.jvm.internal.KtLambdaShape8S1000000_I2 r12 = X.AnonymousClass7W3.A0Q(r0, r4, r2)
        L_0x0068:
            if (r6 != 0) goto L_0x006b
            r12 = 0
        L_0x006b:
            X.0ZU r12 = (X.AnonymousClass0ZU) r12
            boolean r2 = r3 instanceof X.C90365Ls
            if (r2 == 0) goto L_0x00a9
            r2 = -74564894(0xfffffffffb8e3ae2, float:-1.4770009E36)
            r7.Cvb(r2)
            r2 = r3
            X.5Ls r2 = (X.C90365Ls) r2
            java.util.List r2 = r2.A04
            java.lang.Object r2 = X.AnonymousClass00J.A0C(r2)
            com.instagram.common.typedurl.ImageUrl r2 = (com.instagram.common.typedurl.ImageUrl) r2
            r14 = 0
            r13 = 2
            r10 = r7
            r11 = r2
            X.6uo r11 = X.C120577Bm.A02(r10, r11, r12, r13, r14)
            java.lang.String r13 = r3.AOQ()
            if (r13 != 0) goto L_0x0098
            r2 = 2131822091(0x7f11060b, float:1.9276944E38)
            java.lang.String r13 = X.AnonymousClass7JS.A01(r7, r2)
        L_0x0098:
            r8 = 0
            X.8n1 r12 = X.AnonymousClass74L.A00
            r15 = 24584(0x6008, float:3.445E-41)
            r16 = 108(0x6c, float:1.51E-43)
            r14 = 0
            r9 = r8
            r10 = r8
            X.C97846Dc.A00(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
        L_0x00a5:
            X.AnonymousClass7W3.A0w(r0, r1)
            goto L_0x0029
        L_0x00a9:
            boolean r2 = r3 instanceof X.C90375Lt
            if (r2 == 0) goto L_0x00eb
            r2 = -74564466(0xfffffffffb8e3c8e, float:-1.4770687E36)
            r7.Cvb(r2)
            r2 = r3
            X.5Lt r2 = (X.C90375Lt) r2
            X.JXj r10 = r2.A03
            int r2 = r3.getWidth()
            float r4 = (float) r2
            int r2 = r3.getHeight()
            float r2 = (float) r2
            float r13 = X.AnonymousClass6MM.A00(r4, r2)
            boolean r2 = r5.A05
            if (r2 == 0) goto L_0x00e8
            X.8pE r2 = r5.A01
            java.lang.Object r2 = r2.getValue()
            boolean r2 = X.C04220Ms.A0I(r2, r10)
            if (r2 == 0) goto L_0x00e8
        L_0x00d6:
            java.lang.String r11 = r3.AOQ()
            r8 = 0
            r17 = 1
            r14 = 27648(0x6c00, float:3.8743E-41)
            r15 = 192(0xc0, float:2.69E-43)
            r9 = r8
            r18 = r1
            X.C100356Mz.A00(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            goto L_0x00a5
        L_0x00e8:
            r16 = 0
            goto L_0x00d6
        L_0x00eb:
            r2 = -74563966(0xfffffffffb8e3e82, float:-1.477148E36)
            r7.Cvb(r2)
            goto L_0x00a5
        L_0x00f2:
            r0 = r2
            goto L_0x001a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C140868Yu.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
