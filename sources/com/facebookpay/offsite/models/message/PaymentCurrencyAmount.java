package com.facebookpay.offsite.models.message;

import X.AnonymousClass0wJ;
import com.google.gson.annotations.SerializedName;

public final class PaymentCurrencyAmount {
    @SerializedName("currency")
    public final String currency;
    @SerializedName("value")
    public final String value;

    public final String getCurrency() {
        return this.currency;
    }

    public final String getValue() {
        return this.value;
    }

    public PaymentCurrencyAmount(String str, String str2) {
        AnonymousClass0wJ.A1O(str, str2);
        this.currency = str;
        this.value = str2;
    }
}
