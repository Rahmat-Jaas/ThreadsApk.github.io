package X;

/* renamed from: X.6IV  reason: invalid class name */
public final class AnonymousClass6IV {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v7, resolved type: java.lang.Object} */
    /* JADX WARNING: type inference failed for: r20v6, types: [com.facebookpay.expresscheckout.models.FulfillmentOption] */
    /* JADX WARNING: type inference failed for: r35v2, types: [com.facebookpay.expresscheckout.models.FulfillmentPickupOption] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final com.facebookpay.expresscheckout.models.TransactionInfo A00(com.facebookpay.offsite.models.message.PaymentDetails r40, java.lang.String r41, java.lang.String r42, java.lang.String r43) {
        /*
            r11 = r42
            r34 = r43
            r4 = r41
            r0 = 0
            r1 = r40
            X.C04220Ms.A0B(r1, r0)
            com.facebookpay.offsite.models.message.PaymentItem r2 = r1.total
            if (r2 == 0) goto L_0x02b9
            java.util.ArrayList<com.facebookpay.offsite.models.message.PaymentShippingOption> r8 = r1.shippingOptions
            r3 = 10
            r19 = 0
            if (r8 == 0) goto L_0x0070
            boolean r5 = X.C18250wR.A1K(r8)
            if (r5 == 0) goto L_0x0070
            java.lang.String r7 = r1.shippingOptionId
            if (r7 != 0) goto L_0x002a
            java.lang.Object r5 = r8.get(r0)
            com.facebookpay.offsite.models.message.PaymentShippingOption r5 = (com.facebookpay.offsite.models.message.PaymentShippingOption) r5
            java.lang.String r7 = r5.id
        L_0x002a:
            java.util.ArrayList r6 = X.AnonymousClass0wJ.A0x(r8, r3)
            java.util.Iterator r10 = r8.iterator()
        L_0x0032:
            boolean r5 = r10.hasNext()
            if (r5 == 0) goto L_0x0073
            java.lang.Object r9 = r10.next()
            com.facebookpay.offsite.models.message.PaymentShippingOption r9 = (com.facebookpay.offsite.models.message.PaymentShippingOption) r9
            X.C04220Ms.A0B(r9, r0)
            java.lang.String r15 = r9.id
            r8 = r4
            if (r41 != 0) goto L_0x0048
            java.lang.String r8 = "SHIPPING"
        L_0x0048:
            java.util.Locale r5 = java.util.Locale.ROOT
            X.C04220Ms.A08(r5)
            java.lang.String r5 = X.C18220wO.A0u(r5, r8)
            java.lang.Integer r14 = X.C116886xi.A00(r5)
            java.lang.String r8 = r9.label
            com.facebookpay.offsite.models.message.PaymentCurrencyAmount r5 = r9.amount
            com.facebookpay.common.models.CurrencyAmount r13 = X.C121717Hp.A00(r5)
            java.lang.String r5 = r9.secondaryLabel
            if (r5 != 0) goto L_0x0063
            java.lang.String r5 = ""
        L_0x0063:
            com.facebookpay.expresscheckout.models.ShippingOption r12 = new com.facebookpay.expresscheckout.models.ShippingOption
            r17 = r5
            r16 = r8
            r12.<init>(r13, r14, r15, r16, r17)
            r6.add(r12)
            goto L_0x0032
        L_0x0070:
            r17 = r19
            goto L_0x007a
        L_0x0073:
            com.facebookpay.expresscheckout.models.ShippingOptions r17 = new com.facebookpay.expresscheckout.models.ShippingOptions
            r5 = r17
            r5.<init>(r7, r6)
        L_0x007a:
            java.util.ArrayList<com.facebookpay.offsite.models.message.PaymentFulfillmentOption> r6 = r1.fulfillmentOptions
            if (r6 == 0) goto L_0x0173
            boolean r5 = X.C18250wR.A1K(r6)
            if (r5 == 0) goto L_0x0173
            java.lang.String r9 = r1.fulfillmentOptionId
            if (r9 != 0) goto L_0x0090
            java.lang.Object r5 = r6.get(r0)
            com.facebookpay.offsite.models.message.PaymentFulfillmentOption r5 = (com.facebookpay.offsite.models.message.PaymentFulfillmentOption) r5
            java.lang.String r9 = r5.id
        L_0x0090:
            java.util.ArrayList r8 = X.AnonymousClass0wJ.A0x(r6, r3)
            java.util.Iterator r16 = r6.iterator()
        L_0x0098:
            boolean r5 = r16.hasNext()
            if (r5 == 0) goto L_0x0176
            java.lang.Object r6 = r16.next()
            com.facebookpay.offsite.models.message.PaymentFulfillmentOption r6 = (com.facebookpay.offsite.models.message.PaymentFulfillmentOption) r6
            X.C04220Ms.A0B(r6, r0)
            boolean r5 = r6 instanceof com.facebookpay.offsite.models.message.PaymentPickupOption
            if (r5 == 0) goto L_0x0150
            java.lang.String r5 = r6.id
            r39 = r5
            java.lang.String r5 = r6.label
            r40 = r5
            com.facebookpay.offsite.models.message.PaymentCurrencyAmount r5 = r6.amount
            com.facebookpay.common.models.CurrencyAmount r36 = X.C121717Hp.A00(r5)
            java.util.Date r5 = r6.dateTimeRangeStart
            r41 = r5
            java.util.Date r5 = r6.dateTimeRangeEnd
            r42 = r5
            com.facebookpay.offsite.models.message.PaymentPickupOption r6 = (com.facebookpay.offsite.models.message.PaymentPickupOption) r6
            com.facebookpay.offsite.models.message.W3CShippingAddress r7 = r6.pickupLocationAddress
            X.C04220Ms.A0B(r7, r0)
            java.lang.String r5 = r7.organization
            r20 = r5
            java.lang.String r5 = r7.recipient
            r21 = r5
            java.util.ArrayList<java.lang.String> r5 = r7.addressLine
            if (r5 == 0) goto L_0x014d
            java.lang.Object r10 = X.AnonymousClass00J.A0G(r5, r0)
            java.lang.String r10 = (java.lang.String) r10
        L_0x00da:
            java.util.ArrayList<java.lang.String> r12 = r7.addressLine
            if (r12 == 0) goto L_0x014a
            r5 = 1
            java.lang.Object r5 = X.AnonymousClass00J.A0G(r12, r5)
            java.lang.String r5 = (java.lang.String) r5
        L_0x00e5:
            java.lang.String r15 = r7.city
            java.lang.String r14 = r7.region
            java.lang.String r13 = r7.country
            java.lang.String r12 = r7.postalCode
            r7 = 0
            r33 = 1
            com.facebookpay.shippingaddress.model.ShippingAddress r18 = new com.facebookpay.shippingaddress.model.ShippingAddress
            r25 = r14
            r26 = r13
            r27 = r12
            r28 = r7
            r29 = r0
            r30 = r0
            r31 = r0
            r32 = r0
            r22 = r10
            r23 = r5
            r24 = r15
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)
            boolean r12 = r6.pickupStoreAvailability
            com.facebookpay.offsite.models.message.PaymentDistance r10 = r6.pickupStoreDistance
            if (r10 == 0) goto L_0x012d
            double r5 = r10.value
            java.lang.String r10 = r10.unit
            java.util.Locale r7 = java.util.Locale.ROOT
            X.C04220Ms.A08(r7)
            java.lang.String r10 = X.C18220wO.A0u(r7, r10)
            java.lang.String r7 = "MILES"
            boolean r7 = r10.equals(r7)
            if (r7 == 0) goto L_0x013f
            java.lang.Integer r10 = X.AnonymousClass006.A00
        L_0x0128:
            com.facebookpay.common.models.Distance r7 = new com.facebookpay.common.models.Distance
            r7.<init>(r10, r5)
        L_0x012d:
            com.facebookpay.expresscheckout.models.FulfillmentPickupOption r5 = new com.facebookpay.expresscheckout.models.FulfillmentPickupOption
            r35 = r5
            r37 = r7
            r38 = r18
            r43 = r12
            r35.<init>(r36, r37, r38, r39, r40, r41, r42, r43)
        L_0x013a:
            r8.add(r5)
            goto L_0x0098
        L_0x013f:
            java.lang.String r7 = "KILOMETERS"
            boolean r7 = r10.equals(r7)
            if (r7 == 0) goto L_0x016e
            java.lang.Integer r10 = X.AnonymousClass006.A01
            goto L_0x0128
        L_0x014a:
            r5 = r19
            goto L_0x00e5
        L_0x014d:
            r10 = r19
            goto L_0x00da
        L_0x0150:
            java.lang.String r12 = r6.id
            java.lang.String r10 = r6.label
            com.facebookpay.offsite.models.message.PaymentCurrencyAmount r5 = r6.amount
            com.facebookpay.common.models.CurrencyAmount r21 = X.C121717Hp.A00(r5)
            java.util.Date r7 = r6.dateTimeRangeStart
            java.util.Date r6 = r6.dateTimeRangeEnd
            com.facebookpay.expresscheckout.models.FulfillmentOption r5 = new com.facebookpay.expresscheckout.models.FulfillmentOption
            r25 = r6
            r20 = r5
            r22 = r12
            r23 = r10
            r24 = r7
            r20.<init>(r21, r22, r23, r24, r25)
            goto L_0x013a
        L_0x016e:
            java.lang.IllegalArgumentException r0 = X.C18190wL.A0a(r10)
            throw r0
        L_0x0173:
            r7 = r19
            goto L_0x017b
        L_0x0176:
            com.facebookpay.expresscheckout.models.FulfillmentOptions r7 = new com.facebookpay.expresscheckout.models.FulfillmentOptions
            r7.<init>(r9, r8)
        L_0x017b:
            if (r4 != 0) goto L_0x017f
            java.lang.String r4 = "SHIPPING"
        L_0x017f:
            java.util.Locale r5 = java.util.Locale.ROOT
            X.C04220Ms.A08(r5)
            java.lang.String r4 = X.C18220wO.A0u(r5, r4)
            java.lang.Integer r31 = X.C116886xi.A00(r4)
            if (r34 != 0) goto L_0x019e
            java.util.Locale r4 = java.util.Locale.getDefault()
            java.lang.String r34 = r4.getCountry()
            if (r34 != 0) goto L_0x019e
            java.util.Locale r4 = java.util.Locale.US
            java.lang.String r34 = r4.getCountry()
        L_0x019e:
            com.facebookpay.offsite.models.message.PaymentCurrencyAmount r4 = r2.amount
            java.lang.String r12 = r4.currency
            java.util.ArrayList<com.facebookpay.offsite.models.message.SummaryPaymentItem> r6 = r1.summaryItems
            java.util.ArrayList r4 = X.AnonymousClass0wJ.A0x(r6, r3)
            java.util.Iterator r10 = r6.iterator()
        L_0x01ac:
            boolean r6 = r10.hasNext()
            if (r6 == 0) goto L_0x01f3
            java.lang.Object r8 = r10.next()
            com.facebookpay.offsite.models.message.SummaryPaymentItem r8 = (com.facebookpay.offsite.models.message.SummaryPaymentItem) r8
            com.facebookpay.offsite.models.message.PaymentCurrencyAmount r6 = r8.amount
            com.facebookpay.common.models.CurrencyAmount r21 = X.C121717Hp.A00(r6)
            java.lang.String r9 = r8.label
            java.lang.String r6 = r8.summaryItemType
            X.C04220Ms.A0B(r6, r0)
            java.util.Map r8 = X.C973068v.A01
            java.lang.Object r8 = r8.get(r6)
            X.68v r8 = (X.C973068v) r8
            if (r8 == 0) goto L_0x01e8
            X.23V r22 = X.AnonymousClass23V.FINAL
            com.facebookpay.expresscheckout.models.PriceInfo r6 = new com.facebookpay.expresscheckout.models.PriceInfo
            r20 = r6
            r23 = r8
            r24 = r19
            r25 = r9
            r26 = r19
            r27 = r19
            r28 = r19
            r20.<init>(r21, r22, r23, r24, r25, r26, r27, r28)
            r4.add(r6)
            goto L_0x01ac
        L_0x01e8:
            java.lang.String r0 = "PriceInfoType is not found for identifier => "
            java.lang.String r0 = X.AnonymousClass00U.A0L(r0, r6)
            java.lang.IllegalArgumentException r0 = X.C18190wL.A0a(r0)
            throw r0
        L_0x01f3:
            com.facebookpay.offsite.models.message.PaymentCurrencyAmount r6 = r2.amount
            com.facebookpay.common.models.CurrencyAmount r21 = X.C121717Hp.A00(r6)
            java.lang.String r6 = r2.label
            X.68v r23 = X.C973068v.TOTAL
            X.23V r22 = X.AnonymousClass23V.ESTIMATED
            r35 = 0
            com.facebookpay.expresscheckout.models.PriceInfo r2 = new com.facebookpay.expresscheckout.models.PriceInfo
            r20 = r2
            r24 = r19
            r25 = r6
            r26 = r19
            r27 = r19
            r28 = r19
            r20.<init>(r21, r22, r23, r24, r25, r26, r27, r28)
            r4.add(r2)
            java.util.ArrayList<com.facebookpay.offsite.models.message.PaymentItem> r6 = r1.displayItems
            java.util.ArrayList r2 = X.AnonymousClass0wJ.A0x(r6, r3)
            java.util.Iterator r13 = r6.iterator()
        L_0x021f:
            boolean r6 = r13.hasNext()
            if (r6 == 0) goto L_0x0253
            java.lang.Object r6 = r13.next()
            com.facebookpay.offsite.models.message.PaymentItem r6 = (com.facebookpay.offsite.models.message.PaymentItem) r6
            X.C04220Ms.A0B(r6, r0)
            com.facebookpay.offsite.models.message.PaymentCurrencyAmount r8 = r6.amount
            com.facebookpay.common.models.CurrencyAmount r21 = X.C121717Hp.A00(r8)
            java.lang.String r10 = r6.label
            X.23V r22 = X.AnonymousClass23V.FINAL
            java.lang.String r8 = r6.quantity
            java.lang.Integer r24 = X.AnonymousClass4n2.A01(r8)
            java.lang.String r9 = r6.imageURI
            java.lang.String r8 = r6.secondaryLabel
            com.facebookpay.expresscheckout.models.PriceInfo r6 = new com.facebookpay.expresscheckout.models.PriceInfo
            r20 = r6
            r25 = r10
            r27 = r8
            r28 = r9
            r20.<init>(r21, r22, r23, r24, r25, r26, r27, r28)
            r2.add(r6)
            goto L_0x021f
        L_0x0253:
            java.util.List<com.facebookpay.offsite.models.message.PaymentOffer> r0 = r1.offers
            if (r0 == 0) goto L_0x0271
            java.util.ArrayList r6 = X.AnonymousClass0wJ.A0x(r0, r3)
            java.util.Iterator r3 = r0.iterator()
        L_0x025f:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0275
            java.lang.Object r0 = r3.next()
            com.facebookpay.offsite.models.message.PaymentOffer r0 = (com.facebookpay.offsite.models.message.PaymentOffer) r0
            java.lang.String r0 = r0.code
            r6.add(r0)
            goto L_0x025f
        L_0x0271:
            java.util.ArrayList r6 = X.AnonymousClass0wJ.A0v()
        L_0x0275:
            com.facebookpay.expresscheckout.models.PromoCodeList r3 = new com.facebookpay.expresscheckout.models.PromoCodeList
            r3.<init>(r6)
            X.0ZV r38 = X.AnonymousClass0ZV.A00
            if (r11 != 0) goto L_0x0280
            java.lang.String r11 = "SHIPPING"
        L_0x0280:
            java.lang.String r0 = X.C18220wO.A0u(r5, r11)
            java.lang.Integer r32 = X.C116876xh.A00(r0)
            com.facebookpay.offsite.models.message.PaymentPickupInfo r0 = r1.pickupInfo
            if (r0 == 0) goto L_0x02a5
            java.lang.String r8 = r0.pickupRadiusZipCode
            java.lang.String r6 = r0.pickupName
            java.lang.String r5 = r0.pickupEmail
            java.lang.String r1 = r0.pickupPhone
            java.lang.String r0 = r0.pickupNotes
            com.facebookpay.expresscheckout.models.PickupInfo r19 = new com.facebookpay.expresscheckout.models.PickupInfo
            r20 = r8
            r21 = r6
            r22 = r5
            r23 = r1
            r24 = r0
            r19.<init>(r20, r21, r22, r23, r24)
        L_0x02a5:
            com.facebookpay.expresscheckout.models.TransactionInfo r26 = new com.facebookpay.expresscheckout.models.TransactionInfo
            r28 = r19
            r29 = r3
            r30 = r17
            r33 = r12
            r36 = r4
            r37 = r2
            r27 = r7
            r26.<init>(r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38)
            return r26
        L_0x02b9:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0b()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6IV.A00(com.facebookpay.offsite.models.message.PaymentDetails, java.lang.String, java.lang.String, java.lang.String):com.facebookpay.expresscheckout.models.TransactionInfo");
    }
}
