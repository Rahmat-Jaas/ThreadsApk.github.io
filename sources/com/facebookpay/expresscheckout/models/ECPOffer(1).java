package com.facebookpay.expresscheckout.models;

import X.AnonymousClass0wJ;
import X.C04220Ms;
import X.C86124wJ;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;

public final class ECPOffer implements Parcelable {
    public static final Parcelable.Creator CREATOR = C86124wJ.A0X(20);
    @SerializedName("discountCode")
    public final String A00;
    @SerializedName("id")
    public final String A01;
    @SerializedName("title")
    public final String A02;
    @SerializedName("expirationDateText")
    public final String A03;
    @SerializedName("subtitle")
    public final String A04;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C04220Ms.A0B(parcel, 0);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        parcel.writeString(this.A04);
        parcel.writeString(this.A00);
        parcel.writeString(this.A03);
    }

    public ECPOffer(String str, String str2, String str3, String str4, String str5) {
        AnonymousClass0wJ.A1O(str, str2);
        AnonymousClass0wJ.A1R(str3, str4);
        C04220Ms.A0B(str5, 5);
        this.A01 = str;
        this.A02 = str2;
        this.A04 = str3;
        this.A00 = str4;
        this.A03 = str5;
    }
}
