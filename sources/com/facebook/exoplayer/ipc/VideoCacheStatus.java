package com.facebook.exoplayer.ipc;

import X.C18230wP;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorCreatorShape1S0000000_I2_1;

public final class VideoCacheStatus implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorCreatorShape1S0000000_I2_1(69);
    public String A00;
    public boolean A01;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
        parcel.writeInt(this.A01 ? 1 : 0);
    }

    public VideoCacheStatus(Parcel parcel) {
        this.A00 = parcel.readString();
        this.A01 = C18230wP.A1V(parcel.readInt());
    }
}
