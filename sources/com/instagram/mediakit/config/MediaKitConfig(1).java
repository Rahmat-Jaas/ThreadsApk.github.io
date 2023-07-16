package com.instagram.mediakit.config;

import X.C04220Ms;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorCreatorShape13S0000000_I2_13;
import com.instagram.mediakit.analytics.MediaKitEntryPoint;

public final class MediaKitConfig implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorCreatorShape13S0000000_I2_13(31);
    public final MediaKitEntryPoint A00;
    public final String A01;
    public final String A02;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C04220Ms.A0B(parcel, 0);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        parcel.writeParcelable(this.A00, i);
    }

    public MediaKitConfig(MediaKitEntryPoint mediaKitEntryPoint, String str, String str2) {
        this.A01 = str;
        this.A02 = str2;
        this.A00 = mediaKitEntryPoint;
    }
}
