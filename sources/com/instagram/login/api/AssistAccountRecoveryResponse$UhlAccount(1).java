package com.instagram.login.api;

import X.C18180wK;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorCreatorShape13S0000000_I2_13;
import com.instagram.common.typedurl.ImageUrl;

public class AssistAccountRecoveryResponse$UhlAccount implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorCreatorShape13S0000000_I2_13(24);
    public ImageUrl A00;
    public String A01;
    public String A02;
    public String A03;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A01);
    }

    public AssistAccountRecoveryResponse$UhlAccount(Parcel parcel) {
        this.A02 = parcel.readString();
        this.A03 = parcel.readString();
        this.A00 = (ImageUrl) C18180wK.A0A(parcel, ImageUrl.class);
        this.A01 = parcel.readString();
    }

    public AssistAccountRecoveryResponse$UhlAccount() {
    }
}
