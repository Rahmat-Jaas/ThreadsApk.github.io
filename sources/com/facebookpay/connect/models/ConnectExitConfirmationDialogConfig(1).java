package com.facebookpay.connect.models;

import X.C04220Ms;
import X.C86124wJ;
import android.os.Parcel;
import android.os.Parcelable;

public final class ConnectExitConfirmationDialogConfig implements Parcelable {
    public static final Parcelable.Creator CREATOR = C86124wJ.A0X(5);
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C04220Ms.A0B(parcel, 0);
        parcel.writeInt(this.A05);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A04);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A03);
        parcel.writeInt(this.A01);
    }

    public ConnectExitConfirmationDialogConfig(int i, int i2, int i3, int i4, int i5, int i6) {
        this.A05 = i;
        this.A00 = i2;
        this.A04 = i3;
        this.A02 = i4;
        this.A03 = i5;
        this.A01 = i6;
    }

    public ConnectExitConfirmationDialogConfig() {
        this(2131824286, 2131824281, 2131824285, 2131824283, 2131824284, 2131824282);
    }
}
