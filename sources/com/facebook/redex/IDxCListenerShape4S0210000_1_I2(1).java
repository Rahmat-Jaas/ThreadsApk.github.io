package com.facebook.redex;

import android.view.View;

public class IDxCListenerShape4S0210000_1_I2 implements View.OnClickListener {
    public Object A00;
    public Object A01;
    public boolean A02;
    public final int A03;

    public IDxCListenerShape4S0210000_1_I2(int i, Object obj, Object obj2, boolean z) {
        this.A03 = i;
        this.A01 = obj;
        this.A00 = obj2;
        this.A02 = z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x005d, code lost:
        if (X.C63173fJ.A05(X.AnonymousClass0TJ.A05, 18296616515600727L) == false) goto L_0x005f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r11) {
        /*
            r10 = this;
            int r0 = r10.A03
            switch(r0) {
                case 0: goto L_0x00f7;
                case 1: goto L_0x0190;
                case 2: goto L_0x01ca;
                default: goto L_0x0005;
            }
        L_0x0005:
            r0 = 1226189065(0x49162909, float:615056.56)
            int r5 = X.C14030oh.A05(r0)
            boolean r0 = r10.A02
            r3 = 0
            r7 = 1
            if (r0 == 0) goto L_0x0093
            java.lang.Object r6 = r10.A01
            X.3DA r6 = (X.AnonymousClass3DA) r6
            com.instagram.service.session.UserSession r4 = r6.A04
            boolean r0 = X.C63793iM.A0C(r4)
            if (r0 == 0) goto L_0x003d
            boolean r0 = X.C67313zL.A06(r4)
            if (r0 == 0) goto L_0x003d
            long r1 = java.lang.System.currentTimeMillis()
            java.util.concurrent.atomic.AtomicLong r9 = X.C67313zL.A01
            long r3 = r9.get()
            long r7 = r1 - r3
            r3 = 500(0x1f4, double:2.47E-321)
            int r0 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x0080
            r0 = -387263456(0xffffffffe8ead420, float:-8.871574E24)
        L_0x0039:
            X.C14030oh.A0C(r0, r5)
            return
        L_0x003d:
            java.lang.String r1 = r4.token
            java.lang.String r0 = "settings"
            android.os.Bundle r3 = X.C18180wK.A06()
            X.C18190wL.A13(r3, r1)
            X.C18210wN.A0x(r3, r0)
            boolean r0 = X.AnonymousClass2RP.A00(r4)
            if (r0 != 0) goto L_0x005f
            X.0TJ r2 = X.AnonymousClass0TJ.A05
            r0 = 18296616515600727(0x4100ad00010157, double:1.8916064639746296E-307)
            boolean r1 = X.C63173fJ.A05(r2, r0)
            r0 = 1
            if (r1 != 0) goto L_0x0060
        L_0x005f:
            r0 = 0
        L_0x0060:
            r1 = r0 ^ 1
            java.lang.String r0 = "show_add_account_button"
            r3.putBoolean(r0, r1)
            X.Jj9 r0 = X.C18210wN.A0L(r4)
            X.Jqm r2 = r0.A00()
            androidx.fragment.app.FragmentActivity r1 = r6.A00
            X.1de r0 = new X.1de
            r0.<init>()
            r0.setArguments(r3)
            X.C37383Jqm.A00(r1, r0, r2)
            X.C63453hV.A03(r4)
            goto L_0x008f
        L_0x0080:
            r9.set(r1)
            X.4Q9 r1 = new X.4Q9
            r1.<init>(r6)
            android.os.Handler r0 = X.AnonymousClass0wJ.A0F()
            r0.post(r1)
        L_0x008f:
            r0 = -1398679707(0xffffffffaca1d765, float:-4.599809E-12)
            goto L_0x0039
        L_0x0093:
            java.lang.Object r2 = r10.A00
            X.0BO r2 = (X.AnonymousClass0BO) r2
            java.lang.Object r0 = r10.A01
            X.3DA r0 = (X.AnonymousClass3DA) r0
            androidx.fragment.app.FragmentActivity r4 = r0.A00
            com.instagram.service.session.UserSession r6 = r0.A04
            java.lang.String r1 = "settings"
            X.0R6 r2 = r2.A0C(r4, r6, r1, r3)
            boolean r0 = r2.A01
            if (r0 == 0) goto L_0x00c7
            boolean r0 = X.AnonymousClass3WW.A02(r6)
            if (r0 == 0) goto L_0x00cc
            androidx.fragment.app.Fragment r3 = X.C48952qb.A00(r6, r1)
            X.Jj9 r2 = X.C18210wN.A0L(r6)
            android.content.res.Resources r1 = r4.getResources()
            r0 = 2131821017(0x7f1101d9, float:1.9274765E38)
            java.lang.String r0 = r1.getString(r0)
            r2.A0O = r0
            X.C18200wM.A16(r4, r3, r2)
        L_0x00c7:
            r0 = 202362451(0xc0fce53, float:1.1078408E-31)
            goto L_0x0039
        L_0x00cc:
            X.C04220Ms.A0B(r6, r3)
            r0 = 36310963485409615(0x8100a10000014f, double:3.026537748462608E-306)
            boolean r0 = X.C67333zN.A06(r6, r0, r7)
            if (r0 == 0) goto L_0x00ef
            android.content.Intent r3 = X.C62883b4.A00(r4)
            android.os.Bundle r2 = X.AnonymousClass0wJ.A0E(r6)
            java.lang.String r1 = "entry_point"
            java.lang.String r0 = "setting"
            r2.putString(r1, r0)
            java.lang.String r0 = "show_personal_account_selector"
            X.C18220wO.A13(r4, r3, r2, r0)
            goto L_0x00c7
        L_0x00ef:
            X.3YR r1 = X.AnonymousClass3YR.A00
            android.os.Bundle r0 = r2.A00
            r1.A03(r4, r0, r6, r3)
            goto L_0x00c7
        L_0x00f7:
            r0 = 1361817382(0x512baf26, float:4.6086119E10)
            int r5 = X.C14030oh.A05(r0)
            java.lang.Object r4 = r10.A01
            X.1wr r4 = (X.AnonymousClass1wr) r4
            java.lang.Object r6 = r10.A00
            com.instagram.login.twofac.model.TotpSeed r6 = (com.instagram.login.twofac.model.TotpSeed) r6
            boolean r0 = r10.A02
            if (r0 != 0) goto L_0x017a
            java.lang.StringBuilder r1 = X.C18200wM.A0r()
            r0 = 2131837141(0x7f1140d5, float:1.9307469E38)
            java.lang.String r0 = r4.getString(r0)
            r1.append(r0)
            r0 = 32
            r1.append(r0)
            java.lang.String r0 = r6.A01
            r1.append(r0)
            r0 = 63
            r1.append(r0)
            java.lang.String r7 = r1.toString()
            java.lang.String r3 = "\n            "
            r0 = 2131837143(0x7f1140d7, float:1.9307473E38)
            java.lang.String r2 = r4.getString(r0)
            java.lang.String r1 = "\n\n            "
            r0 = 2131837142(0x7f1140d6, float:1.930747E38)
            java.lang.String r0 = r4.getString(r0)
            java.lang.String r0 = X.AnonymousClass00U.A0h(r3, r2, r1, r0, r3)
            java.lang.String r1 = X.AnonymousClass4n8.A08(r0)
            r0 = 2131834607(0x7f1136ef, float:1.930233E38)
            java.lang.String r3 = X.C18180wK.A0g(r4, r0)
            X.Dsm r2 = X.AnonymousClass0wJ.A0V(r4)
            r2.A02 = r7
            r2.A0p(r1)
            r1 = 33
            com.facebook.redex.IDxCListenerShape77S0200000_1_I2 r0 = new com.facebook.redex.IDxCListenerShape77S0200000_1_I2
            r0.<init>((int) r1, (java.lang.Object) r4, (java.lang.Object) r6)
            r2.A0c(r0, r3)
            r0 = 2131837079(0x7f114097, float:1.9307343E38)
            java.lang.String r1 = r4.getString(r0)
            r0 = 102(0x66, float:1.43E-43)
            com.facebook.redex.IDxCListenerShape217S0100000_1_I2 r0 = X.C18220wO.A0O(r4, r0)
            r2.A0b(r0, r1)
            X.AnonymousClass0wJ.A1K(r2)
            X.AnonymousClass1wr.A0B(r4)
        L_0x0175:
            r0 = -1325708382(0xffffffffb0fb4ba2, float:-1.828415E-9)
            goto L_0x0039
        L_0x017a:
            android.os.Bundle r1 = r4.A00
            if (r1 != 0) goto L_0x0185
            java.lang.String r0 = "twoFacResponseBundle"
            X.C04220Ms.A0E(r0)
            r0 = 0
            throw r0
        L_0x0185:
            java.lang.String r0 = "is_two_factor_enabled"
            boolean r1 = r1.getBoolean(r0)
            r0 = 1
            X.AnonymousClass1wr.A0C(r4, r6, r0, r1, r0)
            goto L_0x0175
        L_0x0190:
            r0 = -1368498068(0xffffffffae6e606c, float:-5.4200575E-11)
            int r5 = X.C14030oh.A05(r0)
            java.lang.Object r7 = r10.A01
            X.1wr r7 = (X.AnonymousClass1wr) r7
            X.0Oa r0 = r7.A02
            X.0i6 r0 = X.AnonymousClass0wJ.A0U(r0)
            X.3Iu r6 = new X.3Iu
            r6.<init>(r0)
            r1 = 2131834767(0x7f11378f, float:1.9302654E38)
            java.lang.Object r4 = r10.A00
            r0 = 132(0x84, float:1.85E-43)
            com.facebook.redex.IDxCListenerShape70S0200000_1_I2 r0 = X.C18200wM.A0R(r7, r4, r0)
            r6.A03(r0, r1)
            r3 = 2131834607(0x7f1136ef, float:1.930233E38)
            boolean r2 = r10.A02
            r1 = 0
            com.facebook.redex.IDxCListenerShape4S0210000_1_I2 r0 = new com.facebook.redex.IDxCListenerShape4S0210000_1_I2
            r0.<init>(r1, r7, r4, r2)
            r6.A01(r0, r3)
            X.C62763ag.A00(r7, r6)
            r0 = 110452488(0x6955f08, float:5.6187207E-35)
            goto L_0x0039
        L_0x01ca:
            java.lang.Object r0 = r10.A00
            X.4AX r0 = (X.AnonymousClass4AX) r0
            boolean r4 = r10.A02
            java.lang.Object r3 = r10.A01
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            android.content.Context r2 = r0.A0B
            androidx.fragment.app.FragmentActivity r1 = r0.A0D
            com.instagram.service.session.UserSession r0 = r0.A0E
            X.AnonymousClass3OS.A01(r2, r1, r0, r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.IDxCListenerShape4S0210000_1_I2.onClick(android.view.View):void");
    }
}
