package com.facebookpay.expresscheckout.models;

import X.C04220Ms;
import X.C86124wJ;
import android.os.Parcel;
import android.os.Parcelable;

public final class AuthScreenStyle implements Parcelable {
    public static final Parcelable.Creator CREATOR = C86124wJ.A0X(11);
    public final int A00;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C04220Ms.A0B(parcel, 0);
        parcel.writeInt(this.A00);
    }

    public AuthScreenStyle(int i) {
        this.A00 = i;
    }

    public AuthScreenStyle() {
        this(0);
    }
}
