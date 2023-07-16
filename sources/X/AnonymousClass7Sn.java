package X;

/* renamed from: X.7Sn  reason: invalid class name */
public final class AnonymousClass7Sn implements C142618fJ {
    public static final AnonymousClass7Sn A00 = new AnonymousClass7Sn();

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004a, code lost:
        if (r11 != null) goto L_0x00c0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00eb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object apply(java.lang.Object r15) {
        /*
            r14 = this;
            com.facebook.pando.TreeJNI r15 = (com.facebook.pando.TreeJNI) r15
            r0 = 0
            X.C04220Ms.A0B(r15, r0)
            java.lang.Class<com.facebook.graphql.impls.PreprocessingMutationResponseImpl$PaymentPreprocessingMutation> r4 = com.facebook.graphql.impls.PreprocessingMutationResponseImpl.PaymentPreprocessingMutation.class
            java.lang.String r3 = "payment_preprocessing_mutation(input:$input)"
            com.facebook.pando.TreeJNI r1 = r15.getTreeValue(r3, r4)
            r9 = 0
            if (r1 == 0) goto L_0x00cd
            java.lang.String r0 = "order_id"
            java.lang.String r10 = r1.getStringValue(r0)
        L_0x0017:
            java.lang.String r5 = ""
            if (r10 != 0) goto L_0x001c
            r10 = r5
        L_0x001c:
            com.facebook.pando.TreeJNI r2 = r15.getTreeValue(r3, r4)
            if (r2 == 0) goto L_0x00cb
            java.lang.Class<com.facebook.graphql.impls.PreprocessingMutationResponseImpl$PaymentPreprocessingMutation$PaymentAvailabilityResponse> r1 = com.facebook.graphql.impls.PreprocessingMutationResponseImpl.PaymentPreprocessingMutation.PaymentAvailabilityResponse.class
            java.lang.String r0 = "payment_availability_response"
            com.google.common.collect.ImmutableList r0 = r2.getTreeList(r0, r1)
            if (r0 == 0) goto L_0x00cb
            java.lang.Object r2 = X.AnonymousClass00J.A0D(r0)
            com.facebook.pando.TreeJNI r2 = (com.facebook.pando.TreeJNI) r2
            if (r2 == 0) goto L_0x00cb
            java.lang.Class<com.facebook.graphql.impls.PreprocessingMutationResponseImpl$PaymentPreprocessingMutation$PaymentAvailabilityResponse$ReceiverInfo> r1 = com.facebook.graphql.impls.PreprocessingMutationResponseImpl.PaymentPreprocessingMutation.PaymentAvailabilityResponse.ReceiverInfo.class
            java.lang.String r0 = "receiver_info"
            com.facebook.pando.TreeJNI r1 = r2.getTreeValue(r0, r1)
            if (r1 == 0) goto L_0x00cb
            java.lang.Class<com.facebook.graphql.impls.FBPayReceiverInfoImpl> r0 = com.facebook.graphql.impls.FBPayReceiverInfoImpl.class
            com.facebook.pando.TreeJNI r1 = r1.reinterpret(r0)
            if (r1 == 0) goto L_0x004c
            java.lang.String r11 = X.C18220wO.A0m(r1)
            if (r11 != 0) goto L_0x00c0
        L_0x004c:
            r11 = r5
            if (r1 != 0) goto L_0x00c0
            r12 = r9
            r13 = r9
        L_0x0051:
            com.facebook.pando.TreeJNI r2 = r15.getTreeValue(r3, r4)
            if (r2 == 0) goto L_0x00e5
            java.lang.Class<com.facebook.graphql.impls.PreprocessingMutationResponseImpl$PaymentPreprocessingMutation$PaymentAvailabilityResponse> r1 = com.facebook.graphql.impls.PreprocessingMutationResponseImpl.PaymentPreprocessingMutation.PaymentAvailabilityResponse.class
            java.lang.String r0 = "payment_availability_response"
            com.google.common.collect.ImmutableList r0 = r2.getTreeList(r0, r1)
            if (r0 == 0) goto L_0x00e5
            java.lang.Object r2 = X.AnonymousClass00J.A0D(r0)
            com.facebook.pando.TreeJNI r2 = (com.facebook.pando.TreeJNI) r2
            if (r2 == 0) goto L_0x00e5
            java.lang.Class<com.facebook.graphql.impls.PreprocessingMutationResponseImpl$PaymentPreprocessingMutation$PaymentAvailabilityResponse$LoggingPolicy> r1 = com.facebook.graphql.impls.PreprocessingMutationResponseImpl.PaymentPreprocessingMutation.PaymentAvailabilityResponse.LoggingPolicy.class
            java.lang.String r0 = "logging_policy"
            com.facebook.pando.TreeJNI r1 = r2.getTreeValue(r0, r1)
            if (r1 == 0) goto L_0x00e5
            java.lang.Class<com.facebook.graphql.impls.FBPayLoggingPolicyImpl> r0 = com.facebook.graphql.impls.FBPayLoggingPolicyImpl.class
            com.facebook.pando.TreeJNI r5 = r1.reinterpret(r0)
            if (r5 == 0) goto L_0x00e5
            java.util.ArrayList r4 = X.AnonymousClass0wJ.A0v()
            java.lang.Class<com.facebook.graphql.impls.FBPayLoggingPolicyImpl$ClientSuppressionPolicy> r1 = com.facebook.graphql.impls.FBPayLoggingPolicyImpl.ClientSuppressionPolicy.class
            java.lang.String r0 = "client_suppression_policy"
            com.google.common.collect.ImmutableList r0 = X.C18230wP.A0P(r5, r1, r0)
            java.util.ArrayList r6 = X.AnonymousClass0wJ.A0w(r0)
            java.util.Iterator r9 = r0.iterator()
        L_0x008f:
            boolean r0 = r9.hasNext()
            java.lang.String r8 = "Required value was null."
            if (r0 == 0) goto L_0x00d5
            com.facebook.pando.TreeJNI r7 = X.C18210wN.A0G(r9)
            java.lang.String r0 = "event_name"
            java.lang.String r3 = r7.getStringValue(r0)
            X.LcA r1 = X.C40304LcA.A01
            java.lang.String r0 = "payload_field"
            java.lang.Enum r2 = X.C86104wH.A0a(r7, r1, r0)
            X.LcA r2 = (X.C40304LcA) r2
            X.67J r1 = X.AnonymousClass67J.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r0 = "suppression_mode"
            java.lang.Enum r1 = X.C86104wH.A0a(r7, r1, r0)
            X.67J r1 = (X.AnonymousClass67J) r1
            if (r1 == 0) goto L_0x00d0
            com.fbpay.logging.ClientSuppressionPolicy r0 = new com.fbpay.logging.ClientSuppressionPolicy
            r0.<init>(r1, r2, r3)
            r6.add(r0)
            goto L_0x008f
        L_0x00c0:
            java.lang.String r12 = X.C18220wO.A0l(r1)
            java.lang.String r0 = "image"
            java.lang.String r13 = r1.getStringValue(r0)
            goto L_0x0051
        L_0x00cb:
            r1 = r9
            goto L_0x004c
        L_0x00cd:
            r10 = r9
            goto L_0x0017
        L_0x00d0:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r8)
            throw r0
        L_0x00d5:
            r4.addAll(r6)
            java.lang.String r0 = "logging_policy_product"
            java.lang.String r0 = r5.getStringValue(r0)
            if (r0 == 0) goto L_0x00eb
            com.fbpay.logging.LoggingPolicy r9 = new com.fbpay.logging.LoggingPolicy
            r9.<init>(r0, r4)
        L_0x00e5:
            X.76e r8 = new X.76e
            r8.<init>(r9, r10, r11, r12, r13)
            return r8
        L_0x00eb:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7Sn.apply(java.lang.Object):java.lang.Object");
    }
}
