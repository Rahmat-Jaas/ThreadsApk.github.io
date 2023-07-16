package X;

import com.facebookpay.common.models.CurrencyAmount;
import com.facebookpay.expresscheckout.models.APMConfiguration;
import com.facebookpay.expresscheckout.models.CheckoutConfiguration;
import com.facebookpay.expresscheckout.models.CheckoutSetupKeyValue;
import com.facebookpay.expresscheckout.models.ECPPaymentResponseParams;
import com.facebookpay.expresscheckout.models.FulfillmentOption;
import com.facebookpay.expresscheckout.models.PaymentReceiverInfo;
import com.facebookpay.expresscheckout.models.ShippingOption;
import com.facebookpay.offsite.models.message.PaymentConfiguration;
import com.facebookpay.offsite.models.message.PaymentContainer;
import com.facebookpay.offsite.models.message.PaymentContainerType;
import com.facebookpay.offsite.models.message.PaymentCurrencyAmount;
import com.facebookpay.offsite.models.message.PaymentMode;
import com.facebookpay.offsite.models.message.PaymentOptions;
import com.facebookpay.offsite.models.message.PaymentRequest;
import com.facebookpay.offsite.models.message.PaymentRequestContent;
import com.facebookpay.offsite.models.message.PaymentResponseContent;
import com.facebookpay.offsite.models.message.W3CShippingAddress;
import com.facebookpay.shippingaddress.model.ShippingAddress;
import com.instagram.service.session.UserSession;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.Pair;

/* renamed from: X.7Hp  reason: invalid class name and case insensitive filesystem */
public final class C121717Hp {
    public static final CurrencyAmount A00(PaymentCurrencyAmount paymentCurrencyAmount) {
        C04220Ms.A0B(paymentCurrencyAmount, 0);
        return new CurrencyAmount(paymentCurrencyAmount.currency, paymentCurrencyAmount.value);
    }

    public static final CheckoutConfiguration A01(C969767l r20, C969767l r21, PaymentOptions paymentOptions) {
        String str;
        AnonymousClass68M r0;
        PaymentOptions paymentOptions2 = paymentOptions;
        C04220Ms.A0B(paymentOptions2, 0);
        LinkedHashSet A0u = C86134wK.A0u();
        boolean A03 = AnonymousClass7Kz.A0J().A03();
        if (paymentOptions2.requestShipping || ((A03 && C04220Ms.A0I(paymentOptions2.shippingType, "PICKUP")) || C04220Ms.A0I(paymentOptions2.fulfillmentType, "PICKUP"))) {
            A0u.add(AnonymousClass68M.UX_FULFILLMENT_OPTIONS);
        }
        if (paymentOptions2.requestShipping) {
            A0u.add(AnonymousClass68M.UX_SHIPPING_ADDRESS);
        }
        if (paymentOptions2.allowOfferCodes) {
            if (C63803iN.A0E(AnonymousClass0TJ.A05, AnonymousClass7HK.A00(), 36323174077439698L)) {
                r0 = AnonymousClass68M.UX_INCENTIVES;
            } else {
                r0 = AnonymousClass68M.UX_PROMO_CODE;
            }
            A0u.add(r0);
        }
        LinkedHashSet A0u2 = C86134wK.A0u();
        A0u2.add(AnonymousClass68F.REQUEST_BILLING_ADDRESS);
        if (paymentOptions2.requestPayerEmail) {
            A0u2.add(AnonymousClass68F.REQUEST_PAYER_EMAIL);
        }
        if (paymentOptions2.requestPayerName) {
            A0u2.add(AnonymousClass68F.REQUEST_PAYER_NAME);
        }
        if (paymentOptions2.requestPayerPhone) {
            A0u2.add(AnonymousClass68F.REQUEST_PAYER_PHONE);
        }
        if (C04220Ms.A0I(paymentOptions2.requestPickupName, true)) {
            A0u2.add(AnonymousClass68F.REQUEST_PICKUP_NAME);
        }
        if (C04220Ms.A0I(paymentOptions2.requestPickupEmail, true)) {
            A0u2.add(AnonymousClass68F.REQUEST_PICKUP_EMAIL);
        }
        if (C04220Ms.A0I(paymentOptions2.requestPickupPhone, true)) {
            A0u2.add(AnonymousClass68F.REQUEST_PICKUP_PHONE);
        }
        Set unmodifiableSet = Collections.unmodifiableSet(A0u);
        C04220Ms.A06(unmodifiableSet);
        Set unmodifiableSet2 = Collections.unmodifiableSet(A0u2);
        C04220Ms.A06(unmodifiableSet2);
        UserSession A00 = AnonymousClass7HK.A00();
        AnonymousClass0TJ r5 = AnonymousClass0TJ.A06;
        Boolean A05 = C63803iN.A05(r5, A00, 36315735194929910L);
        Boolean A052 = C63803iN.A05(r5, AnonymousClass7HK.A00(), 36315735194929910L);
        Boolean A053 = C63803iN.A05(r5, AnonymousClass7HK.A00(), 36315735195060984L);
        Boolean valueOf = Boolean.valueOf(A03);
        if (paymentOptions2.requestPayerEmail) {
            str = paymentOptions2.marketingPrivacyPolicyUrl;
        } else {
            str = null;
        }
        return new CheckoutConfiguration((APMConfiguration) null, r20, r21, A05, A052, A053, valueOf, false, (String) null, (String) null, str, unmodifiableSet, unmodifiableSet2, true);
    }

    public static final PaymentReceiverInfo A02(PaymentConfiguration paymentConfiguration) {
        C04220Ms.A0B(paymentConfiguration, 0);
        return new PaymentReceiverInfo(C86154wM.A0o(Locale.ROOT, "%s::%s", C86144wL.A1a(paymentConfiguration.partnerId, paymentConfiguration.partnerMerchantId)), paymentConfiguration.merchantName, (String) null, (String) null);
    }

    public static final PaymentResponseContent A03(ECPPaymentResponseParams eCPPaymentResponseParams, PaymentRequest paymentRequest) {
        PaymentMode paymentMode;
        PaymentContainerType paymentContainerType;
        W3CShippingAddress w3CShippingAddress;
        W3CShippingAddress w3CShippingAddress2;
        String str;
        PaymentRequestContent paymentRequestContent;
        PaymentOptions paymentOptions;
        ShippingAddress shippingAddress;
        ECPPaymentResponseParams eCPPaymentResponseParams2 = eCPPaymentResponseParams;
        C04220Ms.A0B(eCPPaymentResponseParams2, 0);
        String str2 = eCPPaymentResponseParams2.A0O;
        String str3 = eCPPaymentResponseParams2.A09;
        String str4 = eCPPaymentResponseParams2.A0I;
        Locale locale = Locale.ROOT;
        C04220Ms.A08(locale);
        if ("LIVE".equals(C18220wO.A0u(locale, str4))) {
            paymentMode = PaymentMode.LIVE;
        } else {
            paymentMode = PaymentMode.TEST;
        }
        String str5 = eCPPaymentResponseParams2.A0H;
        String str6 = eCPPaymentResponseParams2.A0B;
        if (str6 != null) {
            paymentContainerType = PaymentContainerType.Companion.fromString(str6);
        } else {
            paymentContainerType = null;
        }
        PaymentContainer paymentContainer = new PaymentContainer(str3, paymentMode, str5, paymentContainerType);
        String str7 = eCPPaymentResponseParams2.A08;
        String str8 = eCPPaymentResponseParams2.A0F;
        String str9 = eCPPaymentResponseParams2.A0E;
        String str10 = eCPPaymentResponseParams2.A0G;
        ShippingAddress shippingAddress2 = eCPPaymentResponseParams2.A06;
        if (shippingAddress2 != null) {
            w3CShippingAddress = C116926xq.A00(shippingAddress2);
        } else {
            w3CShippingAddress = null;
        }
        PaymentRequest paymentRequest2 = paymentRequest;
        if (paymentRequest == null || (paymentRequestContent = paymentRequest2.content) == null || (paymentOptions = paymentRequestContent.paymentOptions) == null || !paymentOptions.requestBillingAddress || (shippingAddress = eCPPaymentResponseParams2.A05) == null) {
            w3CShippingAddress2 = null;
        } else {
            w3CShippingAddress2 = C116926xq.A00(shippingAddress);
        }
        FulfillmentOption fulfillmentOption = eCPPaymentResponseParams2.A00;
        if (fulfillmentOption != null) {
            str = fulfillmentOption.A00();
        } else {
            ShippingOption shippingOption = eCPPaymentResponseParams2.A01;
            if (shippingOption != null) {
                str = shippingOption.A03;
            } else {
                str = null;
            }
        }
        return new PaymentResponseContent(str2, paymentContainer, str7, str8, str9, str10, w3CShippingAddress, w3CShippingAddress2, str, (String) null, eCPPaymentResponseParams2.A0K, eCPPaymentResponseParams2.A0J, eCPPaymentResponseParams2.A0L, (ArrayList) null, Boolean.valueOf(eCPPaymentResponseParams2.A0R));
    }

    public static final List A04(PaymentRequestContent paymentRequestContent, Pair... pairArr) {
        String name;
        C04220Ms.A0B(paymentRequestContent, 0);
        ArrayList A0v = AnonymousClass0wJ.A0v();
        int i = 0;
        while (true) {
            if (i < r6) {
                if (C04220Ms.A0I(pairArr[i].A00, "PROCESSING_MODE")) {
                    break;
                }
                i++;
            } else {
                PaymentMode paymentMode = paymentRequestContent.paymentConfiguration.mode;
                if (paymentMode != null && (name = paymentMode.name()) != null) {
                    A0v.add(new CheckoutSetupKeyValue("PROCESSING_MODE", name));
                }
            }
        }
        A0v.add(new CheckoutSetupKeyValue("CONTAINER_CONTEXT", paymentRequestContent.paymentConfiguration.containerContext));
        String str = paymentRequestContent.paymentConfiguration.merchantName;
        if (str != null) {
            A0v.add(new CheckoutSetupKeyValue("MERCHANT_NAME", str));
        }
        PaymentConfiguration paymentConfiguration = paymentRequestContent.paymentConfiguration;
        C04220Ms.A0B(paymentConfiguration, 0);
        String str2 = new PaymentReceiverInfo((String) null, paymentConfiguration.merchantName, (String) null, C86154wM.A0o(Locale.ROOT, "%s::%s", C86144wL.A1a(paymentConfiguration.partnerId, paymentConfiguration.partnerMerchantId))).A00;
        if (str2 != null) {
            A0v.add(new CheckoutSetupKeyValue("CLIENT_RECEIVER_ID", str2));
        }
        ArrayList A0v2 = AnonymousClass0wJ.A0v();
        for (Pair pair : pairArr) {
            String str3 = (String) pair.A01;
            if (str3 != null) {
                A0v2.add(new CheckoutSetupKeyValue((String) pair.A00, str3));
            }
        }
        C000300e.A0u(A0v, A0v2.toArray(new CheckoutSetupKeyValue[0]));
        return A0v;
    }
}
