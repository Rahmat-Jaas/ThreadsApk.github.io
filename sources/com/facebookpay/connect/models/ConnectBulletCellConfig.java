package com.facebookpay.connect.models;

import X.C04220Ms;
import X.C18230wP;
import X.C86124wJ;
import android.os.Parcel;
import android.os.Parcelable;

public final class ConnectBulletCellConfig implements Parcelable {
    public static final Parcelable.Creator CREATOR = C86124wJ.A0X(2);
    public final Integer A00;
    public final String A01;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C04220Ms.A0B(parcel, 0);
        parcel.writeInt(C18230wP.A02(parcel, this.A00));
        parcel.writeString(this.A01);
    }

    public ConnectBulletCellConfig(Integer num, String str) {
        this.A00 = num;
        this.A01 = str;
    }

    public ConnectBulletCellConfig() {
        this((Integer) null, (String) null);
    }
}
