package com.instagram.music.common.model;

import X.C04220Ms;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S3100000_I2;
import com.facebook.redex.PCreatorCreatorShape15S0000000_I2_15;

public final class MusicSearchArtist implements Parcelable {
    public static final PCreatorCreatorShape15S0000000_I2_15 CREATOR = new PCreatorCreatorShape15S0000000_I2_15(74);
    public String A00 = null;
    public final KtCSuperShape0S3100000_I2 A01;

    public MusicSearchArtist(KtCSuperShape0S3100000_I2 ktCSuperShape0S3100000_I2) {
        C04220Ms.A0B(ktCSuperShape0S3100000_I2, 1);
        this.A01 = ktCSuperShape0S3100000_I2;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C04220Ms.A0B(parcel, 0);
        KtCSuperShape0S3100000_I2 ktCSuperShape0S3100000_I2 = this.A01;
        parcel.writeString(ktCSuperShape0S3100000_I2.A01);
        parcel.writeString(ktCSuperShape0S3100000_I2.A02);
        parcel.writeParcelable((Parcelable) ktCSuperShape0S3100000_I2.A00, i);
        parcel.writeString(ktCSuperShape0S3100000_I2.A03);
        parcel.writeString(this.A00);
    }
}
