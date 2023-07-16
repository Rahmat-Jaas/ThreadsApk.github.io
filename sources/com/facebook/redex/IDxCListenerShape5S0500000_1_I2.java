package com.facebook.redex;

import android.view.View;

public class IDxCListenerShape5S0500000_1_I2 implements View.OnClickListener {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public final int A05;

    public IDxCListenerShape5S0500000_1_I2(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        this.A05 = i;
        this.A03 = obj5;
        this.A00 = obj;
        this.A04 = obj4;
        this.A01 = obj2;
        this.A02 = obj3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x00ce, code lost:
        r6.setResult(r5);
        r6.finish();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x00d4, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0122, code lost:
        X.C14030oh.A0C(r0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0125, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r11) {
        /*
            r10 = this;
            int r0 = r10.A05
            switch(r0) {
                case 0: goto L_0x0006;
                case 1: goto L_0x0046;
                case 2: goto L_0x007e;
                case 3: goto L_0x00a6;
                case 4: goto L_0x0164;
                case 5: goto L_0x00d5;
                case 6: goto L_0x0126;
                default: goto L_0x0005;
            }
        L_0x0005:
            return
        L_0x0006:
            r0 = 1068451330(0x3faf4602, float:1.369324)
            int r2 = X.C14030oh.A05(r0)
            java.lang.Object r0 = r10.A03
            X.4oR r0 = (X.C81814oR) r0
            r0.onCancel()
            java.lang.Object r3 = r10.A02
            X.IEq r3 = (X.C34344IEq) r3
            java.lang.Integer r4 = X.AnonymousClass006.A0C
            java.lang.Object r1 = r10.A04
            java.util.AbstractMap r1 = (java.util.AbstractMap) r1
            java.lang.String r0 = "iawSessionId"
            java.lang.Object r5 = r1.get(r0)
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r0 = "logging_id"
            java.lang.String r6 = X.C18240wQ.A0f(r0, r1)
            if (r6 != 0) goto L_0x0030
            java.lang.String r6 = ""
        L_0x0030:
            java.lang.Object r0 = r10.A00
            X.0MQ r0 = (X.AnonymousClass0MQ) r0
            long r8 = r0.A00
            java.lang.Object r0 = r10.A01
            X.0MJ r0 = (X.AnonymousClass0MJ) r0
            java.lang.Object r7 = r0.A00
            java.lang.String r7 = (java.lang.String) r7
            r3.A03(r4, r5, r6, r7, r8)
            r0 = -642449920(0xffffffffd9b4fe00, float:-6.3680965E15)
            goto L_0x0122
        L_0x0046:
            r0 = 2096615156(0x7cf7cef4, float:1.02935587E37)
            int r2 = X.C14030oh.A05(r0)
            java.lang.Object r0 = r10.A01
            X.0MJ r0 = (X.AnonymousClass0MJ) r0
            java.lang.Object r0 = r0.A00
            java.lang.Object r7 = r10.A04
            X.3ht r7 = (X.C63603ht) r7
            java.lang.Object r6 = r10.A00
            X.D3Q r6 = (X.D3Q) r6
            java.lang.Object r5 = r10.A02
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            if (r0 != 0) goto L_0x0070
            java.lang.String r0 = "https://help.instagram.com/270447560766967"
        L_0x0063:
            X.C63603ht.A04(r6, r7, r5, r0)
            java.lang.Object r0 = r10.A03
            X.AnonymousClass3Z9.A01(r0)
            r0 = 787256763(0x2eec95bb, float:1.0758635E-10)
            goto L_0x0122
        L_0x0070:
            com.instagram.service.session.UserSession r4 = r7.A07
            X.0TJ r3 = X.AnonymousClass0TJ.A05
            r0 = 36882606452703526(0x83088900010126, double:3.388047062800749E-306)
            java.lang.String r0 = X.C63803iN.A0C(r3, r4, r0)
            goto L_0x0063
        L_0x007e:
            java.lang.Object r4 = r10.A00
            X.3Z9 r4 = (X.AnonymousClass3Z9) r4
            java.lang.Object r6 = r10.A01
            androidx.fragment.app.FragmentActivity r6 = (androidx.fragment.app.FragmentActivity) r6
            java.lang.Object r3 = r10.A02
            com.instagram.service.session.UserSession r3 = (com.instagram.service.session.UserSession) r3
            java.lang.Object r2 = r10.A03
            androidx.fragment.app.Fragment r2 = (androidx.fragment.app.Fragment) r2
            java.lang.Object r1 = r10.A04
            X.3TG r1 = (X.AnonymousClass3TG) r1
            X.IcN r2 = (X.C34640IcN) r2
            r5 = 1
            r0 = 3
            X.C18190wL.A1S(r2, r0, r1)
            r4.A02()
            X.C63783iL.A09(r6, r3, r5)
            X.C63783iL.A08(r6, r2, r3, r5)
            X.C63783iL.A0C(r2, r3, r1, r5)
            goto L_0x00ce
        L_0x00a6:
            java.lang.Object r4 = r10.A00
            X.3Z9 r4 = (X.AnonymousClass3Z9) r4
            java.lang.Object r6 = r10.A01
            androidx.fragment.app.FragmentActivity r6 = (androidx.fragment.app.FragmentActivity) r6
            java.lang.Object r3 = r10.A02
            com.instagram.service.session.UserSession r3 = (com.instagram.service.session.UserSession) r3
            java.lang.Object r2 = r10.A03
            androidx.fragment.app.Fragment r2 = (androidx.fragment.app.Fragment) r2
            java.lang.Object r1 = r10.A04
            X.3TG r1 = (X.AnonymousClass3TG) r1
            X.IcN r2 = (X.C34640IcN) r2
            r5 = 2
            r0 = 3
            X.C18190wL.A1S(r2, r0, r1)
            r0 = 0
            r4.A02()
            X.C63783iL.A09(r6, r3, r0)
            X.C63783iL.A08(r6, r2, r3, r0)
            X.C63783iL.A0C(r2, r3, r1, r0)
        L_0x00ce:
            r6.setResult(r5)
            r6.finish()
            return
        L_0x00d5:
            r0 = 144973693(0x8a41f7d, float:9.877794E-34)
            int r2 = X.C14030oh.A05(r0)
            java.lang.Object r8 = r10.A04
            com.instagram.service.session.UserSession r8 = (com.instagram.service.session.UserSession) r8
            X.2AC r4 = X.AnonymousClass2AC.A0H
            X.2AD r3 = X.AnonymousClass2AD.A0U
            X.29W r1 = X.AnonymousClass29W.ACCEPT
            X.14U r0 = X.AnonymousClass14U.A00()
            java.lang.Object r7 = r10.A03
            X.3Si r7 = (X.C61213Si) r7
            X.C61213Si.A00(r0, r7)
            X.C49322rC.A00(r4, r1, r3, r0, r8)
            java.lang.Object r6 = r10.A02
            X.3DL r6 = (X.AnonymousClass3DL) r6
            com.instagram.igds.components.button.IgdsButton r1 = r6.A08
            r5 = 1
            r1.setLoading(r5)
            r0 = 0
            r1.setEnabled(r0)
            java.lang.Object r4 = r10.A01
            X.CUV r4 = (X.CUV) r4
            X.CWS r0 = r4.A0B
            r0.notifyDataSetChanged()
            X.3zF r3 = X.C60303Om.A00(r8)
            java.lang.Object r1 = r10.A00
            android.content.Context r1 = (android.content.Context) r1
            X.3HQ r0 = new X.3HQ
            r0.<init>(r1, r7, r6, r4)
            r3.A00 = r0
            java.lang.String r0 = "likes_sheet"
            r3.A04(r8, r0, r5)
            r0 = 1935824758(0x73625776, float:1.7932633E31)
        L_0x0122:
            X.C14030oh.A0C(r0, r2)
            return
        L_0x0126:
            java.lang.Object r6 = r10.A00
            X.0i6 r6 = (X.C10300i6) r6
            java.lang.Object r1 = r10.A01
            X.4qN r1 = (X.C82854qN) r1
            java.lang.Object r5 = r10.A02
            androidx.fragment.app.Fragment r5 = (androidx.fragment.app.Fragment) r5
            java.lang.Object r4 = r10.A03
            X.0m7 r4 = (X.C12560m7) r4
            java.lang.Object r3 = r10.A04
            X.4tH r3 = (X.AnonymousClass4tH) r3
            X.1XY r2 = new X.1XY
            r2.<init>()
            android.os.Bundle r0 = X.C18180wK.A06()
            X.C05050Qq.A00(r0, r6)
            r2.setArguments(r0)
            if (r1 == 0) goto L_0x014d
            r2.A01 = r1
        L_0x014d:
            r1 = 0
            if (r5 == 0) goto L_0x0160
            r0 = 0
            r2.setTargetFragment(r5, r0)
            X.0m7 r0 = r5.mFragmentManager
            r0.getClass()
            r2.A0A(r0, r1)
        L_0x015c:
            r3.Bl8()
            return
        L_0x0160:
            r2.A0A(r4, r1)
            goto L_0x015c
        L_0x0164:
            r0 = 1649186461(0x624c969d, float:9.4349716E20)
            X.C14030oh.A05(r0)
            java.lang.Object r0 = r10.A03
            com.instagram.user.model.User r0 = (com.instagram.user.model.User) r0
            r0.getId()
            java.lang.Object r0 = r10.A01
            X.0kW r0 = (X.C11630kW) r0
            r0.getModuleName()
            X.C60113Ns.A00()
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.IDxCListenerShape5S0500000_1_I2.onClick(android.view.View):void");
    }
}
