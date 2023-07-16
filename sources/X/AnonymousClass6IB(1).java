package X;

/* renamed from: X.6IB  reason: invalid class name */
public final class AnonymousClass6IB {
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0056, code lost:
        r3 = com.facebook.graphql.impls.CurrencyAmountImpl.class;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final com.facebookpay.incentives.model.ECPIncentive A00(com.facebook.graphql.impls.IncentiveItemInfoImpl r14) {
        /*
            X.66r r1 = X.C967866r.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r0 = "incentive_type"
            java.lang.Enum r0 = X.C86104wH.A0a(r14, r1, r0)
            X.66r r0 = (X.C967866r) r0
            if (r0 != 0) goto L_0x001d
            r0 = -1
        L_0x000d:
            r1 = 2
            r7 = 0
            java.lang.String r6 = "Required value was null."
            if (r0 == r1) goto L_0x0022
            r1 = 5
            if (r0 == r1) goto L_0x0022
            r1 = 1
            if (r0 == r1) goto L_0x0085
            r1 = 4
            if (r0 == r1) goto L_0x0085
            return r7
        L_0x001d:
            int r0 = r0.ordinal()
            goto L_0x000d
        L_0x0022:
            java.lang.String r0 = "incentive_id"
            java.lang.String r8 = r14.getStringValue(r0)
            if (r8 == 0) goto L_0x0107
            java.lang.String r9 = X.C86164wN.A0g(r14)
            if (r9 == 0) goto L_0x0102
            java.lang.String r0 = "subtitle"
            java.lang.String r10 = r14.getStringValue(r0)
            java.lang.String r0 = "is_best_offer"
            boolean r13 = r14.getBooleanValue(r0)
            java.lang.String r0 = "incentive_credential_id"
            java.lang.String r11 = r14.getStringValue(r0)
            if (r11 == 0) goto L_0x00fd
            java.lang.String r0 = "expiration_date_text"
            java.lang.String r12 = r14.getStringValue(r0)
            if (r12 == 0) goto L_0x00f8
            java.lang.Class<com.facebook.graphql.impls.IncentiveItemInfoImpl$DiscountAmount> r5 = com.facebook.graphql.impls.IncentiveItemInfoImpl.DiscountAmount.class
            java.lang.String r4 = "discount_amount"
            com.facebook.pando.TreeJNI r0 = r14.getTreeValue(r4, r5)
            if (r0 == 0) goto L_0x00f3
            java.lang.Class<com.facebook.graphql.impls.CurrencyAmountImpl> r3 = com.facebook.graphql.impls.CurrencyAmountImpl.class
            com.facebook.pando.TreeJNI r1 = r0.reinterpret(r3)
            if (r1 == 0) goto L_0x00f3
            java.lang.String r0 = "currency"
            java.lang.String r2 = r1.getStringValue(r0)
            if (r2 == 0) goto L_0x00f3
            com.facebook.pando.TreeJNI r0 = r14.getTreeValue(r4, r5)
            if (r0 == 0) goto L_0x00ee
            com.facebook.pando.TreeJNI r1 = r0.reinterpret(r3)
            if (r1 == 0) goto L_0x00ee
            java.lang.String r0 = "amount"
            java.lang.String r0 = r1.getStringValue(r0)
            if (r0 == 0) goto L_0x00ee
            com.facebookpay.common.models.CurrencyAmount r7 = new com.facebookpay.common.models.CurrencyAmount
            r7.<init>(r2, r0)
            com.facebookpay.incentives.model.ECPOnsiteOffer r6 = new com.facebookpay.incentives.model.ECPOnsiteOffer
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)
            goto L_0x00d7
        L_0x0085:
            java.lang.String r0 = "promo_code"
            java.lang.String r9 = r14.getStringValue(r0)
            if (r9 == 0) goto L_0x00e9
            java.lang.String r10 = X.C86164wN.A0g(r14)
            if (r10 == 0) goto L_0x00e4
            java.lang.String r0 = "incentive_id"
            java.lang.String r11 = r14.getStringValue(r0)
            java.lang.String r0 = "subtitle"
            java.lang.String r12 = r14.getStringValue(r0)
            java.lang.String r0 = "is_best_offer"
            java.lang.Boolean r8 = X.C18250wR.A0S(r14, r0)
            java.lang.String r0 = "expiration_date_text"
            java.lang.String r13 = r14.getStringValue(r0)
            java.lang.Class<com.facebook.graphql.impls.IncentiveItemInfoImpl$DiscountAmount> r1 = com.facebook.graphql.impls.IncentiveItemInfoImpl.DiscountAmount.class
            java.lang.String r0 = "discount_amount"
            com.facebook.pando.TreeJNI r1 = r14.getTreeValue(r0, r1)
            if (r1 == 0) goto L_0x00d2
            java.lang.Class<com.facebook.graphql.impls.CurrencyAmountImpl> r0 = com.facebook.graphql.impls.CurrencyAmountImpl.class
            com.facebook.pando.TreeJNI r2 = r1.reinterpret(r0)
            if (r2 == 0) goto L_0x00d2
            java.lang.String r0 = "currency"
            java.lang.String r1 = r2.getStringValue(r0)
            if (r1 == 0) goto L_0x00df
            java.lang.String r0 = "amount"
            java.lang.String r0 = r2.getStringValue(r0)
            if (r0 == 0) goto L_0x00da
            com.facebookpay.common.models.CurrencyAmount r7 = new com.facebookpay.common.models.CurrencyAmount
            r7.<init>(r1, r0)
        L_0x00d2:
            com.facebookpay.incentives.model.ECPOffsiteOffer r6 = new com.facebookpay.incentives.model.ECPOffsiteOffer
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)
        L_0x00d7:
            com.facebookpay.incentives.model.ECPIncentive r6 = (com.facebookpay.incentives.model.ECPIncentive) r6
            return r6
        L_0x00da:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r6)
            throw r0
        L_0x00df:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r6)
            throw r0
        L_0x00e4:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r6)
            throw r0
        L_0x00e9:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r6)
            throw r0
        L_0x00ee:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r6)
            throw r0
        L_0x00f3:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r6)
            throw r0
        L_0x00f8:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r6)
            throw r0
        L_0x00fd:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r6)
            throw r0
        L_0x0102:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r6)
            throw r0
        L_0x0107:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6IB.A00(com.facebook.graphql.impls.IncentiveItemInfoImpl):com.facebookpay.incentives.model.ECPIncentive");
    }
}
