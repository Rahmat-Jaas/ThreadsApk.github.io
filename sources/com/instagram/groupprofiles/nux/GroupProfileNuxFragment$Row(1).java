package com.instagram.groupprofiles.nux;

import X.C04220Ms;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorCreatorShape12S0000000_I2_12;

public final class GroupProfileNuxFragment$Row implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorCreatorShape12S0000000_I2_12(73);
    public final int A00;
    public final int A01;
    public final int A02;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C04220Ms.A0B(parcel, 0);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01);
    }

    public GroupProfileNuxFragment$Row(int i, int i2, int i3) {
        this.A02 = i;
        this.A00 = i2;
        this.A01 = i3;
    }
}
