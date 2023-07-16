package com.facebookpay.expresscheckout.models;

import X.C04220Ms;
import X.C86124wJ;
import android.os.Parcel;
import android.os.Parcelable;

public final class PaymentHandledResponseData implements Parcelable {
    public static final Parcelable.Creator CREATOR = C86124wJ.A0X(33);
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C04220Ms.A0B(parcel, 0);
        parcel.writeString("SUBMIT_CONTAINER");
        parcel.writeString(this.A00);
    }

    public PaymentHandledResponseData(String str) {
        this.A00 = str;
    }
}
