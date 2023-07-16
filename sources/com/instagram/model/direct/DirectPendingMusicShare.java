package com.instagram.model.direct;

import X.C04220Ms;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorCreatorShape13S0000000_I2_13;
import com.instagram.model.mediasize.ExtendedImageUrl;

public final class DirectPendingMusicShare implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorCreatorShape13S0000000_I2_13(54);
    public ExtendedImageUrl A00;
    public String A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C04220Ms.A0B(parcel, 0);
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A05);
        parcel.writeString(this.A04);
        parcel.writeString(this.A02);
        parcel.writeString(this.A01);
        parcel.writeString(this.A03);
    }

    public DirectPendingMusicShare(ExtendedImageUrl extendedImageUrl, String str, String str2, String str3, String str4, String str5) {
        this.A00 = extendedImageUrl;
        this.A05 = str;
        this.A04 = str2;
        this.A02 = str3;
        this.A01 = str4;
        this.A03 = str5;
    }

    public DirectPendingMusicShare() {
        this((ExtendedImageUrl) null, (String) null, (String) null, (String) null, (String) null, (String) null);
    }
}
