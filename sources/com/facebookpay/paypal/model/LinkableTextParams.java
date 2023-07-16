package com.facebookpay.paypal.model;

import X.C04220Ms;
import X.C18180wK;
import X.C86124wJ;
import android.os.Parcel;
import android.os.Parcelable;

public final class LinkableTextParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = C86124wJ.A0X(90);
    public final int A00;
    public final int A01;
    public final String A02;
    public final String A03;

    public LinkableTextParams(String str, int i, int i2, String str2) {
        C18180wK.A1Q(str, 1, str2);
        this.A02 = str;
        this.A00 = i;
        this.A01 = i2;
        this.A03 = str2;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C04220Ms.A0B(parcel, 0);
        parcel.writeString(this.A02);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01);
        parcel.writeString(this.A03);
    }
}
