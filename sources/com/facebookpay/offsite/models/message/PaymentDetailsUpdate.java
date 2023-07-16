package com.facebookpay.offsite.models.message;

import com.google.gson.annotations.SerializedName;
import java.util.List;

public final class PaymentDetailsUpdate {
    @SerializedName("errors")
    public final List<PaymentDataError> errors;
    @SerializedName("offerCodeErrors")
    public final PaymentDetailsUpdatedError offerCodeErrors;
    @SerializedName("paymentDetails")
    public final PaymentDetails paymentDetails;
    @SerializedName("shippingAddressErrors")
    public final PaymentDetailsUpdatedError shippingAddressErrors;

    public static /* synthetic */ PaymentDetailsUpdate createCopy$default(PaymentDetailsUpdate paymentDetailsUpdate, PaymentDetailsUpdatedError paymentDetailsUpdatedError, PaymentDetailsUpdatedError paymentDetailsUpdatedError2, PaymentDetails paymentDetails2, List<PaymentDataError> list, int i, Object obj) {
        if ((i & 1) != 0) {
            paymentDetailsUpdatedError = paymentDetailsUpdate.shippingAddressErrors;
        }
        if ((i & 2) != 0) {
            paymentDetailsUpdatedError2 = paymentDetailsUpdate.offerCodeErrors;
        }
        if ((i & 4) != 0) {
            paymentDetails2 = paymentDetailsUpdate.paymentDetails;
        }
        if ((i & 8) != 0) {
            list = paymentDetailsUpdate.errors;
        }
        return new PaymentDetailsUpdate(paymentDetailsUpdatedError, paymentDetailsUpdatedError2, paymentDetails2, list);
    }

    public final PaymentDetailsUpdate createCopy(PaymentDetailsUpdatedError paymentDetailsUpdatedError, PaymentDetailsUpdatedError paymentDetailsUpdatedError2, PaymentDetails paymentDetails2, List list) {
        return new PaymentDetailsUpdate(paymentDetailsUpdatedError, paymentDetailsUpdatedError2, paymentDetails2, list);
    }

    public final List getErrors() {
        return this.errors;
    }

    public final PaymentDetailsUpdatedError getOfferCodeErrors() {
        return this.offerCodeErrors;
    }

    public final PaymentDetails getPaymentDetails() {
        return this.paymentDetails;
    }

    public final PaymentDetailsUpdatedError getShippingAddressErrors() {
        return this.shippingAddressErrors;
    }

    public PaymentDetailsUpdate(PaymentDetailsUpdatedError paymentDetailsUpdatedError, PaymentDetailsUpdatedError paymentDetailsUpdatedError2, PaymentDetails paymentDetails2, List list) {
        this.shippingAddressErrors = paymentDetailsUpdatedError;
        this.offerCodeErrors = paymentDetailsUpdatedError2;
        this.paymentDetails = paymentDetails2;
        this.errors = list;
    }
}
