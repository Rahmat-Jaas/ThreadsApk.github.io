package com.facebookpay.offsite.models.message;

import X.AnonymousClass0wJ;
import X.C04220Ms;
import X.C18180wK;
import com.google.gson.annotations.SerializedName;
import java.util.Date;
import kotlin.jvm.internal.DefaultConstructorMarker;

public class PaymentFulfillmentOption {
    @SerializedName("amount")
    public final PaymentCurrencyAmount amount;
    @SerializedName("dateTimeRangeEnd")
    public final Date dateTimeRangeEnd;
    @SerializedName("dateTimeRangeStart")
    public final Date dateTimeRangeStart;
    @SerializedName("id")
    public final String id;
    @SerializedName("label")
    public final String label;
    @SerializedName("selected")
    public final Boolean selected;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PaymentFulfillmentOption(String str, String str2, PaymentCurrencyAmount paymentCurrencyAmount, Date date, Date date2, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, paymentCurrencyAmount, date, date2, (i & 32) != 0 ? C18180wK.A0X() : bool);
    }

    public PaymentCurrencyAmount getAmount() {
        return this.amount;
    }

    public Date getDateTimeRangeEnd() {
        return this.dateTimeRangeEnd;
    }

    public Date getDateTimeRangeStart() {
        return this.dateTimeRangeStart;
    }

    public String getId() {
        return this.id;
    }

    public String getLabel() {
        return this.label;
    }

    public Boolean getSelected() {
        return this.selected;
    }

    public PaymentFulfillmentOption(String str, String str2, PaymentCurrencyAmount paymentCurrencyAmount, Date date, Date date2, Boolean bool) {
        AnonymousClass0wJ.A1O(str, str2);
        C04220Ms.A0B(paymentCurrencyAmount, 3);
        this.id = str;
        this.label = str2;
        this.amount = paymentCurrencyAmount;
        this.dateTimeRangeStart = date;
        this.dateTimeRangeEnd = date2;
        this.selected = bool;
    }
}
