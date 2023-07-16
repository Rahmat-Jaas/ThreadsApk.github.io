package com.instagram.direct.fragment.interop.video;

import X.C18180wK;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorCreatorShape0S0100000_I2;

public class DirectInteropVideoSlide implements Parcelable {
    public Uri A00;
    public String A01;
    public String A02;
    public final Parcelable.Creator A03 = new PCreatorCreatorShape0S0100000_I2(this);

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A02);
        parcel.writeString(this.A01);
    }

    public DirectInteropVideoSlide(Parcel parcel) {
        this.A00 = (Uri) C18180wK.A0A(parcel, Uri.class);
        this.A02 = parcel.readString();
        this.A01 = parcel.readString();
    }

    public DirectInteropVideoSlide(Uri uri, String str, String str2) {
        this.A00 = uri;
        this.A02 = str;
        this.A01 = str2;
    }
}
