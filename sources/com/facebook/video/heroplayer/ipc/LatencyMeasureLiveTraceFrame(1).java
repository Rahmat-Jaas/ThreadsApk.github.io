package com.facebook.video.heroplayer.ipc;

import X.C86144wL;
import android.os.Parcel;
import android.os.Parcelable;

public class LatencyMeasureLiveTraceFrame implements Parcelable {
    public static final Parcelable.Creator CREATOR = C86144wL.A0Q(33);
    public final int A00;
    public final int A01;
    public final long A02;
    public final String A03;
    public final long[] A04;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        long[] jArr = this.A04;
        parcel.writeInt(jArr.length);
        parcel.writeLongArray(jArr);
        parcel.writeInt(this.A00);
        parcel.writeString(this.A03);
        parcel.writeInt(this.A01);
        parcel.writeLong(this.A02);
    }

    public LatencyMeasureLiveTraceFrame(Parcel parcel) {
        long[] jArr = new long[parcel.readInt()];
        this.A04 = jArr;
        parcel.readLongArray(jArr);
        this.A00 = parcel.readInt();
        this.A03 = parcel.readString();
        this.A01 = parcel.readInt();
        this.A02 = parcel.readLong();
    }

    public LatencyMeasureLiveTraceFrame(String str, long[] jArr, int i, int i2, long j) {
        this.A04 = jArr;
        this.A00 = i;
        this.A03 = str;
        this.A01 = i2;
        this.A02 = j;
    }
}
