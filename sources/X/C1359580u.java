package X;

/* renamed from: X.80u  reason: invalid class name and case insensitive filesystem */
public final class C1359580u implements Runnable {
    public final /* synthetic */ C128557jn A00;
    public final /* synthetic */ String A01;

    public C1359580u(C128557jn r1, String str) {
        this.A01 = str;
        this.A00 = r1;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r6v0 */
    /* JADX WARNING: type inference failed for: r6v1, types: [java.lang.Throwable] */
    /* JADX WARNING: type inference failed for: r6v6 */
    /* JADX WARNING: type inference failed for: r6v7 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r21 = this;
            com.facebookpay.offsite.models.message.GsonUtils r1 = com.facebookpay.offsite.models.message.GsonUtils.INSTANCE
            r2 = r21
            java.lang.String r0 = r2.A01
            com.facebookpay.offsite.models.message.PaymentHandledRequest r8 = r1.getToOffsitePaymentHandledMsg(r0)
            X.7jn r4 = r2.A00
            X.0Oa r0 = r4.A06
            com.facebookpay.offsite.base.CheckoutHandler r5 = X.C86164wN.A0P(r0)
            r9 = 0
            X.C04220Ms.A0B(r8, r9)
            java.util.LinkedHashMap r1 = X.C18220wO.A0y()
            java.util.Map r0 = r5.A0G
            r1.putAll(r0)
            long r2 = r8.timeStamp
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            java.lang.String r0 = "REQUEST_TIMESTAMP"
            r1.put(r0, r2)
            X.56r r3 = r5.A0R
            java.lang.Object r0 = r3.A08()
            com.facebookpay.offsite.models.message.PaymentResponse r0 = (com.facebookpay.offsite.models.message.PaymentResponse) r0
            if (r0 == 0) goto L_0x0049
            com.facebookpay.offsite.models.message.PaymentResponseContent r0 = r0.content
            if (r0 == 0) goto L_0x0049
            com.facebookpay.offsite.models.message.PaymentContainer r0 = r0.container
            if (r0 == 0) goto L_0x0049
            com.facebookpay.offsite.models.message.PaymentContainerType r0 = r0.containerType
            if (r0 == 0) goto L_0x0049
            java.lang.String r2 = r0.getType()
            java.lang.String r0 = "CONTAINER_TYPE"
            r1.put(r0, r2)
        L_0x0049:
            com.facebookpay.offsite.models.message.PaymentAuthorizationResult r7 = r8.content
            X.4x8 r10 = r5.A05
            java.lang.String r11 = r5.A0A
            X.C18200wM.A1S(r7, r10)
            com.facebookpay.offsite.models.message.AuthorizationState r0 = r7.authorizationState
            int r2 = r0.ordinal()
            r6 = 0
            if (r2 == r9) goto L_0x00b8
            r0 = 2
            if (r2 == r0) goto L_0x00b8
            com.facebookpay.offsite.models.message.PaymentDataError r12 = r7.error
            if (r12 == 0) goto L_0x0066
            com.facebookpay.offsite.models.message.PaymentDataErrorReason r0 = r12.reason
            if (r0 != 0) goto L_0x0068
        L_0x0066:
            com.facebookpay.offsite.models.message.PaymentDataErrorReason r0 = com.facebookpay.offsite.models.message.PaymentDataErrorReason.OTHER_ERROR
        L_0x0068:
            java.lang.String r0 = r0.name()
            java.lang.Integer r2 = X.AnonymousClass7BF.A00(r0)
            if (r12 == 0) goto L_0x0074
            java.lang.String r6 = r12.message
        L_0x0074:
            int r0 = r2.intValue()
            switch(r0) {
                case 2: goto L_0x017f;
                case 3: goto L_0x017a;
                default: goto L_0x007b;
            }
        L_0x007b:
            r0 = 2131826479(0x7f11172f, float:1.9285844E38)
        L_0x007e:
            java.lang.String r19 = X.AnonymousClass0wJ.A0k(r10, r0)
            java.lang.String r20 = X.AnonymousClass6IX.A00(r10, r2, r11, r6)
            boolean r2 = r7.retryable
            r0 = 2131826477(0x7f11172d, float:1.928584E38)
            if (r2 == 0) goto L_0x0090
            r0 = 2131826486(0x7f111736, float:1.9285858E38)
        L_0x0090:
            java.lang.String r2 = r10.getString(r0)
            X.C04220Ms.A09(r2)
            boolean r0 = r7.retryable
            if (r0 == 0) goto L_0x0176
            X.68y r0 = X.C973368y.A03
        L_0x009d:
            X.67N r0 = r0.A01
            r11 = 0
            X.6iz r13 = new X.6iz
            r13.<init>(r0, r2, r11)
            java.lang.Integer r18 = X.AnonymousClass006.A0N
            com.facebookpay.common.models.ErrorDialogContent r10 = new com.facebookpay.common.models.ErrorDialogContent
            r12 = r11
            r14 = r11
            r15 = r11
            r16 = r11
            r17 = r11
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            X.88a r6 = new X.88a
            r6.<init>(r10)
        L_0x00b8:
            r7 = 0
            if (r6 != 0) goto L_0x00f9
            com.facebookpay.offsite.models.message.PaymentAuthorizationResult r0 = r8.content
            com.facebookpay.offsite.models.message.AuthorizationState r0 = r0.authorizationState
            int r2 = r0.ordinal()
            if (r2 == r9) goto L_0x01ba
            r0 = 2
            if (r2 != r0) goto L_0x00f6
            java.lang.Object r0 = r3.A08()
            com.facebookpay.offsite.models.message.PaymentResponse r0 = (com.facebookpay.offsite.models.message.PaymentResponse) r0
            if (r0 == 0) goto L_0x00f7
            com.facebookpay.offsite.models.message.PaymentResponseContent r0 = r0.content
            if (r0 == 0) goto L_0x00f7
            com.facebookpay.offsite.models.message.PaymentContainer r0 = r0.container
            if (r0 == 0) goto L_0x00f7
            com.facebookpay.offsite.models.message.PaymentContainerType r1 = r0.containerType
        L_0x00da:
            com.facebookpay.offsite.models.message.PaymentContainerType r0 = com.facebookpay.offsite.models.message.PaymentContainerType.PAYPAL_OTC_V1
            if (r1 == r0) goto L_0x0184
            java.util.concurrent.atomic.AtomicReference r0 = r5.A0X
            java.lang.Object r1 = X.C86154wM.A0e(r0)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r0 = "INTERNAL_ERROR"
            com.facebookpay.offsite.base.CheckoutHandler.A09(r5, r1, r0, r7, r7)
            X.56r r1 = r5.A0S
            kotlin.Unit r0 = kotlin.Unit.A00
            X.7Kx r0 = X.AnonymousClass7Kx.A0B(r0, r7)
        L_0x00f3:
            r1.A0H(r0)
        L_0x00f6:
            return
        L_0x00f7:
            r1 = r7
            goto L_0x00da
        L_0x00f9:
            com.facebookpay.offsite.models.message.PaymentAuthorizationResult r2 = r8.content
            com.facebookpay.offsite.models.message.PaymentDataError r0 = r2.error
            if (r0 == 0) goto L_0x0103
            com.facebookpay.offsite.models.message.PaymentDataErrorReason r0 = r0.reason
            if (r0 != 0) goto L_0x0105
        L_0x0103:
            com.facebookpay.offsite.models.message.PaymentDataErrorReason r0 = com.facebookpay.offsite.models.message.PaymentDataErrorReason.OTHER_ERROR
        L_0x0105:
            java.lang.String r0 = r0.name()
            java.lang.Integer r7 = X.AnonymousClass7BF.A00(r0)
            boolean r0 = r2.retryable
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "RETRYABLE"
            r1.put(r0, r2)
            java.lang.String r2 = X.AnonymousClass7BF.A02(r7)
            java.lang.String r0 = "ERROR_CODE"
            r1.put(r0, r2)
            java.util.LinkedHashMap r3 = X.C18220wO.A0y()
            java.lang.String r0 = "EVENT_EXTRA"
            r1.put(r0, r3)
            java.util.Locale r2 = java.util.Locale.ROOT
            X.C04220Ms.A08(r2)
            java.lang.String r0 = "ERROR_MESSAGE"
            java.lang.String r2 = X.C18190wL.A0r(r2, r0)
            com.facebookpay.offsite.models.message.PaymentAuthorizationResult r0 = r8.content
            com.facebookpay.offsite.models.message.PaymentDataError r0 = r0.error
            if (r0 == 0) goto L_0x013f
            java.lang.String r0 = r0.message
            if (r0 != 0) goto L_0x0145
        L_0x013f:
            r0 = 267(0x10b, float:3.74E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
        L_0x0145:
            r3.put(r2, r0)
            X.68R r0 = X.AnonymousClass68R.CLIENT_LOAD_OFFSITEPAYMENTHANDLED_FAIL
            r5.A0I(r0, r1)
            java.lang.String r4 = r5.A0B
            if (r4 == 0) goto L_0x016c
            X.7AE r0 = com.facebookpay.offsite.base.CheckoutHandler.A02(r5)
            com.facebookpay.expresscheckout.models.ECPPaymentResponseParams r3 = r0.A00
            if (r3 == 0) goto L_0x016c
            X.7Gp r2 = X.C121537Gp.A00
            java.lang.String r1 = com.facebookpay.offsite.base.CheckoutHandler.A03(r5)
            java.lang.String r0 = X.AnonymousClass7BF.A01(r7)
            java.util.Map r1 = r2.A02(r3, r1, r4, r0)
            java.lang.String r0 = "submit_payment_container_fail"
            com.facebookpay.offsite.base.CheckoutHandler.A0A(r5, r0, r1)
        L_0x016c:
            X.56r r1 = r5.A0S
            kotlin.Unit r0 = kotlin.Unit.A00
            X.7Kx r0 = X.AnonymousClass7Kx.A0B(r0, r6)
            goto L_0x00f3
        L_0x0176:
            X.68y r0 = X.C973368y.A04
            goto L_0x009d
        L_0x017a:
            r0 = 2131826485(0x7f111735, float:1.9285856E38)
            goto L_0x007e
        L_0x017f:
            r0 = 2131826482(0x7f111732, float:1.928585E38)
            goto L_0x007e
        L_0x0184:
            java.lang.String r6 = r5.A0B
            if (r6 == 0) goto L_0x019f
            X.7AE r0 = com.facebookpay.offsite.base.CheckoutHandler.A02(r5)
            com.facebookpay.expresscheckout.models.ECPPaymentResponseParams r2 = r0.A00
            if (r2 == 0) goto L_0x019f
            X.7Gp r1 = X.C121537Gp.A00
            java.lang.String r0 = com.facebookpay.offsite.base.CheckoutHandler.A03(r5)
            java.util.Map r1 = r1.A02(r2, r0, r6, r7)
            java.lang.String r0 = "submit_payment_container_success"
            com.facebookpay.offsite.base.CheckoutHandler.A0A(r5, r0, r1)
        L_0x019f:
            r3.A0H(r7)
            X.56r r2 = r5.A0S
            X.7AE r0 = com.facebookpay.offsite.base.CheckoutHandler.A02(r5)
            java.lang.String r1 = r0.A06
            com.facebookpay.expresscheckout.models.PaymentHandledResponseData r0 = new com.facebookpay.expresscheckout.models.PaymentHandledResponseData
            r0.<init>(r1)
            X.AnonymousClass7Kx.A0I(r2, r0)
            androidx.fragment.app.FragmentActivity r1 = r4.A01
            X.8gC r0 = r4.A03
            r3.A0C(r1, r0)
            return
        L_0x01ba:
            X.68R r0 = X.AnonymousClass68R.CLIENT_LOAD_OFFSITEPAYMENTHANDLED_SUCCESS
            r5.A0I(r0, r1)
            X.56r r1 = r5.A0S
            kotlin.Unit r0 = kotlin.Unit.A00
            X.AnonymousClass7Kx.A0I(r1, r0)
            com.facebookpay.offsite.base.CheckoutHandler.A07(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1359580u.run():void");
    }
}
