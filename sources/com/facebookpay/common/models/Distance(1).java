package com.facebookpay.common.models;

import X.C04220Ms;
import X.C86144wL;
import android.os.Parcel;
import android.os.Parcelable;
import com.fbpay.ptt.SerializedName;

public final class Distance implements Parcelable {
    public static final Parcelable.Creator CREATOR = C86144wL.A0Q(61);
    @SerializedName("value")
    public final double A00;
    @SerializedName("unit")
    public final Integer A01;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        C04220Ms.A0B(parcel, 0);
        parcel.writeDouble(this.A00);
        if (this.A01.intValue() != 0) {
            str = "KILOMETERS";
        } else {
            str = "MILES";
        }
        parcel.writeString(str);
    }

    public Distance(Integer num, double d) {
        this.A00 = d;
        this.A01 = num;
    }
}
