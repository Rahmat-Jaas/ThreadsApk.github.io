package X;

import com.facebook.redex.IDxFunctionShape122S0300000_2_I2;

/* renamed from: X.78m  reason: invalid class name and case insensitive filesystem */
public final class C1200978m {
    public final AnonymousClass7IT A00 = new AnonymousClass7IT();
    public final C111796oQ A01 = new C111796oQ();

    public static final M5J A00(C112146p4 r4, C121207Et r5, C1200978m r6) {
        C104996ci A012 = C121207Et.A01(r5, "PAY_BUTTON");
        M5J A03 = new AnonymousClass5k8(AnonymousClass7TQ.A00, new IDxFunctionShape122S0300000_2_I2(1, r4, r5, r6), A012).A03();
        C880756q A002 = AnonymousClass7IT.A00(r6.A00, AnonymousClass6IY.A00(r5));
        C04220Ms.A0C(A002, "null cannot be cast to non-null type androidx.lifecycle.MediatorLiveData<com.fbpay.util.resource.FBPayResource<com.facebookpay.expresscheckout.api.FBPayComponentDataQueryResponse>>");
        C04220Ms.A06(A03);
        C121277Fh.A02(A03, A002, C86164wN.A0O(A002, r5, 10));
        return A002;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x00ae, code lost:
        if (X.C18190wL.A1a(r6) != r2) goto L_0x00b0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.M5J A01(com.facebookpay.otc.models.OtcInput r29, X.C111166mt r30, java.lang.String r31, java.lang.String r32, java.lang.String r33) {
        /*
            r28 = this;
            r17 = 0
            r4 = r30
            r27 = r31
            r0 = r27
            boolean r2 = X.AnonymousClass0wJ.A1Z(r4, r0)
            r3 = 2
            r26 = r32
            r0 = r26
            X.C04220Ms.A0B(r0, r3)
            X.7ke r10 = X.AnonymousClass7JJ.A00()
            com.fbpay.logging.LoggingContext r9 = r4.A03
            com.facebookpay.paymentmethod.model.PaymentMethod r7 = r4.A02
            long r24 = X.C86164wN.A0A(r7)
            X.LcE r8 = r7.Aam()
            r5 = r29
            if (r29 == 0) goto L_0x00e4
            java.lang.String r1 = r5.A01
            X.7DP r0 = new X.7DP
            r0.<init>(r2, r1)
        L_0x002f:
            r1 = 0
            java.util.LinkedHashMap r6 = X.C18220wO.A0y()
            if (r0 == 0) goto L_0x0039
            X.AnonymousClass7Kr.A0B(r0, r6)
        L_0x0039:
            java.lang.String r22 = "checkout"
            X.C04220Ms.A0B(r8, r3)
            X.09x r3 = r10.A00
            java.lang.String r0 = "client_add_ecppaymentcontainer_init"
            X.0A2 r3 = X.C86104wH.A0K(r3, r0)
            r0 = 186(0xba, float:2.6E-43)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r3 = X.C18180wK.A0I(r3, r0)
            kotlin.jvm.internal.KtLambdaShape0S1300100_I2 r0 = new kotlin.jvm.internal.KtLambdaShape0S1300100_I2
            r18 = r0
            r19 = r9
            r20 = r8
            r21 = r6
            r23 = r2
            r18.<init>(r19, r20, r21, r22, r23, r24)
            X.C128957ke.A04(r3, r9, r0)
            com.facebook.quicklog.QuickPerformanceLogger r6 = r10.A01
            r3 = 223884226(0xd5833c2, float:6.662244E-31)
            java.lang.String r0 = "CONTAINER_CREATION_INIT"
            r6.markerPoint(r3, r0)
            com.facebookpay.expresscheckout.models.TransactionInfo r10 = r4.A01
            com.facebookpay.common.models.CurrencyAmount r8 = X.C122157Kv.A03(r10)
            java.lang.String r6 = r7.Aal()
            boolean r0 = r7 instanceof com.facebookpay.paymentmethod.model.TokenizedCard
            if (r0 == 0) goto L_0x00cf
            java.lang.String r7 = "NETWORK_TOKEN"
        L_0x0078:
            com.facebook.graphql.calls.GQLCallInputCInputShape0S0000000 r3 = com.facebook.graphql.calls.GraphQlCallInput.A00()
            java.lang.String r0 = r8.A01
            java.lang.String r15 = "amount"
            r3.A0F(r0, r15)
            java.lang.String r0 = r8.A00
            java.lang.String r14 = "currency_code"
            r3.A0F(r0, r14)
            com.facebook.graphql.calls.GQLCallInputCInputShape0S0000000 r0 = com.facebook.graphql.calls.GraphQlCallInput.A00()
            java.lang.String r13 = "credential_id"
            r0.A0F(r6, r13)
            java.lang.String r12 = "credential_type"
            r0.A0F(r7, r12)
            java.lang.String r11 = "charge_amount"
            r0.A0B(r3, r11)
            com.facebook.graphql.calls.GQLCallInputCInputShape0S0000000[] r0 = new com.facebook.graphql.calls.GQLCallInputCInputShape0S0000000[]{r0}
            java.util.ArrayList r9 = X.C06750aI.A14(r0)
            java.util.List r6 = r4.A08
            if (r6 == 0) goto L_0x00b0
            boolean r3 = X.C18190wL.A1a(r6)
            r0 = 1
            if (r3 == r2) goto L_0x00b1
        L_0x00b0:
            r0 = 0
        L_0x00b1:
            r7 = 10
            if (r0 == 0) goto L_0x0123
            java.util.ArrayList r3 = X.AnonymousClass0wJ.A0v()
            java.util.Iterator r6 = r6.iterator()
        L_0x00bd:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x00e7
            java.lang.Object r2 = r6.next()
            boolean r0 = r2 instanceof com.facebookpay.incentives.model.ECPOnsiteOffer
            if (r0 == 0) goto L_0x00bd
            r3.add(r2)
            goto L_0x00bd
        L_0x00cf:
            boolean r0 = r7 instanceof com.facebookpay.paymentmethod.model.CreditCard
            if (r0 == 0) goto L_0x00d6
            java.lang.String r7 = "CREDIT_CARD"
            goto L_0x0078
        L_0x00d6:
            boolean r0 = r7 instanceof com.facebookpay.paymentmethod.model.PayPalCredential
            if (r0 == 0) goto L_0x00dd
            java.lang.String r7 = "PAYPAL_BA"
            goto L_0x0078
        L_0x00dd:
            boolean r0 = r7 instanceof com.facebookpay.paymentmethod.model.APMCredential
            if (r0 == 0) goto L_0x02cf
            java.lang.String r7 = "NEW_PAYPAL_CHECKOUT"
            goto L_0x0078
        L_0x00e4:
            r0 = 0
            goto L_0x002f
        L_0x00e7:
            java.util.ArrayList r8 = X.AnonymousClass0wJ.A0x(r3, r7)
            java.util.Iterator r16 = r3.iterator()
        L_0x00ef:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x0120
            java.lang.Object r0 = r16.next()
            com.facebookpay.incentives.model.ECPOnsiteOffer r0 = (com.facebookpay.incentives.model.ECPOnsiteOffer) r0
            java.lang.String r6 = r0.A01
            com.facebook.graphql.calls.GQLCallInputCInputShape0S0000000 r3 = com.facebook.graphql.calls.GraphQlCallInput.A00()
            com.facebookpay.common.models.CurrencyAmount r2 = r0.A00
            java.lang.String r0 = r2.A01
            r3.A0F(r0, r15)
            java.lang.String r0 = r2.A00
            r3.A0F(r0, r14)
            java.lang.String r2 = "OFFER"
            com.facebook.graphql.calls.GQLCallInputCInputShape0S0000000 r0 = com.facebook.graphql.calls.GraphQlCallInput.A00()
            r0.A0F(r6, r13)
            r0.A0F(r2, r12)
            r0.A0B(r3, r11)
            r8.add(r0)
            goto L_0x00ef
        L_0x0120:
            r9.addAll(r8)
        L_0x0123:
            com.facebook.graphql.calls.GQLCallInputCInputShape0S0000000 r3 = com.facebook.graphql.calls.GraphQlCallInput.A00()
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r8 = r4.A00
            java.lang.String r2 = r8.A09
            java.lang.String r0 = "payment_request_id"
            r3.A0F(r2, r0)
            java.lang.String r2 = r4.A05
            java.lang.String r0 = "order_id"
            r3.A0F(r2, r0)
            com.facebook.graphql.calls.GQLCallInputCInputShape0S0000000 r6 = com.facebook.graphql.calls.GraphQlCallInput.A00()
            java.lang.String r2 = "platform_trust_token"
            r0 = r27
            r6.A0F(r0, r2)
            java.lang.String r0 = "auth_factors"
            r3.A0B(r6, r0)
            com.facebook.graphql.calls.GQLCallInputCInputShape0S0000000 r6 = com.facebook.graphql.calls.GraphQlCallInput.A00()
            java.lang.String r2 = r4.A06
            java.lang.String r0 = "receiver_id"
            r6.A0F(r2, r0)
            java.lang.String r0 = "receiver_info"
            r3.A0B(r6, r0)
            java.lang.String r0 = "credentials"
            r3.A0A(r0, r9)
            java.lang.String r2 = r8.A08
            java.lang.String r0 = "payment_product_id"
            r3.A0F(r2, r0)
            com.facebookpay.expresscheckout.models.ECPPaymentConfiguration r6 = r8.A03
            if (r6 == 0) goto L_0x0183
            java.util.ArrayList<X.692> r0 = r6.A07
            java.util.ArrayList r9 = X.AnonymousClass0wJ.A0x(r0, r7)
            java.util.Iterator r2 = r0.iterator()
        L_0x0171:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0184
            java.lang.Object r0 = r2.next()
            X.692 r0 = (X.AnonymousClass692) r0
            java.lang.String r0 = r0.A00
            r9.add(r0)
            goto L_0x0171
        L_0x0183:
            r9 = r1
        L_0x0184:
            java.lang.String r0 = "supported_container_types"
            r3.A0A(r0, r9)
            java.lang.String r2 = r10.A06
            java.lang.String r0 = "country_code"
            r3.A0F(r2, r0)
            if (r6 == 0) goto L_0x01f6
            java.lang.String r2 = r6.A04
        L_0x0194:
            java.lang.String r0 = "security_origin"
            r3.A0F(r2, r0)
            if (r6 == 0) goto L_0x01f4
            java.lang.String r2 = r6.A03
        L_0x019d:
            java.lang.String r0 = "container_context_id"
            r3.A0F(r2, r0)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r17)
            java.lang.String r0 = "is_guest_checkout"
            r3.A0D(r0, r2)
            if (r6 == 0) goto L_0x01b1
            X.68b r0 = r6.A02
            java.lang.String r1 = r0.A00
        L_0x01b1:
            java.lang.String r0 = "payment_mode"
            r3.A0F(r1, r0)
            boolean r0 = r4.A09
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "save_shipping_as_billing_address"
            r3.A0D(r0, r1)
            java.lang.String r1 = r4.A07
            if (r1 == 0) goto L_0x01ca
            java.lang.String r0 = "shipping_address_id"
            r3.A0F(r1, r0)
        L_0x01ca:
            if (r6 == 0) goto L_0x026e
            java.util.Map<X.692, android.os.Bundle> r0 = r6.A08
            if (r0 == 0) goto L_0x026e
            java.util.LinkedHashMap r9 = X.C18220wO.A0y()
            java.util.Iterator r2 = X.AnonymousClass0wJ.A0z(r0)
        L_0x01d8:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x01f8
            java.util.Map$Entry r1 = X.C18180wK.A0o(r2)
            java.lang.Object r0 = r1.getValue()
            android.os.BaseBundle r0 = (android.os.BaseBundle) r0
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x01d8
            X.C18210wN.A1Q(r9, r1)
            goto L_0x01d8
        L_0x01f4:
            r2 = r1
            goto L_0x019d
        L_0x01f6:
            r2 = r1
            goto L_0x0194
        L_0x01f8:
            java.util.LinkedHashMap r6 = X.C18220wO.A0y()
            java.util.Iterator r2 = X.C18190wL.A0u(r9)
        L_0x0200:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x021c
            java.util.Map$Entry r1 = X.C18180wK.A0o(r2)
            java.lang.Object r0 = r1.getValue()
            android.os.BaseBundle r0 = (android.os.BaseBundle) r0
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0200
            X.C18210wN.A1Q(r6, r1)
            goto L_0x0200
        L_0x021c:
            int r0 = r6.size()
            java.util.ArrayList r9 = X.C18240wQ.A0k(r0)
            java.util.Iterator r11 = X.C18190wL.A0u(r6)
        L_0x0228:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x0263
            java.util.Map$Entry r2 = X.C18180wK.A0o(r11)
            com.facebook.graphql.calls.GQLCallInputCInputShape0S0000000 r10 = com.facebook.graphql.calls.GraphQlCallInput.A00()
            java.lang.Object r0 = r2.getKey()
            X.692 r0 = (X.AnonymousClass692) r0
            java.lang.String r1 = r0.A00
            java.lang.String r0 = "type"
            r10.A0F(r1, r0)
            com.facebook.graphql.calls.GQLCallInputCInputShape0S0000000 r6 = com.facebook.graphql.calls.GraphQlCallInput.A00()
            java.lang.Object r2 = r2.getValue()
            android.os.BaseBundle r2 = (android.os.BaseBundle) r2
            java.lang.String r1 = "webhookUri"
            java.lang.String r0 = ""
            java.lang.String r1 = r2.getString(r1, r0)
            java.lang.String r0 = "webhook_uri"
            r6.A0F(r1, r0)
            java.lang.String r0 = "config"
            r10.A0B(r6, r0)
            r9.add(r10)
            goto L_0x0228
        L_0x0263:
            boolean r0 = X.C18190wL.A1a(r9)
            if (r0 == 0) goto L_0x026e
            java.lang.String r0 = "supported_containers"
            r3.A0A(r0, r9)
        L_0x026e:
            com.facebook.graphql.calls.GQLCallInputCInputShape1S0000000 r6 = X.C86154wM.A0L()
            java.lang.String r2 = r8.A0A
            r1 = 52
            r0 = 34
            java.lang.String r0 = X.C61953Wm.A01(r1, r7, r0)
            r6.A0D(r2, r0)
            java.lang.String r1 = r4.A04
            java.lang.String r0 = "client_mutation_id"
            r6.A0D(r1, r0)
            java.lang.String r1 = "pay_button_click_id"
            r0 = r26
            r6.A0D(r0, r1)
            com.facebook.graphql.calls.GQLCallInputCInputShape0S0000000 r1 = X.C116936xr.A00(r5)
            java.lang.String r0 = "one_time_checkout_input"
            r6.A0B(r1, r0)
            java.lang.String r0 = "step_up_completed_token"
            r1 = r33
            r6.A0D(r1, r0)
            com.facebook.graphql.calls.GQLCallInputCInputShape0S0000000[] r0 = new com.facebook.graphql.calls.GQLCallInputCInputShape0S0000000[]{r3}
            java.util.ArrayList r1 = X.C06750aI.A14(r0)
            java.lang.String r0 = "request_payment_container_input_list"
            r6.A0A(r0, r1)
            X.6ci r3 = X.AnonymousClass7Kz.A0C()
            r0 = 11
            com.facebook.redex.IDxFunctionShape152S0200000_2_I2 r2 = new com.facebook.redex.IDxFunctionShape152S0200000_2_I2
            r1 = r28
            r2.<init>(r0, r6, r1)
            X.7TP r1 = X.AnonymousClass7TP.A00
            X.5k8 r0 = new X.5k8
            r0.<init>(r1, r2, r3)
            X.M5J r1 = r0.A03()
            r0 = 9
            com.facebook.redex.IDxObserverShape99S0200000_2_I2 r0 = X.C86164wN.A0O(r5, r4, r0)
            X.AnonymousClass7Kx.A0H(r1, r0)
            X.C04220Ms.A06(r1)
            return r1
        L_0x02cf:
            java.lang.String r0 = "Not supported credential type"
            java.lang.IllegalArgumentException r0 = X.C18190wL.A0a(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1200978m.A01(com.facebookpay.otc.models.OtcInput, X.6mt, java.lang.String, java.lang.String, java.lang.String):X.M5J");
    }

    public final void A02(AnonymousClass79R r3) {
        AnonymousClass7IT.A03(this.A00, r3.A00, r3);
    }
}
