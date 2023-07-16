package X;

import com.facebookpay.offsite.models.message.PaymentRequest;

/* renamed from: X.80t  reason: invalid class name and case insensitive filesystem */
public final class C1359480t implements Runnable {
    public final /* synthetic */ C128557jn A00;
    public final /* synthetic */ PaymentRequest A01;

    public C1359480t(C128557jn r1, PaymentRequest paymentRequest) {
        this.A00 = r1;
        this.A01 = paymentRequest;
    }

    /* JADX WARNING: type inference failed for: r0v99 */
    /* JADX WARNING: type inference failed for: r0v102 */
    /* JADX WARNING: type inference failed for: r0v103, types: [android.os.Parcelable, X.0ZU] */
    /* JADX WARNING: type inference failed for: r0v116 */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01b9, code lost:
        if (X.C86154wM.A0B(r1.A0W.A09).getBoolean("proactive_checkout_should_stop_showing_banner", false) != false) goto L_0x01bb;
     */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x04a9  */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x053d  */
    /* JADX WARNING: Removed duplicated region for block: B:190:0x0567  */
    /* JADX WARNING: Removed duplicated region for block: B:215:0x0701  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r71 = this;
            r1 = r71
            X.7jn r0 = r1.A00
            r18 = r0
            r3 = r18
            X.5ix r3 = (X.C92625ix) r3
            X.L3B r0 = r3.A01
            X.IF5 r0 = r0.BHU()
            if (r0 == 0) goto L_0x0715
            java.lang.String r21 = r0.A03()
            if (r21 == 0) goto L_0x0715
            com.facebookpay.offsite.models.message.PaymentRequest r2 = r1.A01
            r0 = r18
            X.0Oa r0 = r0.A06
            r70 = r0
            com.facebookpay.offsite.base.CheckoutHandler r1 = X.C86164wN.A0P(r70)
            r0 = r18
            X.8mf r0 = r0.A00
            java.lang.String r6 = r0.B6A()
            java.util.ArrayList r0 = r3.A05
            java.util.List r26 = X.AnonymousClass7KI.A03(r0)
            r19 = 0
            r25 = 1
            r13 = 2
            X.C04220Ms.A0B(r6, r13)
            com.facebookpay.offsite.models.message.PaymentRequestContent r0 = r2.content
            r1.A0J(r0)
            java.util.LinkedHashMap r14 = X.C18220wO.A0y()
            java.lang.String r3 = com.facebookpay.offsite.base.CheckoutHandler.A03(r1)
            java.lang.String r0 = r1.A0B
            java.lang.String r20 = "Required value was null."
            if (r0 == 0) goto L_0x0710
            java.util.Map r0 = X.C121537Gp.A01(r2, r3, r0)
            long r3 = r2.timeStamp
            java.util.LinkedHashMap r5 = X.C18220wO.A0y()
            r5.putAll(r0)
            com.facebookpay.offsite.models.message.PaymentRequestContent r0 = r2.content
            com.facebookpay.offsite.models.message.PaymentOptions r0 = r0.paymentOptions
            boolean r0 = r0.proactive
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "PROACTIVE_CHECKOUT"
            r5.put(r0, r7)
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            java.lang.String r0 = "REQUEST_TIMESTAMP"
            r5.put(r0, r3)
            java.util.ArrayList r3 = X.AnonymousClass0wJ.A0v()
            com.facebookpay.offsite.models.message.PaymentRequestContent r0 = r2.content
            com.facebookpay.offsite.models.message.PaymentOptions r7 = r0.paymentOptions
            boolean r0 = r7.requestPayerEmail
            if (r0 == 0) goto L_0x0083
            java.lang.String r0 = "requestPayerEmail"
            r3.add(r0)
        L_0x0083:
            boolean r0 = r7.requestPayerName
            if (r0 == 0) goto L_0x008c
            java.lang.String r0 = "requestPayerName"
            r3.add(r0)
        L_0x008c:
            boolean r0 = r7.requestPayerPhone
            if (r0 == 0) goto L_0x0095
            java.lang.String r0 = "requestPayerPhone"
            r3.add(r0)
        L_0x0095:
            boolean r0 = r7.requestShipping
            if (r0 == 0) goto L_0x009e
            java.lang.String r0 = "requestShipping"
            r3.add(r0)
        L_0x009e:
            boolean r0 = r7.requestBillingAddress
            if (r0 == 0) goto L_0x00a7
            java.lang.String r0 = "requestBilling"
            r3.add(r0)
        L_0x00a7:
            java.lang.String r4 = r7.billingAddressMode
            if (r4 == 0) goto L_0x00b4
            java.lang.String r0 = "billingAddressMode="
            java.lang.String r0 = X.AnonymousClass00U.A0L(r0, r4)
            r3.add(r0)
        L_0x00b4:
            boolean r0 = r7.allowOfferCodes
            if (r0 == 0) goto L_0x00bd
            java.lang.String r0 = "allowOfferCodes"
            r3.add(r0)
        L_0x00bd:
            java.lang.String r0 = "PAYMENT_OPTIONS"
            r5.put(r0, r3)
            java.lang.String r15 = "EVENT_EXTRA"
            r5.put(r15, r14)
            X.68R r0 = X.AnonymousClass68R.CLIENT_LOAD_OFFSITEPAYMENTREQUEST_INIT
            r1.A0I(r0, r5)
            java.lang.String r0 = "user_click_ecpentry_atomic"
            com.facebookpay.offsite.base.CheckoutHandler.A0A(r1, r0, r5)
            X.7AE r0 = com.facebookpay.offsite.base.CheckoutHandler.A02(r1)
            r0.A02 = r2
            com.facebookpay.offsite.models.message.PaymentRequestContent r0 = r2.content
            com.facebookpay.offsite.models.message.PaymentConfiguration r3 = r0.paymentConfiguration
            java.lang.String r0 = r3.requestId
            r1.A0E = r0
            r1.A0D = r6
            java.lang.String r0 = r3.pixelId
            if (r0 != 0) goto L_0x00e7
            java.lang.String r0 = r1.A0C
        L_0x00e7:
            r1.A0C = r0
            java.lang.String r0 = r3.eventId
            if (r0 != 0) goto L_0x00ef
            java.lang.String r0 = r1.A09
        L_0x00ef:
            r1.A09 = r0
            boolean r0 = r1.A0I
            java.lang.String r6 = "CHECKOUT_ERROR"
            if (r0 != 0) goto L_0x0117
            java.lang.String r6 = "CHECKOUT_UNAVAILABLE"
        L_0x00f9:
            java.lang.String r0 = r2.msgId
        L_0x00fb:
            com.facebookpay.offsite.base.CheckoutHandler.A09(r1, r0, r6, r5, r14)
        L_0x00fe:
            X.56r r1 = r1.A0R
            r0 = r18
            androidx.fragment.app.FragmentActivity r2 = r0.A01
            X.8gC r0 = r0.A03
            r1.A0C(r2, r0)
            com.facebookpay.offsite.base.CheckoutHandler r0 = X.C86164wN.A0P(r70)
            X.56r r1 = r0.A0Q
            r0 = r18
            X.8gC r0 = r0.A02
            r1.A0C(r2, r0)
            return
        L_0x0117:
            java.lang.String r3 = r3.partnerId
            java.lang.String r0 = r1.A08
            if (r0 != 0) goto L_0x0124
            java.lang.String r0 = "availabilityRequestPartnerId"
            X.C04220Ms.A0E(r0)
            r0 = 0
            throw r0
        L_0x0124:
            boolean r0 = X.C04220Ms.A0I(r3, r0)
            if (r0 != 0) goto L_0x012d
            java.lang.String r6 = "PARTNER_MISMATCH"
            goto L_0x00f9
        L_0x012d:
            com.facebookpay.offsite.models.message.PaymentRequestContent r0 = r2.content
            com.facebookpay.offsite.models.message.PaymentConfiguration r0 = r0.paymentConfiguration
            java.lang.String r3 = r0.partnerMerchantId
            java.lang.String r0 = r1.A07
            if (r0 != 0) goto L_0x013e
            java.lang.String r0 = "availabilityRequestMerchantId"
            X.C04220Ms.A0E(r0)
            r0 = 0
            throw r0
        L_0x013e:
            boolean r0 = X.C04220Ms.A0I(r3, r0)
            if (r0 != 0) goto L_0x0147
            java.lang.String r6 = "MERCHANT_MISMATCH"
            goto L_0x00f9
        L_0x0147:
            java.util.concurrent.atomic.AtomicReference r0 = r1.A0X
            r69 = r0
            java.lang.Object r3 = r69.get()
            java.lang.String r0 = "0"
            boolean r0 = X.C04220Ms.A0I(r3, r0)
            if (r0 != 0) goto L_0x015a
            java.lang.String r6 = "“MULTIPLE_CHECKOUT_REQUEST"
            goto L_0x00f9
        L_0x015a:
            com.facebookpay.offsite.models.message.PaymentRequestContent r3 = r2.content
            com.facebookpay.offsite.models.message.PaymentOptions r0 = r3.paymentOptions
            boolean r0 = r0.proactive
            if (r0 == 0) goto L_0x0167
            boolean r0 = r1.A0K
            if (r0 != 0) goto L_0x0167
            goto L_0x00f9
        L_0x0167:
            com.facebookpay.offsite.models.message.PaymentConfiguration r0 = r3.paymentConfiguration
            com.facebookpay.offsite.models.message.PaymentMode r3 = r0.mode
            com.facebookpay.offsite.models.message.PaymentMode r0 = r1.A04
            if (r0 != 0) goto L_0x0176
            java.lang.String r0 = "availabilityRequestPaymentMode"
            X.C04220Ms.A0E(r0)
            r0 = 0
            throw r0
        L_0x0176:
            if (r3 == r0) goto L_0x017c
            java.lang.String r6 = "PAYMENT_MODE_MISMATCH"
            goto L_0x00f9
        L_0x017c:
            java.lang.String r3 = r1.A0E()
            com.facebookpay.offsite.models.message.UriUtils r8 = com.facebookpay.offsite.models.message.UriUtils.INSTANCE
            r0 = r21
            java.lang.String r0 = r8.toUriAuthorityAndPath(r0)
            boolean r0 = X.C04220Ms.A0I(r3, r0)
            if (r0 != 0) goto L_0x0192
            java.lang.String r6 = "SECURITY_ERROR"
            goto L_0x00f9
        L_0x0192:
            com.facebookpay.offsite.models.message.PaymentRequestContent r0 = r2.content
            com.facebookpay.offsite.models.message.PaymentOptions r0 = r0.paymentOptions
            boolean r0 = r0.proactive
            if (r0 == 0) goto L_0x01bb
            X.8mf r0 = r1.A0C()
            boolean r0 = r0.BBR()
            if (r0 == 0) goto L_0x01bb
            boolean r0 = r1.A0J
            if (r0 == 0) goto L_0x01bb
            X.6sX r0 = r1.A0W
            X.0Oa r0 = r0.A09
            android.content.SharedPreferences r4 = X.C86154wM.A0B(r0)
            java.lang.String r3 = "proactive_checkout_should_stop_showing_banner"
            r0 = r19
            boolean r3 = r4.getBoolean(r3, r0)
            r0 = 1
            if (r3 == 0) goto L_0x01bc
        L_0x01bb:
            r0 = 0
        L_0x01bc:
            r1.A0M = r0
            X.67l r12 = com.facebookpay.offsite.base.CheckoutHandler.A00()
            boolean r0 = r1.A0M
            X.67l r9 = com.facebookpay.offsite.base.CheckoutHandler.A01(r0)
            r11 = r1
            X.5iw r11 = (X.C92615iw) r11
            java.lang.String r7 = r11.A00
            if (r7 == 0) goto L_0x06ef
            com.facebookpay.offsite.models.message.PaymentRequestContent r3 = r2.content
            java.lang.String r0 = r11.A0B
            r24 = r0
            if (r0 == 0) goto L_0x070b
            java.lang.String r0 = r2.msgId
            r68 = r0
            com.fbpay.logging.LoggingPolicy r23 = X.C121537Gp.A01
            X.8mf r0 = r11.A0C()
            java.lang.String r10 = r0.AR2()
            boolean r0 = r11.A0Z
            r22 = r0
            X.7AE r0 = com.facebookpay.offsite.base.CheckoutHandler.A02(r11)
            java.lang.String r0 = r0.A06
            r67 = r0
            X.8mf r0 = r11.A0C()
            com.facebookpay.expresscheckout.models.PaymentReceiverInfo r46 = X.AnonymousClass6IT.A00(r0, r2)
            X.8mf r0 = r11.A0C()
            java.util.Set r60 = r0.AQS(r2)
            r11.A0C()
            X.AnonymousClass7Kz.A0J()
            r0 = r19
            X.C04220Ms.A0B(r3, r0)
            r4 = r68
            r0 = r23
            X.C18190wL.A1S(r4, r13, r0)
            r0 = 6
            X.C04220Ms.A0B(r10, r0)
            java.lang.String r49 = X.AnonymousClass6IW.A00(r3)
            if (r46 != 0) goto L_0x0223
            com.facebookpay.offsite.models.message.PaymentConfiguration r0 = r3.paymentConfiguration
            com.facebookpay.expresscheckout.models.PaymentReceiverInfo r46 = X.C121717Hp.A02(r0)
        L_0x0223:
            com.facebookpay.offsite.models.message.PaymentOptions r0 = r3.paymentOptions
            com.facebookpay.expresscheckout.models.CheckoutConfiguration r42 = X.C121717Hp.A01(r12, r9, r0)
            com.facebookpay.offsite.models.message.PaymentConfiguration r0 = r3.paymentConfiguration
            com.facebookpay.offsite.models.message.PaymentMode r4 = r0.mode
            if (r4 == 0) goto L_0x023b
            java.lang.String r4 = r4.name()
            if (r4 == 0) goto L_0x023b
            X.68b r53 = X.C971368b.valueOf(r4)
            if (r53 != 0) goto L_0x023d
        L_0x023b:
            X.68b r53 = X.C971368b.LIVE
        L_0x023d:
            java.lang.String r0 = r0.containerContext
            r43 = r0
            java.lang.String r55 = r8.toUriAuthorityAndPath(r7)
            X.67H r0 = X.AnonymousClass67H.CHARGE
            X.67H[] r0 = new X.AnonymousClass67H[]{r0}
            java.util.ArrayList r56 = X.C06750aI.A14(r0)
            com.facebookpay.offsite.models.message.PaymentDetails r0 = r3.paymentDetails
            com.facebookpay.offsite.models.message.PaymentItem r0 = r0.total
            if (r0 == 0) goto L_0x0706
            com.facebookpay.offsite.models.message.PaymentCurrencyAmount r0 = r0.amount
            if (r0 == 0) goto L_0x0706
            com.facebookpay.common.models.CurrencyAmount r51 = X.C121717Hp.A00(r0)
            com.facebookpay.offsite.models.message.PaymentConfiguration r0 = r3.paymentConfiguration
            java.util.Map<com.facebookpay.offsite.models.message.PaymentContainerType, java.lang.Object> r0 = r0.supportedContainers
            java.util.Set r0 = r0.keySet()
            r12 = 10
            java.util.ArrayList r13 = X.AnonymousClass0wJ.A0x(r0, r12)
            java.util.Iterator r0 = r0.iterator()
        L_0x026f:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x0279
            X.C116866xg.A01(r13, r0)
            goto L_0x026f
        L_0x0279:
            com.facebookpay.offsite.models.message.PaymentConfiguration r0 = r3.paymentConfiguration
            java.util.Map<com.facebookpay.offsite.models.message.PaymentContainerType, java.lang.Object> r0 = r0.supportedContainers
            java.util.LinkedHashMap r8 = X.C18220wO.A0y()
            java.util.Iterator r9 = X.AnonymousClass0wJ.A0z(r0)
        L_0x0285:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x02a5
            java.util.Map$Entry r7 = X.C18180wK.A0o(r9)
            java.lang.Object r4 = r7.getValue()
            boolean r0 = r4 instanceof java.util.Map
            if (r0 == 0) goto L_0x0285
            java.util.Map r4 = (java.util.Map) r4
            if (r4 == 0) goto L_0x0285
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L_0x0285
            X.C18210wN.A1Q(r8, r7)
            goto L_0x0285
        L_0x02a5:
            int r0 = r8.size()
            int r0 = X.AnonymousClass4WK.A0N(r0)
            java.util.LinkedHashMap r0 = X.C18190wL.A0v(r0)
            java.util.Set r4 = r8.entrySet()
            java.util.Iterator r8 = r4.iterator()
        L_0x02b9:
            boolean r4 = r8.hasNext()
            if (r4 == 0) goto L_0x02d5
            java.util.Map$Entry r7 = X.C18180wK.A0o(r8)
            java.lang.Object r4 = r7.getKey()
            com.facebookpay.offsite.models.message.PaymentContainerType r4 = (com.facebookpay.offsite.models.message.PaymentContainerType) r4
            java.lang.String r4 = r4.getType()
            X.692 r4 = X.C116866xg.A00(r4)
            X.C86144wL.A1P(r4, r0, r7)
            goto L_0x02b9
        L_0x02d5:
            int r4 = r0.size()
            int r4 = X.AnonymousClass4WK.A0N(r4)
            java.util.LinkedHashMap r9 = X.C18190wL.A0v(r4)
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r17 = r0.iterator()
        L_0x02e9:
            boolean r0 = r17.hasNext()
            if (r0 == 0) goto L_0x0348
            java.util.Map$Entry r0 = X.C18180wK.A0o(r17)
            java.lang.Object r8 = r0.getKey()
            java.lang.Object r0 = r0.getValue()
            r4 = 100
            java.lang.String r4 = X.C18170wI.A00(r4)
            X.C04220Ms.A0C(r0, r4)
            java.util.Map r0 = (java.util.Map) r0
            int r4 = r0.size()
            java.util.ArrayList r7 = X.C18240wQ.A0k(r4)
            java.util.Iterator r16 = X.AnonymousClass0wJ.A0z(r0)
        L_0x0312:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x032f
            java.util.Map$Entry r0 = X.C18180wK.A0o(r16)
            java.lang.Object r4 = r0.getKey()
            X.C18240wQ.A1I(r4)
            java.lang.Object r0 = r0.getValue()
            kotlin.Pair r0 = X.C18180wK.A0p(r4, r0)
            r7.add(r0)
            goto L_0x0312
        L_0x032f:
            r0 = r19
            kotlin.Pair[] r0 = new kotlin.Pair[r0]
            java.lang.Object[] r4 = r7.toArray(r0)
            kotlin.Pair[] r4 = (kotlin.Pair[]) r4
            int r0 = r4.length
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r4, r0)
            kotlin.Pair[] r0 = (kotlin.Pair[]) r0
            android.os.Bundle r0 = X.C98316Fa.A00(r0)
            r9.put(r8, r0)
            goto L_0x02e9
        L_0x0348:
            boolean r0 = r9.isEmpty()
            r0 = r0 ^ 1
            r59 = 0
            if (r0 == 0) goto L_0x0354
            r59 = r9
        L_0x0354:
            java.util.ListIterator r4 = r26.listIterator()
            boolean r0 = r4.hasNext()
            r28 = 0
            if (r0 == 0) goto L_0x03bd
            java.lang.Object r0 = r4.next()
            com.facebook.browser.lite.extensions.autofill.model.AutofillData r0 = (com.facebook.browser.lite.extensions.autofill.model.AutofillData) r0
            java.util.Map r0 = r0.A00
            java.lang.String r4 = "given-name"
            java.lang.Object r7 = r0.get(r4)
            if (r7 != 0) goto L_0x0417
            java.lang.String r7 = "family-name"
            java.lang.Object r7 = r0.get(r7)
            if (r7 != 0) goto L_0x0417
            r29 = r28
        L_0x037a:
            java.lang.String r4 = "email"
            java.lang.String r64 = X.C18220wO.A0r(r4, r0)
            java.lang.String r4 = "tel"
            java.lang.String r65 = X.C18220wO.A0r(r4, r0)
            java.lang.String r4 = "address-line1"
            java.lang.Object r7 = r0.get(r4)
            if (r7 != 0) goto L_0x03dd
            java.lang.String r7 = "address-level1"
            java.lang.Object r7 = r0.get(r7)
            if (r7 != 0) goto L_0x03dd
            java.lang.String r7 = "address-level2"
            java.lang.Object r7 = r0.get(r7)
            if (r7 != 0) goto L_0x03dd
            java.lang.String r7 = "country"
            java.lang.Object r7 = r0.get(r7)
            if (r7 != 0) goto L_0x03dd
            r26 = r28
        L_0x03a8:
            if (r29 != 0) goto L_0x03b0
            if (r64 != 0) goto L_0x03b0
            if (r65 != 0) goto L_0x03b0
            if (r26 == 0) goto L_0x03bd
        L_0x03b0:
            java.lang.String r66 = "IAW"
            com.facebookpay.expresscheckout.models.KnownData r28 = new com.facebookpay.expresscheckout.models.KnownData
            r61 = r28
            r62 = r26
            r63 = r29
            r61.<init>(r62, r63, r64, r65, r66)
        L_0x03bd:
            com.facebookpay.offsite.models.message.PaymentDetails r0 = r3.paymentDetails
            java.util.List<com.facebookpay.offsite.models.message.PaymentOffer> r3 = r0.offers
            if (r3 == 0) goto L_0x0429
            java.util.ArrayList r0 = X.AnonymousClass0wJ.A0x(r3, r12)
            java.util.Iterator r4 = r3.iterator()
        L_0x03cb:
            boolean r3 = r4.hasNext()
            if (r3 == 0) goto L_0x042a
            java.lang.Object r3 = r4.next()
            com.facebookpay.offsite.models.message.PaymentOffer r3 = (com.facebookpay.offsite.models.message.PaymentOffer) r3
            java.lang.String r3 = r3.code
            r0.add(r3)
            goto L_0x03cb
        L_0x03dd:
            java.lang.String r7 = "ent_id"
            java.lang.String r27 = X.C18220wO.A0r(r7, r0)
            java.lang.String r30 = X.C18220wO.A0r(r4, r0)
            java.lang.String r4 = "address-line2"
            java.lang.String r31 = X.C18220wO.A0r(r4, r0)
            java.lang.String r4 = "address-level2"
            java.lang.String r32 = X.C18220wO.A0r(r4, r0)
            java.lang.String r4 = "address-level1"
            java.lang.String r33 = X.C18220wO.A0r(r4, r0)
            java.lang.String r4 = "country"
            java.lang.String r34 = X.C18220wO.A0r(r4, r0)
            java.lang.String r4 = "postal-code"
            java.lang.String r35 = X.C18220wO.A0r(r4, r0)
            com.facebookpay.shippingaddress.model.ShippingAddress r26 = new com.facebookpay.shippingaddress.model.ShippingAddress
            r36 = r28
            r37 = r19
            r38 = r19
            r39 = r19
            r40 = r19
            r41 = r25
            r26.<init>(r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41)
            goto L_0x03a8
        L_0x0417:
            java.lang.String r8 = X.C18220wO.A0r(r4, r0)
            java.lang.String r7 = " "
            java.lang.String r4 = "family-name"
            java.lang.String r4 = X.C18220wO.A0r(r4, r0)
            java.lang.String r29 = X.AnonymousClass00U.A0V(r8, r7, r4)
            goto L_0x037a
        L_0x0429:
            r0 = 0
        L_0x042a:
            com.facebookpay.expresscheckout.models.ECPPaymentConfiguration r44 = new com.facebookpay.expresscheckout.models.ECPPaymentConfiguration
            r50 = r44
            r52 = r28
            r54 = r43
            r57 = r13
            r58 = r0
            r50.<init>(r51, r52, r53, r54, r55, r56, r57, r58, r59, r60)
            boolean r8 = X.AnonymousClass7HK.A01()
            com.instagram.service.session.UserSession r7 = X.AnonymousClass7HK.A00()
            X.0TJ r0 = X.AnonymousClass0TJ.A06
            r3 = 36317470363356954(0x81068c00260f1a, double:3.0306527242775995E-306)
            boolean r4 = X.C63803iN.A0E(r0, r7, r3)
            int r3 = r10.hashCode()
            r0 = 628339271(0x2573b247, float:2.1137293E-16)
            if (r3 == r0) goto L_0x050e
            r0 = 628339369(0x2573b2a9, float:2.1137423E-16)
            if (r3 == r0) goto L_0x0502
            r0 = 1632225371(0x6149c85b, float:2.3263954E20)
            if (r3 != r0) goto L_0x053b
            java.lang.String r0 = "META_PAY_APP_STYLE_IG"
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x053b
            if (r8 == 0) goto L_0x04fe
            X.69R r28 = X.AnonymousClass69R.A0V
        L_0x046b:
            X.69R r30 = X.AnonymousClass69R.A0W
            X.69R r31 = X.AnonymousClass69R.A0X
            X.69R r32 = X.AnonymousClass69R.A0S
        L_0x0471:
            r0 = 0
            X.69R r33 = X.AnonymousClass69R.A0Z
            java.lang.Integer r4 = X.AnonymousClass006.A00
            com.facebookpay.expresscheckout.models.ItemDetails r3 = new com.facebookpay.expresscheckout.models.ItemDetails
            r3.<init>(r4, r0)
            X.69R r34 = X.AnonymousClass69R.A0C
            com.facebookpay.expresscheckout.models.EcpUIConfiguration r45 = new com.facebookpay.expresscheckout.models.EcpUIConfiguration
            r26 = r45
            r27 = r0
            r29 = r28
            r35 = r0
            r36 = r3
            r26.<init>(r27, r28, r29, r30, r31, r32, r33, r34, r35, r36)
        L_0x048c:
            r53 = r22 ^ 1
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r3 = new com.facebookpay.expresscheckout.models.ECPPaymentRequest
            r41 = r3
            r43 = r0
            r47 = r23
            r48 = r24
            r50 = r68
            r51 = r67
            r52 = r19
            r41.<init>(r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53)
            java.lang.String r7 = com.facebookpay.offsite.base.CheckoutHandler.A03(r1)
            java.lang.String r4 = r1.A0B
            if (r4 == 0) goto L_0x0701
            java.util.Map r4 = X.C121537Gp.A01(r2, r7, r4)
            r1.A0G = r4
            com.facebookpay.offsite.models.message.PaymentRequestContent r10 = r2.content
            com.facebookpay.offsite.models.message.PaymentDetails r9 = r10.paymentDetails
            com.facebookpay.offsite.models.message.PaymentOptions r4 = r10.paymentOptions
            java.lang.String r8 = r4.shippingType
            java.lang.String r7 = r4.fulfillmentType
            com.facebookpay.offsite.models.message.PaymentConfiguration r4 = r10.paymentConfiguration
            java.lang.String r4 = r4.acquirerCountryCode
            com.facebookpay.expresscheckout.models.TransactionInfo r7 = X.AnonymousClass6IV.A00(r9, r8, r7, r4)
            java.lang.String r8 = r3.A09
            r4 = r69
            r4.set(r8)
            X.56r r4 = r1.A0T
            X.AnonymousClass7Kx.A0I(r4, r7)
            com.facebookpay.offsite.models.message.PaymentRequestContent r4 = r2.content
            com.facebookpay.offsite.models.message.PaymentOptions r4 = r4.paymentOptions
            boolean r4 = r4.proactive
            if (r4 == 0) goto L_0x04e4
            X.8mf r4 = r1.A0C()
            r4.Asm()
            boolean r4 = r1.A0J
            if (r4 == 0) goto L_0x00f9
            r4 = r25
            r1.A0L = r4
        L_0x04e4:
            X.68R r9 = X.AnonymousClass68R.CLIENT_LOAD_OFFSITEPAYMENTREQUEST_SUCCESS
            java.lang.String r4 = "CLIENT_LOAD_OFFSITEPAYMENTREQUEST_SUCCESS"
            java.util.Map r8 = r1.A0G(r4)
            java.util.Iterator r6 = X.AnonymousClass0wJ.A0z(r8)
        L_0x04f0:
            boolean r4 = r6.hasNext()
            if (r4 == 0) goto L_0x0571
            java.util.Map$Entry r4 = X.C18180wK.A0o(r6)
            X.C18210wN.A1Q(r14, r4)
            goto L_0x04f0
        L_0x04fe:
            X.69R r28 = X.AnonymousClass69R.A0T
            goto L_0x046b
        L_0x0502:
            java.lang.String r0 = "META_CHECKOUT_APP_STYLE_IG"
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x053b
            X.69R r28 = X.AnonymousClass69R.A0U
            goto L_0x046b
        L_0x050e:
            java.lang.String r0 = "META_CHECKOUT_APP_STYLE_FB"
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x053b
            X.69R r28 = X.AnonymousClass69R.A0H
            X.69R r30 = X.AnonymousClass69R.A0D
            X.69R r31 = X.AnonymousClass69R.A0E
            X.69R r32 = X.AnonymousClass69R.A09
            r0 = 0
            X.69R r34 = X.AnonymousClass69R.A0K
            X.69R r33 = X.AnonymousClass69R.A0Z
            java.lang.Integer r3 = X.AnonymousClass006.A00
            com.facebookpay.expresscheckout.models.ItemDetails r4 = new com.facebookpay.expresscheckout.models.ItemDetails
            r4.<init>(r3, r0)
            com.facebookpay.expresscheckout.models.EcpUIConfiguration r45 = new com.facebookpay.expresscheckout.models.EcpUIConfiguration
            r26 = r45
            r27 = r0
            r29 = r28
            r35 = r0
            r36 = r4
            r26.<init>(r27, r28, r29, r30, r31, r32, r33, r34, r35, r36)
            goto L_0x048c
        L_0x053b:
            if (r8 == 0) goto L_0x0567
            if (r4 == 0) goto L_0x0564
            com.facebookpay.expresscheckout.models.EcpUIConfiguration r45 = new com.facebookpay.expresscheckout.models.EcpUIConfiguration
            X.69R r28 = X.AnonymousClass69R.A0J
            X.69R r30 = X.AnonymousClass69R.A0D
            X.69R r31 = X.AnonymousClass69R.A0E
            X.69R r32 = X.AnonymousClass69R.A09
            r0 = 0
            X.69R r33 = X.AnonymousClass69R.A0Z
            java.lang.Integer r3 = X.AnonymousClass006.A00
            com.facebookpay.expresscheckout.models.ItemDetails r4 = new com.facebookpay.expresscheckout.models.ItemDetails
            r4.<init>(r3, r0)
            X.69R r34 = X.AnonymousClass69R.A0C
            r26 = r45
            r27 = r0
            r29 = r28
            r35 = r0
            r36 = r4
            r26.<init>(r27, r28, r29, r30, r31, r32, r33, r34, r35, r36)
            goto L_0x048c
        L_0x0564:
            X.69R r28 = X.AnonymousClass69R.A0I
            goto L_0x0569
        L_0x0567:
            X.69R r28 = X.AnonymousClass69R.A0G
        L_0x0569:
            X.69R r30 = X.AnonymousClass69R.A0D
            X.69R r31 = X.AnonymousClass69R.A0E
            X.69R r32 = X.AnonymousClass69R.A09
            goto L_0x0471
        L_0x0571:
            r5.put(r15, r8)
            r1.A0I(r9, r5)
            X.6ql r4 = r11.A02
            X.3TR r6 = r4.A00
            if (r6 == 0) goto L_0x0584
            X.K6u r4 = r4.A01
            if (r4 == 0) goto L_0x0584
            r4.A06(r6)
        L_0x0584:
            X.6mE r6 = r1.A0V
            androidx.fragment.app.Fragment r4 = r1.A0O
            r22 = r4
            X.7AE r4 = com.facebookpay.offsite.base.CheckoutHandler.A02(r1)
            java.lang.Boolean r9 = r4.A05
            boolean r8 = r1.A0N
            kotlin.jvm.internal.KtLambdaShape1S1500000_I2 r17 = new kotlin.jvm.internal.KtLambdaShape1S1500000_I2
            r26 = r17
            r27 = r3
            r28 = r2
            r29 = r7
            r30 = r5
            r31 = r1
            r32 = r21
            r33 = r25
            r26.<init>(r27, r28, r29, r30, r31, r32, r33)
            kotlin.jvm.internal.KtLambdaShape2S1500000_I2 r16 = new kotlin.jvm.internal.KtLambdaShape2S1500000_I2
            r26 = r16
            r28 = r1
            r30 = r2
            r31 = r5
            r33 = r19
            r26.<init>(r27, r28, r29, r30, r31, r32, r33)
            long r10 = java.lang.System.currentTimeMillis()
            com.facebookpay.connect.models.ConnectPayload r4 = r6.A00
            if (r4 == 0) goto L_0x06e2
            r4 = r25
            boolean r4 = X.C18190wL.A1Z(r9, r4)
            if (r4 == 0) goto L_0x06e2
            if (r8 != 0) goto L_0x06e2
            X.0Oa r9 = r6.A05
            android.content.SharedPreferences r8 = X.C86154wM.A0B(r9)
            java.lang.String r5 = "meta_pay_connect_cancellation_count"
            r4 = r19
            int r5 = r8.getInt(r5, r4)
            X.0Oa r4 = r6.A03
            java.lang.Object r4 = r4.getValue()
            int r4 = X.AnonymousClass0wJ.A04(r4)
            if (r5 >= r4) goto L_0x06e2
            android.content.SharedPreferences r5 = X.C86154wM.A0B(r9)
            java.lang.String r4 = "meta_pay_connect_cooldown_start_time_ms"
            long r4 = X.C18180wK.A05(r5, r4)
            long r10 = r10 - r4
            X.0Oa r4 = r6.A04
            java.lang.Object r4 = r4.getValue()
            long r8 = X.C18190wL.A08(r4)
            int r4 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r4 < 0) goto L_0x06e2
            com.instagram.service.session.UserSession r9 = X.AnonymousClass7HK.A00()
            X.0TJ r8 = X.AnonymousClass0TJ.A05
            r4 = 36317470363291417(0x81068c00250f19, double:3.0306527242361536E-306)
            boolean r4 = X.C63803iN.A0E(r8, r9, r4)
            if (r4 == 0) goto L_0x06e2
            r8 = 2131824292(0x7f110ea4, float:1.9281408E38)
            r9 = 2131824287(0x7f110e9f, float:1.9281398E38)
            r10 = 2131824291(0x7f110ea3, float:1.9281406E38)
            r11 = 2131824289(0x7f110ea1, float:1.9281402E38)
            r12 = 2131824290(0x7f110ea2, float:1.9281404E38)
            r13 = 2131824288(0x7f110ea0, float:1.92814E38)
            com.facebookpay.connect.models.ConnectExitConfirmationDialogConfig r3 = new com.facebookpay.connect.models.ConnectExitConfirmationDialogConfig
            r7 = r3
            r7.<init>(r8, r9, r10, r11, r12, r13)
            com.instagram.service.session.UserSession r13 = r6.A02
            com.facebookpay.connect.models.ConnectPayload r14 = r6.A00
            if (r14 == 0) goto L_0x06fc
            com.facebookpay.connect.models.ConnectNavigationBarStyle r7 = com.facebookpay.connect.models.ConnectNavigationBarStyle.A04
            X.4x8 r4 = r6.A01
            r2 = 2131824298(0x7f110eaa, float:1.928142E38)
            java.lang.String r12 = r4.getString(r2)
            r2 = 2131824297(0x7f110ea9, float:1.9281418E38)
            java.lang.String r11 = r4.getString(r2)
            r2 = 2131824262(0x7f110e86, float:1.9281347E38)
            java.lang.String r10 = r4.getString(r2)
            r2 = 2131824296(0x7f110ea8, float:1.9281416E38)
            java.lang.String r9 = r4.getString(r2)
            java.lang.String r4 = "OPEN_URL"
            java.lang.String r2 = "https://www.facebook.com/help/322044199117075?locale=en_US&ref=learn_more"
            com.facebookpay.connect.models.ConnectLearnMoreConfig r8 = new com.facebookpay.connect.models.ConnectLearnMoreConfig
            r8.<init>(r4, r2, r0)
            r15 = 2131824278(0x7f110e96, float:1.928138E38)
            r5 = 2131824275(0x7f110e93, float:1.9281373E38)
            r4 = 2131824277(0x7f110e95, float:1.9281377E38)
            r2 = 2131824276(0x7f110e94, float:1.9281375E38)
            com.facebookpay.connect.models.ConnectErrorDialogConfig r6 = new com.facebookpay.connect.models.ConnectErrorDialogConfig
            r6.<init>(r15, r5, r4, r2)
            android.os.Bundle r4 = X.C18180wK.A06()
            X.5jC r5 = new X.5jC
            r5.<init>()
            java.lang.String r2 = "connect_payload"
            r4.putParcelable(r2, r14)
            java.lang.String r2 = "connect_nav_bar_style"
            r4.putParcelable(r2, r7)
            X.C86134wK.A15(r4, r13)
            java.lang.String r7 = "is_payment_form"
            r2 = r19
            r4.putBoolean(r7, r2)
            java.lang.String r2 = "headline_title_text"
            r4.putString(r2, r12)
            java.lang.String r2 = "headline_body_text"
            r4.putString(r2, r11)
            java.lang.String r2 = "connect_learn_more_headline_config"
            r4.putParcelable(r2, r0)
            java.lang.String r2 = "bullet_cell_config"
            r4.putParcelable(r2, r0)
            java.lang.String r0 = "connect_bottom_button_secondary_action_text"
            r4.putString(r0, r10)
            java.lang.String r0 = "footer_text"
            r4.putString(r0, r9)
            java.lang.String r0 = "connect_learn_more_footer_config"
            r4.putParcelable(r0, r8)
            java.lang.String r0 = "connect_exit_confirmation_dialog_config"
            r4.putParcelable(r0, r3)
            java.lang.String r0 = "connect_error_dialog_config"
            r4.putParcelable(r0, r6)
            r5.setArguments(r4)
            r0 = r17
            r5.A0E = r0
            r0 = r16
            r5.A0F = r0
            android.os.Bundle r4 = X.C18180wK.A06()
            r2 = 2131886577(0x7f1201f1, float:1.9407737E38)
            java.lang.String r0 = "STYLE_RES"
            r4.putInt(r0, r2)
            java.lang.String r0 = "CONNECT_EXIT_CONFIRMATION_DIALOG_CONFIG"
            r4.putParcelable(r0, r3)
            X.5jA r3 = new X.5jA
            r3.<init>()
            r3.setArguments(r4)
            X.0m7 r2 = r22.getChildFragmentManager()
            X.C04220Ms.A06(r2)
            java.lang.String r0 = "BOTTOM_SHEET_CONTENT_FRAGMENT_TAG"
            r3.A05 = r5
            r3.A0A(r2, r0)
            goto L_0x00fe
        L_0x06e2:
            java.lang.String r8 = "DEFAULT_VALUE"
            r4 = r3
            r5 = r7
            r6 = r1
            r7 = r2
            r9 = r21
            com.facebookpay.offsite.base.CheckoutHandler.A05(r4, r5, r6, r7, r8, r9)
            goto L_0x00fe
        L_0x06ef:
            java.lang.String r3 = "IAWOffsiteMessageHandler"
            java.lang.String r0 = "Webview url is empty"
            X.AnonymousClass0LU.A0B(r3, r0)
            java.lang.String r0 = r2.msgId
            java.lang.String r6 = "ECP_LAUNCH_PARAMS_NULL"
            goto L_0x00fb
        L_0x06fc:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r20)
            throw r0
        L_0x0701:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r20)
            throw r0
        L_0x0706:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r20)
            throw r0
        L_0x070b:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r20)
            throw r0
        L_0x0710:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r20)
            throw r0
        L_0x0715:
            java.lang.String r1 = "OffsiteMessageHandler"
            java.lang.String r0 = "Security Origin is empty"
            X.AnonymousClass0LU.A0B(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1359480t.run():void");
    }
}
