package com.facebook.video.heroplayer.ipc;

import X.C86144wL;
import android.os.Parcel;
import android.os.Parcelable;

public class ParcelableTimeRange implements Parcelable {
    public static final Parcelable.Creator CREATOR = C86144wL.A0Q(37);
    public final long A00;
    public final long A01;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.A01);
        parcel.writeLong(this.A00);
    }

    public ParcelableTimeRange(long j, long j2) {
        this.A01 = j;
        this.A00 = j2;
    }
}
