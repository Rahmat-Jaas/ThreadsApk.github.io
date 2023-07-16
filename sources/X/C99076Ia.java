package X;

/* renamed from: X.6Ia  reason: invalid class name and case insensitive filesystem */
public final class C99076Ia {
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0070, code lost:
        if (r1 != false) goto L_0x005d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final com.facebookpay.payments.model.ContainerPttPayload A00(X.C111166mt r14) {
        /*
            com.facebookpay.expresscheckout.models.TransactionInfo r0 = r14.A01
            com.facebookpay.common.models.CurrencyAmount r5 = X.C122157Kv.A03(r0)
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r0 = r14.A00
            com.facebookpay.expresscheckout.models.ECPPaymentConfiguration r1 = r0.A03
            if (r1 == 0) goto L_0x0012
            X.68b r0 = r1.A02
            java.lang.String r6 = r0.A00
            if (r6 != 0) goto L_0x0016
        L_0x0012:
            X.68b r0 = X.C971368b.LIVE
            java.lang.String r6 = r0.A00
        L_0x0016:
            r13 = 0
            if (r1 == 0) goto L_0x0073
            java.lang.String r7 = r1.A04
            java.lang.String r9 = r1.A03
            if (r9 == 0) goto L_0x0073
            java.lang.String r8 = r14.A06
            com.facebookpay.paymentmethod.model.PaymentMethod r3 = r14.A02
            java.lang.String r4 = r3.Aal()
            r0 = 100
            java.math.BigDecimal r2 = new java.math.BigDecimal
            r2.<init>(r0)
            java.lang.String r1 = r5.A01
            java.math.BigDecimal r0 = new java.math.BigDecimal
            r0.<init>(r1)
            java.math.BigDecimal r0 = r2.multiply(r0)
            int r2 = r0.intValue()
            java.lang.String r1 = r5.A00
            com.facebookpay.payments.model.PayComponent r0 = new com.facebookpay.payments.model.PayComponent
            r0.<init>(r4, r2, r1)
            java.util.List r10 = X.C18180wK.A0n(r0)
            java.lang.String r11 = r3.Aal()
            boolean r1 = r3 instanceof com.facebookpay.paymentmethod.model.CreditCard
            if (r1 == 0) goto L_0x006f
            r0 = r3
            com.facebookpay.paymentmethod.model.CreditCard r0 = (com.facebookpay.paymentmethod.model.CreditCard) r0
            if (r0 == 0) goto L_0x006f
            com.facebook.graphql.impls.CreditCardCredentialImpl r1 = r0.A02
            java.lang.String r0 = "expiry_month"
            java.lang.String r12 = r1.getStringValue(r0)
        L_0x005d:
            com.facebookpay.paymentmethod.model.CreditCard r3 = (com.facebookpay.paymentmethod.model.CreditCard) r3
            if (r3 == 0) goto L_0x0069
            com.facebook.graphql.impls.CreditCardCredentialImpl r1 = r3.A02
            java.lang.String r0 = "expiry_year"
            java.lang.String r13 = r1.getStringValue(r0)
        L_0x0069:
            com.facebookpay.payments.model.ContainerPttPayload r5 = new com.facebookpay.payments.model.ContainerPttPayload
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13)
            return r5
        L_0x006f:
            r12 = r13
            if (r1 == 0) goto L_0x0069
            goto L_0x005d
        L_0x0073:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0b()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C99076Ia.A00(X.6mt):com.facebookpay.payments.model.ContainerPttPayload");
    }
}
