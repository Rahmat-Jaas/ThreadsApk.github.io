package com.facebook.video.heroplayer.ipc;

import X.C86114wI;
import X.C86144wL;
import android.os.Parcel;
import android.os.Parcelable;

public final class VideoPlayContextualSetting implements Parcelable {
    public static final Parcelable.Creator CREATOR = C86144wL.A0Q(46);
    public int A00;
    public final boolean A01;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01 ? 1 : 0);
    }

    public VideoPlayContextualSetting(Parcel parcel) {
        this.A00 = parcel.readInt();
        this.A01 = C86114wI.A1V(parcel);
    }

    public VideoPlayContextualSetting() {
        this.A01 = false;
    }
}
