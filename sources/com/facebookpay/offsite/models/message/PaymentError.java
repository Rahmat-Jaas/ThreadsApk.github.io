package com.facebookpay.offsite.models.message;

import X.AnonymousClass0wJ;
import com.google.gson.annotations.SerializedName;

public final class PaymentError {
    @SerializedName("code")
    public final String code;
    @SerializedName("message")
    public final String message;

    public final String getCode() {
        return this.code;
    }

    public final String getMessage() {
        return this.message;
    }

    public PaymentError(String str, String str2) {
        AnonymousClass0wJ.A1O(str, str2);
        this.code = str;
        this.message = str2;
    }
}
