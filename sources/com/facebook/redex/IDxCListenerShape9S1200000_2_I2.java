package com.facebook.redex;

import android.view.View;

public class IDxCListenerShape9S1200000_2_I2 implements View.OnClickListener {
    public Object A00;
    public Object A01;
    public String A02;
    public final int A03;

    public IDxCListenerShape9S1200000_2_I2(Object obj, Object obj2, String str, int i) {
        this.A03 = i;
        this.A01 = obj2;
        this.A00 = obj;
        this.A02 = str;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00da  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r38) {
        /*
            r37 = this;
            r6 = r37
            int r0 = r6.A03
            switch(r0) {
                case 0: goto L_0x0432;
                case 1: goto L_0x01d0;
                case 2: goto L_0x0045;
                case 3: goto L_0x0008;
                default: goto L_0x0007;
            }
        L_0x0007:
            return
        L_0x0008:
            r0 = -322724464(0xffffffffecc39d90, float:-1.8918768E27)
            int r12 = X.C14030oh.A05(r0)
            java.lang.Object r5 = r6.A01
            X.7sP r5 = (X.C131567sP) r5
            java.lang.String r0 = "ctc_confirmation_dialog_call"
            X.C131567sP.A02(r5, r0)
            java.lang.Object r4 = r6.A00
            android.app.Activity r4 = (android.app.Activity) r4
            java.lang.String r3 = "android.permission.CALL_PHONE"
            int r0 = r4.checkSelfPermission(r3)
            boolean r0 = X.C18180wK.A1W(r0)
            java.lang.String r2 = r6.A02
            if (r0 == 0) goto L_0x0032
            X.C131567sP.A01(r4, r5, r2)
        L_0x002d:
            r0 = 1150752241(0x449715f1, float:1208.6857)
            goto L_0x049d
        L_0x0032:
            java.lang.String r0 = "ctc_permission_request"
            X.C131567sP.A02(r5, r0)
            r0 = 1
            com.facebook.redex.IDxPCallbackShape23S1200000_2_I2 r1 = new com.facebook.redex.IDxPCallbackShape23S1200000_2_I2
            r1.<init>(r4, r5, r2, r0)
            java.lang.String[] r0 = new java.lang.String[]{r3}
            X.AnonymousClass7K8.A02(r4, r1, r0)
            goto L_0x002d
        L_0x0045:
            r0 = 899930386(0x35a3d912, float:1.2207622E-6)
            int r12 = X.C14030oh.A05(r0)
            java.lang.Object r2 = r6.A00
            com.instagram.business.fragment.SupportLinksFragment r2 = (com.instagram.business.fragment.SupportLinksFragment) r2
            java.lang.Object r1 = r6.A01
            X.5KP r1 = (X.AnonymousClass5KP) r1
            java.lang.String r3 = r6.A02
            boolean r0 = com.instagram.business.fragment.SupportLinksFragment.A01(r1, r3)
            if (r0 == 0) goto L_0x00e0
            if (r1 == 0) goto L_0x00de
            java.lang.String r4 = r1.A03
            if (r4 == 0) goto L_0x00de
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r4 = r4.toUpperCase(r0)
            java.util.Map r0 = com.instagram.api.schemas.CallToAction.A02
            java.lang.Object r14 = r0.get(r4)
            com.instagram.api.schemas.CallToAction r14 = (com.instagram.api.schemas.CallToAction) r14
            if (r14 != 0) goto L_0x0074
            com.instagram.api.schemas.CallToAction r14 = com.instagram.api.schemas.CallToAction.UNRECOGNIZED
        L_0x0074:
            androidx.fragment.app.FragmentActivity r4 = r2.getActivity()
            com.instagram.service.session.UserSession r0 = r2.A02
            X.Drz r0 = X.C18180wK.A0Q(r4, r0)
            X.DeW r5 = X.C86144wL.A0U()
            r15 = 0
            java.util.ArrayList r20 = X.AnonymousClass0wJ.A0v()
            r21 = 0
            java.lang.String r18 = ""
            com.instagram.leadgen.core.model.LeadGenBaseFormList r13 = new com.instagram.leadgen.core.model.LeadGenBaseFormList
            r16 = r15
            r17 = r15
            r19 = r18
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21)
            r4 = 177(0xb1, float:2.48E-43)
            java.lang.String r4 = X.AnonymousClass000.A00(r4)
            androidx.fragment.app.Fragment r4 = r5.A06(r13, r4)
        L_0x00a0:
            r0.A03 = r4
            java.lang.String r4 = com.instagram.business.fragment.SupportLinksFragment.A06
            r0.A07 = r4
        L_0x00a6:
            r0.A05()
        L_0x00a9:
            X.7IV r8 = r2.A01
            if (r1 == 0) goto L_0x00da
            r7 = 1
            java.lang.String r6 = r1.A03
        L_0x00b0:
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r5 = X.AnonymousClass7IV.A00(r8)
            java.lang.String r0 = "home_page"
            X.C18190wL.A1I(r5, r0)
            java.lang.String r0 = "tap"
            X.C18210wN.A1A(r5, r0)
            java.lang.String r4 = r8.A03
            r2 = 21
            r1 = 10
            r0 = 110(0x6e, float:1.54E-43)
            java.lang.String r0 = X.AnonymousClass3QD.A00(r2, r1, r0)
            X.AnonymousClass7IV.A01(r5, r8, r0, r4, r7)
            java.lang.String r0 = "service_type"
            r5.A0T(r0, r3)
            X.C86164wN.A1C(r5, r6)
            r0 = 1431488142(0x5552c68e, float:1.44843892E13)
            goto L_0x049d
        L_0x00da:
            r7 = 0
            java.lang.String r6 = ""
            goto L_0x00b0
        L_0x00de:
            r14 = 0
            goto L_0x0074
        L_0x00e0:
            java.lang.String r5 = "waterfall_id"
            java.lang.String r8 = "cta_category"
            java.lang.String r7 = "entrypoint"
            r0 = 835(0x343, float:1.17E-42)
            java.lang.String r9 = X.C18170wI.A00(r0)
            if (r1 == 0) goto L_0x0138
            com.instagram.api.schemas.ActionButtonPartnerType r0 = com.instagram.api.schemas.ActionButtonPartnerType.FBE
            com.instagram.api.schemas.ActionButtonPartnerType r4 = r1.A00
            if (r0 != r4) goto L_0x01ab
            java.util.HashMap r4 = X.AnonymousClass0wJ.A0y()
            java.lang.String r6 = com.instagram.business.fragment.SupportLinksFragment.A06
            r4.put(r9, r6)
            java.lang.String r0 = r1.A04
            r4.put(r8, r0)
            java.lang.String r0 = r2.A03
            r4.put(r7, r0)
            java.lang.String r0 = r2.A04
            r4.put(r5, r0)
            r0 = 2131826644(0x7f1117d4, float:1.9286178E38)
            java.lang.String r5 = r2.getString(r0)
            java.lang.String r0 = "com.instagram.fbe.screens.edit_cta"
            X.3iE r4 = X.C63743iE.A02(r0, r4)
            com.instagram.service.session.UserSession r0 = r2.A02
            com.instagram.bloks.hosting.IgBloksScreenConfig r0 = X.C18190wL.A0N(r0)
            r0.A0S = r5
            X.1c8 r5 = X.C62853b1.A02(r0, r4)
            androidx.fragment.app.FragmentActivity r4 = r2.requireActivity()
            com.instagram.service.session.UserSession r0 = r2.A02
            X.Drz r0 = X.C18180wK.A0Q(r4, r0)
            r0.A07 = r6
            r0.A08()
        L_0x0134:
            r0.A03 = r5
            goto L_0x00a6
        L_0x0138:
            com.instagram.api.schemas.SMBPartnerType r4 = com.instagram.api.schemas.SMBPartnerType.DONATION
            java.lang.String r0 = r4.toString()
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x016b
            if (r3 == 0) goto L_0x0166
            r0 = r3
        L_0x0147:
            X.5yc r6 = new X.5yc
            r6.<init>(r2, r0, r3)
            com.instagram.service.session.UserSession r0 = r2.A02
            X.H1T r5 = X.C18180wK.A0O(r0)
            java.lang.String r0 = "business/instant_experience/get_donation_button_partners_bundle/"
            r5.A0J(r0)
            java.lang.Class<X.5tQ> r4 = X.AnonymousClass5tQ.class
            java.lang.Class<X.6zs> r0 = X.C118176zs.class
            X.H8c r0 = X.C18180wK.A0T(r5, r4, r0)
            r0.A00 = r6
            r2.schedule(r0)
            goto L_0x00a9
        L_0x0166:
            java.lang.String r0 = r4.toString()
            goto L_0x0147
        L_0x016b:
            java.util.HashMap r4 = X.AnonymousClass0wJ.A0y()
            java.lang.String r6 = com.instagram.business.fragment.SupportLinksFragment.A06
            r4.put(r9, r6)
            java.lang.String r0 = r2.A03
            r4.put(r7, r0)
            r4.put(r8, r3)
            java.lang.String r0 = r2.A04
            r4.put(r5, r0)
            r0 = 2131835422(0x7f113a1e, float:1.9303982E38)
            java.lang.String r5 = r2.getString(r0)
            r0 = 335(0x14f, float:4.7E-43)
            java.lang.String r0 = X.C18170wI.A00(r0)
            X.3iE r4 = X.C63743iE.A02(r0, r4)
            com.instagram.service.session.UserSession r0 = r2.A02
            com.instagram.bloks.hosting.IgBloksScreenConfig r0 = X.C18190wL.A0N(r0)
            r0.A0S = r5
            X.1c8 r5 = X.C62853b1.A02(r0, r4)
            androidx.fragment.app.FragmentActivity r4 = r2.requireActivity()
            com.instagram.service.session.UserSession r0 = r2.A02
            X.Drz r0 = X.C18180wK.A0Q(r4, r0)
            r0.A07 = r6
            goto L_0x0134
        L_0x01ab:
            com.instagram.api.schemas.ActionButtonPartnerType r0 = com.instagram.api.schemas.ActionButtonPartnerType.SMB
            if (r0 != r4) goto L_0x00a9
            androidx.fragment.app.FragmentActivity r4 = r2.getActivity()
            com.instagram.service.session.UserSession r0 = r2.A02
            X.Drz r0 = X.C18180wK.A0Q(r4, r0)
            X.DeW r4 = X.C86144wL.A0U()
            java.lang.String r5 = r2.A04
            java.lang.String r6 = r1.A01
            java.lang.String r7 = r1.A06
            java.lang.String r8 = r1.A07
            java.lang.String r10 = r2.A03
            java.lang.String r11 = r1.A04
            r9 = r8
            androidx.fragment.app.Fragment r4 = r4.A08(r5, r6, r7, r8, r9, r10, r11)
            goto L_0x00a0
        L_0x01d0:
            r0 = 990391244(0x3b082bcc, float:0.0020778058)
            int r12 = X.C14030oh.A05(r0)
            java.lang.Object r5 = r6.A00
            X.5jw r5 = (X.C92835jw) r5
            java.lang.Object r7 = r6.A01
            com.fbpay.hub.paymentmethods.api.FbPayPaymentMethod r7 = (com.fbpay.hub.paymentmethods.api.FbPayPaymentMethod) r7
            java.lang.String r15 = r6.A02
            android.os.Bundle r4 = X.C18180wK.A06()
            int r1 = r7.A00
            r3 = 3
            r8 = 2
            if (r1 == 0) goto L_0x028c
            r0 = 1
            java.lang.String r6 = "logger_data"
            if (r1 == r0) goto L_0x0243
            if (r1 == r8) goto L_0x0228
            if (r1 != r3) goto L_0x0223
            com.fbpay.logging.FBPayLoggerData r0 = r5.A06
            java.util.Map r2 = X.C122037Js.A06(r0)
            java.lang.String r1 = "target_name"
            java.lang.String r0 = "edit_shoppay"
            X.C86134wK.A1N(r1, r0, r2)
            X.8h9 r1 = r5.A0E
            java.lang.String r0 = "user_edit_credential_enter"
            r1.Bb8(r0, r2)
            com.fbpay.hub.paymentmethods.api.FbPayShopPay r1 = r7.A05
            java.lang.String r0 = "shop_pay_credential"
            r4.putParcelable(r0, r1)
            com.fbpay.logging.FBPayLoggerData r0 = r5.A06
            r4.putParcelable(r6, r0)
            java.lang.String r0 = "edit_shop_pay"
            X.76N r1 = new X.76N
            r1.<init>(r0, r4)
            r3 = 6
        L_0x021c:
            r1.A00 = r3
        L_0x021e:
            X.56r r0 = r5.A06
            X.AnonymousClass7JD.A02(r0, r1)
        L_0x0223:
            r0 = 575482251(0x224d298b, float:2.7804673E-18)
            goto L_0x049d
        L_0x0228:
            com.fbpay.hub.paymentmethods.api.FbPayBankAccount r0 = r7.A02
            r0.getClass()
            java.lang.String r1 = r0.A00
            java.lang.String r0 = "credentialID"
            r4.putString(r0, r1)
            java.lang.String r1 = r7.A07
            java.lang.String r0 = "title"
            r4.putString(r0, r1)
            java.lang.String r0 = "bank_account"
            X.76N r1 = new X.76N
            r1.<init>(r0, r4)
            goto L_0x021e
        L_0x0243:
            com.fbpay.logging.FBPayLoggerData r0 = r5.A06
            java.util.Map r9 = X.C122037Js.A06(r0)
            com.fbpay.hub.paymentmethods.api.FbPayPayPal r3 = r7.A04
            r3.getClass()
            java.lang.String r0 = r3.A02
            r0.getClass()
            java.lang.Long r0 = X.AnonymousClass0wJ.A0d(r0)
            X.C86164wN.A1J(r0, r9)
            X.8h9 r2 = r5.A0E
            java.util.HashMap r1 = X.C86164wN.A0j(r9)
            java.lang.String r0 = "fbpay_edit_paypal_click"
            r2.Bb8(r0, r1)
            java.lang.String r1 = "target_name"
            java.lang.String r0 = "paypal"
            r9.put(r1, r0)
            java.lang.String r1 = "credential_type"
            java.lang.String r0 = "paypal_ba"
            r9.put(r1, r0)
            java.lang.String r0 = "user_edit_credential_enter"
            r2.Bb8(r0, r9)
            java.lang.String r0 = "paypal_credential"
            r4.putParcelable(r0, r3)
            com.fbpay.logging.FBPayLoggerData r0 = r5.A06
            r4.putParcelable(r6, r0)
            java.lang.String r0 = "edit_paypal"
            X.76N r1 = new X.76N
            r1.<init>(r0, r4)
            r1.A00 = r8
            goto L_0x021e
        L_0x028c:
            com.facebook.quicklog.QuickPerformanceLogger r1 = X.C121817Ig.A01()
            r0 = 110175975(0x69126e7, float:5.46001E-35)
            r1.markerStart(r0)
            com.fbpay.logging.FBPayLoggerData r0 = r5.A06
            java.util.Map r9 = X.C122037Js.A06(r0)
            com.fbpay.hub.paymentmethods.api.FbPayCreditCard r2 = r7.A03
            r2.getClass()
            java.lang.String r13 = r2.A08
            r13.getClass()
            java.lang.Long r0 = X.AnonymousClass0wJ.A0d(r13)
            X.C86164wN.A1J(r0, r9)
            X.8h9 r6 = r5.A0E
            java.util.HashMap r1 = X.C86164wN.A0j(r9)
            java.lang.String r0 = "fbpay_edit_card_click"
            r6.Bb8(r0, r1)
            java.lang.String r1 = "target_name"
            java.lang.String r0 = "edit_card"
            r9.put(r1, r0)
            java.lang.String r1 = "credential_type"
            java.lang.String r0 = "credit_card"
            r9.put(r1, r0)
            com.fbpay.logging.FBPayLoggerData r0 = r5.A06
            java.lang.String r1 = r0.A00()
            java.lang.String r0 = X.C61953Wm.A00()
            r9.put(r0, r1)
            com.fbpay.logging.FBPayLoggerData r1 = r5.A06
            java.lang.String r0 = "logger_data"
            r9.put(r0, r1)
            java.lang.String r0 = "user_edit_credential_enter"
            r6.Bb8(r0, r9)
            com.fbpay.hub.contactinfo.address.api.FBPayAddress r6 = r2.A00
            r6.getClass()
            com.fbpay.logging.FBPayLoggerData r0 = r5.A06
            r36 = r0
            boolean r11 = r5.A0H
            boolean r10 = r5.A0I
            boolean r0 = r5.A0J
            r17 = r0
            java.lang.String r0 = r7.A07
            r0.getClass()
            java.lang.String r1 = r2.A09
            r35 = r1
            java.lang.String r9 = r2.A06
            java.lang.String r7 = r2.A07
            r1 = 4
            java.lang.String r1 = r7.substring(r8, r1)
            java.lang.String r16 = X.AnonymousClass00U.A0L(r9, r1)
            java.lang.String r1 = r2.A03
            r34 = r1
            r34.getClass()
            java.lang.String r1 = r6.A04
            r33 = r1
            r33.getClass()
            java.lang.String r1 = r6.A05
            r32 = r1
            java.lang.String r1 = r6.A00
            r31 = r1
            r31.getClass()
            java.lang.String r1 = r6.A03
            r30 = r1
            r30.getClass()
            java.lang.String r9 = r6.A02
            r9.getClass()
            java.lang.String r8 = r6.A01
            r8.getClass()
            java.lang.String r7 = r2.A05
            r7.getClass()
            java.lang.String r1 = r2.A04
            r29 = r1
            r29.getClass()
            com.facebookpay.form.model.AddressFormFieldsConfig r6 = r5.A03
            X.69W r14 = r2.A01
            r2 = 0
            X.7EL r1 = new X.7EL
            r1.<init>(r0, r13)
            r1.A05 = r15
            r1.A04 = r7
            r0 = 0
            java.lang.String r22 = "fbpay_edit_card_display"
            java.lang.String r19 = "fbpay_edit_card_cancel"
            java.lang.String r26 = "fbpay_edit_card_save"
            java.lang.String r28 = "fbpay_edit_card_succeed"
            java.lang.String r27 = "fbpay_edit_card_fail"
            java.lang.String r23 = "fbpay_remove_card_click"
            java.lang.String r25 = "fbpay_remove_card_succeed"
            java.lang.String r24 = "fbpay_remove_card_fail"
            java.lang.String r20 = "fbpay_remove_card_cancel"
            java.lang.String r21 = "fbpay_remove_card_save"
            com.fbpay.hub.form.params.FormLogEvents r13 = new com.fbpay.hub.form.params.FormLogEvents
            r18 = r13
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            r15 = r36
            r1.A02 = r15
            r1.A01 = r13
            X.5gy r13 = new X.5gy
            r13.<init>()
            r13.A0D = r7
            r7 = r29
            r13.A0C = r7
            r7 = r35
            r13.A0F = r7
            r7 = r16
            r13.A0E = r7
            r13.A05 = r14
            r7 = r34
            r13.A0B = r7
            r7 = r11 ^ 1
            r13.A0L = r7
            com.facebookpay.form.cell.creditcard.CreditCardCellParams r14 = new com.facebookpay.form.cell.creditcard.CreditCardCellParams
            r14.<init>((X.C91865gy) r13)
            com.google.common.collect.ImmutableList$Builder r7 = r1.A09
            r7.add((java.lang.Object) r14)
            if (r10 != 0) goto L_0x039c
            com.facebookpay.form.cell.label.LabelCellParams r13 = X.C99206In.A00()
            r7.add((java.lang.Object) r13)
        L_0x039c:
            if (r17 == 0) goto L_0x03b3
            r13 = -1
            X.5h0 r14 = new X.5h0
            r14.<init>(r13)
            r13 = 2131822285(0x7f1106cd, float:1.9277337E38)
            r14.A03 = r13
            r13 = 1
            r14.A07 = r13
            com.facebookpay.form.cell.label.LabelCellParams r13 = r14.A00()
            r7.add((java.lang.Object) r13)
        L_0x03b3:
            r13 = 11
            if (r11 == 0) goto L_0x0405
            r6.getClass()
            X.5gt r2 = new X.5gt
            r2.<init>(r6)
            r2.A01 = r9
            com.facebook.common.locale.Country r0 = com.facebook.common.locale.Country.A00(r0, r8)
            r2.A00 = r0
            com.facebookpay.form.cell.address.BriefAddressCellParams r0 = new com.facebookpay.form.cell.address.BriefAddressCellParams
            r0.<init>((X.C91815gt) r2)
        L_0x03cc:
            r7.add((java.lang.Object) r0)
            if (r10 == 0) goto L_0x03d8
            com.facebookpay.form.cell.label.LabelCellParams r0 = X.C99206In.A00()
            r7.add((java.lang.Object) r0)
        L_0x03d8:
            X.6ke r6 = new X.6ke
            r6.<init>()
            r0 = 2131827689(0x7f111be9, float:1.9288298E38)
            r6.A03 = r0
            boolean r2 = X.AnonymousClass7HK.A01()
            r0 = 2131827687(0x7f111be7, float:1.9288294E38)
            if (r2 == 0) goto L_0x03ee
            r0 = 2131830506(0x7f1126ea, float:1.9294011E38)
        L_0x03ee:
            r6.A00 = r0
            r0 = 2131827688(0x7f111be8, float:1.9288296E38)
            com.fbpay.hub.form.params.FormParams r1 = X.AnonymousClass7EL.A00(r6, r1, r0)
            java.lang.String r0 = "form_params"
            r4.putParcelable(r0, r1)
            java.lang.String r0 = "form"
            X.76N r1 = new X.76N
            r1.<init>(r0, r4)
            goto L_0x021c
        L_0x0405:
            r6.getClass()
            X.5gz r11 = new X.5gz
            r11.<init>(r6, r13)
            r6 = r33
            r11.A0L = r6
            r6 = r32
            r11.A0G = r6
            r6 = r31
            r11.A0H = r6
            r6 = r30
            r11.A0K = r6
            r11.A0J = r9
            com.facebook.common.locale.Country r0 = com.facebook.common.locale.Country.A00(r0, r8)
            r11.A0B = r0
            r11.A0T = r2
            r11.A0V = r2
            r0 = 1
            r11.A0S = r0
            com.facebookpay.form.cell.address.AddressCellParams r0 = new com.facebookpay.form.cell.address.AddressCellParams
            r0.<init>((X.C91875gz) r11)
            goto L_0x03cc
        L_0x0432:
            r0 = -706302561(0xffffffffd5e6ad9f, float:-3.17041714E13)
            int r12 = X.C14030oh.A05(r0)
            java.lang.Object r13 = r6.A01
            com.facebookpay.msc.notifications.viewmodel.NotificationsViewModel r13 = (com.facebookpay.msc.notifications.viewmodel.NotificationsViewModel) r13
            java.lang.String r3 = r6.A02
            java.lang.Object r2 = r6.A00
            com.facebook.pando.TreeJNI r2 = (com.facebook.pando.TreeJNI) r2
            X.21j r1 = X.C304521j.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r0 = "notification_source"
            java.lang.Enum r0 = X.C86104wH.A0a(r2, r1, r0)
            java.lang.String r17 = java.lang.String.valueOf(r0)
            java.lang.String r14 = "user_click_payouthub_atomic"
            java.lang.String r15 = "notification_hub_dismiss_click"
            r18 = 0
            r27 = 8176(0x1ff0, float:1.1457E-41)
            r16 = r3
            r19 = r18
            r20 = r18
            r21 = r18
            r22 = r18
            r23 = r18
            r24 = r18
            r25 = r18
            r26 = r18
            com.facebookpay.msc.notifications.viewmodel.NotificationsViewModel.A00(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            X.56q r5 = r13.A07
            java.lang.Object r0 = r5.A08()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            if (r0 == 0) goto L_0x049a
            java.util.ArrayList r4 = X.AnonymousClass0wJ.A0v()
            java.util.Iterator r2 = r0.iterator()
        L_0x047e:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0497
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.7jT r0 = (X.C128377jT) r0
            X.6m0 r0 = r0.A00
            java.lang.String r0 = r0.A03
            boolean r0 = X.C04220Ms.A0I(r0, r3)
            X.C18240wQ.A1N(r1, r4, r0)
            goto L_0x047e
        L_0x0497:
            r5.A0H(r4)
        L_0x049a:
            r0 = -1740168759(0xffffffff984721c9, float:-2.5737204E-24)
        L_0x049d:
            X.C14030oh.A0C(r0, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.IDxCListenerShape9S1200000_2_I2.onClick(android.view.View):void");
    }
}
