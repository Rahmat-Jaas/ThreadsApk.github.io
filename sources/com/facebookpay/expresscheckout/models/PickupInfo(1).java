package com.facebookpay.expresscheckout.models;

import X.C04220Ms;
import X.C86124wJ;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;

public final class PickupInfo implements Parcelable {
    public static final Parcelable.Creator CREATOR = C86124wJ.A0X(35);
    @SerializedName("pickupEmail")
    public final String A00;
    @SerializedName("pickupName")
    public final String A01;
    @SerializedName("pickupNotes")
    public final String A02;
    @SerializedName("pickupPhone")
    public final String A03;
    @SerializedName("pickupRadiusZipCode")
    public final String A04;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C04220Ms.A0B(parcel, 0);
        parcel.writeString(this.A04);
        parcel.writeString(this.A01);
        parcel.writeString(this.A00);
        parcel.writeString(this.A03);
        parcel.writeString(this.A02);
    }

    public PickupInfo(String str, String str2, String str3, String str4, String str5) {
        this.A04 = str;
        this.A01 = str2;
        this.A00 = str3;
        this.A03 = str4;
        this.A02 = str5;
    }

    public PickupInfo() {
        this((String) null, (String) null, (String) null, (String) null, (String) null);
    }
}
