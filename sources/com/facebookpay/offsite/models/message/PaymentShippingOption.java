package com.facebookpay.offsite.models.message;

import X.AnonymousClass0wJ;
import X.C04220Ms;
import X.C18180wK;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class PaymentShippingOption {
    @SerializedName("amount")
    public final PaymentCurrencyAmount amount;
    @SerializedName("id")
    public final String id;
    @SerializedName("label")
    public final String label;
    @SerializedName("secondaryLabel")
    public final String secondaryLabel;
    @SerializedName("selected")
    public final Boolean selected;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PaymentShippingOption(String str, String str2, PaymentCurrencyAmount paymentCurrencyAmount, Boolean bool, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, paymentCurrencyAmount, (i & 8) != 0 ? C18180wK.A0X() : bool, (i & 16) != 0 ? null : str3);
    }

    public final PaymentCurrencyAmount getAmount() {
        return this.amount;
    }

    public final String getId() {
        return this.id;
    }

    public final String getLabel() {
        return this.label;
    }

    public final String getSecondaryLabel() {
        return this.secondaryLabel;
    }

    public final Boolean getSelected() {
        return this.selected;
    }

    public PaymentShippingOption(String str, String str2, PaymentCurrencyAmount paymentCurrencyAmount, Boolean bool, String str3) {
        AnonymousClass0wJ.A1O(str, str2);
        C04220Ms.A0B(paymentCurrencyAmount, 3);
        this.id = str;
        this.label = str2;
        this.amount = paymentCurrencyAmount;
        this.selected = bool;
        this.secondaryLabel = str3;
    }
}
