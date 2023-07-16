package com.facebook.redex;

import X.C82394pY;

public class IDxEListenerShape165S0200000_1_I2 implements C82394pY {
    public Object A00;
    public Object A01;
    public final int A02;

    public IDxEListenerShape165S0200000_1_I2(int i, Object obj, Object obj2) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = obj2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:46:0x0196  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x01a1  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x01c2  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x01d6  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x01e5  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0206  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0208  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x020b  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x023f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void onEvent(java.lang.Object r13) {
        /*
            r12 = this;
            int r0 = r12.A02
            switch(r0) {
                case 0: goto L_0x006e;
                case 1: goto L_0x00c8;
                case 2: goto L_0x0100;
                case 3: goto L_0x012d;
                case 4: goto L_0x02b4;
                case 5: goto L_0x027f;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r4 = r12.A00
            X.0yP r4 = (X.C19000yP) r4
            java.lang.Object r5 = r12.A01
            java.util.List r5 = (java.util.List) r5
            X.46U r13 = (X.AnonymousClass46U) r13
            com.instagram.service.session.UserSession r0 = r4.A0P
            X.49M r0 = X.C35812Ox.A00(r0)
            com.instagram.service.session.UserSession r3 = r0.A03
            X.0TJ r2 = X.AnonymousClass0TJ.A05
            r0 = 36317891267858467(0x8106ee00031023, double:3.030918905979203E-306)
            boolean r0 = X.C63803iN.A0E(r2, r3, r0)
            if (r0 != 0) goto L_0x02f9
            java.util.Iterator r3 = r5.iterator()
        L_0x0028:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0046
            java.lang.Object r2 = r3.next()
            X.3AG r2 = (X.AnonymousClass3AG) r2
            java.lang.String r1 = r2.A02
            java.lang.String r0 = r13.A01
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0028
            r0 = 1
            r2.A01 = r0
            java.lang.String r0 = r13.A00
            r2.A00 = r0
            goto L_0x0028
        L_0x0046:
            java.util.List r0 = r4.A0U
            java.util.Iterator r3 = r0.iterator()
        L_0x004c:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x02f9
            java.lang.Object r2 = r3.next()
            android.view.View r2 = (android.view.View) r2
            java.lang.Object r0 = r2.getTag()
            if (r0 == 0) goto L_0x004c
            java.lang.Object r1 = r2.getTag()
            java.lang.String r0 = r13.A01
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x004c
            r2.performClick()
            goto L_0x004c
        L_0x006e:
            r0 = -932871577(0xffffffffc8658267, float:-235017.61)
            int r4 = X.C14030oh.A03(r0)
            X.45Q r13 = (X.AnonymousClass45Q) r13
            r0 = -1774925565(0xffffffff9634c903, float:-1.4603712E-25)
            int r3 = X.C14030oh.A03(r0)
            r5 = 0
            X.C04220Ms.A0B(r13, r5)
            java.lang.Integer r1 = r13.A00
            java.lang.Integer r0 = X.AnonymousClass006.A00
            if (r1 == r0) goto L_0x00b7
            X.3VO r2 = X.AnonymousClass3VO.A00()
            int r0 = r1.intValue()
            switch(r0) {
                case 0: goto L_0x00c5;
                case 1: goto L_0x00c2;
                default: goto L_0x0093;
            }
        L_0x0093:
            java.lang.String r0 = "FAILED"
        L_0x0095:
            r2.A02(r0, r5)
            r1 = 1
            java.lang.String r0 = r13.A02
            r2.A02(r0, r1)
            r1 = 2
            java.lang.String r0 = r13.A01
            X.3iY r2 = X.C63893iY.A05(r2, r0, r1)
            java.lang.Object r1 = r12.A01
            X.601 r1 = (X.AnonymousClass601) r1
            java.lang.Object r0 = r12.A00
            X.6jp r0 = (X.C109326jp) r0
            X.C61043Rr.A00(r1, r2, r0)
            X.KHr r1 = X.C38040KHr.A01
            java.lang.Class<X.45Q> r0 = X.AnonymousClass45Q.class
            r1.A04(r12, r0)
        L_0x00b7:
            r0 = -106068120(0xfffffffff9ad8768, float:-1.1262672E35)
            X.C14030oh.A0A(r0, r3)
            r0 = 2100454204(0x7d32633c, float:1.4819865E37)
            goto L_0x02f6
        L_0x00c2:
            java.lang.String r0 = "SUCCESS"
            goto L_0x0095
        L_0x00c5:
            java.lang.String r0 = "STARTED"
            goto L_0x0095
        L_0x00c8:
            r0 = -854969200(0xffffffffcd0a3490, float:-1.44918784E8)
            int r4 = X.C14030oh.A03(r0)
            X.46R r13 = (X.AnonymousClass46R) r13
            r0 = -1469906491(0xffffffffa86301c5, float:-1.2601415E-14)
            int r3 = X.AnonymousClass0wJ.A00(r0, r13)
            java.lang.Object r2 = r12.A01
            com.instagram.user.model.User r2 = (com.instagram.user.model.User) r2
            java.lang.String r1 = r2.getId()
            com.instagram.user.model.User r0 = r13.A00
            java.lang.String r0 = r0.getId()
            boolean r0 = X.C04220Ms.A0I(r1, r0)
            if (r0 == 0) goto L_0x00f5
            java.lang.Object r1 = r12.A00
            X.8m8 r1 = (X.C146368m8) r1
            X.22o r0 = r2.A02
            r1.D7w(r0)
        L_0x00f5:
            r0 = 1652546110(0x627fda3e, float:1.17991144E21)
            X.C14030oh.A0A(r0, r3)
            r0 = -702573962(0xffffffffd61f9276, float:-4.3862848E13)
            goto L_0x02f6
        L_0x0100:
            r0 = -159632920(0xfffffffff67c31e8, float:-1.2787803E33)
            int r4 = X.C14030oh.A03(r0)
            X.45U r13 = (X.AnonymousClass45U) r13
            r0 = 220512195(0xd24bfc3, float:5.0767227E-31)
            int r2 = X.C14030oh.A03(r0)
            java.lang.Object r1 = r12.A00
            X.0m7 r1 = (X.C12560m7) r1
            android.os.Bundle r0 = X.C62463a4.A00(r13)
            X.C62463a4.A01(r0, r1)
            java.lang.Object r0 = r12.A01
            X.4pY r0 = (X.C82394pY) r0
            r0.onEvent(r13)
            r0 = -282391644(0xffffffffef2b0ba4, float:-5.293601E28)
            X.C14030oh.A0A(r0, r2)
            r0 = -134821545(0xfffffffff7f6c957, float:-1.0010849E34)
            goto L_0x02f6
        L_0x012d:
            r0 = -821541022(0xffffffffcf084762, float:-2.28637952E9)
            int r4 = X.C14030oh.A03(r0)
            X.46C r13 = (X.AnonymousClass46C) r13
            r0 = 1990447913(0x76a3d329, float:1.6613813E33)
            int r7 = X.C14030oh.A03(r0)
            r6 = 0
            X.C04220Ms.A0B(r13, r6)
            android.net.Uri r2 = r13.A00
            X.2Cp r8 = new X.2Cp
            r8.<init>()
            java.lang.Object r0 = r12.A01
            X.KIZ r0 = (X.KIZ) r0
            com.instagram.service.session.UserSession r5 = r0.A0S
            java.lang.Object r0 = r12.A00
            android.content.Context r3 = X.C18220wO.A0A(r0)
            java.lang.String r0 = "component_type"
            java.lang.String r1 = r2.getQueryParameter(r0)
            java.lang.String r0 = "toast"
            boolean r0 = X.C04220Ms.A0I(r1, r0)
            if (r0 == 0) goto L_0x01f5
            java.lang.String r0 = "content_variant"
            java.lang.String r2 = r2.getQueryParameter(r0)
            java.lang.String r1 = "ig_acv_evergreen_confirmation"
            boolean r0 = X.C04220Ms.A0I(r2, r1)
            if (r0 == 0) goto L_0x0248
            r0 = 2131828425(0x7f111ec9, float:1.928979E38)
        L_0x0173:
            java.lang.Integer r11 = java.lang.Integer.valueOf(r0)
        L_0x0177:
            boolean r0 = X.C04220Ms.A0I(r2, r1)
            r9 = 0
            if (r0 != 0) goto L_0x019b
            java.lang.String r0 = "consent_debut_confirmation"
            boolean r0 = X.C04220Ms.A0I(r2, r0)
            if (r0 != 0) goto L_0x019b
            java.lang.String r0 = "consent_debut_reconsider"
            boolean r0 = X.C04220Ms.A0I(r2, r0)
            if (r0 != 0) goto L_0x023f
            java.lang.String r0 = "consent_debut_reconsider_2"
            boolean r0 = X.C04220Ms.A0I(r2, r0)
            if (r0 != 0) goto L_0x023f
            java.lang.String r0 = "ig_acv_evergreen_confirmation_v2"
            X.C04220Ms.A0I(r2, r0)
        L_0x019b:
            boolean r0 = X.C04220Ms.A0I(r2, r1)
            if (r0 == 0) goto L_0x020b
            com.facebook.redex.IDxCBackShape131S0000000_1_I2 r10 = new com.facebook.redex.IDxCBackShape131S0000000_1_I2
            r10.<init>(r6)
        L_0x01a6:
            X.Kzl r10 = (X.C39777Kzl) r10
        L_0x01a8:
            X.3iD r5 = X.C63733iD.A01()
            boolean r0 = X.C04220Ms.A0I(r2, r1)
            if (r0 != 0) goto L_0x0208
            java.lang.String r0 = "ig_acv_evergreen_confirmation_v2"
            boolean r0 = X.C04220Ms.A0I(r2, r0)
            if (r0 != 0) goto L_0x0208
            java.lang.String r0 = "consent_debut_confirmation"
            boolean r0 = X.C04220Ms.A0I(r2, r0)
            if (r0 != 0) goto L_0x0208
            java.lang.String r0 = "consent_debut_reconsider"
            boolean r0 = X.C04220Ms.A0I(r2, r0)
            if (r0 != 0) goto L_0x01cf
            java.lang.String r0 = "consent_debut_reconsider_2"
            X.C04220Ms.A0I(r2, r0)
        L_0x01cf:
            X.22c r0 = X.C306022c.DEFAULT
        L_0x01d1:
            r5.A0F(r0)
            if (r11 == 0) goto L_0x0206
            int r0 = r11.intValue()
            java.lang.String r0 = r3.getString(r0)
        L_0x01de:
            r5.A0A = r0
            r5.A0C()
            if (r10 == 0) goto L_0x01f5
            r0 = 500(0x1f4, double:2.47E-321)
            android.os.Handler r6 = X.AnonymousClass0wJ.A0F()
            if (r9 == 0) goto L_0x0200
            X.4So r2 = new X.4So
            r2.<init>(r3, r10, r5, r9)
        L_0x01f2:
            r6.postDelayed(r2, r0)
        L_0x01f5:
            r0 = 2097670359(0x7d07e8d7, float:1.1290922E37)
            X.C14030oh.A0A(r0, r7)
            r0 = 1355096501(0x50c521b5, float:2.64585646E10)
            goto L_0x02f6
        L_0x0200:
            X.4Qc r2 = new X.4Qc
            r2.<init>(r10, r5)
            goto L_0x01f2
        L_0x0206:
            r0 = 0
            goto L_0x01de
        L_0x0208:
            X.22c r0 = X.C306022c.SUCCESS
            goto L_0x01d1
        L_0x020b:
            java.lang.String r0 = "ig_acv_evergreen_confirmation_v2"
            boolean r0 = X.C04220Ms.A0I(r2, r0)
            if (r0 == 0) goto L_0x021a
            r0 = 1
        L_0x0214:
            com.facebook.redex.IDxCBackShape131S0000000_1_I2 r10 = new com.facebook.redex.IDxCBackShape131S0000000_1_I2
            r10.<init>(r0)
            goto L_0x01a6
        L_0x021a:
            java.lang.String r0 = "consent_debut_confirmation"
            boolean r0 = X.C04220Ms.A0I(r2, r0)
            if (r0 == 0) goto L_0x0224
            r0 = 2
            goto L_0x0214
        L_0x0224:
            java.lang.String r0 = "consent_debut_reconsider"
            boolean r0 = X.C04220Ms.A0I(r2, r0)
            if (r0 != 0) goto L_0x0235
            java.lang.String r0 = "consent_debut_reconsider_2"
            boolean r0 = X.C04220Ms.A0I(r2, r0)
            if (r0 == 0) goto L_0x023c
            r6 = 1
        L_0x0235:
            com.facebook.redex.IDxCBackShape81S0300000_1_I2 r10 = new com.facebook.redex.IDxCBackShape81S0300000_1_I2
            r10.<init>(r6, r3, r5, r8)
            goto L_0x01a6
        L_0x023c:
            r10 = 0
            goto L_0x01a8
        L_0x023f:
            r0 = 2131828431(0x7f111ecf, float:1.9289803E38)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r0)
            goto L_0x019b
        L_0x0248:
            java.lang.String r0 = "consent_debut_confirmation"
            boolean r0 = X.C04220Ms.A0I(r2, r0)
            if (r0 == 0) goto L_0x0255
            r0 = 2131828427(0x7f111ecb, float:1.9289795E38)
            goto L_0x0173
        L_0x0255:
            java.lang.String r0 = "consent_debut_reconsider"
            boolean r0 = X.C04220Ms.A0I(r2, r0)
            if (r0 == 0) goto L_0x0262
            r0 = 2131828429(0x7f111ecd, float:1.9289799E38)
            goto L_0x0173
        L_0x0262:
            java.lang.String r0 = "consent_debut_reconsider_2"
            boolean r0 = X.C04220Ms.A0I(r2, r0)
            if (r0 == 0) goto L_0x026f
            r0 = 2131828430(0x7f111ece, float:1.92898E38)
            goto L_0x0173
        L_0x026f:
            java.lang.String r0 = "ig_acv_evergreen_confirmation_v2"
            boolean r0 = X.C04220Ms.A0I(r2, r0)
            if (r0 == 0) goto L_0x027c
            r0 = 2131828428(0x7f111ecc, float:1.9289797E38)
            goto L_0x0173
        L_0x027c:
            r11 = 0
            goto L_0x0177
        L_0x027f:
            java.lang.Object r5 = r12.A00
            X.0yP r5 = (X.C19000yP) r5
            java.lang.Object r4 = r12.A01
            X.2AI r4 = (X.AnonymousClass2AI) r4
            X.46V r13 = (X.AnonymousClass46V) r13
            com.instagram.igds.components.switchbutton.IgSwitch r0 = r5.A03
            r0.getClass()
            boolean r0 = r0.isChecked()
            boolean r1 = r13.A01
            r3 = 0
            r2 = 0
            if (r0 == r1) goto L_0x0299
            r2 = 1
        L_0x0299:
            com.instagram.igds.components.switchbutton.IgSwitch r0 = r5.A03
            r0.setChecked(r1)
            java.lang.String r1 = r13.A00
            if (r1 == 0) goto L_0x02aa
            android.widget.TextView r0 = r5.A01
            r0.getClass()
            r0.setText(r1)
        L_0x02aa:
            X.4qn r0 = r5.A04
            if (r0 == 0) goto L_0x02f9
            if (r2 == 0) goto L_0x02f9
            r0.Bkx(r4, r3)
            return
        L_0x02b4:
            r0 = -327971467(0xffffffffec738d75, float:-1.17774794E27)
            int r4 = X.C14030oh.A03(r0)
            X.0PA r13 = (X.AnonymousClass0PA) r13
            r0 = -919736247(0xffffffffc92df049, float:-712452.56)
            int r6 = X.C14030oh.A03(r0)
            r2 = 0
            X.C04220Ms.A0B(r13, r2)
            java.lang.String r1 = r13.A01
            if (r1 == 0) goto L_0x02fa
            java.lang.String r0 = r13.A00
            if (r0 == 0) goto L_0x02fa
            java.lang.Object r5 = r12.A00
            android.content.Context r5 = (android.content.Context) r5
            X.Dsm r3 = X.C18190wL.A0W(r5)
            r3.A02 = r1
            r3.A0q(r2)
            r3.A0p(r0)
            r2 = 2131831976(0x7f112ca8, float:1.9296993E38)
            java.lang.Object r1 = r12.A01
            r0 = 44
            X.C18190wL.A1R(r3, r5, r1, r0, r2)
            X.AnonymousClass0wJ.A1K(r3)
        L_0x02ed:
            r0 = -707039773(0xffffffffd5db6de3, float:-3.01581258E13)
            X.C14030oh.A0A(r0, r6)
            r0 = 1472783461(0x57c8e465, float:4.41766545E14)
        L_0x02f6:
            X.C14030oh.A0A(r0, r4)
        L_0x02f9:
            return
        L_0x02fa:
            X.3YR r3 = X.AnonymousClass3YR.A00
            java.lang.Object r2 = r12.A00
            android.app.Activity r2 = (android.app.Activity) r2
            java.lang.Object r1 = r12.A01
            X.0i6 r1 = (X.C10300i6) r1
            r0 = 0
            r3.A02(r2, r0, r1)
            goto L_0x02ed
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.IDxEListenerShape165S0200000_1_I2.onEvent(java.lang.Object):void");
    }
}
