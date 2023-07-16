package com.facebookpay.offsite.models.message;

import X.C04220Ms;
import com.google.gson.annotations.SerializedName;

public final class PaymentDataError {
    @SerializedName("field")
    public final PaymentDataErrorField field;
    @SerializedName("message")
    public final String message;
    @SerializedName("reason")
    public final PaymentDataErrorReason reason;

    public PaymentDataError(PaymentDataErrorReason paymentDataErrorReason, PaymentDataErrorField paymentDataErrorField, String str) {
        C04220Ms.A0B(paymentDataErrorReason, 1);
        this.reason = paymentDataErrorReason;
        this.field = paymentDataErrorField;
        this.message = str;
    }

    public final PaymentDataErrorField getField() {
        return this.field;
    }

    public final String getMessage() {
        return this.message;
    }

    public final PaymentDataErrorReason getReason() {
        return this.reason;
    }
}
