package com.instagram.ui.text;

import X.C18730xl;

public class IDxCSpanShape188S0100000_2_I2 extends C18730xl {
    public Object A00;
    public final int A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IDxCSpanShape188S0100000_2_I2(Object obj, int i, int i2) {
        super(i);
        this.A01 = i2;
        this.A00 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0098, code lost:
        r4.A07(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x00bf, code lost:
        r4.A04();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00c2, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0021, code lost:
        if (r0 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0023, code lost:
        r0.invoke();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0026, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r7) {
        /*
            r6 = this;
            int r0 = r6.A01
            switch(r0) {
                case 0: goto L_0x0009;
                case 1: goto L_0x0012;
                case 2: goto L_0x0027;
                case 3: goto L_0x004b;
                case 4: goto L_0x0065;
                case 5: goto L_0x007f;
                case 6: goto L_0x009c;
                case 7: goto L_0x001b;
                case 8: goto L_0x00c3;
                default: goto L_0x0005;
            }
        L_0x0005:
            super.onClick(r7)
        L_0x0008:
            return
        L_0x0009:
            java.lang.Object r0 = r6.A00
            X.5MG r0 = (X.AnonymousClass5MG) r0
            X.74v r0 = r0.A01
            X.0ZU r0 = r0.A00
            goto L_0x0021
        L_0x0012:
            java.lang.Object r0 = r6.A00
            X.5MH r0 = (X.AnonymousClass5MH) r0
            X.74w r0 = r0.A01
            X.0ZU r0 = r0.A00
            goto L_0x0021
        L_0x001b:
            java.lang.Object r0 = r6.A00
            com.facebookpay.connect.models.ConnectLearnMoreConfig r0 = (com.facebookpay.connect.models.ConnectLearnMoreConfig) r0
            X.0ZU r0 = r0.A02
        L_0x0021:
            if (r0 == 0) goto L_0x0008
            r0.invoke()
            return
        L_0x0027:
            java.lang.Object r1 = r6.A00
            X.5xb r1 = (X.AnonymousClass5xb) r1
            X.0Oa r0 = r1.A08
            X.3ak r5 = X.C18200wM.A0N(r0)
            android.os.Bundle r1 = r1.requireArguments()
            java.lang.String r0 = "ext_balance"
            int r4 = r1.getInt(r0)
            X.4qz r3 = X.AnonymousClass3J5.A00(r5)
            r2 = 0
            r0 = 4
            kotlin.coroutines.jvm.internal.KtSLambdaShape2S0102000_I2 r1 = new kotlin.coroutines.jvm.internal.KtSLambdaShape2S0102000_I2
            r1.<init>(r5, r2, r4, r0)
            r0 = 3
            X.C25237DiI.A00(r2, r2, r1, r3, r0)
            return
        L_0x004b:
            java.lang.Object r0 = r6.A00
            X.5xa r0 = (X.AnonymousClass5xa) r0
            X.0Oa r0 = r0.A07
            X.3ak r1 = X.C18200wM.A0N(r0)
            X.4qz r3 = X.AnonymousClass3J5.A00(r1)
            r2 = 0
            r0 = 46
            kotlin.coroutines.jvm.internal.KtSLambdaShape3S0101000_I2 r1 = X.C86164wN.A0o(r1, r2, r0)
            r0 = 3
            X.C25237DiI.A00(r2, r2, r1, r3, r0)
            return
        L_0x0065:
            java.lang.Object r0 = r6.A00
            com.instagram.business.fragment.SupportServiceEditUrlFragment r0 = (com.instagram.business.fragment.SupportServiceEditUrlFragment) r0
            androidx.fragment.app.FragmentActivity r3 = r0.getActivity()
            com.instagram.service.session.UserSession r2 = r0.A03
            com.instagram.api.schemas.SMBPartnerType r0 = r0.A01
            java.lang.String r1 = X.C121877Ip.A02(r0)
            X.9wF r0 = X.C171209wF.A2E
            X.Jpy r4 = new X.Jpy
            r4.<init>((android.app.Activity) r3, (com.instagram.service.session.UserSession) r2, (X.C171209wF) r0, (java.lang.String) r1)
            java.lang.String r0 = "service_partner_edit_url"
            goto L_0x0098
        L_0x007f:
            java.lang.Object r0 = r6.A00
            com.instagram.business.fragment.SupportServicePartnerSelectionFragment r0 = (com.instagram.business.fragment.SupportServicePartnerSelectionFragment) r0
            androidx.fragment.app.FragmentActivity r3 = r0.getActivity()
            com.instagram.service.session.UserSession r2 = r0.A04
            com.instagram.api.schemas.SMBPartnerType r0 = r0.A01
            java.lang.String r1 = X.C121877Ip.A02(r0)
            X.9wF r0 = X.C171209wF.A2H
            X.Jpy r4 = new X.Jpy
            r4.<init>((android.app.Activity) r3, (com.instagram.service.session.UserSession) r2, (X.C171209wF) r0, (java.lang.String) r1)
            java.lang.String r0 = "service_partner_selection"
        L_0x0098:
            r4.A07(r0)
            goto L_0x00bf
        L_0x009c:
            r0 = 0
            X.C04220Ms.A0B(r7, r0)
            android.content.Context r3 = r7.getContext()
            java.lang.Object r0 = r6.A00
            X.5ws r0 = (X.AnonymousClass5ws) r0
            X.0Oa r0 = r0.A04
            java.lang.Object r0 = r0.getValue()
            X.57b r0 = (X.C881857b) r0
            com.instagram.service.session.UserSession r2 = r0.A04
            X.9wF r1 = X.C171209wF.A20
            r0 = 1121(0x461, float:1.571E-42)
            java.lang.String r0 = X.C18170wI.A00(r0)
            X.Jpy r4 = new X.Jpy
            r4.<init>((android.content.Context) r3, (com.instagram.service.session.UserSession) r2, (X.C171209wF) r1, (java.lang.String) r0)
        L_0x00bf:
            r4.A04()
            return
        L_0x00c3:
            java.lang.Object r0 = r6.A00
            X.C18240wQ.A1G(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.ui.text.IDxCSpanShape188S0100000_2_I2.onClick(android.view.View):void");
    }
}
