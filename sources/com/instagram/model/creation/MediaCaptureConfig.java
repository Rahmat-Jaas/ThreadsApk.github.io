package com.instagram.model.creation;

import X.C25818DsX;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorCreatorShape13S0000000_I2_13;
import com.instagram.music.common.config.MusicAttributionConfig;

public class MediaCaptureConfig implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorCreatorShape13S0000000_I2_13(50);
    public MusicAttributionConfig A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.A0A ? (byte) 1 : 0);
        parcel.writeByte(this.A08 ? (byte) 1 : 0);
        parcel.writeByte(this.A04 ? (byte) 1 : 0);
        parcel.writeByte(this.A07 ? (byte) 1 : 0);
        parcel.writeByte(this.A01 ? (byte) 1 : 0);
        parcel.writeByte(this.A02 ? (byte) 1 : 0);
        parcel.writeByte(this.A06 ? (byte) 1 : 0);
        parcel.writeByte(this.A03 ? (byte) 1 : 0);
        parcel.writeParcelable(this.A00, i);
        parcel.writeByte(this.A09 ? (byte) 1 : 0);
        parcel.writeByte(this.A05 ? (byte) 1 : 0);
    }

    public MediaCaptureConfig(Parcel parcel) {
        boolean z = true;
        this.A0A = parcel.readByte() != 0;
        this.A08 = parcel.readByte() != 0;
        this.A04 = parcel.readByte() != 0;
        this.A07 = parcel.readByte() != 0;
        this.A01 = parcel.readByte() != 0;
        this.A02 = parcel.readByte() != 0;
        this.A06 = parcel.readByte() != 0;
        this.A03 = parcel.readByte() != 0;
        this.A00 = (MusicAttributionConfig) parcel.readParcelable(MusicAttributionConfig.class.getClassLoader());
        this.A09 = parcel.readByte() != 0;
        this.A05 = parcel.readByte() == 0 ? false : z;
    }

    public MediaCaptureConfig(C25818DsX dsX) {
        this.A0A = dsX.A08;
        this.A09 = dsX.A03;
        this.A08 = dsX.A02;
        this.A04 = dsX.A07;
        this.A07 = dsX.A01;
        this.A01 = dsX.A04;
        this.A02 = dsX.A05;
        this.A03 = dsX.A06;
        this.A00 = dsX.A00;
        this.A06 = dsX.A0A;
        this.A05 = dsX.A09;
    }
}
