package com.instagram.ui.bottomsheet.intf;

import X.C72044Lv;

public class IDxCListenerShape36S0300000_1_I2 extends C72044Lv {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public IDxCListenerShape36S0300000_1_I2(int i, Object obj, Object obj2, Object obj3) {
        this.A03 = i;
        this.A00 = obj3;
        this.A01 = obj;
        this.A02 = obj2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00e4, code lost:
        if (r0 != null) goto L_0x00c3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void BuL() {
        /*
            r13 = this;
            int r0 = r13.A03
            if (r0 == 0) goto L_0x002f
            java.lang.Object r2 = r13.A00
            X.1de r2 = (X.C23361de) r2
            com.instagram.service.session.UserSession r1 = r2.A03
            java.lang.String r0 = r2.A04
            androidx.fragment.app.Fragment r3 = X.C48952qb.A00(r1, r0)
            com.instagram.service.session.UserSession r0 = r2.A03
            X.Jj9 r2 = X.C18210wN.A0L(r0)
            java.lang.Object r1 = r13.A02
            android.content.res.Resources r1 = (android.content.res.Resources) r1
            r0 = 2131821017(0x7f1101d9, float:1.9274765E38)
            java.lang.String r0 = r1.getString(r0)
            r2.A0O = r0
            X.Jqm r1 = r2.A00()
            java.lang.Object r0 = r13.A01
            android.content.Context r0 = (android.content.Context) r0
            X.C37383Jqm.A00(r0, r3, r1)
            return
        L_0x002f:
            java.lang.Object r0 = r13.A00
            com.facebook.redex.IDxCListenerShape201S0100000_1_I2 r0 = (com.facebook.redex.IDxCListenerShape201S0100000_1_I2) r0
            java.lang.Object r2 = r0.A00
            X.1wA r2 = (X.AnonymousClass1wA) r2
            java.lang.Object r7 = r13.A01
            android.app.Activity r7 = (android.app.Activity) r7
            com.instagram.service.session.UserSession r12 = r2.A06
            java.lang.Object r10 = r13.A02
            com.instagram.bugreporter.BugReportComposerViewModel r10 = (com.instagram.bugreporter.BugReportComposerViewModel) r10
            java.lang.String r4 = r2.A07
            boolean r0 = r2.A0B
            if (r0 != 0) goto L_0x005f
            android.graphics.Bitmap r8 = X.GY6.A00(r7)
        L_0x004b:
            boolean r0 = r2.A0B
            if (r0 != 0) goto L_0x0061
            if (r8 != 0) goto L_0x0061
            X.3Uj r1 = r2.A03
            java.lang.String r0 = "CANNOT_CAPTURE_SCREENSHOT"
            r1.A00(r0)
            r0 = 2131822722(0x7f110882, float:1.9278223E38)
            X.C63813iO.A00(r7, r0)
            return
        L_0x005f:
            r8 = 0
            goto L_0x004b
        L_0x0061:
            X.KK7 r1 = X.KK7.A00(r12)
            if (r7 == 0) goto L_0x006b
            r0 = 0
            r1.A09(r7, r0)
        L_0x006b:
            X.3IL r3 = new X.3IL
            r3.<init>()
            java.lang.String r0 = r12.getUserId()
            r1 = 0
            X.C04220Ms.A0B(r0, r1)
            r3.A09 = r0
            X.33W r0 = X.C34422Jm.A00(r12)
            java.util.HashMap r6 = X.AnonymousClass0wJ.A0y()
            java.util.ArrayList r0 = r0.A00
            java.util.Iterator r5 = r0.iterator()
            X.C04220Ms.A06(r5)
        L_0x008b:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x00ad
            java.lang.Object r0 = r5.next()
            java.lang.ref.Reference r0 = (java.lang.ref.Reference) r0
            java.lang.Object r0 = r0.get()
            X.4pF r0 = (X.C82204pF) r0
            if (r0 != 0) goto L_0x00a3
            r5.remove()
            goto L_0x008b
        L_0x00a3:
            java.util.Map r0 = r0.Agy()
            if (r0 == 0) goto L_0x008b
            r6.putAll(r0)
            goto L_0x008b
        L_0x00ad:
            r3.A0C = r6
            java.lang.String r0 = r2.A09
            r3.A08 = r0
            java.lang.String r0 = r2.A08
            r3.A07 = r0
            boolean r0 = r2.A0C
            if (r0 != 0) goto L_0x00e2
            boolean r0 = X.C09650fs.A02(r7)
            if (r0 == 0) goto L_0x00df
            X.25S r0 = X.AnonymousClass25S.BARCELONA_RAGE_SHAKE
        L_0x00c3:
            X.C04220Ms.A0B(r0, r1)
            r3.A00 = r0
        L_0x00c8:
            if (r4 == 0) goto L_0x00cc
            r3.A01 = r4
        L_0x00cc:
            com.instagram.bugreporter.BugReport r9 = r3.A00()
            X.3Uj r11 = r2.A03
            X.1jI r6 = new X.1jI
            r6.<init>(r7, r8, r9, r10, r11, r12)
            r2.A00 = r6
            java.lang.Void[] r0 = new java.lang.Void[r1]
            r6.A02(r0)
            return
        L_0x00df:
            X.25S r0 = X.AnonymousClass25S.RAGE_SHAKE
            goto L_0x00c3
        L_0x00e2:
            X.25S r0 = r2.A01
            if (r0 == 0) goto L_0x00c8
            goto L_0x00c3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.ui.bottomsheet.intf.IDxCListenerShape36S0300000_1_I2.BuL():void");
    }
}
