package com.facebookpay.connect.models;

import X.C04220Ms;
import X.C86124wJ;
import android.os.Parcel;
import android.os.Parcelable;

public final class ConnectErrorDialogConfig implements Parcelable {
    public static final Parcelable.Creator CREATOR = C86124wJ.A0X(4);
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C04220Ms.A0B(parcel, 0);
        parcel.writeInt(this.A03);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A01);
    }

    public ConnectErrorDialogConfig(int i, int i2, int i3, int i4) {
        this.A03 = i;
        this.A00 = i2;
        this.A02 = i3;
        this.A01 = i4;
    }

    public ConnectErrorDialogConfig() {
        this(2131824274, 2131824271, 2131824273, 2131824272);
    }
}
