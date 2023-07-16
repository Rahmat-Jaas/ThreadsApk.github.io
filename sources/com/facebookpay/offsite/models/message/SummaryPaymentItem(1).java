package com.facebookpay.offsite.models.message;

import X.AnonymousClass0wJ;
import X.C04220Ms;
import com.google.gson.annotations.SerializedName;

public final class SummaryPaymentItem {
    @SerializedName("amount")
    public final PaymentCurrencyAmount amount;
    @SerializedName("label")
    public final String label;
    @SerializedName("summaryItemType")
    public final String summaryItemType;

    public final PaymentCurrencyAmount getAmount() {
        return this.amount;
    }

    public final String getLabel() {
        return this.label;
    }

    public final String getSummaryItemType() {
        return this.summaryItemType;
    }

    public SummaryPaymentItem(String str, PaymentCurrencyAmount paymentCurrencyAmount, String str2) {
        AnonymousClass0wJ.A1O(str, paymentCurrencyAmount);
        C04220Ms.A0B(str2, 3);
        this.label = str;
        this.amount = paymentCurrencyAmount;
        this.summaryItemType = str2;
    }
}
