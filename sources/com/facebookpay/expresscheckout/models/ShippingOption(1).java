package com.facebookpay.expresscheckout.models;

import X.AnonymousClass0wJ;
import X.C04220Ms;
import X.C116886xi;
import X.C86124wJ;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebookpay.common.models.CurrencyAmount;
import com.google.gson.annotations.SerializedName;

public final class ShippingOption implements Parcelable {
    public static final Parcelable.Creator CREATOR = C86124wJ.A0X(38);
    @SerializedName("amount")
    public final CurrencyAmount A00;
    @SerializedName("type")
    public final Integer A01;
    @SerializedName("description")
    public final String A02;
    @SerializedName("id")
    public final String A03;
    @SerializedName("label")
    public final String A04;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C04220Ms.A0B(parcel, 0);
        parcel.writeString(this.A03);
        parcel.writeString(C116886xi.A01(this.A01));
        parcel.writeString(this.A04);
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A02);
    }

    public ShippingOption(CurrencyAmount currencyAmount, Integer num, String str, String str2, String str3) {
        AnonymousClass0wJ.A1O(str, num);
        AnonymousClass0wJ.A1R(str2, currencyAmount);
        C04220Ms.A0B(str3, 5);
        this.A03 = str;
        this.A01 = num;
        this.A04 = str2;
        this.A00 = currencyAmount;
        this.A02 = str3;
    }
}
