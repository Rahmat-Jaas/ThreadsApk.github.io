package com.instagram.camera.effect.models;

import X.C18180wK;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorCreatorShape10S0000000_I2_10;
import com.instagram.common.typedurl.ImageUrl;

public class ProfilePicture implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorCreatorShape10S0000000_I2_10(63);
    public final ImageUrl A00;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A00, i);
    }

    public ProfilePicture(Parcel parcel) {
        Parcelable A0A = C18180wK.A0A(parcel, ImageUrl.class);
        A0A.getClass();
        this.A00 = (ImageUrl) A0A;
    }

    public ProfilePicture(ImageUrl imageUrl) {
        this.A00 = imageUrl;
    }
}
