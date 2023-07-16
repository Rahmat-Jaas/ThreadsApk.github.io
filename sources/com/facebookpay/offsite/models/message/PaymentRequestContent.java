package com.facebookpay.offsite.models.message;

import X.AnonymousClass0wJ;
import X.C04220Ms;
import com.google.gson.annotations.SerializedName;

public final class PaymentRequestContent {
    @SerializedName("paymentConfiguration")
    public final PaymentConfiguration paymentConfiguration;
    @SerializedName("paymentDetails")
    public final PaymentDetails paymentDetails;
    @SerializedName("paymentOptions")
    public final PaymentOptions paymentOptions;

    public static /* synthetic */ PaymentRequestContent createCopy$default(PaymentRequestContent paymentRequestContent, PaymentDetails paymentDetails2, PaymentOptions paymentOptions2, PaymentConfiguration paymentConfiguration2, int i, Object obj) {
        if ((i & 1) != 0) {
            paymentDetails2 = paymentRequestContent.paymentDetails;
        }
        if ((i & 2) != 0) {
            paymentOptions2 = paymentRequestContent.paymentOptions;
        }
        if ((i & 4) != 0) {
            paymentConfiguration2 = paymentRequestContent.paymentConfiguration;
        }
        return paymentRequestContent.createCopy(paymentDetails2, paymentOptions2, paymentConfiguration2);
    }

    public final PaymentConfiguration getPaymentConfiguration() {
        return this.paymentConfiguration;
    }

    public final PaymentDetails getPaymentDetails() {
        return this.paymentDetails;
    }

    public final PaymentOptions getPaymentOptions() {
        return this.paymentOptions;
    }

    public PaymentRequestContent(PaymentDetails paymentDetails2, PaymentOptions paymentOptions2, PaymentConfiguration paymentConfiguration2) {
        AnonymousClass0wJ.A1O(paymentDetails2, paymentOptions2);
        C04220Ms.A0B(paymentConfiguration2, 3);
        this.paymentDetails = paymentDetails2;
        this.paymentOptions = paymentOptions2;
        this.paymentConfiguration = paymentConfiguration2;
    }

    public final PaymentRequestContent createCopy(PaymentDetails paymentDetails2, PaymentOptions paymentOptions2, PaymentConfiguration paymentConfiguration2) {
        AnonymousClass0wJ.A1N(paymentDetails2, paymentOptions2);
        C04220Ms.A0B(paymentConfiguration2, 2);
        return new PaymentRequestContent(paymentDetails2, paymentOptions2, paymentConfiguration2);
    }
}
