package com.facebookpay.offsite.models.message;

import X.AnonymousClass0wJ;
import X.C04220Ms;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class PaymentItem {
    @SerializedName("amount")
    public final PaymentCurrencyAmount amount;
    @SerializedName("contentCategory")
    public final String contentCategory;
    @SerializedName("contentId")
    public final String contentId;
    @SerializedName("contentType")
    public final String contentType;
    @SerializedName("imageURI")
    public final String imageURI;
    @SerializedName("label")
    public final String label;
    @SerializedName("quantity")
    public final String quantity;
    @SerializedName("secondaryLabel")
    public final String secondaryLabel;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PaymentItem(String str, String str2, PaymentCurrencyAmount paymentCurrencyAmount, String str3, String str4, String str5, String str6, String str7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, paymentCurrencyAmount, str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : str6, (i & 128) != 0 ? null : str7);
    }

    public final PaymentCurrencyAmount getAmount() {
        return this.amount;
    }

    public final String getContentCategory() {
        return this.contentCategory;
    }

    public final String getContentId() {
        return this.contentId;
    }

    public final String getContentType() {
        return this.contentType;
    }

    public final String getImageURI() {
        return this.imageURI;
    }

    public final String getLabel() {
        return this.label;
    }

    public final String getQuantity() {
        return this.quantity;
    }

    public final String getSecondaryLabel() {
        return this.secondaryLabel;
    }

    public PaymentItem(String str, String str2, PaymentCurrencyAmount paymentCurrencyAmount, String str3, String str4, String str5, String str6, String str7) {
        AnonymousClass0wJ.A1O(str, str2);
        C04220Ms.A0B(paymentCurrencyAmount, 3);
        this.label = str;
        this.quantity = str2;
        this.amount = paymentCurrencyAmount;
        this.imageURI = str3;
        this.secondaryLabel = str4;
        this.contentId = str5;
        this.contentType = str6;
        this.contentCategory = str7;
    }
}
