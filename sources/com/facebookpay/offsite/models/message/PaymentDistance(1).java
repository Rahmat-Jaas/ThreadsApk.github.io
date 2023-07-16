package com.facebookpay.offsite.models.message;

import X.C04220Ms;
import com.google.gson.annotations.SerializedName;

public final class PaymentDistance {
    @SerializedName("unit")
    public final String unit;
    @SerializedName("value")
    public final double value;

    public PaymentDistance(double d, String str) {
        C04220Ms.A0B(str, 2);
        this.value = d;
        this.unit = str;
    }

    public final String getUnit() {
        return this.unit;
    }

    public final double getValue() {
        return this.value;
    }
}
