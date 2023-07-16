package com.facebook.redex;

import X.McB;

public class IDxFunctionShape362S0100000_2_I2 implements McB {
    public Object A00;
    public final int A01;

    public IDxFunctionShape362S0100000_2_I2(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    /* JADX WARNING: Removed duplicated region for block: B:225:0x06e5  */
    /* JADX WARNING: Removed duplicated region for block: B:228:0x06ee  */
    /* JADX WARNING: Removed duplicated region for block: B:231:0x06f7  */
    /* JADX WARNING: Removed duplicated region for block: B:234:0x0708  */
    /* JADX WARNING: Removed duplicated region for block: B:235:0x070d  */
    /* JADX WARNING: Removed duplicated region for block: B:236:0x070f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object apply(java.lang.Object r45) {
        /*
            r44 = this;
            r5 = r44
            r0 = r45
            int r1 = r5.A01
            switch(r1) {
                case 0: goto L_0x003a;
                case 1: goto L_0x0043;
                case 2: goto L_0x0054;
                case 3: goto L_0x0063;
                case 4: goto L_0x0068;
                case 5: goto L_0x0029;
                case 6: goto L_0x00a0;
                case 7: goto L_0x00ca;
                case 8: goto L_0x0103;
                case 9: goto L_0x02a6;
                case 10: goto L_0x0742;
                case 11: goto L_0x075b;
                case 12: goto L_0x0774;
                default: goto L_0x0009;
            }
        L_0x0009:
            com.facebook.pando.TreeJNI r0 = (com.facebook.pando.TreeJNI) r0
            java.lang.Object r3 = r5.A00
            X.7kq r3 = (X.C129017kq) r3
            if (r0 == 0) goto L_0x0027
            java.lang.Class<com.instagram.graphql.instagramschemagraphservices.BindCreditCardResponseImpl$AddCreditCardProofToAutofill> r2 = com.instagram.graphql.instagramschemagraphservices.BindCreditCardResponseImpl.AddCreditCardProofToAutofill.class
            java.lang.String r1 = "add_credit_card_proof_to_autofill(data:$input)"
            com.facebook.pando.TreeJNI r0 = r0.getTreeValue(r1, r2)
        L_0x0019:
            java.lang.String r0 = java.lang.String.valueOf(r0)
            X.7EC r0 = X.AnonymousClass7EC.A00(r0)
            r3.A01(r0)
            kotlin.Unit r0 = kotlin.Unit.A00
        L_0x0026:
            return r0
        L_0x0027:
            r0 = 0
            goto L_0x0019
        L_0x0029:
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            com.facebook.graphql.error.GraphQLError r1 = com.facebook.graphql.error.GraphServicesExceptionMigrationAdapter.getGraphQLErrorFromException(r0)
            if (r1 == 0) goto L_0x0026
            java.lang.String r1 = r1.debugInfo
            r4 = r0
            r3 = 0
            r2 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x0791
        L_0x003a:
            com.facebook.common.locale.LocaleMember r0 = (com.facebook.common.locale.LocaleMember) r0
            java.util.Locale r0 = r0.A00
            java.lang.String r0 = r0.getISO3Country()
            return r0
        L_0x0043:
            java.lang.Object r1 = r5.A00
            X.6ir r1 = (X.C108736ir) r1
            X.LTL r1 = r1.A01     // Catch:{ ExecutionException -> 0x004e }
            java.lang.Object r0 = r1.A00(r0)     // Catch:{ ExecutionException -> 0x004e }
            return r0
        L_0x004e:
            r0 = move-exception
            X.AnonymousClass7J2.A02(r0)
            r0 = 0
            throw r0
        L_0x0054:
            r2 = r0
            com.facebook.papaya.store.RecordSet r2 = (com.facebook.papaya.store.RecordSet) r2
            java.lang.Object r0 = r5.A00
            X.6gJ r0 = (X.C107176gJ) r0
            X.6HZ r1 = r0.A00
            X.6gK r0 = new X.6gK
            r0.<init>(r1, r2)
            return r0
        L_0x0063:
            com.facebook.papaya.store.Callback$Result r0 = (com.facebook.papaya.store.Callback.Result) r0
            java.lang.Object r0 = r0.mValue
            return r0
        L_0x0068:
            java.lang.Object r1 = r5.A00
            X.3SL r1 = (X.AnonymousClass3SL) r1
            r2 = r0
            java.lang.String r2 = (java.lang.String) r2
            android.content.Context r1 = r1.A00
            X.7M8 r0 = new X.7M8
            r0.<init>(r1, r2)
            X.8lq r2 = r0.A05
            X.6ob r1 = new X.6ob
            r1.<init>(r2)
            r0.A00 = r1
            X.8mt r1 = X.C146808mt.A00
            r0.A01 = r1
            r1 = 1252993256(0x4aaf28e8, float:5739636.0)
            int r2 = X.C14030oh.A03(r1)
            X.8kf r3 = r0.A04
            X.7uB r4 = new X.7uB
            r4.<init>(r0)
            r5 = 232(0xe8, float:3.25E-43)
            r6 = 1
            r7 = 0
            r8 = r6
            r3.schedule(r4, r5, r6, r7, r8)
            r1 = -274499057(0xffffffffefa37a0f, float:-1.0118723E29)
            X.C14030oh.A0A(r1, r2)
            return r0
        L_0x00a0:
            com.facebook.pando.TreeJNI r0 = (com.facebook.pando.TreeJNI) r0
            java.lang.Class<com.instagram.fbpay.auth.graphql.IGResetPINWithPasswordMutationResponseImpl$PaymentPinUpdate> r2 = com.instagram.fbpay.auth.graphql.IGResetPINWithPasswordMutationResponseImpl.PaymentPinUpdate.class
            java.lang.String r1 = "payment_pin_update(data:$input)"
            com.facebook.pando.TreeJNI r2 = r0.getTreeValue(r1, r2)
            r2.getClass()
            java.lang.Class<com.instagram.fbpay.auth.graphql.IGResetPINWithPasswordMutationResponseImpl$PaymentPinUpdate$AuthenticationTicket> r1 = com.instagram.fbpay.auth.graphql.IGResetPINWithPasswordMutationResponseImpl.PaymentPinUpdate.AuthenticationTicket.class
            java.lang.String r0 = "authentication_ticket"
            com.facebook.pando.TreeJNI r1 = r2.getTreeValue(r0, r1)
            r1.getClass()
            r0 = -1563793709(0xffffffffa2ca66d3, float:-5.486108E-18)
            java.lang.Class r0 = X.AnonymousClass6H6.A00(r0)     // Catch:{ ClassNotFoundException -> 0x00c4 }
            com.facebook.pando.TreeJNI r0 = r1.reinterpret(r0)     // Catch:{ ClassNotFoundException -> 0x00c4 }
            return r0
        L_0x00c4:
            r0 = move-exception
            java.lang.RuntimeException r0 = X.C86114wI.A0k(r0)
            throw r0
        L_0x00ca:
            com.facebook.pando.TreeJNI r0 = (com.facebook.pando.TreeJNI) r0
            r1 = -2078243045(0xffffffff8420871b, float:-1.8869947E-36)
            java.lang.Class r1 = X.AnonymousClass6H6.A00(r1)     // Catch:{ ClassNotFoundException -> 0x00fd }
            com.facebook.pando.TreeJNI r5 = r0.reinterpret(r1)     // Catch:{ ClassNotFoundException -> 0x00fd }
            if (r5 == 0) goto L_0x00f6
            java.lang.Class<com.facebook.graphql.impls.FBPayAuthFlowsContentQueryFragmentImpl$FbpayAuthenticationInformationQuery> r4 = com.facebook.graphql.impls.FBPayAuthFlowsContentQueryFragmentImpl.FbpayAuthenticationInformationQuery.class
            java.lang.String r3 = "fbpay_authentication_information_query(input:$input)"
            com.facebook.pando.TreeJNI r0 = r5.getTreeValue(r3, r4)
            if (r0 == 0) goto L_0x00f6
            com.facebook.pando.TreeJNI r0 = r5.getTreeValue(r3, r4)
            java.lang.Class<com.facebook.graphql.impls.FBPayAuthFlowsContentQueryFragmentImpl$FbpayAuthenticationInformationQuery$AuthenticationInformation> r2 = com.facebook.graphql.impls.FBPayAuthFlowsContentQueryFragmentImpl.FbpayAuthenticationInformationQuery.AuthenticationInformation.class
            java.lang.String r1 = "authentication_information"
            com.facebook.pando.TreeJNI r0 = r0.getTreeValue(r1, r2)
            if (r0 == 0) goto L_0x00f6
            com.facebook.pando.TreeJNI r0 = X.C86114wI.A0O(r5, r4, r2, r3, r1)
            return r0
        L_0x00f6:
            java.lang.String r0 = "The authentication information is null."
            java.lang.IllegalArgumentException r0 = X.C18190wL.A0a(r0)
            throw r0
        L_0x00fd:
            r0 = move-exception
            java.lang.RuntimeException r0 = X.C86114wI.A0k(r0)
            throw r0
        L_0x0103:
            com.facebook.pando.TreeJNI r0 = (com.facebook.pando.TreeJNI) r0
            if (r0 == 0) goto L_0x02a1
            java.lang.Class<com.instagram.graphql.instagramschemagraphservices.IgFbPayOrdersQueryResponseImpl$Me> r10 = com.instagram.graphql.instagramschemagraphservices.IgFbPayOrdersQueryResponseImpl.Me.class
            java.lang.String r9 = "me"
            com.facebook.pando.TreeJNI r1 = r0.getTreeValue(r9, r10)
            if (r1 == 0) goto L_0x02a1
            com.facebook.pando.TreeJNI r1 = r0.getTreeValue(r9, r10)
            java.lang.Class<com.instagram.graphql.instagramschemagraphservices.IgFbPayOrdersQueryResponseImpl$Me$InlineUser> r8 = com.instagram.graphql.instagramschemagraphservices.IgFbPayOrdersQueryResponseImpl.Me.InlineUser.class
            com.facebook.pando.TreeJNI r1 = r1.reinterpret(r8)
            if (r1 == 0) goto L_0x02a1
            com.facebook.pando.TreeJNI r1 = X.C86144wL.A0M(r0, r10, r8, r9)
            java.lang.Class<com.instagram.graphql.instagramschemagraphservices.IgOrdersViewPaymentAccountImpl> r7 = com.instagram.graphql.instagramschemagraphservices.IgOrdersViewPaymentAccountImpl.class
            com.facebook.pando.TreeJNI r1 = r1.reinterpret(r7)
            if (r1 == 0) goto L_0x02a1
            com.facebook.pando.TreeJNI r1 = X.C86144wL.A0M(r0, r10, r8, r9)
            com.facebook.pando.TreeJNI r1 = r1.reinterpret(r7)
            java.lang.Class<com.instagram.graphql.instagramschemagraphservices.IgOrdersViewPaymentAccountImpl$PaymentTransactionsShoppingBagOnUser> r6 = com.instagram.graphql.instagramschemagraphservices.IgOrdersViewPaymentAccountImpl.PaymentTransactionsShoppingBagOnUser.class
            java.lang.String r4 = "payment_transactions_shopping_bag_on_user(first:$first,payment_order_types:[\"IG_MOR_DONATIONS\",\"IG_NMOR_DONATION_P4P\",\"IG_NMOR_P2B\",\"IG_NMOR_SHOPPING\",\"NMOR_CHECKOUT_EXPERIENCES\",\"NMOR_INSTAGRAM_P2B\"])"
            com.facebook.pando.TreeJNI r1 = r1.getTreeValue(r4, r6)
            if (r1 == 0) goto L_0x02a1
            com.facebook.pando.TreeJNI r1 = X.C86144wL.A0M(r0, r10, r8, r9)
            com.facebook.pando.TreeJNI r1 = r1.reinterpret(r7)
            com.facebook.pando.TreeJNI r1 = r1.getTreeValue(r4, r6)
            java.lang.Class<com.instagram.graphql.instagramschemagraphservices.IgOrdersViewPaymentAccountImpl$PaymentTransactionsShoppingBagOnUser$Edges> r3 = com.instagram.graphql.instagramschemagraphservices.IgOrdersViewPaymentAccountImpl.PaymentTransactionsShoppingBagOnUser.Edges.class
            java.lang.String r2 = "edges"
            com.google.common.collect.ImmutableList r1 = r1.getTreeList(r2, r3)
            if (r1 == 0) goto L_0x02a1
            com.facebook.pando.TreeJNI r0 = X.C86144wL.A0M(r0, r10, r8, r9)
            com.facebook.pando.TreeJNI r0 = r0.reinterpret(r7)
            com.facebook.pando.TreeJNI r0 = r0.getTreeValue(r4, r6)
            com.google.common.collect.ImmutableList r0 = r0.getTreeList(r2, r3)
            com.google.common.collect.ImmutableList$Builder r4 = X.C86164wN.A0Q()
            X.83w r11 = r0.iterator()
        L_0x0169:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x029c
            com.facebook.pando.TreeJNI r2 = X.C18210wN.A0G(r11)
            java.lang.Class<com.instagram.graphql.instagramschemagraphservices.IgOrdersViewPaymentAccountImpl$PaymentTransactionsShoppingBagOnUser$Edges$Node> r1 = com.instagram.graphql.instagramschemagraphservices.IgOrdersViewPaymentAccountImpl.PaymentTransactionsShoppingBagOnUser.Edges.Node.class
            java.lang.String r0 = "node"
            com.facebook.pando.TreeJNI r8 = r2.getTreeValue(r0, r1)
            if (r8 == 0) goto L_0x0169
            java.lang.Class<com.instagram.graphql.instagramschemagraphservices.IgOrdersListItemViewListRowImpl> r7 = com.instagram.graphql.instagramschemagraphservices.IgOrdersListItemViewListRowImpl.class
            com.facebook.pando.TreeJNI r0 = r8.reinterpret(r7)
            if (r0 == 0) goto L_0x0169
            com.facebook.pando.TreeJNI r0 = r8.reinterpret(r7)
            java.lang.Class<com.instagram.graphql.instagramschemagraphservices.IgOrdersListItemViewListRowImpl$HistoryRowViewData> r3 = com.instagram.graphql.instagramschemagraphservices.IgOrdersListItemViewListRowImpl.HistoryRowViewData.class
            java.lang.String r2 = "history_row_view_data"
            com.facebook.pando.TreeJNI r0 = r0.getTreeValue(r2, r3)
            if (r0 == 0) goto L_0x0169
            com.facebook.pando.TreeJNI r0 = r8.reinterpret(r7)
            com.facebook.pando.TreeJNI r0 = r0.getTreeValue(r2, r3)
            java.lang.Class<com.instagram.graphql.instagramschemagraphservices.IgOrdersListItemViewListItemViewDataImpl> r1 = com.instagram.graphql.instagramschemagraphservices.IgOrdersListItemViewListItemViewDataImpl.class
            com.facebook.pando.TreeJNI r0 = r0.reinterpret(r1)
            if (r0 == 0) goto L_0x0169
            com.facebook.pando.TreeJNI r0 = r8.reinterpret(r7)
            com.facebook.pando.TreeJNI r6 = X.C86144wL.A0M(r0, r3, r1, r2)
            com.facebook.pando.TreeJNI r1 = r8.reinterpret(r7)
            java.lang.String r0 = "__typename"
            java.lang.String r18 = r1.getStringValue(r0)
            if (r18 == 0) goto L_0x0169
            if (r6 == 0) goto L_0x0169
            java.lang.String r10 = "order_id"
            java.lang.String r0 = r6.getStringValue(r10)
            if (r0 == 0) goto L_0x0169
            X.21B r3 = X.AnonymousClass21B.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r2 = "status_type"
            java.lang.Enum r0 = X.C86104wH.A0a(r6, r3, r2)
            if (r0 == 0) goto L_0x0169
            java.lang.Class<com.instagram.graphql.instagramschemagraphservices.IgOrdersListItemViewListItemViewDataImpl$StatusWithEntities> r8 = com.instagram.graphql.instagramschemagraphservices.IgOrdersListItemViewListItemViewDataImpl.StatusWithEntities.class
            java.lang.String r7 = "status_with_entities"
            com.facebook.pando.TreeJNI r0 = r6.getTreeValue(r7, r8)
            if (r0 == 0) goto L_0x0169
            com.facebook.pando.TreeJNI r0 = r6.getTreeValue(r7, r8)
            java.lang.String r1 = "text"
            java.lang.String r0 = r0.getStringValue(r1)
            if (r0 == 0) goto L_0x0169
            com.facebook.pando.TreeJNI r0 = r6.getTreeValue(r7, r8)
            java.lang.String r0 = r0.getStringValue(r1)
            long r0 = java.lang.Long.parseLong(r0)
            java.util.Locale r8 = X.C31103Gfm.A02()
            r7 = 2
            java.text.DateFormat r9 = java.text.DateFormat.getDateInstance(r7, r8)
            r7 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r7
            java.lang.String r8 = X.C18240wQ.A0i(r9, r0)
            r13 = 0
            java.lang.String r7 = r6.getStringValue(r10)
            java.lang.String r0 = "orderId"
            X.AnonymousClass3ZT.A02(r7, r0)
            java.lang.Object r1 = r5.A00
            android.content.Context r1 = (android.content.Context) r1
            java.lang.Enum r0 = X.C86104wH.A0a(r6, r3, r2)
            X.21B r0 = (X.AnonymousClass21B) r0
            int r0 = r0.ordinal()
            switch(r0) {
                case 1: goto L_0x027b;
                case 2: goto L_0x0218;
                case 3: goto L_0x0218;
                case 4: goto L_0x0218;
                case 5: goto L_0x027f;
                case 6: goto L_0x026f;
                case 7: goto L_0x028f;
                case 8: goto L_0x0283;
                case 9: goto L_0x0287;
                case 10: goto L_0x0293;
                case 11: goto L_0x0218;
                case 12: goto L_0x0218;
                case 13: goto L_0x0218;
                case 14: goto L_0x0273;
                case 15: goto L_0x025f;
                case 16: goto L_0x0218;
                case 17: goto L_0x0218;
                case 18: goto L_0x0267;
                case 19: goto L_0x026b;
                case 20: goto L_0x0263;
                case 21: goto L_0x0218;
                case 22: goto L_0x0277;
                default: goto L_0x0218;
            }
        L_0x0218:
            java.lang.String r0 = "orderStatus"
            X.AnonymousClass3ZT.A02(r8, r0)
            java.lang.String r19 = X.C86164wN.A0g(r6)
            java.lang.String r0 = "image_uri"
            java.lang.String r14 = r6.getStringValue(r0)
            java.lang.String r10 = "merchant_name"
            java.lang.String r0 = r6.getStringValue(r10)
            if (r0 == 0) goto L_0x025d
            r9 = 2131832051(0x7f112cf3, float:1.9297145E38)
            java.lang.String r0 = r6.getStringValue(r10)
            java.lang.String r15 = X.AnonymousClass0wJ.A0l(r1, r0, r9)
        L_0x023a:
            java.lang.String r0 = "quantity"
            int r20 = r6.getIntValue(r0)
            java.lang.Enum r2 = X.C86104wH.A0a(r6, r3, r2)
            X.21B r0 = X.AnonymousClass21B.PAYMENT_UPDATE_REQUIRED
            if (r2 != r0) goto L_0x024f
            r0 = 2131099877(0x7f0600e5, float:1.781212E38)
            java.lang.Integer r13 = X.C86134wK.A0b(r1, r0)
        L_0x024f:
            com.fbpay.hub.orders.api.FBPayOrder r12 = new com.fbpay.hub.orders.api.FBPayOrder
            r17 = r8
            r16 = r7
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20)
            r4.add((java.lang.Object) r12)
            goto L_0x0169
        L_0x025d:
            r15 = 0
            goto L_0x023a
        L_0x025f:
            r0 = 2131832059(0x7f112cfb, float:1.9297161E38)
            goto L_0x0296
        L_0x0263:
            r0 = 2131832062(0x7f112cfe, float:1.9297167E38)
            goto L_0x0296
        L_0x0267:
            r0 = 2131832061(0x7f112cfd, float:1.9297165E38)
            goto L_0x0296
        L_0x026b:
            r0 = 2131832063(0x7f112cff, float:1.929717E38)
            goto L_0x0296
        L_0x026f:
            r0 = 2131832049(0x7f112cf1, float:1.929714E38)
            goto L_0x0296
        L_0x0273:
            r0 = 2131832060(0x7f112cfc, float:1.9297163E38)
            goto L_0x0296
        L_0x0277:
            r0 = 2131832065(0x7f112d01, float:1.9297173E38)
            goto L_0x0296
        L_0x027b:
            r0 = 2131832043(0x7f112ceb, float:1.9297129E38)
            goto L_0x0296
        L_0x027f:
            r0 = 2131832046(0x7f112cee, float:1.9297135E38)
            goto L_0x0296
        L_0x0283:
            r0 = 2131832056(0x7f112cf8, float:1.9297155E38)
            goto L_0x0296
        L_0x0287:
            r0 = 2131832057(0x7f112cf9, float:1.9297157E38)
            java.lang.String r8 = r1.getString(r0)
            goto L_0x0218
        L_0x028f:
            r0 = 2131832055(0x7f112cf7, float:1.9297153E38)
            goto L_0x0296
        L_0x0293:
            r0 = 2131832058(0x7f112cfa, float:1.929716E38)
        L_0x0296:
            java.lang.String r8 = X.AnonymousClass0wJ.A0l(r1, r8, r0)
            goto L_0x0218
        L_0x029c:
            com.google.common.collect.ImmutableList r0 = r4.build()
            return r0
        L_0x02a1:
            com.google.common.collect.ImmutableList r0 = com.google.common.collect.ImmutableList.of()
            return r0
        L_0x02a6:
            com.facebook.pando.TreeJNI r0 = (com.facebook.pando.TreeJNI) r0
            com.google.common.collect.ImmutableList$Builder r23 = X.C86164wN.A0Q()
            if (r0 == 0) goto L_0x0725
            java.lang.Class<com.instagram.graphql.instagramschemagraphservices.IgFbPayPaymentMethodsQueryResponseImpl$FbpayAccountExtended> r22 = com.instagram.graphql.instagramschemagraphservices.IgFbPayPaymentMethodsQueryResponseImpl.FbpayAccountExtended.class
            java.lang.String r21 = "fbpay_account_extended"
            r2 = r21
            r1 = r22
            com.facebook.pando.TreeJNI r1 = r0.getTreeValue(r2, r1)
            if (r1 == 0) goto L_0x0725
            r1 = r22
            com.facebook.pando.TreeJNI r3 = r0.getTreeValue(r2, r1)
            java.lang.Class<com.instagram.graphql.instagramschemagraphservices.IgFbPayPaymentMethodsQueryResponseImpl$FbpayAccountExtended$FbpayAccount> r2 = com.instagram.graphql.instagramschemagraphservices.IgFbPayPaymentMethodsQueryResponseImpl.FbpayAccountExtended.FbpayAccount.class
            java.lang.String r1 = "fbpay_account"
            com.facebook.pando.TreeJNI r3 = r3.getTreeValue(r1, r2)
            if (r3 == 0) goto L_0x05c1
            java.lang.Class<com.instagram.graphql.instagramschemagraphservices.IgFbPayPaymentMethodsQueryResponseImpl$FbpayAccountExtended$FbpayAccount$ConsumerPaymentCredentials> r2 = com.instagram.graphql.instagramschemagraphservices.IgFbPayPaymentMethodsQueryResponseImpl.FbpayAccountExtended.FbpayAccount.ConsumerPaymentCredentials.class
            java.lang.String r1 = "consumer_payment_credentials(payment_type:$payment_type)"
            X.83w r20 = X.C18250wR.A0G(r3, r2, r1)
        L_0x02d4:
            boolean r1 = r20.hasNext()
            if (r1 == 0) goto L_0x05c1
            com.facebook.pando.TreeJNI r3 = X.C18210wN.A0G(r20)
            r17 = 0
            r24 = 0
            r18 = 0
            r19 = 0
            r36 = 0
            r41 = 0
            r42 = 0
            r43 = 0
            X.LcF r2 = X.C40308LcF.A08
            java.lang.String r1 = "credential_type"
            java.lang.Enum r2 = X.C86104wH.A0a(r3, r2, r1)
            X.LcF r2 = (X.C40308LcF) r2
            r2.getClass()
            java.lang.Object r4 = r5.A00
            java.util.Set r4 = (java.util.Set) r4
            java.util.Map r1 = X.AnonymousClass74P.A03
            java.lang.Object r1 = r1.get(r2)
            if (r1 == 0) goto L_0x05b6
            boolean r1 = r4.contains(r1)
            if (r1 == 0) goto L_0x02d4
            int r2 = r2.ordinal()
            r1 = 5
            if (r2 == r1) goto L_0x0454
            r1 = 19
            if (r2 == r1) goto L_0x0418
            r1 = 50
            if (r2 == r1) goto L_0x03c9
            r1 = 55
            if (r2 != r1) goto L_0x03a9
            java.lang.Class<com.instagram.graphql.instagramschemagraphservices.ModularIgPaymentsCredentialMethodViewImpl> r1 = com.instagram.graphql.instagramschemagraphservices.ModularIgPaymentsCredentialMethodViewImpl.class
            com.facebook.pando.TreeJNI r2 = r3.reinterpret(r1)
            java.lang.String r1 = "ExistingShopPayAccountOption"
            boolean r1 = r2.isFulfilled(r1)
            if (r1 == 0) goto L_0x02d4
            java.lang.Class<com.instagram.graphql.instagramschemagraphservices.ModularIgPaymentsShopPayAccountFragmentImpl> r1 = com.instagram.graphql.instagramschemagraphservices.ModularIgPaymentsShopPayAccountFragmentImpl.class
            com.facebook.pando.TreeJNI r6 = r2.reinterpret(r1)
            if (r6 == 0) goto L_0x02d4
            java.lang.String r4 = "strong_id__"
            java.lang.String r1 = r6.getStringValue(r4)
            if (r1 == 0) goto L_0x02d4
            java.lang.String r3 = "shoppay_user_id"
            java.lang.String r1 = r6.getStringValue(r3)
            if (r1 == 0) goto L_0x02d4
            java.lang.String r2 = "shoppay_username"
            java.lang.String r1 = r6.getStringValue(r2)
            if (r1 == 0) goto L_0x02d4
            long r10 = X.C18190wL.A07()
            java.lang.String r7 = "authorization_expires_at"
            long r8 = r6.getTimeValue(r7)
            int r1 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            boolean r12 = X.C18180wK.A1X(r1)
            java.lang.String r4 = r6.getStringValue(r4)
            java.lang.String r1 = "id"
            X.AnonymousClass3ZT.A02(r4, r1)
            long r7 = r6.getTimeValue(r7)
            java.lang.String r3 = r6.getStringValue(r3)
            java.lang.String r1 = "shopPayUserId"
            X.AnonymousClass3ZT.A02(r3, r1)
            java.lang.String r2 = r6.getStringValue(r2)
            java.lang.String r1 = "shopPayUsername"
            X.AnonymousClass3ZT.A02(r2, r1)
            com.fbpay.hub.paymentmethods.api.FbPayShopPay r19 = new com.fbpay.hub.paymentmethods.api.FbPayShopPay
            r6 = r19
            r9 = r4
            r10 = r3
            r11 = r2
            r6.<init>(r7, r9, r10, r11, r12)
            X.7Ig r1 = X.AnonymousClass7Kz.A0K()
            if (r12 != 0) goto L_0x03bf
            android.content.Context r3 = r1.A08
            r2 = 2131832202(0x7f112d8a, float:1.9297451E38)
            java.lang.String r1 = r6.A01
            java.lang.String r42 = X.AnonymousClass0wJ.A0l(r3, r1, r2)
        L_0x0398:
            r43 = 3
            if (r12 == 0) goto L_0x03a9
            X.7Ig r1 = X.AnonymousClass7Kz.A0K()
            android.content.Context r2 = r1.A08
            r1 = 2131832201(0x7f112d89, float:1.929745E38)
            java.lang.String r41 = r2.getString(r1)
        L_0x03a9:
            com.fbpay.hub.paymentmethods.api.FbPayPaymentMethod r2 = new com.fbpay.hub.paymentmethods.api.FbPayPaymentMethod
            r35 = r2
            r37 = r17
            r38 = r24
            r39 = r18
            r40 = r19
            r35.<init>(r36, r37, r38, r39, r40, r41, r42, r43)
            r1 = r23
            r1.add((java.lang.Object) r2)
            goto L_0x02d4
        L_0x03bf:
            android.content.Context r2 = r1.A08
            r1 = 2131832200(0x7f112d88, float:1.9297447E38)
            java.lang.String r42 = r2.getString(r1)
            goto L_0x0398
        L_0x03c9:
            java.lang.Class<com.instagram.graphql.instagramschemagraphservices.ModularIgPaymentsCredentialMethodViewImpl> r1 = com.instagram.graphql.instagramschemagraphservices.ModularIgPaymentsCredentialMethodViewImpl.class
            com.facebook.pando.TreeJNI r2 = r3.reinterpret(r1)
            java.lang.String r1 = "PaymentPaypalBillingAgreement"
            boolean r1 = r2.isFulfilled(r1)
            if (r1 == 0) goto L_0x02d4
            java.lang.Class<com.instagram.graphql.instagramschemagraphservices.ModularIgPaymentsPayPalCredentialViewImpl> r1 = com.instagram.graphql.instagramschemagraphservices.ModularIgPaymentsPayPalCredentialViewImpl.class
            com.facebook.pando.TreeJNI r6 = r2.reinterpret(r1)
            if (r6 == 0) goto L_0x02d4
            java.lang.String r7 = "strong_id__"
            java.lang.String r1 = r6.getStringValue(r7)
            if (r1 == 0) goto L_0x02d4
            java.lang.String r2 = "email"
            java.lang.String r1 = r6.getStringValue(r2)
            if (r1 == 0) goto L_0x02d4
            java.lang.String r4 = r6.getStringValue(r2)
            X.AnonymousClass3ZT.A02(r4, r2)
            java.lang.String r3 = r6.getStringValue(r7)
            java.lang.String r1 = "id"
            X.AnonymousClass3ZT.A02(r3, r1)
            java.lang.String r2 = r6.getStringValue(r7)
            java.lang.String r1 = "credentialId"
            X.AnonymousClass3ZT.A02(r2, r1)
            com.fbpay.hub.paymentmethods.api.FbPayPayPal r18 = new com.fbpay.hub.paymentmethods.api.FbPayPayPal
            r1 = r18
            r1.<init>(r2, r4, r3)
            java.lang.String r1 = "user_display_name"
            java.lang.String r42 = r6.getStringValue(r1)
            r43 = 1
            goto L_0x03a9
        L_0x0418:
            java.lang.Class<com.instagram.graphql.instagramschemagraphservices.ModularIgPaymentsCredentialMethodViewImpl> r1 = com.instagram.graphql.instagramschemagraphservices.ModularIgPaymentsCredentialMethodViewImpl.class
            com.facebook.pando.TreeJNI r2 = r3.reinterpret(r1)
            java.lang.String r1 = "DirectDebit"
            boolean r1 = r2.isFulfilled(r1)
            if (r1 == 0) goto L_0x02d4
            java.lang.Class<com.instagram.graphql.instagramschemagraphservices.ModularIgPaymentsDirectDebitViewImpl> r1 = com.instagram.graphql.instagramschemagraphservices.ModularIgPaymentsDirectDebitViewImpl.class
            com.facebook.pando.TreeJNI r4 = r2.reinterpret(r1)
            if (r4 == 0) goto L_0x02d4
            java.lang.String r1 = "id"
            java.lang.String r2 = r3.getStringValue(r1)
            X.AnonymousClass3ZT.A02(r2, r1)
            com.fbpay.hub.paymentmethods.api.FbPayBankAccount r17 = new com.fbpay.hub.paymentmethods.api.FbPayBankAccount
            r1 = r17
            r1.<init>((java.lang.String) r2)
            r43 = 2
            java.lang.String r1 = "bank_name"
            java.lang.String r3 = r4.getStringValue(r1)
            java.lang.String r1 = "last_four_digits"
            java.lang.String r2 = r4.getStringValue(r1)
            java.lang.String r1 = "%s*%s"
            java.lang.String r42 = com.facebook.common.stringformat.StringFormatUtil.formatStrLocaleSafe(r1, r3, r2)
            goto L_0x03a9
        L_0x0454:
            java.lang.Class<com.instagram.graphql.instagramschemagraphservices.ModularIgPaymentsCredentialMethodViewImpl> r1 = com.instagram.graphql.instagramschemagraphservices.ModularIgPaymentsCredentialMethodViewImpl.class
            com.facebook.pando.TreeJNI r2 = r3.reinterpret(r1)
            java.lang.String r1 = "CreditCard"
            boolean r1 = r2.isFulfilled(r1)
            if (r1 == 0) goto L_0x02d4
            java.lang.Class<com.instagram.graphql.instagramschemagraphservices.ModularIgPaymentsCreditCardViewImpl> r1 = com.instagram.graphql.instagramschemagraphservices.ModularIgPaymentsCreditCardViewImpl.class
            com.facebook.pando.TreeJNI r1 = r2.reinterpret(r1)
            com.instagram.graphql.instagramschemagraphservices.ModularIgPaymentsCreditCardViewImpl r1 = (com.instagram.graphql.instagramschemagraphservices.ModularIgPaymentsCreditCardViewImpl) r1
            if (r1 == 0) goto L_0x02d4
            X.66j r13 = X.C967066j.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r12 = "card_type"
            java.lang.Enum r2 = X.C86104wH.A0a(r1, r13, r12)
            if (r2 == 0) goto L_0x02d4
            java.lang.String r11 = "strong_id__"
            java.lang.String r2 = r1.getStringValue(r11)
            if (r2 == 0) goto L_0x02d4
            java.lang.String r10 = "expiry_year"
            java.lang.String r2 = r1.getStringValue(r10)
            if (r2 == 0) goto L_0x02d4
            java.lang.String r9 = "expiry_month"
            java.lang.String r2 = r1.getStringValue(r9)
            if (r2 == 0) goto L_0x02d4
            java.lang.String r8 = "last4"
            java.lang.String r2 = r1.getStringValue(r8)
            if (r2 == 0) goto L_0x02d4
            com.instagram.graphql.instagramschemagraphservices.ModularIgPaymentsCreditCardViewImpl$BillingAddress r2 = r1.A00()
            if (r2 == 0) goto L_0x02d4
            com.instagram.graphql.instagramschemagraphservices.ModularIgPaymentsCreditCardViewImpl$BillingAddress r2 = r1.A00()
            java.lang.Class<com.instagram.graphql.instagramschemagraphservices.ModularIgPaymentsBillingAddressImpl> r3 = com.instagram.graphql.instagramschemagraphservices.ModularIgPaymentsBillingAddressImpl.class
            com.facebook.pando.TreeJNI r2 = r2.reinterpret(r3)
            java.lang.String r7 = "street1"
            java.lang.String r2 = r2.getStringValue(r7)
            if (r2 == 0) goto L_0x02d4
            com.instagram.graphql.instagramschemagraphservices.ModularIgPaymentsCreditCardViewImpl$BillingAddress r2 = r1.A00()
            com.facebook.pando.TreeJNI r2 = r2.reinterpret(r3)
            java.lang.String r6 = "city"
            java.lang.String r2 = r2.getStringValue(r6)
            if (r2 == 0) goto L_0x02d4
            com.instagram.graphql.instagramschemagraphservices.ModularIgPaymentsCreditCardViewImpl$BillingAddress r2 = r1.A00()
            com.facebook.pando.TreeJNI r2 = r2.reinterpret(r3)
            java.lang.String r15 = "state"
            java.lang.String r2 = r2.getStringValue(r15)
            if (r2 == 0) goto L_0x02d4
            com.instagram.graphql.instagramschemagraphservices.ModularIgPaymentsCreditCardViewImpl$BillingAddress r2 = r1.A00()
            com.facebook.pando.TreeJNI r2 = r2.reinterpret(r3)
            java.lang.String r4 = "zip"
            java.lang.String r2 = r2.getStringValue(r4)
            if (r2 == 0) goto L_0x02d4
            com.instagram.graphql.instagramschemagraphservices.ModularIgPaymentsCreditCardViewImpl$BillingAddress r2 = r1.A00()
            com.facebook.pando.TreeJNI r14 = r2.reinterpret(r3)
            java.lang.String r2 = "country"
            java.lang.String r14 = r14.getStringValue(r2)
            if (r14 == 0) goto L_0x02d4
            java.lang.Enum r12 = X.C86104wH.A0a(r1, r13, r12)
            java.lang.String r12 = r12.toString()
            X.69W r16 = X.AnonymousClass69W.A01(r12)
            java.lang.String r13 = "cardType"
            r12 = r16
            X.AnonymousClass3ZT.A02(r12, r13)
            java.lang.String r14 = r1.getStringValue(r11)
            java.lang.String r13 = "credentialId"
            X.AnonymousClass3ZT.A02(r14, r13)
            java.lang.String r13 = r1.getStringValue(r9)
            java.lang.String r9 = "expireMonth"
            X.AnonymousClass3ZT.A02(r13, r9)
            java.lang.String r12 = r1.getStringValue(r10)
            java.lang.String r9 = "expireYear"
            X.AnonymousClass3ZT.A02(r12, r9)
            java.lang.String r9 = r1.getStringValue(r11)
            java.lang.String r10 = "id"
            X.AnonymousClass3ZT.A02(r9, r10)
            java.lang.String r8 = r1.getStringValue(r8)
            java.lang.String r10 = "lastFourDigits"
            X.AnonymousClass3ZT.A02(r8, r10)
            java.lang.String r10 = "is_bound_to_device(device_key_pub_b64:$dev_pub_key)"
            java.lang.Boolean r27 = X.C18250wR.A0S(r1, r10)
            com.instagram.graphql.instagramschemagraphservices.ModularIgPaymentsCreditCardViewImpl$BillingAddress r10 = r1.A00()
            java.lang.String r33 = X.C86124wJ.A0u(r10, r3, r7)
            com.instagram.graphql.instagramschemagraphservices.ModularIgPaymentsCreditCardViewImpl$BillingAddress r7 = r1.A00()
            com.facebook.pando.TreeJNI r10 = r7.reinterpret(r3)
            java.lang.String r7 = "street2"
            java.lang.String r34 = r10.getStringValue(r7)
            com.instagram.graphql.instagramschemagraphservices.ModularIgPaymentsCreditCardViewImpl$BillingAddress r7 = r1.A00()
            java.lang.String r29 = X.C86124wJ.A0u(r7, r3, r6)
            com.instagram.graphql.instagramschemagraphservices.ModularIgPaymentsCreditCardViewImpl$BillingAddress r6 = r1.A00()
            java.lang.String r32 = X.C86124wJ.A0u(r6, r3, r15)
            com.instagram.graphql.instagramschemagraphservices.ModularIgPaymentsCreditCardViewImpl$BillingAddress r6 = r1.A00()
            java.lang.String r31 = X.C86124wJ.A0u(r6, r3, r4)
            com.instagram.graphql.instagramschemagraphservices.ModularIgPaymentsCreditCardViewImpl$BillingAddress r6 = r1.A00()
            java.lang.String r30 = X.C86124wJ.A0u(r6, r3, r2)
            com.fbpay.hub.contactinfo.address.api.FBPayAddress r25 = new com.fbpay.hub.contactinfo.address.api.FBPayAddress
            r28 = r25
            r28.<init>(r29, r30, r31, r32, r33, r34)
            java.lang.String r6 = "card_holder_name"
            java.lang.String r28 = r1.getStringValue(r6)
            com.instagram.graphql.instagramschemagraphservices.ModularIgPaymentsCreditCardViewImpl$BillingAddress r6 = r1.A00()
            java.lang.String r35 = X.C86124wJ.A0u(r6, r3, r4)
            com.instagram.graphql.instagramschemagraphservices.ModularIgPaymentsCreditCardViewImpl$BillingAddress r4 = r1.A00()
            java.lang.String r29 = X.C86124wJ.A0u(r4, r3, r2)
            com.fbpay.hub.paymentmethods.api.FbPayCreditCard r24 = new com.fbpay.hub.paymentmethods.api.FbPayCreditCard
            r26 = r16
            r30 = r14
            r31 = r13
            r32 = r12
            r33 = r9
            r34 = r8
            r24.<init>(r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35)
            java.lang.String r2 = "cc_title"
            java.lang.String r42 = r1.getStringValue(r2)
            java.lang.String r2 = "cc_subtitle"
            java.lang.String r41 = r1.getStringValue(r2)
            java.lang.String r3 = "card_association_image_url"
            java.lang.String r2 = r1.getStringValue(r3)
            if (r2 == 0) goto L_0x03a9
            java.lang.String r1 = r1.getStringValue(r3)
            android.net.Uri r36 = X.C15430rJ.A01(r1)
            goto L_0x03a9
        L_0x05b6:
            java.lang.String r0 = "Unsupported credential type:"
            java.lang.String r0 = X.AnonymousClass0wJ.A0t(r0, r2)
            java.lang.IllegalArgumentException r0 = X.C18190wL.A0a(r0)
            throw r0
        L_0x05c1:
            r2 = r21
            r1 = r22
            com.facebook.pando.TreeJNI r3 = r0.getTreeValue(r2, r1)
            java.lang.Class<com.instagram.graphql.instagramschemagraphservices.IgFbPayPaymentMethodsQueryResponseImpl$FbpayAccountExtended$NewPaymentCredentialOptions> r2 = com.instagram.graphql.instagramschemagraphservices.IgFbPayPaymentMethodsQueryResponseImpl.FbpayAccountExtended.NewPaymentCredentialOptions.class
            java.lang.String r1 = "new_payment_credential_options(payment_type:$payment_type)"
            X.83w r11 = X.C18250wR.A0G(r3, r2, r1)
            r8 = 0
            r7 = r8
            r6 = r8
            r2 = r8
        L_0x05d5:
            boolean r1 = r11.hasNext()
            if (r1 == 0) goto L_0x06d3
            com.facebook.pando.TreeJNI r9 = X.C18210wN.A0G(r11)
            r9.getClass()
            X.LcF r3 = X.C40308LcF.A03
            java.lang.Class<com.instagram.graphql.instagramschemagraphservices.ModularIgPaymentsCredentialOptionViewImpl> r4 = com.instagram.graphql.instagramschemagraphservices.ModularIgPaymentsCredentialOptionViewImpl.class
            com.facebook.pando.TreeJNI r1 = r9.reinterpret(r4)
            X.LcF r10 = X.C40308LcF.A08
            java.lang.String r5 = "credential_type"
            java.lang.Enum r1 = X.C86104wH.A0a(r1, r10, r5)
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L_0x0628
            com.facebook.pando.TreeJNI r3 = r9.reinterpret(r4)
            java.lang.String r5 = "NewCreditCardOption"
            boolean r1 = r3.isFulfilled(r5)
            if (r1 == 0) goto L_0x06d3
            java.lang.Class<com.instagram.graphql.instagramschemagraphservices.ModularIgPaymentsCredentialOptionViewImpl$InlineNewCreditCardOption> r4 = com.instagram.graphql.instagramschemagraphservices.ModularIgPaymentsCredentialOptionViewImpl.InlineNewCreditCardOption.class
            com.facebook.pando.TreeJNI r1 = r3.reinterpret(r4)
            if (r1 == 0) goto L_0x06d3
            com.facebook.pando.TreeJNI r1 = X.C86124wJ.A0U(r9, r4, r5)
            java.lang.String r3 = "title"
            java.lang.String r1 = r1.getStringValue(r3)
            if (r1 == 0) goto L_0x06d3
            X.6ce r7 = new X.6ce
            r7.<init>()
            com.facebook.pando.TreeJNI r1 = X.C86124wJ.A0U(r9, r4, r5)
            java.lang.String r1 = r1.getStringValue(r3)
            r7.A00 = r1
            goto L_0x05d5
        L_0x0628:
            X.LcF r3 = X.C40308LcF.A04
            com.facebook.pando.TreeJNI r1 = r9.reinterpret(r4)
            java.lang.Enum r1 = X.C86104wH.A0a(r1, r10, r5)
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L_0x068f
            com.facebook.pando.TreeJNI r1 = r9.reinterpret(r4)
            com.instagram.graphql.instagramschemagraphservices.ModularIgPaymentsCredentialOptionViewImpl r1 = (com.instagram.graphql.instagramschemagraphservices.ModularIgPaymentsCredentialOptionViewImpl) r1
            com.instagram.graphql.instagramschemagraphservices.ModularIgPaymentsCredentialOptionViewImpl$InlineNewPaypalBillingAgreement r1 = r1.A00()
            if (r1 == 0) goto L_0x06d3
            com.facebook.pando.TreeJNI r1 = r9.reinterpret(r4)
            com.instagram.graphql.instagramschemagraphservices.ModularIgPaymentsCredentialOptionViewImpl r1 = (com.instagram.graphql.instagramschemagraphservices.ModularIgPaymentsCredentialOptionViewImpl) r1
            com.instagram.graphql.instagramschemagraphservices.ModularIgPaymentsCredentialOptionViewImpl$InlineNewPaypalBillingAgreement r1 = r1.A00()
            java.lang.String r5 = "title"
            java.lang.String r1 = r1.getStringValue(r5)
            if (r1 == 0) goto L_0x06d3
            com.facebook.pando.TreeJNI r1 = r9.reinterpret(r4)
            com.instagram.graphql.instagramschemagraphservices.ModularIgPaymentsCredentialOptionViewImpl r1 = (com.instagram.graphql.instagramschemagraphservices.ModularIgPaymentsCredentialOptionViewImpl) r1
            com.instagram.graphql.instagramschemagraphservices.ModularIgPaymentsCredentialOptionViewImpl$InlineNewPaypalBillingAgreement r1 = r1.A00()
            java.lang.String r3 = "url"
            java.lang.String r1 = r1.getStringValue(r3)
            if (r1 == 0) goto L_0x06d3
            X.6ge r6 = new X.6ge
            r6.<init>()
            com.facebook.pando.TreeJNI r1 = r9.reinterpret(r4)
            com.instagram.graphql.instagramschemagraphservices.ModularIgPaymentsCredentialOptionViewImpl r1 = (com.instagram.graphql.instagramschemagraphservices.ModularIgPaymentsCredentialOptionViewImpl) r1
            com.instagram.graphql.instagramschemagraphservices.ModularIgPaymentsCredentialOptionViewImpl$InlineNewPaypalBillingAgreement r1 = r1.A00()
            java.lang.String r1 = r1.getStringValue(r5)
            r6.A01 = r1
            com.facebook.pando.TreeJNI r1 = r9.reinterpret(r4)
            com.instagram.graphql.instagramschemagraphservices.ModularIgPaymentsCredentialOptionViewImpl r1 = (com.instagram.graphql.instagramschemagraphservices.ModularIgPaymentsCredentialOptionViewImpl) r1
            com.instagram.graphql.instagramschemagraphservices.ModularIgPaymentsCredentialOptionViewImpl$InlineNewPaypalBillingAgreement r1 = r1.A00()
            java.lang.String r1 = r1.getStringValue(r3)
            r6.A00 = r1
            goto L_0x05d5
        L_0x068f:
            X.LcF r3 = X.C40308LcF.A05
            com.facebook.pando.TreeJNI r1 = r9.reinterpret(r4)
            java.lang.Enum r1 = X.C86104wH.A0a(r1, r10, r5)
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L_0x05d5
            com.facebook.pando.TreeJNI r3 = r9.reinterpret(r4)
            java.lang.String r5 = "NewShopPayOption"
            boolean r1 = r3.isFulfilled(r5)
            if (r1 == 0) goto L_0x06d3
            java.lang.Class<com.instagram.graphql.instagramschemagraphservices.ModularIgPaymentsCredentialOptionViewImpl$InlineNewShopPayOption> r4 = com.instagram.graphql.instagramschemagraphservices.ModularIgPaymentsCredentialOptionViewImpl.InlineNewShopPayOption.class
            com.facebook.pando.TreeJNI r1 = r3.reinterpret(r4)
            if (r1 == 0) goto L_0x06d3
            com.facebook.pando.TreeJNI r1 = X.C86124wJ.A0U(r9, r4, r5)
            java.lang.String r3 = "title"
            java.lang.String r1 = r1.getStringValue(r3)
            if (r1 == 0) goto L_0x06d3
            X.6cf r2 = new X.6cf
            r2.<init>()
            com.facebook.pando.TreeJNI r1 = X.C86124wJ.A0U(r9, r4, r5)
            java.lang.String r1 = r1.getStringValue(r3)
            r2.A00 = r1
            X.AnonymousClass3ZT.A02(r1, r3)
            goto L_0x05d5
        L_0x06d3:
            X.6lX r4 = new X.6lX
            r4.<init>()
            com.google.common.collect.ImmutableList r3 = r23.build()
            r4.A04 = r3
            java.lang.String r1 = "paymentMethods"
            X.AnonymousClass3ZT.A02(r3, r1)
            if (r7 == 0) goto L_0x070f
            com.fbpay.hub.paymentmethods.api.FbPayNewCreditCardOption r1 = new com.fbpay.hub.paymentmethods.api.FbPayNewCreditCardOption
            r1.<init>((X.C104956ce) r7)
        L_0x06ea:
            r4.A01 = r1
            if (r6 == 0) goto L_0x070d
            com.fbpay.hub.paymentmethods.api.FbPayNewPayPalOption r1 = new com.fbpay.hub.paymentmethods.api.FbPayNewPayPalOption
            r1.<init>((X.C107376ge) r6)
        L_0x06f3:
            r4.A02 = r1
            if (r2 == 0) goto L_0x06fc
            X.6rK r8 = new X.6rK
            r8.<init>(r2)
        L_0x06fc:
            r4.A03 = r8
            java.lang.Class<com.instagram.graphql.instagramschemagraphservices.IgFbPayPaymentMethodsQueryResponseImpl$PaymentsAddressFormFieldsConfig> r3 = com.instagram.graphql.instagramschemagraphservices.IgFbPayPaymentMethodsQueryResponseImpl.PaymentsAddressFormFieldsConfig.class
            java.lang.String r2 = "payments_address_form_fields_config(query_params:{\"payment_type\":$payment_type})"
            com.facebook.pando.TreeJNI r1 = r0.getTreeValue(r2, r3)
            if (r1 == 0) goto L_0x073c
            com.facebook.pando.TreeJNI r1 = r0.getTreeValue(r2, r3)
            goto L_0x0711
        L_0x070d:
            r1 = r8
            goto L_0x06f3
        L_0x070f:
            r1 = r8
            goto L_0x06ea
        L_0x0711:
            r0 = -1659328637(0xffffffff9d18a783, float:-2.0203634E-21)
            java.lang.Class r0 = X.AnonymousClass6H6.A00(r0)     // Catch:{ ClassNotFoundException -> 0x071f }
            com.facebook.pando.TreeJNI r0 = r1.reinterpret(r0)     // Catch:{ ClassNotFoundException -> 0x071f }
            com.facebook.graphql.impls.FBPayAddressFormConfigFragmentImpl r0 = (com.facebook.graphql.impls.FBPayAddressFormConfigFragmentImpl) r0     // Catch:{ ClassNotFoundException -> 0x071f }
            goto L_0x0736
        L_0x071f:
            r0 = move-exception
            java.lang.RuntimeException r0 = X.C86114wI.A0k(r0)
            throw r0
        L_0x0725:
            X.6lX r4 = new X.6lX
            r4.<init>()
            com.google.common.collect.ImmutableList r1 = r23.build()
            r4.A04 = r1
            java.lang.String r0 = "paymentMethods"
            X.AnonymousClass3ZT.A02(r1, r0)
            goto L_0x073c
        L_0x0736:
            com.facebookpay.form.model.AddressFormFieldsConfig r0 = X.AnonymousClass7BH.A00(r0)
            r4.A00 = r0
        L_0x073c:
            X.6sK r0 = new X.6sK
            r0.<init>(r4)
            return r0
        L_0x0742:
            com.facebook.pando.TreeJNI r0 = (com.facebook.pando.TreeJNI) r0
            X.McB r2 = X.AnonymousClass6aK.A01
            r0.getClass()
            r1 = -192063486(0xfffffffff48d5802, float:-8.958726E31)
            java.lang.Class r1 = X.AnonymousClass6H6.A00(r1)     // Catch:{ ClassNotFoundException -> 0x0755 }
            com.facebook.pando.TreeJNI r0 = r0.reinterpret(r1)     // Catch:{ ClassNotFoundException -> 0x0755 }
            goto L_0x0786
        L_0x0755:
            r0 = move-exception
            java.lang.RuntimeException r0 = X.C86114wI.A0k(r0)
            throw r0
        L_0x075b:
            com.facebook.pando.TreeJNI r0 = (com.facebook.pando.TreeJNI) r0
            X.McB r2 = X.AnonymousClass6aK.A02
            r0.getClass()
            r1 = 2065636552(0x7b1f1cc8, float:8.2615895E35)
            java.lang.Class r1 = X.AnonymousClass6H6.A00(r1)     // Catch:{ ClassNotFoundException -> 0x076e }
            com.facebook.pando.TreeJNI r0 = r0.reinterpret(r1)     // Catch:{ ClassNotFoundException -> 0x076e }
            goto L_0x0786
        L_0x076e:
            r0 = move-exception
            java.lang.RuntimeException r0 = X.C86114wI.A0k(r0)
            throw r0
        L_0x0774:
            com.facebook.pando.TreeJNI r0 = (com.facebook.pando.TreeJNI) r0
            X.McB r2 = X.AnonymousClass6aK.A00
            r0.getClass()
            r1 = -1930157512(0xffffffff8cf42238, float:-3.7614747E-31)
            java.lang.Class r1 = X.AnonymousClass6H6.A00(r1)     // Catch:{ ClassNotFoundException -> 0x078b }
            com.facebook.pando.TreeJNI r0 = r0.reinterpret(r1)     // Catch:{ ClassNotFoundException -> 0x078b }
        L_0x0786:
            java.lang.Object r0 = r2.apply(r0)
            return r0
        L_0x078b:
            r0 = move-exception
            java.lang.RuntimeException r0 = X.C86114wI.A0k(r0)
            throw r0
        L_0x0791:
            r1.getClass()     // Catch:{ NullPointerException | JSONException -> 0x07aa }
            org.json.JSONObject r1 = X.C18250wR.A0j(r1)     // Catch:{ NullPointerException | JSONException -> 0x07aa }
            java.lang.String r0 = "num_current_attempts"
            r1.optInt(r0, r3)     // Catch:{ NullPointerException | JSONException -> 0x07aa }
            java.lang.String r0 = "num_remaining_attempts"
            int r2 = r1.optInt(r0, r2)     // Catch:{ NullPointerException | JSONException -> 0x07aa }
            java.lang.String r0 = "auth_factor_expired"
            boolean r3 = r1.optBoolean(r0, r3)     // Catch:{ NullPointerException | JSONException -> 0x07aa }
            goto L_0x07ab
        L_0x07aa:
            r4 = move-exception
        L_0x07ab:
            X.88W r0 = new X.88W
            r0.<init>(r4, r2, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.IDxFunctionShape362S0100000_2_I2.apply(java.lang.Object):java.lang.Object");
    }
}
