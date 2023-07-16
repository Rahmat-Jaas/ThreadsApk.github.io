package com.instagram.ui.text;

import X.C18720xk;

public class IDxCSpanShape183S0100000_1_I2 extends C18720xk {
    public Object A00;
    public final int A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IDxCSpanShape183S0100000_1_I2(Object obj, int i, int i2) {
        super(i);
        this.A01 = i2;
        this.A00 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004b, code lost:
        r0 = "userSession";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0058, code lost:
        X.C04220Ms.A0E(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005c, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0198, code lost:
        X.C37383Jqm.A00(r1, r0, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x019b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001b, code lost:
        r1.A07(r0);
        r1.A04();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r7) {
        /*
            r6 = this;
            int r0 = r6.A01
            switch(r0) {
                case 0: goto L_0x0137;
                case 1: goto L_0x019c;
                case 2: goto L_0x0077;
                case 3: goto L_0x004e;
                case 4: goto L_0x008c;
                case 5: goto L_0x00ce;
                case 6: goto L_0x00e8;
                case 7: goto L_0x0104;
                case 8: goto L_0x0034;
                case 9: goto L_0x0022;
                case 10: goto L_0x0005;
                case 11: goto L_0x0005;
                case 12: goto L_0x01a4;
                case 13: goto L_0x01c9;
                case 14: goto L_0x0127;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r6.A00
            X.1aL r0 = (X.AnonymousClass1aL) r0
            androidx.fragment.app.FragmentActivity r3 = r0.requireActivity()
            com.instagram.service.session.UserSession r2 = r0.A05
            if (r2 == 0) goto L_0x004b
            X.9wF r1 = X.C171209wF.A20
            java.lang.String r0 = "https://www.facebook.com/policies/ads"
            X.Jpy r1 = X.C18230wP.A0Y(r3, r2, r1, r0)
            java.lang.String r0 = "promote_simple_error"
        L_0x001b:
            r1.A07(r0)
            r1.A04()
        L_0x0021:
            return
        L_0x0022:
            java.lang.Object r4 = r6.A00
            X.IbL r4 = (X.C34590IbL) r4
            X.K2b r2 = r4.A05
            if (r2 != 0) goto L_0x002d
            java.lang.String r0 = "promoteLogger"
            goto L_0x0058
        L_0x002d:
            X.Iu2 r1 = r4.A04
            if (r1 != 0) goto L_0x0156
            java.lang.String r0 = "currentStep"
            goto L_0x0058
        L_0x0034:
            java.lang.Object r0 = r6.A00
            X.1Ys r0 = (X.C22601Ys) r0
            androidx.fragment.app.FragmentActivity r3 = r0.requireActivity()
            com.instagram.service.session.UserSession r2 = r0.A01
            if (r2 == 0) goto L_0x004b
            java.lang.String r1 = "https://www.facebook.com/policies/ads/prohibited_content/discriminatory_practices"
            X.9wF r0 = X.C171209wF.A20
            X.Jpy r1 = X.C18230wP.A0Y(r3, r2, r0, r1)
            java.lang.String r0 = "promote"
            goto L_0x001b
        L_0x004b:
            java.lang.String r0 = "userSession"
            goto L_0x0058
        L_0x004e:
            java.lang.Object r2 = r6.A00
            X.1a5 r2 = (X.AnonymousClass1a5) r2
            X.3Ga r1 = r2.A02
            if (r1 != 0) goto L_0x005d
            java.lang.String r0 = "bugReportLogger"
        L_0x0058:
            X.C04220Ms.A0E(r0)
            r0 = 0
            throw r0
        L_0x005d:
            java.lang.Integer r0 = X.AnonymousClass006.A15
            r1.A00(r0)
            androidx.fragment.app.FragmentActivity r3 = r2.requireActivity()
            X.0Oa r0 = r2.A04
            com.instagram.service.session.UserSession r2 = X.AnonymousClass0wJ.A0X(r0)
            X.9wF r1 = X.C171209wF.A0U
            java.lang.String r0 = "https://i.instagram.com/legal/privacy/"
            X.Jpy r1 = X.C18230wP.A0Y(r3, r2, r1, r0)
            java.lang.String r0 = "gdpr_consent_for_rageshake"
            goto L_0x001b
        L_0x0077:
            java.lang.Object r0 = r6.A00
            X.1c2 r0 = (X.AnonymousClass1c2) r0
            androidx.fragment.app.FragmentActivity r3 = r0.requireActivity()
            com.instagram.service.session.UserSession r2 = r0.A0B
            X.9wF r1 = X.C171209wF.A0U
            java.lang.String r0 = "https://i.instagram.com/legal/privacy/"
            X.Jpy r1 = X.C18230wP.A0Y(r3, r2, r1, r0)
            java.lang.String r0 = "bugreporter_composer"
            goto L_0x001b
        L_0x008c:
            java.lang.Object r5 = r6.A00
            X.1YW r5 = (X.AnonymousClass1YW) r5
            X.0Oa r0 = r5.A05
            X.0i6 r0 = X.AnonymousClass0wJ.A0U(r0)
            X.Jj9 r4 = X.C18210wN.A0L(r0)
            X.4Ld r0 = new X.4Ld
            r0.<init>()
            r4.A0I = r0
            r3 = 2130772059(0x7f01005b, float:1.7147226E38)
            r2 = 2130772046(0x7f01004e, float:1.71472E38)
            r1 = 2130772044(0x7f01004c, float:1.7147195E38)
            r0 = 2130772061(0x7f01005d, float:1.714723E38)
            r4.A02(r3, r2, r1, r0)
            X.Jqm r0 = r5.A04
            if (r0 == 0) goto L_0x0021
            android.os.Bundle r2 = X.C18180wK.A06()
            r1 = 1
            java.lang.String r0 = "enable_back_button"
            r2.putBoolean(r0, r1)
            X.1YK r1 = new X.1YK
            r1.<init>()
            r1.setArguments(r2)
            X.Jqm r0 = r5.A04
            if (r0 == 0) goto L_0x0021
            r0.A09(r1, r4)
            return
        L_0x00ce:
            java.lang.Object r0 = r6.A00
            X.1YW r0 = (X.AnonymousClass1YW) r0
            androidx.fragment.app.FragmentActivity r3 = r0.requireActivity()
            X.0Oa r0 = r0.A05
            com.instagram.service.session.UserSession r2 = X.AnonymousClass0wJ.A0X(r0)
            X.9wF r1 = X.C171209wF.A20
            java.lang.String r0 = "https://help.instagram.com/1024826868233885?ref=igapp"
            X.Jpy r1 = X.C18230wP.A0Y(r3, r2, r1, r0)
            java.lang.String r0 = "promote_preview"
            goto L_0x001b
        L_0x00e8:
            java.lang.Object r0 = r6.A00
            X.1aj r0 = (X.AnonymousClass1aj) r0
            androidx.fragment.app.FragmentActivity r3 = r0.requireActivity()
            X.0Oa r0 = r0.A04
            java.lang.Object r2 = X.C18190wL.A0f(r0)
            com.instagram.service.session.UserSession r2 = (com.instagram.service.session.UserSession) r2
            X.9wF r1 = X.C171209wF.A20
            java.lang.String r0 = "https://help.instagram.com/402748553849926"
            X.Jpy r1 = X.C18230wP.A0Y(r3, r2, r1, r0)
            java.lang.String r0 = "promote_connect_page"
            goto L_0x001b
        L_0x0104:
            java.lang.Object r4 = r6.A00
            X.1ai r4 = (X.AnonymousClass1ai) r4
            X.K2b r2 = X.AnonymousClass1ai.A00(r4)
            X.Iu2 r1 = X.C35394Iu2.A0b
            java.lang.String r0 = "view_advertising_policies"
            r2.A0J(r1, r0)
            androidx.fragment.app.FragmentActivity r3 = r4.requireActivity()
            com.instagram.service.session.UserSession r2 = X.AnonymousClass1ai.A01(r4)
            X.9wF r1 = X.C171209wF.A20
            java.lang.String r0 = "https://www.facebook.com/policies/ads"
            X.Jpy r1 = X.C18230wP.A0Y(r3, r2, r1, r0)
            java.lang.String r0 = "promote_error"
            goto L_0x001b
        L_0x0127:
            java.lang.Object r0 = r6.A00
            X.1ci r0 = (X.AnonymousClass1ci) r0
            X.0m7 r2 = r0.mFragmentManager
            if (r2 == 0) goto L_0x0021
            boolean r0 = r0.A0E
            if (r0 == 0) goto L_0x01d1
            r2.A16()
            return
        L_0x0137:
            java.lang.Object r2 = r6.A00
            X.9Nf r2 = (X.C156369Nf) r2
            X.0Oa r0 = r2.A0B
            X.0i6 r0 = X.AnonymousClass0wJ.A0U(r0)
            X.Jj9 r1 = X.C18210wN.A0L(r0)
            r0 = 2131822255(0x7f1106af, float:1.9277276E38)
            X.Jqm r3 = X.C18230wP.A0X(r2, r1, r0)
            androidx.fragment.app.FragmentActivity r1 = r2.requireActivity()
            X.1Xg r0 = new X.1Xg
            r0.<init>()
            goto L_0x0198
        L_0x0156:
            java.lang.String r0 = "messaging_app_subheader_learn_more_button"
            r2.A0I(r1, r0)
            X.0Oa r0 = r4.A0I
            X.0i6 r0 = X.AnonymousClass0wJ.A0U(r0)
            X.Jj9 r2 = X.C18210wN.A0L(r0)
            androidx.fragment.app.FragmentActivity r1 = r4.requireActivity()
            r0 = 2131833290(0x7f1131ca, float:1.9299658E38)
            X.C18230wP.A10(r1, r2, r0)
            androidx.fragment.app.FragmentActivity r1 = r4.requireActivity()
            r0 = 2131831976(0x7f112ca8, float:1.9296993E38)
            java.lang.String r0 = r1.getString(r0)
            r2.A0R = r0
            X.DrH r1 = X.C18230wP.A0a(r4)
            r0 = 48
            com.facebook.redex.IDxCListenerShape70S0200000_1_I2 r0 = X.C18200wM.A0R(r4, r1, r0)
            r2.A0A = r0
            r0 = 1
            r2.A0k = r0
            X.Jqm r3 = r2.A00()
            androidx.fragment.app.FragmentActivity r1 = r4.requireActivity()
            X.1Yi r0 = new X.1Yi
            r0.<init>()
        L_0x0198:
            X.C37383Jqm.A00(r1, r0, r3)
            return
        L_0x019c:
            java.lang.Object r0 = r6.A00
            X.4pE r0 = (X.C82194pE) r0
            r0.Bn2()
            return
        L_0x01a4:
            java.lang.Object r1 = r6.A00
            android.content.Context r1 = (android.content.Context) r1
            X.Dsm r2 = X.C18190wL.A0W(r1)
            r0 = 0
            r2.A0r(r0)
            r0 = 2131833317(0x7f1131e5, float:1.9299713E38)
            r2.A0K(r0)
            android.content.res.Resources r1 = r1.getResources()
            r0 = 2131831976(0x7f112ca8, float:1.9296993E38)
            java.lang.String r1 = r1.getString(r0)
            r0 = 0
            r2.A0a(r0, r1)
            X.AnonymousClass0wJ.A1K(r2)
            return
        L_0x01c9:
            java.lang.Object r0 = r6.A00
            android.view.View$OnClickListener r0 = (android.view.View.OnClickListener) r0
            r0.onClick(r7)
            return
        L_0x01d1:
            r1 = 1
            java.lang.String r0 = "recovery_lookup_screen"
            r2.A1C(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.ui.text.IDxCSpanShape183S0100000_1_I2.onClick(android.view.View):void");
    }
}
