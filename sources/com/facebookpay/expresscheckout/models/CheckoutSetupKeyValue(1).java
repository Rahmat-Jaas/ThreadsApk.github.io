package com.facebookpay.expresscheckout.models;

import X.AnonymousClass0wJ;
import X.C04220Ms;
import X.C86124wJ;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;

public final class CheckoutSetupKeyValue implements Parcelable {
    public static final Parcelable.Creator CREATOR = C86124wJ.A0X(14);
    @SerializedName("key")
    public final String A00;
    @SerializedName("value")
    public final String A01;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C04220Ms.A0B(parcel, 0);
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
    }

    public CheckoutSetupKeyValue(String str, String str2) {
        AnonymousClass0wJ.A1O(str, str2);
        this.A00 = str;
        this.A01 = str2;
    }
}
