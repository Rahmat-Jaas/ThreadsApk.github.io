package X;

import com.facebookpay.common.models.CurrencyAmount;
import com.facebookpay.expresscheckout.models.CheckoutConfiguration;
import com.facebookpay.expresscheckout.models.ECPAvailabilityRequestParams;
import com.facebookpay.expresscheckout.models.ECPPaymentConfiguration;
import com.facebookpay.expresscheckout.models.KnownData;
import com.facebookpay.expresscheckout.models.PaymentReceiverInfo;
import com.facebookpay.offsite.base.CheckoutHandler;
import com.facebookpay.offsite.models.message.MessageAvailabilityResponseId$Companion;
import com.facebookpay.offsite.models.message.PaymentConfiguration;
import com.facebookpay.offsite.models.message.PaymentContainerType;
import com.facebookpay.offsite.models.message.PaymentCurrencyAmount;
import com.facebookpay.offsite.models.message.PaymentItem;
import com.facebookpay.offsite.models.message.PaymentMode;
import com.facebookpay.offsite.models.message.PaymentOptions;
import com.facebookpay.offsite.models.message.PaymentRequest;
import com.facebookpay.offsite.models.message.PaymentRequestContent;
import com.facebookpay.offsite.models.message.UriUtils;
import com.fbpay.logging.LoggingPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.coroutines.jvm.internal.KtSLambdaShape15S0201000_I2_1;
import kotlin.coroutines.jvm.internal.KtSLambdaShape2S0601000_I2;

/* renamed from: X.80s  reason: invalid class name and case insensitive filesystem */
public final class C1359380s implements Runnable {
    public final /* synthetic */ C128557jn A00;
    public final /* synthetic */ PaymentRequest A01;

    public C1359380s(C128557jn r1, PaymentRequest paymentRequest) {
        this.A00 = r1;
        this.A01 = paymentRequest;
    }

    public final void run() {
        C971368b r33;
        PaymentCurrencyAmount paymentCurrencyAmount;
        String name;
        C128557jn r8 = this.A00;
        C115316ur A012 = r8.A01();
        if (A012 != null) {
            PaymentRequest paymentRequest = this.A01;
            CheckoutHandler A0P = C86164wN.A0P(r8.A06);
            PaymentRequestContent paymentRequestContent = paymentRequest.content;
            C880856r A03 = C880856r.A03();
            if (!A012.A05 || A0P.A03 == null || !C04220Ms.A0I(CheckoutHandler.A03(A0P), AnonymousClass6IW.A00(paymentRequestContent))) {
                CheckoutHandler.A04(A03, A0P, MessageAvailabilityResponseId$Companion.NOT_AVAILABLE, paymentRequest.msgId);
            } else {
                A0P.A0J(paymentRequest.content);
                LinkedHashMap A0y = C18220wO.A0y();
                Map A0F = A0P.A0F(paymentRequest, A012);
                A0F.put("INITIATOR", "JS_SDK");
                A0P.A0I(AnonymousClass68R.CLIENT_LOAD_OFFSITEAVAILABILITY_INIT, A0F);
                CheckoutHandler.A02(A0P).A03 = A012;
                A0P.A06 = UriUtils.INSTANCE.toUriAuthorityAndPath(A012.A03);
                A0P.A0F = A012.A02;
                PaymentConfiguration paymentConfiguration = paymentRequest.content.paymentConfiguration;
                A0P.A08 = paymentConfiguration.partnerId;
                A0P.A07 = paymentConfiguration.partnerMerchantId;
                PaymentMode paymentMode = paymentConfiguration.mode;
                if (paymentMode == null) {
                    paymentMode = PaymentMode.LIVE;
                }
                A0P.A04 = paymentMode;
                A0P.A0X.set("0");
                PaymentConfiguration paymentConfiguration2 = paymentRequest.content.paymentConfiguration;
                A0P.A0C = paymentConfiguration2.pixelId;
                A0P.A09 = paymentConfiguration2.eventId;
                if (A0P.A0C().BT0()) {
                    A0P.A0H = C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape2S0601000_I2(A012, A03, A0P, paymentRequest, A0F, A0y, (C146958n9) null, 5), C121437Gd.A01(), 3);
                } else if (A0P.A0C().BW9()) {
                    A0P.A0H = C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape15S0201000_I2_1((Object) A0P, (Object) paymentRequest, (C146958n9) null, 1), C121437Gd.A01(), 3);
                    PaymentOptions paymentOptions = paymentRequest.content.paymentOptions;
                    C969767l A002 = CheckoutHandler.A00();
                    C969767l A013 = CheckoutHandler.A01(false);
                    A0P.A0C();
                    AnonymousClass7Kz.A0J();
                    CheckoutConfiguration A014 = C121717Hp.A01(A002, A013, paymentOptions);
                    boolean A09 = AnonymousClass7JJ.A02().A09(AnonymousClass6IW.A00(paymentRequest.content));
                    CheckoutHandler.A02(A0P).A05 = Boolean.valueOf(AnonymousClass7JJ.A02().A0A(AnonymousClass6IW.A00(paymentRequest.content), A014.A0B, A014.A0C));
                    A0P.A01 = AnonymousClass7JJ.A02().A04(AnonymousClass6IW.A00(paymentRequest.content));
                    A0F.put("CACHE_AVAILABLE", Boolean.valueOf(A09));
                    CheckoutHandler.A08(A0P, A012, A0y);
                    AnonymousClass68R r4 = AnonymousClass68R.CLIENT_LOAD_OFFSITEAVAILABILITY_SUCCESS;
                    A0P.A0I = true;
                    CheckoutHandler.A04(A03, A0P, MessageAvailabilityResponseId$Companion.AVAILABLE, paymentRequest.msgId);
                    A0P.A0I(r4, A0F);
                } else {
                    AnonymousClass0MJ A17 = C86144wL.A17();
                    A17.A00 = AnonymousClass68R.CLIENT_LOAD_OFFSITEAVAILABILITY_FAIL;
                    PaymentRequestContent paymentRequestContent2 = paymentRequest.content;
                    String str = A0P.A0B;
                    if (str != null) {
                        String str2 = paymentRequest.msgId;
                        String A0E = A0P.A0E();
                        LoggingPolicy loggingPolicy = C121537Gp.A01;
                        boolean z = A0P.A0Z;
                        AnonymousClass0wJ.A1M(paymentRequestContent2, 0, str2);
                        C04220Ms.A0B(loggingPolicy, 4);
                        PaymentReceiverInfo A02 = C121717Hp.A02(paymentRequestContent2.paymentConfiguration);
                        String A003 = AnonymousClass6IW.A00(paymentRequestContent2);
                        UriUtils uriUtils = UriUtils.INSTANCE;
                        String uriAuthorityAndPath = uriUtils.toUriAuthorityAndPath(A0E);
                        Set A0c = C18250wR.A0c(AnonymousClass68M.UX_SHIPPING_ADDRESS);
                        Set A08 = AnonymousClass4WM.A08(AnonymousClass68F.REQUEST_PAYER_EMAIL, AnonymousClass68F.REQUEST_PAYER_NAME, AnonymousClass68F.REQUEST_PAYER_PHONE);
                        PaymentMode paymentMode2 = paymentRequestContent2.paymentConfiguration.mode;
                        if (paymentMode2 == null || (name = paymentMode2.name()) == null || (r33 = C971368b.valueOf(name)) == null) {
                            r33 = C971368b.LIVE;
                        }
                        String uriAuthorityAndPath2 = uriUtils.toUriAuthorityAndPath(A0E);
                        ArrayList A14 = C06750aI.A14(AnonymousClass67H.CHARGE);
                        PaymentItem paymentItem = paymentRequestContent2.paymentDetails.total;
                        if (paymentItem == null || (paymentCurrencyAmount = paymentItem.amount) == null) {
                            throw AnonymousClass0wJ.A0b();
                        }
                        CurrencyAmount A004 = C121717Hp.A00(paymentCurrencyAmount);
                        Set<PaymentContainerType> keySet = paymentRequestContent2.paymentConfiguration.supportedContainers.keySet();
                        ArrayList A0w = AnonymousClass0wJ.A0w(keySet);
                        Iterator<T> it = keySet.iterator();
                        while (it.hasNext()) {
                            C116866xg.A01(A0w, it);
                        }
                        ECPAvailabilityRequestParams eCPAvailabilityRequestParams = new ECPAvailabilityRequestParams(new ECPPaymentConfiguration(A004, (KnownData) null, r33, (String) null, uriAuthorityAndPath2, A14, A0w, (ArrayList) null, (Map) null, (Set) null), A02, loggingPolicy, str, str2, A003, uriAuthorityAndPath, A0c, A08, 0, true, !z, true);
                        A0P.A02 = eCPAvailabilityRequestParams;
                        C121277Fh.A01(A0P.A0P, A0P.A00.A01(eCPAvailabilityRequestParams), new AnonymousClass7aF(A03, A0P, paymentRequest, A012, A0F, A0y, A17));
                    } else {
                        throw AnonymousClass0wJ.A0b();
                    }
                }
            }
            C86114wI.A1A(r8.A01, A03, r8, 120);
        }
    }
}
