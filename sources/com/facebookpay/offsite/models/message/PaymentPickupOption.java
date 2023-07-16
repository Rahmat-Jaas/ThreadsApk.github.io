package com.facebookpay.offsite.models.message;

import X.AnonymousClass0wJ;
import X.C18180wK;
import X.C86104wH;
import com.google.gson.annotations.SerializedName;
import java.util.Date;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class PaymentPickupOption extends PaymentFulfillmentOption {
    @SerializedName("pickupLocationAddress")
    public final W3CShippingAddress pickupLocationAddress;
    @SerializedName("pickupStoreAvailability")
    public final boolean pickupStoreAvailability;
    @SerializedName("pickupStoreDistance")
    public final PaymentDistance pickupStoreDistance;

    public final W3CShippingAddress getPickupLocationAddress() {
        return this.pickupLocationAddress;
    }

    public final boolean getPickupStoreAvailability() {
        return this.pickupStoreAvailability;
    }

    public final PaymentDistance getPickupStoreDistance() {
        return this.pickupStoreDistance;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PaymentPickupOption(String str, String str2, PaymentCurrencyAmount paymentCurrencyAmount, Date date, Date date2, Boolean bool, W3CShippingAddress w3CShippingAddress, boolean z, PaymentDistance paymentDistance) {
        super(str, str2, paymentCurrencyAmount, date, date2, bool);
        AnonymousClass0wJ.A1O(str, str2);
        C86104wH.A1P(paymentCurrencyAmount, 3, w3CShippingAddress);
        this.pickupLocationAddress = w3CShippingAddress;
        this.pickupStoreAvailability = z;
        this.pickupStoreDistance = paymentDistance;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PaymentPickupOption(String str, String str2, PaymentCurrencyAmount paymentCurrencyAmount, Date date, Date date2, Boolean bool, W3CShippingAddress w3CShippingAddress, boolean z, PaymentDistance paymentDistance, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, paymentCurrencyAmount, date, date2, (i & 32) != 0 ? C18180wK.A0X() : bool, w3CShippingAddress, z, paymentDistance);
    }
}
