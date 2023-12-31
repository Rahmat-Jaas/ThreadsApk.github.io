package com.facebook.video.heroplayer.ipc;

import X.C86114wI;
import X.C86144wL;
import android.os.Parcel;
import android.os.Parcelable;

public final class AbrContextualSetting implements Parcelable {
    public static final Parcelable.Creator CREATOR = C86144wL.A0Q(22);
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public final boolean A0A;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A04);
        parcel.writeInt(this.A03);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A06);
        parcel.writeInt(this.A07);
        parcel.writeInt(this.A05);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A08);
        parcel.writeInt(this.A09);
        parcel.writeInt(this.A0A ? 1 : 0);
    }

    public AbrContextualSetting(Parcel parcel) {
        this.A02 = parcel.readInt();
        this.A04 = parcel.readInt();
        this.A03 = parcel.readInt();
        this.A01 = parcel.readInt();
        this.A06 = parcel.readInt();
        this.A07 = parcel.readInt();
        this.A05 = parcel.readInt();
        this.A00 = parcel.readInt();
        this.A08 = parcel.readInt();
        this.A09 = parcel.readInt();
        this.A0A = C86114wI.A1V(parcel);
    }

    public AbrContextualSetting() {
        this.A0A = false;
    }
}
