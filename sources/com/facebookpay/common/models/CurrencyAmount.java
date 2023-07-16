package com.facebookpay.common.models;

import X.AnonymousClass0wJ;
import X.C04220Ms;
import X.C86144wL;
import android.os.Parcel;
import android.os.Parcelable;
import com.fbpay.ptt.SerializedName;

public final class CurrencyAmount implements Parcelable {
    public static final Parcelable.Creator CREATOR = C86144wL.A0Q(60);
    @SerializedName("currency")
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

    public CurrencyAmount(String str, String str2) {
        AnonymousClass0wJ.A1O(str, str2);
        this.A00 = str;
        this.A01 = str2;
    }
}
