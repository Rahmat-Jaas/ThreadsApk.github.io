package X;

/* renamed from: X.80v  reason: invalid class name and case insensitive filesystem */
public final class C1359680v implements Runnable {
    public final /* synthetic */ C128557jn A00;
    public final /* synthetic */ String A01;

    public C1359680v(C128557jn r1, String str) {
        this.A00 = r1;
        this.A01 = str;
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0145  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0148  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r11 = this;
            X.7jn r0 = r11.A00
            X.0Oa r0 = r0.A06
            com.facebookpay.offsite.base.CheckoutHandler r4 = X.C86164wN.A0P(r0)
            com.facebookpay.offsite.models.message.GsonUtils r3 = com.facebookpay.offsite.models.message.GsonUtils.INSTANCE
            java.lang.String r2 = r11.A01
            com.facebookpay.offsite.base.CheckoutHandler r0 = X.C86164wN.A0P(r0)
            X.56r r0 = r0.A0T
            X.7Kx r0 = X.C86104wH.A0R(r0)
            if (r0 == 0) goto L_0x015e
            java.lang.Object r0 = r0.A01
            com.facebookpay.expresscheckout.models.TransactionInfo r0 = (com.facebookpay.expresscheckout.models.TransactionInfo) r0
            if (r0 == 0) goto L_0x015e
            java.lang.Integer r0 = r0.A04
            if (r0 == 0) goto L_0x015e
            int r1 = r0.intValue()
            r0 = 1
            if (r1 != r0) goto L_0x015a
            java.lang.String r0 = "PICKUP"
        L_0x002b:
            com.facebookpay.offsite.models.message.PaymentDetailsUpdatedResponse r6 = r3.toOffsitePaymentUpdatedMsg(r2, r0)
            r0 = 0
            X.C04220Ms.A0B(r6, r0)
            r2 = 0
            r7 = 1
            r4.A0J(r2)
            java.util.concurrent.atomic.AtomicReference r1 = r4.A0Y
            java.lang.String r0 = "0"
            r1.set(r0)
            X.56r r5 = r4.A0T
            X.7Kx r0 = X.C86104wH.A0R(r5)
            if (r0 == 0) goto L_0x0157
            java.lang.Object r3 = r0.A01
            com.facebookpay.expresscheckout.models.TransactionInfo r3 = (com.facebookpay.expresscheckout.models.TransactionInfo) r3
        L_0x004b:
            com.facebookpay.offsite.models.message.PaymentDetailsUpdate r0 = r6.content
            if (r0 == 0) goto L_0x0154
            com.facebookpay.offsite.models.message.PaymentDetails r9 = r0.paymentDetails
            if (r9 == 0) goto L_0x0154
            if (r3 == 0) goto L_0x0150
            java.lang.Integer r0 = r3.A05
            if (r0 == 0) goto L_0x0150
            int r1 = r0.intValue()
            r0 = 2
            if (r1 == r0) goto L_0x014c
            if (r1 != r7) goto L_0x0150
            java.lang.String r8 = "DELIVERY"
        L_0x0064:
            if (r3 == 0) goto L_0x0148
            java.lang.Integer r0 = r3.A04
            if (r0 == 0) goto L_0x0148
            int r0 = r0.intValue()
            if (r0 != r7) goto L_0x0148
            java.lang.String r1 = "PICKUP"
        L_0x0072:
            if (r3 == 0) goto L_0x0145
            java.lang.String r0 = r3.A06
        L_0x0076:
            com.facebookpay.expresscheckout.models.TransactionInfo r8 = X.AnonymousClass6IV.A00(r9, r8, r1, r0)
        L_0x007a:
            com.facebookpay.offsite.models.message.PaymentDetailsUpdate r0 = r6.content
            if (r0 == 0) goto L_0x008a
            java.util.List r0 = com.facebookpay.offsite.models.message.MessageParamsKt.getErrors(r0)
            if (r0 == 0) goto L_0x008a
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x00df
        L_0x008a:
            com.facebookpay.offsite.models.message.PaymentError r0 = r6.error
            if (r0 != 0) goto L_0x00df
            X.7Kx r0 = X.AnonymousClass7Kx.A0A(r8)
        L_0x0092:
            r5.A0H(r0)
            if (r7 == 0) goto L_0x00dc
            X.68R r3 = X.AnonymousClass68R.CLIENT_LOAD_OFFSITEPAYMENTDETAILSCHANGED_SUCCESS
        L_0x0099:
            java.lang.String r7 = com.facebookpay.offsite.base.CheckoutHandler.A03(r4)
            java.lang.String r5 = r4.A0B
            if (r5 == 0) goto L_0x01b9
            java.util.Map r1 = r4.A0G
            r0 = 1
            X.C18180wK.A1P(r7, r0, r1)
            java.util.LinkedHashMap r2 = X.C18220wO.A0y()
            r2.putAll(r1)
            X.C86134wK.A1S(r5, r7, r2)
            com.facebookpay.offsite.models.message.PaymentDetailsUpdate r0 = r6.content
            r8 = 10
            r5 = 0
            if (r0 == 0) goto L_0x0161
            com.facebookpay.offsite.models.message.PaymentDetailsUpdatedError r0 = r0.shippingAddressErrors
            if (r0 == 0) goto L_0x0161
            java.util.Collection r0 = r0.values()
            if (r0 == 0) goto L_0x0161
            java.util.ArrayList r7 = X.AnonymousClass0wJ.A0x(r0, r8)
            java.util.Iterator r1 = r0.iterator()
        L_0x00ca:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0162
            java.lang.Object r0 = r1.next()
            com.facebookpay.offsite.models.message.PaymentDataError r0 = (com.facebookpay.offsite.models.message.PaymentDataError) r0
            com.facebookpay.offsite.models.message.PaymentDataErrorReason r0 = r0.reason
            X.C18210wN.A1O(r0, r7)
            goto L_0x00ca
        L_0x00dc:
            X.68R r3 = X.AnonymousClass68R.CLIENT_LOAD_OFFSITEPAYMENTDETAILSCHANGED_FAIL
            goto L_0x0099
        L_0x00df:
            r7 = 0
            if (r8 != 0) goto L_0x00e9
            if (r3 == 0) goto L_0x00e9
            X.7Kx r0 = X.AnonymousClass7Kx.A0A(r3)
            goto L_0x0092
        L_0x00e9:
            com.facebookpay.offsite.models.message.PaymentError r0 = r6.error
            if (r0 == 0) goto L_0x00f9
            java.lang.String r1 = r0.message
            X.5gn r0 = new X.5gn
            r0.<init>(r1)
            X.7Kx r0 = X.AnonymousClass7Kx.A0B(r2, r0)
            goto L_0x0092
        L_0x00f9:
            com.facebookpay.offsite.models.message.PaymentDetailsUpdate r0 = r6.content
            if (r0 == 0) goto L_0x013a
            java.util.List r0 = com.facebookpay.offsite.models.message.MessageParamsKt.getErrors(r0)
            if (r0 == 0) goto L_0x013a
            java.util.ArrayList r9 = X.AnonymousClass0wJ.A0w(r0)
            java.util.Iterator r10 = r0.iterator()
        L_0x010b:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x0136
            java.lang.Object r1 = r10.next()
            com.facebookpay.offsite.models.message.PaymentDataError r1 = (com.facebookpay.offsite.models.message.PaymentDataError) r1
            com.facebookpay.offsite.models.message.PaymentDataErrorField r0 = r1.field
            if (r0 == 0) goto L_0x0134
            java.lang.String r3 = r0.toString()
        L_0x011f:
            com.facebookpay.offsite.models.message.PaymentDataErrorReason r0 = r1.reason
            java.lang.String r0 = r0.name()
            java.lang.Integer r2 = X.AnonymousClass7BF.A00(r0)
            java.lang.String r1 = r1.message
            X.6j2 r0 = new X.6j2
            r0.<init>(r3, r2, r1)
            r9.add(r0)
            goto L_0x010b
        L_0x0134:
            r3 = 0
            goto L_0x011f
        L_0x0136:
            java.util.List r2 = X.AnonymousClass00J.A0N(r9)
        L_0x013a:
            X.88f r0 = new X.88f
            r0.<init>(r2)
            X.7Kx r0 = X.AnonymousClass7Kx.A0B(r8, r0)
            goto L_0x0092
        L_0x0145:
            r0 = r2
            goto L_0x0076
        L_0x0148:
            java.lang.String r1 = "SHIPPING"
            goto L_0x0072
        L_0x014c:
            java.lang.String r8 = "PICKUP"
            goto L_0x0064
        L_0x0150:
            java.lang.String r8 = "SHIPPING"
            goto L_0x0064
        L_0x0154:
            r8 = r2
            goto L_0x007a
        L_0x0157:
            r3 = r2
            goto L_0x004b
        L_0x015a:
            java.lang.String r0 = "SHIPPING"
            goto L_0x002b
        L_0x015e:
            r0 = 0
            goto L_0x002b
        L_0x0161:
            r7 = r5
        L_0x0162:
            com.facebookpay.offsite.models.message.PaymentDetailsUpdate r0 = r6.content
            if (r0 == 0) goto L_0x018a
            com.facebookpay.offsite.models.message.PaymentDetailsUpdatedError r0 = r0.offerCodeErrors
            if (r0 == 0) goto L_0x018a
            java.util.Collection r0 = r0.values()
            if (r0 == 0) goto L_0x018a
            java.util.ArrayList r5 = X.AnonymousClass0wJ.A0x(r0, r8)
            java.util.Iterator r1 = r0.iterator()
        L_0x0178:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x018a
            java.lang.Object r0 = r1.next()
            com.facebookpay.offsite.models.message.PaymentDataError r0 = (com.facebookpay.offsite.models.message.PaymentDataError) r0
            com.facebookpay.offsite.models.message.PaymentDataErrorReason r0 = r0.reason
            X.C18210wN.A1O(r0, r5)
            goto L_0x0178
        L_0x018a:
            java.util.ArrayList r1 = X.AnonymousClass0wJ.A0v()
            if (r7 == 0) goto L_0x0193
            r1.addAll(r7)
        L_0x0193:
            if (r5 == 0) goto L_0x0198
            r1.addAll(r5)
        L_0x0198:
            com.facebookpay.offsite.models.message.PaymentError r0 = r6.error
            if (r0 == 0) goto L_0x01a1
            java.lang.String r0 = r0.code
            r1.add(r0)
        L_0x01a1:
            java.lang.String r1 = r1.toString()
            java.lang.String r0 = "ERROR_CODE"
            r2.put(r0, r1)
            long r0 = r6.timeStamp
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "REQUEST_TIMESTAMP"
            r2.put(r0, r1)
            r4.A0I(r3, r2)
            return
        L_0x01b9:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0b()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1359680v.run():void");
    }
}
