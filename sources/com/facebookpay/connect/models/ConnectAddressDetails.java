package com.facebookpay.connect.models;

import X.C04220Ms;
import X.C86124wJ;
import android.os.Parcel;
import android.os.Parcelable;

public final class ConnectAddressDetails implements Parcelable {
    public static final Parcelable.Creator CREATOR = C86124wJ.A0X(1);
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C04220Ms.A0B(parcel, 0);
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
        parcel.writeString(this.A04);
        parcel.writeString(this.A05);
    }

    public ConnectAddressDetails(String str, String str2, String str3, String str4, String str5, String str6) {
        this.A02 = str;
        this.A03 = str2;
        this.A00 = str3;
        this.A01 = str4;
        this.A04 = str5;
        this.A05 = str6;
    }

    public ConnectAddressDetails() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null);
    }
}
