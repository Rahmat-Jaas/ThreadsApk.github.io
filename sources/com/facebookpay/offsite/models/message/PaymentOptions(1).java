package com.facebookpay.offsite.models.message;

import com.google.gson.annotations.SerializedName;

public final class PaymentOptions {
    @SerializedName("allowOfferCodes")
    public final boolean allowOfferCodes;
    @SerializedName("billingAddressMode")
    public final String billingAddressMode;
    @SerializedName("fulfillmentType")
    public final String fulfillmentType;
    @SerializedName("marketingPrivacyPolicyUrl")
    public final String marketingPrivacyPolicyUrl;
    @SerializedName("proactive")
    public final boolean proactive;
    @SerializedName("requestBillingAddress")
    public final boolean requestBillingAddress;
    @SerializedName("requestPayerEmail")
    public final boolean requestPayerEmail;
    @SerializedName("requestPayerName")
    public final boolean requestPayerName;
    @SerializedName("requestPayerPhone")
    public final boolean requestPayerPhone;
    @SerializedName("requestPickupEmail")
    public final Boolean requestPickupEmail;
    @SerializedName("requestPickupName")
    public final Boolean requestPickupName;
    @SerializedName("requestPickupPhone")
    public final Boolean requestPickupPhone;
    @SerializedName("requestShipping")
    public final boolean requestShipping;
    @SerializedName("shippingType")
    public final String shippingType;

    public final PaymentOptions createCopy(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, String str, String str2, String str3, boolean z6, boolean z7, String str4, Boolean bool, Boolean bool2, Boolean bool3) {
        return new PaymentOptions(z, z2, z3, z4, z5, str, str2, str3, z6, z7, str4, bool, bool2, bool3);
    }

    public final boolean getAllowOfferCodes() {
        return this.allowOfferCodes;
    }

    public final String getBillingAddressMode() {
        return this.billingAddressMode;
    }

    public final String getFulfillmentType() {
        return this.fulfillmentType;
    }

    public final String getMarketingPrivacyPolicyUrl() {
        return this.marketingPrivacyPolicyUrl;
    }

    public final boolean getProactive() {
        return this.proactive;
    }

    public final boolean getRequestBillingAddress() {
        return this.requestBillingAddress;
    }

    public final boolean getRequestPayerEmail() {
        return this.requestPayerEmail;
    }

    public final boolean getRequestPayerName() {
        return this.requestPayerName;
    }

    public final boolean getRequestPayerPhone() {
        return this.requestPayerPhone;
    }

    public final Boolean getRequestPickupEmail() {
        return this.requestPickupEmail;
    }

    public final Boolean getRequestPickupName() {
        return this.requestPickupName;
    }

    public final Boolean getRequestPickupPhone() {
        return this.requestPickupPhone;
    }

    public final boolean getRequestShipping() {
        return this.requestShipping;
    }

    public final String getShippingType() {
        return this.shippingType;
    }

    public PaymentOptions(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, String str, String str2, String str3, boolean z6, boolean z7, String str4, Boolean bool, Boolean bool2, Boolean bool3) {
        this.requestPayerName = z;
        this.requestPayerPhone = z2;
        this.requestPayerEmail = z3;
        this.requestShipping = z4;
        this.requestBillingAddress = z5;
        this.billingAddressMode = str;
        this.shippingType = str2;
        this.fulfillmentType = str3;
        this.allowOfferCodes = z6;
        this.proactive = z7;
        this.marketingPrivacyPolicyUrl = str4;
        this.requestPickupName = bool;
        this.requestPickupEmail = bool2;
        this.requestPickupPhone = bool3;
    }

    public static /* synthetic */ PaymentOptions createCopy$default(PaymentOptions paymentOptions, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, String str, String str2, String str3, boolean z6, boolean z7, String str4, Boolean bool, Boolean bool2, Boolean bool3, int i, Object obj) {
        int i2 = i;
        Boolean bool4 = bool3;
        boolean z8 = z2;
        boolean z9 = z3;
        boolean z10 = z4;
        boolean z11 = z5;
        String str5 = str;
        String str6 = str2;
        String str7 = str3;
        boolean z12 = z6;
        boolean z13 = z7;
        String str8 = str4;
        Boolean bool5 = bool;
        Boolean bool6 = bool2;
        PaymentOptions paymentOptions2 = paymentOptions;
        if ((i & 1) != 0) {
            z = paymentOptions2.requestPayerName;
        }
        if ((i & 2) != 0) {
            z8 = paymentOptions2.requestPayerPhone;
        }
        if ((i & 4) != 0) {
            z9 = paymentOptions2.requestPayerEmail;
        }
        if ((i & 8) != 0) {
            z10 = paymentOptions2.requestShipping;
        }
        if ((i & 16) != 0) {
            z11 = paymentOptions2.requestBillingAddress;
        }
        if ((i & 32) != 0) {
            str5 = paymentOptions2.billingAddressMode;
        }
        if ((i & 64) != 0) {
            str6 = paymentOptions2.shippingType;
        }
        if ((i2 & 128) != 0) {
            str7 = paymentOptions2.fulfillmentType;
        }
        if ((i2 & 256) != 0) {
            z12 = paymentOptions2.allowOfferCodes;
        }
        if ((i2 & 512) != 0) {
            z13 = paymentOptions2.proactive;
        }
        if ((i2 & 1024) != 0) {
            str8 = paymentOptions2.marketingPrivacyPolicyUrl;
        }
        if ((i2 & 2048) != 0) {
            bool5 = paymentOptions2.requestPickupName;
        }
        if ((i2 & 4096) != 0) {
            bool6 = paymentOptions2.requestPickupEmail;
        }
        if ((i2 & 8192) != 0) {
            bool4 = paymentOptions2.requestPickupPhone;
        }
        return new PaymentOptions(z, z8, z9, z10, z11, str5, str6, str7, z12, z13, str8, bool5, bool6, bool4);
    }
}
