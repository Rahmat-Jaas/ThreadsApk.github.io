package com.facebook.redex;

import X.C143158gC;

public class IDxObserverShape4S2100000_2_I2 implements C143158gC {
    public Object A00;
    public String A01;
    public String A02;
    public final int A03;

    public IDxObserverShape4S2100000_2_I2(Object obj, String str, String str2, int i) {
        this.A03 = i;
        this.A00 = obj;
        this.A01 = str;
        this.A02 = str2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0178, code lost:
        if (r5 != null) goto L_0x011e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x017c, code lost:
        if (r5 != null) goto L_0x0136;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0180, code lost:
        if (r5 != null) goto L_0x014e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void onChanged(java.lang.Object r26) {
        /*
            r25 = this;
            r0 = r25
            r3 = r26
            int r1 = r0.A03
            if (r1 == 0) goto L_0x00f1
            X.7Kx r3 = (X.AnonymousClass7Kx) r3
            r4 = 0
            X.C04220Ms.A0B(r3, r4)
            java.lang.Object r7 = r0.A00
            com.facebookpay.msc.transactions.viewmodel.TransactionsViewModel r7 = (com.facebookpay.msc.transactions.viewmodel.TransactionsViewModel) r7
            X.56r r2 = r7.A06
            X.67Q r1 = r3.A00
            r2.A0H(r1)
            boolean r1 = X.AnonymousClass7Kx.A0R(r3)
            java.lang.String r6 = "0"
            r10 = 0
            if (r1 == 0) goto L_0x00a2
            java.lang.Boolean r1 = X.C18180wK.A0Y()
            r7.A00 = r1
            java.lang.Object r5 = r3.A01
            com.facebook.pando.TreeJNI r5 = (com.facebook.pando.TreeJNI) r5
            if (r5 == 0) goto L_0x00ee
            java.lang.Class<com.facebook.graphql.impls.PayoutTransactionQueryResponseImpl$XfbBusinessPaymentsHub> r2 = com.facebook.graphql.impls.PayoutTransactionQueryResponseImpl.XfbBusinessPaymentsHub.class
            java.lang.String r1 = "xfb_business_payments_hub(interface_type:$interface_type)"
            com.facebook.pando.TreeJNI r5 = r5.getTreeValue(r1, r2)
            if (r5 == 0) goto L_0x00ee
            java.lang.Class<com.facebook.graphql.impls.PayoutTransactionQueryResponseImpl$XfbBusinessPaymentsHub$PayoutTransactions> r2 = com.facebook.graphql.impls.PayoutTransactionQueryResponseImpl.XfbBusinessPaymentsHub.PayoutTransactions.class
            java.lang.String r1 = "payout_transactions(after:$after,fe_id:$fe_id,filter:{\"filter_type\":$filter_type},first:$first,session_id:$session_id)"
            com.facebook.pando.TreeJNI r5 = r5.getTreeValue(r1, r2)
            if (r5 == 0) goto L_0x00ee
            java.lang.Class<com.facebook.graphql.impls.PayoutTransactionQueryResponseImpl$XfbBusinessPaymentsHub$PayoutTransactions$PageInfo> r2 = com.facebook.graphql.impls.PayoutTransactionQueryResponseImpl.XfbBusinessPaymentsHub.PayoutTransactions.PageInfo.class
            java.lang.String r1 = "page_info"
            com.facebook.pando.TreeJNI r2 = r5.getTreeValue(r1, r2)
            if (r2 == 0) goto L_0x00ee
            java.lang.Class<com.facebook.graphql.impls.PaginationInfoImpl> r1 = com.facebook.graphql.impls.PaginationInfoImpl.class
            com.facebook.pando.TreeJNI r1 = r2.reinterpret(r1)
            com.facebook.graphql.impls.PaginationInfoImpl r1 = (com.facebook.graphql.impls.PaginationInfoImpl) r1
        L_0x0054:
            r7.A00 = r1
            X.7TG r1 = X.AnonymousClass7TG.A00
            X.7Kx r2 = X.AnonymousClass7Kx.A03(r1, r3)
            r1 = 23
            X.7Kx r1 = X.AnonymousClass7Kx.A07(r3, r7, r1)
            r7.A02 = r1
            java.util.Map r19 = com.facebookpay.msc.transactions.viewmodel.TransactionsViewModel.A00(r2)
            com.facebook.graphql.impls.PaginationInfoImpl r2 = r7.A00
            if (r2 == 0) goto L_0x0074
            java.lang.String r1 = "start_cursor"
            java.lang.String r14 = r2.getStringValue(r1)
            if (r14 != 0) goto L_0x0075
        L_0x0074:
            r14 = r6
        L_0x0075:
            com.facebook.graphql.impls.PaginationInfoImpl r2 = r7.A00
            if (r2 == 0) goto L_0x00ec
            java.lang.String r1 = "end_cursor"
            java.lang.String r15 = r2.getStringValue(r1)
        L_0x007f:
            com.facebook.graphql.impls.PaginationInfoImpl r2 = r7.A00
            if (r2 == 0) goto L_0x00ea
            java.lang.String r1 = "has_next_page"
            java.lang.Boolean r8 = X.C18250wR.A0S(r2, r1)
        L_0x0089:
            r20 = 1806(0x70e, float:2.531E-42)
            java.lang.String r9 = "client_fetch_payouthub_success"
            java.lang.String r13 = "BSC_PAYOUT_HUB_PAYOUT_TRANSACTION"
            r11 = r10
            r12 = r10
            r16 = r10
            r17 = r10
            r18 = r10
            com.facebookpay.msc.transactions.viewmodel.TransactionsViewModel.A03(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            java.lang.String r1 = "fetch_success"
            com.facebookpay.msc.transactions.viewmodel.TransactionsViewModel.A04(r1)
            com.facebookpay.msc.transactions.viewmodel.TransactionsViewModel.A02(r7)
        L_0x00a2:
            boolean r1 = X.AnonymousClass7Kx.A0O(r3)
            if (r1 == 0) goto L_0x00e4
            X.C86154wM.A1N(r7, r4)
            r12 = 0
            java.lang.String r2 = r0.A02
            if (r2 != 0) goto L_0x00b1
            r2 = r6
        L_0x00b1:
            java.lang.String r1 = r0.A01
            java.lang.Throwable r0 = r3.A02
            if (r0 == 0) goto L_0x00e5
            java.lang.String r20 = r0.getMessage()
            java.lang.String r21 = X.AnonymousClass721.A00(r0)
            java.lang.Class r0 = r0.getClass()
            if (r0 == 0) goto L_0x00c9
            java.lang.String r10 = r0.getSimpleName()
        L_0x00c9:
            r24 = 2190(0x88e, float:3.069E-42)
            java.lang.String r13 = "client_fetch_payouthub_fail"
            java.lang.String r17 = "BSC_PAYOUT_HUB_PAYOUT_TRANSACTION"
            r11 = r7
            r14 = r12
            r15 = r12
            r16 = r12
            r18 = r2
            r19 = r1
            r22 = r10
            r23 = r12
            com.facebookpay.msc.transactions.viewmodel.TransactionsViewModel.A03(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            java.lang.String r0 = "fetch_fail"
            com.facebookpay.msc.transactions.viewmodel.TransactionsViewModel.A04(r0)
        L_0x00e4:
            return
        L_0x00e5:
            r20 = r10
            r21 = r10
            goto L_0x00c9
        L_0x00ea:
            r8 = r10
            goto L_0x0089
        L_0x00ec:
            r15 = r10
            goto L_0x007f
        L_0x00ee:
            r1 = r10
            goto L_0x0054
        L_0x00f1:
            X.7Kx r2 = X.C86104wH.A0S(r3)
            boolean r1 = X.AnonymousClass7Kx.A0R(r2)
            if (r1 == 0) goto L_0x00e4
            java.lang.Object r4 = r0.A00
            com.facebookpay.expresscheckout.repositoryimpl.ECPRepositoryImpl r4 = (com.facebookpay.expresscheckout.repositoryimpl.ECPRepositoryImpl) r4
            r10 = 0
            java.lang.Object r5 = r2.A01
            com.facebook.graphql.impls.FetchProductConfigQueryResponseImpl r5 = (com.facebook.graphql.impls.FetchProductConfigQueryResponseImpl) r5
            if (r5 == 0) goto L_0x0177
            com.facebook.graphql.impls.FetchProductConfigQueryResponseImpl$FetchProductConfig r3 = r5.A00()
            if (r3 == 0) goto L_0x0177
            java.lang.Class<com.facebook.graphql.impls.FetchProductConfigQueryResponseImpl$FetchProductConfig$EcpAvailability> r2 = com.facebook.graphql.impls.FetchProductConfigQueryResponseImpl.FetchProductConfig.EcpAvailability.class
            java.lang.String r1 = "ecp_availability"
            com.facebook.pando.TreeJNI r2 = r3.getTreeValue(r1, r2)
            if (r2 == 0) goto L_0x0177
            java.lang.Class<com.facebook.graphql.impls.FBPayECPAvailabilityImpl> r1 = com.facebook.graphql.impls.FBPayECPAvailabilityImpl.class
            com.facebook.pando.TreeJNI r7 = r2.reinterpret(r1)
            com.facebook.graphql.impls.FBPayECPAvailabilityImpl r7 = (com.facebook.graphql.impls.FBPayECPAvailabilityImpl) r7
        L_0x011e:
            com.facebook.graphql.impls.FetchProductConfigQueryResponseImpl$FetchProductConfig r3 = r5.A00()
            if (r3 == 0) goto L_0x017b
            java.lang.Class<com.facebook.graphql.impls.FetchProductConfigQueryResponseImpl$FetchProductConfig$CheckoutScreenConfig> r2 = com.facebook.graphql.impls.FetchProductConfigQueryResponseImpl.FetchProductConfig.CheckoutScreenConfig.class
            java.lang.String r1 = "checkout_screen_config"
            com.facebook.pando.TreeJNI r2 = r3.getTreeValue(r1, r2)
            if (r2 == 0) goto L_0x017b
            java.lang.Class<com.facebook.graphql.impls.FBPayCheckoutScreenConfigImpl> r1 = com.facebook.graphql.impls.FBPayCheckoutScreenConfigImpl.class
            com.facebook.pando.TreeJNI r6 = r2.reinterpret(r1)
            com.facebook.graphql.impls.FBPayCheckoutScreenConfigImpl r6 = (com.facebook.graphql.impls.FBPayCheckoutScreenConfigImpl) r6
        L_0x0136:
            com.facebook.graphql.impls.FetchProductConfigQueryResponseImpl$FetchProductConfig r3 = r5.A00()
            if (r3 == 0) goto L_0x017f
            java.lang.Class<com.facebook.graphql.impls.FetchProductConfigQueryResponseImpl$FetchProductConfig$PaymentConfig> r2 = com.facebook.graphql.impls.FetchProductConfigQueryResponseImpl.FetchProductConfig.PaymentConfig.class
            java.lang.String r1 = "payment_config"
            com.facebook.pando.TreeJNI r2 = r3.getTreeValue(r1, r2)
            if (r2 == 0) goto L_0x017f
            java.lang.Class<com.facebook.graphql.impls.FBPayPaymentConfigImpl> r1 = com.facebook.graphql.impls.FBPayPaymentConfigImpl.class
            com.facebook.pando.TreeJNI r9 = r2.reinterpret(r1)
            com.facebook.graphql.impls.FBPayPaymentConfigImpl r9 = (com.facebook.graphql.impls.FBPayPaymentConfigImpl) r9
        L_0x014e:
            com.facebook.graphql.impls.FetchProductConfigQueryResponseImpl$FetchProductConfig r3 = r5.A00()
            if (r3 == 0) goto L_0x0183
            java.lang.Class<com.facebook.graphql.impls.FetchProductConfigQueryResponseImpl$FetchProductConfig$LoggingPolicy> r2 = com.facebook.graphql.impls.FetchProductConfigQueryResponseImpl.FetchProductConfig.LoggingPolicy.class
            java.lang.String r1 = "logging_policy"
            com.facebook.pando.TreeJNI r2 = r3.getTreeValue(r1, r2)
            if (r2 == 0) goto L_0x0183
            java.lang.Class<com.facebook.graphql.impls.FBPayLoggingPolicyImpl> r1 = com.facebook.graphql.impls.FBPayLoggingPolicyImpl.class
            com.facebook.pando.TreeJNI r8 = r2.reinterpret(r1)
            com.facebook.graphql.impls.FBPayLoggingPolicyImpl r8 = (com.facebook.graphql.impls.FBPayLoggingPolicyImpl) r8
        L_0x0166:
            X.6lW r5 = new X.6lW
            r5.<init>(r6, r7, r8, r9, r10)
            r4.A01 = r5
            java.lang.String r2 = r0.A01
            java.lang.String r1 = r0.A02
            X.6rH r0 = r4.A0A
            r0.A01(r5, r2, r1)
            return
        L_0x0177:
            r7 = r10
            if (r5 == 0) goto L_0x017b
            goto L_0x011e
        L_0x017b:
            r6 = r10
            if (r5 == 0) goto L_0x017f
            goto L_0x0136
        L_0x017f:
            r9 = r10
            if (r5 == 0) goto L_0x0183
            goto L_0x014e
        L_0x0183:
            r8 = r10
            goto L_0x0166
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.IDxObserverShape4S2100000_2_I2.onChanged(java.lang.Object):void");
    }
}
