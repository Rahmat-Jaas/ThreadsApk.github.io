package com.facebookpay.expresscheckout.models;

import X.C04220Ms;
import X.C86124wJ;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;

public final class PaymentReceiverInfo implements Parcelable {
    public static final Parcelable.Creator CREATOR = C86124wJ.A0X(34);
    @SerializedName("clientReceiverId")
    public final String A00;
    @SerializedName("receiverIconUrl")
    public final String A01;
    @SerializedName("receiverId")
    public final String A02;
    @SerializedName("receiverName")
    public final String A03;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C04220Ms.A0B(parcel, 0);
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
        parcel.writeString(this.A01);
        parcel.writeString(this.A00);
    }

    public PaymentReceiverInfo(String str, String str2, String str3, String str4) {
        this.A02 = str;
        this.A03 = str2;
        this.A01 = str3;
        this.A00 = str4;
    }

    public PaymentReceiverInfo() {
        this((String) null, (String) null, (String) null, (String) null);
    }
}
