package X;

import com.facebook.graphql.calls.GQLCallInputCInputShape0S0000000;
import com.facebook.graphql.calls.GQLCallInputCInputShape1S0000000;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.react.modules.dialog.DialogModule;
import com.facebookpay.common.models.CurrencyAmount;
import com.facebookpay.expresscheckout.handler.ECPHandler;
import com.facebookpay.expresscheckout.models.CheckoutResponse;
import com.facebookpay.expresscheckout.models.ECPOffer;
import com.facebookpay.expresscheckout.models.ECPPaymentResponseParams;
import com.facebookpay.expresscheckout.models.PriceInfo;
import com.facebookpay.expresscheckout.models.TransactionInfo;
import com.facebookpay.offsite.base.CheckoutHandler;
import com.facebookpay.offsite.models.message.MessageType$Companion;
import com.facebookpay.offsite.models.message.PaymentDataErrorReason;
import com.facebookpay.offsite.models.message.PaymentError;
import com.facebookpay.offsite.models.message.PaymentRequest;
import com.facebookpay.offsite.models.message.PaymentResponse;
import com.facebookpay.offsite.models.message.PaymentResponseContent;
import com.facebookpay.shippingaddress.model.ShippingAddress;
import com.fbpay.logging.LoggingContext;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.coroutines.jvm.internal.KtSLambdaShape8S0301000_I2;

/* renamed from: X.7iw  reason: invalid class name and case insensitive filesystem */
public final class C128137iw implements ECPHandler {
    public final /* synthetic */ CheckoutHandler A00;

    public final void BN6(AnonymousClass7Kx r14) {
        AnonymousClass68R r3;
        String message;
        String str;
        LinkedHashMap A0y = C18220wO.A0y();
        CheckoutHandler checkoutHandler = this.A00;
        A0y.putAll(checkoutHandler.A0G);
        A0y.put("REQUEST_TIMESTAMP", C18200wM.A0c());
        ECPPaymentResponseParams eCPPaymentResponseParams = CheckoutHandler.A02(checkoutHandler).A00;
        if (!(eCPPaymentResponseParams == null || (str = eCPPaymentResponseParams.A0B) == null)) {
            A0y.put("CONTAINER_TYPE", str);
        }
        if (AnonymousClass7Kx.A0R(r14)) {
            ECPPaymentResponseParams eCPPaymentResponseParams2 = (ECPPaymentResponseParams) r14.A01;
            if (eCPPaymentResponseParams2 != null) {
                PaymentResponseContent A03 = C121717Hp.A03(eCPPaymentResponseParams2, (PaymentRequest) null);
                C880856r r32 = checkoutHandler.A0R;
                String A0y2 = C86124wJ.A0y(C128557jn.A08);
                String str2 = checkoutHandler.A0E;
                if (str2 != null) {
                    r32.A0H(new PaymentResponse(A0y2, str2, A03, System.currentTimeMillis(), (String) checkoutHandler.A0X.get(), MessageType$Companion.PAYMENT_RESPONSE, (PaymentError) null));
                    checkoutHandler.A0I(AnonymousClass68R.CLIENT_LOAD_OFFSITEPAYMENTHANDLED_SUCCESS, A0y);
                    CheckoutHandler.A07(checkoutHandler);
                    return;
                }
                throw AnonymousClass0wJ.A0b();
            }
            r3 = AnonymousClass68R.CLIENT_LOAD_OFFSITEPAYMENTHANDLED_FAIL;
            A0y.put("RETRYABLE", false);
            A0y.put("ERROR_CODE", PaymentDataErrorReason.PAYPAL_AUTHORIZATION_ERROR.name());
        } else if (AnonymousClass7Kx.A0O(r14)) {
            A0y.put("RETRYABLE", true);
            A0y.put("ERROR_CODE", PaymentDataErrorReason.PAYPAL_AUTHORIZATION_ERROR.name());
            Throwable th = r14.A02;
            if (!(th == null || (message = th.getMessage()) == null)) {
                LinkedHashMap A0y3 = C18220wO.A0y();
                Locale locale = Locale.ROOT;
                C04220Ms.A08(locale);
                A0y3.put(C18190wL.A0r(locale, "ERROR_MESSAGE"), message);
                A0y.put("EVENT_EXTRA", A0y3);
            }
            r3 = AnonymousClass68R.CLIENT_LOAD_OFFSITEPAYMENTHANDLED_FAIL;
        } else {
            return;
        }
        checkoutHandler.A0I(r3, A0y);
    }

    public final void BN9(C110326lV r7, LoggingContext loggingContext, Integer num) {
        CheckoutHandler checkoutHandler;
        String str;
        Map map;
        String str2;
        C04220Ms.A0B(num, 0);
        C04220Ms.A0B(loggingContext, 2);
        int intValue = num.intValue();
        if (intValue == 0) {
            checkoutHandler = this.A00;
            if (checkoutHandler.A0L) {
                long currentTimeMillis = System.currentTimeMillis();
                checkoutHandler.A0W.A01(new C112156p5(currentTimeMillis, AnonymousClass006.A00), currentTimeMillis);
            }
            str = (String) C86154wM.A0e(checkoutHandler.A0X);
            map = null;
            str2 = "ABORTED";
        } else if (intValue == 1) {
            checkoutHandler = this.A00;
            str = (String) C86154wM.A0e(checkoutHandler.A0X);
            map = null;
            str2 = "INTERNAL_ERROR";
        } else if (intValue != 2) {
            if (intValue == 4) {
                checkoutHandler = this.A00;
                str = (String) C86154wM.A0e(checkoutHandler.A0X);
                map = null;
                str2 = "DISMISSED_FOR_SESSION";
            }
            CheckoutHandler.A06(this.A00);
        } else {
            checkoutHandler = this.A00;
            str = (String) C86154wM.A0e(checkoutHandler.A0X);
            map = null;
            str2 = "CHECKOUT_ERROR_RISK";
        }
        CheckoutHandler.A09(checkoutHandler, str, str2, map, map);
        CheckoutHandler.A06(this.A00);
    }

    public final void BNA() {
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v8, resolved type: java.lang.Object} */
    /* JADX WARNING: type inference failed for: r24v5, types: [com.facebookpay.offsite.models.message.PaymentFulfillmentOption] */
    /* JADX WARNING: type inference failed for: r24v6, types: [com.facebookpay.offsite.models.message.PaymentPickupOption] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x02d6  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x02df  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x02e5  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x02fb A[LOOP:7: B:118:0x02f5->B:120:0x02fb, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x030a  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x030d  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x031e  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x0358  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x0365  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x036e  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x0377  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x0380  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x01d5 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0171  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0186  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x018e  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x01e3  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01eb  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x028e  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x029b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Ch0(X.C111186mv r42) {
        /*
            r41 = this;
            r7 = 0
            r5 = r42
            X.C04220Ms.A0B(r5, r7)
            r0 = r41
            com.facebookpay.offsite.base.CheckoutHandler r2 = r0.A00
            java.util.concurrent.atomic.AtomicReference r3 = r2.A0Y
            java.lang.Object r1 = r3.get()
            java.lang.String r0 = "0"
            boolean r0 = X.C04220Ms.A0I(r1, r0)
            if (r0 == 0) goto L_0x03a6
            X.68R r4 = X.AnonymousClass68R.CLIENT_LOAD_OFFSITEPAYMENTDETAILSCHANGED_INIT
            java.lang.String r9 = com.facebookpay.offsite.base.CheckoutHandler.A03(r2)
            java.lang.String r8 = r2.A0B
            java.lang.String r22 = "Required value was null."
            if (r8 == 0) goto L_0x03a1
            java.util.Map r1 = r2.A0G
            r21 = 1
            r0 = r21
            X.C18180wK.A1P(r9, r0, r1)
            java.util.LinkedHashMap r6 = X.C18220wO.A0y()
            r6.putAll(r1)
            X.C86134wK.A1S(r8, r9, r6)
            java.util.ArrayList r1 = X.AnonymousClass0wJ.A0v()
            com.facebookpay.shippingaddress.model.ShippingAddress r0 = r5.A01
            if (r0 == 0) goto L_0x0044
            java.lang.String r0 = "SHIPPING_ADDRESS"
            r1.add(r0)
        L_0x0044:
            com.facebookpay.shippingaddress.model.ShippingAddress r0 = r5.A00
            if (r0 == 0) goto L_0x004d
            java.lang.String r0 = "BILLING_ADDRESS"
            r1.add(r0)
        L_0x004d:
            java.lang.String r0 = r5.A04
            if (r0 == 0) goto L_0x0056
            java.lang.String r0 = "SHIPPING_OPTION_ID"
            r1.add(r0)
        L_0x0056:
            java.util.List r0 = r5.A06
            boolean r0 = X.C18190wL.A1a(r0)
            if (r0 == 0) goto L_0x0063
            java.lang.String r0 = "OFFERS"
            r1.add(r0)
        L_0x0063:
            java.lang.String r0 = r5.A02
            if (r0 == 0) goto L_0x006c
            java.lang.String r0 = "FULFILLMENT_OPTION_ID"
            r1.add(r0)
        L_0x006c:
            java.lang.String r0 = "CHANGED_FIELDS"
            r6.put(r0, r1)
            r2.A0I(r4, r6)
            X.56r r1 = r2.A0T
            X.7Kx r0 = X.C86104wH.A0R(r1)
            if (r0 == 0) goto L_0x03a0
            java.lang.Object r4 = r0.A01
            com.facebookpay.expresscheckout.models.TransactionInfo r4 = (com.facebookpay.expresscheckout.models.TransactionInfo) r4
            if (r4 == 0) goto L_0x03a0
            X.AnonymousClass7Kx.A0J(r1, r4)
            java.util.concurrent.atomic.AtomicLong r0 = X.C128557jn.A08
            java.lang.String r20 = X.C86124wJ.A0y(r0)
            r0 = r20
            r3.set(r0)
            X.56r r0 = r2.A0Q
            r40 = r0
            com.facebookpay.shippingaddress.model.ShippingAddress r15 = r5.A01
            com.facebookpay.shippingaddress.model.ShippingAddress r0 = r5.A00
            r19 = r0
            java.lang.String r6 = r2.A0D
            if (r6 == 0) goto L_0x0315
            java.lang.String r11 = r5.A04
            java.util.List r0 = r5.A06
            r39 = r0
            java.lang.String r10 = r5.A02
            java.util.ArrayList<com.facebookpay.expresscheckout.models.PriceInfo> r3 = r4.A09
            r16 = 0
            if (r3 == 0) goto L_0x0310
            java.util.Iterator r8 = r3.iterator()
        L_0x00b0:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x0131
            java.lang.Object r2 = r8.next()
            r0 = r2
            com.facebookpay.expresscheckout.models.PriceInfo r0 = (com.facebookpay.expresscheckout.models.PriceInfo) r0
            X.68v r1 = r0.A01
            X.68v r0 = X.C973068v.TOTAL
            if (r1 != r0) goto L_0x00b0
        L_0x00c3:
            com.facebookpay.expresscheckout.models.PriceInfo r2 = (com.facebookpay.expresscheckout.models.PriceInfo) r2
            if (r2 == 0) goto L_0x0310
            java.lang.String r8 = r2.A04
            com.facebookpay.common.models.CurrencyAmount r0 = r2.A00
            java.lang.String r2 = r0.A00
            java.lang.String r1 = r0.A01
            com.facebookpay.offsite.models.message.PaymentCurrencyAmount r0 = new com.facebookpay.offsite.models.message.PaymentCurrencyAmount
            r0.<init>(r2, r1)
            r34 = 0
            java.lang.String r32 = "1"
            com.facebookpay.offsite.models.message.PaymentItem r23 = new com.facebookpay.offsite.models.message.PaymentItem
            r30 = r23
            r31 = r8
            r33 = r0
            r35 = r34
            r36 = r34
            r37 = r34
            r38 = r34
            r30.<init>(r31, r32, r33, r34, r35, r36, r37, r38)
            java.util.ArrayList<com.facebookpay.expresscheckout.models.PriceInfo> r0 = r4.A08
            r2 = 10
            if (r0 == 0) goto L_0x0134
            java.util.ArrayList r18 = X.AnonymousClass0wJ.A0x(r0, r2)
            java.util.Iterator r13 = r0.iterator()
        L_0x00f9:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x0136
            java.lang.Object r1 = r13.next()
            com.facebookpay.expresscheckout.models.PriceInfo r1 = (com.facebookpay.expresscheckout.models.PriceInfo) r1
            java.lang.String r12 = r1.A04
            java.lang.Integer r0 = r1.A02
            java.lang.String r30 = java.lang.String.valueOf(r0)
            com.facebookpay.common.models.CurrencyAmount r0 = r1.A00
            java.lang.String r8 = r0.A00
            java.lang.String r0 = r0.A01
            com.facebookpay.offsite.models.message.PaymentCurrencyAmount r9 = new com.facebookpay.offsite.models.message.PaymentCurrencyAmount
            r9.<init>(r8, r0)
            java.lang.String r8 = r1.A03
            java.lang.String r1 = r1.A05
            com.facebookpay.offsite.models.message.PaymentItem r0 = new com.facebookpay.offsite.models.message.PaymentItem
            r28 = r0
            r29 = r12
            r31 = r9
            r32 = r8
            r33 = r1
            r28.<init>(r29, r30, r31, r32, r33, r34, r35, r36)
            r1 = r18
            r1.add(r0)
            goto L_0x00f9
        L_0x0131:
            r2 = r16
            goto L_0x00c3
        L_0x0134:
            r18 = r16
        L_0x0136:
            if (r11 == 0) goto L_0x01df
            com.facebookpay.expresscheckout.models.ShippingOptions r0 = r4.A03
            if (r0 == 0) goto L_0x01df
            java.util.ArrayList<com.facebookpay.expresscheckout.models.ShippingOption> r0 = r0.A01
            java.util.Iterator r8 = r0.iterator()
        L_0x0142:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x01db
            java.lang.Object r1 = r8.next()
            r0 = r1
            com.facebookpay.expresscheckout.models.ShippingOption r0 = (com.facebookpay.expresscheckout.models.ShippingOption) r0
            java.lang.String r0 = r0.A03
            boolean r0 = X.C04220Ms.A0I(r0, r11)
            if (r0 == 0) goto L_0x0142
        L_0x0157:
            com.facebookpay.expresscheckout.models.ShippingOption r1 = (com.facebookpay.expresscheckout.models.ShippingOption) r1
            if (r1 == 0) goto L_0x01df
            java.lang.String r0 = r1.A03
            r35 = r0
        L_0x015f:
            if (r10 == 0) goto L_0x01d8
            com.facebookpay.expresscheckout.models.FulfillmentOptions r0 = r4.A00
            if (r0 == 0) goto L_0x01d8
            java.util.ArrayList<com.facebookpay.expresscheckout.models.FulfillmentOption> r0 = r0.A01
            java.util.Iterator r8 = r0.iterator()
        L_0x016b:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x01d5
            java.lang.Object r1 = r8.next()
            r0 = r1
            com.facebookpay.expresscheckout.models.FulfillmentOption r0 = (com.facebookpay.expresscheckout.models.FulfillmentOption) r0
            java.lang.String r0 = r0.A00()
            boolean r0 = X.C04220Ms.A0I(r0, r10)
            if (r0 == 0) goto L_0x016b
        L_0x0182:
            com.facebookpay.expresscheckout.models.FulfillmentOption r1 = (com.facebookpay.expresscheckout.models.FulfillmentOption) r1
            if (r1 == 0) goto L_0x01d8
            java.lang.String r1 = r1.A00()
        L_0x018a:
            com.facebookpay.expresscheckout.models.ShippingOptions r0 = r4.A03
            if (r0 == 0) goto L_0x01e3
            java.util.ArrayList<com.facebookpay.expresscheckout.models.ShippingOption> r8 = r0.A01
            java.util.ArrayList r0 = X.AnonymousClass0wJ.A0x(r8, r2)
            java.util.Iterator r14 = r8.iterator()
        L_0x0198:
            boolean r8 = r14.hasNext()
            if (r8 == 0) goto L_0x01e7
            java.lang.Object r9 = r14.next()
            com.facebookpay.expresscheckout.models.ShippingOption r9 = (com.facebookpay.expresscheckout.models.ShippingOption) r9
            java.lang.String r12 = r9.A03
            java.lang.String r11 = r9.A04
            com.facebookpay.common.models.CurrencyAmount r8 = r9.A00
            java.lang.String r13 = r8.A00
            java.lang.String r8 = r8.A01
            com.facebookpay.offsite.models.message.PaymentCurrencyAmount r10 = new com.facebookpay.offsite.models.message.PaymentCurrencyAmount
            r10.<init>(r13, r8)
            r8 = r35
            java.lang.Boolean r28 = X.C86124wJ.A0f(r12, r8)
            java.lang.String r9 = r9.A02
            int r8 = r9.length()
            if (r8 > 0) goto L_0x01c2
            r9 = 0
        L_0x01c2:
            com.facebookpay.offsite.models.message.PaymentShippingOption r8 = new com.facebookpay.offsite.models.message.PaymentShippingOption
            r24 = r8
            r25 = r12
            r26 = r11
            r27 = r10
            r29 = r9
            r24.<init>(r25, r26, r27, r28, r29)
            r0.add(r8)
            goto L_0x0198
        L_0x01d5:
            r1 = r16
            goto L_0x0182
        L_0x01d8:
            r1 = r16
            goto L_0x018a
        L_0x01db:
            r1 = r16
            goto L_0x0157
        L_0x01df:
            r35 = r16
            goto L_0x015f
        L_0x01e3:
            java.util.ArrayList r0 = X.AnonymousClass0wJ.A0v()
        L_0x01e7:
            com.facebookpay.expresscheckout.models.FulfillmentOptions r8 = r4.A00
            if (r8 == 0) goto L_0x028e
            java.util.ArrayList<com.facebookpay.expresscheckout.models.FulfillmentOption> r9 = r8.A01
            java.util.ArrayList r8 = X.AnonymousClass0wJ.A0x(r9, r2)
            java.util.Iterator r17 = r9.iterator()
        L_0x01f5:
            boolean r9 = r17.hasNext()
            if (r9 == 0) goto L_0x0292
            java.lang.Object r10 = r17.next()
            com.facebookpay.expresscheckout.models.FulfillmentOption r10 = (com.facebookpay.expresscheckout.models.FulfillmentOption) r10
            X.C04220Ms.A0B(r10, r7)
            boolean r9 = r10 instanceof com.facebookpay.expresscheckout.models.FulfillmentPickupOption
            if (r9 == 0) goto L_0x0263
            java.lang.String r14 = r10.A00()
            com.facebookpay.expresscheckout.models.FulfillmentPickupOption r10 = (com.facebookpay.expresscheckout.models.FulfillmentPickupOption) r10
            java.lang.String r9 = r10.A04
            r26 = r9
            com.facebookpay.common.models.CurrencyAmount r9 = r10.A00
            java.lang.String r11 = r9.A00
            java.lang.String r9 = r9.A01
            com.facebookpay.offsite.models.message.PaymentCurrencyAmount r13 = new com.facebookpay.offsite.models.message.PaymentCurrencyAmount
            r13.<init>(r11, r9)
            java.util.Date r9 = r10.A06
            r28 = r9
            java.util.Date r9 = r10.A05
            r29 = r9
            java.lang.Boolean r30 = X.C86124wJ.A0f(r14, r1)
            com.facebookpay.shippingaddress.model.ShippingAddress r9 = r10.A02
            com.facebookpay.offsite.models.message.W3CShippingAddress r31 = X.C116926xq.A00(r9)
            boolean r9 = r10.A07
            r32 = r9
            com.facebookpay.common.models.Distance r9 = r10.A01
            if (r9 == 0) goto L_0x0261
            double r11 = r9.A00
            java.lang.Integer r9 = r9.A01
            X.C04220Ms.A0B(r9, r7)
            int r10 = r9.intValue()
            r9 = r21
            if (r10 != r9) goto L_0x025e
            java.lang.String r10 = "kilometers"
        L_0x0248:
            com.facebookpay.offsite.models.message.PaymentDistance r9 = new com.facebookpay.offsite.models.message.PaymentDistance
            r9.<init>(r11, r10)
        L_0x024d:
            com.facebookpay.offsite.models.message.PaymentPickupOption r10 = new com.facebookpay.offsite.models.message.PaymentPickupOption
            r24 = r10
            r25 = r14
            r27 = r13
            r33 = r9
            r24.<init>(r25, r26, r27, r28, r29, r30, r31, r32, r33)
        L_0x025a:
            r8.add(r10)
            goto L_0x01f5
        L_0x025e:
            java.lang.String r10 = "miles"
            goto L_0x0248
        L_0x0261:
            r9 = 0
            goto L_0x024d
        L_0x0263:
            java.lang.String r11 = r10.A00()
            java.lang.String r14 = r10.A01
            com.facebookpay.common.models.CurrencyAmount r9 = r10.A00
            java.lang.String r13 = r9.A00
            java.lang.String r12 = r9.A01
            com.facebookpay.offsite.models.message.PaymentCurrencyAmount r9 = new com.facebookpay.offsite.models.message.PaymentCurrencyAmount
            r9.<init>(r13, r12)
            java.util.Date r13 = r10.A03
            java.util.Date r12 = r10.A02
            java.lang.Boolean r30 = X.C86124wJ.A0f(r11, r1)
            com.facebookpay.offsite.models.message.PaymentFulfillmentOption r10 = new com.facebookpay.offsite.models.message.PaymentFulfillmentOption
            r24 = r10
            r25 = r11
            r26 = r14
            r27 = r9
            r28 = r13
            r29 = r12
            r24.<init>(r25, r26, r27, r28, r29, r30)
            goto L_0x025a
        L_0x028e:
            java.util.ArrayList r8 = X.AnonymousClass0wJ.A0v()
        L_0x0292:
            java.lang.String r9 = "null cannot be cast to non-null type java.util.ArrayList<com.facebookpay.offsite.models.message.PaymentItem>{ kotlin.collections.TypeAliasesKt.ArrayList<com.facebookpay.offsite.models.message.PaymentItem> }"
            r7 = r18
            X.C04220Ms.A0C(r7, r9)
            if (r3 == 0) goto L_0x02d6
            java.util.ArrayList r7 = X.AnonymousClass0wJ.A0v()
            java.util.Iterator r13 = r3.iterator()
        L_0x02a3:
            boolean r3 = r13.hasNext()
            if (r3 == 0) goto L_0x02d8
            java.lang.Object r9 = r13.next()
            com.facebookpay.expresscheckout.models.PriceInfo r9 = (com.facebookpay.expresscheckout.models.PriceInfo) r9
            X.68v r12 = r9.A01
            X.68v r3 = X.C973068v.TOTAL
            if (r12 == r3) goto L_0x02a3
            java.lang.String r11 = r9.A04
            com.facebookpay.common.models.CurrencyAmount r3 = r9.A00
            java.lang.String r10 = r3.A00
            java.lang.String r9 = r3.A01
            com.facebookpay.offsite.models.message.PaymentCurrencyAmount r3 = new com.facebookpay.offsite.models.message.PaymentCurrencyAmount
            r3.<init>(r10, r9)
            if (r12 == 0) goto L_0x02d1
            java.lang.String r10 = r12.A00
            if (r10 == 0) goto L_0x02d1
            com.facebookpay.offsite.models.message.SummaryPaymentItem r9 = new com.facebookpay.offsite.models.message.SummaryPaymentItem
            r9.<init>(r11, r3, r10)
            r7.add(r9)
            goto L_0x02a3
        L_0x02d1:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r22)
            throw r0
        L_0x02d6:
            r7 = r16
        L_0x02d8:
            java.lang.String r3 = "null cannot be cast to non-null type java.util.ArrayList<com.facebookpay.offsite.models.message.SummaryPaymentItem>{ kotlin.collections.TypeAliasesKt.ArrayList<com.facebookpay.offsite.models.message.SummaryPaymentItem> }"
            X.C04220Ms.A0C(r7, r3)
            if (r15 == 0) goto L_0x030d
            com.facebookpay.offsite.models.message.W3CShippingAddress r30 = X.C116926xq.A01(r15, r6)
        L_0x02e3:
            if (r19 == 0) goto L_0x030a
            r3 = r19
            com.facebookpay.offsite.models.message.W3CShippingAddress r31 = X.C116926xq.A01(r3, r6)
        L_0x02eb:
            r3 = r39
            java.util.ArrayList r6 = X.AnonymousClass0wJ.A0x(r3, r2)
            java.util.Iterator r10 = r39.iterator()
        L_0x02f5:
            boolean r2 = r10.hasNext()
            if (r2 == 0) goto L_0x031a
            java.lang.String r9 = X.C18180wK.A0k(r10)
            com.facebookpay.offsite.models.message.PaymentOffer r3 = new com.facebookpay.offsite.models.message.PaymentOffer
            r2 = r16
            r3.<init>(r9, r2)
            r6.add(r3)
            goto L_0x02f5
        L_0x030a:
            r31 = r16
            goto L_0x02eb
        L_0x030d:
            r30 = r16
            goto L_0x02e3
        L_0x0310:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r22)
            throw r0
        L_0x0315:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r22)
            throw r0
        L_0x031a:
            com.facebookpay.expresscheckout.models.PickupInfo r2 = r4.A01
            if (r2 == 0) goto L_0x0339
            java.lang.String r10 = r2.A04
            java.lang.String r9 = r2.A01
            java.lang.String r4 = r2.A00
            java.lang.String r3 = r2.A03
            java.lang.String r2 = r2.A02
            com.facebookpay.offsite.models.message.PaymentPickupInfo r16 = new com.facebookpay.offsite.models.message.PaymentPickupInfo
            r24 = r16
            r25 = r10
            r26 = r9
            r27 = r4
            r28 = r3
            r29 = r2
            r24.<init>(r25, r26, r27, r28, r29)
        L_0x0339:
            com.facebookpay.offsite.models.message.PaymentDetails r2 = new com.facebookpay.offsite.models.message.PaymentDetails
            r22 = r2
            r24 = r18
            r25 = r7
            r26 = r0
            r27 = r8
            r28 = r35
            r29 = r1
            r32 = r6
            r33 = r16
            r22.<init>(r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)
            java.util.ArrayList r1 = X.AnonymousClass0wJ.A0v()
            com.facebookpay.shippingaddress.model.ShippingAddress r0 = r5.A00
            if (r0 == 0) goto L_0x035d
            java.lang.String r0 = "BILLING_ADDRESS"
            r1.add(r0)
        L_0x035d:
            java.util.List r0 = r5.A06
            boolean r0 = X.C18190wL.A1a(r0)
            if (r0 == 0) goto L_0x036a
            java.lang.String r0 = "OFFERS"
            r1.add(r0)
        L_0x036a:
            java.lang.String r0 = r5.A04
            if (r0 == 0) goto L_0x0373
            java.lang.String r0 = "SHIPPING_OPTION_ID"
            r1.add(r0)
        L_0x0373:
            com.facebookpay.shippingaddress.model.ShippingAddress r0 = r5.A01
            if (r0 == 0) goto L_0x037c
            java.lang.String r0 = "SHIPPING_ADDRESS"
            r1.add(r0)
        L_0x037c:
            java.lang.String r0 = r5.A02
            if (r0 == 0) goto L_0x0385
            java.lang.String r0 = "FULFILLMENT_OPTION_ID"
            r1.add(r0)
        L_0x0385:
            com.facebookpay.offsite.models.message.PaymentDetailsChangedContent r0 = new com.facebookpay.offsite.models.message.PaymentDetailsChangedContent
            r0.<init>(r2, r1)
            long r4 = java.lang.System.currentTimeMillis()
            java.lang.String r7 = "paymentDetailsChanged"
            com.facebookpay.offsite.models.message.PaymentDetailsChangedEvent r1 = new com.facebookpay.offsite.models.message.PaymentDetailsChangedEvent
            r2 = r20
            r3 = r0
            r6 = r34
            r8 = r6
            r1.<init>(r2, r3, r4, r6, r7, r8)
            r0 = r40
            r0.A0H(r1)
        L_0x03a0:
            return
        L_0x03a1:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r22)
            throw r0
        L_0x03a6:
            java.lang.String r1 = "Offsite SDK cannot send a new payment update event while processing previous request with id="
            java.lang.Object r0 = r3.get()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = X.AnonymousClass00U.A0L(r1, r0)
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C128137iw.Ch0(X.6mv):void");
    }

    public final void Ciw(C1373788i r1) {
    }

    public final void Cix(CheckoutResponse checkoutResponse) {
    }

    public final void Cqk(AnonymousClass7Kx r1) {
    }

    public C128137iw(CheckoutHandler checkoutHandler) {
        this.A00 = checkoutHandler;
    }

    public final void BNB(boolean z) {
        C111486nl APl;
        CheckoutHandler checkoutHandler = this.A00;
        if (checkoutHandler.A0L) {
            long currentTimeMillis = System.currentTimeMillis();
            checkoutHandler.A0W.A01(new C112156p5(currentTimeMillis, (Integer) null), currentTimeMillis);
        }
        if (!(checkoutHandler.A03 == null || (APl = checkoutHandler.A0C().APl()) == null)) {
            APl.A00();
        }
        CheckoutHandler.A06(checkoutHandler);
    }

    public final M5J BNU(ECPPaymentResponseParams eCPPaymentResponseParams) {
        String str;
        ArrayList arrayList;
        String str2;
        String str3;
        String str4;
        C115316ur r0;
        CheckoutHandler checkoutHandler = this.A00;
        C880856r r9 = checkoutHandler.A0S;
        if (!AnonymousClass7Kx.A0P(C86104wH.A0R(r9))) {
            ECPPaymentResponseParams eCPPaymentResponseParams2 = eCPPaymentResponseParams;
            checkoutHandler.A0A = eCPPaymentResponseParams2.A0C;
            AnonymousClass7Kx.A0J(r9, (Object) null);
            String str5 = eCPPaymentResponseParams2.A0D;
            String str6 = eCPPaymentResponseParams2.A09;
            TransactionInfo transactionInfo = eCPPaymentResponseParams2.A02;
            CurrencyAmount A03 = C122157Kv.A03(transactionInfo);
            GQLCallInputCInputShape0S0000000 A002 = GraphQlCallInput.A00();
            A002.A0F(A03.A01, "amount");
            A002.A0F(A03.A00, "currency_code");
            String str7 = eCPPaymentResponseParams2.A0G;
            String str8 = eCPPaymentResponseParams2.A0E;
            String str9 = eCPPaymentResponseParams2.A0F;
            ShippingAddress shippingAddress = eCPPaymentResponseParams2.A06;
            if (shippingAddress != null) {
                str = shippingAddress.A04;
            } else {
                str = null;
            }
            List<ECPOffer> list = eCPPaymentResponseParams2.A0Q;
            ArrayList A0x = AnonymousClass0wJ.A0x(list, 10);
            for (ECPOffer eCPOffer : list) {
                GQLCallInputCInputShape0S0000000 A003 = GraphQlCallInput.A00();
                A003.A0F(eCPOffer.A01, "offer_id");
                A003.A0F(eCPOffer.A00, "offer_code");
                A0x.add(A003);
            }
            ArrayList<PriceInfo> arrayList2 = transactionInfo.A09;
            if (arrayList2 != null) {
                ArrayList<PriceInfo> A0v = AnonymousClass0wJ.A0v();
                Iterator<PriceInfo> it = arrayList2.iterator();
                while (it.hasNext()) {
                    PriceInfo next = it.next();
                    if (next.A01 == C973068v.DISCOUNT) {
                        A0v.add(next);
                    }
                }
                arrayList = AnonymousClass0wJ.A0x(A0v, 10);
                for (PriceInfo priceInfo : A0v) {
                    GQLCallInputCInputShape0S0000000 A004 = GraphQlCallInput.A00();
                    GQLCallInputCInputShape0S0000000 A005 = GraphQlCallInput.A00();
                    CurrencyAmount currencyAmount = priceInfo.A00;
                    A005.A0F(currencyAmount.A01, "amount");
                    A005.A0F(currencyAmount.A00, "currency_code");
                    A004.A0B(A005, "amount");
                    A004.A0F(priceInfo.A04, DialogModule.KEY_TITLE);
                    arrayList.add(A004);
                }
            } else {
                arrayList = null;
            }
            String str10 = checkoutHandler.A0C;
            String str11 = checkoutHandler.A09;
            if (CheckoutHandler.A0B(checkoutHandler)) {
                str2 = checkoutHandler.A0E();
            } else {
                str2 = null;
            }
            if (!CheckoutHandler.A0B(checkoutHandler) || (r0 = CheckoutHandler.A02(checkoutHandler).A03) == null) {
                str3 = null;
            } else {
                str3 = r0.A01;
            }
            if (CheckoutHandler.A0B(checkoutHandler)) {
                str4 = CheckoutHandler.A03(checkoutHandler);
            } else {
                str4 = null;
            }
            GQLCallInputCInputShape1S0000000 A0L = C86154wM.A0L();
            A0L.A0D(str5, "order_id");
            A0L.A0D(str6, "typed_container_id");
            A0L.A0B(A002, "total_amount");
            A0L.A0D(str7, "buyer_phone_number");
            A0L.A0D(str8, "buyer_email");
            A0L.A0D(str9, "buyer_name");
            A0L.A0D(str, "shipping_address_id");
            A0L.A0A("discounts", A0x);
            A0L.A0A("discount_lines", arrayList);
            A0L.A0D(str10, "pixel_id");
            A0L.A0D(str11, "event_id");
            A0L.A0D(str2, "event_source_url");
            A0L.A0D(str3, "ad_id");
            A0L.A0D(str4, "payment_product_id");
            C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape8S0301000_I2((Object) checkoutHandler, (Object) A0L, (Object) eCPPaymentResponseParams2, (C146958n9) null, 43), C121437Gd.A01(), 3);
            return r9;
        }
        throw C18180wK.A0a("Update order mutation is already in progress. Cannot handle new payment responses from ECP concurrently");
    }

    public final M5J D7U() {
        return this.A00.A0T;
    }

    public final M5J ACm() {
        return C880856r.A03();
    }

    public final M5J ACn() {
        return C880856r.A02();
    }

    public final M5J CWD() {
        return C880856r.A02();
    }
}
