package com.google.android.exoplayer2.metadata.scte35;

import X.C86124wJ;
import android.os.Parcel;
import android.os.Parcelable;

public final class PrivateCommand extends SpliceCommand {
    public static final Parcelable.Creator CREATOR = C86124wJ.A0Y(45);
    public final long A00;
    public final long A01;
    public final byte[] A02;

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.A01);
        parcel.writeLong(this.A00);
        byte[] bArr = this.A02;
        parcel.writeInt(bArr.length);
        parcel.writeByteArray(bArr);
    }

    public PrivateCommand(long j, long j2, byte[] bArr) {
        this.A01 = j2;
        this.A00 = j;
        this.A02 = bArr;
    }

    public PrivateCommand(Parcel parcel) {
        this.A01 = parcel.readLong();
        this.A00 = parcel.readLong();
        byte[] bArr = new byte[parcel.readInt()];
        this.A02 = bArr;
        parcel.readByteArray(bArr);
    }
}
